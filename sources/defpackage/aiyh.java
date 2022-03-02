package defpackage;

/* renamed from: aiyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiyh implements Runnable {
    private final aiyi a;
    private final Runnable b;

    public aiyh(aiyi aiyi, Runnable runnable) {
        this.a = aiyi;
        this.b = runnable;
    }

    public final void run() {
        aiyi aiyi = this.a;
        try {
            this.b.run();
        } catch (NullPointerException e) {
            aiyi.a.run();
        }
    }
}
