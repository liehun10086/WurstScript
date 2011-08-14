package de.peeeq.pscript.pscript.util;
import de.peeeq.pscript.pscript.*;
public abstract class OpAdditiveSwitchVoid {
	abstract public void caseOpPlus(OpPlus opPlus);
	abstract public void caseOpMinus(OpMinus opMinus);
	public void doSwitch(OpAdditive opAdditive) {
if ( opAdditive == null) throw new IllegalArgumentException("Switch element must not be null.");
		if (opAdditive instanceof OpPlus) { caseOpPlus((OpPlus)opAdditive); return; }
		if (opAdditive instanceof OpMinus) { caseOpMinus((OpMinus)opAdditive); return; }
		throw new Error("Switch did not match any case: " + opAdditive);
	}
}

