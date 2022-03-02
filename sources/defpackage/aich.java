package defpackage;

import java.io.FilterWriter;
import java.io.Writer;

/* renamed from: aich  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aich extends FilterWriter {
    private final int a = 1024;
    private int b = 0;

    public aich(Writer writer) {
        super(writer);
    }

    public final void write(int i) {
        if (this.b == this.a) {
            this.out.write(10);
            this.b = 0;
        }
        this.out.write(i);
        this.b++;
    }

    public final void write(String str, int i, int i2) {
        while (true) {
            int i3 = this.b;
            int i4 = this.a;
            if (i3 + i2 > i4) {
                int i5 = i4 - i3;
                this.out.write(str, i, i5);
                this.out.write(10);
                i += i5;
                i2 -= i5;
                this.b = 0;
            } else {
                this.out.write(str, i, i2);
                this.b += i2;
                return;
            }
        }
    }

    public final void write(char[] cArr, int i, int i2) {
        while (true) {
            int i3 = this.b;
            int i4 = this.a;
            if (i3 + i2 > i4) {
                int i5 = i4 - i3;
                this.out.write(cArr, i, i5);
                this.out.write(10);
                i += i5;
                i2 -= i5;
                this.b = 0;
            } else {
                this.out.write(cArr, i, i2);
                this.b += i2;
                return;
            }
        }
    }
}
