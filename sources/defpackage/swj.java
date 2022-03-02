package defpackage;

/* renamed from: swj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class swj implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ long d;
    final /* synthetic */ suf e;

    public swj(suf suf, String str, String str2, String str3, long j) {
        this.e = suf;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final void run() {
        String str = this.a;
        if (str != null) {
            this.e.a.g.k().a(this.b, new sxk(this.c, str, this.d));
            return;
        }
        this.e.a.g.k().a(this.b, (sxk) null);
    }
}
