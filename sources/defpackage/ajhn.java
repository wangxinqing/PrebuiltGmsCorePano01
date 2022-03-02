package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.util.Iterator;

/* renamed from: ajhn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajhn {
    public static int d = -1;
    static long e = -1;
    static long f = -1;
    private static ajhn h;
    public final ajin a;
    public final ReportingConfig b;
    public boolean c = false;
    public int g = 0;
    private final SensorManager i;
    private final Sensor j;
    private final SensorEventListener k = new ajhm(this);

    private ajhn(SensorManager sensorManager, Sensor sensor, ajin ajin, ReportingConfig reportingConfig) {
        this.a = ajin;
        this.i = sensorManager;
        this.j = sensor;
        this.b = reportingConfig;
    }

    static synchronized ajhn a(Context context, jiq jiq, ajin ajin, ReportingConfig reportingConfig) {
        Sensor sensor;
        synchronized (ajhn.class) {
            if (h != null) {
                ajhn ajhn = h;
                return ajhn;
            } else if (!azsm.a.a().a()) {
                ajix.a("GCoreUlr", "Step counts collector feature is not enabled!");
                return null;
            } else {
                int i2 = Build.VERSION.SDK_INT;
                iva.a((Object) context);
                Context applicationContext = context.getApplicationContext();
                iva.a((Object) jiq);
                iva.a((Object) applicationContext);
                iva.a((Object) ajin);
                iva.a((Object) reportingConfig);
                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                if (sensorManager == null) {
                    ajix.c("GCoreUlr", "Can not find Sensor Manager system service on this device!");
                    return null;
                }
                Iterator<Sensor> it = sensorManager.getSensorList(19).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        sensor = null;
                        break;
                    }
                    sensor = it.next();
                    if (!sensor.isWakeUpSensor()) {
                        String valueOf = String.valueOf(sensor);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                        sb.append("Find non-wake up sensor: ");
                        sb.append(valueOf);
                        sb.toString();
                        break;
                    }
                    String valueOf2 = String.valueOf(sensor);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
                    sb2.append("Find wake up sensor: ");
                    sb2.append(valueOf2);
                    sb2.toString();
                }
                if (sensor == null) {
                    ajix.c("GCoreUlr", "Can not find non-wake up step counter on this device!");
                    return null;
                }
                ajhn ajhn2 = new ajhn(sensorManager, sensor, ajin, reportingConfig);
                return ajhn2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void b(android.content.Context r4, defpackage.jiq r5, defpackage.ajin r6, com.google.android.location.reporting.state.update.ReportingConfig r7) {
        /*
            java.lang.Class<ajhn> r0 = defpackage.ajhn.class
            monitor-enter(r0)
            ajhn r4 = a(r4, r5, r6, r7)     // Catch:{ all -> 0x0041 }
            h = r4     // Catch:{ all -> 0x0041 }
            if (r4 == 0) goto L_0x003f
            boolean r5 = r4.c     // Catch:{ all -> 0x0041 }
            if (r5 != 0) goto L_0x003f
            android.hardware.SensorManager r5 = r4.i     // Catch:{ all -> 0x0041 }
            android.hardware.SensorEventListener r6 = r4.k     // Catch:{ all -> 0x0041 }
            android.hardware.Sensor r7 = r4.j     // Catch:{ all -> 0x0041 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0041 }
            azsm r2 = defpackage.azsm.a     // Catch:{ all -> 0x0041 }
            azsn r2 = r2.a()     // Catch:{ all -> 0x0041 }
            long r2 = r2.c()     // Catch:{ all -> 0x0041 }
            long r1 = r1.toMicros(r2)     // Catch:{ all -> 0x0041 }
            int r2 = (int) r1     // Catch:{ all -> 0x0041 }
            boolean r5 = r5.registerListener(r6, r7, r2)     // Catch:{ all -> 0x0041 }
            if (r5 == 0) goto L_0x0038
            r5 = 1
            r4.c = r5     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = "GCoreUlr"
            java.lang.String r5 = "Step counter start successfully!"
            defpackage.ajix.a((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)
            return
        L_0x0038:
            java.lang.String r4 = "GCoreUlr"
            java.lang.String r5 = "Fail to start step counter!"
            defpackage.ajix.a((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r0)
            return
        L_0x0041:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajhn.b(android.content.Context, jiq, ajin, com.google.android.location.reporting.state.update.ReportingConfig):void");
    }

    public static synchronized void a() {
        synchronized (ajhn.class) {
            if (h != null && h.c) {
                ajhn ajhn = h;
                ajhn.i.unregisterListener(ajhn.k);
                h = null;
            }
        }
    }
}
