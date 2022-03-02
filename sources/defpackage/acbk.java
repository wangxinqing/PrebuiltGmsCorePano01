package defpackage;

/* renamed from: acbk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acbk implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ tjc b;
    final /* synthetic */ acbm c;

    public acbk(acbm acbm, String str, tjc tjc) {
        this.c = acbm;
        this.a = str;
        this.b = tjc;
    }

    public final void run() {
        this.c.b.a(this.a, this.b);
    }
}
