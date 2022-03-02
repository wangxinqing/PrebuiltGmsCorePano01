package defpackage;

/* renamed from: ajcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajcb {
    private int a = 0;
    private int b = 0;

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        this.a = 0;
        this.b = 0;
    }

    public final synchronized void a(boolean z) {
        this.a++;
        if (z) {
            this.b++;
        }
    }

    public final synchronized aqek b() {
        aqek aqek;
        if (this.a != 0) {
            aqek = new aqek(ajck.as);
            aqek.g(1, this.a);
            aqek.g(2, this.b);
        } else {
            aqek = null;
        }
        return aqek;
    }

    /* access modifiers changed from: package-private */
    public final synchronized artr c() {
        if (this.a <= 0) {
            return null;
        }
        aucd o = artr.d.o();
        int i = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        artr artr = (artr) o.b;
        int i2 = artr.a | 1;
        artr.a = i2;
        artr.b = i;
        int i3 = this.b;
        artr.a = i2 | 2;
        artr.c = i3;
        return (artr) o.i();
    }
}
