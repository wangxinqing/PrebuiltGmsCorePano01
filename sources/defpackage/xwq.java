package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: xwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xwq {
    private static int a(PackageManager packageManager, ComponentName componentName) {
        try {
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            if (componentEnabledSetting == 0) {
                try {
                    return !packageManager.getServiceInfo(componentName, 128).enabled ? 3 : 2;
                } catch (PackageManager.NameNotFoundException e) {
                    xdt.a("FsaEntryPointSwitcher", "getServiceInfo failed for %s", componentName.getClassName());
                    return 3;
                }
            } else if (componentEnabledSetting != 1) {
                return componentEnabledSetting != 2 ? 1 : 3;
            } else {
                return 2;
            }
        } catch (IllegalArgumentException e2) {
            xdt.a("FsaEntryPointSwitcher", "getComponentEnabledSetting failed for %s", componentName.getClassName());
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r6) {
        /*
            java.lang.Class<xwq> r0 = defpackage.xwq.class
            monitor-enter(r0)
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ all -> 0x0091 }
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r3 = "com.google.android.gms.people.sync.focus.ContactsSyncAdapterService"
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0091 }
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = "com.google.android.syncadapters.contacts"
            java.lang.String r4 = "com.google.android.syncadapters.contacts.ContactsSyncAdapterService"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0091 }
            int r3 = a(r6, r1)     // Catch:{ all -> 0x0091 }
            int r4 = a(r6, r2)     // Catch:{ all -> 0x0091 }
            r5 = 1
            if (r3 != r5) goto L_0x002d
            java.lang.String r6 = "FsaEntryPointSwitcher"
            java.lang.String r1 = "FSA2 new entry service doesn't exist."
            android.util.Log.w(r6, r1)     // Catch:{ all -> 0x0091 }
            monitor-exit(r0)
            return
        L_0x002d:
            r3 = 2
            if (r4 != r5) goto L_0x004f
            java.lang.String r2 = "FsaEntryPointSwitcher"
            java.lang.String r4 = "FSA1 proxy package doesn't exist."
            android.util.Log.w(r2, r4)     // Catch:{ all -> 0x0091 }
            ayth r2 = defpackage.ayth.a     // Catch:{ all -> 0x0091 }
            ayti r2 = r2.a()     // Catch:{ all -> 0x0091 }
            boolean r2 = r2.b()     // Catch:{ all -> 0x0091 }
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = "FsaEntryPointSwitcher"
            java.lang.String r4 = "Disabling GmsCore entry point."
            android.util.Log.w(r2, r4)     // Catch:{ all -> 0x0091 }
            a(r6, r1, r3)     // Catch:{ all -> 0x0091 }
        L_0x004d:
            monitor-exit(r0)
            return
        L_0x004f:
            ayth r4 = defpackage.ayth.a     // Catch:{ all -> 0x0091 }
            ayti r4 = r4.a()     // Catch:{ all -> 0x0091 }
            boolean r4 = r4.a()     // Catch:{ all -> 0x0091 }
            if (r4 != 0) goto L_0x006b
            boolean r4 = defpackage.ayxm.c()     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0062
            goto L_0x006b
        L_0x0062:
            java.lang.String r6 = "FsaEntryPointSwitcher"
            java.lang.String r1 = "FSA delegation disabled. Using FSA1. Will not enable sync service switcher."
            android.util.Log.w(r6, r1)     // Catch:{ all -> 0x0091 }
            monitor-exit(r0)
            return
        L_0x006b:
            ayrj r4 = defpackage.ayrj.a     // Catch:{ all -> 0x0091 }
            aytn r4 = r4.a()     // Catch:{ all -> 0x0091 }
            boolean r4 = r4.F()     // Catch:{ all -> 0x0091 }
            if (r4 != 0) goto L_0x007f
            r4 = 0
            a(r6, r2, r4)     // Catch:{ all -> 0x0091 }
            a(r6, r1, r3)     // Catch:{ all -> 0x0091 }
            goto L_0x0089
        L_0x007f:
            boolean r4 = a(r6, r1, r5)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0089
            a(r6, r2, r3)     // Catch:{ all -> 0x0091 }
        L_0x0089:
            a(r6, r2)     // Catch:{ all -> 0x0091 }
            a(r6, r1)     // Catch:{ all -> 0x0091 }
            monitor-exit(r0)
            return
        L_0x0091:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwq.a(android.content.Context):void");
    }

    private static boolean a(PackageManager packageManager, ComponentName componentName, int i) {
        xdt.a("FsaEntryPointSwitcher", "setting component enabled=%d for %s", (Object) Integer.valueOf(i), (Object) componentName.getClassName());
        try {
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            Log.i("FsaEntryPointSwitcher", "Setting component enabled succeeds.");
            return true;
        } catch (IllegalArgumentException | SecurityException e) {
            Log.e("FsaEntryPointSwitcher", "SetComponentEnabledSetting failed for %s", e);
            return false;
        }
    }
}
