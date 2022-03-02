package defpackage;

/* renamed from: baly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baly extends bama {
    final /* synthetic */ bamb a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public baly(bamb bamb) {
        super(bamb);
        this.a = bamb;
        int i = bapg.a;
    }

    public final void a() {
        int i = bapg.a;
        batd batd = new batd();
        synchronized (this.a.a) {
            batd batd2 = this.a.b;
            batd.a(batd2, batd2.b);
            this.a.e = false;
        }
        this.a.f.a(batd, batd.b);
        this.a.f.flush();
    }
}
