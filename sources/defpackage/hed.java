package defpackage;

import com.google.android.chimera.IntentOperation;

/* renamed from: hed  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hed extends IntentOperation {
    private final boolean a;

    public hed(boolean z) {
        this.a = z;
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
    }

    /* access modifiers changed from: protected */
    public void b(String str) {
    }

    /* access modifiers changed from: protected */
    public void c(String str) {
    }

    /* access modifiers changed from: protected */
    public void d(String str) {
    }

    /* access modifiers changed from: protected */
    public void e(String str) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r0.equals("android.intent.action.PACKAGE_ADDED") != false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getAction()
            defpackage.amtf.a((java.lang.Object) r0)
            android.net.Uri r1 = r10.getData()
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = r1.getSchemeSpecificPart()
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.lang.String r2 = "PackageIntentOp"
            if (r1 != 0) goto L_0x0019
            goto L_0x00aa
        L_0x0019:
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L_0x00aa
            java.lang.String r3 = "android.intent.extra.REPLACING"
            r4 = 0
            boolean r10 = r10.getBooleanExtra(r3, r4)
            int r3 = r0.hashCode()
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r3) {
                case -810471698: goto L_0x0059;
                case 172491798: goto L_0x004f;
                case 267468725: goto L_0x0045;
                case 525384130: goto L_0x003b;
                case 1544582882: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0063
        L_0x0032:
            java.lang.String r3 = "android.intent.action.PACKAGE_ADDED"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0063
            goto L_0x0064
        L_0x003b:
            java.lang.String r3 = "android.intent.action.PACKAGE_REMOVED"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0063
            r4 = 3
            goto L_0x0064
        L_0x0045:
            java.lang.String r3 = "android.intent.action.PACKAGE_DATA_CLEARED"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0063
            r4 = 2
            goto L_0x0064
        L_0x004f:
            java.lang.String r3 = "android.intent.action.PACKAGE_CHANGED"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0063
            r4 = 1
            goto L_0x0064
        L_0x0059:
            java.lang.String r3 = "android.intent.action.PACKAGE_REPLACED"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0063
            r4 = 4
            goto L_0x0064
        L_0x0063:
            r4 = -1
        L_0x0064:
            if (r4 == 0) goto L_0x009e
            if (r4 == r8) goto L_0x009a
            if (r4 == r7) goto L_0x0096
            if (r4 == r6) goto L_0x008c
            if (r4 == r5) goto L_0x0088
            java.lang.String r10 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "Ignoring unexpected intent: "
            int r1 = r10.length()
            if (r1 != 0) goto L_0x0080
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0)
            goto L_0x0084
        L_0x0080:
            java.lang.String r10 = r0.concat(r10)
        L_0x0084:
            android.util.Log.w(r2, r10)
            return
        L_0x0088:
            r9.e(r1)
            return
        L_0x008c:
            if (r10 == 0) goto L_0x0092
            boolean r10 = r9.a
            if (r10 == 0) goto L_0x00a5
        L_0x0092:
            r9.d(r1)
            return
        L_0x0096:
            r9.c(r1)
            return
        L_0x009a:
            r9.b(r1)
            return
        L_0x009e:
            if (r10 == 0) goto L_0x00a6
            boolean r10 = r9.a
            if (r10 == 0) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            return
        L_0x00a6:
            r9.a(r1)
            return
        L_0x00aa:
            java.lang.String r10 = java.lang.String.valueOf(r0)
            int r10 = r10.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r10 = r10 + 42
            r1.<init>(r10)
            java.lang.String r10 = "Dropping "
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = " Intent with missing package name"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.util.Log.w(r2, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hed.onHandleIntent(android.content.Intent):void");
    }
}
