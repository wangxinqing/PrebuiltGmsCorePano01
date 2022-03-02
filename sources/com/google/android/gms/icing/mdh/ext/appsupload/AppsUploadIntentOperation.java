package com.google.android.gms.icing.mdh.ext.appsupload;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppsUploadIntentOperation extends IntentOperation {
    private pfa a;

    public final void onCreate() {
        if (((Boolean) pba.v.c()).booleanValue()) {
            this.a = pbx.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006b, code lost:
        if (((java.lang.Boolean) r1.a()).booleanValue() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009a, code lost:
        if (((java.lang.Boolean) r14.a.d().a()).booleanValue() != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b4, code lost:
        if (((java.lang.Boolean) r15.a()).booleanValue() == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0051, code lost:
        if (((java.lang.Boolean) r14.a.d().a()).booleanValue() != false) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r15) {
        /*
            r14 = this;
            pfa r0 = r14.a
            if (r0 == 0) goto L_0x013a
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r15.getAction()
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "Received intent with action %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = "AppsUpload"
            android.util.Log.i(r1, r0)
            java.lang.String r0 = r15.getAction()
            java.lang.String r1 = "android.intent.extra.REPLACING"
            boolean r15 = r15.getBooleanExtra(r1, r2)
            java.lang.String r1 = "android.intent.action.PACKAGE_ADDED"
            boolean r1 = r1.equals(r0)
            java.lang.String r3 = "Cannot return null from a non-@Nullable @Provides method"
            if (r1 == 0) goto L_0x0053
            aelh r1 = defpackage.pfd.a
            defpackage.awdx.a((java.lang.Object) r1, (java.lang.String) r3)
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x003f
            goto L_0x0053
        L_0x003f:
            if (r15 == 0) goto L_0x00d0
            pfa r1 = r14.a
            aelh r1 = r1.d()
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00d0
        L_0x0053:
            java.lang.String r1 = "android.intent.action.PACKAGE_CHANGED"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x006d
            aelh r1 = defpackage.pfe.a
            defpackage.awdx.a((java.lang.Object) r1, (java.lang.String) r3)
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x00d0
        L_0x006d:
            java.lang.String r1 = "android.intent.action.PACKAGE_REMOVED"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009c
            aelh r1 = defpackage.pff.a
            defpackage.awdx.a((java.lang.Object) r1, (java.lang.String) r3)
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0088
            goto L_0x009c
        L_0x0088:
            if (r15 == 0) goto L_0x00d0
            pfa r15 = r14.a
            aelh r15 = r15.d()
            java.lang.Object r15 = r15.a()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x00d0
        L_0x009c:
            java.lang.String r15 = "android.intent.action.PACKAGE_REPLACED"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x00b6
            aelh r15 = defpackage.pfg.a
            defpackage.awdx.a((java.lang.Object) r15, (java.lang.String) r3)
            java.lang.Object r15 = r15.a()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L_0x00d0
        L_0x00b6:
            java.lang.String r15 = "android.intent.action.LOCALE_CHANGED"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x0139
            aelh r15 = defpackage.pfc.a
            defpackage.awdx.a((java.lang.Object) r15, (java.lang.String) r3)
            java.lang.Object r15 = r15.a()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x0139
        L_0x00d0:
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            axti r15 = defpackage.axti.a
            axtj r15 = r15.a()
            boolean r15 = r15.d()
            java.lang.String r0 = "skip_upload_for_unchanged"
            r13.putBoolean(r0, r15)
            aelh r15 = defpackage.pfi.a
            defpackage.awdx.a((java.lang.Object) r15, (java.lang.String) r3)
            java.lang.Object r15 = r15.a()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x012f
            pfa r15 = r14.a
            afbt r4 = r15.e()
            aelh r15 = defpackage.pfj.a
            defpackage.awdx.a((java.lang.Object) r15, (java.lang.String) r3)
            java.lang.Object r15 = r15.a()
            java.lang.Long r15 = (java.lang.Long) r15
            long r6 = r15.longValue()
            aelh r15 = defpackage.pfk.a
            defpackage.awdx.a((java.lang.Object) r15, (java.lang.String) r3)
            java.lang.Object r15 = r15.a()
            java.lang.Long r15 = (java.lang.Long) r15
            long r8 = r15.longValue()
            aelh r15 = defpackage.pfh.a
            defpackage.awdx.a((java.lang.Object) r15, (java.lang.String) r3)
            r5 = 1
            r10 = 3
            java.lang.Object r15 = r15.a()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r11 = r15.booleanValue()
            r12 = 0
            r4.a(r5, r6, r8, r10, r11, r12, r13)
            return
        L_0x012f:
            pfa r15 = r14.a
            afbt r15 = r15.e()
            r0 = 3
            r15.a(r2, r0, r2, r13)
        L_0x0139:
            return
        L_0x013a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.icing.mdh.ext.appsupload.AppsUploadIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
