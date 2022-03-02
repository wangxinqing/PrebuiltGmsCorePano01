package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.List;

/* renamed from: upf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class upf {
    private static boolean a;
    private static upf b;

    private upf() {
    }

    public static String a(Context context) {
        return e(context).getString("original_device_name", (String) null);
    }

    public static List b(Context context) {
        return Arrays.asList(e(context).getString("modified_device_name", "").split(","));
    }

    private static SharedPreferences e(Context context) {
        return context.getSharedPreferences("nearbymediums:bluetoothclassic", 0);
    }

    public final synchronized void c(Context context) {
        if (!b(context).isEmpty()) {
            new jfx(9, new upd(this, context)).start();
        }
    }

    public final synchronized void d(Context context) {
        if (!a) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                a(context, defaultAdapter);
            } else {
                throw new IllegalStateException(String.format("BluetoothAdapter not ready yet!", new Object[0]));
            }
        }
    }

    public static synchronized upf a() {
        upf upf;
        synchronized (upf.class) {
            if (b == null) {
                b = new upf();
            }
            upf = b;
        }
        return upf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Context r6, android.bluetooth.BluetoothAdapter r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            a = r0     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = "upf"
            java.lang.String r1 = "a"
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.util.List r3 = b(r6)     // Catch:{ all -> 0x0069 }
            java.lang.String r4 = r7.getName()     // Catch:{ all -> 0x0069 }
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x0069 }
            if (r3 != 0) goto L_0x002f
            jjg r6 = defpackage.ulh.a     // Catch:{ all -> 0x0069 }
            anie r6 = r6.d()     // Catch:{ all -> 0x0069 }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x0069 }
            r7 = 151(0x97, float:2.12E-43)
            anie r6 = r6.a((java.lang.String) r0, (java.lang.String) r1, (int) r7, (java.lang.String) r2)     // Catch:{ all -> 0x0069 }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x0069 }
            java.lang.String r7 = "BluetoothAdapter's name was not set by Nearby Connections, ignoring call to restore device name"
            r6.a((java.lang.String) r7)     // Catch:{ all -> 0x0069 }
            monitor-exit(r5)
            return
        L_0x002f:
            java.lang.String r6 = a(r6)     // Catch:{ all -> 0x0069 }
            if (r6 == 0) goto L_0x0067
            boolean r7 = r7.setName(r6)     // Catch:{ all -> 0x0069 }
            if (r7 == 0) goto L_0x0052
            jjg r7 = defpackage.ulh.a     // Catch:{ all -> 0x0069 }
            anie r7 = r7.d()     // Catch:{ all -> 0x0069 }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x0069 }
            r3 = 160(0xa0, float:2.24E-43)
            anie r7 = r7.a((java.lang.String) r0, (java.lang.String) r1, (int) r3, (java.lang.String) r2)     // Catch:{ all -> 0x0069 }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = "Restored bluetooth device name to persisted original device name: %s "
            r7.a((java.lang.String) r0, (java.lang.Object) r6)     // Catch:{ all -> 0x0069 }
            monitor-exit(r5)
            return
        L_0x0052:
            jjg r7 = defpackage.ulh.a     // Catch:{ all -> 0x0069 }
            anie r7 = r7.c()     // Catch:{ all -> 0x0069 }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x0069 }
            r3 = 164(0xa4, float:2.3E-43)
            anie r7 = r7.a((java.lang.String) r0, (java.lang.String) r1, (int) r3, (java.lang.String) r2)     // Catch:{ all -> 0x0069 }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = "Failed to restore original Bluetooth device name to %s"
            r7.a((java.lang.String) r0, (java.lang.Object) r6)     // Catch:{ all -> 0x0069 }
        L_0x0067:
            monitor-exit(r5)
            return
        L_0x0069:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upf.a(android.content.Context, android.bluetooth.BluetoothAdapter):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(android.content.Context r7, android.bluetooth.BluetoothAdapter r8, java.lang.String r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            a = r0     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = r8.getName()     // Catch:{ all -> 0x0075 }
            java.util.List r2 = b(r7)     // Catch:{ all -> 0x0075 }
            boolean r2 = r2.contains(r1)     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0031
            jjg r1 = defpackage.ulh.a     // Catch:{ all -> 0x0075 }
            anie r1 = r1.c()     // Catch:{ all -> 0x0075 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = "upf"
            java.lang.String r3 = "a"
            r4 = 98
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r1 = r1.a((java.lang.String) r2, (java.lang.String) r3, (int) r4, (java.lang.String) r5)     // Catch:{ all -> 0x0075 }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = "Detected a failure to restore the original Bluetooth device name"
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = a(r7)     // Catch:{ all -> 0x0075 }
        L_0x0031:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0075 }
            java.util.List r3 = b(r7)     // Catch:{ all -> 0x0075 }
            r2.<init>(r3)     // Catch:{ all -> 0x0075 }
        L_0x003a:
            int r3 = r2.size()     // Catch:{ all -> 0x0075 }
            r4 = 5
            if (r3 < r4) goto L_0x0045
            r2.remove(r0)     // Catch:{ all -> 0x0075 }
            goto L_0x003a
        L_0x0045:
            r2.add(r9)     // Catch:{ all -> 0x0075 }
            android.content.SharedPreferences r7 = e(r7)     // Catch:{ all -> 0x0075 }
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = "original_device_name"
            android.content.SharedPreferences$Editor r7 = r7.putString(r3, r1)     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = "modified_device_name"
            java.lang.String r3 = ","
            java.lang.String r2 = android.text.TextUtils.join(r3, r2)     // Catch:{ all -> 0x0075 }
            android.content.SharedPreferences$Editor r7 = r7.putString(r1, r2)     // Catch:{ all -> 0x0075 }
            boolean r7 = r7.commit()     // Catch:{ all -> 0x0075 }
            if (r7 == 0) goto L_0x0073
            boolean r7 = r8.setName(r9)     // Catch:{ all -> 0x0075 }
            if (r7 == 0) goto L_0x0073
            r7 = 1
            a = r7     // Catch:{ all -> 0x0075 }
            monitor-exit(r6)
            return r7
        L_0x0073:
            monitor-exit(r6)
            return r0
        L_0x0075:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0079
        L_0x0078:
            throw r7
        L_0x0079:
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upf.a(android.content.Context, android.bluetooth.BluetoothAdapter, java.lang.String):boolean");
    }
}
