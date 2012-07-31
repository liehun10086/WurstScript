package de.peeeq.wurstscript.intermediateLang.interpreter;

import com.google.common.base.Supplier;

import de.peeeq.wurstscript.ast.Op;
import de.peeeq.wurstscript.ast.OpAnd;
import de.peeeq.wurstscript.ast.OpBinary;
import de.peeeq.wurstscript.ast.OpDivInt;
import de.peeeq.wurstscript.ast.OpDivReal;
import de.peeeq.wurstscript.ast.OpEquals;
import de.peeeq.wurstscript.ast.OpGreater;
import de.peeeq.wurstscript.ast.OpGreaterEq;
import de.peeeq.wurstscript.ast.OpLess;
import de.peeeq.wurstscript.ast.OpLessEq;
import de.peeeq.wurstscript.ast.OpMinus;
import de.peeeq.wurstscript.ast.OpModInt;
import de.peeeq.wurstscript.ast.OpModReal;
import de.peeeq.wurstscript.ast.OpMult;
import de.peeeq.wurstscript.ast.OpNot;
import de.peeeq.wurstscript.ast.OpOr;
import de.peeeq.wurstscript.ast.OpPlus;
import de.peeeq.wurstscript.ast.OpUnary;
import de.peeeq.wurstscript.ast.OpUnequals;
import de.peeeq.wurstscript.intermediateLang.ILconst;
import de.peeeq.wurstscript.intermediateLang.ILconstBool;
import de.peeeq.wurstscript.intermediateLang.ILconstInt;
import de.peeeq.wurstscript.intermediateLang.ILconstNull;
import de.peeeq.wurstscript.intermediateLang.ILconstReal;
import de.peeeq.wurstscript.intermediateLang.ILconstString;
import de.peeeq.wurstscript.intermediateLang.ILconstTuple;
import de.peeeq.wurstscript.jassIm.ImBoolVal;
import de.peeeq.wurstscript.jassIm.ImExprs;
import de.peeeq.wurstscript.jassIm.ImFuncRef;
import de.peeeq.wurstscript.jassIm.ImFunction;
import de.peeeq.wurstscript.jassIm.ImFunctionCall;
import de.peeeq.wurstscript.jassIm.ImIntVal;
import de.peeeq.wurstscript.jassIm.ImNull;
import de.peeeq.wurstscript.jassIm.ImOperatorCall;
import de.peeeq.wurstscript.jassIm.ImRealVal;
import de.peeeq.wurstscript.jassIm.ImStatementExpr;
import de.peeeq.wurstscript.jassIm.ImStringVal;
import de.peeeq.wurstscript.jassIm.ImTupleExpr;
import de.peeeq.wurstscript.jassIm.ImTupleSelection;
import de.peeeq.wurstscript.jassIm.ImVarAccess;
import de.peeeq.wurstscript.jassIm.ImVarArrayAccess;

public class EvaluateExpr {

	public static ILconst eval(ImBoolVal e, ProgramState globalState, LocalState localState) {
		return ILconstBool.instance(e.getValB());
	}

	public static ILconst eval(ImFuncRef e, ProgramState globalState, LocalState localState) {
		throw new Error("not implemented: func refs");
	}

	public static ILconst eval(ImFunctionCall e, ProgramState globalState, LocalState localState) {
		ImFunction f = e.getFunc();
		ImExprs arguments = e.getArguments();
		ILconst[] args = new ILconst[arguments.size()];
		for (int i=0; i < arguments.size(); i++) {
			args[i] = arguments.get(i).evaluate(globalState, localState);
		}
		return ILInterpreter.runFunc(globalState, f, args);
	}

	public static ILconst eval(ImIntVal e, ProgramState globalState, LocalState localState) {
		return new ILconstInt(e.getValI());
	}

	public static ILconst eval(ImNull e, ProgramState globalState, LocalState localState) {
		return ILconstNull.instance();
	}

	public static ILconst eval(ImOperatorCall e, final ProgramState globalState, final LocalState localState) {
		final ImExprs arguments = e.getArguments();
		Op op = e.getOp();
		if (op instanceof OpBinary) {
			OpBinary opb = (OpBinary) op;
			return opb.evaluateBinaryOperator(arguments.get(0).evaluate(globalState, localState), new Supplier<ILconst>() {
				
				@Override
				public ILconst get() {
					return arguments.get(1).evaluate(globalState, localState);
				}
			});
		} else if (op instanceof OpUnary) {
			OpUnary opu = (OpUnary) op;
			return opu.evaluateUnaryOperator(arguments.get(0).evaluate(globalState, localState));
		} else {
			throw new Error();
		}
	}

	public static ILconst eval(ImRealVal e, ProgramState globalState, LocalState localState) {
		return new ILconstReal(e.getValR());
	}

	public static ILconst eval(ImStatementExpr e, ProgramState globalState, LocalState localState) {
		e.getStatements().runStatements(globalState, localState);
		return e.getExpr().evaluate(globalState, localState);
	}

	public static ILconst eval(ImStringVal e, ProgramState globalState, LocalState localState) {
		return new ILconstString(e.getValS());
	}

	public static ILconst eval(ImTupleExpr e, ProgramState globalState, LocalState localState) {
		ILconst[] values = new ILconst[e.getExprs().size()];
		for (int i=0; i< e.getExprs().size(); i++) {
			values[i] = e.getExprs().get(i).evaluate(globalState, localState); 
		}
		return new ILconstTuple(values);
	}

	public static ILconst eval(ImTupleSelection e, ProgramState globalState, LocalState localState) {
		ILconstTuple t = (ILconstTuple) e.getTupleExpr().evaluate(globalState, localState);
		return t.getValue(e.getTupleIndex());

	}

	public static de.peeeq.wurstscript.intermediateLang.ILconst eval(ImVarAccess e, ProgramState globalState, LocalState localState) {
		if (e.getVar().isGlobal()) {
			return globalState.getVal(e.getVar());
		} else {
			return localState.getVal(e.getVar());
		}
	}

	public static ILconst eval(ImVarArrayAccess e, ProgramState globalState, LocalState localState) {
		ILconstInt index = (ILconstInt) e.getIndex().evaluate(globalState, localState);
		if (e.getVar().isGlobal()) {
			return globalState.getArrayVal(e.getVar(), index.getVal());
		} else {
			return localState.getArrayVal(e.getVar(), index.getVal());
		}
	}

}
