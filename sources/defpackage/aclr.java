package defpackage;

/* renamed from: aclr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aclr implements Runnable {
    final /* synthetic */ acly a;

    public aclr(acly acly) {
        this.a = acly;
    }

    public final void run() {
        acly acly = this.a;
        if (!acly.j) {
            acly.a(true);
            this.a.c();
        } else {
            acly.a(false);
            this.a.d();
        }
        acly acly2 = this.a;
        acly2.c.postDelayed(acly2.k, 5000);
    }
}
