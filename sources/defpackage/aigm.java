package defpackage;

/* renamed from: aigm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aigm implements Runnable {
    private final aigu a;
    private final boolean b;
    private final String c;

    public aigm(aigu aigu, boolean z, String str) {
        this.a = aigu;
        this.b = z;
        this.c = str;
    }

    public final void run() {
        aigu aigu = this.a;
        aigu.d.a(this.b, this.c);
    }
}
