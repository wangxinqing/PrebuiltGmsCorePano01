package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: artz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class artz {
    public static final long d = TimeUnit.MILLISECONDS.toNanos(500);
    private static final Map p;
    public float a = Float.NaN;
    public float b = Float.NaN;
    public float c = Float.NaN;
    public final aruj e = new aruj();
    public final aruj f = new aruj();
    public final aruj g = new aruj();
    public float h = 45.0f;
    public long i = Long.MIN_VALUE;
    public long j = Long.MIN_VALUE;
    public long k = Long.MIN_VALUE;
    public long l = Long.MIN_VALUE;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public long o = Long.MIN_VALUE;
    private final Map q = p;
    private final Map r = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        p = hashMap;
        hashMap.put(0, Float.valueOf(0.074f));
        p.put(1, Float.valueOf(2.0075f));
        p.put(2, Float.valueOf(0.01f));
        p.put(3, Float.valueOf(-23.32f));
        p.put(4, Float.valueOf(0.24f));
        p.put(5, Float.valueOf(0.17f));
        p.put(6, Float.valueOf(44.13f));
    }

    public final float a(long j2) {
        Map map;
        float f2;
        float f3;
        double d2;
        int i2;
        int i3;
        if (this.e.b != 10 || this.f.b != 10 || this.g.b != 10 || Float.isNaN(this.a)) {
            return -1.0f;
        }
        this.r.clear();
        if (!Float.isNaN(this.a) && this.e.b == 10 && this.f.b == 10 && this.g.b == 10) {
            float f4 = this.h - this.a;
            if (f4 > 0.0f) {
                f4 += f4;
            }
            float abs = Math.abs(f4);
            this.r.put(0, Float.valueOf(abs));
            aruj aruj = this.g;
            int i4 = aruj.b;
            double d3 = 0.0d;
            if (i4 == 0) {
                f2 = 0.0f;
            } else {
                if (i4 != 0) {
                    double d4 = 0.0d;
                    int i5 = 0;
                    while (true) {
                        i3 = aruj.b;
                        if (i5 >= i3) {
                            break;
                        }
                        double d5 = (double) aruj.a[i5];
                        Double.isNaN(d5);
                        d4 += d5;
                        i5++;
                    }
                    double d6 = (double) i3;
                    Double.isNaN(d6);
                    d2 = d4 / d6;
                } else {
                    d2 = 0.0d;
                }
                double d7 = 0.0d;
                int i6 = 0;
                while (true) {
                    i2 = aruj.b;
                    if (i6 >= i2) {
                        break;
                    }
                    double d8 = (double) aruj.a[i6];
                    Double.isNaN(d8);
                    double d9 = d8 - d2;
                    d7 += d9 * d9;
                    i6++;
                }
                double d10 = (double) i2;
                Double.isNaN(d10);
                f2 = (float) Math.sqrt(d7 / d10);
            }
            this.r.put(1, Float.valueOf(f2));
            this.r.put(2, Float.valueOf(abs * f2));
            aruj aruj2 = this.e;
            aruj aruj3 = this.f;
            int i7 = aruj2.b;
            int i8 = aruj3.b;
            float f5 = Float.NaN;
            if (i7 == i8 && i7 >= 2) {
                if (i7 == i8) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < aruj2.b) {
                            if (aruj2.a(i9) != aruj3.a(i9)) {
                                break;
                            }
                            i9++;
                        } else {
                            f5 = 1.0f;
                            break;
                        }
                    }
                }
                int i10 = aruj2.b;
                float f6 = 0.0f;
                float f7 = 0.0f;
                float f8 = 0.0f;
                float f9 = 0.0f;
                float f10 = 0.0f;
                for (int i11 = 0; i11 < i10; i11++) {
                    f7 += aruj2.a(i11);
                    f10 += aruj2.a(i11) * aruj2.a(i11);
                    f8 += aruj3.a(i11);
                    f9 += aruj3.a(i11) * aruj3.a(i11);
                    f6 += aruj2.a(i11) * aruj3.a(i11);
                }
                float f11 = (float) i10;
                float f12 = (f6 * f11) - (f7 * f8);
                float f13 = (f9 * f11) - (f8 * f8);
                float f14 = (f11 * f10) - (f7 * f7);
                f5 = (f14 == 0.0f || f13 == 0.0f) ? 0.0f : f12 / ((float) Math.sqrt((double) (f14 * f13)));
            }
            aruj aruj4 = this.e;
            aruj aruj5 = this.f;
            if (aruj4.b == aruj5.b) {
                for (int i12 = 0; i12 < aruj4.b; i12++) {
                    d3 += Math.pow((double) aruf.a(aruj4.a(i12) - aruj5.a(i12)), 2.0d);
                }
                f3 = (float) Math.sqrt(d3);
            } else {
                f3 = 0.0f;
            }
            this.r.put(3, Float.valueOf(f5));
            this.r.put(4, Float.valueOf(f3));
            this.r.put(5, Float.valueOf((1.0f - f5) * f3));
            this.r.put(6, Float.valueOf(1.0f));
            map = this.r;
        } else {
            map = this.r;
        }
        long j3 = this.o;
        if (j3 != Long.MIN_VALUE && j2 - j3 < aruc.a) {
            Float f15 = (Float) map.get(1);
            Float f16 = (Float) map.get(0);
            if (f16 != null && f16.floatValue() < 10.0f && f15 != null && f15.floatValue() < 4.0f) {
                return 25.0f;
            }
        }
        float f17 = 0.0f;
        for (Integer num : map.keySet()) {
            if (this.q.containsKey(num)) {
                f17 += ((Float) this.q.get(num)).floatValue() * ((Float) map.get(num)).floatValue();
            }
        }
        return Math.min(Math.max(f17, 0.0f), 180.0f);
    }
}
