package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: ahmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahmz {
    public ahox a;
    private final ahmg b;
    private final boolean c;
    private final ahmn d;
    private final Class e;

    public ahmz(boolean z, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ahmn ahmn, Class cls, ahox ahox) {
        this.c = z;
        this.e = cls;
        if (z) {
            this.b = new ahmp(byteBuffer, ahna.WATCH_ACTIVITY.s);
        } else if (cls == ahmw.class) {
            this.b = new ahmw(byteBuffer, byteBuffer2, (int) axzj.f(), axzj.h());
        } else if (cls == ahmq.class) {
            this.b = new ahmq(byteBuffer, (int) axzj.f(), axzj.g());
        } else {
            this.b = new ahmp(byteBuffer, ahna.PHONE_ACTIVITY.s);
        }
        this.d = ahmn;
        this.a = ahox;
    }

    public final List a(ahyq ahyq) {
        List list;
        ahyq ahyq2 = ahyq;
        char c2 = 1;
        if (this.c) {
            ahni ahni = new ahni();
            double[][] a2 = ahmx.a(ahyq2, 128.0d);
            double[][] dArr = new double[a2.length][];
            for (int i = 0; i < a2.length; i++) {
                double[] dArr2 = a2[i];
                double[] dArr3 = new double[dArr2.length];
                dArr3[0] = dArr2[0];
                for (int i2 = 1; i2 < dArr2.length; i2++) {
                    int i3 = i2 - 1;
                    dArr3[i2] = ((dArr3[i3] + dArr2[i2]) - dArr2[i3]) * 0.7d;
                }
                dArr[i] = dArr3;
            }
            float[] fArr = {ahmi.a(dArr[0]), ahmi.a(dArr[1]), ahmi.a(dArr[2])};
            Arrays.sort(fArr);
            ahni.F = fArr[2];
            ahni.G = fArr[1];
            double[][] dArr4 = new double[3][];
            for (int i4 = 0; i4 < 3; i4++) {
                double[] dArr5 = a2[i4];
                int length = dArr5.length >> 6;
                double[] dArr6 = new double[length];
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = i5 * 64;
                    dArr6[i5] = ahnh.a(dArr5, i6, i6 + 64);
                }
                dArr4[i4] = dArr6;
            }
            int length2 = dArr4[0].length;
            double[] dArr7 = new double[length2];
            for (int i7 = 0; i7 < length2; i7++) {
                dArr7[i7] = ahnh.a(dArr4[0][i7], dArr4[2][i7]);
            }
            int length3 = dArr4[0].length;
            double[] dArr8 = new double[length3];
            int i8 = 0;
            while (i8 < length3) {
                dArr8[i8] = ahnh.a(dArr4[0][i8], dArr4[c2][i8], dArr4[2][i8]);
                i8++;
                c2 = 1;
            }
            float[] a3 = ahnh.a(dArr7);
            float[] a4 = ahnh.a(dArr8);
            ahni.w = a4[0];
            ahni.y = a3[0];
            ahni.x = a4[c2];
            ahni.z = a3[c2];
            double[] dArr9 = new double[3];
            double[] dArr10 = a2[0];
            dArr9[0] = ahnh.a(dArr10, 0, dArr10.length);
            double[] dArr11 = a2[c2];
            dArr9[c2] = ahnh.a(dArr11, 0, dArr11.length);
            double[] dArr12 = a2[2];
            double a5 = ahnh.a(dArr12, 0, dArr12.length);
            dArr9[2] = a5;
            double d2 = dArr9[0];
            double d3 = dArr9[c2];
            double a6 = ahnh.a(d2, a5);
            double d4 = d2;
            ahni.A = (float) ahnh.a(d2, d3, a5);
            ahni.B = (float) a6;
            double sqrt = Math.sqrt((d4 * d4) + (d3 * d3) + (a5 * a5));
            ahni.C = (float) (d4 / sqrt);
            ahni.D = (float) (d3 / sqrt);
            ahni.E = (float) (a5 / sqrt);
            ahmi.a((ahml) ahni, a2, true);
            list = this.b.a((ahml) ahni);
        } else {
            ahmm ahmm = new ahmm();
            if (this.e == ahmq.class) {
                List a7 = this.b.a(ahmk.a(ahyq));
                if (this.a != null) {
                    ahmj.a(ahmm, ahyq2);
                }
                list = a7;
            } else {
                ahmj.a(ahmm, ahyq2);
                list = this.b.a((ahml) ahmm);
            }
            ahox ahox = this.a;
            if (ahox != null) {
                ahox.b = false;
                ahov ahov = ahox.a;
                if (ahov != null) {
                    ArrayList arrayList = new ArrayList();
                    for (ahot ahot : ahov.c.values()) {
                        if (ahot != null) {
                            arrayList.add(ahot);
                        }
                    }
                    ahov.a();
                    List a8 = ahot.a(list, ahmm, arrayList);
                    if (a8 != null) {
                        ahox.b = true;
                        list = a8;
                    }
                }
            }
        }
        ahmn ahmn = this.d;
        return ahmn != null ? Collections.singletonList(new ahmo(ahmn, 100)) : list;
    }
}
