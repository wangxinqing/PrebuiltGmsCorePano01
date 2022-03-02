package defpackage;

/* renamed from: nqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nqs implements amsv {
    private final nqv a;

    public nqs(nqv nqv) {
        this.a = nqv;
    }

    public final Object a() {
        ahgz b = this.a.a.b("/client_streamz/gcm/connection_attempt_v2", ahgx.a("network_type"), ahgx.a("error"), ahgx.c("success"));
        b.b();
        return b;
    }
}
