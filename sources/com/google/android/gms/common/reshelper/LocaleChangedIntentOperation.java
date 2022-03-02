package com.google.android.gms.common.reshelper;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocaleChangedIntentOperation extends IntentOperation {
    private final hol a;

    public LocaleChangedIntentOperation() {
        this.a = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Class<com.google.android.gms.common.reshelper.LocaleChangedIntentOperation> r2 = com.google.android.gms.common.reshelper.LocaleChangedIntentOperation.class
            ikz r0 = defpackage.iks.z
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0228
            java.lang.String r0 = r18.getAction()
            if (r0 == 0) goto L_0x0228
            int r3 = r0.hashCode()
            r4 = -19011148(0xfffffffffedde9b4, float:-1.4748642E38)
            java.lang.String r5 = "com.google.android.gms.common.LEMON_LOG"
            r6 = 0
            r7 = 1
            if (r3 == r4) goto L_0x0033
            r4 = 307286717(0x1250d2bd, float:6.589298E-28)
            if (r3 == r4) goto L_0x002b
            goto L_0x003d
        L_0x002b:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x0033:
            java.lang.String r3 = "android.intent.action.LOCALE_CHANGED"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x003d
            r0 = 0
            goto L_0x003e
        L_0x003d:
            r0 = -1
        L_0x003e:
            java.lang.String r3 = "LocaleChangeIO"
            java.lang.String r4 = "proto"
            if (r0 == 0) goto L_0x00a3
            if (r0 == r7) goto L_0x0048
            goto L_0x0228
        L_0x0048:
            r0 = r18
            byte[] r0 = r0.getByteArrayExtra(r4)
            if (r0 == 0) goto L_0x00a2
            aohl r2 = defpackage.aohl.u
            aucd r2 = r2.o()
            aubs r4 = defpackage.aubs.c()     // Catch:{ auda -> 0x009b }
            aohk r5 = defpackage.aohk.f     // Catch:{ auda -> 0x009b }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r5, (byte[]) r0, (defpackage.aubs) r4)     // Catch:{ auda -> 0x009b }
            aohk r0 = (defpackage.aohk) r0     // Catch:{ auda -> 0x009b }
            boolean r4 = r2.c     // Catch:{ auda -> 0x009b }
            if (r4 != 0) goto L_0x0068
            goto L_0x006d
        L_0x0068:
            r2.c()     // Catch:{ auda -> 0x009b }
            r2.c = r6     // Catch:{ auda -> 0x009b }
        L_0x006d:
            aucj r4 = r2.b     // Catch:{ auda -> 0x009b }
            aohl r4 = (defpackage.aohl) r4     // Catch:{ auda -> 0x009b }
            r0.getClass()     // Catch:{ auda -> 0x009b }
            r4.l = r0     // Catch:{ auda -> 0x009b }
            int r0 = r4.a     // Catch:{ auda -> 0x009b }
            r0 = r0 | 64
            r4.a = r0     // Catch:{ auda -> 0x009b }
            hol r0 = r1.a
            if (r0 != 0) goto L_0x0089
            iwu r0 = defpackage.iwt.a()
            hol r0 = r0.b(r1)
            goto L_0x008a
        L_0x0089:
        L_0x008a:
            aucj r2 = r2.i()
            hoi r0 = r0.a((defpackage.audx) r2)
            r2 = 13
            r0.b((int) r2)
            r0.b()
            return
        L_0x009b:
            r0 = move-exception
            java.lang.String r0 = "Dropping malformed log event"
            android.util.Log.w(r3, r0)
            return
        L_0x00a2:
            return
        L_0x00a3:
            android.content.res.Resources r0 = r17.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r8 = r0.getLanguage()
            aohk r0 = defpackage.aohk.f
            aucd r9 = r0.o()
            boolean r0 = r9.c
            if (r0 == 0) goto L_0x00c0
            r9.c()
            r9.c = r6
        L_0x00c0:
            aucj r0 = r9.b
            aohk r0 = (defpackage.aohk) r0
            r0.b = r7
            int r10 = r0.a
            r10 = r10 | r7
            r0.a = r10
            r8.getClass()
            r11 = 2
            r10 = r10 | r11
            r0.a = r10
            r0.c = r8
            long r12 = android.os.SystemClock.uptimeMillis()
            android.content.res.Resources r0 = r17.getResources()     // Catch:{ IOException -> 0x019d }
            java.lang.String r10 = r17.getPackageName()     // Catch:{ IOException -> 0x019d }
            boolean r0 = defpackage.apen.a((android.content.res.Resources) r0, (java.lang.String) r10)     // Catch:{ IOException -> 0x019d }
            if (r0 == 0) goto L_0x0138
            android.content.res.Resources r0 = r17.getResources()     // Catch:{ IOException -> 0x019d }
            java.lang.String r7 = r17.getPackageName()     // Catch:{ IOException -> 0x019d }
            boolean r0 = defpackage.apen.a((android.content.res.Resources) r0, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ IOException -> 0x019d }
            if (r0 == 0) goto L_0x0136
            android.content.Context r0 = defpackage.apeo.a(r17)     // Catch:{ IOException -> 0x019d }
            java.lang.String r7 = defpackage.apen.a(r8)     // Catch:{ IOException -> 0x019d }
            java.lang.String r15 = r0.getPackageCodePath()     // Catch:{ IOException -> 0x019d }
            java.lang.String r7 = defpackage.apen.a((android.content.Context) r0, (java.lang.String) r7, (java.lang.String) r15)     // Catch:{ IOException -> 0x019d }
            java.io.File r15 = new java.io.File     // Catch:{ IOException -> 0x019d }
            java.io.File r16 = r0.getFilesDir()     // Catch:{ IOException -> 0x019d }
            java.lang.String r14 = java.lang.String.valueOf(r16)     // Catch:{ IOException -> 0x019d }
            java.lang.String r16 = java.lang.String.valueOf(r14)     // Catch:{ IOException -> 0x019d }
            int r10 = r16.length()     // Catch:{ IOException -> 0x019d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x019d }
            r6.<init>(r10)     // Catch:{ IOException -> 0x019d }
            r6.append(r14)     // Catch:{ IOException -> 0x019d }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x019d }
            r15.<init>(r6, r7)     // Catch:{ IOException -> 0x019d }
            boolean r6 = r15.exists()     // Catch:{ IOException -> 0x019d }
            if (r6 != 0) goto L_0x0134
            android.content.res.AssetManager r6 = r17.getAssets()     // Catch:{ IOException -> 0x019d }
            defpackage.apen.a((android.content.Context) r0, (android.content.res.AssetManager) r6, (java.lang.String) r8)     // Catch:{ IOException -> 0x019d }
            r7 = 2
            goto L_0x0139
        L_0x0134:
            r7 = 3
            goto L_0x0139
        L_0x0136:
            r7 = 4
            goto L_0x0139
        L_0x0138:
        L_0x0139:
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ RuntimeException -> 0x019b }
            if (r7 == r11) goto L_0x0140
            goto L_0x0159
        L_0x0140:
            long r14 = r14 - r12
            int r0 = (int) r14     // Catch:{ RuntimeException -> 0x019b }
            boolean r6 = r9.c     // Catch:{ RuntimeException -> 0x019b }
            if (r6 != 0) goto L_0x0147
            goto L_0x014d
        L_0x0147:
            r9.c()     // Catch:{ RuntimeException -> 0x019b }
            r6 = 0
            r9.c = r6     // Catch:{ RuntimeException -> 0x019b }
        L_0x014d:
            aucj r6 = r9.b     // Catch:{ RuntimeException -> 0x019b }
            aohk r6 = (defpackage.aohk) r6     // Catch:{ RuntimeException -> 0x019b }
            int r10 = r6.a     // Catch:{ RuntimeException -> 0x019b }
            r12 = 4
            r10 = r10 | r12
            r6.a = r10     // Catch:{ RuntimeException -> 0x019b }
            r6.d = r0     // Catch:{ RuntimeException -> 0x019b }
        L_0x0159:
            android.content.Intent r0 = com.google.android.chimera.IntentOperation.getStartIntent((android.content.Context) r1, (java.lang.Class) r2, (java.lang.String) r5)
            if (r0 == 0) goto L_0x0171
            aucj r2 = r9.i()
            aohk r2 = (defpackage.aohk) r2
            byte[] r2 = r2.k()
            android.content.Intent r0 = r0.putExtra(r4, r2)
            r1.startService(r0)
        L_0x0171:
            if (r7 != r11) goto L_0x0174
            goto L_0x0179
        L_0x0174:
            r0 = 3
            if (r7 == r0) goto L_0x0179
            goto L_0x020f
        L_0x0179:
            java.lang.String r0 = "Requesting GmsCore restart due to change in locale assets"
            android.util.Log.i(r3, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "com.google.android.gms.common.LANGUAGE_RELOAD"
            r0.<init>(r2)
            java.lang.String r2 = r17.getPackageName()
            android.content.Intent r0 = r0.setPackage(r2)
            java.lang.String r2 = "lang"
            android.content.Intent r0 = r0.putExtra(r2, r8)
            r1.sendBroadcast(r0)
            return
        L_0x0198:
            r0 = move-exception
            goto L_0x0210
        L_0x019b:
            r0 = move-exception
            goto L_0x01a6
        L_0x019d:
            r0 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ RuntimeException -> 0x019b }
            java.lang.String r7 = "Failed to extract language"
            r6.<init>(r7, r0)     // Catch:{ RuntimeException -> 0x019b }
            throw r6     // Catch:{ RuntimeException -> 0x019b }
        L_0x01a6:
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0198 }
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0198 }
            int r6 = r6.length()     // Catch:{ all -> 0x0198 }
            int r6 = r6 + 29
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0198 }
            int r7 = r7.length()     // Catch:{ all -> 0x0198 }
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0198 }
            r7.<init>(r6)     // Catch:{ all -> 0x0198 }
            java.lang.String r6 = "Failed extracting language "
            r7.append(r6)     // Catch:{ all -> 0x0198 }
            r7.append(r8)     // Catch:{ all -> 0x0198 }
            java.lang.String r6 = ": "
            r7.append(r6)     // Catch:{ all -> 0x0198 }
            r7.append(r0)     // Catch:{ all -> 0x0198 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0198 }
            android.util.Log.e(r3, r6)     // Catch:{ all -> 0x0198 }
            if (r0 != 0) goto L_0x01dc
            goto L_0x01f6
        L_0x01dc:
            boolean r3 = r9.c     // Catch:{ all -> 0x0198 }
            if (r3 != 0) goto L_0x01e1
            goto L_0x01e7
        L_0x01e1:
            r9.c()     // Catch:{ all -> 0x0198 }
            r3 = 0
            r9.c = r3     // Catch:{ all -> 0x0198 }
        L_0x01e7:
            aucj r3 = r9.b     // Catch:{ all -> 0x0198 }
            aohk r3 = (defpackage.aohk) r3     // Catch:{ all -> 0x0198 }
            r0.getClass()     // Catch:{ all -> 0x0198 }
            int r6 = r3.a     // Catch:{ all -> 0x0198 }
            r6 = r6 | 8
            r3.a = r6     // Catch:{ all -> 0x0198 }
            r3.e = r0     // Catch:{ all -> 0x0198 }
        L_0x01f6:
            android.content.Intent r0 = com.google.android.chimera.IntentOperation.getStartIntent((android.content.Context) r1, (java.lang.Class) r2, (java.lang.String) r5)
            if (r0 == 0) goto L_0x020f
            aucj r2 = r9.i()
            aohk r2 = (defpackage.aohk) r2
            byte[] r2 = r2.k()
            android.content.Intent r0 = r0.putExtra(r4, r2)
            r1.startService(r0)
            return
        L_0x020f:
            return
        L_0x0210:
            android.content.Intent r2 = com.google.android.chimera.IntentOperation.getStartIntent((android.content.Context) r1, (java.lang.Class) r2, (java.lang.String) r5)
            if (r2 == 0) goto L_0x0227
            aucj r3 = r9.i()
            aohk r3 = (defpackage.aohk) r3
            byte[] r3 = r3.k()
            android.content.Intent r2 = r2.putExtra(r4, r3)
            r1.startService(r2)
        L_0x0227:
            throw r0
        L_0x0228:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.reshelper.LocaleChangedIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    protected LocaleChangedIntentOperation(hol hol) {
        this.a = hol;
    }
}
