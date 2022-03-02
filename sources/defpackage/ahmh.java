package defpackage;

import com.google.android.chimera.Service;
import com.google.android.gms.location.DetectedActivity;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.net.UrlRequest;

/* renamed from: ahmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahmh {
    static final float[] a = {0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f};
    public static final /* synthetic */ int b = 0;
    private static final float[] c = {0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.5f};
    private static final float[] d = {0.36592f, 0.0083652f, -0.088269f, 0.31573f, 0.67873f, 0.55648f, 0.4064f, 0.29001f, 0.081794f, 0.056677f, 0.032503f, 0.019009f, 0.49607f, 0.5427f, 0.38709f, 0.20032f, 0.072968f, 0.083739f, 0.056961f, 0.035255f, 0.022811f, 0.0489f, 0.035685f, 0.023737f, 0.014843f, 3.663f, 4.257f, 5.7366f, 12.575f, 0.97695f, 1.5652f, 2.5211f, 0.051406f, 4.6232f, 0.53133f, -2.3709f, -1.4972f, -0.76761f, -0.028139f, 0.39413f, 1.1236f, 1.9754f, 6.3464f};
    private static final float[] e = {0.2477f, 0.43512f, 0.54924f, 0.63361f, 0.21239f, 0.25206f, 0.28133f, 0.2768f, 0.019607f, 0.013281f, 0.0096622f, 0.011474f, 0.040815f, 0.1954f, 0.1983f, 0.14983f, 0.084914f, 0.020931f, 0.014333f, 0.008826f, 0.0069029f, 0.018713f, 0.013256f, 0.0097076f, 0.0074638f, 12.888f, 15.513f, 23.292f, 37.334f, 1.4572f, 2.2731f, 3.6728f, 0.053859f, 12.99f, 0.10446f, 3.6804f, 2.4326f, 1.388f, 0.4665f, 0.7232f, 1.9556f, 3.3468f, 21.592f};

    public static float a(ByteBuffer byteBuffer, int i, int i2, float[] fArr) {
        int i3 = i2 - 1;
        int i4 = i + 8;
        float f = (float) ((char) byteBuffer.getShort(i3 + i3 + i4));
        float f2 = 1.0f;
        for (int i5 = 0; i5 < fArr.length; i5++) {
            short s = byteBuffer.getShort(i5 + i5 + i4);
            float f3 = fArr[i5];
            f += ((float) ((char) s)) * f3;
            f2 += f3;
        }
        return (byteBuffer.getFloat(i + 4) * f) + (byteBuffer.getFloat(i) * f2);
    }

    public static void b(float[] fArr) {
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = Math.max(fArr[i], 0.0f);
        }
    }

    public static void c(float[] fArr) {
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = Math.max(f, fArr[i]);
        }
        float f2 = 0.0f;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            float exp = (float) Math.exp((double) (fArr[i2] - f));
            fArr[i2] = exp;
            f2 += exp;
        }
        for (int i3 = 0; i3 < fArr.length; i3++) {
            fArr[i3] = fArr[i3] / f2;
        }
    }

    public static int d(float[] fArr) {
        int i = -1;
        float f = 0.0f;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (Float.compare(fArr[i2], f) > 0) {
                f = fArr[i2];
                i = i2;
            }
        }
        return i;
    }

    public static void e(float[] fArr) {
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = (fArr[i] - d[i]) / e[i];
        }
    }

    public static float a(float[] fArr, float[] fArr2) {
        float f = fArr[fArr.length - 1];
        for (int i = 0; i < fArr2.length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static float a(short[] sArr, float f, float f2, float[] fArr) {
        float f3 = (float) ((char) sArr[sArr.length - 1]);
        float f4 = 1.0f;
        for (int i = 0; i < fArr.length; i++) {
            short s = sArr[i];
            float f5 = fArr[i];
            f3 += ((float) ((char) s)) * f5;
            f4 += f5;
        }
        return (f * f3) + (f2 * f4);
    }

    public static List a(List list) {
        int i;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ahmo ahmo = (ahmo) list.get(i2);
            ahmn ahmn = ahmn.IN_VEHICLE;
            switch (ahmo.a.ordinal()) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 7;
                    break;
                case 4:
                    i = 8;
                    break;
                case 5:
                    i = 3;
                    break;
                case 6:
                case 8:
                    i = 4;
                    break;
                case 11:
                    i = 16;
                    break;
                case 12:
                    i = 17;
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    i = 18;
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    i = 19;
                    break;
                case Service.START_CONTINUATION_MASK:
                    i = 20;
                    break;
                case 16:
                    i = 21;
                    break;
                default:
                    i = -1;
                    break;
            }
            if (i != -1) {
                arrayList.add(new DetectedActivity(i, ahmo.b));
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new IllegalArgumentException("Unsupported activities in results");
    }

    public static List a(float[] fArr) {
        int floor = (int) Math.floor((double) (fArr[0] * 100.0f));
        int floor2 = (int) Math.floor((double) (fArr[1] * 100.0f));
        int floor3 = (int) Math.floor((double) (fArr[2] * 100.0f));
        int floor4 = (int) Math.floor((double) (fArr[3] * 100.0f));
        int floor5 = (int) Math.floor((double) (fArr[4] * 100.0f));
        int floor6 = (int) Math.floor((double) (fArr[5] * 100.0f));
        int i = (((((100 - floor) - floor2) - floor3) - floor4) - floor5) - floor6;
        if (i > 0 && i < fArr.length) {
            int d2 = d(fArr);
            if (d2 == 0) {
                floor++;
            } else if (d2 == 1) {
                floor2++;
            } else if (d2 == 2) {
                floor3++;
            } else if (d2 == 3) {
                floor4++;
            } else if (d2 == 4) {
                floor5++;
            } else if (d2 == 5) {
                floor6++;
            }
            i--;
        }
        ArrayList arrayList = new ArrayList();
        a((List) arrayList, ahmn.ON_BICYCLE, floor);
        a((List) arrayList, ahmn.RUNNING, floor2);
        a((List) arrayList, ahmn.WALKING, floor3);
        a((List) arrayList, ahmn.ON_FOOT, Math.max(floor2, floor3));
        a((List) arrayList, ahmn.IN_ROAD_VEHICLE, floor4);
        a((List) arrayList, ahmn.IN_RAIL_VEHICLE, floor5);
        a((List) arrayList, ahmn.IN_VEHICLE, Math.max(floor4, floor5));
        a((List) arrayList, ahmn.STILL, floor6);
        a((List) arrayList, ahmn.INCONSISTENT, i);
        Collections.sort(arrayList, ahmg.a);
        return arrayList;
    }

    public static void a(int i, float[] fArr, float[] fArr2) {
        float[] fArr3;
        if (i == 0) {
            return;
        }
        if (i == 1 || i == 2) {
            int d2 = d(fArr);
            if (d2 < fArr.length - 1 && Float.compare(fArr[d2], fArr2[d2]) < 0) {
                if (i != 1) {
                    fArr3 = a;
                } else {
                    fArr3 = c;
                }
                System.arraycopy(fArr3, 0, fArr, 0, fArr3.length);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Unsupported mode: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void a(ByteBuffer byteBuffer, int[] iArr, int i, int i2, float[] fArr, float[] fArr2, float[] fArr3) {
        ByteBuffer byteBuffer2 = byteBuffer;
        float[] fArr4 = fArr;
        int i3 = iArr[0];
        int i4 = iArr[2];
        for (int i5 = i; i5 < i2; i5++) {
            int i6 = ((i4 + i4 + 8) * i5) + i3;
            int i7 = i4 - 1;
            int i8 = i6 + 8;
            float f = (float) ((char) byteBuffer.getShort(i7 + i7 + i8));
            float f2 = 1.0f;
            int i9 = 0;
            while (i9 < fArr4.length) {
                short s = byteBuffer.getShort(i9 + i9 + i8);
                float f3 = fArr4[i9];
                f += ((float) ((char) s)) * f3;
                f2 += f3;
                i9++;
            }
            while (i9 < i7) {
                short s2 = byteBuffer.getShort(i9 + i9 + i8);
                float f4 = fArr2[i9 - fArr4.length];
                f += ((float) ((char) s2)) * f4;
                f2 += f4;
                i9++;
            }
            fArr3[i5] = (byteBuffer.getFloat(i6 + 4) * f) + (byteBuffer.getFloat(i6) * f2);
        }
    }

    public static void a(List list, float f, float[] fArr) {
        int floor = (int) Math.floor((double) (fArr[1] * f * 100.0f));
        int floor2 = (int) Math.floor((double) (fArr[2] * f * 100.0f));
        int floor3 = (((int) Math.floor((double) (f * 100.0f))) - floor) - floor2;
        a(list, ahmn.IN_CAR, floor3);
        a(list, ahmn.IN_BUS, floor);
        a(list, ahmn.IN_FOUR_WHEELER_VEHICLE, floor3 + floor);
        a(list, ahmn.IN_TWO_WHEELER_VEHICLE, floor2);
        Collections.sort(list, ahmg.a);
    }

    private static void a(List list, ahmn ahmn, int i) {
        if (i > 0) {
            list.add(new ahmo(ahmn, i));
        }
    }

    public static void a(List list, float[] fArr) {
        double floor = Math.floor((double) (fArr[0] * 100.0f));
        double floor2 = Math.floor((double) (fArr[1] * 100.0f));
        a(list, ahmn.IN_FOUR_WHEELER_VEHICLE, (int) floor);
        a(list, ahmn.IN_TWO_WHEELER_VEHICLE, (int) floor2);
        Collections.sort(list, ahmg.a);
    }

    public static void a(float[] fArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = (float) (1.0d / (Math.exp((double) (-fArr[i2])) + 1.0d));
        }
    }

    public static void a(float[][] fArr, int i, int i2, float[] fArr2, float[] fArr3, float[] fArr4) {
        while (i < i2) {
            float[] fArr5 = fArr[i];
            float f = fArr5[fArr5.length - 1];
            int i3 = 0;
            while (i3 < fArr2.length) {
                f += fArr5[i3] * fArr2[i3];
                i3++;
            }
            while (i3 < fArr5.length - 1) {
                f += fArr5[i3] * fArr3[i3 - fArr2.length];
                i3++;
            }
            fArr4[i] = f;
            i++;
        }
    }

    public static void a(short[][] sArr, float[] fArr, float[] fArr2, int i, int i2, float[] fArr3, float[] fArr4, float[] fArr5) {
        while (i < i2) {
            short[] sArr2 = sArr[i];
            float f = fArr[i];
            float f2 = fArr2[i];
            float f3 = (float) ((char) sArr2[sArr2.length - 1]);
            float f4 = 1.0f;
            int i3 = 0;
            while (i3 < fArr3.length) {
                short s = sArr2[i3];
                float f5 = fArr3[i3];
                f3 += ((float) ((char) s)) * f5;
                f4 += f5;
                i3++;
            }
            while (i3 < sArr2.length - 1) {
                short s2 = sArr2[i3];
                float f6 = fArr4[i3 - fArr3.length];
                f3 += ((float) ((char) s2)) * f6;
                f4 += f6;
                i3++;
            }
            fArr5[i] = (f * f3) + (f2 * f4);
            i++;
        }
    }

    public static float[] a(ByteBuffer byteBuffer, int[] iArr, float[] fArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        float[] fArr2 = new float[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            fArr2[i4] = a(byteBuffer, ((i3 + i3 + 8) * i4) + i, i3, fArr);
        }
        return fArr2;
    }

    public static float[] a(float[][] fArr, float[] fArr2) {
        float[] fArr3 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr3[i] = a(fArr[i], fArr2);
        }
        return fArr3;
    }
}
