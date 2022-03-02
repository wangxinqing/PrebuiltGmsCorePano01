package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.GeomagneticField;
import android.hardware.SensorManager;
import android.location.Location;
import java.io.PrintWriter;

/* renamed from: aihu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aihu extends aiii {
    final aihs a;

    public aihu(Context context, aidg aidg, aihz aihz) {
        super(context);
        this.a = new aihs(context, (SensorManager) context.getSystemService("sensor"), aidg.c, aihz);
    }

    public final float a() {
        aihs aihs = this.a;
        if (!aihs.k) {
            return Float.MAX_VALUE;
        }
        return aihs.h;
    }

    public final boolean b() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (!this.f.isEmpty()) {
            aihs aihs = this.a;
            if (!aihs.b) {
                synchronized (aihs.j) {
                    aihs.i = aihs.g.isScreenOn();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    aihs.e.registerReceiver(aihs.f, intentFilter);
                    aihs.a = new arua();
                    aihs.a();
                    aihs.b = true;
                }
            }
            acwa f = this.g.f();
            if (f != null) {
                f.a((acvv) new aiht(this));
                return;
            }
            return;
        }
        aihs aihs2 = this.a;
        if (aihs2.b) {
            aihs2.e.unregisterReceiver(aihs2.f);
            aihs2.b();
            aihs2.b = false;
            aihs2.d = null;
            aihs2.c = 0.0f;
        }
        aihs2.c();
        aihs2.a = null;
    }

    public final void a(Location location) {
        aihs aihs = this.a;
        if (location != null) {
            Location location2 = aihs.d;
            if (location2 == null || location2.distanceTo(location) >= 100000.0f) {
                GeomagneticField geomagneticField = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), System.currentTimeMillis());
                aihs.c = aiik.b((float) Math.toRadians((double) geomagneticField.getDeclination()));
                arua arua = aihs.a;
                if (arua != null) {
                    float fieldStrength = geomagneticField.getFieldStrength() / 1000.0f;
                    arua.c.h = fieldStrength;
                    arua.j.b = fieldStrength;
                }
                aihs.d = location;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        printWriter.println("Active OrientationEngine Instance: DeviceOrientationDetectorOrientationEngine");
    }
}
