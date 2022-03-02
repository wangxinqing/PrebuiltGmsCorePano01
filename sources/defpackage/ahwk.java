package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ahwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahwk {
    public final int a;
    public final ahwi b;

    public ahwk(int i, int i2, Class cls) {
        this.b = new ahwi((i2 + i) - 1, cls);
        this.a = i;
    }

    public final List a(float[] fArr, int i, int i2) {
        ahwi ahwi = this.b;
        amrl.a(true);
        ahwi.a(i, i2, fArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            ahwi.b[ahwi.a(ahwi.d + i3)] = fArr[i + i3];
        }
        ahwi.b(i2);
        ArrayList arrayList = new ArrayList();
        while (true) {
            ahwi ahwi2 = this.b;
            int i4 = ahwi2.d;
            int i5 = this.a;
            if (i4 < i5) {
                return arrayList;
            }
            float[] fArr2 = new float[i5];
            int min = Math.min(i5, i4);
            for (int i6 = 0; i6 < min; i6++) {
                fArr2[i6] = ahwi2.b[ahwi2.a(i6)];
            }
            this.b.c(i5);
            arrayList.add(fArr2);
        }
    }
}
