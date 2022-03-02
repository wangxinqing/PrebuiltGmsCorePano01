package com.google.android.gms.drivingmode;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DrivingModeLocationNotificationIntentOperation extends lwi {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r14) {
        /*
            r13 = this;
            java.lang.String r0 = "CAR.DRIVINGMODE"
            java.lang.String r1 = "DrivingModeNotificationIntentOperation onHandleIntent from location module"
            android.util.Log.i(r0, r1)
            java.lang.String r1 = r14.getAction()
            if (r1 == 0) goto L_0x00e3
            java.lang.String r1 = r14.getAction()
            int r2 = r1.hashCode()
            r3 = -480690540(0xffffffffe3593e94, float:-4.0074527E21)
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L_0x002c
            r3 = 1918395325(0x725863bd, float:4.2860377E30)
            if (r2 == r3) goto L_0x0022
            goto L_0x0036
        L_0x0022:
            java.lang.String r2 = "com.google.android.gms.carsetup.drivingmode.NOTIFICATION_LAUNCH_APP_SNOOZE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0036
            r1 = 0
            goto L_0x0037
        L_0x002c:
            java.lang.String r2 = "com.google.android.gms.carsetup.drivingmode.NOTIFICATION_LAUNCH_APP_SHOW"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0036
            r1 = 1
            goto L_0x0037
        L_0x0036:
            r1 = -1
        L_0x0037:
            if (r1 == 0) goto L_0x0064
            if (r1 == r5) goto L_0x0059
            java.lang.String r14 = r14.getAction()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r1 = "Unexpected notification intent action received: "
            int r2 = r14.length()
            if (r2 != 0) goto L_0x0051
            java.lang.String r14 = new java.lang.String
            r14.<init>(r1)
            goto L_0x0055
        L_0x0051:
            java.lang.String r14 = r1.concat(r14)
        L_0x0055:
            android.util.Log.w(r0, r14)
            return
        L_0x0059:
            lwf r14 = r13.a
            r14.b()
            lwf r14 = r13.a
            r14.a()
            return
        L_0x0064:
            java.lang.String r14 = "Snooze Driving Mode launch from notification."
            android.util.Log.i(r0, r14)
            lts r14 = r13.b
            anxx r0 = defpackage.anxx.DRIVING_MODE
            anxw r1 = defpackage.anxw.DRIVING_MODE_LAUNCH_NOTIFICATION_SNOOZE
            r14.a((defpackage.anxx) r0, (defpackage.anxw) r1)
            lwf r14 = r13.a
            r14.k()
            long r0 = defpackage.awqy.c()
            long r2 = android.os.SystemClock.elapsedRealtime()
            jbs r6 = r14.a
            r8 = 3
            long r9 = r2 + r0
            android.app.PendingIntent r11 = r14.j()
            java.lang.String r7 = "CAR.DRIVINGMODE"
            java.lang.String r12 = ""
            r6.b((java.lang.String) r7, (int) r8, (long) r9, (android.app.PendingIntent) r11, (java.lang.String) r12)
            jc r2 = new jc
            android.content.Context r3 = r14.c
            r6 = 2131952011(0x7f13018b, float:1.9540453E38)
            java.lang.String r3 = r3.getString(r6)
            android.app.PendingIntent r6 = r14.h()
            r2.<init>(r4, r3, r6)
            jc r3 = new jc
            android.content.Context r6 = r14.c
            r7 = 2131952046(0x7f1301ae, float:1.9540524E38)
            java.lang.String r6 = r6.getString(r7)
            android.app.PendingIntent r7 = r14.i()
            r3.<init>(r4, r6, r7)
            r4 = 2131820551(0x7f110007, float:1.927382E38)
            r6 = 2131820552(0x7f110008, float:1.9273822E38)
            java.lang.String r0 = r14.a(r0, r4, r6)
            je r1 = r14.f()
            r1.b((java.lang.CharSequence) r0)
            jd r4 = new jd
            r4.<init>()
            r4.a((java.lang.CharSequence) r0)
            r1.a((defpackage.jh) r4)
            r1.b((boolean) r5)
            r1.a((defpackage.jc) r2)
            r1.a((defpackage.jc) r3)
            r0 = 50384636(0x300cefc, float:3.7853426E-37)
            android.app.Notification r1 = r1.b()
            r14.a(r0, r1)
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drivingmode.DrivingModeLocationNotificationIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
