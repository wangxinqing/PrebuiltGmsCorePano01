package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Method;

/* renamed from: ntv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ntv {
    private final Method a;
    private final SparseArray b = new SparseArray();
    private final Context c;

    public ntv(Context context) {
        Method method;
        this.c = context;
        int i = Build.VERSION.SDK_INT;
        try {
            method = Context.class.getDeclaredMethod("createPackageContextAsUser", new Class[]{String.class, Integer.TYPE, UserHandle.class});
        } catch (Exception e) {
            Log.e("GCM", "Failed to initialize multi-user Context support, falling back to single-user impl");
            method = null;
        }
        this.a = method;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066 A[Catch:{ Exception -> 0x0053 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.Context a(int r7, java.lang.String r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            android.content.Context r0 = r6.c     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x006c
            if (r7 == 0) goto L_0x0008
            goto L_0x0013
        L_0x0008:
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x0070 }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0013
            goto L_0x006c
        L_0x0013:
            android.util.SparseArray r0 = r6.b     // Catch:{ all -> 0x0070 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0070 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0070 }
            r1 = 1
            if (r0 != 0) goto L_0x0028
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0070 }
            r0.<init>(r1)     // Catch:{ all -> 0x0070 }
            android.util.SparseArray r2 = r6.b     // Catch:{ all -> 0x0070 }
            r2.put(r7, r0)     // Catch:{ all -> 0x0070 }
        L_0x0028:
            java.lang.Object r2 = r0.get(r8)     // Catch:{ all -> 0x0070 }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ all -> 0x0070 }
            if (r2 != 0) goto L_0x006b
            java.lang.Object r7 = defpackage.nqw.c(r7)     // Catch:{ all -> 0x0070 }
            if (r7 == 0) goto L_0x0062
            java.lang.reflect.Method r2 = r6.a     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x005f
            android.content.Context r3 = r6.c     // Catch:{ Exception -> 0x0053 }
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0053 }
            r5 = 0
            r4[r5] = r8     // Catch:{ Exception -> 0x0053 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0053 }
            r4[r1] = r5     // Catch:{ Exception -> 0x0053 }
            r1 = 2
            r4[r1] = r7     // Catch:{ Exception -> 0x0053 }
            java.lang.Object r7 = r2.invoke(r3, r4)     // Catch:{ Exception -> 0x0053 }
            android.content.Context r7 = (android.content.Context) r7     // Catch:{ Exception -> 0x0053 }
            r2 = r7
            goto L_0x0064
        L_0x0053:
            r7 = move-exception
            java.lang.String r7 = "GCM"
            java.lang.String r1 = "Multi-user invocation failed, falling back to single-user impl"
            android.util.Log.e(r7, r1)     // Catch:{ all -> 0x0070 }
            android.content.Context r7 = r6.c     // Catch:{ all -> 0x0070 }
            r2 = r7
            goto L_0x0064
        L_0x005f:
            android.content.Context r7 = r6.c     // Catch:{ all -> 0x0070 }
            goto L_0x0063
        L_0x0062:
            r7 = 0
        L_0x0063:
            r2 = r7
        L_0x0064:
            if (r2 == 0) goto L_0x0069
            r0.put(r8, r2)     // Catch:{ all -> 0x0070 }
        L_0x0069:
            monitor-exit(r6)
            return r2
        L_0x006b:
            goto L_0x0069
        L_0x006c:
            android.content.Context r7 = r6.c     // Catch:{ all -> 0x0070 }
            monitor-exit(r6)
            return r7
        L_0x0070:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0074
        L_0x0073:
            throw r7
        L_0x0074:
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntv.a(int, java.lang.String):android.content.Context");
    }

    public final Context b(int i) {
        Context context = this.c;
        if (context != null) {
            return a(i, context.getPackageName());
        }
        return null;
    }

    public final PackageManager c(int i) {
        Context b2 = b(i);
        if (b2 != null) {
            return b2.getPackageManager();
        }
        return null;
    }

    public final synchronized void a(int i) {
        this.b.remove(i);
    }
}
