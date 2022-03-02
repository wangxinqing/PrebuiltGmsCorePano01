package defpackage;

/* renamed from: asdf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asdf extends asjt {
    final /* synthetic */ asdu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asdf(asdu asdu, String str, asjt... asjtArr) {
        super(str, asjtArr);
        this.a = asdu;
    }

    public final boolean b() {
        return !this.a.c.contains("deviceName") && !this.a.c.contains("discoverableTimeout") && !this.a.c.contains("scanMode");
    }

    public final boolean c() {
        asdu asdu = this.a;
        return asdu.a(asdu.c.edit().remove("deviceName").remove("discoverableTimeout").remove("scanMode"), "reverted to user settings");
    }

    public final long d() {
        auyy auyy = this.a.a.b.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.j;
    }
}
