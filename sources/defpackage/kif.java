package defpackage;

/* renamed from: kif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kif implements khy {
    private final kkf a;
    private final kmp b;

    public kif(kkf kkf, kmp kmp) {
        iva.a((Object) kkf);
        this.a = kkf;
        iva.a((Object) kmp);
        this.b = kmp;
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        kkf kkf = this.a;
        kmp kmp = this.b;
        ((kjp) kkf).a.a(kpx.a, kqz.a(kpw.ENTRY_ID.d.e(kmp.h()), kpw.VERSION.d.a(kmp.ae())));
        kkf kkf2 = this.a;
        kmp kmp2 = this.b;
        kpu kpu = new kpu(((kjp) kkf2).a, -1, str, kmp2.a(), kmp2.ae());
        kpu.t();
        return kpu;
    }
}
