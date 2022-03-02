package defpackage;

/* renamed from: aeon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aeon implements Runnable {
    private final aeoq a;

    public aeon(aeoq aeoq) {
        this.a = aeoq;
    }

    public final void run() {
        aeoq aeoq = this.a;
        aeoq.d();
        aeoq.d = 0.0f;
        aeoq.c = (aeoq.c + 216.0f) % 360.0f;
        int b = aeoq.b();
        aeoq.e = b;
        int[] iArr = aeoq.g;
        int i = iArr[b];
        aeoq.f = i;
        aeoq.b.setIntValues(new int[]{i, iArr[aeoq.b()]});
    }
}
