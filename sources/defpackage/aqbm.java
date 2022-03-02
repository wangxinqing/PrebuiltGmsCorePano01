package defpackage;

/* renamed from: aqbm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqbm implements Runnable {
    private final aqbq a;
    private final int b;

    public aqbm(aqbq aqbq, int i) {
        this.a = aqbq;
        this.b = i;
    }

    public final void run() {
        aqbq aqbq = this.a;
        int i = this.b;
        if (aqbq.g) {
            return;
        }
        if (aqbq.d.e != 4) {
            aqbq.c += i;
        } else {
            aqbq.h.a(i);
        }
    }
}
