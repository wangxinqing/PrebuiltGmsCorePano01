package defpackage;

import java.io.PrintWriter;

/* renamed from: tte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tte implements AutoCloseable {
    private final PrintWriter a;
    private final int b;
    private int c = 0;

    public tte(PrintWriter printWriter, int i) {
        this.a = printWriter;
        this.b = i;
    }

    public final void a(String str, Object... objArr) {
        int i = this.c + 1;
        this.c = i;
        if (i <= this.b) {
            this.a.println(String.format(str, objArr));
        }
    }

    public final void close() {
        if (this.c > this.b) {
            this.a.printf("\nData capped due to size limit: %d of %d lines printed.\n", new Object[]{200, Integer.valueOf(this.c)});
        }
    }
}
