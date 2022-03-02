package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aiod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiod {
    public static final int[] l = {0, 1, 2, 3, 7, 8};
    public static final int[] m = {0, 1, 2, 3, 7, 8, 17, 16, 20, 22};
    public final Context a;
    public final aiei b;
    public final aiib c;
    public final aimj d;
    public final ahjj e;
    public final jfp f;
    public final ahyz g;
    public final ahzd h;
    public final ahzi i;
    public final jhr j;
    public final ArrayList k = new ArrayList();
    private aiop n;
    private final jfo o;

    public aiod(Context context) {
        ahyz ahyz;
        ahzd ahzd;
        ahzi ahzi;
        List<ResolveInfo> queryIntentActivities;
        Context context2 = context;
        aimj aimj = new aimj(context2);
        aiib aiib = new aiib(context2);
        jhr a2 = jhr.a(context);
        aiii aiii = aiib.f;
        aiei aiei = r1;
        jhr jhr = a2;
        aiei aiei2 = new aiei(context, jhr.a(context), new aifs(context2, new qvr(aieo.a())), hya.a(context), rns.f(context), new ajqf(), jkn.a(context), jhl.a(context2, (Handler) new qvr(aieo.a())), new aicu(), ikh.a(context2, "com.google.android.location.internal.GoogleLocationManagerService", aidn.a), jgy.a(context), jkb.a(context), aieo.a(), aiii);
        Context context3 = context;
        this.a = context3;
        this.d = aimj;
        this.c = aiib;
        this.b = aiei;
        this.n = new aiop(context3);
        this.e = new ahjj(context3);
        this.f = new jfp("GLMSImpl", 9);
        jfo jfo = new jfo(this.f);
        this.o = jfo;
        if (jkr.g()) {
            ahyz = new ahzc(context3, jfo);
        } else {
            ahyz = new ahyz();
        }
        this.g = ahyz;
        ahyz.a();
        jfo jfo2 = this.o;
        if (jkr.c()) {
            ahzd = new ahzh(context3, jfo2);
        } else {
            ahzd = new ahzd();
        }
        this.h = ahzd;
        ahzd.a();
        jfo jfo3 = this.o;
        if (jkr.c()) {
            ahzi = new ahzm(context3, jfo3);
        } else {
            ahzi = new ahzi();
        }
        this.i = ahzi;
        ahzi.a();
        aios aios = new aios(context3, this.o);
        int i2 = Build.VERSION.SDK_INT;
        if (!jkr.g() && jgu.f(aios.a)) {
            String[] strArr = new String[1];
            if (ayet.c() && (queryIntentActivities = aios.a.getPackageManager().queryIntentActivities(new Intent("android.settings.SETTINGS"), 65536)) != null && !queryIntentActivities.isEmpty()) {
                strArr[0] = queryIntentActivities.get(0).activityInfo.packageName;
            }
            aios.a.getContentResolver().registerContentObserver(Settings.Global.getUriFor("wifi_scan_always_enabled"), false, new aior(aios, "location", "GoogleLocationManagerServiceImpl", aios.b, strArr));
        }
        this.j = jhr;
        context3.sendBroadcast(new Intent("android.location.HIGH_POWER_REQUEST_CHANGE"));
    }

    public final synchronized aiop a() {
        if (this.n == null) {
            this.n = new aiop(this.a);
        }
        return this.n;
    }

    public final int b(Intent intent) {
        int size = this.k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Intent) this.k.get(i2)).filterEquals(intent)) {
                return i2;
            }
        }
        return -1;
    }

    public final int c() {
        if (e()) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("activityRecognitionAccuracyModeName", 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getInt("arAccuracyModePref", 0);
            }
            Log.e("GLMSImpl", "null pref for activity recognition accuracy mode was found ");
            return 0;
        }
        throw new SecurityException("Activity recognition  setActivityRecognitionMode is only available to zero party");
    }

    public final boolean d() {
        return hya.a(this.a).a(Binder.getCallingUid());
    }

    public final boolean e() {
        return hxz.a(this.a, Binder.getCallingUid());
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba A[Catch:{ all -> 0x019b }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.common.api.Status a(android.app.PendingIntent r13, java.lang.String r14, com.google.android.gms.location.SleepSegmentRequest r15) {
        /*
            r12 = this;
            boolean r0 = defpackage.ayfc.b()
            if (r0 != 0) goto L_0x000b
            android.content.Context r0 = r12.a
            defpackage.ahjk.a((android.content.Context) r0, (java.lang.String) r14)
        L_0x000b:
            boolean r0 = r12.d()
            ayfc r1 = defpackage.ayfc.a
            ayfd r1 = r1.a()
            boolean r1 = r1.sleepDetectionFirstPartyOnly()
            if (r1 != 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            if (r0 == 0) goto L_0x01a0
        L_0x001e:
            r12.a((android.app.PendingIntent) r13, (java.lang.String) r14)
            int r14 = android.os.Binder.getCallingUid()
            java.lang.String r1 = r13.getTargetPackage()
            android.os.WorkSource r14 = defpackage.jlr.a((int) r14, (java.lang.String) r1)
            long r1 = android.os.Binder.clearCallingIdentity()
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x019b }
            java.lang.String r3 = r13.getCreatorPackage()     // Catch:{ all -> 0x019b }
            android.content.Context r4 = r12.a     // Catch:{ all -> 0x019b }
            boolean r5 = defpackage.ayfc.h()     // Catch:{ all -> 0x019b }
            r6 = 44
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x00b7
            android.content.pm.PackageManager r5 = r4.getPackageManager()     // Catch:{ all -> 0x019b }
            java.lang.String r9 = "android.hardware.sensor.accelerometer"
            boolean r9 = r5.hasSystemFeature(r9)     // Catch:{ all -> 0x019b }
            if (r9 == 0) goto L_0x00b7
            java.lang.String r9 = "android.hardware.sensor.light"
            boolean r5 = r5.hasSystemFeature(r9)     // Catch:{ all -> 0x019b }
            if (r5 == 0) goto L_0x00b7
            ayfc r5 = defpackage.ayfc.a     // Catch:{ all -> 0x019b }
            ayfd r5 = r5.a()     // Catch:{ all -> 0x019b }
            long r9 = r5.minBedtimeSupportedGmscoreVersion()     // Catch:{ all -> 0x019b }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ all -> 0x019b }
            java.lang.String r5 = "com.google.android.gms"
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r8)     // Catch:{ NameNotFoundException -> 0x006e }
            int r4 = r4.versionCode     // Catch:{ NameNotFoundException -> 0x006e }
            goto L_0x0070
        L_0x006e:
            r4 = move-exception
            r4 = 0
        L_0x0070:
            long r4 = (long) r4
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00b7
            ayfc r4 = defpackage.ayfc.a     // Catch:{ all -> 0x019b }
            ayfd r4 = r4.a()     // Catch:{ all -> 0x019b }
            java.lang.String r4 = r4.sleepApiWhitelist()     // Catch:{ all -> 0x019b }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x019b }
            if (r5 != 0) goto L_0x00b6
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x019b }
            if (r5 != 0) goto L_0x00b6
            amsk r5 = defpackage.amsk.a((char) r6)     // Catch:{ all -> 0x019b }
            java.util.List r4 = r5.c(r4)     // Catch:{ all -> 0x019b }
            boolean r4 = r4.contains(r3)     // Catch:{ all -> 0x019b }
            if (r4 != 0) goto L_0x00b5
            java.lang.SecurityException r13 = new java.lang.SecurityException     // Catch:{ all -> 0x019b }
            java.lang.String r14 = "App should be whitelisted for Sleep Segment API - "
            java.lang.String r15 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x019b }
            int r0 = r15.length()     // Catch:{ all -> 0x019b }
            if (r0 != 0) goto L_0x00ad
            java.lang.String r15 = new java.lang.String     // Catch:{ all -> 0x019b }
            r15.<init>(r14)     // Catch:{ all -> 0x019b }
            goto L_0x00b1
        L_0x00ad:
            java.lang.String r15 = r14.concat(r15)     // Catch:{ all -> 0x019b }
        L_0x00b1:
            r13.<init>(r15)     // Catch:{ all -> 0x019b }
            throw r13     // Catch:{ all -> 0x019b }
        L_0x00b5:
            goto L_0x00b8
        L_0x00b6:
            goto L_0x00b8
        L_0x00b7:
            r7 = 0
        L_0x00b8:
            if (r7 == 0) goto L_0x011e
            android.content.Context r4 = r12.a     // Catch:{ all -> 0x019b }
            ayfc r5 = defpackage.ayfc.a     // Catch:{ all -> 0x019b }
            ayfd r5 = r5.a()     // Catch:{ all -> 0x019b }
            java.lang.String r5 = r5.preferredSleepTimeWhitelist()     // Catch:{ all -> 0x019b }
            boolean r9 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x019b }
            if (r9 != 0) goto L_0x00e1
            boolean r9 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x019b }
            if (r9 != 0) goto L_0x00e1
            amsk r6 = defpackage.amsk.a((char) r6)     // Catch:{ all -> 0x019b }
            java.util.List r5 = r6.c(r5)     // Catch:{ all -> 0x019b }
            boolean r3 = r5.contains(r3)     // Catch:{ all -> 0x019b }
            if (r3 != 0) goto L_0x00e1
            goto L_0x011e
        L_0x00e1:
            if (r15 == 0) goto L_0x011e
            java.util.List r3 = r15.a     // Catch:{ all -> 0x019b }
            if (r3 == 0) goto L_0x011e
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x019b }
            if (r3 != 0) goto L_0x011e
            java.util.List r3 = r15.a     // Catch:{ all -> 0x019b }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ all -> 0x019b }
            com.google.android.gms.location.UserPreferredSleepWindow r3 = (com.google.android.gms.location.UserPreferredSleepWindow) r3     // Catch:{ all -> 0x019b }
            java.lang.String r5 = "SLEEP_PREF_NAME"
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r8)     // Catch:{ all -> 0x019b }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x019b }
            java.lang.String r5 = "userPreferredSleepStartHour"
            int r6 = r3.a     // Catch:{ all -> 0x019b }
            r4.putInt(r5, r6)     // Catch:{ all -> 0x019b }
            java.lang.String r5 = "userPreferredSleepStartMinute"
            int r6 = r3.b     // Catch:{ all -> 0x019b }
            r4.putInt(r5, r6)     // Catch:{ all -> 0x019b }
            java.lang.String r5 = "userPreferredSleepEndHour"
            int r6 = r3.c     // Catch:{ all -> 0x019b }
            r4.putInt(r5, r6)     // Catch:{ all -> 0x019b }
            java.lang.String r5 = "userPreferredSleepEndMinute"
            int r3 = r3.d     // Catch:{ all -> 0x019b }
            r4.putInt(r5, r3)     // Catch:{ all -> 0x019b }
            r4.commit()     // Catch:{ all -> 0x019b }
        L_0x011e:
            android.os.Binder.restoreCallingIdentity(r1)
            if (r7 != 0) goto L_0x0126
            com.google.android.gms.common.api.Status r13 = com.google.android.gms.common.api.Status.e
            return r13
        L_0x0126:
            atir r1 = new atir
            android.content.Context r2 = r12.a
            java.lang.String r2 = r2.getPackageName()
            r1.<init>(r2)
            android.content.Intent r2 = r1.a
            java.lang.String r3 = "com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_REMOVE"
            boolean r2 = r2.hasExtra(r3)
            if (r2 == 0) goto L_0x013e
            defpackage.atir.b()
        L_0x013e:
            android.content.Intent r2 = r1.a
            java.lang.String r3 = "com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_PENDING_INTENT"
            r2.putExtra(r3, r13)
            android.content.Intent r13 = r1.a
            java.lang.String r2 = "com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_TAG"
            java.lang.String r3 = "GLMSImplProxy"
            r13.putExtra(r2, r3)
            if (r15 != 0) goto L_0x0151
            goto L_0x018d
        L_0x0151:
            java.util.List r13 = r15.a
            if (r13 != 0) goto L_0x0156
            goto L_0x0186
        L_0x0156:
            boolean r2 = r13.isEmpty()
            if (r2 != 0) goto L_0x0186
            java.lang.Object r13 = r13.get(r8)
            com.google.android.gms.location.UserPreferredSleepWindow r13 = (com.google.android.gms.location.UserPreferredSleepWindow) r13
            android.content.Intent r2 = r1.a
            int r3 = r13.a
            java.lang.String r4 = "com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_START_HOUR"
            r2.putExtra(r4, r3)
            android.content.Intent r2 = r1.a
            int r3 = r13.b
            java.lang.String r4 = "com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_START_MINUTE"
            r2.putExtra(r4, r3)
            android.content.Intent r2 = r1.a
            int r3 = r13.c
            java.lang.String r4 = "com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_END_HOUR"
            r2.putExtra(r4, r3)
            android.content.Intent r2 = r1.a
            int r13 = r13.d
            java.lang.String r3 = "com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_END_MINUTE"
            r2.putExtra(r3, r13)
        L_0x0186:
            android.content.Intent r13 = r1.a
            java.lang.String r2 = "com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_REQUEST"
            defpackage.ivy.a((com.google.android.gms.common.internal.safeparcel.SafeParcelable) r15, (android.content.Intent) r13, (java.lang.String) r2)
        L_0x018d:
            r1.a((boolean) r0)
            r1.a((android.os.WorkSource) r14)
            android.content.Context r13 = r12.a
            r1.a((android.content.Context) r13)
            com.google.android.gms.common.api.Status r13 = com.google.android.gms.common.api.Status.a
            return r13
        L_0x019b:
            r13 = move-exception
            android.os.Binder.restoreCallingIdentity(r1)
            throw r13
        L_0x01a0:
            java.lang.SecurityException r13 = new java.lang.SecurityException
            java.lang.String r14 = "This API is not supported yet."
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiod.a(android.app.PendingIntent, java.lang.String, com.google.android.gms.location.SleepSegmentRequest):com.google.android.gms.common.api.Status");
    }

    public final boolean b() {
        return ajql.a(this.a) == 2;
    }

    public final void a(int i2) {
        if (ajql.a(this.a) >= i2) {
            return;
        }
        if (i2 != 2) {
            throw new SecurityException("Client must have ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION permission to perform any location operations.");
        }
        throw new SecurityException("Client must have ACCESS_FINE_LOCATION permission to request PRIORITY_HIGH_ACCURACY locations.");
    }

    public final void a(PendingIntent pendingIntent) {
        this.b.a(pendingIntent);
    }

    public final void a(PendingIntent pendingIntent, String str) {
        if (pendingIntent == null) {
            throw new IllegalArgumentException("invalid null pending intent");
        } else if (!str.equals(pendingIntent.getTargetPackage())) {
            throw new SecurityException("PendingIntent's target package can't be different to the request package.");
        }
    }

    public final void a(Intent intent) {
        ahpx.a(this.a);
        synchronized (this.k) {
            this.k.isEmpty();
            if (b(intent) < 0) {
                this.k.add(intent);
            }
        }
    }

    @Deprecated
    public final void a(LocationRequest locationRequest, ref ref, String str) {
        a(LocationRequestInternal.a((String) null, locationRequest), ref, (rge) null, str);
    }

    public final void a(LocationRequestInternal locationRequestInternal) {
        int i2;
        if (locationRequestInternal.b.a == 100) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        a(i2);
        boolean d2 = d();
        if ((locationRequestInternal.e || !locationRequestInternal.c.isEmpty() || locationRequestInternal.i) && !d2) {
            Log.e("GLMSImpl", String.format("Uid %s must be signed by Google to use internal features: %s", new Object[]{Integer.valueOf(Binder.getCallingUid()), locationRequestInternal}));
            locationRequestInternal.e = false;
            locationRequestInternal.c = LocationRequestInternal.a;
            locationRequestInternal.i = false;
        }
    }

    public final void a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        a(locationRequestInternal);
        this.b.a(locationRequestInternal, pendingIntent, b());
    }

    public final void a(LocationRequestInternal locationRequestInternal, ref ref, rge rge, String str) {
        a(locationRequestInternal);
        aiei aiei = this.b;
        boolean b2 = b();
        if (ref == null) {
            aihr.a("Received null listener to add uid:%s packages:%s request: %s", Integer.valueOf(Binder.getCallingUid()), Arrays.toString(jni.b(aiei.f).a(Binder.getCallingUid())), locationRequestInternal);
            return;
        }
        aiei.b(locationRequestInternal, str);
        LocationRequestInternal b3 = LocationRequestInternal.b(locationRequestInternal);
        boolean a2 = aiei.a(b3, str);
        aiei.p.a(21, new aiea(aiei, Binder.getCallingUid(), str, b3, b2, a2, ref, rge));
    }

    public final void a(ref ref) {
        this.b.a(ref);
    }
}
