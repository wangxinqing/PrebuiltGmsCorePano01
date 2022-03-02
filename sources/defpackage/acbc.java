package defpackage;

/* renamed from: acbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acbc implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ til b;
    final /* synthetic */ acbg c;

    public acbc(acbg acbg, String str, til til) {
        this.c = acbg;
        this.a = str;
        this.b = til;
    }

    public final void run() {
        this.c.a.a(this.a, this.b);
    }
}
