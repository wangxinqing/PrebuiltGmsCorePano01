package com.google.android.gms.update.pano.legacy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.EventLog;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.update.InstallationOptions;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChimeraSystemUpdatePanoActivity extends Activity implements adqf {
    public static final iwd a = adnt.i("ChimeraSystemUpdatePanoActivity");
    public final Object b = new Object();
    public boolean c = false;
    public final Object d = new Object();
    public boolean e = false;
    public int f = -1;
    public boolean g = false;
    public ProgressBar h;
    public Handler i;
    long j;
    public long k;
    public adqg l;
    boolean m;
    adqb n;
    private adjg o;
    private Handler p;
    private boolean q = false;
    private String r = null;
    private Resources s;
    private final BroadcastReceiver t = new nla("ota") {
        public final void a(Context context, Intent intent) {
            if (ChimeraSystemUpdatePanoActivity.this.j <= 0) {
                long currentTimeMillis = System.currentTimeMillis();
                ChimeraSystemUpdatePanoActivity chimeraSystemUpdatePanoActivity = ChimeraSystemUpdatePanoActivity.this;
                iwd iwd = ChimeraSystemUpdatePanoActivity.a;
                if (currentTimeMillis - chimeraSystemUpdatePanoActivity.k >= 1000) {
                    return;
                }
            }
            ChimeraSystemUpdatePanoActivity.a.b("Screen turned off during countdown; installing immediately", new Object[0]);
            EventLog.writeEvent(201002, "activity-countdown-screen-off-install");
            ChimeraSystemUpdatePanoActivity.this.b();
        }
    };
    private final BroadcastReceiver u = new nla("ota") {
        public final void a(Context context, Intent intent) {
            ChimeraSystemUpdatePanoActivity.a.b("Received a status changed notification, refreshing.", new Object[0]);
            ChimeraSystemUpdatePanoActivity.this.c();
        }
    };
    private final Runnable v = new adpy(this);
    private final Runnable w = new adpz(this);

    private final void a(int i2, int i3) {
        View findViewById = findViewById(i2);
        if (findViewById != null) {
            findViewById.setVisibility(i3);
        }
    }

    private final void b(int i2, int i3) {
        a(i2, getText(i3));
    }

    private final void d() {
        int i2;
        if (this.j <= 0) {
            adjk.c(this);
            if (!this.m) {
                i2 = 10000;
            } else {
                i2 = 5000;
            }
            this.j = (System.currentTimeMillis() + ((long) i2)) - 1;
            this.r = adjk.j();
            e();
            return;
        }
        a.b("skipping, as a countdown is already in progress.", new Object[0]);
    }

    private final void e() {
        String string = this.s.getString(R.string.common_cancel);
        adqb adqb = this.n;
        a(string, adqb.b, adqb.c);
        a(this.j, true);
    }

    private final void f() {
        if (this.j > 0) {
            EventLog.writeEvent(201002, "activity-countdown-cancel");
            this.j = 0;
            this.k = System.currentTimeMillis();
        }
        this.r = null;
    }

    private final void g() {
        adjn.a(this);
        try {
            adjk.m();
        } catch (RemoteException e2) {
            a.d("Not connected to service; cannot approve download.", new Object[0]);
        }
    }

    private final void h() {
        a.b("Stop polling progress.", new Object[0]);
        this.i.removeCallbacks(this.v);
        this.i.removeCallbacks(this.w);
        synchronized (this.b) {
            this.c = false;
        }
        synchronized (this.d) {
            this.e = false;
        }
    }

    private final adjg i() {
        adjg adjg = this.o;
        if (adjg != null) {
            return adjg;
        }
        adjg a2 = adiq.a(this);
        this.o = a2;
        return a2;
    }

    private final void j() {
        adqb adqb = this.n;
        a(adqb.a, adqb.b, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02c6, code lost:
        h();
        r4 = r1.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02cd, code lost:
        if (r4 <= 0) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02cf, code lost:
        a(r4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02d7, code lost:
        if (defpackage.adjw.a() == false) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d9, code lost:
        b(com.google.android.gms.R.id.status, com.google.android.gms.R.string.system_update_update_available_title_text);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02e0, code lost:
        b(com.google.android.gms.R.id.status, com.google.android.gms.R.string.system_update_verified_status_text);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02e4, code lost:
        a((int) com.google.android.gms.R.id.progress, 4);
        r0 = r1.s.getString(com.google.android.gms.R.string.system_update_restart_now);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02f4, code lost:
        if (r1.m == false) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02f6, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02f9, code lost:
        a(r0, (java.lang.String) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02fd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0350, code lost:
        b(com.google.android.gms.R.id.status, com.google.android.gms.R.string.system_update_requires_restart_status_text);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0359, code lost:
        if (r1.m == false) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x035b, code lost:
        g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x035e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x035f, code lost:
        r0 = r1.s.getString(com.google.android.gms.R.string.common_download);
        r2 = r1.n;
        a(r0, r2.b, r2.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x036e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03b1, code lost:
        if (r1.m != false) goto L_0x03f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03b3, code lost:
        b(com.google.android.gms.R.id.guidance_title, com.google.android.gms.R.string.system_update_no_update_content_text);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03bb, code lost:
        if (r4 == 0) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03bd, code lost:
        a((int) com.google.android.gms.R.id.guidance_description, android.text.TextUtils.expandTemplate(getText(com.google.android.gms.R.string.system_update_last_checkin), new java.lang.CharSequence[]{android.text.format.DateUtils.getRelativeTimeSpanString(r1, r4, true)}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03d6, code lost:
        a((int) com.google.android.gms.R.id.status, 8);
        a((int) com.google.android.gms.R.id.size, 8);
        a(r1.s.getString(com.google.android.gms.R.string.system_update_check_now_button_text), (java.lang.String) null, r1.n.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03f3, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03f6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bf, code lost:
        b(com.google.android.gms.R.id.guidance_title, com.google.android.gms.R.string.system_update_installing_title_text);
        r4 = getText(com.google.android.gms.R.string.system_update_install_steps_text);
        r5 = new java.lang.CharSequence[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d0, code lost:
        if (r0 == 273) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d2, code lost:
        r0 = "2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d5, code lost:
        r0 = "1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d7, code lost:
        r5[0] = r0;
        a((int) com.google.android.gms.R.id.status, (java.lang.CharSequence) android.text.TextUtils.expandTemplate(r4, r5).toString());
        a((int) com.google.android.gms.R.id.progress, 0);
        a(r1.s.getString(com.google.android.gms.R.string.common_install), (java.lang.String) null, false);
        r4 = r1.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f2, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f5, code lost:
        if (r1.e != false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f7, code lost:
        r1.e = true;
        r1.i.postDelayed(r1.w, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0200, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0201, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r16 = this;
            r1 = r16
            r2 = -1
            r3 = 0
            int r0 = defpackage.adjk.d()     // Catch:{ RemoteException -> 0x0009 }
            goto L_0x0014
        L_0x0009:
            r0 = move-exception
            iwd r0 = a
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "Not connected to service; unable to get status."
            r0.d(r5, r4)
            r0 = -1
        L_0x0014:
            if (r0 == r2) goto L_0x0017
            goto L_0x0031
        L_0x0017:
            int r0 = r1.f
            if (r0 == r2) goto L_0x0027
            iwd r0 = a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r4 = "Not refreshing status, as the current status is unknown."
            r0.d(r4, r2)
            int r0 = r1.f
            goto L_0x0031
        L_0x0027:
            iwd r0 = a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r4 = "Status unavailable and no known last status. Displaying no update."
            r0.d(r4, r2)
            r0 = 0
        L_0x0031:
            long r4 = defpackage.gwd.j(r16)
            iwd r2 = a
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r7[r3] = r8
            java.lang.String r9 = "0x%03X"
            java.lang.String r7 = java.lang.String.format(r9, r7)
            boolean r9 = r1.m
            java.lang.String r10 = java.lang.String.valueOf(r7)
            int r10 = r10.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r10 = r10 + 63
            r11.<init>(r10)
            java.lang.String r10 = "status="
            r11.append(r10)
            r11.append(r7)
            java.lang.String r7 = " lastCheckinTime="
            r11.append(r7)
            r11.append(r4)
            java.lang.String r7 = " mSetupWizard="
            r11.append(r7)
            r11.append(r9)
            java.lang.String r7 = r11.toString()
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r2.b(r7, r9)
            r1.f = r0
            r2 = 5
            if (r0 == r2) goto L_0x007e
            goto L_0x008c
        L_0x007e:
            boolean r2 = r1.q
            if (r2 == 0) goto L_0x008c
            iwd r0 = a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = "skipping refresh; about to reboot"
            r0.a(r3, r2)
            return
        L_0x008c:
            android.widget.ProgressBar r2 = r1.h
            if (r2 == 0) goto L_0x0091
            goto L_0x009b
        L_0x0091:
            adqg r2 = r1.l
            if (r2 == 0) goto L_0x009b
            android.widget.ProgressBar r2 = r2.a()
            r1.h = r2
        L_0x009b:
            java.lang.Object r2 = r1.b
            monitor-enter(r2)
            boolean r7 = r1.c     // Catch:{ all -> 0x0446 }
            r7 = r7 ^ r6
            monitor-exit(r2)     // Catch:{ all -> 0x0446 }
            java.lang.Object r9 = r1.d
            monitor-enter(r9)
            boolean r2 = r1.e     // Catch:{ all -> 0x0443 }
            r2 = r2 ^ r6
            r2 = r2 & r7
            monitor-exit(r9)     // Catch:{ all -> 0x0443 }
            r7 = 100
            r9 = 4
            if (r2 != 0) goto L_0x00b0
            goto L_0x00c6
        L_0x00b0:
            android.widget.ProgressBar r2 = r1.h
            if (r2 == 0) goto L_0x00c6
            r2.setVisibility(r9)
            android.widget.ProgressBar r2 = r1.h
            r2.setMax(r7)
            android.widget.ProgressBar r2 = r1.h
            r2.setProgress(r3)
            android.widget.ProgressBar r2 = r1.h
            r2.setIndeterminate(r3)
        L_0x00c6:
            java.lang.String r2 = defpackage.adjk.g()
            r10 = 2131428597(0x7f0b04f5, float:1.8478843E38)
            r1.a((int) r10, (java.lang.CharSequence) r2)
            java.lang.String r2 = defpackage.adjk.h()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r11 = " · "
            int r12 = r2.length()
            if (r12 != 0) goto L_0x00e7
            java.lang.String r2 = new java.lang.String
            r2.<init>(r11)
            goto L_0x00eb
        L_0x00e7:
            java.lang.String r2 = r11.concat(r2)
        L_0x00eb:
            r11 = 2131429492(0x7f0b0874, float:1.8480658E38)
            r1.a((int) r11, (java.lang.CharSequence) r2)
            java.lang.String r2 = defpackage.adjk.i()
            boolean r12 = android.text.TextUtils.isEmpty(r2)
            if (r12 != 0) goto L_0x0104
            android.text.Spanned r2 = android.text.Html.fromHtml(r2)
            java.lang.String r2 = r2.toString()
            goto L_0x0106
        L_0x0104:
            java.lang.String r2 = ""
        L_0x0106:
            r12 = 2131428594(0x7f0b04f2, float:1.8478837E38)
            r1.a((int) r12, (java.lang.CharSequence) r2)
            r2 = 2131429540(0x7f0b08a4, float:1.8480756E38)
            r1.a((int) r2, (int) r3)
            r13 = 2131429541(0x7f0b08a5, float:1.8480758E38)
            r14 = 8
            r1.a((int) r13, (int) r14)
            r1.a((int) r11, (int) r3)
            adqb r15 = r1.n
            r11 = 0
            if (r15 == 0) goto L_0x0128
            java.lang.String r7 = r15.a
            java.lang.String r15 = r15.b
            goto L_0x012a
        L_0x0128:
            r7 = r11
            r15 = r7
        L_0x012a:
            r1.a(r7, r15, r6)
            boolean r7 = r1.m
            if (r7 != 0) goto L_0x0133
            goto L_0x015a
        L_0x0133:
            if (r0 == r9) goto L_0x0148
            r7 = 2131954256(0x7f130a50, float:1.9545006E38)
            r1.b(r10, r7)
            r7 = 2131954255(0x7f130a4f, float:1.9545004E38)
            r1.b(r12, r7)
            r16.j()
            r1.a((int) r2, (int) r14)
            goto L_0x015a
        L_0x0148:
            r7 = 2131954258(0x7f130a52, float:1.954501E38)
            r1.b(r10, r7)
            r7 = 2131954257(0x7f130a51, float:1.9545008E38)
            r1.b(r12, r7)
            r16.j()
            r1.a((int) r2, (int) r14)
        L_0x015a:
            r7 = 262(0x106, float:3.67E-43)
            if (r0 == r7) goto L_0x042a
            r7 = 263(0x107, float:3.69E-43)
            r15 = 2131429259(0x7f0b078b, float:1.8480186E38)
            if (r0 == r7) goto L_0x040c
            r7 = 518(0x206, float:7.26E-43)
            if (r0 == r7) goto L_0x042a
            r7 = 519(0x207, float:7.27E-43)
            if (r0 == r7) goto L_0x040c
            r7 = 774(0x306, float:1.085E-42)
            if (r0 == r7) goto L_0x042a
            r7 = 775(0x307, float:1.086E-42)
            if (r0 == r7) goto L_0x040c
            r7 = 1042(0x412, float:1.46E-42)
            if (r0 == r7) goto L_0x040c
            r7 = 1043(0x413, float:1.462E-42)
            r14 = 2131952231(0x7f130267, float:1.9540899E38)
            if (r0 == r7) goto L_0x03f7
            r9 = 2131954282(0x7f130a6a, float:1.9545059E38)
            r12 = 0
            r7 = 2131952169(0x7f130229, float:1.9540773E38)
            switch(r0) {
                case -1: goto L_0x036f;
                case 0: goto L_0x03af;
                case 1: goto L_0x0350;
                case 2: goto L_0x0317;
                case 3: goto L_0x02fe;
                case 4: goto L_0x02c6;
                case 5: goto L_0x03af;
                case 6: goto L_0x042a;
                case 7: goto L_0x040c;
                default: goto L_0x018b;
            }
        L_0x018b:
            r4 = 2131954180(0x7f130a04, float:1.9544852E38)
            switch(r0) {
                case 9: goto L_0x02ad;
                case 11: goto L_0x0298;
                case 15: goto L_0x0294;
                case 267: goto L_0x0298;
                case 523: goto L_0x0298;
                case 779: goto L_0x0298;
                case 784: goto L_0x028d;
                case 786: goto L_0x040c;
                case 1031: goto L_0x040c;
                case 1035: goto L_0x0298;
                case 1040: goto L_0x0273;
                case 1291: goto L_0x0298;
                case 1296: goto L_0x02c6;
                case 1298: goto L_0x040c;
                case 1803: goto L_0x0350;
                case 2059: goto L_0x021f;
                case 2315: goto L_0x0298;
                case 2571: goto L_0x0205;
                default: goto L_0x0191;
            }
        L_0x0191:
            switch(r0) {
                case 272: goto L_0x02c6;
                case 273: goto L_0x01bf;
                case 274: goto L_0x040c;
                case 275: goto L_0x03f7;
                default: goto L_0x0194;
            }
        L_0x0194:
            switch(r0) {
                case 528: goto L_0x02c6;
                case 529: goto L_0x01bf;
                case 530: goto L_0x040c;
                case 531: goto L_0x03f7;
                default: goto L_0x0197;
            }
        L_0x0197:
            iwd r0 = a
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r3] = r8
            java.lang.String r4 = "0x%03X"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Unknown status: "
            int r5 = r2.length()
            if (r5 != 0) goto L_0x01b5
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
            goto L_0x01b9
        L_0x01b5:
            java.lang.String r2 = r4.concat(r2)
        L_0x01b9:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0.e(r2, r3)
            return
        L_0x01bf:
            r4 = 2131954201(0x7f130a19, float:1.9544895E38)
            r1.b(r10, r4)
            r4 = 2131954195(0x7f130a13, float:1.9544882E38)
            java.lang.CharSequence r4 = r1.getText(r4)
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r6]
            r7 = 273(0x111, float:3.83E-43)
            if (r0 == r7) goto L_0x01d5
            java.lang.String r0 = "2"
            goto L_0x01d7
        L_0x01d5:
            java.lang.String r0 = "1"
        L_0x01d7:
            r5[r3] = r0
            java.lang.CharSequence r0 = android.text.TextUtils.expandTemplate(r4, r5)
            java.lang.String r0 = r0.toString()
            r1.a((int) r2, (java.lang.CharSequence) r0)
            r1.a((int) r15, (int) r3)
            android.content.res.Resources r0 = r1.s
            java.lang.String r0 = r0.getString(r14)
            r1.a(r0, r11, r3)
            java.lang.Object r4 = r1.d
            monitor-enter(r4)
            boolean r0 = r1.e     // Catch:{ all -> 0x0202 }
            if (r0 != 0) goto L_0x0200
            r1.e = r6     // Catch:{ all -> 0x0202 }
            android.os.Handler r0 = r1.i     // Catch:{ all -> 0x0202 }
            java.lang.Runnable r2 = r1.w     // Catch:{ all -> 0x0202 }
            r0.postDelayed(r2, r12)     // Catch:{ all -> 0x0202 }
        L_0x0200:
            monitor-exit(r4)     // Catch:{ all -> 0x0202 }
            return
        L_0x0202:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0202 }
            throw r0
        L_0x0205:
            r0 = 2131954233(0x7f130a39, float:1.954496E38)
            r1.b(r2, r0)
            android.content.res.Resources r0 = r1.s
            java.lang.String r0 = r0.getString(r7)
            android.content.res.Resources r2 = r1.s
            r4 = 2131954150(0x7f1309e6, float:1.9544791E38)
            java.lang.String r2 = r2.getString(r4)
            r1.a(r0, r2, r3)
            return
        L_0x021f:
            java.lang.Object r5 = defpackage.adjk.e     // Catch:{ RemoteException -> 0x0254 }
            monitor-enter(r5)     // Catch:{ RemoteException -> 0x0254 }
            defpackage.adjk.c()     // Catch:{ all -> 0x0251 }
            adii r0 = defpackage.adjk.b     // Catch:{ all -> 0x0251 }
            long r8 = r0.c()     // Catch:{ all -> 0x0251 }
            monitor-exit(r5)     // Catch:{ all -> 0x0251 }
            r0 = 2131429541(0x7f0b08a5, float:1.8480758E38)
            r1.a((int) r0, (int) r3)     // Catch:{ RemoteException -> 0x0254 }
            r0 = 2131954184(0x7f130a08, float:1.954486E38)
            java.lang.CharSequence r0 = r1.getText(r0)     // Catch:{ RemoteException -> 0x0254 }
            r5 = 2
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r5]     // Catch:{ RemoteException -> 0x0254 }
            java.lang.CharSequence r8 = android.text.format.DateUtils.getRelativeTimeSpanString(r1, r8, r3)     // Catch:{ RemoteException -> 0x0254 }
            r5[r3] = r8     // Catch:{ RemoteException -> 0x0254 }
            java.lang.String r8 = ""
            r5[r6] = r8     // Catch:{ RemoteException -> 0x0254 }
            java.lang.CharSequence r0 = android.text.TextUtils.expandTemplate(r0, r5)     // Catch:{ RemoteException -> 0x0254 }
            r5 = 2131429541(0x7f0b08a5, float:1.8480758E38)
            r1.a((int) r5, (java.lang.CharSequence) r0)     // Catch:{ RemoteException -> 0x0254 }
            goto L_0x025e
        L_0x0251:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0251 }
            throw r0     // Catch:{ RemoteException -> 0x0254 }
        L_0x0254:
            r0 = move-exception
            iwd r0 = a
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = "Not connected to service; unable to get when mobile is allowed."
            r0.d(r6, r5)
        L_0x025e:
            r1.b(r2, r4)
            r1.a((int) r15, (int) r3)
            android.content.res.Resources r0 = r1.s
            java.lang.String r0 = r0.getString(r7)
            adqb r2 = r1.n
            java.lang.String r2 = r2.b
            r1.a(r0, r2, r3)
            return
        L_0x0273:
            r1.b(r2, r9)
            android.content.res.Resources r0 = r1.s
            r2 = 2131954238(0x7f130a3e, float:1.954497E38)
            java.lang.String r0 = r0.getString(r2)
            android.content.res.Resources r2 = r1.s
            r4 = 2131954205(0x7f130a1d, float:1.9544903E38)
            java.lang.String r2 = r2.getString(r4)
            r1.a(r0, r2, r3)
            return
        L_0x028d:
            r16.j()
            r16.h()
            return
        L_0x0294:
            r16.j()
            return
        L_0x0298:
            r1.b(r2, r4)
            r1.a((int) r15, (int) r3)
            android.content.res.Resources r0 = r1.s
            java.lang.String r0 = r0.getString(r7)
            adqb r2 = r1.n
            java.lang.String r2 = r2.b
            r1.a(r0, r2, r3)
            return
        L_0x02ad:
            r0 = 2131954168(0x7f1309f8, float:1.9544828E38)
            r1.b(r2, r0)
            android.content.res.Resources r0 = r1.s
            r2 = 2131954171(0x7f1309fb, float:1.9544834E38)
            java.lang.String r0 = r0.getString(r2)
            adqb r2 = r1.n
            java.lang.String r3 = r2.b
            boolean r2 = r2.c
            r1.a(r0, r3, r2)
            return
        L_0x02c6:
            r16.h()
            long r4 = r1.j
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x02d3
            r1.a((long) r4, (boolean) r3)
            return
        L_0x02d3:
            boolean r0 = defpackage.adjw.a()
            if (r0 == 0) goto L_0x02e0
            r0 = 2131954277(0x7f130a65, float:1.9545049E38)
            r1.b(r2, r0)
            goto L_0x02e4
        L_0x02e0:
            r1.b(r2, r9)
        L_0x02e4:
            r0 = 4
            r1.a((int) r15, (int) r0)
            android.content.res.Resources r0 = r1.s
            r2 = 2131954238(0x7f130a3e, float:1.954497E38)
            java.lang.String r0 = r0.getString(r2)
            boolean r2 = r1.m
            if (r2 == 0) goto L_0x02f9
            r16.d()
        L_0x02f9:
            r1.a(r0, r11, r6)
            return
        L_0x02fe:
            r0 = 4
            r1.a((int) r15, (int) r0)
            r0 = 2131954284(0x7f130a6c, float:1.9545063E38)
            r1.b(r2, r0)
            android.content.res.Resources r0 = r1.s
            java.lang.String r0 = r0.getString(r7)
            adqb r2 = r1.n
            java.lang.String r2 = r2.b
            r1.a(r0, r2, r3)
            return
        L_0x0317:
            r0 = 2131954181(0x7f130a05, float:1.9544854E38)
            r1.b(r2, r0)
            r1.a((int) r15, (int) r3)
            android.content.res.Resources r0 = r1.s
            java.lang.String r0 = r0.getString(r7)
            adqb r2 = r1.n
            java.lang.String r2 = r2.b
            r1.a(r0, r2, r3)
            android.widget.ProgressBar r0 = r1.h
            if (r0 == 0) goto L_0x033b
            r0.setIndeterminate(r3)
            android.widget.ProgressBar r0 = r1.h
            r2 = 100
            r0.setMax(r2)
        L_0x033b:
            java.lang.Object r3 = r1.b
            monitor-enter(r3)
            boolean r0 = r1.c     // Catch:{ all -> 0x034d }
            if (r0 != 0) goto L_0x034b
            r1.c = r6     // Catch:{ all -> 0x034d }
            android.os.Handler r0 = r1.i     // Catch:{ all -> 0x034d }
            java.lang.Runnable r2 = r1.v     // Catch:{ all -> 0x034d }
            r0.postDelayed(r2, r12)     // Catch:{ all -> 0x034d }
        L_0x034b:
            monitor-exit(r3)     // Catch:{ all -> 0x034d }
            return
        L_0x034d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x034d }
            throw r0
        L_0x0350:
            r0 = 2131954233(0x7f130a39, float:1.954496E38)
            r1.b(r2, r0)
            boolean r0 = r1.m
            if (r0 == 0) goto L_0x035f
            r16.g()
            return
        L_0x035f:
            android.content.res.Resources r0 = r1.s
            java.lang.String r0 = r0.getString(r7)
            adqb r2 = r1.n
            java.lang.String r3 = r2.b
            boolean r2 = r2.c
            r1.a(r0, r3, r2)
            return
        L_0x036f:
            boolean r0 = r1.m
            if (r0 == 0) goto L_0x03af
            r0 = 2131954210(0x7f130a22, float:1.9544913E38)
            r1.b(r10, r0)
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0396
            r0 = 2131954203(0x7f130a1b, float:1.9544899E38)
            java.lang.CharSequence r0 = r1.getText(r0)
            java.lang.CharSequence[] r7 = new java.lang.CharSequence[r6]
            java.lang.CharSequence r4 = android.text.format.DateUtils.getRelativeTimeSpanString(r1, r4, r6)
            r7[r3] = r4
            java.lang.CharSequence r0 = android.text.TextUtils.expandTemplate(r0, r7)
            r4 = 2131428594(0x7f0b04f2, float:1.8478837E38)
            r1.a((int) r4, (java.lang.CharSequence) r0)
        L_0x0396:
            r0 = 8
            r1.a((int) r2, (int) r0)
            r2 = 2131429492(0x7f0b0874, float:1.8480658E38)
            r1.a((int) r2, (int) r0)
            android.content.res.Resources r0 = r1.s
            r2 = 2131954156(0x7f1309ec, float:1.9544803E38)
            java.lang.String r0 = r0.getString(r2)
            r1.a(r0, r11, r3)
            return
        L_0x03af:
            boolean r0 = r1.m
            if (r0 != 0) goto L_0x03f3
            r0 = 2131954210(0x7f130a22, float:1.9544913E38)
            r1.b(r10, r0)
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x03d6
            r0 = 2131954203(0x7f130a1b, float:1.9544899E38)
            java.lang.CharSequence r0 = r1.getText(r0)
            java.lang.CharSequence[] r7 = new java.lang.CharSequence[r6]
            java.lang.CharSequence r4 = android.text.format.DateUtils.getRelativeTimeSpanString(r1, r4, r6)
            r7[r3] = r4
            java.lang.CharSequence r0 = android.text.TextUtils.expandTemplate(r0, r7)
            r3 = 2131428594(0x7f0b04f2, float:1.8478837E38)
            r1.a((int) r3, (java.lang.CharSequence) r0)
        L_0x03d6:
            r0 = 8
            r1.a((int) r2, (int) r0)
            r2 = 2131429492(0x7f0b0874, float:1.8480658E38)
            r1.a((int) r2, (int) r0)
            android.content.res.Resources r0 = r1.s
            r2 = 2131954156(0x7f1309ec, float:1.9544803E38)
            java.lang.String r0 = r0.getString(r2)
            adqb r2 = r1.n
            boolean r2 = r2.c
            r1.a(r0, r11, r2)
            return
        L_0x03f3:
            r16.finish()
            return
        L_0x03f7:
            r0 = 2131954277(0x7f130a65, float:1.9545049E38)
            r1.b(r2, r0)
            r0 = 4
            r1.a((int) r15, (int) r0)
            android.content.res.Resources r0 = r1.s
            java.lang.String r0 = r0.getString(r14)
            r1.a(r0, r11, r6)
            return
        L_0x040c:
            r0 = 4
            r1.a((int) r15, (int) r0)
            r0 = 2131954281(0x7f130a69, float:1.9545057E38)
            r1.b(r2, r0)
            android.content.res.Resources r0 = r1.s
            r2 = 2131954156(0x7f1309ec, float:1.9544803E38)
            java.lang.String r0 = r0.getString(r2)
            adqb r2 = r1.n
            java.lang.String r3 = r2.b
            boolean r2 = r2.c
            r1.a(r0, r3, r2)
            return
        L_0x042a:
            r0 = 2131954169(0x7f1309f9, float:1.954483E38)
            r1.b(r2, r0)
            android.content.res.Resources r0 = r1.s
            r2 = 2131954175(0x7f1309ff, float:1.9544842E38)
            java.lang.String r0 = r0.getString(r2)
            adqb r2 = r1.n
            java.lang.String r3 = r2.b
            boolean r2 = r2.c
            r1.a(r0, r3, r2)
            return
        L_0x0443:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0443 }
            throw r0
        L_0x0446:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0446 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity.c():void");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        TextView textView;
        super.onCreate(bundle);
        boolean z = true;
        if (wkg.a().b() > 0) {
            Toast makeText = Toast.makeText(this, R.string.system_update_not_owner_text, 1);
            makeText.setGravity(17, makeText.getXOffset(), makeText.getYOffset());
            makeText.show();
            finish();
            return;
        }
        setTheme(R.style.SystemUpdatePanoSettingsTheme);
        setContentView((int) R.layout.system_update_fragment_container_activity);
        a.b("Attempting to connect to the ChimeraSystemUpdateService.", new Object[0]);
        adjk.a(this, "onCreate(...)");
        this.p = new qvr();
        this.i = new qvr();
        Resources resources = getResources();
        this.s = resources;
        String string = resources.getString(R.string.system_update_module_name);
        adqg adqg = new adqg();
        this.l = adqg;
        View view = adqg.getView();
        if (!(view == null || (textView = (TextView) view.findViewById(R.id.guidance_title)) == null || string == null)) {
            textView.setText(string);
        }
        getFragmentManager().beginTransaction().replace(R.id.content, this.l).commit();
        this.h = this.l.a();
        this.n = new adqb((String) null, (String) null, true);
        Intent intent = getIntent();
        if (intent != null) {
            if (!intent.getBooleanExtra("firstRun", false) || !adjk.k()) {
                z = false;
            }
            this.m = z;
        }
        registerReceiver(this.t, new IntentFilter("android.intent.action.SCREEN_OFF"));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.update.STATUS_CHANGED");
        intentFilter.addAction("com.google.android.checkin.CHECKIN_COMPLETE");
        registerReceiver(this.u, intentFilter);
        if (bundle != null) {
            this.j = bundle.getLong("countdown_end", 0);
            this.k = 0;
            this.r = bundle.getString("countdown_url");
            return;
        }
        this.j = 0;
        this.k = 0;
        this.r = null;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        if (wkg.a().b() <= 0) {
            unregisterReceiver(this.t);
            unregisterReceiver(this.u);
            adjk.b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        this.g = false;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.g = true;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("countdown_end", this.j);
        bundle.putString("countdown_url", this.r);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        adjk.b(this, adjk.l, "onStart(...)");
        c();
        if (this.j > 0) {
            EventLog.writeEvent(201002, "activity-countdown-resume");
            e();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        f();
        adjk.a(false);
        h();
        adjl.a(this, new Intent());
    }

    public final void b() {
        adjn.a(this);
        b(R.id.status, R.string.system_update_countdown_complete);
        try {
            int i2 = this.f;
            if (i2 != 528) {
                if (!(i2 == 272 || i2 == 1296)) {
                    adjk.b(this.m);
                    this.q = true;
                }
            }
            i().a(new InstallationOptions(true, true, true, false));
            this.q = true;
        } catch (RemoteException e2) {
            a.d("Not connected to service; cannot approve install.", new Object[0]);
        }
    }

    private final void a(int i2, CharSequence charSequence) {
        View findViewById = findViewById(i2);
        if (findViewById != null) {
            if (findViewById instanceof TextView) {
                ((TextView) findViewById).setText(charSequence);
            }
            findViewById.setEnabled(true);
        }
    }

    private final void a(String str, String str2, boolean z) {
        this.n = new adqb(str, str2, z);
        adqg adqg = this.l;
        if (adqg != null) {
            View view = adqg.c;
            if (view == null) {
                adqg.a.d("updateActionButtonContent() skipped. Null action button view.", new Object[0]);
                return;
            }
            view.setEnabled(z);
            TextView textView = adqg.d;
            if (textView != null) {
                textView.setText(str);
                adqg.d.setEnabled(z);
            }
            TextView textView2 = adqg.e;
            if (textView2 != null) {
                if (str2 == null) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                }
                adqg.e.setText(str2);
                adqg.e.setEnabled(z);
            }
        }
    }

    public final void a() {
        iwd iwd = a;
        String valueOf = String.valueOf(String.format("0x%03X", new Object[]{Integer.valueOf(this.f)}));
        iwd.b(valueOf.length() == 0 ? new String("onActionClicked(). mLastStatus = ") : "onActionClicked(). mLastStatus = ".concat(valueOf), new Object[0]);
        int i2 = this.f;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            if (i2 != 7) {
                                if (i2 == 9) {
                                    startActivity(new Intent("android.intent.action.MANAGE_PACKAGE_STORAGE"));
                                    return;
                                } else if (!(i2 == 272 || i2 == 528)) {
                                    if (!(i2 == 786 || i2 == 1031)) {
                                        if (i2 != 1296) {
                                            if (i2 != 1298) {
                                                if (!(i2 == 1803 || i2 == 262)) {
                                                    if (!(i2 == 263 || i2 == 274)) {
                                                        if (i2 != 275) {
                                                            if (i2 != 518) {
                                                                if (!(i2 == 519 || i2 == 530)) {
                                                                    if (i2 != 531) {
                                                                        if (!(i2 == 774 || i2 == 775 || i2 == 1042)) {
                                                                            if (i2 != 1043) {
                                                                                iwd iwd2 = a;
                                                                                String valueOf2 = String.valueOf(String.format("0x%03X", new Object[]{Integer.valueOf(i2)}));
                                                                                iwd2.d(valueOf2.length() == 0 ? new String("onActionClicked(). Not handled for mLastStatus = ") : "onActionClicked(). Not handled for mLastStatus = ".concat(valueOf2), new Object[0]);
                                                                                return;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i().b(new InstallationOptions(true, true, false, false));
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            adjk.l();
                            adjk.b((Context) this);
                            return;
                        }
                    }
                }
                if (this.j <= 0) {
                    d();
                    return;
                } else if (!this.m) {
                    f();
                    this.k = 0;
                    c();
                    return;
                } else {
                    b();
                    return;
                }
            }
            g();
            return;
        }
        adjk.b((Context) this);
    }

    public final void a(long j2, boolean z) {
        if (j2 == this.j) {
            String j3 = adjk.j();
            if (j3 == null || !j3.equals(this.r)) {
                a.d("URL changed during countdown; aborting", new Object[0]);
                f();
                c();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j4 = this.j;
            if (currentTimeMillis >= j4) {
                b();
                return;
            }
            int i2 = ((int) ((j4 - currentTimeMillis) / 1000)) + 1;
            a((int) R.id.status, (CharSequence) getResources().getQuantityString(R.plurals.system_update_restarting_countdown, i2, new Object[]{Integer.valueOf(i2)}));
            int i3 = (int) ((this.j - ((long) ((i2 - 1) * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS))) - currentTimeMillis);
            if (z) {
                this.p.postDelayed(new adqa(this, j2), (long) i3);
            }
        }
    }
}
