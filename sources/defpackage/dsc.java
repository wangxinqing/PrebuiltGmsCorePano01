package defpackage;

/* renamed from: dsc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dsc extends ppr {
    final /* synthetic */ ozc a;
    final /* synthetic */ ozv b;
    final /* synthetic */ dsh c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dsc(dsh dsh, aonk aonk, String str, ozc ozc, ozv ozv) {
        super(aonk, 2, str);
        this.c = dsh;
        this.a = ozc;
        this.b = ozv;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        try {
            this.c.a.a(this.a, this.b);
            return null;
        } catch (SecurityException | pau | pax e) {
            return e;
        }
    }
}
