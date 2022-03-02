package defpackage;

/* renamed from: acql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acql implements Runnable {
    final /* synthetic */ acqn a;

    public acql(acqn acqn) {
        this.a = acqn;
    }

    public final void run() {
        synchronized (this.a) {
            if (this.a.c()) {
                this.a.c.startScan();
                acqn acqn = this.a;
                acqn.a.postDelayed(acqn.b, 5000);
            }
        }
    }
}
