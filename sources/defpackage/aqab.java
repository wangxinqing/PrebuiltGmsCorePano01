package defpackage;

/* renamed from: aqab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqab implements Runnable {
    private final aqag a;
    private final String b;
    private final Throwable c;

    public aqab(aqag aqag, String str, Throwable th) {
        this.a = aqag;
        this.b = str;
        this.c = th;
    }

    public final void run() {
        aqag aqag = this.a;
        aqag.b.a(this.b, this.c);
    }
}
