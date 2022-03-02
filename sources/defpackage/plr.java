package defpackage;

import android.content.Intent;

/* renamed from: plr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class plr implements Runnable {
    private final plt a;
    private final Intent b;

    public plr(plt plt, Intent intent) {
        this.a = plt;
        this.b = intent;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017d A[SYNTHETIC, Splitter:B:74:0x017d] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01a8 A[SYNTHETIC, Splitter:B:88:0x01a8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            plt r2 = r1.a
            android.content.Intent r0 = r1.b
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 42
            r5.<init>(r4)
            java.lang.String r4 = "AppsCorpus Got package manager broadcast: "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            defpackage.pnz.a(r3)
            java.lang.String r3 = r0.getAction()
            android.net.Uri r4 = r0.getData()
            if (r4 == 0) goto L_0x003b
            android.net.Uri r4 = r0.getData()
            java.lang.String r4 = r4.getSchemeSpecificPart()
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            int r6 = r3.hashCode()
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 0
            r11 = 1
            switch(r6) {
                case -810471698: goto L_0x0071;
                case -19011148: goto L_0x0067;
                case 172491798: goto L_0x005d;
                case 525384130: goto L_0x0053;
                case 1544582882: goto L_0x0049;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x007b
        L_0x0049:
            java.lang.String r6 = "android.intent.action.PACKAGE_ADDED"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x0053:
            java.lang.String r6 = "android.intent.action.PACKAGE_REMOVED"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x007b
            r3 = 0
            goto L_0x007c
        L_0x005d:
            java.lang.String r6 = "android.intent.action.PACKAGE_CHANGED"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x007b
            r3 = 3
            goto L_0x007c
        L_0x0067:
            java.lang.String r6 = "android.intent.action.LOCALE_CHANGED"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x007b
            r3 = 4
            goto L_0x007c
        L_0x0071:
            java.lang.String r6 = "android.intent.action.PACKAGE_REPLACED"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x007b
            r3 = 2
            goto L_0x007c
        L_0x007b:
            r3 = -1
        L_0x007c:
            if (r3 == 0) goto L_0x00aa
            if (r3 == r11) goto L_0x00a7
            if (r3 == r9) goto L_0x00a7
            if (r3 == r8) goto L_0x0096
            if (r3 == r7) goto L_0x0088
            goto L_0x01b8
        L_0x0088:
            java.lang.String r0 = "AppsCorpus::handleLocaleChanged"
            defpackage.pnz.a(r0)
            boolean r0 = r2.b()
            if (r0 != 0) goto L_0x01a0
            goto L_0x01b8
        L_0x0096:
            android.content.Context r0 = r2.a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            boolean r0 = defpackage.plw.a((android.content.pm.PackageManager) r0, (java.lang.String) r4)
            r3 = r0
            if (r0 != 0) goto L_0x00a5
            r0 = 1
            goto L_0x00b2
        L_0x00a5:
            r0 = 0
            goto L_0x00b2
        L_0x00a7:
            r0 = 0
            r3 = 1
            goto L_0x00b2
        L_0x00aa:
            java.lang.String r3 = "android.intent.extra.REPLACING"
            boolean r0 = r0.getBooleanExtra(r3, r10)
            r0 = r0 ^ r11
            r3 = 0
        L_0x00b2:
            if (r0 == 0) goto L_0x0110
            pnr r0 = r2.b
            java.util.List r0 = r0.b()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r5 = r0.iterator()
        L_0x00c3:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00ea
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            android.content.ComponentName r7 = android.content.ComponentName.unflattenFromString(r6)
            if (r7 != 0) goto L_0x00d9
            r5.remove()
            goto L_0x00c3
        L_0x00d9:
            java.lang.String r7 = r7.getPackageName()
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x00c3
            r3.add(r6)
            r5.remove()
            goto L_0x00c3
        L_0x00ea:
            long r5 = r2.e()
            pnr r7 = r2.b
            r7.a(r3, r8, r5)
            pnr r7 = r2.b
            r7.a((java.lang.Iterable) r0)
            int r0 = r3.size()
            long r7 = (long) r0
            long r5 = r5 + r7
            r2.a((long) r5)
            int r0 = r3.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "AppsCorpus::handlePackageRemoved: Removed package %s, number of removed components %d"
            defpackage.pnz.a((java.lang.String) r3, (java.lang.Object) r4, (java.lang.Object) r0)
            goto L_0x01a0
        L_0x0110:
            if (r3 == 0) goto L_0x01b8
            android.content.Context r0 = r2.a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            amzy r3 = defpackage.plw.b(r0, r4)
            long r6 = r2.e()
            pnr r0 = r2.b
            java.util.List r8 = defpackage.plw.a((java.lang.Iterable) r3)
            r0.a(r8, r9, r6)
            pnr r8 = r2.b
            java.util.List r0 = defpackage.plw.a((java.lang.Iterable) r3)
            java.lang.Object r9 = defpackage.pnr.a
            monitor-enter(r9)
            java.io.PrintWriter r12 = new java.io.PrintWriter     // Catch:{ IOException -> 0x0172, all -> 0x016e }
            java.io.BufferedWriter r13 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0172, all -> 0x016e }
            java.io.FileWriter r14 = new java.io.FileWriter     // Catch:{ IOException -> 0x0172, all -> 0x016e }
            android.content.Context r15 = r8.b     // Catch:{ IOException -> 0x0172, all -> 0x016e }
            java.lang.String r5 = r8.d     // Catch:{ IOException -> 0x0172, all -> 0x016e }
            java.io.File r5 = r15.getFileStreamPath(r5)     // Catch:{ IOException -> 0x0172, all -> 0x016e }
            r14.<init>(r5, r11)     // Catch:{ IOException -> 0x0172, all -> 0x016e }
            r13.<init>(r14)     // Catch:{ IOException -> 0x0172, all -> 0x016e }
            r12.<init>(r13)     // Catch:{ IOException -> 0x0172, all -> 0x016e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x016b, all -> 0x0167 }
        L_0x014d:
            boolean r5 = r0.hasNext()     // Catch:{ IOException -> 0x016b, all -> 0x0167 }
            if (r5 == 0) goto L_0x015d
            java.lang.Object r5 = r0.next()     // Catch:{ IOException -> 0x016b, all -> 0x0167 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x016b, all -> 0x0167 }
            r12.println(r5)     // Catch:{ IOException -> 0x016b, all -> 0x0167 }
            goto L_0x014d
        L_0x015d:
            r12.close()     // Catch:{ RuntimeException -> 0x0161 }
            goto L_0x0189
        L_0x0161:
            r0 = move-exception
            java.lang.String r0 = "Failed to close component name file %s"
            java.lang.String r5 = r8.d     // Catch:{ all -> 0x01b5 }
            goto L_0x0186
        L_0x0167:
            r0 = move-exception
            r2 = r0
            r5 = r12
            goto L_0x01a6
        L_0x016b:
            r0 = move-exception
            r5 = r12
            goto L_0x0174
        L_0x016e:
            r0 = move-exception
            r2 = r0
            r5 = 0
            goto L_0x01a6
        L_0x0172:
            r0 = move-exception
            r5 = 0
        L_0x0174:
            java.lang.String r11 = "Failed to append to component name file."
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x01a4 }
            defpackage.pnz.a((java.lang.Throwable) r0, (java.lang.String) r11, (java.lang.Object[]) r10)     // Catch:{ all -> 0x01a4 }
            if (r5 == 0) goto L_0x0189
            r5.close()     // Catch:{ RuntimeException -> 0x0181 }
            goto L_0x0189
        L_0x0181:
            r0 = move-exception
            java.lang.String r0 = "Failed to close component name file %s"
            java.lang.String r5 = r8.d     // Catch:{ all -> 0x01b5 }
        L_0x0186:
            defpackage.pnz.a((java.lang.String) r0, (java.lang.Object) r5)     // Catch:{ all -> 0x01b5 }
        L_0x0189:
            monitor-exit(r9)     // Catch:{ all -> 0x01b5 }
            int r0 = r3.size()
            long r8 = (long) r0
            long r6 = r6 + r8
            r2.a((long) r6)
            int r0 = r3.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "AppsCorpus::handlePackageAdded: Added package %s, number of added components %d"
            defpackage.pnz.c(r3, r4, r0)
        L_0x01a0:
            r2.c()
            return
        L_0x01a4:
            r0 = move-exception
            r2 = r0
        L_0x01a6:
            if (r5 == 0) goto L_0x01b4
            r5.close()     // Catch:{ RuntimeException -> 0x01ac }
            goto L_0x01b4
        L_0x01ac:
            r0 = move-exception
            java.lang.String r0 = "Failed to close component name file %s"
            java.lang.String r3 = r8.d     // Catch:{ all -> 0x01b5 }
            defpackage.pnz.a((java.lang.String) r0, (java.lang.Object) r3)     // Catch:{ all -> 0x01b5 }
        L_0x01b4:
            throw r2     // Catch:{ all -> 0x01b5 }
        L_0x01b5:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01b5 }
            throw r0
        L_0x01b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plr.run():void");
    }
}
