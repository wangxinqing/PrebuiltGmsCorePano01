package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: eq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eq {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public eq(String str, Map map, Set set, Set set2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        this.d = set2 != null ? Collections.unmodifiableSet(set2) : null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0205, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0209, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0218 A[EDGE_INSN: B:105:0x0218->B:69:0x0218 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01f9 A[Catch:{ all -> 0x0205, all -> 0x0222 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.eq a(defpackage.di r29, java.lang.String r30) {
        /*
            r0 = r29
            r1 = r30
            java.lang.String r2 = "seq"
            java.lang.String r3 = "id"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "PRAGMA table_info(`"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = "`)"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.database.Cursor r4 = r0.a((java.lang.String) r4)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            int r7 = r4.getColumnCount()     // Catch:{ all -> 0x02c0 }
            java.lang.String r8 = "name"
            if (r7 > 0) goto L_0x0030
            goto L_0x007d
        L_0x0030:
            int r7 = r4.getColumnIndex(r8)     // Catch:{ all -> 0x02c0 }
            java.lang.String r11 = "type"
            int r11 = r4.getColumnIndex(r11)     // Catch:{ all -> 0x02c0 }
            java.lang.String r12 = "notnull"
            int r12 = r4.getColumnIndex(r12)     // Catch:{ all -> 0x02c0 }
            java.lang.String r13 = "pk"
            int r13 = r4.getColumnIndex(r13)     // Catch:{ all -> 0x02c0 }
            java.lang.String r14 = "dflt_value"
            int r14 = r4.getColumnIndex(r14)     // Catch:{ all -> 0x02c0 }
        L_0x004d:
            boolean r15 = r4.moveToNext()     // Catch:{ all -> 0x02c0 }
            if (r15 == 0) goto L_0x007d
            java.lang.String r15 = r4.getString(r7)     // Catch:{ all -> 0x02c0 }
            java.lang.String r18 = r4.getString(r11)     // Catch:{ all -> 0x02c0 }
            int r16 = r4.getInt(r12)     // Catch:{ all -> 0x02c0 }
            if (r16 == 0) goto L_0x0064
            r19 = 1
            goto L_0x0066
        L_0x0064:
            r19 = 0
        L_0x0066:
            int r20 = r4.getInt(r13)     // Catch:{ all -> 0x02c0 }
            java.lang.String r21 = r4.getString(r14)     // Catch:{ all -> 0x02c0 }
            em r9 = new em     // Catch:{ all -> 0x02c0 }
            r22 = 2
            r16 = r9
            r17 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x02c0 }
            r6.put(r15, r9)     // Catch:{ all -> 0x02c0 }
            goto L_0x004d
        L_0x007d:
            r4.close()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "PRAGMA foreign_key_list(`"
            r7.append(r9)
            r7.append(r1)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            android.database.Cursor r7 = r0.a((java.lang.String) r7)
            int r9 = r7.getColumnIndex(r3)     // Catch:{ all -> 0x02bb }
            int r11 = r7.getColumnIndex(r2)     // Catch:{ all -> 0x02bb }
            java.lang.String r12 = "table"
            int r12 = r7.getColumnIndex(r12)     // Catch:{ all -> 0x02bb }
            java.lang.String r13 = "on_delete"
            int r13 = r7.getColumnIndex(r13)     // Catch:{ all -> 0x02bb }
            java.lang.String r14 = "on_update"
            int r14 = r7.getColumnIndex(r14)     // Catch:{ all -> 0x02bb }
            int r3 = r7.getColumnIndex(r3)     // Catch:{ all -> 0x02bb }
            int r2 = r7.getColumnIndex(r2)     // Catch:{ all -> 0x02bb }
            java.lang.String r15 = "from"
            int r15 = r7.getColumnIndex(r15)     // Catch:{ all -> 0x02bb }
            java.lang.String r10 = "to"
            int r10 = r7.getColumnIndex(r10)     // Catch:{ all -> 0x02bb }
            r17 = r14
            int r14 = r7.getCount()     // Catch:{ all -> 0x02bb }
            r18 = r13
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x02bb }
            r13.<init>()     // Catch:{ all -> 0x02bb }
            r19 = r12
            r12 = 0
        L_0x00db:
            if (r12 >= r14) goto L_0x010f
            r7.moveToPosition(r12)     // Catch:{ all -> 0x02bb }
            r20 = r14
            eo r14 = new eo     // Catch:{ all -> 0x02bb }
            r21 = r9
            int r9 = r7.getInt(r3)     // Catch:{ all -> 0x02bb }
            r22 = r3
            int r3 = r7.getInt(r2)     // Catch:{ all -> 0x02bb }
            r23 = r2
            java.lang.String r2 = r7.getString(r15)     // Catch:{ all -> 0x02bb }
            r24 = r15
            java.lang.String r15 = r7.getString(r10)     // Catch:{ all -> 0x02bb }
            r14.<init>(r9, r3, r2, r15)     // Catch:{ all -> 0x02bb }
            r13.add(r14)     // Catch:{ all -> 0x02bb }
            int r12 = r12 + 1
            r14 = r20
            r9 = r21
            r3 = r22
            r2 = r23
            r15 = r24
            goto L_0x00db
        L_0x010f:
            r21 = r9
            java.util.Collections.sort(r13)     // Catch:{ all -> 0x02bb }
            int r2 = r7.getCount()     // Catch:{ all -> 0x02bb }
            r3 = 0
        L_0x0119:
            if (r3 < r2) goto L_0x0227
            r7.close()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "PRAGMA index_list(`"
            r2.append(r3)
            r2.append(r1)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.database.Cursor r2 = r0.a((java.lang.String) r2)
            int r3 = r2.getColumnIndex(r8)     // Catch:{ all -> 0x0222 }
            java.lang.String r7 = "origin"
            int r7 = r2.getColumnIndex(r7)     // Catch:{ all -> 0x0222 }
            java.lang.String r9 = "unique"
            int r9 = r2.getColumnIndex(r9)     // Catch:{ all -> 0x0222 }
            r11 = -1
            if (r3 != r11) goto L_0x014b
            goto L_0x0218
        L_0x014b:
            if (r7 == r11) goto L_0x0218
            if (r9 == r11) goto L_0x0218
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ all -> 0x0222 }
            r12.<init>()     // Catch:{ all -> 0x0222 }
        L_0x0154:
            boolean r13 = r2.moveToNext()     // Catch:{ all -> 0x0222 }
            if (r13 == 0) goto L_0x0213
            java.lang.String r13 = "c"
            java.lang.String r14 = r2.getString(r7)     // Catch:{ all -> 0x0222 }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0222 }
            if (r13 == 0) goto L_0x020a
            java.lang.String r13 = r2.getString(r3)     // Catch:{ all -> 0x0222 }
            int r14 = r2.getInt(r9)     // Catch:{ all -> 0x0222 }
            r15 = 1
            if (r14 != r15) goto L_0x0173
            r14 = 1
            goto L_0x0174
        L_0x0173:
            r14 = 0
        L_0x0174:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0222 }
            r10.<init>()     // Catch:{ all -> 0x0222 }
            java.lang.String r15 = "PRAGMA index_xinfo(`"
            r10.append(r15)     // Catch:{ all -> 0x0222 }
            r10.append(r13)     // Catch:{ all -> 0x0222 }
            r10.append(r5)     // Catch:{ all -> 0x0222 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0222 }
            android.database.Cursor r10 = r0.a((java.lang.String) r10)     // Catch:{ all -> 0x0222 }
            java.lang.String r15 = "seqno"
            int r15 = r10.getColumnIndex(r15)     // Catch:{ all -> 0x0205 }
            java.lang.String r11 = "cid"
            int r11 = r10.getColumnIndex(r11)     // Catch:{ all -> 0x0205 }
            int r0 = r10.getColumnIndex(r8)     // Catch:{ all -> 0x0205 }
            r18 = r3
            r3 = -1
            if (r15 != r3) goto L_0x01a4
            r22 = r5
            goto L_0x01f3
        L_0x01a4:
            if (r11 == r3) goto L_0x01f1
            if (r0 == r3) goto L_0x01f1
            java.util.TreeMap r3 = new java.util.TreeMap     // Catch:{ all -> 0x0205 }
            r3.<init>()     // Catch:{ all -> 0x0205 }
        L_0x01ad:
            boolean r19 = r10.moveToNext()     // Catch:{ all -> 0x0205 }
            if (r19 != 0) goto L_0x01ce
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0205 }
            int r11 = r3.size()     // Catch:{ all -> 0x0205 }
            r0.<init>(r11)     // Catch:{ all -> 0x0205 }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x0205 }
            r0.addAll(r3)     // Catch:{ all -> 0x0205 }
            ep r3 = new ep     // Catch:{ all -> 0x0205 }
            r3.<init>(r13, r14, r0)     // Catch:{ all -> 0x0205 }
            r10.close()     // Catch:{ all -> 0x0222 }
            r22 = r5
            goto L_0x01f7
        L_0x01ce:
            int r19 = r10.getInt(r11)     // Catch:{ all -> 0x0205 }
            if (r19 < 0) goto L_0x01ec
            int r19 = r10.getInt(r15)     // Catch:{ all -> 0x0205 }
            r22 = r5
            java.lang.String r5 = r10.getString(r0)     // Catch:{ all -> 0x0205 }
            r21 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x0205 }
            r3.put(r0, r5)     // Catch:{ all -> 0x0205 }
            r0 = r21
            r5 = r22
            goto L_0x01ad
        L_0x01ec:
            r21 = r0
            r22 = r5
            goto L_0x01ad
        L_0x01f1:
            r22 = r5
        L_0x01f3:
            r10.close()     // Catch:{ all -> 0x0222 }
            r3 = 0
        L_0x01f7:
            if (r3 == 0) goto L_0x0218
            r12.add(r3)     // Catch:{ all -> 0x0222 }
            r0 = r29
            r3 = r18
            r5 = r22
            r11 = -1
            goto L_0x0154
        L_0x0205:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0222 }
            throw r0     // Catch:{ all -> 0x0222 }
        L_0x020a:
            r18 = r3
            r22 = r5
            r0 = r29
            r11 = -1
            goto L_0x0154
        L_0x0213:
            r2.close()
            r10 = r12
            goto L_0x021c
        L_0x0218:
            r2.close()
            r10 = 0
        L_0x021c:
            eq r0 = new eq
            r0.<init>(r1, r6, r4, r10)
            return r0
        L_0x0222:
            r0 = move-exception
            r2.close()
            throw r0
        L_0x0227:
            r22 = r5
            r7.moveToPosition(r3)     // Catch:{ all -> 0x02bb }
            int r0 = r7.getInt(r11)     // Catch:{ all -> 0x02bb }
            if (r0 != 0) goto L_0x02a5
            r0 = r21
            int r5 = r7.getInt(r0)     // Catch:{ all -> 0x02bb }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x02bb }
            r9.<init>()     // Catch:{ all -> 0x02bb }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x02bb }
            r10.<init>()     // Catch:{ all -> 0x02bb }
            java.util.Iterator r12 = r13.iterator()     // Catch:{ all -> 0x02bb }
        L_0x0246:
            boolean r14 = r12.hasNext()     // Catch:{ all -> 0x02bb }
            if (r14 != 0) goto L_0x0271
            en r5 = new en     // Catch:{ all -> 0x02bb }
            r14 = r19
            java.lang.String r24 = r7.getString(r14)     // Catch:{ all -> 0x02bb }
            r15 = r18
            java.lang.String r25 = r7.getString(r15)     // Catch:{ all -> 0x02bb }
            r12 = r17
            java.lang.String r26 = r7.getString(r12)     // Catch:{ all -> 0x02bb }
            r23 = r5
            r27 = r9
            r28 = r10
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x02bb }
            r4.add(r5)     // Catch:{ all -> 0x02bb }
            r21 = r0
            r16 = r12
            goto L_0x02ab
        L_0x0271:
            r16 = r17
            r15 = r18
            r14 = r19
            java.lang.Object r17 = r12.next()     // Catch:{ all -> 0x02bb }
            r21 = r0
            r0 = r17
            eo r0 = (defpackage.eo) r0     // Catch:{ all -> 0x02bb }
            int r1 = r0.a     // Catch:{ all -> 0x02bb }
            if (r1 != r5) goto L_0x029a
            java.lang.String r1 = r0.c     // Catch:{ all -> 0x02bb }
            r9.add(r1)     // Catch:{ all -> 0x02bb }
            java.lang.String r0 = r0.d     // Catch:{ all -> 0x02bb }
            r10.add(r0)     // Catch:{ all -> 0x02bb }
            r1 = r30
            r19 = r14
            r18 = r15
            r17 = r16
            r0 = r21
            goto L_0x0246
        L_0x029a:
            r1 = r30
            r19 = r14
            r18 = r15
            r17 = r16
            r0 = r21
            goto L_0x0246
        L_0x02a5:
            r16 = r17
            r15 = r18
            r14 = r19
        L_0x02ab:
            int r3 = r3 + 1
            r0 = r29
            r1 = r30
            r19 = r14
            r18 = r15
            r17 = r16
            r5 = r22
            goto L_0x0119
        L_0x02bb:
            r0 = move-exception
            r7.close()
            throw r0
        L_0x02c0:
            r0 = move-exception
            r4.close()
            goto L_0x02c6
        L_0x02c5:
            throw r0
        L_0x02c6:
            goto L_0x02c5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq.a(di, java.lang.String):eq");
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof eq) {
            eq eqVar = (eq) obj;
            if (this.a.equals(eqVar.a)) {
                Map map = this.b;
                if (map == null ? eqVar.b != null : !map.equals(eqVar.b)) {
                    return false;
                }
                Set set2 = this.c;
                if (set2 == null ? eqVar.c != null : !set2.equals(eqVar.c)) {
                    return false;
                }
                Set set3 = this.d;
                if (set3 == null || (set = eqVar.d) == null) {
                    return true;
                }
                return set3.equals(set);
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
