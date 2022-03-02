package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* renamed from: ajfr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajfr {
    static {
        iyc iyc = iyc.UNKNOWN;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static long a(android.app.AppOpsManager r10) {
        /*
            r0 = -1
            java.lang.Class r2 = r10.getClass()     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            java.lang.String r3 = "OP_VIBRATE"
            java.lang.reflect.Field r2 = r2.getField(r3)     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            r3 = 0
            int r2 = r2.getInt(r3)     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            r3 = 1
            int[] r4 = new int[r3]     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            r5 = 0
            r4[r5] = r2     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            java.lang.Class r6 = r4.getClass()     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            r2[r5] = r6     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            java.lang.Class<android.app.AppOpsManager> r6 = android.app.AppOpsManager.class
            java.lang.String r7 = "getPackagesForOps"
            java.lang.reflect.Method r2 = r6.getDeclaredMethod(r7, r2)     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            r3[r5] = r4     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            java.lang.Object r10 = r2.invoke(r10, r3)     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            if (r10 == 0) goto L_0x0080
            java.lang.Class<android.app.AppOpsManager$OpEntry> r2 = android.app.AppOpsManager.OpEntry.class
            java.lang.String r3 = "getTime"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            r3 = r0
        L_0x0042:
            boolean r6 = r10.hasNext()     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            if (r6 == 0) goto L_0x007f
            java.lang.Object r6 = r10.next()     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            android.app.AppOpsManager$PackageOps r6 = (android.app.AppOpsManager.PackageOps) r6     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            r6.getPackageName()     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            java.util.List r6 = r6.getOps()     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
        L_0x0059:
            boolean r7 = r6.hasNext()     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            if (r7 == 0) goto L_0x007e
            java.lang.Object r7 = r6.next()     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            android.app.AppOpsManager$OpEntry r7 = (android.app.AppOpsManager.OpEntry) r7     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            java.lang.Object r8 = r2.invoke(r7, r8)     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            long r8 = r8.longValue()     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            long r3 = java.lang.Math.max(r3, r8)     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            java.lang.Object r7 = r2.invoke(r7, r8)     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ NoSuchMethodException -> 0x0087, IllegalAccessException -> 0x0085, InvocationTargetException -> 0x0083, NoSuchFieldException -> 0x0081 }
            goto L_0x0059
        L_0x007e:
            goto L_0x0042
        L_0x007f:
            return r3
        L_0x0080:
            return r0
        L_0x0081:
            r10 = move-exception
            goto L_0x0088
        L_0x0083:
            r10 = move-exception
            goto L_0x0088
        L_0x0085:
            r10 = move-exception
            goto L_0x0088
        L_0x0087:
            r10 = move-exception
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajfr.a(android.app.AppOpsManager):long");
    }

    static long b(Context context) {
        long j = -1;
        if (!ayek.m()) {
            return -1;
        }
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        if (Build.VERSION.SDK_INT < 29) {
            return a(appOpsManager);
        }
        for (AppOpsManager.PackageOps packageOps : appOpsManager.getPackagesForOps(new String[]{"android:vibrate"})) {
            packageOps.getPackageName();
            for (AppOpsManager.OpEntry opEntry : packageOps.getOps()) {
                j = Math.max(j, opEntry.getLastAccessTime(1));
                opEntry.getLastAccessTime(1);
            }
        }
        return j;
    }

    static long a(Context context) {
        if (ayek.m()) {
            return Math.max(0, System.currentTimeMillis() - b(context));
        }
        return -1;
    }
}
