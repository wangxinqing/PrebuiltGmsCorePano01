package defpackage;

import android.content.ContentValues;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: yac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yac {
    private static final xzx a = xzx.a(true);
    private static final xzx b = xzx.a(false);

    private static ContentValues a(Iterator it) {
        if (it.hasNext()) {
            return (ContentValues) it.next();
        }
        return null;
    }

    public static long b(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("data_version");
        if (asLong != null) {
            return asLong.longValue() + 1;
        }
        return 0;
    }

    public static boolean c(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("data_sync4");
        return d(contentValues) && asLong != null && !asLong.equals(contentValues.getAsLong("data_version"));
    }

    public static boolean d(ContentValues contentValues) {
        String asString = contentValues.getAsString("data_sync2");
        return asString != null && asString.startsWith("\"");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0246, code lost:
        if (r33 != false) goto L_0x0276;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02a1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01cc A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(java.util.List r27, java.util.List r28, java.lang.Long r29, java.lang.Integer r30, defpackage.xvw r31, defpackage.yaz r32, boolean r33, boolean r34) {
        /*
            r0 = r34
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = defpackage.ycm.a((java.util.Collection) r27)
            boolean r3 = defpackage.ycm.a((java.util.Collection) r28)
            if (r2 != 0) goto L_0x0012
            goto L_0x0015
        L_0x0012:
            if (r3 == 0) goto L_0x0015
            return r1
        L_0x0015:
            r4 = r31
            xvx r10 = r4.d
            xyy r4 = new xyy
            r4.<init>()
            r11 = 3
            r12 = 2
            r13 = 1
            r5 = 0
            r14 = 0
            if (r2 == 0) goto L_0x002b
            r3 = r28
            r2 = r5
            r15 = r2
            goto L_0x00c8
        L_0x002b:
            if (r3 != 0) goto L_0x00c4
            java.util.List r18 = r4.a()
            java.util.List r19 = r4.b()
            java.util.Collection[] r2 = new java.util.Collection[r12]
            r2[r14] = r18
            r2[r13] = r19
            boolean r2 = a((java.util.Collection[]) r2)
            defpackage.iva.b((boolean) r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            xzx r17 = a
            xzz r3 = new xzz
            r3.<init>(r10, r0, r2)
            r15 = r27
            r16 = r28
            r20 = r3
            a(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x005c
            r1.addAll(r2)
        L_0x005c:
            java.util.List r2 = r4.a()
            java.util.List r3 = r4.b()
            boolean r6 = r2.isEmpty()
            boolean r7 = r3.isEmpty()
            if (r6 == 0) goto L_0x0072
            if (r7 != 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            return r1
        L_0x0072:
            if (r6 == 0) goto L_0x0077
            r2 = r5
            r15 = r2
            goto L_0x00c8
        L_0x0077:
            if (r7 != 0) goto L_0x00c3
            java.util.List r15 = r4.a()
            java.util.List r16 = r4.b()
            java.util.List r18 = r4.c()
            java.util.List r19 = r4.d()
            java.util.List r2 = r4.a
            boolean r3 = r15.isEmpty()
            if (r3 != 0) goto L_0x00a7
            boolean r3 = r16.isEmpty()
            if (r3 != 0) goto L_0x00a7
            java.util.Collection[] r3 = new java.util.Collection[r11]
            r3[r14] = r18
            r3[r13] = r19
            r3[r12] = r2
            boolean r3 = a((java.util.Collection[]) r3)
            if (r3 == 0) goto L_0x00a7
            r3 = 1
            goto L_0x00a8
        L_0x00a7:
            r3 = 0
        L_0x00a8:
            defpackage.iva.b((boolean) r3)
            xzx r17 = b
            yaa r3 = new yaa
            r3.<init>(r2)
            r20 = r3
            a(r15, r16, r17, r18, r19, r20)
            java.util.List r2 = r4.c()
            java.util.List r3 = r4.d()
            java.util.List r5 = r4.a
            r15 = r5
            goto L_0x00c8
        L_0x00c3:
            goto L_0x00c6
        L_0x00c4:
            r2 = r27
        L_0x00c6:
            r3 = r5
            r15 = r3
        L_0x00c8:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            boolean r4 = defpackage.ycm.a((java.util.Collection) r2)
            r7 = 0
            if (r4 != 0) goto L_0x0114
            java.util.Iterator r16 = r2.iterator()
        L_0x00d9:
            boolean r4 = r16.hasNext()
            if (r4 == 0) goto L_0x010d
            java.lang.Object r4 = r16.next()
            r6 = r4
            android.content.ContentValues r6 = (android.content.ContentValues) r6
            a(r6, r7)
            android.net.Uri r5 = r10.a
            r17 = 0
            r4 = r10
            r27 = r6
            r18 = r7
            r7 = r29
            r8 = r30
            r11 = r9
            r9 = r17
            r4.a((android.net.Uri) r5, (android.content.ContentValues) r6, (java.lang.Long) r7, (java.lang.Integer) r8, (boolean) r9)
            if (r0 == 0) goto L_0x0108
            r4 = r27
            r11.add(r4)
            r9 = r11
            r7 = r18
            r11 = 3
            goto L_0x00d9
        L_0x0108:
            r9 = r11
            r7 = r18
            r11 = 3
            goto L_0x00d9
        L_0x010d:
            r18 = r7
            r11 = r9
            r2.size()
            goto L_0x0117
        L_0x0114:
            r18 = r7
            r11 = r9
        L_0x0117:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r4 = defpackage.ycm.a((java.util.Collection) r3)
            java.lang.String r5 = "data_version"
            java.lang.String r6 = "data_id"
            java.lang.String r7 = "data_sync4"
            if (r4 != 0) goto L_0x01f2
            java.util.Iterator r4 = r3.iterator()
        L_0x012c:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x01ef
            java.lang.Object r8 = r4.next()
            android.content.ContentValues r8 = (android.content.ContentValues) r8
            java.lang.Long r9 = r8.getAsLong(r7)
            defpackage.xip.a()
            ayrj r16 = defpackage.ayrj.a
            aytn r16 = r16.a()
            boolean r16 = r16.av()
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r16)
            boolean r16 = r16.booleanValue()
            if (r16 != 0) goto L_0x015c
            if (r9 != 0) goto L_0x0156
            goto L_0x016c
        L_0x0156:
            r9 = 0
            r16 = 2
            r20 = 3
            goto L_0x01be
        L_0x015c:
            if (r9 == 0) goto L_0x016c
            long r16 = r9.longValue()
            int r9 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r9 == 0) goto L_0x016c
            r9 = 0
            r16 = 2
            r20 = 3
            goto L_0x01be
        L_0x016c:
            boolean r9 = a((android.content.ContentValues) r8)
            if (r9 == 0) goto L_0x01b0
            java.lang.Long r9 = r8.getAsLong(r5)
            if (r9 == 0) goto L_0x01b0
            java.lang.Long r9 = r8.getAsLong(r5)
            long r16 = r9.longValue()
            int r9 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r9 != 0) goto L_0x01b0
            r9 = 4
            java.lang.String[] r12 = new java.lang.String[r9]
            r12[r14] = r7
            java.lang.String r17 = "data_sync2"
            r12[r13] = r17
            java.lang.String r17 = "data_sync3"
            r16 = 2
            r12[r16] = r17
            java.lang.String r17 = "data14"
            r20 = 3
            r12[r20] = r17
            r13 = 0
        L_0x019a:
            if (r13 >= r9) goto L_0x01ae
            r9 = r12[r13]
            java.lang.String r9 = r8.getAsString(r9)
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x01ac
            int r13 = r13 + 1
            r9 = 4
            goto L_0x019a
        L_0x01ac:
            r9 = 0
            goto L_0x01b5
        L_0x01ae:
            r9 = 1
            goto L_0x01b5
        L_0x01b0:
            r16 = 2
            r20 = 3
            r9 = 0
        L_0x01b5:
            if (r9 == 0) goto L_0x01e2
            java.lang.Long r12 = r8.getAsLong(r6)
            r12.longValue()
        L_0x01be:
            java.lang.Long r12 = r8.getAsLong(r6)
            r10.a((java.lang.Long) r12, (boolean) r14)
            boolean r8 = a((android.content.ContentValues) r8)
            if (r8 == 0) goto L_0x01de
            if (r9 != 0) goto L_0x01de
            xnd r22 = defpackage.xnd.REMOVE
            xjo r23 = defpackage.xjo.PHOTO
            r24 = 1
            r25 = 1
            r26 = 1
            r21 = r32
            r21.a(r22, r23, r24, r25, r26)
            goto L_0x01eb
        L_0x01de:
            r12 = 2
            r13 = 1
            goto L_0x012c
        L_0x01e2:
            if (r0 == 0) goto L_0x01eb
            r2.add(r8)
            r12 = 2
            r13 = 1
            goto L_0x012c
        L_0x01eb:
            r12 = 2
            r13 = 1
            goto L_0x012c
        L_0x01ef:
            r3.size()
        L_0x01f2:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r4 = defpackage.ycm.a((java.util.Collection) r15)
            if (r4 != 0) goto L_0x02a8
            int r4 = r15.size()
        L_0x0201:
            if (r14 >= r4) goto L_0x02a5
            java.lang.Object r8 = r15.get(r14)
            yae r8 = (defpackage.yae) r8
            android.content.ContentValues r9 = r8.b
            defpackage.xip.a()
            ayrj r12 = defpackage.ayrj.a
            aytn r12 = r12.a()
            boolean r12 = r12.ak()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0249
            boolean r12 = a((android.content.ContentValues) r9)
            if (r12 != 0) goto L_0x0229
            goto L_0x0249
        L_0x0229:
            defpackage.xip.a()
            ayrj r12 = defpackage.ayrj.a
            aytn r12 = r12.a()
            boolean r12 = r12.aw()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x027c
            boolean r12 = c(r9)
            if (r12 == 0) goto L_0x027c
            if (r33 == 0) goto L_0x027c
            goto L_0x0276
        L_0x0249:
            java.lang.Long r12 = r9.getAsLong(r7)
            if (r12 == 0) goto L_0x027c
            long r16 = r12.longValue()
            r20 = 10
            int r13 = (r16 > r20 ? 1 : (r16 == r20 ? 0 : -1))
            if (r13 >= 0) goto L_0x0263
            long r12 = r12.longValue()
            int r16 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r16 == 0) goto L_0x0276
            goto L_0x027c
        L_0x0263:
            java.lang.Long r13 = r9.getAsLong(r5)
            long r16 = r13.longValue()
            java.lang.Long r13 = java.lang.Long.valueOf(r16)
            boolean r12 = defpackage.yau.a(r13, r12)
            if (r12 != 0) goto L_0x027c
        L_0x0276:
            if (r0 == 0) goto L_0x02a1
            r3.add(r9)
            goto L_0x02a1
        L_0x027c:
            android.content.ContentValues r8 = r8.a
            long r12 = b(r9)
            a(r8, r12)
            java.lang.Long r12 = r9.getAsLong(r6)
            r10.a((java.lang.Long) r12, (android.content.ContentValues) r8)
            if (r0 != 0) goto L_0x028f
            goto L_0x02a1
        L_0x028f:
            boolean r12 = defpackage.ayrz.b()
            if (r12 != 0) goto L_0x029e
            android.content.ContentValues r12 = new android.content.ContentValues
            r12.<init>(r9)
            r12.putAll(r8)
            r8 = r12
        L_0x029e:
            r3.add(r8)
        L_0x02a1:
            int r14 = r14 + 1
            goto L_0x0201
        L_0x02a5:
            r15.size()
        L_0x02a8:
            defpackage.xip.a()
            xfs r4 = defpackage.xfu.a
            java.lang.Object r4 = r4.a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x02c0
            if (r33 == 0) goto L_0x02c0
            xwp r4 = r10.b
            r4.a()
        L_0x02c0:
            if (r0 == 0) goto L_0x02cb
            r1.addAll(r11)
            r1.addAll(r2)
            r1.addAll(r3)
        L_0x02cb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yac.a(java.util.List, java.util.List, java.lang.Long, java.lang.Integer, xvw, yaz, boolean, boolean):java.util.List");
    }

    private static void a(ContentValues contentValues, long j) {
        contentValues.put("data_sync4", Long.valueOf(yau.a(j)));
        contentValues.put("data_version", Long.valueOf(j));
    }

    private static void a(List list, List list2, xzx xzx, List list3, List list4, yab yab) {
        Collections.sort(list, xzx);
        Collections.sort(list2, xzx);
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        ContentValues a2 = a(it);
        ContentValues a3 = a(it2);
        while (a2 != null && a3 != null) {
            int a4 = xzx.compare(a2, a3);
            if (a4 == 0) {
                yab.a(a2, a3);
                a2 = a(it);
                a3 = a(it2);
            } else if (a4 >= 0) {
                list4.add(a3);
                a3 = a(it2);
            } else {
                list3.add(a2);
                a2 = a(it);
            }
        }
        while (a2 != null) {
            list3.add(a2);
            a2 = a(it);
        }
        while (a3 != null) {
            list4.add(a3);
            a3 = a(it2);
        }
    }

    public static boolean a(ContentValues contentValues) {
        if (contentValues != null) {
            return "vnd.android.cursor.item/photo".equals(contentValues.getAsString("mimetype"));
        }
        return false;
    }

    private static boolean a(Collection... collectionArr) {
        for (Collection isEmpty : collectionArr) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
