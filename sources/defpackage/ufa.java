package defpackage;

/* renamed from: ufa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ufa implements igp {
    private final String a;
    private final ige b;

    public ufa(String str, ige ige) {
        this.a = str;
        this.b = ige;
    }

    public final void a(Object obj, Object obj2) {
        String str = this.a;
        ige ige = this.b;
        ueq ueq = (ueq) obj;
        ufs ufs = new ufs((acwd) obj2);
        uem uem = new uem(ueq.c, ige);
        ueq.u.add(uem);
        udp udp = new udp();
        udp.a((uha) new uen(ufs));
        udp.a(str);
        udp.a((ugx) uem);
        ((ugu) ueq.x()).a(udp.a);
    }
}
