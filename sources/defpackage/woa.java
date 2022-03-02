package defpackage;

import java.io.Writer;

/* renamed from: woa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class woa extends Writer {
    final StringBuilder a = new StringBuilder();

    public final void close() {
    }

    public final void flush() {
    }

    public final void write(char[] cArr, int i, int i2) {
        this.a.append(new String(cArr, i, i2));
    }
}
