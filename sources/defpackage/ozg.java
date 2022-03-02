package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: ozg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ozg implements ozk {
    final /* synthetic */ Set a;
    final /* synthetic */ String b;
    final /* synthetic */ Set c;
    final /* synthetic */ ozc d;
    final /* synthetic */ boolean e;
    final /* synthetic */ ozq f;

    public ozg(ozq ozq, Set set, String str, Set set2, ozc ozc, boolean z) {
        this.f = ozq;
        this.a = set;
        this.b = str;
        this.c = set2;
        this.d = ozc;
        this.e = z;
    }

    public final int a(ota ota) {
        oxe a2;
        osz osz = ota.b;
        if (osz == null) {
            osz = osz.s;
        }
        Set set = this.a;
        if (set != null && !set.contains(osz.c)) {
            return 2;
        }
        String str = this.b;
        if (str != null && !str.equals(osz.e)) {
            return 2;
        }
        Set set2 = this.c;
        if (set2 == null || set2.contains(ota)) {
            return 1;
        }
        if (this.d.a() && this.e) {
            if (!this.f.a(this.d, osz)) {
                return 3;
            }
            oyz d2 = this.f.c.d(osz.e);
            if (d2 != null && this.f.c.e(osz.e) && d2.a(osz.c, true) && !osz.k.isEmpty()) {
                return 1;
            }
        }
        if (((Boolean) ozx.bC.c()).booleanValue() && this.f.a(this.d, osz) && this.f.c.d(osz.e) != null) {
            pxf pxf = this.f.d;
            ozc ozc = this.d;
            String str2 = osz.e;
            if ((!ozc.b && !ozc.d) || !((Boolean) ozx.F.c()).booleanValue() || !ozx.a(str2)) {
                String str3 = ozc.f;
                if (ozc.e) {
                    Set set3 = (Set) pxf.b().get(str3);
                    if (set3 == null) {
                        set3 = Collections.emptySet();
                    }
                    if (set3.isEmpty() || (a2 = oxe.a(osz.c, osz.e, oyb.a(pxf.a))) == null || a2.c == 1 || !set3.contains(a2.a.b)) {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return 3;
    }
}
