package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.Collection;

/* renamed from: qef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qef implements qei {
    private static final qfn a = new qfn("DevManagerRouterBackendClient");
    private final Context b;
    private final qei c;

    public qef(Context context, qei qei) {
        this.b = context;
        this.c = qei;
    }

    public final aorr a(Account account, Collection collection) {
        return this.c.a(account, collection);
    }

    public final aorr a(avwo avwo, Account account) {
        return this.c.a(avwo, account);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aorr a(java.lang.String r9, int r10, int r11, java.util.List r12) {
        /*
            r8 = this;
            r0 = 0
            android.content.Context r1 = r8.b     // Catch:{ auda -> 0x0074 }
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch:{ auda -> 0x0074 }
            android.net.Uri r1 = defpackage.qln.a     // Catch:{ auda -> 0x0074 }
            android.net.Uri$Builder r1 = r1.buildUpon()     // Catch:{ auda -> 0x0074 }
            java.lang.String r3 = "getAppSplits"
            android.net.Uri$Builder r1 = r1.appendPath(r3)     // Catch:{ auda -> 0x0074 }
            java.lang.String r3 = "packageName"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r9)     // Catch:{ auda -> 0x0074 }
            java.lang.String r3 = "versionCode"
            java.lang.String r4 = java.lang.Integer.toString(r10)     // Catch:{ auda -> 0x0074 }
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r4)     // Catch:{ auda -> 0x0074 }
            android.net.Uri r3 = r1.build()     // Catch:{ auda -> 0x0074 }
            r1 = 1
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ auda -> 0x0074 }
            java.lang.String r5 = "appSplits"
            r4[r0] = r5     // Catch:{ auda -> 0x0074 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ auda -> 0x0074 }
            if (r2 != 0) goto L_0x0038
            goto L_0x005a
        L_0x0038:
            boolean r3 = r2.moveToFirst()     // Catch:{ auda -> 0x0074 }
            if (r3 == 0) goto L_0x005a
            qfn r3 = a     // Catch:{ auda -> 0x0074 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ auda -> 0x0074 }
            r1[r0] = r9     // Catch:{ auda -> 0x0074 }
            java.lang.String r4 = "AIA is sideloaded: %s"
            r3.a(r4, r1)     // Catch:{ auda -> 0x0074 }
            byte[] r1 = r2.getBlob(r0)     // Catch:{ auda -> 0x0074 }
            aubs r2 = defpackage.aubs.b()     // Catch:{ auda -> 0x0074 }
            araq r3 = defpackage.araq.m     // Catch:{ auda -> 0x0074 }
            aucj r1 = defpackage.aucj.a((defpackage.aucj) r3, (byte[]) r1, (defpackage.aubs) r2)     // Catch:{ auda -> 0x0074 }
            araq r1 = (defpackage.araq) r1     // Catch:{ auda -> 0x0074 }
            goto L_0x0066
        L_0x005a:
            qfn r2 = a     // Catch:{ auda -> 0x0074 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ auda -> 0x0074 }
            r1[r0] = r9     // Catch:{ auda -> 0x0074 }
            java.lang.String r3 = "AIA is not sideloaded, checking if live in prod: %s"
            r2.a(r3, r1)     // Catch:{ auda -> 0x0074 }
            r1 = 0
        L_0x0066:
            if (r1 != 0) goto L_0x006f
            qei r0 = r8.c
            aorr r9 = r0.a((java.lang.String) r9, (int) r10, (int) r11, (java.util.List) r12)
            return r9
        L_0x006f:
            aorr r9 = defpackage.aorl.a((java.lang.Object) r1)
            return r9
        L_0x0074:
            r9 = move-exception
            qfn r10 = a
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "failed GetAppSplitsResponse proto is invalid"
            r10.a(r9, r12, r11)
            babl r9 = new babl
            babj r10 = defpackage.babj.n
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qef.a(java.lang.String, int, int, java.util.List):aorr");
    }

    public final aorr a(byte[] bArr, Account account, avwm avwm, Collection collection) {
        if (!axuy.a.a().k()) {
            return this.c.a(bArr, account, avwm, collection);
        }
        a.a("Domain filter fallback is disabled.", new Object[0]);
        return aorl.a((Object) araw.m);
    }
}
