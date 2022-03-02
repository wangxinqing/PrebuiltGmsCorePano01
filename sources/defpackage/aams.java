package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: aams  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aams {
    private static final Object a = new Object();
    private static Method b = null;

    static {
        int i = hxk.c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Exception} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r8) {
        /*
            java.lang.String r0 = "Context must not be null"
            defpackage.iva.a((java.lang.Object) r8, (java.lang.Object) r0)
            defpackage.hxz.l(r8)
            r0 = 0
            mcw r1 = defpackage.mcx.c     // Catch:{ mct -> 0x0014 }
            java.lang.String r2 = "providerinstaller"
            mcx r1 = defpackage.mcx.a((android.content.Context) r8, (defpackage.mcw) r1, (java.lang.String) r2)     // Catch:{ mct -> 0x0014 }
            android.content.Context r1 = r1.d     // Catch:{ mct -> 0x0014 }
            goto L_0x0035
        L_0x0014:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Failed to load providerinstaller module: "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x002b
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x002f
        L_0x002b:
            java.lang.String r1 = r2.concat(r1)
        L_0x002f:
            java.lang.String r2 = "ProviderInstaller"
            android.util.Log.w(r2, r1)
            r1 = r0
        L_0x0035:
            if (r1 != 0) goto L_0x003b
            android.content.Context r1 = b(r8)
        L_0x003b:
            if (r1 == 0) goto L_0x00c3
            java.lang.Object r2 = a
            monitor-enter(r2)
            java.lang.reflect.Method r3 = b     // Catch:{ Exception -> 0x006b }
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x005e
            java.lang.ClassLoader r3 = r1.getClassLoader()     // Catch:{ Exception -> 0x006b }
            java.lang.String r6 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.Class r3 = r3.loadClass(r6)     // Catch:{ Exception -> 0x006b }
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x006b }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r4] = r7     // Catch:{ Exception -> 0x006b }
            java.lang.String r7 = "insertProvider"
            java.lang.reflect.Method r3 = r3.getMethod(r7, r6)     // Catch:{ Exception -> 0x006b }
            b = r3     // Catch:{ Exception -> 0x006b }
        L_0x005e:
            java.lang.reflect.Method r3 = b     // Catch:{ Exception -> 0x006b }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x006b }
            r5[r4] = r1     // Catch:{ Exception -> 0x006b }
            r3.invoke(r0, r5)     // Catch:{ Exception -> 0x006b }
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            return
        L_0x0069:
            r8 = move-exception
            goto L_0x00c1
        L_0x006b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch:{ all -> 0x0069 }
            java.lang.String r3 = "ProviderInstaller"
            r4 = 6
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x0069 }
            if (r3 != 0) goto L_0x007a
            goto L_0x00a0
        L_0x007a:
            if (r1 == 0) goto L_0x0081
            java.lang.String r3 = r1.getMessage()     // Catch:{ all -> 0x0069 }
            goto L_0x0085
        L_0x0081:
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x0069 }
        L_0x0085:
            java.lang.String r4 = "ProviderInstaller"
            java.lang.String r5 = "Failed to install provider: "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0069 }
            int r6 = r3.length()     // Catch:{ all -> 0x0069 }
            if (r6 != 0) goto L_0x0099
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0069 }
            r3.<init>(r5)     // Catch:{ all -> 0x0069 }
            goto L_0x009d
        L_0x0099:
            java.lang.String r3 = r5.concat(r3)     // Catch:{ all -> 0x0069 }
        L_0x009d:
            android.util.Log.e(r4, r3)     // Catch:{ all -> 0x0069 }
        L_0x00a0:
            java.lang.String r3 = "com.google.android.gms"
            java.lang.String r4 = r8.getPackageName()     // Catch:{ all -> 0x0069 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0069 }
            if (r3 == 0) goto L_0x00bb
            boolean r3 = defpackage.aamy.a()     // Catch:{ aamx -> 0x00ba }
            if (r3 == 0) goto L_0x00bb
            if (r1 != 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r0 = r1
        L_0x00b6:
            defpackage.jis.a(r8, r0)     // Catch:{ aamx -> 0x00ba }
            goto L_0x00bb
        L_0x00ba:
            r8 = move-exception
        L_0x00bb:
            hxw r8 = new hxw     // Catch:{ all -> 0x0069 }
            r8.<init>()     // Catch:{ all -> 0x0069 }
            throw r8     // Catch:{ all -> 0x0069 }
        L_0x00c1:
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            throw r8
        L_0x00c3:
            java.lang.String r8 = "ProviderInstaller"
            java.lang.String r0 = "Failed to get remote context"
            android.util.Log.e(r8, r0)
            hxw r8 = new hxw
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aams.a(android.content.Context):void");
    }

    private static Context b(Context context) {
        try {
            return hxz.i(context);
        } catch (Resources.NotFoundException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("ProviderInstaller", valueOf.length() == 0 ? new String("Failed to load GMS Core context for providerinstaller: ") : "Failed to load GMS Core context for providerinstaller: ".concat(valueOf));
            jis.a(context, e);
            return null;
        }
    }
}
