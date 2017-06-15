package de.peeeq.wurstio.languageserver2;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.util.Objects;

/**
 *
 */
public class WFile {
    private final File file;

    private WFile(File file) {
        try {
            file = file.getAbsoluteFile().getCanonicalFile();
        } catch (Exception e) {
            file = file.getAbsoluteFile();
        }
        this.file = file;
    }

    public static WFile create(File f) {
        return new WFile(f);
    }

    public static WFile create(Path f) {
        return new WFile(f.toFile());
    }

    public static WFile create(URI f) {
        return new WFile(new File(f));
    }

    public static WFile create(String uri) {
        return create(URI.create(uri));
    }

    public File getFile() {
        return file;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WFile wFile = (WFile) o;
        return Objects.equals(file, wFile.file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file);
    }

    @Override
    public String toString() {
        return file.toString();
    }
}
