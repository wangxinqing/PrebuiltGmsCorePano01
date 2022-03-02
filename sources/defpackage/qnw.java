package defpackage;

import com.google.android.gms.ipa.appsindexer.IpaPackageBroadcastIntentOperation;

/* renamed from: qnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class qnw implements Runnable {
    private final IpaPackageBroadcastIntentOperation a;
    private final String b;

    public qnw(IpaPackageBroadcastIntentOperation ipaPackageBroadcastIntentOperation, String str) {
        this.a = ipaPackageBroadcastIntentOperation;
        this.b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x015e A[SYNTHETIC, Splitter:B:59:0x015e] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016e A[SYNTHETIC, Splitter:B:68:0x016e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            com.google.android.gms.ipa.appsindexer.IpaPackageBroadcastIntentOperation r0 = r11.a
            java.lang.String r1 = r11.b
            qns r0 = defpackage.qns.a((android.content.Context) r0)
            if (r0 == 0) goto L_0x017d
            ansz r2 = defpackage.ansz.k
            aucd r2 = r2.o()
            boolean r3 = r2.c
            r4 = 0
            if (r3 == 0) goto L_0x001a
            r2.c()
            r2.c = r4
        L_0x001a:
            aucj r3 = r2.b
            ansz r3 = (defpackage.ansz) r3
            r5 = 3
            int r6 = defpackage.ansy.a(r5)
            r3.a = r6
            long r6 = android.os.SystemClock.elapsedRealtime()
            android.content.pm.PackageManager r3 = r0.d
            amzy r1 = defpackage.qnt.b(r3, r1)
            if (r1 != 0) goto L_0x005d
            boolean r0 = r2.c
            if (r0 != 0) goto L_0x0036
            goto L_0x003b
        L_0x0036:
            r2.c()
            r2.c = r4
        L_0x003b:
            aucj r0 = r2.b
            ansz r0 = (defpackage.ansz) r0
            r1 = 4
            int r1 = defpackage.ansx.a(r1)
            r0.h = r1
            qoh r0 = defpackage.qoh.a()
            aucj r1 = r2.i()
            ansz r1 = (defpackage.ansz) r1
            r0.a((defpackage.ansz) r1)
            qoh r0 = defpackage.qoh.a()
            r1 = 30
            r0.a((int) r1)
            return
        L_0x005d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            anhk r1 = r1.listIterator()
        L_0x006b:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x008c
            java.lang.Object r9 = r1.next()
            qnj r9 = (defpackage.qnj) r9
            boolean r10 = r9.b()
            if (r10 == 0) goto L_0x0082
            android.content.ComponentName r10 = r9.c
            r8.add(r10)
        L_0x0082:
            aplu r9 = defpackage.qns.a((defpackage.qnj) r9)
            if (r9 == 0) goto L_0x006b
            r3.add(r9)
            goto L_0x006b
        L_0x008c:
            int r1 = r3.size()
            boolean r9 = r2.c
            if (r9 != 0) goto L_0x0095
            goto L_0x009a
        L_0x0095:
            r2.c()
            r2.c = r4
        L_0x009a:
            aucj r9 = r2.b
            ansz r9 = (defpackage.ansz) r9
            r9.b = r1
            int r1 = r3.size()
            if (r1 != 0) goto L_0x00dc
            boolean r0 = r2.c
            if (r0 == 0) goto L_0x00af
            r2.c()
            r2.c = r4
        L_0x00af:
            aucj r0 = r2.b
            ansz r0 = (defpackage.ansz) r0
            int r1 = defpackage.ansx.a(r5)
            r0.h = r1
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r6
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x00c3
            goto L_0x00c8
        L_0x00c3:
            r2.c()
            r2.c = r4
        L_0x00c8:
            aucj r3 = r2.b
            ansz r3 = (defpackage.ansz) r3
            r3.i = r0
            qoh r0 = defpackage.qoh.a()
            aucj r1 = r2.i()
            ansz r1 = (defpackage.ansz) r1
            r0.a((defpackage.ansz) r1)
            return
        L_0x00dc:
            aplf r1 = r0.b
            int r5 = r3.size()
            aplu[] r5 = new defpackage.aplu[r5]
            java.lang.Object[] r3 = r3.toArray(r5)
            aplu[] r3 = (defpackage.aplu[]) r3
            acwa r1 = r1.a((defpackage.aplu[]) r3)
            aucj r3 = r2.i()
            ansz r3 = (defpackage.ansz) r3
            acvv r3 = defpackage.qns.a(r6, r3)
            r1.a((defpackage.acvv) r3)
            aucj r2 = r2.i()
            ansz r2 = (defpackage.ansz) r2
            r3 = 31
            acvs r2 = defpackage.qns.a(r6, r2, r3)
            r1.a((defpackage.acvs) r2)
            qnu r0 = r0.c
            java.lang.Object r1 = defpackage.qnu.a
            monitor-enter(r1)
            r2 = 0
            r3 = 1
            java.io.PrintWriter r5 = new java.io.PrintWriter     // Catch:{ IOException -> 0x0154, all -> 0x0152 }
            java.io.BufferedWriter r6 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0154, all -> 0x0152 }
            java.io.FileWriter r7 = new java.io.FileWriter     // Catch:{ IOException -> 0x0154, all -> 0x0152 }
            android.content.Context r0 = r0.b     // Catch:{ IOException -> 0x0154, all -> 0x0152 }
            java.lang.String r9 = "apps_3p_corpus_component_names.txt"
            java.io.File r0 = r0.getFileStreamPath(r9)     // Catch:{ IOException -> 0x0154, all -> 0x0152 }
            r7.<init>(r0, r3)     // Catch:{ IOException -> 0x0154, all -> 0x0152 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0154, all -> 0x0152 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0154, all -> 0x0152 }
            java.util.Iterator r0 = r8.iterator()     // Catch:{ IOException -> 0x014f, all -> 0x014c }
        L_0x012c:
            boolean r2 = r0.hasNext()     // Catch:{ IOException -> 0x014f, all -> 0x014c }
            if (r2 == 0) goto L_0x0140
            java.lang.Object r2 = r0.next()     // Catch:{ IOException -> 0x014f, all -> 0x014c }
            android.content.ComponentName r2 = (android.content.ComponentName) r2     // Catch:{ IOException -> 0x014f, all -> 0x014c }
            java.lang.String r2 = r2.flattenToString()     // Catch:{ IOException -> 0x014f, all -> 0x014c }
            r5.println(r2)     // Catch:{ IOException -> 0x014f, all -> 0x014c }
            goto L_0x012c
        L_0x0140:
            r5.close()     // Catch:{ RuntimeException -> 0x0144 }
            goto L_0x0169
        L_0x0144:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x017a }
            java.lang.String r2 = "apps_3p_corpus_component_names.txt"
            r0[r4] = r2     // Catch:{ all -> 0x017a }
            goto L_0x0169
        L_0x014c:
            r0 = move-exception
            r2 = r5
            goto L_0x016c
        L_0x014f:
            r0 = move-exception
            r2 = r5
            goto L_0x0155
        L_0x0152:
            r0 = move-exception
            goto L_0x016c
        L_0x0154:
            r0 = move-exception
        L_0x0155:
            java.lang.String r5 = "Failed to append to component name file."
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x016b }
            defpackage.qoi.b(r0, r5, r6)     // Catch:{ all -> 0x016b }
            if (r2 == 0) goto L_0x0169
            r2.close()     // Catch:{ RuntimeException -> 0x0162 }
            goto L_0x0169
        L_0x0162:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x017a }
            java.lang.String r2 = "apps_3p_corpus_component_names.txt"
            r0[r4] = r2     // Catch:{ all -> 0x017a }
        L_0x0169:
            monitor-exit(r1)     // Catch:{ all -> 0x017a }
            return
        L_0x016b:
            r0 = move-exception
        L_0x016c:
            if (r2 == 0) goto L_0x0179
            r2.close()     // Catch:{ RuntimeException -> 0x0172 }
            goto L_0x0179
        L_0x0172:
            r2 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x017a }
            java.lang.String r3 = "apps_3p_corpus_component_names.txt"
            r2[r4] = r3     // Catch:{ all -> 0x017a }
        L_0x0179:
            throw r0     // Catch:{ all -> 0x017a }
        L_0x017a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x017a }
            throw r0
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnw.run():void");
    }
}
