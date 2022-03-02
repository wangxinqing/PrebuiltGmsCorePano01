package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: owd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class owd implements Closeable {
    final OutputStream a;
    final aubk b;
    int c;

    public owd(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.a = fileOutputStream;
        this.b = aubk.a((OutputStream) fileOutputStream);
    }

    public final void close() {
        this.a.close();
    }
}
