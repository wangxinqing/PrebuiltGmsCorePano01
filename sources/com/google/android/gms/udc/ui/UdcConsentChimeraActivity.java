package com.google.android.gms.udc.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.udc.ConsentCancelReason;
import com.google.android.gms.udc.ConsentFlowConfig;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UdcConsentChimeraActivity extends FragmentActivity implements adgh, adfv, adgg, adfx {
    public static final jjg a = jjg.a();
    public String b;
    public ConsentFlowConfig c;
    public atyw d;
    public atyx e;
    public Intent f;
    public atzx g;
    public adgr h = new adgr(this);
    public ArrayList i;
    public ArrayList j;
    public boolean k;
    public adhv l;
    public int m = 0;
    public boolean n;
    public int o;
    private adgc p;
    private adgd q;

    protected static ConsentFlowConfig a(atyo atyo, ConsentFlowConfig consentFlowConfig) {
        atyn atyn;
        if (atyo == null) {
            return consentFlowConfig;
        }
        acyd acyd = new acyd(consentFlowConfig);
        atyn atyn2 = atyn.CONSENT_FLOW_LAYOUT_UNSPECIFIED;
        atyn a2 = atyn.a(atyo.b);
        if (a2 == null) {
            a2 = atyn.CONSENT_FLOW_LAYOUT_UNSPECIFIED;
        }
        atyn atyn3 = null;
        switch (a2.ordinal()) {
            case 1:
                acyd.b(0);
                break;
            case 2:
                acyd.b(2);
                break;
            case 3:
                acyd.b(1);
                break;
            case 4:
                acyd.b(3);
                break;
            case 5:
                acyd.b(4);
                break;
            case 6:
                acyd.b(5);
                break;
            case 7:
                acyd.b(6);
                break;
            default:
                anih anih = (anih) ((anih) a.c()).a("com.google.android.gms.udc.ui.UdcConsentChimeraActivity", "a", 314, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                if ((atyo.a & 1) != 0) {
                    atyn = atyn.a(atyo.b);
                    if (atyn == null) {
                        atyn = atyn.CONSENT_FLOW_LAYOUT_UNSPECIFIED;
                    }
                } else {
                    atyn = null;
                }
                anih.a("Unknown layout ID overwrite: %s", (Object) atyn);
                break;
        }
        int a3 = atyl.a(atyo.c);
        if (a3 == 0) {
            a3 = 1;
        }
        int i2 = a3 - 1;
        if (i2 == 1) {
            acyd.a(0);
        } else if (i2 != 2) {
            anih anih2 = (anih) ((anih) a.c()).a("com.google.android.gms.udc.ui.UdcConsentChimeraActivity", "a", 327, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            if ((atyo.a & 1) != 0 && (atyn3 = atyn.a(atyo.b)) == null) {
                atyn3 = atyn.CONSENT_FLOW_LAYOUT_UNSPECIFIED;
            }
            anih2.a("Unknown button placement overwrite: %s", (Object) atyn3);
        } else {
            acyd.a(1);
        }
        return acyd.a;
    }

    public final int b() {
        return this.m;
    }

    public final void c() {
        a(2);
        finish();
    }

    public final void onBackPressed() {
        adhv adhv = this.l;
        if (adhv == null) {
            ((anih) ((anih) a.b()).a("com.google.android.gms.udc.ui.UdcConsentChimeraActivity", "onBackPressed", 366, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("UdcClearcutLogger is null.");
        } else {
            adhv.a(29008, this.m);
        }
        a(1);
        super.onBackPressed();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        if (configuration.orientation != this.o) {
            int i2 = configuration.orientation;
            this.o = i2;
            adhv adhv = this.l;
            if (adhv == null) {
                ((anih) ((anih) a.b()).a("com.google.android.gms.udc.ui.UdcConsentChimeraActivity", "onConfigurationChanged", 349, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("UdcClearcutLogger is null.");
            } else {
                int i3 = this.m;
                aucd o2 = aqna.d.o();
                aucf aucf = (aucf) aqmz.l.o();
                if (aucf.c) {
                    aucf.c();
                    aucf.c = false;
                }
                aqmz aqmz = (aqmz) aucf.b;
                aqmz.b = 39;
                int i4 = aqmz.a | 1;
                aqmz.a = i4;
                aqmz.c = 29014;
                int i5 = 2;
                int i6 = i4 | 2;
                aqmz.a = i6;
                int i7 = i6 | 16;
                aqmz.a = i7;
                aqmz.f = false;
                if (i2 == 1) {
                    i5 = 3;
                } else if (i2 != 2) {
                    i5 = 1;
                }
                aqmz.a = i7 | 8;
                aqmz.e = i5 - 1;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aqna aqna = (aqna) o2.b;
                aqmz aqmz2 = (aqmz) aucf.i();
                aqmz2.getClass();
                aqna.b = aqmz2;
                aqna.a |= 1;
                adhv.a((aqna) o2.i(), i3);
            }
        }
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if (r0.f == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        getContainerActivity().requestWindowFeature(1);
        getContainerActivity().getWindow().setType(3);
        r0 = getContainerActivity().getWindow().getDecorView();
        r0.getViewTreeObserver().addOnGlobalLayoutListener(new defpackage.adgb(r1, r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            android.content.Intent r3 = r16.getIntent()
            java.lang.String r4 = "UdcConsentFlowConfigBundle"
            boolean r0 = r3.hasExtra(r4)
            java.lang.String r5 = "UdcConsentFlowConfig"
            r6 = 7
            java.lang.String r7 = "UdcLayoutOverwrites"
            if (r0 == 0) goto L_0x0038
            android.os.Bundle r0 = r3.getBundleExtra(r4)
            android.os.Parcelable r0 = r0.getParcelable(r5)
            com.google.android.gms.udc.ConsentFlowConfig r0 = (com.google.android.gms.udc.ConsentFlowConfig) r0
            boolean r8 = r3.hasExtra(r7)
            if (r8 == 0) goto L_0x0039
            atyo r8 = defpackage.atyo.d
            java.lang.Object r8 = r8.c(r6)
            auef r8 = (defpackage.auef) r8
            audx r8 = defpackage.adgq.a((android.content.Intent) r3, (java.lang.String) r7, (defpackage.auef) r8)
            atyo r8 = (defpackage.atyo) r8
            com.google.android.gms.udc.ConsentFlowConfig r0 = a((defpackage.atyo) r8, (com.google.android.gms.udc.ConsentFlowConfig) r0)
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            r1.c = r0
            java.lang.String r9 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r12 = "com.google.android.gms.udc.ui.UdcConsentChimeraActivity"
            java.lang.String r13 = "onCreate"
            if (r0 != 0) goto L_0x0044
            goto L_0x0048
        L_0x0044:
            boolean r0 = r0.f     // Catch:{ Exception -> 0x00ba }
            if (r0 != 0) goto L_0x00d3
        L_0x0048:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00ba }
            android.content.Context r0 = r16.getApplicationContext()     // Catch:{ Exception -> 0x00ba }
            jjg r14 = defpackage.adez.a     // Catch:{ Exception -> 0x00ba }
            java.lang.String r14 = "adez"
            java.lang.String r15 = "a"
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ Exception -> 0x00a0 }
            android.content.pm.FeatureInfo[] r0 = r0.getSystemAvailableFeatures()     // Catch:{ Exception -> 0x00a0 }
            int r10 = r0.length     // Catch:{ Exception -> 0x00a0 }
            r6 = 0
        L_0x005e:
            if (r6 >= r10) goto L_0x00d3
            r8 = r0[r6]     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r11 = r8.name     // Catch:{ Exception -> 0x00a0 }
            if (r11 == 0) goto L_0x009d
            java.lang.String r8 = r8.name     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r11 = "org.chromium.arc"
            boolean r8 = r8.equals(r11)     // Catch:{ Exception -> 0x00a0 }
            if (r8 == 0) goto L_0x009d
            android.app.Activity r0 = r16.getContainerActivity()     // Catch:{ Exception -> 0x00ba }
            r6 = 1
            r0.requestWindowFeature(r6)     // Catch:{ Exception -> 0x00ba }
            android.app.Activity r0 = r16.getContainerActivity()     // Catch:{ Exception -> 0x00ba }
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x00ba }
            r6 = 3
            r0.setType(r6)     // Catch:{ Exception -> 0x00ba }
            android.app.Activity r0 = r16.getContainerActivity()     // Catch:{ Exception -> 0x00ba }
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x00ba }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x00ba }
            android.view.ViewTreeObserver r6 = r0.getViewTreeObserver()     // Catch:{ Exception -> 0x00ba }
            adgb r8 = new adgb     // Catch:{ Exception -> 0x00ba }
            r8.<init>(r1, r0)     // Catch:{ Exception -> 0x00ba }
            r6.addOnGlobalLayoutListener(r8)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00d3
        L_0x009d:
            int r6 = r6 + 1
            goto L_0x005e
        L_0x00a0:
            r0 = move-exception
            jjg r6 = defpackage.adez.a     // Catch:{ Exception -> 0x00ba }
            anie r6 = r6.b()     // Catch:{ Exception -> 0x00ba }
            anih r6 = (defpackage.anih) r6     // Catch:{ Exception -> 0x00ba }
            r6.a((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x00ba }
            r0 = 31
            anie r0 = r6.a((java.lang.String) r14, (java.lang.String) r15, (int) r0, (java.lang.String) r9)     // Catch:{ Exception -> 0x00ba }
            anih r0 = (defpackage.anih) r0     // Catch:{ Exception -> 0x00ba }
            java.lang.String r6 = "Couldn't determine whether running on chromeOS"
            r0.a((java.lang.String) r6)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00d3
        L_0x00ba:
            r0 = move-exception
            jjg r6 = a
            anie r6 = r6.b()
            anih r6 = (defpackage.anih) r6
            r6.a((java.lang.Throwable) r0)
            r0 = 199(0xc7, float:2.79E-43)
            anie r0 = r6.a((java.lang.String) r12, (java.lang.String) r13, (int) r0, (java.lang.String) r9)
            anih r0 = (defpackage.anih) r0
            java.lang.String r6 = "Couldn't apply ChromeOS modifications."
            r0.a((java.lang.String) r6)
        L_0x00d3:
            super.onCreate(r17)
            defpackage.jhg.c((com.google.android.chimera.Activity) r16)     // Catch:{ SecurityException -> 0x021d }
            java.lang.String r0 = "UdcAccountName"
            java.lang.String r0 = r3.getStringExtra(r0)
            r1.b = r0
            atyw r0 = defpackage.atyw.j
            r6 = 7
            java.lang.Object r0 = r0.c(r6)
            auef r0 = (defpackage.auef) r0
            java.lang.String r6 = "UdcConsentRequest"
            audx r0 = defpackage.adgq.a((android.content.Intent) r3, (java.lang.String) r6, (defpackage.auef) r0)
            atyw r0 = (defpackage.atyw) r0
            r1.d = r0
            java.lang.String r6 = "Intent is missing consent request"
            defpackage.iva.a((java.lang.Object) r0, (java.lang.Object) r6)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1.f = r0
            atyw r6 = r1.d
            aucs r6 = r6.d
            int[] r6 = defpackage.aoog.a((java.util.Collection) r6)
            java.lang.String r8 = "UdcConsentResultIds"
            r0.putExtra(r8, r6)
            android.content.Intent r0 = r1.f
            atyw r6 = r1.d
            int r6 = r6.e
            int r6 = defpackage.atzq.a(r6)
            if (r6 == 0) goto L_0x011a
            goto L_0x011b
        L_0x011a:
            r6 = 1
        L_0x011b:
            int r6 = r6 + -1
            java.lang.String r8 = "UdcConsentResultValues"
            r0.putExtra(r8, r6)
            adgc r0 = new adgc
            r0.<init>(r1)
            r1.p = r0
            adgd r0 = new adgd
            r0.<init>(r1)
            r1.q = r0
            boolean r0 = r3.hasExtra(r4)
            if (r0 == 0) goto L_0x015f
            android.os.Bundle r0 = r3.getBundleExtra(r4)
            android.os.Parcelable r0 = r0.getParcelable(r5)
            com.google.android.gms.udc.ConsentFlowConfig r0 = (com.google.android.gms.udc.ConsentFlowConfig) r0
            r1.c = r0
            boolean r0 = r3.hasExtra(r7)
            if (r0 == 0) goto L_0x015f
            atyo r0 = defpackage.atyo.d
            r4 = 7
            java.lang.Object r0 = r0.c(r4)
            auef r0 = (defpackage.auef) r0
            audx r0 = defpackage.adgq.a((android.content.Intent) r3, (java.lang.String) r7, (defpackage.auef) r0)
            atyo r0 = (defpackage.atyo) r0
            com.google.android.gms.udc.ConsentFlowConfig r3 = r1.c
            com.google.android.gms.udc.ConsentFlowConfig r0 = a((defpackage.atyo) r0, (com.google.android.gms.udc.ConsentFlowConfig) r3)
            r1.c = r0
        L_0x015f:
            com.google.android.gms.udc.ConsentFlowConfig r0 = r1.c
            if (r0 == 0) goto L_0x0164
            goto L_0x016d
        L_0x0164:
            acyd r0 = new acyd
            r0.<init>()
            com.google.android.gms.udc.ConsentFlowConfig r0 = r0.a
            r1.c = r0
        L_0x016d:
            com.google.android.gms.udc.ConsentFlowConfig r0 = r1.c
            int r3 = defpackage.adgi.l
            int r0 = r0.d
            r3 = 2132019409(0x7f1408d1, float:1.9677152E38)
            r4 = 1
            if (r0 == r4) goto L_0x01a0
            r4 = 4
            if (r0 == r4) goto L_0x0199
            r4 = 5
            if (r0 == r4) goto L_0x0199
            r4 = 6
            if (r0 == r4) goto L_0x0194
            android.content.res.Resources r0 = r16.getResources()
            boolean r0 = defpackage.jix.a((android.content.res.Resources) r0)
            if (r0 != 0) goto L_0x018d
            goto L_0x0190
        L_0x018d:
            r3 = 2132019407(0x7f1408cf, float:1.9677148E38)
        L_0x0190:
            r1.setTheme(r3)
            goto L_0x01a4
        L_0x0194:
            r1.setTheme(r3)
            goto L_0x01a4
        L_0x0199:
            r0 = 2132019410(0x7f1408d2, float:1.9677154E38)
            r1.setTheme(r0)
            goto L_0x01a4
        L_0x01a0:
            r1.setTheme(r3)
        L_0x01a4:
            if (r2 == 0) goto L_0x01e3
            atzx r0 = defpackage.atzx.f
            r3 = 7
            java.lang.Object r0 = r0.c(r3)
            auef r0 = (defpackage.auef) r0
            java.lang.String r3 = "UdcWriteRequest"
            audx r0 = defpackage.adgq.a((android.os.Bundle) r2, (java.lang.String) r3, (defpackage.auef) r0)
            atzx r0 = (defpackage.atzx) r0
            r1.g = r0
            java.lang.String r0 = "UdcConsentZippyStates"
            java.util.ArrayList r0 = r2.getIntegerArrayList(r0)
            r1.i = r0
            java.lang.String r0 = "UdcConsentZippySettingIds"
            java.util.ArrayList r0 = r2.getIntegerArrayList(r0)
            r1.j = r0
            java.lang.String r0 = "UdcHadConsentWriteErrors"
            boolean r0 = r2.getBoolean(r0)
            r1.k = r0
            java.lang.String r0 = "UdcClearcutEventFlowId"
            r3 = 0
            int r0 = r2.getInt(r0, r3)
            r1.m = r0
            java.lang.String r0 = "UdcScreenDisplayedLogged"
            boolean r0 = r2.getBoolean(r0)
            r1.n = r0
            goto L_0x01ec
        L_0x01e3:
            r3 = 0
            int r0 = defpackage.adhv.a()
            r1.m = r0
            r1.n = r3
        L_0x01ec:
            java.util.ArrayList r0 = r1.i
            if (r0 == 0) goto L_0x01f1
            goto L_0x01ff
        L_0x01f1:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.i = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.j = r0
        L_0x01ff:
            adhv r0 = new adhv
            java.lang.String r2 = r1.b
            r0.<init>(r1, r2)
            r1.l = r0
            adgr r0 = r1.h
            adgc r2 = r1.p
            r3 = 1
            r0.a(r3, r2)
            atzx r0 = r1.g
            if (r0 == 0) goto L_0x021c
            adgr r0 = r1.h
            r2 = 2
            adgd r3 = r1.q
            r0.a(r2, r3)
        L_0x021c:
            return
        L_0x021d:
            r0 = move-exception
            r2 = r0
            jjg r0 = a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r0.a((java.lang.Throwable) r2)
            r2 = 206(0xce, float:2.89E-43)
            anie r0 = r0.a((java.lang.String) r12, (java.lang.String) r13, (int) r2, (java.lang.String) r9)
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "Couldn't verify signature - finishing activity."
            r0.a((java.lang.String) r2)
            r2 = 3
            r1.a((int) r2)
            r16.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.udc.ui.UdcConsentChimeraActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        this.h.removeCallbacksAndMessages((Object) null);
        super.onDestroy();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putIntegerArrayList("UdcConsentZippyStates", this.i);
        bundle.putIntegerArrayList("UdcConsentZippySettingIds", this.j);
        bundle.putBoolean("UdcHadConsentWriteErrors", this.k);
        bundle.putInt("UdcClearcutEventFlowId", this.m);
        bundle.putBoolean("UdcScreenDisplayedLogged", this.n);
        adgq.a(bundle, "UdcWriteRequest", (audx) this.g);
    }

    private final void a(int i2) {
        Intent intent = new Intent();
        intent.putExtra("udc.consent.cancelReason", new ConsentCancelReason(i2, this.k));
        setResult(0, intent);
    }

    public final void a() {
        adhv adhv = this.l;
        if (adhv == null) {
            ((anih) ((anih) a.b()).a("com.google.android.gms.udc.ui.UdcConsentChimeraActivity", "a", 422, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("UdcClearcutLogger is null.");
        } else {
            adhv.a(29021, this.m);
        }
        this.h.b(1, this.p);
    }

    public final void a(int i2, boolean z) {
        int i3;
        if (this.i.get(i2) == null || !((Integer) this.i.get(i2)).equals(Integer.valueOf(z))) {
            if (this.i.get(i2) != null) {
                adhv adhv = this.l;
                if (adhv != null) {
                    int intValue = ((Integer) this.j.get(i2)).intValue();
                    int i4 = this.m;
                    aucd o2 = aqna.d.o();
                    aucf aucf = (aucf) aqmz.l.o();
                    if (aucf.c) {
                        aucf.c();
                        aucf.c = false;
                    }
                    aqmz aqmz = (aqmz) aucf.b;
                    aqmz.b = 39;
                    int i5 = aqmz.a | 1;
                    aqmz.a = i5;
                    if (!z) {
                        i3 = 29017;
                    } else {
                        i3 = 29016;
                    }
                    aqmz.c = i3 - 1;
                    int i6 = i5 | 2;
                    aqmz.a = i6;
                    int i7 = i6 | 16;
                    aqmz.a = i7;
                    aqmz.f = false;
                    aqmz.a = i7 | 8;
                    aqmz.e = intValue;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aqna aqna = (aqna) o2.b;
                    aqmz aqmz2 = (aqmz) aucf.i();
                    aqmz2.getClass();
                    aqna.b = aqmz2;
                    aqna.a |= 1;
                    adhv.a((aqna) o2.i(), i4);
                } else {
                    ((anih) ((anih) a.b()).a("com.google.android.gms.udc.ui.UdcConsentChimeraActivity", "a", 439, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("UdcClearcutLogger is null.");
                }
            }
            this.i.set(i2, Integer.valueOf(z ? 1 : 0));
        }
    }

    public final void a(atzr atzr) {
        aucd o2 = atzx.f.o();
        aucd o3 = atzw.e.o();
        auay auay = this.e.c;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        atzw atzw = (atzw) o3.b;
        auay.getClass();
        int i2 = 1;
        atzw.a |= 1;
        atzw.b = auay;
        int a2 = atzq.a(this.d.e);
        if (a2 != 0) {
            i2 = a2;
        }
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        atzw atzw2 = (atzw) o3.b;
        atzw2.c = i2 - 1;
        int i3 = atzw2.a | 2;
        atzw2.a = i3;
        atzr.getClass();
        atzw2.d = atzr;
        atzw2.a = i3 | 4;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atzx atzx = (atzx) o2.b;
        atzw atzw3 = (atzw) o3.i();
        atzw3.getClass();
        atzx.d = atzw3;
        atzx.a |= 4;
        atyw atyw = this.d;
        if ((atyw.a & 32) != 0) {
            String str = atyw.i;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atzx atzx2 = (atzx) o2.b;
            str.getClass();
            atzx2.a |= 16;
            atzx2.e = str;
        }
        if (!jlh.d(this.d.c)) {
            String str2 = this.d.c;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atzx atzx3 = (atzx) o2.b;
            str2.getClass();
            atzx3.a |= 2;
            atzx3.c = str2;
        }
        this.g = (atzx) o2.i();
        this.h.b(2, this.q);
    }
}
