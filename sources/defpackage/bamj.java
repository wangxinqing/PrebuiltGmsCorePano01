package defpackage;

/* renamed from: bamj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bamj implements bacx {
    final /* synthetic */ baml a;

    public bamj(baml baml) {
        this.a = baml;
    }

    public final void a(int i) {
        int i2 = bapg.a;
        bamk bamk = this.a.h;
        int i3 = bamk.v;
        synchronized (bamk.a) {
            this.a.h.b(i);
        }
    }

    public final void a(baaf baaf) {
        boolean z;
        int i = bapg.a;
        String valueOf = String.valueOf(this.a.b.b);
        String str = valueOf.length() == 0 ? new String("/") : "/".concat(valueOf);
        bamk bamk = this.a.h;
        int i2 = bamk.v;
        synchronized (bamk.a) {
            bamk bamk2 = this.a.h;
            baml baml = bamk2.u;
            String str2 = baml.e;
            String str3 = baml.c;
            boolean z2 = baml.i;
            if (bamk2.i.t == null) {
                z = true;
            } else {
                z = false;
            }
            bamk2.b = bame.a(baaf, str, str2, str3, false, z);
            bamt bamt = bamk2.i;
            baml baml2 = bamk2.u;
            babj babj = bamt.p;
            if (babj != null) {
                baml2.h.a(babj, baeg.REFUSED, true, new baaf());
            } else if (bamt.k.size() >= bamt.u) {
                bamt.v.add(baml2);
                bamt.c(baml2);
            } else {
                bamt.a(baml2);
            }
        }
    }

    public final void a(babj babj) {
        int i = bapg.a;
        bamk bamk = this.a.h;
        int i2 = bamk.v;
        synchronized (bamk.a) {
            this.a.h.c(babj, true, (baaf) null);
        }
    }

    public final void a(balv balv, boolean z, boolean z2, int i) {
        batd batd;
        boolean z3;
        int i2 = bapg.a;
        if (balv == null) {
            batd = baml.a;
        } else {
            batd = ((banb) balv).a;
            int i3 = (int) batd.b;
            if (i3 > 0) {
                this.a.d(i3);
            }
        }
        bamk bamk = this.a.h;
        int i4 = bamk.v;
        synchronized (bamk.a) {
            bamk bamk2 = this.a.h;
            if (!bamk2.f) {
                if (bamk2.t) {
                    bamk2.c.a(batd, (long) ((int) batd.b));
                    bamk2.d |= z;
                    bamk2.e |= z2;
                } else {
                    if (bamk2.u.g != -1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    amrl.b(z3, (Object) "streamId should be set");
                    bamk2.h.a(z, bamk2.u.g, batd, z2);
                }
            }
            balu balu = this.a.r;
            if (i != 0) {
                balu.g += (long) i;
                balu.b.a();
            }
        }
    }
}
