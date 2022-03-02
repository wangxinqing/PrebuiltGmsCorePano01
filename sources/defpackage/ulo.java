package defpackage;

/* renamed from: ulo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ulo implements Runnable {
    private final uls a;
    private final String b;

    public ulo(uls uls, String str) {
        this.a = uls;
        this.b = str;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
