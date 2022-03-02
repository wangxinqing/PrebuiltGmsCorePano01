package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Handler;
import android.os.SystemClock;
import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: aigh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aigh extends nlb {
    public final SensorManager a;
    public final Sensor b;
    public final Handler c;
    public aqgi d;
    private final quo e = new quo();

    public aigh(SensorManager sensorManager, qup qup, Handler handler) {
        super("StepDetector", "location");
        this.a = sensorManager;
        this.b = sensorManager.getDefaultSensor(1);
        this.e.h = qup;
        this.c = handler;
    }

    public final void a(SensorEvent sensorEvent) {
        aqgi aqgi;
        Location a2;
        SensorEvent sensorEvent2 = sensorEvent;
        if (sensorEvent2.sensor.getType() == 1 && this.e != null && (aqgi = this.d) != null) {
            long j = sensorEvent2.timestamp;
            long j2 = aqgi.a;
            if (j2 == -1) {
                aqgi.a = j + 20000000;
            } else if (j >= j2) {
                aqgi.a = Math.max(j2 + 20000000, j);
            } else {
                return;
            }
            quo quo = this.e;
            long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
            float f = sensorEvent2.values[0];
            float f2 = sensorEvent2.values[1];
            float f3 = sensorEvent2.values[2];
            qur qur = quo.a;
            qur.a.a(f);
            qur.b.a(f2);
            qur.c.a(f3);
            qur.e = qur.d;
            qur.e[0] = qur.a.b() / ((float) qur.a.c);
            qur.e[1] = qur.b.b() / ((float) qur.b.c);
            qur.e[2] = qur.c.b() / ((float) qur.c.c);
            float f4 = 0.0f;
            for (float f5 : qur.e) {
                f4 += f5 * f5;
            }
            float sqrt = (float) Math.sqrt((double) f4);
            if (((double) sqrt) > 0.0d) {
                float[] fArr = qur.e;
                fArr[0] = fArr[0] / sqrt;
                fArr[1] = fArr[1] / sqrt;
                fArr[2] = fArr[2] / sqrt;
            }
            float[] fArr2 = quo.a.e;
            float[] fArr3 = quo.f;
            fArr3[0] = f;
            fArr3[1] = f2;
            fArr3[2] = f3;
            float abs = Math.abs((fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[1]) + (fArr2[2] * f3));
            qum qum = quo.b;
            int i = qum.c;
            float f6 = abs * abs;
            qum.a(f6);
            quo.c.a(abs);
            float a3 = quo.a(quo.c);
            float a4 = quo.a(quo.b, a3);
            if (a4 > 1.0f || i <= 37) {
                quo.d.a(f6);
                quo.e.a(abs);
                if (i <= 37) {
                    return;
                }
            }
            float a5 = quo.a(quo.e);
            float a6 = quo.a(quo.d, a5);
            qum qum2 = quo.c;
            int i2 = qum2.c;
            if (i2 > 37) {
                int i3 = qum2.b - 38;
                if (i3 < 0) {
                    i3 += qum2.a.length;
                }
                float f7 = qum2.a[i3];
                float min = Math.min(f7, 15.0f);
                qun qun = quo.g;
                if (qun == null) {
                    quo.g = new qun(nanos, min);
                } else {
                    qun.a += ((qun.c + min) / 2.0f) * ((float) Math.abs(nanos - qun.b));
                    qun.c = min;
                    qun.b = nanos;
                }
                if (f7 >= a3 && f7 - a3 > a4 && f7 - a5 > a6 * 0.6f && a4 > 0.7f) {
                    if (quo.i <= 0) {
                        quo.i = nanos;
                        qup qup = quo.h;
                        if (qup != null) {
                            aien aien = (aien) qup;
                            aiii aiii = aien.c;
                            float f8 = Float.MAX_VALUE;
                            if (aiii != null) {
                                aiii.a(aien.e.a);
                                float a7 = aien.c.a();
                                if (a7 != Float.MAX_VALUE) {
                                    f8 = a7;
                                }
                                aien.h.a(nanos, f8, f8);
                            } else {
                                AndroidInertialAnchor androidInertialAnchor = aien.d;
                                if (androidInertialAnchor != null) {
                                    androidInertialAnchor.a(aien.e.a);
                                    if (axxm.l() && axxm.n()) {
                                        aien.l.a(aien.e.a);
                                    }
                                    aien.h.a(nanos, Float.MAX_VALUE, 0.0f);
                                }
                            }
                            if (ayam.a.a().flpReportLocationOnStepUpdate() && !aien.g() && ((aien.e.a == null || aien.f < nanos) && (a2 = aien.a(System.currentTimeMillis() - (SystemClock.elapsedRealtime() - (nanos / 1000000)), nanos)) != null)) {
                                aien.c(Collections.singletonList(a2));
                            }
                        }
                    } else if (((double) (((Math.max(min, quo.k) * ((float) Math.abs(nanos - quo.j))) - quo.g.a) / 1.0E9f)) > 1.5d || Math.abs(nanos - quo.i) > 400000000) {
                        quo.i = 0;
                    }
                    quo.g.a = 0.0f;
                    quo.j = nanos;
                    quo.k = min;
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder(37);
            sb.append("Index 37 >= size ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }
}
