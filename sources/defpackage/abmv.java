package defpackage;

/* renamed from: abmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abmv implements amsv {
    private final abna a;

    public abmv(abna abna) {
        this.a = abna;
    }

    public final Object a() {
        ahgz b = this.a.a.b("/client_streamz/android_auth/smartdevice/accounts/challenge_status", ahgx.b("status_code"));
        b.b();
        return b;
    }
}
