package defpackage;

import android.location.GnssMeasurementsEvent;
import android.location.GnssNavigationMessage;
import android.location.GpsStatus;
import android.location.Location;
import android.telephony.CellLocation;
import com.google.android.location.collectionlib.RealCollectorConfig;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ahur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahur implements ahuj {
    final HashMap a = new HashMap();
    HashMap b = null;
    private boolean c = false;
    private final ahss d;

    public ahur(ahss ahss) {
        this.d = ahss;
    }

    private static final float a(double d2) {
        if (d2 >= 3.4028234663852886E38d) {
            return Float.MAX_VALUE;
        }
        if ((-d2) < 3.4028234663852886E38d) {
            return (float) d2;
        }
        return -3.4028235E38f;
    }

    public final void a(float f, float f2, float f3, float f4) {
    }

    public final void a(float f, float f2, float f3, float f4, int i, long j, long j2) {
    }

    public final void a(int i, int i2) {
    }

    public final void a(int i, int i2, int i3) {
    }

    public final void a(int i, int i2, long j) {
    }

    public final void a(int i, long j) {
    }

    public final void a(int i, String str, CellLocation cellLocation, int i2, long j) {
    }

    public final void a(aizo aizo, int i, long j) {
    }

    public final void a(GnssMeasurementsEvent gnssMeasurementsEvent, long j) {
    }

    public final void a(GnssNavigationMessage gnssNavigationMessage, long j) {
    }

    public final void a(GpsStatus gpsStatus, long j) {
    }

    public final void a(Location location, long j) {
    }

    public final void a(List list, List list2, long j) {
    }

    public final void a(float[] fArr, long j, int i) {
    }

    public final void b(float f, float f2, float f3, int i, long j, long j2) {
        a(j, ahup.ACCELEROMETER, new float[]{f, f2, f3});
    }

    public final void c(float f, float f2, float f3, int i, long j, long j2) {
        a(j, ahup.MAGNETIC_FIELD, new float[]{f, f2, f3});
    }

    public final void d(float f, float f2, float f3, int i, long j, long j2) {
        a(j, ahup.GYROSCOPE, new float[]{f, f2, f3});
    }

    public final void d(float f, int i, long j, long j2) {
    }

    public final void e(float f, int i, long j, long j2) {
    }

    private final void a(long j, ahup ahup, float[] fArr) {
        if (!this.c) {
            ahuq ahuq = (ahuq) this.a.get(ahup);
            if (ahuq == null) {
                ahuq = new ahuq(new ArrayList(), new ArrayList());
                this.a.put(ahup, ahuq);
            }
            ahuq.a.add(Long.valueOf(j));
            ahuq.b.add(fArr);
        }
    }

    public final void b(float f, int i, long j, long j2) {
        a(j, ahup.LIGHT, new float[]{f});
    }

    public final void c(float f, int i, long j, long j2) {
        a(j, ahup.PROXIMITY, new float[]{f});
    }

    public final void a() {
        if (!this.c) {
            this.c = true;
            HashMap hashMap = this.b;
            if (hashMap != null && !hashMap.isEmpty()) {
                this.d.a((Map) this.b);
                return;
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : this.a.entrySet()) {
                int size = ((ahuq) entry.getValue()).a.size();
                int i = ((ahup) entry.getKey()).A;
                long[] jArr = new long[size];
                int[] iArr = new int[2];
                iArr[1] = size;
                iArr[0] = i;
                float[][] fArr = (float[][]) Array.newInstance(float.class, iArr);
                for (int i2 = 0; i2 < size; i2++) {
                    jArr[i2] = ((Long) ((ahuq) entry.getValue()).a.get(i2)).longValue();
                    for (int i3 = 0; i3 < i; i3++) {
                        fArr[i3][i2] = ((float[]) ((ahuq) entry.getValue()).b.get(i2))[i3];
                    }
                }
                hashMap2.put((ahup) entry.getKey(), new ahyq(jArr, fArr));
            }
            this.d.a((Map) hashMap2);
        }
    }

    public final void a(float f, float f2, float f3, float f4, float f5, float f6, int i, long j, long j2) {
        a(j, ahup.UNCAL_MAGNETIC_FIELD, new float[]{f, f2, f3, f4, f5, f6});
    }

    public final void a(float f, float f2, float f3, int i, long j, long j2) {
        a(j, ahup.ORIENTATION, new float[]{f, f2, f3});
    }

    public final void a(float f, int i, long j, long j2) {
        a(j, ahup.BAROMETER, new float[]{f});
    }

    public final void a(int i, long[] jArr, float[][] fArr) {
        boolean z;
        if (!this.c) {
            HashMap hashMap = this.b;
            if (hashMap == null) {
                hashMap = new HashMap();
                this.b = hashMap;
            }
            ahup ahup = (ahup) RealCollectorConfig.b.get(Integer.valueOf(i));
            if (ahup != null) {
                if (hashMap.get(ahup) == null) {
                    z = true;
                } else {
                    z = false;
                }
                amrl.b(z, "Sensor %s is reported more than once in batching collector.", (Object) ahup);
                hashMap.put(ahup, new ahyq(jArr, fArr));
            }
        }
    }

    public final void a(double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5, long j) {
        long j2 = j * 1000000;
        float[] fArr = new float[(dArr.length + dArr2.length + dArr3.length + dArr4.length + dArr5.length)];
        for (int i = 0; i < dArr.length; i++) {
            fArr[i] = a(dArr[i]);
        }
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            fArr[dArr.length + i2] = a(dArr2[i2]);
        }
        for (int i3 = 0; i3 < dArr3.length; i3++) {
            fArr[dArr.length + dArr2.length + i3] = a(dArr3[i3]);
        }
        for (int i4 = 0; i4 < dArr4.length; i4++) {
            fArr[dArr.length + dArr2.length + dArr3.length + i4] = a(dArr4[i4]);
        }
        for (int i5 = 0; i5 < dArr5.length; i5++) {
            fArr[dArr.length + dArr2.length + dArr3.length + dArr4.length + i5] = a(dArr5[i5]);
        }
        a(j2, ahup.SOUND, fArr);
    }
}
