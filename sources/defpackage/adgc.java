package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.udc.ui.UdcConsentChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: adgc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adgc implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ UdcConsentChimeraActivity a;

    public adgc(UdcConsentChimeraActivity udcConsentChimeraActivity) {
        this.a = udcConsentChimeraActivity;
    }

    /* JADX WARNING: type inference failed for: r2v20, types: [aucj] */
    /* JADX WARNING: type inference failed for: r2v26, types: [aucj] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.atyx r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r2 = r0.a
            jjg r3 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            r2.e = r1
            java.util.ArrayList r2 = r2.j
            r2.clear()
            aucx r2 = r1.i
            int r3 = r2.size()
            r4 = 0
            r5 = 0
        L_0x0017:
            if (r5 >= r3) goto L_0x0036
            java.lang.Object r6 = r2.get(r5)
            atzm r6 = (defpackage.atzm) r6
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r7 = r0.a
            java.util.ArrayList r7 = r7.j
            atzl r6 = r6.b
            if (r6 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            atzl r6 = defpackage.atzl.e
        L_0x002a:
            int r6 = r6.b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.add(r6)
            int r5 = r5 + 1
            goto L_0x0017
        L_0x0036:
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r2 = r0.a
            adhv r3 = r2.l
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r6 = "a"
            r11 = 1
            if (r3 != 0) goto L_0x005a
            jjg r2 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            anie r2 = r2.b()
            anih r2 = (defpackage.anih) r2
            r3 = 490(0x1ea, float:6.87E-43)
            java.lang.String r4 = "adgc"
            anie r2 = r2.a((java.lang.String) r4, (java.lang.String) r6, (int) r3, (java.lang.String) r5)
            anih r2 = (defpackage.anih) r2
            java.lang.String r3 = "UdcClearcutLogger is null."
            r2.a((java.lang.String) r3)
            goto L_0x02f9
        L_0x005a:
            boolean r3 = r2.n
            if (r3 != 0) goto L_0x02f9
            r2.n = r11
            android.content.res.Resources r3 = r2.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.orientation
            r2.o = r3
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r2 = r0.a
            adhv r3 = r2.l
            int r12 = r2.m
            atyw r13 = r2.d
            atyx r14 = r2.e
            com.google.android.gms.udc.ConsentFlowConfig r15 = r2.c
            int r2 = r2.o
            jjg r16 = defpackage.adfa.a
            aqms r16 = defpackage.aqms.m
            aucd r7 = r16.o()
            r16 = 0
            if (r13 == 0) goto L_0x02ec
            int r8 = r13.a
            r8 = r8 & 16
            if (r8 != 0) goto L_0x008e
            goto L_0x010a
        L_0x008e:
            atzv r8 = r13.g
            if (r8 == 0) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            atzv r8 = defpackage.atzv.i
        L_0x0095:
            int r8 = r8.c
            boolean r9 = r7.c
            if (r9 != 0) goto L_0x009c
            goto L_0x00a1
        L_0x009c:
            r7.c()
            r7.c = r4
        L_0x00a1:
            aucj r9 = r7.b
            aqms r9 = (defpackage.aqms) r9
            int r10 = r9.a
            r10 = r10 | 256(0x100, float:3.59E-43)
            r9.a = r10
            r9.h = r8
            atzv r8 = r13.g
            if (r8 == 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            atzv r8 = defpackage.atzv.i
        L_0x00b4:
            int r8 = r8.a
            r8 = r8 & 8
            if (r8 == 0) goto L_0x00dc
            atzv r8 = r13.g
            if (r8 == 0) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            atzv r8 = defpackage.atzv.i
        L_0x00c1:
            java.lang.String r8 = r8.d
            boolean r9 = r7.c
            if (r9 != 0) goto L_0x00c8
            goto L_0x00cd
        L_0x00c8:
            r7.c()
            r7.c = r4
        L_0x00cd:
            aucj r9 = r7.b
            aqms r9 = (defpackage.aqms) r9
            r8.getClass()
            int r10 = r9.a
            r10 = r10 | 512(0x200, float:7.175E-43)
            r9.a = r10
            r9.i = r8
        L_0x00dc:
            atzv r8 = r13.g
            if (r8 == 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            atzv r8 = defpackage.atzv.i
        L_0x00e3:
            int r8 = r8.a
            r8 = r8 & r11
            if (r8 == 0) goto L_0x010a
            atzv r8 = r13.g
            if (r8 == 0) goto L_0x00ed
            goto L_0x00ef
        L_0x00ed:
            atzv r8 = defpackage.atzv.i
        L_0x00ef:
            java.lang.String r8 = r8.b
            boolean r9 = r7.c
            if (r9 != 0) goto L_0x00f6
            goto L_0x00fb
        L_0x00f6:
            r7.c()
            r7.c = r4
        L_0x00fb:
            aucj r9 = r7.b
            aqms r9 = (defpackage.aqms) r9
            r8.getClass()
            int r10 = r9.a
            r10 = r10 | 2048(0x800, float:2.87E-42)
            r9.a = r10
            r9.k = r8
        L_0x010a:
            java.lang.String r8 = r13.c
            boolean r8 = defpackage.adfa.a((java.lang.String) r8)
            boolean r9 = r7.c
            if (r9 != 0) goto L_0x0115
            goto L_0x011a
        L_0x0115:
            r7.c()
            r7.c = r4
        L_0x011a:
            aucj r9 = r7.b
            aqms r9 = (defpackage.aqms) r9
            int r10 = r9.a
            r10 = r10 | 1024(0x400, float:1.435E-42)
            r9.a = r10
            r9.j = r8
            atyv r8 = defpackage.atyv.UNKNOWN
            int r8 = r13.f
            atyv r8 = defpackage.atyv.a(r8)
            if (r8 == 0) goto L_0x0131
            goto L_0x0133
        L_0x0131:
            atyv r8 = defpackage.atyv.UNKNOWN
        L_0x0133:
            int r8 = r8.ordinal()
            r9 = 3
            if (r8 == r11) goto L_0x01e4
            r10 = 2
            if (r8 == r10) goto L_0x0164
            jjg r2 = defpackage.adfa.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            r4 = 127(0x7f, float:1.78E-43)
            java.lang.String r7 = "adfa"
            anie r2 = r2.a((java.lang.String) r7, (java.lang.String) r6, (int) r4, (java.lang.String) r5)
            anih r2 = (defpackage.anih) r2
            int r4 = r13.f
            atyv r4 = defpackage.atyv.a(r4)
            if (r4 == 0) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            atyv r4 = defpackage.atyv.UNKNOWN
        L_0x015a:
            java.lang.String r5 = "Invalid ViewType: %s"
            r2.a((java.lang.String) r5, (java.lang.Object) r4)
            r2 = r16
            goto L_0x02f6
        L_0x0164:
            boolean r5 = r7.c
            if (r5 == 0) goto L_0x016d
            r7.c()
            r7.c = r4
        L_0x016d:
            aucj r5 = r7.b
            aqms r5 = (defpackage.aqms) r5
            r5.b = r9
            int r6 = r5.a
            r6 = r6 | r11
            r5.a = r6
            aqly r5 = defpackage.aqly.d
            aucd r5 = r5.o()
            int r6 = r13.e
            int r6 = defpackage.atzq.a(r6)
            if (r6 == 0) goto L_0x0187
            goto L_0x0188
        L_0x0187:
            r6 = 1
        L_0x0188:
            int r6 = r6 + -1
            boolean r8 = r5.c
            if (r8 != 0) goto L_0x018f
            goto L_0x0194
        L_0x018f:
            r5.c()
            r5.c = r4
        L_0x0194:
            aucj r8 = r5.b
            aqly r8 = (defpackage.aqly) r8
            int r9 = r8.a
            r10 = 2
            r9 = r9 | r10
            r8.a = r9
            r8.c = r6
            aucs r6 = r13.d
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x01c3
            aucs r6 = r13.d
            int r6 = r6.c(r4)
            boolean r8 = r5.c
            if (r8 != 0) goto L_0x01b3
            goto L_0x01b8
        L_0x01b3:
            r5.c()
            r5.c = r4
        L_0x01b8:
            aucj r8 = r5.b
            aqly r8 = (defpackage.aqly) r8
            int r9 = r8.a
            r9 = r9 | r11
            r8.a = r9
            r8.b = r6
        L_0x01c3:
            boolean r6 = r7.c
            if (r6 != 0) goto L_0x01c8
            goto L_0x01cd
        L_0x01c8:
            r7.c()
            r7.c = r4
        L_0x01cd:
            aucj r6 = r7.b
            aqms r6 = (defpackage.aqms) r6
            aucj r5 = r5.i()
            aqly r5 = (defpackage.aqly) r5
            r5.getClass()
            r6.d = r5
            int r5 = r6.a
            r5 = r5 | 16
            r6.a = r5
            goto L_0x02c5
        L_0x01e4:
            boolean r5 = r7.c
            if (r5 != 0) goto L_0x01e9
            goto L_0x01ee
        L_0x01e9:
            r7.c()
            r7.c = r4
        L_0x01ee:
            aucj r5 = r7.b
            aqms r5 = (defpackage.aqms) r5
            r6 = 4
            r5.b = r6
            int r6 = r5.a
            r6 = r6 | r11
            r5.a = r6
            aqlv r5 = defpackage.aqlv.h
            aucd r5 = r5.o()
            aqlu r5 = (defpackage.aqlu) r5
            aucs r6 = r13.d
            int r6 = r6.size()
            if (r6 == 0) goto L_0x020f
            aucs r6 = r13.d
            r5.a(r6)
        L_0x020f:
            if (r14 == 0) goto L_0x0246
            aucx r6 = r14.i
            int r6 = r6.size()
            if (r6 == 0) goto L_0x0246
            aucx r6 = r14.i
            int r6 = r6.size()
            int[] r6 = new int[r6]
            aucx r8 = r14.i
            int r10 = r8.size()
            r13 = 0
            r14 = 0
        L_0x0229:
            if (r13 >= r10) goto L_0x0243
            java.lang.Object r16 = r8.get(r13)
            r9 = r16
            atzm r9 = (defpackage.atzm) r9
            atzl r9 = r9.b
            if (r9 == 0) goto L_0x0238
            goto L_0x023a
        L_0x0238:
            atzl r9 = defpackage.atzl.e
        L_0x023a:
            int r9 = r9.b
            r6[r14] = r9
            int r14 = r14 + r11
            int r13 = r13 + 1
            r9 = 3
            goto L_0x0229
        L_0x0243:
            r16 = r6
            goto L_0x0247
        L_0x0246:
        L_0x0247:
            if (r16 == 0) goto L_0x0250
            java.util.List r6 = defpackage.aoog.b((int[]) r16)
            r5.b(r6)
        L_0x0250:
            int r6 = r15.d
            if (r6 == 0) goto L_0x0275
            if (r6 == r11) goto L_0x0272
            r8 = 2
            if (r6 == r8) goto L_0x026f
            r8 = 4
            if (r6 == r8) goto L_0x026c
            r8 = 5
            if (r6 == r8) goto L_0x0269
            r8 = 6
            if (r6 == r8) goto L_0x0265
            r17 = 1
            goto L_0x0277
        L_0x0265:
            r6 = 7
            r17 = 7
            goto L_0x0277
        L_0x0269:
            r17 = 6
            goto L_0x0277
        L_0x026c:
            r17 = 5
            goto L_0x0277
        L_0x026f:
            r17 = 3
            goto L_0x0277
        L_0x0272:
            r17 = 4
            goto L_0x0277
        L_0x0275:
            r17 = 2
        L_0x0277:
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x027c
            goto L_0x0281
        L_0x027c:
            r5.c()
            r5.c = r4
        L_0x0281:
            aucj r6 = r5.b
            aqlv r6 = (defpackage.aqlv) r6
            int r8 = r17 + -1
            r6.d = r8
            int r8 = r6.a
            r8 = r8 | r11
            r6.a = r8
            boolean r9 = r15.c
            r10 = 2
            r8 = r8 | r10
            r6.a = r8
            r6.e = r9
            boolean r9 = r15.b
            r10 = 4
            r8 = r8 | r10
            r6.a = r8
            r6.f = r9
            boolean r9 = r15.a
            r8 = r8 | 8
            r6.a = r8
            r6.g = r9
            boolean r6 = r7.c
            if (r6 != 0) goto L_0x02ab
            goto L_0x02b0
        L_0x02ab:
            r7.c()
            r7.c = r4
        L_0x02b0:
            aucj r6 = r7.b
            aqms r6 = (defpackage.aqms) r6
            aucj r5 = r5.i()
            aqlv r5 = (defpackage.aqlv) r5
            r5.getClass()
            r6.e = r5
            int r5 = r6.a
            r5 = r5 | 32
            r6.a = r5
        L_0x02c5:
            int r2 = defpackage.adfa.a((int) r2)
            boolean r5 = r7.c
            if (r5 != 0) goto L_0x02ce
            goto L_0x02d3
        L_0x02ce:
            r7.c()
            r7.c = r4
        L_0x02d3:
            aucj r4 = r7.b
            aqms r4 = (defpackage.aqms) r4
            int r2 = r2 + -1
            r4.c = r2
            int r2 = r4.a
            r5 = 2
            r2 = r2 | r5
            r4.a = r2
            aucj r2 = r7.i()
            r16 = r2
            aqms r16 = (defpackage.aqms) r16
            r2 = r16
            goto L_0x02f6
        L_0x02ec:
            aucj r2 = r7.i()
            r16 = r2
            aqms r16 = (defpackage.aqms) r16
            r2 = r16
        L_0x02f6:
            r3.a((int) r12, (defpackage.aqms) r2)
        L_0x02f9:
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r2 = r0.a
            adgr r3 = r2.h
            java.lang.String r4 = r2.b
            com.google.android.gms.udc.ConsentFlowConfig r5 = r2.c
            atyw r2 = r2.d
            int r2 = r2.f
            atyv r2 = defpackage.atyv.a(r2)
            if (r2 == 0) goto L_0x030c
            goto L_0x030e
        L_0x030c:
            atyv r2 = defpackage.atyv.UNKNOWN
        L_0x030e:
            int r2 = r2.d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r6 = r0.a
            java.util.ArrayList r7 = r6.i
            int r6 = r6.m
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r11)
            java.lang.String r9 = "UdcConsentConfig"
            defpackage.adgq.a((android.os.Bundle) r8, (java.lang.String) r9, (defpackage.audx) r1)
            java.lang.String r1 = "UdcAccountName"
            r8.putString(r1, r4)
            java.lang.String r1 = "UdcConsentFlowConfig"
            r8.putParcelable(r1, r5)
            int r1 = r2.intValue()
            java.lang.String r2 = "UdcConsentViewType"
            r8.putInt(r2, r1)
            java.lang.String r1 = "UdcConsentZippyStates"
            r8.putIntegerArrayList(r1, r7)
            java.lang.String r1 = "UdcClearcutEventFlowId"
            r8.putInt(r1, r6)
            int r1 = r5.d
            if (r1 == r11) goto L_0x0363
            r2 = 2
            if (r1 == r2) goto L_0x0363
            r2 = 4
            if (r1 == r2) goto L_0x035d
            r2 = 5
            if (r1 == r2) goto L_0x035d
            r2 = 6
            if (r1 == r2) goto L_0x0357
            adgm r1 = new adgm
            r1.<init>()
            goto L_0x0368
        L_0x0357:
            adgn r1 = new adgn
            r1.<init>()
            goto L_0x0368
        L_0x035d:
            adgk r1 = new adgk
            r1.<init>()
            goto L_0x0368
        L_0x0363:
            adgj r1 = new adgj
            r1.<init>()
        L_0x0368:
            r1.setArguments(r8)
            r3.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adgc.a(atyx):void");
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        this.a.h.a(new adgo().b());
        UdcConsentChimeraActivity udcConsentChimeraActivity = this.a;
        jjg jjg = UdcConsentChimeraActivity.a;
        String str = udcConsentChimeraActivity.b;
        adcs adcs = new adcs(udcConsentChimeraActivity, new Account(str, "com.google"), udcConsentChimeraActivity.d);
        adcs.a(azrh.a.a().e(), TimeUnit.MILLISECONDS);
        return adcs;
    }

    /* JADX WARNING: type inference failed for: r2v46, types: [aucj] */
    /* JADX WARNING: type inference failed for: r2v54, types: [aucj] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0401  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onLoadFinished(com.google.android.chimera.Loader r19, java.lang.Object r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            acyu r1 = (defpackage.acyu) r1
            com.google.android.gms.common.api.Status r2 = r1.aO()
            boolean r2 = r2.c()
            java.lang.String r3 = "UdcClearcutLogger is null."
            java.lang.String r5 = "adgc"
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r7 = "a"
            r9 = 8
            r12 = 1
            r13 = 0
            if (r2 == 0) goto L_0x038d
            audx r1 = r1.b()
            atyx r1 = (defpackage.atyx) r1
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r2 = r0.a
            jjg r14 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            r2.e = r1
            java.util.ArrayList r2 = r2.j
            r2.clear()
            aucx r2 = r1.i
            int r14 = r2.size()
            r15 = 0
        L_0x0034:
            if (r15 >= r14) goto L_0x0055
            java.lang.Object r16 = r2.get(r15)
            r4 = r16
            atzm r4 = (defpackage.atzm) r4
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r8 = r0.a
            java.util.ArrayList r8 = r8.j
            atzl r4 = r4.b
            if (r4 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            atzl r4 = defpackage.atzl.e
        L_0x0049:
            int r4 = r4.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.add(r4)
            int r15 = r15 + 1
            goto L_0x0034
        L_0x0055:
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r2 = r0.a
            adhv r4 = r2.l
            if (r4 != 0) goto L_0x0070
            jjg r2 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            anie r2 = r2.b()
            anih r2 = (defpackage.anih) r2
            r4 = 490(0x1ea, float:6.87E-43)
            anie r2 = r2.a((java.lang.String) r5, (java.lang.String) r7, (int) r4, (java.lang.String) r6)
            anih r2 = (defpackage.anih) r2
            r2.a((java.lang.String) r3)
            goto L_0x0315
        L_0x0070:
            boolean r3 = r2.n
            if (r3 != 0) goto L_0x0315
            r2.n = r12
            android.content.res.Resources r3 = r2.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.orientation
            r2.o = r3
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r2 = r0.a
            adhv r3 = r2.l
            int r4 = r2.m
            atyw r5 = r2.d
            atyx r14 = r2.e
            com.google.android.gms.udc.ConsentFlowConfig r15 = r2.c
            int r2 = r2.o
            jjg r16 = defpackage.adfa.a
            aqms r16 = defpackage.aqms.m
            aucd r8 = r16.o()
            r16 = 0
            if (r5 != 0) goto L_0x00a8
            aucj r2 = r8.i()
            r16 = r2
            aqms r16 = (defpackage.aqms) r16
            r2 = r16
            goto L_0x0312
        L_0x00a8:
            int r10 = r5.a
            r10 = r10 & 16
            if (r10 != 0) goto L_0x00b0
            goto L_0x012c
        L_0x00b0:
            atzv r10 = r5.g
            if (r10 == 0) goto L_0x00b5
            goto L_0x00b7
        L_0x00b5:
            atzv r10 = defpackage.atzv.i
        L_0x00b7:
            int r10 = r10.c
            boolean r11 = r8.c
            if (r11 != 0) goto L_0x00be
            goto L_0x00c3
        L_0x00be:
            r8.c()
            r8.c = r13
        L_0x00c3:
            aucj r11 = r8.b
            aqms r11 = (defpackage.aqms) r11
            int r12 = r11.a
            r12 = r12 | 256(0x100, float:3.59E-43)
            r11.a = r12
            r11.h = r10
            atzv r10 = r5.g
            if (r10 == 0) goto L_0x00d4
            goto L_0x00d6
        L_0x00d4:
            atzv r10 = defpackage.atzv.i
        L_0x00d6:
            int r10 = r10.a
            r10 = r10 & r9
            if (r10 == 0) goto L_0x00fd
            atzv r10 = r5.g
            if (r10 == 0) goto L_0x00e0
            goto L_0x00e2
        L_0x00e0:
            atzv r10 = defpackage.atzv.i
        L_0x00e2:
            java.lang.String r10 = r10.d
            boolean r11 = r8.c
            if (r11 != 0) goto L_0x00e9
            goto L_0x00ee
        L_0x00e9:
            r8.c()
            r8.c = r13
        L_0x00ee:
            aucj r11 = r8.b
            aqms r11 = (defpackage.aqms) r11
            r10.getClass()
            int r12 = r11.a
            r12 = r12 | 512(0x200, float:7.175E-43)
            r11.a = r12
            r11.i = r10
        L_0x00fd:
            atzv r10 = r5.g
            if (r10 == 0) goto L_0x0102
            goto L_0x0104
        L_0x0102:
            atzv r10 = defpackage.atzv.i
        L_0x0104:
            int r10 = r10.a
            r11 = 1
            r10 = r10 & r11
            if (r10 == 0) goto L_0x012c
            atzv r10 = r5.g
            if (r10 == 0) goto L_0x010f
            goto L_0x0111
        L_0x010f:
            atzv r10 = defpackage.atzv.i
        L_0x0111:
            java.lang.String r10 = r10.b
            boolean r11 = r8.c
            if (r11 != 0) goto L_0x0118
            goto L_0x011d
        L_0x0118:
            r8.c()
            r8.c = r13
        L_0x011d:
            aucj r11 = r8.b
            aqms r11 = (defpackage.aqms) r11
            r10.getClass()
            int r12 = r11.a
            r12 = r12 | 2048(0x800, float:2.87E-42)
            r11.a = r12
            r11.k = r10
        L_0x012c:
            java.lang.String r10 = r5.c
            boolean r10 = defpackage.adfa.a((java.lang.String) r10)
            boolean r11 = r8.c
            if (r11 != 0) goto L_0x0137
            goto L_0x013c
        L_0x0137:
            r8.c()
            r8.c = r13
        L_0x013c:
            aucj r11 = r8.b
            aqms r11 = (defpackage.aqms) r11
            int r12 = r11.a
            r12 = r12 | 1024(0x400, float:1.435E-42)
            r11.a = r12
            r11.j = r10
            atyv r10 = defpackage.atyv.UNKNOWN
            int r10 = r5.f
            atyv r10 = defpackage.atyv.a(r10)
            if (r10 == 0) goto L_0x0153
            goto L_0x0155
        L_0x0153:
            atyv r10 = defpackage.atyv.UNKNOWN
        L_0x0155:
            int r10 = r10.ordinal()
            r11 = 3
            r12 = 1
            if (r10 == r12) goto L_0x0209
            r12 = 2
            if (r10 == r12) goto L_0x0187
            jjg r2 = defpackage.adfa.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            r8 = 127(0x7f, float:1.78E-43)
            java.lang.String r9 = "adfa"
            anie r2 = r2.a((java.lang.String) r9, (java.lang.String) r7, (int) r8, (java.lang.String) r6)
            anih r2 = (defpackage.anih) r2
            int r5 = r5.f
            atyv r5 = defpackage.atyv.a(r5)
            if (r5 == 0) goto L_0x017b
            goto L_0x017d
        L_0x017b:
            atyv r5 = defpackage.atyv.UNKNOWN
        L_0x017d:
            java.lang.String r6 = "Invalid ViewType: %s"
            r2.a((java.lang.String) r6, (java.lang.Object) r5)
            r2 = r16
            goto L_0x0312
        L_0x0187:
            boolean r6 = r8.c
            if (r6 == 0) goto L_0x0190
            r8.c()
            r8.c = r13
        L_0x0190:
            aucj r6 = r8.b
            aqms r6 = (defpackage.aqms) r6
            r6.b = r11
            int r7 = r6.a
            r9 = 1
            r7 = r7 | r9
            r6.a = r7
            aqly r6 = defpackage.aqly.d
            aucd r6 = r6.o()
            int r7 = r5.e
            int r7 = defpackage.atzq.a(r7)
            if (r7 == 0) goto L_0x01ab
            goto L_0x01ac
        L_0x01ab:
            r7 = 1
        L_0x01ac:
            int r7 = r7 + -1
            boolean r9 = r6.c
            if (r9 != 0) goto L_0x01b3
            goto L_0x01b8
        L_0x01b3:
            r6.c()
            r6.c = r13
        L_0x01b8:
            aucj r9 = r6.b
            aqly r9 = (defpackage.aqly) r9
            int r10 = r9.a
            r11 = 2
            r10 = r10 | r11
            r9.a = r10
            r9.c = r7
            aucs r7 = r5.d
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x01e8
            aucs r5 = r5.d
            int r5 = r5.c(r13)
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x01d7
            goto L_0x01dc
        L_0x01d7:
            r6.c()
            r6.c = r13
        L_0x01dc:
            aucj r7 = r6.b
            aqly r7 = (defpackage.aqly) r7
            int r9 = r7.a
            r10 = 1
            r9 = r9 | r10
            r7.a = r9
            r7.b = r5
        L_0x01e8:
            boolean r5 = r8.c
            if (r5 != 0) goto L_0x01ed
            goto L_0x01f2
        L_0x01ed:
            r8.c()
            r8.c = r13
        L_0x01f2:
            aucj r5 = r8.b
            aqms r5 = (defpackage.aqms) r5
            aucj r6 = r6.i()
            aqly r6 = (defpackage.aqly) r6
            r6.getClass()
            r5.d = r6
            int r6 = r5.a
            r6 = r6 | 16
            r5.a = r6
            goto L_0x02ec
        L_0x0209:
            boolean r6 = r8.c
            if (r6 != 0) goto L_0x020e
            goto L_0x0213
        L_0x020e:
            r8.c()
            r8.c = r13
        L_0x0213:
            aucj r6 = r8.b
            aqms r6 = (defpackage.aqms) r6
            r7 = 4
            r6.b = r7
            int r7 = r6.a
            r10 = 1
            r7 = r7 | r10
            r6.a = r7
            aqlv r6 = defpackage.aqlv.h
            aucd r6 = r6.o()
            aqlu r6 = (defpackage.aqlu) r6
            aucs r7 = r5.d
            int r7 = r7.size()
            if (r7 == 0) goto L_0x0235
            aucs r5 = r5.d
            r6.a(r5)
        L_0x0235:
            if (r14 == 0) goto L_0x026d
            aucx r5 = r14.i
            int r5 = r5.size()
            if (r5 == 0) goto L_0x026d
            aucx r5 = r14.i
            int r5 = r5.size()
            int[] r5 = new int[r5]
            aucx r7 = r14.i
            int r10 = r7.size()
            r12 = 0
            r14 = 0
        L_0x024f:
            if (r12 >= r10) goto L_0x026a
            java.lang.Object r16 = r7.get(r12)
            r11 = r16
            atzm r11 = (defpackage.atzm) r11
            atzl r11 = r11.b
            if (r11 == 0) goto L_0x025e
            goto L_0x0260
        L_0x025e:
            atzl r11 = defpackage.atzl.e
        L_0x0260:
            int r11 = r11.b
            r5[r14] = r11
            r11 = 1
            int r14 = r14 + r11
            int r12 = r12 + 1
            r11 = 3
            goto L_0x024f
        L_0x026a:
            r16 = r5
            goto L_0x026e
        L_0x026d:
        L_0x026e:
            if (r16 == 0) goto L_0x0277
            java.util.List r5 = defpackage.aoog.b((int[]) r16)
            r6.b(r5)
        L_0x0277:
            int r5 = r15.d
            if (r5 == 0) goto L_0x029c
            r7 = 1
            if (r5 == r7) goto L_0x0299
            r7 = 2
            if (r5 == r7) goto L_0x0296
            r7 = 4
            if (r5 == r7) goto L_0x0293
            r7 = 5
            if (r5 == r7) goto L_0x0290
            r7 = 6
            if (r5 == r7) goto L_0x028d
            r17 = 1
            goto L_0x029e
        L_0x028d:
            r17 = 7
            goto L_0x029e
        L_0x0290:
            r17 = 6
            goto L_0x029e
        L_0x0293:
            r17 = 5
            goto L_0x029e
        L_0x0296:
            r17 = 3
            goto L_0x029e
        L_0x0299:
            r17 = 4
            goto L_0x029e
        L_0x029c:
            r17 = 2
        L_0x029e:
            boolean r5 = r6.c
            if (r5 != 0) goto L_0x02a3
            goto L_0x02a8
        L_0x02a3:
            r6.c()
            r6.c = r13
        L_0x02a8:
            aucj r5 = r6.b
            aqlv r5 = (defpackage.aqlv) r5
            int r7 = r17 + -1
            r5.d = r7
            int r7 = r5.a
            r10 = 1
            r7 = r7 | r10
            r5.a = r7
            boolean r10 = r15.c
            r11 = 2
            r7 = r7 | r11
            r5.a = r7
            r5.e = r10
            boolean r10 = r15.b
            r11 = 4
            r7 = r7 | r11
            r5.a = r7
            r5.f = r10
            boolean r10 = r15.a
            r7 = r7 | r9
            r5.a = r7
            r5.g = r10
            boolean r5 = r8.c
            if (r5 != 0) goto L_0x02d2
            goto L_0x02d7
        L_0x02d2:
            r8.c()
            r8.c = r13
        L_0x02d7:
            aucj r5 = r8.b
            aqms r5 = (defpackage.aqms) r5
            aucj r6 = r6.i()
            aqlv r6 = (defpackage.aqlv) r6
            r6.getClass()
            r5.e = r6
            int r6 = r5.a
            r6 = r6 | 32
            r5.a = r6
        L_0x02ec:
            int r2 = defpackage.adfa.a((int) r2)
            boolean r5 = r8.c
            if (r5 != 0) goto L_0x02f5
            goto L_0x02fa
        L_0x02f5:
            r8.c()
            r8.c = r13
        L_0x02fa:
            aucj r5 = r8.b
            aqms r5 = (defpackage.aqms) r5
            int r2 = r2 + -1
            r5.c = r2
            int r2 = r5.a
            r6 = 2
            r2 = r2 | r6
            r5.a = r2
            aucj r2 = r8.i()
            r16 = r2
            aqms r16 = (defpackage.aqms) r16
            r2 = r16
        L_0x0312:
            r3.a((int) r4, (defpackage.aqms) r2)
        L_0x0315:
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r2 = r0.a
            adgr r3 = r2.h
            java.lang.String r4 = r2.b
            com.google.android.gms.udc.ConsentFlowConfig r5 = r2.c
            atyw r2 = r2.d
            int r2 = r2.f
            atyv r2 = defpackage.atyv.a(r2)
            if (r2 == 0) goto L_0x0328
            goto L_0x032a
        L_0x0328:
            atyv r2 = defpackage.atyv.UNKNOWN
        L_0x032a:
            int r2 = r2.d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r6 = r0.a
            java.util.ArrayList r7 = r6.i
            int r6 = r6.m
            android.os.Bundle r8 = new android.os.Bundle
            r9 = 1
            r8.<init>(r9)
            java.lang.String r9 = "UdcConsentConfig"
            defpackage.adgq.a((android.os.Bundle) r8, (java.lang.String) r9, (defpackage.audx) r1)
            java.lang.String r1 = "UdcAccountName"
            r8.putString(r1, r4)
            java.lang.String r1 = "UdcConsentFlowConfig"
            r8.putParcelable(r1, r5)
            int r1 = r2.intValue()
            java.lang.String r2 = "UdcConsentViewType"
            r8.putInt(r2, r1)
            java.lang.String r1 = "UdcConsentZippyStates"
            r8.putIntegerArrayList(r1, r7)
            java.lang.String r1 = "UdcClearcutEventFlowId"
            r8.putInt(r1, r6)
            int r1 = r5.d
            r2 = 1
            if (r1 == r2) goto L_0x0381
            r2 = 2
            if (r1 == r2) goto L_0x0381
            r2 = 4
            if (r1 == r2) goto L_0x037b
            r2 = 5
            if (r1 == r2) goto L_0x037b
            r2 = 6
            if (r1 == r2) goto L_0x0375
            adgm r1 = new adgm
            r1.<init>()
            goto L_0x0386
        L_0x0375:
            adgn r1 = new adgn
            r1.<init>()
            goto L_0x0386
        L_0x037b:
            adgk r1 = new adgk
            r1.<init>()
            goto L_0x0386
        L_0x0381:
            adgj r1 = new adgj
            r1.<init>()
        L_0x0386:
            r1.setArguments(r8)
            r3.a(r1)
            return
        L_0x038d:
            com.google.android.gms.common.api.Status r1 = r1.aO()
            jjg r2 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            anie r2 = r2.b()
            anih r2 = (defpackage.anih) r2
            r4 = 515(0x203, float:7.22E-43)
            anie r2 = r2.a((java.lang.String) r5, (java.lang.String) r7, (int) r4, (java.lang.String) r6)
            anih r2 = (defpackage.anih) r2
            int r4 = r1.i
            java.lang.String r4 = defpackage.aczc.g(r4)
            java.lang.String r8 = r1.j
            java.lang.String r10 = "Error (%s) reading the config data: %s"
            r2.a((java.lang.String) r10, (java.lang.Object) r4, (java.lang.Object) r8)
            int r2 = r1.i
            r4 = 2131954314(0x7f130a8a, float:1.9545124E38)
            r8 = 7
            if (r2 == r8) goto L_0x03e2
            if (r2 == r9) goto L_0x03de
            r8 = 15
            if (r2 == r8) goto L_0x03de
            switch(r2) {
                case 4502: goto L_0x03e2;
                case 4503: goto L_0x03dc;
                case 4504: goto L_0x03d8;
                case 4505: goto L_0x03de;
                default: goto L_0x03bf;
            }
        L_0x03bf:
            jjg r2 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            anie r2 = r2.b()
            anih r2 = (defpackage.anih) r2
            r8 = 540(0x21c, float:7.57E-43)
            anie r2 = r2.a((java.lang.String) r5, (java.lang.String) r7, (int) r8, (java.lang.String) r6)
            anih r2 = (defpackage.anih) r2
            int r1 = r1.i
            java.lang.String r8 = "Unknown statuscode: %d"
            r2.a((java.lang.String) r8, (int) r1)
            r11 = 0
            goto L_0x03e6
        L_0x03d8:
            r4 = 2131954310(0x7f130a86, float:1.9545116E38)
            goto L_0x03e5
        L_0x03dc:
            r11 = 0
            goto L_0x03e6
        L_0x03de:
            r4 = 2131954318(0x7f130a8e, float:1.9545132E38)
            goto L_0x03e5
        L_0x03e2:
            r4 = 2131954315(0x7f130a8b, float:1.9545126E38)
        L_0x03e5:
            r11 = 1
        L_0x03e6:
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r1 = r0.a
            adhv r2 = r1.l
            if (r2 != 0) goto L_0x0401
            jjg r1 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            anie r1 = r1.b()
            anih r1 = (defpackage.anih) r1
            r2 = 546(0x222, float:7.65E-43)
            anie r1 = r1.a((java.lang.String) r5, (java.lang.String) r7, (int) r2, (java.lang.String) r6)
            anih r1 = (defpackage.anih) r1
            r1.a((java.lang.String) r3)
            goto L_0x0599
        L_0x0401:
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.orientation
            r1.o = r2
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r1 = r0.a
            adhv r2 = r1.l
            int r3 = r1.m
            atyw r5 = r1.d
            int r1 = r1.o
            jjg r6 = defpackage.adfa.a
            aqms r6 = defpackage.aqms.m
            aucd r6 = r6.o()
            if (r5 != 0) goto L_0x0429
            aucj r1 = r6.i()
            aqms r1 = (defpackage.aqms) r1
            goto L_0x0596
        L_0x0429:
            int r7 = r5.a
            r7 = r7 & 16
            if (r7 != 0) goto L_0x0431
            goto L_0x04ad
        L_0x0431:
            atzv r7 = r5.g
            if (r7 == 0) goto L_0x0436
            goto L_0x0438
        L_0x0436:
            atzv r7 = defpackage.atzv.i
        L_0x0438:
            int r7 = r7.c
            boolean r8 = r6.c
            if (r8 != 0) goto L_0x043f
            goto L_0x0444
        L_0x043f:
            r6.c()
            r6.c = r13
        L_0x0444:
            aucj r8 = r6.b
            aqms r8 = (defpackage.aqms) r8
            int r10 = r8.a
            r10 = r10 | 256(0x100, float:3.59E-43)
            r8.a = r10
            r8.h = r7
            atzv r7 = r5.g
            if (r7 == 0) goto L_0x0455
            goto L_0x0457
        L_0x0455:
            atzv r7 = defpackage.atzv.i
        L_0x0457:
            int r7 = r7.a
            r7 = r7 & r9
            if (r7 == 0) goto L_0x047e
            atzv r7 = r5.g
            if (r7 == 0) goto L_0x0461
            goto L_0x0463
        L_0x0461:
            atzv r7 = defpackage.atzv.i
        L_0x0463:
            java.lang.String r7 = r7.d
            boolean r8 = r6.c
            if (r8 != 0) goto L_0x046a
            goto L_0x046f
        L_0x046a:
            r6.c()
            r6.c = r13
        L_0x046f:
            aucj r8 = r6.b
            aqms r8 = (defpackage.aqms) r8
            r7.getClass()
            int r9 = r8.a
            r9 = r9 | 512(0x200, float:7.175E-43)
            r8.a = r9
            r8.i = r7
        L_0x047e:
            atzv r7 = r5.g
            if (r7 == 0) goto L_0x0483
            goto L_0x0485
        L_0x0483:
            atzv r7 = defpackage.atzv.i
        L_0x0485:
            int r7 = r7.a
            r8 = 1
            r7 = r7 & r8
            if (r7 == 0) goto L_0x04ad
            atzv r7 = r5.g
            if (r7 == 0) goto L_0x0490
            goto L_0x0492
        L_0x0490:
            atzv r7 = defpackage.atzv.i
        L_0x0492:
            java.lang.String r7 = r7.b
            boolean r8 = r6.c
            if (r8 != 0) goto L_0x0499
            goto L_0x049e
        L_0x0499:
            r6.c()
            r6.c = r13
        L_0x049e:
            aucj r8 = r6.b
            aqms r8 = (defpackage.aqms) r8
            r7.getClass()
            int r9 = r8.a
            r9 = r9 | 2048(0x800, float:2.87E-42)
            r8.a = r9
            r8.k = r7
        L_0x04ad:
            java.lang.String r7 = r5.c
            boolean r7 = defpackage.adfa.a((java.lang.String) r7)
            boolean r8 = r6.c
            if (r8 == 0) goto L_0x04bc
            r6.c()
            r6.c = r13
        L_0x04bc:
            aucj r8 = r6.b
            aqms r8 = (defpackage.aqms) r8
            int r9 = r8.a
            r9 = r9 | 1024(0x400, float:1.435E-42)
            r8.a = r9
            r8.j = r7
            r7 = 5
            r8.b = r7
            r7 = 1
            r9 = r9 | r7
            r8.a = r9
            int r1 = defpackage.adfa.a((int) r1)
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x04d8
            goto L_0x04dd
        L_0x04d8:
            r6.c()
            r6.c = r13
        L_0x04dd:
            aucj r7 = r6.b
            aqms r7 = (defpackage.aqms) r7
            int r1 = r1 + -1
            r7.c = r1
            int r1 = r7.a
            r8 = 2
            r1 = r1 | r8
            r7.a = r1
            aqlx r1 = defpackage.aqlx.f
            aucd r1 = r1.o()
            aqlw r1 = (defpackage.aqlw) r1
            aucs r7 = r5.d
            int r7 = r7.size()
            if (r7 != 0) goto L_0x04fc
            goto L_0x0501
        L_0x04fc:
            aucs r7 = r5.d
            r1.a(r7)
        L_0x0501:
            int r7 = r5.f
            atyv r7 = defpackage.atyv.a(r7)
            if (r7 == 0) goto L_0x050a
            goto L_0x050c
        L_0x050a:
            atyv r7 = defpackage.atyv.UNKNOWN
        L_0x050c:
            int r7 = r7.d
            boolean r8 = r1.c
            if (r8 != 0) goto L_0x0513
            goto L_0x0518
        L_0x0513:
            r1.c()
            r1.c = r13
        L_0x0518:
            aucj r8 = r1.b
            aqlx r8 = (defpackage.aqlx) r8
            int r9 = r8.a
            r10 = 1
            r9 = r9 | r10
            r8.a = r9
            r8.c = r7
            int r7 = defpackage.adfa.b(r4)
            boolean r8 = r1.c
            if (r8 != 0) goto L_0x052d
            goto L_0x0532
        L_0x052d:
            r1.c()
            r1.c = r13
        L_0x0532:
            aucj r8 = r1.b
            aqlx r8 = (defpackage.aqlx) r8
            int r7 = r7 + -1
            r8.e = r7
            int r7 = r8.a
            r9 = 4
            r7 = r7 | r9
            r8.a = r7
            int r7 = r5.f
            atyv r7 = defpackage.atyv.a(r7)
            if (r7 != 0) goto L_0x054a
            atyv r7 = defpackage.atyv.UNKNOWN
        L_0x054a:
            atyv r8 = defpackage.atyv.PROMPT
            if (r7 != r8) goto L_0x0571
            int r5 = r5.e
            int r5 = defpackage.atzq.a(r5)
            if (r5 == 0) goto L_0x0558
            r12 = r5
            goto L_0x0559
        L_0x0558:
            r12 = 1
        L_0x0559:
            int r12 = r12 + -1
            boolean r5 = r1.c
            if (r5 != 0) goto L_0x0560
            goto L_0x0565
        L_0x0560:
            r1.c()
            r1.c = r13
        L_0x0565:
            aucj r5 = r1.b
            aqlx r5 = (defpackage.aqlx) r5
            int r7 = r5.a
            r8 = 2
            r7 = r7 | r8
            r5.a = r7
            r5.d = r12
        L_0x0571:
            boolean r5 = r6.c
            if (r5 != 0) goto L_0x0576
            goto L_0x057b
        L_0x0576:
            r6.c()
            r6.c = r13
        L_0x057b:
            aucj r5 = r6.b
            aqms r5 = (defpackage.aqms) r5
            aucj r1 = r1.i()
            aqlx r1 = (defpackage.aqlx) r1
            r1.getClass()
            r5.f = r1
            int r1 = r5.a
            r1 = r1 | 64
            r5.a = r1
            aucj r1 = r6.i()
            aqms r1 = (defpackage.aqms) r1
        L_0x0596:
            r2.a((int) r3, (defpackage.aqms) r1)
        L_0x0599:
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r1 = r0.a
            adgr r1 = r1.h
            adft r2 = new adft
            r2.<init>()
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r3 = r0.a
            r5 = 2131954312(0x7f130a88, float:1.954512E38)
            java.lang.String r3 = r3.getString(r5)
            android.os.Bundle r5 = r2.a
            java.lang.String r6 = "UdcDialogTitle"
            r5.putCharSequence(r6, r3)
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r3 = r0.a
            java.lang.String r3 = r3.getString(r4)
            r2.a(r3)
            android.os.Bundle r3 = r2.a
            java.lang.String r4 = "UdcDialogShowRetry"
            r3.putBoolean(r4, r11)
            adfz r2 = r2.b()
            r1.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adgc.onLoadFinished(com.google.android.chimera.Loader, java.lang.Object):void");
    }

    public final void onLoaderReset(Loader loader) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.google.android.gms.common.api.Status r13) {
        /*
            r12 = this;
            jjg r0 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "adgc"
            java.lang.String r2 = "a"
            r3 = 515(0x203, float:7.22E-43)
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r0.a((java.lang.String) r1, (java.lang.String) r2, (int) r3, (java.lang.String) r4)
            anih r0 = (defpackage.anih) r0
            int r3 = r13.i
            java.lang.String r3 = defpackage.aczc.g(r3)
            java.lang.String r5 = r13.j
            java.lang.String r6 = "Error (%s) reading the config data: %s"
            r0.a((java.lang.String) r6, (java.lang.Object) r3, (java.lang.Object) r5)
            int r0 = r13.i
            r3 = 7
            r5 = 2131954314(0x7f130a8a, float:1.9545124E38)
            r6 = 8
            r7 = 1
            r8 = 0
            if (r0 == r3) goto L_0x005b
            if (r0 == r6) goto L_0x0057
            r3 = 15
            if (r0 == r3) goto L_0x0057
            switch(r0) {
                case 4502: goto L_0x005b;
                case 4503: goto L_0x0055;
                case 4504: goto L_0x0051;
                case 4505: goto L_0x0057;
                default: goto L_0x0038;
            }
        L_0x0038:
            jjg r0 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r3 = 540(0x21c, float:7.57E-43)
            anie r0 = r0.a((java.lang.String) r1, (java.lang.String) r2, (int) r3, (java.lang.String) r4)
            anih r0 = (defpackage.anih) r0
            int r13 = r13.i
            java.lang.String r3 = "Unknown statuscode: %d"
            r0.a((java.lang.String) r3, (int) r13)
            r13 = 0
            goto L_0x005f
        L_0x0051:
            r5 = 2131954310(0x7f130a86, float:1.9545116E38)
            goto L_0x005e
        L_0x0055:
            r13 = 0
            goto L_0x005f
        L_0x0057:
            r5 = 2131954318(0x7f130a8e, float:1.9545132E38)
            goto L_0x005e
        L_0x005b:
            r5 = 2131954315(0x7f130a8b, float:1.9545126E38)
        L_0x005e:
            r13 = 1
        L_0x005f:
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r0 = r12.a
            adhv r3 = r0.l
            if (r3 != 0) goto L_0x007c
            jjg r0 = com.google.android.gms.udc.ui.UdcConsentChimeraActivity.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r3 = 546(0x222, float:7.65E-43)
            anie r0 = r0.a((java.lang.String) r1, (java.lang.String) r2, (int) r3, (java.lang.String) r4)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "UdcClearcutLogger is null."
            r0.a((java.lang.String) r1)
            goto L_0x0212
        L_0x007c:
            android.content.res.Resources r1 = r0.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r0.o = r1
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r0 = r12.a
            adhv r1 = r0.l
            int r2 = r0.m
            atyw r3 = r0.d
            int r0 = r0.o
            jjg r4 = defpackage.adfa.a
            aqms r4 = defpackage.aqms.m
            aucd r4 = r4.o()
            if (r3 != 0) goto L_0x00a4
            aucj r0 = r4.i()
            aqms r0 = (defpackage.aqms) r0
            goto L_0x020f
        L_0x00a4:
            int r9 = r3.a
            r9 = r9 & 16
            if (r9 != 0) goto L_0x00ac
            goto L_0x0127
        L_0x00ac:
            atzv r9 = r3.g
            if (r9 == 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            atzv r9 = defpackage.atzv.i
        L_0x00b3:
            int r9 = r9.c
            boolean r10 = r4.c
            if (r10 != 0) goto L_0x00ba
            goto L_0x00bf
        L_0x00ba:
            r4.c()
            r4.c = r8
        L_0x00bf:
            aucj r10 = r4.b
            aqms r10 = (defpackage.aqms) r10
            int r11 = r10.a
            r11 = r11 | 256(0x100, float:3.59E-43)
            r10.a = r11
            r10.h = r9
            atzv r9 = r3.g
            if (r9 == 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            atzv r9 = defpackage.atzv.i
        L_0x00d2:
            int r9 = r9.a
            r6 = r6 & r9
            if (r6 == 0) goto L_0x00f9
            atzv r6 = r3.g
            if (r6 == 0) goto L_0x00dc
            goto L_0x00de
        L_0x00dc:
            atzv r6 = defpackage.atzv.i
        L_0x00de:
            java.lang.String r6 = r6.d
            boolean r9 = r4.c
            if (r9 != 0) goto L_0x00e5
            goto L_0x00ea
        L_0x00e5:
            r4.c()
            r4.c = r8
        L_0x00ea:
            aucj r9 = r4.b
            aqms r9 = (defpackage.aqms) r9
            r6.getClass()
            int r10 = r9.a
            r10 = r10 | 512(0x200, float:7.175E-43)
            r9.a = r10
            r9.i = r6
        L_0x00f9:
            atzv r6 = r3.g
            if (r6 == 0) goto L_0x00fe
            goto L_0x0100
        L_0x00fe:
            atzv r6 = defpackage.atzv.i
        L_0x0100:
            int r6 = r6.a
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0127
            atzv r6 = r3.g
            if (r6 == 0) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            atzv r6 = defpackage.atzv.i
        L_0x010c:
            java.lang.String r6 = r6.b
            boolean r9 = r4.c
            if (r9 != 0) goto L_0x0113
            goto L_0x0118
        L_0x0113:
            r4.c()
            r4.c = r8
        L_0x0118:
            aucj r9 = r4.b
            aqms r9 = (defpackage.aqms) r9
            r6.getClass()
            int r10 = r9.a
            r10 = r10 | 2048(0x800, float:2.87E-42)
            r9.a = r10
            r9.k = r6
        L_0x0127:
            java.lang.String r6 = r3.c
            boolean r6 = defpackage.adfa.a((java.lang.String) r6)
            boolean r9 = r4.c
            if (r9 == 0) goto L_0x0136
            r4.c()
            r4.c = r8
        L_0x0136:
            aucj r9 = r4.b
            aqms r9 = (defpackage.aqms) r9
            int r10 = r9.a
            r10 = r10 | 1024(0x400, float:1.435E-42)
            r9.a = r10
            r9.j = r6
            r6 = 5
            r9.b = r6
            r6 = r10 | 1
            r9.a = r6
            int r0 = defpackage.adfa.a((int) r0)
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x0152
            goto L_0x0157
        L_0x0152:
            r4.c()
            r4.c = r8
        L_0x0157:
            aucj r6 = r4.b
            aqms r6 = (defpackage.aqms) r6
            int r0 = r0 + -1
            r6.c = r0
            int r0 = r6.a
            r0 = r0 | 2
            r6.a = r0
            aqlx r0 = defpackage.aqlx.f
            aucd r0 = r0.o()
            aqlw r0 = (defpackage.aqlw) r0
            aucs r6 = r3.d
            int r6 = r6.size()
            if (r6 != 0) goto L_0x0176
            goto L_0x017b
        L_0x0176:
            aucs r6 = r3.d
            r0.a(r6)
        L_0x017b:
            int r6 = r3.f
            atyv r6 = defpackage.atyv.a(r6)
            if (r6 == 0) goto L_0x0184
            goto L_0x0186
        L_0x0184:
            atyv r6 = defpackage.atyv.UNKNOWN
        L_0x0186:
            int r6 = r6.d
            boolean r9 = r0.c
            if (r9 != 0) goto L_0x018d
            goto L_0x0192
        L_0x018d:
            r0.c()
            r0.c = r8
        L_0x0192:
            aucj r9 = r0.b
            aqlx r9 = (defpackage.aqlx) r9
            int r10 = r9.a
            r10 = r10 | r7
            r9.a = r10
            r9.c = r6
            int r6 = defpackage.adfa.b(r5)
            boolean r9 = r0.c
            if (r9 != 0) goto L_0x01a6
            goto L_0x01ab
        L_0x01a6:
            r0.c()
            r0.c = r8
        L_0x01ab:
            aucj r9 = r0.b
            aqlx r9 = (defpackage.aqlx) r9
            int r6 = r6 + -1
            r9.e = r6
            int r6 = r9.a
            r6 = r6 | 4
            r9.a = r6
            int r6 = r3.f
            atyv r6 = defpackage.atyv.a(r6)
            if (r6 != 0) goto L_0x01c3
            atyv r6 = defpackage.atyv.UNKNOWN
        L_0x01c3:
            atyv r9 = defpackage.atyv.PROMPT
            if (r6 != r9) goto L_0x01ea
            int r3 = r3.e
            int r3 = defpackage.atzq.a(r3)
            if (r3 == 0) goto L_0x01d1
            r7 = r3
            goto L_0x01d2
        L_0x01d1:
        L_0x01d2:
            int r7 = r7 + -1
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x01d9
            goto L_0x01de
        L_0x01d9:
            r0.c()
            r0.c = r8
        L_0x01de:
            aucj r3 = r0.b
            aqlx r3 = (defpackage.aqlx) r3
            int r6 = r3.a
            r6 = r6 | 2
            r3.a = r6
            r3.d = r7
        L_0x01ea:
            boolean r3 = r4.c
            if (r3 != 0) goto L_0x01ef
            goto L_0x01f4
        L_0x01ef:
            r4.c()
            r4.c = r8
        L_0x01f4:
            aucj r3 = r4.b
            aqms r3 = (defpackage.aqms) r3
            aucj r0 = r0.i()
            aqlx r0 = (defpackage.aqlx) r0
            r0.getClass()
            r3.f = r0
            int r0 = r3.a
            r0 = r0 | 64
            r3.a = r0
            aucj r0 = r4.i()
            aqms r0 = (defpackage.aqms) r0
        L_0x020f:
            r1.a((int) r2, (defpackage.aqms) r0)
        L_0x0212:
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r0 = r12.a
            adgr r0 = r0.h
            adft r1 = new adft
            r1.<init>()
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r2 = r12.a
            r3 = 2131954312(0x7f130a88, float:1.954512E38)
            java.lang.String r2 = r2.getString(r3)
            android.os.Bundle r3 = r1.a
            java.lang.String r4 = "UdcDialogTitle"
            r3.putCharSequence(r4, r2)
            com.google.android.gms.udc.ui.UdcConsentChimeraActivity r2 = r12.a
            java.lang.String r2 = r2.getString(r5)
            r1.a(r2)
            android.os.Bundle r2 = r1.a
            java.lang.String r3 = "UdcDialogShowRetry"
            r2.putBoolean(r3, r13)
            adfz r13 = r1.b()
            r0.a(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adgc.a(com.google.android.gms.common.api.Status):void");
    }
}
