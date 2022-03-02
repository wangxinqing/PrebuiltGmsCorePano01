package defpackage;

/* renamed from: acay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acay implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ acbb b;

    public acay(acbb acbb, String str) {
        this.b = acbb;
        this.a = str;
    }

    public final void run() {
        this.b.e.a(this.a);
    }
}
