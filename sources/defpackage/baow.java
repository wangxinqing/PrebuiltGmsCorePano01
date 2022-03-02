package defpackage;

/* renamed from: baow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baow extends aopn {
    private final azxl a;

    public baow(azxl azxl) {
        this.a = azxl;
    }

    /* access modifiers changed from: protected */
    public final String aK() {
        amrg a2 = amrh.a((Object) this);
        a2.a("clientCall", (Object) this.a);
        return a2.toString();
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.a.a("GrpcFuture was cancelled", (Throwable) null);
    }
}
