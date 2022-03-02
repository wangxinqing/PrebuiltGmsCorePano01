package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.udc.ui.UdcConsentChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: adgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adgd implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ UdcConsentChimeraActivity a;
    private DialogFragment b;

    public adgd(UdcConsentChimeraActivity udcConsentChimeraActivity) {
        adfz adfz;
        this.a = udcConsentChimeraActivity;
        FragmentManager supportFragmentManager = udcConsentChimeraActivity.getSupportFragmentManager();
        int i = adgp.c;
        try {
            adfz = (adfz) supportFragmentManager.findFragmentByTag("UdcDialog");
        } catch (ClassCastException e) {
            anih anih = (anih) adfz.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("adfz", "a", 33, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error finding dialog fragment");
            adfz = null;
        }
        this.b = adfz;
    }

    private final void a() {
        DialogFragment dialogFragment = this.b;
        if (dialogFragment != null) {
            adgr adgr = this.a.h;
            adgr.sendMessage(adgr.obtainMessage(2, dialogFragment));
            this.b = null;
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        adgo adgo = new adgo();
        adgo.a.putString("UdcDialogMessage", this.a.getString(R.string.udc_please_wait));
        FragmentManager supportFragmentManager = this.a.getSupportFragmentManager();
        adfz b2 = adgo.b();
        b2.show(supportFragmentManager, "UdcDialog");
        this.b = b2;
        UdcConsentChimeraActivity udcConsentChimeraActivity = this.a;
        jjg jjg = UdcConsentChimeraActivity.a;
        String str = udcConsentChimeraActivity.b;
        adcv adcv = new adcv(udcConsentChimeraActivity, new Account(str, "com.google"), udcConsentChimeraActivity.g);
        adcv.a(azrh.a.a().f(), TimeUnit.MILLISECONDS);
        return adcv;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onLoadFinished(com.google.android.chimera.Loader r11, java.lang.Object r12) {
        /*
            r10 = this;
            acyu r12 = (defpackage.acyu) r12
            r10.a()
            com.google.android.gms.common.api.Status r11 = r12.aO()
            boolean r11 = r11.c()
            r0 = -1
            r1 = 0
            r2 = 1
            r3 = 0
            if (r11 == 0) goto L_0x007a
            audx r11 = r12.b()
            atzy r11 = (defpackage.atzy) r11
            azrb r12 = defpackage.azrb.a
            azrc r12 = r12.a()
            boolean r12 = r12.c()
            if (r12 == 0) goto L_0x005d
            int r12 = r11.a
            r12 = r12 & r2
            if (r12 == 0) goto L_0x005d
            atyi r12 = r11.b
            if (r12 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            atyi r12 = defpackage.atyi.c
        L_0x0031:
            int r12 = r12.a
            r12 = r12 & r2
            if (r12 == 0) goto L_0x005c
            atyi r11 = r11.b
            if (r11 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            atyi r11 = defpackage.atyi.c
        L_0x003d:
            amdp r11 = r11.b
            if (r11 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            amdp r11 = defpackage.amdp.d
        L_0x0044:
            com.google.android.gms.udc.ConsistencyInformation r3 = new com.google.android.gms.udc.ConsistencyInformation
            java.lang.String r12 = r11.b
            int r11 = r11.c
            r3.<init>(r12, r11)
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r11 = r10.a
            jjg r12 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            android.content.Intent r11 = r11.f
            if (r11 == 0) goto L_0x005b
            java.lang.String r12 = "udc.consent.consistency_info"
            r11.putExtra(r12, r3)
            goto L_0x005e
        L_0x005b:
            goto L_0x005e
        L_0x005c:
            goto L_0x005e
        L_0x005d:
        L_0x005e:
            adhq r11 = defpackage.adhq.a()
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r12 = r10.a
            jjg r2 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            java.lang.String r12 = r12.b
            r11.a(r12, r3)
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r11 = r10.a
            r11.k = r1
            android.content.Intent r12 = r11.f
            r11.setResult(r0, r12)
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r11 = r10.a
            r11.finish()
            return
        L_0x007a:
            adhq r11 = defpackage.adhq.a()
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r4 = r10.a
            jjg r5 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            java.lang.String r4 = r4.b
            r11.a(r4, r3)
            com.google.android.gms.common.api.Status r11 = r12.aO()
            java.lang.String r12 = "adgd"
            java.lang.String r4 = "a"
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            jjg r6 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            anie r6 = r6.b()
            anih r6 = (defpackage.anih) r6
            r7 = 625(0x271, float:8.76E-43)
            anie r6 = r6.a((java.lang.String) r12, (java.lang.String) r4, (int) r7, (java.lang.String) r5)
            anih r6 = (defpackage.anih) r6
            int r7 = r11.i
            java.lang.String r7 = defpackage.aczc.g(r7)
            java.lang.String r8 = r11.j
            java.lang.String r9 = "Error (%s) writing the consent: %s"
            r6.a((java.lang.String) r9, (java.lang.Object) r7, (java.lang.Object) r8)
            int r11 = r11.i
            r6 = 7
            r7 = 2131954314(0x7f130a8a, float:1.9545124E38)
            if (r11 == r6) goto L_0x00e4
            r6 = 8
            if (r11 == r6) goto L_0x00e0
            r6 = 15
            if (r11 == r6) goto L_0x00e0
            switch(r11) {
                case 4502: goto L_0x00e4;
                case 4503: goto L_0x00df;
                case 4504: goto L_0x00db;
                case 4505: goto L_0x00d7;
                case 4506: goto L_0x00d7;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            jjg r6 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            anie r6 = r6.b()
            anih r6 = (defpackage.anih) r6
            r8 = 650(0x28a, float:9.11E-43)
            anie r6 = r6.a((java.lang.String) r12, (java.lang.String) r4, (int) r8, (java.lang.String) r5)
            anih r6 = (defpackage.anih) r6
            java.lang.String r8 = "Unknown statuscode:%d"
            r6.a((java.lang.String) r8, (int) r11)
            goto L_0x00e7
        L_0x00d7:
            r7 = 2131954319(0x7f130a8f, float:1.9545134E38)
            goto L_0x00e7
        L_0x00db:
            r7 = 2131954310(0x7f130a86, float:1.9545116E38)
            goto L_0x00e7
        L_0x00df:
            goto L_0x00e7
        L_0x00e0:
            r7 = 2131954318(0x7f130a8e, float:1.9545132E38)
            goto L_0x00e7
        L_0x00e4:
            r7 = 2131954316(0x7f130a8c, float:1.9545128E38)
        L_0x00e7:
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r11 = r10.a
            adhv r6 = r11.l
            if (r6 != 0) goto L_0x0103
            jjg r11 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            anie r11 = r11.b()
            anih r11 = (defpackage.anih) r11
            r0 = 655(0x28f, float:9.18E-43)
            anie r11 = r11.a((java.lang.String) r12, (java.lang.String) r4, (int) r0, (java.lang.String) r5)
            anih r11 = (defpackage.anih) r11
            java.lang.String r12 = "UdcClearcutLogger is null."
            r11.a((java.lang.String) r12)
            goto L_0x016a
        L_0x0103:
            int r11 = r11.m
            jjg r12 = defpackage.adfa.a
            aqms r12 = defpackage.aqms.m
            aucd r12 = r12.o()
            boolean r4 = r12.c
            if (r4 == 0) goto L_0x0116
            r12.c()
            r12.c = r1
        L_0x0116:
            aucj r4 = r12.b
            aqms r4 = (defpackage.aqms) r4
            r5 = 6
            r4.b = r5
            int r5 = r4.a
            r5 = r5 | r2
            r4.a = r5
            aqlz r4 = defpackage.aqlz.c
            aucd r4 = r4.o()
            int r5 = defpackage.adfa.b(r7)
            boolean r8 = r4.c
            if (r8 != 0) goto L_0x0131
            goto L_0x0136
        L_0x0131:
            r4.c()
            r4.c = r1
        L_0x0136:
            aucj r8 = r4.b
            aqlz r8 = (defpackage.aqlz) r8
            int r5 = r5 + r0
            r8.b = r5
            int r0 = r8.a
            r0 = r0 | r2
            r8.a = r0
            boolean r0 = r12.c
            if (r0 != 0) goto L_0x0147
            goto L_0x014c
        L_0x0147:
            r12.c()
            r12.c = r1
        L_0x014c:
            aucj r0 = r12.b
            aqms r0 = (defpackage.aqms) r0
            aucj r1 = r4.i()
            aqlz r1 = (defpackage.aqlz) r1
            r1.getClass()
            r0.g = r1
            int r1 = r0.a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r0.a = r1
            aucj r12 = r12.i()
            aqms r12 = (defpackage.aqms) r12
            r6.a((int) r11, (defpackage.aqms) r12)
        L_0x016a:
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r11 = r10.a
            r11.k = r2
            r11.g = r3
            adgr r11 = r11.h
            adft r12 = new adft
            r12.<init>()
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r0 = r10.a
            java.lang.String r0 = r0.getString(r7)
            r12.a(r0)
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r0 = r10.a
            r1 = 17039370(0x104000a, float:2.42446E-38)
            java.lang.String r0 = r0.getString(r1)
            android.os.Bundle r1 = r12.a
            java.lang.String r2 = "UdcDialogPositive"
            r1.putCharSequence(r2, r0)
            r0 = 5
            adfz r12 = r12.b()
            android.os.Message r12 = r11.obtainMessage(r0, r12)
            r11.sendMessage(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adgd.onLoadFinished(com.google.android.chimera.Loader, java.lang.Object):void");
    }

    public final void onLoaderReset(Loader loader) {
        a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.google.android.gms.common.api.Status r9) {
        /*
            r8 = this;
            jjg r0 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "adgd"
            java.lang.String r2 = "a"
            r3 = 625(0x271, float:8.76E-43)
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r0.a((java.lang.String) r1, (java.lang.String) r2, (int) r3, (java.lang.String) r4)
            anih r0 = (defpackage.anih) r0
            int r3 = r9.i
            java.lang.String r3 = defpackage.aczc.g(r3)
            java.lang.String r5 = r9.j
            java.lang.String r6 = "Error (%s) writing the consent: %s"
            r0.a((java.lang.String) r6, (java.lang.Object) r3, (java.lang.Object) r5)
            int r9 = r9.i
            r0 = 7
            r3 = 2131954314(0x7f130a8a, float:1.9545124E38)
            if (r9 == r0) goto L_0x0059
            r0 = 8
            if (r9 == r0) goto L_0x0055
            r0 = 15
            if (r9 == r0) goto L_0x0055
            switch(r9) {
                case 4502: goto L_0x0059;
                case 4503: goto L_0x0054;
                case 4504: goto L_0x0050;
                case 4505: goto L_0x004c;
                case 4506: goto L_0x004c;
                default: goto L_0x0036;
            }
        L_0x0036:
            jjg r0 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r5 = 650(0x28a, float:9.11E-43)
            anie r0 = r0.a((java.lang.String) r1, (java.lang.String) r2, (int) r5, (java.lang.String) r4)
            anih r0 = (defpackage.anih) r0
            java.lang.String r5 = "Unknown statuscode:%d"
            r0.a((java.lang.String) r5, (int) r9)
            goto L_0x005c
        L_0x004c:
            r3 = 2131954319(0x7f130a8f, float:1.9545134E38)
            goto L_0x005c
        L_0x0050:
            r3 = 2131954310(0x7f130a86, float:1.9545116E38)
            goto L_0x005c
        L_0x0054:
            goto L_0x005c
        L_0x0055:
            r3 = 2131954318(0x7f130a8e, float:1.9545132E38)
            goto L_0x005c
        L_0x0059:
            r3 = 2131954316(0x7f130a8c, float:1.9545128E38)
        L_0x005c:
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r9 = r8.a
            adhv r0 = r9.l
            r5 = 1
            if (r0 != 0) goto L_0x0079
            jjg r9 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            anie r9 = r9.b()
            anih r9 = (defpackage.anih) r9
            r0 = 655(0x28f, float:9.18E-43)
            anie r9 = r9.a((java.lang.String) r1, (java.lang.String) r2, (int) r0, (java.lang.String) r4)
            anih r9 = (defpackage.anih) r9
            java.lang.String r0 = "UdcClearcutLogger is null."
            r9.a((java.lang.String) r0)
            goto L_0x00e2
        L_0x0079:
            int r9 = r9.m
            jjg r1 = defpackage.adfa.a
            aqms r1 = defpackage.aqms.m
            aucd r1 = r1.o()
            boolean r2 = r1.c
            r4 = 0
            if (r2 == 0) goto L_0x008d
            r1.c()
            r1.c = r4
        L_0x008d:
            aucj r2 = r1.b
            aqms r2 = (defpackage.aqms) r2
            r6 = 6
            r2.b = r6
            int r6 = r2.a
            r6 = r6 | r5
            r2.a = r6
            aqlz r2 = defpackage.aqlz.c
            aucd r2 = r2.o()
            int r6 = defpackage.adfa.b(r3)
            boolean r7 = r2.c
            if (r7 != 0) goto L_0x00a8
            goto L_0x00ad
        L_0x00a8:
            r2.c()
            r2.c = r4
        L_0x00ad:
            aucj r7 = r2.b
            aqlz r7 = (defpackage.aqlz) r7
            int r6 = r6 + -1
            r7.b = r6
            int r6 = r7.a
            r6 = r6 | r5
            r7.a = r6
            boolean r6 = r1.c
            if (r6 != 0) goto L_0x00bf
            goto L_0x00c4
        L_0x00bf:
            r1.c()
            r1.c = r4
        L_0x00c4:
            aucj r4 = r1.b
            aqms r4 = (defpackage.aqms) r4
            aucj r2 = r2.i()
            aqlz r2 = (defpackage.aqlz) r2
            r2.getClass()
            r4.g = r2
            int r2 = r4.a
            r2 = r2 | 128(0x80, float:1.794E-43)
            r4.a = r2
            aucj r1 = r1.i()
            aqms r1 = (defpackage.aqms) r1
            r0.a((int) r9, (defpackage.aqms) r1)
        L_0x00e2:
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r9 = r8.a
            r9.k = r5
            r0 = 0
            r9.g = r0
            adgr r9 = r9.h
            adft r0 = new adft
            r0.<init>()
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r1 = r8.a
            java.lang.String r1 = r1.getString(r3)
            r0.a(r1)
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r1 = r8.a
            r2 = 17039370(0x104000a, float:2.42446E-38)
            java.lang.String r1 = r1.getString(r2)
            android.os.Bundle r2 = r0.a
            java.lang.String r3 = "UdcDialogPositive"
            r2.putCharSequence(r3, r1)
            r1 = 5
            adfz r0 = r0.b()
            android.os.Message r0 = r9.obtainMessage(r1, r0)
            r9.sendMessage(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adgd.a(com.google.android.gms.common.api.Status):void");
    }
}
