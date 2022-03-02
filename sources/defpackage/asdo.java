package defpackage;

/* renamed from: asdo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asdo extends asjt {
    final /* synthetic */ asdu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asdo(asdu asdu, String str, asjt... asjtArr) {
        super(str, asjtArr);
        this.a = asdu;
    }

    public final boolean b() {
        return !this.a.b.g();
    }

    public final boolean c() {
        ascs ascs = this.a.b;
        jjg jjg = asil.a;
        return ascs.c.cancelDiscovery() && this.a.i.c();
    }

    public final long d() {
        auyy auyy = this.a.a.b.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.j;
    }
}
