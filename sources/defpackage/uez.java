package defpackage;

/* renamed from: uez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uez implements igp {
    private final String a;
    private final String b;
    private final ige c;

    public uez(String str, String str2, ige ige) {
        this.a = str;
        this.b = str2;
        this.c = ige;
    }

    public final void a(Object obj, Object obj2) {
        String str = this.a;
        String str2 = this.b;
        ige ige = this.c;
        ueq ueq = (ueq) obj;
        ufs ufs = new ufs((acwd) obj2);
        ueb ueb = new ueb(ige);
        ueq.v.add(ueb);
        uip uip = new uip();
        uip.a((uha) new uen(ufs));
        uip.a(str);
        uip.b(str2);
        uip.a((ugh) ueb);
        ((ugu) ueq.x()).a(uip.a);
    }
}
