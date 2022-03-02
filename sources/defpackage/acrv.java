package defpackage;

/* renamed from: acrv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acrv {
    int a;
    Runnable b;

    /* access modifiers changed from: package-private */
    public final void a() {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
            this.b = null;
        }
    }
}
