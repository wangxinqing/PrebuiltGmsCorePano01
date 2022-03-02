package defpackage;

/* renamed from: amuf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
enum amuf {
    STRONG,
    WEAK;
    
    static final amuf[] i = null;

    static {
        amue amue;
        amuf amuf;
        amuf amuf2;
        amuf amuf3;
        amuf amuf4;
        amuf amuf5;
        amuf amuf6;
        amuf amuf7;
        i = new amuf[]{amuf, amuf2, amuf3, amuf4, amuf5, amuf6, amuf7, amue};
    }

    static amuf a(amut amut, boolean z, boolean z2) {
        char c2;
        char c3 = 0;
        if (amut == amut.WEAK) {
            c2 = 4;
        } else {
            c2 = 0;
        }
        boolean z3 = c2 | z;
        if (z2) {
            c3 = 2;
        }
        return i[z3 | c3];
    }

    static final void b(amvp amvp, amvp amvp2) {
        amvp2.b(amvp.h());
        amvo.b(amvp.j(), amvp2);
        amvo.b(amvp2, amvp.i());
        amvo.b(amvp);
    }

    static final void a(amvp amvp, amvp amvp2) {
        amvp2.a(amvp.e());
        amvo.a(amvp.g(), amvp2);
        amvo.a(amvp2, amvp.f());
        amvo.a(amvp);
    }

    public amvp a(amur amur, amvp amvp, amvp amvp2) {
        return a(amur, amvp.d(), amvp.c(), amvp2);
    }

    /* access modifiers changed from: package-private */
    public final amvp a(amur amur, Object obj, int i2, amvp amvp) {
        switch (ordinal()) {
            case 0:
                return new amuw(obj, i2, amvp);
            case 1:
                return new amuu(obj, i2, amvp);
            case 2:
                return new amuy(obj, i2, amvp);
            case 3:
                return new amuv(obj, i2, amvp);
            case 4:
                return new amve(amur.h, obj, i2, amvp);
            case 5:
                return new amvc(amur.h, obj, i2, amvp);
            case 6:
                return new amvg(amur.h, obj, i2, amvp);
            case 7:
                return new amvd(amur.h, obj, i2, amvp);
            default:
                throw null;
        }
    }
}
