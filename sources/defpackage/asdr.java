package defpackage;

/* renamed from: asdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asdr extends asjt {
    final /* synthetic */ asds a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asdr(asds asds, String str, asjt... asjtArr) {
        super(str, asjtArr);
        this.a = asds;
    }

    public final boolean b() {
        return !this.a.c;
    }

    public final boolean c() {
        asds asds = this.a;
        boolean a2 = asds.d.b.a(asds.a);
        this.a.c = !a2;
        return a2;
    }

    public final long d() {
        auyy auyy = this.a.d.a.b.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.j;
    }
}
