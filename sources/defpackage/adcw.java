package defpackage;

/* renamed from: adcw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class adcw implements amsv {
    private final addc a;

    public adcw(addc addc) {
        this.a = addc;
    }

    public final Object a() {
        ahgz b = this.a.a.b("/client_streamz/udc/sync_attempts", ahgx.c("succeeded"), ahgx.c("push"), ahgx.c("periodic"), ahgx.c("forced"), ahgx.c("empty_cache"), ahgx.c("other_trigger"), ahgx.c("has_changes"));
        b.b();
        return b;
    }
}
