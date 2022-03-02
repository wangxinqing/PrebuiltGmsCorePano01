package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: owc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class owc implements Closeable {
    public final String a;
    public final File b;
    final InputStream c;
    public final aubc d;

    public owc(String str, File file) {
        this.a = str;
        this.b = file;
        FileInputStream fileInputStream = new FileInputStream(file);
        this.c = fileInputStream;
        this.d = aubc.a((InputStream) fileInputStream);
    }

    public final void close() {
        this.c.close();
    }
}
