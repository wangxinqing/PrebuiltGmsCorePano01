package defpackage;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Looper;
import com.google.android.gms.R;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.location.collectionlib.RealCollectorConfig;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: aixc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aixc implements aiue, ajqu, aizl, aizp, ajas, ahjc, ajak, ajat, ajac {
    public final Context a;
    public final aicn b;
    public final aivu c;
    public final aixa d;
    public final ahqp e;
    public final aizy f = new ajbt();
    public final ajaa g;
    public final aixp h;
    public final ajab i;
    public final ajbj j;
    public final aixh k;
    public final aizm l;
    public final SensorManager m;
    public final ahyk n;
    public final aizz o;
    public final aixe p;
    public volatile String q;
    public final arnf r;
    public final aiwm s;
    private final aiyq t;
    private final ahlm u;
    private final jkb v;
    private final aizw w;
    private final boolean x;

    public aixc(Context context, aicn aicn, aixa aixa, ajbj ajbj, aizw aizw, arnf arnf) {
        aiym aiym;
        Context context2 = context;
        aicn aicn2 = aicn;
        File file = null;
        this.q = null;
        this.a = context2;
        this.b = aicn2;
        this.d = aixa;
        this.j = ajbj;
        this.w = aizw;
        this.r = arnf;
        boolean z = true;
        this.n = new ahyk(context2, true);
        this.g = new aiwu(context2, aicn2, jlo.b());
        int i2 = Build.VERSION.SDK_INT;
        this.t = new aiyq();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            this.s = new aiwm(defaultAdapter);
        } else {
            this.s = null;
        }
        long a2 = jhg.a(context);
        File filesDir = context.getFilesDir();
        this.o = new ajbu(a2, filesDir != null ? new File(filesDir, "nlp_ck") : file);
        this.e = new ahqp(this.g, this);
        this.c = new aivu(context, this, this.e, aicn, this.t);
        this.e.a();
        aixh aixh = new aixh(context2, this.c, aicn2);
        new ComponentName(aixh.b, aivu.class);
        boolean z2 = false;
        aixh.c[ajbe.LOCATOR.ordinal()] = PendingIntent.getBroadcast(aixh.b, 0, aixh.a("com.google.android.location.ALARM_WAKEUP_LOCATOR"), 0);
        aixh.c[ajbe.ACTIVE_COLLECTOR.ordinal()] = PendingIntent.getBroadcast(aixh.b, 0, aixh.a("com.google.android.location.ALARM_WAKEUP_ACTIVE_COLLECTOR"), 134217728);
        aixh.c[ajbe.BURST_COLLECTOR.ordinal()] = PendingIntent.getBroadcast(aixh.b, 0, aixh.a("com.google.android.location.ALARM_WAKEUP_BURST_COLLECTOR"), 134217728);
        aixh.c[ajbe.PASSIVE_COLLECTOR.ordinal()] = PendingIntent.getBroadcast(aixh.b, 0, aixh.a("com.google.android.location.ALARM_WAKEUP_PASSIVE_COLLECTOR"), 134217728);
        aixh.c[ajbe.CACHE_UPDATER.ordinal()] = PendingIntent.getBroadcast(aixh.b, 0, aixh.a("com.google.android.location.ALARM_WAKEUP_CACHE_UPDATER"), 134217728);
        aixh.c[ajbe.CALIBRATION_COLLECTOR.ordinal()] = PendingIntent.getBroadcast(aixh.b, 0, aixh.a("com.google.android.location.ALARM_WAKEUP_CALIBRATION_COLLECTOR"), 134217728);
        aixh.c[ajbe.SENSOR_COLLECTOR.ordinal()] = PendingIntent.getBroadcast(aixh.b, 0, aixh.a("com.google.android.location.ALARM_WAKEUP_SENSOR_COLLECTOR"), 134217728);
        aixh.c[ajbe.SENSOR_UPLOADER.ordinal()] = PendingIntent.getBroadcast(aixh.b, 0, aixh.a("com.google.android.location.ALARM_WAKEUP_SENSOR_UPLOADER"), 134217728);
        aixh.c[ajbe.ACTIVITY_DETECTION.ordinal()] = PendingIntent.getBroadcast(aixh.b, 0, aixh.a("com.google.android.location.ALARM_WAKEUP_ACTIVITY_DETECTION"), 134217728);
        aixh.c[ajbe.IN_OUT_DOOR_COLLECTOR.ordinal()] = PendingIntent.getBroadcast(aixh.b, 0, aixh.a("com.google.android.location.ALARM_WAKEUP_IN_OUT_DOOR_COLLECTOR"), 134217728);
        aixh.c[ajbe.BURST_COLLECTION_TRIGGER.ordinal()] = PendingIntent.getBroadcast(aixh.b, 0, aixh.a("com.google.android.location.ALARM_WAKEUP_BURST_COLLECTION_TRIGGER"), 134217728);
        aixh.c[ajbe.VEHICLE_EXIT_DETECTOR.ordinal()] = PendingIntent.getBroadcast(aixh.b, 0, aixh.a("com.google.android.location.ALARM_WAKEUP_VEHICLE_EXIT_DETECTOR"), 134217728);
        WifiManager wifiManager = (WifiManager) aixh.b.getApplicationContext().getSystemService("wifi");
        boolean z3 = !jkr.c();
        ajbe[] values = ajbe.values();
        int length = values.length;
        int i3 = 0;
        while (i3 < length) {
            ajbe ajbe = values[i3];
            if (ajbe == ajbe.LOCATOR && z3) {
                aiym = new aiyl(aixh.b, ajbe.a(), wifiManager, ajbe.v);
            } else {
                aiym = new aiym(aixh.b, ajbe.a(), ajbe.v, aiym.b);
            }
            aixh.a[ajbe.ordinal()] = aiym;
            i3++;
            aicn aicn3 = aicn;
            z2 = false;
            z = true;
        }
        this.k = aixh;
        this.l = new ajbs();
        Context context3 = context;
        this.h = new aixp(context3, arnf, aicn, new aixb(this, z), new aixb(this, z2), (WifiManager) context.getApplicationContext().getSystemService("wifi"), this.k.b());
        this.i = new aiwv(context3, this.f, this.k, this.e, this.c, aicn);
        this.m = (SensorManager) context2.getSystemService("sensor");
        this.p = new aixe(context2, this.k, this.o, q());
        this.v = jkb.a(context);
        this.u = new ahlm(this.f);
        this.x = aydu.a.a().requirePackageManagerTelephonyCapability() ? jni.b(context).d("android.hardware.telephony") : true;
    }

    public static boolean q() {
        return jlo.h() == 10;
    }

    public final ahtp a(Set set, Map map, String str, Integer num, boolean z, long j2, aqek aqek, ahss ahss, String str2) {
        aivb aivb = new aivb(ahss, this.k);
        ahue ahue = new ahue();
        ahue.a = set;
        ahue.a(300000);
        byte[] b2 = this.o.b();
        ahue.j = 2;
        ahue.b = str;
        ahue.c = b2;
        ahue.h = false;
        ahue.d = j2;
        ahue.i = null;
        RealCollectorConfig a2 = ahue.a();
        a2.h = z;
        for (Map.Entry entry : map.entrySet()) {
            a2.a((ahup) entry.getKey(), ((Integer) entry.getValue()).intValue());
        }
        return new ahvd(this.k, this.a, a2, this.n, this.h, num, aqek, aivb, new ajrh(str2));
    }

    public final boolean a() {
        return this.x;
    }

    public final aizl b() {
        return this;
    }

    public final boolean bf() {
        try {
            return ((LocationManager) this.a.getSystemService("location")).isProviderEnabled("gps");
        } catch (SecurityException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() == 0) {
                new String("can't check GPS ");
            } else {
                "can't check GPS ".concat(valueOf);
            }
            return false;
        } catch (IllegalArgumentException e3) {
            return false;
        }
    }

    public final int bg() {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        return memoryInfo.getTotalPss();
    }

    public final int bh() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) this.a.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return (int) (memoryInfo.availMem / 1024);
    }

    public final boolean bi() {
        return this.v.a();
    }

    public final long bj() {
        return this.a.getSharedPreferences("SLEEP_PREF_NAME", 0).getLong("LAST_SLEEP_SEGMENT_MILLIS", 0);
    }

    public final ahnj bk() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("SLEEP_PREF_NAME", 0);
        if (sharedPreferences.contains("userPreferredSleepStartHour")) {
            return new ahnj(sharedPreferences.getInt("userPreferredSleepStartHour", 0), sharedPreferences.getInt("userPreferredSleepStartMinute", 0), sharedPreferences.getInt("userPreferredSleepEndHour", 0), sharedPreferences.getInt("userPreferredSleepEndMinute", 0));
        }
        return null;
    }

    public final aixl bl() {
        return aiyk.g.b(this.m, this.k, this.b);
    }

    public final aizm c() {
        return this.l;
    }

    public final aizp d() {
        return this;
    }

    public final aizw e() {
        return this.w;
    }

    public final aizy f() {
        return this.f;
    }

    public final aizz g() {
        return this.o;
    }

    public final ajaa h() {
        return this.g;
    }

    public final ajas i() {
        return this;
    }

    public final ajat j() {
        return this;
    }

    public final ajbg k() {
        return this.k;
    }

    public final ajac l() {
        return this;
    }

    public final ajbj m() {
        return this.j;
    }

    public final ajbl n() {
        return this.h;
    }

    public final aicn o() {
        return this.b;
    }

    public final ajbf p() {
        return this.p;
    }

    public final void r() {
    }

    public final void s() {
        aivu aivu = this.c;
        if (aivu.l.j()) {
            aivu.b.a(aico.QUIT_NETWORK_PROVIDER);
            ajcm ajcm = aivu.l;
            ajcm.k();
            if (ajcm.b != null) {
                ajcm.e();
                ajcm.a.remove(ajcm.b);
                ajcp ajcp = ajcm.b;
                if (ajcp != null) {
                    ajcp.e(false);
                }
                ajcm.b = null;
            }
            aita aita = aivu.m;
            if (aita != null) {
                aita.a();
                aivu.m = null;
            }
        }
        this.k.a(true);
    }

    public final void b(List list, int i2) {
        this.d.b(list, i2);
        if (!list.isEmpty()) {
            aiyk.g.a((aiax) anbs.d(list));
        }
    }

    public final ahtp a(boolean z, Set set, Map map, long j2, ahuu ahuu, ahss ahss, String str, aizx aizx) {
        int i2;
        long j3 = j2;
        ahuu ahuu2 = ahuu;
        aivb aivb = new aivb(ahss, this.k);
        ahue ahue = new ahue();
        ahue.a = set;
        if (!z) {
            i2 = 1;
        } else {
            i2 = 4;
        }
        ahue.j = i2;
        ahue.b = null;
        ahue.c = null;
        ahue.h = true;
        ahue.i = aizx;
        if (j3 < 0) {
            int i3 = Build.VERSION.SDK_INT;
            ahue.e = -j3;
            ahue.f = true;
            ahue.g = null;
        } else {
            ahue.a(j3);
        }
        if (ahuu2 != null) {
            ahue.g = ahuu2;
            ahue.f = false;
        }
        RealCollectorConfig a2 = ahue.a();
        for (Map.Entry entry : map.entrySet()) {
            a2.a((ahup) entry.getKey(), ((Integer) entry.getValue()).intValue());
        }
        return new ahvd(this.k, this.a, a2, this.n, this.h, (Integer) null, (aqek) null, aivb, new ajrh(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0048, code lost:
        if ((r9.a.d() - ((defpackage.ahll) r2.get(r2.size() - 1)).a.d()) >= 55000) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0314  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aibl a(defpackage.aiax r19, defpackage.aibr r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = r18
            r2 = r20
            ahlm r3 = r1.u
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 != 0) goto L_0x0013
            aibl r2 = defpackage.ahlm.a
            goto L_0x0203
        L_0x0013:
            int r9 = r20.b()
            if (r9 <= 0) goto L_0x0201
            ahll r9 = new ahll
            r9.<init>(r2, r0)
            java.util.List r2 = r3.d
            boolean r2 = r2.isEmpty()
            r10 = 3
            if (r2 == 0) goto L_0x0028
            goto L_0x004a
        L_0x0028:
            java.util.List r2 = r3.d
            aibw r11 = r9.a
            long r11 = r11.d()
            int r13 = r2.size()
            int r13 = r13 + -1
            java.lang.Object r2 = r2.get(r13)
            ahll r2 = (defpackage.ahll) r2
            aibw r2 = r2.a
            long r13 = r2.d()
            long r11 = r11 - r13
            r13 = 55000(0xd6d8, double:2.71736E-319)
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x005c
        L_0x004a:
            java.util.List r2 = r3.d
            r2.add(r9)
            java.util.List r2 = r3.d
            int r2 = r2.size()
            if (r2 <= r10) goto L_0x005c
            java.util.List r2 = r3.d
            r2.remove(r8)
        L_0x005c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r11 = 0
        L_0x0062:
            java.util.List r12 = r3.d
            int r12 = r12.size()
            int r12 = r12 + -1
            if (r11 >= r12) goto L_0x007a
            java.util.List r12 = r3.d
            java.lang.Object r12 = r12.get(r11)
            ahll r12 = (defpackage.ahll) r12
            r2.add(r12)
            int r11 = r11 + 1
            goto L_0x0062
        L_0x007a:
            r2.add(r9)
            int r9 = r2.size()
            if (r9 >= r10) goto L_0x0087
            aibl r2 = defpackage.ahlm.a
            goto L_0x0221
        L_0x0087:
            int r9 = r2.size()
            if (r9 != r10) goto L_0x01e4
            java.util.EnumMap r9 = new java.util.EnumMap
            java.lang.Class<ahlj> r10 = defpackage.ahlj.class
            r9.<init>(r10)
            java.lang.Object r10 = r2.get(r8)
            ahll r10 = (defpackage.ahll) r10
            aibw r10 = r10.a
            long[] r10 = defpackage.ahjv.a(r10)
            java.lang.Object r11 = r2.get(r7)
            ahll r11 = (defpackage.ahll) r11
            aibw r11 = r11.a
            long[] r11 = defpackage.ahjv.a(r11)
            java.lang.Object r12 = r2.get(r6)
            ahll r12 = (defpackage.ahll) r12
            aibw r12 = r12.a
            long[] r12 = defpackage.ahjv.a(r12)
            long[] r13 = defpackage.ahjv.a((long[]) r10, (long[]) r12)
            ahlj r14 = defpackage.ahlj.SCAN_OVERLAP_RATIO_0_2
            java.lang.Double r10 = defpackage.ahjv.a((long[]) r10, (long[]) r12, (long[]) r13)
            defpackage.ahjv.a((java.util.Map) r9, (defpackage.ahlj) r14, (java.lang.Double) r10)
            ahlj r10 = defpackage.ahlj.SCAN_OVERLAP_COUNT_0_2
            int r13 = r13.length
            double r13 = (double) r13
            java.lang.Double r13 = java.lang.Double.valueOf(r13)
            r9.put(r10, r13)
            long[] r10 = defpackage.ahjv.a((long[]) r11, (long[]) r12)
            ahlj r13 = defpackage.ahlj.SCAN_OVERLAP_RATIO_1_2
            java.lang.Double r10 = defpackage.ahjv.a((long[]) r11, (long[]) r12, (long[]) r10)
            defpackage.ahjv.a((java.util.Map) r9, (defpackage.ahlj) r13, (java.lang.Double) r10)
            ahlj r10 = defpackage.ahlj.WIFI_LOC_DISTANCE_0_1
            java.lang.Object r11 = r2.get(r8)
            ahll r11 = (defpackage.ahll) r11
            java.lang.Object r12 = r2.get(r7)
            ahll r12 = (defpackage.ahll) r12
            java.lang.Double r11 = defpackage.ahjv.a((defpackage.ahll) r11, (defpackage.ahll) r12, (boolean) r8)
            defpackage.ahjv.a((java.util.Map) r9, (defpackage.ahlj) r10, (java.lang.Double) r11)
            ahlj r10 = defpackage.ahlj.WIFI_LOC_DISTANCE_0_2
            java.lang.Object r11 = r2.get(r8)
            ahll r11 = (defpackage.ahll) r11
            java.lang.Object r12 = r2.get(r6)
            ahll r12 = (defpackage.ahll) r12
            java.lang.Double r11 = defpackage.ahjv.a((defpackage.ahll) r11, (defpackage.ahll) r12, (boolean) r8)
            defpackage.ahjv.a((java.util.Map) r9, (defpackage.ahlj) r10, (java.lang.Double) r11)
            ahlj r10 = defpackage.ahlj.WIFI_LOC_DISTANCE_1_2
            java.lang.Object r11 = r2.get(r7)
            ahll r11 = (defpackage.ahll) r11
            java.lang.Object r12 = r2.get(r6)
            ahll r12 = (defpackage.ahll) r12
            java.lang.Double r11 = defpackage.ahjv.a((defpackage.ahll) r11, (defpackage.ahll) r12, (boolean) r8)
            defpackage.ahjv.a((java.util.Map) r9, (defpackage.ahlj) r10, (java.lang.Double) r11)
            ahlj r10 = defpackage.ahlj.CELL_LOC_DISTANCE_0_2
            java.lang.Object r11 = r2.get(r8)
            ahll r11 = (defpackage.ahll) r11
            java.lang.Object r2 = r2.get(r6)
            ahll r2 = (defpackage.ahll) r2
            java.lang.Double r2 = defpackage.ahjv.a((defpackage.ahll) r11, (defpackage.ahll) r2, (boolean) r7)
            defpackage.ahjv.a((java.util.Map) r9, (defpackage.ahlj) r10, (java.lang.Double) r2)
            ahlk r2 = r3.b
            ahlj r10 = defpackage.ahlj.SCAN_OVERLAP_RATIO_1_2
            java.lang.Object r10 = r9.get(r10)
            java.lang.Double r10 = (java.lang.Double) r10
            double r10 = r10.doubleValue()
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0156
            ahlj r10 = defpackage.ahlj.SCAN_OVERLAP_MIN_RADIUS_0_2
            double r10 = r2.a(r9, r10)
            r14 = 4645744490609377280(0x4079000000000000, double:400.0)
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 > 0) goto L_0x0152
            goto L_0x0156
        L_0x0152:
            aibl r2 = defpackage.ahlm.a
            goto L_0x0203
        L_0x0156:
            ahlj r10 = defpackage.ahlj.SCAN_OVERLAP_RATIO_0_2
            double r10 = r2.a(r9, r10)
            r14 = 4611684216987536956(0x3ffffe5c91d14e3c, double:1.9996)
            double r10 = r10 * r14
            r14 = -4611480429104398441(0xc000bafb7e90ff97, double:-2.0913)
            double r10 = r10 + r14
            ahlj r14 = defpackage.ahlj.SCAN_OVERLAP_COUNT_0_2
            double r14 = r2.a(r9, r14)
            r16 = 4598458045601875283(0x3fd1013a92a30553, double:0.2657)
            double r14 = r14 * r16
            double r10 = r10 + r14
            ahlj r14 = defpackage.ahlj.SCAN_OVERLAP_MIN_RADIUS_0_2
            double r14 = r2.a(r9, r14)
            r16 = -4655691591106350495(0xbf63a92a30553261, double:-0.0024)
            double r14 = r14 * r16
            double r10 = r10 + r14
            ahlj r14 = defpackage.ahlj.SCAN_OVERLAP_RATIO_1_2
            double r14 = r2.a(r9, r14)
            r16 = 4617749890145660908(0x40158b0f27bb2fec, double:5.3858)
            double r14 = r14 * r16
            double r10 = r10 + r14
            ahlj r14 = defpackage.ahlj.WIFI_LOC_DISTANCE_0_1
            double r14 = r2.a(r9, r14)
            r16 = -4649804485673451782(0xbf789374bc6a7efa, double:-0.006)
            double r14 = r14 * r16
            double r10 = r10 + r14
            ahlj r14 = defpackage.ahlj.WIFI_LOC_DISTANCE_0_2
            double r14 = r2.a(r9, r14)
            r16 = -4648651564168844935(0xbf7cac083126e979, double:-0.007)
            double r14 = r14 * r16
            double r10 = r10 + r14
            ahlj r14 = defpackage.ahlj.WIFI_LOC_DISTANCE_1_2
            double r14 = r2.a(r9, r14)
            r16 = -4641373747171014214(0xbf96872b020c49ba, double:-0.022)
            double r14 = r14 * r16
            double r10 = r10 + r14
            ahlj r14 = defpackage.ahlj.CELL_LOC_DISTANCE_0_2
            double r14 = r2.a(r9, r14)
            r16 = -4665621127564776964(0xbf40624dd2f1a9fc, double:-5.0E-4)
            double r14 = r14 * r16
            double r10 = r10 + r14
            double r9 = -r10
            double r9 = java.lang.Math.exp(r9)
            double r9 = r9 + r12
            double r9 = r12 / r9
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x01dd
            aibl r2 = new aibl
            r2.<init>(r7, r9)
            goto L_0x0203
        L_0x01dd:
            aibl r2 = new aibl
            double r12 = r12 - r9
            r2.<init>(r6, r12)
            goto L_0x0203
        L_0x01e4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r2 = r2.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 55
            r3.<init>(r4)
            java.lang.String r4 = "Can't compute features for history of size: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0201:
            aibl r2 = defpackage.ahlm.a
        L_0x0203:
            java.lang.String r9 = java.lang.String.valueOf(r2)
            java.lang.String r10 = java.lang.String.valueOf(r9)
            int r10 = r10.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r10 = r10 + 36
            r11.<init>(r10)
            java.lang.String r10 = "Travel detection result AllSignals: "
            r11.append(r10)
            r11.append(r9)
            r11.toString()
        L_0x0221:
            ahjp r9 = r3.c
            if (r0 == 0) goto L_0x0228
            aiah r0 = r0.c
            goto L_0x0229
        L_0x0228:
            r0 = 0
        L_0x0229:
            if (r0 != 0) goto L_0x022c
            goto L_0x027a
        L_0x022c:
            aibe r10 = r0.c
            if (r10 == 0) goto L_0x027a
            java.util.List r10 = r9.a
            int r10 = r10.size()
            r11 = 4
            if (r10 < r11) goto L_0x0274
            java.util.List r10 = r9.a
            int r11 = r10.size()
            r12 = 0
        L_0x0240:
            if (r12 >= r11) goto L_0x0262
            java.lang.Object r13 = r10.get(r12)
            aiah r13 = (defpackage.aiah) r13
            int r12 = r12 + 1
            aibe r14 = r0.c
            aibe r13 = r13.c
            int r13 = defpackage.aias.a(r14, r13)
            aibe r14 = r0.c
            int r14 = r14.d
            int r14 = r14 / 1000
            r15 = 200(0xc8, float:2.8E-43)
            int r14 = java.lang.Math.max(r14, r15)
            if (r13 <= r14) goto L_0x0240
            r10 = 1
            goto L_0x0263
        L_0x0262:
            r10 = 0
        L_0x0263:
            r9.a(r0)
            if (r10 == 0) goto L_0x026e
            aibl r0 = new aibl
            r0.<init>(r6, r4)
            goto L_0x027c
        L_0x026e:
            aibl r0 = new aibl
            r0.<init>(r7, r4)
            goto L_0x027c
        L_0x0274:
            r9.a(r0)
            aibl r0 = defpackage.ahlm.a
            goto L_0x027c
        L_0x027a:
            aibl r0 = defpackage.ahlm.a
        L_0x027c:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 34
            r6.<init>(r5)
            java.lang.String r5 = "Travel detection result CellOnly: "
            r6.append(r5)
            r6.append(r4)
            r6.toString()
            aibl r4 = defpackage.ahlm.a
            if (r2 != r4) goto L_0x02a3
            aibl r4 = defpackage.ahlm.a
            if (r0 == r4) goto L_0x02a3
            goto L_0x02a5
        L_0x02a3:
            r0 = r2
        L_0x02a5:
            aizy r4 = r3.e
            long r4 = android.os.SystemClock.elapsedRealtime()
            aibl r6 = defpackage.ahlm.a
            if (r0 != r6) goto L_0x02b8
            boolean r6 = r3.a()
            if (r6 == 0) goto L_0x02b8
            aibl r0 = r3.f
            goto L_0x02d3
        L_0x02b8:
            aibl r6 = defpackage.ahlm.a
            if (r2 != r6) goto L_0x02c9
            boolean r6 = r3.h
            if (r6 == 0) goto L_0x02c9
            boolean r6 = r3.a()
            if (r6 == 0) goto L_0x02c9
            aibl r0 = r3.f
            goto L_0x02d3
        L_0x02c9:
            if (r0 != r2) goto L_0x02cc
            goto L_0x02cd
        L_0x02cc:
            r7 = 0
        L_0x02cd:
            r3.h = r7
            r3.f = r0
            r3.g = r4
        L_0x02d3:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r6 = java.lang.String.valueOf(r2)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 25
            r7.<init>(r6)
            java.lang.String r6 = "Travel detection result: "
            r7.append(r6)
            r7.append(r2)
            r7.toString()
            int r2 = r3.j
            if (r2 != 0) goto L_0x02f6
        L_0x02f5:
            goto L_0x0310
        L_0x02f6:
            aibl r2 = defpackage.ahlm.a
            if (r0 == r2) goto L_0x02f5
            int r2 = r3.j
            int r6 = r0.b
            if (r2 == r6) goto L_0x02f5
            long r6 = r3.i
            long r6 = r4 - r6
            r8 = 50000(0xc350, double:2.47033E-319)
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x030e
            aibl r0 = defpackage.ahlm.a
            goto L_0x0310
        L_0x030e:
            r3.i = r4
        L_0x0310:
            aibl r2 = defpackage.ahlm.a
            if (r0 == r2) goto L_0x0318
            int r2 = r0.b
            r3.j = r2
        L_0x0318:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixc.a(aiax, aibr):aibl");
    }

    public final void a(ahzw ahzw) {
        for (ActivityRecognitionResult activityRecognitionResult : ahzw.b()) {
            Intent intent = new Intent();
            this.c.a(19, 0, activityRecognitionResult, true);
            intent.setAction("com.google.android.location.activity.ACTIVITY_RESULT");
            intent.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT", activityRecognitionResult);
            alv.a(this.a).a(intent);
        }
        this.d.a(ahzw);
    }

    public final void a(aibj aibj, boolean z) {
        aire aire = (aire) this.d;
        aire.q.a(aire.a, aibj, (Bundle) null, aire.j);
        if (z) {
            a("LAST_SLEEP_SEGMENT_MILLIS");
        }
    }

    public final void a(aibl aibl) {
        this.c.a(21, 0, aibl, false);
    }

    public final void a(aibr aibr) {
        this.d.a(aibr);
    }

    public final void a(aizx aizx) {
        this.b.a(aico.CELL_REQUEST_SCAN);
        this.c.a(4, 0, aizx, false);
    }

    public final void a(ajbe ajbe, boolean z) {
        aicn aicn = this.b;
        int ordinal = ajbe.ordinal();
        aicn.a((aicl) new aitd(aico.GPS_ON_OFF, aicn.b(), z ? 1 : 0, ordinal, z, ordinal));
        aivu aivu = this.c;
        ahyk ahyk = this.n;
        String valueOf = String.valueOf(ajbe.ordinal());
        if (aivu.k != z) {
            aivu.k = z;
            Looper mainLooper = Looper.getMainLooper();
            if (z) {
                ahyk.a(valueOf, false, aivu.c.c);
                ahyk.a(valueOf, "gps", 0, aivu.d.c, mainLooper);
                return;
            }
            ahyk.a(valueOf, true, aivu.d.c);
            ahyk.a(valueOf, "passive", 0, aivu.c.c, mainLooper);
        }
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        a((ahzw) new aibi(activityRecognitionResult));
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.c.a(18, 0, (ahqp) obj, false);
    }

    public final void a(Runnable runnable) {
        this.c.a(runnable);
    }

    public final void a(String str) {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("SLEEP_PREF_NAME", 0).edit();
        edit.putLong(str, System.currentTimeMillis());
        edit.commit();
        if (str.length() == 0) {
            new String("Updated ");
        } else {
            "Updated ".concat(str);
        }
    }

    public final void a(String str, String str2, String str3, boolean z, long j2) {
        Context context = this.a;
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
            iwq a2 = iwq.a(context);
            je jeVar = new je(context);
            jeVar.b(hdg.a(context, R.drawable.quantum_ic_google_white_24));
            jeVar.e(str);
            jeVar.b((CharSequence) str2);
            jeVar.a(true);
            if (z) {
                jeVar.a(-1);
            } else if (Build.VERSION.SDK_INT >= 26) {
                a2.a(new NotificationChannel("com.google.android.gms.location.triple_chop", "Triple Chop", 2));
                jeVar.z = "com.google.android.gms.location.triple_chop";
            }
            if (j2 > 0) {
                jeVar.A = j2;
            }
            if (str3 != null && !str3.isEmpty()) {
                jeVar.f = PendingIntent.getActivity(context, 0, new Intent("android.intent.action.VIEW", Uri.parse(str3)), 0);
            }
            Notification b2 = jeVar.b();
            int i2 = aiwj.a;
            aiwj.a = i2 + 1;
            a2.a("HblUVOCvEem4PpswPRhQWw", i2, b2);
        }
    }

    public final void a(List list) {
        aire aire = (aire) this.d;
        aire.o.a(aire.a, list, (Bundle) null, aire.j);
    }

    public final void a(List list, int i2) {
        aixa aixa = this.d;
        Bundle bundle = new Bundle();
        iva.a((Object) bundle);
        bundle.putInt("location:key:transition_result_source", i2);
        aire aire = (aire) aixa;
        aire.p.a(aire.a, list, bundle, aire.j);
    }

    public final void a(aiay[] aiayArr) {
        this.d.a(aiayArr);
    }
}
