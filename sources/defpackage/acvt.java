package defpackage;

/* renamed from: acvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acvt implements Runnable {
    final /* synthetic */ acwa a;
    final /* synthetic */ acvu b;

    public acvt(acvu acvu, acwa acwa) {
        this.b = acvu;
        this.a = acwa;
    }

    public final void run() {
        synchronized (this.b.a) {
            acvv acvv = this.b.b;
            if (acvv != null) {
                acvv.a(this.a.d());
            }
        }
    }
}
