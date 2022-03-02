package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.os.WorkSource;
import java.util.concurrent.Executor;

/* renamed from: aixw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aixw extends aixv {
    private static boolean a = false;
    private boolean b;

    public final void a(AlarmManager alarmManager, long j, long j2, PendingIntent pendingIntent, aizx aizx) {
        aizx aizx2 = aizx;
        if (aizx2 instanceof ajrb) {
            WorkSource a2 = ((ajrb) aizx2).a();
            if (a2 == null) {
                try {
                    alarmManager.setWindow(2, j, j2, pendingIntent);
                    return;
                } catch (Exception e) {
                }
            } else {
                alarmManager.set(2, j, j2, 0, pendingIntent, a2);
                return;
            }
        }
        try {
            alarmManager.setWindow(2, j, j2, pendingIntent);
        } catch (SecurityException e2) {
        }
    }

    public final int b(SensorManager sensorManager, int i) {
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        if (defaultSensor != null) {
            return defaultSensor.getFifoMaxEventCount();
        }
        return 0;
    }

    public final int c(SensorManager sensorManager, int i) {
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        if (defaultSensor != null) {
            return defaultSensor.getFifoReservedEventCount();
        }
        return 0;
    }

    public final void a(AlarmManager alarmManager, long j, PendingIntent pendingIntent, aizx aizx) {
        aizx aizx2 = aizx;
        if (aizx2 instanceof ajrb) {
            WorkSource workSource = ((ajrc) aizx2).a;
            if (workSource != null) {
                try {
                    alarmManager.set(2, j, -1, 0, pendingIntent, workSource);
                    return;
                } catch (Exception e) {
                }
            } else {
                super.a(alarmManager, j, pendingIntent, aizx);
                return;
            }
        }
        try {
            super.a(alarmManager, j, pendingIntent, aizx);
        } catch (SecurityException e2) {
        }
    }

    public void a(Context context, aixt aixt, boolean z, aizx aizx, boolean z2, aicn aicn, Executor executor) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (aizx instanceof ajrb) {
            WorkSource workSource = ((ajrc) aizx).a;
            if (workSource == null) {
                try {
                    wifiManager.startScan();
                    return;
                } catch (Exception e) {
                }
            } else {
                wifiManager.startScan(workSource);
                return;
            }
        }
        try {
            wifiManager.startScan();
        } catch (NullPointerException e2) {
        }
    }

    public final void a(Context context, String str, LocationListener locationListener, Looper looper) {
        boolean z;
        if (!this.b) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (!a) {
                if (jni.b(context).a("android.permission.UPDATE_APP_OPS_STATS") == 0) {
                    z = true;
                } else {
                    z = false;
                }
                a = z;
            }
            if (a) {
                try {
                    LocationRequest createFromDeprecatedProvider = LocationRequest.createFromDeprecatedProvider(str, 0, 0.0f, false);
                    createFromDeprecatedProvider.setHideFromAppOps(true);
                    locationManager.requestLocationUpdates(createFromDeprecatedProvider, locationListener, looper);
                    return;
                } catch (Exception e) {
                }
            }
            try {
                locationManager.requestLocationUpdates(str, 0, 0.0f, locationListener);
            } catch (NullPointerException e2) {
                this.b = true;
                super.a(context, str, locationListener, looper);
            }
        } else {
            super.a(context, str, locationListener, looper);
        }
    }

    public final boolean a(SensorManager sensorManager, int i) {
        return b(sensorManager, i) > 0;
    }
}
