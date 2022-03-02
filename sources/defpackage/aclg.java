package defpackage;

/* renamed from: aclg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aclg implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ acll b;

    public aclg(acll acll, String str) {
        this.b = acll;
        this.a = str;
    }

    public final void run() {
        this.b.b(this.a);
    }
}
