package defpackage;

/* renamed from: baks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baks implements Runnable {
    final /* synthetic */ bakt a;

    public baks(bakt bakt) {
        this.a = bakt;
    }

    public final void run() {
        bakt bakt = this.a;
        bakt.b.execute(new bakr(bakt));
    }
}
