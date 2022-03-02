package defpackage;

import android.content.Context;
import com.google.android.chimera.IntentOperation;

/* renamed from: nhk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class nhk extends IntentOperation {
    protected Context a;

    /* access modifiers changed from: protected */
    public abstract void a(nhz nhz);

    public final void onCreate() {
        this.a = getApplicationContext();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a5, code lost:
        if (defpackage.axio.b() == r8.p) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r8 != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.getAction()
            java.lang.String r1 = "com.google.gservices.intent.action.GSERVICES_CHANGED"
            boolean r0 = r1.equals(r0)
            java.lang.String r1 = r8.getAction()
            java.lang.String r2 = "com.google.android.gms.phenotype.COMMITTED"
            boolean r1 = r2.equals(r1)
            java.lang.String r2 = "com.google.android.gms.fonts"
            r3 = 0
            if (r1 == 0) goto L_0x0027
            java.lang.String r1 = "com.google.android.gms.phenotype.PACKAGE_NAME"
            java.lang.String r8 = r8.getStringExtra(r1)
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x0027
            r8 = 1
            goto L_0x0028
        L_0x0027:
            r8 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            if (r8 == 0) goto L_0x0045
            goto L_0x0030
        L_0x002d:
            if (r8 != 0) goto L_0x0030
            return
        L_0x0030:
            android.content.Context r8 = r7.getBaseContext()
            android.content.ContentResolver r8 = r8.getContentResolver()
            android.net.Uri r0 = defpackage.yef.a((java.lang.String) r2)
            aguy r8 = defpackage.aguy.a(r8, r0)
            if (r8 == 0) goto L_0x0045
            r8.b()
        L_0x0045:
            nhz r8 = defpackage.nhz.a
            boolean r0 = defpackage.axir.d()
            boolean r1 = r8.l
            if (r0 == r1) goto L_0x0081
            boolean r0 = defpackage.axir.d()
            java.lang.String r1 = "GServicesReceiver"
            if (r0 == 0) goto L_0x0064
            android.content.Context r0 = r7.a
            defpackage.nib.a(r8, r0)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "update scheduler scheduled"
            defpackage.ngz.c(r1, r2, r0)
            goto L_0x0081
        L_0x0064:
            android.content.Context r0 = r7.a
            qwq r0 = defpackage.qwq.a((android.content.Context) r0)
            java.lang.String r2 = "FontsUpdateCheck"
            java.lang.String r4 = "com.google.android.gms.fonts.update.UpdateSchedulerService"
            r0.a((java.lang.String) r2, (java.lang.String) r4)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "FontsUpdateScheduler"
            java.lang.String r4 = "update cancelled"
            defpackage.ngz.c(r2, r4, r0)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "update scheduler cancelled"
            defpackage.ngz.c(r1, r2, r0)
        L_0x0081:
            boolean r0 = defpackage.axiu.c()
            boolean r1 = r8.m
            if (r0 != r1) goto L_0x00a7
            long r0 = defpackage.axiu.d()
            long r2 = r8.o
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0096
            goto L_0x0099
        L_0x0096:
            r8.d()
        L_0x0099:
            long r2 = r8.o
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00a7
            boolean r0 = defpackage.axio.b()
            boolean r1 = r8.p
            if (r0 == r1) goto L_0x00aa
        L_0x00a7:
            r7.a(r8)
        L_0x00aa:
            r8.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhk.onHandleIntent(android.content.Intent):void");
    }
}
