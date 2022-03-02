package defpackage;

/* renamed from: aedf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aedf implements amsv {
    private final aedi a;

    public aedf(aedi aedi) {
        this.a = aedi;
    }

    public final Object a() {
        ahgz b = this.a.a.b("/client_streamz/android_auth/account_transfer/status", ahgx.a("role"), ahgx.a("success"), ahgx.b("num_authenticators"));
        b.b();
        return b;
    }
}
