package com.google.android.gms.ads.identifier.settings;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class e {
    private static e c = null;
    private static final AtomicLong g = new AtomicLong(-1);
    public final Object a = new Object();
    public final LruCache b;
    private final Context d;
    private final v e;
    private final t f;

    private e(Context context) {
        LruCache lruCache;
        if (awhh.c() > 0) {
            lruCache = new LruCache((int) awhh.c());
        } else {
            lruCache = null;
        }
        this.b = lruCache;
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext != null ? applicationContext : context;
        this.e = new v(this.d);
        this.f = new t(this.d);
    }

    public static synchronized e a(Context context) {
        e eVar;
        synchronized (e.class) {
            if (c == null) {
                c = new e(context);
            }
            eVar = c;
        }
        return eVar;
    }

    public static boolean a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    private final void j() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this.d, "com.google.android.gms.ads.identifier.service.AdvertisingIdNotificationService"));
        long currentTimeMillis = System.currentTimeMillis();
        long andSet = g.getAndSet(currentTimeMillis);
        long j = -1;
        if (andSet != -1) {
            j = currentTimeMillis - andSet;
        }
        intent.putExtra("time_since_last_update", j);
        this.d.startService(intent);
    }

    public final String b() {
        String a2;
        synchronized (this.a) {
            boolean f2 = f();
            String e2 = !f2 ? "" : e();
            this.e.b();
            String str = null;
            if (awhh.g()) {
                try {
                    String uuid = v.a(this.e.c()).toString();
                    if (!TextUtils.isEmpty(uuid)) {
                        str = uuid;
                    } else {
                        throw new IOException("Generated Id is null");
                    }
                } catch (IOException | GeneralSecurityException e3) {
                    f.a(this.d, "generateNewIdError", e3);
                }
            }
            boolean z = !TextUtils.isEmpty(str);
            if (!z) {
                str = UUID.randomUUID().toString();
            }
            if (z) {
                r.a(this.d).b();
                r.a(this.d).a();
            }
            a().edit().putInt("adid_reset_count", a().getInt("adid_reset_count", 0) + 1).apply();
            a2 = a(f2, z, str, e2);
        }
        return a2;
    }

    public final String c() {
        String h = !f() ? h() : g();
        return h.isEmpty() ? b() : h;
    }

    public final boolean d() {
        return a().getBoolean("using_cert", false);
    }

    public final String e() {
        String uuid = UUID.randomUUID().toString();
        return String.valueOf(uuid.substring(0, uuid.length() - 12)).concat("10ca1ad1abe1");
    }

    public final String g() {
        return a().getString("fake_adid_key", "");
    }

    public final String h() {
        return a().getString("adid_key", "");
    }

    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            if (!a().contains("enable_limit_ad_tracking")) {
                a(false);
            }
            z = a().getBoolean("enable_limit_ad_tracking", false);
        }
        return z;
    }

    private final boolean a(UUID uuid, byte[] bArr) {
        try {
            return uuid.equals(v.a(bArr));
        } catch (IOException | IllegalArgumentException | NullPointerException | GeneralSecurityException e2) {
            f.a(this.d, "adidMatchPublicKey", e2);
            return false;
        }
    }

    public final boolean f() {
        int i = Build.VERSION.SDK_INT;
        if (awhe.a.a().a()) {
            try {
                if (Settings.Global.getInt(this.d.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    return a().getBoolean("enable_debug_logging", false);
                }
            } catch (Exception e2) {
                Log.w("AdvertisingIdSettings", "Fail to determine debug setting.", e2);
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final SharedPreferences a() {
        return this.d.getSharedPreferences("adid_settings", 4);
    }

    public final aucd a(String str) {
        String str2;
        int i;
        aucd o = aotp.f.o();
        if (TextUtils.isEmpty(str)) {
            return o;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aotp aotp = (aotp) o.b;
        str.getClass();
        aotp.a |= 2;
        aotp.c = str;
        PackageManager packageManager = this.d.getPackageManager();
        try {
            str2 = packageManager.getInstallerPackageName(str);
        } catch (RuntimeException e2) {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aotp aotp2 = (aotp) o.b;
            str2.getClass();
            aotp2.a |= 4;
            aotp2.e = str2;
        }
        try {
            Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
            if (signatureArr != null) {
                i = Math.min(5, signatureArr.length);
            } else {
                i = 0;
            }
            for (int i2 = 0; i2 < i; i2++) {
                Signature signature = signatureArr[i2];
                if (signature != null) {
                    byte[] byteArray = signature.toByteArray();
                    if (!a(byteArray)) {
                        byte[] a2 = f.a(byteArray);
                        if (!a(a2)) {
                            auay a3 = auay.a(a2);
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aotp aotp3 = (aotp) o.b;
                            a3.getClass();
                            if (!aotp3.d.a()) {
                                aotp3.d = aucj.a(aotp3.d);
                            }
                            aotp3.d.add(a3);
                        }
                    }
                }
            }
            return o;
        } catch (PackageManager.NameNotFoundException e3) {
            f.a(this.d, "getPackageInfoError", (Throwable) e3);
            return o;
        }
    }

    public final String a(String str, int i) {
        return i != Process.myUid() ? this.d.getPackageManager().getNameForUid(i) : str;
    }

    public final String a(boolean z, boolean z2, String str, String str2) {
        if (z) {
            iva.b(!str2.isEmpty());
        } else {
            iva.b(str2.isEmpty());
        }
        a().edit().putBoolean("enable_debug_logging", z).putBoolean("using_cert", z2).putString("adid_key", str).putString("fake_adid_key", str2).apply();
        j();
        return z ? str2 : str;
    }

    public final void a(boolean z) {
        synchronized (this.a) {
            a().edit().putBoolean("enable_limit_ad_tracking", z).apply();
            j();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0037 A[Catch:{ IllegalArgumentException -> 0x00f5, NullPointerException -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0115 A[Catch:{ IllegalArgumentException -> 0x00f5, NullPointerException -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0116 A[Catch:{ IllegalArgumentException -> 0x00f5, NullPointerException -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0138 A[Catch:{ IllegalArgumentException -> 0x00f5, NullPointerException -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0139 A[Catch:{ IllegalArgumentException -> 0x00f5, NullPointerException -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015f A[Catch:{ IllegalArgumentException -> 0x00f5, NullPointerException -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016e A[SYNTHETIC, Splitter:B:68:0x016e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a(java.lang.String r10, java.lang.String r11, com.google.android.gms.ads.identifier.settings.d r12) {
        /*
            r9 = this;
            boolean r0 = com.google.android.gms.ads.identifier.settings.t.b(r10)
            r1 = 0
            if (r0 == 0) goto L_0x017e
            boolean r0 = defpackage.awhh.g()
            if (r0 == 0) goto L_0x017e
            com.google.android.gms.ads.identifier.settings.w r0 = new com.google.android.gms.ads.identifier.settings.w
            android.content.Context r2 = r9.d
            java.lang.String r3 = "pending"
            r0.<init>(r11, r2, r3)
            java.lang.Object r11 = r9.a     // Catch:{ all -> 0x0174 }
            monitor-enter(r11)     // Catch:{ all -> 0x0174 }
            boolean r2 = r9.d()     // Catch:{ all -> 0x0171 }
            if (r2 == 0) goto L_0x0020
            goto L_0x002b
        L_0x0020:
            boolean r2 = defpackage.awhh.e()     // Catch:{ all -> 0x0171 }
            if (r2 != 0) goto L_0x002b
            monitor-exit(r11)     // Catch:{ all -> 0x0171 }
        L_0x0027:
            r0.close()
            return r1
        L_0x002b:
            com.google.android.gms.ads.identifier.settings.v r2 = r9.e     // Catch:{ all -> 0x0171 }
            byte[] r2 = r2.c()     // Catch:{ all -> 0x0171 }
            boolean r3 = a((byte[]) r2)     // Catch:{ all -> 0x0171 }
            if (r3 != 0) goto L_0x016e
            aott r3 = defpackage.aott.i     // Catch:{ all -> 0x0171 }
            aucd r3 = r3.o()     // Catch:{ all -> 0x0171 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0171 }
            boolean r6 = r3.c     // Catch:{ all -> 0x0171 }
            r7 = 0
            if (r6 != 0) goto L_0x0047
            goto L_0x004c
        L_0x0047:
            r3.c()     // Catch:{ all -> 0x0171 }
            r3.c = r7     // Catch:{ all -> 0x0171 }
        L_0x004c:
            aucj r6 = r3.b     // Catch:{ all -> 0x0171 }
            aott r6 = (defpackage.aott) r6     // Catch:{ all -> 0x0171 }
            int r8 = r6.a     // Catch:{ all -> 0x0171 }
            r8 = r8 | 4
            r6.a = r8     // Catch:{ all -> 0x0171 }
            r6.f = r4     // Catch:{ all -> 0x0171 }
            r10.getClass()     // Catch:{ all -> 0x0171 }
            r4 = r8 | 512(0x200, float:7.175E-43)
            r6.a = r4     // Catch:{ all -> 0x0171 }
            r6.h = r10     // Catch:{ all -> 0x0171 }
            r12.a(r3)     // Catch:{ all -> 0x0171 }
            com.google.android.gms.ads.identifier.settings.v r12 = r9.e     // Catch:{ all -> 0x0171 }
            aotw r12 = r12.a()     // Catch:{ all -> 0x0171 }
            if (r12 == 0) goto L_0x0087
            boolean r4 = r3.c     // Catch:{ all -> 0x0171 }
            if (r4 != 0) goto L_0x0071
        L_0x0070:
            goto L_0x0077
        L_0x0071:
            r3.c()     // Catch:{ all -> 0x0171 }
            r3.c = r7     // Catch:{ all -> 0x0171 }
            goto L_0x0070
        L_0x0077:
            aucj r4 = r3.b     // Catch:{ all -> 0x0171 }
            aott r4 = (defpackage.aott) r4     // Catch:{ all -> 0x0171 }
            r12.getClass()     // Catch:{ all -> 0x0171 }
            r4.g = r12     // Catch:{ all -> 0x0171 }
            int r12 = r4.a     // Catch:{ all -> 0x0171 }
            r12 = r12 | 128(0x80, float:1.794E-43)
            r4.a = r12     // Catch:{ all -> 0x0171 }
            goto L_0x00a4
        L_0x0087:
            auay r12 = defpackage.auay.a((byte[]) r2)     // Catch:{ all -> 0x0171 }
            boolean r4 = r3.c     // Catch:{ all -> 0x0171 }
            if (r4 != 0) goto L_0x0090
            goto L_0x0095
        L_0x0090:
            r3.c()     // Catch:{ all -> 0x0171 }
            r3.c = r7     // Catch:{ all -> 0x0171 }
        L_0x0095:
            aucj r4 = r3.b     // Catch:{ all -> 0x0171 }
            aott r4 = (defpackage.aott) r4     // Catch:{ all -> 0x0171 }
            r12.getClass()     // Catch:{ all -> 0x0171 }
            int r5 = r4.a     // Catch:{ all -> 0x0171 }
            r5 = r5 | 1
            r4.a = r5     // Catch:{ all -> 0x0171 }
            r4.d = r12     // Catch:{ all -> 0x0171 }
        L_0x00a4:
            boolean r12 = defpackage.awhh.e()     // Catch:{ all -> 0x0171 }
            if (r12 != 0) goto L_0x00ab
            goto L_0x00fd
        L_0x00ab:
            java.lang.String r12 = r9.c()     // Catch:{ IllegalArgumentException -> 0x00f5, NullPointerException -> 0x00f3 }
            java.util.UUID r12 = java.util.UUID.fromString(r12)     // Catch:{ IllegalArgumentException -> 0x00f5, NullPointerException -> 0x00f3 }
            if (r12 == 0) goto L_0x00fd
            boolean r2 = r9.a((java.util.UUID) r12, (byte[]) r2)     // Catch:{ all -> 0x0171 }
            if (r2 != 0) goto L_0x00fd
            r2 = 16
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0171 }
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)     // Catch:{ all -> 0x0171 }
            long r4 = r12.getMostSignificantBits()     // Catch:{ all -> 0x0171 }
            r2.putLong(r4)     // Catch:{ all -> 0x0171 }
            long r4 = r12.getLeastSignificantBits()     // Catch:{ all -> 0x0171 }
            r2.putLong(r4)     // Catch:{ all -> 0x0171 }
            byte[] r12 = r2.array()     // Catch:{ all -> 0x0171 }
            auay r12 = defpackage.auay.a((byte[]) r12)     // Catch:{ all -> 0x0171 }
            boolean r2 = r3.c     // Catch:{ all -> 0x0171 }
            if (r2 != 0) goto L_0x00de
            goto L_0x00e3
        L_0x00de:
            r3.c()     // Catch:{ all -> 0x0171 }
            r3.c = r7     // Catch:{ all -> 0x0171 }
        L_0x00e3:
            aucj r2 = r3.b     // Catch:{ all -> 0x0171 }
            aott r2 = (defpackage.aott) r2     // Catch:{ all -> 0x0171 }
            r12.getClass()     // Catch:{ all -> 0x0171 }
            int r4 = r2.a     // Catch:{ all -> 0x0171 }
            r4 = r4 | 2
            r2.a = r4     // Catch:{ all -> 0x0171 }
            r2.e = r12     // Catch:{ all -> 0x0171 }
            goto L_0x00fd
        L_0x00f3:
            r12 = move-exception
            goto L_0x00f6
        L_0x00f5:
            r12 = move-exception
        L_0x00f6:
            android.content.Context r2 = r9.d     // Catch:{ all -> 0x0171 }
            java.lang.String r4 = "adidMatchPublicKey"
            com.google.android.gms.ads.identifier.settings.f.a((android.content.Context) r2, (java.lang.String) r4, (java.lang.Throwable) r12)     // Catch:{ all -> 0x0171 }
        L_0x00fd:
            aucj r12 = r3.i()     // Catch:{ all -> 0x0171 }
            aott r12 = (defpackage.aott) r12     // Catch:{ all -> 0x0171 }
            byte[] r12 = r12.k()     // Catch:{ all -> 0x0171 }
            aotw r2 = defpackage.aotw.d     // Catch:{ all -> 0x0171 }
            aucd r2 = r2.o()     // Catch:{ all -> 0x0171 }
            auay r3 = defpackage.auay.a((byte[]) r12)     // Catch:{ all -> 0x0171 }
            boolean r4 = r2.c     // Catch:{ all -> 0x0171 }
            if (r4 != 0) goto L_0x0116
            goto L_0x011b
        L_0x0116:
            r2.c()     // Catch:{ all -> 0x0171 }
            r2.c = r7     // Catch:{ all -> 0x0171 }
        L_0x011b:
            aucj r4 = r2.b     // Catch:{ all -> 0x0171 }
            aotw r4 = (defpackage.aotw) r4     // Catch:{ all -> 0x0171 }
            r3.getClass()     // Catch:{ all -> 0x0171 }
            int r5 = r4.a     // Catch:{ all -> 0x0171 }
            r5 = r5 | 1
            r4.a = r5     // Catch:{ all -> 0x0171 }
            r4.b = r3     // Catch:{ all -> 0x0171 }
            com.google.android.gms.ads.identifier.settings.v r3 = r9.e     // Catch:{ all -> 0x0171 }
            byte[] r12 = r3.b(r12)     // Catch:{ all -> 0x0171 }
            auay r12 = defpackage.auay.a((byte[]) r12)     // Catch:{ all -> 0x0171 }
            boolean r3 = r2.c     // Catch:{ all -> 0x0171 }
            if (r3 != 0) goto L_0x0139
            goto L_0x013e
        L_0x0139:
            r2.c()     // Catch:{ all -> 0x0171 }
            r2.c = r7     // Catch:{ all -> 0x0171 }
        L_0x013e:
            aucj r3 = r2.b     // Catch:{ all -> 0x0171 }
            aotw r3 = (defpackage.aotw) r3     // Catch:{ all -> 0x0171 }
            r12.getClass()     // Catch:{ all -> 0x0171 }
            int r4 = r3.a     // Catch:{ all -> 0x0171 }
            r4 = r4 | 2
            r3.a = r4     // Catch:{ all -> 0x0171 }
            r3.c = r12     // Catch:{ all -> 0x0171 }
            aucj r12 = r2.i()     // Catch:{ all -> 0x0171 }
            aotw r12 = (defpackage.aotw) r12     // Catch:{ all -> 0x0171 }
            byte[] r12 = r12.k()     // Catch:{ all -> 0x0171 }
            com.google.android.gms.ads.identifier.settings.t r2 = r9.f     // Catch:{ all -> 0x0171 }
            aoub r10 = r2.a(r10)     // Catch:{ all -> 0x0171 }
            if (r10 == 0) goto L_0x0164
            byte[] r12 = r10.a(r12, r1)     // Catch:{ all -> 0x0171 }
            goto L_0x0165
        L_0x0164:
        L_0x0165:
            java.lang.String r10 = "succeeded"
            r0.d = r10     // Catch:{ all -> 0x0171 }
            monitor-exit(r11)     // Catch:{ all -> 0x0171 }
            r0.close()
            return r12
        L_0x016e:
            monitor-exit(r11)     // Catch:{ all -> 0x0171 }
            goto L_0x0027
        L_0x0171:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0171 }
            throw r10     // Catch:{ all -> 0x0174 }
        L_0x0174:
            r10 = move-exception
            r0.close()     // Catch:{ all -> 0x0179 }
            goto L_0x017d
        L_0x0179:
            r11 = move-exception
            defpackage.apev.a((java.lang.Throwable) r10, (java.lang.Throwable) r11)
        L_0x017d:
            throw r10
        L_0x017e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.settings.e.a(java.lang.String, java.lang.String, com.google.android.gms.ads.identifier.settings.d):byte[]");
    }
}
