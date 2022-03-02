package defpackage;

/* renamed from: baew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baew implements Runnable {
    final /* synthetic */ bajn a;

    public baew(bajn bajn) {
        this.a = bajn;
    }

    public final void run() {
        bais bais = (bais) this.a;
        amrl.b(bais.a.y.get(), (Object) "Channel must have been shut down");
        bais.a.A = true;
        bais.a.a(false);
        bais.a.g();
        bais.a.n();
    }
}
