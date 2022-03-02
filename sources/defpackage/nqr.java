package defpackage;

/* renamed from: nqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nqr implements amsv {
    private final nqv a;

    public nqr(nqv nqv) {
        this.a = nqv;
    }

    public final Object a() {
        ahgz b = this.a.a.b("/client_streamz/gcm/connection_attempt", ahgx.c("success"), ahgx.b("network_type"), ahgx.b("error"));
        b.b();
        return b;
    }
}
