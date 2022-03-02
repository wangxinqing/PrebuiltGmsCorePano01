package defpackage;

/* renamed from: asdm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asdm extends asjt {
    final /* synthetic */ asdu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asdm(asdu asdu, String str, asjt... asjtArr) {
        super(str, asjtArr);
        this.a = asdu;
    }

    public final boolean b() {
        ascn ascn = this.a.d;
        return ascn == null || ascn.l == null;
    }

    public final boolean c() {
        ascn ascn = this.a.d;
        if (ascn == null) {
            return true;
        }
        ascn.l = null;
        ascn.d();
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
