package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: ajdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajdu implements ajdy {
    private final ajdz a;
    private final amri b;
    private final ajec c;
    private final ClientContext d;

    public ajdu(ajdz ajdz, amri amri, ajec ajec, ClientContext clientContext) {
        this.a = ajdz;
        this.b = amri;
        this.c = ajec;
        this.d = clientContext;
    }

    public final void a() {
        ajdz ajdz = this.a;
        amri amri = this.b;
        ajec ajec = this.c;
        ClientContext clientContext = this.d;
        if (ajdz.j != null) {
            aucd o = aruz.c.o();
            aucd b2 = ajdz.b(amri);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aruy aruy = (aruy) b2.i();
            aruy.getClass();
            ((aruz) o.b).b = aruy;
            arvl a2 = ajec.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            a2.getClass();
            ((aruz) o.b).a = a2;
            auay au = ((aruz) o.i()).au();
            aucd o2 = arva.d.o();
            auay auay = ajdz.j.a;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arva arva = (arva) o2.b;
            auay.getClass();
            arva.a = auay;
            au.getClass();
            arva.b = au;
            if (ayel.d()) {
                String a3 = ajdz.g.a("NodeOfflineGuarded", au);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                a3.getClass();
                ((arva) o2.b).c = a3;
            }
            arva arva2 = (arva) o2.i();
            if (arva2.U == -1) {
                arva2.U = aueh.a.a((Object) arva2).b(arva2);
            }
            rlv rlv = ajdz.e;
            if (rlv.c == null) {
                rlv.c = baaj.a(baai.UNARY, "google.internal.android.location.quake.v1.QuakeApiService/NodeOffline", baoq.a(arva.d), baoq.a(arvb.a));
            }
            arvb arvb = (arvb) rlv.a.a(rlv.c, clientContext, arva2, (long) rlv.b, TimeUnit.MILLISECONDS);
            ajdz.j = null;
            ajdz.c();
        }
    }
}
