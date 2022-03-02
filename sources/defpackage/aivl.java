package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.net.wifi.WifiManager;

/* renamed from: aivl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aivl extends BroadcastReceiver {
    final ajcl a;
    final /* synthetic */ aivu b;
    private final WifiManager c = ((WifiManager) this.b.a.getApplicationContext().getSystemService("wifi"));

    public aivl(aivu aivu, ajcl ajcl) {
        this.b = aivu;
        this.a = ajcl;
    }

    private final void a(Intent intent, int i) {
        aizo a2;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (bluetoothDevice != null && (a2 = aiyk.g.a(bluetoothDevice)) != null) {
            String valueOf = String.valueOf(a2.a());
            if (valueOf.length() == 0) {
                new String("BluetoothDevice event received from ");
            } else {
                "BluetoothDevice event received from ".concat(valueOf);
            }
            aicn aicn = this.b.b;
            String valueOf2 = String.valueOf(a2.c());
            String str = "";
            StringBuilder sb = new StringBuilder((valueOf2.length() == 0 ? new String(str) : str.concat(valueOf2)).replace(":", str).replace("-", str));
            if (i == 1) {
                String a3 = a2.a();
                String b2 = a2.b();
                String[] strArr = new String[2];
                if (a3 == null) {
                    a3 = str;
                }
                strArr[0] = a3;
                if (b2 != null) {
                    str = b2;
                }
                strArr[1] = str;
                for (int i2 = 0; i2 < 2; i2++) {
                    String str2 = strArr[i2];
                    sb.append("\u0000");
                    sb.append(str2, 0, Math.min(str2.length(), 20));
                    if (str2.length() > 20) {
                        sb.append("+");
                        sb.append(str2.length() - 20);
                    }
                }
            }
            aicn.a((aicl) new aith(aico.BLUETOOTH_DEVICE_EVENT, aicn.b(), sb.toString(), i, a2.e(), i, a2));
            this.a.a(a2, i);
        }
    }

    /* JADX WARNING: type inference failed for: r2v61, types: [com.google.android.gms.common.internal.safeparcel.SafeParcelable] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0385, code lost:
        if (r2 == 1) goto L_0x0387;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r23, android.content.Intent r24) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.String r4 = r24.getAction()
            if (r4 == 0) goto L_0x04d8
            aivu r5 = r1.b
            aixc r5 = r5.f
            aixh r5 = r5.k
            ajbe r6 = defpackage.ajbe.CALLBACK_RUNNER
            r7 = 60000(0xea60, double:2.9644E-319)
            r9 = 0
            r5.b(r6, r7, r9)
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x04c9 }
            r6 = 23
            if (r5 >= r6) goto L_0x0022
            goto L_0x0031
        L_0x0022:
            java.lang.String r5 = "android.app.action.NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED"
            boolean r5 = r5.equals(r4)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0031
            ajcl r2 = r1.a     // Catch:{ Exception -> 0x04c9 }
            r2.g()     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0031:
            int r5 = r4.hashCode()     // Catch:{ Exception -> 0x04c9 }
            r10 = 28
            r15 = 4
            r13 = 3
            r8 = 2
            r12 = 0
            r14 = 1
            r11 = -1
            switch(r5) {
                case -2128145023: goto L_0x01bf;
                case -2115714282: goto L_0x01b4;
                case -1932583755: goto L_0x01a9;
                case -1886648615: goto L_0x019e;
                case -1875733435: goto L_0x0193;
                case -1530327060: goto L_0x0188;
                case -1492944353: goto L_0x017e;
                case -1454123155: goto L_0x0174;
                case -1447825418: goto L_0x016a;
                case -1239299127: goto L_0x015f;
                case -1172645946: goto L_0x0153;
                case -1076576821: goto L_0x0147;
                case -840265874: goto L_0x013b;
                case -544318258: goto L_0x012f;
                case -511271086: goto L_0x0123;
                case -408368299: goto L_0x0117;
                case -301431627: goto L_0x010c;
                case -153800628: goto L_0x0100;
                case 61159861: goto L_0x00f4;
                case 391194280: goto L_0x00e8;
                case 407474387: goto L_0x00dc;
                case 576984862: goto L_0x00d0;
                case 665559796: goto L_0x00c5;
                case 823795052: goto L_0x00ba;
                case 870701415: goto L_0x00ae;
                case 1019184907: goto L_0x00a2;
                case 1064040788: goto L_0x0096;
                case 1161967544: goto L_0x008a;
                case 1170068450: goto L_0x007e;
                case 1197370151: goto L_0x0072;
                case 1369399522: goto L_0x0066;
                case 1779291251: goto L_0x005a;
                case 1821585647: goto L_0x004f;
                case 1878357501: goto L_0x0043;
                default: goto L_0x0040;
            }     // Catch:{ Exception -> 0x04c9 }
        L_0x0040:
            r5 = -1
            goto L_0x01c8
        L_0x0043:
            java.lang.String r5 = "android.net.wifi.SCAN_RESULTS"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 19
            goto L_0x01c8
        L_0x004f:
            java.lang.String r5 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 3
            goto L_0x01c8
        L_0x005a:
            java.lang.String r5 = "android.os.action.POWER_SAVE_MODE_CHANGED"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 26
            goto L_0x01c8
        L_0x0066:
            java.lang.String r5 = "android.net.wifi.rtt.action.WIFI_RTT_STATE_CHANGED"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 21
            goto L_0x01c8
        L_0x0072:
            java.lang.String r5 = "com.google.android.location.ALARM_WAKEUP_IN_OUT_DOOR_COLLECTOR"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 15
            goto L_0x01c8
        L_0x007e:
            java.lang.String r5 = "com.google.android.apps.gmm.NAVIGATION_STATE"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 29
            goto L_0x01c8
        L_0x008a:
            java.lang.String r5 = "com.google.android.location.ALARM_WAKEUP_CALIBRATION_COLLECTOR"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 11
            goto L_0x01c8
        L_0x0096:
            java.lang.String r5 = "com.google.android.location.ALARM_WAKEUP_VEHICLE_EXIT_DETECTOR"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 17
            goto L_0x01c8
        L_0x00a2:
            java.lang.String r5 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 23
            goto L_0x01c8
        L_0x00ae:
            java.lang.String r5 = "android.os.action.DEVICE_IDLE_MODE_CHANGED"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 27
            goto L_0x01c8
        L_0x00ba:
            java.lang.String r5 = "android.intent.action.USER_PRESENT"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 5
            goto L_0x01c8
        L_0x00c5:
            java.lang.String r5 = "com.google.android.location.ALARM_WAKEUP_ACTIVE_COLLECTOR"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 7
            goto L_0x01c8
        L_0x00d0:
            java.lang.String r5 = "com.google.android.location.internal.intent.action.NLP_TESTING"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 28
            goto L_0x01c8
        L_0x00dc:
            java.lang.String r5 = "com.google.android.location.ALARM_WAKEUP_SENSOR_UPLOADER"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 13
            goto L_0x01c8
        L_0x00e8:
            java.lang.String r5 = "com.google.android.location.ALARM_WAKEUP_SENSOR_COLLECTOR"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 12
            goto L_0x01c8
        L_0x00f4:
            java.lang.String r5 = "com.google.android.location.ALARM_WAKEUP_ACTIVITY_DETECTION"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 14
            goto L_0x01c8
        L_0x0100:
            java.lang.String r5 = "com.google.android.location.ALARM_WAKEUP_CACHE_UPDATER"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 10
            goto L_0x01c8
        L_0x010c:
            java.lang.String r5 = "android.bluetooth.device.action.ACL_CONNECTED"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 2
            goto L_0x01c8
        L_0x0117:
            java.lang.String r5 = "android.app.action.NEXT_ALARM_CLOCK_CHANGED"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 33
            goto L_0x01c8
        L_0x0123:
            java.lang.String r5 = "android.location.MODE_CHANGED"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 32
            goto L_0x01c8
        L_0x012f:
            java.lang.String r5 = "com.google.android.gms.phenotype.COMMITTED"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 31
            goto L_0x01c8
        L_0x013b:
            java.lang.String r5 = "com.google.android.location.ALARM_WAKEUP_BURST_COLLECTOR"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 8
            goto L_0x01c8
        L_0x0147:
            java.lang.String r5 = "android.intent.action.AIRPLANE_MODE"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 22
            goto L_0x01c8
        L_0x0153:
            java.lang.String r5 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 25
            goto L_0x01c8
        L_0x015f:
            java.lang.String r5 = "com.google.android.gms.location.reporting.SETTINGS_CHANGED"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 18
            goto L_0x01c8
        L_0x016a:
            java.lang.String r5 = "com.google.android.location.ALARM_WAKEUP_LOCATOR"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 6
            goto L_0x01c8
        L_0x0174:
            java.lang.String r5 = "android.intent.action.SCREEN_ON"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 1
            goto L_0x01c8
        L_0x017e:
            java.lang.String r5 = "android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 4
            goto L_0x01c8
        L_0x0188:
            java.lang.String r5 = "android.bluetooth.adapter.action.STATE_CHANGED"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 30
            goto L_0x01c8
        L_0x0193:
            java.lang.String r5 = "android.net.wifi.WIFI_STATE_CHANGED"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 20
            goto L_0x01c8
        L_0x019e:
            java.lang.String r5 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 24
            goto L_0x01c8
        L_0x01a9:
            java.lang.String r5 = "com.google.android.location.ALARM_WAKEUP_PASSIVE_COLLECTOR"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 9
            goto L_0x01c8
        L_0x01b4:
            java.lang.String r5 = "com.google.android.location.ALARM_WAKEUP_BURST_COLLECTION_TRIGGER"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 16
            goto L_0x01c8
        L_0x01bf:
            java.lang.String r5 = "android.intent.action.SCREEN_OFF"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x04c9 }
            if (r5 == 0) goto L_0x0040
            r5 = 0
        L_0x01c8:
            java.lang.String r7 = "power"
            switch(r5) {
                case 0: goto L_0x0480;
                case 1: goto L_0x0473;
                case 2: goto L_0x046e;
                case 3: goto L_0x0469;
                case 4: goto L_0x0464;
                case 5: goto L_0x044c;
                case 6: goto L_0x0445;
                case 7: goto L_0x043e;
                case 8: goto L_0x0437;
                case 9: goto L_0x0430;
                case 10: goto L_0x0429;
                case 11: goto L_0x0421;
                case 12: goto L_0x0419;
                case 13: goto L_0x0411;
                case 14: goto L_0x0408;
                case 15: goto L_0x03ff;
                case 16: goto L_0x03f6;
                case 17: goto L_0x03ed;
                case 18: goto L_0x03e2;
                case 19: goto L_0x0390;
                case 20: goto L_0x037c;
                case 21: goto L_0x0371;
                case 22: goto L_0x035f;
                case 23: goto L_0x0350;
                case 24: goto L_0x0350;
                case 25: goto L_0x033d;
                case 26: goto L_0x0322;
                case 27: goto L_0x0307;
                case 28: goto L_0x02db;
                case 29: goto L_0x0230;
                case 30: goto L_0x0223;
                case 31: goto L_0x020e;
                case 32: goto L_0x01f5;
                case 33: goto L_0x01d1;
                default: goto L_0x01cd;
            }
        L_0x01cd:
            aiyk r2 = defpackage.aiyk.g     // Catch:{ Exception -> 0x04c9 }
            goto L_0x048d
        L_0x01d1:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x04c9 }
            if (r3 < r6) goto L_0x04ba
            android.content.Context r3 = r2.a     // Catch:{ Exception -> 0x04c9 }
            java.lang.String r4 = "alarm"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x04c9 }
            android.app.AlarmManager r3 = (android.app.AlarmManager) r3     // Catch:{ Exception -> 0x04c9 }
            android.app.AlarmManager$AlarmClockInfo r3 = r3.getNextAlarmClock()     // Catch:{ Exception -> 0x04c9 }
            if (r3 == 0) goto L_0x01ec
            long r3 = r3.getTriggerTime()     // Catch:{ Exception -> 0x04c9 }
            goto L_0x01ee
        L_0x01ec:
            r3 = 0
        L_0x01ee:
            ajcm r2 = r2.l     // Catch:{ Exception -> 0x04c9 }
            r2.a((long) r3)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x01f5:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x04c9 }
            if (r3 < r10) goto L_0x04ba
            java.lang.String r3 = "location"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ Exception -> 0x04c9 }
            android.location.LocationManager r2 = (android.location.LocationManager) r2     // Catch:{ Exception -> 0x04c9 }
            if (r2 == 0) goto L_0x04ba
            ajcl r3 = r1.a     // Catch:{ Exception -> 0x04c9 }
            boolean r2 = r2.isLocationEnabled()     // Catch:{ Exception -> 0x04c9 }
            r3.d(r2)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x020e:
            java.lang.String r2 = "com.google.android.location"
            java.lang.String r4 = "com.google.android.gms.phenotype.PACKAGE_NAME"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x04c9 }
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x04c9 }
            if (r2 == 0) goto L_0x04ba
            ajcl r2 = r1.a     // Catch:{ Exception -> 0x04c9 }
            r2.h()     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0223:
            ajcl r2 = r1.a     // Catch:{ Exception -> 0x04c9 }
            java.lang.String r4 = "android.bluetooth.adapter.extra.STATE"
            int r3 = r3.getIntExtra(r4, r11)     // Catch:{ Exception -> 0x04c9 }
            r2.a((int) r3)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0230:
            ajcl r2 = r1.a     // Catch:{ Exception -> 0x04c9 }
            long r20 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x04c9 }
            defpackage.amrl.a((java.lang.Object) r24)     // Catch:{ Exception -> 0x04c9 }
            java.lang.String r4 = "nav"
            boolean r18 = r3.getBooleanExtra(r4, r12)     // Catch:{ Exception -> 0x04c9 }
            java.lang.String r4 = "mode"
            java.lang.String r4 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x04c9 }
            if (r4 == 0) goto L_0x02af
            int r5 = r4.hashCode()
            r6 = 98
            if (r5 == r6) goto L_0x0288
            r6 = 100
            if (r5 == r6) goto L_0x027e
            r6 = 105(0x69, float:1.47E-43)
            if (r5 == r6) goto L_0x0274
            r6 = 114(0x72, float:1.6E-43)
            if (r5 == r6) goto L_0x026a
            r6 = 119(0x77, float:1.67E-43)
            if (r5 == r6) goto L_0x0260
            goto L_0x0292
        L_0x0260:
            java.lang.String r5 = "w"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0292
            r11 = 2
            goto L_0x0293
        L_0x026a:
            java.lang.String r5 = "r"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0292
            r11 = 1
            goto L_0x0293
        L_0x0274:
            java.lang.String r5 = "i"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0292
            r11 = 4
            goto L_0x0293
        L_0x027e:
            java.lang.String r5 = "d"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0292
            r11 = 0
            goto L_0x0293
        L_0x0288:
            java.lang.String r5 = "b"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0292
            r11 = 3
            goto L_0x0293
        L_0x0292:
        L_0x0293:
            if (r11 == 0) goto L_0x02ac
            if (r11 == r14) goto L_0x02a9
            if (r11 == r8) goto L_0x02a6
            if (r11 == r13) goto L_0x02a3
            if (r11 == r15) goto L_0x02a0
            r19 = 0
            goto L_0x02b1
        L_0x02a0:
            r19 = 5
            goto L_0x02b1
        L_0x02a3:
            r19 = 4
            goto L_0x02b1
        L_0x02a6:
            r19 = 3
            goto L_0x02b1
        L_0x02a9:
            r19 = 2
            goto L_0x02b1
        L_0x02ac:
            r19 = 1
            goto L_0x02b1
        L_0x02af:
            r19 = 0
        L_0x02b1:
            java.lang.String r5 = "fg"
            boolean r17 = r3.getBooleanExtra(r5, r12)     // Catch:{ Exception -> 0x04c9 }
            java.util.Locale r3 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x04c9 }
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x04c9 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r18)     // Catch:{ Exception -> 0x04c9 }
            r3[r12] = r5     // Catch:{ Exception -> 0x04c9 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)     // Catch:{ Exception -> 0x04c9 }
            r3[r14] = r5     // Catch:{ Exception -> 0x04c9 }
            r3[r8] = r4     // Catch:{ Exception -> 0x04c9 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r17)     // Catch:{ Exception -> 0x04c9 }
            r3[r13] = r4     // Catch:{ Exception -> 0x04c9 }
            ahyg r3 = new ahyg     // Catch:{ Exception -> 0x04c9 }
            r16 = r3
            r16.<init>(r17, r18, r19, r20)     // Catch:{ Exception -> 0x04c9 }
            r2.a((defpackage.ahyg) r3)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x02db:
            aydu r2 = defpackage.aydu.a     // Catch:{ Exception -> 0x04c9 }
            aydv r2 = r2.a()     // Catch:{ Exception -> 0x04c9 }
            boolean r2 = r2.enableTestingFeatures()     // Catch:{ Exception -> 0x04c9 }
            if (r2 == 0) goto L_0x04ba
            if (r3 == 0) goto L_0x02fb
            java.lang.String r2 = "com.google.android.gms.location.internal.EXTRA_NLP_TESTING_REQUEST"
            byte[] r2 = r3.getByteArrayExtra(r2)     // Catch:{ Exception -> 0x04c9 }
            if (r2 == 0) goto L_0x02fb
            android.os.Parcelable$Creator r3 = com.google.android.gms.location.internal.NlpTestingRequest.CREATOR     // Catch:{ Exception -> 0x04c9 }
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r2 = defpackage.ivy.a((byte[]) r2, (android.os.Parcelable.Creator) r3)     // Catch:{ Exception -> 0x04c9 }
            r9 = r2
            com.google.android.gms.location.internal.NlpTestingRequest r9 = (com.google.android.gms.location.internal.NlpTestingRequest) r9     // Catch:{ Exception -> 0x04c9 }
            goto L_0x02fc
        L_0x02fb:
        L_0x02fc:
            if (r9 == 0) goto L_0x04ba
            ajcl r2 = r1.a     // Catch:{ Exception -> 0x04c9 }
            long r3 = r9.a     // Catch:{ Exception -> 0x04c9 }
            r2.b((long) r3)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0307:
            java.lang.Object r2 = r2.getSystemService(r7)     // Catch:{ Exception -> 0x04c9 }
            android.os.PowerManager r2 = (android.os.PowerManager) r2     // Catch:{ Exception -> 0x04c9 }
            aiyk r3 = defpackage.aiyk.g     // Catch:{ Exception -> 0x04c9 }
            boolean r2 = r3.b((android.os.PowerManager) r2)     // Catch:{ Exception -> 0x04c9 }
            aivu r3 = r1.b     // Catch:{ Exception -> 0x04c9 }
            aicn r3 = r3.b     // Catch:{ Exception -> 0x04c9 }
            defpackage.aito.e(r3, r2)     // Catch:{ Exception -> 0x04c9 }
            ajcl r3 = r1.a     // Catch:{ Exception -> 0x04c9 }
            r3.c(r2)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0322:
            java.lang.Object r2 = r2.getSystemService(r7)     // Catch:{ Exception -> 0x04c9 }
            android.os.PowerManager r2 = (android.os.PowerManager) r2     // Catch:{ Exception -> 0x04c9 }
            aiyk r3 = defpackage.aiyk.g     // Catch:{ Exception -> 0x04c9 }
            boolean r2 = r3.a((android.os.PowerManager) r2)     // Catch:{ Exception -> 0x04c9 }
            aivu r3 = r1.b     // Catch:{ Exception -> 0x04c9 }
            aicn r3 = r3.b     // Catch:{ Exception -> 0x04c9 }
            defpackage.aito.d(r3, r2)     // Catch:{ Exception -> 0x04c9 }
            ajcl r3 = r1.a     // Catch:{ Exception -> 0x04c9 }
            r3.b((boolean) r2)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x033d:
            aivu r3 = r1.b     // Catch:{ Exception -> 0x04c9 }
            java.lang.String r4 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r4)     // Catch:{ Exception -> 0x04c9 }
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch:{ Exception -> 0x04c9 }
            android.net.wifi.WifiManager r4 = r1.c     // Catch:{ Exception -> 0x04c9 }
            ajcl r5 = r1.a     // Catch:{ Exception -> 0x04c9 }
            r3.a((android.net.ConnectivityManager) r2, (android.net.wifi.WifiManager) r4, (defpackage.ajcl) r5)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0350:
            boolean r2 = defpackage.axwx.m()     // Catch:{ Exception -> 0x04c9 }
            if (r2 == 0) goto L_0x04ba
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            ajcl r3 = r1.a     // Catch:{ Exception -> 0x04c9 }
            r2.a((defpackage.ajcl) r3)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x035f:
            boolean r2 = defpackage.aivu.a((android.content.Context) r23)     // Catch:{ Exception -> 0x04c9 }
            aivu r3 = r1.b     // Catch:{ Exception -> 0x04c9 }
            aicn r3 = r3.b     // Catch:{ Exception -> 0x04c9 }
            defpackage.aito.a((defpackage.aicn) r3, (boolean) r2)     // Catch:{ Exception -> 0x04c9 }
            ajcl r3 = r1.a     // Catch:{ Exception -> 0x04c9 }
            r3.g(r2)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0371:
            aivu r3 = r1.b     // Catch:{ Exception -> 0x04c9 }
            aixc r4 = r3.f     // Catch:{ Exception -> 0x04c9 }
            aicn r3 = r3.b     // Catch:{ Exception -> 0x04c9 }
            defpackage.aivu.a((defpackage.aicn) r3, (android.content.Context) r2)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x037c:
            java.lang.String r2 = "wifi_state"
            int r2 = r3.getIntExtra(r2, r15)     // Catch:{ Exception -> 0x04c9 }
            if (r2 != r13) goto L_0x0385
            goto L_0x0387
        L_0x0385:
            if (r2 != r14) goto L_0x04ba
        L_0x0387:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            ajcl r3 = r1.a     // Catch:{ Exception -> 0x04c9 }
            r2.b((defpackage.ajcl) r3)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0390:
            aivu r2 = r1.b     // Catch:{ RuntimeException -> 0x039f }
            boolean r2 = r2.j     // Catch:{ RuntimeException -> 0x039f }
            if (r2 == 0) goto L_0x039d
            android.net.wifi.WifiManager r2 = r1.c     // Catch:{ RuntimeException -> 0x039f }
            java.util.List r2 = r2.getScanResults()     // Catch:{ RuntimeException -> 0x039f }
            goto L_0x03a1
        L_0x039d:
            r2 = r9
            goto L_0x03a1
        L_0x039f:
            r0 = move-exception
            r2 = r9
        L_0x03a1:
            if (r2 != 0) goto L_0x03a4
            goto L_0x03d6
        L_0x03a4:
            int r3 = r2.size()     // Catch:{ Exception -> 0x04c9 }
            if (r3 <= 0) goto L_0x03d6
            aiyk r3 = defpackage.aiyk.g     // Catch:{ Exception -> 0x04c9 }
            int r4 = r2.size()     // Catch:{ Exception -> 0x04c9 }
            aixs[] r4 = new defpackage.aixs[r4]     // Catch:{ Exception -> 0x04c9 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x04c9 }
            r5 = 0
        L_0x03b7:
            boolean r6 = r2.hasNext()     // Catch:{ Exception -> 0x04c9 }
            if (r6 != 0) goto L_0x03c6
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x04c9 }
            r2.<init>(r14)     // Catch:{ Exception -> 0x04c9 }
            r2.add(r4)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x03db
        L_0x03c6:
            java.lang.Object r6 = r2.next()     // Catch:{ Exception -> 0x04c9 }
            android.net.wifi.ScanResult r6 = (android.net.wifi.ScanResult) r6     // Catch:{ Exception -> 0x04c9 }
            int r7 = r5 + 1
            aixs r6 = r3.a((android.net.wifi.ScanResult) r6)     // Catch:{ Exception -> 0x04c9 }
            r4[r5] = r6     // Catch:{ Exception -> 0x04c9 }
            r5 = r7
            goto L_0x03b7
        L_0x03d6:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x04c9 }
            r2.<init>(r12)     // Catch:{ Exception -> 0x04c9 }
        L_0x03db:
            aivu r3 = r1.b     // Catch:{ Exception -> 0x04c9 }
            r3.a((java.util.List) r2, (defpackage.aibv[]) r9, (boolean) r12)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x03e2:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            aixc r2 = r2.f     // Catch:{ Exception -> 0x04c9 }
            ajbj r2 = r2.j     // Catch:{ Exception -> 0x04c9 }
            r2.b()     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x03ed:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            r3 = 11
            r2.a((int) r3)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x03f6:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            r3 = 10
            r2.a((int) r3)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x03ff:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            r3 = 9
            r2.a((int) r3)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0408:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            r3 = 8
            r2.a((int) r3)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0411:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            r3 = 7
            r2.a((int) r3)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0419:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            r3 = 6
            r2.a((int) r3)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0421:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            r3 = 5
            r2.a((int) r3)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0429:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            r2.a((int) r15)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0430:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            r2.a((int) r13)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0437:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            r2.a((int) r8)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x043e:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            r2.a((int) r14)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0445:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            r2.a((int) r12)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x044c:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            aicn r2 = r2.b     // Catch:{ Exception -> 0x04c9 }
            aicl r3 = new aicl     // Catch:{ Exception -> 0x04c9 }
            aico r4 = defpackage.aico.USER_PRESENT     // Catch:{ Exception -> 0x04c9 }
            long r5 = r2.b()     // Catch:{ Exception -> 0x04c9 }
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x04c9 }
            r2.a((defpackage.aicl) r3)     // Catch:{ Exception -> 0x04c9 }
            ajcl r2 = r1.a     // Catch:{ Exception -> 0x04c9 }
            r2.b()     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0464:
            r1.a(r3, r13)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0469:
            r1.a(r3, r8)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x046e:
            r1.a(r3, r14)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0473:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            aicn r2 = r2.b     // Catch:{ Exception -> 0x04c9 }
            defpackage.aito.b(r2, r14)     // Catch:{ Exception -> 0x04c9 }
            ajcl r2 = r1.a     // Catch:{ Exception -> 0x04c9 }
            r2.a((boolean) r14)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x0480:
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            aicn r2 = r2.b     // Catch:{ Exception -> 0x04c9 }
            defpackage.aito.b(r2, r12)     // Catch:{ Exception -> 0x04c9 }
            ajcl r2 = r1.a     // Catch:{ Exception -> 0x04c9 }
            r2.a((boolean) r12)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x048d:
            int r2 = r2.a((java.lang.String) r4)     // Catch:{ Exception -> 0x04c9 }
            if (r2 == r14) goto L_0x04b1
            if (r2 == r8) goto L_0x04a7
            java.lang.String r2 = "Unexpected action "
            int r3 = r4.length()     // Catch:{ Exception -> 0x04c9 }
            if (r3 != 0) goto L_0x04a3
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x04c9 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x04a3:
            r2.concat(r4)     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x04a7:
            ajcl r2 = r1.a     // Catch:{ Exception -> 0x04c9 }
            r2.c()     // Catch:{ Exception -> 0x04c9 }
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            r2.j = r14     // Catch:{ Exception -> 0x04c9 }
            goto L_0x04ba
        L_0x04b1:
            ajcl r2 = r1.a     // Catch:{ Exception -> 0x04c9 }
            r2.d()     // Catch:{ Exception -> 0x04c9 }
            aivu r2 = r1.b     // Catch:{ Exception -> 0x04c9 }
            r2.j = r12     // Catch:{ Exception -> 0x04c9 }
        L_0x04ba:
            aivu r2 = r1.b
            aixc r2 = r2.f
            aixh r2 = r2.k
            ajbe r3 = defpackage.ajbe.CALLBACK_RUNNER
            r2.c(r3)
            return
        L_0x04c6:
            r0 = move-exception
            r2 = r0
            goto L_0x04cc
        L_0x04c9:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x04c6 }
        L_0x04cc:
            aivu r3 = r1.b
            aixc r3 = r3.f
            aixh r3 = r3.k
            ajbe r4 = defpackage.ajbe.CALLBACK_RUNNER
            r3.c(r4)
            throw r2
        L_0x04d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aivl.onReceive(android.content.Context, android.content.Intent):void");
    }
}
