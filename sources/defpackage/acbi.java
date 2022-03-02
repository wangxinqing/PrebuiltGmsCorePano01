package defpackage;

/* renamed from: acbi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acbi implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ acbj b;

    public acbi(acbj acbj, String str) {
        this.b = acbj;
        this.a = str;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
