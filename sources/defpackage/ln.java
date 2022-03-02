package defpackage;

import android.graphics.Path;
import android.util.Log;

/* renamed from: ln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ln {
    public char a;
    public final float[] b;

    public ln(char c, float[] fArr) {
        this.a = c;
        this.b = fArr;
    }

    private static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        boolean z3;
        float f8 = f;
        float f9 = f3;
        boolean z4 = z2;
        double radians = Math.toRadians((double) f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = (double) f8;
        double d4 = (double) f2;
        double d5 = radians;
        double d6 = (double) f5;
        Double.isNaN(d3);
        Double.isNaN(d4);
        Double.isNaN(d6);
        double d7 = ((d3 * cos) + (d4 * sin)) / d6;
        double d8 = d3;
        double d9 = (double) f6;
        double d10 = (double) (-f8);
        Double.isNaN(d10);
        Double.isNaN(d4);
        Double.isNaN(d9);
        double d11 = d4;
        double d12 = (double) f4;
        double d13 = ((d10 * sin) + (d4 * cos)) / d9;
        double d14 = (double) f9;
        Double.isNaN(d14);
        Double.isNaN(d12);
        Double.isNaN(d6);
        double d15 = ((d14 * cos) + (d12 * sin)) / d6;
        double d16 = (double) (-f9);
        Double.isNaN(d16);
        Double.isNaN(d12);
        Double.isNaN(d9);
        double d17 = ((d16 * sin) + (d12 * cos)) / d9;
        double d18 = d7 - d15;
        double d19 = d13 - d17;
        double d20 = (d7 + d15) / 2.0d;
        double d21 = (d13 + d17) / 2.0d;
        double d22 = sin;
        double d23 = (d18 * d18) + (d19 * d19);
        if (d23 != 0.0d) {
            double d24 = (1.0d / d23) - 16.0d;
            if (d24 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d23);
                float sqrt = (float) (Math.sqrt(d23) / 1.99999d);
                a(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d24);
            double d25 = d18 * sqrt2;
            double d26 = sqrt2 * d19;
            if (z != z4) {
                d2 = d20 + d26;
                d = d21 - d25;
            } else {
                d2 = d20 - d26;
                d = d21 + d25;
            }
            double atan2 = Math.atan2(d13 - d, d7 - d2);
            double atan22 = Math.atan2(d17 - d, d15 - d2) - atan2;
            int i = 0;
            if (atan22 < 0.0d) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z4 != z3) {
                atan22 += atan22 <= 0.0d ? 6.283185307179586d : -6.283185307179586d;
            }
            Double.isNaN(d6);
            double d27 = d2 * d6;
            Double.isNaN(d9);
            double d28 = d * d9;
            double d29 = (d27 * cos) - (d28 * d22);
            double d30 = (d27 * d22) + (d28 * cos);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(d5);
            double sin2 = Math.sin(d5);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            Double.isNaN(d6);
            double d31 = -d6;
            double d32 = d31 * cos2;
            Double.isNaN(d9);
            double d33 = d9 * sin2;
            double d34 = (d32 * sin3) - (d33 * cos3);
            double d35 = d31 * sin2;
            Double.isNaN(d9);
            double d36 = d9 * cos2;
            double d37 = (sin3 * d35) + (cos3 * d36);
            double d38 = atan2;
            double d39 = (double) ceil;
            Double.isNaN(d39);
            double d40 = atan22 / d39;
            double d41 = d38;
            while (i < ceil) {
                double d42 = d41 + d40;
                double sin4 = Math.sin(d42);
                double cos4 = Math.cos(d42);
                Double.isNaN(d6);
                double d43 = d40;
                double d44 = (d29 + ((d6 * cos2) * cos4)) - (d33 * sin4);
                Double.isNaN(d6);
                int i2 = ceil;
                double d45 = d30 + (d6 * sin2 * cos4) + (d36 * sin4);
                double d46 = (d32 * sin4) - (d33 * cos4);
                double d47 = (sin4 * d35) + (cos4 * d36);
                double d48 = d42 - d41;
                double tan = Math.tan(d48 / 2.0d);
                double sin5 = (Math.sin(d48) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 4.0d)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) (d8 + (d34 * sin5)), (float) (d11 + (d37 * sin5)), (float) (d44 - (sin5 * d46)), (float) (d45 - (sin5 * d47)), (float) d44, (float) d45);
                i++;
                d29 = d29;
                d35 = d35;
                d8 = d44;
                d11 = d45;
                d41 = d42;
                d37 = d47;
                d34 = d46;
                d6 = d6;
                ceil = i2;
                d40 = d43;
            }
            return;
        }
        Log.w("PathParser", " Points are coincident");
    }

    public ln(ln lnVar) {
        this.a = lnVar.a;
        float[] fArr = lnVar.b;
        this.b = lo.a(fArr, fArr.length);
    }

    public static void a(ln[] lnVarArr, Path path) {
        int i;
        int i2;
        int i3;
        float[] fArr;
        char c;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        ln[] lnVarArr2 = lnVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        char c2 = 'm';
        char c3 = 0;
        char c4 = 'm';
        int i4 = 0;
        while (i4 < lnVarArr2.length) {
            ln lnVar = lnVarArr2[i4];
            char c5 = lnVar.a;
            float[] fArr3 = lnVar.b;
            float f9 = fArr2[c3];
            float f10 = fArr2[1];
            float f11 = fArr2[2];
            float f12 = fArr2[3];
            float f13 = fArr2[4];
            float f14 = fArr2[5];
            switch (c5) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path2.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    break;
                default:
                    i = 2;
                    break;
            }
            i = 2;
            float f15 = f13;
            float f16 = f14;
            float f17 = f9;
            float f18 = f10;
            int i5 = 0;
            while (i5 < fArr3.length) {
                if (c5 == 'A') {
                    i2 = i5;
                    float f19 = f18;
                    float f20 = f17;
                    fArr = fArr3;
                    c = c5;
                    i3 = i4;
                    int i6 = i2 + 5;
                    float f21 = fArr[i6];
                    int i7 = i2 + 6;
                    float f22 = fArr[i7];
                    float f23 = fArr[i2];
                    float f24 = fArr[i2 + 1];
                    float f25 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fArr[i2 + 4] != 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    a(path, f20, f19, f21, f22, f23, f24, f25, z, z2);
                    f17 = fArr[i6];
                    f18 = fArr[i7];
                    f12 = f18;
                    f11 = f17;
                } else if (c5 == 'C') {
                    i2 = i5;
                    fArr = fArr3;
                    c = c5;
                    i3 = i4;
                    int i8 = i2 + 2;
                    int i9 = i2 + 3;
                    int i10 = i2 + 4;
                    int i11 = i2 + 5;
                    path.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i8], fArr[i9], fArr[i10], fArr[i11]);
                    f17 = fArr[i10];
                    f18 = fArr[i11];
                    f11 = fArr[i8];
                    f12 = fArr[i9];
                } else if (c5 == 'H') {
                    i2 = i5;
                    fArr = fArr3;
                    c = c5;
                    i3 = i4;
                    path2.lineTo(fArr[i2], f18);
                    f17 = fArr[i2];
                } else if (c5 == 'Q') {
                    i2 = i5;
                    fArr = fArr3;
                    c = c5;
                    i3 = i4;
                    int i12 = i2 + 1;
                    int i13 = i2 + 2;
                    int i14 = i2 + 3;
                    path2.quadTo(fArr[i2], fArr[i12], fArr[i13], fArr[i14]);
                    float f26 = fArr[i2];
                    float f27 = fArr[i12];
                    f17 = fArr[i13];
                    f18 = fArr[i14];
                    f11 = f26;
                    f12 = f27;
                } else if (c5 == 'V') {
                    i2 = i5;
                    fArr = fArr3;
                    c = c5;
                    i3 = i4;
                    path2.lineTo(f17, fArr[i2]);
                    f18 = fArr[i2];
                } else if (c5 == 'a') {
                    i2 = i5;
                    float f28 = f18;
                    float f29 = f17;
                    int i15 = i2 + 5;
                    float f30 = fArr3[i15] + f29;
                    int i16 = i2 + 6;
                    float f31 = fArr3[i16] + f28;
                    float f32 = fArr3[i2];
                    float f33 = fArr3[i2 + 1];
                    float f34 = fArr3[i2 + 2];
                    if (fArr3[i2 + 3] != 0.0f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (fArr3[i2 + 4] != 0.0f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    fArr = fArr3;
                    float f35 = f34;
                    c = c5;
                    i3 = i4;
                    a(path, f29, f28, f30, f31, f32, f33, f35, z3, z4);
                    f17 = f29 + fArr[i15];
                    f18 = f28 + fArr[i16];
                    f12 = f18;
                    f11 = f17;
                } else if (c5 == 'c') {
                    i2 = i5;
                    float f36 = f18;
                    float f37 = f17;
                    int i17 = i2 + 2;
                    int i18 = i2 + 3;
                    int i19 = i2 + 4;
                    int i20 = i2 + 5;
                    path.rCubicTo(fArr3[i2], fArr3[i2 + 1], fArr3[i17], fArr3[i18], fArr3[i19], fArr3[i20]);
                    float f38 = f37 + fArr3[i17];
                    float f39 = f36 + fArr3[i18];
                    f12 = f39;
                    f11 = f38;
                    fArr = fArr3;
                    c = c5;
                    i3 = i4;
                    f17 = f37 + fArr3[i19];
                    f18 = fArr3[i20] + f36;
                } else if (c5 == 'h') {
                    i2 = i5;
                    float f40 = f18;
                    path2.rLineTo(fArr3[i2], 0.0f);
                    f17 += fArr3[i2];
                    fArr = fArr3;
                    c = c5;
                    i3 = i4;
                } else if (c5 == 'q') {
                    i2 = i5;
                    float f41 = f18;
                    float f42 = f17;
                    int i21 = i2 + 1;
                    int i22 = i2 + 2;
                    int i23 = i2 + 3;
                    path2.rQuadTo(fArr3[i2], fArr3[i21], fArr3[i22], fArr3[i23]);
                    float f43 = f42 + fArr3[i2];
                    float f44 = f42 + fArr3[i22];
                    f12 = f41 + fArr3[i21];
                    f11 = f43;
                    fArr = fArr3;
                    c = c5;
                    i3 = i4;
                    f17 = f44;
                    f18 = fArr3[i23] + f41;
                } else if (c5 == 'v') {
                    i2 = i5;
                    float f45 = f17;
                    path2.rLineTo(0.0f, fArr3[i2]);
                    f18 += fArr3[i2];
                    fArr = fArr3;
                    c = c5;
                    i3 = i4;
                } else if (c5 == 'L') {
                    i2 = i5;
                    int i24 = i2 + 1;
                    path2.lineTo(fArr3[i2], fArr3[i24]);
                    f17 = fArr3[i2];
                    f18 = fArr3[i24];
                    fArr = fArr3;
                    c = c5;
                    i3 = i4;
                } else if (c5 == 'M') {
                    i2 = i5;
                    f17 = fArr3[i2];
                    f18 = fArr3[i2 + 1];
                    if (i2 > 0) {
                        path2.lineTo(f17, f18);
                        fArr = fArr3;
                        c = c5;
                        i3 = i4;
                    } else {
                        path2.moveTo(f17, f18);
                        f16 = f18;
                        f15 = f17;
                        fArr = fArr3;
                        c = c5;
                        i3 = i4;
                    }
                } else if (c5 == 'S') {
                    i2 = i5;
                    float f46 = f18;
                    float f47 = f17;
                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                        f = (f46 + f46) - f12;
                        f2 = (f47 + f47) - f11;
                    } else {
                        f2 = f47;
                        f = f46;
                    }
                    int i25 = i2 + 1;
                    int i26 = i2 + 2;
                    int i27 = i2 + 3;
                    path.cubicTo(f2, f, fArr3[i2], fArr3[i25], fArr3[i26], fArr3[i27]);
                    float f48 = fArr3[i2];
                    float f49 = fArr3[i25];
                    f17 = fArr3[i26];
                    f18 = fArr3[i27];
                    f12 = f49;
                    f11 = f48;
                    fArr = fArr3;
                    c = c5;
                    i3 = i4;
                } else if (c5 == 'T') {
                    i2 = i5;
                    float f50 = f18;
                    float f51 = f17;
                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                        f3 = (f51 + f51) - f11;
                        f4 = (f50 + f50) - f12;
                    } else {
                        f3 = f51;
                        f4 = f50;
                    }
                    int i28 = i2 + 1;
                    path2.quadTo(f3, f4, fArr3[i2], fArr3[i28]);
                    f12 = f4;
                    f11 = f3;
                    fArr = fArr3;
                    c = c5;
                    i3 = i4;
                    f17 = fArr3[i2];
                    f18 = fArr3[i28];
                } else if (c5 == 'l') {
                    i2 = i5;
                    int i29 = i2 + 1;
                    path2.rLineTo(fArr3[i2], fArr3[i29]);
                    f17 += fArr3[i2];
                    f18 += fArr3[i29];
                    fArr = fArr3;
                    c = c5;
                    i3 = i4;
                } else if (c5 == c2) {
                    i2 = i5;
                    float f52 = fArr3[i2];
                    f17 += f52;
                    float f53 = fArr3[i2 + 1];
                    f18 += f53;
                    if (i2 > 0) {
                        path2.rLineTo(f52, f53);
                        fArr = fArr3;
                        c = c5;
                        i3 = i4;
                    } else {
                        path2.rMoveTo(f52, f53);
                        f16 = f18;
                        f15 = f17;
                        fArr = fArr3;
                        c = c5;
                        i3 = i4;
                    }
                } else if (c5 == 's') {
                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                        f5 = f18 - f12;
                        f6 = f17 - f11;
                    } else {
                        f6 = 0.0f;
                        f5 = 0.0f;
                    }
                    int i30 = i5 + 1;
                    int i31 = i5 + 2;
                    int i32 = i5 + 3;
                    i2 = i5;
                    float f54 = f18;
                    float f55 = f17;
                    path.rCubicTo(f6, f5, fArr3[i5], fArr3[i30], fArr3[i31], fArr3[i32]);
                    float f56 = f55 + fArr3[i2];
                    float f57 = f54 + fArr3[i30];
                    f12 = f57;
                    f11 = f56;
                    fArr = fArr3;
                    c = c5;
                    i3 = i4;
                    f17 = f55 + fArr3[i31];
                    f18 = fArr3[i32] + f54;
                } else if (c5 != 't') {
                    i2 = i5;
                    fArr = fArr3;
                    c = c5;
                    i3 = i4;
                } else {
                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                        f7 = f17 - f11;
                        f8 = f18 - f12;
                    } else {
                        f8 = 0;
                        f7 = 0.0f;
                    }
                    int i33 = i5 + 1;
                    path2.rQuadTo(f7, f8, fArr3[i5], fArr3[i33]);
                    float f58 = f7 + f17;
                    float f59 = f8 + f18;
                    f17 += fArr3[i5];
                    f18 += fArr3[i33];
                    f12 = f59;
                    i2 = i5;
                    fArr = fArr3;
                    c = c5;
                    i3 = i4;
                    f11 = f58;
                }
                i5 = i2 + i;
                lnVarArr2 = lnVarArr;
                c4 = c;
                c5 = c4;
                fArr3 = fArr;
                i4 = i3;
                c2 = 'm';
                c3 = 0;
            }
            fArr2[c3] = f17;
            fArr2[1] = f18;
            fArr2[2] = f11;
            fArr2[3] = f12;
            fArr2[4] = f15;
            fArr2[5] = f16;
            c4 = lnVarArr2[i4].a;
            i4++;
        }
    }
}
