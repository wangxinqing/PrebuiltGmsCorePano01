package defpackage;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: ajdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajdt implements ajdy {
    private final ajdz a;
    private final amri b;
    private final ajec c;
    private final ajec d;
    private final ajec e;
    private final aruv f;
    private final ClientContext g;

    public ajdt(ajdz ajdz, amri amri, ajec ajec, ajec ajec2, ajec ajec3, aruv aruv, ClientContext clientContext) {
        this.a = ajdz;
        this.b = amri;
        this.c = ajec;
        this.d = ajec2;
        this.e = ajec3;
        this.f = aruv;
        this.g = clientContext;
    }

    public final void a() {
        ajdz ajdz = this.a;
        amri amri = this.b;
        ajec ajec = this.c;
        ajec ajec2 = this.d;
        ajec ajec3 = this.e;
        aruv aruv = this.f;
        ClientContext clientContext = this.g;
        if (ajdz.j != null) {
            aucd o = arvg.d.o();
            aucd b2 = ajdz.b(amri);
            arvl a2 = ajec.a();
            if (b2.c) {
                b2.c();
                b2.c = false;
            }
            aruy aruy = aruy.i;
            a2.getClass();
            ((aruy) b2.b).g = a2;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aruy aruy2 = (aruy) b2.i();
            aruy2.getClass();
            ((arvg) o.b).c = aruy2;
            arvl a3 = ajec2.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            a3.getClass();
            ((arvg) o.b).b = a3;
            aucd o2 = arvj.c.o();
            arvl a4 = ajec3.a();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arvj arvj = (arvj) o2.b;
            a4.getClass();
            arvj.a = a4;
            aruv.getClass();
            arvj.b = aruv;
            if (o.c) {
                o.c();
                o.c = false;
            }
            arvj arvj2 = (arvj) o2.i();
            arvj2.getClass();
            ((arvg) o.b).a = arvj2;
            auay au = ((arvg) o.i()).au();
            aucd o3 = arvh.d.o();
            auay auay = ajdz.j.a;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            arvh arvh = (arvh) o3.b;
            auay.getClass();
            arvh.a = auay;
            au.getClass();
            arvh.b = au;
            if (ayel.f()) {
                String a5 = ajdz.g.a("NodeTriggeringGuarded", au);
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                a5.getClass();
                ((arvh) o3.b).c = a5;
            }
            arvh arvh2 = (arvh) o3.i();
            if (aruv.U == -1) {
                aruv.U = aueh.a.a((Object) aruv).b(aruv);
            }
            if (arvh2.U == -1) {
                arvh2.U = aueh.a.a((Object) arvh2).b(arvh2);
            }
            long a6 = ajdz.h.a();
            arvi a7 = ajdz.e.a(clientContext, arvh2);
            ajed ajed = ajdz.h;
            int a8 = (int) (ajed.a() - a6);
            arvm arvm = a7.a;
            if (arvm == null) {
                arvm = arvm.c;
            }
            ajed.a(a8, arvm);
        }
    }
}
