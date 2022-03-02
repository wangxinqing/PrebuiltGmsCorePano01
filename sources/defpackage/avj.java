package defpackage;

/* renamed from: avj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class avj implements Runnable {
    final /* synthetic */ avl a;

    public avj(avl avl) {
        this.a = avl;
    }

    public final void run() {
        if (this.a.b != null) {
            avi avi = this.a.b;
            Object obj = avi.a;
            if (obj == null) {
                this.a.a(avi.b);
            } else {
                this.a.a(obj);
            }
        }
    }
}
