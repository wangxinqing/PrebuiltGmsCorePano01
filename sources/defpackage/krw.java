package defpackage;

/* renamed from: krw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class krw implements krp {
    private final krx a;
    private final kmp b;

    public krw(krx krx, kmp kmp) {
        this.a = krx;
        this.b = kmp;
    }

    public final boolean a(kta kta) {
        krx krx = this.a;
        kmp kmp = this.b;
        ksi ksi = (ksi) kta;
        if (!ksi.a(kmp)) {
            return true;
        }
        krx.a.b("Raised changes available event to listener");
        krx.a(47, kmp);
        return ksi.a();
    }
}
