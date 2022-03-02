package defpackage;

import android.content.ContentValues;
import android.database.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cjo extends cbe {
    public final HashSet a = new HashSet();
    public final cla b = new cla();
    private final ckw c = new ckw();
    private final civ d;

    public cjo(civ civ) {
        this.d = civ;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009c, code lost:
        r16 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a0, code lost:
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ac, code lost:
        r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cb, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d2, code lost:
        r16.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList a(defpackage.jum r20, java.lang.String r21) {
        /*
            r19 = this;
            java.lang.String r0 = "_id"
            r1 = r20
            java.lang.String r8 = defpackage.cjp.a((defpackage.jxo) r1, (java.lang.String) r0)
            java.lang.String r9 = defpackage.cjp.a((defpackage.jxo) r20)
            r1 = 3
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r1 = "proto_blob"
            r10 = 0
            r3[r10] = r1
            r11 = 1
            r3[r11] = r0
            java.lang.String r0 = "account_id"
            r12 = 2
            r3[r12] = r0
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.String r14 = "cjo"
            java.lang.String r15 = "a"
            java.lang.String r7 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r16 = 0
            r6 = r19
            civ r0 = r6.d     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            cis r1 = r0.a     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            java.lang.String r0 = r0.b     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            jjj r0 = r1.a(r12, r0)     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            android.database.sqlite.SQLiteDatabase r1 = r0.getReadableDatabase()     // Catch:{ SQLException -> 0x00ab, all -> 0x00a9 }
            java.lang.String r2 = "feature"
            r5 = 0
            r0 = 0
            r17 = 0
            r4 = r21
            r6 = r0
            r18 = r7
            r7 = r17
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLException -> 0x00a5, all -> 0x00a9 }
        L_0x004a:
            boolean r0 = r1.moveToNext()     // Catch:{ SQLException -> 0x009f, all -> 0x009b }
            if (r0 == 0) goto L_0x0095
            byte[] r0 = r1.getBlob(r10)     // Catch:{ SQLException -> 0x009f, all -> 0x009b }
            int r2 = r1.getInt(r11)     // Catch:{ SQLException -> 0x009f, all -> 0x009b }
            java.lang.String r3 = r1.getString(r12)     // Catch:{ SQLException -> 0x009f, all -> 0x009b }
            if (r0 == 0) goto L_0x0077
            juj r4 = new juj     // Catch:{ SQLException -> 0x009f, all -> 0x009b }
            if (r3 == 0) goto L_0x006a
            defpackage.cbi.y()     // Catch:{ SQLException -> 0x009f, all -> 0x009b }
            bsz r3 = defpackage.bsx.b((java.lang.String) r3)     // Catch:{ SQLException -> 0x009f, all -> 0x009b }
            goto L_0x006c
        L_0x006a:
            r3 = r16
        L_0x006c:
            r4.<init>(r0, r2, r3)     // Catch:{ SQLException -> 0x009f, all -> 0x009b }
            atpe r0 = r4.a     // Catch:{ SQLException -> 0x009f, all -> 0x009b }
            if (r0 == 0) goto L_0x0077
            r13.add(r4)     // Catch:{ SQLException -> 0x009f, all -> 0x009b }
            goto L_0x004a
        L_0x0077:
            jjg r0 = defpackage.bxk.a     // Catch:{ SQLException -> 0x009f, all -> 0x009b }
            anie r0 = r0.b()     // Catch:{ SQLException -> 0x009f, all -> 0x009b }
            anih r0 = (defpackage.anih) r0     // Catch:{ SQLException -> 0x009f, all -> 0x009b }
            r2 = 224(0xe0, float:3.14E-43)
            r3 = r18
            anie r0 = r0.a((java.lang.String) r14, (java.lang.String) r15, (int) r2, (java.lang.String) r3)     // Catch:{ SQLException -> 0x0093, all -> 0x009b }
            anih r0 = (defpackage.anih) r0     // Catch:{ SQLException -> 0x0093, all -> 0x009b }
            java.lang.String r2 = "[FeatureStore] Corrupt feature proto bytes for query %s."
            r4 = r21
            r0.a((java.lang.String) r2, (java.lang.Object) r4)     // Catch:{ SQLException -> 0x0093, all -> 0x009b }
            r18 = r3
            goto L_0x004a
        L_0x0093:
            r0 = move-exception
            goto L_0x00a2
        L_0x0095:
            if (r1 == 0) goto L_0x00ce
            r1.close()
            goto L_0x00ce
        L_0x009b:
            r0 = move-exception
            r16 = r1
            goto L_0x00d0
        L_0x009f:
            r0 = move-exception
            r3 = r18
        L_0x00a2:
            r16 = r1
            goto L_0x00ad
        L_0x00a5:
            r0 = move-exception
            r3 = r18
            goto L_0x00ad
        L_0x00a9:
            r0 = move-exception
            goto L_0x00d0
        L_0x00ab:
            r0 = move-exception
            r3 = r7
        L_0x00ad:
            jjg r1 = defpackage.bxk.a     // Catch:{ all -> 0x00cf }
            anie r1 = r1.b()     // Catch:{ all -> 0x00cf }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x00cf }
            r1.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00cf }
            r2 = 227(0xe3, float:3.18E-43)
            anie r1 = r1.a((java.lang.String) r14, (java.lang.String) r15, (int) r2, (java.lang.String) r3)     // Catch:{ all -> 0x00cf }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x00cf }
            java.lang.String r2 = "[FeatureStore]  %s"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00cf }
            r1.a((java.lang.String) r2, (java.lang.Object) r0)     // Catch:{ all -> 0x00cf }
            if (r16 == 0) goto L_0x00ce
            r16.close()
        L_0x00ce:
            return r13
        L_0x00cf:
            r0 = move-exception
        L_0x00d0:
            if (r16 == 0) goto L_0x00d5
            r16.close()
        L_0x00d5:
            goto L_0x00d7
        L_0x00d6:
            throw r0
        L_0x00d7:
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjo.a(jum, java.lang.String):java.util.ArrayList");
    }

    public final int b(jum jum) {
        new Object[1][0] = jum;
        ckw ckw = this.c;
        bsz bsz = jum.a;
        Iterator it = ckw.a.entrySet().iterator();
        while (it.hasNext()) {
            if (((ckv) ((Map.Entry) it.next()).getKey()).a.equals(bsz)) {
                it.remove();
            }
        }
        try {
            return this.d.a().delete("feature", cjp.a(jum), (String[]) null);
        } catch (SQLException e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("cjo", "b", 249, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FeatureStore] delete getWritableFeatureDatabase failed");
            return 0;
        }
    }

    static void a(cjl cjl, int i) {
        cjl.b.clearBindings();
        long j = (long) i;
        cjl.b.bindLong(1, j);
        cjl.b.bindLong(2, j);
        try {
            cjl.b.executeUpdateDelete();
        } catch (SQLException e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("cjo", "a", 385, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FeatureStore] pruneAnonymous:");
        }
    }

    static void a(cjl cjl, bsz bsz, int i) {
        cjl.a.clearBindings();
        long j = (long) i;
        cjl.a.bindLong(1, j);
        cjl.a.bindString(2, bsz.b);
        cjl.a.bindLong(3, j);
        cjl.a.bindString(4, bsz.b);
        try {
            cjl.a.executeUpdateDelete();
        } catch (SQLException e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("cjo", "a", 372, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FeatureStore] pruneWithAccount:");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a7, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        r0 = defpackage.atjo.a(r15.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        if (r0 != 0) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        if (r0 == 1) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ba, code lost:
        r9 = " }";
        r7 = "{ ";
        r5 = defpackage.ckx.a(r20, "context_family", r2, r16, ", ", false);
        r0 = defpackage.atjv.a(r15.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d5, code lost:
        if (r0 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d8, code lost:
        r0 = defpackage.atjv.UNKNOWN_CONTEXT_NAME;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        r2 = r0.name();
        r0 = defpackage.atjv.a(r15.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e4, code lost:
        if (r0 != null) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e6, code lost:
        r0 = defpackage.atjv.UNKNOWN_CONTEXT_NAME;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ea, code lost:
        if (r0 == defpackage.atjv.UNKNOWN_CONTEXT_NAME) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ec, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ee, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ef, code lost:
        defpackage.ckx.a(r20, "context_name", r2, r3, ", ", r5);
        r6.print(r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.io.PrintWriter r20, defpackage.atnh r21) {
        /*
            r6 = r20
            r7 = r21
            aucx r0 = r7.b
            int r0 = r0.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 23
            r1.<init>(r2)
            java.lang.String r2 = " (num acls="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r8 = ")"
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            r6.println(r0)
            r10 = 0
        L_0x0026:
            aucx r0 = r7.b
            int r0 = r0.size()
            if (r10 >= r0) goto L_0x037b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 22
            r0.<init>(r1)
            java.lang.String r1 = "    acl["
            r0.append(r1)
            r0.append(r10)
            java.lang.String r11 = "]: "
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            r6.print(r0)
            aucx r0 = r7.b
            java.lang.Object r0 = r0.get(r10)
            r12 = r0
            atow r12 = (defpackage.atow) r12
            java.lang.String r13 = "null"
            if (r12 == 0) goto L_0x036e
            java.lang.String r14 = "{"
            r6.println(r14)
            java.lang.String r0 = "      context_key: "
            r6.print(r0)
            atoy r0 = r12.b
            if (r0 != 0) goto L_0x0068
            atoy r0 = defpackage.atoy.d
            r15 = r0
            goto L_0x0069
        L_0x0068:
            r15 = r0
        L_0x0069:
            java.lang.String r5 = "{ "
            java.lang.String r4 = " }"
            r3 = 1
            if (r15 == 0) goto L_0x00fd
            r6.print(r5)
            int r0 = r15.b
            int r0 = defpackage.atjo.a(r0)
            if (r0 == 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r0 = 1
        L_0x007d:
            switch(r0) {
                case 1: goto L_0x00a5;
                case 2: goto L_0x00a2;
                case 3: goto L_0x009f;
                case 4: goto L_0x009c;
                case 5: goto L_0x0099;
                case 6: goto L_0x0096;
                case 7: goto L_0x0093;
                case 8: goto L_0x0090;
                case 9: goto L_0x008d;
                case 10: goto L_0x008a;
                case 11: goto L_0x0087;
                case 12: goto L_0x0084;
                default: goto L_0x0080;
            }
        L_0x0080:
            java.lang.String r0 = "SUGGEST_STATE"
            r2 = r0
            goto L_0x00a8
        L_0x0084:
            java.lang.String r0 = "TASKS"
            goto L_0x00a7
        L_0x0087:
            java.lang.String r0 = "SEMANTIC_TIME"
            goto L_0x00a7
        L_0x008a:
            java.lang.String r0 = "USER_PROFILE"
            goto L_0x00a7
        L_0x008d:
            java.lang.String r0 = "DEVICE_ACTIVITY"
            goto L_0x00a7
        L_0x0090:
            java.lang.String r0 = "DEVICE_STATE"
            goto L_0x00a7
        L_0x0093:
            java.lang.String r0 = "AMBIENCE"
            goto L_0x00a7
        L_0x0096:
            java.lang.String r0 = "PROXIMITY"
            goto L_0x00a7
        L_0x0099:
            java.lang.String r0 = "PLACE"
            goto L_0x00a7
        L_0x009c:
            java.lang.String r0 = "LOCATION"
            goto L_0x00a7
        L_0x009f:
            java.lang.String r0 = "USER_STATE"
            goto L_0x00a7
        L_0x00a2:
            java.lang.String r0 = "USER_ACTIVITY"
            goto L_0x00a7
        L_0x00a5:
            java.lang.String r0 = "UNKNOWN_CONTEXT_FAMILY"
        L_0x00a7:
            r2 = r0
        L_0x00a8:
            int r0 = r15.b
            int r0 = defpackage.atjo.a(r0)
            if (r0 != 0) goto L_0x00b3
            r16 = 0
            goto L_0x00ba
        L_0x00b3:
            if (r0 == r3) goto L_0x00b8
            r16 = 1
            goto L_0x00ba
        L_0x00b8:
            r16 = 0
        L_0x00ba:
            r17 = 0
            java.lang.String r1 = "context_family"
            java.lang.String r18 = ", "
            r0 = r20
            r9 = 1
            r3 = r16
            r9 = r4
            r4 = r18
            r7 = r5
            r5 = r17
            boolean r5 = defpackage.ckx.a(r0, r1, r2, r3, r4, r5)
            int r0 = r15.c
            atjv r0 = defpackage.atjv.a(r0)
            if (r0 == 0) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            atjv r0 = defpackage.atjv.UNKNOWN_CONTEXT_NAME
        L_0x00da:
            java.lang.String r2 = r0.name()
            int r0 = r15.c
            atjv r0 = defpackage.atjv.a(r0)
            if (r0 != 0) goto L_0x00e8
            atjv r0 = defpackage.atjv.UNKNOWN_CONTEXT_NAME
        L_0x00e8:
            atjv r1 = defpackage.atjv.UNKNOWN_CONTEXT_NAME
            if (r0 == r1) goto L_0x00ee
            r3 = 1
            goto L_0x00ef
        L_0x00ee:
            r3 = 0
        L_0x00ef:
            java.lang.String r1 = "context_name"
            java.lang.String r4 = ", "
            r0 = r20
            defpackage.ckx.a(r0, r1, r2, r3, r4, r5)
            r6.print(r9)
            goto L_0x0102
        L_0x00fd:
            r9 = r4
            r7 = r5
            r6.println(r13)
        L_0x0102:
            r20.println()
            java.lang.String r0 = "        "
            aucx r1 = r12.c
            int r1 = r1.size()
            java.lang.String r2 = "unknown ("
            java.lang.String r3 = "  "
            if (r1 != 0) goto L_0x011a
            java.lang.String r1 = "      acl_entry: null"
            r6.println(r1)
            goto L_0x0297
        L_0x011a:
            r1 = 0
        L_0x011b:
            aucx r5 = r12.c
            int r5 = r5.size()
            if (r1 >= r5) goto L_0x0297
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r15 = 30
            r5.<init>(r15)
            java.lang.String r15 = "      acl_entry["
            r5.append(r15)
            r5.append(r1)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r6.print(r5)
            aucx r5 = r12.c
            java.lang.Object r5 = r5.get(r1)
            atnf r5 = (defpackage.atnf) r5
            if (r5 == 0) goto L_0x0285
            java.lang.String r15 = r0.concat(r3)
            r6.println(r14)
            int r4 = r5.a
            r16 = 1
            r4 = r4 & 1
            if (r4 == 0) goto L_0x01d1
            java.lang.String r4 = "entity: "
            java.lang.String r4 = r0.concat(r4)
            r6.print(r4)
            atpd r4 = r5.b
            if (r4 != 0) goto L_0x0164
            atpd r4 = defpackage.atpd.d
        L_0x0164:
            if (r4 == 0) goto L_0x01c6
            r18 = r11
            java.lang.String r11 = "{ type: "
            r6.print(r11)
            atnd r11 = defpackage.atnd.UNKNOWN_ACCESS_TYPE
            atqx r11 = defpackage.atqx.UNKNOWN_SYNC_TYPE
            int r11 = r4.b
            int r11 = defpackage.atpc.a(r11)
            if (r11 == 0) goto L_0x017a
            goto L_0x017b
        L_0x017a:
            r11 = 1
        L_0x017b:
            int r11 = r11 + -1
            if (r11 == 0) goto L_0x0191
            r19 = r14
            r14 = 1
            if (r11 == r14) goto L_0x018a
            java.lang.String r11 = "ALL_PACKAGES"
            r6.print(r11)
            goto L_0x0198
        L_0x018a:
            java.lang.String r11 = "SINGLE_PACKAGE"
            r6.print(r11)
            goto L_0x0198
        L_0x0191:
            r19 = r14
            java.lang.String r11 = "ENTITY_TYPE_UNKNOWN"
            r6.print(r11)
        L_0x0198:
            int r11 = r4.a
            r14 = 2
            r11 = r11 & r14
            if (r11 == 0) goto L_0x01c1
            java.lang.String r11 = r4.c
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x01c1
            java.lang.String r4 = r4.c
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r11 = ", package_name: "
            int r14 = r4.length()
            if (r14 != 0) goto L_0x01ba
            java.lang.String r4 = new java.lang.String
            r4.<init>(r11)
            goto L_0x01be
        L_0x01ba:
            java.lang.String r4 = r11.concat(r4)
        L_0x01be:
            r6.print(r4)
        L_0x01c1:
            r6.print(r9)
            goto L_0x01cd
        L_0x01c6:
            r18 = r11
            r19 = r14
            r6.print(r13)
        L_0x01cd:
            r20.println()
            goto L_0x01d5
        L_0x01d1:
            r18 = r11
            r19 = r14
        L_0x01d5:
            int r4 = r5.a
            r11 = 2
            r4 = r4 & r11
            if (r4 == 0) goto L_0x027a
            java.lang.String r4 = "policy: "
            java.lang.String r4 = r0.concat(r4)
            r6.print(r4)
            atnb r4 = r5.c
            if (r4 != 0) goto L_0x01ea
            atnb r4 = defpackage.atnb.c
        L_0x01ea:
            if (r4 == 0) goto L_0x0273
            java.lang.String r5 = "{ access_type: "
            r6.print(r5)
            java.lang.String r5 = java.lang.String.valueOf(r15)
            r5.concat(r3)
            int r4 = r4.b
            atnd r4 = defpackage.atnd.a(r4)
            if (r4 == 0) goto L_0x0201
            goto L_0x0203
        L_0x0201:
            atnd r4 = defpackage.atnd.UNKNOWN_ACCESS_TYPE
        L_0x0203:
            atqx r5 = defpackage.atqx.UNKNOWN_SYNC_TYPE
            int r5 = r4.ordinal()
            switch(r5) {
                case 0: goto L_0x0268;
                case 1: goto L_0x0261;
                case 2: goto L_0x025a;
                case 3: goto L_0x0253;
                case 4: goto L_0x024c;
                case 5: goto L_0x0245;
                case 6: goto L_0x023e;
                case 7: goto L_0x0237;
                case 8: goto L_0x0230;
                default: goto L_0x020c;
            }
        L_0x020c:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r5 = r5 + 10
            r11.<init>(r5)
            r11.append(r2)
            r11.append(r4)
            r11.append(r8)
            java.lang.String r4 = r11.toString()
            r6.print(r4)
            goto L_0x026e
        L_0x0230:
            java.lang.String r4 = "READ_INJECT"
            r6.print(r4)
            goto L_0x026e
        L_0x0237:
            java.lang.String r4 = "LISTEN_INJECT"
            r6.print(r4)
            goto L_0x026e
        L_0x023e:
            java.lang.String r4 = "LISTEN_WRITE"
            r6.print(r4)
            goto L_0x026e
        L_0x0245:
            java.lang.String r4 = "INJECT_ONLY"
            r6.print(r4)
            goto L_0x026e
        L_0x024c:
            java.lang.String r4 = "LISTEN_ONLY"
            r6.print(r4)
            goto L_0x026e
        L_0x0253:
            java.lang.String r4 = "READ_WRITE"
            r6.print(r4)
            goto L_0x026e
        L_0x025a:
            java.lang.String r4 = "WRITE_ONLY"
            r6.print(r4)
            goto L_0x026e
        L_0x0261:
            java.lang.String r4 = "READ_ONLY"
            r6.print(r4)
            goto L_0x026e
        L_0x0268:
            java.lang.String r4 = "UNKNOWN_ACCESS_TYPE"
            r6.print(r4)
        L_0x026e:
            r6.print(r9)
            goto L_0x0277
        L_0x0273:
            r6.print(r13)
        L_0x0277:
            r20.println()
        L_0x027a:
            java.lang.String r4 = "}"
            java.lang.String r4 = r0.concat(r4)
            r6.print(r4)
            goto L_0x028c
        L_0x0285:
            r18 = r11
            r19 = r14
            r6.print(r13)
        L_0x028c:
            r20.println()
            int r1 = r1 + 1
            r11 = r18
            r14 = r19
            goto L_0x011b
        L_0x0297:
            int r1 = r12.a
            r4 = 2
            r1 = r1 & r4
            if (r1 == 0) goto L_0x030f
            java.lang.String r1 = "      sync_policy: "
            r6.print(r1)
            atqv r1 = r12.d
            if (r1 != 0) goto L_0x02a8
            atqv r1 = defpackage.atqv.c
        L_0x02a8:
            if (r1 == 0) goto L_0x0308
            java.lang.String r4 = "{ sync_type: "
            r6.print(r4)
            r0.concat(r3)
            int r0 = r1.b
            atqx r0 = defpackage.atqx.a(r0)
            if (r0 == 0) goto L_0x02bb
            goto L_0x02bd
        L_0x02bb:
            atqx r0 = defpackage.atqx.UNKNOWN_SYNC_TYPE
        L_0x02bd:
            atnd r1 = defpackage.atnd.UNKNOWN_ACCESS_TYPE
            int r1 = r0.ordinal()
            if (r1 == 0) goto L_0x02fd
            r3 = 1
            if (r1 == r3) goto L_0x02f6
            r3 = 2
            if (r1 == r3) goto L_0x02ef
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 10
            r3.<init>(r1)
            r3.append(r2)
            r3.append(r0)
            r3.append(r8)
            java.lang.String r0 = r3.toString()
            r6.print(r0)
            goto L_0x0303
        L_0x02ef:
            java.lang.String r0 = "SYNCABLE_TO_BACKEND"
            r6.print(r0)
            goto L_0x0303
        L_0x02f6:
            java.lang.String r0 = "DO_NOT_SYNC"
            r6.print(r0)
            goto L_0x0303
        L_0x02fd:
            java.lang.String r0 = "UNKNOWN_SYNC_TYPE"
            r6.print(r0)
        L_0x0303:
            r6.print(r9)
            goto L_0x030c
        L_0x0308:
            r6.print(r13)
        L_0x030c:
            r20.println()
        L_0x030f:
            int r0 = r12.a
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0367
            java.lang.String r0 = "      retention_policy: "
            r6.print(r0)
            atql r0 = r12.e
            if (r0 != 0) goto L_0x0320
            atql r0 = defpackage.atql.d
        L_0x0320:
            if (r0 == 0) goto L_0x0360
            r6.print(r7)
            long r1 = r0.b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 43
            r3.<init>(r4)
            java.lang.String r4 = "time_to_retain_millis: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r6.print(r1)
            int r1 = r0.a
            r2 = 2
            r1 = r1 & r2
            if (r1 == 0) goto L_0x035b
            int r0 = r0.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 36
            r1.<init>(r2)
            java.lang.String r2 = ", retention_count_limit: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.print(r0)
        L_0x035b:
            r6.print(r9)
            goto L_0x0364
        L_0x0360:
            r6.print(r13)
        L_0x0364:
            r20.println()
        L_0x0367:
            java.lang.String r0 = "      }"
            r6.print(r0)
            goto L_0x0372
        L_0x036e:
            r6.print(r13)
        L_0x0372:
            r20.println()
            int r10 = r10 + 1
            r7 = r21
            goto L_0x0026
        L_0x037b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjo.a(java.io.PrintWriter, atnh):void");
    }

    public final long a(juj juj) {
        long j;
        bsz bsz = juj.b;
        Object[] objArr = {juj, bsz};
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(juj.a()));
        if (bsz != null) {
            contentValues.put("account_id", bsz.b);
        }
        ciw.a(contentValues, juj.b());
        ciw.a(contentValues, juj.d());
        contentValues.put("proto_blob", juj.a.k());
        try {
            j = this.d.a().insertOrThrow("feature", (String) null, contentValues);
        } catch (SQLException e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("cjo", "a", 89, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FeatureStore] Failed inserting feature %s", (Object) aqcr.a(Integer.valueOf(juj.a())));
            j = -1;
        }
        if (j != -1) {
            this.b.a((cky) new cjm(juj.b, juj));
        }
        if (this.a.contains(Integer.valueOf(juj.a()))) {
            this.c.a.put(ckv.a(juj.b, Integer.valueOf(juj.a())), juj);
        }
        return j;
    }

    public final ArrayList a(jum jum) {
        Object[] objArr = {jum, jum.a};
        return a(jum, cjp.a(jum));
    }

    public final juj a(bsz bsz, int i) {
        jum jum;
        if (bsz == null) {
            juk juk = new juk();
            juu juu = new juu();
            juu.b();
            juk.a(i, juu.a());
            juk.b();
            jum = juk.a();
        } else {
            HashSet hashSet = this.a;
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf) && this.c.a.containsKey(ckv.a(bsz, valueOf))) {
                return (juj) this.c.a.get(ckv.a(bsz, valueOf));
            }
            juk juk2 = new juk(bsz);
            juu juu2 = new juu();
            juu2.b();
            juk2.a(i, juu2.a());
            juk2.b();
            jum = juk2.a();
        }
        ArrayList a2 = a(jum);
        if (a2.isEmpty()) {
            return null;
        }
        if (a2.size() > 1) {
            ((anih) ((anih) bxk.a.b()).a("cjo", "a", 162, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FeatureStore] Should never get more than one result back.");
        }
        return (juj) a2.get(0);
    }

    public final void a() {
        cjl cjl;
        try {
            cjl = new cjl(this.d.a());
        } catch (SQLException e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("cjo", "a", 265, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FeatureStore] prune getWritableFeatureDatabase failed");
            cjl = null;
        }
        for (bsz bsz : cbi.y().a()) {
            if (cjl != null) {
                a(cjl, bsz, 1);
                a(cjl, bsz, 6);
                a(cjl, bsz, 11);
            }
            a(13, 86400000, bsz);
        }
        if (cjl != null) {
            a(cjl, 3);
            a(cjl, 10);
            a(cjl, 7);
        }
        a(5, 86400000, (bsz) null);
        juk juk = new juk();
        juu juu = new juu();
        juu.b();
        juk.a(9, juu.a());
        b(juk.a());
    }

    public final void a(int i, long j, bsz bsz) {
        juk juk = new juk(bsz);
        juu juu = new juu();
        juu.a(cbi.i().a() - j);
        juk.a(i, juu.a());
        b(juk.a());
    }
}
