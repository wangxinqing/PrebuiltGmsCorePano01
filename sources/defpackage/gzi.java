package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* renamed from: gzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gzi {
    private final hol a;
    private final SharedPreferences b;

    public gzi(hol hol, SharedPreferences sharedPreferences) {
        this.a = hol;
        this.b = sharedPreferences;
    }

    public final void a(hah hah) {
        long j;
        ArrayList arrayList = new ArrayList();
        arrayList.add(hah);
        aucd o = gvs.d.o();
        aucd o2 = gwl.c.o();
        String string = this.b.getString("CheckinService_deviceDataVersionInfo", "");
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        gwl gwl = (gwl) o2.b;
        string.getClass();
        gwl.a |= 1;
        gwl.b = string;
        gwl gwl2 = (gwl) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        gvs gvs = (gvs) o.b;
        gwl2.getClass();
        gvs.b = gwl2;
        gvs.a |= 1;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hah hah2 = (hah) arrayList.get(i);
            aucd o3 = aogb.e.o();
            String b2 = amrk.b(hah2.b);
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            aogb aogb = (aogb) o3.b;
            b2.getClass();
            int i2 = aogb.a | 1;
            aogb.a = i2;
            aogb.b = b2;
            if ((hah2.a & 4) != 0) {
                j = hah2.d;
            } else {
                j = 0;
            }
            aogb.a = i2 | 4;
            aogb.d = j;
            String b3 = amrk.b(hah2.c);
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            aogb aogb2 = (aogb) o3.b;
            b3.getClass();
            aogb2.a |= 2;
            aogb2.c = b3;
            aogb aogb3 = (aogb) o3.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            gvs gvs2 = (gvs) o.b;
            aogb3.getClass();
            if (!gvs2.c.a()) {
                gvs2.c = aucj.a(gvs2.c);
            }
            gvs2.c.add(aogb3);
        }
        this.a.a((audx) (gvs) o.i()).b();
    }
}
