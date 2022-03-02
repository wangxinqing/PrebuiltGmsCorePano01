package defpackage;

import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: adde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adde {
    public static final String a = avrp.FPOP_CLIENT.name();
    public final amsv b;
    public final amsv c;
    public final afts d;

    public adde(amsv amsv, afts afts, amsv amsv2) {
        this.b = amta.a(amsv);
        this.d = afts;
        this.c = amsv2;
    }

    public final void a(atwu atwu) {
        long longValue = ((Long) this.c.a()).longValue();
        if (this.d.a(longValue)) {
            hol hol = (hol) this.b.a();
            aucd o = atwz.h.o();
            int i = (int) longValue;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwz atwz = (atwz) o.b;
            atwz.a |= 64;
            atwz.d = i;
            atvy atvy = atvy.c;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwz atwz2 = (atwz) o.b;
            atvy.getClass();
            atwz2.c = atvy;
            atwz2.b = 3;
            aucd o2 = atws.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atws atws = (atws) o2.b;
            "com.google.android.gms#udc-facs".getClass();
            atws.a |= 1;
            atws.b = "com.google.android.gms#udc-facs";
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwz atwz3 = (atwz) o.b;
            atws atws2 = (atws) o2.i();
            atws2.getClass();
            atwz3.e = atws2;
            atwz3.a |= 128;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwz atwz4 = (atwz) o.b;
            atwu.getClass();
            atwz4.f = atwu;
            atwz4.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            hoi a2 = hol.a((audx) o.i());
            a2.b((int) ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
            a2.b();
        }
    }

    public final void a(atwy atwy, boolean z, boolean z2, boolean z3) {
        long longValue = ((Long) this.c.a()).longValue();
        aucd aucd = (aucd) atwy.c(5);
        aucd.a((aucj) atwy);
        atwv atwv = (atwv) aucd;
        if (z) {
            aucd o = atwx.d.o();
            atxf atxf = atxf.FORCED_SYNC;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwx atwx = (atwx) o.b;
            atwx.b = atxf.l;
            atwx.a |= 1;
            atwv.a(o);
        }
        if (z2) {
            aucd o2 = atwx.d.o();
            atxf atxf2 = atxf.PERIODIC_SYNC;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atwx atwx2 = (atwx) o2.b;
            atwx2.b = atxf2.l;
            atwx2.a |= 1;
            atwv.a(o2);
        }
        if (z3) {
            aucd o3 = atwx.d.o();
            atxf atxf3 = atxf.EMPTY_CACHE;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            atwx atwx3 = (atwx) o3.b;
            atwx3.b = atxf3.l;
            atwx3.a |= 1;
            atwv.a(o3);
        }
        if (this.d.a(longValue)) {
            hol hol = (hol) this.b.a();
            aucd o4 = atwz.h.o();
            int i = (int) longValue;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            atwz atwz = (atwz) o4.b;
            atwz.a |= 64;
            atwz.d = i;
            atvy atvy = atvy.c;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            atwz atwz2 = (atwz) o4.b;
            atvy.getClass();
            atwz2.c = atvy;
            atwz2.b = 3;
            aucd o5 = atws.d.o();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            atws atws = (atws) o5.b;
            "com.google.android.gms#udc-facs".getClass();
            atws.a |= 1;
            atws.b = "com.google.android.gms#udc-facs";
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            atwz atwz3 = (atwz) o4.b;
            atws atws2 = (atws) o5.i();
            atws2.getClass();
            atwz3.e = atws2;
            atwz3.a |= 128;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            atwz atwz4 = (atwz) o4.b;
            atwy atwy2 = (atwy) atwv.i();
            atwy2.getClass();
            atwz4.g = atwy2;
            atwz4.a |= 512;
            hoi a2 = hol.a((audx) o4.i());
            a2.b(1001);
            a2.b();
        }
    }
}
