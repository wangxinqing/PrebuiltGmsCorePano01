package defpackage;

import android.content.Context;

/* renamed from: ahop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahop implements ahon {
    public final Context a;
    private final ahor b;

    public ahop(Context context) {
        this.a = context;
        this.b = new ahor(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (r14 != false) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0134 A[SYNTHETIC, Splitter:B:57:0x0134] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01cc A[Catch:{ Exception -> 0x01d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r14) {
        /*
            r13 = this;
            java.lang.String r0 = "com.google.android.location.activity.dnd.notification.dndNotificationChannel"
            aycz r1 = defpackage.aycz.a
            ayda r1 = r1.a()
            boolean r1 = r1.dndNotificationMasterSwitch()
            if (r1 == 0) goto L_0x01d8
            android.content.Context r1 = r13.a
            java.lang.String r2 = "dndNotificationSharedPreference"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            if (r1 == 0) goto L_0x01d8
            java.lang.String r4 = "dndNotificationSent"
            boolean r1 = r1.getBoolean(r4, r3)
            if (r1 != 0) goto L_0x01d8
            android.content.Context r1 = r13.a
            boolean r5 = defpackage.axzs.c()
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x0075
            boolean r5 = defpackage.axzy.b()
            if (r5 == 0) goto L_0x0057
            boolean r5 = defpackage.awqd.d()
            if (r5 == 0) goto L_0x0057
            java.lang.String r5 = "driving_mode_frx_prefs"
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r5, r3)
            java.lang.String r5 = "frx_completed"
            boolean r5 = r1.getBoolean(r5, r3)
            if (r5 != 0) goto L_0x0057
            java.lang.String r5 = "gearhead_frx_completed"
            boolean r1 = r1.getBoolean(r5, r3)
            if (r1 != 0) goto L_0x0057
            boolean r1 = defpackage.awqs.c()
            if (r1 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r14 = 2
            goto L_0x0076
        L_0x0057:
            boolean r1 = defpackage.axzs.b()
            if (r1 == 0) goto L_0x0075
            boolean r1 = defpackage.jkr.c()
            if (r1 == 0) goto L_0x0075
            boolean r1 = defpackage.axzv.b()
            if (r1 == 0) goto L_0x0073
            boolean r1 = defpackage.axzv.b()
            if (r1 != 0) goto L_0x0071
            r14 = 1
            goto L_0x0076
        L_0x0071:
            if (r14 == 0) goto L_0x0075
        L_0x0073:
            r14 = 3
            goto L_0x0076
        L_0x0075:
            r14 = 1
        L_0x0076:
            android.content.Context r1 = r13.a
            ahor r5 = r13.b
            if (r14 == r8) goto L_0x0084
            if (r14 == r7) goto L_0x0081
            java.lang.String r9 = "DND_NOTIFICATION"
            goto L_0x0086
        L_0x0081:
            java.lang.String r9 = "DRIVE_MODE_NOTIFICATION"
            goto L_0x0086
        L_0x0084:
            java.lang.String r9 = "UNKNOWN_DONOT_SEND"
        L_0x0086:
            int r10 = r9.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r10 = r10 + 42
            r11.<init>(r10)
            java.lang.String r10 = "Getting notification content for category "
            r11.append(r10)
            r11.append(r9)
            r11.toString()
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            int r14 = r14 + -1
            r10 = 2131952494(0x7f13036e, float:1.9541432E38)
            if (r14 == r8) goto L_0x00c9
            if (r14 == r7) goto L_0x00ad
            r14 = 0
            goto L_0x0132
        L_0x00ad:
            android.content.Context r14 = r5.a
            java.lang.String r14 = r14.getString(r10)
            android.content.Context r7 = r5.a
            r10 = 2131952493(0x7f13036d, float:1.954143E38)
            java.lang.String r7 = r7.getString(r10)
            android.content.ComponentName r10 = new android.content.ComponentName
            android.content.Context r11 = r5.a
            java.lang.String r12 = "com.google.android.location.settings.ActivityRecognitionPermissionActivity"
            r10.<init>(r11, r12)
            r9.setComponent(r10)
            goto L_0x0116
        L_0x00c9:
            boolean r14 = defpackage.aycz.f()
            if (r14 == 0) goto L_0x00ed
            java.lang.String r14 = defpackage.aycz.e()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x00ed
            java.lang.String r14 = defpackage.aycz.d()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L_0x00e4
            goto L_0x00ed
        L_0x00e4:
            java.lang.String r14 = defpackage.aycz.e()
            java.lang.String r7 = defpackage.aycz.d()
            goto L_0x00fc
        L_0x00ed:
            android.content.Context r14 = r5.a
            java.lang.String r14 = r14.getString(r10)
            android.content.Context r7 = r5.a
            r10 = 2131952480(0x7f130360, float:1.9541404E38)
            java.lang.String r7 = r7.getString(r10)
        L_0x00fc:
            android.content.ComponentName r10 = new android.content.ComponentName
            android.content.Context r11 = r5.a
            boolean r12 = defpackage.awqm.b()
            if (r12 != 0) goto L_0x0109
            java.lang.String r12 = "com.google.android.gms.carsetup.DrivingModeFrxActivity"
            goto L_0x010b
        L_0x0109:
            java.lang.String r12 = "com.google.android.location.drivingmode.DrivingModeFrxActivity"
        L_0x010b:
            r10.<init>(r11, r12)
            r9.setComponent(r10)
            java.lang.String r10 = "com.google.android.location.activity.DRIVING_MODE_NOTIFICATION"
            r9.putExtra(r10, r8)
        L_0x0116:
            r10 = 603979776(0x24000000, float:2.7755576E-17)
            r9.setFlags(r10)
            ahoq r10 = new ahoq
            android.content.Context r11 = r5.a
            r12 = 2131231905(0x7f0804a1, float:1.8079904E38)
            int r11 = defpackage.hdg.a(r11, r12)
            android.content.Context r5 = r5.a
            r12 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r5 = android.app.PendingIntent.getActivity(r5, r3, r9, r12)
            r10.<init>(r14, r7, r11, r5)
            r14 = r10
        L_0x0132:
            if (r14 == 0) goto L_0x01d7
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ Exception -> 0x01d5 }
            r5.<init>()     // Catch:{ Exception -> 0x01d5 }
            boolean r7 = defpackage.aycz.f()     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r9 = "android.substName"
            if (r7 == 0) goto L_0x0153
            java.lang.String r7 = defpackage.aycz.c()     // Catch:{ Exception -> 0x01d5 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x01d5 }
            if (r7 != 0) goto L_0x0153
            java.lang.String r7 = defpackage.aycz.c()     // Catch:{ Exception -> 0x01d5 }
            r5.putString(r9, r7)     // Catch:{ Exception -> 0x01d5 }
            goto L_0x0158
        L_0x0153:
            java.lang.String r7 = "System"
            r5.putString(r9, r7)     // Catch:{ Exception -> 0x01d5 }
        L_0x0158:
            je r7 = new je     // Catch:{ Exception -> 0x01d5 }
            r7.<init>(r1)     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r9 = r14.a     // Catch:{ Exception -> 0x01d5 }
            r7.e(r9)     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r9 = r14.b     // Catch:{ Exception -> 0x01d5 }
            r7.b((java.lang.CharSequence) r9)     // Catch:{ Exception -> 0x01d5 }
            int r9 = r14.c     // Catch:{ Exception -> 0x01d5 }
            r7.b((int) r9)     // Catch:{ Exception -> 0x01d5 }
            r7.a((boolean) r8)     // Catch:{ Exception -> 0x01d5 }
            android.app.PendingIntent r14 = r14.d     // Catch:{ Exception -> 0x01d5 }
            r7.f = r14     // Catch:{ Exception -> 0x01d5 }
            r7.a((android.os.Bundle) r5)     // Catch:{ Exception -> 0x01d5 }
            iwq r14 = defpackage.iwq.a((android.content.Context) r1)     // Catch:{ Exception -> 0x01d5 }
            aycz r5 = defpackage.aycz.a     // Catch:{ Exception -> 0x01d5 }
            ayda r5 = r5.a()     // Catch:{ Exception -> 0x01d5 }
            boolean r5 = r5.dndNotificationChannelEnabled()     // Catch:{ Exception -> 0x01d5 }
            if (r5 == 0) goto L_0x01a9
            boolean r5 = defpackage.jkr.e()     // Catch:{ Exception -> 0x01d5 }
            if (r5 == 0) goto L_0x01a9
            aycz r5 = defpackage.aycz.a     // Catch:{ Exception -> 0x01d5 }
            ayda r5 = r5.a()     // Catch:{ Exception -> 0x01d5 }
            boolean r5 = r5.enableDndNotificationDefaultImportanceChannel()     // Catch:{ Exception -> 0x01d5 }
            if (r5 != 0) goto L_0x019a
            r6 = 1
            goto L_0x019b
        L_0x019a:
        L_0x019b:
            android.app.NotificationChannel r5 = new android.app.NotificationChannel     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r9 = "New services"
            r5.<init>(r0, r9, r6)     // Catch:{ Exception -> 0x01a6 }
            r14.a((android.app.NotificationChannel) r5)     // Catch:{ Exception -> 0x01a6 }
            goto L_0x01a7
        L_0x01a6:
            r5 = move-exception
        L_0x01a7:
            r7.z = r0     // Catch:{ Exception -> 0x01d5 }
        L_0x01a9:
            android.app.Notification r0 = r7.b()     // Catch:{ Exception -> 0x01d5 }
            int r5 = defpackage.ahoo.a     // Catch:{ Exception -> 0x01d5 }
            int r6 = r5 + 1
            defpackage.ahoo.a = r6     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r6 = "QKFO5tsEEemUURv0IK/OzQ"
            r14.a(r6, r5, r0)     // Catch:{ Exception -> 0x01d5 }
            android.content.SharedPreferences r14 = r1.getSharedPreferences(r2, r3)     // Catch:{ Exception -> 0x01d5 }
            android.content.SharedPreferences$Editor r14 = r14.edit()     // Catch:{ Exception -> 0x01d5 }
            r14.putBoolean(r4, r8)     // Catch:{ Exception -> 0x01d5 }
            r14.commit()     // Catch:{ Exception -> 0x01d5 }
            boolean r14 = defpackage.aycz.b()     // Catch:{ Exception -> 0x01d5 }
            if (r14 == 0) goto L_0x01d7
            ahol r14 = defpackage.ahol.a((android.content.Context) r1)     // Catch:{ Exception -> 0x01d5 }
            r0 = 7
            r14.a((int) r0)     // Catch:{ Exception -> 0x01d5 }
            return
        L_0x01d5:
            r14 = move-exception
            return
        L_0x01d7:
            return
        L_0x01d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahop.a(boolean):void");
    }
}
