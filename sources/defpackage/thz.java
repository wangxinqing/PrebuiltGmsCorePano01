package defpackage;

/* renamed from: thz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class thz implements Runnable {
    private final aosh a;
    private final Thread b;
    private final tia c;

    public thz(aosh aosh, Thread thread, tia tia) {
        this.a = aosh;
        this.b = thread;
        this.c = tia;
    }

    public final void run() {
        tib.a(this.a, this.b, this.c);
    }
}
