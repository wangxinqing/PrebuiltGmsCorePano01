package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: acwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acwr implements acwq {
    private final Object a = new Object();
    private final int b;
    private final acwi c;
    private int d;
    private int e;
    private int f;
    private Exception g;
    private boolean h;

    public acwr(int i, acwi acwi) {
        this.b = i;
        this.c = acwi;
    }

    private final void a() {
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        int i4 = this.b;
        if (i + i2 + i3 != i4) {
            return;
        }
        if (this.g != null) {
            acwi acwi = this.c;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i4);
            sb.append(" underlying tasks failed");
            acwi.a((Exception) new ExecutionException(sb.toString(), this.g));
        } else if (this.h) {
            this.c.g();
        } else {
            this.c.a((Object) null);
        }
    }

    public final void b() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            a();
        }
    }

    public final void a(Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            a();
        }
    }

    public final void a(Object obj) {
        synchronized (this.a) {
            this.d++;
            a();
        }
    }
}
