package defpackage;

import android.util.SparseIntArray;

/* renamed from: woe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class woe extends wnc {
    private final String b;
    private final String c;
    private final boolean d;
    private final String e;
    private final String[] f;
    private final int g;
    private final int s;
    private final int t;
    private final String u;
    private final boolean v;
    private final amsn w = amsn.b(ampt.a);
    private final SparseIntArray x = new SparseIntArray();

    public static boolean a(String str) {
        xip.a();
        if (Boolean.valueOf(aywy.a.a().cr()).booleanValue()) {
            if ("com.google.android.apps.tachyon".equals(str)) {
                return true;
            }
            if (!Boolean.valueOf(aywy.a.a().R()).booleanValue() || !"com.google.android.gms.test".equals(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v0, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: xuv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: ilm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v16, resolved type: xuv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v20, resolved type: long} */
    /* JADX WARNING: type inference failed for: r21v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0769, code lost:
        r2 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        r26.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0786, code lost:
        r0 = e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x079b  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x07c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.common.data.DataHolder d(android.content.Context r73) {
        /*
            r72 = this;
            r1 = r72
            r0 = r73
            xuv r2 = new xuv
            java.lang.String r3 = r1.u
            int r4 = r1.t
            r2.<init>(r0, r3, r4)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = r1.b
            java.lang.String r5 = "account"
            r3.putString(r5, r4)
            java.lang.String r4 = r1.c
            java.lang.String r5 = "pagegaiaid"
            r3.putString(r5, r4)
            java.lang.String r4 = r1.e
            java.lang.String r5 = "query"
            r3.putString(r5, r4)
            int r4 = r1.g
            r5 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            if (r4 == r5) goto L_0x0037
            java.lang.String r4 = r1.b
            java.lang.String r7 = r1.c
            defpackage.wop.a((android.content.Context) r0, (java.lang.String) r4, (java.lang.String) r7, (android.os.Bundle) r3)
        L_0x0037:
            java.lang.String[] r4 = defpackage.wzr.a
            ilm r4 = com.google.android.gms.common.data.DataHolder.a((java.lang.String[]) r4)
            java.lang.String[] r7 = r1.f
            int r7 = r7.length
            if (r7 == 0) goto L_0x07f5
            boolean r7 = r1.d
            java.lang.String r9 = "BasePeopleOperation"
            if (r7 != 0) goto L_0x07ed
            ob r7 = new ob
            r7.<init>()
            int r10 = r1.g
            java.lang.String r11 = "custom_label"
            java.lang.String r12 = "value_type"
            java.lang.String r14 = "value"
            java.lang.String r15 = "item_type"
            java.lang.String r13 = "display_name"
            java.lang.String r8 = "person_key"
            java.lang.String r5 = "data_source"
            r17 = r3
            java.lang.String r0 = "avatar_location"
            java.lang.String r3 = "avatar_source"
            r18 = r9
            r9 = 2
            if (r10 == r9) goto L_0x043b
            amsn r9 = r1.w
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r9 = r9.a((java.util.concurrent.TimeUnit) r10)
            r21 = r2
            wtw r2 = defpackage.wtw.a(r73)
            r22 = r9
            java.lang.String r9 = r1.b
            java.lang.String r10 = r1.c
            java.lang.String r2 = r2.b(r9, r10)
            defpackage.xip.a()
            xfs r9 = defpackage.xhh.a
            java.lang.Object r9 = r9.a()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x009e
            wmi r9 = r1.a
            boolean r10 = android.text.TextUtils.isEmpty(r2)
            if (r10 != 0) goto L_0x009b
            r10 = 2
            goto L_0x009c
        L_0x009b:
            r10 = 3
        L_0x009c:
            r9.u = r10
        L_0x009e:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r10 = r1.g
            r24 = r11
            java.lang.String[] r11 = r1.f
            r25 = r12
            int r12 = r1.s
            java.lang.String r2 = defpackage.woh.a(r2, r10, r11, r9, r12)
            wtz r10 = defpackage.wtz.a((android.content.Context) r73)
            wtx r10 = r10.b()
            if (r10 == 0) goto L_0x041c
            java.lang.String[] r11 = defpackage.ycm.b
            java.lang.Object[] r9 = r9.toArray(r11)
            java.lang.String[] r9 = (java.lang.String[]) r9
            android.database.Cursor r2 = r10.a((java.lang.String) r2, (java.lang.String[]) r9)
            r2.getCount()
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0415 }
            r9.<init>()     // Catch:{ all -> 0x0415 }
        L_0x00cf:
            boolean r10 = r2.moveToNext()     // Catch:{ all -> 0x0415 }
            if (r10 == 0) goto L_0x0405
            int r10 = r4.a()     // Catch:{ all -> 0x0415 }
            int r11 = r1.s     // Catch:{ all -> 0x0415 }
            if (r10 >= r11) goto L_0x0405
            r10 = 0
            java.lang.String r11 = r2.getString(r10)     // Catch:{ all -> 0x0415 }
            r10 = 1
            int r12 = r2.getInt(r10)     // Catch:{ all -> 0x0415 }
            r10 = 2
            int r26 = r2.getInt(r10)     // Catch:{ all -> 0x0415 }
            r27 = r4
            r10 = 3
            java.lang.String r4 = r2.getString(r10)     // Catch:{ all -> 0x0415 }
            r28 = r14
            r10 = 4
            java.lang.String r14 = r2.getString(r10)     // Catch:{ all -> 0x0415 }
            r10 = 5
            int r29 = r2.getInt(r10)     // Catch:{ all -> 0x0415 }
            r10 = 6
            java.lang.String r10 = r2.getString(r10)     // Catch:{ all -> 0x0415 }
            r30 = r15
            r15 = 7
            java.lang.String r15 = r2.getString(r15)     // Catch:{ all -> 0x0415 }
            r31 = r6
            r6 = 8
            double r32 = r2.getDouble(r6)     // Catch:{ all -> 0x0415 }
            r6 = 9
            double r34 = r2.getDouble(r6)     // Catch:{ all -> 0x0415 }
            r6 = 10
            double r36 = r2.getDouble(r6)     // Catch:{ all -> 0x0415 }
            r6 = 11
            double r38 = r2.getDouble(r6)     // Catch:{ all -> 0x0415 }
            r6 = 12
            double r40 = r2.getDouble(r6)     // Catch:{ all -> 0x0415 }
            r6 = 13
            java.lang.String r6 = r2.getString(r6)     // Catch:{ all -> 0x0415 }
            r42 = r6
            r6 = 14
            java.lang.String r6 = r2.getString(r6)     // Catch:{ all -> 0x0415 }
            r43 = r6
            r6 = 15
            java.lang.String r6 = r2.getString(r6)     // Catch:{ all -> 0x0415 }
            r44 = r6
            r6 = 16
            java.lang.String r6 = r2.getString(r6)     // Catch:{ all -> 0x0415 }
            r45 = r6
            r6 = 17
            java.lang.String r6 = r2.getString(r6)     // Catch:{ all -> 0x0415 }
            r46 = r6
            r6 = 18
            int r6 = r2.getInt(r6)     // Catch:{ all -> 0x0415 }
            r47 = r6
            r6 = 19
            java.lang.String r6 = r2.getString(r6)     // Catch:{ all -> 0x0415 }
            r48 = r0
            r0 = 20
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0415 }
            r49 = r0
            r0 = 21
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0415 }
            r50 = r0
            r0 = 22
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0415 }
            r51 = r0
            r0 = 23
            double r52 = r2.getDouble(r0)     // Catch:{ all -> 0x0415 }
            r0 = 24
            double r54 = r2.getDouble(r0)     // Catch:{ all -> 0x0415 }
            r0 = 25
            double r56 = r2.getDouble(r0)     // Catch:{ all -> 0x0415 }
            r0 = 26
            double r58 = r2.getDouble(r0)     // Catch:{ all -> 0x0415 }
            r0 = 27
            double r60 = r2.getDouble(r0)     // Catch:{ all -> 0x0415 }
            r0 = 28
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0415 }
            r62 = r0
            r0 = 29
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0415 }
            r63 = r0
            r0 = 30
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0415 }
            r64 = r0
            r0 = 31
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0415 }
            r65 = r0
            r0 = 32
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0415 }
            r66 = r0
            r0 = 33
            long r67 = r2.getLong(r0)     // Catch:{ all -> 0x0415 }
            r0 = 34
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0415 }
            boolean r69 = r7.contains(r6)     // Catch:{ all -> 0x0415 }
            if (r69 != 0) goto L_0x03e8
            r69 = r2
            r2 = 1
            if (r12 != r2) goto L_0x03ea
            java.lang.String r2 = "owner_account"
            java.lang.String r12 = r1.b     // Catch:{ all -> 0x03e6 }
            r9.put(r2, r12)     // Catch:{ all -> 0x03e6 }
            java.lang.String r2 = "owner_page_id"
            java.lang.String r12 = r1.c     // Catch:{ all -> 0x03e6 }
            r9.put(r2, r12)     // Catch:{ all -> 0x03e6 }
            r2 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x03e6 }
            r9.put(r5, r12)     // Catch:{ all -> 0x03e6 }
            android.util.SparseIntArray r2 = r1.x     // Catch:{ all -> 0x03e6 }
            r70 = r5
            r71 = r7
            r5 = 0
            r7 = 1
            int r20 = r2.get(r7, r5)     // Catch:{ all -> 0x03e6 }
            int r5 = r20 + 1
            r2.put(r7, r5)     // Catch:{ all -> 0x03e6 }
            r9.put(r8, r11)     // Catch:{ all -> 0x03e6 }
            java.lang.String r2 = "people_v2_id"
            r9.put(r2, r11)     // Catch:{ all -> 0x03e6 }
            java.lang.String r2 = "container_type"
            r5 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x03e6 }
            r9.put(r2, r7)     // Catch:{ all -> 0x03e6 }
            java.lang.String r2 = "gaia_id"
            r9.put(r2, r4)     // Catch:{ all -> 0x03e6 }
            java.lang.String r2 = "contact_id"
            r9.put(r2, r14)     // Catch:{ all -> 0x03e6 }
            java.lang.String r2 = "profile_type"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r26)     // Catch:{ all -> 0x03e6 }
            r9.put(r2, r4)     // Catch:{ all -> 0x03e6 }
            r9.put(r13, r10)     // Catch:{ all -> 0x03e6 }
            if (r29 != 0) goto L_0x023e
            boolean r2 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x03e6 }
            if (r2 == 0) goto L_0x023b
            r9.put(r3, r12)     // Catch:{ all -> 0x03e6 }
            r2 = r48
            r9.putNull(r2)     // Catch:{ all -> 0x03e6 }
            r4 = r31
            goto L_0x02dc
        L_0x023b:
            r2 = r48
            goto L_0x0240
        L_0x023e:
            r2 = r48
        L_0x0240:
            defpackage.xip.a()     // Catch:{ all -> 0x03e6 }
            aywy r4 = defpackage.aywy.a     // Catch:{ all -> 0x03e6 }
            ayxk r4 = r4.a()     // Catch:{ all -> 0x03e6 }
            boolean r4 = r4.c()     // Catch:{ all -> 0x03e6 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x03e6 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x03e6 }
            if (r4 == 0) goto L_0x02aa
            r4 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x03e6 }
            r9.put(r3, r5)     // Catch:{ all -> 0x03e6 }
            java.lang.String r4 = r1.b     // Catch:{ all -> 0x03e6 }
            defpackage.iva.c(r4)     // Catch:{ all -> 0x03e6 }
            boolean r5 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x03e6 }
            if (r5 == 0) goto L_0x0272
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x03e6 }
            if (r5 == 0) goto L_0x0272
            r5 = 0
            goto L_0x0273
        L_0x0272:
            r5 = 1
        L_0x0273:
            defpackage.iva.a((boolean) r5)     // Catch:{ all -> 0x03e6 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x03e6 }
            r5.<init>(r4)     // Catch:{ all -> 0x03e6 }
            r4 = 9
            r5.append(r4)     // Catch:{ all -> 0x03e6 }
            if (r14 == 0) goto L_0x0285
            r5.append(r14)     // Catch:{ all -> 0x03e6 }
        L_0x0285:
            r4 = 9
            r5.append(r4)     // Catch:{ all -> 0x03e6 }
            if (r6 != 0) goto L_0x028e
            goto L_0x0291
        L_0x028e:
            r5.append(r6)     // Catch:{ all -> 0x03e6 }
        L_0x0291:
            r4 = 9
            r5.append(r4)     // Catch:{ all -> 0x03e6 }
            boolean r4 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x03e6 }
            if (r4 != 0) goto L_0x02a0
            r5.append(r15)     // Catch:{ all -> 0x03e6 }
        L_0x02a0:
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x03e6 }
            r9.put(r2, r4)     // Catch:{ all -> 0x03e6 }
            r4 = r31
            goto L_0x02dc
        L_0x02aa:
            if (r29 == 0) goto L_0x02d4
            r4 = r31
            r9.put(r3, r4)     // Catch:{ all -> 0x03e6 }
            java.lang.String r5 = r1.b     // Catch:{ all -> 0x03e6 }
            defpackage.iva.c(r5)     // Catch:{ all -> 0x03e6 }
            defpackage.iva.c(r14)     // Catch:{ all -> 0x03e6 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x03e6 }
            r7.<init>(r5)     // Catch:{ all -> 0x03e6 }
            r5 = 9
            r7.append(r5)     // Catch:{ all -> 0x03e6 }
            r7.append(r14)     // Catch:{ all -> 0x03e6 }
            r7.append(r5)     // Catch:{ all -> 0x03e6 }
            r7.append(r6)     // Catch:{ all -> 0x03e6 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x03e6 }
            r9.put(r2, r5)     // Catch:{ all -> 0x03e6 }
            goto L_0x02dc
        L_0x02d4:
            r4 = r31
            r9.put(r3, r12)     // Catch:{ all -> 0x03e6 }
            r9.putNull(r2)     // Catch:{ all -> 0x03e6 }
        L_0x02dc:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r47)     // Catch:{ all -> 0x03e6 }
            r7 = r30
            r9.put(r7, r5)     // Catch:{ all -> 0x03e6 }
            r5 = r28
            r9.put(r5, r6)     // Catch:{ all -> 0x03e6 }
            java.lang.String r10 = "value2"
            r11 = r49
            r9.put(r10, r11)     // Catch:{ all -> 0x03e6 }
            r11 = r25
            r10 = r50
            r9.put(r11, r10)     // Catch:{ all -> 0x03e6 }
            r12 = r24
            r10 = r51
            r9.put(r12, r10)     // Catch:{ all -> 0x03e6 }
            java.lang.Double r10 = java.lang.Double.valueOf(r52)     // Catch:{ all -> 0x03e6 }
            java.lang.String r14 = "primary_affinity_sorted"
            r9.put(r14, r10)     // Catch:{ all -> 0x03e6 }
            java.lang.String r14 = "primary_logging_id_sorted"
            r15 = r62
            r9.put(r14, r15)     // Catch:{ all -> 0x03e6 }
            java.lang.Double r14 = java.lang.Double.valueOf(r32)     // Catch:{ all -> 0x03e6 }
            r24 = r12
            java.lang.String r12 = "person_affinity_sorted"
            r9.put(r12, r14)     // Catch:{ all -> 0x03e6 }
            java.lang.String r12 = "person_affinity1"
            r9.put(r12, r14)     // Catch:{ all -> 0x03e6 }
            java.lang.String r12 = "person_affinity2"
            java.lang.Double r14 = java.lang.Double.valueOf(r34)     // Catch:{ all -> 0x03e6 }
            r9.put(r12, r14)     // Catch:{ all -> 0x03e6 }
            java.lang.String r12 = "person_affinity3"
            java.lang.Double r14 = java.lang.Double.valueOf(r36)     // Catch:{ all -> 0x03e6 }
            r9.put(r12, r14)     // Catch:{ all -> 0x03e6 }
            java.lang.String r12 = "person_affinity4"
            java.lang.Double r14 = java.lang.Double.valueOf(r38)     // Catch:{ all -> 0x03e6 }
            r9.put(r12, r14)     // Catch:{ all -> 0x03e6 }
            java.lang.String r12 = "person_affinity5"
            java.lang.Double r14 = java.lang.Double.valueOf(r40)     // Catch:{ all -> 0x03e6 }
            r9.put(r12, r14)     // Catch:{ all -> 0x03e6 }
            java.lang.String r12 = "person_logging_id_sorted"
            r14 = r42
            r9.put(r12, r14)     // Catch:{ all -> 0x03e6 }
            java.lang.String r12 = "person_logging_id1"
            r9.put(r12, r14)     // Catch:{ all -> 0x03e6 }
            java.lang.String r12 = "person_logging_id2"
            r14 = r43
            r9.put(r12, r14)     // Catch:{ all -> 0x03e6 }
            java.lang.String r12 = "person_logging_id3"
            r14 = r44
            r9.put(r12, r14)     // Catch:{ all -> 0x03e6 }
            java.lang.String r12 = "person_logging_id4"
            r14 = r45
            r9.put(r12, r14)     // Catch:{ all -> 0x03e6 }
            java.lang.String r12 = "person_logging_id5"
            r14 = r46
            r9.put(r12, r14)     // Catch:{ all -> 0x03e6 }
            java.lang.String r12 = "item_affinity_sorted"
            r9.put(r12, r10)     // Catch:{ all -> 0x03e6 }
            java.lang.String r12 = "item_affinity1"
            r9.put(r12, r10)     // Catch:{ all -> 0x03e6 }
            java.lang.String r10 = "item_affinity2"
            java.lang.Double r12 = java.lang.Double.valueOf(r54)     // Catch:{ all -> 0x03e6 }
            r9.put(r10, r12)     // Catch:{ all -> 0x03e6 }
            java.lang.String r10 = "item_affinity3"
            java.lang.Double r12 = java.lang.Double.valueOf(r56)     // Catch:{ all -> 0x03e6 }
            r9.put(r10, r12)     // Catch:{ all -> 0x03e6 }
            java.lang.String r10 = "item_affinity4"
            java.lang.Double r12 = java.lang.Double.valueOf(r58)     // Catch:{ all -> 0x03e6 }
            r9.put(r10, r12)     // Catch:{ all -> 0x03e6 }
            java.lang.String r10 = "item_affinity5"
            java.lang.Double r12 = java.lang.Double.valueOf(r60)     // Catch:{ all -> 0x03e6 }
            r9.put(r10, r12)     // Catch:{ all -> 0x03e6 }
            java.lang.String r10 = "item_logging_id_sorted"
            r9.put(r10, r15)     // Catch:{ all -> 0x03e6 }
            java.lang.String r10 = "item_logging_id1"
            r9.put(r10, r15)     // Catch:{ all -> 0x03e6 }
            java.lang.String r10 = "item_logging_id2"
            r12 = r63
            r9.put(r10, r12)     // Catch:{ all -> 0x03e6 }
            java.lang.String r10 = "item_logging_id3"
            r12 = r64
            r9.put(r10, r12)     // Catch:{ all -> 0x03e6 }
            java.lang.String r10 = "item_logging_id4"
            r12 = r65
            r9.put(r10, r12)     // Catch:{ all -> 0x03e6 }
            java.lang.String r10 = "item_logging_id5"
            r12 = r66
            r9.put(r10, r12)     // Catch:{ all -> 0x03e6 }
            java.lang.String r10 = "item_certificate_expiration_millis"
            java.lang.Long r12 = java.lang.Long.valueOf(r67)     // Catch:{ all -> 0x03e6 }
            r9.put(r10, r12)     // Catch:{ all -> 0x03e6 }
            java.lang.String r10 = "item_certificate_status"
            r9.put(r10, r0)     // Catch:{ all -> 0x03e6 }
            r10 = r27
            r10.a((android.content.ContentValues) r9)     // Catch:{ all -> 0x03e6 }
            r0 = r71
            r0.add(r6)     // Catch:{ all -> 0x03e6 }
            r6 = r4
            r14 = r5
            r15 = r7
            r4 = r10
            r25 = r11
            r5 = r70
            r7 = r0
            r0 = r2
            r2 = r69
            goto L_0x00cf
        L_0x03e6:
            r0 = move-exception
            goto L_0x0418
        L_0x03e8:
            r69 = r2
        L_0x03ea:
            r70 = r5
            r0 = r7
            r11 = r25
            r10 = r27
            r5 = r28
            r7 = r30
            r4 = r31
            r2 = r48
            r6 = r4
            r14 = r5
            r15 = r7
            r4 = r10
            r5 = r70
            r7 = r0
            r0 = r2
            r2 = r69
            goto L_0x00cf
        L_0x0405:
            r69 = r2
            r10 = r4
            r70 = r5
            r4 = r6
            r5 = r14
            r11 = r25
            r2 = r0
            r0 = r7
            r7 = r15
            r69.close()
            goto L_0x0426
        L_0x0415:
            r0 = move-exception
            r69 = r2
        L_0x0418:
            r69.close()
            throw r0
        L_0x041c:
            r2 = r0
            r10 = r4
            r70 = r5
            r4 = r6
            r0 = r7
            r5 = r14
            r7 = r15
            r11 = r25
        L_0x0426:
            wmi r6 = r1.a
            amsn r9 = r1.w
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r14 = r9.a((java.util.concurrent.TimeUnit) r12)
            long r14 = r14 - r22
            r9 = 3
            xmc r12 = defpackage.wml.b(r9, r14)
            r6.a((defpackage.xmc) r12)
            goto L_0x0448
        L_0x043b:
            r21 = r2
            r10 = r4
            r70 = r5
            r4 = r6
            r24 = r11
            r11 = r12
            r5 = r14
            r2 = r0
            r0 = r7
            r7 = r15
        L_0x0448:
            boolean r6 = r1.v
            if (r6 != 0) goto L_0x044f
            r2 = r10
            goto L_0x07c7
        L_0x044f:
            int r6 = r10.a()
            int r9 = r1.s
            if (r6 >= r9) goto L_0x07c6
            defpackage.xip.a()
            aywy r6 = defpackage.aywy.a
            ayxk r6 = r6.a()
            boolean r6 = r6.aB()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x046f
            goto L_0x047e
        L_0x046f:
            int r6 = r1.g
            r9 = 1
            if (r6 != r9) goto L_0x047e
            int r6 = r10.a()
            if (r6 > 0) goto L_0x047b
            goto L_0x047e
        L_0x047b:
            r2 = r10
            goto L_0x07c7
        L_0x047e:
            amsn r6 = r1.w
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r14 = r6.a((java.util.concurrent.TimeUnit) r9)
            int r6 = r1.g     // Catch:{ Exception -> 0x0791 }
            r9 = 2
            if (r6 != r9) goto L_0x0498
            java.lang.String r6 = r1.u     // Catch:{ Exception -> 0x0791 }
            boolean r6 = a(r6)     // Catch:{ Exception -> 0x0791 }
            if (r6 != 0) goto L_0x0498
            r2 = r10
            r21 = r14
            goto L_0x07af
        L_0x0498:
            boolean r6 = r21.a()     // Catch:{ Exception -> 0x0791 }
            if (r6 != 0) goto L_0x04af
            int r6 = r1.g     // Catch:{ Exception -> 0x0791 }
            r9 = 2
            if (r6 == r9) goto L_0x04af
            java.lang.String r0 = "READ_CONTACTS permission is missing. Skipping loadCp2DataInner()"
            r6 = r18
            android.util.Log.w(r6, r0)     // Catch:{ Exception -> 0x078d }
            r2 = r10
            r21 = r14
            goto L_0x07af
        L_0x04af:
            r6 = r18
            int r9 = r1.g     // Catch:{ Exception -> 0x078d }
            if (r9 == 0) goto L_0x0519
            r12 = 1
            if (r9 == r12) goto L_0x04e7
            r12 = 2
            if (r9 == r12) goto L_0x04c4
            r2 = 0
            defpackage.iva.a((boolean) r2)     // Catch:{ Exception -> 0x078d }
            r2 = r10
            r21 = r14
            goto L_0x07af
        L_0x04c4:
            java.lang.String r9 = r1.e     // Catch:{ Exception -> 0x078d }
            android.content.ContentResolver r25 = r73.getContentResolver()     // Catch:{ Exception -> 0x078d }
            android.net.Uri r12 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI     // Catch:{ Exception -> 0x078d }
            android.net.Uri$Builder r12 = r12.buildUpon()     // Catch:{ Exception -> 0x078d }
            android.net.Uri$Builder r9 = r12.appendPath(r9)     // Catch:{ Exception -> 0x078d }
            android.net.Uri r26 = r9.build()     // Catch:{ Exception -> 0x078d }
            java.lang.String[] r27 = defpackage.wod.a     // Catch:{ Exception -> 0x078d }
            r28 = 0
            r29 = 0
            r30 = 0
            android.database.Cursor r9 = r25.query(r26, r27, r28, r29, r30)     // Catch:{ Exception -> 0x078d }
            r21 = r14
            goto L_0x054b
        L_0x04e7:
            java.lang.String[] r9 = r1.f     // Catch:{ Exception -> 0x0514 }
            int r12 = r9.length     // Catch:{ Exception -> 0x0514 }
            r21 = r14
            r14 = 1
            if (r12 > r14) goto L_0x04f0
            goto L_0x04f5
        L_0x04f0:
            java.lang.String r12 = "Multiple token detected for EMAIL_EXACT autocomplete. Using the first token"
            android.util.Log.w(r6, r12)     // Catch:{ Exception -> 0x0788 }
        L_0x04f5:
            r12 = 0
            r9 = r9[r12]     // Catch:{ Exception -> 0x0788 }
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0788 }
            java.lang.String r30 = "starred DESC,in_default_directory DESC,last_time_contacted DESC,_id"
            android.content.ContentResolver r25 = r73.getContentResolver()     // Catch:{ Exception -> 0x0788 }
            android.net.Uri r26 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI     // Catch:{ Exception -> 0x0788 }
            java.lang.String[] r27 = defpackage.woc.a     // Catch:{ Exception -> 0x0788 }
            r12 = 1
            java.lang.String[] r14 = new java.lang.String[r12]     // Catch:{ Exception -> 0x0788 }
            r12 = 0
            r14[r12] = r9     // Catch:{ Exception -> 0x0788 }
            java.lang.String r28 = "data1=?"
            r29 = r14
            android.database.Cursor r9 = r25.query(r26, r27, r28, r29, r30)     // Catch:{ Exception -> 0x0788 }
            goto L_0x054b
        L_0x0514:
            r0 = move-exception
            r21 = r14
            goto L_0x0789
        L_0x0519:
            r21 = r14
            java.lang.String r9 = r1.b     // Catch:{ Exception -> 0x0788 }
            java.lang.String r12 = r1.e     // Catch:{ Exception -> 0x0788 }
            android.content.ContentResolver r25 = r73.getContentResolver()     // Catch:{ Exception -> 0x0788 }
            android.net.Uri r14 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI     // Catch:{ Exception -> 0x0788 }
            android.net.Uri$Builder r14 = r14.buildUpon()     // Catch:{ Exception -> 0x0788 }
            android.net.Uri$Builder r12 = r14.appendPath(r12)     // Catch:{ Exception -> 0x0788 }
            java.lang.String r14 = "name_for_primary_account"
            android.net.Uri$Builder r9 = r12.appendQueryParameter(r14, r9)     // Catch:{ Exception -> 0x0788 }
            java.lang.String r12 = "type_for_primary_account"
            java.lang.String r14 = "com.google"
            android.net.Uri$Builder r9 = r9.appendQueryParameter(r12, r14)     // Catch:{ Exception -> 0x0788 }
            android.net.Uri r26 = r9.build()     // Catch:{ Exception -> 0x0788 }
            java.lang.String[] r27 = defpackage.woc.a     // Catch:{ Exception -> 0x0788 }
            r28 = 0
            r29 = 0
            r30 = 0
            android.database.Cursor r9 = r25.query(r26, r27, r28, r29, r30)     // Catch:{ Exception -> 0x0788 }
        L_0x054b:
            if (r9 != 0) goto L_0x0555
            java.lang.String r0 = "Contacts provider query failed"
            android.util.Log.w(r6, r0)     // Catch:{ Exception -> 0x0788 }
            r2 = r10
            goto L_0x07af
        L_0x0555:
            int r12 = r1.g     // Catch:{ Exception -> 0x0788 }
            java.lang.String r14 = "cp2_data_id"
            java.lang.String r15 = "cp2_contact_id"
            r18 = r6
            java.lang.String r6 = "cp2:"
            r25 = r11
            r11 = 2
            if (r12 != r11) goto L_0x062d
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0621 }
            r2.<init>()     // Catch:{ all -> 0x0621 }
        L_0x0569:
            boolean r3 = r9.moveToNext()     // Catch:{ all -> 0x0621 }
            if (r3 == 0) goto L_0x0618
            int r3 = r10.a()     // Catch:{ all -> 0x0621 }
            int r11 = r1.s     // Catch:{ all -> 0x0621 }
            if (r3 >= r11) goto L_0x0618
            r3 = 0
            int r11 = r9.getInt(r3)     // Catch:{ all -> 0x0621 }
            long r11 = (long) r11
            r27 = r10
            r3 = 1
            int r10 = r9.getInt(r3)     // Catch:{ all -> 0x0612 }
            r73 = r14
            r23 = r15
            long r14 = (long) r10     // Catch:{ all -> 0x0612 }
            r3 = 2
            java.lang.String r10 = r9.getString(r3)     // Catch:{ all -> 0x0612 }
            r3 = 3
            java.lang.String r1 = r9.getString(r3)     // Catch:{ all -> 0x060e }
            boolean r3 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x060e }
            if (r3 != 0) goto L_0x05fd
            boolean r3 = r0.contains(r10)     // Catch:{ all -> 0x060e }
            if (r3 != 0) goto L_0x05fd
            r3 = r70
            r2.put(r3, r4)     // Catch:{ all -> 0x060e }
            r70 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x060e }
            r26 = r9
            r9 = 24
            r3.<init>(r9)     // Catch:{ all -> 0x05f9 }
            r3.append(r6)     // Catch:{ all -> 0x05f9 }
            r3.append(r11)     // Catch:{ all -> 0x05f9 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x05f9 }
            r2.put(r8, r3)     // Catch:{ all -> 0x05f9 }
            r2.put(r13, r1)     // Catch:{ all -> 0x05f9 }
            r2.put(r7, r4)     // Catch:{ all -> 0x05f9 }
            r2.put(r5, r10)     // Catch:{ all -> 0x05f9 }
            java.lang.Long r1 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x05f9 }
            r9 = r23
            r2.put(r9, r1)     // Catch:{ all -> 0x05f9 }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x05f9 }
            r11 = r73
            r2.put(r11, r1)     // Catch:{ all -> 0x05f9 }
            r1 = r72
            android.util.SparseIntArray r3 = r1.x     // Catch:{ all -> 0x05f7 }
            r12 = 3
            r14 = 0
            int r15 = r3.get(r12, r14)     // Catch:{ all -> 0x05f7 }
            r14 = 1
            int r15 = r15 + r14
            r3.put(r12, r15)     // Catch:{ all -> 0x05f7 }
            r12 = r27
            r12.a((android.content.ContentValues) r2)     // Catch:{ all -> 0x05f5 }
            r0.add(r10)     // Catch:{ all -> 0x05f5 }
            r15 = r9
            r14 = r11
            r10 = r12
            r9 = r26
            goto L_0x0569
        L_0x05f5:
            r0 = move-exception
            goto L_0x0625
        L_0x05f7:
            r0 = move-exception
            goto L_0x0615
        L_0x05f9:
            r0 = move-exception
            r1 = r72
            goto L_0x0615
        L_0x05fd:
            r1 = r72
            r11 = r73
            r26 = r9
            r9 = r23
            r12 = r27
            r15 = r9
            r14 = r11
            r10 = r12
            r9 = r26
            goto L_0x0569
        L_0x060e:
            r0 = move-exception
            r1 = r72
            goto L_0x0613
        L_0x0612:
            r0 = move-exception
        L_0x0613:
            r26 = r9
        L_0x0615:
            r12 = r27
            goto L_0x0625
        L_0x0618:
            r26 = r9
            r12 = r10
            r26.close()     // Catch:{ Exception -> 0x0629 }
            r2 = r12
            goto L_0x07af
        L_0x0621:
            r0 = move-exception
            r26 = r9
            r12 = r10
        L_0x0625:
            r26.close()     // Catch:{ Exception -> 0x0629 }
            throw r0     // Catch:{ Exception -> 0x0629 }
        L_0x0629:
            r0 = move-exception
            r2 = r12
            goto L_0x0795
        L_0x062d:
            r26 = r9
            r12 = r10
            r11 = r14
            r9 = r15
            r10 = r70
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ all -> 0x077e }
            r14.<init>()     // Catch:{ all -> 0x077e }
        L_0x0639:
            boolean r15 = r26.moveToNext()     // Catch:{ all -> 0x077e }
            if (r15 == 0) goto L_0x0777
            int r15 = r12.a()     // Catch:{ all -> 0x077e }
            r27 = r12
            int r12 = r1.s     // Catch:{ all -> 0x0771 }
            if (r15 >= r12) goto L_0x0769
            r12 = r26
            r15 = 0
            int r1 = r12.getInt(r15)     // Catch:{ all -> 0x0765 }
            r48 = r2
            long r1 = (long) r1     // Catch:{ all -> 0x0765 }
            r73 = r11
            r15 = 1
            int r11 = r12.getInt(r15)     // Catch:{ all -> 0x0765 }
            r30 = r7
            r15 = r8
            long r7 = (long) r11     // Catch:{ all -> 0x0765 }
            r23 = r15
            r11 = 2
            java.lang.String r15 = r12.getString(r11)     // Catch:{ all -> 0x0765 }
            r28 = r7
            r11 = 3
            int r7 = r12.getInt(r11)     // Catch:{ all -> 0x0765 }
            r8 = 4
            java.lang.String r11 = r12.getString(r8)     // Catch:{ all -> 0x0765 }
            r16 = r9
            r8 = 5
            java.lang.String r9 = r12.getString(r8)     // Catch:{ all -> 0x0765 }
            boolean r26 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0765 }
            if (r26 != 0) goto L_0x0740
            boolean r26 = r0.contains(r15)     // Catch:{ all -> 0x0765 }
            if (r26 != 0) goto L_0x0740
            r14.put(r10, r4)     // Catch:{ all -> 0x0765 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0765 }
            r31 = r4
            r4 = 24
            r8.<init>(r4)     // Catch:{ all -> 0x0765 }
            r8.append(r6)     // Catch:{ all -> 0x0765 }
            r8.append(r1)     // Catch:{ all -> 0x0765 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0765 }
            r4 = r23
            r14.put(r4, r8)     // Catch:{ all -> 0x0765 }
            r14.put(r13, r9)     // Catch:{ all -> 0x0765 }
            r8 = 3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0765 }
            r14.put(r3, r9)     // Catch:{ all -> 0x0765 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0765 }
            java.lang.String r9 = java.lang.Long.toString(r1)     // Catch:{ all -> 0x0765 }
            r8.<init>(r9)     // Catch:{ all -> 0x0765 }
            r9 = 9
            r8.append(r9)     // Catch:{ all -> 0x0765 }
            if (r15 == 0) goto L_0x06bd
            r8.append(r15)     // Catch:{ all -> 0x0765 }
        L_0x06bd:
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0765 }
            r9 = r48
            r14.put(r9, r8)     // Catch:{ all -> 0x0765 }
            r23 = r3
            r8 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0765 }
            r8 = r30
            r14.put(r8, r3)     // Catch:{ all -> 0x0765 }
            r14.put(r5, r15)     // Catch:{ all -> 0x0765 }
            r3 = 1
            if (r7 == r3) goto L_0x06e7
            r3 = 2
            if (r7 == r3) goto L_0x06e4
            r3 = 3
            if (r7 == r3) goto L_0x06e1
            r30 = -1
            goto L_0x06e9
        L_0x06e1:
            r30 = -1
            goto L_0x06e9
        L_0x06e4:
            r30 = 2
            goto L_0x06e9
        L_0x06e7:
            r30 = 1
        L_0x06e9:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r30)     // Catch:{ all -> 0x0765 }
            r7 = r25
            r14.put(r7, r3)     // Catch:{ all -> 0x0765 }
            r3 = r24
            r14.put(r3, r11)     // Catch:{ all -> 0x0765 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0765 }
            r2 = r16
            r14.put(r2, r1)     // Catch:{ all -> 0x0765 }
            java.lang.Long r1 = java.lang.Long.valueOf(r28)     // Catch:{ all -> 0x0765 }
            r11 = r73
            r14.put(r11, r1)     // Catch:{ all -> 0x0765 }
            r1 = r72
            r16 = r2
            android.util.SparseIntArray r2 = r1.x     // Catch:{ all -> 0x073e }
            r24 = r3
            r19 = r4
            r3 = 3
            r4 = 0
            int r25 = r2.get(r3, r4)     // Catch:{ all -> 0x073e }
            r28 = r5
            r4 = 1
            int r5 = r25 + 1
            r2.put(r3, r5)     // Catch:{ all -> 0x073e }
            r2 = r27
            r2.a((android.content.ContentValues) r14)     // Catch:{ all -> 0x073c }
            r0.add(r15)     // Catch:{ all -> 0x073c }
            r25 = r7
            r7 = r8
            r26 = r12
            r8 = r19
            r3 = r23
            r5 = r28
            r4 = r31
            r12 = r2
            r2 = r9
            r9 = r16
            goto L_0x0639
        L_0x073c:
            r0 = move-exception
            goto L_0x0782
        L_0x073e:
            r0 = move-exception
            goto L_0x0774
        L_0x0740:
            r1 = r72
            r11 = r73
            r31 = r4
            r28 = r5
            r19 = r23
            r7 = r25
            r2 = r27
            r8 = r30
            r9 = r48
            r4 = 1
            r23 = r3
            r3 = 3
            r7 = r8
            r26 = r12
            r8 = r19
            r3 = r23
            r4 = r31
            r12 = r2
            r2 = r9
            r9 = r16
            goto L_0x0639
        L_0x0765:
            r0 = move-exception
            r1 = r72
            goto L_0x0774
        L_0x0769:
            r12 = r26
            r2 = r27
            r12.close()     // Catch:{ Exception -> 0x0786 }
            goto L_0x07af
        L_0x0771:
            r0 = move-exception
            r12 = r26
        L_0x0774:
            r2 = r27
            goto L_0x0782
        L_0x0777:
            r2 = r12
            r12 = r26
            r12.close()     // Catch:{ Exception -> 0x0786 }
            goto L_0x07af
        L_0x077e:
            r0 = move-exception
            r2 = r12
            r12 = r26
        L_0x0782:
            r12.close()     // Catch:{ Exception -> 0x0786 }
            throw r0     // Catch:{ Exception -> 0x0786 }
        L_0x0786:
            r0 = move-exception
            goto L_0x0795
        L_0x0788:
            r0 = move-exception
        L_0x0789:
            r18 = r6
            r2 = r10
            goto L_0x0795
        L_0x078d:
            r0 = move-exception
            r18 = r6
            goto L_0x0792
        L_0x0791:
            r0 = move-exception
        L_0x0792:
            r2 = r10
            r21 = r14
        L_0x0795:
            boolean r3 = defpackage.hxz.a()
            if (r3 == 0) goto L_0x07c5
            aywy r3 = defpackage.aywy.a
            ayxk r3 = r3.a()
            boolean r3 = r3.ad()
            if (r3 == 0) goto L_0x07c4
            java.lang.String r3 = "Exception from CP2 query"
            r4 = r18
            android.util.Log.w(r4, r3, r0)
        L_0x07af:
            wmi r0 = r1.a
            amsn r3 = r1.w
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r3 = r3.a((java.util.concurrent.TimeUnit) r4)
            long r3 = r3 - r21
            r5 = 4
            xmc r3 = defpackage.wml.b(r5, r3)
            r0.a((defpackage.xmc) r3)
            goto L_0x07c7
        L_0x07c4:
            throw r0
        L_0x07c5:
            throw r0
        L_0x07c6:
            r2 = r10
        L_0x07c7:
            r3 = r17
            r4 = 0
            com.google.android.gms.common.data.DataHolder r0 = r2.a(r4, r3)
            wmi r2 = r1.a
            amsn r3 = r1.w
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r3 = r3.a((java.util.concurrent.TimeUnit) r4)
            r5 = 2
            xmc r3 = defpackage.wml.b(r5, r3)
            r2.a((defpackage.xmc) r3)
            amsn r2 = r1.w
            r2.e()
            wmi r2 = r1.a
            android.util.SparseIntArray r3 = r1.x
            r2.g = r3
            return r0
        L_0x07ed:
            r4 = r9
            java.lang.String r0 = "Not implemented"
            android.util.Log.e(r4, r0)
            r0 = 0
            return r0
        L_0x07f5:
            r2 = r4
            r4 = 0
            com.google.android.gms.common.data.DataHolder r0 = r2.a(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.woe.d(android.content.Context):com.google.android.gms.common.data.DataHolder");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public woe(String str, int i, wzv wzv, String str2, String str3, boolean z, String str4, int i2, int i3, boolean z2) {
        super(str, i, wzv, str2, "LoadAutocompleteList");
        String str5 = str4;
        int i4 = i2;
        int i5 = i3;
        boolean z3 = z2;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str5;
        this.f = wue.a(str4);
        this.g = i4;
        this.s = i5;
        this.v = z3;
        this.t = i;
        this.u = str;
        wmi wmi = this.a;
        wmi.f = str5;
        wmi.h = i4;
        wmi.i = i5;
        wmi.j = z3;
    }
}
