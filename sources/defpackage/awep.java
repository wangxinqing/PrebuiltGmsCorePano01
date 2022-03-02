package defpackage;

/* renamed from: awep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awep implements Runnable {
    final /* synthetic */ aorr a;
    final /* synthetic */ aweq b;

    public awep(aweq aweq, aorr aorr) {
        this.b = aweq;
        this.a = aorr;
    }

    public final void run() {
        synchronized (this.b.b) {
            this.b.b.remove(this.a);
        }
    }
}
