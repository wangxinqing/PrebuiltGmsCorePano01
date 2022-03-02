package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.location.reporting.service.InternalPreferenceChimeraServiceDoNotUse;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.util.List;

/* renamed from: ajlj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajlj extends bhw implements ajlk {
    final /* synthetic */ InternalPreferenceChimeraServiceDoNotUse a;

    public ajlj() {
        super("com.google.android.location.reporting.service.IPreferenceService");
    }

    public final AccountConfig a(Account account) {
        return this.a.a.a(account);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: android.accounts.Account} */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x023f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0242, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        defpackage.ajjd.e(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0247, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0248, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x024a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x024b, code lost:
        r2 = r1;
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x024d, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        r1.a(r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0252, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0253, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0255, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ac, code lost:
        r3 = r0;
        r1 = r23;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b2, code lost:
        r2 = r1;
        r3 = r0;
        r1 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0253 A[ExcHandler: IOException | NullPointerException (e java.lang.Throwable), Splitter:B:1:0x0009] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0255 A[ExcHandler: babk (e babk), Splitter:B:1:0x0009] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0186 A[Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172, all -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018b A[Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172, all -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x019f A[Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172, all -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a4 A[Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172, all -> 0x01a8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List b(android.accounts.Account r26) {
        /*
            r25 = this;
            r1 = r26
            java.lang.String r2 = "Cannot call from UI thread."
            defpackage.iva.b((java.lang.String) r2)
            r3 = r25
            com.google.android.location.reporting.service.InternalPreferenceChimeraServiceDoNotUse r4 = r3.a     // Catch:{ IOException -> 0x0259, eif -> 0x0257, babk -> 0x0255, NullPointerException -> 0x0253 }
            ajld r4 = r4.b     // Catch:{ IOException -> 0x0259, eif -> 0x0257, babk -> 0x0255, NullPointerException -> 0x0253 }
            ajmm r5 = r4.a     // Catch:{ IOException -> 0x0259, eif -> 0x0257, babk -> 0x0255, NullPointerException -> 0x0253 }
            int r5 = r5.b((android.accounts.Account) r1)     // Catch:{ IOException -> 0x0259, eif -> 0x0257, babk -> 0x0255, NullPointerException -> 0x0253 }
            java.lang.String r6 = r4.a((android.accounts.Account) r1)     // Catch:{ IOException -> 0x0259, eif -> 0x0257, babk -> 0x0255, NullPointerException -> 0x0253 }
            boolean r8 = defpackage.azsy.d()     // Catch:{ eif -> 0x024a, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            if (r8 != 0) goto L_0x01b7
            ajkr r8 = r4.b     // Catch:{ eif -> 0x01b1, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            android.content.Context r10 = r8.i     // Catch:{ eif -> 0x01b1, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            ajkx r10 = defpackage.ajkq.a(r10)     // Catch:{ eif -> 0x01b1, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            alkz r11 = new alkz     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            r11.<init>(r10)     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            android.content.Context r12 = r8.i     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            com.google.android.gms.common.internal.ClientContext r14 = defpackage.ajkr.a(r12, r1)     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            ajkw r12 = defpackage.ajkm.a     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            r10.m = r12     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            java.lang.String r10 = defpackage.ajkr.f     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            java.lang.String r12 = defpackage.ajkr.d     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            java.lang.String r13 = defpackage.ajkr.c     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            java.lang.String r15 = "noRestriction"
            int r2 = r8.j     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            java.lang.Boolean r7 = r8.n     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            java.lang.String r16 = defpackage.ajkr.h     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            java.lang.String r17 = defpackage.ajkr.g     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            int r9 = r8.l     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            r18 = 2023(0x7e7, float:2.835E-42)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            int r19 = defpackage.ajkr.a     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r19)     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            int r8 = r8.k     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            java.lang.String r20 = defpackage.ajkr.b     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            boolean r21 = defpackage.azss.e()     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            if (r21 == 0) goto L_0x006f
            java.lang.String r21 = "android"
            goto L_0x0071
        L_0x006f:
            r21 = 0
        L_0x0071:
            java.lang.String r22 = defpackage.ajkr.e     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            r3.<init>()     // Catch:{ eif -> 0x0194, VolleyError -> 0x0178, all -> 0x0172 }
            r23 = r4
            java.util.Formatter r4 = new java.util.Formatter     // Catch:{ eif -> 0x016f, VolleyError -> 0x016c, all -> 0x0169 }
            r4.<init>(r3)     // Catch:{ eif -> 0x016f, VolleyError -> 0x016c, all -> 0x0169 }
            r24 = r14
            r1 = 1
            java.lang.Object[] r14 = new java.lang.Object[r1]     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            r5 = 0
            r14[r5] = r1     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            java.lang.String r1 = "userSettings/%1$s"
            r4.format(r1, r14)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            if (r6 == 0) goto L_0x009b
            java.lang.String r1 = "androidGcmRegistrationId"
            java.lang.String r4 = defpackage.iyv.a(r6)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r1, (java.lang.String) r4)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
        L_0x009b:
            if (r10 == 0) goto L_0x00a6
            java.lang.String r1 = "brand"
            java.lang.String r4 = defpackage.iyv.a(r10)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r1, (java.lang.String) r4)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
        L_0x00a6:
            if (r12 == 0) goto L_0x00b1
            java.lang.String r1 = "device"
            java.lang.String r4 = defpackage.iyv.a(r12)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r1, (java.lang.String) r4)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
        L_0x00b1:
            if (r13 != 0) goto L_0x00b4
            goto L_0x00bd
        L_0x00b4:
            java.lang.String r1 = "devicePrettyName"
            java.lang.String r4 = defpackage.iyv.a(r13)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r1, (java.lang.String) r4)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
        L_0x00bd:
            java.lang.String r1 = "deviceRestriction"
            java.lang.String r4 = defpackage.iyv.a(r15)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r1, (java.lang.String) r4)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            java.lang.String r1 = "gmsVersion"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            if (r7 == 0) goto L_0x00da
            java.lang.String r1 = "isLowRam"
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
        L_0x00da:
            if (r16 == 0) goto L_0x00e5
            java.lang.String r1 = "manufacturer"
            java.lang.String r2 = defpackage.iyv.a(r16)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
        L_0x00e5:
            if (r17 != 0) goto L_0x00e8
            goto L_0x00f1
        L_0x00e8:
            java.lang.String r1 = "model"
            java.lang.String r2 = defpackage.iyv.a(r17)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
        L_0x00f1:
            java.lang.String r1 = "moduleVersion"
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            java.lang.String r1 = "nlpVersion"
            java.lang.String r2 = java.lang.String.valueOf(r18)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            java.lang.String r1 = "osLevel"
            java.lang.String r2 = java.lang.String.valueOf(r19)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            java.lang.String r1 = "packageVersion"
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            if (r20 == 0) goto L_0x0120
            java.lang.String r1 = "platform"
            java.lang.String r2 = defpackage.iyv.a(r20)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
        L_0x0120:
            if (r21 == 0) goto L_0x012b
            java.lang.String r1 = "platformType"
            java.lang.String r2 = defpackage.iyv.a(r21)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
        L_0x012b:
            if (r22 != 0) goto L_0x012e
            goto L_0x0137
        L_0x012e:
            java.lang.String r1 = "product"
            java.lang.String r2 = defpackage.iyv.a(r22)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            defpackage.iyv.a((java.lang.StringBuilder) r3, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
        L_0x0137:
            java.lang.String r16 = r3.toString()     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            izb r13 = r11.a     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            r15 = 0
            r17 = 0
            java.lang.Class<com.google.android.ulr.ApiUserSettings> r18 = com.google.android.ulr.ApiUserSettings.class
            r14 = r24
            jag r1 = r13.a((com.google.android.gms.common.internal.ClientContext) r14, (int) r15, (java.lang.String) r16, (java.lang.Object) r17, (java.lang.Class) r18)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            com.google.android.ulr.ApiUserSettings r1 = (com.google.android.ulr.ApiUserSettings) r1     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            r2 = 1
            defpackage.ajjd.e((boolean) r2)     // Catch:{ eif -> 0x0165, VolleyError -> 0x0161, all -> 0x015d }
            r2 = r26
            ajla r1 = defpackage.ajla.a((android.accounts.Account) r2, (com.google.android.ulr.ApiUserSettings) r1)     // Catch:{ eif -> 0x015b, VolleyError -> 0x0159 }
            r3 = r1
            r1 = r23
            goto L_0x0227
        L_0x0159:
            r0 = move-exception
            goto L_0x017c
        L_0x015b:
            r0 = move-exception
            goto L_0x0198
        L_0x015d:
            r0 = move-exception
            r2 = r26
            goto L_0x0176
        L_0x0161:
            r0 = move-exception
            r2 = r26
            goto L_0x017c
        L_0x0165:
            r0 = move-exception
            r2 = r26
            goto L_0x0198
        L_0x0169:
            r0 = move-exception
            r2 = r1
            goto L_0x0176
        L_0x016c:
            r0 = move-exception
            r2 = r1
            goto L_0x017c
        L_0x016f:
            r0 = move-exception
            r2 = r1
            goto L_0x0198
        L_0x0172:
            r0 = move-exception
            r2 = r1
            r23 = r4
        L_0x0176:
            r1 = r0
            goto L_0x01aa
        L_0x0178:
            r0 = move-exception
            r2 = r1
            r23 = r4
        L_0x017c:
            r1 = r0
            defpackage.ajkr.a(r1)     // Catch:{ all -> 0x01a8 }
            boolean r3 = defpackage.azte.d()     // Catch:{ all -> 0x01a8 }
            if (r3 != 0) goto L_0x018b
            r3 = 0
            defpackage.ajjd.e((boolean) r3)     // Catch:{ all -> 0x01a8 }
            goto L_0x018e
        L_0x018b:
            defpackage.ajjd.c((java.lang.Throwable) r1)     // Catch:{ all -> 0x01a8 }
        L_0x018e:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x01a8 }
            r3.<init>(r1)     // Catch:{ all -> 0x01a8 }
            throw r3     // Catch:{ all -> 0x01a8 }
        L_0x0194:
            r0 = move-exception
            r2 = r1
            r23 = r4
        L_0x0198:
            r1 = r0
            boolean r3 = defpackage.azte.d()     // Catch:{ all -> 0x01a8 }
            if (r3 != 0) goto L_0x01a4
            r3 = 0
            defpackage.ajjd.e((boolean) r3)     // Catch:{ all -> 0x01a8 }
            goto L_0x01a7
        L_0x01a4:
            defpackage.ajjd.c((java.lang.Throwable) r1)     // Catch:{ all -> 0x01a8 }
        L_0x01a7:
            throw r1     // Catch:{ all -> 0x01a8 }
        L_0x01a8:
            r0 = move-exception
            goto L_0x0176
        L_0x01aa:
            throw r1     // Catch:{ eif -> 0x01ab, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
        L_0x01ab:
            r0 = move-exception
            r3 = r0
            r1 = r23
            goto L_0x024e
        L_0x01b1:
            r0 = move-exception
            r2 = r1
            r3 = r0
            r1 = r4
            goto L_0x024e
        L_0x01b7:
            r2 = r1
            r23 = r4
            r1 = r23
            ajkj r3 = r1.c     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            atec r4 = defpackage.atec.c     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            aucd r4 = r4.o()     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            boolean r7 = r4.c     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            if (r7 != 0) goto L_0x01c9
            goto L_0x01cf
        L_0x01c9:
            r4.c()     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            r7 = 0
            r4.c = r7     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
        L_0x01cf:
            aucj r7 = r4.b     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            atec r7 = (defpackage.atec) r7     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            int r8 = r7.a     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            r9 = 1
            r8 = r8 | r9
            r7.a = r8     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            r7.b = r5     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            aucj r4 = r4.i()     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            r10 = r4
            atec r10 = (defpackage.atec) r10     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            r4 = 0
            defpackage.ajjd.d((long) r4)     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            ajlf r4 = defpackage.ajkj.j     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            android.content.Context r3 = r3.i     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            com.google.android.gms.common.internal.ClientContext r9 = defpackage.ajkj.a((android.content.Context) r3, (android.accounts.Account) r2)     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            baaj r3 = defpackage.ajlf.c     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            if (r3 == 0) goto L_0x01f4
            goto L_0x020a
        L_0x01f4:
            baai r3 = defpackage.baai.UNARY     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            java.lang.String r5 = "userlocation.UserLocationReportingService/GetApiUserSettings"
            atec r7 = defpackage.atec.c     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            baah r7 = defpackage.baoq.a(r7)     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            ateb r8 = defpackage.ateb.b     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            baah r8 = defpackage.baoq.a(r8)     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            baaj r3 = defpackage.baaj.a(r3, r5, r7, r8)     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            defpackage.ajlf.c = r3     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
        L_0x020a:
            izd r7 = r4.a     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            baaj r8 = defpackage.ajlf.c     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            r11 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            java.lang.Object r3 = r7.a(r8, r9, r10, r11, r13)     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            ateb r3 = (defpackage.ateb) r3     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            r4 = 1
            defpackage.ajjd.e((boolean) r4)     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            atdq r3 = r3.a     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
            if (r3 == 0) goto L_0x0221
            goto L_0x0223
        L_0x0221:
            atdq r3 = defpackage.atdq.c     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
        L_0x0223:
            ajla r3 = defpackage.ajla.a((android.accounts.Account) r2, (defpackage.atdq) r3)     // Catch:{ babk -> 0x0241, eif -> 0x023f, IOException -> 0x0259, NullPointerException -> 0x0253 }
        L_0x0227:
            ajkh r4 = r3.a     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            boolean r4 = defpackage.ajld.b(r4)     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            if (r4 == 0) goto L_0x0237
            r1.a((android.accounts.Account) r2, (java.lang.String) r6)     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            ajkh r4 = r3.a     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            r1.a((defpackage.ajkh) r4)     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
        L_0x0237:
            r4 = 1
            r1.a((android.accounts.Account) r2, (boolean) r4)     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            java.util.List r1 = r3.b     // Catch:{ IOException -> 0x0259, eif -> 0x0257, babk -> 0x0255, NullPointerException -> 0x0253 }
            return r1
        L_0x023f:
            r0 = move-exception
            goto L_0x0242
        L_0x0241:
            r0 = move-exception
        L_0x0242:
            r3 = r0
            r4 = 0
            defpackage.ajjd.e((boolean) r4)     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
            throw r3     // Catch:{ eif -> 0x0248, IOException -> 0x0259, babk -> 0x0255, NullPointerException -> 0x0253 }
        L_0x0248:
            r0 = move-exception
            goto L_0x024d
        L_0x024a:
            r0 = move-exception
            r2 = r1
            r1 = r4
        L_0x024d:
            r3 = r0
        L_0x024e:
            r4 = 0
            r1.a((android.accounts.Account) r2, (boolean) r4)     // Catch:{ IOException -> 0x0259, eif -> 0x0257, babk -> 0x0255, NullPointerException -> 0x0253 }
            throw r3     // Catch:{ IOException -> 0x0259, eif -> 0x0257, babk -> 0x0255, NullPointerException -> 0x0253 }
        L_0x0253:
            r0 = move-exception
            goto L_0x025a
        L_0x0255:
            r0 = move-exception
            goto L_0x025a
        L_0x0257:
            r0 = move-exception
            goto L_0x025a
        L_0x0259:
            r0 = move-exception
        L_0x025a:
            r1 = r0
            java.lang.String r2 = "GCoreUlr"
            java.lang.String r3 = "Couldn't get remote devices"
            defpackage.ajix.b((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajlj.b(android.accounts.Account):java.util.List");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajlj(InternalPreferenceChimeraServiceDoNotUse internalPreferenceChimeraServiceDoNotUse) {
        super("com.google.android.location.reporting.service.IPreferenceService");
        this.a = internalPreferenceChimeraServiceDoNotUse;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: android.accounts.Account} */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0264, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0265, code lost:
        r4 = r0;
        r1 = r27;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x026a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x026b, code lost:
        r2 = r1;
        r4 = r0;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x037b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x037c, code lost:
        r2 = r1;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0384, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0386, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0388, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x038b, code lost:
        defpackage.ajix.b(r3, "Couldn't set remote device reporting enabled", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0392, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x023f A[Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b, all -> 0x0261 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0244 A[Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b, all -> 0x0261 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0258 A[Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b, all -> 0x0261 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x025d A[Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b, all -> 0x0261 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0384 A[ExcHandler: IOException | NullPointerException (e java.lang.Throwable), PHI: r3 
      PHI: (r3v4 java.lang.String) = (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v5 java.lang.String), (r3v8 java.lang.String), (r3v8 java.lang.String), (r3v8 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v9 java.lang.String), (r3v9 java.lang.String) binds: [B:1:0x000d, B:3:0x001b, B:180:0x0380, B:162:0x0358, B:167:0x036d, B:168:?, B:134:0x0275, B:135:?, B:136:0x0277, B:172:0x0375, B:6:0x0021, B:127:0x0263, B:128:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x000d] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0386 A[ExcHandler: babk (e babk), PHI: r3 
      PHI: (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v5 java.lang.String), (r3v8 java.lang.String), (r3v8 java.lang.String), (r3v8 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v9 java.lang.String), (r3v9 java.lang.String) binds: [B:1:0x000d, B:3:0x001b, B:180:0x0380, B:162:0x0358, B:167:0x036d, B:168:?, B:134:0x0275, B:135:?, B:172:0x0375, B:6:0x0021, B:127:0x0263, B:128:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x000d] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:127:0x0263=Splitter:B:127:0x0263, B:162:0x0358=Splitter:B:162:0x0358} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a(android.accounts.Account r30, int r31, boolean r32, java.lang.String r33) {
        /*
            r29 = this;
            r1 = r30
            java.lang.String r2 = "com.google.android.gms+remote"
            java.lang.String r3 = "GCoreUlr"
            java.lang.String r4 = "Cannot call from UI thread."
            defpackage.iva.b((java.lang.String) r4)
            r5 = r29
            com.google.android.location.reporting.service.InternalPreferenceChimeraServiceDoNotUse r6 = r5.a     // Catch:{ IOException -> 0x038a, eif -> 0x0388, babk -> 0x0386, NullPointerException -> 0x0384 }
            ajld r6 = r6.b     // Catch:{ IOException -> 0x038a, eif -> 0x0388, babk -> 0x0386, NullPointerException -> 0x0384 }
            ajmm r7 = r6.a     // Catch:{ IOException -> 0x038a, eif -> 0x0388, babk -> 0x0386, NullPointerException -> 0x0384 }
            int r7 = r7.b((android.accounts.Account) r1)     // Catch:{ IOException -> 0x038a, eif -> 0x0388, babk -> 0x0386, NullPointerException -> 0x0384 }
            java.lang.String r8 = r6.a((android.accounts.Account) r1)     // Catch:{ IOException -> 0x038a, eif -> 0x0388, babk -> 0x0386, NullPointerException -> 0x0384 }
            boolean r10 = defpackage.azsy.d()     // Catch:{ eif -> 0x037b, IOException -> 0x038a, babk -> 0x0386, NullPointerException -> 0x0384 }
            if (r10 != 0) goto L_0x0270
            ajkr r10 = r6.b     // Catch:{ eif -> 0x026a, IOException -> 0x038a, babk -> 0x0386, NullPointerException -> 0x0384 }
            android.content.Context r12 = r10.i     // Catch:{ eif -> 0x026a, IOException -> 0x038a, babk -> 0x0386, NullPointerException -> 0x0384 }
            ajkx r12 = defpackage.ajkq.a(r12)     // Catch:{ eif -> 0x026a, IOException -> 0x038a, babk -> 0x0386, NullPointerException -> 0x0384 }
            alkz r13 = new alkz     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            r13.<init>(r12)     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            android.content.Context r14 = r10.i     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            com.google.android.gms.common.internal.ClientContext r16 = defpackage.ajkr.a(r14, r1)     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            ajkw r14 = defpackage.ajkn.a     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            r12.m = r14     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r32)     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r31)     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            java.lang.String r15 = defpackage.ajkr.f     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            java.lang.String r17 = defpackage.ajkr.d     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            java.lang.String r18 = defpackage.ajkr.c     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            java.lang.String r19 = "noRestriction"
            int r4 = r10.j     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            java.lang.Boolean r9 = r10.n     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            java.lang.String r20 = defpackage.ajkr.h     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            java.lang.String r21 = defpackage.ajkr.g     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            int r11 = r10.l     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            r22 = 2023(0x7e7, float:2.835E-42)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r22)     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            int r23 = defpackage.ajkr.a     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            java.lang.Integer r23 = java.lang.Integer.valueOf(r23)     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            int r10 = r10.k     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            java.lang.String r24 = defpackage.ajkr.b     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            boolean r25 = defpackage.azss.e()     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            if (r25 == 0) goto L_0x007b
            java.lang.String r25 = "android"
            goto L_0x007d
        L_0x007b:
            r25 = 0
        L_0x007d:
            java.lang.String r26 = defpackage.ajkr.e     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            r5.<init>()     // Catch:{ eif -> 0x024d, VolleyError -> 0x0231, all -> 0x022b }
            r27 = r6
            java.util.Formatter r6 = new java.util.Formatter     // Catch:{ eif -> 0x0228, VolleyError -> 0x0225, all -> 0x0222 }
            r6.<init>(r5)     // Catch:{ eif -> 0x0228, VolleyError -> 0x0225, all -> 0x0222 }
            r28 = r3
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            r7 = 0
            r3[r7] = r1     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            java.lang.String r1 = "userSettings/%1$s"
            r6.format(r1, r3)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            java.lang.String r1 = "reportingEnabled"
            java.lang.String r3 = java.lang.String.valueOf(r12)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            java.lang.String r1 = "targetDeviceTag"
            java.lang.String r3 = java.lang.String.valueOf(r14)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            if (r8 == 0) goto L_0x00d2
            java.lang.String r1 = "androidGcmRegistrationId"
            java.lang.String r3 = defpackage.iyv.a(r8)     // Catch:{ eif -> 0x00ca, VolleyError -> 0x00c2, all -> 0x00ba }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x00ca, VolleyError -> 0x00c2, all -> 0x00ba }
            goto L_0x00d2
        L_0x00ba:
            r0 = move-exception
            r2 = r30
            r1 = r0
            r3 = r28
            goto L_0x0263
        L_0x00c2:
            r0 = move-exception
            r2 = r30
            r1 = r0
            r3 = r28
            goto L_0x0236
        L_0x00ca:
            r0 = move-exception
            r2 = r30
            r1 = r0
            r3 = r28
            goto L_0x0252
        L_0x00d2:
            if (r33 == 0) goto L_0x00dd
            java.lang.String r1 = "auditToken"
            java.lang.String r3 = defpackage.iyv.a(r33)     // Catch:{ eif -> 0x00ca, VolleyError -> 0x00c2, all -> 0x00ba }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x00ca, VolleyError -> 0x00c2, all -> 0x00ba }
        L_0x00dd:
            if (r15 == 0) goto L_0x00e8
            java.lang.String r1 = "brand"
            java.lang.String r3 = defpackage.iyv.a(r15)     // Catch:{ eif -> 0x00ca, VolleyError -> 0x00c2, all -> 0x00ba }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x00ca, VolleyError -> 0x00c2, all -> 0x00ba }
        L_0x00e8:
            if (r17 == 0) goto L_0x00f3
            java.lang.String r1 = "device"
            java.lang.String r3 = defpackage.iyv.a(r17)     // Catch:{ eif -> 0x00ca, VolleyError -> 0x00c2, all -> 0x00ba }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x00ca, VolleyError -> 0x00c2, all -> 0x00ba }
        L_0x00f3:
            if (r18 != 0) goto L_0x00f6
            goto L_0x00ff
        L_0x00f6:
            java.lang.String r1 = "devicePrettyName"
            java.lang.String r3 = defpackage.iyv.a(r18)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
        L_0x00ff:
            java.lang.String r1 = "deviceRestriction"
            java.lang.String r3 = defpackage.iyv.a(r19)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            java.lang.String r1 = "gmsVersion"
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            java.lang.String r1 = "historySource"
            java.lang.String r3 = defpackage.iyv.a(r2)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            if (r9 == 0) goto L_0x0125
            java.lang.String r1 = "isLowRam"
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch:{ eif -> 0x00ca, VolleyError -> 0x00c2, all -> 0x00ba }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x00ca, VolleyError -> 0x00c2, all -> 0x00ba }
        L_0x0125:
            if (r20 == 0) goto L_0x0130
            java.lang.String r1 = "manufacturer"
            java.lang.String r3 = defpackage.iyv.a(r20)     // Catch:{ eif -> 0x00ca, VolleyError -> 0x00c2, all -> 0x00ba }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x00ca, VolleyError -> 0x00c2, all -> 0x00ba }
        L_0x0130:
            if (r21 != 0) goto L_0x0133
            goto L_0x013c
        L_0x0133:
            java.lang.String r1 = "model"
            java.lang.String r3 = defpackage.iyv.a(r21)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
        L_0x013c:
            java.lang.String r1 = "moduleVersion"
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            java.lang.String r1 = "nlpVersion"
            java.lang.String r3 = java.lang.String.valueOf(r22)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            java.lang.String r1 = "osLevel"
            java.lang.String r3 = java.lang.String.valueOf(r23)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            java.lang.String r1 = "packageVersion"
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            if (r24 == 0) goto L_0x016b
            java.lang.String r1 = "platform"
            java.lang.String r3 = defpackage.iyv.a(r24)     // Catch:{ eif -> 0x00ca, VolleyError -> 0x00c2, all -> 0x00ba }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x00ca, VolleyError -> 0x00c2, all -> 0x00ba }
        L_0x016b:
            if (r25 == 0) goto L_0x0176
            java.lang.String r1 = "platformType"
            java.lang.String r3 = defpackage.iyv.a(r25)     // Catch:{ eif -> 0x00ca, VolleyError -> 0x00c2, all -> 0x00ba }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x00ca, VolleyError -> 0x00c2, all -> 0x00ba }
        L_0x0176:
            if (r26 != 0) goto L_0x0179
            goto L_0x0182
        L_0x0179:
            java.lang.String r1 = "product"
            java.lang.String r3 = defpackage.iyv.a(r26)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
        L_0x0182:
            java.lang.String r1 = "reportingSource"
            java.lang.String r2 = defpackage.iyv.a(r2)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            defpackage.iyv.a((java.lang.StringBuilder) r5, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            java.lang.String r18 = r5.toString()     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            izb r15 = r13.a     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            r17 = 1
            r19 = 0
            java.lang.Class<com.google.android.ulr.SetApiRemoteDeviceSettingsReply> r20 = com.google.android.ulr.SetApiRemoteDeviceSettingsReply.class
            jag r1 = r15.a((com.google.android.gms.common.internal.ClientContext) r16, (int) r17, (java.lang.String) r18, (java.lang.Object) r19, (java.lang.Class) r20)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            com.google.android.ulr.SetApiRemoteDeviceSettingsReply r1 = (com.google.android.ulr.SetApiRemoteDeviceSettingsReply) r1     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            r2 = 1
            defpackage.ajjd.f((boolean) r2)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            java.util.HashMap r2 = r1.b     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            java.lang.String r3 = "remoteDeviceInfoSource"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ eif -> 0x021c, VolleyError -> 0x0216, all -> 0x0210 }
            if (r2 == 0) goto L_0x01ee
            java.lang.String r3 = "success"
            boolean r2 = r3.equals(r2)     // Catch:{ eif -> 0x01ea, VolleyError -> 0x01e6, all -> 0x01e2 }
            if (r2 != 0) goto L_0x01df
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ eif -> 0x01ea, VolleyError -> 0x01e6, all -> 0x01e2 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ eif -> 0x01ea, VolleyError -> 0x01e6, all -> 0x01e2 }
            int r3 = r3.length()     // Catch:{ eif -> 0x01ea, VolleyError -> 0x01e6, all -> 0x01e2 }
            int r3 = r3 + 47
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ eif -> 0x01ea, VolleyError -> 0x01e6, all -> 0x01e2 }
            r4.<init>(r3)     // Catch:{ eif -> 0x01ea, VolleyError -> 0x01e6, all -> 0x01e2 }
            java.lang.String r3 = "setRemoteDeviceReportingEnabled failed with: '"
            r4.append(r3)     // Catch:{ eif -> 0x01ea, VolleyError -> 0x01e6, all -> 0x01e2 }
            r4.append(r2)     // Catch:{ eif -> 0x01ea, VolleyError -> 0x01e6, all -> 0x01e2 }
            java.lang.String r2 = "'"
            r4.append(r2)     // Catch:{ eif -> 0x01ea, VolleyError -> 0x01e6, all -> 0x01e2 }
            java.lang.String r2 = r4.toString()     // Catch:{ eif -> 0x01ea, VolleyError -> 0x01e6, all -> 0x01e2 }
            r3 = r28
            defpackage.ajix.c(r3, r2)     // Catch:{ eif -> 0x020c, VolleyError -> 0x0208, all -> 0x0204 }
            goto L_0x01f0
        L_0x01df:
            r3 = r28
            goto L_0x01f0
        L_0x01e2:
            r0 = move-exception
            r3 = r28
            goto L_0x0205
        L_0x01e6:
            r0 = move-exception
            r3 = r28
            goto L_0x0209
        L_0x01ea:
            r0 = move-exception
            r3 = r28
            goto L_0x020d
        L_0x01ee:
            r3 = r28
        L_0x01f0:
            com.google.android.ulr.ApiUserSettings r1 = r1.getUserSettings()     // Catch:{ eif -> 0x020c, VolleyError -> 0x0208, all -> 0x0204 }
            r2 = r30
            ajla r1 = defpackage.ajla.a((android.accounts.Account) r2, (com.google.android.ulr.ApiUserSettings) r1)     // Catch:{ eif -> 0x0201, VolleyError -> 0x01ff }
            r4 = r1
            r1 = r27
            goto L_0x0358
        L_0x01ff:
            r0 = move-exception
            goto L_0x0235
        L_0x0201:
            r0 = move-exception
            goto L_0x0251
        L_0x0204:
            r0 = move-exception
        L_0x0205:
            r2 = r30
            goto L_0x022f
        L_0x0208:
            r0 = move-exception
        L_0x0209:
            r2 = r30
            goto L_0x0235
        L_0x020c:
            r0 = move-exception
        L_0x020d:
            r2 = r30
            goto L_0x0251
        L_0x0210:
            r0 = move-exception
            r2 = r30
            r3 = r28
            goto L_0x022f
        L_0x0216:
            r0 = move-exception
            r2 = r30
            r3 = r28
            goto L_0x0235
        L_0x021c:
            r0 = move-exception
            r2 = r30
            r3 = r28
            goto L_0x0251
        L_0x0222:
            r0 = move-exception
            r2 = r1
            goto L_0x022f
        L_0x0225:
            r0 = move-exception
            r2 = r1
            goto L_0x0235
        L_0x0228:
            r0 = move-exception
            r2 = r1
            goto L_0x0251
        L_0x022b:
            r0 = move-exception
            r2 = r1
            r27 = r6
        L_0x022f:
            r1 = r0
            goto L_0x0263
        L_0x0231:
            r0 = move-exception
            r2 = r1
            r27 = r6
        L_0x0235:
            r1 = r0
        L_0x0236:
            defpackage.ajkr.a(r1)     // Catch:{ all -> 0x0261 }
            boolean r4 = defpackage.azte.d()     // Catch:{ all -> 0x0261 }
            if (r4 != 0) goto L_0x0244
            r4 = 0
            defpackage.ajjd.f((boolean) r4)     // Catch:{ all -> 0x0261 }
            goto L_0x0247
        L_0x0244:
            defpackage.ajjd.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x0261 }
        L_0x0247:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0261 }
            r4.<init>(r1)     // Catch:{ all -> 0x0261 }
            throw r4     // Catch:{ all -> 0x0261 }
        L_0x024d:
            r0 = move-exception
            r2 = r1
            r27 = r6
        L_0x0251:
            r1 = r0
        L_0x0252:
            boolean r4 = defpackage.azte.d()     // Catch:{ all -> 0x0261 }
            if (r4 != 0) goto L_0x025d
            r4 = 0
            defpackage.ajjd.f((boolean) r4)     // Catch:{ all -> 0x0261 }
            goto L_0x0260
        L_0x025d:
            defpackage.ajjd.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x0261 }
        L_0x0260:
            throw r1     // Catch:{ all -> 0x0261 }
        L_0x0261:
            r0 = move-exception
            goto L_0x022f
        L_0x0263:
            throw r1     // Catch:{ eif -> 0x0264, IOException -> 0x038a, babk -> 0x0386, NullPointerException -> 0x0384 }
        L_0x0264:
            r0 = move-exception
            r4 = r0
            r1 = r27
            goto L_0x037f
        L_0x026a:
            r0 = move-exception
            r2 = r1
            r4 = r0
            r1 = r6
            goto L_0x037f
        L_0x0270:
            r2 = r1
            r27 = r6
            r1 = r27
            ajkj r4 = r1.c     // Catch:{ eif -> 0x0379, IOException -> 0x038a, babk -> 0x0386, NullPointerException -> 0x0384 }
            ateh r5 = defpackage.ateh.g     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            aucd r5 = r5.o()     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            boolean r6 = r5.c     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            if (r6 != 0) goto L_0x0282
            goto L_0x0288
        L_0x0282:
            r5.c()     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r6 = 0
            r5.c = r6     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
        L_0x0288:
            aucj r6 = r5.b     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            ateh r6 = (defpackage.ateh) r6     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            int r9 = r6.a     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r10 = 1
            r9 = r9 | r10
            r6.a = r9     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r6.b = r7     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            aucd r6 = r4.a((java.lang.String) r8, (boolean) r10)     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            aucj r6 = r6.i()     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            atbz r6 = (defpackage.atbz) r6     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            boolean r7 = r5.c     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            if (r7 != 0) goto L_0x02a3
            goto L_0x02a9
        L_0x02a3:
            r5.c()     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r7 = 0
            r5.c = r7     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
        L_0x02a9:
            aucj r7 = r5.b     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            ateh r7 = (defpackage.ateh) r7     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r6.getClass()     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r7.d = r6     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            int r6 = r7.a     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r6 = r6 | 4
            r7.a = r6     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r6 = r6 | 2
            r7.a = r6     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r9 = r31
            r7.c = r9     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r6 = r6 | 8
            r7.a = r6     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r6 = r32
            r7.e = r6     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            atdm r6 = defpackage.atdm.e     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            aucd r6 = r6.o()     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            java.lang.String r7 = defpackage.jlh.a(r33)     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            boolean r9 = r6.c     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            if (r9 != 0) goto L_0x02d7
            goto L_0x02dd
        L_0x02d7:
            r6.c()     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r9 = 0
            r6.c = r9     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
        L_0x02dd:
            aucj r9 = r6.b     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            atdm r9 = (defpackage.atdm) r9     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r7.getClass()     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            int r10 = r9.a     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r10 = r10 | 4
            r9.a = r10     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r9.d = r7     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            boolean r7 = r5.c     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            if (r7 != 0) goto L_0x02f1
            goto L_0x02f7
        L_0x02f1:
            r5.c()     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r7 = 0
            r5.c = r7     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
        L_0x02f7:
            aucj r7 = r5.b     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            ateh r7 = (defpackage.ateh) r7     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            aucj r6 = r6.i()     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            atdm r6 = (defpackage.atdm) r6     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r6.getClass()     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r7.f = r6     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            int r6 = r7.a     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r6 = r6 | 16
            r7.a = r6     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            aucj r5 = r5.i()     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r12 = r5
            ateh r12 = (defpackage.ateh) r12     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r5 = 0
            defpackage.ajjd.e((long) r5)     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            ajlf r5 = defpackage.ajkj.j     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            android.content.Context r4 = r4.i     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            com.google.android.gms.common.internal.ClientContext r11 = defpackage.ajkj.a((android.content.Context) r4, (android.accounts.Account) r2)     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            baaj r4 = defpackage.ajlf.e     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            if (r4 == 0) goto L_0x0325
            goto L_0x033b
        L_0x0325:
            baai r4 = defpackage.baai.UNARY     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            java.lang.String r6 = "userlocation.UserLocationReportingService/SetApiRemoteDeviceSettings"
            ateh r7 = defpackage.ateh.g     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            baah r7 = defpackage.baoq.a(r7)     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            ateg r9 = defpackage.ateg.b     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            baah r9 = defpackage.baoq.a(r9)     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            baaj r4 = defpackage.baaj.a(r4, r6, r7, r9)     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            defpackage.ajlf.e = r4     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
        L_0x033b:
            izd r9 = r5.a     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            baaj r10 = defpackage.ajlf.e     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r13 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            java.lang.Object r4 = r9.a(r10, r11, r12, r13, r15)     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            ateg r4 = (defpackage.ateg) r4     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            r5 = 1
            defpackage.ajjd.f((boolean) r5)     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            atdq r4 = r4.a     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
            if (r4 == 0) goto L_0x0352
            goto L_0x0354
        L_0x0352:
            atdq r4 = defpackage.atdq.c     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
        L_0x0354:
            ajla r4 = defpackage.ajla.a((android.accounts.Account) r2, (defpackage.atdq) r4)     // Catch:{ babk -> 0x0372, eif -> 0x0370, IOException -> 0x038a, NullPointerException -> 0x0384 }
        L_0x0358:
            ajkh r5 = r4.a     // Catch:{ eif -> 0x0379, IOException -> 0x038a, babk -> 0x0386, NullPointerException -> 0x0384 }
            boolean r5 = defpackage.ajld.b(r5)     // Catch:{ eif -> 0x0379, IOException -> 0x038a, babk -> 0x0386, NullPointerException -> 0x0384 }
            if (r5 == 0) goto L_0x0368
            r1.a((android.accounts.Account) r2, (java.lang.String) r8)     // Catch:{ eif -> 0x0379, IOException -> 0x038a, babk -> 0x0386, NullPointerException -> 0x0384 }
            ajkh r5 = r4.a     // Catch:{ eif -> 0x0379, IOException -> 0x038a, babk -> 0x0386, NullPointerException -> 0x0384 }
            r1.a((defpackage.ajkh) r5)     // Catch:{ eif -> 0x0379, IOException -> 0x038a, babk -> 0x0386, NullPointerException -> 0x0384 }
        L_0x0368:
            r5 = 1
            r1.a((android.accounts.Account) r2, (boolean) r5)     // Catch:{ eif -> 0x0379, IOException -> 0x038a, babk -> 0x0386, NullPointerException -> 0x0384 }
            java.util.List r1 = r4.b     // Catch:{ IOException -> 0x038a, eif -> 0x0388, babk -> 0x0386, NullPointerException -> 0x0384 }
            return r1
        L_0x0370:
            r0 = move-exception
            goto L_0x0373
        L_0x0372:
            r0 = move-exception
        L_0x0373:
            r4 = r0
            r5 = 0
            defpackage.ajjd.f((boolean) r5)     // Catch:{ eif -> 0x0379, IOException -> 0x038a, babk -> 0x0386, NullPointerException -> 0x0384 }
            throw r4     // Catch:{ eif -> 0x0379, IOException -> 0x038a, babk -> 0x0386, NullPointerException -> 0x0384 }
        L_0x0379:
            r0 = move-exception
            goto L_0x037e
        L_0x037b:
            r0 = move-exception
            r2 = r1
            r1 = r6
        L_0x037e:
            r4 = r0
        L_0x037f:
            r5 = 0
            r1.a((android.accounts.Account) r2, (boolean) r5)     // Catch:{ IOException -> 0x038a, eif -> 0x0388, babk -> 0x0386, NullPointerException -> 0x0384 }
            throw r4     // Catch:{ IOException -> 0x038a, eif -> 0x0388, babk -> 0x0386, NullPointerException -> 0x0384 }
        L_0x0384:
            r0 = move-exception
            goto L_0x038b
        L_0x0386:
            r0 = move-exception
            goto L_0x038b
        L_0x0388:
            r0 = move-exception
            goto L_0x038b
        L_0x038a:
            r0 = move-exception
        L_0x038b:
            r1 = r0
            java.lang.String r2 = "Couldn't set remote device reporting enabled"
            defpackage.ajix.b((java.lang.String) r3, (java.lang.String) r2, (java.lang.Throwable) r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajlj.a(android.accounts.Account, int, boolean, java.lang.String):java.util.List");
    }

    public final void b(Account account, String str, boolean z, String str2) {
        String valueOf = String.valueOf(str);
        ajmz a2 = ajna.a(account, valueOf.length() == 0 ? new String("com.google.android.gms+settings+") : "com.google.android.gms+settings+".concat(valueOf));
        a2.e();
        Boolean valueOf2 = Boolean.valueOf(z);
        a2.h = valueOf2;
        a2.g = valueOf2;
        a2.d();
        a2.q = str2;
        this.a.a.a("PrefService.setHistoryEnabled", a2.a(), "ui_update");
        StringBuilder sb = new StringBuilder(50);
        sb.append("UlrClearcutEvents.logLocationHistoryEnabled(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        if (ajjd.a()) {
            ajjd.a.i(z);
        }
    }

    public final void a(Account account, String str, boolean z, String str2) {
        String valueOf = String.valueOf(str);
        ajmz a2 = ajna.a(account, valueOf.length() == 0 ? new String("com.google.android.gms+settings+") : "com.google.android.gms+settings+".concat(valueOf));
        a2.e();
        a2.g = Boolean.valueOf(z);
        a2.d();
        a2.q = str2;
        this.a.a.a("PrefService.setReportingEnabled", a2.a(), "ui_update");
        StringBuilder sb = new StringBuilder(52);
        sb.append("UlrClearcutEvents.logLocationReportingEnabled(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        if (ajjd.a()) {
            ajjd.a.h(z);
        }
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                ReportingConfig a2 = this.a.a.a();
                parcel2.writeNoException();
                bhx.b(parcel2, a2);
                return true;
            case 2:
                AccountConfig a3 = a((Account) bhx.a(parcel, Account.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a3);
                return true;
            case 3:
                a((Account) bhx.a(parcel, Account.CREATOR), parcel.readString(), bhx.a(parcel), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                b((Account) bhx.a(parcel, Account.CREATOR), parcel.readString(), bhx.a(parcel), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5:
                List b = b((Account) bhx.a(parcel, Account.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(b);
                return true;
            case 6:
                List a4 = a((Account) bhx.a(parcel, Account.CREATOR), parcel.readInt(), bhx.a(parcel), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a4);
                return true;
            default:
                return false;
        }
    }
}
