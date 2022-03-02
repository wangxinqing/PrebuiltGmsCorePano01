package defpackage;

/* renamed from: nki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nki implements Runnable {
    private final nkk a;
    private final long b;

    public nki(nkk nkk, long j) {
        this.a = nkk;
        this.b = j;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
