package defpackage;

/* renamed from: aopg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aopg implements Runnable {
    final aopn a;
    final aorr b;

    public aopg(aopn aopn, aorr aorr) {
        this.a = aopn;
        this.b = aorr;
    }

    public final void run() {
        aopn aopn = this.a;
        boolean z = aopn.j;
        if (aopn.value == this) {
            if (aopn.k.a(this.a, (Object) this, aopn.a(this.b))) {
                aopn.a(this.a);
            }
        }
    }
}
