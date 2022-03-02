package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.location.reporting.service.UlrController$7;

/* renamed from: ajme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajme implements ajho {
    static final Uri a = Uri.parse("content://com.google.settings/partner");
    public static final /* synthetic */ int v = 0;
    public final Context b;
    public final ajmm c;
    public final ajmo d;
    public final ajmn e;
    public final rom f;
    public final jiq g;
    public final ajkv h;
    public final ajlm i;
    public final ajmb j;
    public final ajma k;
    public ajmd l;
    public final ajii m;
    public final ajik n;
    public final ajim o;
    public final ajin p;
    public BroadcastReceiver q = null;
    public ContentObserver r = null;
    public ContentObserver s = null;
    public ContentObserver t = null;
    public ContentObserver u = null;
    private final ajhi w;
    private ContentObserver x = null;

    private ajme(Context context, ajii ajii, ajik ajik, ajim ajim, ajin ajin, ajmb ajmb) {
        Context context2 = context;
        this.b = context2;
        this.m = ajii;
        this.n = ajik;
        this.o = ajim;
        this.p = ajin;
        this.j = ajmb;
        this.c = ajmm.a(context);
        this.d = ajmo.a(context);
        this.e = new ajmn();
        this.g = jiu.a;
        rom rom = new rom(context2);
        this.f = rom;
        rom.a();
        ajlt ajlt = r0;
        ajlt ajlt2 = new ajlt(this);
        this.w = new ajhi(context2);
        ajhp ajhp = r0;
        ajhp ajhp2 = new ajhp(context2, this.g);
        this.h = new ajkv(context, this.e, this.d, ajin, this.c);
        ajmj ajmj = r0;
        ajmj ajmj2 = new ajmj(context2);
        ajnd a2 = ajnd.a(context);
        ajhb ajhb = r5;
        ajhb ajhb2 = new ajhb(context2, this.e, new ajha(context2), new ajjl(context2));
        jiq jiq = this.g;
        ajmo ajmo = this.d;
        ajlm ajlm = r0;
        ajmm ajmm = this.c;
        ajmn ajmn = this.e;
        rom rom2 = this.f;
        Context context3 = context2;
        ajhi ajhi = this.w;
        ajkv ajkv = this.h;
        iby iby = r0;
        iby iby2 = new iby(context3, (char[]) null);
        jiq jiq2 = jiq;
        Context context4 = context;
        ajlm ajlm2 = new ajlm(context4, jiq2, ajii, ajin, ajmo, ajmm, ajmn, rom2, ajlt, ajhi, ajkv, ajmj, a2, ajhb, ajhp, iby, this);
        this.i = ajlm;
        this.k = new ajma(this, this.e, this.c, this.d, this.i, ajin);
        ContentResolver contentResolver = this.b.getContentResolver();
        if (jjm.a(this.b)) {
            d();
        } else {
            ajly ajly = new ajly(this, "location", "UlrControllerSettingsObserver", this.k, new Intent("com.google.android.location.reporting.CHANGE_ON_LOCATION_DISABLE_FOR_GOOGLE_APP"));
            this.x = ajly;
            contentResolver.registerContentObserver(a, true, ajly);
        }
        PackageManager packageManager = this.b.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        if (!(packageManager == null || !packageManager.hasSystemFeature("android.hardware.wifi") || contentResolver == null)) {
            this.r = new ajlu(this, "location", "UlrControllerWifiObserver", this.k);
            contentResolver.registerContentObserver(Settings.Global.getUriFor("wifi_scan_always_enabled"), false, this.r);
        }
        if (Build.VERSION.SDK_INT >= 23 && packageManager != null && packageManager.hasSystemFeature("android.hardware.bluetooth_le") && contentResolver != null) {
            this.s = new ajlv(this, "location", "UlrControllerBleObserver", this.k);
            contentResolver.registerContentObserver(Settings.Global.getUriFor("ble_scan_always_enabled"), false, this.s);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (contentResolver != null) {
            this.t = new ajlw(this, "location", "UlrControllerBatterySavingModeChangeObserver", this.k);
            contentResolver.registerContentObserver(Settings.Global.getUriFor("low_power"), true, this.t);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (contentResolver != null) {
            this.u = new ajlx(this, "location", "UlrConrollerBatterySavingThresholdChangeObserver", this.k);
            contentResolver.registerContentObserver(Settings.Global.getUriFor("low_power_trigger_level"), true, this.u);
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.AIRPLANE_MODE");
        if (packageManager != null && packageManager.hasSystemFeature("android.hardware.wifi")) {
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        }
        int i5 = Build.VERSION.SDK_INT;
        intentFilter.addAction("android.location.MODE_CHANGED");
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        UlrController$7 ulrController$7 = new UlrController$7(this, "location");
        this.q = ulrController$7;
        this.b.registerReceiver(ulrController$7, intentFilter);
    }

    public static ajme a(Context context, ajmb ajmb) {
        ajik ajik;
        Context context2 = context;
        int i2 = 3;
        try {
            String[] strArr = {"gcore_ulr_ActivityDetection.db", "gcore_ulr_ApiMetadata.db", "gcore_ulr_UlrLocation.db"};
            int i3 = 0;
            while (i3 < i2) {
                String str = strArr[i3];
                if (context2.deleteDatabase(str)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19);
                    sb.append("Deleted database '");
                    sb.append(str);
                    sb.append("'");
                    ajix.a("GCoreUlr", sb.toString());
                }
                i3++;
                i2 = 3;
            }
            ajio ajio = new ajio(ajmo.a(context).b());
            LevelDb a2 = ajim.a("ulr_db", context2);
            if (a2.toString().equals("LevelDB[]")) {
                ajix.c("GCoreUlr", "Created NoOpLevelDb");
            }
            ajim ajim = new ajim(a2, ajio, context2);
            if (azsy.c()) {
                try {
                    String[] strArr2 = new String[i2];
                    strArr2[0] = "gcore_ulr_ActivityDetection.db";
                    strArr2[1] = "gcore_ulr_ApiMetadata.db";
                    strArr2[2] = "gcore_ulr_UlrLocation.db";
                    for (int i4 = 0; i4 < i2; i4++) {
                        String str2 = strArr2[i4];
                        if (context2.deleteDatabase(str2)) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 19);
                            sb2.append("Deleted database '");
                            sb2.append(str2);
                            sb2.append("'");
                            ajix.a("GCoreUlr", sb2.toString());
                        }
                    }
                    ajio ajio2 = new ajio(ajmo.a(context).b());
                    LevelDb a3 = ajik.a("ulr_db_grpc", context2);
                    if (a3.toString().equals("LevelDB[]")) {
                        ajix.c("GCoreUlr", "Created NoOpLevelDb");
                    }
                    ajik = new ajik(a3, ajio2, context2);
                } catch (LevelDbCorruptionException e2) {
                    ajix.b("GCoreUlr", 5, "datastore corrupted");
                    throw e2;
                } catch (LevelDbException e3) {
                    ajix.b("GCoreUlr", "Error opening datastoreGrpc", (Throwable) e3);
                    return null;
                }
            } else {
                ajik = null;
            }
            return new ajme(context, new ajii(ajik, ajim), ajik, ajim, new ajin(ajik, ajim), ajmb);
        } catch (LevelDbCorruptionException e4) {
            ajix.b("GCoreUlr", 5, "datastore corrupted");
            throw e4;
        } catch (LevelDbException e5) {
            ajix.b("GCoreUlr", "Error opening datastoreJson", (Throwable) e5);
            return null;
        }
    }

    public static void b(Context context) {
        ajnw.a(context, a(context, "com.google.android.location.reporting.UPLOAD"));
    }

    public static void c(Context context) {
        ajnw.a(context, a(context, "com.google.android.location.reporting.WIFI_TRIGGERED_UPLOAD"));
    }

    public static void d() {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
    }

    private final synchronized ajmd e() {
        if (this.l == null) {
            this.l = new ajmd(this);
        }
        return this.l;
    }

    public static void b(Context context, String str) {
        ajnw.a(context, a(context, "com.google.android.location.reporting.ACTION_UPDATE_ACTIVE_STATE", str));
    }

    public final void c() {
        ajnw.b(this.b, "com.google.android.location.reporting.ACTION_WIFI_SCAN_RESULTS").cancel();
        Context context = this.b;
        ajlm.a(context, a(context, "com.google.android.location.reporting.ACTION_ACTIVITY", "Cancel")).cancel();
        Context context2 = this.b;
        PendingIntent.getService(context2, 0, a(context2, "com.google.android.location.reporting.ACTION_LOCATION"), 134217728).cancel();
        Context context3 = this.b;
        PendingIntent.getService(context3, 0, a(context3, "com.google.android.location.reporting.ACTION_IMMEDIATE_LOCATION"), 134217728).cancel();
    }

    public final void b() {
        ContentResolver contentResolver = this.b.getContentResolver();
        ContentObserver contentObserver = this.x;
        if (contentObserver != null) {
            contentResolver.unregisterContentObserver(contentObserver);
            this.x = null;
        }
    }

    public static ComponentName a(Context context) {
        return new ComponentName(context, "com.google.android.location.reporting.service.DispatchingService");
    }

    @Deprecated
    public static Intent a(Context context, String str) {
        Intent intent = new Intent();
        intent.setComponent(a(context));
        intent.setAction(str);
        return intent;
    }

    public static Intent a(Context context, String str, String str2) {
        Intent a2 = a(context, str);
        a2.putExtra("source", str2);
        return a2;
    }

    public static String a(Intent intent) {
        try {
            if (intent.hasExtra("source")) {
                return intent.getStringExtra("source");
            }
            return null;
        } catch (RuntimeException e2) {
            return null;
        }
    }

    static String a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("DispatchingService.updateActiveState+") : "DispatchingService.updateActiveState+".concat(valueOf);
    }

    public static jfp a() {
        return new jfp(10);
    }

    public final void a(Intent intent, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        String action = intent.getAction();
        Handler e2 = ("com.google.android.location.reporting.UPLOAD".equals(action) || "com.google.android.location.reporting.ACTION_INSISTENT_SYNC".equals(action)) ? e() : this.k;
        Message obtainMessage = e2.obtainMessage(1, intent);
        obtainMessage.arg1 = i2;
        e2.sendMessage(obtainMessage);
    }
}
