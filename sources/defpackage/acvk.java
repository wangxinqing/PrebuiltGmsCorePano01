package defpackage;

/* renamed from: acvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acvk implements Runnable {
    final /* synthetic */ acvl a;

    public acvk(acvl acvl) {
        this.a = acvl;
    }

    public final void run() {
        synchronized (this.a.a) {
            acvm acvm = this.a.b;
            if (acvm != null) {
                acvm.b();
            }
        }
    }
}
