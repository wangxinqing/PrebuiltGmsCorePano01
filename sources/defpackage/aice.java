package defpackage;

import java.io.OutputStream;
import java.io.Writer;

/* renamed from: aice  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aice extends OutputStream {
    private final Writer a;

    public aice(Writer writer) {
        this.a = writer;
    }

    public final void close() {
        this.a.close();
    }

    public final void flush() {
        this.a.flush();
    }

    public final void write(int i) {
        if ((i & -128) == 0) {
            this.a.write(i);
            return;
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Not an ASCII character ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
