package defpackage;

import android.graphics.Color;
import java.util.ArrayList;

/* renamed from: azs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azs implements bao {
    private int a;

    public azs(int i) {
        this.a = i;
    }

    public final /* bridge */ /* synthetic */ Object a(bat bat, float f) {
        double d;
        ArrayList arrayList = new ArrayList();
        int n = bat.n();
        if (n == 1) {
            bat.a();
        }
        while (bat.e()) {
            arrayList.add(Float.valueOf((float) bat.j()));
        }
        if (n == 1) {
            bat.b();
        }
        int i = this.a;
        if (i == -1) {
            i = arrayList.size() / 4;
            this.a = i;
        }
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                Double.isNaN(floatValue);
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                Double.isNaN(floatValue);
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                Double.isNaN(floatValue);
                iArr[i5] = Color.argb(255, i3, i2, (int) (floatValue * 255.0d));
            }
        }
        ayd ayd = new ayd(fArr, iArr);
        int i7 = this.a * 4;
        if (arrayList.size() > i7) {
            int size = (arrayList.size() - i7) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i8 = 0;
            while (i7 < arrayList.size()) {
                if (i7 % 2 != 0) {
                    dArr2[i8] = (double) ((Float) arrayList.get(i7)).floatValue();
                    i8++;
                } else {
                    dArr[i8] = (double) ((Float) arrayList.get(i7)).floatValue();
                }
                i7++;
            }
            for (int i9 = 0; i9 < ayd.a(); i9++) {
                int i10 = ayd.b[i9];
                double d2 = (double) ayd.a[i9];
                int i11 = 1;
                while (true) {
                    if (i11 >= size) {
                        d = dArr2[size - 1];
                        break;
                    }
                    int i12 = i11 - 1;
                    double d3 = dArr[i12];
                    double d4 = dArr[i11];
                    if (d4 >= d2) {
                        double d5 = dArr2[i12];
                        double d6 = dArr2[i11];
                        Double.isNaN(d2);
                        d = bba.a(d5, d6, (d2 - d3) / (d4 - d3));
                        break;
                    }
                    i11++;
                }
                ayd.b[i9] = Color.argb((int) (d * 255.0d), Color.red(i10), Color.green(i10), Color.blue(i10));
            }
        }
        return ayd;
    }
}
