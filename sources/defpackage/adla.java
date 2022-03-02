package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.format.Formatter;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.UpdateDescription;
import com.google.android.gms.update.control.ReceiverIntentOperation;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: adla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adla {
    private static final adra A = new adra("control.installation.download_ignore_offpeak_window", false);
    private static final adra B = new adra("control.installation.ab_installation_ignore_device_idle_condition", false);
    private static final adra C = new adra("control.installation.installation_ignore_maintenance_window", false);
    private static final adra D = new adra("control.installation.ignore_server_postpone_ab_installation_config", false);
    private static final adra E = new adra("control.installation.ignore_optional_post_install", false);
    private static final adra F = new adra("control.installation.is_streaming", false);
    private static final adro G = new adro("control.installation.local_package_file_path", "");
    private static final adrk H = new adrk("control.installation.activity_started_at", -1L);
    private static final adra I = new adra("control.installation.activity_started_from_setup_wizard", false);
    private static final adrk J = new adrk("control.installation.auto_reboot_approved_at", -1L);
    private static final adrk K = new adrk("control.installation.auto_reboot_end_time", -1L);
    public static final iwd a = adnt.d("InstallationControl");
    public static final adro b = new adro("control.installation.current_update_url", "");
    public static final adrk c = new adrk("control.installation.device_policy_updated_at", -1L);
    public static final adrk d = new adrk("control.installation.reboot_approved_at", -1L);
    public static final adrg e = new adrg("control.installation.status", 0);
    @Deprecated
    public static final adra f = new adra("control.installation.reboot_with_resume_prepared", false);
    public static final adra g = new adra("control.installation.encountered_recovery_system_install_exception", false);
    public static final adqz h = new adkz();
    private static final long n = TimeUnit.SECONDS.toMillis(1);
    private static final long o = TimeUnit.HOURS.toMillis(1);
    private static final long p = TimeUnit.HOURS.toMillis(1);
    private static final anax q = anax.a((Object) 528, (Object) 272);
    private static final adrk r = new adrk("control.installation.update_url_changed_at", 0L);
    private static final adra s = new adra("control.installation.download_approved", false);
    private static final adrg t = new adrg("control.installation.update_engine_status", -1);
    private static final adrg u = new adrg("control.installation.update_engine_completion_code", -1);
    private static final adrb v = new adrb("control.installation.progress", Double.valueOf(-1.0d));
    private static final adrk w = new adrk("control.installation.progress_notified_at", 0L);
    private static final adra x = new adra("control.installation.download_paused_by_user", false);
    private static final adra y = new adra("control.installation.ab_installation_paused_by_user", false);
    private static final adra z = new adra("control.installation.download_ignore_network_condition", false);
    private final DevicePolicyManager L;
    private final adkv M;
    private final jbs N;
    public final Object i = new Object();
    public final Context j;
    public final adrn k;
    public final adkt l;
    public final Map m;

    public adla(Context context) {
        this.j = context;
        this.k = (adrn) adrn.a.b();
        this.L = (DevicePolicyManager) context.getSystemService("device_policy");
        this.M = (adkv) adkv.b.b();
        this.m = new HashMap();
        this.N = new jbs(context);
        this.l = (adkt) adkt.e.b();
    }

    private static String a(String str) {
        Uri parse = Uri.parse(str);
        return parse != null ? parse.getPath() : str;
    }

    private static final List c(DownloadOptions downloadOptions) {
        ArrayList arrayList = new ArrayList();
        if (downloadOptions.a) {
            arrayList.add(z.b(true));
        }
        if (downloadOptions.b) {
            arrayList.add(A.b(true));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void i() {
        /*
            r9 = this;
            android.content.Context r0 = r9.j
            android.content.Intent r1 = defpackage.adkn.a()
            com.google.android.gms.update.SystemUpdateStatus r2 = r9.d()
            int r2 = r2.c
            java.lang.String r3 = "status"
            android.content.Intent r1 = r1.putExtra(r3, r2)
            r0.sendBroadcast(r1)
            ayox r0 = defpackage.ayox.a
            ayoy r0 = r0.a()
            boolean r0 = r0.C()
            if (r0 == 0) goto L_0x0039
            android.content.Context r0 = r9.j
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.google.android.update.SYSTEM_UPDATE"
            r1.<init>(r2)
            com.google.android.gms.update.SystemUpdateStatus r2 = r9.d()
            int r2 = r2.c
            java.lang.String r3 = "status"
            android.content.Intent r1 = r1.putExtra(r3, r2)
            r0.sendBroadcast(r1)
        L_0x0039:
            java.lang.Object r0 = r9.i
            monitor-enter(r0)
            java.util.Map r1 = r9.m     // Catch:{ all -> 0x018c }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x018c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x018c }
        L_0x0046:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x018c }
            r3 = 0
            if (r2 == 0) goto L_0x007a
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x018c }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x018c }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x018c }
            adil r2 = (defpackage.adil) r2     // Catch:{ all -> 0x018c }
            android.os.IBinder r4 = r2.asBinder()     // Catch:{ all -> 0x018c }
            boolean r4 = r4.isBinderAlive()     // Catch:{ all -> 0x018c }
            if (r4 == 0) goto L_0x0076
            com.google.android.gms.update.SystemUpdateStatus r4 = r9.d()     // Catch:{ RemoteException -> 0x006b }
            r2.a(r4)     // Catch:{ RemoteException -> 0x006b }
            goto L_0x0046
        L_0x006b:
            r2 = move-exception
            iwd r4 = a     // Catch:{ all -> 0x018c }
            java.lang.String r5 = "Failed to trigger status update callback."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x018c }
            r4.e(r5, r2, r3)     // Catch:{ all -> 0x018c }
            goto L_0x0046
        L_0x0076:
            r1.remove()     // Catch:{ all -> 0x018c }
            goto L_0x0046
        L_0x007a:
            monitor-exit(r0)     // Catch:{ all -> 0x018c }
            ayox r0 = defpackage.ayox.a
            ayoy r0 = r0.a()
            boolean r0 = r0.B()
            if (r0 == 0) goto L_0x018b
            com.google.android.gms.update.SystemUpdateStatus r0 = r9.d()
            boolean r1 = defpackage.jkr.g()
            if (r1 == 0) goto L_0x018b
            android.content.Context r1 = r9.j
            java.lang.String r2 = "system_update"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.os.SystemUpdateManager r1 = (android.os.SystemUpdateManager) r1
            int r0 = r0.c
            boolean r2 = defpackage.jkr.g()
            defpackage.iva.b((boolean) r2)
            r2 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L_0x00f5
            if (r0 == r7) goto L_0x00f3
            if (r0 == r6) goto L_0x00f1
            if (r0 == r5) goto L_0x00f1
            if (r0 == r4) goto L_0x00f1
            if (r0 == r2) goto L_0x00f5
            r8 = 262(0x106, float:3.67E-43)
            if (r0 == r8) goto L_0x00f1
            r8 = 263(0x107, float:3.69E-43)
            if (r0 == r8) goto L_0x00f1
            r8 = 518(0x206, float:7.26E-43)
            if (r0 == r8) goto L_0x00f1
            r8 = 519(0x207, float:7.27E-43)
            if (r0 == r8) goto L_0x00f1
            r8 = 774(0x306, float:1.085E-42)
            if (r0 == r8) goto L_0x00f1
            r8 = 775(0x307, float:1.086E-42)
            if (r0 == r8) goto L_0x00f1
            r8 = 786(0x312, float:1.101E-42)
            if (r0 == r8) goto L_0x00f1
            r8 = 787(0x313, float:1.103E-42)
            if (r0 == r8) goto L_0x00f1
            r8 = 1298(0x512, float:1.819E-42)
            if (r0 == r8) goto L_0x00f1
            r8 = 1299(0x513, float:1.82E-42)
            if (r0 == r8) goto L_0x00f1
            switch(r0) {
                case 5: goto L_0x00f5;
                case 15: goto L_0x00f1;
                case 267: goto L_0x00f1;
                case 278: goto L_0x00f5;
                case 779: goto L_0x00f1;
                case 784: goto L_0x00f1;
                case 1031: goto L_0x00f1;
                case 1035: goto L_0x00f1;
                case 1291: goto L_0x00f1;
                case 1296: goto L_0x00f1;
                case 1547: goto L_0x00f3;
                case 1552: goto L_0x00f1;
                case 1555: goto L_0x00f5;
                case 1803: goto L_0x00f3;
                case 1811: goto L_0x00f5;
                case 2059: goto L_0x00f1;
                case 2067: goto L_0x00f5;
                case 2315: goto L_0x00f1;
                case 2323: goto L_0x00f5;
                case 2571: goto L_0x00f1;
                case 2579: goto L_0x00f5;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            switch(r0) {
                case 22: goto L_0x00f5;
                case 23: goto L_0x00f5;
                case 24: goto L_0x00f5;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            switch(r0) {
                case 272: goto L_0x00ef;
                case 273: goto L_0x00f1;
                case 274: goto L_0x00f1;
                case 275: goto L_0x00f1;
                default: goto L_0x00e6;
            }
        L_0x00e6:
            switch(r0) {
                case 528: goto L_0x00ed;
                case 529: goto L_0x00f1;
                case 530: goto L_0x00f1;
                case 531: goto L_0x00f1;
                default: goto L_0x00e9;
            }
        L_0x00e9:
            switch(r0) {
                case 1040: goto L_0x00f1;
                case 1041: goto L_0x00f1;
                case 1042: goto L_0x00f1;
                case 1043: goto L_0x00f1;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            goto L_0x00f6
        L_0x00ed:
            r3 = 5
            goto L_0x00f6
        L_0x00ef:
            r3 = 4
            goto L_0x00f6
        L_0x00f1:
            r3 = 3
            goto L_0x00f6
        L_0x00f3:
            r3 = 2
            goto L_0x00f6
        L_0x00f5:
            r3 = 1
        L_0x00f6:
            adqw r0 = defpackage.admx.a()
            boolean r2 = defpackage.jkr.g()
            defpackage.iva.b((boolean) r2)
            android.os.PersistableBundle r2 = new android.os.PersistableBundle
            r2.<init>()
            java.lang.String r4 = "status"
            r2.putInt(r4, r3)
            if (r3 == r7) goto L_0x012b
            adjz r3 = defpackage.adke.h
            java.lang.Object r3 = r3.a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.String r4 = "is_security_update"
            r2.putBoolean(r4, r3)
            adjz r3 = defpackage.adke.a
            java.lang.Object r3 = r3.a()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "title"
            r2.putString(r4, r3)
        L_0x012b:
            adqv r0 = r0.d
            if (r0 == 0) goto L_0x0130
            goto L_0x0132
        L_0x0130:
            adqv r0 = defpackage.adqv.g
        L_0x0132:
            java.lang.String r3 = r0.f
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0141
            java.lang.String r3 = r0.f
            java.lang.String r4 = "target_security_patch_level"
            r2.putString(r4, r3)
        L_0x0141:
            aucx r3 = r0.b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x015a
            java.lang.String r3 = "|"
            amre r3 = defpackage.amre.a((java.lang.String) r3)
            aucx r0 = r0.b
            java.lang.String r0 = r3.a((java.lang.Iterable) r0)
            java.lang.String r3 = "target_build_fingerprint"
            r2.putString(r3, r0)
        L_0x015a:
            android.os.Bundle r0 = r1.retrieveSystemUpdateInfo()
            boolean r3 = defpackage.jkr.g()
            defpackage.iva.b((boolean) r3)
            java.util.Set r3 = r2.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x016d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x018b
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.get(r4)
            java.lang.Object r4 = r0.get(r4)
            boolean r4 = defpackage.amqx.a(r5, r4)
            if (r4 != 0) goto L_0x016d
            r1.updateSystemUpdateInfo(r2)
            return
        L_0x018b:
            return
        L_0x018c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x018c }
            goto L_0x0190
        L_0x018f:
            throw r1
        L_0x0190:
            goto L_0x018f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adla.i():void");
    }

    public final void b() {
        this.k.a(x.b(true));
        this.M.a(106);
    }

    public final SystemUpdateStatus d() {
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        ActivityStatus activityStatus;
        String str2;
        adkt adkt = (adkt) adkt.e.b();
        long longValue = ((Long) this.k.b(c)).longValue();
        if (longValue == -1) {
            j2 = ((Long) this.k.b(r)).longValue();
        } else {
            j2 = longValue;
        }
        long longValue2 = ((Long) this.k.b(H)).longValue();
        if (longValue2 == -1 || longValue2 + o < System.currentTimeMillis()) {
            z2 = false;
        } else {
            z2 = true;
        }
        String str3 = (String) this.k.b(G);
        if (!ayox.a.a().i() || amrk.a(str3)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            str3 = (String) this.k.b(b);
        }
        int intValue = ((Integer) this.k.b(e)).intValue();
        int intValue2 = ((Integer) this.k.b(t)).intValue();
        int intValue3 = ((Integer) this.k.b(u)).intValue();
        double doubleValue = ((Double) this.k.b(v)).doubleValue();
        DownloadOptions downloadOptions = new DownloadOptions(((Boolean) this.k.b(z)).booleanValue(), ((Boolean) this.k.b(A)).booleanValue());
        double d2 = doubleValue;
        InstallationOptions installationOptions = new InstallationOptions(((Boolean) this.k.b(B)).booleanValue(), ((Boolean) this.k.b(C)).booleanValue(), ((Boolean) this.k.b(D)).booleanValue(), ((Boolean) this.k.b(E)).booleanValue());
        boolean booleanValue = ((Boolean) this.k.b(s)).booleanValue();
        boolean z5 = ((Long) this.k.b(d)).longValue() == ((adkt) adkt.e.b()).d();
        boolean booleanValue2 = ((Boolean) this.k.b(x)).booleanValue();
        boolean booleanValue3 = ((Boolean) this.k.b(y)).booleanValue();
        boolean booleanValue4 = ((Boolean) this.k.b(F)).booleanValue();
        long longValue3 = ((Long) this.k.b(r)).longValue();
        long c2 = adkt.c();
        long longValue4 = ((Long) adkt.g.b(adkt.c)).longValue();
        if (!z2 || !((Boolean) this.k.b(I)).booleanValue()) {
            z4 = false;
        } else {
            z4 = true;
        }
        ActivityStatus activityStatus2 = new ActivityStatus(z2, z4);
        long longValue5 = ((Long) this.k.b(r)).longValue() + adjx.a(this.j);
        String m2 = ayox.a.a().m();
        boolean booleanValue5 = ((Boolean) adke.h.a()).booleanValue();
        long longValue6 = ((Long) this.k.b(J)).longValue();
        String c3 = aypa.c();
        String str4 = (String) adke.a.a();
        String str5 = (String) adke.c.a();
        if (ayor.b() || (aypv.a.a().a() && ((Long) adke.b.a()).longValue() > 0)) {
            activityStatus = activityStatus2;
            str = m2;
            str2 = Formatter.formatFileSize(this.j, ((Long) adke.b.a()).longValue());
        } else {
            str2 = ayox.g();
            activityStatus = activityStatus2;
            str = m2;
        }
        return new SystemUpdateStatus(str3, z3, intValue, intValue2, intValue3, d2, downloadOptions, installationOptions, booleanValue, z5, booleanValue2, booleanValue3, booleanValue4, longValue3, c2, longValue4, j2, activityStatus, longValue5, str, booleanValue5, longValue6, c3, new UpdateDescription(str4, str5, str2), adka.a(this.j), e(), adka.b(this.j) && adjw.g(this.j) && ((adkt) adkt.e.b()).e() && !((adkt) adkt.e.b()).f());
    }

    public final boolean e() {
        return this.l.d() == ((Long) this.k.b(J)).longValue() && System.currentTimeMillis() <= ((Long) this.k.b(K)).longValue();
    }

    public final void f() {
        this.M.a(112);
    }

    public final boolean g() {
        String str = (String) this.k.b(b);
        String b2 = amrk.b((String) adke.d.a());
        this.k.a(new adrc(b, b2));
        if (a(str).equals(a(b2))) {
            return false;
        }
        a.c("Update URL changed from \"%s\" to \"%s\".", str, b2);
        this.k.a(new adrc(r, Long.valueOf(System.currentTimeMillis())));
        a();
        c(!b2.isEmpty());
        return true;
    }

    public final boolean h() {
        return adka.b(this.j) && adjw.g(this.j);
    }

    private final void a(long j2) {
        if (jkr.b()) {
            this.N.a("NotificationActionControl-Alarm", 0, j2, adlk.b(this.j));
            return;
        }
        this.N.b("NotificationActionControl-Alarm", 0, j2, adlk.b(this.j), (String) null);
    }

    public final void b(DownloadOptions downloadOptions) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(x.b(false));
        arrayList.addAll(c(downloadOptions));
        this.k.a((List) arrayList);
        this.M.a(107);
    }

    public final void b(InstallationOptions installationOptions) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y.b(false));
        arrayList.addAll(c(installationOptions));
        this.k.a((List) arrayList);
        this.M.a(109);
    }

    private static final List c(InstallationOptions installationOptions) {
        ArrayList arrayList = new ArrayList();
        if (installationOptions.a) {
            arrayList.add(B.b(true));
        }
        if (installationOptions.b) {
            arrayList.add(C.b(true));
        }
        if (installationOptions.c) {
            arrayList.add(D.b(true));
        }
        arrayList.add(E.b(Boolean.valueOf(installationOptions.d)));
        return arrayList;
    }

    public final void b(boolean z2) {
        long j2;
        adrc[] adrcArr;
        long j3;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            adkg a2 = adkg.a(aypa.c());
            if (z2) {
                this.k.a(J.b(Long.valueOf(this.l.d())), K.b(Long.valueOf(a2.c(currentTimeMillis) + currentTimeMillis)));
                ((adkv) adkv.b.b()).a(111);
            }
            if (!e()) {
                a.a("Auto reboot not scheduled (probably because of expiry or device reboot).", new Object[0]);
                return;
            }
            int i2 = d().c;
            if (a2.a(currentTimeMillis) && q.contains(Integer.valueOf(i2)) && !z2) {
                boolean b2 = adka.b(this.j);
                boolean g2 = adjw.g(this.j);
                if (b2 && g2 && !this.l.f()) {
                    adrn adrn = this.k;
                    adrc[] adrcArr2 = new adrc[2];
                    adrcArr2[0] = J.b(Long.valueOf(this.l.d()));
                    adrk adrk = K;
                    if (!a2.a()) {
                        adrcArr = adrcArr2;
                        j3 = 0;
                    } else if (!a2.b()) {
                        long millis = TimeUnit.MINUTES.toMillis(a2.d);
                        Calendar instance = Calendar.getInstance();
                        instance.setTimeInMillis(currentTimeMillis);
                        adrcArr = adrcArr2;
                        if (adkg.d(currentTimeMillis) > adkg.d(a2.d)) {
                            instance.add(5, 1);
                        }
                        if (a2.a(currentTimeMillis)) {
                            instance.add(5, 1);
                        }
                        instance.set(11, (int) TimeUnit.MILLISECONDS.toHours(millis));
                        instance.set(12, (int) (TimeUnit.MILLISECONDS.toMinutes(millis) % 60));
                        instance.set(13, 0);
                        j3 = instance.getTimeInMillis() - currentTimeMillis;
                    } else {
                        adrcArr = adrcArr2;
                        j3 = Long.MAX_VALUE;
                    }
                    adrcArr[1] = adrk.b(Long.valueOf(j3 + currentTimeMillis));
                    adrn.a(adrcArr);
                    ((adkv) adkv.b.b()).a(111);
                    long b3 = currentTimeMillis + a2.b(currentTimeMillis);
                    a.c("Re-attempt to restart the device at: %d.", Long.valueOf(b3));
                    a(b3);
                    return;
                }
                this.k.a(J, K);
                this.j.startActivity(new Intent("android.settings.SYSTEM_UPDATE_COMPLETE").setPackage("com.google.android.gms").addFlags(268730368).putExtra("type", 2));
            } else if (z2) {
                if (h() && !this.l.e()) {
                    ((adkt) adkt.e.b()).a(ReceiverIntentOperation.b(this.j));
                }
                if (a2.a(currentTimeMillis)) {
                    j2 = currentTimeMillis + p;
                } else {
                    j2 = currentTimeMillis + a2.b(currentTimeMillis);
                }
                a.c("Re-attempt to restart the device at: %d.", Long.valueOf(j2));
                a(j2);
            }
        } catch (adju e2) {
            a.e("Unable to parse restart time window: %s.", aypa.c());
        }
    }

    public final void a() {
        this.k.a(B, y, H, I, c, s, z, A, x, C, D, E, F, v, w, d, f, e, u, t, J, K, g);
        i();
        this.M.a(102);
    }

    public final void a(int i2, double d2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long longValue = ((Long) this.k.b(w)).longValue();
        int intValue = ((Integer) this.k.b(e)).intValue();
        adrn adrn = this.k;
        adrg adrg = e;
        Integer valueOf = Integer.valueOf(i2);
        adrb adrb = v;
        Double valueOf2 = Double.valueOf(d2);
        adrn.a(adrg.b(valueOf), adrb.b(valueOf2));
        if (intValue != i2 || elapsedRealtime - longValue >= n || elapsedRealtime < longValue) {
            a.c("Installation progress updated to (0x%03X, %.3f).", valueOf, valueOf2);
            this.k.a(w.b(Long.valueOf(elapsedRealtime)));
            i();
            this.M.a(100);
        }
    }

    public final void c() {
        this.k.a(y.b(true));
        this.M.a(108);
    }

    public final void c(boolean z2) {
        if (!jkr.b()) {
            return;
        }
        if (z2) {
            this.L.notifyPendingSystemUpdate(((Long) this.k.b(r)).longValue());
        } else {
            this.L.notifyPendingSystemUpdate(-1);
        }
    }

    public final void a(int i2, int i3) {
        iwd iwd = a;
        Integer valueOf = Integer.valueOf(i2);
        iwd.c("Update engine status updated to 0x%03X.", valueOf);
        if (((Integer) this.k.b(t)).intValue() != i2 || ((Integer) this.k.b(u)).intValue() != i3) {
            this.k.a(t.b(valueOf), u.b(Integer.valueOf(i3)));
            this.M.a(101);
        }
    }

    public final void a(ActivityStatus activityStatus) {
        if (activityStatus.a) {
            this.k.a(H.b(Long.valueOf(System.currentTimeMillis())), I.b(Boolean.valueOf(activityStatus.b)));
        } else {
            this.k.a(H, I);
        }
        ((adkv) adkv.b.b()).a(110);
    }

    public final void a(DownloadOptions downloadOptions) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(s.b(true));
        arrayList.addAll(c(downloadOptions));
        this.k.a((List) arrayList);
        this.M.a(103);
    }

    public final void a(InstallationOptions installationOptions) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.b(Long.valueOf(((adkt) adkt.e.b()).d())));
        arrayList.addAll(c(installationOptions));
        this.k.a((List) arrayList);
        this.M.a(105);
    }

    public final void a(boolean z2) {
        this.k.a(F.b(Boolean.valueOf(z2)));
    }
}
