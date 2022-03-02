package defpackage;

/* renamed from: ksc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ksc implements krp {
    private final ksd a;
    private final kmp b;

    public ksc(ksd ksd, kmp kmp) {
        this.a = ksd;
        this.b = kmp;
    }

    public final boolean a(kta kta) {
        ksd ksd = this.a;
        kmp kmp = this.b;
        ksi ksi = (ksi) kta;
        if (!ksi.a(kmp)) {
            return true;
        }
        ksd.a.b("Raised changes available event to listener");
        ksd.a(47, kmp);
        return ksi.a();
    }
}
