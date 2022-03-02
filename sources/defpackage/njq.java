package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: njq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class njq extends BroadcastReceiver {
    public volatile boolean a = false;
    public volatile Boolean b = null;
    public volatile Boolean c = null;
    public volatile Boolean d = null;
    public volatile boolean e = false;
    public volatile boolean f = false;

    public static final boolean a(Context context) {
        PowerManager powerManager;
        if (!jkr.b() || (powerManager = (PowerManager) context.getSystemService("power")) == null) {
            return false;
        }
        return powerManager.isDeviceIdleMode();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r7.equals("android.intent.action.ACTION_POWER_CONNECTED") != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r7 = r7.getAction()
            int r0 = r7.hashCode()
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            switch(r0) {
                case -2128145023: goto L_0x005b;
                case -1980154005: goto L_0x0051;
                case -1886648615: goto L_0x0047;
                case -1454123155: goto L_0x003d;
                case 490310653: goto L_0x0033;
                case 870701415: goto L_0x0029;
                case 1019184907: goto L_0x0020;
                case 1779291251: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0065
        L_0x0016:
            java.lang.String r0 = "android.os.action.POWER_SAVE_MODE_CHANGED"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0065
            r1 = 7
            goto L_0x0066
        L_0x0020:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0029:
            java.lang.String r0 = "android.os.action.DEVICE_IDLE_MODE_CHANGED"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0065
            r1 = 6
            goto L_0x0066
        L_0x0033:
            java.lang.String r0 = "android.intent.action.BATTERY_LOW"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0065
            r1 = 4
            goto L_0x0066
        L_0x003d:
            java.lang.String r0 = "android.intent.action.SCREEN_ON"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0065
            r1 = 2
            goto L_0x0066
        L_0x0047:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0065
            r1 = 1
            goto L_0x0066
        L_0x0051:
            java.lang.String r0 = "android.intent.action.BATTERY_OKAY"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0065
            r1 = 5
            goto L_0x0066
        L_0x005b:
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0065
            r1 = 3
            goto L_0x0066
        L_0x0065:
            r1 = -1
        L_0x0066:
            switch(r1) {
                case 0: goto L_0x008c;
                case 1: goto L_0x0088;
                case 2: goto L_0x0084;
                case 3: goto L_0x0080;
                case 4: goto L_0x007c;
                case 5: goto L_0x0078;
                case 6: goto L_0x0071;
                case 7: goto L_0x006a;
                default: goto L_0x0069;
            }
        L_0x0069:
            return
        L_0x006a:
            boolean r6 = b(r6)
            r5.f = r6
            return
        L_0x0071:
            boolean r6 = a(r6)
            r5.e = r6
            return
        L_0x0078:
            r5.d = r2
            return
        L_0x007c:
            r5.d = r4
            return
        L_0x0080:
            r5.c = r2
            return
        L_0x0084:
            r5.c = r4
            return
        L_0x0088:
            r5.b = r2
            return
        L_0x008c:
            r5.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njq.onReceive(android.content.Context, android.content.Intent):void");
    }

    public static final boolean b(Context context) {
        int i = Build.VERSION.SDK_INT;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            return powerManager.isPowerSaveMode();
        }
        return false;
    }
}
