package defpackage;

/* renamed from: akqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqz implements Runnable {
    final /* synthetic */ akqk a;
    final /* synthetic */ aklg b;

    public akqz(akqk akqk, aklg aklg) {
        this.a = akqk;
        this.b = aklg;
    }

    public final void run() {
        akqk akqk = this.a;
        aklg aklg = this.b;
        akqk.a(aklg.a, aklg.b);
    }
}
