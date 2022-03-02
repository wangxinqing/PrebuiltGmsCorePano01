package com.google.android.gms.stats;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlatformStatsCollectorChimeraService extends qwf {
    public static final Map a;
    private ConcurrentHashMap b;
    private hol c;
    private hph d;

    static {
        HashMap hashMap = new HashMap();
        a(hashMap, new acsa());
        a(hashMap, new acti());
        a(hashMap, new actk());
        a(hashMap, new acsw());
        a(hashMap, new acto());
        a(hashMap, new acsj("Dropbox"));
        a(hashMap, acsj.h());
        a(hashMap, new actj());
        a(hashMap, new actn());
        a(hashMap, new actf());
        a(hashMap, new acrr());
        a(hashMap, new acsv());
        a(hashMap, new actq());
        a(hashMap, new actr());
        a(hashMap, new acts());
        a(hashMap, new actt());
        a(hashMap, new actl());
        a(hashMap, new actm());
        a = Collections.unmodifiableMap(hashMap);
    }

    private final void a(acrk acrk) {
        long c2 = acrk.c();
        if (c2 == 0) {
            String valueOf = String.valueOf(acrk.a);
            Log.e("PlatformStatsCollectorS", valueOf.length() == 0 ? new String("Task scheduled with period of 0 for task: ") : "Task scheduled with period of 0 for task: ".concat(valueOf));
            hph hph = this.d;
            String valueOf2 = String.valueOf(acrk.a);
            hph.c(valueOf2.length() == 0 ? new String("PeriodicTaskInvalidPeriod") : "PeriodicTaskInvalidPeriod".concat(valueOf2)).a();
            this.d.d();
            return;
        }
        qxi qxi = new qxi();
        double d2 = (double) c2;
        Double.isNaN(d2);
        qxi.a(c2, (long) (d2 * 0.1d), qxr.a);
        qxi.i = "com.google.android.gms.stats.PlatformStatsCollectorService";
        qxi.a(2);
        qxi.a(acrk.g() ? 1 : 0, acrk.g() ? 1 : 0);
        qxi.b(1);
        qxi.n = true;
        qxi.k = acrk.a;
        ihs b2 = ihs.b();
        qwq.a((Context) b2).a((qxx) qxi.b());
        hph hph2 = this.d;
        String valueOf3 = String.valueOf(acrk.a);
        hph2.c(valueOf3.length() == 0 ? new String("PeriodicTaskScheduledFor") : "PeriodicTaskScheduledFor".concat(valueOf3)).a();
        SharedPreferences.Editor edit = b2.getSharedPreferences(acrk.a, 0).edit();
        edit.putLong(":recordIntervalSecs", c2);
        edit.putBoolean(":requiresCharging", acrk.g());
        edit.apply();
    }

    static ConcurrentHashMap b(Context context) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.metrics", 0);
        new HashMap();
        try {
            for (String next : sharedPreferences.getAll().keySet()) {
                if (next != null && next.endsWith("_collection_config")) {
                    String substring = next.substring(0, next.indexOf("_collection_config"));
                    if (!substring.isEmpty()) {
                        String string = sharedPreferences.getString(next, "");
                        if (!string.isEmpty()) {
                            try {
                                acrr acrr = new acrr(substring, (avvp) aucj.a((aucj) avvp.l, Base64.decode(string, 0), aubs.c()));
                                if (acrr.h != 0) {
                                    concurrentHashMap.put(substring, acrr);
                                }
                            } catch (auda | IllegalArgumentException e) {
                                Log.e("PlatformStatsCollectorS", "Fail to de-serialize proto", e);
                            }
                        }
                    }
                }
            }
            return concurrentHashMap;
        } catch (NullPointerException e2) {
            Log.e("PlatformStatsCollectorS", "Fail to get shared preferences map", e2);
            return concurrentHashMap;
        }
    }

    public final void aH() {
        a(getBaseContext());
    }

    public final void onCreate() {
        super.onCreate();
        this.c = new hol(this, (String) null, (String) null);
        this.d = new hph(this.c, "PLATFORM_STATS_COUNTERS", 1024);
        this.b = b(getBaseContext());
    }

    public static void a(Context context) {
        if (acub.a()) {
            long nextInt = (long) new Random().nextInt((int) TimeUnit.DAYS.toSeconds(1));
            HashMap hashMap = new HashMap();
            hashMap.putAll(a);
            hashMap.putAll(b(context));
            for (acrk acrk : hashMap.values()) {
                if (acrk.e()) {
                    qwq a2 = qwq.a(context);
                    qxf qxf = new qxf();
                    qxf.a(nextInt, 60 + nextInt);
                    qxf.i = "com.google.android.gms.stats.PlatformStatsCollectorService";
                    qxf.a(2);
                    qxf.a(acrk.g() ? 1 : 0, acrk.g() ? 1 : 0);
                    qxf.b(1);
                    qxf.n = true;
                    qxf.k = acrk.a;
                    a2.a((qxx) qxf.b());
                    SharedPreferences.Editor edit = context.getSharedPreferences(acrk.a, 0).edit();
                    edit.putLong(":recordIntervalSecs", -1);
                    edit.apply();
                }
            }
        }
    }

    private static void a(Map map, acrk acrk) {
        map.put(acrk.a, acrk);
    }

    public final int a(qxz qxz) {
        Object obj;
        int i;
        String substring;
        String str = qxz.a;
        hph hph = this.d;
        String valueOf = String.valueOf(str);
        hph.c(valueOf.length() == 0 ? new String("PeriodicOnRunTaskCountFor") : "PeriodicOnRunTaskCountFor".concat(valueOf)).a();
        if (!a.containsKey(str)) {
            obj = this.b.get(str);
        } else {
            obj = a.get(str);
        }
        acrk acrk = (acrk) obj;
        if (acrk != null) {
            int i2 = 0;
            SharedPreferences sharedPreferences = getSharedPreferences(str, 0);
            long c2 = acrk.c();
            boolean g = acrk.g();
            if (!(c2 == sharedPreferences.getLong(":recordIntervalSecs", -1) && g == sharedPreferences.getBoolean(":requiresCharging", true))) {
                a(acrk);
            }
            if (!acub.a()) {
                hph hph2 = this.d;
                String valueOf2 = String.valueOf(str);
                hph2.c(valueOf2.length() == 0 ? new String("CancellNonDeviceOwnerTasksFor") : "CancellNonDeviceOwnerTasksFor".concat(valueOf2)).a();
                this.d.d();
                return 0;
            }
            try {
                if (str.equals("UnifiedDumpsysTask")) {
                    SharedPreferences sharedPreferences2 = getSharedPreferences("com.google.android.metrics", 0);
                    new HashMap();
                    try {
                        for (String next : sharedPreferences2.getAll().keySet()) {
                            if (next == null) {
                                i2 = 0;
                            } else if (next.endsWith("_collection_config")) {
                                substring = next.substring(i2, next.indexOf("_collection_config"));
                                if (!substring.isEmpty()) {
                                    SharedPreferences sharedPreferences3 = getSharedPreferences(substring, i2);
                                    SharedPreferences.Editor edit = sharedPreferences3.edit();
                                    String string = sharedPreferences2.getString(next, "");
                                    if (string.isEmpty()) {
                                        qwq.a((Context) ihs.b()).a(substring, "com.google.android.gms.stats.PlatformStatsCollectorService");
                                        edit.putString(":unifiedTaskConfig", string);
                                        edit.apply();
                                        this.b.remove(substring);
                                    } else if (!sharedPreferences3.getString(":unifiedTaskConfig", "").equals(string)) {
                                        avvp avvp = (avvp) aucj.a((aucj) avvp.l, Base64.decode(string, i2), aubs.c());
                                        hph hph3 = this.d;
                                        String valueOf3 = String.valueOf(substring);
                                        hph3.c(valueOf3.length() == 0 ? new String("CollectionConfigParseEnablePostV16") : "CollectionConfigParseEnablePostV16".concat(valueOf3)).a();
                                        acrr acrr = new acrr(substring, avvp);
                                        a((acrk) acrr);
                                        this.b.put(substring, acrr);
                                        edit.putString(":unifiedTaskConfig", string);
                                        edit.apply();
                                        i2 = 0;
                                    } else {
                                        i2 = 0;
                                    }
                                } else {
                                    i2 = 0;
                                }
                            } else {
                                i2 = 0;
                            }
                        }
                        i = 0;
                    } catch (NullPointerException e) {
                        Log.e("PlatformStatsCollectorS", "Fail to get shared preferences map", e);
                        i = 0;
                    }
                } else {
                    i = acub.a(str, acrk, this);
                }
                if (i == 0) {
                    hph hph4 = this.d;
                    String valueOf4 = String.valueOf(str);
                    hph4.c(valueOf4.length() == 0 ? new String("UploadSingleTaskSuccess") : "UploadSingleTaskSuccess".concat(valueOf4)).a();
                } else if (i != 2) {
                    hph hph5 = this.d;
                    String valueOf5 = String.valueOf(str);
                    hph5.c(valueOf5.length() == 0 ? new String("UploadSingleTaskOther") : "UploadSingleTaskOther".concat(valueOf5)).a();
                } else {
                    hph hph6 = this.d;
                    String valueOf6 = String.valueOf(str);
                    hph6.c(valueOf6.length() == 0 ? new String("UploadSingleTaskFailure") : "UploadSingleTaskFailure".concat(valueOf6)).a();
                }
                hph hph7 = this.d;
                if (hph7 != null) {
                    hph7.d();
                }
                this.c.a(10, TimeUnit.SECONDS);
                return i;
            } catch (auda | IllegalArgumentException e2) {
                hph hph8 = this.d;
                String valueOf7 = String.valueOf(substring);
                hph8.c(valueOf7.length() == 0 ? new String("UnifiedTaskConfigDeserializationException") : "UnifiedTaskConfigDeserializationException".concat(valueOf7)).a();
                Log.e("PlatformStatsCollectorS", "Fail to de-serialize proto", e2);
                i2 = 0;
            } catch (Throwable th) {
                hph hph9 = this.d;
                String valueOf8 = String.valueOf(str);
                hph9.c(valueOf8.length() == 0 ? new String("UploadSingleTaskSuccess") : "UploadSingleTaskSuccess".concat(valueOf8)).a();
                hph hph10 = this.d;
                if (hph10 != null) {
                    hph10.d();
                }
                this.c.a(10, TimeUnit.SECONDS);
                throw th;
            }
        } else {
            hph hph11 = this.d;
            String valueOf9 = String.valueOf(str);
            hph11.c(valueOf9.length() == 0 ? new String("FailedToGetTaskFor") : "FailedToGetTaskFor".concat(valueOf9)).a();
            this.d.d();
            return 2;
        }
    }
}
