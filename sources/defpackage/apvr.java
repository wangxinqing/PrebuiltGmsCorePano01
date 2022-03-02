package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: apvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apvr {
    private static final SharedPreferences a(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", new Object[]{str}), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized defpackage.apvq a(android.content.Context r7, java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.Class<apvr> r0 = defpackage.apvr.class
            monitor-enter(r0)
            defpackage.iva.c(r8)     // Catch:{ all -> 0x005f }
            defpackage.iva.c(r9)     // Catch:{ all -> 0x005f }
            android.content.SharedPreferences r7 = a(r7, r8)     // Catch:{ all -> 0x005f }
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x005f }
            r2 = 0
            r1[r2] = r9     // Catch:{ all -> 0x005f }
            java.lang.String r3 = "com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID"
            java.lang.String r1 = java.lang.String.format(r3, r1)     // Catch:{ all -> 0x005f }
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ all -> 0x005f }
            r3[r2] = r9     // Catch:{ all -> 0x005f }
            java.lang.String r4 = "com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x005f }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x005f }
            r8[r2] = r9     // Catch:{ all -> 0x005f }
            java.lang.String r9 = "com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID"
            java.lang.String r8 = java.lang.String.format(r9, r8)     // Catch:{ all -> 0x005f }
            r9 = 0
            java.lang.String r2 = r7.getString(r1, r9)     // Catch:{ all -> 0x005f }
            java.lang.String r4 = r7.getString(r3, r9)     // Catch:{ all -> 0x005f }
            java.lang.String r5 = r7.getString(r8, r9)     // Catch:{ all -> 0x005f }
            java.lang.String r6 = "com.google.firebase.auth.api.gms.config.tenant.id"
            java.lang.String r6 = r7.getString(r6, r9)     // Catch:{ all -> 0x005f }
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch:{ all -> 0x005f }
            r7.remove(r1)     // Catch:{ all -> 0x005f }
            r7.remove(r3)     // Catch:{ all -> 0x005f }
            r7.remove(r8)     // Catch:{ all -> 0x005f }
            r7.apply()     // Catch:{ all -> 0x005f }
            if (r2 == 0) goto L_0x005d
            if (r4 == 0) goto L_0x005d
            if (r5 == 0) goto L_0x005d
            apvq r7 = new apvq     // Catch:{ all -> 0x005f }
            r7.<init>(r2, r4, r5, r6)     // Catch:{ all -> 0x005f }
            monitor-exit(r0)
            return r7
        L_0x005d:
            monitor-exit(r0)
            return r9
        L_0x005f:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apvr.a(android.content.Context, java.lang.String, java.lang.String):apvq");
    }

    public static final synchronized void a(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        synchronized (apvr.class) {
            iva.c(str);
            iva.c(str2);
            iva.c(str3);
            SharedPreferences a = a(context, str);
            SharedPreferences.Editor edit = a.edit();
            for (String remove : a.getAll().keySet()) {
                edit.remove(remove);
            }
            edit.apply();
            SharedPreferences.Editor edit2 = a.edit();
            edit2.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{str2}), str3);
            edit2.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{str2}), str4);
            edit2.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{str2}), str5);
            edit2.putString("com.google.firebase.auth.api.gms.config.tenant.id", str6);
            edit2.apply();
        }
    }
}
