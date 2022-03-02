package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: apox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apox {
    public static final apox a = new apox();
    private final jfc b = jfm.a(1, 10);

    private static String a(String str) {
        return String.format("com.google.firebase.auth.VERIFICATION_PROOF.%s", new Object[]{str});
    }

    public static final SharedPreferences b(Context context) {
        return context.getSharedPreferences("com.google.firebase.auth.instantValidator", 0);
    }

    private static String c(String str) {
        return String.format("com.google.firebase.auth.DEVICE_PROOF.%s", new Object[]{str});
    }

    private final synchronized void e(Context context, String str) {
        this.b.a((Runnable) new apow(context, str), 300000, TimeUnit.MILLISECONDS);
    }

    public final synchronized void d(Context context, String str) {
        SharedPreferences.Editor edit = b(context).edit();
        edit.remove(a(str));
        edit.apply();
    }

    private static String a(String str, String str2) {
        return String.format("com.google.firebase.auth.UNOBFUSCATED_PHONE_NUMBER.%s.%s", new Object[]{str, str2});
    }

    private static String b(String str) {
        return String.format("com.google.firebase.auth.PROOF_EXPIRY.%s", new Object[]{str});
    }

    public final synchronized void c(Context context, String str) {
        SharedPreferences b2 = b(context);
        for (String next : b2.getAll().keySet()) {
            if (next.contains(str)) {
                b2.edit().remove(next).apply();
            }
        }
    }

    public final synchronized String a(Context context, String str) {
        iva.a((Object) context);
        iva.c(str);
        return b(context).getString(a(str), (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            defpackage.iva.a((java.lang.Object) r4)     // Catch:{ all -> 0x0050 }
            defpackage.iva.c(r5)     // Catch:{ all -> 0x0050 }
            boolean r0 = defpackage.axif.b()     // Catch:{ all -> 0x0050 }
            r1 = 1
            if (r0 == 0) goto L_0x003c
            int r0 = r5.length()     // Catch:{ all -> 0x0050 }
            r2 = 5
            if (r0 <= r2) goto L_0x003a
            java.lang.String r0 = "*"
            boolean r0 = r5.contains(r0)     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x003a
            r0 = 0
            char r0 = r5.charAt(r0)     // Catch:{ all -> 0x0050 }
            r2 = 43
            if (r0 != r2) goto L_0x003a
            r0 = 1
        L_0x0027:
            int r2 = r5.length()     // Catch:{ all -> 0x0050 }
            if (r0 >= r2) goto L_0x003c
            char r2 = r5.charAt(r0)     // Catch:{ all -> 0x0050 }
            boolean r2 = java.lang.Character.isDigit(r2)     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x003a
            int r0 = r0 + 1
            goto L_0x0027
        L_0x003a:
            monitor-exit(r3)
            return
        L_0x003c:
            android.content.SharedPreferences r4 = b((android.content.Context) r4)     // Catch:{ all -> 0x0050 }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = c(r5)     // Catch:{ all -> 0x0050 }
            r4.putBoolean(r5, r1)     // Catch:{ all -> 0x0050 }
            r4.apply()     // Catch:{ all -> 0x0050 }
            monitor-exit(r3)
            return
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x0054
        L_0x0053:
            throw r4
        L_0x0054:
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apox.b(android.content.Context, java.lang.String):void");
    }

    public final synchronized String a(Context context, String str, String str2) {
        iva.a((Object) context);
        iva.c(str);
        iva.c(str2);
        return b(context).getString(a(str, str2), (String) null);
    }

    public final synchronized void a(Context context) {
        b(context).edit().clear().apply();
    }

    public final synchronized void a(Context context, String str, String str2, long j) {
        iva.a((Object) context);
        iva.c(str);
        iva.c(str2);
        SharedPreferences.Editor edit = b(context).edit();
        edit.putString(a(str), str2);
        edit.putLong(b(str), j + System.currentTimeMillis());
        edit.apply();
    }

    public final synchronized void a(Context context, String str, String str2, String str3) {
        iva.c(str);
        iva.c(str2);
        iva.c(str3);
        if (a(context, str3, false)) {
            SharedPreferences.Editor edit = b(context).edit();
            String a2 = a(str, str2);
            edit.putString(a2, str3).apply();
            e(context, a2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            defpackage.iva.a((java.lang.Object) r11)     // Catch:{ all -> 0x0055 }
            defpackage.iva.c(r12)     // Catch:{ all -> 0x0055 }
            axic r0 = defpackage.axic.a     // Catch:{ all -> 0x0055 }
            axid r0 = r0.a()     // Catch:{ all -> 0x0055 }
            boolean r0 = r0.c()     // Catch:{ all -> 0x0055 }
            r1 = 0
            if (r0 == 0) goto L_0x0050
            android.content.SharedPreferences r0 = b((android.content.Context) r11)     // Catch:{ all -> 0x0055 }
            java.lang.String r2 = c(r12)     // Catch:{ all -> 0x0055 }
            boolean r2 = r0.getBoolean(r2, r1)     // Catch:{ all -> 0x0055 }
            java.lang.String r3 = b((java.lang.String) r12)     // Catch:{ all -> 0x0055 }
            r4 = 0
            long r6 = r0.getLong(r3, r4)     // Catch:{ all -> 0x0055 }
            java.lang.String r3 = a((java.lang.String) r12)     // Catch:{ all -> 0x0055 }
            r8 = 0
            java.lang.String r0 = r0.getString(r3, r8)     // Catch:{ all -> 0x0055 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0050
            if (r2 == 0) goto L_0x0050
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0055 }
            r8 = 300000(0x493e0, double:1.482197E-318)
            long r2 = r2 + r8
            if (r13 == 0) goto L_0x0052
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x004d
            int r13 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r13 >= 0) goto L_0x0052
        L_0x004d:
            r10.d(r11, r12)     // Catch:{ all -> 0x0055 }
        L_0x0050:
            monitor-exit(r10)
            return r1
        L_0x0052:
            r11 = 1
            monitor-exit(r10)
            return r11
        L_0x0055:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apox.a(android.content.Context, java.lang.String, boolean):boolean");
    }
}
