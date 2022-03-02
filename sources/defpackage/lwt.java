package defpackage;

import com.google.android.chimera.IntentOperation;

/* renamed from: lwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class lwt extends IntentOperation {
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r7) {
        /*
            r6 = this;
            lwu r0 = new lwu
            android.content.Context r1 = r6.getApplicationContext()
            r0.<init>(r1)
            java.lang.String r1 = r7.getAction()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            java.lang.String r3 = "DrivingModeSetupNotificationIntentOperation handling:"
            if (r2 != 0) goto L_0x001f
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
            goto L_0x0022
        L_0x001f:
            r3.concat(r1)
        L_0x0022:
            java.lang.String r1 = r7.getAction()
            int r2 = r1.hashCode()
            r3 = -268809479(0xffffffffeffa4af9, float:-1.5492378E29)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L_0x0050
            r3 = -185034830(0xfffffffff4f897b2, float:-1.5756425E32)
            if (r2 == r3) goto L_0x0046
            r3 = 1695542314(0x650fec2a, float:4.247843E22)
            if (r2 == r3) goto L_0x003c
            goto L_0x005a
        L_0x003c:
            java.lang.String r2 = "com.google.android.drivingmode.SETUP_CLEAR_NOTIFICATION"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005a
            r1 = 1
            goto L_0x005b
        L_0x0046:
            java.lang.String r2 = "com.google.android.drivingmode.SETUP_REMIND_ME_LATER"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005a
            r1 = 2
            goto L_0x005b
        L_0x0050:
            java.lang.String r2 = "com.google.android.drivingmode.SEND_SETUP_NOTIFICATION"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005a
            r1 = 0
            goto L_0x005b
        L_0x005a:
            r1 = -1
        L_0x005b:
            if (r1 == 0) goto L_0x009e
            java.lang.String r2 = "CAR.DRIVINGMODE"
            if (r1 == r5) goto L_0x0085
            if (r1 == r4) goto L_0x0081
            java.lang.String r7 = r7.getAction()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "Unknown action received in DrivingModeSetupNotificationIntentOperation:"
            int r1 = r7.length()
            if (r1 != 0) goto L_0x0079
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0)
            goto L_0x007d
        L_0x0079:
            java.lang.String r7 = r0.concat(r7)
        L_0x007d:
            android.util.Log.i(r2, r7)
            return
        L_0x0081:
            r0.b()
            return
        L_0x0085:
            java.lang.String r7 = "Setting set up notification to not show again"
            android.util.Log.i(r2, r7)
            android.content.SharedPreferences r7 = r0.a
            android.content.SharedPreferences$Editor r7 = r7.edit()
            java.lang.String r1 = "do_not_show_notification_again"
            android.content.SharedPreferences$Editor r7 = r7.putBoolean(r1, r5)
            r7.apply()
            r0.b()
            return
        L_0x009e:
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwt.onHandleIntent(android.content.Intent):void");
    }
}
