package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import com.google.android.location.reporting.state.update.AccountConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ajmi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajmi {
    private final Context a;
    private final ajmn b;
    private final ajmm c;
    private final ajmo d;
    private final ajlm e;
    private final ajin f;
    private final ajii g;
    private final WifiManager h;
    private final ContentResolver i = this.a.getContentResolver();
    private final PowerManager j = ((PowerManager) this.a.getSystemService("power"));
    private final ajlq k = ajlq.a(this.a, this.c);

    public ajmi(Context context, ajmn ajmn, ajmm ajmm, ajmo ajmo, ajlm ajlm, ajii ajii, ajin ajin) {
        ajnw.a(context);
        this.a = context;
        this.b = ajmn;
        this.c = ajmm;
        this.d = ajmo;
        this.e = ajlm;
        this.g = ajii;
        this.f = ajin;
        this.h = (WifiManager) context.getSystemService("wifi");
    }

    public static Intent a(Context context) {
        return ajme.a(context, "com.google.android.location.reporting.ACTION_UPDATE_WORLD");
    }

    /* access modifiers changed from: package-private */
    public final void b(List list) {
        if (this.c.b.a(jjm.a(this.a) ? 1 : 0, "location_enabled_for_google_app_key")) {
            boolean a2 = jjm.a(this.a);
            StringBuilder sb = new StringBuilder(53);
            sb.append("Location disabled for Google apps is changed to ");
            sb.append(a2);
            sb.toString();
            ajlq ajlq = this.k;
            for (Account e2 : ahxz.a(ajlq.a).b) {
                ajlq.e(e2);
            }
            Boolean valueOf = Boolean.valueOf(a2);
            String valueOf2 = String.valueOf(valueOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 57);
            sb2.append("UlrClearcutEvents.logLocationEnabledForGoogleAppsChange(");
            sb2.append(valueOf2);
            sb2.append(")");
            sb2.toString();
            if (ajjd.d()) {
                aucd o = aswk.l.o();
                boolean booleanValue = valueOf.booleanValue();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aswk aswk = (aswk) o.b;
                aswk.a |= 2;
                aswk.c = booleanValue;
                ajjd.a.a((aswk) o.i(), valueOf.booleanValue() ? atfh.LOCATION_ENABLED_FOR_GOOGLE_APPS : atfh.LOCATION_DISABLED_FOR_GOOGLE_APPS, list);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(List list) {
        int i2 = Build.VERSION.SDK_INT;
        boolean b2 = jjy.b(this.a);
        if (this.c.b.a(b2 ? 1 : 0, "Location_wifi_scan_enabled_key")) {
            StringBuilder sb = new StringBuilder(58);
            sb.append("Location Wifi always scan mode enabled is changed to ");
            sb.append(b2);
            sb.toString();
            Boolean valueOf = Boolean.valueOf(b2);
            String valueOf2 = String.valueOf(valueOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 54);
            sb2.append("UlrClearcutEvents.logWifiAlwaysScanModeEnabledChange(");
            sb2.append(valueOf2);
            sb2.append(")");
            sb2.toString();
            if (ajjd.d()) {
                aucd o = aswk.l.o();
                boolean booleanValue = valueOf.booleanValue();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aswk aswk = (aswk) o.b;
                aswk.a |= 4;
                aswk.d = booleanValue;
                ajjd.a.a((aswk) o.i(), valueOf.booleanValue() ? atfh.WIFI_ALWAYS_SCAN_MODE_ENABLED : atfh.WIFI_ALWAYS_SCAN_MODE_DISABLED, list);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(List list) {
        if (Build.VERSION.SDK_INT >= 23) {
            boolean b2 = jjy.b();
            if (this.c.b.a(b2 ? 1 : 0, "Location_Ble_scan_enabled_key")) {
                StringBuilder sb = new StringBuilder(57);
                sb.append("Location BLE always scan mode enabled is changed to ");
                sb.append(b2);
                sb.toString();
                Boolean valueOf = Boolean.valueOf(b2);
                String valueOf2 = String.valueOf(valueOf);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 53);
                sb2.append("UlrClearcutEvents.logBleAlwaysScanModeEnabledChange(");
                sb2.append(valueOf2);
                sb2.append(")");
                sb2.toString();
                if (ajjd.d()) {
                    aucd o = aswk.l.o();
                    boolean booleanValue = valueOf.booleanValue();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aswk aswk = (aswk) o.b;
                    aswk.a |= 8;
                    aswk.e = booleanValue;
                    ajjd.a.a((aswk) o.i(), valueOf.booleanValue() ? atfh.BLE_ALWAYS_SCAN_MODE_ENABLED : atfh.BLE_ALWAYS_SCAN_MODE_DISABLED, list);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void e(List list) {
        boolean z;
        int i2 = Build.VERSION.SDK_INT;
        if (Settings.Global.getInt(this.i, "low_power", 0) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.c.b.a(z ? 1 : 0, "Location_battery_saver_enabled_key")) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Battery saver mode enabled is changed to ");
            sb.append(z);
            sb.toString();
            Boolean valueOf = Boolean.valueOf(z);
            String valueOf2 = String.valueOf(valueOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 52);
            sb2.append("UlrClearcutEvents.logBatterySaverModeEnabledChange(");
            sb2.append(valueOf2);
            sb2.append(")");
            sb2.toString();
            if (ajjd.d()) {
                aucd o = aswk.l.o();
                boolean booleanValue = valueOf.booleanValue();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aswk aswk = (aswk) o.b;
                aswk.a |= 16;
                aswk.f = booleanValue;
                ajjd.a.a((aswk) o.i(), valueOf.booleanValue() ? atfh.BATTERY_SAVER_MODE_ENABLED : atfh.BATTERY_SAVER_MODE_DISABLED, list);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(List list) {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Settings.Global.getInt(this.i, "low_power_trigger_level", 0);
        if (this.c.b.a(i3, "Location_battery_saver_mode_threshold_key")) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Battery saver mode threshold is changed to ");
            sb.append(i3);
            sb.toString();
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("UlrClearcutEvents.logBatterySaverModeThresholdChange(");
            sb2.append(i3);
            sb2.append(")");
            sb2.toString();
            if (ajjd.d()) {
                aucd o = aswk.l.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aswk aswk = (aswk) o.b;
                aswk.a |= 32;
                aswk.g = i3;
                ajjd.a.a((aswk) o.i(), atfh.BATTERY_SAVER_MODE_THRESHOLD_CHANGED, list);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(List list) {
        if (this.c.b(this.a)) {
            int c2 = rns.c(this.a);
            StringBuilder sb = new StringBuilder(40);
            sb.append("Location mode is changed to: ");
            sb.append(c2);
            sb.toString();
            ArrayList arrayList = new ArrayList(Arrays.asList(new atfc[]{atfc.LM_LOCATION_MODE_OFF, atfc.LM_LOCATION_MODE_SENSORS_ONLY, atfc.LM_LOCATION_MODE_BATTERY_SAVING, atfc.LM_LOCATION_MODE_HIGH_ACCURACY}));
            anab h2 = anaf.h();
            h2.a(atfc.LM_UNKNOWN, atfh.LOCATION_MODE_UNKNOWN);
            h2.a(atfc.LM_LOCATION_MODE_OFF, atfh.LOCATION_MODE_OFF);
            h2.a(atfc.LM_LOCATION_MODE_BATTERY_SAVING, atfh.LOCATION_MODE_BATTERY_SAVING);
            h2.a(atfc.LM_LOCATION_MODE_SENSORS_ONLY, atfh.LOCATION_MODE_SENSORS_ONLY);
            h2.a(atfc.LM_LOCATION_MODE_HIGH_ACCURACY, atfh.LOCATION_MODE_HIGH_ACCURACY);
            anaf a2 = h2.a();
            atfc atfc = (atfc) arrayList.get(c2);
            String valueOf = String.valueOf(atfc);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 41);
            sb2.append("UlrClearcutEvents.logLocationModeChange(");
            sb2.append(valueOf);
            sb2.append(")");
            sb2.toString();
            if (ajjd.d()) {
                aucd o = aswk.l.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aswk aswk = (aswk) o.b;
                aswk.i = atfc.f;
                aswk.a |= 128;
                ajjd.a.a((aswk) o.i(), (atfh) a2.get(atfc), list);
            }
        }
        boolean b2 = rns.b(this.a);
        if (ajjb.d()) {
            ajjb.a.a(b2);
        }
    }

    private final List a() {
        ArrayList arrayList = new ArrayList();
        for (Account account : this.c.a().a()) {
            AccountConfig a2 = this.c.a(account);
            if (a2 != null && a2.e && a2.g) {
                arrayList.add(account);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r10, android.content.Intent r11) {
        /*
            android.content.Context r10 = r10.getApplicationContext()
            android.content.Intent r0 = a((android.content.Context) r10)
            if (r11 == 0) goto L_0x00e2
            java.lang.String r1 = r11.getAction()
            java.lang.String r2 = "receiverAction"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r11.getAction()
            int r3 = r1.hashCode()
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            switch(r3) {
                case -544318258: goto L_0x0057;
                case -177095062: goto L_0x004d;
                case 3237136: goto L_0x0043;
                case 1435872108: goto L_0x0039;
                case 1785578223: goto L_0x002f;
                case 1988126812: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x0061
        L_0x0025:
            java.lang.String r3 = "com.google.android.gms.phenotype.com.google.android.location.COMMITTED"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0061
            r1 = 2
            goto L_0x0062
        L_0x002f:
            java.lang.String r3 = "com.google.android.gms.phenotype.com.google.android.gms.ulr.COMMITTED"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0061
            r1 = 1
            goto L_0x0062
        L_0x0039:
            java.lang.String r3 = "com.google.android.gms.phenotype.com.google.android.gms.beacon.COMMITTED"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0061
            r1 = 3
            goto L_0x0062
        L_0x0043:
            java.lang.String r3 = "init"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0061
            r1 = 5
            goto L_0x0062
        L_0x004d:
            java.lang.String r3 = "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0061
            r1 = 0
            goto L_0x0062
        L_0x0057:
            java.lang.String r3 = "com.google.android.gms.phenotype.COMMITTED"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0061
            r1 = 4
            goto L_0x0062
        L_0x0061:
            r1 = -1
        L_0x0062:
            if (r1 == 0) goto L_0x00ca
            if (r1 == r9) goto L_0x0088
            if (r1 == r7) goto L_0x0088
            if (r1 == r6) goto L_0x0088
            if (r1 == r5) goto L_0x0088
            if (r1 == r4) goto L_0x006f
            goto L_0x00de
        L_0x006f:
            java.lang.String r1 = "is_boot"
            boolean r2 = r11.getBooleanExtra(r1, r8)
            if (r2 == 0) goto L_0x007b
            r0.putExtra(r1, r9)
        L_0x007b:
            java.lang.String r1 = "is_module_updated"
            boolean r11 = r11.getBooleanExtra(r1, r8)
            if (r11 == 0) goto L_0x00de
            r0.putExtra(r1, r9)
            goto L_0x00de
        L_0x0088:
            java.lang.String r1 = "com.google.android.location"
            boolean r1 = a((java.lang.String) r1, (android.content.Intent) r11)
            if (r1 != 0) goto L_0x00c0
            java.lang.String r1 = "com.google.android.gms.beacon"
            boolean r1 = a((java.lang.String) r1, (android.content.Intent) r11)
            if (r1 != 0) goto L_0x00b6
            java.lang.String r1 = "com.google.android.gms.ulr"
            boolean r11 = a((java.lang.String) r1, (android.content.Intent) r11)
            if (r11 == 0) goto L_0x00b5
            ajit r11 = defpackage.ajob.b
            if (r11 != 0) goto L_0x00a6
            goto L_0x00ab
        L_0x00a6:
            ajit r11 = defpackage.ajob.b
            r11.b(r10)
        L_0x00ab:
            java.lang.String r11 = "com.google.gservices.intent.action.GSERVICES_CHANGED"
            r0.putExtra(r2, r11)
            defpackage.ajnw.a((android.content.Context) r10, (android.content.Intent) r0)
            return
        L_0x00b5:
            return
        L_0x00b6:
            ajit r11 = defpackage.ajob.d
            if (r11 == 0) goto L_0x00bf
            ajit r11 = defpackage.ajob.d
            r11.b(r10)
        L_0x00bf:
            return
        L_0x00c0:
            ajit r11 = defpackage.ajob.b
            if (r11 == 0) goto L_0x00c9
            ajit r11 = defpackage.ajob.c
            r11.b(r10)
        L_0x00c9:
            return
        L_0x00ca:
            java.util.List r11 = defpackage.erc.a((android.content.Intent) r11)
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L_0x00de
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            java.lang.String r11 = "accountsAdded"
            r0.putParcelableArrayListExtra(r11, r1)
        L_0x00de:
            defpackage.ajnw.a((android.content.Context) r10, (android.content.Intent) r0)
            return
        L_0x00e2:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Missing receiver intent"
            r10.<init>(r11)
            java.lang.String r11 = "GCoreUlr"
            java.lang.String r0 = ""
            defpackage.ajix.b((java.lang.String) r11, (java.lang.String) r0, (java.lang.Throwable) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajmi.a(android.content.Context, android.content.Intent):void");
    }

    private final boolean a(AccountConfig accountConfig) {
        return this.c.e(accountConfig.a) || !accountConfig.e;
    }

    private static boolean a(String str, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        String valueOf = String.valueOf(stringExtra);
        if (valueOf.length() == 0) {
            new String("phenotype.PACKAGE_NAME: ");
        } else {
            "phenotype.PACKAGE_NAME: ".concat(valueOf);
        }
        return str.equals(stringExtra);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            java.lang.String r2 = "receiverAction"
            java.lang.String r2 = r0.getStringExtra(r2)
            if (r2 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            java.lang.String r2 = "NO_RECEIVER_ACTION"
        L_0x000f:
            java.lang.String r3 = java.lang.String.valueOf(r21)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r5 = r2.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 50
            int r4 = r4 + r5
            r6.<init>(r4)
            java.lang.String r4 = "WorldUpdater received intent "
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = " with receiverAction "
            r6.append(r3)
            r6.append(r2)
            java.lang.String r3 = r6.toString()
            java.lang.String r4 = "GCoreUlr"
            defpackage.ajix.a((java.lang.String) r4, (java.lang.String) r3)
            ajii r3 = r1.g
            ajmm r4 = r1.c
            com.google.android.location.reporting.state.update.ReportingConfig r4 = r4.a()
            r3.a(r4)
            ajmm r3 = r1.c
            r4 = 0
            defpackage.iva.b((java.lang.String) r4)
            java.lang.Object r5 = defpackage.ajmm.f
            monitor-enter(r5)
            ahya r6 = r3.c     // Catch:{ all -> 0x0886 }
            ahxz r6 = (defpackage.ahxz) r6     // Catch:{ all -> 0x0886 }
            android.accounts.Account[] r6 = r6.b     // Catch:{ all -> 0x0886 }
            aztb r7 = defpackage.aztb.a     // Catch:{ all -> 0x0886 }
            aztc r7 = r7.a()     // Catch:{ all -> 0x0886 }
            boolean r7 = r7.bP()     // Catch:{ all -> 0x0886 }
            if (r7 != 0) goto L_0x0067
            goto L_0x00c2
        L_0x0067:
            ajmp r8 = r3.b     // Catch:{ all -> 0x0886 }
            android.content.SharedPreferences r9 = r8.a     // Catch:{ all -> 0x0886 }
            java.util.Set r9 = defpackage.ajmq.a(r9, r6)     // Catch:{ all -> 0x0886 }
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0886 }
            if (r10 != 0) goto L_0x00c2
            int r10 = r9.size()     // Catch:{ all -> 0x0886 }
            java.lang.String r11 = defpackage.rmp.a((android.accounts.Account[]) r6)     // Catch:{ all -> 0x0886 }
            java.lang.String r12 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0886 }
            int r12 = r12.length()     // Catch:{ all -> 0x0886 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0886 }
            int r12 = r12 + 42
            r13.<init>(r12)     // Catch:{ all -> 0x0886 }
            java.lang.String r12 = "Dropping "
            r13.append(r12)     // Catch:{ all -> 0x0886 }
            r13.append(r10)     // Catch:{ all -> 0x0886 }
            java.lang.String r10 = " PersistentPref keys; "
            r13.append(r10)     // Catch:{ all -> 0x0886 }
            r13.append(r11)     // Catch:{ all -> 0x0886 }
            r13.toString()     // Catch:{ all -> 0x0886 }
            android.content.SharedPreferences r8 = r8.a     // Catch:{ all -> 0x0886 }
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch:{ all -> 0x0886 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0886 }
        L_0x00a9:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0886 }
            if (r10 == 0) goto L_0x00bf
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0886 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0886 }
            boolean r11 = defpackage.ajmq.a((java.lang.String) r10)     // Catch:{ all -> 0x0886 }
            if (r11 != 0) goto L_0x00a9
            r8.remove(r10)     // Catch:{ all -> 0x0886 }
            goto L_0x00a9
        L_0x00bf:
            r8.apply()     // Catch:{ all -> 0x0886 }
        L_0x00c2:
            ajmx r8 = r3.d     // Catch:{ all -> 0x0886 }
            com.google.android.location.reporting.state.update.Conditions r8 = r8.a()     // Catch:{ all -> 0x0886 }
            ajmr r9 = r3.a     // Catch:{ all -> 0x0886 }
            android.content.SharedPreferences r9 = r9.b     // Catch:{ all -> 0x0886 }
            java.util.Map r9 = r9.getAll()     // Catch:{ all -> 0x0886 }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x0886 }
            r10 = 3
            r11 = 1
            if (r9 != 0) goto L_0x0185
            boolean r9 = r8.c()     // Catch:{ all -> 0x0886 }
            if (r9 != 0) goto L_0x0185
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0886 }
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0886 }
            int r7 = r7.length()     // Catch:{ all -> 0x0886 }
            int r7 = r7 + 27
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0886 }
            r9.<init>(r7)     // Catch:{ all -> 0x0886 }
            java.lang.String r7 = "cleanup() calling clear(): "
            r9.append(r7)     // Catch:{ all -> 0x0886 }
            r9.append(r6)     // Catch:{ all -> 0x0886 }
            r9.toString()     // Catch:{ all -> 0x0886 }
            java.util.List r6 = r8.b()     // Catch:{ all -> 0x0886 }
            java.util.TreeSet r7 = new java.util.TreeSet     // Catch:{ all -> 0x0886 }
            r7.<init>()     // Catch:{ all -> 0x0886 }
            java.util.Iterator r8 = r6.iterator()     // Catch:{ all -> 0x0886 }
        L_0x0109:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0886 }
            if (r9 != 0) goto L_0x0179
            java.lang.String r8 = "clear:"
            java.lang.String r9 = "_"
            java.lang.String r7 = android.text.TextUtils.join(r9, r7)     // Catch:{ all -> 0x0886 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0886 }
            int r9 = r7.length()     // Catch:{ all -> 0x0886 }
            if (r9 != 0) goto L_0x0127
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0886 }
            r7.<init>(r8)     // Catch:{ all -> 0x0886 }
            goto L_0x012b
        L_0x0127:
            java.lang.String r7 = r8.concat(r7)     // Catch:{ all -> 0x0886 }
        L_0x012b:
            boolean r6 = com.google.android.location.reporting.state.utils.InactiveReason.a(r6, r10)     // Catch:{ all -> 0x0886 }
            if (r6 != 0) goto L_0x0134
            r16 = r7
            goto L_0x0164
        L_0x0134:
            java.lang.String r6 = defpackage.ajnw.a()     // Catch:{ all -> 0x0886 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0886 }
            if (r6 != 0) goto L_0x0140
            java.lang.String r6 = "unknown-country"
        L_0x0140:
            java.lang.String r8 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0886 }
            int r8 = r8.length()     // Catch:{ all -> 0x0886 }
            int r9 = r6.length()     // Catch:{ all -> 0x0886 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0886 }
            int r8 = r8 + r11
            int r8 = r8 + r9
            r12.<init>(r8)     // Catch:{ all -> 0x0886 }
            r12.append(r7)     // Catch:{ all -> 0x0886 }
            java.lang.String r7 = "_"
            r12.append(r7)     // Catch:{ all -> 0x0886 }
            r12.append(r6)     // Catch:{ all -> 0x0886 }
            java.lang.String r7 = r12.toString()     // Catch:{ all -> 0x0886 }
            r16 = r7
        L_0x0164:
            ajmr r12 = r3.a     // Catch:{ all -> 0x0886 }
            java.lang.String r15 = "cleanup()"
            android.content.SharedPreferences r3 = r12.b     // Catch:{ all -> 0x0886 }
            android.content.SharedPreferences$Editor r13 = r3.edit()     // Catch:{ all -> 0x0886 }
            r13.clear()     // Catch:{ all -> 0x0886 }
            r14 = 0
            r17 = 0
            r12.a(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0886 }
            monitor-exit(r5)     // Catch:{ all -> 0x0886 }
            goto L_0x01ea
        L_0x0179:
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0886 }
            com.google.android.location.reporting.state.utils.InactiveReason r9 = (com.google.android.location.reporting.state.utils.InactiveReason) r9     // Catch:{ all -> 0x0886 }
            java.lang.String r9 = r9.c     // Catch:{ all -> 0x0886 }
            r7.add(r9)     // Catch:{ all -> 0x0886 }
            goto L_0x0109
        L_0x0185:
            if (r7 == 0) goto L_0x01e9
            ajmr r12 = r3.a     // Catch:{ all -> 0x0886 }
            android.content.SharedPreferences r3 = r12.b     // Catch:{ all -> 0x0886 }
            java.util.Set r3 = defpackage.ajmq.a(r3, r6)     // Catch:{ all -> 0x0886 }
            boolean r7 = r3.isEmpty()     // Catch:{ all -> 0x0886 }
            if (r7 != 0) goto L_0x01e9
            int r7 = r3.size()     // Catch:{ all -> 0x0886 }
            java.lang.String r6 = defpackage.rmp.a((android.accounts.Account[]) r6)     // Catch:{ all -> 0x0886 }
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0886 }
            int r8 = r8.length()     // Catch:{ all -> 0x0886 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0886 }
            int r8 = r8 + 36
            r9.<init>(r8)     // Catch:{ all -> 0x0886 }
            java.lang.String r8 = "GCoreUlr"
            java.lang.String r13 = "Dropping "
            r9.append(r13)     // Catch:{ all -> 0x0886 }
            r9.append(r7)     // Catch:{ all -> 0x0886 }
            java.lang.String r7 = " UserPref keys; "
            r9.append(r7)     // Catch:{ all -> 0x0886 }
            r9.append(r6)     // Catch:{ all -> 0x0886 }
            java.lang.String r6 = r9.toString()     // Catch:{ all -> 0x0886 }
            defpackage.ajix.a((java.lang.String) r8, (java.lang.String) r6)     // Catch:{ all -> 0x0886 }
            android.content.SharedPreferences r6 = r12.b     // Catch:{ all -> 0x0886 }
            android.content.SharedPreferences$Editor r13 = r6.edit()     // Catch:{ all -> 0x0886 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0886 }
        L_0x01cf:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x0886 }
            if (r6 == 0) goto L_0x01df
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x0886 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0886 }
            r13.remove(r6)     // Catch:{ all -> 0x0886 }
            goto L_0x01cf
        L_0x01df:
            r14 = 0
            java.lang.String r15 = "restrictTo()"
            java.lang.String r16 = "restrictTo"
            r17 = 0
            r12.a(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0886 }
        L_0x01e9:
            monitor-exit(r5)     // Catch:{ all -> 0x0886 }
        L_0x01ea:
            android.content.Context r3 = r1.a
            defpackage.ajnw.a((android.content.Context) r3)
            ajmm r3 = r1.c
            com.google.android.location.reporting.state.update.ReportingConfig r3 = r3.a()
            int r5 = r2.hashCode()
            r6 = 4
            r7 = 2
            r8 = 0
            switch(r5) {
                case -1184851779: goto L_0x0228;
                case -511271086: goto L_0x021e;
                case -177095062: goto L_0x0214;
                case 3237136: goto L_0x020a;
                case 211362435: goto L_0x0200;
                default: goto L_0x01ff;
            }
        L_0x01ff:
            goto L_0x0232
        L_0x0200:
            java.lang.String r5 = "com.google.gservices.intent.action.GSERVICES_CHANGED"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0232
            r5 = 1
            goto L_0x0233
        L_0x020a:
            java.lang.String r5 = "init"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0232
            r5 = 0
            goto L_0x0233
        L_0x0214:
            java.lang.String r5 = "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0232
            r5 = 2
            goto L_0x0233
        L_0x021e:
            java.lang.String r5 = "android.location.MODE_CHANGED"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0232
            r5 = 4
            goto L_0x0233
        L_0x0228:
            java.lang.String r5 = "android.location.PROVIDERS_CHANGED"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0232
            r5 = 3
            goto L_0x0233
        L_0x0232:
            r5 = -1
        L_0x0233:
            r9 = 8
            if (r5 == 0) goto L_0x0573
            if (r5 == r11) goto L_0x03c0
            if (r5 == r7) goto L_0x024c
            if (r5 == r10) goto L_0x0242
            if (r5 == r6) goto L_0x0242
            r11 = 0
            goto L_0x06c9
        L_0x0242:
            ajmm r0 = r1.c
            android.content.Context r4 = r1.a
            r0.b((android.content.Context) r4)
            r11 = 0
            goto L_0x06c9
        L_0x024c:
            java.lang.String r4 = "accountsAdded"
            java.util.ArrayList r0 = r0.getParcelableArrayListExtra(r4)
            if (r0 == 0) goto L_0x03bd
            int r4 = r0.size()
        L_0x0259:
            if (r8 >= r4) goto L_0x03bd
            java.lang.Object r5 = r0.get(r8)
            android.accounts.Account r5 = (android.accounts.Account) r5
            ajlq r6 = r1.k
            boolean r10 = r6.b(r5)
            if (r10 != 0) goto L_0x026d
            r10 = r8
            r9 = 2
            goto L_0x03b5
        L_0x026d:
            boolean r10 = defpackage.azsd.b()
            r12 = -1
            if (r10 == 0) goto L_0x0288
            boolean r10 = defpackage.azte.c()
            if (r10 == 0) goto L_0x0288
            long r14 = r6.d
            int r10 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x0288
            r10 = 9
            java.lang.String r14 = "UlrAutoEnableEvents"
            defpackage.ajjb.a((java.lang.String) r14, (int) r10)
        L_0x0288:
            boolean r10 = defpackage.azsd.b()
            if (r10 == 0) goto L_0x031a
            r10 = r8
            long r7 = r6.d
            int r17 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r17 != 0) goto L_0x0297
            goto L_0x031b
        L_0x0297:
            long r7 = java.lang.System.currentTimeMillis()
            long r12 = r6.d
            long r12 = r7 - r12
            long r12 = java.lang.Math.abs(r12)
            long r17 = defpackage.aztb.b()
            int r19 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r19 >= 0) goto L_0x0317
            long r12 = r6.d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r14 = 143(0x8f, float:2.0E-43)
            r11.<init>(r14)
            java.lang.String r14 = "AutoEnableManager detected cleared data. currentTimeMillis: "
            r11.append(r14)
            r11.append(r7)
            java.lang.String r14 = " reportingAutoEnableManagerInitTimeMillis: "
            r11.append(r14)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "GCoreUlr"
            defpackage.ajix.a((java.lang.String) r12, (java.lang.String) r11)
            java.lang.String r11 = defpackage.rmp.a((android.accounts.Account) r5)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r12 = "AutoEnableManager detected cleared data for account: "
            int r13 = r11.length()
            if (r13 != 0) goto L_0x02e3
            java.lang.String r11 = new java.lang.String
            r11.<init>(r12)
            goto L_0x02e6
        L_0x02e3:
            r12.concat(r11)
        L_0x02e6:
            r6.a(r5)
            boolean r5 = defpackage.azte.c()
            if (r5 == 0) goto L_0x0314
            java.lang.String r5 = "UlrAutoEnableEvents"
            defpackage.ajjb.a((java.lang.String) r5, (int) r9)
            long r11 = r6.d
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r13
            int r5 = (int) r11
            java.lang.String r11 = "UlrCreationTimeSecondAutoEnableIneligibleSetNewAccountStoragePath"
            defpackage.ajjb.a((java.lang.String) r11, (int) r5)
            long r11 = r7 / r13
            int r5 = (int) r11
            java.lang.String r11 = "UlrCurrentElapsedSecondAutoEnableIneligibleSetNewAccountStoragePath"
            defpackage.ajjb.a((java.lang.String) r11, (int) r5)
            long r5 = r6.d
            long r7 = r7 - r5
            long r7 = r7 / r13
            int r5 = (int) r7
            java.lang.String r6 = "UlrDurationSecondAutoEnableIneligibleSetNewAccountStoragePath"
            defpackage.ajjb.a((java.lang.String) r6, (int) r5)
            r9 = 2
            goto L_0x03b5
        L_0x0314:
            r9 = 2
            goto L_0x03b5
        L_0x0317:
            r9 = 2
            goto L_0x03ac
        L_0x031a:
            r10 = r8
        L_0x031b:
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r11 = r6.c
            long r11 = r7 - r11
            long r13 = defpackage.aztb.b()
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x03ab
            long r11 = r6.c
            long r13 = defpackage.aztb.b()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r9 = 162(0xa2, float:2.27E-43)
            r15.<init>(r9)
            java.lang.String r9 = "AutoEnableManager detected cleared data. currentElapsed: "
            r15.append(r9)
            r15.append(r7)
            java.lang.String r9 = " creationTimeMillis: "
            r15.append(r9)
            r15.append(r11)
            java.lang.String r9 = " "
            r15.append(r9)
            long r11 = r7 - r11
            r15.append(r11)
            java.lang.String r9 = " < "
            r15.append(r9)
            r15.append(r13)
            java.lang.String r9 = r15.toString()
            java.lang.String r11 = "GCoreUlr"
            defpackage.ajix.a((java.lang.String) r11, (java.lang.String) r9)
            java.lang.String r9 = defpackage.rmp.a((android.accounts.Account) r5)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r11 = "AutoEnableManager detected cleared data for account: "
            int r12 = r9.length()
            if (r12 != 0) goto L_0x0379
            java.lang.String r9 = new java.lang.String
            r9.<init>(r11)
            goto L_0x037c
        L_0x0379:
            r11.concat(r9)
        L_0x037c:
            r6.a(r5)
            boolean r5 = defpackage.azte.b()
            if (r5 == 0) goto L_0x03a9
            java.lang.String r5 = "UlrAutoEnableEvents"
            r9 = 2
            defpackage.ajjb.a((java.lang.String) r5, (int) r9)
            long r11 = r6.c
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r13
            int r5 = (int) r11
            java.lang.String r11 = "UlrCreationTimeSecondAutoEnableIneligibleSetNewAccount"
            defpackage.ajjb.a((java.lang.String) r11, (int) r5)
            long r11 = r7 / r13
            int r5 = (int) r11
            java.lang.String r11 = "UlrCurrentElapsedSecondAutoEnableIneligibleSetNewAccount"
            defpackage.ajjb.a((java.lang.String) r11, (int) r5)
            long r5 = r6.c
            long r7 = r7 - r5
            long r7 = r7 / r13
            int r5 = (int) r7
            java.lang.String r6 = "UlrDurationSecondAutoEnableIneligibleSetNewAccount"
            defpackage.ajjb.a((java.lang.String) r6, (int) r5)
            goto L_0x03b5
        L_0x03a9:
            r9 = 2
            goto L_0x03b5
        L_0x03ab:
            r9 = 2
        L_0x03ac:
            ajmm r7 = r6.b
            r8 = 1
            r7.b(r5, r8)
            r6.e(r5)
        L_0x03b5:
            int r8 = r10 + 1
            r7 = 2
            r9 = 8
            r11 = 1
            goto L_0x0259
        L_0x03bd:
            r11 = 1
            goto L_0x06c9
        L_0x03c0:
            defpackage.ajob.a()
            ajlm r0 = r1.e
            boolean r5 = defpackage.azte.e()
            if (r5 != 0) goto L_0x03dc
            ajhz r0 = r0.f
            ajhw r5 = r0.e
            if (r5 == 0) goto L_0x03dc
            boolean r5 = r0.b()
            if (r5 != 0) goto L_0x03dc
            ajhw r0 = r0.e
            r0.e()
        L_0x03dc:
            defpackage.ajix.a()
            r1.a((java.lang.String) r2)
            boolean r0 = defpackage.aztb.A()
            if (r0 == 0) goto L_0x0465
            java.util.List r0 = r3.a
            java.util.Iterator r0 = r0.iterator()
        L_0x03ee:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0465
            java.lang.Object r5 = r0.next()
            com.google.android.location.reporting.state.update.AccountConfig r5 = (com.google.android.location.reporting.state.update.AccountConfig) r5
            boolean r6 = r5.f()
            if (r6 == 0) goto L_0x03ee
            boolean r6 = r5.e
            boolean r7 = r5.g
            if (r6 == r7) goto L_0x03ee
            android.accounts.Account r9 = r5.a
            java.lang.String r10 = "com.google.android.gms+lhlr-merge"
            ajmz r9 = defpackage.ajna.a(r9, r10)
            long r10 = r5.c
            r9.a((long) r10)
            r10 = 1
            r9.a((boolean) r10)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r8)
            r9.g = r11
            r9.h = r11
            r9.e = r10
            r9.a((boolean) r10)
            r9.b()
            ajna r9 = r9.a()
            ajmm r10 = r1.c
            java.lang.String r11 = "EnableMergeLRToLHSettingChange"
            java.lang.String r12 = "LR_merge_to_LH"
            r10.a(r11, r9, r12)
            android.accounts.Account r5 = r5.a
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r9 = java.lang.String.valueOf(r5)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r9 = r9 + 84
            r10.<init>(r9)
            java.lang.String r9 = "EnableMergeLRToLHSettingChange update account setting: LR:"
            r10.append(r9)
            r10.append(r6)
            java.lang.String r6 = " LH:"
            r10.append(r6)
            r10.append(r7)
            java.lang.String r6 = " on account:"
            r10.append(r6)
            r10.append(r5)
            r10.toString()
            goto L_0x03ee
        L_0x0465:
            ajmm r0 = r1.c
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0570
            java.util.List r0 = r3.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0473:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0570
            java.lang.Object r5 = r0.next()
            com.google.android.location.reporting.state.update.AccountConfig r5 = (com.google.android.location.reporting.state.update.AccountConfig) r5
            boolean r6 = r5.f()
            if (r6 == 0) goto L_0x0473
            android.accounts.Account r6 = r5.a
            boolean r7 = defpackage.aztb.m()
            if (r7 == 0) goto L_0x04c0
            boolean r7 = r1.a((com.google.android.location.reporting.state.update.AccountConfig) r5)
            if (r7 == 0) goto L_0x0494
            goto L_0x04c0
        L_0x0494:
            java.lang.String r7 = "com.google.android.gms+disable-flag"
            ajmz r6 = defpackage.ajna.a(r6, r7)
            long r9 = r5.c
            r6.a((long) r9)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            r6.g = r7
            r6.c()
            boolean r9 = defpackage.aztb.A()
            if (r9 != 0) goto L_0x04b0
            goto L_0x04b2
        L_0x04b0:
            r6.h = r7
        L_0x04b2:
            ajna r6 = r6.a()
            ajmm r7 = r1.c
            java.lang.String r9 = "DisableUlrFlagEnabled"
            java.lang.String r10 = "disable_ulr_flag"
            r7.a(r9, r6, r10)
            goto L_0x051e
        L_0x04c0:
            boolean r7 = defpackage.aztb.m()
            if (r7 == 0) goto L_0x04d5
            boolean r7 = r1.a((com.google.android.location.reporting.state.update.AccountConfig) r5)
            if (r7 != 0) goto L_0x04cd
            goto L_0x04d5
        L_0x04cd:
            ajmm r7 = r1.c
            r9 = 1
            r7.a((android.accounts.Account) r6, (boolean) r9)
            r6 = r4
            goto L_0x051e
        L_0x04d5:
            boolean r7 = defpackage.aztb.m()
            if (r7 != 0) goto L_0x051d
            ajmm r7 = r1.c
            android.accounts.Account r9 = r5.a
            boolean r7 = r7.e(r9)
            if (r7 != 0) goto L_0x0515
            boolean r7 = r5.e
            if (r7 != 0) goto L_0x0515
            java.lang.String r7 = "com.google.android.gms+disable-flag"
            ajmz r7 = defpackage.ajna.a(r6, r7)
            long r9 = r5.c
            r7.a((long) r9)
            r9 = 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)
            r7.g = r10
            r7.c()
            boolean r9 = defpackage.aztb.A()
            if (r9 != 0) goto L_0x0505
            goto L_0x0507
        L_0x0505:
            r7.h = r10
        L_0x0507:
            ajna r7 = r7.a()
            ajmm r9 = r1.c
            java.lang.String r10 = "DisableUlrFlagDisabled"
            java.lang.String r11 = "disable_ulr_flag"
            r9.a(r10, r7, r11)
            goto L_0x0516
        L_0x0515:
            r7 = r4
        L_0x0516:
            ajmm r9 = r1.c
            r9.a((android.accounts.Account) r6, (boolean) r8)
            r6 = r7
            goto L_0x051e
        L_0x051d:
            r6 = r4
        L_0x051e:
            if (r6 == 0) goto L_0x0473
            java.lang.Boolean r7 = r6.h
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.Boolean r6 = r6.i
            java.lang.String r6 = java.lang.String.valueOf(r6)
            android.accounts.Account r5 = r5.a
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r9 = java.lang.String.valueOf(r7)
            int r9 = r9.length()
            java.lang.String r10 = java.lang.String.valueOf(r6)
            int r10 = r10.length()
            java.lang.String r11 = java.lang.String.valueOf(r5)
            int r11 = r11.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r9 = r9 + 66
            int r9 = r9 + r10
            int r9 = r9 + r11
            r12.<init>(r9)
            java.lang.String r9 = "DisableUlrFlagDisabled update account setting: LR:"
            r12.append(r9)
            r12.append(r7)
            java.lang.String r7 = " LH:"
            r12.append(r7)
            r12.append(r6)
            java.lang.String r6 = " on account:"
            r12.append(r6)
            r12.append(r5)
            r12.toString()
            goto L_0x0473
        L_0x0570:
            r11 = 0
            goto L_0x06c9
        L_0x0573:
            java.lang.String r4 = "is_boot"
            boolean r0 = r0.getBooleanExtra(r4, r8)
            if (r0 == 0) goto L_0x06c8
            r0 = 1
            defpackage.ajmm.e = r0
            ajmo r0 = r1.d
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r6 = defpackage.ajmo.a
            monitor-enter(r6)
            java.util.List r7 = r0.c()     // Catch:{ all -> 0x06c5 }
            java.lang.Object r9 = defpackage.ajmo.a     // Catch:{ all -> 0x06c5 }
            boolean r9 = java.lang.Thread.holdsLock(r9)     // Catch:{ all -> 0x06c5 }
            if (r9 != 0) goto L_0x05a2
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x06c5 }
            java.lang.String r11 = "Caller must grab lock before calling"
            r9.<init>(r11)     // Catch:{ all -> 0x06c5 }
            java.lang.String r11 = "GCoreUlr"
            r12 = 17
            defpackage.ajix.a((java.lang.String) r11, (int) r12, (java.lang.Throwable) r9)     // Catch:{ all -> 0x06c5 }
        L_0x05a2:
            r0.a()     // Catch:{ all -> 0x06c5 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x06c5 }
        L_0x05a9:
            boolean r9 = r7.hasNext()     // Catch:{ all -> 0x06c5 }
            if (r9 == 0) goto L_0x05c7
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x06c5 }
            ajnb r9 = (defpackage.ajnb) r9     // Catch:{ all -> 0x06c5 }
            com.google.android.gms.location.reporting.UploadRequest r12 = r9.c     // Catch:{ all -> 0x06c5 }
            long r13 = r9.a     // Catch:{ all -> 0x06c5 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x06c5 }
            java.lang.String r9 = r9.d     // Catch:{ all -> 0x06c5 }
            r11 = r0
            r14 = r4
            r16 = r9
            r11.a(r12, r13, r14, r16)     // Catch:{ all -> 0x06c5 }
            goto L_0x05a9
        L_0x05c7:
            monitor-exit(r6)     // Catch:{ all -> 0x06c5 }
            android.content.Context r0 = r1.a
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r7 = defpackage.ajhf.a
            monitor-enter(r7)
            java.lang.String r6 = "ULR_HISTORIAN_STATE"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r6, r8)     // Catch:{ all -> 0x06c2 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x06c2 }
            java.lang.String r6 = "last_upload_timestamp"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r6, r4)     // Catch:{ all -> 0x06c2 }
            r0.apply()     // Catch:{ all -> 0x06c2 }
            monitor-exit(r7)     // Catch:{ all -> 0x06c2 }
            int r0 = android.os.Build.VERSION.SDK_INT
            android.content.Context r0 = r1.a
            boolean r4 = defpackage.jjy.a(r0)
            java.lang.String r5 = "com.google.android.location.reporting.service.LocationHistoryInjectorService"
            defpackage.jhg.a((android.content.Context) r0, (java.lang.String) r5, (boolean) r4)
            android.content.Context r0 = r1.a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.util.List r4 = r20.a()
            r1.a((java.util.List) r4)
            r1.b(r4)
            int r5 = android.os.Build.VERSION.SDK_INT
            java.lang.String r5 = "android.hardware.wifi"
            boolean r5 = r0.hasSystemFeature(r5)
            if (r5 == 0) goto L_0x060f
            r1.c(r4)
        L_0x060f:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r5 < r6) goto L_0x0620
            java.lang.String r5 = "android.hardware.bluetooth_le"
            boolean r0 = r0.hasSystemFeature(r5)
            if (r0 == 0) goto L_0x0620
            r1.d(r4)
        L_0x0620:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1.e(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1.f(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            android.content.Context r0 = r1.a
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r5 = "airplane_mode_on"
            int r0 = android.provider.Settings.Global.getInt(r0, r5, r8)
            if (r0 == 0) goto L_0x063c
            r0 = 1
            goto L_0x063d
        L_0x063c:
            r0 = 0
        L_0x063d:
            ajmm r5 = r1.c
            boolean r5 = r5.b((boolean) r0)
            if (r5 != 0) goto L_0x0646
            goto L_0x0667
        L_0x0646:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0667
            long r5 = java.lang.System.currentTimeMillis()
            com.google.android.ulr.ApiMetadata r5 = defpackage.ajnz.b(r0, r5)
            ajin r6 = r1.f
            java.lang.String r7 = "AirplaneModeMetaData"
            r6.a((java.util.List) r4, (com.google.android.ulr.ApiMetadata) r5, (java.lang.String) r7)
            java.lang.String r5 = "UlrAirplaneModeChange"
            defpackage.ajjb.a((java.lang.String) r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            defpackage.ajjd.b(r0, r4)
        L_0x0667:
            android.net.wifi.WifiManager r0 = r1.h
            if (r0 != 0) goto L_0x066c
            goto L_0x06ac
        L_0x066c:
            int r0 = r0.getWifiState()
            if (r0 != r10) goto L_0x0678
            r5 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            goto L_0x067f
        L_0x0678:
            r5 = 1
            if (r0 != r5) goto L_0x06c0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
        L_0x067f:
            ajmm r5 = r1.c
            boolean r6 = r0.booleanValue()
            boolean r5 = r5.a((boolean) r6)
            if (r5 == 0) goto L_0x06ac
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x06ac
            boolean r5 = r0.booleanValue()
            long r6 = java.lang.System.currentTimeMillis()
            com.google.android.ulr.ApiMetadata r5 = defpackage.ajnz.a((boolean) r5, (long) r6)
            ajin r6 = r1.f
            java.lang.String r7 = "WifiStateMetaData"
            r6.a((java.util.List) r4, (com.google.android.ulr.ApiMetadata) r5, (java.lang.String) r7)
            java.lang.String r5 = "UlrWifiStateChange"
            defpackage.ajjb.a((java.lang.String) r5)
            defpackage.ajjd.a(r0, r4)
        L_0x06ac:
            java.util.ArrayList r0 = new java.util.ArrayList
            ajmm r4 = r1.c
            com.google.android.location.reporting.state.update.ReportingConfig r4 = r4.a()
            java.util.Set r4 = r4.a()
            r0.<init>(r4)
            r1.g(r0)
            r11 = 0
            goto L_0x06c9
        L_0x06c0:
            r11 = 0
            goto L_0x06c9
        L_0x06c2:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x06c2 }
            throw r0
        L_0x06c5:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x06c5 }
            throw r0
        L_0x06c8:
            r11 = 0
        L_0x06c9:
            com.google.android.location.reporting.state.update.Conditions r0 = r3.b
            java.util.List r0 = r0.b()
            boolean r4 = r0.isEmpty()
            java.util.List r0 = r3.a
            java.util.Iterator r5 = r0.iterator()
        L_0x06d9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x07f1
            java.lang.Object r0 = r5.next()
            r6 = r0
            com.google.android.location.reporting.state.update.AccountConfig r6 = (com.google.android.location.reporting.state.update.AccountConfig) r6
            android.accounts.Account r7 = r6.a
            if (r7 != 0) goto L_0x0717
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 16
            int r7 = r7 + r9
            r8.<init>(r7)
            java.lang.String r7 = "null account in "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r0.<init>(r6)
            java.lang.String r6 = "GCoreUlr"
            java.lang.String r7 = ""
            defpackage.ajix.b(r6, r9, r7, r0)
            goto L_0x06d9
        L_0x0717:
            if (r4 == 0) goto L_0x07a3
            aztb r0 = defpackage.aztb.a
            aztc r0 = r0.a()
            long r8 = r0.bE()
            android.content.Context r0 = r1.a
            java.lang.String r10 = defpackage.rmp.a((android.accounts.Account) r7)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r12 = "Adding sync for account "
            int r13 = r10.length()
            if (r13 != 0) goto L_0x073b
            java.lang.String r10 = new java.lang.String
            r10.<init>(r12)
            goto L_0x073e
        L_0x073b:
            r12.concat(r10)
        L_0x073e:
            com.google.android.location.reporting.service.ReportingSyncChimeraService.a(r7, r0)     // Catch:{ RuntimeException -> 0x074e }
            ild r10 = new ild     // Catch:{ RuntimeException -> 0x074e }
            r10.<init>(r0)     // Catch:{ RuntimeException -> 0x074e }
            java.lang.String r0 = "com.google.android.location.reporting"
            android.os.Bundle r10 = android.os.Bundle.EMPTY     // Catch:{ RuntimeException -> 0x074e }
            defpackage.ild.a(r7, r0, r10, r8)     // Catch:{ RuntimeException -> 0x074e }
            goto L_0x077b
        L_0x074e:
            r0 = move-exception
            java.lang.String r10 = defpackage.rmp.a((android.accounts.Account) r7)
            java.lang.String r12 = java.lang.String.valueOf(r10)
            int r12 = r12.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r12 = r12 + 39
            r13.<init>(r12)
            java.lang.String r12 = "account: "
            r13.append(r12)
            r13.append(r10)
            java.lang.String r10 = ", period: "
            r13.append(r10)
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            java.lang.String r9 = "GCoreUlr"
            defpackage.ajix.b((java.lang.String) r9, (java.lang.String) r8, (java.lang.Throwable) r0)
        L_0x077b:
            if (r11 == 0) goto L_0x06d9
            boolean r0 = r6.k
            if (r0 != 0) goto L_0x06d9
            java.lang.String r0 = defpackage.rmp.a((android.accounts.Account) r7)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r6 = "Triggering manual sync to test re-auth for "
            int r8 = r0.length()
            if (r8 != 0) goto L_0x0797
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6)
            goto L_0x079a
        L_0x0797:
            r6.concat(r0)
        L_0x079a:
            android.content.Context r0 = r1.a
            java.lang.String r6 = "WorldUpdater"
            com.google.android.location.reporting.service.ReportingSyncChimeraService.a(r7, r6, r0)
            goto L_0x06d9
        L_0x07a3:
            android.content.Context r0 = r1.a
            java.lang.String r6 = defpackage.rmp.a((android.accounts.Account) r7)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r8 = "Ensuring no sync for account "
            int r9 = r6.length()
            if (r9 != 0) goto L_0x07bb
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
            goto L_0x07be
        L_0x07bb:
            r8.concat(r6)
        L_0x07be:
            com.google.android.location.reporting.service.ReportingSyncChimeraService.a(r7, r0)     // Catch:{ RuntimeException -> 0x07cf }
            ild r6 = new ild     // Catch:{ RuntimeException -> 0x07cf }
            r6.<init>(r0)     // Catch:{ RuntimeException -> 0x07cf }
            java.lang.String r0 = "com.google.android.location.reporting"
            android.os.Bundle r6 = android.os.Bundle.EMPTY     // Catch:{ RuntimeException -> 0x07cf }
            defpackage.ild.a(r7, r0, r6)     // Catch:{ RuntimeException -> 0x07cf }
            goto L_0x06d9
        L_0x07cf:
            r0 = move-exception
            java.lang.String r6 = defpackage.rmp.a((android.accounts.Account) r7)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "account: "
            int r8 = r6.length()
            if (r8 != 0) goto L_0x07e6
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
            goto L_0x07ea
        L_0x07e6:
            java.lang.String r6 = r7.concat(r6)
        L_0x07ea:
            java.lang.String r7 = "GCoreUlr"
            defpackage.ajix.b((java.lang.String) r7, (java.lang.String) r6, (java.lang.Throwable) r0)
            goto L_0x06d9
        L_0x07f1:
            ajlm r0 = r1.e
            java.lang.String r4 = "WorldUpdater:"
            int r5 = r2.length()
            if (r5 != 0) goto L_0x0801
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
            goto L_0x0805
        L_0x0801:
            java.lang.String r2 = r4.concat(r2)
        L_0x0805:
            r0.a((com.google.android.location.reporting.state.update.ReportingConfig) r3, (java.lang.String) r2)
            ajmn r0 = r1.b
            com.google.android.ulr.ApiRate r0 = r0.k()
            ajmn r2 = r1.b
            com.google.android.gms.location.NetworkLocationStatus r2 = r2.j()
            if (r0 == 0) goto L_0x0885
            if (r2 == 0) goto L_0x0885
            java.lang.Long r0 = r0.d()
            if (r0 == 0) goto L_0x0885
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r4 = r2.d
            long r2 = r3.toMillis(r4)
            ajmn r4 = r1.b
            long r5 = r4.a
            long r7 = r4.d
            long r9 = android.os.SystemClock.elapsedRealtime()
            aztb r4 = defpackage.aztb.a
            aztc r4 = r4.a()
            long r11 = r4.d()
            long r13 = r0.longValue()
            long r13 = r9 - r13
            long r13 = r13 - r11
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0846
            goto L_0x087e
        L_0x0846:
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x087e
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x087e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r4 = 123(0x7b, float:1.72E-43)
            r0.<init>(r4)
            java.lang.String r4 = "Missing location or location status: "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r2 = ", "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r2 = ", "
            r0.append(r2)
            r0.append(r9)
            r0.toString()
            r2 = 8
            defpackage.ajjb.a((int) r2)
            return
        L_0x087e:
            java.lang.String r0 = "UlrFlpLocationNotMissing"
            defpackage.ajjb.a((java.lang.String) r0)
            return
        L_0x0885:
            return
        L_0x0886:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0886 }
            goto L_0x088a
        L_0x0889:
            throw r0
        L_0x088a:
            goto L_0x0889
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajmi.a(android.content.Intent):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            boolean r2 = defpackage.azsj.b()
            if (r2 == 0) goto L_0x0264
            java.lang.String r2 = "ulrRelatedSettingChange triggered with action: "
            int r3 = r22.length()
            if (r3 != 0) goto L_0x0018
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            goto L_0x001b
        L_0x0018:
            r2.concat(r1)
        L_0x001b:
            java.util.List r2 = r21.a()
            int r3 = r22.hashCode()
            r4 = 3
            r5 = 1
            r6 = 0
            switch(r3) {
                case -1918487026: goto L_0x0093;
                case -1875733435: goto L_0x0089;
                case -1492165444: goto L_0x007f;
                case -1184851779: goto L_0x0074;
                case -1076576821: goto L_0x006a;
                case -1050121137: goto L_0x0060;
                case -511271086: goto L_0x0055;
                case 211362435: goto L_0x004b;
                case 259854786: goto L_0x0041;
                case 870701415: goto L_0x0036;
                case 1473645052: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x009d
        L_0x002b:
            java.lang.String r3 = "com.google.android.location.reporting.CHANGE_ON_WIFI_ALWAYS_SCAN_MODE"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            r1 = 2
            goto L_0x009e
        L_0x0036:
            java.lang.String r3 = "android.os.action.DEVICE_IDLE_MODE_CHANGED"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            r1 = 10
            goto L_0x009e
        L_0x0041:
            java.lang.String r3 = "com.google.android.location.reporting.CHANGE_ON_BATTERY_SAVER_MODE"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            r1 = 4
            goto L_0x009e
        L_0x004b:
            java.lang.String r3 = "com.google.gservices.intent.action.GSERVICES_CHANGED"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            r1 = 0
            goto L_0x009e
        L_0x0055:
            java.lang.String r3 = "android.location.MODE_CHANGED"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            r1 = 9
            goto L_0x009e
        L_0x0060:
            java.lang.String r3 = "com.google.android.location.reporting.CHANGE_ON_LOCATION_DISABLE_FOR_GOOGLE_APP"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            r1 = 1
            goto L_0x009e
        L_0x006a:
            java.lang.String r3 = "android.intent.action.AIRPLANE_MODE"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            r1 = 6
            goto L_0x009e
        L_0x0074:
            java.lang.String r3 = "android.location.PROVIDERS_CHANGED"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            r1 = 8
            goto L_0x009e
        L_0x007f:
            java.lang.String r3 = "com.google.android.location.reporting.CHANGE_ON_BLE_ALWAYS_SCAN_MODE"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            r1 = 3
            goto L_0x009e
        L_0x0089:
            java.lang.String r3 = "android.net.wifi.WIFI_STATE_CHANGED"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            r1 = 7
            goto L_0x009e
        L_0x0093:
            java.lang.String r3 = "com.google.android.location.reporting.CHANGE_ON_BATTERY_SAVER_MODE_THRESHOLD"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            r1 = 5
            goto L_0x009e
        L_0x009d:
            r1 = -1
        L_0x009e:
            r3 = 37
            switch(r1) {
                case 0: goto L_0x0260;
                case 1: goto L_0x025c;
                case 2: goto L_0x0258;
                case 3: goto L_0x0254;
                case 4: goto L_0x0250;
                case 5: goto L_0x024c;
                case 6: goto L_0x01f6;
                case 7: goto L_0x0195;
                case 8: goto L_0x0182;
                case 9: goto L_0x0182;
                case 10: goto L_0x00a4;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            return
        L_0x00a4:
            boolean r1 = defpackage.jkr.b()
            if (r1 == 0) goto L_0x00bc
            android.os.PowerManager r1 = r0.j
            if (r1 != 0) goto L_0x00b7
            java.lang.String r1 = "GCoreUlr"
            java.lang.String r4 = "Can not obtain Power Manager"
            defpackage.ajix.c(r1, r4)
            r1 = 0
            goto L_0x00bd
        L_0x00b7:
            boolean r1 = r1.isDeviceIdleMode()
            goto L_0x00bd
        L_0x00bc:
            r1 = 0
        L_0x00bd:
            if (r1 != 0) goto L_0x00c2
            java.lang.String r4 = "off"
            goto L_0x00c4
        L_0x00c2:
            java.lang.String r4 = "on"
        L_0x00c4:
            java.lang.String r5 = "Doze mode is changed to: "
            int r7 = r4.length()
            if (r7 != 0) goto L_0x00d2
            java.lang.String r4 = new java.lang.String
            r4.<init>(r5)
            goto L_0x00d5
        L_0x00d2:
            r5.concat(r4)
        L_0x00d5:
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x011e
            boolean r4 = defpackage.azss.c()
            if (r4 != 0) goto L_0x0118
            long r4 = java.lang.System.currentTimeMillis()
            com.google.android.ulr.ApiDeviceConnectivitySetting r10 = new com.google.android.ulr.ApiDeviceConnectivitySetting
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r8 = 0
            r10.<init>(r8, r7, r8)
            com.google.android.ulr.ApiMetadata r15 = new com.google.android.ulr.ApiMetadata
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r19 = 0
            r20 = 0
            r7 = r15
            r5 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            ajin r4 = r0.f
            java.lang.String r7 = "DozeModeMetaData"
            r4.a((java.util.List) r2, (com.google.android.ulr.ApiMetadata) r5, (java.lang.String) r7)
        L_0x0118:
            java.lang.String r4 = "UlrDozeModeChange"
            defpackage.ajjb.a((java.lang.String) r4)
        L_0x011e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r4 = java.lang.String.valueOf(r1)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + r3
            r7.<init>(r5)
            java.lang.String r3 = "UlrClearcutEvents.logDozeModeChange("
            r7.append(r3)
            r7.append(r4)
            java.lang.String r3 = ")"
            r7.append(r3)
            r7.toString()
            boolean r3 = defpackage.ajjd.d()
            if (r3 == 0) goto L_0x0181
            aswk r3 = defpackage.aswk.l
            aucd r3 = r3.o()
            boolean r4 = r1.booleanValue()
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x0159
            goto L_0x015e
        L_0x0159:
            r3.c()
            r3.c = r6
        L_0x015e:
            aucj r5 = r3.b
            aswk r5 = (defpackage.aswk) r5
            int r6 = r5.a
            r6 = r6 | 512(0x200, float:7.175E-43)
            r5.a = r6
            r5.k = r4
            aucj r3 = r3.i()
            aswk r3 = (defpackage.aswk) r3
            ajjc r4 = defpackage.ajjd.a
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x017b
            atfh r1 = defpackage.atfh.DOZE_MODE_OFF
            goto L_0x017d
        L_0x017b:
            atfh r1 = defpackage.atfh.DOZE_MODE_ON
        L_0x017d:
            r4.a((defpackage.aswk) r3, (defpackage.atfh) r1, (java.util.List) r2)
            return
        L_0x0181:
            return
        L_0x0182:
            java.util.ArrayList r1 = new java.util.ArrayList
            ajmm r2 = r0.c
            com.google.android.location.reporting.state.update.ReportingConfig r2 = r2.a()
            java.util.Set r2 = r2.a()
            r1.<init>(r2)
            r0.g(r1)
            return
        L_0x0195:
            android.net.wifi.WifiManager r1 = r0.h
            if (r1 == 0) goto L_0x01f5
            int r1 = r1.getWifiState()
            if (r1 != r4) goto L_0x01a4
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            goto L_0x01aa
        L_0x01a4:
            if (r1 != r5) goto L_0x01f5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
        L_0x01aa:
            ajmm r4 = r0.c
            boolean r5 = r1.booleanValue()
            boolean r4 = r4.a((boolean) r5)
            if (r4 == 0) goto L_0x01f5
            android.net.wifi.WifiManager r4 = r0.h
            int r4 = r4.getWifiState()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "Wifi state is changed to: "
            r5.append(r3)
            r5.append(r4)
            r5.toString()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x01f1
            boolean r3 = defpackage.azss.c()
            if (r3 != 0) goto L_0x01eb
            boolean r3 = r1.booleanValue()
            long r4 = java.lang.System.currentTimeMillis()
            com.google.android.ulr.ApiMetadata r3 = defpackage.ajnz.a((boolean) r3, (long) r4)
            ajin r4 = r0.f
            java.lang.String r5 = "WifiStateMetaData"
            r4.a((java.util.List) r2, (com.google.android.ulr.ApiMetadata) r3, (java.lang.String) r5)
        L_0x01eb:
            java.lang.String r3 = "UlrWifiStateChange"
            defpackage.ajjb.a((java.lang.String) r3)
        L_0x01f1:
            defpackage.ajjd.a(r1, r2)
            return
        L_0x01f5:
            return
        L_0x01f6:
            int r1 = android.os.Build.VERSION.SDK_INT
            android.content.Context r1 = r0.a
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r3 = "airplane_mode_on"
            int r1 = android.provider.Settings.Global.getInt(r1, r3, r6)
            if (r1 != 0) goto L_0x0208
            r5 = 0
            goto L_0x0209
        L_0x0208:
        L_0x0209:
            ajmm r1 = r0.c
            boolean r1 = r1.b((boolean) r5)
            if (r1 == 0) goto L_0x024b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 33
            r1.<init>(r3)
            java.lang.String r3 = "Airplane mode is changed to "
            r1.append(r3)
            r1.append(r5)
            r1.toString()
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0244
            boolean r1 = defpackage.azss.c()
            if (r1 != 0) goto L_0x023e
            long r3 = java.lang.System.currentTimeMillis()
            com.google.android.ulr.ApiMetadata r1 = defpackage.ajnz.b(r5, r3)
            ajin r3 = r0.f
            java.lang.String r4 = "AirplaneModeMetaData"
            r3.a((java.util.List) r2, (com.google.android.ulr.ApiMetadata) r1, (java.lang.String) r4)
        L_0x023e:
            java.lang.String r1 = "UlrAirplaneModeChange"
            defpackage.ajjb.a((java.lang.String) r1)
        L_0x0244:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            defpackage.ajjd.b(r1, r2)
        L_0x024b:
            return
        L_0x024c:
            r0.f(r2)
            return
        L_0x0250:
            r0.e(r2)
            return
        L_0x0254:
            r0.d(r2)
            return
        L_0x0258:
            r0.c(r2)
            return
        L_0x025c:
            r0.b(r2)
            return
        L_0x0260:
            r0.a((java.util.List) r2)
            return
        L_0x0264:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajmi.a(java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(List list) {
        if (this.c.b.a(azru.b() ? 1 : 0, "geo_supported_key")) {
            boolean b2 = azru.b();
            StringBuilder sb = new StringBuilder(41);
            sb.append("Geo supported setting is changed to ");
            sb.append(b2);
            sb.toString();
            Boolean valueOf = Boolean.valueOf(b2);
            String valueOf2 = String.valueOf(valueOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 41);
            sb2.append("UlrClearcutEvents.logGeoSupportedChange(");
            sb2.append(valueOf2);
            sb2.append(")");
            sb2.toString();
            if (ajjd.d()) {
                aucd o = aswk.l.o();
                boolean booleanValue = valueOf.booleanValue();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aswk aswk = (aswk) o.b;
                aswk.a |= 1;
                aswk.b = booleanValue;
                ajjd.a.a((aswk) o.i(), !valueOf.booleanValue() ? atfh.GEO_UNSUPPORTED : atfh.GEO_SUPPORTED, list);
            }
        }
    }
}
