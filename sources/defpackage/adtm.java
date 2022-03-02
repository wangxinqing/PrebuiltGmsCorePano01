package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserHandle;
import android.os.UserManager;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/* renamed from: adtm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adtm {
    private static adtm d = null;
    public final Object a = new Object();
    public final HashSet b;
    public final Context c;
    private final File e;
    private boolean f;
    private final Context g;

    public adtm(Context context) {
        boolean z = false;
        this.f = false;
        this.c = context;
        this.b = new HashSet();
        this.e = context.getDir("usage_reporting_db", 0);
        this.g = aekv.d(context);
        if (aekv.a()) {
            if (aztt.d() && b(this.g)) {
                z = true;
            }
            this.f = z;
        }
    }

    public static synchronized adtm a() {
        adtm adtm;
        synchronized (adtm.class) {
            if (d == null) {
                d = new adtm(ihs.b());
            }
            adtm = d;
        }
        return adtm;
    }

    private static boolean b(Context context) {
        return !context.getSharedPreferences("usagereporting", 0).getAll().isEmpty();
    }

    public final int c() {
        int i;
        synchronized (this.a) {
            SharedPreferences b2 = b();
            i = 0;
            if (b2 != null) {
                i = b2.getInt("DeviceWideCbSecretNumber", 0);
            }
            if (b2 != null) {
                if (i == 0 && adtl.a()) {
                    SharedPreferences.Editor edit = b2.edit();
                    i = new Random().nextInt(1024) + 1;
                    edit.putInt("DeviceWideCbSecretNumber", i);
                    edit.apply();
                }
            }
        }
        return i;
    }

    public static final String a(long j) {
        if (j == 0) {
            return "OptInUsageReporting";
        }
        return "OptInUsageReporting" + "-" + j;
    }

    public static boolean b(SharedPreferences sharedPreferences) {
        return sharedPreferences != null && sharedPreferences.contains("OptInUsageReporting");
    }

    public static boolean a(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("OptInUsageReporting", false);
        }
        return false;
    }

    private static final byte[] b(int i) {
        if (i > 127 || i < 0) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("The whitelist key must be between 0 and 127 inclusive. Given key: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return new byte[]{(byte) i};
    }

    private final boolean a(LevelDb levelDb, String str) {
        iva.a(aekv.b(this.c), (Object) "User is not unlocked.");
        try {
            byte[] bArr = levelDb.get(a(str));
            if (bArr == null || bArr.length <= 0 || bArr[0] != 1) {
                return false;
            }
            return true;
        } catch (LevelDbException e2) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final int b(String str) {
        LevelDb open;
        int i;
        iva.a(aekv.b(this.c), (Object) "User is not unlocked.");
        synchronized (this) {
            try {
                open = LevelDb.open(this.e);
                i = !a(open, str) ? 2 : 3;
                if (open != null) {
                    open.close();
                }
            } catch (LevelDbException e2) {
                return 1;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        return i;
        throw th;
    }

    public static byte[] a(String str) {
        return String.valueOf(str.toLowerCase(Locale.ROOT)).concat("OptInPlayPass").getBytes();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List a(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.content.Context r0 = r3.c     // Catch:{ all -> 0x004d }
            boolean r0 = defpackage.aekv.b(r0)     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "User is not unlocked."
            defpackage.iva.a((boolean) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x004d }
            r0 = 0
            java.io.File r1 = r3.e     // Catch:{ LevelDbException -> 0x004b, IllegalArgumentException -> 0x0049 }
            com.google.android.gms.leveldb.LevelDb r1 = com.google.android.gms.leveldb.LevelDb.open(r1)     // Catch:{ LevelDbException -> 0x004b, IllegalArgumentException -> 0x0049 }
            byte[] r4 = b((int) r4)     // Catch:{ all -> 0x003d }
            byte[] r4 = r1.get(r4)     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x0036
            int r2 = r4.length     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0036
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x003d }
            r2.<init>(r4)     // Catch:{ all -> 0x003d }
            java.lang.String r4 = ","
            java.lang.String[] r4 = r2.split(r4)     // Catch:{ all -> 0x003d }
            amzy r4 = defpackage.amzy.a((java.lang.Object[]) r4)     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x0034
            r1.close()     // Catch:{ LevelDbException -> 0x004b, IllegalArgumentException -> 0x0049 }
        L_0x0034:
            monitor-exit(r3)
            return r4
        L_0x0036:
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ LevelDbException -> 0x004b, IllegalArgumentException -> 0x0049 }
        L_0x003b:
            monitor-exit(r3)
            return r0
        L_0x003d:
            r4 = move-exception
            if (r1 == 0) goto L_0x0048
            r1.close()     // Catch:{ all -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r1 = move-exception
            defpackage.apev.a((java.lang.Throwable) r4, (java.lang.Throwable) r1)     // Catch:{ LevelDbException -> 0x004b, IllegalArgumentException -> 0x0049 }
        L_0x0048:
            throw r4     // Catch:{ LevelDbException -> 0x004b, IllegalArgumentException -> 0x0049 }
        L_0x0049:
            r4 = move-exception
            goto L_0x003b
        L_0x004b:
            r4 = move-exception
            goto L_0x003b
        L_0x004d:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x0051
        L_0x0050:
            throw r4
        L_0x0051:
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adtm.a(int):java.util.List");
    }

    public final SharedPreferences b() {
        if (aekv.a() && aztt.d()) {
            if (!this.f) {
                boolean b2 = b(this.g);
                this.f = b2;
                if (!b2 && aztt.a.a().e() && aekv.a() && aekv.b(this.c)) {
                    this.f = this.g.moveSharedPreferencesFrom(this.c, "usagereporting");
                }
            }
            if (this.f) {
                return this.g.getSharedPreferences("usagereporting", 0);
            }
            if (aekv.b(this.c)) {
                return this.c.getSharedPreferences("usagereporting", 0);
            }
            return null;
        } else if (aekv.b(this.c)) {
            return this.c.getSharedPreferences("usagereporting", 0);
        } else {
            return null;
        }
    }

    public final synchronized void a(int i, adsp adsp) {
        List a2 = a(i);
        if (a2 != null) {
            adsp.a(Status.a, a2);
        } else {
            adsp.a(Status.c, (List) null);
        }
    }

    public final synchronized void a(int i, List list, adsp adsp) {
        LevelDb open;
        iva.a(aekv.b(this.c), (Object) "User is not unlocked.");
        try {
            open = LevelDb.open(this.e);
            open.put(b(i), TextUtils.join(",", list).getBytes());
            adsp.d(Status.a);
            if (open != null) {
                open.close();
            }
        } catch (LevelDbException | IllegalArgumentException e2) {
            adsp.d(Status.c);
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        return;
        throw th;
    }

    public final void a(Context context) {
        List<Long> list;
        int c2 = azuf.d() ? c() : 0;
        synchronized (this.a) {
            SharedPreferences b2 = b();
            irk.a((Object) b2, (Object) "Unexpected null from getPrefs.");
            UserManager userManager = (UserManager) context.getSystemService("user");
            amzt amzt = new amzt();
            boolean z = true;
            try {
                for (Object next : (List) userManager.getClass().getDeclaredMethod("getUsers", new Class[0]).invoke(userManager, new Object[0])) {
                    amzt.c(Long.valueOf(userManager.getSerialNumberForUser((UserHandle) next.getClass().getDeclaredMethod("getUserHandle", new Class[0]).invoke(next, new Object[0]))));
                }
                list = amzt.a();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                list = anda.a((Object[]) new Long[]{0L});
            }
            for (Long l : list) {
                if (aztn.a.a().a()) {
                    jix.g(context);
                }
                z &= b2.getBoolean(a(l.longValue()), false);
            }
            if (!azuf.d()) {
                Settings.Global.putInt(context.getContentResolver(), "multi_cb", z ? 1 : 0);
            } else {
                ContentResolver contentResolver = context.getContentResolver();
                if (!z) {
                    c2--;
                }
                Settings.Global.putInt(contentResolver, "multi_cb", c2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r3 != r4) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(com.google.android.gms.usagereporting.UsageReportingOptInOptions r9, defpackage.adti r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            android.content.Context r0 = r8.c     // Catch:{ all -> 0x0081 }
            boolean r0 = defpackage.aekv.b(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "User is not unlocked."
            defpackage.iva.a((boolean) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x0081 }
            int r0 = r9.d     // Catch:{ all -> 0x0081 }
            r1 = 1
            if (r0 == 0) goto L_0x0070
            azuf r2 = defpackage.azuf.a     // Catch:{ all -> 0x0081 }
            azug r2 = r2.a()     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = r2.f()     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "setting PlayPass opt in"
            r10.a(r2, r3)     // Catch:{ all -> 0x0081 }
            r10 = 0
            java.io.File r2 = r8.e     // Catch:{ LevelDbException -> 0x007e }
            com.google.android.gms.leveldb.LevelDb r2 = com.google.android.gms.leveldb.LevelDb.open(r2)     // Catch:{ LevelDbException -> 0x007e }
            if (r0 == r1) goto L_0x002b
            r3 = 0
            goto L_0x002c
        L_0x002b:
            r3 = 1
        L_0x002c:
            java.lang.String r4 = r9.e     // Catch:{ all -> 0x0072 }
            boolean r4 = r8.a((com.google.android.gms.leveldb.LevelDb) r2, (java.lang.String) r4)     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = r9.e     // Catch:{ all -> 0x0072 }
            android.content.Context r6 = r8.c     // Catch:{ all -> 0x0072 }
            boolean r6 = defpackage.aekv.b(r6)     // Catch:{ all -> 0x0072 }
            java.lang.String r7 = "User is not unlocked."
            defpackage.iva.a((boolean) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x0072 }
            byte[] r5 = a((java.lang.String) r5)     // Catch:{ all -> 0x0072 }
            byte[] r5 = r2.get(r5)     // Catch:{ LevelDbException -> 0x004d }
            if (r5 != 0) goto L_0x004a
            goto L_0x004e
        L_0x004a:
            if (r3 == r4) goto L_0x006b
            goto L_0x004e
        L_0x004d:
            r3 = move-exception
        L_0x004e:
            java.lang.String r9 = r9.e     // Catch:{ all -> 0x0072 }
            android.content.Context r3 = r8.c     // Catch:{ all -> 0x0072 }
            boolean r3 = defpackage.aekv.b(r3)     // Catch:{ all -> 0x0072 }
            java.lang.String r4 = "User is not unlocked."
            defpackage.iva.a((boolean) r3, (java.lang.Object) r4)     // Catch:{ all -> 0x0072 }
            byte[] r9 = a((java.lang.String) r9)     // Catch:{ all -> 0x0072 }
            byte[] r3 = new byte[r1]     // Catch:{ all -> 0x0072 }
            if (r0 != r1) goto L_0x0065
            r0 = 1
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            r3[r10] = r0     // Catch:{ all -> 0x0072 }
            r2.put(r9, r3)     // Catch:{ all -> 0x0072 }
        L_0x006b:
            if (r2 == 0) goto L_0x0070
            r2.close()     // Catch:{ LevelDbException -> 0x007e }
        L_0x0070:
            monitor-exit(r8)
            return r1
        L_0x0072:
            r9 = move-exception
            if (r2 == 0) goto L_0x007d
            r2.close()     // Catch:{ all -> 0x0079 }
            goto L_0x007d
        L_0x0079:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r9, (java.lang.Throwable) r0)     // Catch:{ LevelDbException -> 0x007e }
        L_0x007d:
            throw r9     // Catch:{ LevelDbException -> 0x007e }
        L_0x007e:
            r9 = move-exception
            monitor-exit(r8)
            return r10
        L_0x0081:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adtm.a(com.google.android.gms.usagereporting.UsageReportingOptInOptions, adti):boolean");
    }
}
