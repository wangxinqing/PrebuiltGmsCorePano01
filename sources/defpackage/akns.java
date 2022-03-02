package defpackage;

import java.util.List;

/* renamed from: akns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akns implements aknx {
    public final ou a(akln akln) {
        akln akln2 = akln;
        aklh aklh = akln2.d;
        ou ouVar = new ou();
        aklr aklr = akln2.a;
        Float valueOf = Float.valueOf(1.0f);
        if (aklh == null || aklr.f - aklh.b > 300000) {
            ouVar.put(aklv.p, valueOf);
            return ouVar;
        }
        List list = aklh.a;
        int size = list.size();
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            aklm aklm = (aklm) list.get(i2);
            float f2 = aklm.b;
            int i3 = aklm.a;
            f += i3 != 0 ? i3 != 1 ? i3 != 3 ? i3 != 7 ? i3 != 8 ? 0.0f : f2 + f2 : f2 : f2 * 0.0f : 4.0f * f2 : f2 * 15.0f;
            if (i3 == 7 && f2 > 0.9f) {
                ouVar.put(aklv.q, valueOf);
            }
            if (i >= 3) {
                break;
            }
            i++;
            String str = aklv.m;
            int i4 = aklm.a;
            String str2 = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 6 ? i4 != 7 ? i4 != 8 ? "unknown" : "running" : "walking" : "exiting_vehicle" : "still" : "on_foot" : "on_bicycle" : "in_vehicle";
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16 + str2.length());
            sb.append(str);
            sb.append(str2);
            sb.append("_rank");
            sb.append(i);
            ouVar.put(sb.toString(), Float.valueOf(f2));
        }
        if (f > 0.0f) {
            ouVar.put(aklv.n, Float.valueOf(Math.min(1.0f, f / 15.0f)));
        } else {
            ouVar.put(aklv.o, valueOf);
        }
        return ouVar;
    }
}
