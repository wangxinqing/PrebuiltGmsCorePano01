package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: aauj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aauj extends aanp {
    private final zzw a;
    private final String b;
    private final byte[] d;
    private final aauk e;

    static {
        aauj.class.getSimpleName();
    }

    public aauj(Context context, zzw zzw, String str, byte[] bArr) {
        super(context, "rharesult");
        this.a = zzw;
        this.b = str;
        this.d = bArr;
        this.e = aauk.a(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fa, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.b     // Catch:{ RemoteException -> 0x0131, Exception -> 0x012a }
            byte[] r1 = r8.d     // Catch:{ RemoteException -> 0x0131, Exception -> 0x012a }
            java.util.Set r2 = com.google.android.gms.security.snet.SafetyNetClientChimeraService.b     // Catch:{ RemoteException -> 0x0131, Exception -> 0x012a }
            aaae r3 = new aaae     // Catch:{ RemoteException -> 0x0131, Exception -> 0x012a }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0131, Exception -> 0x012a }
            oq r0 = defpackage.oq.a(r0, r3)     // Catch:{ RemoteException -> 0x0131, Exception -> 0x012a }
            boolean r0 = r2.contains(r0)     // Catch:{ RemoteException -> 0x0131, Exception -> 0x012a }
            if (r0 != 0) goto L_0x0020
            com.google.android.gms.common.api.Status r9 = new com.google.android.gms.common.api.Status     // Catch:{ RemoteException -> 0x0131, Exception -> 0x012a }
            r0 = 12018(0x2ef2, float:1.6841E-41)
            r9.<init>(r0)     // Catch:{ RemoteException -> 0x0131, Exception -> 0x012a }
            r8.b(r9)     // Catch:{ RemoteException -> 0x0131, Exception -> 0x012a }
            return
        L_0x0020:
            aauk r0 = r8.e     // Catch:{ RemoteException -> 0x0131, Exception -> 0x012a }
            monitor-enter(r0)     // Catch:{ RemoteException -> 0x0131, Exception -> 0x012a }
            aauk r1 = r8.e     // Catch:{ all -> 0x0127 }
            zzw r2 = r8.a     // Catch:{ all -> 0x0127 }
            r1.a((defpackage.zzw) r2)     // Catch:{ all -> 0x0127 }
            aauk r1 = r8.e     // Catch:{ all -> 0x0127 }
            r1.c()     // Catch:{ all -> 0x0127 }
            aauk r1 = r8.e     // Catch:{ all -> 0x0127 }
            boolean r1 = r1.f()     // Catch:{ all -> 0x0127 }
            r2 = 12015(0x2eef, float:1.6837E-41)
            if (r1 != 0) goto L_0x0102
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0127 }
            java.lang.String r3 = "com.google.android.vending.verifier.ACTION_REMOVE_HARMFUL_APP"
            r1.<init>(r3)     // Catch:{ all -> 0x0127 }
            java.lang.String r3 = "com.android.vending"
            r1.setPackage(r3)     // Catch:{ all -> 0x0127 }
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r3)     // Catch:{ all -> 0x0127 }
            boolean r3 = defpackage.jkr.b()     // Catch:{ all -> 0x0127 }
            if (r3 != 0) goto L_0x0053
            r3 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0055
        L_0x0053:
            r3 = 131072(0x20000, float:1.83671E-40)
        L_0x0055:
            android.content.pm.PackageManager r4 = r9.getPackageManager()     // Catch:{ all -> 0x0127 }
            android.content.pm.ResolveInfo r3 = r4.resolveActivity(r1, r3)     // Catch:{ all -> 0x0127 }
            r4 = 0
            if (r3 == 0) goto L_0x00c1
            java.lang.String r5 = "com.android.vending"
            android.content.pm.ActivityInfo r3 = r3.activityInfo     // Catch:{ all -> 0x0127 }
            java.lang.String r3 = r3.name     // Catch:{ all -> 0x0127 }
            r1.setClassName(r5, r3)     // Catch:{ all -> 0x0127 }
            aaui r3 = defpackage.aaui.a((android.content.Context) r9)     // Catch:{ all -> 0x0127 }
            byte[] r5 = r8.d     // Catch:{ all -> 0x0127 }
            aauh r3 = r3.a((byte[]) r5)     // Catch:{ all -> 0x0127 }
            if (r3 == 0) goto L_0x00bf
            java.lang.String r3 = r3.c     // Catch:{ all -> 0x0127 }
            if (r3 == 0) goto L_0x007a
            goto L_0x0081
        L_0x007a:
            r3 = 2131953463(0x7f130737, float:1.9543398E38)
            java.lang.String r3 = r9.getString(r3)     // Catch:{ all -> 0x0127 }
        L_0x0081:
            java.lang.String r4 = "action"
            r5 = 5
            r1.putExtra(r4, r5)     // Catch:{ all -> 0x0127 }
            java.lang.String r4 = "message"
            r1.putExtra(r4, r3)     // Catch:{ all -> 0x0127 }
            java.lang.String r3 = "package_name"
            java.lang.String r4 = r8.b     // Catch:{ all -> 0x0127 }
            r1.putExtra(r3, r4)     // Catch:{ all -> 0x0127 }
            java.lang.String r3 = "digest"
            byte[] r4 = r8.d     // Catch:{ all -> 0x0127 }
            r1.putExtra(r3, r4)     // Catch:{ all -> 0x0127 }
            java.lang.String r3 = "pending_result_intent"
            int r4 = defpackage.aaul.b     // Catch:{ all -> 0x0127 }
            aauk r4 = defpackage.aauk.a(r9)     // Catch:{ all -> 0x0127 }
            int r4 = r4.d()     // Catch:{ all -> 0x0127 }
            r5 = 0
            java.lang.Class<com.google.android.gms.security.snet.OperationLauncherIntentOperation> r6 = com.google.android.gms.security.snet.OperationLauncherIntentOperation.class
            java.lang.String r7 = "com.google.android.gms.security.apis.verifyapps.PACKAGE_WARNING_RESULT"
            android.content.Intent r6 = com.google.android.chimera.IntentOperation.getStartIntent((android.content.Context) r9, (java.lang.Class) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0127 }
            java.lang.String r7 = "nonce"
            android.content.Intent r4 = r6.putExtra(r7, r4)     // Catch:{ all -> 0x0127 }
            r6 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r4 = android.app.PendingIntent.getService(r9, r5, r4, r6)     // Catch:{ all -> 0x0127 }
            r1.putExtra(r3, r4)     // Catch:{ all -> 0x0127 }
            goto L_0x00cc
        L_0x00bf:
            r1 = r4
            goto L_0x00cc
        L_0x00c1:
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0127 }
            r3 = 12017(0x2ef1, float:1.684E-41)
            r1.<init>(r3)     // Catch:{ all -> 0x0127 }
            r8.b(r1)     // Catch:{ all -> 0x0127 }
            r1 = r4
        L_0x00cc:
            if (r1 == 0) goto L_0x00fb
            aauk r3 = r8.e     // Catch:{ all -> 0x0127 }
            boolean r3 = r3.f()     // Catch:{ all -> 0x0127 }
            if (r3 != 0) goto L_0x00f1
            aauk r2 = r8.e     // Catch:{ all -> 0x0127 }
            r2.e()     // Catch:{ all -> 0x0127 }
            aauk r2 = r8.e     // Catch:{ all -> 0x0127 }
            java.lang.String r3 = r8.b     // Catch:{ all -> 0x0127 }
            r2.b = r3     // Catch:{ all -> 0x0127 }
            byte[] r3 = r8.d     // Catch:{ all -> 0x0127 }
            r2.c = r3     // Catch:{ all -> 0x0127 }
            aank r2 = defpackage.aank.a((android.content.Context) r9)     // Catch:{ all -> 0x0127 }
            r3 = 3
            r2.b(r3)     // Catch:{ all -> 0x0127 }
            r9.startActivity(r1)     // Catch:{ all -> 0x0127 }
            goto L_0x00f9
        L_0x00f1:
            com.google.android.gms.common.api.Status r9 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0127 }
            r9.<init>(r2)     // Catch:{ all -> 0x0127 }
            r8.b(r9)     // Catch:{ all -> 0x0127 }
        L_0x00f9:
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            return
        L_0x00fb:
            com.google.android.gms.common.api.Status r9 = com.google.android.gms.common.api.Status.c     // Catch:{ all -> 0x0127 }
            r8.b(r9)     // Catch:{ all -> 0x0127 }
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            return
        L_0x0102:
            byte[] r9 = r8.d     // Catch:{ all -> 0x0127 }
            aauk r1 = r8.e     // Catch:{ all -> 0x0127 }
            byte[] r1 = r1.c     // Catch:{ all -> 0x0127 }
            boolean r9 = java.util.Arrays.equals(r9, r1)     // Catch:{ all -> 0x0127 }
            if (r9 == 0) goto L_0x011d
            java.lang.String r9 = r8.b     // Catch:{ all -> 0x0127 }
            aauk r1 = r8.e     // Catch:{ all -> 0x0127 }
            java.lang.String r1 = r1.b     // Catch:{ all -> 0x0127 }
            boolean r9 = r9.equals(r1)     // Catch:{ all -> 0x0127 }
            if (r9 != 0) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            return
        L_0x011d:
            com.google.android.gms.common.api.Status r9 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0127 }
            r9.<init>(r2)     // Catch:{ all -> 0x0127 }
            r8.b(r9)     // Catch:{ all -> 0x0127 }
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            return
        L_0x0127:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            throw r9     // Catch:{ RemoteException -> 0x0131, Exception -> 0x012a }
        L_0x012a:
            r9 = move-exception
            com.google.android.gms.common.api.Status r9 = com.google.android.gms.common.api.Status.c
            r8.b(r9)
            return
        L_0x0131:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aauj.a(android.content.Context):void");
    }

    /* access modifiers changed from: protected */
    public final void b(Status status) {
        this.e.a(status, 0);
    }
}
