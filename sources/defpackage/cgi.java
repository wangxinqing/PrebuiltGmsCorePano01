package defpackage;

/* renamed from: cgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cgi implements Runnable {
    final /* synthetic */ cgj a;

    public cgi(cgj cgj) {
        this.a = cgj;
    }

    public final void run() {
        cgj cgj = this.a;
        cgj.a.removeGpsStatusListener(cgj);
    }
}
