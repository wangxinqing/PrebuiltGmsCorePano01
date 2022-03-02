package com.google.android.gms.accountsettings.mg.ui.main;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MainChimeraActivity extends bjs implements die, czx, cxx {
    public static final aqsr a;
    public dgr b;
    public SharedPreferences c;
    private did d;
    private czw e;
    private dji f;
    private agcf g;
    private boolean h;

    static {
        aqsp aqsp = (aqsp) aqsr.d.o();
        if (aqsp.c) {
            aqsp.c();
            aqsp.c = false;
        }
        aqsr aqsr = (aqsr) aqsp.b;
        aqsr.a |= 1;
        aqsr.b = 0;
        a = (aqsr) aqsp.i();
        sv.n();
    }

    private final void f() {
        if (this.g == null) {
            aoru a2 = jfm.a(9);
            this.g = new agcf(a2);
            wlr a3 = wls.a();
            a3.a = auuv.ACCOUNT_SETTINGS_MOBILE.iZ;
            AccountParticleDisc.a(this, this.g, a2, new agbm(), new agbo(this, a2, a3.a()), agbl.class);
        }
    }

    private final aqsr h() {
        jix.g(this);
        aqsp aqsp = (aqsp) aqsr.d.o();
        int intExtra = getIntent().getIntExtra("extra.screenId", 1);
        if (aqsp.c) {
            aqsp.c();
            aqsp.c = false;
        }
        aqsr aqsr = (aqsr) aqsp.b;
        aqsr.a = 1 | aqsr.a;
        aqsr.b = intExtra;
        aqsp.a(dix.a(getIntent()));
        return (aqsr) aqsp.i();
    }

    private final dih i() {
        if (dix.b(getIntent())) {
            return dih.b;
        }
        List<Account> d2 = jgu.d(this, getPackageName());
        String stringExtra = getIntent().getStringExtra("extra.accountName");
        if (amrk.a(stringExtra)) {
            stringExtra = this.c.getString("google.account_settings.selected_account", (String) null);
        }
        boolean z = false;
        for (Account account : d2) {
            z |= account.name.equals(stringExtra);
        }
        if (!amrk.a(stringExtra) && z) {
            return dio.a(stringExtra);
        }
        if (!d2.isEmpty()) {
            return dio.a(((Account) d2.get(0)).name);
        }
        return dih.b;
    }

    public final agcf a() {
        f();
        return this.g;
    }

    public final czw b() {
        if (this.e == null) {
            this.e = ((czv) getSupportFragmentManager().findFragmentByTag("activityRetained")).b;
        }
        return this.e;
    }

    public final did c() {
        if (this.d == null) {
            this.d = ((czv) getSupportFragmentManager().findFragmentByTag("activityRetained")).a;
        }
        return this.d;
    }

    public final dep e() {
        if (deq.a((Activity) this, "splashScreen") || deq.a((Activity) this, "onboarding")) {
            return dep.CROSS_FADE;
        }
        return dep.INSTANT;
    }

    public final void onBackPressed() {
        this.b.a.a(dhd.BACK);
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [aucj] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            boolean r0 = defpackage.awgy.e()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0037
            qud r0 = new qud
            android.content.Intent r3 = r14.getIntent()
            java.lang.String r4 = "extra.themeChoice"
            int r3 = r3.getIntExtra(r4, r2)
            if (r3 < 0) goto L_0x0027
            int[] r4 = defpackage.quc.a()
            int r4 = r4.length
            if (r3 >= r4) goto L_0x0027
            int[] r4 = defpackage.quc.a()
            r3 = r4[r3]
            goto L_0x0028
        L_0x0027:
            r3 = 1
        L_0x0028:
            r4 = 2132017183(0x7f14001f, float:1.9672637E38)
            r5 = 2132017184(0x7f140020, float:1.967264E38)
            r0.<init>(r14, r4, r5, r3)
            boolean r0 = defpackage.qud.h()
            r14.h = r0
        L_0x0037:
            android.content.Context r0 = r14.getApplicationContext()
            java.lang.String r3 = "google.account_settings"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r3, r2)
            r14.c = r0
            android.view.Window r0 = r14.getWindow()
            r3 = 32
            r0.setSoftInputMode(r3)
            r0 = 2131952124(0x7f1301fc, float:1.9540682E38)
            r14.setTitle((int) r0)
            r0 = 2131624061(0x7f0e007d, float:1.8875291E38)
            r14.setContentView((int) r0)
            r14.f()
            boolean r0 = defpackage.awgy.i()
            java.lang.String r4 = "com.google.android.gms.accountsettings.MY_ACCOUNT"
            java.lang.String r5 = "extra.callingPackageName"
            r6 = 0
            if (r0 == 0) goto L_0x0087
            android.content.Intent r0 = r14.getIntent()
            if (r0 == 0) goto L_0x0085
            boolean r7 = r0.hasExtra(r5)
            if (r7 == 0) goto L_0x0077
            java.lang.String r0 = r0.getStringExtra(r5)
            goto L_0x00c7
        L_0x0077:
            java.lang.String r0 = r0.getAction()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = "com.google.android.gms"
            goto L_0x00c7
        L_0x0085:
            r0 = r6
            goto L_0x00c7
        L_0x0087:
            android.content.Intent r0 = r14.getIntent()
            android.content.ComponentName r7 = defpackage.jhg.b((com.google.android.chimera.Activity) r14)
            java.lang.String r8 = r0.getAction()
            boolean r9 = r0.hasExtra(r5)
            if (r9 == 0) goto L_0x009e
            java.lang.String r0 = r0.getStringExtra(r5)
            goto L_0x00c7
        L_0x009e:
            boolean r5 = r4.equals(r8)
            if (r5 == 0) goto L_0x00b1
            boolean r0 = defpackage.jkr.e()
            if (r0 != 0) goto L_0x00ae
            java.lang.String r0 = "auth-provider"
            goto L_0x00c7
        L_0x00ae:
            java.lang.String r0 = "o-settings"
            goto L_0x00c7
        L_0x00b1:
            if (r7 == 0) goto L_0x00b8
            java.lang.String r0 = r7.getPackageName()
            goto L_0x00c7
        L_0x00b8:
            java.lang.String r5 = "com.android.browser.application_id"
            boolean r7 = r0.hasExtra(r5)
            if (r7 == 0) goto L_0x00c6
            java.lang.String r0 = r0.getStringExtra(r5)
            goto L_0x00c7
        L_0x00c6:
            r0 = r6
        L_0x00c7:
            com.google.android.chimera.FragmentManager r5 = r14.getFragmentManager()
            java.lang.String r7 = "activityRetained"
            com.google.android.chimera.Fragment r5 = r5.findFragmentByTag(r7)
            if (r5 != 0) goto L_0x0101
            boolean r5 = defpackage.awgy.i()
            if (r5 == 0) goto L_0x00e6
            aqsr r5 = r14.h()
            dih r8 = r14.i()
            czv r5 = defpackage.czv.a(r5, r8, r0)
            goto L_0x00f2
        L_0x00e6:
            aqsr r5 = r14.h()
            dih r8 = r14.i()
            czv r5 = defpackage.czv.a(r5, r8, r6)
        L_0x00f2:
            com.google.android.chimera.FragmentManager r8 = r14.getFragmentManager()
            com.google.android.chimera.FragmentTransaction r8 = r8.beginTransaction()
            com.google.android.chimera.FragmentTransaction r5 = r8.add((com.google.android.chimera.Fragment) r5, (java.lang.String) r7)
            r5.commitNow()
        L_0x0101:
            did r5 = r14.c()
            dgr r13 = new dgr
            dfd r8 = r5.a
            dhe r9 = r5.b
            dhl r10 = r5.c
            dfy r11 = r5.d
            dgk r12 = r5.e
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            r14.b = r13
            dfd r5 = r13.b
            aw r5 = r5.c
            dif r7 = new dif
            r7.<init>(r14)
            r5.a(r14, r7)
            if (r15 != 0) goto L_0x0335
            android.content.Intent r15 = r14.getIntent()
            java.lang.String r5 = "extra.launchApi"
            int r15 = r15.getIntExtra(r5, r2)
            int r15 = defpackage.aqmc.a(r15)
            aqsr r5 = r14.h()
            java.lang.String r7 = "screenFlavor"
            r7.getClass()
            audr r8 = r5.c
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L_0x016a
            r7.getClass()
            audr r8 = r5.c
            boolean r9 = r8.containsKey(r7)
            if (r9 == 0) goto L_0x0164
            java.lang.Object r7 = r8.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Integer r7 = defpackage.aoog.a((java.lang.String) r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.Object r7 = defpackage.amrh.a(r7, r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            goto L_0x016b
        L_0x0164:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            r15.<init>()
            throw r15
        L_0x016a:
            r7 = r6
        L_0x016b:
            android.content.Context r8 = r14.getApplicationContext()
            dgr r9 = r14.b
            dfd r9 = r9.b
            dih r9 = r9.b()
            dis r8 = defpackage.dis.a((android.content.Context) r8, (defpackage.dih) r9)
            int r5 = r5.b
            android.content.Intent r9 = r14.getIntent()
            aqmt r10 = defpackage.aqmt.e
            aucd r10 = r10.o()
            java.lang.String r11 = "extra.utmCampaign"
            java.lang.String r11 = r9.getStringExtra(r11)
            if (r11 == 0) goto L_0x01a8
            boolean r12 = r10.c
            if (r12 != 0) goto L_0x0194
            goto L_0x0199
        L_0x0194:
            r10.c()
            r10.c = r2
        L_0x0199:
            aucj r12 = r10.b
            aqmt r12 = (defpackage.aqmt) r12
            r11.getClass()
            int r13 = r12.a
            r13 = r13 | 4
            r12.a = r13
            r12.d = r11
        L_0x01a8:
            java.lang.String r11 = "extra.utmMedium"
            java.lang.String r11 = r9.getStringExtra(r11)
            if (r11 == 0) goto L_0x01ca
            boolean r12 = r10.c
            if (r12 != 0) goto L_0x01b6
            goto L_0x01bb
        L_0x01b6:
            r10.c()
            r10.c = r2
        L_0x01bb:
            aucj r12 = r10.b
            aqmt r12 = (defpackage.aqmt) r12
            r11.getClass()
            int r13 = r12.a
            r13 = r13 | 2
            r12.a = r13
            r12.c = r11
        L_0x01ca:
            java.lang.String r11 = "extra.utmSource"
            java.lang.String r11 = r9.getStringExtra(r11)
            if (r11 == 0) goto L_0x01eb
            boolean r12 = r10.c
            if (r12 != 0) goto L_0x01d8
            goto L_0x01dd
        L_0x01d8:
            r10.c()
            r10.c = r2
        L_0x01dd:
            aucj r12 = r10.b
            aqmt r12 = (defpackage.aqmt) r12
            r11.getClass()
            int r13 = r12.a
            r13 = r13 | r1
            r12.a = r13
            r12.b = r11
        L_0x01eb:
            boolean r11 = defpackage.awgy.i()
            if (r11 != 0) goto L_0x01f2
            goto L_0x0222
        L_0x01f2:
            java.lang.String r9 = r9.getAction()
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L_0x0222
            boolean r4 = r10.c
            if (r4 != 0) goto L_0x0202
            goto L_0x0207
        L_0x0202:
            r10.c()
            r10.c = r2
        L_0x0207:
            aucj r4 = r10.b
            aqmt r4 = (defpackage.aqmt) r4
            java.lang.String r9 = "android-settings"
            r9.getClass()
            int r11 = r4.a
            r11 = r11 | r1
            r4.a = r11
            r4.b = r9
            java.lang.String r9 = "account"
            r9.getClass()
            r11 = r11 | 2
            r4.a = r11
            r4.c = r9
        L_0x0222:
            aucj r4 = r10.b
            aqmt r4 = (defpackage.aqmt) r4
            int r4 = r4.a
            r9 = r4 & 4
            if (r9 == 0) goto L_0x022d
            goto L_0x0235
        L_0x022d:
            r9 = r4 & 2
            if (r9 != 0) goto L_0x0235
            r4 = r4 & r1
            if (r4 != 0) goto L_0x0235
            goto L_0x023c
        L_0x0235:
            aucj r4 = r10.i()
            r6 = r4
            aqmt r6 = (defpackage.aqmt) r6
        L_0x023c:
            aqmd r4 = defpackage.aqmd.g
            aucd r4 = r4.o()
            boolean r9 = r4.c
            if (r9 != 0) goto L_0x0247
            goto L_0x024c
        L_0x0247:
            r4.c()
            r4.c = r2
        L_0x024c:
            aucj r9 = r4.b
            aqmd r9 = (defpackage.aqmd) r9
            int r10 = r9.a
            r10 = r10 | 2
            r9.a = r10
            r9.c = r5
            if (r0 == 0) goto L_0x0263
            r0.getClass()
            r5 = r10 | 1
            r9.a = r5
            r9.b = r0
        L_0x0263:
            if (r7 == 0) goto L_0x027f
            int r0 = r7.intValue()
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x026e
            goto L_0x0273
        L_0x026e:
            r4.c()
            r4.c = r2
        L_0x0273:
            aucj r5 = r4.b
            aqmd r5 = (defpackage.aqmd) r5
            int r7 = r5.a
            r7 = r7 | 8
            r5.a = r7
            r5.d = r0
        L_0x027f:
            if (r15 == 0) goto L_0x028f
            aucj r0 = r4.b
            aqmd r0 = (defpackage.aqmd) r0
            int r15 = r15 + -1
            r0.e = r15
            int r15 = r0.a
            r15 = r15 | 16
            r0.a = r15
        L_0x028f:
            if (r6 != 0) goto L_0x0292
            goto L_0x02a0
        L_0x0292:
            aucj r15 = r4.b
            aqmd r15 = (defpackage.aqmd) r15
            r6.getClass()
            r15.f = r6
            int r0 = r15.a
            r0 = r0 | r3
            r15.a = r0
        L_0x02a0:
            aqna r15 = defpackage.aqna.d
            aucd r15 = r15.o()
            aqmz r0 = defpackage.aqmz.l
            aucd r0 = r0.o()
            aucf r0 = (defpackage.aucf) r0
            aqlq r3 = r8.a()
            boolean r5 = r0.c
            if (r5 != 0) goto L_0x02b7
            goto L_0x02bc
        L_0x02b7:
            r0.c()
            r0.c = r2
        L_0x02bc:
            aucj r5 = r0.b
            aqmz r5 = (defpackage.aqmz) r5
            r3.getClass()
            r5.h = r3
            int r3 = r5.a
            r3 = r3 | 64
            r5.a = r3
            aqlr r3 = defpackage.aqlr.f
            aucd r3 = r3.o()
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x02d6
            goto L_0x02db
        L_0x02d6:
            r3.c()
            r3.c = r2
        L_0x02db:
            aucj r5 = r3.b
            aqlr r5 = (defpackage.aqlr) r5
            aucj r4 = r4.i()
            aqmd r4 = (defpackage.aqmd) r4
            r4.getClass()
            r5.b = r4
            int r4 = r5.a
            r4 = r4 | r1
            r5.a = r4
            boolean r4 = r0.c
            if (r4 != 0) goto L_0x02f4
            goto L_0x02f9
        L_0x02f4:
            r0.c()
            r0.c = r2
        L_0x02f9:
            aucj r4 = r0.b
            aqmz r4 = (defpackage.aqmz) r4
            aucj r3 = r3.i()
            aqlr r3 = (defpackage.aqlr) r3
            r3.getClass()
            r4.k = r3
            int r3 = r4.a
            r3 = r3 | 2048(0x800, float:2.87E-42)
            r4.a = r3
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x0313
            goto L_0x0318
        L_0x0313:
            r15.c()
            r15.c = r2
        L_0x0318:
            aucj r2 = r15.b
            aqna r2 = (defpackage.aqna) r2
            aucj r0 = r0.i()
            aqmz r0 = (defpackage.aqmz) r0
            r0.getClass()
            r2.b = r0
            int r0 = r2.a
            r0 = r0 | r1
            r2.a = r0
            aucj r15 = r15.i()
            aqna r15 = (defpackage.aqna) r15
            r8.a(r15)
        L_0x0335:
            dgr r15 = r14.b
            dfd r0 = r15.b
            dhl r15 = r15.c
            aqsr r15 = r15.b()
            r0.a((defpackage.aqsr) r15)
            dgr r15 = r14.b
            au r15 = r15.e
            dig r0 = new dig
            r0.<init>(r14)
            r15.a(r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.accountsettings.mg.ui.main.MainChimeraActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        int i = Build.VERSION.SDK_INT;
        if (this.f == null) {
            this.f = new dji(this);
        }
        dji dji = this.f;
        amsn amsn = dji.c;
        if (amsn == null || amsn.a(TimeUnit.MILLISECONDS) > awgs.a.a().q()) {
            if (dji.b.size() > 1) {
                String join = TextUtils.join("\"><img src=\"", dji.b);
                StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 51);
                sb.append("<html><head></head><body><img src=\"");
                sb.append(join);
                sb.append("\"></body></html>");
                dji.a.loadData(sb.toString(), "text/html", (String) null);
            } else if (dji.b.size() == 1 && !amrk.a((String) dji.b.get(0))) {
                dji.a.loadUrl((String) dji.b.get(0));
            }
            dji.c = amsn.b(new jiz());
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (awgy.e()) {
            bundle.putBoolean("wasDarkThemeEnabled", this.h);
        }
    }

    public final void a(Fragment fragment, String str, dep dep) {
        deq.a(this, getSupportFragmentManager(), fragment, str, dep);
    }
}
