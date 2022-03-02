package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.location.reporting.collectors.PowerModeReceiver;
import com.google.android.location.reporting.service.LocationReportingController$WifiStatusReceiver;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.ulr.ApiActivationChange;
import com.google.android.ulr.ApiBleRate;
import com.google.android.ulr.ApiBleScanReport;
import com.google.android.ulr.ApiDeviceConnectivitySetting;
import com.google.android.ulr.ApiInternalState;
import com.google.android.ulr.ApiLocationStatus;
import com.google.android.ulr.ApiMetadata;
import com.google.android.ulr.ApiPlaceInferenceResult;
import com.google.android.ulr.ApiPlaceReport;
import com.google.android.ulr.ApiRate;
import com.google.android.ulr.ApiStepCountsEntry;
import com.google.android.ulr.ApiWifiConnectivityStatus;
import com.google.android.ulr.LocationHistorianBatchData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ajlm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajlm implements ajhv {
    public final jiq a;
    public final ajin b;
    public final ajmm c;
    public final ajmn d;
    public final rom e;
    public final ajhz f;
    public final ajhb g;
    public final ajhp h;
    public int i = 2;
    public final ajll j;
    private final Context k;
    private final ajii l;
    private final ajmo m;
    private final ajkv n;
    private final ajhi o;
    private final ajmj p;
    private final ajnd q;
    private final ajho r;
    private final ajhv s;
    private final ajpz t;
    private PowerModeReceiver u;
    private LocationReportingController$WifiStatusReceiver v;
    private final ajmp w;
    private final iby x;

    public ajlm(Context context, jiq jiq, ajii ajii, ajin ajin, ajmo ajmo, ajmm ajmm, ajmn ajmn, rom rom, ajhv ajhv, ajhi ajhi, ajkv ajkv, ajmj ajmj, ajnd ajnd, ajhb ajhb, ajhp ajhp, iby iby, ajho ajho) {
        this.k = context;
        this.a = jiq;
        this.l = ajii;
        this.b = ajin;
        this.m = ajmo;
        this.c = ajmm;
        this.d = ajmn;
        this.e = rom;
        this.n = ajkv;
        this.s = ajhv;
        this.f = new ajhz(context, this, ajmo, ajmn);
        this.o = ajhi;
        this.p = ajmj;
        this.q = ajnd;
        this.g = ajhb;
        ajll ajll = this.j;
        this.j = ajll == null ? new ajll(this) : ajll;
        this.x = iby;
        this.h = ajhp;
        this.r = ajho;
        this.t = ajpz.a(context);
        this.w = ajmp.a(context);
    }

    public static PendingIntent a(Context context, Intent intent) {
        return PendingIntent.getService(context, 0, intent, 134217728);
    }

    private final boolean d() {
        ReportingConfig m2 = this.d.m();
        if (m2 == null) {
            String valueOf = String.valueOf(this.d);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
            sb.append("Skipping FLP amnesia test: no oldConfig in ");
            sb.append(valueOf);
            sb.toString();
            return false;
        } else if (m2.d()) {
            return true;
        } else {
            return false;
        }
    }

    private final synchronized void e() {
        LocationReportingController$WifiStatusReceiver locationReportingController$WifiStatusReceiver = this.v;
        if (locationReportingController$WifiStatusReceiver != null) {
            try {
                this.k.unregisterReceiver(locationReportingController$WifiStatusReceiver);
                this.v = null;
            } catch (IllegalArgumentException e2) {
                ajix.c("GCoreUlr", "Try to unregister a  wifi status receiver before register it!");
            }
        }
    }

    private final boolean f() {
        return !aztb.a.a().Y() || this.c.b.a.getInt("location_enabled_key", 3) != 0;
    }

    public final boolean a() {
        LocationReportingController$WifiStatusReceiver locationReportingController$WifiStatusReceiver = this.v;
        return locationReportingController$WifiStatusReceiver != null && locationReportingController$WifiStatusReceiver.a;
    }

    public final void b() {
        if (!azte.e()) {
            this.f.a();
        }
        this.o.a();
        PowerModeReceiver powerModeReceiver = this.u;
        if (powerModeReceiver != null) {
            this.k.unregisterReceiver(powerModeReceiver);
            this.u = null;
        }
        PendingIntent a2 = a("com.google.android.location.reporting.ACTION_LOCATION");
        this.e.a(a2);
        a2.cancel();
        PendingIntent a3 = a("com.google.android.location.reporting.ACTION_IMMEDIATE_LOCATION");
        a3.cancel();
        this.x.a(a("com.google.android.location.reporting.ACTION_ACTIVITY"));
        a3.cancel();
        this.d.a((ajmh) null);
        e();
        this.g.a();
        this.h.a();
        ajhn.a();
        ajix.a("GCoreUlr", "Unbound from all signal providers.");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c() {
        if (this.v == null) {
            LocationReportingController$WifiStatusReceiver locationReportingController$WifiStatusReceiver = new LocationReportingController$WifiStatusReceiver(this);
            this.v = locationReportingController$WifiStatusReceiver;
            Context context = this.k;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            context.registerReceiver(locationReportingController$WifiStatusReceiver, intentFilter);
            ajix.a("GCoreUlr", "Registered for wifi state change updates");
        }
    }

    private final PendingIntent a(String str) {
        return a(this.k, ajme.a(this.k, str));
    }

    private final void a(ReportingConfig reportingConfig, ApiRate apiRate) {
        this.b.a(reportingConfig.b(), ajnz.a(apiRate), "ApiRate");
    }

    public final void c(int i2) {
        if (this.b.a(this.c.a().b(), new ApiMetadata((ApiActivationChange) null, (ApiBleScanReport) null, (ApiDeviceConnectivitySetting) null, new ApiInternalState(Integer.valueOf(i2)), (LocationHistorianBatchData) null, (ApiLocationStatus) null, (ApiPlaceInferenceResult) null, (ApiPlaceReport) null, (ApiRate) null, (ApiStepCountsEntry) null, Long.valueOf(System.currentTimeMillis()), (ApiWifiConnectivityStatus) null, (ArrayList) null), "ApiInternalState")) {
            StringBuilder sb = new StringBuilder(87);
            sb.append("Successfully recorded ApInternalState change in datastore, internalStateId: ");
            sb.append(i2);
            sb.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public final ApiRate a(long j2) {
        if (aztb.q() || aztb.r()) {
            int i2 = this.i;
            switch (i2) {
                case 3:
                    return ajoa.b(j2);
                case 4:
                    return ajoa.a(aztb.a.a().aW(), "homeEnteredWifiConnected", j2);
                case 5:
                    return ajoa.a(aztb.a.a().aV(), "homeEnteredWifiDisconnected", j2);
                case 6:
                    return ajoa.a(aztb.a.a().bb(), "workEnteredWifiConnected", j2);
                case 7:
                    return ajoa.a(aztb.a.a().ba(), "workEnteredWifiDisconnected", j2);
                case 8:
                case 9:
                    return ajoa.a(aztb.B(), i2 == 8 ? "homeExit" : i2 != 9 ? "default" : "workExit", j2);
                default:
                    return ajoa.a(j2);
            }
        } else if (this.d.f) {
            return ajoa.b(j2);
        } else {
            return ajoa.a(j2);
        }
    }

    public final void b(int i2) {
        String str;
        StringBuilder sb = new StringBuilder(52);
        sb.append("Triggering possible sampling update for: ");
        sb.append(i2);
        sb.toString();
        switch (i2) {
            case 1:
                str = "PowerModeReceiver";
                break;
            case 2:
                str = "Moving";
                break;
            case 3:
                str = "Still";
                break;
            case 4:
                str = "AtHomeWithWifi";
                break;
            case 5:
                str = "AtHomeWithoutWifi";
                break;
            case 6:
                str = "AtWorkWithWifi";
                break;
            case 7:
                str = "AtWorkWithoutWifi";
                break;
            case 8:
                str = "HomeDeparture";
                break;
            case 9:
                str = "WorkDeparture";
                break;
            default:
                StringBuilder sb2 = new StringBuilder(35);
                sb2.append("Unknown sampling state: ");
                sb2.append(i2);
                ajix.c("GCoreUlr", 21, sb2.toString());
                str = "Unknown";
                break;
        }
        ajjb.a("UlrSamplingRateUpdateRequest", i2);
        ajme.b(this.k, str);
    }

    public final void a(int i2) {
        ajll ajll = this.j;
        if (ajll != null) {
            ajll.a(i2);
        }
    }

    public final void a(ReportingConfig reportingConfig, String str) {
        a(reportingConfig, str, false);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x08e8  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x093a  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x098b  */
    public final void a(com.google.android.location.reporting.state.update.ReportingConfig r32, java.lang.String r33, boolean r34) {
        /*
            r31 = this;
            r1 = r31
            r2 = r32
            r0 = r33
            r3 = 0
            defpackage.iva.b((java.lang.String) r3)
            long r4 = java.lang.System.currentTimeMillis()
            ajmm r6 = r1.c
            java.lang.Object r7 = defpackage.ajmm.f
            monitor-enter(r7)
            ajmp r6 = r6.b     // Catch:{ all -> 0x0cae }
            com.google.android.location.reporting.state.update.ReportingConfig r6 = r6.a()     // Catch:{ all -> 0x0cae }
            monitor-exit(r7)     // Catch:{ all -> 0x0cae }
            boolean r7 = defpackage.jkr.h()
            if (r7 == 0) goto L_0x0029
            ajpz r7 = r1.t
            boolean r8 = r32.d()
            r7.a((boolean) r8)
        L_0x0029:
            ajnd r7 = r1.q
            boolean r7 = defpackage.ajnw.a((com.google.android.location.reporting.state.update.ReportingConfig) r6, (com.google.android.location.reporting.state.update.ReportingConfig) r2, (defpackage.ajnd) r7)
            if (r7 == 0) goto L_0x0063
            ajmj r7 = r1.p
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r9 = "com.google.android.gms.location.reporting.SETTINGS_CHANGED"
            r8.<init>(r9)
            android.content.Context r9 = r7.a
            r9.sendBroadcast(r8)
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 24
            if (r8 < r9) goto L_0x0057
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r9 = "com.google.android.gms.location.reporting.SETTINGS_CHANGED"
            r8.<init>(r9)
            java.lang.String r9 = "com.google.android.googlequicksearchbox"
            android.content.Intent r8 = r8.setPackage(r9)
            android.content.Context r9 = r7.a
            r9.sendBroadcast(r8)
        L_0x0057:
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r9 = "android.location.InjectedSettingChanged"
            r8.<init>(r9)
            android.content.Context r7 = r7.a
            r7.sendBroadcast(r8)
        L_0x0063:
            boolean r7 = defpackage.ajjb.c()
            if (r7 != 0) goto L_0x006b
            goto L_0x00de
        L_0x006b:
            if (r6 == 0) goto L_0x00de
            ob r7 = new ob
            r7.<init>()
            java.util.List r8 = r6.b()
            r7.addAll(r8)
            java.util.List r8 = r32.b()
            r7.addAll(r8)
            java.util.Iterator r7 = r7.iterator()
        L_0x0084:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00de
            java.lang.Object r8 = r7.next()
            android.accounts.Account r8 = (android.accounts.Account) r8
            com.google.android.location.reporting.state.update.AccountConfig r9 = r6.a(r8)
            com.google.android.location.reporting.state.update.AccountConfig r8 = r2.a(r8)
            if (r9 != 0) goto L_0x00a0
            java.lang.String r8 = "UlrActivationOnAccountAdded"
            defpackage.ajjb.a((java.lang.String) r8)
            goto L_0x0084
        L_0x00a0:
            if (r8 != 0) goto L_0x00a8
            java.lang.String r8 = "UlrActivationOffAccountRemoved"
            defpackage.ajjb.a((java.lang.String) r8)
            goto L_0x0084
        L_0x00a8:
            boolean r10 = r9.j()
            if (r10 != 0) goto L_0x00c4
            boolean r10 = r8.j()
            if (r10 != 0) goto L_0x00b5
            goto L_0x00c4
        L_0x00b5:
            java.util.List r8 = defpackage.ajjb.a((com.google.android.location.reporting.state.update.AccountConfig) r9)
            int r8 = defpackage.ajjb.a((java.util.List) r8)
            java.lang.String r9 = "UlrActivationOn"
            defpackage.ajjb.a((java.lang.String) r9, (int) r8)
            goto L_0x0084
        L_0x00c4:
            boolean r9 = r9.j()
            if (r9 == 0) goto L_0x0084
            boolean r9 = r8.j()
            if (r9 != 0) goto L_0x0084
            java.util.List r8 = defpackage.ajjb.a((com.google.android.location.reporting.state.update.AccountConfig) r8)
            int r8 = defpackage.ajjb.a((java.util.List) r8)
            java.lang.String r9 = "UlrActivationOff"
            defpackage.ajjb.a((java.lang.String) r9, (int) r8)
            goto L_0x0084
        L_0x00de:
            ajkv r6 = r1.n
            ajmn r7 = r6.a
            ajmo r8 = r6.b
            java.util.List r8 = r8.c()
            boolean r8 = r8.isEmpty()
            r9 = 1
            r8 = r8 ^ r9
            boolean r10 = r7.h
            r7.h = r8
            if (r10 == r8) goto L_0x011a
            ajmn r6 = r6.a
            boolean r6 = r6.h
            java.lang.String r7 = java.lang.String.valueOf(r33)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 43
            r8.<init>(r7)
            java.lang.String r7 = "Has Active Burst Requests set to "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = " for "
            r8.append(r6)
            r8.append(r0)
            r8.toString()
        L_0x011a:
            java.util.List r6 = r32.b()
            boolean r7 = defpackage.azth.b()
            r8 = 60
            r10 = 0
            if (r7 == 0) goto L_0x0155
            ajmp r7 = r1.w
            boolean r7 = r7.b()
            boolean r14 = r6.isEmpty()
            if (r14 != 0) goto L_0x0144
            boolean r14 = r31.f()
            if (r14 != 0) goto L_0x013b
            goto L_0x0144
        L_0x013b:
            if (r7 == 0) goto L_0x0144
            java.lang.String r14 = "GCoreUlr"
            java.lang.String r15 = "Disable ULR due to private mode!"
            defpackage.ajix.a((java.lang.String) r14, (java.lang.String) r15)
        L_0x0144:
            boolean r14 = r6.isEmpty()
            if (r14 != 0) goto L_0x0899
            boolean r14 = r31.f()
            if (r14 != 0) goto L_0x0152
            goto L_0x0899
        L_0x0152:
            if (r7 != 0) goto L_0x0899
            goto L_0x0161
        L_0x0155:
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x0899
            boolean r7 = r31.f()
            if (r7 == 0) goto L_0x0899
        L_0x0161:
            ajii r7 = r1.l
            r7.a(r2)
            ajkv r7 = r1.n
            ajnc r7 = r7.b()
            java.lang.String r14 = defpackage.rmp.a((java.lang.Iterable) r6)
            java.lang.String r15 = java.lang.String.valueOf(r33)
            int r15 = r15.length()
            java.lang.String r16 = java.lang.String.valueOf(r14)
            int r16 = r16.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r15 = r15 + 40
            int r15 = r15 + r16
            r3.<init>(r15)
            r3.append(r0)
            java.lang.String r0 = ": Ensuring that reporting is active for "
            r3.append(r0)
            r3.append(r14)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "GCoreUlr"
            defpackage.ajix.a((java.lang.String) r3, (java.lang.String) r0)
            r0 = 102(0x66, float:1.43E-43)
            if (r34 == 0) goto L_0x01e8
            rom r3 = r1.e
            java.lang.String r7 = "com.google.android.location.reporting.ACTION_IMMEDIATE_LOCATION"
            android.app.PendingIntent r7 = r1.a((java.lang.String) r7)
            android.content.Context r8 = r1.k
            com.google.android.gms.location.LocationRequest r14 = com.google.android.gms.location.LocationRequest.a()
            r14.c((long) r10)
            r14.c((int) r0)
            r14.b((long) r10)
            r14.d(r10)
            r14.b((int) r9)
            aztb r0 = defpackage.aztb.a
            aztc r0 = r0.a()
            long r10 = r0.aG()
            r14.a((long) r10)
            java.lang.String r0 = "ulr"
            com.google.android.gms.location.internal.LocationRequestInternal r0 = com.google.android.gms.location.internal.LocationRequestInternal.a(r0, r14)
            java.lang.String r10 = "com.google.android.gms.location.reporting"
            r0.h = r10
            r0.a()
            com.google.android.gms.common.internal.ClientIdentity r8 = defpackage.ajqg.a(r8)
            java.util.List r8 = java.util.Collections.singletonList(r8)
            r0.a((java.util.List) r8)
            r3.a((com.google.android.gms.location.internal.LocationRequestInternal) r0, (android.app.PendingIntent) r7)
            goto L_0x04cf
        L_0x01e8:
            com.google.android.location.reporting.collectors.PowerModeReceiver r3 = r1.u
            if (r3 == 0) goto L_0x01ed
            goto L_0x0218
        L_0x01ed:
            com.google.android.location.reporting.collectors.PowerModeReceiver r3 = new com.google.android.location.reporting.collectors.PowerModeReceiver
            ajmo r10 = r1.m
            ajmn r11 = r1.d
            r3.<init>(r10, r11)
            r1.u = r3
            android.content.Context r10 = r1.k
            r3.a = r1
            android.content.IntentFilter r11 = new android.content.IntentFilter
            r11.<init>()
            java.lang.String r14 = "com.google.android.location.activity.DEEP_STILL_MODE_ENABLED"
            r11.addAction(r14)
            java.lang.String r14 = "com.google.android.location.activity.DEEP_STILL_MODE_DISABLED"
            r11.addAction(r14)
            java.lang.String r14 = "android.intent.action.ACTION_POWER_CONNECTED"
            r11.addAction(r14)
            java.lang.String r14 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            r11.addAction(r14)
            r10.registerReceiver(r3, r11)
        L_0x0218:
            r31.c()
            com.google.android.ulr.ApiRate r3 = r1.a((long) r4)
            ajmn r10 = r1.d
            com.google.android.ulr.ApiRate r10 = r10.k()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = java.lang.String.valueOf(r3)
            java.lang.String r14 = java.lang.String.valueOf(r10)
            int r14 = r14.length()
            java.lang.String r17 = java.lang.String.valueOf(r11)
            int r17 = r17.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r14 = r14 + 37
            int r14 = r14 + r17
            r15.<init>(r14)
            java.lang.String r14 = "Current ApiRate: "
            r15.append(r14)
            r15.append(r10)
            java.lang.String r10 = " candidate ApiRate: "
            r15.append(r10)
            r15.append(r11)
            r15.toString()
            long r10 = r7.b(r9)
            ajmn r14 = r1.d
            long r23 = defpackage.ajhh.a((defpackage.ajmn) r14)
            java.lang.Long r14 = r3.d()
            long r14 = r14.longValue()
            ajmn r9 = r1.d
            aztb r17 = defpackage.aztb.a
            aztc r17 = r17.a()
            boolean r17 = r17.bz()
            if (r17 == 0) goto L_0x028f
            boolean r12 = r9.i
            if (r12 != 0) goto L_0x0282
            boolean r9 = r9.j
            if (r9 != 0) goto L_0x0282
            goto L_0x028f
        L_0x0282:
            aztb r9 = defpackage.aztb.a
            aztc r9 = r9.a()
            long r20 = r9.aJ()
            r25 = r20
            goto L_0x029b
        L_0x028f:
            aztb r9 = defpackage.aztb.a
            aztc r9 = r9.a()
            long r20 = r9.b()
            r25 = r20
        L_0x029b:
            long r27 = java.lang.Math.max(r14, r10)
            android.content.Context r9 = r1.k
            java.lang.String r7 = r7.c()
            com.google.android.gms.common.internal.ClientIdentity r29 = defpackage.ajnw.a((android.content.Context) r9, (java.lang.String) r7)
            ajmh r7 = new ajmh
            r20 = r7
            r21 = r14
            r20.<init>(r21, r23, r25, r27, r29)
            boolean r9 = r31.d()
            if (r9 == 0) goto L_0x031c
            ajmn r9 = r1.d
            ajmh r9 = r9.c
            if (r9 == 0) goto L_0x031c
            boolean r10 = r7.a(r9)
            if (r10 == 0) goto L_0x02e8
            java.lang.String r9 = java.lang.String.valueOf(r7)
            java.lang.String r11 = java.lang.String.valueOf(r9)
            int r11 = r11.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r11 = r11 + 58
            r12.<init>(r11)
            java.lang.String r11 = "Current FLP request matches "
            r12.append(r11)
            r12.append(r9)
            java.lang.String r9 = ", no need to request a new one"
            r12.append(r9)
            r12.toString()
            goto L_0x031d
        L_0x02e8:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r11 = java.lang.String.valueOf(r7)
            java.lang.String r12 = java.lang.String.valueOf(r9)
            int r12 = r12.length()
            java.lang.String r14 = java.lang.String.valueOf(r11)
            int r14 = r14.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r12 = r12 + 52
            int r12 = r12 + r14
            r15.<init>(r12)
            java.lang.String r12 = "Need to re-register FLP request, current: "
            r15.append(r12)
            r15.append(r9)
            java.lang.String r9 = " desired: "
            r15.append(r9)
            r15.append(r11)
            r15.toString()
            goto L_0x031d
        L_0x031c:
            r10 = 0
        L_0x031d:
            boolean r9 = r31.d()
            if (r9 == 0) goto L_0x0386
            ajmn r9 = r1.d
            ajmh r9 = r9.c
            if (r9 == 0) goto L_0x0386
            boolean r11 = r7.b(r9)
            if (r11 == 0) goto L_0x0353
            java.lang.String r8 = java.lang.String.valueOf(r7)
            java.lang.String r9 = java.lang.String.valueOf(r8)
            int r9 = r9.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r9 = r9 + 61
            r12.<init>(r9)
            java.lang.String r9 = "Current NLP AR request matches "
            r12.append(r9)
            r12.append(r8)
            java.lang.String r8 = ", no need to request a new one"
            r12.append(r8)
            r12.toString()
            goto L_0x0387
        L_0x0353:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r12 = java.lang.String.valueOf(r7)
            java.lang.String r14 = java.lang.String.valueOf(r9)
            int r14 = r14.length()
            java.lang.String r15 = java.lang.String.valueOf(r12)
            int r15 = r15.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r14 = r14 + r8
            int r14 = r14 + r15
            r13.<init>(r14)
            java.lang.String r8 = "Need to re-register AR request with NLP, current: "
            r13.append(r8)
            r13.append(r9)
            java.lang.String r8 = " desired: "
            r13.append(r8)
            r13.append(r12)
            r13.toString()
            goto L_0x0387
        L_0x0386:
            r11 = 0
        L_0x0387:
            if (r10 == 0) goto L_0x03b7
            if (r11 == 0) goto L_0x03b7
            java.lang.String r0 = r3.e()
            if (r0 == 0) goto L_0x04cf
            ajmn r0 = r1.d
            com.google.android.ulr.ApiRate r0 = r0.k()
            if (r0 == 0) goto L_0x04cf
            java.lang.String r0 = r3.e()
            ajmn r7 = r1.d
            com.google.android.ulr.ApiRate r7 = r7.k()
            java.lang.String r7 = r7.e()
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x04cf
            ajmn r0 = r1.d
            r0.a((com.google.android.ulr.ApiRate) r3)
            r1.a((com.google.android.location.reporting.state.update.ReportingConfig) r2, (com.google.android.ulr.ApiRate) r3)
            goto L_0x04cf
        L_0x03b7:
            if (r10 != 0) goto L_0x0439
            rom r8 = r1.e
            java.lang.String r9 = "com.google.android.location.reporting.ACTION_LOCATION"
            android.app.PendingIntent r9 = r1.a((java.lang.String) r9)
            com.google.android.gms.location.LocationRequest r10 = com.google.android.gms.location.LocationRequest.a()
            long r12 = r7.a
            r10.c((long) r12)
            r10.c((int) r0)
            long r12 = r7.b
            r10.b((long) r12)
            long r12 = r7.d
            r10.d(r12)
            java.lang.String r0 = "ulr"
            com.google.android.gms.location.internal.LocationRequestInternal r0 = com.google.android.gms.location.internal.LocationRequestInternal.a(r0, r10)
            java.lang.String r10 = "com.google.android.gms.location.reporting"
            r0.h = r10
            r0.a()
            com.google.android.gms.common.internal.ClientIdentity r10 = r7.e
            java.util.List r10 = java.util.Collections.singletonList(r10)
            r0.a((java.util.List) r10)
            r8.a((com.google.android.gms.location.internal.LocationRequestInternal) r0, (android.app.PendingIntent) r9)
            java.lang.String r0 = r7.toString()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r8 = "GMS FLP location updates requested: "
            int r9 = r0.length()
            if (r9 != 0) goto L_0x0406
            java.lang.String r0 = new java.lang.String
            r0.<init>(r8)
            goto L_0x0409
        L_0x0406:
            r8.concat(r0)
        L_0x0409:
            long r8 = android.os.SystemClock.elapsedRealtime()
            ajmn r0 = r1.d
            r0.a(r3, r7, r8)
            r1.a((com.google.android.location.reporting.state.update.ReportingConfig) r2, (com.google.android.ulr.ApiRate) r3)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r3 = r3 + 36
            r8.<init>(r3)
            java.lang.String r3 = "GMS FLP location updates requested: "
            r8.append(r3)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            java.lang.String r3 = "GCoreUlr"
            defpackage.ajix.a((java.lang.String) r3, (java.lang.String) r0)
        L_0x0439:
            if (r11 != 0) goto L_0x04a3
            android.content.Context r0 = r1.k
            iby r3 = r1.x
            java.lang.String r8 = "com.google.android.location.reporting.ACTION_ACTIVITY"
            android.app.PendingIntent r8 = r1.a((java.lang.String) r8)
            com.google.android.gms.common.internal.ClientIdentity r9 = r7.e
            java.lang.String r9 = r9.b
            android.os.WorkSource r0 = defpackage.jlr.a((android.content.Context) r0, (java.lang.String) r9)
            rck r9 = new rck
            r9.<init>()
            long r10 = r7.c
            r9.a((long) r10)
            r10 = 0
            r9.c = r10
            java.lang.String r10 = "UlrSampleSpec"
            r9.e = r10
            r9.d = r0
            com.google.android.gms.location.ActivityRecognitionRequest r0 = r9.a()
            acwa r0 = r3.a((com.google.android.gms.location.ActivityRecognitionRequest) r0, (android.app.PendingIntent) r8)
            if (r0 == 0) goto L_0x047a
            ajmf r3 = new ajmf
            r3.<init>(r7)
            r0.a((defpackage.acvv) r3)
            ajmg r3 = new ajmg
            r3.<init>()
            r0.a((defpackage.acvs) r3)
        L_0x047a:
            ajmn r0 = r1.d
            r0.a((defpackage.ajmh) r7)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r3 = r3 + 26
            r7.<init>(r3)
            java.lang.String r3 = "GMS AR updates requested: "
            r7.append(r3)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            java.lang.String r3 = "GCoreUlr"
            defpackage.ajix.a((java.lang.String) r3, (java.lang.String) r0)
        L_0x04a3:
            android.content.Context r0 = r1.k
            android.content.Intent r3 = defpackage.ajmi.a((android.content.Context) r0)
            r7 = 0
            android.app.PendingIntent r3 = android.app.PendingIntent.getService(r0, r7, r3, r7)
            jbs r7 = new jbs
            r7.<init>(r0)
            r7.a((android.app.PendingIntent) r3)
            r23 = 2
            long r8 = android.os.SystemClock.elapsedRealtime()
            r10 = 3600000(0x36ee80, double:1.7786363E-317)
            long r24 = r8 + r10
            r26 = 3600000(0x36ee80, double:1.7786363E-317)
            java.lang.String r22 = "GCoreUlrWorldUpdater"
            java.lang.String r29 = "com.google.android.gms"
            r21 = r7
            r28 = r3
            r21.a((java.lang.String) r22, (int) r23, (long) r24, (long) r26, (android.app.PendingIntent) r28, (java.lang.String) r29)
        L_0x04cf:
            boolean r0 = defpackage.ajhb.b()
            if (r0 == 0) goto L_0x0717
            ajhb r0 = r1.g
            ajmo r3 = r1.m
            jiq r7 = r1.a
            if (r3 != 0) goto L_0x04df
            goto L_0x071c
        L_0x04df:
            if (r7 == 0) goto L_0x071c
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x071c
            aztb r7 = defpackage.aztb.a
            aztc r7 = r7.a()
            java.lang.String r7 = r7.bH()
            if (r7 == 0) goto L_0x050f
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L_0x050f
            java.lang.String r8 = "Setting test home place Id: "
            int r9 = r7.length()
            if (r9 != 0) goto L_0x0507
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            goto L_0x050a
        L_0x0507:
            r8.concat(r7)
        L_0x050a:
            r3.a((java.lang.String) r7)
            r7 = 1
            goto L_0x0510
        L_0x050f:
            r7 = 0
        L_0x0510:
            aztb r8 = defpackage.aztb.a
            aztc r8 = r8.a()
            java.lang.String r8 = r8.bI()
            r9 = -1
            if (r8 == 0) goto L_0x053a
            boolean r11 = r8.isEmpty()
            if (r11 != 0) goto L_0x053a
            java.lang.String r0 = "Setting test work place Id: "
            int r7 = r8.length()
            if (r7 != 0) goto L_0x0532
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0)
            goto L_0x0535
        L_0x0532:
            r0.concat(r8)
        L_0x0535:
            r3.b((java.lang.String) r8)
            goto L_0x066c
        L_0x053a:
            if (r7 != 0) goto L_0x066c
            long r7 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r11 = r3.c
            java.lang.String r12 = "lastInferredPlacesRefreshTime"
            long r11 = r11.getLong(r12, r9)
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x054d
            goto L_0x055e
        L_0x054d:
            aztb r9 = defpackage.aztb.a
            aztc r9 = r9.a()
            long r9 = r9.bx()
            long r11 = r11 + r9
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x055e
            goto L_0x0607
        L_0x055e:
            android.content.Context r9 = r0.c
            boolean r9 = defpackage.ajnw.d(r9)
            if (r9 == 0) goto L_0x071c
            r3.a((long) r7)
            int r7 = r6.size()
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0570:
            if (r10 >= r7) goto L_0x05fa
            java.lang.Object r11 = r6.get(r10)
            android.accounts.Account r11 = (android.accounts.Account) r11
            ajha r12 = r0.h
            android.content.Context r12 = r12.a
            ajih r13 = new ajih
            r13.<init>(r12)
            java.lang.String[] r12 = r13.a(r11)
            if (r12 != 0) goto L_0x0588
            goto L_0x05e0
        L_0x0588:
            int r13 = r12.length
            if (r13 == 0) goto L_0x05e0
            r14 = 2
            if (r13 == r14) goto L_0x05b9
            java.lang.String r0 = r11.name
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r3 = r3 + 99
            r7.<init>(r3)
            java.lang.String r3 = "Bad length for inferred places in account "
            r7.append(r3)
            r7.append(r0)
            java.lang.String r0 = ". Expected 2, got "
            r7.append(r0)
            r7.append(r13)
            java.lang.String r0 = ". Not enabling placefencing."
            r7.append(r0)
            r7.toString()
            goto L_0x071c
        L_0x05b9:
            r11 = 0
            r13 = r12[r11]
            if (r13 != 0) goto L_0x05c0
            goto L_0x05cb
        L_0x05c0:
            if (r8 == 0) goto L_0x05ca
            boolean r11 = r8.equals(r13)
            if (r11 != 0) goto L_0x05cb
            goto L_0x071c
        L_0x05ca:
            r8 = r13
        L_0x05cb:
            r11 = 1
            r12 = r12[r11]
            if (r12 != 0) goto L_0x05d2
            goto L_0x05dd
        L_0x05d2:
            if (r9 == 0) goto L_0x05dc
            boolean r11 = r9.equals(r12)
            if (r11 != 0) goto L_0x05dd
            goto L_0x071c
        L_0x05dc:
            r9 = r12
        L_0x05dd:
            int r10 = r10 + 1
            goto L_0x0570
        L_0x05e0:
            java.lang.String r0 = r11.name
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "Not enabling placefences, no inferred places for account "
            int r7 = r0.length()
            if (r7 != 0) goto L_0x05f5
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            goto L_0x071c
        L_0x05f5:
            r3.concat(r0)
            goto L_0x071c
        L_0x05fa:
            if (r8 == 0) goto L_0x05fd
            goto L_0x0601
        L_0x05fd:
            if (r9 != 0) goto L_0x0601
            goto L_0x071c
        L_0x0601:
            r3.a((java.lang.String) r8)
            r3.b((java.lang.String) r9)
        L_0x0607:
            java.lang.String r0 = r3.e()
            java.lang.String r7 = r3.f()
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r8 = r8.length()
            java.lang.String r9 = java.lang.String.valueOf(r7)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r8 = r8 + 23
            int r8 = r8 + r9
            r10.<init>(r8)
            java.lang.String r8 = "Cached home = "
            r10.append(r8)
            r10.append(r0)
            java.lang.String r0 = ", work = "
            r10.append(r0)
            r10.append(r7)
            r10.toString()
            java.lang.String r0 = r3.e()
            if (r0 == 0) goto L_0x0650
            java.lang.String r0 = r3.f()
            if (r0 != 0) goto L_0x0647
            goto L_0x0650
        L_0x0647:
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r3 = "can enable home and work placefences"
            defpackage.ajix.a((java.lang.String) r0, (java.lang.String) r3)
            goto L_0x0670
        L_0x0650:
            java.lang.String r0 = r3.e()
            if (r0 == 0) goto L_0x065e
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r3 = "can enable home placefence"
            defpackage.ajix.a((java.lang.String) r0, (java.lang.String) r3)
            goto L_0x0670
        L_0x065e:
            java.lang.String r0 = r3.f()
            if (r0 == 0) goto L_0x0670
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r3 = "can enable work placefence"
            defpackage.ajix.a((java.lang.String) r0, (java.lang.String) r3)
            goto L_0x0670
        L_0x066c:
            r3.a((long) r9)
        L_0x0670:
            ajhb r0 = r1.g
            ajmo r3 = r1.m
            java.lang.String r3 = r3.e()
            ajmo r7 = r1.m
            java.lang.String r7 = r7.f()
            ajll r8 = r1.j
            if (r8 == 0) goto L_0x071c
            boolean r9 = defpackage.aztb.q()
            if (r9 != 0) goto L_0x0689
            goto L_0x0692
        L_0x0689:
            if (r3 == 0) goto L_0x0692
            boolean r9 = r3.isEmpty()
            if (r9 != 0) goto L_0x0692
            goto L_0x06a0
        L_0x0692:
            boolean r9 = defpackage.aztb.r()
            if (r9 == 0) goto L_0x071c
            if (r7 == 0) goto L_0x071c
            boolean r9 = r7.isEmpty()
            if (r9 != 0) goto L_0x071c
        L_0x06a0:
            java.util.HashSet r9 = new java.util.HashSet
            r10 = 2
            r9.<init>(r10)
            if (r3 == 0) goto L_0x06b5
            boolean r10 = defpackage.aztb.q()
            if (r10 == 0) goto L_0x06b5
            r0.d = r3
            java.lang.String r3 = r0.d
            r9.add(r3)
        L_0x06b5:
            if (r7 != 0) goto L_0x06b8
            goto L_0x06c5
        L_0x06b8:
            boolean r3 = defpackage.aztb.r()
            if (r3 == 0) goto L_0x06c5
            r0.e = r7
            java.lang.String r3 = r0.e
            r9.add(r3)
        L_0x06c5:
            r0.i = r8
            com.google.android.location.reporting.collectors.HomeWorkNearbyAlertsHelper$NearbyAlertReceiver r3 = r0.f
            if (r3 != 0) goto L_0x06e0
            com.google.android.location.reporting.collectors.HomeWorkNearbyAlertsHelper$NearbyAlertReceiver r3 = new com.google.android.location.reporting.collectors.HomeWorkNearbyAlertsHelper$NearbyAlertReceiver
            r3.<init>(r0)
            r0.f = r3
            android.content.Context r3 = r0.c
            com.google.android.location.reporting.collectors.HomeWorkNearbyAlertsHelper$NearbyAlertReceiver r7 = r0.f
            android.content.IntentFilter r8 = new android.content.IntentFilter
            java.lang.String r10 = "com.google.android.location.reporting.ALIASED_PLACE_ALERT_AVAILABLE"
            r8.<init>(r10)
            r3.registerReceiver(r7, r8)
        L_0x06e0:
            com.google.android.gms.location.places.NearbyAlertFilter r3 = com.google.android.gms.location.places.NearbyAlertFilter.b(r9)
            aztb r7 = defpackage.aztb.a
            aztc r7 = r7.a()
            long r7 = r7.bw()
            aztb r9 = defpackage.aztb.a
            aztc r9 = r9.a()
            long r9 = r9.bv()
            int r8 = (int) r7
            int r7 = defpackage.ajjl.a((int) r8)
            int r8 = (int) r9
            int r8 = defpackage.ajjl.b(r8)
            com.google.android.gms.location.places.NearbyAlertRequest r3 = com.google.android.gms.location.places.NearbyAlertRequest.a(r3, r7, r8)
            ajjl r7 = r0.b
            android.content.Context r8 = r0.c
            java.lang.String r9 = "com.google.android.location.reporting.ALIASED_PLACE_ALERT_AVAILABLE"
            android.app.PendingIntent r8 = defpackage.ajnw.b(r8, r9)
            r7.a(r8, r3)
            r3 = 1
            r0.g = r3
            goto L_0x071c
        L_0x0717:
            ajhb r0 = r1.g
            r0.a()
        L_0x071c:
            ajmn r0 = r1.d
            aztb r3 = defpackage.aztb.a
            aztc r3 = r3.a()
            boolean r3 = r3.az()
            if (r3 == 0) goto L_0x0748
            aztb r3 = defpackage.aztb.a
            aztc r3 = r3.a()
            boolean r3 = r3.aa()
            if (r3 != 0) goto L_0x0737
            goto L_0x0740
        L_0x0737:
            boolean r3 = r0.i
            if (r3 != 0) goto L_0x0748
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x0740
            goto L_0x0748
        L_0x0740:
            ajhp r0 = r1.h
            ajho r3 = r1.r
            r0.a(r3)
            goto L_0x074d
        L_0x0748:
            ajhp r0 = r1.h
            r0.a()
        L_0x074d:
            android.content.Context r0 = r1.k
            jiq r3 = r1.a
            ajin r7 = r1.b
            ajmm r8 = r1.c
            com.google.android.location.reporting.state.update.ReportingConfig r8 = r8.a()
            defpackage.ajhn.b(r0, r3, r7, r8)
            boolean r0 = defpackage.azte.e()
            if (r0 != 0) goto L_0x07f5
            ajhz r0 = r1.f
            aztb r3 = defpackage.aztb.a
            aztc r3 = r3.a()
            boolean r3 = r3.aM()
            int r7 = android.os.Build.VERSION.SDK_INT
            aztb r7 = defpackage.aztb.a
            aztc r7 = r7.a()
            boolean r7 = r7.aL()
            if (r7 == 0) goto L_0x07f0
            boolean r7 = r0.d
            if (r7 != 0) goto L_0x0781
            goto L_0x0785
        L_0x0781:
            if (r3 != 0) goto L_0x0785
        L_0x0783:
            goto L_0x07f0
        L_0x0785:
            android.bluetooth.BluetoothAdapter r3 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r3 == 0) goto L_0x07f0
            aztb r3 = defpackage.aztb.a
            aztc r3 = r3.a()
            boolean r3 = r3.j()
            if (r3 == 0) goto L_0x0798
            goto L_0x079f
        L_0x0798:
            boolean r3 = defpackage.ajht.g()
            if (r3 != 0) goto L_0x079f
            goto L_0x0783
        L_0x079f:
            ajmn r0 = r0.c
            aztb r3 = defpackage.aztb.a
            aztc r3 = r3.a()
            boolean r3 = r3.X()
            if (r3 != 0) goto L_0x07ae
            goto L_0x07b7
        L_0x07ae:
            boolean r3 = r0.i
            if (r3 != 0) goto L_0x07f0
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x07b7
            goto L_0x07f0
        L_0x07b7:
            ajhz r0 = r1.f
            r3 = 1
            r0.f = r3     // Catch:{ RuntimeException -> 0x07e2 }
            ajie r3 = r0.a     // Catch:{ RuntimeException -> 0x07e2 }
            boolean r7 = r3.e     // Catch:{ RuntimeException -> 0x07e2 }
            if (r7 != 0) goto L_0x07ce
            android.content.Context r7 = r3.a     // Catch:{ RuntimeException -> 0x07e2 }
            android.content.BroadcastReceiver r8 = r3.f     // Catch:{ RuntimeException -> 0x07e2 }
            android.content.IntentFilter r9 = r3.b     // Catch:{ RuntimeException -> 0x07e2 }
            r7.registerReceiver(r8, r9)     // Catch:{ RuntimeException -> 0x07e2 }
            r7 = 1
            r3.e = r7     // Catch:{ RuntimeException -> 0x07e2 }
        L_0x07ce:
            boolean r3 = defpackage.ajhz.e()     // Catch:{ RuntimeException -> 0x07e2 }
            if (r3 != 0) goto L_0x07de
            boolean r3 = defpackage.ajif.a()     // Catch:{ RuntimeException -> 0x07e2 }
            if (r3 != 0) goto L_0x07de
            r0.d()     // Catch:{ RuntimeException -> 0x07e2 }
            goto L_0x07e6
        L_0x07de:
            r0.c()     // Catch:{ RuntimeException -> 0x07e2 }
            goto L_0x07e6
        L_0x07e2:
            r0 = move-exception
            defpackage.ajhz.a(r0)
        L_0x07e6:
            ajhz r0 = r1.f
            ajhw r0 = r0.e
            if (r0 == 0) goto L_0x07f5
            r0.f()
            goto L_0x07f5
        L_0x07f0:
            ajhz r0 = r1.f
            r0.a()
        L_0x07f5:
            boolean r0 = defpackage.azrx.c()
            if (r0 != 0) goto L_0x080a
            boolean r0 = defpackage.azrx.b()
            if (r0 == 0) goto L_0x0802
            goto L_0x080a
        L_0x0802:
            ajhi r0 = r1.o
            r0.a()
            r7 = 0
            goto L_0x0994
        L_0x080a:
            ajhi r0 = r1.o
            boolean r3 = defpackage.azrx.c()
            if (r3 == 0) goto L_0x0825
            ajhl r3 = r0.b
            if (r3 != 0) goto L_0x0828
            android.content.Context r3 = r0.a
            r7 = 0
            ajhl r3 = defpackage.ajhl.a(r3, r7)
            r0.b = r3
            ajhl r3 = r0.b
            r3.a()
            goto L_0x0828
        L_0x0825:
            r0.b()
        L_0x0828:
            boolean r3 = defpackage.azrx.b()
            if (r3 != 0) goto L_0x0834
            r0.c()
            r7 = 0
            goto L_0x0994
        L_0x0834:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r7 = 0
        L_0x083a:
            ou r8 = r0.c
            int r9 = r8.h
            if (r7 >= r9) goto L_0x085d
            java.lang.Object r8 = r8.b((int) r7)
            android.accounts.Account r8 = (android.accounts.Account) r8
            boolean r9 = r6.contains(r8)
            if (r9 != 0) goto L_0x0857
            ou r9 = r0.c
            java.lang.Object r9 = r9.c(r7)
            ajhl r9 = (defpackage.ajhl) r9
            r9.b()
        L_0x0857:
            r3.add(r8)
            int r7 = r7 + 1
            goto L_0x083a
        L_0x085d:
            r7 = 0
        L_0x085e:
            int r8 = r3.size()
            if (r7 >= r8) goto L_0x0870
            ou r8 = r0.c
            java.lang.Object r9 = r3.get(r7)
            r8.remove(r9)
            int r7 = r7 + 1
            goto L_0x085e
        L_0x0870:
            r3 = 0
        L_0x0871:
            int r7 = r6.size()
            if (r3 >= r7) goto L_0x0896
            java.lang.Object r7 = r6.get(r3)
            android.accounts.Account r7 = (android.accounts.Account) r7
            ou r8 = r0.c
            boolean r8 = r8.containsKey(r7)
            if (r8 != 0) goto L_0x0893
            android.content.Context r8 = r0.a
            ajhl r8 = defpackage.ajhl.a(r8, r7)
            ou r9 = r0.c
            r9.put(r7, r8)
            r8.a()
        L_0x0893:
            int r3 = r3 + 1
            goto L_0x0871
        L_0x0896:
            r7 = 0
            goto L_0x0994
        L_0x0899:
            java.lang.String r3 = r32.e()
            java.lang.String r6 = java.lang.String.valueOf(r33)
            int r6 = r6.length()
            java.lang.String r7 = java.lang.String.valueOf(r3)
            int r7 = r7.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r6 = r6 + 57
            int r6 = r6 + r7
            r9.<init>(r6)
            r9.append(r0)
            java.lang.String r0 = ": Ensuring that reporting is stopped because of reasons: "
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = r9.toString()
            java.lang.String r3 = "GCoreUlr"
            defpackage.ajix.a((java.lang.String) r3, (java.lang.String) r0)
            r31.b()
            ajmo r0 = r1.m
            android.content.SharedPreferences r0 = r0.c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.clear()
            r3 = 3
            java.lang.String r6 = "apiLevel"
            r0.putInt(r6, r3)
            r0.apply()
            ajii r3 = r1.l
            boolean r0 = defpackage.azsy.e()
            if (r0 == 0) goto L_0x0934
            ajim r6 = r3.a
            java.lang.Object r7 = r6.c
            monitor-enter(r7)
            com.google.android.gms.leveldb.LevelDb r0 = r6.d     // Catch:{ all -> 0x0931 }
            if (r0 == 0) goto L_0x092f
            r9 = 0
            int r0 = r0.deleteRange(r9, r9)     // Catch:{ LevelDbCorruptionException -> 0x091a, IllegalStateException -> 0x0918, LevelDbException -> 0x090c }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ LevelDbCorruptionException -> 0x091a, IllegalStateException -> 0x0918, LevelDbException -> 0x090c }
            r9.<init>(r8)     // Catch:{ LevelDbCorruptionException -> 0x091a, IllegalStateException -> 0x0918, LevelDbException -> 0x090c }
            java.lang.String r10 = "Deleted "
            r9.append(r10)     // Catch:{ LevelDbCorruptionException -> 0x091a, IllegalStateException -> 0x0918, LevelDbException -> 0x090c }
            r9.append(r0)     // Catch:{ LevelDbCorruptionException -> 0x091a, IllegalStateException -> 0x0918, LevelDbException -> 0x090c }
            java.lang.String r0 = " entries from datastore for all accounts."
            r9.append(r0)     // Catch:{ LevelDbCorruptionException -> 0x091a, IllegalStateException -> 0x0918, LevelDbException -> 0x090c }
            r9.toString()     // Catch:{ LevelDbCorruptionException -> 0x091a, IllegalStateException -> 0x0918, LevelDbException -> 0x090c }
            goto L_0x091e
        L_0x090c:
            r0 = move-exception
            java.lang.String r9 = "GCoreUlr"
            java.lang.String r10 = "Error removing all entries"
            defpackage.ajix.a((java.lang.String) r9, (java.lang.String) r10, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0931 }
            defpackage.ajjf.a(r0)     // Catch:{ all -> 0x0931 }
            goto L_0x091e
        L_0x0918:
            r0 = move-exception
            goto L_0x091b
        L_0x091a:
            r0 = move-exception
        L_0x091b:
            r6.a((java.lang.Exception) r0)     // Catch:{ all -> 0x0931 }
        L_0x091e:
            android.content.Context r0 = r6.b     // Catch:{ all -> 0x0931 }
            ajmo r0 = defpackage.ajmo.a((android.content.Context) r0)     // Catch:{ all -> 0x0931 }
            ajio r6 = r6.a     // Catch:{ all -> 0x0931 }
            javax.crypto.spec.SecretKeySpec r0 = r0.b()     // Catch:{ all -> 0x0931 }
            r6.a((javax.crypto.spec.SecretKeySpec) r0)     // Catch:{ all -> 0x0931 }
            monitor-exit(r7)     // Catch:{ all -> 0x0931 }
            goto L_0x0934
        L_0x092f:
            monitor-exit(r7)     // Catch:{ all -> 0x0931 }
            goto L_0x0934
        L_0x0931:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0931 }
            throw r0
        L_0x0934:
            boolean r0 = defpackage.azsy.c()
            if (r0 == 0) goto L_0x098b
            ajik r3 = r3.b
            if (r3 == 0) goto L_0x0989
            java.lang.Object r6 = r3.c
            monitor-enter(r6)
            com.google.android.gms.leveldb.LevelDb r0 = r3.d     // Catch:{ all -> 0x0986 }
            if (r0 == 0) goto L_0x0983
            r7 = 0
            int r0 = r0.deleteRange(r7, r7)     // Catch:{ LevelDbCorruptionException -> 0x096e, IllegalStateException -> 0x096c, LevelDbException -> 0x0960 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ LevelDbCorruptionException -> 0x096e, IllegalStateException -> 0x096c, LevelDbException -> 0x0960 }
            r9.<init>(r8)     // Catch:{ LevelDbCorruptionException -> 0x096e, IllegalStateException -> 0x096c, LevelDbException -> 0x0960 }
            java.lang.String r8 = "Deleted "
            r9.append(r8)     // Catch:{ LevelDbCorruptionException -> 0x096e, IllegalStateException -> 0x096c, LevelDbException -> 0x0960 }
            r9.append(r0)     // Catch:{ LevelDbCorruptionException -> 0x096e, IllegalStateException -> 0x096c, LevelDbException -> 0x0960 }
            java.lang.String r0 = " entries from datastore for all accounts."
            r9.append(r0)     // Catch:{ LevelDbCorruptionException -> 0x096e, IllegalStateException -> 0x096c, LevelDbException -> 0x0960 }
            r9.toString()     // Catch:{ LevelDbCorruptionException -> 0x096e, IllegalStateException -> 0x096c, LevelDbException -> 0x0960 }
            goto L_0x0972
        L_0x0960:
            r0 = move-exception
            java.lang.String r8 = "GCoreUlr"
            java.lang.String r9 = "Error removing all entries"
            defpackage.ajix.a((java.lang.String) r8, (java.lang.String) r9, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0986 }
            defpackage.ajjf.a(r0)     // Catch:{ all -> 0x0986 }
            goto L_0x0972
        L_0x096c:
            r0 = move-exception
            goto L_0x096f
        L_0x096e:
            r0 = move-exception
        L_0x096f:
            r3.a((java.lang.Exception) r0)     // Catch:{ all -> 0x0986 }
        L_0x0972:
            android.content.Context r0 = r3.b     // Catch:{ all -> 0x0986 }
            ajmo r0 = defpackage.ajmo.a((android.content.Context) r0)     // Catch:{ all -> 0x0986 }
            ajio r3 = r3.a     // Catch:{ all -> 0x0986 }
            javax.crypto.spec.SecretKeySpec r0 = r0.b()     // Catch:{ all -> 0x0986 }
            r3.a((javax.crypto.spec.SecretKeySpec) r0)     // Catch:{ all -> 0x0986 }
            monitor-exit(r6)     // Catch:{ all -> 0x0986 }
            goto L_0x098c
        L_0x0983:
            r7 = 0
            monitor-exit(r6)     // Catch:{ all -> 0x0986 }
            goto L_0x098c
        L_0x0986:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0986 }
            throw r0
        L_0x0989:
            r7 = 0
            goto L_0x098c
        L_0x098b:
            r7 = 0
        L_0x098c:
            ajmn r0 = r1.d
            r0.a()
            defpackage.ajjb.b()
        L_0x0994:
            ajmn r0 = r1.d
            r0.a((com.google.android.location.reporting.state.update.ReportingConfig) r2)
            ajmm r0 = r1.c
            r0.b()
            java.lang.Object r3 = defpackage.ajmm.f
            monitor-enter(r3)
            ajmp r0 = r0.b     // Catch:{ all -> 0x0cab }
            java.util.List r6 = r2.a     // Catch:{ all -> 0x0cab }
            int r8 = r6.size()     // Catch:{ all -> 0x0cab }
            ajkb r9 = defpackage.ajkb.d     // Catch:{ all -> 0x0cab }
            aucd r9 = r9.o()     // Catch:{ all -> 0x0cab }
            r10 = 0
        L_0x09b0:
            if (r10 >= r8) goto L_0x0b82
            java.lang.Object r11 = r6.get(r10)     // Catch:{ all -> 0x0cab }
            com.google.android.location.reporting.state.update.AccountConfig r11 = (com.google.android.location.reporting.state.update.AccountConfig) r11     // Catch:{ all -> 0x0cab }
            ajjm r12 = defpackage.ajjm.x     // Catch:{ all -> 0x0cab }
            aucd r12 = r12.o()     // Catch:{ all -> 0x0cab }
            boolean r13 = r11.b     // Catch:{ all -> 0x0cab }
            boolean r14 = r12.c     // Catch:{ all -> 0x0cab }
            if (r14 != 0) goto L_0x09c5
            goto L_0x09cb
        L_0x09c5:
            r12.c()     // Catch:{ all -> 0x0cab }
            r14 = 0
            r12.c = r14     // Catch:{ all -> 0x0cab }
        L_0x09cb:
            aucj r14 = r12.b     // Catch:{ all -> 0x0cab }
            ajjm r14 = (defpackage.ajjm) r14     // Catch:{ all -> 0x0cab }
            int r15 = r14.a     // Catch:{ all -> 0x0cab }
            r15 = r15 | 4
            r14.a = r15     // Catch:{ all -> 0x0cab }
            r14.d = r13     // Catch:{ all -> 0x0cab }
            r33 = r8
            long r7 = r11.c     // Catch:{ all -> 0x0cab }
            r13 = r15 | 8
            r14.a = r13     // Catch:{ all -> 0x0cab }
            r14.e = r7     // Catch:{ all -> 0x0cab }
            boolean r7 = r11.d     // Catch:{ all -> 0x0cab }
            r8 = r13 | 16
            r14.a = r8     // Catch:{ all -> 0x0cab }
            r14.f = r7     // Catch:{ all -> 0x0cab }
            r7 = r8 | 32
            r14.a = r7     // Catch:{ all -> 0x0cab }
            r8 = 0
            r14.g = r8     // Catch:{ all -> 0x0cab }
            boolean r8 = r11.e     // Catch:{ all -> 0x0cab }
            r7 = r7 | 64
            r14.a = r7     // Catch:{ all -> 0x0cab }
            r14.h = r8     // Catch:{ all -> 0x0cab }
            boolean r8 = r11.g     // Catch:{ all -> 0x0cab }
            r7 = r7 | 128(0x80, float:1.794E-43)
            r14.a = r7     // Catch:{ all -> 0x0cab }
            r14.i = r8     // Catch:{ all -> 0x0cab }
            r21 = r4
            long r4 = r11.i     // Catch:{ all -> 0x0cab }
            r7 = r7 | 256(0x100, float:3.59E-43)
            r14.a = r7     // Catch:{ all -> 0x0cab }
            r14.j = r4     // Catch:{ all -> 0x0cab }
            int r4 = r11.j     // Catch:{ all -> 0x0cab }
            r5 = r7 | 512(0x200, float:7.175E-43)
            r14.a = r5     // Catch:{ all -> 0x0cab }
            r14.k = r4     // Catch:{ all -> 0x0cab }
            boolean r4 = r11.k     // Catch:{ all -> 0x0cab }
            r5 = r5 | 1024(0x400, float:1.435E-42)
            r14.a = r5     // Catch:{ all -> 0x0cab }
            r14.l = r4     // Catch:{ all -> 0x0cab }
            boolean r4 = r11.l     // Catch:{ all -> 0x0cab }
            r5 = r5 | 2048(0x800, float:2.87E-42)
            r14.a = r5     // Catch:{ all -> 0x0cab }
            r14.m = r4     // Catch:{ all -> 0x0cab }
            com.google.android.location.reporting.state.update.Conditions r4 = r11.m     // Catch:{ all -> 0x0cab }
            ajjq r4 = r4.a()     // Catch:{ all -> 0x0cab }
            boolean r5 = r12.c     // Catch:{ all -> 0x0cab }
            if (r5 != 0) goto L_0x0a2d
            goto L_0x0a33
        L_0x0a2d:
            r12.c()     // Catch:{ all -> 0x0cab }
            r5 = 0
            r12.c = r5     // Catch:{ all -> 0x0cab }
        L_0x0a33:
            aucj r5 = r12.b     // Catch:{ all -> 0x0cab }
            ajjm r5 = (defpackage.ajjm) r5     // Catch:{ all -> 0x0cab }
            r4.getClass()     // Catch:{ all -> 0x0cab }
            r5.n = r4     // Catch:{ all -> 0x0cab }
            int r4 = r5.a     // Catch:{ all -> 0x0cab }
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            r5.a = r4     // Catch:{ all -> 0x0cab }
            int r7 = r11.n     // Catch:{ all -> 0x0cab }
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
            r5.a = r4     // Catch:{ all -> 0x0cab }
            r5.o = r7     // Catch:{ all -> 0x0cab }
            boolean r7 = r11.b     // Catch:{ all -> 0x0cab }
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
            r5.a = r4     // Catch:{ all -> 0x0cab }
            r5.p = r7     // Catch:{ all -> 0x0cab }
            boolean r7 = r11.r     // Catch:{ all -> 0x0cab }
            r8 = 2097152(0x200000, float:2.938736E-39)
            r4 = r4 | r8
            r5.a = r4     // Catch:{ all -> 0x0cab }
            r5.v = r7     // Catch:{ all -> 0x0cab }
            int r7 = r11.s     // Catch:{ all -> 0x0cab }
            r8 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 | r8
            r5.a = r4     // Catch:{ all -> 0x0cab }
            r5.w = r7     // Catch:{ all -> 0x0cab }
            android.accounts.Account r4 = r11.a     // Catch:{ all -> 0x0cab }
            java.lang.String r4 = r4.name     // Catch:{ all -> 0x0cab }
            if (r4 == 0) goto L_0x0a88
            android.accounts.Account r4 = r11.a     // Catch:{ all -> 0x0cab }
            java.lang.String r4 = r4.name     // Catch:{ all -> 0x0cab }
            boolean r5 = r12.c     // Catch:{ all -> 0x0cab }
            if (r5 != 0) goto L_0x0a73
            goto L_0x0a79
        L_0x0a73:
            r12.c()     // Catch:{ all -> 0x0cab }
            r5 = 0
            r12.c = r5     // Catch:{ all -> 0x0cab }
        L_0x0a79:
            aucj r5 = r12.b     // Catch:{ all -> 0x0cab }
            ajjm r5 = (defpackage.ajjm) r5     // Catch:{ all -> 0x0cab }
            r4.getClass()     // Catch:{ all -> 0x0cab }
            int r7 = r5.a     // Catch:{ all -> 0x0cab }
            r8 = 1
            r7 = r7 | r8
            r5.a = r7     // Catch:{ all -> 0x0cab }
            r5.b = r4     // Catch:{ all -> 0x0cab }
        L_0x0a88:
            android.accounts.Account r4 = r11.a     // Catch:{ all -> 0x0cab }
            java.lang.String r4 = r4.type     // Catch:{ all -> 0x0cab }
            if (r4 == 0) goto L_0x0aac
            android.accounts.Account r4 = r11.a     // Catch:{ all -> 0x0cab }
            java.lang.String r4 = r4.type     // Catch:{ all -> 0x0cab }
            boolean r5 = r12.c     // Catch:{ all -> 0x0cab }
            if (r5 != 0) goto L_0x0a97
            goto L_0x0a9d
        L_0x0a97:
            r12.c()     // Catch:{ all -> 0x0cab }
            r5 = 0
            r12.c = r5     // Catch:{ all -> 0x0cab }
        L_0x0a9d:
            aucj r5 = r12.b     // Catch:{ all -> 0x0cab }
            ajjm r5 = (defpackage.ajjm) r5     // Catch:{ all -> 0x0cab }
            r4.getClass()     // Catch:{ all -> 0x0cab }
            int r7 = r5.a     // Catch:{ all -> 0x0cab }
            r8 = 2
            r7 = r7 | r8
            r5.a = r7     // Catch:{ all -> 0x0cab }
            r5.c = r4     // Catch:{ all -> 0x0cab }
        L_0x0aac:
            java.lang.String r4 = r11.f     // Catch:{ all -> 0x0cab }
            if (r4 == 0) goto L_0x0acb
            boolean r5 = r12.c     // Catch:{ all -> 0x0cab }
            if (r5 != 0) goto L_0x0ab5
            goto L_0x0abb
        L_0x0ab5:
            r12.c()     // Catch:{ all -> 0x0cab }
            r5 = 0
            r12.c = r5     // Catch:{ all -> 0x0cab }
        L_0x0abb:
            aucj r5 = r12.b     // Catch:{ all -> 0x0cab }
            ajjm r5 = (defpackage.ajjm) r5     // Catch:{ all -> 0x0cab }
            r4.getClass()     // Catch:{ all -> 0x0cab }
            int r7 = r5.a     // Catch:{ all -> 0x0cab }
            r8 = 262144(0x40000, float:3.67342E-40)
            r7 = r7 | r8
            r5.a = r7     // Catch:{ all -> 0x0cab }
            r5.s = r4     // Catch:{ all -> 0x0cab }
        L_0x0acb:
            java.lang.String r4 = r11.h     // Catch:{ all -> 0x0cab }
            if (r4 == 0) goto L_0x0aea
            boolean r5 = r12.c     // Catch:{ all -> 0x0cab }
            if (r5 != 0) goto L_0x0ad4
            goto L_0x0ada
        L_0x0ad4:
            r12.c()     // Catch:{ all -> 0x0cab }
            r5 = 0
            r12.c = r5     // Catch:{ all -> 0x0cab }
        L_0x0ada:
            aucj r5 = r12.b     // Catch:{ all -> 0x0cab }
            ajjm r5 = (defpackage.ajjm) r5     // Catch:{ all -> 0x0cab }
            r4.getClass()     // Catch:{ all -> 0x0cab }
            int r7 = r5.a     // Catch:{ all -> 0x0cab }
            r8 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r8
            r5.a = r7     // Catch:{ all -> 0x0cab }
            r5.t = r4     // Catch:{ all -> 0x0cab }
        L_0x0aea:
            java.lang.Long r4 = r11.p     // Catch:{ all -> 0x0cab }
            if (r4 == 0) goto L_0x0b0a
            long r4 = r4.longValue()     // Catch:{ all -> 0x0cab }
            boolean r7 = r12.c     // Catch:{ all -> 0x0cab }
            if (r7 != 0) goto L_0x0af7
            goto L_0x0afd
        L_0x0af7:
            r12.c()     // Catch:{ all -> 0x0cab }
            r7 = 0
            r12.c = r7     // Catch:{ all -> 0x0cab }
        L_0x0afd:
            aucj r7 = r12.b     // Catch:{ all -> 0x0cab }
            ajjm r7 = (defpackage.ajjm) r7     // Catch:{ all -> 0x0cab }
            int r8 = r7.a     // Catch:{ all -> 0x0cab }
            r13 = 65536(0x10000, float:9.18355E-41)
            r8 = r8 | r13
            r7.a = r8     // Catch:{ all -> 0x0cab }
            r7.r = r4     // Catch:{ all -> 0x0cab }
        L_0x0b0a:
            java.lang.String r4 = r11.o     // Catch:{ all -> 0x0cab }
            if (r4 == 0) goto L_0x0b2b
            boolean r5 = r12.c     // Catch:{ all -> 0x0cab }
            if (r5 != 0) goto L_0x0b13
        L_0x0b12:
            goto L_0x0b1a
        L_0x0b13:
            r12.c()     // Catch:{ all -> 0x0cab }
            r5 = 0
            r12.c = r5     // Catch:{ all -> 0x0cab }
            goto L_0x0b12
        L_0x0b1a:
            aucj r5 = r12.b     // Catch:{ all -> 0x0cab }
            ajjm r5 = (defpackage.ajjm) r5     // Catch:{ all -> 0x0cab }
            r4.getClass()     // Catch:{ all -> 0x0cab }
            int r7 = r5.a     // Catch:{ all -> 0x0cab }
            r8 = 32768(0x8000, float:4.5918E-41)
            r7 = r7 | r8
            r5.a = r7     // Catch:{ all -> 0x0cab }
            r5.q = r4     // Catch:{ all -> 0x0cab }
        L_0x0b2b:
            java.lang.Long r4 = r11.q     // Catch:{ all -> 0x0cab }
            if (r4 != 0) goto L_0x0b30
            goto L_0x0b4c
        L_0x0b30:
            long r4 = r4.longValue()     // Catch:{ all -> 0x0cab }
            boolean r7 = r12.c     // Catch:{ all -> 0x0cab }
            if (r7 != 0) goto L_0x0b39
            goto L_0x0b3f
        L_0x0b39:
            r12.c()     // Catch:{ all -> 0x0cab }
            r7 = 0
            r12.c = r7     // Catch:{ all -> 0x0cab }
        L_0x0b3f:
            aucj r7 = r12.b     // Catch:{ all -> 0x0cab }
            ajjm r7 = (defpackage.ajjm) r7     // Catch:{ all -> 0x0cab }
            int r8 = r7.a     // Catch:{ all -> 0x0cab }
            r11 = 1048576(0x100000, float:1.469368E-39)
            r8 = r8 | r11
            r7.a = r8     // Catch:{ all -> 0x0cab }
            r7.u = r4     // Catch:{ all -> 0x0cab }
        L_0x0b4c:
            aucj r4 = r12.i()     // Catch:{ all -> 0x0cab }
            ajjm r4 = (defpackage.ajjm) r4     // Catch:{ all -> 0x0cab }
            boolean r5 = r9.c     // Catch:{ all -> 0x0cab }
            if (r5 != 0) goto L_0x0b57
            goto L_0x0b5d
        L_0x0b57:
            r9.c()     // Catch:{ all -> 0x0cab }
            r5 = 0
            r9.c = r5     // Catch:{ all -> 0x0cab }
        L_0x0b5d:
            aucj r5 = r9.b     // Catch:{ all -> 0x0cab }
            ajkb r5 = (defpackage.ajkb) r5     // Catch:{ all -> 0x0cab }
            r4.getClass()     // Catch:{ all -> 0x0cab }
            aucx r7 = r5.b     // Catch:{ all -> 0x0cab }
            boolean r7 = r7.a()     // Catch:{ all -> 0x0cab }
            if (r7 != 0) goto L_0x0b74
            aucx r7 = r5.b     // Catch:{ all -> 0x0cab }
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)     // Catch:{ all -> 0x0cab }
            r5.b = r7     // Catch:{ all -> 0x0cab }
        L_0x0b74:
            aucx r5 = r5.b     // Catch:{ all -> 0x0cab }
            r5.add(r4)     // Catch:{ all -> 0x0cab }
            int r10 = r10 + 1
            r8 = r33
            r4 = r21
            r7 = 0
            goto L_0x09b0
        L_0x0b82:
            r21 = r4
            com.google.android.location.reporting.state.update.Conditions r4 = r2.b     // Catch:{ all -> 0x0cab }
            ajjq r4 = r4.a()     // Catch:{ all -> 0x0cab }
            boolean r5 = r9.c     // Catch:{ all -> 0x0cab }
            if (r5 != 0) goto L_0x0b90
            r5 = 0
            goto L_0x0b96
        L_0x0b90:
            r9.c()     // Catch:{ all -> 0x0cab }
            r5 = 0
            r9.c = r5     // Catch:{ all -> 0x0cab }
        L_0x0b96:
            aucj r6 = r9.b     // Catch:{ all -> 0x0cab }
            ajkb r6 = (defpackage.ajkb) r6     // Catch:{ all -> 0x0cab }
            r4.getClass()     // Catch:{ all -> 0x0cab }
            r6.c = r4     // Catch:{ all -> 0x0cab }
            int r4 = r6.a     // Catch:{ all -> 0x0cab }
            r7 = 2
            r4 = r4 | r7
            r6.a = r4     // Catch:{ all -> 0x0cab }
            aucj r4 = r9.i()     // Catch:{ all -> 0x0cab }
            ajkb r4 = (defpackage.ajkb) r4     // Catch:{ all -> 0x0cab }
            byte[] r4 = r4.k()     // Catch:{ all -> 0x0cab }
            r6 = 2
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r6)     // Catch:{ all -> 0x0cab }
            android.content.SharedPreferences r6 = r0.a     // Catch:{ all -> 0x0cab }
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ all -> 0x0cab }
            java.lang.String r7 = "reportingConfig"
            android.content.SharedPreferences$Editor r4 = r6.putString(r7, r4)     // Catch:{ all -> 0x0cab }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0cab }
            r6.<init>()     // Catch:{ all -> 0x0cab }
            java.util.List r2 = r2.a     // Catch:{ all -> 0x0cab }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0cab }
        L_0x0bcb:
            boolean r7 = r2.hasNext()     // Catch:{ all -> 0x0cab }
            if (r7 == 0) goto L_0x0c2f
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x0cab }
            com.google.android.location.reporting.state.update.AccountConfig r7 = (com.google.android.location.reporting.state.update.AccountConfig) r7     // Catch:{ all -> 0x0cab }
            android.accounts.Account r8 = r7.a     // Catch:{ all -> 0x0cab }
            java.lang.String r9 = defpackage.ajmp.b(r8)     // Catch:{ all -> 0x0cab }
            java.lang.String r8 = defpackage.ajmp.b(r8)     // Catch:{ all -> 0x0cab }
            android.content.SharedPreferences r10 = r0.a     // Catch:{ all -> 0x0cab }
            boolean r10 = r10.contains(r8)     // Catch:{ all -> 0x0cab }
            if (r10 == 0) goto L_0x0bf6
            android.content.SharedPreferences r10 = r0.a     // Catch:{ all -> 0x0cab }
            r11 = 0
            long r13 = r10.getLong(r8, r11)     // Catch:{ all -> 0x0cab }
            java.lang.Long r8 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0cab }
            goto L_0x0bf9
        L_0x0bf6:
            r11 = 0
            r8 = 0
        L_0x0bf9:
            boolean r10 = r7.j()     // Catch:{ all -> 0x0cab }
            if (r10 == 0) goto L_0x0c22
            if (r8 == 0) goto L_0x0c1c
            ajmw r10 = new ajmw     // Catch:{ all -> 0x0cab }
            ajmv r13 = defpackage.ajmv.a     // Catch:{ all -> 0x0cab }
            long r14 = r8.longValue()     // Catch:{ all -> 0x0cab }
            r10.<init>(r7, r13, r14)     // Catch:{ all -> 0x0cab }
            r6.add(r10)     // Catch:{ all -> 0x0cab }
            ajmw r8 = new ajmw     // Catch:{ all -> 0x0cab }
            ajmv r10 = defpackage.ajmv.b     // Catch:{ all -> 0x0cab }
            r13 = r21
            r8.<init>(r7, r10, r13)     // Catch:{ all -> 0x0cab }
            r6.add(r8)     // Catch:{ all -> 0x0cab }
            goto L_0x0c1e
        L_0x0c1c:
            r13 = r21
        L_0x0c1e:
            r4.remove(r9)     // Catch:{ all -> 0x0cab }
            goto L_0x0c2c
        L_0x0c22:
            r13 = r21
            if (r8 != 0) goto L_0x0c2c
            r4.putLong(r9, r13)     // Catch:{ all -> 0x0cab }
            r21 = r13
            goto L_0x0bcb
        L_0x0c2c:
            r21 = r13
            goto L_0x0bcb
        L_0x0c2f:
            r4.apply()     // Catch:{ all -> 0x0cab }
            monitor-exit(r3)     // Catch:{ all -> 0x0cab }
            int r0 = r6.size()
            r13 = 0
        L_0x0c38:
            if (r13 >= r0) goto L_0x0caa
            java.lang.Object r2 = r6.get(r13)
            ajmw r2 = (defpackage.ajmw) r2
            com.google.android.location.reporting.state.update.AccountConfig r3 = r2.a
            boolean r4 = r3.j()
            if (r4 != 0) goto L_0x0c4a
            r5 = 1
            goto L_0x0ca7
        L_0x0c4a:
            ajmv r4 = r2.b
            ajmv r5 = defpackage.ajmv.b
            if (r4 != r5) goto L_0x0c57
            rom r4 = r1.e
            com.google.android.gms.location.LocationAvailability r7 = r4.d()
            goto L_0x0c58
        L_0x0c57:
            r7 = 0
        L_0x0c58:
            ajmv r4 = r2.b
            int r4 = r4.ordinal()
            if (r4 == 0) goto L_0x0c68
            r5 = 1
            if (r4 == r5) goto L_0x0c65
            r4 = 0
            goto L_0x0c6b
        L_0x0c65:
            java.lang.String r4 = "activated"
            goto L_0x0c6b
        L_0x0c68:
            r5 = 1
            java.lang.String r4 = "inactivated"
        L_0x0c6b:
            com.google.android.ulr.ApiActivationChange r8 = new com.google.android.ulr.ApiActivationChange
            r8.<init>(r4)
            if (r7 == 0) goto L_0x0c79
            com.google.android.ulr.ApiLocationStatus r7 = defpackage.ajnz.a((com.google.android.gms.location.LocationAvailability) r7)
            r23 = r7
            goto L_0x0c7b
        L_0x0c79:
            r23 = 0
        L_0x0c7b:
            com.google.android.ulr.ApiMetadata r4 = new com.google.android.ulr.ApiMetadata
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            long r9 = r2.c
            java.lang.Long r28 = java.lang.Long.valueOf(r9)
            r29 = 0
            r30 = 0
            r17 = r4
            r18 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            android.accounts.Account r2 = r3.a
            ajin r3 = r1.b
            java.lang.String r7 = "ApiActivationChange"
            r3.a((android.accounts.Account) r2, (com.google.android.ulr.ApiMetadata) r4, (java.lang.String) r7)
        L_0x0ca7:
            int r13 = r13 + 1
            goto L_0x0c38
        L_0x0caa:
            return
        L_0x0cab:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0cab }
            throw r0
        L_0x0cae:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0cae }
            goto L_0x0cb2
        L_0x0cb1:
            throw r0
        L_0x0cb2:
            goto L_0x0cb1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajlm.a(com.google.android.location.reporting.state.update.ReportingConfig, java.lang.String, boolean):void");
    }

    public final void a(ApiBleRate apiBleRate) {
        if (!aztb.n() || !aztb.s()) {
            ajlt ajlt = (ajlt) this.s;
            ajlt.a.k.sendMessage(ajlt.a.k.obtainMessage(3, apiBleRate));
        }
    }

    public final void a(List list) {
        if (!aztb.n() || !aztb.s()) {
            ajlt ajlt = (ajlt) this.s;
            ajlt.a.k.sendMessage(ajlt.a.k.obtainMessage(2, list));
        }
    }
}
