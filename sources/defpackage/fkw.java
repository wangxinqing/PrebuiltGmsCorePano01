package defpackage;

/* renamed from: fkw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fkw {
    public final flm a = ((flm) flm.a.a());

    private fkw() {
    }

    public static fkw a() {
        int i = jhg.a;
        return new fkw();
    }

    public final void a(String str, boolean z) {
        flm flm = this.a;
        flf flf = flm.e;
        Boolean valueOf = Boolean.valueOf(z);
        iva.a((Object) flf);
        iva.c(str);
        synchronized (flm.c) {
            flm.b.a((flb) new flj(flf, str, valueOf));
        }
    }
}
