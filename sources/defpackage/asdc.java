package defpackage;

/* renamed from: asdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asdc extends asjt {
    final /* synthetic */ asdu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asdc(asdu asdu, String str, asjt... asjtArr) {
        super(str, asjtArr);
        this.a = asdu;
    }

    public final asjt a() {
        if (!this.a.h.b() || this.a.g.b()) {
            return null;
        }
        return this.a.g;
    }

    public final boolean b() {
        ascp ascp = this.a.b.d;
        return ascp == null || !ascp.c;
    }

    public final boolean c() {
        ascp ascp = this.a.b.d;
        if (ascp == null) {
            return false;
        }
        ascp.b();
        return true;
    }

    public final long d() {
        auyy auyy = this.a.a.b.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.j;
    }
}
