package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: annd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class annd extends anmo {
    private final File a;

    public annd(File file) {
        amrl.a((Object) file);
        this.a = file;
    }

    public final byte[] a() {
        anmx a2 = anmx.a();
        try {
            FileInputStream b = b();
            a2.a((Closeable) b);
            byte[] a3 = anmr.a((InputStream) b, b.getChannel().size());
            a2.close();
            return a3;
        } catch (Throwable th) {
            a2.close();
            throw th;
        }
    }

    public final FileInputStream b() {
        return new FileInputStream(this.a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Files.asByteSource(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
