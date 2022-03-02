package com.google.android.gms.icing.proxy;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import android.util.Pair;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InternalIcingCorporaChimeraProvider extends plj {
    static final Uri.Builder a;
    public static final Uri b;
    private dvg c;
    private UriMatcher d;
    private AtomicBoolean e;

    static {
        Uri.Builder authority = new Uri.Builder().scheme("content").authority("com.google.android.gms.icing.proxy");
        a = authority;
        b = authority.path("contacts").build();
        a.path("request_indexing").build();
        a.path("dump").build();
        a.path("diagnose").build();
    }

    public static boolean f() {
        return hxz.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00da A[Catch:{ RuntimeException -> 0x0111, all -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e0 A[Catch:{ RuntimeException -> 0x0111, all -> 0x013e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor a(android.net.Uri r23, java.lang.String[] r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = "postals"
            java.lang.String r3 = "AppDataSearchHelper"
            java.lang.String r4 = "phones"
            java.lang.String r5 = "emails"
            java.lang.String r6 = "contacts"
            java.lang.String r7 = "query(uri=%s)"
            defpackage.pnz.d(r7, r0)
            int r7 = android.os.Binder.getCallingUid()
            java.lang.String r8 = "    "
            int r9 = android.os.Process.myUid()
            if (r7 != r9) goto L_0x0365
            android.content.UriMatcher r7 = r1.d
            int r7 = r7.match(r0)
            r9 = 0
            r11 = 4
            r12 = 3
            r13 = 2
            r14 = 1
            r15 = 0
            if (r7 == r12) goto L_0x0172
            if (r7 != r11) goto L_0x014d
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.e
            boolean r0 = r0.compareAndSet(r15, r14)
            if (r0 == 0) goto L_0x0145
            android.database.MatrixCursor r2 = new android.database.MatrixCursor     // Catch:{ all -> 0x013e }
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ all -> 0x013e }
            java.lang.String r4 = "corpus"
            r0[r15] = r4     // Catch:{ all -> 0x013e }
            java.lang.String r4 = "diagnostic"
            r0[r14] = r4     // Catch:{ all -> 0x013e }
            r2.<init>(r0)     // Catch:{ all -> 0x013e }
            anax r0 = defpackage.pno.e     // Catch:{ all -> 0x013e }
            anhj r4 = r0.iterator()     // Catch:{ all -> 0x013e }
        L_0x004d:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0138
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x013e }
            r5 = r0
            pno r5 = (defpackage.pno) r5     // Catch:{ all -> 0x013e }
            pnp r0 = r22.g()     // Catch:{ all -> 0x013e }
            dvj r6 = r5.b()     // Catch:{ all -> 0x013e }
            dvg r7 = r0.c     // Catch:{ RuntimeException -> 0x0111 }
            dvj[] r7 = r7.b     // Catch:{ RuntimeException -> 0x0111 }
            java.util.List r7 = java.util.Arrays.asList(r7)     // Catch:{ RuntimeException -> 0x0111 }
            boolean r7 = r7.contains(r6)     // Catch:{ RuntimeException -> 0x0111 }
            if (r7 == 0) goto L_0x00e9
            java.lang.String r7 = r6.a     // Catch:{ RuntimeException -> 0x0111 }
            aaig r8 = r0.b     // Catch:{ RuntimeException -> 0x0111 }
            android.content.Context r11 = r0.a     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r11 = r11.getPackageName()     // Catch:{ RuntimeException -> 0x0111 }
            acwa r7 = r8.b(r11, r7)     // Catch:{ RuntimeException -> 0x0111 }
            defpackage.acws.a((defpackage.acwa) r7)     // Catch:{ ExecutionException -> 0x00cb, InterruptedException -> 0x00c9 }
            java.lang.Object r7 = r7.d()     // Catch:{ RuntimeException -> 0x0111 }
            com.google.android.gms.appdatasearch.CorpusStatus r7 = (com.google.android.gms.appdatasearch.CorpusStatus) r7     // Catch:{ RuntimeException -> 0x0111 }
            boolean r8 = r7.a     // Catch:{ RuntimeException -> 0x0111 }
            if (r8 == 0) goto L_0x00c7
            long r12 = r0.b((defpackage.dvj) r6)     // Catch:{ RuntimeException -> 0x0111 }
            long r6 = r7.b     // Catch:{ RuntimeException -> 0x0111 }
            int r0 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00c5
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0111 }
            r8 = 88
            r0.<init>(r8)     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r8 = "Local highest seqno="
            r0.append(r8)     // Catch:{ RuntimeException -> 0x0111 }
            r0.append(r12)     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r8 = " less than lastIndexedSeqno="
            r0.append(r8)     // Catch:{ RuntimeException -> 0x0111 }
            r0.append(r6)     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r0 = r0.toString()     // Catch:{ RuntimeException -> 0x0111 }
            android.util.Log.e(r3, r0)     // Catch:{ RuntimeException -> 0x0111 }
            r0 = 4
            goto L_0x0120
        L_0x00b9:
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00c5
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00c3
            r0 = 1
            goto L_0x0120
        L_0x00c3:
            r0 = 2
            goto L_0x0120
        L_0x00c5:
            r0 = 0
            goto L_0x0120
        L_0x00c7:
            r0 = 3
            goto L_0x0120
        L_0x00c9:
            r0 = move-exception
            goto L_0x00cc
        L_0x00cb:
            r0 = move-exception
        L_0x00cc:
            java.lang.String r0 = r6.a     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r6 = "Couldn't fetch status for corpus "
            int r7 = r0.length()     // Catch:{ RuntimeException -> 0x0111 }
            if (r7 != 0) goto L_0x00e0
            java.lang.String r0 = new java.lang.String     // Catch:{ RuntimeException -> 0x0111 }
            r0.<init>(r6)     // Catch:{ RuntimeException -> 0x0111 }
            goto L_0x00e4
        L_0x00e0:
            java.lang.String r0 = r6.concat(r0)     // Catch:{ RuntimeException -> 0x0111 }
        L_0x00e4:
            android.util.Log.e(r3, r0)     // Catch:{ RuntimeException -> 0x0111 }
            r0 = 4
            goto L_0x0120
        L_0x00e9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r6 = r6.a     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ RuntimeException -> 0x0111 }
            int r7 = r7.length()     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0111 }
            int r7 = r7 + 57
            r8.<init>(r7)     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r7 = "The table "
            r8.append(r7)     // Catch:{ RuntimeException -> 0x0111 }
            r8.append(r6)     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r6 = " does not have a registered CorpusTableMapping."
            r8.append(r6)     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r6 = r8.toString()     // Catch:{ RuntimeException -> 0x0111 }
            r0.<init>(r6)     // Catch:{ RuntimeException -> 0x0111 }
            throw r0     // Catch:{ RuntimeException -> 0x0111 }
        L_0x0111:
            r0 = move-exception
            java.lang.String r6 = "Exception thrown from diagnoseTable"
            java.lang.Object[] r7 = new java.lang.Object[r15]     // Catch:{ all -> 0x013e }
            defpackage.pnz.a((java.lang.Throwable) r0, (java.lang.String) r6, (java.lang.Object[]) r7)     // Catch:{ all -> 0x013e }
            boolean r6 = defpackage.hxz.a()     // Catch:{ all -> 0x013e }
            if (r6 == 0) goto L_0x0137
            r0 = 4
        L_0x0120:
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x013e }
            java.lang.String r5 = r5.a()     // Catch:{ all -> 0x013e }
            r7[r15] = r5     // Catch:{ all -> 0x013e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x013e }
            r7[r14] = r0     // Catch:{ all -> 0x013e }
            r2.addRow(r7)     // Catch:{ all -> 0x013e }
            r11 = 4
            r12 = 3
            r13 = 2
            goto L_0x004d
        L_0x0137:
            throw r0     // Catch:{ all -> 0x013e }
        L_0x0138:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.e
            r0.set(r15)
            return r2
        L_0x013e:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.e
            r2.set(r15)
            throw r0
        L_0x0145:
            java.lang.String r0 = "Diagnose returning early - external call pending"
            defpackage.pnz.e(r0)
            r0 = 0
            return r0
        L_0x014d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = java.lang.String.valueOf(r23)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 13
            r4.<init>(r3)
            java.lang.String r3 = "illegal uri: "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            throw r2
        L_0x0172:
            r0 = r24[r15]
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.String r3 = java.lang.String.valueOf(r3)
            boolean r0 = r0.equals(r3)
            java.io.StringWriter r3 = new java.io.StringWriter
            r3.<init>()
            java.io.PrintWriter r7 = new java.io.PrintWriter
            r7.<init>(r3)
            java.lang.String r12 = "InternalIcingCorporaProvider:"
            r7.println(r12)
            pnp r12 = r22.g()
            android.database.sqlite.SQLiteDatabase r13 = r12.getReadableDatabase()
            r11 = 2
            java.lang.Object[] r9 = new java.lang.Object[r11]
            java.lang.String r10 = "  "
            r9[r15] = r10
            java.lang.String r11 = "Max seqnos:"
            r9[r14] = r11
            defpackage.pnk.a(r7, r9)
            anax r9 = defpackage.pno.e
            anhj r9 = r9.iterator()
        L_0x01aa:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x01e2
            java.lang.Object r11 = r9.next()
            pno r11 = (defpackage.pno) r11
            dvj r11 = r11.b()
            r14 = 5
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r14[r15] = r10
            r18 = 1
            r14[r18] = r10
            java.lang.String r15 = r11.a
            r17 = 2
            r14[r17] = r15
            java.lang.String r15 = ": "
            r19 = 3
            r14[r19] = r15
            r15 = r11
            long r19 = r12.b((defpackage.dvj) r15)
            java.lang.Long r15 = java.lang.Long.valueOf(r19)
            r16 = 4
            r14[r16] = r15
            defpackage.pnk.a(r7, r14)
            r14 = 1
            r15 = 0
            goto L_0x01aa
        L_0x01e2:
            r9 = 0
            java.lang.Object[] r14 = new java.lang.Object[r9]
            defpackage.pnk.a(r7, r14)
            pmr r12 = r12.e
            if (r12 != 0) goto L_0x01fc
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r9] = r10
            java.lang.String r2 = "ContactsHelper not loaded (potentially failed)."
            r4 = 1
            r0[r4] = r2
            defpackage.pnk.a(r7, r0)
            r4 = 1
            goto L_0x0346
        L_0x01fc:
            if (r0 != 0) goto L_0x0201
            java.lang.String r9 = "simple"
            goto L_0x0203
        L_0x0201:
            java.lang.String r9 = "extensive"
        L_0x0203:
            r14 = 2
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r14 = 0
            r15[r14] = r10
            int r14 = r9.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r14 = r14 + 18
            r11.<init>(r14)
            java.lang.String r14 = "ContactsHelper ("
            r11.append(r14)
            r11.append(r9)
            java.lang.String r9 = "):"
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r11 = 1
            r15[r11] = r9
            defpackage.pnk.a(r7, r15)
            r9 = 2
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x031a }
            r9 = 0
            r11[r9] = r8     // Catch:{ Exception -> 0x031a }
            int r9 = defpackage.pmw.a((android.database.sqlite.SQLiteDatabase) r13, (java.lang.String) r6)     // Catch:{ Exception -> 0x031a }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x031a }
            r15 = 26
            r14.<init>(r15)     // Catch:{ Exception -> 0x031a }
            java.lang.String r15 = "Contact count: "
            r14.append(r15)     // Catch:{ Exception -> 0x031a }
            r14.append(r9)     // Catch:{ Exception -> 0x031a }
            java.lang.String r9 = r14.toString()     // Catch:{ Exception -> 0x031a }
            r14 = 1
            r11[r14] = r9     // Catch:{ Exception -> 0x031a }
            defpackage.pnk.a(r7, r11)     // Catch:{ Exception -> 0x031a }
            r9 = 2
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x031a }
            r9 = 0
            r11[r9] = r8     // Catch:{ Exception -> 0x031a }
            int r9 = defpackage.pmw.a((android.database.sqlite.SQLiteDatabase) r13, (java.lang.String) r5)     // Catch:{ Exception -> 0x031a }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x031a }
            r15 = 24
            r14.<init>(r15)     // Catch:{ Exception -> 0x031a }
            java.lang.String r15 = "Email count: "
            r14.append(r15)     // Catch:{ Exception -> 0x031a }
            r14.append(r9)     // Catch:{ Exception -> 0x031a }
            java.lang.String r9 = r14.toString()     // Catch:{ Exception -> 0x031a }
            r14 = 1
            r11[r14] = r9     // Catch:{ Exception -> 0x031a }
            defpackage.pnk.a(r7, r11)     // Catch:{ Exception -> 0x031a }
            r9 = 2
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x031a }
            r9 = 0
            r11[r9] = r8     // Catch:{ Exception -> 0x031a }
            int r9 = defpackage.pmw.a((android.database.sqlite.SQLiteDatabase) r13, (java.lang.String) r4)     // Catch:{ Exception -> 0x031a }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x031a }
            r15 = 24
            r14.<init>(r15)     // Catch:{ Exception -> 0x031a }
            java.lang.String r15 = "Phone count: "
            r14.append(r15)     // Catch:{ Exception -> 0x031a }
            r14.append(r9)     // Catch:{ Exception -> 0x031a }
            java.lang.String r9 = r14.toString()     // Catch:{ Exception -> 0x031a }
            r14 = 1
            r11[r14] = r9     // Catch:{ Exception -> 0x031a }
            defpackage.pnk.a(r7, r11)     // Catch:{ Exception -> 0x031a }
            r9 = 2
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x031a }
            r9 = 0
            r11[r9] = r8     // Catch:{ Exception -> 0x031a }
            int r9 = defpackage.pmw.a((android.database.sqlite.SQLiteDatabase) r13, (java.lang.String) r2)     // Catch:{ Exception -> 0x031a }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x031a }
            r15 = 25
            r14.<init>(r15)     // Catch:{ Exception -> 0x031a }
            java.lang.String r15 = "Postal count: "
            r14.append(r15)     // Catch:{ Exception -> 0x031a }
            r14.append(r9)     // Catch:{ Exception -> 0x031a }
            java.lang.String r9 = r14.toString()     // Catch:{ Exception -> 0x031a }
            r14 = 1
            r11[r14] = r9     // Catch:{ Exception -> 0x031a }
            defpackage.pnk.a(r7, r11)     // Catch:{ Exception -> 0x031a }
            r9 = 3
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x031a }
            r9 = 0
            r14[r9] = r8     // Catch:{ Exception -> 0x031a }
            java.lang.String r9 = "Last delta update timestamp: "
            r15 = 1
            r14[r15] = r9     // Catch:{ Exception -> 0x031a }
            r9 = r12
            pmw r9 = (defpackage.pmw) r9     // Catch:{ Exception -> 0x031a }
            android.content.SharedPreferences r9 = r9.a()     // Catch:{ Exception -> 0x031a }
            java.lang.String r15 = "key_last_contacts_delta_delete_timestamp"
            r16 = r12
            r11 = 0
            long r20 = r9.getLong(r15, r11)     // Catch:{ Exception -> 0x031a }
            java.lang.CharSequence r9 = defpackage.pnk.a(r20)     // Catch:{ Exception -> 0x031a }
            r11 = 2
            r14[r11] = r9     // Catch:{ Exception -> 0x031a }
            defpackage.pnk.a(r7, r14)     // Catch:{ Exception -> 0x031a }
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x031a }
            r11 = 0
            r9[r11] = r8     // Catch:{ Exception -> 0x031a }
            java.lang.String r11 = "Last delta delete timestamp: "
            r12 = 1
            r9[r12] = r11     // Catch:{ Exception -> 0x031a }
            r12 = r16
            pmw r12 = (defpackage.pmw) r12     // Catch:{ Exception -> 0x031a }
            android.content.SharedPreferences r11 = r12.a()     // Catch:{ Exception -> 0x031a }
            java.lang.String r12 = "key_last_contacts_delta_update_timestamp"
            r14 = 0
            long r11 = r11.getLong(r12, r14)     // Catch:{ Exception -> 0x031a }
            java.lang.CharSequence r11 = defpackage.pnk.a(r11)     // Catch:{ Exception -> 0x031a }
            r12 = 2
            r9[r12] = r11     // Catch:{ Exception -> 0x031a }
            defpackage.pnk.a(r7, r9)     // Catch:{ Exception -> 0x031a }
            r9 = 0
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x031a }
            defpackage.pnk.a(r7, r11)     // Catch:{ Exception -> 0x031a }
            if (r0 == 0) goto L_0x0318
            defpackage.pnk.a(r13, r8, r7, r6)     // Catch:{ Exception -> 0x031a }
            defpackage.pnk.a(r13, r8, r7, r5)     // Catch:{ Exception -> 0x031a }
            defpackage.pnk.a(r13, r8, r7, r4)     // Catch:{ Exception -> 0x031a }
            defpackage.pnk.a(r13, r8, r7, r2)     // Catch:{ Exception -> 0x031a }
            r4 = 1
            goto L_0x0346
        L_0x0318:
            r4 = 1
            goto L_0x0346
        L_0x031a:
            r0 = move-exception
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            r2[r4] = r8
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 29
            r5.<init>(r4)
            java.lang.String r4 = "Exception while dumping state"
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4 = 1
            r2[r4] = r0
            defpackage.pnk.a(r7, r2)
        L_0x0346:
            android.content.Context r0 = r22.getContext()
            com.google.android.gms.icing.proxy.UpdateIcingCorporaIntentOperation.a(r0, r10, r7)
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r5 = "dump"
            r6 = 0
            r2[r6] = r5
            r0.<init>(r2)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r3 = r3.toString()
            r2[r6] = r3
            r0.addRow(r2)
            return r0
        L_0x0365:
            java.lang.SecurityException r2 = new java.lang.SecurityException
            java.lang.String r0 = java.lang.String.valueOf(r23)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 39
            r4.<init>(r3)
            java.lang.String r3 = "No access to query "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = " for uid "
            r4.append(r0)
            r4.append(r7)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            goto L_0x0393
        L_0x0392:
            throw r2
        L_0x0393:
            goto L_0x0392
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.icing.proxy.InternalIcingCorporaChimeraProvider.a(android.net.Uri, java.lang.String[]):android.database.Cursor");
    }

    public final boolean c() {
        this.d = new UriMatcher(-1);
        this.e = new AtomicBoolean();
        this.d.addURI("com.google.android.gms.icing.proxy", "contacts", 1);
        this.d.addURI("com.google.android.gms.icing.proxy", "request_indexing", 2);
        this.d.addURI("com.google.android.gms.icing.proxy", "dump", 3);
        this.d.addURI("com.google.android.gms.icing.proxy", "diagnose", 4);
        return true;
    }

    /* access modifiers changed from: protected */
    public final dvg d() {
        if (this.c == null) {
            this.c = new dvg("com.google.android.gms.icing.proxy", pnq.a());
        }
        return this.c;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final String e() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public final pnp g() {
        return pnp.a(getContext());
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Pair pair;
        pnz.d("update(uri=%s)", uri);
        int callingUid = Binder.getCallingUid();
        if (callingUid == Process.myUid()) {
            int match = this.d.match(uri);
            if (match != -1) {
                boolean z = true;
                if (match != 2) {
                    pnp g = g();
                    SQLiteDatabase f = g.f();
                    if (f == null) {
                        return -1;
                    }
                    if (match == 1) {
                        Resources resources = getContext().getResources();
                        if (g.e() == null) {
                            pnz.a("ContactsHelper failed to load.");
                            pair = new Pair(-1, false);
                        } else {
                            if ("delta".equals(str)) {
                                pair = g.e().b(f, resources);
                            } else if ("ids".equals(str) && strArr != null) {
                                HashSet hashSet = new HashSet();
                                for (String parseLong : strArr) {
                                    hashSet.add(Long.valueOf(Long.parseLong(parseLong)));
                                }
                                pair = g.e().a(f, resources, hashSet);
                            } else if (str == null) {
                                pair = g.e().a(f, resources);
                            } else {
                                throw new IllegalArgumentException("unrecognized selection");
                            }
                            g.a(((Integer) pair.first).intValue(), pnq.a.c());
                            g.a(((Integer) pair.first).intValue(), pnq.b.c());
                            g.a(((Integer) pair.first).intValue(), pnq.c.c());
                            g.a(((Integer) pair.first).intValue(), pnq.d.c());
                        }
                        int intValue = ((Integer) pair.first).intValue();
                        boolean booleanValue = ((Boolean) pair.second).booleanValue();
                        boolean booleanValue2 = ((Boolean) ozx.ao.c()).booleanValue();
                        pnz.c("InternalIcingCorporaChimeraProvider.update numUpdate = %d isSignificant = %b G.sendContactChangedBroadcastNoUpdates = %b", Integer.valueOf(intValue), Boolean.valueOf(booleanValue), Boolean.valueOf(booleanValue2));
                        if (intValue <= 0 && !booleanValue2) {
                            pnz.d("InternalIcingCorporaChimeraProvider doesn't send contact changed broadcast");
                        } else {
                            pnz.d("InternalIcingCorporaChimeraProvider sending contact changed broadcast");
                            itg.a(getContext(), booleanValue);
                        }
                        return intValue;
                    }
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                    sb.append("unhandled match for uri ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                } else if (this.e.compareAndSet(false, true)) {
                    try {
                        for (dvj dvj : pnq.a()) {
                            String valueOf2 = String.valueOf(dvj);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
                            sb2.append("Requesting indexing: ");
                            sb2.append(valueOf2);
                            pnz.a(sb2.toString());
                            z &= g().c(dvj);
                        }
                        if (!z) {
                            pnz.e("Request indexing failed");
                        }
                        return 0;
                    } finally {
                        this.e.set(false);
                    }
                } else {
                    pnz.e("Request indexing returning early - external call pending");
                    return 0;
                }
            } else {
                String valueOf3 = String.valueOf(uri);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 13);
                sb3.append("invalid uri: ");
                sb3.append(valueOf3);
                throw new IllegalArgumentException(sb3.toString());
            }
        } else {
            String valueOf4 = String.valueOf(uri);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 40);
            sb4.append("No access to update ");
            sb4.append(valueOf4);
            sb4.append(" for uid ");
            sb4.append(callingUid);
            throw new SecurityException(sb4.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final dvf a() {
        return g();
    }
}
