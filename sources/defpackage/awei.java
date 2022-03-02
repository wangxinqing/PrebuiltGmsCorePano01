package defpackage;

/* renamed from: awei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awei implements Runnable {
    final /* synthetic */ aweo a;
    final /* synthetic */ awej b;

    public awei(awej awej, aweo aweo) {
        this.b = awej;
        this.a = aweo;
    }

    public final void run() {
        if (this.b.a.isCancelled()) {
            aorr aorr = this.b.a;
            boolean z = false;
            if ((aorr instanceof aweh) && ((aweh) aorr).f()) {
                z = true;
            }
            this.a.a(z);
        }
    }
}
