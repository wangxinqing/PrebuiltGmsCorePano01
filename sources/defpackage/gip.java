package defpackage;

/* renamed from: gip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gip implements Runnable {
    final /* synthetic */ Integer a;
    final /* synthetic */ giq b;

    public gip(giq giq, Integer num) {
        this.b = giq;
        this.a = num;
    }

    public final void run() {
        this.b.deliverResult(this.a);
    }
}
