package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.SystemClock;

/* renamed from: aixl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aixl {
    public final ajbg a;
    public final aicn b;
    public ajbk c;
    private final SensorManager d;
    private final Sensor e;
    private final boolean f;
    private aixk g;

    public aixl(SensorManager sensorManager, ajbg ajbg, aicn aicn) {
        this.d = sensorManager;
        this.e = sensorManager.getDefaultSensor(22);
        this.a = ajbg;
        this.b = aicn;
        boolean z = false;
        if (axwx.a.a().wakeUpTiltDetectorEnabled() && this.e != null) {
            z = true;
        }
        this.f = z;
        StringBuilder sb = new StringBuilder(50);
        sb.append("HardwareWakeUpTiltDetector.isSupportedDevice=");
        sb.append(z);
        sb.toString();
    }

    public final void a() {
        if (this.c != null) {
            this.c = null;
            this.d.unregisterListener(this.g);
        }
    }

    public final boolean b() {
        return this.f;
    }

    public final void a(ajbk ajbk) {
        if (this.f) {
            ajbk ajbk2 = this.c;
            if (ajbk2 == null) {
                this.c = ajbk;
                aixk aixk = new aixk(this, SystemClock.elapsedRealtime());
                this.g = aixk;
                boolean registerListener = this.d.registerListener(aixk, this.e, 0);
            } else if (ajbk2 != ajbk) {
                throw new UnsupportedOperationException("Tilt detector already enabled");
            }
        } else {
            throw new UnsupportedOperationException("Tilt detector is not supported on this device");
        }
    }
}
