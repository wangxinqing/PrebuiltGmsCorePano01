package defpackage;

/* renamed from: ajdf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajdf implements Runnable {
    private final ajdg a;

    public ajdf(ajdg ajdg) {
        this.a = ajdg;
    }

    public final void run() {
        ajdg ajdg = this.a;
        ajdg.g.a();
        ajdg.a.postDelayed(ajdg.b, ayek.v());
    }
}
