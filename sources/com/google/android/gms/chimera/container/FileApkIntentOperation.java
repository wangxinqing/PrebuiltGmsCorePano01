package com.google.android.gms.chimera.container;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.gms.chimera.container.FileApkChimeraService;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FileApkIntentOperation extends IntentOperation {
    static final ancq a = amxc.a(3, 3);

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ExternalFileApkChimeraService extends Service {
        public final IBinder onBind(Intent intent) {
            return null;
        }

        public final int onStartCommand(Intent intent, int i, int i2) {
            String str;
            boolean equals;
            if (intent != null) {
                str = intent.getAction();
            } else {
                str = null;
            }
            if (str != null && (!(equals = "com.google.android.gms.chimera.container.STAGE_MODULE_APKS".equals(str)) ? "com.google.android.gms.chimera.container.CHIMERA_LOG".equals(str) : !FileApkIntentOperation.a(intent) || FileApkIntentOperation.a((Context) this, intent))) {
                Intent startIntent = IntentOperation.getStartIntent((Context) this, FileApkIntentOperation.class, str);
                if (startIntent != null) {
                    startIntent.putExtras(intent);
                    startService(startIntent);
                } else if (equals) {
                    FileApkIntentOperation.b(intent);
                }
            }
            stopSelf(i2);
            return 2;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ExternalFileApkService extends hdy {
    }

    public static void a(Context context) {
        a(context, (String) null, (ResultReceiver) null, new Intent());
    }

    private static ComponentName b(Context context, Intent intent) {
        String name = ExternalFileApkService.class.getName();
        if (awxs.c() && "com.google.android.gms.chimera.container.STAGE_MODULE_APKS".equals(intent.getAction())) {
            name = FileApkChimeraService.FileApkService.class.getName();
        }
        intent.setClassName("com.google.android.gms", name);
        try {
            return context.startService(intent);
        } catch (IllegalArgumentException | SecurityException e) {
            Log.e("FileApkIntOp", e.toString());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0457, code lost:
        if (a.d(r3) != false) goto L_0x0459;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x02cb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            java.lang.String r2 = r19.getAction()
            defpackage.amtf.a((java.lang.Object) r2)
            int r3 = r2.hashCode()
            r4 = -2053861313(0xffffffff8594903f, float:-1.3970841E-35)
            r5 = 2
            r6 = -1
            r7 = 1
            if (r3 == r4) goto L_0x0036
            r4 = -1492206664(0xffffffffa70ebbb8, float:-1.9808221E-15)
            if (r3 == r4) goto L_0x002c
            r4 = -979854223(0xffffffffc5989c71, float:-4883.555)
            if (r3 == r4) goto L_0x0022
            goto L_0x0040
        L_0x0022:
            java.lang.String r3 = "com.google.android.gms.chimera.container.STAGE_MODULE_APKS"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0040
            r3 = 1
            goto L_0x0041
        L_0x002c:
            java.lang.String r3 = "com.google.android.gms.chimera.container.CHIMERA_LOG"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0040
            r3 = 0
            goto L_0x0041
        L_0x0036:
            java.lang.String r3 = "com.google.android.chimera.FileApkManager.DELETE_UNUSED_FILEAPKS"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0040
            r3 = 2
            goto L_0x0041
        L_0x0040:
            r3 = -1
        L_0x0041:
            if (r3 == 0) goto L_0x0487
            r9 = 0
            if (r3 == r7) goto L_0x0378
            if (r3 == r5) goto L_0x0064
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Unknown action: "
            int r4 = r2.length()
            if (r4 != 0) goto L_0x005c
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            goto L_0x0060
        L_0x005c:
            java.lang.String r2 = r3.concat(r2)
        L_0x0060:
            r0.<init>(r2)
            throw r0
        L_0x0064:
            bkv r0 = defpackage.bkv.a((android.content.Context) r18)     // Catch:{ InvalidConfigException -> 0x0376 }
            boz r11 = r0.f()     // Catch:{ InvalidConfigException -> 0x0376 }
            hfz r12 = defpackage.hfz.a((android.content.Context) r18)
            boolean r0 = r12.b()
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "ModuleSetMgr"
            java.lang.String r2 = "not migrated with user locked"
            android.util.Log.e(r0, r2)
            goto L_0x01a7
        L_0x007f:
            java.lang.Object r2 = r12.e
            monitor-enter(r2)
            hfk r13 = r12.d()     // Catch:{ all -> 0x0373 }
            monitor-exit(r2)     // Catch:{ all -> 0x0373 }
            anav r0 = defpackage.anax.j()
            hfg r2 = r12.g()
            aucx r2 = r2.b
            int r3 = r2.size()
            r5 = 0
        L_0x0096:
            if (r5 >= r3) goto L_0x00a8
            java.lang.Object r6 = r2.get(r5)
            hfp r6 = (defpackage.hfp) r6
            bmr r6 = defpackage.hgi.a((defpackage.hfp) r6)
            r0.b(r6)
            int r5 = r5 + 1
            goto L_0x0096
        L_0x00a8:
            aucx r3 = r13.c
            int r5 = r3.size()
            r2 = 0
        L_0x00af:
            if (r2 < r5) goto L_0x0331
            android.content.Context r2 = r12.a
            blu r2 = defpackage.blu.a((android.content.Context) r2)
            java.util.Collection r2 = r2.h()
            anax r2 = defpackage.hgi.a((java.util.Collection) r2)
            anfv r15 = defpackage.anfv.a
            r16 = 1
            r17 = 0
            r14 = r2
            hgh r3 = r12.a(r13, r14, r15, r16, r17)
            if (r3 != 0) goto L_0x00d9
            java.lang.String r2 = "ModuleSetMgr"
            java.lang.String r3 = "failed to compute pending module sets"
            android.util.Log.w(r2, r3)
            anax r9 = r0.a()
            goto L_0x01a7
        L_0x00d9:
            java.lang.String r5 = java.lang.String.valueOf(r2)
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 8
            r7.<init>(r6)
            java.lang.String r6 = "Staged: "
            r7.append(r6)
            r7.append(r5)
            r7.toString()
            anaf r5 = r3.c
            anax r5 = r5.keySet()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 8
            r7.<init>(r6)
            java.lang.String r6 = "Wanted: "
            r7.append(r6)
            r7.append(r5)
            r7.toString()
            nz r5 = new nz
            anaf r6 = r3.c
            int r6 = r6.size()
            r5.<init>((int) r6)
            anaf r3 = r3.c
            anax r3 = r3.keySet()
            anhj r3 = r3.iterator()
        L_0x0130:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x014d
            java.lang.Object r6 = r3.next()
            bmr r6 = (defpackage.bmr) r6
            boolean r7 = r2.contains(r6)
            if (r7 != 0) goto L_0x0130
            java.lang.String r7 = r6.a
            hfw r9 = new hfw
            r9.<init>(r6)
            r5.put(r7, r9)
            goto L_0x0130
        L_0x014d:
            anhj r2 = r2.iterator()
        L_0x0151:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x018d
            java.lang.Object r3 = r2.next()
            bmr r3 = (defpackage.bmr) r3
            java.lang.String r6 = r3.a
            int r6 = r5.a((java.lang.Object) r6)
            if (r6 < 0) goto L_0x0151
            java.lang.Object r6 = r5.c(r6)
            hfw r6 = (defpackage.hfw) r6
            java.lang.String r7 = r3.a
            bmr r9 = r6.a
            java.lang.String r9 = r9.a
            boolean r7 = r7.equals(r9)
            defpackage.amtf.a((boolean) r7)
            bmr r7 = r6.b
            if (r7 == 0) goto L_0x018a
            bmr r9 = r6.a
            java.lang.String r9 = r9.b
            java.lang.String r7 = r7.b
            java.lang.String r10 = r3.b
            boolean r7 = defpackage.hgi.a((java.lang.String) r9, (java.lang.String) r7, (java.lang.String) r10)
            if (r7 == 0) goto L_0x0151
        L_0x018a:
            r6.b = r3
            goto L_0x0151
        L_0x018d:
            r2 = 0
        L_0x018e:
            int r3 = r5.h
            if (r2 >= r3) goto L_0x01a3
            java.lang.Object r3 = r5.c(r2)
            hfw r3 = (defpackage.hfw) r3
            bmr r3 = r3.b
            if (r3 != 0) goto L_0x019d
            goto L_0x01a0
        L_0x019d:
            r0.b(r3)
        L_0x01a0:
            int r2 = r2 + 1
            goto L_0x018e
        L_0x01a3:
            anax r9 = r0.a()
        L_0x01a7:
            if (r9 != 0) goto L_0x01b1
            java.lang.String r0 = "FileApkIntOp"
            java.lang.String r2 = "failed to compute retained apks, skipping cleanup"
            android.util.Log.w(r0, r2)
            return
        L_0x01b1:
            blu r10 = defpackage.blu.a((android.content.Context) r18)
            boolean r0 = r10.b()
            if (r0 != 0) goto L_0x0330
            java.lang.Object r2 = defpackage.blu.f
            monitor-enter(r2)
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x032d }
            android.content.Context r3 = r10.a     // Catch:{ all -> 0x032d }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ all -> 0x032d }
            java.lang.String r5 = "chimera-modules"
            r0.<init>(r3, r5)     // Catch:{ all -> 0x032d }
            boolean r3 = r0.isDirectory()     // Catch:{ all -> 0x032d }
            if (r3 != 0) goto L_0x01d2
            goto L_0x01d5
        L_0x01d2:
            defpackage.bma.a((java.io.File) r0)     // Catch:{ all -> 0x032d }
        L_0x01d5:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x032d }
            android.content.Context r3 = r10.a     // Catch:{ all -> 0x032d }
            java.io.File r3 = defpackage.bkq.a((android.content.Context) r3)     // Catch:{ all -> 0x032d }
            java.lang.String r5 = "chimera-module-root"
            r0.<init>(r3, r5)     // Catch:{ all -> 0x032d }
            boolean r3 = r0.isDirectory()     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x01eb
            defpackage.bma.a((java.io.File) r0)     // Catch:{ all -> 0x032d }
        L_0x01eb:
            boolean r0 = defpackage.aekv.a()     // Catch:{ all -> 0x032d }
            if (r0 == 0) goto L_0x0228
            android.content.Context r0 = r10.a     // Catch:{ all -> 0x032d }
            boolean r0 = defpackage.aekv.b(r0)     // Catch:{ all -> 0x032d }
            if (r0 == 0) goto L_0x0228
            boolean r0 = r10.d     // Catch:{ all -> 0x032d }
            if (r0 == 0) goto L_0x0228
            java.util.concurrent.locks.ReadWriteLock r0 = defpackage.blu.e     // Catch:{ all -> 0x032d }
            java.util.concurrent.locks.Lock r0 = r0.writeLock()     // Catch:{ all -> 0x032d }
            r0.lock()     // Catch:{ all -> 0x032d }
            android.content.Context r0 = r10.a     // Catch:{ all -> 0x021d }
            android.content.Context r0 = defpackage.blb.a(r0)     // Catch:{ all -> 0x021d }
            java.lang.String r3 = "current_fileapks.pb"
            java.lang.String r5 = "m"
            defpackage.blb.a(r0, r3, r5)     // Catch:{ all -> 0x021d }
            java.util.concurrent.locks.ReadWriteLock r0 = defpackage.blu.e     // Catch:{ all -> 0x032d }
            java.util.concurrent.locks.Lock r0 = r0.writeLock()     // Catch:{ all -> 0x032d }
            r0.unlock()     // Catch:{ all -> 0x032d }
            goto L_0x0228
        L_0x021d:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r3 = defpackage.blu.e     // Catch:{ all -> 0x032d }
            java.util.concurrent.locks.Lock r3 = r3.writeLock()     // Catch:{ all -> 0x032d }
            r3.unlock()     // Catch:{ all -> 0x032d }
            throw r0     // Catch:{ all -> 0x032d }
        L_0x0228:
            java.io.File r12 = r10.d()     // Catch:{ all -> 0x032d }
            if (r12 != 0) goto L_0x0230
            goto L_0x0324
        L_0x0230:
            boolean r0 = r12.isDirectory()     // Catch:{ all -> 0x032d }
            if (r0 == 0) goto L_0x0324
            java.util.concurrent.locks.ReadWriteLock r0 = defpackage.blu.e     // Catch:{ all -> 0x032d }
            java.util.concurrent.locks.Lock r0 = r0.readLock()     // Catch:{ all -> 0x032d }
            r0.lock()     // Catch:{ all -> 0x032d }
            bln r0 = r10.j()     // Catch:{ all -> 0x0318 }
            java.util.concurrent.locks.ReadWriteLock r3 = defpackage.blu.e     // Catch:{ all -> 0x032d }
            java.util.concurrent.locks.Lock r3 = r3.readLock()     // Catch:{ all -> 0x032d }
            r3.unlock()     // Catch:{ all -> 0x032d }
            java.io.File r13 = r0.b     // Catch:{ all -> 0x032d }
            bpe r0 = r0.c     // Catch:{ all -> 0x032d }
            r3 = 5
            java.lang.Object r3 = r0.c(r3)     // Catch:{ all -> 0x032d }
            r14 = r3
            aucd r14 = (defpackage.aucd) r14     // Catch:{ all -> 0x032d }
            r14.a((defpackage.aucj) r0)     // Catch:{ all -> 0x032d }
            aucj r0 = r14.b     // Catch:{ all -> 0x032d }
            bpe r0 = (defpackage.bpe) r0     // Catch:{ all -> 0x032d }
            aucx r0 = r0.c     // Catch:{ all -> 0x032d }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x032d }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x032d }
            int r5 = r0.size()     // Catch:{ all -> 0x032d }
            r3.<init>(r5)     // Catch:{ all -> 0x032d }
            bly r5 = new bly     // Catch:{ all -> 0x032d }
            r5.<init>()     // Catch:{ all -> 0x032d }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x032d }
        L_0x0277:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x032d }
            if (r7 == 0) goto L_0x02ef
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x032d }
            bpd r7 = (defpackage.bpd) r7     // Catch:{ all -> 0x032d }
            int r15 = r7.g     // Catch:{ all -> 0x032d }
            int r15 = defpackage.bpc.a(r15)     // Catch:{ all -> 0x032d }
            if (r15 != 0) goto L_0x028c
            goto L_0x02eb
        L_0x028c:
            r8 = 3
            if (r15 != r8) goto L_0x02eb
            aucx r8 = r7.e     // Catch:{ all -> 0x032d }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x032d }
        L_0x0295:
            boolean r15 = r8.hasNext()     // Catch:{ all -> 0x032d }
            if (r15 == 0) goto L_0x02eb
            java.lang.Object r15 = r8.next()     // Catch:{ all -> 0x032d }
            bpf r15 = (defpackage.bpf) r15     // Catch:{ all -> 0x032d }
            java.lang.String r4 = r15.g     // Catch:{ all -> 0x032d }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x032d }
            if (r4 == 0) goto L_0x02aa
            goto L_0x02bb
        L_0x02aa:
            java.lang.String r4 = r15.h     // Catch:{ all -> 0x032d }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x032d }
            if (r4 != 0) goto L_0x02bb
            java.lang.String r4 = r15.g     // Catch:{ all -> 0x032d }
            r5.a = r4     // Catch:{ all -> 0x032d }
            java.lang.String r4 = r15.h     // Catch:{ all -> 0x032d }
            r5.b = r4     // Catch:{ all -> 0x032d }
            goto L_0x02c5
        L_0x02bb:
            int r4 = r15.d     // Catch:{ all -> 0x032d }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x032d }
            r5.b = r4     // Catch:{ all -> 0x032d }
            r5.a = r4     // Catch:{ all -> 0x032d }
        L_0x02c5:
            boolean r4 = r9.contains(r5)     // Catch:{ all -> 0x032d }
            if (r4 != 0) goto L_0x0295
            java.lang.String r4 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x032d }
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x032d }
            int r7 = r7.length()     // Catch:{ all -> 0x032d }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x032d }
            r15 = 19
            int r7 = r7 + r15
            r8.<init>(r7)     // Catch:{ all -> 0x032d }
            java.lang.String r7 = "Obsolete download: "
            r8.append(r7)     // Catch:{ all -> 0x032d }
            r8.append(r4)     // Catch:{ all -> 0x032d }
            r8.toString()     // Catch:{ all -> 0x032d }
            goto L_0x0277
        L_0x02eb:
            r3.add(r7)     // Catch:{ all -> 0x032d }
            goto L_0x0277
        L_0x02ef:
            int r4 = r3.size()     // Catch:{ all -> 0x032d }
            int r0 = r0.size()     // Catch:{ all -> 0x032d }
            if (r4 == r0) goto L_0x0313
            boolean r0 = r14.c     // Catch:{ all -> 0x032d }
            if (r0 != 0) goto L_0x02fe
            goto L_0x0304
        L_0x02fe:
            r14.c()     // Catch:{ all -> 0x032d }
            r4 = 0
            r14.c = r4     // Catch:{ all -> 0x032d }
        L_0x0304:
            aucj r0 = r14.b     // Catch:{ all -> 0x032d }
            bpe r0 = (defpackage.bpe) r0     // Catch:{ all -> 0x032d }
            bpe r4 = defpackage.bpe.f     // Catch:{ all -> 0x032d }
            aucx r4 = defpackage.aucj.s()     // Catch:{ all -> 0x032d }
            r0.c = r4     // Catch:{ all -> 0x032d }
            r14.l((java.lang.Iterable) r3)     // Catch:{ all -> 0x032d }
        L_0x0313:
            r15 = 1
            r10.a((defpackage.boz) r11, (java.io.File) r12, (java.io.File) r13, (defpackage.aucd) r14, (boolean) r15)     // Catch:{ all -> 0x032d }
            goto L_0x032b
        L_0x0318:
            r0 = move-exception
            r3 = r0
            java.util.concurrent.locks.ReadWriteLock r0 = defpackage.blu.e     // Catch:{ all -> 0x032d }
            java.util.concurrent.locks.Lock r0 = r0.readLock()     // Catch:{ all -> 0x032d }
            r0.unlock()     // Catch:{ all -> 0x032d }
            throw r3     // Catch:{ all -> 0x032d }
        L_0x0324:
            java.lang.String r0 = "FileApkMgr"
            java.lang.String r3 = "Main modules directory could not be created."
            android.util.Log.w(r0, r3)     // Catch:{ all -> 0x032d }
        L_0x032b:
            monitor-exit(r2)     // Catch:{ all -> 0x032d }
            return
        L_0x032d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x032d }
            throw r0
        L_0x0330:
            return
        L_0x0331:
            java.lang.Object r4 = r3.get(r2)
            hfj r4 = (defpackage.hfj) r4
            aucx r4 = r4.a
            int r6 = r4.size()
            r7 = 0
        L_0x033e:
            int r8 = r2 + 1
            if (r7 >= r6) goto L_0x0370
            java.lang.Object r8 = r4.get(r7)
            hfi r8 = (defpackage.hfi) r8
            boolean r9 = r8.c
            if (r9 == 0) goto L_0x034d
        L_0x034c:
            goto L_0x036d
        L_0x034d:
            hfg r8 = r8.b
            if (r8 == 0) goto L_0x0352
            goto L_0x0354
        L_0x0352:
            hfg r8 = defpackage.hfg.d
        L_0x0354:
            aucx r8 = r8.b
            int r9 = r8.size()
            r10 = 0
        L_0x035b:
            if (r10 >= r9) goto L_0x034c
            java.lang.Object r14 = r8.get(r10)
            hfp r14 = (defpackage.hfp) r14
            bmr r14 = defpackage.hgi.a((defpackage.hfp) r14)
            r0.b(r14)
            int r10 = r10 + 1
            goto L_0x035b
        L_0x036d:
            int r7 = r7 + 1
            goto L_0x033e
        L_0x0370:
            r2 = r8
            goto L_0x00af
        L_0x0373:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0373 }
            throw r0
        L_0x0376:
            r0 = move-exception
            return
        L_0x0378:
            java.lang.String r2 = "DEXOPT_ALL_MODULES"
            r3 = 0
            boolean r2 = r0.getBooleanExtra(r2, r3)
            java.lang.String r4 = "ON_BOOT_OR_UPGRADE"
            boolean r4 = r0.getBooleanExtra(r4, r3)
            java.lang.String r3 = "STAGE_FILE_APKS_MODULE_ID"
            java.lang.String r3 = r0.getStringExtra(r3)
            blu r5 = defpackage.blu.a((android.content.Context) r18)
            agvx r8 = defpackage.heg.a
            java.lang.Object r8 = r8.c()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            defpackage.bkn.b()
            boolean r10 = defpackage.hei.h()
            boolean r11 = a((android.content.Intent) r19)
            if (r11 == 0) goto L_0x03b3
            boolean r0 = a((android.content.Context) r18, (android.content.Intent) r19)
            if (r0 == 0) goto L_0x0486
            r0 = 0
            r4 = 0
            r11 = 1
            goto L_0x03be
        L_0x03b3:
            if (r4 == 0) goto L_0x03bb
            r0 = r8 ^ 1
            r11 = r0
            r0 = 1
            r4 = 1
            goto L_0x03be
        L_0x03bb:
            r0 = 1
            r4 = 0
            r11 = 0
        L_0x03be:
            r12 = r2
        L_0x03bf:
            if (r11 == 0) goto L_0x03c9
            boolean r13 = r5.a((defpackage.bpq) r9)
            r12 = r12 | r13
            r13 = r12
            r12 = r0
            goto L_0x03d9
        L_0x03c9:
            if (r0 == 0) goto L_0x0466
            defpackage.hey.a()
            java.util.Set r0 = defpackage.hey.d(r18)
            boolean r0 = r5.a((java.util.Set) r0, (defpackage.bpq) r9, (boolean) r4)
            r0 = r0 | r12
            r13 = r0
            r12 = 0
        L_0x03d9:
            if (r10 != 0) goto L_0x03dc
            goto L_0x03df
        L_0x03dc:
            r5.a((boolean) r11)
        L_0x03df:
            r11 = 0
            defpackage.hey.a((boolean) r11)
            java.lang.Class<com.google.android.gms.chimera.container.FileApkIntentOperation> r11 = com.google.android.gms.chimera.container.FileApkIntentOperation.class
            monitor-enter(r11)
            bkv r0 = defpackage.bkv.a((android.content.Context) r18)     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            boz r0 = r0.f()     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            ancq r15 = a     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            amwq r15 = (defpackage.amwq) r15     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            int r15 = r15.b     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            r14.<init>(r15)     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            ancq r15 = a     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            java.util.Set r15 = r15.m()     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
        L_0x0404:
            boolean r17 = r15.hasNext()     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            if (r17 == 0) goto L_0x041f
            java.lang.Object r17 = r15.next()     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            r7 = r17
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            bpa r17 = r0.a((java.lang.String) r7)     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            if (r17 == 0) goto L_0x041d
            r14.add(r7)     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            r7 = 1
            goto L_0x0404
        L_0x041d:
            r7 = 1
            goto L_0x0404
        L_0x041f:
            java.util.Iterator r0 = r14.iterator()     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
        L_0x0423:
            boolean r7 = r0.hasNext()     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            if (r7 == 0) goto L_0x0434
            java.lang.Object r7 = r0.next()     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            r14 = 0
            a((java.lang.String) r7, (int) r14)     // Catch:{ InvalidConfigException -> 0x044e, all -> 0x043f }
            goto L_0x0423
        L_0x0434:
            if (r3 == 0) goto L_0x045c
            ancq r0 = a     // Catch:{ all -> 0x0463 }
            boolean r0 = r0.d(r3)     // Catch:{ all -> 0x0463 }
            if (r0 == 0) goto L_0x045c
            goto L_0x0459
        L_0x043f:
            r0 = move-exception
            if (r3 == 0) goto L_0x044d
            ancq r2 = a     // Catch:{ all -> 0x0463 }
            boolean r2 = r2.d(r3)     // Catch:{ all -> 0x0463 }
            if (r2 == 0) goto L_0x044d
            a((java.lang.String) r3, (int) r6)     // Catch:{ all -> 0x0463 }
        L_0x044d:
            throw r0     // Catch:{ all -> 0x0463 }
        L_0x044e:
            r0 = move-exception
            if (r3 == 0) goto L_0x045c
            ancq r0 = a     // Catch:{ all -> 0x0463 }
            boolean r0 = r0.d(r3)     // Catch:{ all -> 0x0463 }
            if (r0 == 0) goto L_0x045c
        L_0x0459:
            a((java.lang.String) r3, (int) r6)     // Catch:{ all -> 0x0463 }
        L_0x045c:
            monitor-exit(r11)     // Catch:{ all -> 0x0463 }
            r0 = r12
            r12 = r13
            r7 = 1
            r11 = 0
            goto L_0x03bf
        L_0x0463:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0463 }
            throw r0
        L_0x0466:
            if (r10 != 0) goto L_0x0486
            if (r12 != 0) goto L_0x046c
            if (r8 == 0) goto L_0x0486
        L_0x046c:
            if (r2 == 0) goto L_0x0482
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r0 < r2) goto L_0x0482
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r0 > r2) goto L_0x0482
            boolean r0 = defpackage.awxs.f()
            if (r0 == 0) goto L_0x0482
            r7 = 1
            goto L_0x0483
        L_0x0482:
            r7 = 0
        L_0x0483:
            com.google.android.gms.chimera.container.DexOptIntentOperation.a(r1, r7)
        L_0x0486:
            return
        L_0x0487:
            java.lang.String r2 = "EVENT_CODE"
            r3 = 0
            int r2 = r0.getIntExtra(r2, r3)
            if (r2 != 0) goto L_0x0499
            java.lang.String r0 = "FileApkIntOp"
            java.lang.String r2 = "eventcode==0"
            android.util.Log.e(r0, r2)
            return
        L_0x0499:
            java.lang.String r3 = "EVENT_PROTO_BYTES"
            byte[] r0 = r0.getByteArrayExtra(r3)
            if (r0 != 0) goto L_0x04aa
            java.lang.String r0 = "FileApkIntOp"
            java.lang.String r2 = "eventProtoBytes==null"
            android.util.Log.e(r0, r2)
            return
        L_0x04aa:
            defpackage.hem.a()
            r3 = 19
            if (r2 != r3) goto L_0x0516
            awxo r3 = defpackage.awxo.a
            awxv r3 = r3.a()
            boolean r3 = r3.p()
            if (r3 == 0) goto L_0x053e
            aubs r3 = defpackage.aubs.b()     // Catch:{ auda -> 0x04f0 }
            aohl r4 = defpackage.aohl.u     // Catch:{ auda -> 0x04f0 }
            aucj r3 = defpackage.aucj.a((defpackage.aucj) r4, (byte[]) r0, (defpackage.aubs) r3)     // Catch:{ auda -> 0x04f0 }
            aohl r3 = (defpackage.aohl) r3     // Catch:{ auda -> 0x04f0 }
            aogj r3 = r3.j     // Catch:{ auda -> 0x04f0 }
            if (r3 == 0) goto L_0x04ce
            goto L_0x04d0
        L_0x04ce:
            aogj r3 = defpackage.aogj.f     // Catch:{ auda -> 0x04f0 }
        L_0x04d0:
            int r3 = r3.b     // Catch:{ auda -> 0x04f0 }
            int r3 = defpackage.aogi.a(r3)     // Catch:{ auda -> 0x04f0 }
            if (r3 == 0) goto L_0x04da
            r7 = r3
            goto L_0x04db
        L_0x04da:
            r7 = 1
        L_0x04db:
            int r7 = r7 + r6
            r3 = 70
            if (r7 == r3) goto L_0x04e5
            r3 = 71
            if (r7 == r3) goto L_0x04e5
            goto L_0x0526
        L_0x04e5:
            awxo r3 = defpackage.awxo.a     // Catch:{ auda -> 0x04f0 }
            awxv r3 = r3.a()     // Catch:{ auda -> 0x04f0 }
            boolean r3 = r3.r()     // Catch:{ auda -> 0x04f0 }
            goto L_0x0524
        L_0x04f0:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 29
            r3.<init>(r2)
            java.lang.String r2 = "Failed to parse GCoreLogData:"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "ChmraDebugLogger"
            android.util.Log.e(r2, r0)
            return
        L_0x0516:
            r3 = 22
            if (r2 != r3) goto L_0x053e
            awxo r3 = defpackage.awxo.a
            awxv r3 = r3.a()
            boolean r3 = r3.q()
        L_0x0524:
            if (r3 == 0) goto L_0x053e
        L_0x0526:
            iwu r3 = defpackage.iwt.a()
            hol r3 = r3.b(r1)
            hoi r0 = r3.a((byte[]) r0)
            java.lang.String r3 = "chimera"
            r0.b((java.lang.String) r3)
            r0.b((int) r2)
            r0.b()
            return
        L_0x053e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chimera.container.FileApkIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    public static void a(Context context, int i, byte[] bArr) {
        Intent intent = new Intent("com.google.android.gms.chimera.container.CHIMERA_LOG");
        intent.putExtra("EVENT_CODE", i - 1);
        intent.putExtra("EVENT_PROTO_BYTES", bArr);
        b(context, intent);
    }

    public static void a(Context context, String str, ResultReceiver resultReceiver) {
        a(context, str, resultReceiver, new Intent().putExtra("STAGE_FILE_APKS_MODULE_ID", str).putExtra("STAGE_FILE_APKS_RESULT_RECEIVER", resultReceiver));
    }

    private static void a(Context context, String str, ResultReceiver resultReceiver, Intent intent) {
        if (b(context, intent.setAction("com.google.android.gms.chimera.container.STAGE_MODULE_APKS").setPackage("com.google.android.gms")) == null && str != null) {
            StringBuilder sb = new StringBuilder(str.length() + 36);
            sb.append("Staging ");
            sb.append(str);
            sb.append(" failed, notifying receiver.");
            sb.toString();
            if (resultReceiver != null) {
                resultReceiver.send(-1, (Bundle) null);
            }
        }
    }

    static void b(Intent intent) {
        String stringExtra = intent.getStringExtra("STAGE_FILE_APKS_MODULE_ID");
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("STAGE_FILE_APKS_RESULT_RECEIVER");
        if (resultReceiver != null && stringExtra != null) {
            synchronized (FileApkIntentOperation.class) {
                a.c(stringExtra, resultReceiver);
            }
            resultReceiver.send(-1, (Bundle) null);
        }
    }

    public static void a(Context context, boolean z) {
        a(context, (String) null, (ResultReceiver) null, new Intent().putExtra("DEXOPT_ALL_MODULES", z).putExtra("ON_BOOT_OR_UPGRADE", true));
    }

    private static void a(String str, int i) {
        List<ResultReceiver> b = a.b(str);
        if (!b.isEmpty()) {
            int size = b.size();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
            sb.append("Staging ");
            sb.append(str);
            sb.append(" completed, notifying ");
            sb.append(size);
            sb.append(" receiver(s).");
            sb.toString();
            for (ResultReceiver send : b) {
                send.send(i, (Bundle) null);
            }
        }
    }

    public static void a(boolean z, Context context, String str, ResultReceiver resultReceiver) {
        if (!awxs.b() || !awxs.c() || z) {
            a(context, str, resultReceiver, new Intent().putExtra("STAGE_FILE_APKS_ASSET_NAME", str).putExtra("STAGE_FILE_APKS_RESULT_RECEIVER", resultReceiver));
        } else {
            heu.a(context, new Intent("com.google.android.gms.chimera.container.STAGE_MODULE_APKS").putExtra("STAGE_FILE_APKS_ASSET_NAME", str).putExtra("STAGE_FILE_APKS_RESULT_RECEIVER", resultReceiver), -1);
        }
    }

    static boolean a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("STAGE_FILE_APKS_MODULE_ID");
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("STAGE_FILE_APKS_RESULT_RECEIVER");
        if (stringExtra == null || resultReceiver == null) {
            return false;
        }
        synchronized (FileApkIntentOperation.class) {
            try {
                if (bkv.a(context).f().a(stringExtra) == null) {
                    a.a((Object) stringExtra, (Object) resultReceiver);
                    return true;
                }
                StringBuilder sb = new StringBuilder(stringExtra.length() + 46);
                sb.append("Staging ");
                sb.append(stringExtra);
                sb.append(" already complete, notifying receiver.");
                sb.toString();
                resultReceiver.send(0, (Bundle) null);
                return false;
            } catch (InvalidConfigException e) {
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean a(Intent intent) {
        if (!awxs.b() || !intent.hasExtra("STAGE_FILE_APKS_ASSET_NAME") || !intent.hasExtra("STAGE_FILE_APKS_RESULT_RECEIVER")) {
            return intent.hasExtra("STAGE_FILE_APKS_MODULE_ID") && intent.hasExtra("STAGE_FILE_APKS_RESULT_RECEIVER");
        }
        return true;
    }
}
