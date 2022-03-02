package defpackage;

/* renamed from: woo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class woo {
    private final StringBuilder a;
    private boolean b = false;

    public woo(StringBuilder sb) {
        this.a = sb;
    }

    public final void a(int i, int i2, String str) {
        if ((i & i2) != 0) {
            if (this.b) {
                this.a.append(',');
            }
            this.a.append(str);
            this.b = true;
        }
    }
}
