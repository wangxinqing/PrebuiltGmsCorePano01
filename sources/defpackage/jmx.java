package defpackage;

/* renamed from: jmx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jmx implements jlz {
    public int a;
    final /* synthetic */ jmz b;
    public final jmw c;

    public jmx(jmz jmz, jmw jmw, int i) {
        this.b = jmz;
        this.c = jmw;
        this.a = i;
        jmw.e = this;
    }

    public final int a() {
        int size = this.c.g().size();
        if (size != 0) {
            return size + 1;
        }
        return 0;
    }

    public final void b(int i) {
        this.b.c();
        this.b.a((jly) this.c.g().get(i));
        if (this.c.g().size() == 1) {
            this.b.c(this.a, 2);
            return;
        }
        this.b.L(this.a + 1 + i);
        this.b.K(this.a + i);
    }

    public final void c(int i) {
        this.b.c();
        if (a() == 0) {
            this.b.d(this.a, 2);
            return;
        }
        this.b.M(this.a + i + 1);
        this.b.K(this.a + i);
    }

    public final void d(int i) {
        this.b.h(this.a + i, 2);
    }

    public final void a(int i, int i2) {
        jmz jmz = this.b;
        int i3 = this.a;
        jmz.b(i3 + i + 1, i3 + i2 + 1);
        if (i < i2) {
            this.b.K(this.a + i);
            this.b.K(this.a + i2);
            return;
        }
        this.b.K(this.a + i + 1);
        this.b.K(this.a + i2);
    }
}
