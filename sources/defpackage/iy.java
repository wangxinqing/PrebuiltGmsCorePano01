package defpackage;

import java.io.Writer;

/* renamed from: iy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iy extends Writer {
    private final StringBuilder a = new StringBuilder(128);

    private final void a() {
        if (this.a.length() > 0) {
            this.a.toString();
            StringBuilder sb = this.a;
            sb.delete(0, sb.length());
        }
    }

    public final void close() {
        a();
    }

    public final void flush() {
        a();
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                a();
            } else {
                this.a.append(c);
            }
        }
    }
}
