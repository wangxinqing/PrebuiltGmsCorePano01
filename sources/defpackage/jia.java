package defpackage;

/* renamed from: jia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jia implements Runnable {
    final /* synthetic */ jie a;

    public jia(jie jie) {
        this.a = jie;
    }

    public final void run() {
        synchronized (this.a.a) {
            synchronized (this.a.b) {
                jie jie = this.a;
                jie.a(jie.e);
            }
            this.a.e.clear();
        }
    }
}
