package defpackage;

/* renamed from: psp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class psp implements Runnable {
    private final psq a;

    public psp(psq psq) {
        this.a = psq;
    }

    public final void run() {
        this.a.c();
    }
}
