package com.google.android.gms.chromesync.sync;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SyncIntentOperation extends IntentOperation {
    private static final iwd a = hir.c("SyncIntentOperation");
    private static final Uri b = Uri.parse("content://com.google.android.gms.chromesync.sync.ChimeraSyncReceiverService");
    private pyr c;
    private hnu d;

    public static PendingIntent a(hnw hnw) {
        hnv hnv = new hnv(hnw);
        hnv.b = 600;
        hnw a2 = hnv.a();
        Intent startIntent = IntentOperation.getStartIntent((Context) ihs.b(), SyncIntentOperation.class, "com.google.android.gms.chromesync.SCHEDULED_SYNC");
        startIntent.setData(b.buildUpon().appendPath(hnw.a.d).build());
        startIntent.putExtra("syncRequest", a2.a());
        return PendingIntent.getService(ihs.b(), 0, startIntent, 134217728);
    }

    public final void onCreate() {
        this.c = new pyr(this);
        this.d = (hnu) hnu.a.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0338, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0338 A[ExcHandler: NameNotFoundException | hjm (e java.lang.Throwable), Splitter:B:1:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r15) {
        /*
            r14 = this;
            iwd r0 = a
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r15
            java.lang.String r4 = "Handling the intent: %s."
            r0.c(r4, r2)
            java.lang.String r0 = r15.getAction()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.String r2 = "android.intent.action.BOOT_COMPLETED"
            boolean r2 = r2.equals(r0)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r2 == 0) goto L_0x0044
            pyr r0 = r14.c     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.util.List r0 = r0.a()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
        L_0x0023:
            boolean r2 = r0.hasNext()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r2 == 0) goto L_0x02ea
            java.lang.Object r2 = r0.next()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            pyv r2 = (defpackage.pyv) r2     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hnu r4 = r14.d     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hnv r5 = new hnv     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r5.<init>()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r5.a = r2     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r2 = 101(0x65, float:1.42E-43)
            r5.b = r2     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hnw r2 = r5.a()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r4.a(r2)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            goto L_0x0023
        L_0x0044:
            java.lang.String r2 = "com.google.android.chimera.IntentOperation.NEW_MODULE"
            boolean r2 = r2.equals(r0)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r2 == 0) goto L_0x004e
        L_0x004c:
            goto L_0x0301
        L_0x004e:
            java.lang.String r2 = "com.google.android.gms.chimera.container.CONTAINER_UPDATED"
            boolean r2 = r2.equals(r0)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r2 != 0) goto L_0x004c
            java.lang.String r2 = "com.google.gservices.intent.action.GSERVICES_CHANGED"
            boolean r2 = r2.equals(r0)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r2 == 0) goto L_0x0095
            pyr r0 = r14.c     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.util.List r0 = r0.a()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
        L_0x0068:
            boolean r2 = r0.hasNext()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r2 == 0) goto L_0x0089
            java.lang.Object r2 = r0.next()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            pyv r2 = (defpackage.pyv) r2     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hnu r4 = r14.d     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hnv r5 = new hnv     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r5.<init>()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r5.a = r2     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r2 = 700(0x2bc, float:9.81E-43)
            r5.b = r2     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hnw r2 = r5.a()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r4.a(r2)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            goto L_0x0068
        L_0x0089:
            fzi r0 = defpackage.hnc.b     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.Object r0 = r0.b()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hnc r0 = (defpackage.hnc) r0     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r0.a()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            return
        L_0x0095:
            java.lang.String r2 = "android.intent.action.PACKAGE_ADDED"
            boolean r2 = r2.equals(r0)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r2 != 0) goto L_0x0242
            java.lang.String r2 = "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE"
            boolean r2 = r2.equals(r0)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r2 == 0) goto L_0x021e
            java.lang.String r0 = "com.google.android.gms.auth.category.ACCOUNT_REMOVED"
            boolean r0 = r15.hasCategory(r0)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r0 == 0) goto L_0x01ed
            fzh r0 = defpackage.hkx.i     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.Object r0 = r0.b()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hkx r0 = (defpackage.hkx) r0     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hle r2 = r0.k     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            android.database.sqlite.SQLiteDatabase r2 = r2.a()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r13.<init>()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.String r5 = "account_data"
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.String r4 = "account"
            r6[r3] = r4     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "account"
            r10 = 0
            r11 = 0
            r12 = 0
            r4 = r2
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r4.moveToFirst()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
        L_0x00d7:
            boolean r5 = r4.isAfterLast()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r5 == 0) goto L_0x01df
            pyr r4 = r0.j     // Catch:{ eif -> 0x01d2, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.util.List r4 = r4.a()     // Catch:{ eif -> 0x01d2, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
        L_0x00e7:
            boolean r5 = r4.hasNext()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r5 == 0) goto L_0x00f9
            java.lang.Object r5 = r4.next()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            pyv r5 = (defpackage.pyv) r5     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.String r5 = r5.d     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r13.remove(r5)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            goto L_0x00e7
        L_0x00f9:
            java.lang.Object r4 = r0.l     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            monitor-enter(r4)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r2.beginTransaction()     // Catch:{ all -> 0x01cf }
            java.util.Iterator r5 = r13.iterator()     // Catch:{ all -> 0x01c5 }
        L_0x0103:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x01c5 }
            if (r6 == 0) goto L_0x0121
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x01c5 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x01c5 }
            hle r7 = r0.k     // Catch:{ all -> 0x01c5 }
            android.database.sqlite.SQLiteDatabase r7 = r7.a()     // Catch:{ all -> 0x01c5 }
            java.lang.String r8 = "account_data"
            java.lang.String[] r9 = new java.lang.String[r1]     // Catch:{ all -> 0x01c5 }
            r9[r3] = r6     // Catch:{ all -> 0x01c5 }
            java.lang.String r6 = "account=?"
            r7.delete(r8, r6, r9)     // Catch:{ all -> 0x01c5 }
            goto L_0x0103
        L_0x0121:
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x01c5 }
            r2.endTransaction()     // Catch:{ all -> 0x01cf }
            java.util.Map r0 = r0.m     // Catch:{ all -> 0x01cf }
            r0.clear()     // Catch:{ all -> 0x01cf }
            monitor-exit(r4)     // Catch:{ all -> 0x01cf }
            fzi r0 = defpackage.hls.e     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.Object r0 = r0.b()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hls r0 = (defpackage.hls) r0     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hle r2 = r0.g     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            android.database.sqlite.SQLiteDatabase r2 = r2.a()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r2.beginTransaction()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ eif -> 0x01b4 }
            r13.<init>()     // Catch:{ eif -> 0x01b4 }
            java.lang.String r5 = "sync_entities"
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ eif -> 0x01b4 }
            java.lang.String r4 = "account"
            r6[r3] = r4     // Catch:{ eif -> 0x01b4 }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "account"
            r10 = 0
            r11 = 0
            r12 = 0
            r4 = r2
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ eif -> 0x01b4 }
            r4.moveToFirst()     // Catch:{ eif -> 0x01b4 }
        L_0x015a:
            boolean r5 = r4.isAfterLast()     // Catch:{ eif -> 0x01b4 }
            if (r5 == 0) goto L_0x01a5
            pyr r4 = r0.f     // Catch:{ eif -> 0x01b4 }
            java.util.List r4 = r4.a()     // Catch:{ eif -> 0x01b4 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ eif -> 0x01b4 }
        L_0x016a:
            boolean r5 = r4.hasNext()     // Catch:{ eif -> 0x01b4 }
            if (r5 == 0) goto L_0x017c
            java.lang.Object r5 = r4.next()     // Catch:{ eif -> 0x01b4 }
            pyv r5 = (defpackage.pyv) r5     // Catch:{ eif -> 0x01b4 }
            java.lang.String r5 = r5.d     // Catch:{ eif -> 0x01b4 }
            r13.remove(r5)     // Catch:{ eif -> 0x01b4 }
            goto L_0x016a
        L_0x017c:
            java.util.Iterator r4 = r13.iterator()     // Catch:{ eif -> 0x01b4 }
        L_0x0180:
            boolean r5 = r4.hasNext()     // Catch:{ eif -> 0x01b4 }
            if (r5 == 0) goto L_0x019e
            java.lang.Object r5 = r4.next()     // Catch:{ eif -> 0x01b4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ eif -> 0x01b4 }
            hle r6 = r0.g     // Catch:{ eif -> 0x01b4 }
            android.database.sqlite.SQLiteDatabase r6 = r6.a()     // Catch:{ eif -> 0x01b4 }
            java.lang.String r7 = "sync_entities"
            java.lang.String r8 = defpackage.hls.a     // Catch:{ eif -> 0x01b4 }
            java.lang.String[] r9 = new java.lang.String[r1]     // Catch:{ eif -> 0x01b4 }
            r9[r3] = r5     // Catch:{ eif -> 0x01b4 }
            r6.delete(r7, r8, r9)     // Catch:{ eif -> 0x01b4 }
            goto L_0x0180
        L_0x019e:
            r2.setTransactionSuccessful()     // Catch:{ eif -> 0x01b4 }
            r2.endTransaction()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            goto L_0x01ed
        L_0x01a5:
            java.lang.String r5 = "account"
            java.lang.String r5 = defpackage.fzn.a(r4, r5)     // Catch:{ eif -> 0x01b4 }
            r13.add(r5)     // Catch:{ eif -> 0x01b4 }
            r4.moveToNext()     // Catch:{ eif -> 0x01b4 }
            goto L_0x015a
        L_0x01b2:
            r0 = move-exception
            goto L_0x01c1
        L_0x01b4:
            r0 = move-exception
            hjm r4 = new hjm     // Catch:{ all -> 0x01b2 }
            int r5 = defpackage.hjn.a((defpackage.eif) r0)     // Catch:{ all -> 0x01b2 }
            java.lang.String r6 = "Error when wiping out the obsolete data."
            r4.<init>(r5, r6, r0)     // Catch:{ all -> 0x01b2 }
            throw r4     // Catch:{ all -> 0x01b2 }
        L_0x01c1:
            r2.endTransaction()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            throw r0     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
        L_0x01c5:
            r5 = move-exception
            r2.endTransaction()     // Catch:{ all -> 0x01cf }
            java.util.Map r0 = r0.m     // Catch:{ all -> 0x01cf }
            r0.clear()     // Catch:{ all -> 0x01cf }
            throw r5     // Catch:{ all -> 0x01cf }
        L_0x01cf:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01cf }
            throw r0     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
        L_0x01d2:
            r0 = move-exception
            hjm r2 = new hjm     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            int r4 = defpackage.hjn.a((defpackage.eif) r0)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.String r5 = "Error when wiping out the obsolete data."
            r2.<init>(r4, r5, r0)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            throw r2     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
        L_0x01df:
            java.lang.String r5 = "account"
            java.lang.String r5 = defpackage.fzn.a(r4, r5)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r13.add(r5)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r4.moveToNext()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            goto L_0x00d7
        L_0x01ed:
            java.lang.String r0 = "com.google.android.gms.auth.category.ACCOUNT_MUTATED"
            boolean r0 = r15.hasCategory(r0)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r0 == 0) goto L_0x02ea
            java.lang.String r0 = "accountsMutated"
            android.os.Parcelable[] r0 = r15.getParcelableArrayExtra(r0)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            int r2 = r0.length     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r4 = 0
        L_0x01fd:
            if (r4 >= r2) goto L_0x02ea
            r5 = r0[r4]     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            android.accounts.Account r5 = (android.accounts.Account) r5     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            pyv r5 = defpackage.pyv.a(r14, r5)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hnu r6 = r14.d     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hnv r7 = new hnv     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r7.<init>()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r7.a = r5     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r5 = 200(0xc8, float:2.8E-43)
            r7.b = r5     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hnw r5 = r7.a()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r6.a(r5)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            int r4 = r4 + 1
            goto L_0x01fd
        L_0x021e:
            java.lang.String r2 = "com.google.android.gms.chromesync.SCHEDULED_SYNC"
            boolean r0 = r2.equals(r0)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r0 == 0) goto L_0x02ea
            java.lang.String r0 = "syncRequest"
            android.os.Bundle r0 = r15.getBundleExtra(r0)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            amri r0 = defpackage.hnw.a(r14, r0)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            boolean r2 = r0.a()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r2 == 0) goto L_0x02ea
            hnu r2 = r14.d     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.Object r0 = r0.b()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hnw r0 = (defpackage.hnw) r0     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r2.a(r0)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            return
        L_0x0242:
            android.net.Uri r0 = r15.getData()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r0 != 0) goto L_0x0254
            iwd r0 = a     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r2[r3] = r15     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.String r4 = "Empty package URI in the intent: %s."
            r0.b(r4, r2)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            return
        L_0x0254:
            java.lang.String r2 = r0.getSchemeSpecificPart()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            amri r2 = defpackage.hiq.a(r14, r2)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            boolean r4 = r2.a()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r4 == 0) goto L_0x02f1
            fzi r0 = defpackage.hnc.b     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.Object r0 = r0.b()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hnc r0 = (defpackage.hnc) r0     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.Object r2 = r2.b()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.Object r4 = r0.f     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            monitor-enter(r4)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r0.a()     // Catch:{ all -> 0x02ee }
            hlb r5 = r0.c     // Catch:{ all -> 0x02ee }
            amri r5 = r5.a((java.lang.String) r2)     // Catch:{ all -> 0x02ee }
            monitor-exit(r4)     // Catch:{ all -> 0x02ee }
            boolean r4 = r5.a()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r4 != 0) goto L_0x0284
            goto L_0x02d8
        L_0x0284:
            java.lang.Object r4 = r0.f     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            monitor-enter(r4)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r0.a()     // Catch:{ all -> 0x02eb }
            hlh r5 = r0.d     // Catch:{ all -> 0x02eb }
            amzy r6 = defpackage.amzy.a((java.lang.Object) r2)     // Catch:{ all -> 0x02eb }
            anax r5 = r5.b(r6)     // Catch:{ all -> 0x02eb }
            int r6 = r5.size()     // Catch:{ all -> 0x02eb }
            if (r6 <= r1) goto L_0x02bb
            iwd r5 = defpackage.hnc.a     // Catch:{ all -> 0x02eb }
            java.lang.String r6 = "There are multiple facets found for given facetID: "
            java.lang.String r7 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x02eb }
            int r8 = r7.length()     // Catch:{ all -> 0x02eb }
            if (r8 != 0) goto L_0x02ae
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x02eb }
            r7.<init>(r6)     // Catch:{ all -> 0x02eb }
            goto L_0x02b2
        L_0x02ae:
            java.lang.String r7 = r6.concat(r7)     // Catch:{ all -> 0x02eb }
        L_0x02b2:
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x02eb }
            r5.d(r7, r6)     // Catch:{ all -> 0x02eb }
            ampu r5 = defpackage.ampu.a     // Catch:{ all -> 0x02eb }
            monitor-exit(r4)     // Catch:{ all -> 0x02eb }
            goto L_0x02d2
        L_0x02bb:
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x02eb }
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x02eb }
            if (r6 == 0) goto L_0x02ca
            java.lang.Object r5 = defpackage.ance.b(r5)     // Catch:{ all -> 0x02eb }
            goto L_0x02cb
        L_0x02ca:
            r5 = 0
        L_0x02cb:
            auuo r5 = (defpackage.auuo) r5     // Catch:{ all -> 0x02eb }
            amri r5 = defpackage.amri.c(r5)     // Catch:{ all -> 0x02eb }
            monitor-exit(r4)     // Catch:{ all -> 0x02eb }
        L_0x02d2:
            boolean r4 = r5.a()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r4 != 0) goto L_0x02ea
        L_0x02d8:
            iwd r4 = defpackage.hnc.a     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r5[r3] = r2     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.String r2 = "One of affiliation or grouping data for %s was not found. Marking affiliation data as stale..."
            r4.c(r2, r5)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r0.b()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r0.a()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            return
        L_0x02ea:
            return
        L_0x02eb:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x02eb }
            throw r0     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
        L_0x02ee:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x02ee }
            throw r0     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
        L_0x02f1:
            iwd r2 = a     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.String r0 = r0.getSchemeSpecificPart()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r4[r3] = r0     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.String r0 = "Unable to get the application URL for package: %s."
            r2.b(r0, r4)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            return
        L_0x0301:
            pyr r0 = r14.c     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.util.List r0 = r0.a()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
        L_0x030b:
            boolean r2 = r0.hasNext()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            if (r2 == 0) goto L_0x032c
            java.lang.Object r2 = r0.next()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            pyv r2 = (defpackage.pyv) r2     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hnu r4 = r14.d     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hnv r5 = new hnv     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r5.<init>()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r5.a = r2     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r2 = 100
            r5.b = r2     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hnw r2 = r5.a()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r4.a(r2)     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            goto L_0x030b
        L_0x032c:
            fzi r0 = defpackage.hnc.b     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            java.lang.Object r0 = r0.b()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            hnc r0 = (defpackage.hnc) r0     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            r0.a()     // Catch:{ eif -> 0x033c, hjm -> 0x033a, NameNotFoundException -> 0x0338 }
            return
        L_0x0338:
            r0 = move-exception
            goto L_0x033d
        L_0x033a:
            r0 = move-exception
            goto L_0x033d
        L_0x033c:
            r0 = move-exception
        L_0x033d:
            iwd r2 = a
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r15
            r4[r1] = r0
            java.lang.String r15 = "Error handling the intent: %s."
            r2.e(r15, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chromesync.sync.SyncIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
