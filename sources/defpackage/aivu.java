package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.rtt.WifiRttManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: aivu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aivu {
    public final Context a;
    public final aicn b;
    final aivs c;
    final aivs d;
    public final aivn e;
    public final aixc f;
    public volatile boolean g = false;
    public final Handler h;
    public final aiyq i;
    public boolean j;
    public boolean k = false;
    public ajcm l;
    public aita m;
    public aizk n;
    private final ahqp o;
    private aivl p;
    private aivm q;
    private long r;
    private int s = -1;
    private int t = -1;
    private boolean u;

    public aivu(Context context, aixc aixc, ahqp ahqp, aicn aicn, aiyq aiyq) {
        ajcm ajcm = new ajcm(new aivg());
        this.a = context;
        this.f = aixc;
        this.o = ahqp;
        this.b = aicn;
        this.l = ajcm;
        this.c = new aivs(this, 7);
        this.d = new aivs(this, 11);
        this.e = new aivn((LocationManager) context.getSystemService("location"));
        this.i = aiyq;
        this.h = new aivq(this, Looper.myLooper());
    }

    public static void a(aicn aicn, Context context) {
        WifiRttManager wifiRttManager;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28 && (wifiRttManager = (WifiRttManager) context.getSystemService("wifirtt")) != null) {
            z = wifiRttManager.isAvailable();
        }
        aicn.a(aico.RTT_MANAGER_AVAILABLE, z);
    }

    public final void b() {
        aixh aixh = this.f.k;
        ajbe ajbe = ajbe.CALLBACK_RUNNER;
        aiym aiym = aixh.a[ajbe.ordinal()];
        while (aiym.b()) {
            aixh.c(ajbe);
        }
    }

    public final synchronized Handler c() {
        return this.h;
    }

    public final void b(ajcl ajcl) {
        WifiManager wifiManager = (WifiManager) this.a.getApplicationContext().getSystemService("wifi");
        boolean isWifiEnabled = wifiManager.isWifiEnabled();
        boolean z = true;
        if (!isWifiEnabled && !aiyk.g.a(wifiManager, this.a)) {
            z = false;
        }
        aito.c(this.b, z);
        ajcl.a(z, isWifiEnabled);
    }

    public static boolean a(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1;
    }

    public final synchronized void a() {
        aivl aivl = this.p;
        if (aivl != null) {
            try {
                this.a.unregisterReceiver(aivl);
            } catch (IllegalArgumentException e2) {
            }
        }
        aivm aivm = this.q;
        if (aivm != null) {
            this.a.getContentResolver().unregisterContentObserver(aivm);
            this.q = null;
        }
    }

    public final void b(aqek aqek) {
        a(13, 0, aqek, false);
    }

    public final void a(int i2) {
        ajbe ajbe = ajbe.values()[i2];
        aicn aicn = this.b;
        aicn.a(new aicl(aico.ALARM_RING, aicn.b(), "%2$d", i2));
        this.f.k.a(ajbe.ordinal());
        this.l.a(ajbe);
    }

    public final void a(ajbe ajbe, long j2, long j3) {
        a((Runnable) new aivd(this, ajbe, new aiac(j2, j3)));
    }

    public final void a(ajcl ajcl) {
        Intent registerReceiver;
        Bundle extras;
        boolean z;
        ajcl ajcl2 = ajcl;
        if (ajcl2 != null && (registerReceiver = this.a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) != null && (extras = registerReceiver.getExtras()) != null) {
            int i2 = extras.getInt("scale", 100);
            int i3 = extras.getInt("level", 0);
            if (extras.getInt("plugged", 0) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != this.s || i3 != this.t || z != this.u) {
                this.u = z;
                this.t = i3;
                this.s = i2;
                aicn aicn = this.b;
                aitb aitb = r5;
                aitb aitb2 = new aitb(aico.BATTERY_STATE_CHANGED, aicn.b(), i2, i3, z ? 1 : 0, i2, i3, z);
                aicn.a((aicl) aitb);
                ajcl2.a(i2, i3, z);
            }
        }
    }

    public final void a(ajcl ajcl, boolean z) {
        boolean z2;
        WifiManager wifiManager = (WifiManager) this.a.getApplicationContext().getSystemService("wifi");
        boolean isWifiEnabled = wifiManager.isWifiEnabled();
        if (isWifiEnabled || aiyk.g.a(wifiManager, this.a)) {
            z2 = true;
        } else {
            z2 = false;
        }
        aito.c(this.b, z2);
        ajcl.a(z2, isWifiEnabled);
        PowerManager powerManager = (PowerManager) this.a.getSystemService("power");
        boolean isScreenOn = powerManager.isScreenOn();
        aito.b(this.b, isScreenOn);
        ajcl.a(isScreenOn);
        boolean a2 = aiyk.g.a(powerManager);
        aito.d(this.b, a2);
        ajcl.b(a2);
        boolean a3 = a(this.a);
        aito.a(this.b, a3);
        ajcl.g(a3);
        a((ConnectivityManager) this.a.getSystemService("connectivity"), wifiManager, ajcl);
        ajcl.a(this.o);
        if (this.f.bi()) {
            ajcl.c();
            this.j = true;
        } else {
            ajcl.d();
            this.j = false;
        }
        boolean b2 = aiyk.g.b(powerManager);
        aito.e(this.b, b2);
        ajcl.c(b2);
        if (z) {
            a(ajcl);
        }
        a(this.b, this.a);
    }

    public final void a(ConnectivityManager connectivityManager, WifiManager wifiManager, ajcl ajcl) {
        int i2;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        int i3 = -1;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            aito.a(this.b, false, false, -1);
            ajcl.a(false, false, -1);
        } else if (activeNetworkInfo.getType() == 0) {
            aito.a(this.b, false, true, -1);
            ajcl.a(false, true, -1);
        } else if (activeNetworkInfo.getType() == 1) {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            aicn aicn = this.b;
            if (connectionInfo != null) {
                i2 = connectionInfo.getNetworkId();
            } else {
                i2 = -1;
            }
            aito.a(aicn, true, false, i2);
            if (connectionInfo != null) {
                i3 = connectionInfo.getNetworkId();
            }
            ajcl.a(true, false, i3);
        } else if (activeNetworkInfo.getType() == 9) {
            aito.a(this.b, false, true, -1);
            ajcl.a(false, true, -1);
        }
    }

    public final void a(aqek aqek) {
        a(17, 0, aqek, false);
    }

    public final synchronized void a(List list, aibv[] aibvArr, boolean z) {
        aibv[] aibvArr2;
        aibt[] aibtArr;
        int i2;
        int i3;
        aicn aicn;
        aibt aibt;
        aixs[] aixsArr;
        long j2;
        aixs[] aixsArr2;
        int i4;
        int i5;
        int i6;
        boolean z2 = z;
        synchronized (this) {
            int size = list.size();
            aibt[] aibtArr2 = new aibt[size];
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i7 = 0;
            while (i7 < size) {
                if (i7 == size - 1) {
                    aibvArr2 = aibvArr;
                } else {
                    aibvArr2 = null;
                }
                long j3 = this.r;
                aiyq aiyq = this.i;
                aixs[] aixsArr3 = (aixs[]) list.get(i7);
                aicn aicn2 = this.b;
                if (aiyq.a(elapsedRealtime, aixsArr3)) {
                    long j4 = elapsedRealtime - j3;
                    int length = aixsArr3.length;
                    HashSet hashSet = new HashSet(length);
                    i2 = size;
                    aibtArr = aibtArr2;
                    long j5 = Long.MAX_VALUE;
                    int i8 = 0;
                    while (i8 < length) {
                        aixs aixs = aixsArr3[i8];
                        if (aixs != null) {
                            i6 = length;
                            j5 = Math.min(aixs.a, j5);
                        } else {
                            i6 = length;
                        }
                        i8++;
                        length = i6;
                    }
                    if (j5 == Long.MAX_VALUE) {
                        j5 = elapsedRealtime;
                    }
                    int length2 = aixsArr3.length;
                    ArrayList arrayList = new ArrayList(length2);
                    int i9 = 0;
                    boolean z3 = false;
                    while (i9 < length2) {
                        aicn aicn3 = aicn2;
                        aixs aixs2 = aixsArr3[i9];
                        if (aixs2 == null) {
                            j2 = j5;
                            aixsArr2 = aixsArr3;
                            i5 = i7;
                            i4 = length2;
                        } else {
                            i5 = i7;
                            i4 = length2;
                            long j6 = aixs2.b;
                            if (aixm.a(j6, aixs2)) {
                                aixsArr2 = aixsArr3;
                                long j7 = aixs2.a;
                                long j8 = elapsedRealtime - j7;
                                if (!z2) {
                                    if (j8 <= 30000) {
                                        if (j8 <= j4 && j8 >= -30000) {
                                        }
                                    }
                                    StringBuilder sb = new StringBuilder(127);
                                    sb.append("Stale scan: scanTimestamp is ");
                                    sb.append(j5);
                                    sb.append(" and device timestamp is ");
                                    sb.append(j7);
                                    sb.append(" and diff is ");
                                    sb.append(j5 - j7);
                                    sb.toString();
                                    z3 = true;
                                    j2 = j5;
                                }
                                j2 = j5;
                                if (hashSet.add(Long.valueOf(j6))) {
                                    arrayList.add(aixm.a(aixs2, j6, j7));
                                }
                            } else {
                                j2 = j5;
                                aixsArr2 = aixsArr3;
                            }
                        }
                        i9++;
                        List list2 = list;
                        aicn2 = aicn3;
                        i7 = i5;
                        length2 = i4;
                        aixsArr3 = aixsArr2;
                        j5 = j2;
                    }
                    aibt = new aibt(j5, arrayList, aibvArr2, z3);
                    aicn = aicn2;
                    aixsArr = aixsArr3;
                    i3 = i7;
                } else {
                    i2 = size;
                    aibtArr = aibtArr2;
                    aicn aicn4 = aicn2;
                    i3 = i7;
                    aixsArr = aixsArr3;
                    int length3 = aixsArr.length;
                    ArrayList arrayList2 = new ArrayList(length3);
                    HashSet hashSet2 = new HashSet(length3);
                    int i10 = 0;
                    while (i10 < length3) {
                        aicn aicn5 = aicn4;
                        aixs aixs3 = aixsArr[i10];
                        if (aixs3 != null) {
                            long j9 = aixs3.b;
                            if (aixm.a(j9, aixs3)) {
                                if (hashSet2.add(Long.valueOf(j9))) {
                                    arrayList2.add(aixm.a(aixs3, j9, elapsedRealtime));
                                }
                            }
                        }
                        i10++;
                        aicn4 = aicn5;
                    }
                    aicn = aicn4;
                    aibt = new aibt(elapsedRealtime, arrayList2, aibvArr2, false);
                }
                aicn.a((aicl) new aicm(aico.WIFI_SCAN_RESULTS, aicn.b(), (String) null, aibt, aibt.b(), aixsArr.length - aibt.b(), -1));
                aibtArr[i3] = aibt;
                i7 = i3 + 1;
                size = i2;
                aibtArr2 = aibtArr;
            }
            int i11 = size;
            aibt[] aibtArr3 = aibtArr2;
            if (i11 > 0) {
                this.r = aibtArr3[i11 - 1].a;
            }
            a(8, 0, new aivt(aibtArr3, z2), false);
        }
    }

    public final synchronized void a(boolean z) {
        if (!this.g) {
            a(1, z ? 1 : 0, (Object) null, false);
            this.g = true;
        }
    }

    public final synchronized void a(boolean z, ahzz ahzz) {
        ajqq ajqq = new ajqq(this.a);
        aixc aixc = this.f;
        ahjg ahjg = new ahjg(ajqq, aixc, z, aixc.s, ahzz, aixc, aixc, aixc, new ahop(this.a));
        this.l = new ajcm(ahjg);
        this.n = ahjg.a;
        ((aiwu) this.f.g).b.execute(new aivc(this));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (axwx.m()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_LOCATOR");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_ACTIVE_COLLECTOR");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_BURST_COLLECTOR");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_PASSIVE_COLLECTOR");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_CACHE_UPDATER");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_CALIBRATION_COLLECTOR");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_SENSOR_COLLECTOR");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_SENSOR_UPLOADER");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_ACTIVITY_DETECTION");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_IN_OUT_DOOR_COLLECTOR");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_BURST_COLLECTION_TRIGGER");
        intentFilter.addAction("com.google.android.location.ALARM_WAKEUP_VEHICLE_EXIT_DETECTOR");
        intentFilter.addAction("com.google.android.gms.location.reporting.SETTINGS_CHANGED");
        intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        int i2 = Build.VERSION.SDK_INT;
        intentFilter.addAction("android.intent.action.USER_FOREGROUND");
        intentFilter.addAction("android.intent.action.USER_BACKGROUND");
        int i3 = Build.VERSION.SDK_INT;
        intentFilter.addAction("android.location.MODE_CHANGED");
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            intentFilter.addAction("android.app.action.NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED");
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            intentFilter.addAction("android.app.action.NEXT_ALARM_CLOCK_CHANGED");
        }
        if (Build.VERSION.SDK_INT >= 28 && aydu.c()) {
            intentFilter.addAction("android.net.wifi.rtt.action.WIFI_RTT_STATE_CHANGED");
        }
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
        intentFilter.addAction("com.google.android.location.internal.intent.action.NLP_TESTING");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("com.google.android.gms.phenotype.COMMITTED");
        if (axwx.j()) {
            intentFilter.addAction("com.google.android.apps.gmm.NAVIGATION_STATE");
        }
        if (!this.g) {
            aivl aivl = new aivl(this, this.l);
            this.p = aivl;
            this.a.registerReceiver(aivl, intentFilter, (String) null, this.h);
            int i4 = Build.VERSION.SDK_INT;
            aivm aivm = new aivm(this, this.h, this.l);
            this.q = aivm;
            this.a.getContentResolver().registerContentObserver(Settings.Global.getUriFor("wifi_scan_always_enabled"), false, aivm);
        }
        try {
            LocationManager locationManager = (LocationManager) this.a.getSystemService("location");
            locationManager.addGpsStatusListener(this.e);
            if (locationManager.isProviderEnabled("passive")) {
                if (locationManager.getProvider("passive") != null) {
                    aiyk.g.a(this.a, "passive", this.c.c, Looper.getMainLooper());
                }
            }
        } catch (NullPointerException | SecurityException e2) {
        }
        this.b.a(aico.INITIALIZE);
        this.l.i();
        a((ajcl) this.l, false);
    }

    public final boolean a(int i2, int i3, Object obj, boolean z) {
        int i4;
        if (this.g) {
            return false;
        }
        if (z) {
            this.f.k.b(ajbe.CALLBACK_RUNNER, 60000, (aizx) null);
            i4 = 4321;
        } else {
            i4 = 8534;
        }
        if (obj == null) {
            Message.obtain(this.h, i2, i3, i4).sendToTarget();
            return true;
        }
        Message.obtain(this.h, i2, i3, i4, obj).sendToTarget();
        return true;
    }

    public final boolean a(Runnable runnable) {
        return a(24, 0, runnable, true);
    }
}
