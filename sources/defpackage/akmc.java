package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: akmc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akmc implements akmb {
    public final String a() {
        return "LogReg";
    }

    public final float[] a(akmd akmd, List list) {
        int size = list.size();
        if (size == 0) {
            aklz.a().b("No candidates to score");
            return new float[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ou ouVar = new ou();
            aklu aklu = (aklu) list.get(i);
            for (int i2 = 0; i2 < aklu.a(); i2++) {
                ouVar.put(((Integer) aklu.a.b(i2)).toString(), (Float) aklu.a.c(i2));
            }
            arrayList.add(ouVar);
        }
        float[] fArr = new float[size];
        for (int i3 = 0; i3 < size; i3++) {
            ou ouVar2 = (ou) arrayList.get(i3);
            ou ouVar3 = akmd.a;
            float f = 0.0f;
            for (int i4 = 0; i4 < ouVar2.h; i4++) {
                Float f2 = (Float) ouVar3.get((String) ouVar2.b(i4));
                if (f2 != null) {
                    f += f2.floatValue() * ((Float) ouVar2.c(i4)).floatValue();
                }
            }
            fArr[i3] = f;
        }
        return fArr;
    }
}
