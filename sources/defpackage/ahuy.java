package defpackage;

import android.hardware.SensorEvent;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: ahuy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahuy extends ahrh {
    private final ahuu d;
    private long e = 0;
    private final long[] f = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    private final double[] g = new double[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    private final double[] h = new double[3];
    private int i = 0;

    public ahuy(ahuo ahuo, ahsr ahsr, ahuu ahuu) {
        super(ahuo, ahsr);
        this.d = ahuu;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void a(ahup ahup, long j, SensorEvent sensorEvent) {
        double d2;
        int i2;
        long j2 = j;
        SensorEvent sensorEvent2 = sensorEvent;
        if (sensorEvent2 != null && sensorEvent2.sensor.getType() == 1) {
            double d3 = 0.0d;
            double d4 = 0.0d;
            for (int i3 = 0; i3 < 3; i3++) {
                double[] dArr = this.h;
                double d5 = (double) sensorEvent2.values[i3];
                Double.isNaN(d5);
                dArr[i3] = (dArr[i3] * 0.9d) + (d5 * 0.09999999999999998d);
                double d6 = (double) sensorEvent2.values[i3];
                double d7 = this.h[i3];
                Double.isNaN(d6);
                double d8 = d6 - d7;
                d4 += d8 * d8;
            }
            double sqrt = Math.sqrt(d4);
            long[] jArr = this.f;
            int i4 = this.i;
            jArr[i4] = j2;
            double[] dArr2 = this.g;
            int i5 = i4 + 1;
            this.i = i5;
            dArr2[i4] = sqrt;
            if (i5 >= 256 || (i5 != 0 && j2 - jArr[0] > 300)) {
                if (i5 != 0) {
                    double d9 = 0.0d;
                    int i6 = 0;
                    while (true) {
                        i2 = this.i;
                        if (i6 >= i2) {
                            break;
                        }
                        double d10 = this.g[i6];
                        d9 += d10;
                        d3 += d10 * d10;
                        i6++;
                    }
                    double d11 = (double) i2;
                    Double.isNaN(d11);
                    Double.isNaN(d11);
                    d2 = (d3 - (d9 * (d9 / d11))) / d11;
                } else {
                    d2 = Double.NaN;
                }
                if (d2 > 0.05d) {
                    this.e = j2;
                }
                long j3 = this.e;
                if (j3 != 0 && j2 - j3 > this.d.e) {
                    this.c.postAtFrontOfQueue(this.a);
                }
                this.i = 0;
            }
        }
    }
}
