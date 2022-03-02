package defpackage;

/* renamed from: asdl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asdl extends asjt {
    final /* synthetic */ asdu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asdl(asdu asdu, String str, asjt... asjtArr) {
        super(str, asjtArr);
        this.a = asdu;
    }

    public final boolean b() {
        ascn ascn = this.a.d;
        if (ascn == null) {
            return true;
        }
        Integer num = ascn.l;
        return num != null && num.intValue() == 3;
    }

    public final boolean c() {
        ascn ascn = this.a.d;
        if (ascn == null) {
            return true;
        }
        ascn.l = 3;
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
