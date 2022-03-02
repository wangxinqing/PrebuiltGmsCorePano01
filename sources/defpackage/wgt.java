package defpackage;

import android.os.SystemClock;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: wgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class wgt implements wdn {
    private boolean a;
    public final ShareTarget d;
    public final vtx e;
    public final Map f = new nz();
    public final BigDecimal g;
    public BigDecimal h;
    final /* synthetic */ wgu i;

    public wgt(wgu wgu, ShareTarget shareTarget, vtx vtx) {
        this.i = wgu;
        this.a = false;
        this.d = shareTarget;
        this.e = vtx;
        this.h = BigDecimal.ZERO;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        List b = shareTarget.b();
        int size = b.size();
        for (int i2 = 0; i2 < size; i2++) {
            Attachment attachment = (Attachment) b.get(i2);
            long b2 = wgu.b(attachment);
            if (b2 == -1) {
                ((anih) ((anih) vvj.a.c()).a("wgt", "<init>", 3626, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to retrieve payload for: %s", (Object) attachment);
            } else {
                ((anih) ((anih) vvj.a.d()).a("wgt", "<init>", 3629, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Tracking payload %d", b2);
                Map map = this.f;
                Long valueOf = Long.valueOf(b2);
                attachment.a();
                map.put(valueOf, new wgs());
                bigDecimal = bigDecimal.add(new BigDecimal(Long.toString(attachment.a())));
            }
        }
        this.g = bigDecimal;
    }

    private final void c() {
        float f2;
        Iterator it = this.f.values().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((wgs) it.next()).b != 2) {
                    break;
                }
            } else {
                ((anih) ((anih) vvj.a.d()).a("wgt", "c", 3814, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("All payloads are complete");
                if (!a()) {
                    for (wgs wgs : this.f.values()) {
                        wgs.b = 3;
                    }
                } else {
                    a(2);
                    vtx vtx = this.e;
                    ShareTarget shareTarget = this.d;
                    vtv vtv = new vtv(6);
                    vtv.a(100.0f);
                    vtx.a(shareTarget, vtv.a());
                    b(2);
                    return;
                }
            }
        }
        for (wgs wgs2 : this.f.values()) {
            if (wgs2.b == 4) {
                ((anih) ((anih) vvj.a.d()).a("wgt", "c", 3828, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Payloads cancelled");
                b();
                a(4);
                this.e.a(this.d, new vtv(9).a());
                b(3);
                return;
            }
        }
        for (wgs wgs3 : this.f.values()) {
            if (wgs3.b == 3) {
                ((anih) ((anih) vvj.a.d()).a("wgt", "c", 3838, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Payloads failed");
                b();
                a(3);
                this.e.a(this.d, new vtv(7).a());
                b(4);
                return;
            }
        }
        if (!((Attachment) this.d.b().get(0)).e()) {
            this.h = BigDecimal.ZERO;
            for (wgs wgs4 : this.f.values()) {
                this.h = this.h.add(new BigDecimal(Long.toString(wgs4.a)));
            }
            f2 = this.h.multiply(new BigDecimal("100")).divide(this.g, 1).floatValue();
        } else {
            f2 = 50.0f;
        }
        jjg jjg = vvj.a;
        vtx vtx2 = this.e;
        ShareTarget shareTarget2 = this.d;
        vtv vtv2 = new vtv(5);
        vtv2.a(f2);
        vtx2.a(shareTarget2, vtv2.a());
    }

    public final void a(int i2) {
        String str;
        ShareTarget shareTarget = this.d;
        if (shareTarget.i) {
            str = this.i.j(shareTarget);
        } else {
            str = this.i.m(shareTarget);
        }
        if (str == null) {
            ((anih) ((anih) vvj.a.c()).a("wgt", "a", 3682, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to disconnect. No endpointId found for ShareTarget %s", (Object) this.d);
        } else if (i2 != 2) {
            this.i.g.b(str);
        } else if (!this.d.i) {
            jjg jjg = vvj.a;
            tfu b = tfu.b(new wgp(this, str), ayni.a.a().aA(), this.i.d);
            wcx o = this.i.o(this.d);
            if (o != null) {
                o.a((wcw) new wgq(this, b));
            }
        } else {
            this.i.g.b(str);
        }
    }

    public boolean a() {
        return true;
    }

    public void b() {
        wgu.l();
    }

    public final void b(int i2) {
        if (!this.a) {
            double uptimeMillis = (double) (SystemClock.uptimeMillis() - this.i.v);
            Double.isNaN(uptimeMillis);
            double d2 = uptimeMillis / 1000.0d;
            double doubleValue = this.h.divide(new BigDecimal(1048576)).divide(BigDecimal.valueOf(Math.max(d2, 0.001d)), 3, RoundingMode.DOWN).doubleValue();
            if (this.d.i) {
                anih anih = (anih) ((anih) vvj.a.d()).a("wgt", "b", 3795, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                String a2 = aspd.a(i2);
                if (i2 != 0) {
                    anih.a("Incoming payload transfer has completed with status %s in %.2f seconds = %.2f MB/s", (Object) a2, (Object) Double.valueOf(d2), (Object) Double.valueOf(doubleValue));
                    wgu wgu = this.i;
                    vva vva = wgu.o;
                    long j = wgu.u;
                    long longValue = this.h.longValue();
                    aucd d3 = vvb.d(19);
                    aucd o = asll.e.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    asll asll = (asll) o.b;
                    int i3 = asll.a | 1;
                    asll.a = i3;
                    asll.b = j;
                    int i4 = i3 | 2;
                    asll.a = i4;
                    asll.c = longValue;
                    int i5 = i2 - 1;
                    if (i2 != 0) {
                        asll.d = i5;
                        asll.a = i4 | 4;
                        asll asll2 = (asll) o.i();
                        if (d3.c) {
                            d3.c();
                            d3.c = false;
                        }
                        asmc asmc = (asmc) d3.b;
                        asmc asmc2 = asmc.B;
                        asll2.getClass();
                        asmc.t = asll2;
                        asmc.a |= 524288;
                        vva.a(new vut((asmc) d3.i()));
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                anih anih2 = (anih) ((anih) vvj.a.d()).a("wgt", "b", 3803, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                String a3 = aspd.a(i2);
                if (i2 != 0) {
                    anih2.a("Outgoing payload transfer has completed with status %s in %.2f seconds = %.2f MB/s", (Object) a3, (Object) Double.valueOf(d2), (Object) Double.valueOf(doubleValue));
                    wgu wgu2 = this.i;
                    vva vva2 = wgu2.o;
                    long j2 = wgu2.t;
                    long longValue2 = this.h.longValue();
                    aucd d4 = vvb.d(17);
                    aucd o2 = asls.e.o();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    asls asls = (asls) o2.b;
                    int i6 = asls.a | 1;
                    asls.a = i6;
                    asls.b = j2;
                    int i7 = i6 | 2;
                    asls.a = i7;
                    asls.c = longValue2;
                    int i8 = i2 - 1;
                    if (i2 != 0) {
                        asls.d = i8;
                        asls.a = i7 | 4;
                        asls asls2 = (asls) o2.i();
                        if (d4.c) {
                            d4.c();
                            d4.c = false;
                        }
                        asmc asmc3 = (asmc) d4.b;
                        asmc asmc4 = asmc.B;
                        asls2.getClass();
                        asmc3.r = asls2;
                        asmc3.a |= 131072;
                        vva2.a(new vuu((asmc) d4.i()));
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            this.a = true;
        }
    }

    public final void a(long j, long j2, int i2) {
        this.i.a((Runnable) new wgo(this, j, j2, i2));
    }
}
