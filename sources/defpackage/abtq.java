package defpackage;

/* renamed from: abtq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abtq implements acvp {
    private final abty a;
    private final String b;

    public abtq(abty abty, String str) {
        this.a = abty;
        this.b = str;
    }

    public final void a(acwa acwa) {
        abty abty = this.a;
        ige a2 = abty.a.a((iby) abty, this.b);
        igc igc = a2.b;
        iva.a((Object) igc, (Object) "Key should not be null");
        abty.a.a(abty, new abtu(a2), new abtv(igc));
    }
}
