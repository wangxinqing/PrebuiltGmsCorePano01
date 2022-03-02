package defpackage;

/* renamed from: aqeq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aqeq extends aqeo {
    private long d = 0;
    private long e = -1;
    private long f = -1;

    public final synchronized void a(long j) {
        boolean z = true;
        aqer.a("delay", j >= 0);
        if (this.f != -1) {
            z = false;
        }
        aqer.a("scheduled", z);
        this.d = j;
    }

    public final synchronized void b(long j) {
        boolean z = true;
        if (j != -1 && j < 0) {
            z = false;
        }
        aqer.a("deadline", z);
        long j2 = this.f;
        if (j2 != -1) {
            StringBuilder sb = new StringBuilder(80);
            sb.append("values not equal, expected [-1] but got [");
            sb.append(j2);
            sb.append("]");
            aqer.a("scheduled", sb.toString());
        }
        this.e = j;
    }

    public final void c() {
        synchronized (this) {
            this.f = -1;
        }
        super.c();
        this.a.a(this);
    }

    public final synchronized void d() {
        if (this.a.b(this) || this.f != -1) {
            this.f = -1;
        }
    }

    public final synchronized void e() {
        if (this.f != -1) {
            aqep aqep = this.a;
            synchronized (aqep.c) {
                aqer.b(aqep.b.contains(this));
                long g = g();
                int size = aqep.b.size();
                int i = 0;
                while (i < size) {
                    int i2 = (i + size) / 2;
                    if (g >= ((aqeq) aqep.b.elementAt(i2)).g()) {
                        i = i2 + 1;
                    } else {
                        size = i2;
                    }
                }
                aqep.b.insertElementAt(this, i);
                this.c = 1;
                aqep.c.notifyAll();
            }
        }
    }

    public final void f() {
        synchronized (this) {
            if (this.f == -1) {
                long j = this.e;
                if (j != -1) {
                    this.f = j + this.d;
                } else {
                    this.f = System.currentTimeMillis() + this.d;
                }
            }
        }
        this.a.a(this);
    }

    public final synchronized long g() {
        return this.f;
    }

    public aqeq(aqep aqep, Runnable runnable) {
        super(aqep, runnable);
    }
}
