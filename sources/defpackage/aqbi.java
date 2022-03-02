package defpackage;

/* renamed from: aqbi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqbi implements Runnable {
    private final aqbq a;
    private final aorr b;

    public aqbi(aqbq aqbq, aorr aorr) {
        this.a = aqbq;
        this.b = aorr;
    }

    public final void run() {
        aqbq aqbq = this.a;
        aqbq.a.remove(this.b);
    }
}
