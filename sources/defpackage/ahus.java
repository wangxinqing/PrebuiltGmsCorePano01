package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;

/* renamed from: ahus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahus implements SensorEventListener {
    final /* synthetic */ ahut a;

    public ahus(ahut ahut) {
        this.a = ahut;
    }

    private final boolean a(ahup ahup) {
        int i;
        ahuu ahuu = this.a.a;
        if (ahuu == null || ahup != ahup.ACCELEROMETER || (i = ahuu.d) >= ahuu.a) {
            return false;
        }
        ahuu.d = i + 1;
        return true;
    }

    public final void a(int i, long j, long j2, int i2, float f, float f2, float f3, float f4, float f5, float f6, SensorEvent sensorEvent) {
        if (!this.a.i()) {
            ahup a2 = ahut.a(i);
            if (!a(a2)) {
                ahsr ahsr = this.a.h;
                if (i == 14) {
                    ahsr.a.a(f, f2, f3, f4, f5, f6, i2, j, j2);
                }
            }
            this.a.a(a2, j2, sensorEvent);
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        long j;
        SensorEvent sensorEvent2 = sensorEvent;
        this.a.j.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int type = sensorEvent2.sensor.getType();
        ahup a2 = ahut.a(type);
        long j2 = sensorEvent2.timestamp;
        if (a2.B == 2) {
            j = 1000000 * elapsedRealtime;
        } else {
            j = j2;
        }
        int i = a2.A;
        float[] fArr = sensorEvent2.values;
        if (i == 1) {
            a(type, j, elapsedRealtime, sensorEvent2.accuracy, fArr[0], sensorEvent);
        } else if (i == 3) {
            a(type, j, elapsedRealtime, sensorEvent2.accuracy, fArr[0], fArr[1], fArr[2], sensorEvent);
        } else if (i == 4) {
            int i2 = sensorEvent2.accuracy;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            if (!this.a.i()) {
                ahup a3 = ahut.a(type);
                if (!a(a3)) {
                    ahsr ahsr = this.a.h;
                    if (type == 65541) {
                        ahsr.a.a(f, f2, f3, f4, i2, j, elapsedRealtime);
                    }
                }
                this.a.a(a3, elapsedRealtime, sensorEvent2);
            }
        } else if (i == 6) {
            a(type, j, elapsedRealtime, sensorEvent2.accuracy, fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], sensorEvent);
        } else {
            String valueOf = String.valueOf(a2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
            sb.append("Unknown sensor data dimension: ");
            sb.append(i);
            sb.append(", scannerType: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void a(int i, long j, long j2, int i2, float f, float f2, float f3, SensorEvent sensorEvent) {
        int i3 = i;
        if (!this.a.i()) {
            ahup a2 = ahut.a(i);
            if (!a(a2)) {
                ahsr ahsr = this.a.h;
                if (i3 == 3) {
                    ahsr.a.a(f, f2, f3, i2, j, j2);
                } else if (i3 == 1) {
                    ahsr.a.b(f, f2, f3, i2, j, j2);
                } else if (i3 == 2) {
                    ahsr.a.c(f, f2, f3, i2, j, j2);
                } else if (i3 == 4) {
                    ahsr.a.d(f, f2, f3, i2, j, j2);
                }
            }
            this.a.a(a2, j2, sensorEvent);
        }
    }

    public final void a(int i, long j, long j2, int i2, float f, SensorEvent sensorEvent) {
        int i3 = i;
        if (!this.a.i()) {
            ahup a2 = ahut.a(i);
            if (!a(a2)) {
                ahsr ahsr = this.a.h;
                if (i3 == 6) {
                    ahsr.a.a(f, i2, j, j2);
                } else if (i3 == 5) {
                    ahsr.a.b(f, i2, j, j2);
                } else if (i3 == 8) {
                    ahsr.a.c(f, i2, j, j2);
                } else if (i3 == 21) {
                    ahsr.a.d(f, i2, j, j2);
                } else if (i3 == 19) {
                    ahsr.a.e(f, i2, j, j2);
                }
            }
            this.a.a(a2, j2, sensorEvent);
        }
    }
}
