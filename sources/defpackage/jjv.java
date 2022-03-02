package defpackage;

import android.util.Printer;
import java.io.PrintWriter;
import java.io.Writer;

/* renamed from: jjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jjv extends PrintWriter implements Printer {
    private final String a;
    private final StringBuilder b = new StringBuilder();
    private char[] c;
    private int d;
    private boolean e = true;

    private final void c() {
        if (this.e) {
            this.e = false;
            if (this.b.length() != 0) {
                if (this.c == null) {
                    this.c = this.b.toString().toCharArray();
                }
                char[] cArr = this.c;
                super.write(cArr, 0, cArr.length);
            }
        }
    }

    public final void a() {
        this.b.append(this.a);
        this.c = null;
    }

    public final void b() {
        this.b.delete(0, this.a.length());
        this.c = null;
    }

    public final void println() {
        super.println();
        this.e = true;
    }

    public final void write(String str, int i, int i2) {
        write(str.toCharArray(), i, i2);
    }

    public jjv(Writer writer, String str) {
        super(writer);
        this.a = str;
    }

    public final void write(char[] cArr, int i, int i2) {
        this.b.length();
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            int i5 = i + 1;
            char c2 = cArr[i];
            this.d++;
            if (c2 == 10) {
                c();
                super.write(cArr, i4, i5 - i4);
                this.e = true;
                this.d = 0;
                i4 = i5;
            }
            i = i5;
        }
        if (i4 != i) {
            c();
            super.write(cArr, i4, i - i4);
        }
    }
}
