package defpackage;

import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;

/* renamed from: hec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hec extends IntentOperation {
    private final boolean a;

    protected hec() {
        this(false);
    }

    public static final boolean b() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* access modifiers changed from: protected */
    public void a(Intent intent) {
    }

    /* access modifiers changed from: protected */
    public void a(Intent intent, int i) {
    }

    /* access modifiers changed from: protected */
    public void a(Intent intent, boolean z) {
    }

    /* access modifiers changed from: protected */
    public void b(Intent intent) {
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r7) {
        /*
            r6 = this;
            boolean r0 = r6.a
            if (r0 == 0) goto L_0x0005
            goto L_0x0007
        L_0x0005:
            int r0 = defpackage.jhg.a
        L_0x0007:
            java.lang.String r0 = r7.getAction()
            defpackage.amtf.a((java.lang.Object) r0)
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 0
            r4 = 2
            r5 = 1
            switch(r1) {
                case -905063602: goto L_0x0038;
                case 438946629: goto L_0x002e;
                case 798292259: goto L_0x0024;
                case 2069809336: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0042
        L_0x001a:
            java.lang.String r1 = "com.google.android.chimera.IntentOperation.NEW_MODULE"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0042
            r1 = 2
            goto L_0x0043
        L_0x0024:
            java.lang.String r1 = "android.intent.action.BOOT_COMPLETED"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0042
            r1 = 1
            goto L_0x0043
        L_0x002e:
            java.lang.String r1 = "com.google.android.gms.chimera.container.CONTAINER_UPDATED"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0042
            r1 = 3
            goto L_0x0043
        L_0x0038:
            java.lang.String r1 = "android.intent.action.LOCKED_BOOT_COMPLETED"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0042
            r1 = 0
            goto L_0x0043
        L_0x0042:
            r1 = -1
        L_0x0043:
            if (r1 == 0) goto L_0x00ad
            if (r1 == r5) goto L_0x0097
            r5 = 8
            if (r1 == r4) goto L_0x0082
            if (r1 == r2) goto L_0x0069
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "Dropping unexpected action "
            int r1 = r7.length()
            if (r1 != 0) goto L_0x005f
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0)
            goto L_0x0063
        L_0x005f:
            java.lang.String r7 = r0.concat(r7)
        L_0x0063:
            java.lang.String r0 = "ModuleInitIntentOp"
            android.util.Log.w(r0, r7)
            return
        L_0x0069:
            com.google.android.chimera.config.ModuleManager r0 = com.google.android.chimera.config.ModuleManager.get(r6)
            com.google.android.chimera.config.ModuleManager$ModuleApkInfo r0 = r0.getCurrentModuleApk()
            java.lang.String r0 = r0.apkPackageName
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r0.equals(r1)
            r6.b(r7)
            if (r0 != 0) goto L_0x0081
            r6.a((android.content.Intent) r7, (int) r5)
        L_0x0081:
            return
        L_0x0082:
            java.lang.String r0 = "containerUpdated"
            boolean r0 = r7.getBooleanExtra(r0, r3)
            r6.a((android.content.Intent) r7, (boolean) r0)
            if (r0 != 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r3 = 8
        L_0x0091:
            r0 = r3 | 4
            r6.a((android.content.Intent) r7, (int) r0)
            return
        L_0x0097:
            boolean r0 = b()
            if (r0 != 0) goto L_0x00a0
            r6.c()
        L_0x00a0:
            r6.a(r7)
            boolean r0 = b()
            r0 = r0 ^ r5
            r0 = r0 | r4
            r6.a((android.content.Intent) r7, (int) r0)
            return
        L_0x00ad:
            r6.c()
            r6.a((android.content.Intent) r7, (int) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hec.onHandleIntent(android.content.Intent):void");
    }

    protected hec(boolean z) {
        this.a = z;
    }
}
