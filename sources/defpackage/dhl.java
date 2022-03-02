package defpackage;

import com.android.volley.toolbox.ImageRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dhl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dhl {
    public final dfd a;
    public final dgm b;
    public final ArrayList c;
    public final aw d;

    public dhl(dfd dfd, dgm dgm, aqsr aqsr, List list) {
        aw awVar = new aw();
        this.d = awVar;
        this.a = dfd;
        this.b = dgm;
        awVar.b(new dhi(aqsr, (dhh) null, false, false));
        this.c = new ArrayList(list);
    }

    public final int a() {
        return this.c.size() - 1;
    }

    public final aqsr b() {
        return ((dhi) this.d.b()).a;
    }

    public final void c() {
        dgm dgm = this.b;
        int i = ((dhi) this.d.b()).a.b;
        dis a2 = dgm.a();
        a2.b();
        a2.c.add(new diq(a2, i));
        a2.c.add(new dir(a2, i));
        for (int i2 = 0; i2 < a2.c.size(); i2++) {
            a2.b.postDelayed((Runnable) a2.c.get(i2), (long) (((Integer) dis.a.get(i2)).intValue() * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS));
        }
    }

    public final dhk a(aqsr aqsr, dhh dhh) {
        aqsr aqsr2;
        aqpp b2 = this.a.d(aqsr).b();
        aqsr g = csm.g(b2);
        aqsr h = csm.h(b2);
        aqsr i = csm.i(b2);
        if (h != null && i == null) {
            aqso aqso = this.a.d(h).a;
            if (aqso.b == 7) {
                aucx aucx = ((aqqe) aqso.c).a;
                int size = aucx.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    aqpz aqpz = (aqpz) aucx.get(i2);
                    i2++;
                    if (aqpz.b == 2) {
                        aqsr2 = (aqsr) aqpz.c;
                        break;
                    }
                }
            }
            aqsr2 = null;
        } else {
            aqsr2 = i;
        }
        return new dhk(aqsr, g, h, aqsr2, dhh);
    }

    public final boolean a(dhk dhk, aqsr aqsr) {
        aqsr h = csm.h(this.a.d(aqsr).b());
        return h != null && !h.equals(dhk.c);
    }
}
