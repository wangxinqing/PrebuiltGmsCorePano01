package defpackage;

/* renamed from: acbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acbh implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ tiv b;
    final /* synthetic */ acbj c;

    public acbh(acbj acbj, String str, tiv tiv) {
        this.c = acbj;
        this.a = str;
        this.b = tiv;
    }

    public final void run() {
        this.c.a.a(this.a, this.b);
    }
}
