package defpackage;

import android.os.Handler;

/* renamed from: aior  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aior extends qvv {
    final /* synthetic */ String[] a;
    final /* synthetic */ aios b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aior(aios aios, String str, String str2, Handler handler, String[] strArr) {
        super(str, str2, handler);
        this.b = aios;
        this.a = strArr;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x009a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x006d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r7, android.net.Uri r8) {
        /*
            r6 = this;
            aios r7 = r6.b
            android.content.Context r7 = r7.a
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 0
            r1 = 23
            if (r8 < r1) goto L_0x0019
            android.content.ContentResolver r7 = r7.getContentResolver()
            java.lang.String r8 = "user_setup_complete"
            int r7 = android.provider.Settings.Secure.getInt(r7, r8, r0)
            if (r7 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            ayet r7 = defpackage.ayet.a
            ayeu r7 = r7.a()
            boolean r7 = r7.showWifiScanningConsentDialogPreP()
            if (r7 == 0) goto L_0x014a
            aios r7 = r6.b
            android.content.Context r7 = r7.a
            android.content.ContentResolver r7 = r7.getContentResolver()
            java.lang.String r8 = "wifi_scan_always_enabled"
            int r7 = android.provider.Settings.Global.getInt(r7, r8, r0)
            r8 = 1
            if (r7 != r8) goto L_0x014a
            boolean r7 = defpackage.ayet.c()
            r1 = 4
            java.lang.String r2 = "WifiScanningDialog"
            if (r7 == 0) goto L_0x011e
            java.lang.String[] r7 = r6.a
            r7 = r7[r0]
            if (r7 == 0) goto L_0x011e
            aios r7 = r6.b
            android.content.Context r7 = r7.a
            java.lang.String r3 = "activity"
            java.lang.Object r3 = r7.getSystemService(r3)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            java.lang.String r4 = "android.permission.GET_TASKS"
            int r4 = defpackage.kr.a(r7, r4)
            r5 = 0
            if (r4 == 0) goto L_0x009d
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r4 = "android.permission.REAL_GET_TASKS"
            int r4 = defpackage.kr.a(r7, r4)
            if (r4 != 0) goto L_0x0065
            goto L_0x009d
        L_0x0065:
            java.util.List r7 = r3.getRunningAppProcesses()
            java.util.Iterator r7 = r7.iterator()
        L_0x006d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x009c
            java.lang.Object r8 = r7.next()
            android.app.ActivityManager$RunningAppProcessInfo r8 = (android.app.ActivityManager.RunningAppProcessInfo) r8
            int r3 = r8.importance
            r4 = 100
            if (r3 != r4) goto L_0x006d
            java.lang.String r8 = r8.processName
            if (r8 == 0) goto L_0x0093
            r3 = 58
            int r3 = r8.indexOf(r3)
            if (r3 >= 0) goto L_0x008c
            goto L_0x0094
        L_0x008c:
            if (r3 == 0) goto L_0x0093
            java.lang.String r8 = r8.substring(r0, r3)
            goto L_0x0094
        L_0x0093:
            r8 = r5
        L_0x0094:
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto L_0x006d
            r5 = r8
            goto L_0x00f0
        L_0x009c:
            goto L_0x00f0
        L_0x009d:
            boolean r4 = defpackage.jkr.g()
            if (r4 == 0) goto L_0x00bd
            java.util.List r7 = r3.getRunningTasks(r8)
            if (r7 == 0) goto L_0x00bc
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L_0x00bc
            java.lang.Object r7 = r7.get(r0)
            android.app.ActivityManager$RunningTaskInfo r7 = (android.app.ActivityManager.RunningTaskInfo) r7
            android.content.ComponentName r7 = r7.topActivity
            java.lang.String r5 = r7.getPackageName()
            goto L_0x00f0
        L_0x00bc:
            goto L_0x00f0
        L_0x00bd:
            r4 = 3
            java.util.List r8 = r3.getRecentTasks(r8, r4)
            if (r8 == 0) goto L_0x00ef
            int r3 = r8.size()
            if (r3 == 0) goto L_0x00ef
            java.lang.Object r8 = r8.get(r0)
            android.app.ActivityManager$RecentTaskInfo r8 = (android.app.ActivityManager.RecentTaskInfo) r8
            android.content.Intent r8 = r8.baseIntent
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r8, r0)
            if (r7 == 0) goto L_0x00ef
            android.content.pm.ActivityInfo r8 = r7.activityInfo
            if (r8 == 0) goto L_0x00ef
            android.content.pm.ActivityInfo r8 = r7.activityInfo
            java.lang.String r8 = r8.packageName
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x00ef
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            java.lang.String r5 = r7.packageName
            goto L_0x00f0
        L_0x00ef:
        L_0x00f0:
            boolean r7 = android.util.Log.isLoggable(r2, r1)
            if (r7 == 0) goto L_0x0110
            java.lang.String r7 = java.lang.String.valueOf(r5)
            java.lang.String r8 = "foregroundApp = "
            int r3 = r7.length()
            if (r3 != 0) goto L_0x0109
            java.lang.String r7 = new java.lang.String
            r7.<init>(r8)
            goto L_0x010d
        L_0x0109:
            java.lang.String r7 = r8.concat(r7)
        L_0x010d:
            android.util.Log.i(r2, r7)
        L_0x0110:
            if (r5 == 0) goto L_0x011d
            java.lang.String[] r7 = r6.a
            r7 = r7[r0]
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x011d
            goto L_0x011e
        L_0x011d:
            return
        L_0x011e:
            boolean r7 = android.util.Log.isLoggable(r2, r1)
            if (r7 == 0) goto L_0x012a
            java.lang.String r7 = "Wi-Fi scanning enabled. Showing the consent dialog."
            android.util.Log.i(r2, r7)
        L_0x012a:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            android.content.ComponentName r8 = new android.content.ComponentName
            aios r0 = r6.b
            android.content.Context r0 = r0.a
            java.lang.String r1 = "com.google.android.location.settings.WifiScanningPrePConsentActivity"
            r8.<init>(r0, r1)
            r7.setComponent(r8)
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            r7.setFlags(r8)
            aios r8 = r6.b
            android.content.Context r8 = r8.a
            r8.startActivity(r7)
            return
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aior.a(boolean, android.net.Uri):void");
    }
}
