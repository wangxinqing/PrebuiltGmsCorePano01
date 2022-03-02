package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: nlb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class nlb implements SensorEventListener {
    private final nkc a;

    public nlb(String str, String str2) {
        this.a = axda.a.a().o() ? new nkc(new njy((Class) getClass(), 17, str, str2)) : null;
    }

    public abstract void a(SensorEvent sensorEvent);

    public final void onAccuracyChanged(Sensor sensor, int i) {
        amky a2;
        nkc nkc = this.a;
        if (nkc != null && (a2 = nkc.a()) != null) {
            a2.close();
        }
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        nkc nkc = this.a;
        if (nkc != null) {
            amky a2 = nkc.a();
            try {
                a(sensorEvent);
                if (a2 != null) {
                    a2.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            a(sensorEvent);
            return;
        }
        throw th;
    }
}
