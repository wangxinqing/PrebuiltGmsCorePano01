package defpackage;

/* renamed from: acvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acvn implements Runnable {
    final /* synthetic */ acwa a;
    final /* synthetic */ acvo b;

    public acvn(acvo acvo, acwa acwa) {
        this.b = acvo;
        this.a = acwa;
    }

    public final void run() {
        synchronized (this.b.a) {
            acvp acvp = this.b.b;
            if (acvp != null) {
                acvp.a(this.a);
            }
        }
    }
}
