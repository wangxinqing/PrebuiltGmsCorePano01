package defpackage;

/* renamed from: agws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agws implements Runnable {
    private final Exception a;

    public agws(Exception exc) {
        this.a = exc;
    }

    public final void run() {
        throw new RuntimeException(this.a);
    }
}
