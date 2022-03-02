package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: akod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akod implements aknx {
    private static float a(float f) {
        return Math.min(1.0f, (Math.max(f, -100.0f) + 100.0f) / 60.0f);
    }

    public final ou a(akln akln) {
        akoh akoh = akln.b;
        boolean z = akln.e;
        ou ouVar = new ou();
        if (akoh == null || akoh.a() == 0) {
            return ouVar;
        }
        if (z) {
            ouVar.put(aklv.k, Float.valueOf(1.0f));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < akoh.a(); i++) {
            arrayList.add(Integer.valueOf(akoh.a(i).d));
        }
        ouVar.put(aklv.h, Float.valueOf(Math.min(1.0f, ((float) arrayList.size()) / 25.0f)));
        Collections.sort(arrayList, Collections.reverseOrder());
        int i2 = 0;
        while (i2 < Math.min(arrayList.size(), 5)) {
            String str = aklv.i;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
            sb.append(str);
            sb.append("_rank");
            int i3 = i2 + 1;
            sb.append(i3);
            ouVar.put(sb.toString(), Float.valueOf(a((float) ((Integer) arrayList.get(i2)).intValue())));
            i2 = i3;
        }
        int size = arrayList.size();
        float f = 0.0f;
        if (size == 0) {
            String str2 = aklv.j;
            Float valueOf = Float.valueOf(0.0f);
            ouVar.put(str2, valueOf);
            ouVar.put(aklv.l, valueOf);
        } else {
            int size2 = arrayList.size();
            float f2 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                Integer num = (Integer) arrayList.get(i4);
                f += (float) num.intValue();
                f2 += (float) (num.intValue() * num.intValue());
            }
            float f3 = (float) size;
            float f4 = f / f3;
            double sqrt = Math.sqrt((double) ((f2 / f3) - (f4 * f4)));
            ouVar.put(aklv.j, Float.valueOf(a(f4)));
            ouVar.put(aklv.l, Float.valueOf(Math.min(1.0f, ((float) sqrt) / 30.0f)));
        }
        return ouVar;
    }
}
