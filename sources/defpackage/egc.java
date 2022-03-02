package defpackage;

/* renamed from: egc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class egc implements Runnable {
    private final egh a;

    public egc(egh egh) {
        this.a = egh;
    }

    public final void run() {
        egh egh = this.a;
        if (egh.c != 1) {
            egh.c = 1;
            egh.c();
        }
    }
}
