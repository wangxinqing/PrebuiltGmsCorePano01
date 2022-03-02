package defpackage;

/* renamed from: tnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tnw implements Runnable {
    private final tob a;
    private final tlh b;
    private final String c;

    public tnw(tob tob, tlh tlh, String str) {
        this.a = tob;
        this.b = tlh;
        this.c = str;
    }

    public final void run() {
        tob tob = this.a;
        tlh tlh = this.b;
        String str = this.c;
        tob.a(tlh, str, tlh.e(str));
    }
}
