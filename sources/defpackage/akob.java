package defpackage;

/* renamed from: akob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akob extends akoq {
    private aklp d;
    private final akoc e;

    public akob(akma akma, akuo akuo, akoc akoc) {
        super(akma, akuo);
        this.e = akoc;
    }

    /* access modifiers changed from: protected */
    public final akor a(akln akln) {
        aklp a = this.e.a(akln);
        this.d = a;
        boolean z = true;
        if (!a.b && akln.a.g < 0.0f) {
            z = false;
        }
        aocj aocj = (z && a.a >= ((float) azcf.a.a().l())) ? aocj.IN_TRANSIT : aocj.AT_PLACE;
        return a(a(aocj), aocj, System.currentTimeMillis(), (aklr) null, (akli) null);
    }

    public final void a() {
        super.a();
        this.d = null;
    }

    /* access modifiers changed from: protected */
    public final void a(akma akma, akln akln, akor akor) {
        float f;
        akop akop = akor.b;
        aocj aocj = akop.a;
        long j = akop.b;
        aklp aklp = this.d;
        if (aklp != null) {
            f = aklp.a;
        } else {
            f = -1.0f;
        }
        aucd o = aocn.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aocn aocn = (aocn) o.b;
        aocn.b = 0;
        int i = aocn.a | 1;
        aocn.a = i;
        aocn.e = 2;
        aocn.a = i | 8;
        aucd o2 = aock.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aock aock = (aock) o2.b;
        int i2 = aock.a | 2;
        aock.a = i2;
        aock.c = j;
        if (aocj != null) {
            aock.b = aocj.d;
            aock.a = i2 | 1;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aocn aocn2 = (aocn) o.b;
        aock aock2 = (aock) o2.i();
        aock2.getClass();
        aocn2.c = aock2;
        aocn2.a |= 2;
        aucd o3 = aobw.c.o();
        double d2 = (double) f;
        Double.isNaN(d2);
        int i3 = (int) (d2 * 10000.0d);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aobw aobw = (aobw) o3.b;
        aobw.a |= 1;
        aobw.b = i3;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aocn aocn3 = (aocn) o.b;
        aobw aobw2 = (aobw) o3.i();
        aobw2.getClass();
        aocn3.g = aobw2;
        aocn3.a |= 32;
        o.i();
        akun akun = (akun) akma;
        akun.a(akun.a((aocn) o.i()));
    }
}
