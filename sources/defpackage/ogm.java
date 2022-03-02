package defpackage;

/* renamed from: ogm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ogm implements Runnable {
    final /* synthetic */ ogo a;

    public ogm(ogo ogo) {
        this.a = ogo;
    }

    public final void run() {
        ogo ogo = this.a;
        ogo.f = false;
        if (ogo.getView() != null) {
            ogo ogo2 = this.a;
            if (!ogo2.g) {
                ogo2.d = System.currentTimeMillis();
                this.a.c.setVisibility(8);
                this.a.b.setVisibility(0);
                this.a.a.setVisibility(0);
            }
        }
    }
}
