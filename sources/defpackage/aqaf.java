package defpackage;

/* renamed from: aqaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqaf implements aora {
    final /* synthetic */ azxk a;
    final /* synthetic */ aqag b;

    public aqaf(aqag aqag, azxk azxk) {
        this.b = aqag;
        this.a = azxk;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        azxl azxl = (azxl) obj;
        try {
            aqag aqag = this.b;
            aqag.b = azxl;
            for (Runnable run : aqag.a) {
                run.run();
            }
        } catch (Throwable th) {
            a(th);
        }
    }

    public final void a(Throwable th) {
        this.b.d = true;
        this.a.a(babj.a(th), new baaf());
    }
}
