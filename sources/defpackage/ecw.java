package defpackage;

/* renamed from: ecw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ecw implements Runnable {
    private final eda a;
    private final edv b;

    public ecw(eda eda, edv edv) {
        this.a = eda;
        this.b = edv;
    }

    public final void run() {
        eda eda = this.a;
        edv edv = this.b;
        if (edv instanceof ecx) {
            eda.a((efl) ((ecx) edv).d, "", (efb) null);
        } else if (edv instanceof ecy) {
            eda.a((efo) ((ecy) edv).d, "", (efb) null);
        }
    }
}
