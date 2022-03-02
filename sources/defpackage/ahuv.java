package defpackage;

/* renamed from: ahuv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahuv implements Runnable {
    final /* synthetic */ ahux a;

    public ahuv(ahux ahux) {
        this.a = ahux;
    }

    public final void run() {
        ahuw ahuw;
        synchronized (this.a.d) {
            ahux ahux = this.a;
            if (!ahux.e && (ahuw = ahux.f) != null) {
                amrl.a((Object) ahuw);
                ahux ahux2 = this.a;
                ahux2.f.a = true;
                ahux2.a(false, 0);
                this.a.f = null;
            }
        }
    }
}
