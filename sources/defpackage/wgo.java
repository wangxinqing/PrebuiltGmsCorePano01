package defpackage;

import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.math.BigDecimal;
import java.util.Iterator;

/* renamed from: wgo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wgo implements Runnable {
    private final wgt a;
    private final long b;
    private final long c;
    private final int d;

    public wgo(wgt wgt, long j, long j2, int i) {
        this.a = wgt;
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    public final void run() {
        float f;
        wgt wgt = this.a;
        long j = this.b;
        long j2 = this.c;
        int i = this.d;
        wgs wgs = (wgs) wgt.f.get(Long.valueOf(j));
        if (wgs != null) {
            wgs.a = j2;
            wgs.b = i;
            jjg jjg = vvj.a;
            Iterator it = wgt.f.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((wgs) it.next()).b != 2) {
                        break;
                    }
                } else {
                    ((anih) ((anih) vvj.a.d()).a("wgt", "c", 3814, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("All payloads are complete");
                    if (!wgt.a()) {
                        for (wgs wgs2 : wgt.f.values()) {
                            wgs2.b = 3;
                        }
                    } else {
                        wgt.a(2);
                        vtx vtx = wgt.e;
                        ShareTarget shareTarget = wgt.d;
                        vtv vtv = new vtv(6);
                        vtv.a(100.0f);
                        vtx.a(shareTarget, vtv.a());
                        wgt.b(2);
                        return;
                    }
                }
            }
            for (wgs wgs3 : wgt.f.values()) {
                if (wgs3.b == 4) {
                    ((anih) ((anih) vvj.a.d()).a("wgt", "c", 3828, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Payloads cancelled");
                    wgt.b();
                    wgt.a(4);
                    wgt.e.a(wgt.d, new vtv(9).a());
                    wgt.b(3);
                    return;
                }
            }
            for (wgs wgs4 : wgt.f.values()) {
                if (wgs4.b == 3) {
                    ((anih) ((anih) vvj.a.d()).a("wgt", "c", 3838, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Payloads failed");
                    wgt.b();
                    wgt.a(3);
                    wgt.e.a(wgt.d, new vtv(7).a());
                    wgt.b(4);
                    return;
                }
            }
            if (!((Attachment) wgt.d.b().get(0)).e()) {
                wgt.h = BigDecimal.ZERO;
                for (wgs wgs5 : wgt.f.values()) {
                    wgt.h = wgt.h.add(new BigDecimal(Long.toString(wgs5.a)));
                }
                f = wgt.h.multiply(new BigDecimal("100")).divide(wgt.g, 1).floatValue();
            } else {
                f = 50.0f;
            }
            vtx vtx2 = wgt.e;
            ShareTarget shareTarget2 = wgt.d;
            vtv vtv2 = new vtv(5);
            vtv2.a(f);
            vtx2.a(shareTarget2, vtv2.a());
        }
    }
}
