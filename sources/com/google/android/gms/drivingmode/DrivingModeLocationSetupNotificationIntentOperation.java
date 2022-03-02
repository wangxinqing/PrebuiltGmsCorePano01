package com.google.android.gms.drivingmode;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DrivingModeLocationSetupNotificationIntentOperation extends lwt {
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "CAR.DRIVINGMODE"
            java.lang.String r1 = "DrivingModeNotificationIntentOperation onHandleIntent from location module"
            android.util.Log.i(r0, r1)
            lwu r1 = new lwu
            android.content.Context r2 = r7.getApplicationContext()
            r1.<init>(r2)
            java.lang.String r2 = r8.getAction()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            java.lang.String r4 = "DrivingModeSetupNotificationIntentOperation handling:"
            if (r3 != 0) goto L_0x0026
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
            goto L_0x0029
        L_0x0026:
            r4.concat(r2)
        L_0x0029:
            java.lang.String r2 = r8.getAction()
            int r3 = r2.hashCode()
            r4 = -268809479(0xffffffffeffa4af9, float:-1.5492378E29)
            r5 = 2
            r6 = 1
            if (r3 == r4) goto L_0x0057
            r4 = -185034830(0xfffffffff4f897b2, float:-1.5756425E32)
            if (r3 == r4) goto L_0x004d
            r4 = 1695542314(0x650fec2a, float:4.247843E22)
            if (r3 == r4) goto L_0x0043
            goto L_0x0061
        L_0x0043:
            java.lang.String r3 = "com.google.android.drivingmode.SETUP_CLEAR_NOTIFICATION"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0061
            r2 = 1
            goto L_0x0062
        L_0x004d:
            java.lang.String r3 = "com.google.android.drivingmode.SETUP_REMIND_ME_LATER"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0061
            r2 = 2
            goto L_0x0062
        L_0x0057:
            java.lang.String r3 = "com.google.android.drivingmode.SEND_SETUP_NOTIFICATION"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0061
            r2 = 0
            goto L_0x0062
        L_0x0061:
            r2 = -1
        L_0x0062:
            if (r2 == 0) goto L_0x00a3
            if (r2 == r6) goto L_0x008a
            if (r2 == r5) goto L_0x0086
            java.lang.String r8 = r8.getAction()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r1 = "Unknown action received in DrivingModeSetupNotificationIntentOperation:"
            int r2 = r8.length()
            if (r2 != 0) goto L_0x007e
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1)
            goto L_0x0082
        L_0x007e:
            java.lang.String r8 = r1.concat(r8)
        L_0x0082:
            android.util.Log.i(r0, r8)
            return
        L_0x0086:
            r1.b()
            return
        L_0x008a:
            java.lang.String r8 = "Setting set up notification to not show again"
            android.util.Log.i(r0, r8)
            android.content.SharedPreferences r8 = r1.a
            android.content.SharedPreferences$Editor r8 = r8.edit()
            java.lang.String r0 = "do_not_show_notification_again"
            android.content.SharedPreferences$Editor r8 = r8.putBoolean(r0, r6)
            r8.apply()
            r1.b()
            return
        L_0x00a3:
            r1.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drivingmode.DrivingModeLocationSetupNotificationIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
