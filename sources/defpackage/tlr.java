package defpackage;

/* renamed from: tlr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tlr implements Runnable {
    private final tlt a;
    private final tlh b;
    private final String c;

    public tlr(tlt tlt, tlh tlh, String str) {
        this.a = tlt;
        this.b = tlh;
        this.c = str;
    }

    public final void run() {
        tlt tlt = this.a;
        tlt.a((Runnable) new tls(tlt, this.b, this.c));
    }
}
