package defpackage;

/* renamed from: akqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqx implements Runnable {
    final /* synthetic */ aklg a;
    final /* synthetic */ akpw b;

    public akqx(akpw akpw, aklg aklg) {
        this.b = akpw;
        this.a = aklg;
    }

    public final void run() {
        akpw akpw = this.b;
        aklg aklg = this.a;
        akpw.a(aklg.a, aklg.b);
    }
}
