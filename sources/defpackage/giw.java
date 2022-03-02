package defpackage;

/* renamed from: giw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class giw implements Runnable {
    final /* synthetic */ Integer a;
    final /* synthetic */ gix b;

    public giw(gix gix, Integer num) {
        this.b = gix;
        this.a = num;
    }

    public final void run() {
        this.b.deliverResult(this.a);
    }
}
