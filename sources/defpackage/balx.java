package defpackage;

/* renamed from: balx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class balx extends bama {
    final /* synthetic */ bamb a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public balx(bamb bamb) {
        super(bamb);
        this.a = bamb;
        int i = bapg.a;
    }

    public final void a() {
        int i = bapg.a;
        batd batd = new batd();
        synchronized (this.a.a) {
            batd batd2 = this.a.b;
            batd.a(batd2, batd2.d());
            this.a.d = false;
        }
        this.a.f.a(batd, batd.b);
    }
}
