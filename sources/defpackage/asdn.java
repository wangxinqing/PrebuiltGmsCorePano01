package defpackage;

/* renamed from: asdn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asdn extends asjt {
    final /* synthetic */ asdu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asdn(asdu asdu, String str, asjt... asjtArr) {
        super(str, asjtArr);
        this.a = asdu;
    }

    public final boolean b() {
        return this.a.b.g();
    }

    public final boolean c() {
        ascs ascs = this.a.b;
        jjg jjg = asil.a;
        return ascs.c.startDiscovery();
    }

    public final long d() {
        auyo auyo = this.a.a.b.g;
        if (auyo == null) {
            auyo = auyo.j;
        }
        return auyo.a;
    }
}
