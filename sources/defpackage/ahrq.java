package defpackage;

/* renamed from: ahrq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahrq implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ahrr b;

    public ahrq(ahrr ahrr, String str) {
        this.b = ahrr;
        this.a = str;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
