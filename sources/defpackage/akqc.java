package defpackage;

/* renamed from: akqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqc implements Runnable {
    final /* synthetic */ akqj a;

    public akqc(akqj akqj) {
        this.a = akqj;
    }

    public final void run() {
        akqj akqj = this.a;
        int i = akqj.a - 1;
        akqj.a = i;
        if (i == 0) {
            akqj.c = null;
            akqj.d = null;
        }
        akqj.a = Math.max(0, i);
    }
}
