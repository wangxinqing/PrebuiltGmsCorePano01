package com.google.android.gms.phenotype.notification;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PackagesChangedIntentOperation extends IntentOperation {
    private static final jjg a = jjg.a(iyc.PHENOTYPE);
    private Context b;
    private yfg c;
    private agxh d;
    private PackageManager e;
    private hya f;

    public PackagesChangedIntentOperation() {
    }

    public final void onCreate() {
        this.b = this;
        this.c = yfg.a(ihs.b());
        this.e = getPackageManager();
        this.d = new agxh(this.e);
        this.f = hya.a((Context) this);
    }

    public final void onDestroy() {
        this.c.close();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "packageName = ? AND committed = 1"
            java.lang.String r2 = r19.getAction()
            java.lang.String r3 = "android.intent.action.PACKAGE_REMOVED"
            boolean r2 = r3.equals(r2)
            java.lang.String r4 = "android.intent.action.PACKAGE_DATA_CLEARED"
            java.lang.String r5 = "android.intent.action.PACKAGE_ADDED"
            if (r2 != 0) goto L_0x002a
            java.lang.String r2 = r19.getAction()
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x002a
            java.lang.String r2 = r19.getAction()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return
        L_0x002a:
            android.net.Uri r2 = r19.getData()
            if (r2 == 0) goto L_0x0035
            java.lang.String r2 = r2.getSchemeSpecificPart()
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            if (r2 == 0) goto L_0x0192
            java.lang.String r6 = r19.getAction()     // Catch:{ Exception -> 0x016c }
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x016c }
            java.lang.String r6 = "packageName"
            r7 = 1
            r8 = 0
            if (r3 != 0) goto L_0x0049
            r9 = r19
            goto L_0x0094
        L_0x0049:
            java.lang.String r3 = "android.intent.extra.REPLACING"
            r9 = r19
            boolean r3 = r9.getBooleanExtra(r3, r8)     // Catch:{ Exception -> 0x016a }
            if (r3 != 0) goto L_0x0094
            yfg r0 = r1.c     // Catch:{ Exception -> 0x016a }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ Exception -> 0x016a }
            java.lang.String[] r12 = new java.lang.String[r7]     // Catch:{ Exception -> 0x016a }
            r12[r8] = r6     // Catch:{ Exception -> 0x016a }
            java.lang.String[] r14 = new java.lang.String[r7]     // Catch:{ Exception -> 0x016a }
            r14[r8] = r2     // Catch:{ Exception -> 0x016a }
            java.lang.String r11 = "Packages"
            java.lang.String r13 = "androidPackageName = ?"
            r15 = 0
            r16 = 0
            r17 = 0
            r10 = r0
            android.database.Cursor r3 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x016a }
            r3.getCount()     // Catch:{ all -> 0x0086 }
        L_0x0072:
            boolean r4 = r3.moveToNext()     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x0080
            java.lang.String r4 = r3.getString(r8)     // Catch:{ all -> 0x0086 }
            defpackage.yih.a(r0, r4)     // Catch:{ all -> 0x0086 }
            goto L_0x0072
        L_0x0080:
            if (r3 == 0) goto L_0x0085
            r3.close()     // Catch:{ Exception -> 0x016a }
        L_0x0085:
            return
        L_0x0086:
            r0 = move-exception
            r4 = r0
            if (r3 == 0) goto L_0x0093
            r3.close()     // Catch:{ all -> 0x008e }
            goto L_0x0093
        L_0x008e:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r4, (java.lang.Throwable) r3)     // Catch:{ Exception -> 0x016a }
        L_0x0093:
            throw r4     // Catch:{ Exception -> 0x016a }
        L_0x0094:
            java.lang.String r3 = r19.getAction()     // Catch:{ Exception -> 0x016a }
            boolean r3 = r4.equals(r3)     // Catch:{ Exception -> 0x016a }
            if (r3 != 0) goto L_0x00e8
            java.lang.String r0 = r19.getAction()     // Catch:{ Exception -> 0x016a }
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x016a }
            if (r0 == 0) goto L_0x00e7
            boolean r0 = defpackage.ayzz.b()     // Catch:{ Exception -> 0x016a }
            if (r0 != 0) goto L_0x00b2
            r0 = 192(0xc0, float:2.69E-43)
            goto L_0x00b4
        L_0x00b2:
            r0 = 196(0xc4, float:2.75E-43)
        L_0x00b4:
            android.content.pm.PackageManager r3 = r1.e     // Catch:{ Exception -> 0x016a }
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r2, r0)     // Catch:{ Exception -> 0x016a }
            hya r3 = r1.f     // Catch:{ Exception -> 0x016a }
            boolean r3 = r3.a((android.content.pm.PackageInfo) r0)     // Catch:{ Exception -> 0x016a }
            if (r3 == 0) goto L_0x00e7
            agxh r3 = r1.d     // Catch:{ Exception -> 0x016a }
            java.util.List r0 = r3.a((android.content.pm.PackageInfo) r0)     // Catch:{ Exception -> 0x016a }
            boolean r3 = r0.isEmpty()     // Catch:{ Exception -> 0x016a }
            if (r3 != 0) goto L_0x00e7
            yhq r3 = new yhq     // Catch:{ Exception -> 0x016a }
            ygo r4 = new ygo     // Catch:{ Exception -> 0x016a }
            r4.<init>()     // Catch:{ Exception -> 0x016a }
            apgu[] r5 = new defpackage.apgu[r8]     // Catch:{ Exception -> 0x016a }
            java.lang.Object[] r0 = r0.toArray(r5)     // Catch:{ Exception -> 0x016a }
            apgu[] r0 = (defpackage.apgu[]) r0     // Catch:{ Exception -> 0x016a }
            r3.<init>(r4, r0)     // Catch:{ Exception -> 0x016a }
            android.content.Context r0 = r1.b     // Catch:{ Exception -> 0x016a }
            yfg r4 = r1.c     // Catch:{ Exception -> 0x016a }
            r3.a(r0, r4)     // Catch:{ Exception -> 0x016a }
        L_0x00e7:
            return
        L_0x00e8:
            yfg r3 = r1.c     // Catch:{ Exception -> 0x016a }
            android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch:{ Exception -> 0x016a }
            java.lang.String[] r12 = new java.lang.String[r7]     // Catch:{ Exception -> 0x016a }
            r12[r8] = r6     // Catch:{ Exception -> 0x016a }
            java.lang.String[] r14 = new java.lang.String[r7]     // Catch:{ Exception -> 0x016a }
            r14[r8] = r2     // Catch:{ Exception -> 0x016a }
            java.lang.String r11 = "Packages"
            java.lang.String r13 = "androidPackageName = ?"
            r15 = 0
            r16 = 0
            r17 = 0
            r10 = r3
            android.database.Cursor r4 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x016a }
            r4.getCount()     // Catch:{ all -> 0x015c }
        L_0x0107:
            boolean r5 = r4.moveToNext()     // Catch:{ all -> 0x015c }
            if (r5 == 0) goto L_0x0156
            java.lang.String r5 = r4.getString(r8)     // Catch:{ all -> 0x015c }
            ayzv r6 = defpackage.ayzv.a     // Catch:{ all -> 0x015c }
            ayzw r6 = r6.a()     // Catch:{ all -> 0x015c }
            java.lang.String r6 = r6.a()     // Catch:{ all -> 0x015c }
            boolean r6 = defpackage.yge.a(r6, r5)     // Catch:{ all -> 0x015c }
            if (r6 != 0) goto L_0x0107
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ all -> 0x015c }
            r6[r8] = r5     // Catch:{ all -> 0x015c }
            r3.beginTransaction()     // Catch:{ all -> 0x015c }
            java.lang.String r5 = "ExperimentTokens"
            java.lang.String r10 = "packageName = ? AND isCommitted = 1"
            r3.delete(r5, r10, r6)     // Catch:{ all -> 0x0151 }
            java.lang.String r5 = "Flags"
            r3.delete(r5, r0, r6)     // Catch:{ all -> 0x0151 }
            java.lang.String r5 = "FlagOverrides"
            r3.delete(r5, r0, r6)     // Catch:{ all -> 0x0151 }
            java.lang.String r5 = "CrossLoggedExperimentTokens"
            java.lang.String r10 = "fromPackageName = ? AND isCommitted = 1"
            r3.delete(r5, r10, r6)     // Catch:{ all -> 0x0151 }
            java.lang.String r5 = "ApplicationStates"
            java.lang.String r10 = "packageName = ?"
            r3.delete(r5, r10, r6)     // Catch:{ all -> 0x0151 }
            r3.setTransactionSuccessful()     // Catch:{ all -> 0x0151 }
            r3.endTransaction()     // Catch:{ all -> 0x015c }
            defpackage.yhj.a()     // Catch:{ all -> 0x015c }
            goto L_0x0107
        L_0x0151:
            r0 = move-exception
            r3.endTransaction()     // Catch:{ all -> 0x015c }
            throw r0     // Catch:{ all -> 0x015c }
        L_0x0156:
            if (r4 == 0) goto L_0x015b
            r4.close()     // Catch:{ Exception -> 0x016a }
        L_0x015b:
            return
        L_0x015c:
            r0 = move-exception
            r3 = r0
            if (r4 == 0) goto L_0x0169
            r4.close()     // Catch:{ all -> 0x0164 }
            goto L_0x0169
        L_0x0164:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r4)     // Catch:{ Exception -> 0x016a }
        L_0x0169:
            throw r3     // Catch:{ Exception -> 0x016a }
        L_0x016a:
            r0 = move-exception
            goto L_0x016f
        L_0x016c:
            r0 = move-exception
            r9 = r19
        L_0x016f:
            jjg r3 = a
            anie r3 = r3.b()
            anih r3 = (defpackage.anih) r3
            r3.a((java.lang.Throwable) r0)
            r0 = 100
            java.lang.String r4 = "com.google.android.gms.phenotype.notification.PackagesChangedIntentOperation"
            java.lang.String r5 = "onHandleIntent"
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r3.a((java.lang.String) r4, (java.lang.String) r5, (int) r0, (java.lang.String) r6)
            anih r0 = (defpackage.anih) r0
            java.lang.String r3 = r19.getAction()
            java.lang.String r4 = "Could not manipulate package: %s with intent: %s"
            r0.a((java.lang.String) r4, (java.lang.Object) r2, (java.lang.Object) r3)
            return
        L_0x0192:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.notification.PackagesChangedIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    public PackagesChangedIntentOperation(Context context, yfg yfg, agxh agxh, PackageManager packageManager, hya hya) {
        this.b = context;
        this.c = yfg;
        this.d = agxh;
        this.e = packageManager;
        this.f = hya;
    }
}
