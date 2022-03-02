package defpackage;

/* renamed from: aihf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aihf implements arnj {
    private final arke a;

    public aihf(arke arke) {
        this.a = arke;
    }

    public final void a(int i) {
        arke arke = this.a;
        int i2 = aihg.d;
        if (i != 0) {
            Object[] objArr = new Object[2];
            objArr[0] = aihg.a(arke);
            objArr[1] = i != -2147483647 ? i != -1 ? i != 1 ? "unknown" : "cancelled" : "failed" : "timeout";
        }
    }
}
