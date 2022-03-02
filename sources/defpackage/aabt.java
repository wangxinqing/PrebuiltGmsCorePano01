package defpackage;

/* renamed from: aabt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aabt implements Runnable {
    private final aabx a;
    private final int b;

    public aabt(aabx aabx, int i) {
        this.a = aabx;
        this.b = i;
    }

    public final void run() {
        aabx aabx = this.a;
        aabx.e.a(aabx, this.b);
    }
}
