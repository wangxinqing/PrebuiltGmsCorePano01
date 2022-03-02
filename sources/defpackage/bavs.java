package defpackage;

/* renamed from: bavs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bavs implements Runnable {
    final /* synthetic */ bawn a;
    final /* synthetic */ int b;

    public bavs(bawn bawn, int i) {
        this.a = bawn;
        this.b = i;
    }

    public final void run() {
        this.a.onStatus(this.b);
    }
}
