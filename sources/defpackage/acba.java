package defpackage;

/* renamed from: acba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acba implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ acbb b;

    public acba(acbb acbb, String str) {
        this.b = acbb;
        this.a = str;
    }

    public final void run() {
        this.b.e.b(this.a);
    }
}
