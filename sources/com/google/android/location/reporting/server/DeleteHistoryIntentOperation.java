package com.google.android.location.reporting.server;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeleteHistoryIntentOperation extends IntentOperation {
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x029a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x029b, code lost:
        r5 = r0;
        r2 = r26;
        r4 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02c3, code lost:
        r2 = r26;
        r4 = r27;
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        defpackage.ajjd.b(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02cc, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02cd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02cf, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02d0, code lost:
        r2 = r26;
        r4 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02d6, code lost:
        r2 = r26;
        r4 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02dc, code lost:
        r2 = r26;
        r4 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02e2, code lost:
        r2 = r26;
        r4 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02f9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02fa, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02fe, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x030b, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c8, code lost:
        r1 = r0;
        r2 = r26;
        r4 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01da, code lost:
        r5 = r0;
        r29 = r2;
        r2 = r1;
        r1 = r29;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:76:0x01c6, B:108:0x027f] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:76:0x01c6, B:85:0x01ea, B:87:0x01ec, B:132:0x02c9] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:76:0x01c6, B:85:0x01ea] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02cf A[ExcHandler: all (th java.lang.Throwable), PHI: r26 r27 
      PHI: (r26v3 android.os.Messenger) = (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v5 android.os.Messenger), (r26v5 android.os.Messenger), (r26v5 android.os.Messenger) binds: [B:105:0x0279, B:113:0x02a3, B:114:?, B:85:0x01ea, B:86:?, B:87:0x01ec] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r27v3 android.os.Message) = (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v5 android.os.Message), (r27v5 android.os.Message), (r27v5 android.os.Message) binds: [B:105:0x0279, B:113:0x02a3, B:114:?, B:85:0x01ea, B:86:?, B:87:0x01ec] A[DONT_GENERATE, DONT_INLINE], Splitter:B:85:0x01ea] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02d5 A[ExcHandler: IOException (e java.io.IOException), PHI: r26 r27 
      PHI: (r26v2 android.os.Messenger) = (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v5 android.os.Messenger), (r26v5 android.os.Messenger), (r26v5 android.os.Messenger), (r26v12 android.os.Messenger), (r26v12 android.os.Messenger) binds: [B:105:0x0279, B:113:0x02a3, B:114:?, B:108:0x027f, B:109:?, B:85:0x01ea, B:86:?, B:87:0x01ec, B:76:0x01c6, B:77:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r27v2 android.os.Message) = (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v5 android.os.Message), (r27v5 android.os.Message), (r27v5 android.os.Message), (r27v11 android.os.Message), (r27v11 android.os.Message) binds: [B:105:0x0279, B:113:0x02a3, B:114:?, B:108:0x027f, B:109:?, B:85:0x01ea, B:86:?, B:87:0x01ec, B:76:0x01c6, B:77:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:76:0x01c6] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02db A[ExcHandler: babk (e babk), PHI: r26 r27 
      PHI: (r26v1 android.os.Messenger) = (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v5 android.os.Messenger), (r26v5 android.os.Messenger), (r26v12 android.os.Messenger), (r26v12 android.os.Messenger) binds: [B:105:0x0279, B:113:0x02a3, B:114:?, B:108:0x027f, B:109:?, B:85:0x01ea, B:86:?, B:76:0x01c6, B:77:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r27v1 android.os.Message) = (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v5 android.os.Message), (r27v5 android.os.Message), (r27v11 android.os.Message), (r27v11 android.os.Message) binds: [B:105:0x0279, B:113:0x02a3, B:114:?, B:108:0x027f, B:109:?, B:85:0x01ea, B:86:?, B:76:0x01c6, B:77:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:76:0x01c6] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02f9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0020] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02fd A[ExcHandler: IOException (e java.io.IOException), Splitter:B:1:0x0020] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0308 A[ExcHandler: babk (e babk), Splitter:B:1:0x0020] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019c A[Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185, all -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a1 A[Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185, all -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01bb A[Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185, all -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c0 A[Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185, all -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c7 A[ExcHandler: all (r0v24 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r26 r27 
      PHI: (r26v6 android.os.Messenger) = (r26v4 android.os.Messenger), (r26v4 android.os.Messenger), (r26v12 android.os.Messenger), (r26v12 android.os.Messenger) binds: [B:108:0x027f, B:109:?, B:76:0x01c6, B:77:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r27v6 android.os.Message) = (r27v4 android.os.Message), (r27v4 android.os.Message), (r27v11 android.os.Message), (r27v11 android.os.Message) binds: [B:108:0x027f, B:109:?, B:76:0x01c6, B:77:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:76:0x01c6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r31) {
        /*
            r30 = this;
            r1 = r31
            defpackage.ajnw.a((android.content.Context) r30)
            ajld r2 = defpackage.ajld.a((android.content.Context) r30)
            java.lang.String r3 = "account"
            android.os.Parcelable r3 = r1.getParcelableExtra(r3)
            android.accounts.Account r3 = (android.accounts.Account) r3
            java.lang.String r4 = "messenger"
            android.os.Parcelable r1 = r1.getParcelableExtra(r4)
            android.os.Messenger r1 = (android.os.Messenger) r1
            android.os.Message r4 = android.os.Message.obtain()
            r5 = 0
            r4.what = r5
            ajmm r7 = r2.a     // Catch:{ eif -> 0x030a, babk -> 0x0308, IOException -> 0x02fd, all -> 0x02f9 }
            int r7 = r7.b((android.accounts.Account) r3)     // Catch:{ eif -> 0x030a, babk -> 0x0308, IOException -> 0x02fd, all -> 0x02f9 }
            java.lang.String r8 = r2.a((android.accounts.Account) r3)     // Catch:{ eif -> 0x030a, babk -> 0x0308, IOException -> 0x02fd, all -> 0x02f9 }
            boolean r9 = defpackage.azsy.d()     // Catch:{ eif -> 0x02e7, babk -> 0x0308, IOException -> 0x02fd, all -> 0x02f9 }
            if (r9 != 0) goto L_0x01e2
            ajkr r9 = r2.b     // Catch:{ eif -> 0x01d9, babk -> 0x0308, IOException -> 0x02fd, all -> 0x02f9 }
            com.google.android.ulr.ApiClientInfo r11 = r9.a()     // Catch:{ eif -> 0x01d9, babk -> 0x0308, IOException -> 0x02fd, all -> 0x02f9 }
            com.google.android.ulr.DeleteApiLocationsRequest r15 = new com.google.android.ulr.DeleteApiLocationsRequest     // Catch:{ eif -> 0x01d9, babk -> 0x0308, IOException -> 0x02fd, all -> 0x02f9 }
            r15.<init>(r11)     // Catch:{ eif -> 0x01d9, babk -> 0x0308, IOException -> 0x02fd, all -> 0x02f9 }
            android.content.Context r11 = r9.i     // Catch:{ eif -> 0x01d9, babk -> 0x0308, IOException -> 0x02fd, all -> 0x02f9 }
            ajkx r11 = defpackage.ajkq.a(r11)     // Catch:{ eif -> 0x01d9, babk -> 0x0308, IOException -> 0x02fd, all -> 0x02f9 }
            alky r12 = new alky     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            r12.<init>(r11)     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            android.content.Context r13 = r9.i     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            com.google.android.gms.common.internal.ClientContext r13 = defpackage.ajkr.a(r13, r3)     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            ajkw r14 = defpackage.ajkp.a     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            r11.m = r14     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            java.lang.String r11 = defpackage.ajkr.f     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            java.lang.String r14 = defpackage.ajkr.d     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            java.lang.String r16 = defpackage.ajkr.c     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            java.lang.String r17 = "noRestriction"
            int r6 = r9.j     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            java.lang.Boolean r5 = r9.n     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            java.lang.String r18 = defpackage.ajkr.h     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            java.lang.String r19 = defpackage.ajkr.g     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            int r10 = r9.l     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            r20 = 2023(0x7e7, float:2.835E-42)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r20)     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            int r21 = defpackage.ajkr.a     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            java.lang.Integer r21 = java.lang.Integer.valueOf(r21)     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            int r9 = r9.k     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            java.lang.String r22 = defpackage.ajkr.b     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            boolean r23 = defpackage.azss.e()     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            if (r23 == 0) goto L_0x008b
            java.lang.String r23 = "android"
            goto L_0x008d
        L_0x008b:
            r23 = 0
        L_0x008d:
            java.lang.String r24 = defpackage.ajkr.e     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            r25 = r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            r15.<init>()     // Catch:{ eif -> 0x01ad, VolleyError -> 0x018e, all -> 0x0185 }
            r26 = r1
            java.util.Formatter r1 = new java.util.Formatter     // Catch:{ eif -> 0x0183, VolleyError -> 0x0181, all -> 0x017f }
            r1.<init>(r15)     // Catch:{ eif -> 0x0183, VolleyError -> 0x0181, all -> 0x017f }
            r28 = r2
            r27 = r4
            r4 = 1
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            r7 = 0
            r2[r7] = r4     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            java.lang.String r4 = "deletes/%1$s"
            r1.format(r4, r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            if (r8 == 0) goto L_0x00bb
            java.lang.String r1 = "androidGcmRegistrationId"
            java.lang.String r2 = defpackage.iyv.a(r8)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            defpackage.iyv.a((java.lang.StringBuilder) r15, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
        L_0x00bb:
            if (r11 == 0) goto L_0x00c6
            java.lang.String r1 = "brand"
            java.lang.String r2 = defpackage.iyv.a(r11)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            defpackage.iyv.a((java.lang.StringBuilder) r15, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
        L_0x00c6:
            if (r14 == 0) goto L_0x00d1
            java.lang.String r1 = "device"
            java.lang.String r2 = defpackage.iyv.a(r14)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            defpackage.iyv.a((java.lang.StringBuilder) r15, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
        L_0x00d1:
            if (r16 != 0) goto L_0x00d4
            goto L_0x00dd
        L_0x00d4:
            java.lang.String r1 = "devicePrettyName"
            java.lang.String r2 = defpackage.iyv.a(r16)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            defpackage.iyv.a((java.lang.StringBuilder) r15, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
        L_0x00dd:
            java.lang.String r1 = "deviceRestriction"
            java.lang.String r2 = defpackage.iyv.a(r17)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            defpackage.iyv.a((java.lang.StringBuilder) r15, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            java.lang.String r1 = "gmsVersion"
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            defpackage.iyv.a((java.lang.StringBuilder) r15, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            if (r5 == 0) goto L_0x00fa
            java.lang.String r1 = "isLowRam"
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            defpackage.iyv.a((java.lang.StringBuilder) r15, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
        L_0x00fa:
            if (r18 == 0) goto L_0x0105
            java.lang.String r1 = "manufacturer"
            java.lang.String r2 = defpackage.iyv.a(r18)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            defpackage.iyv.a((java.lang.StringBuilder) r15, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
        L_0x0105:
            if (r19 != 0) goto L_0x0108
            goto L_0x0111
        L_0x0108:
            java.lang.String r1 = "model"
            java.lang.String r2 = defpackage.iyv.a(r19)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            defpackage.iyv.a((java.lang.StringBuilder) r15, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
        L_0x0111:
            java.lang.String r1 = "moduleVersion"
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            defpackage.iyv.a((java.lang.StringBuilder) r15, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            java.lang.String r1 = "nlpVersion"
            java.lang.String r2 = java.lang.String.valueOf(r20)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            defpackage.iyv.a((java.lang.StringBuilder) r15, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            java.lang.String r1 = "osLevel"
            java.lang.String r2 = java.lang.String.valueOf(r21)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            defpackage.iyv.a((java.lang.StringBuilder) r15, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            java.lang.String r1 = "packageVersion"
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            defpackage.iyv.a((java.lang.StringBuilder) r15, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            if (r22 == 0) goto L_0x0140
            java.lang.String r1 = "platform"
            java.lang.String r2 = defpackage.iyv.a(r22)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            defpackage.iyv.a((java.lang.StringBuilder) r15, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
        L_0x0140:
            if (r23 == 0) goto L_0x014b
            java.lang.String r1 = "platformType"
            java.lang.String r2 = defpackage.iyv.a(r23)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            defpackage.iyv.a((java.lang.StringBuilder) r15, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
        L_0x014b:
            if (r24 != 0) goto L_0x014e
            goto L_0x0157
        L_0x014e:
            java.lang.String r1 = "product"
            java.lang.String r2 = defpackage.iyv.a(r24)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            defpackage.iyv.a((java.lang.StringBuilder) r15, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
        L_0x0157:
            java.lang.String r15 = r15.toString()     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            izb r12 = r12.a     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            r14 = 1
            java.lang.Class<com.google.android.ulr.DeleteApiLocationsReply> r17 = com.google.android.ulr.DeleteApiLocationsReply.class
            r1 = r25
            r16 = r1
            jag r1 = r12.a((com.google.android.gms.common.internal.ClientContext) r13, (int) r14, (java.lang.String) r15, (java.lang.Object) r16, (java.lang.Class) r17)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            com.google.android.ulr.DeleteApiLocationsReply r1 = (com.google.android.ulr.DeleteApiLocationsReply) r1     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            com.google.android.ulr.ApiSettings r1 = r1.getSettings()     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            r2 = 1
            defpackage.ajjd.b((boolean) r2)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            ajkh r1 = defpackage.ajkh.a((android.accounts.Account) r3, (com.google.android.ulr.ApiSettings) r1)     // Catch:{ eif -> 0x017d, VolleyError -> 0x017b }
            r2 = r1
            r1 = r28
            goto L_0x0279
        L_0x017b:
            r0 = move-exception
            goto L_0x0195
        L_0x017d:
            r0 = move-exception
            goto L_0x01b4
        L_0x017f:
            r0 = move-exception
            goto L_0x0188
        L_0x0181:
            r0 = move-exception
            goto L_0x0191
        L_0x0183:
            r0 = move-exception
            goto L_0x01b0
        L_0x0185:
            r0 = move-exception
            r26 = r1
        L_0x0188:
            r28 = r2
            r27 = r4
        L_0x018c:
            r1 = r0
            goto L_0x01c6
        L_0x018e:
            r0 = move-exception
            r26 = r1
        L_0x0191:
            r28 = r2
            r27 = r4
        L_0x0195:
            r1 = r0
            boolean r2 = defpackage.azte.d()     // Catch:{ all -> 0x01c4 }
            if (r2 != 0) goto L_0x01a1
            r2 = 0
            defpackage.ajjd.b((boolean) r2)     // Catch:{ all -> 0x01c4 }
            goto L_0x01a4
        L_0x01a1:
            defpackage.ajjd.a((java.lang.Throwable) r1)     // Catch:{ all -> 0x01c4 }
        L_0x01a4:
            defpackage.ajkr.a(r1)     // Catch:{ all -> 0x01c4 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x01c4 }
            r2.<init>(r1)     // Catch:{ all -> 0x01c4 }
            throw r2     // Catch:{ all -> 0x01c4 }
        L_0x01ad:
            r0 = move-exception
            r26 = r1
        L_0x01b0:
            r28 = r2
            r27 = r4
        L_0x01b4:
            r1 = r0
            boolean r2 = defpackage.azte.d()     // Catch:{ all -> 0x01c4 }
            if (r2 != 0) goto L_0x01c0
            r2 = 0
            defpackage.ajjd.b((boolean) r2)     // Catch:{ all -> 0x01c4 }
            goto L_0x01c3
        L_0x01c0:
            defpackage.ajjd.a((java.lang.Throwable) r1)     // Catch:{ all -> 0x01c4 }
        L_0x01c3:
            throw r1     // Catch:{ all -> 0x01c4 }
        L_0x01c4:
            r0 = move-exception
            goto L_0x018c
        L_0x01c6:
            throw r1     // Catch:{ eif -> 0x01cf, babk -> 0x02db, IOException -> 0x02d5, all -> 0x01c7 }
        L_0x01c7:
            r0 = move-exception
            r1 = r0
            r2 = r26
            r4 = r27
            goto L_0x0317
        L_0x01cf:
            r0 = move-exception
            r5 = r0
            r2 = r26
            r4 = r27
            r1 = r28
            goto L_0x02ee
        L_0x01d9:
            r0 = move-exception
            r5 = r0
            r29 = r2
            r2 = r1
            r1 = r29
            goto L_0x02ee
        L_0x01e2:
            r26 = r1
            r28 = r2
            r27 = r4
            r1 = r28
            ajkj r2 = r1.c     // Catch:{ eif -> 0x02e1, babk -> 0x02db, IOException -> 0x02d5, all -> 0x02cf }
            atdy r4 = defpackage.atdy.d     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            aucd r4 = r4.o()     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            boolean r5 = r4.c     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            if (r5 != 0) goto L_0x01f7
            goto L_0x01fd
        L_0x01f7:
            r4.c()     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            r5 = 0
            r4.c = r5     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
        L_0x01fd:
            aucj r5 = r4.b     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            atdy r5 = (defpackage.atdy) r5     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            int r6 = r5.a     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            r9 = 1
            r6 = r6 | r9
            r5.a = r6     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            r5.b = r7     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            aucd r5 = r2.a((java.lang.String) r8, (boolean) r9)     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            aucj r5 = r5.i()     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            atbz r5 = (defpackage.atbz) r5     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            boolean r6 = r4.c     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            if (r6 != 0) goto L_0x0218
            goto L_0x021e
        L_0x0218:
            r4.c()     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            r6 = 0
            r4.c = r6     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
        L_0x021e:
            aucj r6 = r4.b     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            atdy r6 = (defpackage.atdy) r6     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            r5.getClass()     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            r6.c = r5     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            int r5 = r6.a     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            r7 = 2
            r5 = r5 | r7
            r6.a = r5     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            aucj r4 = r4.i()     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            r12 = r4
            atdy r12 = (defpackage.atdy) r12     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            r4 = 0
            defpackage.ajjd.a((long) r4)     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            ajlf r4 = defpackage.ajkj.j     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            android.content.Context r2 = r2.i     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            com.google.android.gms.common.internal.ClientContext r11 = defpackage.ajkj.a((android.content.Context) r2, (android.accounts.Account) r3)     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            baaj r2 = defpackage.ajlf.g     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            if (r2 == 0) goto L_0x0246
            goto L_0x025c
        L_0x0246:
            baai r2 = defpackage.baai.UNARY     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            java.lang.String r5 = "userlocation.UserLocationReportingService/DeleteApiLocations"
            atdy r6 = defpackage.atdy.d     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            baah r6 = defpackage.baoq.a(r6)     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            atdx r7 = defpackage.atdx.b     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            baah r7 = defpackage.baoq.a(r7)     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            baaj r2 = defpackage.baaj.a(r2, r5, r6, r7)     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            defpackage.ajlf.g = r2     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
        L_0x025c:
            izd r9 = r4.a     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            baaj r10 = defpackage.ajlf.g     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            r13 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            java.lang.Object r2 = r9.a(r10, r11, r12, r13, r15)     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            atdx r2 = (defpackage.atdx) r2     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            r4 = 1
            defpackage.ajjd.b((boolean) r4)     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            atdl r2 = r2.a     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
            if (r2 == 0) goto L_0x0273
            goto L_0x0275
        L_0x0273:
            atdl r2 = defpackage.atdl.j     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
        L_0x0275:
            ajkh r2 = defpackage.ajkh.a((android.accounts.Account) r3, (defpackage.atdl) r2)     // Catch:{ babk -> 0x02c2, eif -> 0x02c0, IOException -> 0x02d5, all -> 0x02cf }
        L_0x0279:
            boolean r4 = defpackage.ajld.b(r2)     // Catch:{ eif -> 0x02e1, babk -> 0x02db, IOException -> 0x02d5, all -> 0x02cf }
            if (r4 == 0) goto L_0x02a1
            r1.a((android.accounts.Account) r3, (java.lang.String) r8)     // Catch:{ eif -> 0x029a, babk -> 0x02db, IOException -> 0x02d5, all -> 0x01c7 }
            r1.a((defpackage.ajkh) r2)     // Catch:{ eif -> 0x029a, babk -> 0x02db, IOException -> 0x02d5, all -> 0x01c7 }
            ajmm r2 = r1.a     // Catch:{ eif -> 0x029a, babk -> 0x02db, IOException -> 0x02d5, all -> 0x01c7 }
            ajmp r2 = r2.b     // Catch:{ eif -> 0x029a, babk -> 0x02db, IOException -> 0x02d5, all -> 0x01c7 }
            java.lang.String r4 = defpackage.ajmp.f(r3)     // Catch:{ eif -> 0x029a, babk -> 0x02db, IOException -> 0x02d5, all -> 0x01c7 }
            android.content.SharedPreferences r2 = r2.a     // Catch:{ eif -> 0x029a, babk -> 0x02db, IOException -> 0x02d5, all -> 0x01c7 }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ eif -> 0x029a, babk -> 0x02db, IOException -> 0x02d5, all -> 0x01c7 }
            r2.remove(r4)     // Catch:{ eif -> 0x029a, babk -> 0x02db, IOException -> 0x02d5, all -> 0x01c7 }
            r2.apply()     // Catch:{ eif -> 0x029a, babk -> 0x02db, IOException -> 0x02d5, all -> 0x01c7 }
            goto L_0x02a1
        L_0x029a:
            r0 = move-exception
            r5 = r0
            r2 = r26
            r4 = r27
            goto L_0x02ee
        L_0x02a1:
            r2 = 1
            r1.a((android.accounts.Account) r3, (boolean) r2)     // Catch:{ eif -> 0x02e1, babk -> 0x02db, IOException -> 0x02d5, all -> 0x02cf }
            r4 = r27
            r4.what = r2     // Catch:{ eif -> 0x02bc, babk -> 0x02ba, IOException -> 0x02b6, all -> 0x02b2 }
            r2 = r26
            r2.send(r4)     // Catch:{ RemoteException -> 0x02b0 }
            return
        L_0x02b0:
            r0 = move-exception
            return
        L_0x02b2:
            r0 = move-exception
            r2 = r26
            goto L_0x02fb
        L_0x02b6:
            r0 = move-exception
            r2 = r26
            goto L_0x02ff
        L_0x02ba:
            r0 = move-exception
            goto L_0x02bd
        L_0x02bc:
            r0 = move-exception
        L_0x02bd:
            r2 = r26
            goto L_0x030c
        L_0x02c0:
            r0 = move-exception
            goto L_0x02c3
        L_0x02c2:
            r0 = move-exception
        L_0x02c3:
            r2 = r26
            r4 = r27
            r5 = r0
            r6 = 0
            defpackage.ajjd.b((boolean) r6)     // Catch:{ eif -> 0x02cd, babk -> 0x02f5, IOException -> 0x02f3 }
            throw r5     // Catch:{ eif -> 0x02cd, babk -> 0x02f5, IOException -> 0x02f3 }
        L_0x02cd:
            r0 = move-exception
            goto L_0x02ed
        L_0x02cf:
            r0 = move-exception
            r2 = r26
            r4 = r27
            goto L_0x02fb
        L_0x02d5:
            r0 = move-exception
            r2 = r26
            r4 = r27
            goto L_0x02ff
        L_0x02db:
            r0 = move-exception
            r2 = r26
            r4 = r27
            goto L_0x030c
        L_0x02e1:
            r0 = move-exception
            r2 = r26
            r4 = r27
            goto L_0x02ed
        L_0x02e7:
            r0 = move-exception
            r29 = r2
            r2 = r1
            r1 = r29
        L_0x02ed:
            r5 = r0
        L_0x02ee:
            r6 = 0
            r1.a((android.accounts.Account) r3, (boolean) r6)     // Catch:{ eif -> 0x02f7, babk -> 0x02f5, IOException -> 0x02f3 }
            throw r5     // Catch:{ eif -> 0x02f7, babk -> 0x02f5, IOException -> 0x02f3 }
        L_0x02f3:
            r0 = move-exception
            goto L_0x02ff
        L_0x02f5:
            r0 = move-exception
            goto L_0x030c
        L_0x02f7:
            r0 = move-exception
            goto L_0x030c
        L_0x02f9:
            r0 = move-exception
            r2 = r1
        L_0x02fb:
            r1 = r0
            goto L_0x0317
        L_0x02fd:
            r0 = move-exception
            r2 = r1
        L_0x02ff:
            r1 = 3
            r4.what = r1     // Catch:{ all -> 0x0315 }
            r2.send(r4)     // Catch:{ RemoteException -> 0x0306 }
            return
        L_0x0306:
            r0 = move-exception
            return
        L_0x0308:
            r0 = move-exception
            goto L_0x030b
        L_0x030a:
            r0 = move-exception
        L_0x030b:
            r2 = r1
        L_0x030c:
            r1 = 2
            r4.what = r1     // Catch:{ all -> 0x0315 }
            r2.send(r4)     // Catch:{ RemoteException -> 0x0313 }
            return
        L_0x0313:
            r0 = move-exception
            return
        L_0x0315:
            r0 = move-exception
            goto L_0x02fb
        L_0x0317:
            r2.send(r4)     // Catch:{ RemoteException -> 0x031b }
            goto L_0x031c
        L_0x031b:
            r0 = move-exception
        L_0x031c:
            goto L_0x031e
        L_0x031d:
            throw r1
        L_0x031e:
            goto L_0x031d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.location.reporting.server.DeleteHistoryIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
