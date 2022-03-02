package defpackage;

/* renamed from: agph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class agph implements amsv {
    private final agpk a;
    private final agpj b;

    public agph(agpk agpk, agpj agpj) {
        this.a = agpk;
        this.b = agpj;
    }

    public final Object a() {
        agpk agpk = this.a;
        agpj agpj = this.b;
        if (!aygo.b()) {
            agou agou = (agou) agpj;
            return agpk.d.a(agou.b, agou.c);
        }
        agou agou2 = (agou) agpj;
        return agpk.d.a(agou2.b, agou2.c, aygo.c());
    }
}
