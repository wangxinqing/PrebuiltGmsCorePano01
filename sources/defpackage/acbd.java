package defpackage;

/* renamed from: acbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acbd implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ tip b;
    final /* synthetic */ acbg c;

    public acbd(acbg acbg, String str, tip tip) {
        this.c = acbg;
        this.a = str;
        this.b = tip;
    }

    public final void run() {
        this.c.a.a(this.a, this.b);
    }
}
