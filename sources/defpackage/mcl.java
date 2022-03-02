package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.measurement.module.Analytics;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;

/* renamed from: mcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mcl extends nis {
    private final String a;
    private final ClientContext b;
    private final mcg c;
    private final int d;
    private Analytics e = null;
    private mcc f = null;
    private final apwj g;

    private static Bundle a(mck mck, Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        a("dynamic_link_link_id", mck.o, bundle2);
        a("dynamic_link_link_name", mck.p, bundle2);
        bundle2.putLong("dynamic_link_accept_time", mck.g);
        return bundle2;
    }

    public mcl(apwj apwj, String str, ClientContext clientContext, mcg mcg, int i) {
        super(131, "GetDynamicLink");
        this.g = apwj;
        this.a = str;
        this.b = clientContext;
        this.c = mcg;
        this.d = i;
    }

    private static void a(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0565  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x057b  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x05a7  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x05fc  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x076b  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x076e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0359  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r27) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            java.lang.String r3 = "AppInviteAgent"
            mcc r0 = r1.f
            if (r0 == 0) goto L_0x000b
            goto L_0x0014
        L_0x000b:
            mcc r0 = new mcc
            android.content.Context r4 = r27.getApplicationContext()
            r0.<init>(r4)
        L_0x0014:
            r1.f = r0
            com.google.android.gms.common.internal.ClientContext r0 = r1.b
            java.lang.String r4 = r0.e
            ivk r0 = defpackage.mch.a(r2, r4)
            java.lang.String r5 = "Existence Indicator"
            boolean r6 = r0.contains(r5)
            java.lang.String r7 = ""
            r9 = 4
            r11 = 1
            r12 = 0
            r13 = 0
            if (r6 == 0) goto L_0x0106
            java.lang.String r0 = r0.getString(r5, r12)
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0038
            goto L_0x0106
        L_0x0038:
            mck r0 = new mck
            r0.<init>()
            java.lang.String r3 = "appCode"
            java.lang.String r3 = defpackage.mch.a(r3, r2, r4)
            r0.d = r3
            java.lang.String r3 = "domainUriPrefix"
            java.lang.String r3 = defpackage.mch.a(r3, r2, r4)
            r0.e = r3
            java.lang.String r3 = "sessionId"
            java.lang.String r3 = defpackage.mch.a(r3, r2, r4)
            r0.f = r3
            java.lang.String r3 = "deepLink"
            java.lang.String r3 = defpackage.mch.a(r3, r2, r4)
            r0.b = r3
            ivk r3 = defpackage.mch.a(r2, r4)
            r5 = 0
            java.lang.String r14 = "creationTimestamp"
            long r5 = r3.getLong(r14, r5)
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            long r5 = r3.longValue()
            r0.g = r5
            java.lang.String r3 = "minVersionCode"
            int r3 = defpackage.mch.b(r3, r2, r4)
            r0.a = r3
            java.lang.String r3 = "requestedLink"
            java.lang.String r3 = defpackage.mch.a(r3, r2, r4)
            r0.q = r3
            java.lang.String r3 = "scionInstallEvent"
            boolean r3 = defpackage.mch.a(r3, r11, r2, r4)
            r0.r = r3
            java.lang.String r3 = "isNewInstall"
            boolean r3 = defpackage.mch.a(r3, r13, r2, r4)
            r0.i = r3
            java.lang.String r3 = "isUpgradeInstall"
            boolean r3 = defpackage.mch.a(r3, r13, r2, r4)
            r0.h = r3
            java.lang.String r3 = "scionCampaign"
            java.lang.String r3 = defpackage.mch.a(r3, r2, r4)
            r0.l = r3
            boolean r3 = defpackage.awhs.e()
            if (r3 == 0) goto L_0x00b9
            java.lang.String r3 = "scionContent"
            java.lang.String r3 = defpackage.mch.a(r3, r2, r4)
            r0.n = r3
            java.lang.String r3 = "scionTerm"
            java.lang.String r3 = defpackage.mch.a(r3, r2, r4)
            r0.m = r3
        L_0x00b9:
            java.lang.String r3 = "scionSource"
            java.lang.String r3 = defpackage.mch.a(r3, r2, r4)
            r0.j = r3
            java.lang.String r3 = "scionMedium"
            java.lang.String r3 = defpackage.mch.a(r3, r2, r4)
            r0.k = r3
            java.lang.String r3 = "scionLinkId"
            java.lang.String r3 = defpackage.mch.a(r3, r2, r4)
            r0.o = r3
            java.lang.String r3 = "scionLinkName"
            java.lang.String r3 = defpackage.mch.a(r3, r2, r4)
            r0.p = r3
            java.lang.String r3 = "invitationChannel"
            int r3 = defpackage.mch.b(r3, r2, r4)
            int r3 = defpackage.anrq.a(r3)
            if (r3 == 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r3 = 1
        L_0x00e8:
            r0.t = r3
            java.lang.String r3 = "requestedLinkType"
            int r3 = defpackage.mch.b(r3, r2, r4)
            int r3 = defpackage.avgz.a(r3)
            r0.u = r3
            java.lang.String r3 = "invitationId"
            java.lang.String r3 = defpackage.mch.a(r3, r2, r4)
            r0.s = r3
            java.lang.String r3 = "hasReturnedInvitation"
            defpackage.mch.c(r3, r2, r4)
            r10 = 3
            goto L_0x049a
        L_0x0106:
            java.lang.String r0 = r1.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0496
            java.lang.String r0 = r1.a
            android.net.Uri r0 = android.net.Uri.parse(r0)
            axfi r5 = defpackage.axfi.a
            axfj r5 = r5.a()
            boolean r5 = r5.b()
            if (r5 == 0) goto L_0x013d
            java.lang.String r5 = r0.getScheme()
            java.lang.String r6 = "http"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x013d
            java.lang.String r0 = r0.getScheme()
            java.lang.String r5 = "https"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0139
            goto L_0x013d
        L_0x0139:
            r0 = r12
            r10 = 3
            goto L_0x0498
        L_0x013d:
            mck r5 = new mck
            r5.<init>()
            mcg r0 = r1.c
            com.google.android.gms.common.internal.ClientContext r6 = r1.b
            java.lang.String r14 = r1.a
            mcf r15 = r0.a
            java.lang.String r0 = r6.e
            avez r16 = defpackage.avez.e
            aucd r12 = r16.o()
            android.content.Context r8 = r15.a     // Catch:{ NameNotFoundException -> 0x01c9 }
            byte[] r8 = defpackage.jhg.f(r8, r0)     // Catch:{ NameNotFoundException -> 0x01c9 }
            if (r8 == 0) goto L_0x01c7
            avfe r17 = defpackage.avfe.g
            aucd r11 = r17.o()
            boolean r10 = r11.c
            if (r10 != 0) goto L_0x0165
            goto L_0x016a
        L_0x0165:
            r11.c()
            r11.c = r13
        L_0x016a:
            aucj r10 = r11.b
            avfe r10 = (defpackage.avfe) r10
            r0.getClass()
            int r13 = r10.a
            r13 = r13 | r9
            r10.a = r13
            r10.d = r0
            r10 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r8, r10)
            boolean r8 = r11.c
            if (r8 != 0) goto L_0x0182
            goto L_0x0188
        L_0x0182:
            r11.c()
            r8 = 0
            r11.c = r8
        L_0x0188:
            aucj r8 = r11.b
            avfe r8 = (defpackage.avfe) r8
            r0.getClass()
            int r10 = r8.a
            r10 = r10 | 8
            r8.a = r10
            r8.e = r0
            r13 = 1
            r8.b = r13
            r0 = r10 | 1
            r8.a = r0
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            boolean r8 = r11.c
            if (r8 != 0) goto L_0x01ab
            goto L_0x01b1
        L_0x01ab:
            r11.c()
            r8 = 0
            r11.c = r8
        L_0x01b1:
            aucj r8 = r11.b
            avfe r8 = (defpackage.avfe) r8
            r0.getClass()
            int r10 = r8.a
            r10 = r10 | 32
            r8.a = r10
            r8.f = r0
            aucj r0 = r11.i()
            avfe r0 = (defpackage.avfe) r0
            goto L_0x01d0
        L_0x01c7:
            r0 = 0
            goto L_0x01d0
        L_0x01c9:
            r0 = move-exception
            java.lang.String r8 = "Caller Package Name not found"
            android.util.Log.e(r3, r8, r0)
            r0 = 0
        L_0x01d0:
            if (r0 != 0) goto L_0x01da
            java.lang.String r0 = "Error creating ClientIdInfo"
            android.util.Log.e(r3, r0)
            r0 = 0
            goto L_0x0357
        L_0x01da:
            boolean r8 = r12.c
            if (r8 != 0) goto L_0x01df
            goto L_0x01e5
        L_0x01df:
            r12.c()
            r8 = 0
            r12.c = r8
        L_0x01e5:
            aucj r8 = r12.b
            avez r8 = (defpackage.avez) r8
            r0.getClass()
            r8.b = r0
            int r0 = r8.a
            r10 = 1
            r0 = r0 | r10
            r8.a = r0
            avge r0 = defpackage.avge.d
            aucd r0 = r0.o()
            if (r14 != 0) goto L_0x01fe
            r14 = r7
            goto L_0x01ff
        L_0x01fe:
        L_0x01ff:
            boolean r8 = r0.c
            if (r8 != 0) goto L_0x0204
            goto L_0x020a
        L_0x0204:
            r0.c()
            r8 = 0
            r0.c = r8
        L_0x020a:
            aucj r8 = r0.b
            avge r8 = (defpackage.avge) r8
            r14.getClass()
            int r10 = r8.a
            r11 = 2
            r10 = r10 | r11
            r8.a = r10
            r8.c = r14
            r7.getClass()
            r11 = 1
            r10 = r10 | r11
            r8.a = r10
            r8.b = r7
            aucj r0 = r0.i()
            avge r0 = (defpackage.avge) r0
            boolean r8 = r12.c
            if (r8 != 0) goto L_0x022d
            goto L_0x0233
        L_0x022d:
            r12.c()
            r8 = 0
            r12.c = r8
        L_0x0233:
            aucj r8 = r12.b
            avez r8 = (defpackage.avez) r8
            r0.getClass()
            r8.c = r0
            int r0 = r8.a
            r0 = r0 | r9
            r8.a = r0
            avfc r0 = defpackage.avfc.c
            aucd r0 = r0.o()
            hxj r8 = defpackage.hxj.a
            android.content.Context r8 = r15.a
            int r8 = defpackage.hxz.j(r8)
            boolean r10 = r0.c
            if (r10 != 0) goto L_0x0254
            goto L_0x025a
        L_0x0254:
            r0.c()
            r10 = 0
            r0.c = r10
        L_0x025a:
            aucj r10 = r0.b
            avfc r10 = (defpackage.avfc) r10
            int r11 = r10.a
            r13 = 1
            r11 = r11 | r13
            r10.a = r11
            r10.b = r8
            aucj r0 = r0.i()
            avfc r0 = (defpackage.avfc) r0
            avgt r8 = defpackage.avgt.c
            aucd r8 = r8.o()
            boolean r10 = r8.c
            if (r10 != 0) goto L_0x0277
            goto L_0x027d
        L_0x0277:
            r8.c()
            r10 = 0
            r8.c = r10
        L_0x027d:
            aucj r10 = r8.b
            avgt r10 = (defpackage.avgt) r10
            r0.getClass()
            r10.b = r0
            int r0 = r10.a
            r11 = 1
            r0 = r0 | r11
            r10.a = r0
            aucj r0 = r8.i()
            avgt r0 = (defpackage.avgt) r0
            boolean r8 = r12.c
            if (r8 != 0) goto L_0x0297
            goto L_0x029d
        L_0x0297:
            r12.c()
            r8 = 0
            r12.c = r8
        L_0x029d:
            aucj r8 = r12.b
            avez r8 = (defpackage.avez) r8
            r0.getClass()
            r8.d = r0
            int r0 = r8.a
            r0 = r0 | 8
            r8.a = r0
            mce r8 = new mce
            mcd r0 = r15.b
            auci r10 = defpackage.avez.f
            aucj r11 = r12.i()
            avez r11 = (defpackage.avez) r11
            r8.<init>(r0, r6, r10, r11)
            mcd r0 = r8.a     // Catch:{ eif -> 0x0348, VolleyError -> 0x0324 }
            com.google.android.gms.common.internal.ClientContext r6 = r8.b     // Catch:{ eif -> 0x0348, VolleyError -> 0x0324 }
            ameb r10 = r8.c     // Catch:{ eif -> 0x0348, VolleyError -> 0x0324 }
            java.lang.String r6 = r6.f     // Catch:{ eif -> 0x0348, VolleyError -> 0x0324 }
            iyn r11 = r0.a     // Catch:{ eif -> 0x0348, VolleyError -> 0x0324 }
            android.content.Context r11 = r11.i     // Catch:{ eif -> 0x0348, VolleyError -> 0x0324 }
            java.lang.String r23 = defpackage.jhg.h(r11, r6)     // Catch:{ eif -> 0x0348, VolleyError -> 0x0324 }
            iyn r0 = r0.a     // Catch:{ eif -> 0x0348, VolleyError -> 0x0324 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ eif -> 0x0348, VolleyError -> 0x0324 }
            r11.<init>()     // Catch:{ eif -> 0x0348, VolleyError -> 0x0324 }
            java.lang.String r12 = "/mutateonekey?alt=proto"
            r11.append(r12)     // Catch:{ eif -> 0x0348, VolleyError -> 0x0324 }
            java.lang.String r19 = r11.toString()     // Catch:{ eif -> 0x0348, VolleyError -> 0x0324 }
            byte[] r20 = r10.k()     // Catch:{ eif -> 0x0348, VolleyError -> 0x0324 }
            amea r21 = defpackage.amea.d     // Catch:{ eif -> 0x0348, VolleyError -> 0x0324 }
            r18 = r0
            r22 = r6
            java.lang.Object r0 = r18.a((java.lang.String) r19, (byte[]) r20, (java.lang.Object) r21, (java.lang.String) r22, (java.lang.String) r23)     // Catch:{ eif -> 0x0348, VolleyError -> 0x0324 }
            amea r0 = (defpackage.amea) r0     // Catch:{ eif -> 0x0348, VolleyError -> 0x0324 }
            r8.d = r0     // Catch:{ eif -> 0x0348, VolleyError -> 0x0324 }
            auci r0 = defpackage.avfa.g
            audx r0 = r8.a(r0)
            avfa r0 = (defpackage.avfa) r0
            amea r6 = r8.d
            if (r6 == 0) goto L_0x0320
            int r8 = r6.a
            r10 = 2
            r8 = r8 & r10
            if (r8 == 0) goto L_0x0320
            atip r0 = r6.c
            if (r0 == 0) goto L_0x0304
            goto L_0x0306
        L_0x0304:
            atip r0 = defpackage.atip.c
        L_0x0306:
            int r0 = r0.a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 55
            r6.<init>(r8)
            java.lang.String r8 = "Accept invitation failed due to error code: "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.e(r3, r0)
            r0 = 0
            goto L_0x0357
        L_0x0320:
            goto L_0x0357
        L_0x0321:
            r0 = move-exception
            goto L_0x048d
        L_0x0324:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0321 }
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0321 }
            int r6 = r6.length()     // Catch:{ all -> 0x0321 }
            int r6 = r6 + 32
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0321 }
            r10.<init>(r6)     // Catch:{ all -> 0x0321 }
            java.lang.String r6 = "Error communicating with server "
            r10.append(r6)     // Catch:{ all -> 0x0321 }
            r10.append(r0)     // Catch:{ all -> 0x0321 }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x0321 }
            android.util.Log.e(r3, r0)     // Catch:{ all -> 0x0321 }
            goto L_0x034e
        L_0x0348:
            r0 = move-exception
            java.lang.String r6 = "Authentication Failed "
            android.util.Log.e(r3, r6, r0)     // Catch:{ all -> 0x0321 }
        L_0x034e:
            auci r0 = defpackage.avfa.g
            audx r0 = r8.a(r0)
            avfa r0 = (defpackage.avfa) r0
            r0 = 0
        L_0x0357:
            if (r0 == 0) goto L_0x048a
            avgk r3 = r0.b
            if (r3 == 0) goto L_0x035e
            goto L_0x0360
        L_0x035e:
            avgk r3 = defpackage.avgk.g
        L_0x0360:
            int r3 = r3.a
            r3 = r3 & 8
            if (r3 == 0) goto L_0x0487
            avgk r3 = r0.b
            if (r3 == 0) goto L_0x036b
            goto L_0x036d
        L_0x036b:
            avgk r3 = defpackage.avgk.g
        L_0x036d:
            avfb r6 = r3.e
            if (r6 == 0) goto L_0x0372
            goto L_0x0374
        L_0x0372:
            avfb r6 = defpackage.avfb.d
        L_0x0374:
            int r8 = r6.a
            r10 = 2
            r8 = r8 & r10
            if (r8 != 0) goto L_0x037b
            goto L_0x037f
        L_0x037b:
            int r6 = r6.c
            r5.a = r6
        L_0x037f:
            java.lang.String r6 = r3.c
            r5.b = r6
            int r6 = r3.a
            r8 = 1
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0391
            java.lang.String r6 = r3.b
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r5.c = r6
        L_0x0391:
            avfo r6 = r0.d
            if (r6 == 0) goto L_0x0396
            goto L_0x0398
        L_0x0396:
            avfo r6 = defpackage.avfo.l
        L_0x0398:
            int r8 = r0.a
            r8 = r8 & r9
            if (r8 == 0) goto L_0x03fd
            int r8 = r6.a
            r8 = r8 & 32
            if (r8 == 0) goto L_0x03fd
            java.lang.String r8 = r6.f
            r5.d = r8
            java.lang.String r8 = r6.i
            r5.e = r8
            java.lang.String r8 = r6.h
            r5.f = r8
            avha r8 = r6.g
            if (r8 == 0) goto L_0x03b4
            goto L_0x03b6
        L_0x03b4:
            avha r8 = defpackage.avha.d
        L_0x03b6:
            java.lang.String r8 = r8.b
            r5.q = r8
            avha r8 = r6.g
            if (r8 == 0) goto L_0x03bf
            goto L_0x03c1
        L_0x03bf:
            avha r8 = defpackage.avha.d
        L_0x03c1:
            int r8 = r8.a
            int r8 = defpackage.avgz.a(r8)
            if (r8 == 0) goto L_0x03ca
            goto L_0x03cb
        L_0x03ca:
            r8 = 1
        L_0x03cb:
            r5.u = r8
            r10 = 2
            if (r8 != r10) goto L_0x03d1
            goto L_0x03d4
        L_0x03d1:
            r10 = 3
            if (r8 != r10) goto L_0x03fd
        L_0x03d4:
            java.lang.String r8 = r6.b
            r5.j = r8
            java.lang.String r8 = r6.d
            r5.l = r8
            boolean r8 = defpackage.awhs.e()
            if (r8 != 0) goto L_0x03e3
            goto L_0x03eb
        L_0x03e3:
            java.lang.String r8 = r6.j
            r5.n = r8
            java.lang.String r8 = r6.k
            r5.m = r8
        L_0x03eb:
            java.lang.String r8 = r6.c
            r5.k = r8
            java.lang.String r8 = r6.e
            r5.o = r8
            avha r6 = r6.g
            if (r6 != 0) goto L_0x03f9
            avha r6 = defpackage.avha.d
        L_0x03f9:
            java.lang.String r6 = r6.c
            r5.p = r6
        L_0x03fd:
            avga r6 = r0.c
            if (r6 == 0) goto L_0x0402
            goto L_0x0404
        L_0x0402:
            avga r6 = defpackage.avga.c
        L_0x0404:
            avft r6 = r6.b
            if (r6 == 0) goto L_0x0409
            goto L_0x040b
        L_0x0409:
            avft r6 = defpackage.avft.c
        L_0x040b:
            aucx r6 = r6.b
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0415
            r10 = 3
            goto L_0x046e
        L_0x0415:
            avga r6 = r0.c
            if (r6 == 0) goto L_0x041a
            goto L_0x041c
        L_0x041a:
            avga r6 = defpackage.avga.c
        L_0x041c:
            avft r6 = r6.b
            if (r6 == 0) goto L_0x0421
            goto L_0x0423
        L_0x0421:
            avft r6 = defpackage.avft.c
        L_0x0423:
            aucx r6 = r6.b
            r8 = 0
            java.lang.Object r6 = r6.get(r8)
            avfu r6 = (defpackage.avfu) r6
            aucx r6 = r6.f
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x046d
            avga r0 = r0.c
            if (r0 == 0) goto L_0x0439
            goto L_0x043b
        L_0x0439:
            avga r0 = defpackage.avga.c
        L_0x043b:
            avft r0 = r0.b
            if (r0 == 0) goto L_0x0440
            goto L_0x0442
        L_0x0440:
            avft r0 = defpackage.avft.c
        L_0x0442:
            aucx r0 = r0.b
            r6 = 0
            java.lang.Object r0 = r0.get(r6)
            avfu r0 = (defpackage.avfu) r0
            aucx r0 = r0.f
            java.lang.Object r0 = r0.get(r6)
            avfs r0 = (defpackage.avfs) r0
            java.lang.String r0 = r0.b
            java.lang.String r6 = "Email"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0469
            java.lang.String r6 = "Sms"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0467
            r5.t = r9
        L_0x0467:
            r10 = 3
            goto L_0x046e
        L_0x0469:
            r10 = 3
            r5.t = r10
            goto L_0x046e
        L_0x046d:
            r10 = 3
        L_0x046e:
            r6 = 0
            r5.h = r6
            r5.i = r6
            int r0 = r3.a
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0482
            avge r0 = r3.d
            if (r0 == 0) goto L_0x047d
            goto L_0x047f
        L_0x047d:
            avge r0 = defpackage.avge.d
        L_0x047f:
            java.lang.String r0 = r0.b
            goto L_0x0483
        L_0x0482:
            r0 = 0
        L_0x0483:
            r5.s = r0
            r0 = r5
            goto L_0x0498
        L_0x0487:
            r10 = 3
            r0 = 0
            goto L_0x0498
        L_0x048a:
            r10 = 3
            r0 = 0
            goto L_0x0498
        L_0x048d:
            auci r2 = defpackage.avfa.g
            audx r2 = r8.a(r2)
            avfa r2 = (defpackage.avfa) r2
            throw r0
        L_0x0496:
            r10 = 3
            r0 = 0
        L_0x0498:
            if (r0 == 0) goto L_0x076e
        L_0x049a:
            com.google.firebase.dynamiclinks.internal.DynamicLinkData r3 = new com.google.firebase.dynamiclinks.internal.DynamicLinkData
            java.lang.String r5 = r1.a
            java.lang.String r6 = r0.b
            int r8 = r0.a
            long r11 = r0.g
            r24 = 0
            android.net.Uri r13 = r0.c
            r18 = r3
            r19 = r5
            r20 = r6
            r21 = r8
            r22 = r11
            r25 = r13
            r18.<init>(r19, r20, r21, r22, r24, r25)
            java.lang.String r5 = r0.s
            if (r5 == 0) goto L_0x04c8
            android.os.Bundle r5 = r3.a()
            java.lang.String r6 = r0.s
            java.lang.String r8 = "com.google.firebase.appinvite.fdl.extension.InvitationId"
            r5.putString(r8, r6)
            r3.e = r5
        L_0x04c8:
            boolean r5 = r0.r
            java.lang.String r6 = "dynamic_link_app_update"
            java.lang.String r8 = "dynamic_link_app_open"
            java.lang.String r11 = "dynamic_link_first_open"
            java.lang.String r12 = "_cmp"
            if (r5 != 0) goto L_0x054d
            java.lang.String r5 = r0.l
            if (r5 == 0) goto L_0x054d
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r13 = r0.j
            java.lang.String r14 = "source"
            a(r14, r13, r5)
            java.lang.String r13 = r0.k
            java.lang.String r14 = "medium"
            a(r14, r13, r5)
            java.lang.String r13 = r0.l
            java.lang.String r14 = "campaign"
            a(r14, r13, r5)
            boolean r13 = defpackage.awhs.e()
            if (r13 == 0) goto L_0x0506
            java.lang.String r13 = r0.n
            java.lang.String r14 = "content"
            a(r14, r13, r5)
            java.lang.String r13 = r0.m
            java.lang.String r14 = "term"
            a(r14, r13, r5)
        L_0x0506:
            axfi r13 = defpackage.axfi.a
            axfj r13 = r13.a()
            boolean r13 = r13.a()
            if (r13 == 0) goto L_0x054c
            int r13 = r1.d
            r14 = 11200000(0xaae600, float:1.5694543E-38)
            if (r13 < r14) goto L_0x054c
            defpackage.mch.b(r2, r4)
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            r13.putBundle(r12, r5)
            boolean r14 = r0.i
            if (r14 != 0) goto L_0x052a
            r14 = r8
            goto L_0x052b
        L_0x052a:
            r14 = r11
        L_0x052b:
            android.os.Bundle r15 = a(r0, r5)
            r13.putBundle(r14, r15)
            boolean r14 = r0.h
            if (r14 == 0) goto L_0x053d
            android.os.Bundle r14 = a(r0, r5)
            r13.putBundle(r6, r14)
        L_0x053d:
            android.os.Bundle r14 = r3.a()
            java.lang.String r15 = "scionData"
            r14.putBundle(r15, r13)
            r3.e = r14
            r13 = 1
            r0.r = r13
            goto L_0x054e
        L_0x054c:
            goto L_0x054e
        L_0x054d:
            r5 = 0
        L_0x054e:
            apwj r13 = r1.g
            com.google.android.gms.common.api.Status r14 = com.google.android.gms.common.api.Status.a
            r13.a((com.google.android.gms.common.api.Status) r14, (com.google.firebase.dynamiclinks.internal.DynamicLinkData) r3)
            boolean r3 = r0.r
            if (r3 == 0) goto L_0x055a
            goto L_0x0589
        L_0x055a:
            java.lang.String r3 = r0.l
            if (r3 == 0) goto L_0x0589
            defpackage.mch.b(r2, r4)
            com.google.android.gms.measurement.module.Analytics r3 = r1.e
            if (r3 != 0) goto L_0x0569
            com.google.android.gms.measurement.module.Analytics r3 = com.google.android.gms.measurement.module.Analytics.getInstance(r27)
        L_0x0569:
            r1.e = r3
            java.lang.String r13 = "fdl"
            r3.a(r13, r12, r5, r4)
            android.os.Bundle r3 = a(r0, r5)
            com.google.android.gms.measurement.module.Analytics r5 = r1.e
            boolean r12 = r0.i
            if (r12 != 0) goto L_0x057b
            goto L_0x057c
        L_0x057b:
            r8 = r11
        L_0x057c:
            r5.a(r13, r8, r3, r4)
            boolean r5 = r0.h
            if (r5 == 0) goto L_0x0589
            com.google.android.gms.measurement.module.Analytics r5 = r1.e
            r5.a(r13, r6, r3, r4)
        L_0x0589:
            mcc r3 = r1.f
            int r5 = r0.t
            boolean r6 = r0.i
            boolean r8 = r0.h
            java.lang.String r11 = r0.q
            int r12 = r0.u
            java.lang.String r13 = r0.d
            java.lang.String r14 = r0.e
            java.lang.String r0 = r0.f
            anrh r15 = defpackage.anrh.f
            aucd r15 = r15.o()
            boolean r16 = android.text.TextUtils.isEmpty(r4)
            if (r16 != 0) goto L_0x05e9
            anrr r16 = defpackage.anrr.c
            aucd r10 = r16.o()
            boolean r9 = r10.c
            if (r9 != 0) goto L_0x05b2
            goto L_0x05b8
        L_0x05b2:
            r10.c()
            r9 = 0
            r10.c = r9
        L_0x05b8:
            aucj r9 = r10.b
            anrr r9 = (defpackage.anrr) r9
            r4.getClass()
            int r1 = r9.a
            r17 = 2
            r1 = r1 | 2
            r9.a = r1
            r9.b = r4
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x05ce
            goto L_0x05d4
        L_0x05ce:
            r15.c()
            r1 = 0
            r15.c = r1
        L_0x05d4:
            aucj r1 = r15.b
            anrh r1 = (defpackage.anrh) r1
            aucj r9 = r10.i()
            anrr r9 = (defpackage.anrr) r9
            r9.getClass()
            r1.b = r9
            int r9 = r1.a
            r10 = 1
            r9 = r9 | r10
            r1.a = r9
        L_0x05e9:
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x05ee
            goto L_0x05f4
        L_0x05ee:
            r15.c()
            r1 = 0
            r15.c = r1
        L_0x05f4:
            aucj r1 = r15.b
            anrh r1 = (defpackage.anrh) r1
            int r9 = r5 + -1
            if (r5 == 0) goto L_0x076b
            r1.c = r9
            int r5 = r1.a
            r9 = 2
            r5 = r5 | r9
            r1.a = r5
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 == 0) goto L_0x0614
            boolean r1 = android.text.TextUtils.isEmpty(r14)
            if (r1 != 0) goto L_0x0611
            goto L_0x0614
        L_0x0611:
            r7 = 4
            goto L_0x06e3
        L_0x0614:
            anrm r1 = defpackage.anrm.g
            aucd r1 = r1.o()
            boolean r5 = android.text.TextUtils.isEmpty(r13)
            if (r5 != 0) goto L_0x063a
            boolean r5 = r1.c
            if (r5 != 0) goto L_0x0625
            goto L_0x062b
        L_0x0625:
            r1.c()
            r5 = 0
            r1.c = r5
        L_0x062b:
            aucj r5 = r1.b
            anrm r5 = (defpackage.anrm) r5
            r13.getClass()
            int r9 = r5.a
            r10 = 1
            r9 = r9 | r10
            r5.a = r9
            r5.b = r13
        L_0x063a:
            boolean r5 = android.text.TextUtils.isEmpty(r14)
            if (r5 != 0) goto L_0x065a
            boolean r5 = r1.c
            if (r5 != 0) goto L_0x0645
            goto L_0x064b
        L_0x0645:
            r1.c()
            r5 = 0
            r1.c = r5
        L_0x064b:
            aucj r5 = r1.b
            anrm r5 = (defpackage.anrm) r5
            r14.getClass()
            int r9 = r5.a
            r9 = r9 | 64
            r5.a = r9
            r5.f = r14
        L_0x065a:
            if (r11 == 0) goto L_0x0676
            boolean r5 = r1.c
            if (r5 != 0) goto L_0x0661
            goto L_0x0667
        L_0x0661:
            r1.c()
            r5 = 0
            r1.c = r5
        L_0x0667:
            aucj r5 = r1.b
            anrm r5 = (defpackage.anrm) r5
            r11.getClass()
            int r9 = r5.a
            r10 = 2
            r9 = r9 | r10
            r5.a = r9
            r5.c = r11
        L_0x0676:
            if (r12 != 0) goto L_0x0679
            goto L_0x06a3
        L_0x0679:
            int r12 = r12 + -1
            if (r12 == 0) goto L_0x0689
            r5 = 1
            if (r12 == r5) goto L_0x0687
            r5 = 2
            if (r12 == r5) goto L_0x0685
            r10 = 2
            goto L_0x068a
        L_0x0685:
            r10 = 3
            goto L_0x068a
        L_0x0687:
            r10 = 4
            goto L_0x068a
        L_0x0689:
            r10 = 1
        L_0x068a:
            boolean r5 = r1.c
            if (r5 != 0) goto L_0x068f
            goto L_0x0695
        L_0x068f:
            r1.c()
            r5 = 0
            r1.c = r5
        L_0x0695:
            aucj r5 = r1.b
            anrm r5 = (defpackage.anrm) r5
            int r10 = r10 + -1
            r5.d = r10
            int r9 = r5.a
            r10 = 4
            r9 = r9 | r10
            r5.a = r9
        L_0x06a3:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L_0x06c4
            boolean r5 = r1.c
            if (r5 != 0) goto L_0x06af
            goto L_0x06b5
        L_0x06af:
            r1.c()
            r5 = 0
            r1.c = r5
        L_0x06b5:
            aucj r5 = r1.b
            anrm r5 = (defpackage.anrm) r5
            r7.getClass()
            int r9 = r5.a
            r9 = r9 | 16
            r5.a = r9
            r5.e = r7
        L_0x06c4:
            aucj r1 = r1.i()
            anrm r1 = (defpackage.anrm) r1
            boolean r5 = r15.c
            if (r5 == 0) goto L_0x06d4
            r15.c()
            r5 = 0
            r15.c = r5
        L_0x06d4:
            aucj r5 = r15.b
            anrh r5 = (defpackage.anrh) r5
            r1.getClass()
            r5.d = r1
            int r1 = r5.a
            r7 = 4
            r1 = r1 | r7
            r5.a = r1
        L_0x06e3:
            if (r8 == 0) goto L_0x06e7
            r8 = 3
            goto L_0x06ec
        L_0x06e7:
            if (r6 == 0) goto L_0x06eb
            r8 = 4
            goto L_0x06ec
        L_0x06eb:
            r8 = 2
        L_0x06ec:
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x06f1
            goto L_0x06f7
        L_0x06f1:
            r15.c()
            r1 = 0
            r15.c = r1
        L_0x06f7:
            aucj r1 = r15.b
            anrh r1 = (defpackage.anrh) r1
            int r8 = r8 + -1
            r1.e = r8
            int r5 = r1.a
            r5 = r5 | 8
            r1.a = r5
            aucj r1 = r15.i()
            anrh r1 = (defpackage.anrh) r1
            boolean r5 = defpackage.mcc.a
            if (r5 != 0) goto L_0x0710
            goto L_0x075c
        L_0x0710:
            if (r1 == 0) goto L_0x075c
            anre r5 = defpackage.anre.o
            aucd r5 = r5.o()
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x071d
            goto L_0x0723
        L_0x071d:
            r5.c()
            r6 = 0
            r5.c = r6
        L_0x0723:
            aucj r6 = r5.b
            anre r6 = (defpackage.anre) r6
            r7 = 11
            r6.c = r7
            int r8 = r6.a
            r9 = 2
            r8 = r8 | r9
            r6.a = r8
            r1.getClass()
            r6.n = r1
            r1 = r8 | 4096(0x1000, float:5.74E-42)
            r6.a = r1
            if (r0 != 0) goto L_0x073d
            goto L_0x0746
        L_0x073d:
            r0.getClass()
            r8 = 1
            r1 = r1 | r8
            r6.a = r1
            r6.b = r0
        L_0x0746:
            hol r0 = r3.b
            aucj r1 = r5.i()
            anre r1 = (defpackage.anre) r1
            byte[] r1 = r1.k()
            hoi r0 = r0.a((byte[]) r1)
            r0.b((int) r7)
            r0.b()
        L_0x075c:
            ivk r0 = defpackage.mch.a(r2, r4)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.clear()
            r0.commit()
            return
        L_0x076b:
            r1 = 0
            throw r1
        L_0x076e:
            r1 = 0
            r2 = r26
            apwj r0 = r2.g
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.Status.a
            r0.a((com.google.android.gms.common.api.Status) r3, (com.google.firebase.dynamiclinks.internal.DynamicLinkData) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mcl.a(android.content.Context):void");
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.g.a(status, (DynamicLinkData) null);
    }
}
