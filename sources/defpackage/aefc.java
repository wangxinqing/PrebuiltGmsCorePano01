package defpackage;

/* renamed from: aefc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aefc implements Runnable {
    private final aefe a;
    private final int b;

    public aefc(aefe aefe, int i) {
        this.a = aefe;
        this.b = i;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
