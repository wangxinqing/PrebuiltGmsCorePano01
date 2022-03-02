package defpackage;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: ajds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajds implements ajdy {
    private final ajdz a;
    private final long b;
    private final amri c;
    private final ajec d;
    private final ClientContext e;

    public ajds(ajdz ajdz, long j, amri amri, ajec ajec, ClientContext clientContext) {
        this.a = ajdz;
        this.b = j;
        this.c = amri;
        this.d = ajec;
        this.e = clientContext;
    }

    public final void a() {
        ajdz ajdz = this.a;
        long j = this.b;
        amri amri = this.c;
        ajec ajec = this.d;
        ClientContext clientContext = this.e;
        String d2 = aema.d(j);
        aucd o = arvc.d.o();
        aucd b2 = ajdz.b(amri);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aruy aruy = (aruy) b2.i();
        aruy.getClass();
        ((arvc) o.b).c = aruy;
        if (o.c) {
            o.c();
            o.c = false;
        }
        d2.getClass();
        ((arvc) o.b).a = d2;
        arvl a2 = ajec.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        a2.getClass();
        ((arvc) o.b).b = a2;
        auay au = ((arvc) o.i()).au();
        aucd o2 = arvd.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        arvd arvd = (arvd) o2.b;
        au.getClass();
        arvd.c = au;
        ajdx ajdx = ajdz.j;
        if (ajdx != null) {
            auay auay = ajdx.a;
            auay.getClass();
            arvd.b = auay;
        }
        if (ayel.e()) {
            String a3 = ajdz.g.a("NodeOnlineGuarded", au);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            a3.getClass();
            ((arvd) o2.b).d = a3;
        }
        ajdz.a("x-goog-skey");
        ajdz.a("x-goog-skey", d2);
        arvd arvd2 = (arvd) o2.i();
        if (arvd2.U == -1) {
            arvd2.U = aueh.a.a((Object) arvd2).b(arvd2);
        }
        long a4 = ajdz.h.a();
        arve a5 = ajdz.e.a(clientContext, arvd2);
        ajed ajed = ajdz.h;
        int a6 = (int) (ajed.a() - a4);
        arvm arvm = a5.c;
        if (arvm == null) {
            arvm = arvm.c;
        }
        ajed.a(a6, arvm);
        if (a5.d <= 0 || !ajdz.f.a()) {
            ajdz.j = new ajdx(a5.b);
            return;
        }
        ajct ajct = (ajct) ajdz.f.b();
        long max = Math.max(0, Math.min((long) a5.d, ayel.a.a().quakeApiBackoffMaxMs()));
        ajct.b = ((Long) ajct.a.a()).longValue() + max;
        ajct.g.a();
        ajgd ajgd = ajct.g;
        ajgd.b.sendEmptyMessageDelayed(ajgd.a, max);
    }
}
