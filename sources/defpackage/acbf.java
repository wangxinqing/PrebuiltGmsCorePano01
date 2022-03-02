package defpackage;

/* renamed from: acbf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acbf implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ tij b;
    final /* synthetic */ acbg c;

    public acbf(acbg acbg, String str, tij tij) {
        this.c = acbg;
        this.a = str;
        this.b = tij;
    }

    public final void run() {
        this.c.a.a(this.a, this.b);
    }
}
