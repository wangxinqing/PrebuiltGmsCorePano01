package defpackage;

import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.FACLData;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: fyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fyn {
    static {
        String simpleName = fyn.class.getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2);
        sb.append("[");
        sb.append(simpleName);
        sb.append("]");
        sb.toString();
    }

    public static ScopeDetail a(ggt ggt) {
        FACLData fACLData;
        String str;
        ggt ggt2 = ggt;
        if ((ggt2.a & 16) != 0) {
            ggo ggo = ggt2.f;
            if (ggo == null) {
                ggo = ggo.i;
            }
            fACLData = new FACLData(new FACLConfig(ggo.e, ggo.a, ggo.f, ggo.h, ggo.g, false), ggo.b, ggo.d, ggo.c);
        } else {
            fACLData = null;
        }
        int size = ggt2.h.size();
        ArrayList arrayList = new ArrayList(size);
        if (size > 0) {
            aucx aucx = ggt2.h;
            int size2 = aucx.size();
            for (int i = 0; i < size2; i++) {
                arrayList.add(((ggu) aucx.get(i)).a);
            }
        }
        String str2 = ggt2.b;
        String str3 = ggt2.c;
        String str4 = ggt2.d;
        String str5 = ggt2.g;
        if (!ggt2.e.isEmpty()) {
            str = ggt2.e;
        } else {
            str = null;
        }
        return new ScopeDetail(str5, str2, str3, str4, str, fACLData, arrayList);
    }

    public static ArrayList a(List list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String str;
        String str2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ScopeDetail scopeDetail = (ScopeDetail) it.next();
                ArrayList arrayList2 = new ArrayList();
                for (String add : scopeDetail.a()) {
                    arrayList2.add(add);
                }
                FACLData fACLData = scopeDetail.h;
                boolean z12 = false;
                if (fACLData != null) {
                    z = true;
                } else {
                    z = false;
                }
                String str3 = null;
                if (!z) {
                    str2 = null;
                    str = null;
                    z7 = false;
                    z6 = false;
                    z5 = false;
                    z4 = false;
                    z3 = false;
                    z2 = false;
                } else {
                    FACLConfig fACLConfig = fACLData.b;
                    if (fACLConfig != null) {
                        str3 = fACLConfig.c;
                        z12 = fACLConfig.g;
                        z10 = fACLConfig.e;
                        z9 = fACLConfig.f;
                        z8 = fACLConfig.b;
                        z11 = fACLConfig.d;
                    } else {
                        z11 = false;
                        z10 = false;
                        z9 = false;
                        z8 = false;
                    }
                    z6 = z12;
                    z2 = z11;
                    z5 = z10;
                    z4 = z9;
                    z3 = z8;
                    str = fACLData.c;
                    z7 = fACLData.d;
                    str2 = str3;
                }
                Iterator it2 = it;
                ScopeData scopeData = r3;
                ScopeData scopeData2 = new ScopeData(scopeDetail.b, scopeDetail.c, scopeDetail.d, scopeDetail.e, z, str2, str, z7, z6, z5, z4, z3, z2, arrayList2, scopeDetail.f);
                arrayList.add(scopeData);
                it = it2;
            }
        }
        return arrayList;
    }
}
