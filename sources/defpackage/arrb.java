package defpackage;

import java.io.DataInputStream;

/* renamed from: arrb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arrb {
    static final double a = Math.pow(Math.pow(2.0d, 15.0d), 4.0d);
    private final arra[] b;

    private arrb(int i) {
        this.b = new arra[i];
    }

    static float a(short s) {
        double d = (double) s;
        return (float) ((Math.pow(Math.abs(d), 4.0d) / a) * 6.2d * Math.signum(d));
    }

    public static arrb a(DataInputStream dataInputStream) {
        short readShort = dataInputStream.readShort();
        arrb arrb = new arrb(readShort);
        for (int i = 0; i < readShort; i++) {
            short readShort2 = dataInputStream.readShort();
            short readShort3 = dataInputStream.readShort();
            arra arra = new arra(readShort2, readShort3);
            for (int i2 = 0; i2 < readShort2; i2++) {
                for (int i3 = 0; i3 < readShort3; i3++) {
                    arra.a[i2][i3] = a(dataInputStream.readShort());
                }
            }
            for (int i4 = 0; i4 < readShort3; i4++) {
                arra.b[i4] = a(dataInputStream.readShort());
            }
            arrb.b[i] = arra;
        }
        return arrb;
    }

    public final float[] a(float[] fArr) {
        float[] fArr2 = null;
        int i = 0;
        while (true) {
            arra[] arraArr = this.b;
            int length = arraArr.length;
            if (i >= length) {
                return fArr2;
            }
            int i2 = length - 1;
            arra arra = arraArr[i];
            float[][] fArr3 = arra.a;
            float[] fArr4 = arra.b;
            fArr2 = arra.c;
            int length2 = fArr3.length;
            int length3 = fArr4.length;
            for (int i3 = 0; i3 < length3; i3++) {
                fArr2[i3] = fArr4[i3];
            }
            for (int i4 = 0; i4 < length2; i4++) {
                float f = fArr[i4];
                float[] fArr5 = fArr3[i4];
                for (int i5 = 0; i5 < length3; i5++) {
                    fArr2[i5] = fArr2[i5] + (fArr5[i5] * f);
                }
            }
            if (i != i2) {
                for (int i6 = 0; i6 < length3; i6++) {
                    float f2 = fArr2[i6];
                    if (f2 < 0.0f) {
                        f2 = ((float) Double.longBitsToDouble(((long) ((f2 * 1512775.0f) + 1.07263245E9f)) << 32)) - 4.0f;
                    }
                    fArr2[i6] = f2;
                }
            }
            i++;
            fArr = fArr2;
        }
    }
}
