package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;

/* renamed from: adhi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adhi {
    public static final jjg a = jjg.a();
    private static final byte[] b = {-17, -83, 24, -66, -52, 55, 29, -9, -45, 86, -1, -35, -93, 91, -47, 53, 53, -120, -95, 23};

    public static void b(Context context, String str) {
        adhh adhh = new adhh(str);
        SharedPreferences.Editor edit = context.getSharedPreferences("UdcConsistencyTokenPrefs", 0).edit();
        edit.remove(adhh.a);
        edit.remove(adhh.b);
        edit.remove(adhh.c);
        edit.apply();
    }

    public static String c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        MessageDigest a2 = jhh.a("MD5");
        if (a2 == null) {
            ((anih) a.b()).a("couldn't get a digest");
            return null;
        }
        String b2 = qdc.a(context).b();
        if (!TextUtils.isEmpty(b2)) {
            a2.update(b2.getBytes());
        }
        if (!TextUtils.isEmpty(Build.MODEL)) {
            a2.update(Build.MODEL.getBytes());
        }
        a2.update(b);
        byte[] digest = a2.digest(str.getBytes());
        if (digest != null) {
            return jjp.d(digest);
        }
        ((anih) a.b()).a("couldn't digest account-id");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.atyh a(android.content.Context r7, java.lang.String r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x0059
            adhg r0 = defpackage.adhg.a()
            java.util.Map r0 = r0.a
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L_0x0021
            adhg r7 = defpackage.adhg.a()
            java.util.Map r7 = r7.a
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x005a
        L_0x0021:
            java.lang.String r8 = c(r7, r8)
            if (r8 == 0) goto L_0x0059
            adhh r0 = new adhh
            r0.<init>(r8)
            java.lang.String r8 = "UdcConsistencyTokenPrefs"
            android.content.SharedPreferences r7 = r7.getSharedPreferences(r8, r1)
            java.lang.String r8 = r0.a
            boolean r8 = r7.getBoolean(r8, r1)
            if (r8 == 0) goto L_0x0059
            java.lang.String r8 = r0.c
            r3 = 0
            long r3 = r7.getLong(r8, r3)
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            long r3 = r8.longValue()
            long r5 = java.lang.System.currentTimeMillis()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x0059
            java.lang.String r8 = r0.b
            java.lang.String r7 = r7.getString(r8, r2)
            goto L_0x005a
        L_0x0059:
            r7 = r2
        L_0x005a:
            if (r7 == 0) goto L_0x0082
            atyh r8 = defpackage.atyh.c
            aucd r8 = r8.o()
            boolean r0 = r8.c
            if (r0 != 0) goto L_0x0067
            goto L_0x006c
        L_0x0067:
            r8.c()
            r8.c = r1
        L_0x006c:
            aucj r0 = r8.b
            atyh r0 = (defpackage.atyh) r0
            r7.getClass()
            int r1 = r0.a
            r1 = r1 | 1
            r0.a = r1
            r0.b = r7
            aucj r7 = r8.i()
            atyh r7 = (defpackage.atyh) r7
            return r7
        L_0x0082:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adhi.a(android.content.Context, java.lang.String):atyh");
    }

    public static void a(atyi atyi, Context context, String str) {
        iva.a(str, (Object) "AccountId must not be empty");
        if (atyi != null && (atyi.a & 1) != 0) {
            amdp amdp = atyi.b;
            if (amdp == null) {
                amdp = amdp.d;
            }
            int i = amdp.c;
            amdp amdp2 = atyi.b;
            if (amdp2 == null) {
                amdp2 = amdp.d;
            }
            if ((amdp2.a & 1) != 0) {
                amdp amdp3 = atyi.b;
                if (amdp3 == null) {
                    amdp3 = amdp.d;
                }
                String str2 = amdp3.b;
                String c = c(context, str);
                if (c == null) {
                    return;
                }
                if (i <= 0) {
                    b(context, c);
                    if (i == 0) {
                        adhg.a().a(str);
                    } else {
                        adhg.a().a.put(str, str2);
                    }
                } else {
                    adhh adhh = new adhh(c);
                    SharedPreferences.Editor edit = context.getSharedPreferences("UdcConsistencyTokenPrefs", 0).edit();
                    edit.putBoolean(adhh.a, true);
                    edit.putString(adhh.b, str2);
                    edit.putLong(adhh.c, System.currentTimeMillis() + TimeUnit.SECONDS.toMillis((long) i));
                    adhg.a().a(str);
                    edit.apply();
                }
            }
        }
    }
}
