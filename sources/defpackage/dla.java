package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dla implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ String f;
    final /* synthetic */ dlc g;

    public dla(dlc dlc, Map map, String str, long j, boolean z, boolean z2, String str2) {
        this.g = dlc;
        this.a = map;
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = z2;
        this.f = str2;
    }

    public final void run() {
        double d2;
        Map map = this.a;
        dkh h = this.g.h();
        iva.b("getClientId can not be called from the main thread");
        String b2 = h.a.g().b();
        if (b2 != null && TextUtils.isEmpty((CharSequence) map.get("cid"))) {
            map.put("cid", b2);
        }
        String str = (String) this.a.get("sf");
        if (str != null) {
            try {
                d2 = Double.parseDouble(str);
            } catch (NumberFormatException e2) {
                d2 = 100.0d;
            }
            if (dpx.a(d2, (String) this.a.get("cid"))) {
                this.g.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d2));
                return;
            }
        }
        this.g.d.f();
        this.a.remove("ate");
        this.a.remove("adid");
        dld b3 = this.g.d.h().b();
        dpx.a(this.a, "an", b3.a);
        dpx.a(this.a, "av", b3.b);
        dpx.a(this.a, "aid", b3.c);
        dpx.a(this.a, "aiid", b3.d);
        this.a.put("v", "1");
        this.a.put("_v", dmb.b);
        dpx.a(this.a, "ul", this.g.n().b().a);
        Map map2 = this.a;
        dnc n = this.g.n();
        n.q();
        dli b4 = n.b();
        int i = b4.b;
        int i2 = b4.c;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        dpx.a(map2, "sr", sb.toString());
        if (!this.b.equals("transaction") && !this.b.equals("item")) {
            dpg dpg = this.g.b;
            synchronized (dpg.e) {
                long a2 = dpg.g.a();
                double d3 = dpg.c;
                int i3 = dpg.b;
                if (d3 < 60.0d) {
                    double d4 = (double) (a2 - dpg.d);
                    long j = dpg.a;
                    Double.isNaN(d4);
                    double d5 = d4 / 2000.0d;
                    if (d5 > 0.0d) {
                        d3 = Math.min(60.0d, d3 + d5);
                        dpg.c = d3;
                    }
                }
                dpg.d = a2;
                if (d3 >= 1.0d) {
                    dpg.c = d3 - 4.0d;
                } else {
                    String str2 = dpg.f;
                    StringBuilder sb2 = new StringBuilder(str2.length() + 34);
                    sb2.append("Excessive ");
                    sb2.append(str2);
                    sb2.append(" detected; call ignored.");
                    dph.a(sb2.toString());
                    this.g.e().a(this.a, "Too many hits sent too quickly, rate limiting invoked");
                    return;
                }
            }
        }
        long b5 = dpx.b((String) this.a.get("ht"));
        if (b5 == 0) {
            b5 = this.c;
        }
        long j2 = b5;
        if (!this.d) {
            HashMap hashMap = new HashMap();
            dpx.a((Map) hashMap, "uid", this.a);
            dpx.a((Map) hashMap, "an", this.a);
            dpx.a((Map) hashMap, "aid", this.a);
            dpx.a((Map) hashMap, "av", this.a);
            dpx.a((Map) hashMap, "aiid", this.a);
            this.a.put("_s", String.valueOf(this.g.i().a(new dmf((String) this.a.get("cid"), this.f, !TextUtils.isEmpty((CharSequence) this.a.get("adid")), hashMap))));
            this.g.i().a(new dpc(this.g, this.a, j2, this.e));
            return;
        }
        this.g.e().c("Dry run enabled. Would have sent hit", new dpc(this.g, this.a, j2, this.e));
    }
}
