package com.google.android.gms.common.util;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PackageResetHelper extends nla {
    private final Context a;
    private final jki b;
    private final boolean c;

    public PackageResetHelper(Context context, jki jki, boolean z) {
        super("common-base");
        this.a = context;
        this.b = jki;
        this.c = z;
    }

    public final void a() {
        this.a.unregisterReceiver(this);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            android.net.Uri r9 = r10.getData()
            if (r9 == 0) goto L_0x000b
            java.lang.String r9 = r9.getSchemeSpecificPart()
            goto L_0x000c
        L_0x000b:
            r9 = 0
        L_0x000c:
            if (r9 == 0) goto L_0x00b8
            java.lang.String r0 = r10.getAction()
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = -1
            r6 = 0
            r7 = 1
            switch(r1) {
                case -1072806502: goto L_0x0048;
                case -757780528: goto L_0x003e;
                case 172491798: goto L_0x0034;
                case 525384130: goto L_0x002a;
                case 666876841: goto L_0x0020;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0052
        L_0x0020:
            java.lang.String r1 = "com.google.android.gms.INSTANT_APP_STOPPED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 4
            goto L_0x0053
        L_0x002a:
            java.lang.String r1 = "android.intent.action.PACKAGE_REMOVED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 2
            goto L_0x0053
        L_0x0034:
            java.lang.String r1 = "android.intent.action.PACKAGE_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 1
            goto L_0x0053
        L_0x003e:
            java.lang.String r1 = "android.intent.action.PACKAGE_RESTARTED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 3
            goto L_0x0053
        L_0x0048:
            java.lang.String r1 = "android.intent.action.QUERY_PACKAGE_RESTART"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 0
            goto L_0x0053
        L_0x0052:
            r0 = -1
        L_0x0053:
            if (r0 == 0) goto L_0x009c
            if (r0 == r7) goto L_0x006e
            if (r0 == r4) goto L_0x0068
            if (r0 == r3) goto L_0x0068
            if (r0 == r2) goto L_0x005e
            goto L_0x00b8
        L_0x005e:
            boolean r10 = r8.c
            if (r10 == 0) goto L_0x00b8
            jki r10 = r8.b
            r10.a(r9)
            return
        L_0x0068:
            jki r10 = r8.b
            r10.a(r9)
            return
        L_0x006e:
            java.lang.String r0 = "android.intent.extra.changed_component_name_list"
            java.lang.String[] r10 = r10.getStringArrayExtra(r0)
            if (r10 == 0) goto L_0x00b8
            int r0 = r10.length
            r1 = 0
        L_0x0079:
            if (r1 >= r0) goto L_0x00b8
            r2 = r10[r1]
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x0086
            int r1 = r1 + 1
            goto L_0x0079
        L_0x0086:
            android.content.Context r10 = r8.a
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            android.content.pm.ApplicationInfo r10 = r10.getApplicationInfo(r9, r6)     // Catch:{ NameNotFoundException -> 0x009a }
            boolean r10 = r10.enabled     // Catch:{ NameNotFoundException -> 0x009a }
            if (r10 != 0) goto L_0x00b8
            jki r10 = r8.b     // Catch:{ NameNotFoundException -> 0x009a }
            r10.a(r9)     // Catch:{ NameNotFoundException -> 0x009a }
            return
        L_0x009a:
            r9 = move-exception
            return
        L_0x009c:
            java.lang.String r9 = "android.intent.extra.PACKAGES"
            java.lang.String[] r9 = r10.getStringArrayExtra(r9)
            if (r9 == 0) goto L_0x00b8
            int r10 = r9.length
        L_0x00a5:
            if (r6 >= r10) goto L_0x00b8
            r0 = r9[r6]
            jki r1 = r8.b
            boolean r0 = r1.b(r0)
            if (r0 != 0) goto L_0x00b4
            int r6 = r6 + 1
            goto L_0x00a5
        L_0x00b4:
            r8.setResultCode(r5)
            return
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.PackageResetHelper.a(android.content.Context, android.content.Intent):void");
    }

    public final void a(Handler handler) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addAction("android.intent.action.QUERY_PACKAGE_RESTART");
        intentFilter.addDataScheme("package");
        this.a.registerReceiver(this, intentFilter, (String) null, handler);
        if (this.c) {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.google.android.gms.INSTANT_APP_STOPPED");
            this.a.registerReceiver(this, intentFilter2, "com.google.android.gms.permission.INTERNAL_BROADCAST", handler);
        }
    }
}
