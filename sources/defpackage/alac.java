package defpackage;

/* renamed from: alac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alac implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ alal b;

    public alac(alal alal, String str) {
        this.b = alal;
        this.a = str;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
