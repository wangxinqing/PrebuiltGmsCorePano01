package defpackage;

import android.content.Context;

/* renamed from: aegs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aegs extends aeif {
    final /* synthetic */ int a;
    final /* synthetic */ aeha b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aegs(aeha aeha, Context context, aeia aeia, String[] strArr, int i) {
        super(context, aeia, strArr);
        this.b = aeha;
        this.a = i;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
        if (((java.lang.Boolean) defpackage.aeic.a(r0).a("isLeEnabled", new java.lang.Class[0]).b(new java.lang.Object[0])).booleanValue() == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005a, code lost:
        if (r0.getState() != 12) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r9) {
        /*
            r8 = this;
            int r9 = r8.a
            aeha r0 = r8.b
            int r1 = defpackage.aeha.h
            aejv r0 = r0.a
            android.bluetooth.BluetoothAdapter r0 = r0.a
            boolean r1 = r0.isEnabled()
            r2 = 15
            r3 = 12
            if (r1 != 0) goto L_0x0062
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r1 < r4) goto L_0x005d
            aeic r1 = defpackage.aeic.a(r0)     // Catch:{ aeid -> 0x0037 }
            java.lang.String r4 = "isLeEnabled"
            r5 = 0
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ aeid -> 0x0037 }
            aeib r1 = r1.a(r4, r6)     // Catch:{ aeid -> 0x0037 }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ aeid -> 0x0037 }
            java.lang.Object r1 = r1.b(r4)     // Catch:{ aeid -> 0x0037 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ aeid -> 0x0037 }
            boolean r1 = r1.booleanValue()     // Catch:{ aeid -> 0x0037 }
            if (r1 != 0) goto L_0x0036
            goto L_0x005d
        L_0x0036:
            goto L_0x0064
        L_0x0037:
            r1 = move-exception
            anil r4 = defpackage.aehd.a
            anie r4 = r4.d()
            anih r4 = (defpackage.anih) r4
            r4.a((java.lang.Throwable) r1)
            r1 = 1613(0x64d, float:2.26E-42)
            java.lang.String r5 = "aeha"
            java.lang.String r6 = "d"
            java.lang.String r7 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r1 = r4.a((java.lang.String) r5, (java.lang.String) r6, (int) r1, (java.lang.String) r7)
            anih r1 = (defpackage.anih) r1
            java.lang.String r4 = "Can't call isLeEnabled"
            r1.a((java.lang.String) r4)
            int r1 = r0.getState()
            if (r1 != r3) goto L_0x005d
            goto L_0x0064
        L_0x005d:
            int r2 = r0.getState()
            goto L_0x0064
        L_0x0062:
            r2 = 12
        L_0x0064:
            if (r9 != r2) goto L_0x0069
            r8.close()
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aegs.a(android.content.Intent):void");
    }
}
