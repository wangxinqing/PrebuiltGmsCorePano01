package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: wre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wre extends wqz {
    public static final String[] f = {"contact_id", "times_contacted", "last_time_contacted"};
    private static final String[] h = {"raw_contact_id", "contact_id", "display_name", "data1", "data3", "last_time_used", "times_used"};
    private static final String[] i = {"raw_contact_id", "contact_id", "display_name", "data1", "data3", "last_time_used", "times_used", "is_super_primary"};
    private static final String[] j = {"raw_contact_id", "contact_id", "display_name", "data1", "data3", "last_time_used", "times_used"};
    private static final String[] k = {"raw_contact_id", "contact_id", "display_name", "data1", "data3", "last_time_used", "times_used", "is_super_primary"};
    public final yda g;
    private final yda l;

    public wre(Context context, wrg wrg) {
        super("CL_C", context, new xsd(context), new ybz(), new wrc(context, wrg));
        xip.a();
        if (((Boolean) xfv.a.a()).booleanValue()) {
            this.l = ydb.a(context, "CL_DM");
            this.g = ydb.a(context, "LB_C");
            return;
        }
        this.l = new yda(context, "CL_DM");
        this.g = new yda(context, "LB_C");
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length());
        sb.append(str);
        sb.append(" = '");
        sb.append(str2);
        sb.append('\'');
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e0, code lost:
        if (r9 != null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00eb, code lost:
        if (r9 != null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ed, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f0, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map b(java.util.List r13) {
        /*
            r12 = this;
            java.lang.String r0 = "contact_id"
            java.lang.String r1 = "ContactsLogger"
            int r2 = defpackage.wqi.a
            defpackage.xip.a()
            xfs r2 = defpackage.xgb.a
            java.lang.Object r2 = r2.a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x001b
            java.lang.String[] r2 = k
            r5 = r2
            goto L_0x001e
        L_0x001b:
            java.lang.String[] r2 = j
            r5 = r2
        L_0x001e:
            java.util.HashMap r2 = defpackage.anet.a()
            r9 = 0
            android.content.Context r3 = r12.a     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e3 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e3 }
            android.net.Uri r4 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e3 }
            java.lang.String r6 = a((java.lang.String) r0, (java.util.Collection) r13)     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e3 }
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e3 }
            if (r9 == 0) goto L_0x00db
        L_0x0037:
            boolean r13 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x00d9 }
            if (r13 == 0) goto L_0x00e0
            int r13 = r9.getColumnIndex(r0)     // Catch:{ SQLiteException -> 0x00d9 }
            long r3 = r9.getLong(r13)     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.Long r13 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.String r3 = "raw_contact_id"
            int r3 = r9.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x00d9 }
            long r3 = r9.getLong(r3)     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.String r4 = "data1"
            int r4 = r9.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.String r4 = r9.getString(r4)     // Catch:{ SQLiteException -> 0x00d9 }
            boolean r5 = r2.containsKey(r13)     // Catch:{ SQLiteException -> 0x00d9 }
            if (r5 != 0) goto L_0x006f
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ SQLiteException -> 0x00d9 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x00d9 }
            r2.put(r13, r5)     // Catch:{ SQLiteException -> 0x00d9 }
        L_0x006f:
            java.lang.Object r13 = r2.get(r13)     // Catch:{ SQLiteException -> 0x00d9 }
            java.util.Map r13 = (java.util.Map) r13     // Catch:{ SQLiteException -> 0x00d9 }
            if (r13 != 0) goto L_0x0078
            goto L_0x00ce
        L_0x0078:
            boolean r5 = r13.containsKey(r4)     // Catch:{ SQLiteException -> 0x00d9 }
            if (r5 != 0) goto L_0x00ce
            java.lang.String r5 = "times_used"
            int r5 = r9.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x00d9 }
            long r5 = r9.getLong(r5)     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.String r7 = "last_time_used"
            int r7 = r9.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x00d9 }
            long r7 = r9.getLong(r7)     // Catch:{ SQLiteException -> 0x00d9 }
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r7 = r7 / r10
            long r7 = r7 * r10
            xfs r10 = defpackage.xgb.a     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.Object r10 = r10.a()     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ SQLiteException -> 0x00d9 }
            boolean r10 = r10.booleanValue()     // Catch:{ SQLiteException -> 0x00d9 }
            if (r10 == 0) goto L_0x00be
            java.lang.String r10 = "is_super_primary"
            int r10 = r9.getColumnIndex(r10)     // Catch:{ SQLiteException -> 0x00d9 }
            int r10 = r9.getInt(r10)     // Catch:{ SQLiteException -> 0x00d9 }
            wrb r11 = new wrb     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x00d9 }
            r11.<init>(r5, r6, r10)     // Catch:{ SQLiteException -> 0x00d9 }
            goto L_0x00cb
        L_0x00be:
            wrb r11 = new wrb     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x00d9 }
            r11.<init>(r5, r6)     // Catch:{ SQLiteException -> 0x00d9 }
        L_0x00cb:
            r13.put(r4, r11)     // Catch:{ SQLiteException -> 0x00d9 }
        L_0x00ce:
            java.lang.Object r13 = r13.get(r4)     // Catch:{ SQLiteException -> 0x00d9 }
            wrb r13 = (defpackage.wrb) r13     // Catch:{ SQLiteException -> 0x00d9 }
            r13.a(r3)     // Catch:{ SQLiteException -> 0x00d9 }
            goto L_0x0037
        L_0x00d9:
            r13 = move-exception
            goto L_0x00e6
        L_0x00db:
            java.lang.String r13 = "CP2 failed to fetch Phone info."
            android.util.Log.w(r1, r13)     // Catch:{ SQLiteException -> 0x00d9 }
        L_0x00e0:
            if (r9 == 0) goto L_0x00f0
            goto L_0x00ed
        L_0x00e3:
            r13 = move-exception
            goto L_0x00f2
        L_0x00e5:
            r13 = move-exception
        L_0x00e6:
            java.lang.String r0 = "CP2 Query Exception when fetching phone info"
            android.util.Log.e(r1, r0, r13)     // Catch:{ all -> 0x00f1 }
            if (r9 == 0) goto L_0x00f0
        L_0x00ed:
            r9.close()
        L_0x00f0:
            return r2
        L_0x00f1:
            r13 = move-exception
        L_0x00f2:
            if (r9 == 0) goto L_0x00f7
            r9.close()
        L_0x00f7:
            goto L_0x00f9
        L_0x00f8:
            throw r13
        L_0x00f9:
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wre.b(java.util.List):java.util.Map");
    }

    private static final Set c(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(list);
        return linkedHashSet;
    }

    public static final String a(String str, Collection collection) {
        return String.format(str.concat(" IN (%s)"), new Object[]{TextUtils.join(",", collection)});
    }

    public static String a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(strArr[0]);
        for (int i2 = 1; i2 < strArr.length; i2++) {
            sb.append(" AND ");
            sb.append(strArr[i2]);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e0, code lost:
        if (r9 != null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00eb, code lost:
        if (r9 != null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ed, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f0, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map a(java.util.List r13) {
        /*
            r12 = this;
            java.lang.String r0 = "contact_id"
            java.lang.String r1 = "ContactsLogger"
            int r2 = defpackage.wqi.a
            defpackage.xip.a()
            xfs r2 = defpackage.xgb.a
            java.lang.Object r2 = r2.a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x001b
            java.lang.String[] r2 = i
            r5 = r2
            goto L_0x001e
        L_0x001b:
            java.lang.String[] r2 = h
            r5 = r2
        L_0x001e:
            java.util.HashMap r2 = defpackage.anet.a()
            r9 = 0
            android.content.Context r3 = r12.a     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e3 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e3 }
            android.net.Uri r4 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e3 }
            java.lang.String r6 = a((java.lang.String) r0, (java.util.Collection) r13)     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e3 }
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e3 }
            if (r9 == 0) goto L_0x00db
        L_0x0037:
            boolean r13 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x00d9 }
            if (r13 == 0) goto L_0x00e0
            int r13 = r9.getColumnIndex(r0)     // Catch:{ SQLiteException -> 0x00d9 }
            long r3 = r9.getLong(r13)     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.Long r13 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.String r3 = "raw_contact_id"
            int r3 = r9.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x00d9 }
            long r3 = r9.getLong(r3)     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.String r4 = "data1"
            int r4 = r9.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.String r4 = r9.getString(r4)     // Catch:{ SQLiteException -> 0x00d9 }
            boolean r5 = r2.containsKey(r13)     // Catch:{ SQLiteException -> 0x00d9 }
            if (r5 != 0) goto L_0x006f
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ SQLiteException -> 0x00d9 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x00d9 }
            r2.put(r13, r5)     // Catch:{ SQLiteException -> 0x00d9 }
        L_0x006f:
            java.lang.Object r13 = r2.get(r13)     // Catch:{ SQLiteException -> 0x00d9 }
            java.util.Map r13 = (java.util.Map) r13     // Catch:{ SQLiteException -> 0x00d9 }
            if (r13 != 0) goto L_0x0078
            goto L_0x00ce
        L_0x0078:
            boolean r5 = r13.containsKey(r4)     // Catch:{ SQLiteException -> 0x00d9 }
            if (r5 != 0) goto L_0x00ce
            java.lang.String r5 = "times_used"
            int r5 = r9.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x00d9 }
            long r5 = r9.getLong(r5)     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.String r7 = "last_time_used"
            int r7 = r9.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x00d9 }
            long r7 = r9.getLong(r7)     // Catch:{ SQLiteException -> 0x00d9 }
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r7 = r7 / r10
            long r7 = r7 * r10
            xfs r10 = defpackage.xgb.a     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.Object r10 = r10.a()     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ SQLiteException -> 0x00d9 }
            boolean r10 = r10.booleanValue()     // Catch:{ SQLiteException -> 0x00d9 }
            if (r10 == 0) goto L_0x00be
            java.lang.String r10 = "is_super_primary"
            int r10 = r9.getColumnIndex(r10)     // Catch:{ SQLiteException -> 0x00d9 }
            int r10 = r9.getInt(r10)     // Catch:{ SQLiteException -> 0x00d9 }
            wrb r11 = new wrb     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x00d9 }
            r11.<init>(r5, r6, r10)     // Catch:{ SQLiteException -> 0x00d9 }
            goto L_0x00cb
        L_0x00be:
            wrb r11 = new wrb     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x00d9 }
            r11.<init>(r5, r6)     // Catch:{ SQLiteException -> 0x00d9 }
        L_0x00cb:
            r13.put(r4, r11)     // Catch:{ SQLiteException -> 0x00d9 }
        L_0x00ce:
            java.lang.Object r13 = r13.get(r4)     // Catch:{ SQLiteException -> 0x00d9 }
            wrb r13 = (defpackage.wrb) r13     // Catch:{ SQLiteException -> 0x00d9 }
            r13.a(r3)     // Catch:{ SQLiteException -> 0x00d9 }
            goto L_0x0037
        L_0x00d9:
            r13 = move-exception
            goto L_0x00e6
        L_0x00db:
            java.lang.String r13 = "CP2 failed to fetch Email info."
            android.util.Log.w(r1, r13)     // Catch:{ SQLiteException -> 0x00d9 }
        L_0x00e0:
            if (r9 == 0) goto L_0x00f0
            goto L_0x00ed
        L_0x00e3:
            r13 = move-exception
            goto L_0x00f2
        L_0x00e5:
            r13 = move-exception
        L_0x00e6:
            java.lang.String r0 = "CP2 Query Exception when fetching email info"
            android.util.Log.e(r1, r0, r13)     // Catch:{ all -> 0x00f1 }
            if (r9 == 0) goto L_0x00f0
        L_0x00ed:
            r9.close()
        L_0x00f0:
            return r2
        L_0x00f1:
            r13 = move-exception
        L_0x00f2:
            if (r9 == 0) goto L_0x00f7
            r9.close()
        L_0x00f7:
            goto L_0x00f9
        L_0x00f8:
            throw r13
        L_0x00f9:
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wre.a(java.util.List):java.util.Map");
    }

    static final void a(boolean z, boolean z2, avdg avdg) {
        avdq avdq = ((avdi) avdg.b).f;
        if (avdq == null) {
            avdq = avdq.A;
        }
        aucd aucd = (aucd) avdq.c(5);
        aucd.a((aucj) avdq);
        avdk avdk = (avdk) aucd;
        if (avdk.c) {
            avdk.c();
            avdk.c = false;
        }
        avdq avdq2 = (avdq) avdk.b;
        int i2 = avdq2.a | 128;
        avdq2.a = i2;
        avdq2.h = z;
        avdq2.a = i2 | 64;
        avdq2.g = z2;
        if (avdg.c) {
            avdg.c();
            avdg.c = false;
        }
        avdi avdi = (avdi) avdg.b;
        avdq avdq3 = (avdq) avdk.i();
        avdi avdi2 = avdi.h;
        avdq3.getClass();
        avdi.f = avdq3;
        avdi.a |= 16;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v88, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v98, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r6v58, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x028b, code lost:
        r7 = (int) defpackage.aywy.a.a().ab();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0296, code lost:
        if (r7 >= 0) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0298, code lost:
        r5 = r4.b.d(r5).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02a6, code lost:
        if (r5.hasNext() == false) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02a8, code lost:
        r7 = (android.accounts.Account) r5.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02ae, code lost:
        if (r7 == null) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02b6, code lost:
        if (defpackage.ybz.a(r7.name) == false) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02b8, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02ba, code lost:
        if (r7 == 0) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02bc, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02be, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02bf, code lost:
        r4.a = java.lang.Boolean.valueOf(r5);
        r4 = r4.a.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02cc, code lost:
        r4 = r7.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02d0, code lost:
        if (r4 != false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02d3, code lost:
        r4 = defpackage.anda.a();
        r5 = r40.size();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02dc, code lost:
        if (r7 >= r5) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02de, code lost:
        r9 = (defpackage.wrn) r2.get(r7);
        r10 = (java.util.List) r8.get(java.lang.Long.valueOf(r9.a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02f0, code lost:
        if (r10 != null) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02f2, code lost:
        r4.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02f6, code lost:
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02fe, code lost:
        if (r10.hasNext() == false) goto L_0x0319;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0300, code lost:
        r11 = (defpackage.wrd) r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x030e, code lost:
        if ("com.google".equals(r11.c) == false) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0316, code lost:
        if (defpackage.ybz.a(r11.d) == false) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0319, code lost:
        r4.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x031c, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x031f, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0320, code lost:
        r4 = java.lang.System.currentTimeMillis();
        defpackage.xip.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0333, code lost:
        if (((java.lang.Boolean) defpackage.xij.a.a()).booleanValue() == false) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0335, code lost:
        r7 = defpackage.wqw.a(r1.a).getInt("contacts-logger-batch-upload-version", 0);
        r9 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0346, code lost:
        if (r9.d != false) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0348, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x034b, code lost:
        r9 = r42;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0350, code lost:
        if (r9.d != false) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0352, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0355, code lost:
        defpackage.xip.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0365, code lost:
        if (((java.lang.Boolean) defpackage.xij.a.a()).booleanValue() == false) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0367, code lost:
        r10 = defpackage.wqw.a(r1.a);
        r12 = r10.getInt("contacts-logger-upload-version-reset-random", -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0373, code lost:
        if (r12 != -1) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0375, code lost:
        r12 = new java.util.Random().nextInt(Integer.MAX_VALUE);
        r10.edit().putInt("contacts-logger-upload-version-reset-random", r12).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x038f, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0390, code lost:
        r10 = (defpackage.avdg) defpackage.avdi.h.o();
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x039d, code lost:
        if (r13 >= r2.size()) goto L_0x0900;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x039f, code lost:
        r14 = (defpackage.wrn) r2.get(r13);
        r15 = r12;
        r11 = java.lang.Long.valueOf(r14.a);
        r12 = (defpackage.avdd) defpackage.avdf.q.o();
        r20 = r10;
        r9 = r11.longValue();
        r22 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03be, code lost:
        if (r12.c == false) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03c0, code lost:
        r12.c();
        r12.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03c6, code lost:
        r2 = (defpackage.avdf) r12.b;
        r23 = r15;
        r15 = r2.a | 1;
        r2.a = r15;
        r2.b = r9;
        r9 = r14.f;
        r15 = r15 | 16;
        r2.a = r15;
        r2.e = r9;
        r9 = r14.g;
        r15 = r15 | 32;
        r2.a = r15;
        r2.i = r9;
        r9 = r14.h;
        r2.a = r15 | 64;
        r2.j = (r9 / 86400000) * 86400000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03fb, code lost:
        if (android.text.TextUtils.isEmpty(r14.b) == false) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03fe, code lost:
        r2 = r14.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0400, code lost:
        if (r2 == null) goto L_0x041c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0404, code lost:
        if (r12.c != false) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0407, code lost:
        r12.c();
        r12.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x040d, code lost:
        r9 = (defpackage.avdf) r12.b;
        r2.getClass();
        r9.a |= 4;
        r9.c = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x041e, code lost:
        if (r12.c != false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0421, code lost:
        r12.c();
        r12.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0427, code lost:
        r2 = (defpackage.avdf) r12.b;
        r9 = r2.a | 16384;
        r2.a = r9;
        r2.m = r7;
        r9 = r9 | 65536;
        r2.a = r9;
        r2.o = r4;
        r2.p = r6 - 1;
        r9 = r9 | 131072;
        r2.a = r9;
        r2.a = r9 | 32768;
        r9 = r23;
        r2.n = r9;
        r2 = defpackage.anda.a((java.lang.Iterable) java.util.Collections.unmodifiableSet(r14.i));
        defpackage.anbs.f(r2, new defpackage.wra());
        r12.a((java.lang.Iterable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0463, code lost:
        if (r3 == null) goto L_0x046c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0465, code lost:
        r2 = (java.util.Map) r3.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x046c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x046e, code lost:
        r10 = c(defpackage.amzy.a((java.util.Collection) r14.c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x047a, code lost:
        if (r12.c != false) goto L_0x047d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x047d, code lost:
        r12.c();
        r12.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0483, code lost:
        r26 = r3;
        ((defpackage.avdf) r12.b).f = defpackage.aucj.s();
        r3 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0497, code lost:
        if (r3.hasNext() == false) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0499, code lost:
        r10 = (defpackage.wqx) r3.next();
        r15 = (defpackage.avdu) defpackage.avdv.h.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04ab, code lost:
        if (r10.b() == false) goto L_0x04d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04ad, code lost:
        r27 = r3;
        r3 = r10.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04b1, code lost:
        if (r3 == null) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04b3, code lost:
        r30 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04b7, code lost:
        if (r15.c != false) goto L_0x04ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04ba, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04c0, code lost:
        r4 = (defpackage.avdv) r15.b;
        r3.getClass();
        r4.a |= 1;
        r4.b = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04d2, code lost:
        r27 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04d4, code lost:
        r30 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04da, code lost:
        if (r10.a() == false) goto L_0x04fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04dc, code lost:
        r3 = r10.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04de, code lost:
        if (r3 == null) goto L_0x04fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04e2, code lost:
        if (r15.c != false) goto L_0x04e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04e5, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04eb, code lost:
        r4 = (defpackage.avdv) r15.b;
        r3.getClass();
        r4.a |= 2;
        r4.c = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04fc, code lost:
        if (r2 == null) goto L_0x0579;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04fe, code lost:
        r3 = (defpackage.wrb) r2.get(r10.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0506, code lost:
        if (r3 == null) goto L_0x0576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0508, code lost:
        r4 = r3.b.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0510, code lost:
        if (r15.c != false) goto L_0x0513;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0513, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0519, code lost:
        r10 = (defpackage.avdv) r15.b;
        r32 = r2;
        r10.a |= 4;
        r10.e = r4;
        r4 = r3.c.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0531, code lost:
        if (r15.c != false) goto L_0x0534;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0534, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x053a, code lost:
        r2 = (defpackage.avdv) r15.b;
        r2.a |= 8;
        r2.f = r4;
        r15.a(r3.a);
        defpackage.xip.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x055a, code lost:
        if (((java.lang.Boolean) defpackage.xgb.a.a()).booleanValue() == false) goto L_0x057b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x055c, code lost:
        r2 = r3.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0560, code lost:
        if (r15.c != false) goto L_0x0563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0563, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0569, code lost:
        r3 = (defpackage.avdv) r15.b;
        r3.a |= 32;
        r3.g = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0576, code lost:
        r32 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0579, code lost:
        r32 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x057b, code lost:
        r12.a(r15);
        r3 = r27;
        r4 = r30;
        r2 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0586, code lost:
        r30 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0588, code lost:
        if (r0 == null) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x058a, code lost:
        r2 = (java.util.Map) r0.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0591, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0593, code lost:
        r3 = c(defpackage.amzy.a((java.util.Collection) r14.d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x059f, code lost:
        if (r12.c != false) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05a2, code lost:
        r12.c();
        r12.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05a8, code lost:
        ((defpackage.avdf) r12.b).g = defpackage.aucj.s();
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05ba, code lost:
        if (r3.hasNext() == false) goto L_0x06ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05bc, code lost:
        r4 = (defpackage.wqx) r3.next();
        r5 = (defpackage.avdr) defpackage.avds.h.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05ce, code lost:
        if (r4.b() == false) goto L_0x05f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05d0, code lost:
        r10 = r4.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05d2, code lost:
        if (r10 == null) goto L_0x05f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05d6, code lost:
        if (r5.c != false) goto L_0x05d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05d9, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05df, code lost:
        r15 = (defpackage.avds) r5.b;
        r10.getClass();
        r27 = r0;
        r15.a |= 1;
        r15.b = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05f3, code lost:
        r27 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05f9, code lost:
        if (r4.a() == false) goto L_0x061b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05fb, code lost:
        r0 = r4.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x05fd, code lost:
        if (r0 == null) goto L_0x061b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0601, code lost:
        if (r5.c != false) goto L_0x0604;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0604, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x060a, code lost:
        r10 = (defpackage.avds) r5.b;
        r0.getClass();
        r10.a |= 2;
        r10.c = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x061b, code lost:
        if (r2 == null) goto L_0x069c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x061d, code lost:
        r0 = (defpackage.wrb) r2.get(r4.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0625, code lost:
        if (r0 == null) goto L_0x0697;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0627, code lost:
        r10 = r2;
        r15 = r3;
        r2 = r0.b.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0631, code lost:
        if (r5.c != false) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0634, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x063a, code lost:
        r4 = (defpackage.avds) r5.b;
        r32 = r6;
        r4.a |= 4;
        r4.e = r2;
        r2 = r0.c.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0652, code lost:
        if (r5.c != false) goto L_0x0655;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0655, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x065b, code lost:
        r4 = (defpackage.avds) r5.b;
        r4.a |= 8;
        r4.f = r2;
        r5.a(r0.a);
        defpackage.xip.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x067b, code lost:
        if (((java.lang.Boolean) defpackage.xgb.a.a()).booleanValue() == false) goto L_0x06a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x067d, code lost:
        r0 = r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0681, code lost:
        if (r5.c != false) goto L_0x0684;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0684, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x068a, code lost:
        r2 = (defpackage.avds) r5.b;
        r2.a |= 32;
        r2.g = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0697, code lost:
        r10 = r2;
        r15 = r3;
        r32 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x069c, code lost:
        r10 = r2;
        r15 = r3;
        r32 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x06a0, code lost:
        r12.a(r5);
        r2 = r10;
        r3 = r15;
        r0 = r27;
        r6 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x06ab, code lost:
        r27 = r0;
        r32 = r6;
        r2 = r28;
        r0 = (java.util.Map) r2.get(r11);
        r3 = c(defpackage.amzy.a((java.util.Collection) r14.e));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x06c3, code lost:
        if (r12.c != false) goto L_0x06c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x06c6, code lost:
        r12.c();
        r12.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x06cc, code lost:
        ((defpackage.avdf) r12.b).h = defpackage.aucj.s();
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x06de, code lost:
        if (r3.hasNext() == false) goto L_0x0747;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x06e0, code lost:
        r4 = (defpackage.wqx) r3.next();
        r5 = (defpackage.avdw) defpackage.avdx.f.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x06f2, code lost:
        if (r4.b() == false) goto L_0x0712;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x06f4, code lost:
        r6 = r4.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x06f6, code lost:
        if (r6 == null) goto L_0x0712;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x06fa, code lost:
        if (r5.c != false) goto L_0x06fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x06fd, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0703, code lost:
        r10 = (defpackage.avdx) r5.b;
        r6.getClass();
        r10.a |= 1;
        r10.b = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0716, code lost:
        if (r4.a() == false) goto L_0x0736;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0718, code lost:
        r6 = r4.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x071a, code lost:
        if (r6 == null) goto L_0x0736;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x071e, code lost:
        if (r5.c != false) goto L_0x0721;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0721, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0727, code lost:
        r10 = (defpackage.avdx) r5.b;
        r6.getClass();
        r10.a |= 2;
        r10.c = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0736, code lost:
        if (r0 == null) goto L_0x0743;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0738, code lost:
        r5.a((java.util.Set) r0.get(r4.a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0743, code lost:
        r12.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0747, code lost:
        r0 = (java.util.List) r8.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a9, code lost:
        if (r8 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x074d, code lost:
        if (r0 == null) goto L_0x08e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x074f, code lost:
        defpackage.xip.a();
        r3 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0759, code lost:
        if (r12.c != false) goto L_0x075c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x075c, code lost:
        r12.c();
        r12.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0762, code lost:
        ((defpackage.avdf) r12.b).k = defpackage.aucj.s();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0771, code lost:
        if (r4 >= r0.size()) goto L_0x08e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0773, code lost:
        r5 = (defpackage.wrd) r0.get(r4);
        r6 = defpackage.avdz.r.o();
        r10 = r5.a.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0787, code lost:
        if (r6.c != false) goto L_0x078a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x078a, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0790, code lost:
        r14 = (defpackage.avdz) r6.b;
        r15 = r14.a | 1;
        r14.a = r15;
        r14.b = r10;
        r10 = r5.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x07a0, code lost:
        if (r10 == null) goto L_0x0821;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x07a2, code lost:
        r10.getClass();
        r14.a = r15 | 8;
        r14.c = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x07bd, code lost:
        if (java.lang.Boolean.valueOf(defpackage.aywy.a.a().u()).booleanValue() == false) goto L_0x081d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x07bf, code lost:
        r10 = (java.lang.Boolean) r3.get(((defpackage.avdz) r6.b).c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x07cb, code lost:
        if (r10 == null) goto L_0x07ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x07cd, code lost:
        r10 = r10.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x07d3, code lost:
        if (r6.c != false) goto L_0x07d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x07d6, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x07dc, code lost:
        r11 = (defpackage.avdz) r6.b;
        r11.a |= 32768;
        r11.m = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x07ee, code lost:
        r10 = defpackage.aeku.a(r1.a, ((defpackage.avdz) r6.b).c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x07fc, code lost:
        if (r6.c != false) goto L_0x07ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x07ff, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0805, code lost:
        r11 = (defpackage.avdz) r6.b;
        r11.a |= 32768;
        r11.m = r10;
        r3.put(r11.c, java.lang.Boolean.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0824, code lost:
        r10 = r5.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0826, code lost:
        if (r10 == null) goto L_0x0842;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x082a, code lost:
        if (r6.c != false) goto L_0x082d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x082d, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0833, code lost:
        r11 = (defpackage.avdz) r6.b;
        r10.getClass();
        r11.a |= 16;
        r11.d = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0847, code lost:
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) null) != false) goto L_0x084b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0849, code lost:
        r10 = r5.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x084d, code lost:
        if (r5.h == false) goto L_0x0867;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0851, code lost:
        if (r6.c != false) goto L_0x0854;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0854, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x085a, code lost:
        r10 = (defpackage.avdz) r6.b;
        r10.a |= 16384;
        r10.l = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0867, code lost:
        r10 = r5.f.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x086f, code lost:
        if (r6.c != false) goto L_0x0872;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0872, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0878, code lost:
        r14 = (defpackage.avdz) r6.b;
        r14.a |= 1024;
        r14.h = r10;
        r10 = (r5.g.longValue() / 86400000) * 86400000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0890, code lost:
        if (r6.c != false) goto L_0x0893;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0893, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0899, code lost:
        r14 = (defpackage.avdz) r6.b;
        r15 = r14.a | 2048;
        r14.a = r15;
        r14.i = r10;
        r10 = r5.j;
        r11 = r10 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x08a9, code lost:
        if (r10 == 0) goto L_0x08e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x08ab, code lost:
        r14.g = r11;
        r14.a = r15 | 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
        r7 = r11;
        r15 = "contact_id";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x08b9, code lost:
        if ("com.google".equals(r5.c) == false) goto L_0x08de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x08bd, code lost:
        if (r5.e != null) goto L_0x08de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x08bf, code lost:
        r5 = r5.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x08c1, code lost:
        if (r5 != null) goto L_0x08c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x08c6, code lost:
        if (r6.c != false) goto L_0x08c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x08c9, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x08cf, code lost:
        r10 = (defpackage.avdz) r6.b;
        r5.getClass();
        r10.a |= 32;
        r10.e = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x08de, code lost:
        r12.a(r6);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x08e6, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x08e7, code lost:
        r10 = r20;
        r10.a(r12);
        r13 = r13 + 1;
        r28 = r2;
        r12 = r9;
        r2 = r22;
        r3 = r26;
        r0 = r27;
        r4 = r30;
        r6 = r32;
        r9 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0900, code lost:
        r0 = r1.a;
        r2 = defpackage.wrf.a;
        r2 = defpackage.wrf.a(r0, android.provider.ContactsContract.Contacts.CONTENT_URI, defpackage.wrf.b);
        r3 = defpackage.wrf.a(r0, android.provider.ContactsContract.RawContacts.CONTENT_URI, defpackage.wrf.a);
        defpackage.xip.a();
        r4 = (defpackage.avdk) defpackage.avdq.A.o();
        r5 = android.os.Build.MODEL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0923, code lost:
        if (r4.c != false) goto L_0x0926;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0926, code lost:
        r4.c();
        r4.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x092c, code lost:
        r6 = (defpackage.avdq) r4.b;
        r5.getClass();
        r6.a |= 1;
        r6.b = r5;
        r5 = android.os.Build.BRAND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x093f, code lost:
        if (r4.c != false) goto L_0x0942;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0942, code lost:
        r4.c();
        r4.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0948, code lost:
        r6 = (defpackage.avdq) r4.b;
        r5.getClass();
        r6.a |= 2;
        r6.c = r5;
        r5 = android.os.Build.DEVICE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x095b, code lost:
        if (r4.c != false) goto L_0x095e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x095e, code lost:
        r4.c();
        r4.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0964, code lost:
        r6 = (defpackage.avdq) r4.b;
        r5.getClass();
        r6.a |= 4;
        r6.d = r5;
        r5 = android.os.Build.DISPLAY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0977, code lost:
        if (r4.c != false) goto L_0x097a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x097a, code lost:
        r4.c();
        r4.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0980, code lost:
        r6 = (defpackage.avdq) r4.b;
        r5.getClass();
        r6.a |= 8;
        r6.e = r5;
        r5 = android.os.Build.MANUFACTURER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0993, code lost:
        if (r4.c != false) goto L_0x0996;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0996, code lost:
        r4.c();
        r4.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x099c, code lost:
        r6 = (defpackage.avdq) r4.b;
        r5.getClass();
        r7 = r6.a | 16;
        r6.a = r7;
        r6.f = r5;
        r5 = r7 | 512;
        r6.a = r5;
        r6.i = (long) r2;
        r6.a = r5 | 1024;
        r6.j = (long) r3;
        defpackage.avdq.a(r6);
        r2 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x09c2, code lost:
        if (r4.c != false) goto L_0x09c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x09c5, code lost:
        r4.c();
        r4.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x09cb, code lost:
        r5 = (defpackage.avdq) r4.b;
        r5.a |= 2048;
        r5.k = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x09e9, code lost:
        if (java.lang.Boolean.valueOf(defpackage.aywy.a.a().t()).booleanValue() == false) goto L_0x0a06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x09eb, code lost:
        r2 = defpackage.wrf.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x09f1, code lost:
        if (r4.c == false) goto L_0x09f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x09f3, code lost:
        r4.c();
        r4.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x09f9, code lost:
        r5 = (defpackage.avdq) r4.b;
        r5.a |= com.google.android.chimera.FragmentTransaction.TRANSIT_EXIT_MASK;
        r5.m = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0a08, code lost:
        if (r4.c != false) goto L_0x0a0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0a0b, code lost:
        r4.c();
        r4.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0a11, code lost:
        r2 = (defpackage.avdq) r4.b;
        r2.a |= com.google.android.chimera.FragmentTransaction.TRANSIT_EXIT_MASK;
        r2.m = 28.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0a1f, code lost:
        r2 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0a23, code lost:
        if (r4.c != false) goto L_0x0a26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0a26, code lost:
        r4.c();
        r4.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0a2c, code lost:
        r3 = (defpackage.avdq) r4.b;
        r3.a |= 524288;
        r3.p = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0a4b, code lost:
        if (java.lang.Boolean.valueOf(defpackage.aywy.a.a().y()).booleanValue() == false) goto L_0x0aa4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0a4d, code lost:
        r0 = new defpackage.xsd(r0).a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0a5a, code lost:
        if (r0.a() == false) goto L_0x0a7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0a6a, code lost:
        r0 = defpackage.amri.b(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) r0.b())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bf, code lost:
        if (r8 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0a6f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0a70, code lost:
        android.util.Log.e("DeviceUsageSettingsHelper", "Invalid Android Id", r0);
        r0 = defpackage.ampu.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0a7a, code lost:
        r0 = defpackage.ampu.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c4, code lost:
        r8 = defpackage.anet.a();
        r9 = defpackage.anet.a();
        r0 = new java.lang.String[9];
        r0[r6] = "_id";
        r0[1] = r15;
        r0[2] = "account_type";
        r0[3] = "account_name";
        r6 = "sourceid";
        r0[4] = r6;
        r28 = r7;
        r0[5] = "data_set";
        r0[6] = "times_contacted";
        r0[7] = "last_time_contacted";
        r0[8] = "starred";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0b3c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0b3d, code lost:
        r16 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0b3f, code lost:
        if (r16 != null) goto L_0x0b41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0b41, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0b44, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0b45, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0b46, code lost:
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0b48, code lost:
        if (r16 != null) goto L_0x0b4a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0b4a, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0b4d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r12 = r1.a.getContentResolver().query(android.provider.ContactsContract.RawContacts.CONTENT_URI, r0, a(r15, (java.util.Collection) r5), (java.lang.String[]) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0116, code lost:
        if (r12 == null) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0214, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011c, code lost:
        if (r12.moveToNext() == false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011e, code lost:
        r30 = new defpackage.wrd(java.lang.Long.valueOf(r12.getLong(r12.getColumnIndex("_id"))), r12.getString(r12.getColumnIndex(r6)), r12.getString(r12.getColumnIndex("account_type")), r12.getString(r12.getColumnIndex("account_name")), r12.getString(r12.getColumnIndex("data_set")), java.lang.Long.valueOf(r12.getLong(r12.getColumnIndex("times_contacted"))), java.lang.Long.valueOf(r12.getLong(r12.getColumnIndex("last_time_contacted"))), r12.getInt(r12.getColumnIndex("starred")));
        r9.put(r30.a, r30);
        r3 = java.lang.Long.valueOf(r12.getLong(r12.getColumnIndex(r15)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x018c, code lost:
        if (r8.containsKey(r3) != false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x018e, code lost:
        r22 = r6;
        r8.put(r3, new java.util.ArrayList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0199, code lost:
        r22 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x019b, code lost:
        ((java.util.List) r8.get(r3)).add(r30);
        r3 = r42;
        r6 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01aa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ac, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ae, code lost:
        android.util.Log.w("ContactsLogger", "CP2 failed to fetch RawContacts.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b3, code lost:
        if (r12 != null) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b6, code lost:
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ba, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01bd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01be, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        android.util.Log.e("ContactsLogger", "CP2 Query Exception when fetching raw-contacts.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c5, code lost:
        if (r12 != null) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c7, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ce, code lost:
        if (r9.isEmpty() == false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d0, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01d3, code lost:
        r0 = new java.lang.String[]{"raw_contact_id", "data14", "data15"};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r3 = a("raw_contact_id", (java.util.Collection) r9.keySet());
        r6 = a("mimetype", "vnd.android.cursor.item/photo");
        r3 = r1.a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, r0, a(r3, r6), (java.lang.String[]) null, (java.lang.String) null);
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0212, code lost:
        if (r3 == null) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0214, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0218, code lost:
        if (r3.moveToNext() == false) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x021a, code lost:
        r6 = r3.getLong(r3.getColumnIndex("raw_contact_id"));
        r10 = r3.getLong(r3.getColumnIndex("data14"));
        r0 = r3.getBlob(r3.getColumnIndex("data15"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x023a, code lost:
        if (r10 == 0) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x023c, code lost:
        r6 = 4;
        ((defpackage.wrd) r9.get(java.lang.Long.valueOf(r6))).j = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x024a, code lost:
        if (r0 == null) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x024c, code lost:
        r0 = (defpackage.wrd) r9.get(java.lang.Long.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0256, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r0.j = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x025a, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x025c, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x025e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x025f, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0261, code lost:
        r6 = 3;
        android.util.Log.w("ContactsLogger", "CP2 failed to fetch photo info.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0268, code lost:
        r0 = e;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x026a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x026d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x026e, code lost:
        r6 = 3;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        android.util.Log.e("ContactsLogger", "CP2 Query Exception when fetching photo info", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0276, code lost:
        if (r3 == null) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0278, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x027b, code lost:
        r0 = a((java.util.List) r5);
        r3 = b(r5);
        r4 = r1.c;
        r5 = r1.a;
        r7 = r4.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0289, code lost:
        if (r7 != null) goto L_0x02cc;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0b41  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0b4a  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0b53  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.avdi a(java.util.List r40, java.util.Set r41, defpackage.wrg r42) {
        /*
            r39 = this;
            r1 = r39
            r2 = r40
            r3 = r42
            java.lang.String r4 = "ContactsLogger"
            java.util.ArrayList r5 = defpackage.anda.a()
            int r0 = r40.size()
            r6 = 0
            r7 = 0
        L_0x0012:
            if (r7 < r0) goto L_0x0b57
            int r0 = defpackage.wqi.a
            r7 = 3
            java.lang.String[] r10 = new java.lang.String[r7]
            java.lang.String r14 = "raw_contact_id"
            r10[r6] = r14
            r15 = 1
            java.lang.String r13 = "contact_id"
            r10[r15] = r13
            r12 = 2
            java.lang.String r0 = "data1"
            r10[r12] = r0
            java.util.HashMap r11 = defpackage.anet.a()
            r16 = 0
            android.content.Context r8 = r1.a     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b2 }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b2 }
            android.net.Uri r9 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b2 }
            java.lang.String r17 = a((java.lang.String) r13, (java.util.Collection) r5)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b2 }
            r18 = 0
            r19 = 0
            r7 = r11
            r11 = r17
            r12 = r18
            r15 = r13
            r13 = r19
            android.database.Cursor r8 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x00b0, all -> 0x00b2 }
            if (r8 == 0) goto L_0x00a4
        L_0x004b:
            boolean r9 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            if (r9 == 0) goto L_0x00a9
            int r9 = r8.getColumnIndex(r15)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            long r9 = r8.getLong(r9)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            int r10 = r8.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            long r10 = r8.getLong(r10)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            int r11 = r8.getColumnIndex(r0)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            java.lang.String r11 = r8.getString(r11)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            boolean r12 = r7.containsKey(r9)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            if (r12 != 0) goto L_0x007f
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            r7.put(r9, r12)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
        L_0x007f:
            java.lang.Object r9 = r7.get(r9)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            if (r9 != 0) goto L_0x0088
            goto L_0x0096
        L_0x0088:
            boolean r12 = r9.containsKey(r11)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            if (r12 != 0) goto L_0x0096
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            r9.put(r11, r12)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
        L_0x0096:
            java.lang.Object r9 = r9.get(r11)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            java.util.Set r9 = (java.util.Set) r9     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            r9.add(r10)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
            goto L_0x004b
        L_0x00a0:
            r0 = move-exception
            goto L_0x00ac
        L_0x00a2:
            r0 = move-exception
            goto L_0x00ba
        L_0x00a4:
            java.lang.String r0 = "CP2 failed to fetch Postal info."
            android.util.Log.w(r4, r0)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x00a0 }
        L_0x00a9:
            if (r8 != 0) goto L_0x00c1
            goto L_0x00c4
        L_0x00ac:
            r16 = r8
            goto L_0x0b51
        L_0x00b0:
            r0 = move-exception
            goto L_0x00b8
        L_0x00b2:
            r0 = move-exception
            goto L_0x0b51
        L_0x00b5:
            r0 = move-exception
            r7 = r11
            r15 = r13
        L_0x00b8:
            r8 = r16
        L_0x00ba:
            java.lang.String r9 = "CP2 Query Exception when fetching postal info"
            android.util.Log.e(r4, r9, r0)     // Catch:{ all -> 0x0b4e }
            if (r8 == 0) goto L_0x00c4
        L_0x00c1:
            r8.close()
        L_0x00c4:
            java.util.HashMap r8 = defpackage.anet.a()
            java.util.HashMap r9 = defpackage.anet.a()
            r0 = 9
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r10 = "_id"
            r0[r6] = r10
            r11 = 1
            r0[r11] = r15
            java.lang.String r11 = "account_type"
            r12 = 2
            r0[r12] = r11
            java.lang.String r13 = "account_name"
            r18 = 3
            r0[r18] = r13
            r12 = 4
            java.lang.String r6 = "sourceid"
            r0[r12] = r6
            r12 = 5
            r28 = r7
            java.lang.String r7 = "data_set"
            r0[r12] = r7
            r22 = 6
            java.lang.String r23 = "times_contacted"
            r0[r22] = r23
            r22 = 7
            java.lang.String r23 = "last_time_contacted"
            r0[r22] = r23
            java.lang.String r22 = "starred"
            r29 = 8
            r0[r29] = r22
            android.content.Context r12 = r1.a     // Catch:{ SQLiteException -> 0x01bd, all -> 0x01ba }
            android.content.ContentResolver r22 = r12.getContentResolver()     // Catch:{ SQLiteException -> 0x01bd, all -> 0x01ba }
            android.net.Uri r23 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ SQLiteException -> 0x01bd, all -> 0x01ba }
            java.lang.String r25 = a((java.lang.String) r15, (java.util.Collection) r5)     // Catch:{ SQLiteException -> 0x01bd, all -> 0x01ba }
            r26 = 0
            r27 = 0
            r24 = r0
            android.database.Cursor r12 = r22.query(r23, r24, r25, r26, r27)     // Catch:{ SQLiteException -> 0x01bd, all -> 0x01ba }
            if (r12 == 0) goto L_0x01ae
        L_0x0118:
            boolean r0 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            if (r0 == 0) goto L_0x01b3
            wrd r0 = new wrd     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            int r3 = r12.getColumnIndex(r10)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            long r22 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            java.lang.Long r31 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            int r3 = r12.getColumnIndex(r6)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            java.lang.String r32 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            int r3 = r12.getColumnIndex(r11)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            java.lang.String r33 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            int r3 = r12.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            java.lang.String r34 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            int r3 = r12.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            java.lang.String r35 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            java.lang.String r3 = "times_contacted"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            long r22 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            java.lang.Long r36 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            java.lang.String r3 = "last_time_contacted"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            long r22 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            java.lang.Long r37 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            java.lang.String r3 = "starred"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            int r38 = r12.getInt(r3)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            r30 = r0
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            java.lang.Long r3 = r0.a     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            r9.put(r3, r0)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            int r3 = r12.getColumnIndex(r15)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            long r22 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            java.lang.Long r3 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            boolean r22 = r8.containsKey(r3)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            if (r22 != 0) goto L_0x0199
            r22 = r6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            r6.<init>()     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            r8.put(r3, r6)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            goto L_0x019b
        L_0x0199:
            r22 = r6
        L_0x019b:
            java.lang.Object r3 = r8.get(r3)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            r3.add(r0)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
            r3 = r42
            r6 = r22
            goto L_0x0118
        L_0x01aa:
            r0 = move-exception
            goto L_0x01b6
        L_0x01ac:
            r0 = move-exception
            goto L_0x01c0
        L_0x01ae:
            java.lang.String r0 = "CP2 failed to fetch RawContacts."
            android.util.Log.w(r4, r0)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01aa }
        L_0x01b3:
            if (r12 != 0) goto L_0x01c7
            goto L_0x01ca
        L_0x01b6:
            r16 = r12
            goto L_0x0b48
        L_0x01ba:
            r0 = move-exception
            goto L_0x0b48
        L_0x01bd:
            r0 = move-exception
            r12 = r16
        L_0x01c0:
            java.lang.String r3 = "CP2 Query Exception when fetching raw-contacts."
            android.util.Log.e(r4, r3, r0)     // Catch:{ all -> 0x0b45 }
            if (r12 == 0) goto L_0x01ca
        L_0x01c7:
            r12.close()
        L_0x01ca:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x01d3
            r6 = 3
            goto L_0x027b
        L_0x01d3:
            r3 = 3
            java.lang.String[] r0 = new java.lang.String[r3]
            r3 = 0
            r0[r3] = r14
            java.lang.String r3 = "data14"
            r6 = 1
            r0[r6] = r3
            java.lang.String r3 = "data15"
            r6 = 2
            r0[r6] = r3
            java.util.Set r3 = r9.keySet()     // Catch:{ SQLiteException -> 0x026d, all -> 0x026a }
            java.lang.String r3 = a((java.lang.String) r14, (java.util.Collection) r3)     // Catch:{ SQLiteException -> 0x026d, all -> 0x026a }
            java.lang.String r6 = "mimetype"
            java.lang.String r7 = "vnd.android.cursor.item/photo"
            java.lang.String r6 = a((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ SQLiteException -> 0x026d, all -> 0x026a }
            android.content.Context r7 = r1.a     // Catch:{ SQLiteException -> 0x026d, all -> 0x026a }
            android.content.ContentResolver r22 = r7.getContentResolver()     // Catch:{ SQLiteException -> 0x026d, all -> 0x026a }
            android.net.Uri r23 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ SQLiteException -> 0x026d, all -> 0x026a }
            r7 = 2
            java.lang.String[] r10 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x026d, all -> 0x026a }
            r7 = 0
            r10[r7] = r3     // Catch:{ SQLiteException -> 0x026d, all -> 0x026a }
            r3 = 1
            r10[r3] = r6     // Catch:{ SQLiteException -> 0x026d, all -> 0x026a }
            java.lang.String r25 = a((java.lang.String[]) r10)     // Catch:{ SQLiteException -> 0x026d, all -> 0x026a }
            r26 = 0
            r27 = 0
            r24 = r0
            android.database.Cursor r3 = r22.query(r23, r24, r25, r26, r27)     // Catch:{ SQLiteException -> 0x026d, all -> 0x026a }
            if (r3 == 0) goto L_0x0261
        L_0x0214:
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x025e }
            if (r0 == 0) goto L_0x025c
            int r0 = r3.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x025e }
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x025e }
            java.lang.String r0 = "data14"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ SQLiteException -> 0x025e }
            long r10 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x025e }
            java.lang.String r0 = "data15"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ SQLiteException -> 0x025e }
            byte[] r0 = r3.getBlob(r0)     // Catch:{ SQLiteException -> 0x025e }
            r12 = 0
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 == 0) goto L_0x024a
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x025e }
            java.lang.Object r0 = r9.get(r0)     // Catch:{ SQLiteException -> 0x025e }
            wrd r0 = (defpackage.wrd) r0     // Catch:{ SQLiteException -> 0x025e }
            r6 = 4
            r0.j = r6     // Catch:{ SQLiteException -> 0x025e }
            goto L_0x0214
        L_0x024a:
            if (r0 == 0) goto L_0x025a
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x025e }
            java.lang.Object r0 = r9.get(r0)     // Catch:{ SQLiteException -> 0x025e }
            wrd r0 = (defpackage.wrd) r0     // Catch:{ SQLiteException -> 0x025e }
            r6 = 3
            r0.j = r6     // Catch:{ SQLiteException -> 0x0268 }
            goto L_0x0214
        L_0x025a:
            r6 = 3
            goto L_0x0214
        L_0x025c:
            r6 = 3
            goto L_0x0278
        L_0x025e:
            r0 = move-exception
            r6 = 3
            goto L_0x0271
        L_0x0261:
            r6 = 3
            java.lang.String r0 = "CP2 failed to fetch photo info."
            android.util.Log.w(r4, r0)     // Catch:{ SQLiteException -> 0x0268 }
            goto L_0x027b
        L_0x0268:
            r0 = move-exception
            goto L_0x0271
        L_0x026a:
            r0 = move-exception
            goto L_0x0b3f
        L_0x026d:
            r0 = move-exception
            r6 = 3
            r3 = r16
        L_0x0271:
            java.lang.String r7 = "CP2 Query Exception when fetching photo info"
            android.util.Log.e(r4, r7, r0)     // Catch:{ all -> 0x0b3c }
            if (r3 == 0) goto L_0x027b
        L_0x0278:
            r3.close()
        L_0x027b:
            java.util.Map r0 = r1.a((java.util.List) r5)
            java.util.Map r3 = r1.b(r5)
            ybz r4 = r1.c
            android.content.Context r5 = r1.a
            java.lang.Boolean r7 = r4.a
            if (r7 != 0) goto L_0x02cc
            aywy r7 = defpackage.aywy.a
            ayxk r7 = r7.a()
            long r9 = r7.ab()
            int r7 = (int) r9
            if (r7 >= 0) goto L_0x02ba
            ycw r7 = r4.b
            anax r5 = r7.d(r5)
            anhj r5 = r5.iterator()
        L_0x02a2:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x02be
            java.lang.Object r7 = r5.next()
            android.accounts.Account r7 = (android.accounts.Account) r7
            if (r7 == 0) goto L_0x02a2
            java.lang.String r7 = r7.name
            boolean r7 = defpackage.ybz.a(r7)
            if (r7 == 0) goto L_0x02a2
            r5 = 1
            goto L_0x02bf
        L_0x02ba:
            if (r7 == 0) goto L_0x02be
            r5 = 1
            goto L_0x02bf
        L_0x02be:
            r5 = 0
        L_0x02bf:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.a = r5
            java.lang.Boolean r4 = r4.a
            boolean r4 = r4.booleanValue()
            goto L_0x02d0
        L_0x02cc:
            boolean r4 = r7.booleanValue()
        L_0x02d0:
            if (r4 != 0) goto L_0x02d3
            goto L_0x0320
        L_0x02d3:
            java.util.ArrayList r4 = defpackage.anda.a()
            int r5 = r40.size()
            r7 = 0
        L_0x02dc:
            if (r7 >= r5) goto L_0x031f
            java.lang.Object r9 = r2.get(r7)
            wrn r9 = (defpackage.wrn) r9
            long r10 = r9.a
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object r10 = r8.get(r10)
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L_0x02f6
            r4.add(r9)
            goto L_0x031c
        L_0x02f6:
            java.util.Iterator r10 = r10.iterator()
        L_0x02fa:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0319
            java.lang.Object r11 = r10.next()
            wrd r11 = (defpackage.wrd) r11
            java.lang.String r12 = r11.c
            java.lang.String r13 = "com.google"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x02fa
            java.lang.String r11 = r11.d
            boolean r11 = defpackage.ybz.a(r11)
            if (r11 == 0) goto L_0x02fa
            goto L_0x031c
        L_0x0319:
            r4.add(r9)
        L_0x031c:
            int r7 = r7 + 1
            goto L_0x02dc
        L_0x031f:
            r2 = r4
        L_0x0320:
            long r4 = java.lang.System.currentTimeMillis()
            defpackage.xip.a()
            xfs r7 = defpackage.xij.a
            java.lang.Object r7 = r7.a()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x034b
            android.content.Context r7 = r1.a
            android.content.SharedPreferences r7 = defpackage.wqw.a(r7)
            java.lang.String r9 = "contacts-logger-batch-upload-version"
            r10 = 0
            int r7 = r7.getInt(r9, r10)
            r9 = r42
            boolean r10 = r9.d
            if (r10 != 0) goto L_0x034e
            int r7 = r7 + 1
            goto L_0x034e
        L_0x034b:
            r9 = r42
            r7 = 0
        L_0x034e:
            boolean r10 = r9.d
            if (r10 != 0) goto L_0x0354
            r6 = 2
            goto L_0x0355
        L_0x0354:
        L_0x0355:
            defpackage.xip.a()
            xfs r10 = defpackage.xij.a
            java.lang.Object r10 = r10.a()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r11 = -1
            if (r10 == 0) goto L_0x038f
            android.content.Context r10 = r1.a
            android.content.SharedPreferences r10 = defpackage.wqw.a(r10)
            java.lang.String r12 = "contacts-logger-upload-version-reset-random"
            int r12 = r10.getInt(r12, r11)
            if (r12 != r11) goto L_0x0390
            java.util.Random r12 = new java.util.Random
            r12.<init>()
            r13 = 2147483647(0x7fffffff, float:NaN)
            int r12 = r12.nextInt(r13)
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r13 = "contacts-logger-upload-version-reset-random"
            android.content.SharedPreferences$Editor r10 = r10.putInt(r13, r12)
            r10.apply()
            goto L_0x0390
        L_0x038f:
            r12 = 0
        L_0x0390:
            avdi r10 = defpackage.avdi.h
            aucd r10 = r10.o()
            avdg r10 = (defpackage.avdg) r10
            r13 = 0
        L_0x0399:
            int r14 = r2.size()
            if (r13 >= r14) goto L_0x0900
            java.lang.Object r14 = r2.get(r13)
            wrn r14 = (defpackage.wrn) r14
            r15 = r12
            long r11 = r14.a
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            avdf r12 = defpackage.avdf.q
            aucd r12 = r12.o()
            avdd r12 = (defpackage.avdd) r12
            r20 = r10
            long r9 = r11.longValue()
            r22 = r2
            boolean r2 = r12.c
            if (r2 == 0) goto L_0x03c6
            r12.c()
            r2 = 0
            r12.c = r2
        L_0x03c6:
            aucj r2 = r12.b
            avdf r2 = (defpackage.avdf) r2
            r23 = r15
            int r15 = r2.a
            r17 = 1
            r15 = r15 | 1
            r2.a = r15
            r2.b = r9
            double r9 = r14.f
            r15 = r15 | 16
            r2.a = r15
            r2.e = r9
            long r9 = r14.g
            r15 = r15 | 32
            r2.a = r15
            r2.i = r9
            long r9 = r14.h
            r15 = r15 | 64
            r2.a = r15
            r24 = 86400000(0x5265c00, double:4.2687272E-316)
            long r9 = r9 / r24
            long r9 = r9 * r24
            r2.j = r9
            java.lang.String r2 = r14.b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x03fe
            goto L_0x041c
        L_0x03fe:
            java.lang.String r2 = r14.b
            if (r2 == 0) goto L_0x041c
            boolean r9 = r12.c
            if (r9 != 0) goto L_0x0407
            goto L_0x040d
        L_0x0407:
            r12.c()
            r9 = 0
            r12.c = r9
        L_0x040d:
            aucj r9 = r12.b
            avdf r9 = (defpackage.avdf) r9
            r2.getClass()
            int r10 = r9.a
            r15 = 4
            r10 = r10 | r15
            r9.a = r10
            r9.c = r2
        L_0x041c:
            boolean r2 = r12.c
            if (r2 != 0) goto L_0x0421
            goto L_0x0427
        L_0x0421:
            r12.c()
            r2 = 0
            r12.c = r2
        L_0x0427:
            aucj r2 = r12.b
            avdf r2 = (defpackage.avdf) r2
            int r9 = r2.a
            r9 = r9 | 16384(0x4000, float:2.2959E-41)
            r2.a = r9
            r2.m = r7
            r10 = 65536(0x10000, float:9.18355E-41)
            r9 = r9 | r10
            r2.a = r9
            r2.o = r4
            r10 = -1
            int r15 = r6 + -1
            r2.p = r15
            r15 = 131072(0x20000, float:1.83671E-40)
            r9 = r9 | r15
            r2.a = r9
            r15 = 32768(0x8000, float:4.5918E-41)
            r9 = r9 | r15
            r2.a = r9
            r9 = r23
            r2.n = r9
            java.util.Set r2 = r14.i
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r2)
            java.util.ArrayList r2 = defpackage.anda.a((java.lang.Iterable) r2)
            wra r10 = new wra
            r10.<init>()
            defpackage.anbs.f(r2, r10)
            r12.a((java.lang.Iterable) r2)
            if (r3 == 0) goto L_0x046c
            java.lang.Object r2 = r3.get(r11)
            java.util.Map r2 = (java.util.Map) r2
            goto L_0x046e
        L_0x046c:
            r2 = r16
        L_0x046e:
            java.util.List r10 = r14.c
            amzy r10 = defpackage.amzy.a((java.util.Collection) r10)
            java.util.Set r10 = c(r10)
            boolean r15 = r12.c
            if (r15 != 0) goto L_0x047d
            goto L_0x0483
        L_0x047d:
            r12.c()
            r15 = 0
            r12.c = r15
        L_0x0483:
            aucj r15 = r12.b
            avdf r15 = (defpackage.avdf) r15
            r26 = r3
            aucx r3 = defpackage.aucj.s()
            r15.f = r3
            java.util.Iterator r3 = r10.iterator()
        L_0x0493:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x0586
            java.lang.Object r10 = r3.next()
            wqx r10 = (defpackage.wqx) r10
            avdv r15 = defpackage.avdv.h
            aucd r15 = r15.o()
            avdu r15 = (defpackage.avdu) r15
            boolean r27 = r10.b()
            if (r27 == 0) goto L_0x04d2
            r27 = r3
            java.lang.String r3 = r10.a
            if (r3 == 0) goto L_0x04d4
            r30 = r4
            boolean r4 = r15.c
            if (r4 != 0) goto L_0x04ba
            goto L_0x04c0
        L_0x04ba:
            r15.c()
            r4 = 0
            r15.c = r4
        L_0x04c0:
            aucj r4 = r15.b
            avdv r4 = (defpackage.avdv) r4
            r3.getClass()
            int r5 = r4.a
            r17 = 1
            r5 = r5 | 1
            r4.a = r5
            r4.b = r3
            goto L_0x04d6
        L_0x04d2:
            r27 = r3
        L_0x04d4:
            r30 = r4
        L_0x04d6:
            boolean r3 = r10.a()
            if (r3 == 0) goto L_0x04fc
            java.lang.String r3 = r10.b
            if (r3 == 0) goto L_0x04fc
            boolean r4 = r15.c
            if (r4 != 0) goto L_0x04e5
            goto L_0x04eb
        L_0x04e5:
            r15.c()
            r4 = 0
            r15.c = r4
        L_0x04eb:
            aucj r4 = r15.b
            avdv r4 = (defpackage.avdv) r4
            r3.getClass()
            int r5 = r4.a
            r21 = 2
            r5 = r5 | 2
            r4.a = r5
            r4.c = r3
        L_0x04fc:
            if (r2 == 0) goto L_0x0579
            java.lang.String r3 = r10.a
            java.lang.Object r3 = r2.get(r3)
            wrb r3 = (defpackage.wrb) r3
            if (r3 == 0) goto L_0x0576
            java.lang.Long r4 = r3.b
            long r4 = r4.longValue()
            boolean r10 = r15.c
            if (r10 != 0) goto L_0x0513
            goto L_0x0519
        L_0x0513:
            r15.c()
            r10 = 0
            r15.c = r10
        L_0x0519:
            aucj r10 = r15.b
            avdv r10 = (defpackage.avdv) r10
            r32 = r2
            int r2 = r10.a
            r19 = 4
            r2 = r2 | 4
            r10.a = r2
            r10.e = r4
            java.lang.Long r2 = r3.c
            long r4 = r2.longValue()
            boolean r2 = r15.c
            if (r2 != 0) goto L_0x0534
            goto L_0x053a
        L_0x0534:
            r15.c()
            r2 = 0
            r15.c = r2
        L_0x053a:
            aucj r2 = r15.b
            avdv r2 = (defpackage.avdv) r2
            int r10 = r2.a
            r10 = r10 | 8
            r2.a = r10
            r2.f = r4
            java.util.Set r2 = r3.a
            r15.a(r2)
            defpackage.xip.a()
            xfs r2 = defpackage.xgb.a
            java.lang.Object r2 = r2.a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x057b
            boolean r2 = r3.d
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x0563
            goto L_0x0569
        L_0x0563:
            r15.c()
            r3 = 0
            r15.c = r3
        L_0x0569:
            aucj r3 = r15.b
            avdv r3 = (defpackage.avdv) r3
            int r4 = r3.a
            r4 = r4 | 32
            r3.a = r4
            r3.g = r2
            goto L_0x057b
        L_0x0576:
            r32 = r2
            goto L_0x057b
        L_0x0579:
            r32 = r2
        L_0x057b:
            r12.a((defpackage.avdu) r15)
            r3 = r27
            r4 = r30
            r2 = r32
            goto L_0x0493
        L_0x0586:
            r30 = r4
            if (r0 == 0) goto L_0x0591
            java.lang.Object r2 = r0.get(r11)
            java.util.Map r2 = (java.util.Map) r2
            goto L_0x0593
        L_0x0591:
            r2 = r16
        L_0x0593:
            java.util.List r3 = r14.d
            amzy r3 = defpackage.amzy.a((java.util.Collection) r3)
            java.util.Set r3 = c(r3)
            boolean r4 = r12.c
            if (r4 != 0) goto L_0x05a2
            goto L_0x05a8
        L_0x05a2:
            r12.c()
            r4 = 0
            r12.c = r4
        L_0x05a8:
            aucj r4 = r12.b
            avdf r4 = (defpackage.avdf) r4
            aucx r5 = defpackage.aucj.s()
            r4.g = r5
            java.util.Iterator r3 = r3.iterator()
        L_0x05b6:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x06ab
            java.lang.Object r4 = r3.next()
            wqx r4 = (defpackage.wqx) r4
            avds r5 = defpackage.avds.h
            aucd r5 = r5.o()
            avdr r5 = (defpackage.avdr) r5
            boolean r10 = r4.b()
            if (r10 == 0) goto L_0x05f3
            java.lang.String r10 = r4.a
            if (r10 == 0) goto L_0x05f3
            boolean r15 = r5.c
            if (r15 != 0) goto L_0x05d9
            goto L_0x05df
        L_0x05d9:
            r5.c()
            r15 = 0
            r5.c = r15
        L_0x05df:
            aucj r15 = r5.b
            avds r15 = (defpackage.avds) r15
            r10.getClass()
            r27 = r0
            int r0 = r15.a
            r17 = 1
            r0 = r0 | 1
            r15.a = r0
            r15.b = r10
            goto L_0x05f5
        L_0x05f3:
            r27 = r0
        L_0x05f5:
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x061b
            java.lang.String r0 = r4.b
            if (r0 == 0) goto L_0x061b
            boolean r10 = r5.c
            if (r10 != 0) goto L_0x0604
            goto L_0x060a
        L_0x0604:
            r5.c()
            r10 = 0
            r5.c = r10
        L_0x060a:
            aucj r10 = r5.b
            avds r10 = (defpackage.avds) r10
            r0.getClass()
            int r15 = r10.a
            r21 = 2
            r15 = r15 | 2
            r10.a = r15
            r10.c = r0
        L_0x061b:
            if (r2 == 0) goto L_0x069c
            java.lang.String r0 = r4.a
            java.lang.Object r0 = r2.get(r0)
            wrb r0 = (defpackage.wrb) r0
            if (r0 == 0) goto L_0x0697
            java.lang.Long r4 = r0.b
            r10 = r2
            r15 = r3
            long r2 = r4.longValue()
            boolean r4 = r5.c
            if (r4 != 0) goto L_0x0634
            goto L_0x063a
        L_0x0634:
            r5.c()
            r4 = 0
            r5.c = r4
        L_0x063a:
            aucj r4 = r5.b
            avds r4 = (defpackage.avds) r4
            r32 = r6
            int r6 = r4.a
            r19 = 4
            r6 = r6 | 4
            r4.a = r6
            r4.e = r2
            java.lang.Long r2 = r0.c
            long r2 = r2.longValue()
            boolean r4 = r5.c
            if (r4 != 0) goto L_0x0655
            goto L_0x065b
        L_0x0655:
            r5.c()
            r4 = 0
            r5.c = r4
        L_0x065b:
            aucj r4 = r5.b
            avds r4 = (defpackage.avds) r4
            int r6 = r4.a
            r6 = r6 | 8
            r4.a = r6
            r4.f = r2
            java.util.Set r2 = r0.a
            r5.a(r2)
            defpackage.xip.a()
            xfs r2 = defpackage.xgb.a
            java.lang.Object r2 = r2.a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x06a0
            boolean r0 = r0.d
            boolean r2 = r5.c
            if (r2 != 0) goto L_0x0684
            goto L_0x068a
        L_0x0684:
            r5.c()
            r2 = 0
            r5.c = r2
        L_0x068a:
            aucj r2 = r5.b
            avds r2 = (defpackage.avds) r2
            int r3 = r2.a
            r3 = r3 | 32
            r2.a = r3
            r2.g = r0
            goto L_0x06a0
        L_0x0697:
            r10 = r2
            r15 = r3
            r32 = r6
            goto L_0x06a0
        L_0x069c:
            r10 = r2
            r15 = r3
            r32 = r6
        L_0x06a0:
            r12.a((defpackage.avdr) r5)
            r2 = r10
            r3 = r15
            r0 = r27
            r6 = r32
            goto L_0x05b6
        L_0x06ab:
            r27 = r0
            r32 = r6
            r2 = r28
            java.lang.Object r0 = r2.get(r11)
            java.util.Map r0 = (java.util.Map) r0
            java.util.List r3 = r14.e
            amzy r3 = defpackage.amzy.a((java.util.Collection) r3)
            java.util.Set r3 = c(r3)
            boolean r4 = r12.c
            if (r4 != 0) goto L_0x06c6
            goto L_0x06cc
        L_0x06c6:
            r12.c()
            r4 = 0
            r12.c = r4
        L_0x06cc:
            aucj r4 = r12.b
            avdf r4 = (defpackage.avdf) r4
            aucx r5 = defpackage.aucj.s()
            r4.h = r5
            java.util.Iterator r3 = r3.iterator()
        L_0x06da:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0747
            java.lang.Object r4 = r3.next()
            wqx r4 = (defpackage.wqx) r4
            avdx r5 = defpackage.avdx.f
            aucd r5 = r5.o()
            avdw r5 = (defpackage.avdw) r5
            boolean r6 = r4.b()
            if (r6 == 0) goto L_0x0712
            java.lang.String r6 = r4.a
            if (r6 == 0) goto L_0x0712
            boolean r10 = r5.c
            if (r10 != 0) goto L_0x06fd
            goto L_0x0703
        L_0x06fd:
            r5.c()
            r10 = 0
            r5.c = r10
        L_0x0703:
            aucj r10 = r5.b
            avdx r10 = (defpackage.avdx) r10
            r6.getClass()
            int r14 = r10.a
            r15 = 1
            r14 = r14 | r15
            r10.a = r14
            r10.b = r6
        L_0x0712:
            boolean r6 = r4.a()
            if (r6 == 0) goto L_0x0736
            java.lang.String r6 = r4.b
            if (r6 == 0) goto L_0x0736
            boolean r10 = r5.c
            if (r10 != 0) goto L_0x0721
            goto L_0x0727
        L_0x0721:
            r5.c()
            r10 = 0
            r5.c = r10
        L_0x0727:
            aucj r10 = r5.b
            avdx r10 = (defpackage.avdx) r10
            r6.getClass()
            int r14 = r10.a
            r15 = 2
            r14 = r14 | r15
            r10.a = r14
            r10.c = r6
        L_0x0736:
            if (r0 == 0) goto L_0x0743
            java.lang.String r4 = r4.a
            java.lang.Object r4 = r0.get(r4)
            java.util.Set r4 = (java.util.Set) r4
            r5.a(r4)
        L_0x0743:
            r12.a((defpackage.avdw) r5)
            goto L_0x06da
        L_0x0747:
            java.lang.Object r0 = r8.get(r11)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x08e7
            defpackage.xip.a()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            boolean r4 = r12.c
            if (r4 != 0) goto L_0x075c
            goto L_0x0762
        L_0x075c:
            r12.c()
            r4 = 0
            r12.c = r4
        L_0x0762:
            aucj r4 = r12.b
            avdf r4 = (defpackage.avdf) r4
            aucx r5 = defpackage.aucj.s()
            r4.k = r5
            r4 = 0
        L_0x076d:
            int r5 = r0.size()
            if (r4 >= r5) goto L_0x08e7
            java.lang.Object r5 = r0.get(r4)
            wrd r5 = (defpackage.wrd) r5
            avdz r6 = defpackage.avdz.r
            aucd r6 = r6.o()
            java.lang.Long r10 = r5.a
            long r10 = r10.longValue()
            boolean r14 = r6.c
            if (r14 != 0) goto L_0x078a
            goto L_0x0790
        L_0x078a:
            r6.c()
            r14 = 0
            r6.c = r14
        L_0x0790:
            aucj r14 = r6.b
            avdz r14 = (defpackage.avdz) r14
            int r15 = r14.a
            r17 = 1
            r15 = r15 | 1
            r14.a = r15
            r14.b = r10
            java.lang.String r10 = r5.c
            if (r10 == 0) goto L_0x0821
            r10.getClass()
            r11 = r15 | 8
            r14.a = r11
            r14.c = r10
            aywy r10 = defpackage.aywy.a
            ayxk r10 = r10.a()
            boolean r10 = r10.u()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x081d
            aucj r10 = r6.b
            avdz r10 = (defpackage.avdz) r10
            java.lang.String r10 = r10.c
            java.lang.Object r10 = r3.get(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L_0x07ee
            boolean r10 = r10.booleanValue()
            boolean r11 = r6.c
            if (r11 != 0) goto L_0x07d6
            goto L_0x07dc
        L_0x07d6:
            r6.c()
            r11 = 0
            r6.c = r11
        L_0x07dc:
            aucj r11 = r6.b
            avdz r11 = (defpackage.avdz) r11
            int r14 = r11.a
            r15 = 32768(0x8000, float:4.5918E-41)
            r14 = r14 | r15
            r11.a = r14
            r11.m = r10
            r15 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0824
        L_0x07ee:
            android.content.Context r10 = r1.a
            aucj r11 = r6.b
            avdz r11 = (defpackage.avdz) r11
            java.lang.String r11 = r11.c
            boolean r10 = defpackage.aeku.a(r10, r11)
            boolean r11 = r6.c
            if (r11 != 0) goto L_0x07ff
            goto L_0x0805
        L_0x07ff:
            r6.c()
            r11 = 0
            r6.c = r11
        L_0x0805:
            aucj r11 = r6.b
            avdz r11 = (defpackage.avdz) r11
            int r14 = r11.a
            r15 = 32768(0x8000, float:4.5918E-41)
            r14 = r14 | r15
            r11.a = r14
            r11.m = r10
            java.lang.String r11 = r11.c
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r3.put(r11, r10)
            goto L_0x0824
        L_0x081d:
            r15 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0824
        L_0x0821:
            r15 = 32768(0x8000, float:4.5918E-41)
        L_0x0824:
            java.lang.String r10 = r5.d
            if (r10 == 0) goto L_0x0842
            boolean r11 = r6.c
            if (r11 != 0) goto L_0x082d
            goto L_0x0833
        L_0x082d:
            r6.c()
            r11 = 0
            r6.c = r11
        L_0x0833:
            aucj r11 = r6.b
            avdz r11 = (defpackage.avdz) r11
            r10.getClass()
            int r14 = r11.a
            r14 = r14 | 16
            r11.a = r14
            r11.d = r10
        L_0x0842:
            boolean r10 = android.text.TextUtils.isEmpty(r16)
            if (r10 != 0) goto L_0x084b
            java.lang.String r10 = r5.i
        L_0x084b:
            boolean r10 = r5.h
            if (r10 == 0) goto L_0x0867
            boolean r10 = r6.c
            if (r10 != 0) goto L_0x0854
            goto L_0x085a
        L_0x0854:
            r6.c()
            r10 = 0
            r6.c = r10
        L_0x085a:
            aucj r10 = r6.b
            avdz r10 = (defpackage.avdz) r10
            int r11 = r10.a
            r11 = r11 | 16384(0x4000, float:2.2959E-41)
            r10.a = r11
            r11 = 1
            r10.l = r11
        L_0x0867:
            java.lang.Long r10 = r5.f
            long r10 = r10.longValue()
            boolean r14 = r6.c
            if (r14 != 0) goto L_0x0872
            goto L_0x0878
        L_0x0872:
            r6.c()
            r14 = 0
            r6.c = r14
        L_0x0878:
            aucj r14 = r6.b
            avdz r14 = (defpackage.avdz) r14
            int r15 = r14.a
            r15 = r15 | 1024(0x400, float:1.435E-42)
            r14.a = r15
            r14.h = r10
            java.lang.Long r10 = r5.g
            long r10 = r10.longValue()
            long r10 = r10 / r24
            long r10 = r10 * r24
            boolean r14 = r6.c
            if (r14 != 0) goto L_0x0893
            goto L_0x0899
        L_0x0893:
            r6.c()
            r14 = 0
            r6.c = r14
        L_0x0899:
            aucj r14 = r6.b
            avdz r14 = (defpackage.avdz) r14
            int r15 = r14.a
            r15 = r15 | 2048(0x800, float:2.87E-42)
            r14.a = r15
            r14.i = r10
            int r10 = r5.j
            int r11 = r10 + -1
            if (r10 == 0) goto L_0x08e5
            r14.g = r11
            r10 = r15 | 512(0x200, float:7.175E-43)
            r14.a = r10
            java.lang.String r10 = r5.c
            java.lang.String r11 = "com.google"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x08de
            java.lang.String r10 = r5.e
            if (r10 != 0) goto L_0x08de
            java.lang.String r5 = r5.b
            if (r5 != 0) goto L_0x08c4
            goto L_0x08de
        L_0x08c4:
            boolean r10 = r6.c
            if (r10 != 0) goto L_0x08c9
            goto L_0x08cf
        L_0x08c9:
            r6.c()
            r10 = 0
            r6.c = r10
        L_0x08cf:
            aucj r10 = r6.b
            avdz r10 = (defpackage.avdz) r10
            r5.getClass()
            int r11 = r10.a
            r11 = r11 | 32
            r10.a = r11
            r10.e = r5
        L_0x08de:
            r12.a((defpackage.aucd) r6)
            int r4 = r4 + 1
            goto L_0x076d
        L_0x08e5:
            throw r16
        L_0x08e7:
            r10 = r20
            r10.a((defpackage.avdd) r12)
            int r13 = r13 + 1
            r28 = r2
            r12 = r9
            r2 = r22
            r3 = r26
            r0 = r27
            r4 = r30
            r6 = r32
            r11 = -1
            r9 = r42
            goto L_0x0399
        L_0x0900:
            android.content.Context r0 = r1.a
            java.lang.String[] r2 = defpackage.wrf.a
            android.net.Uri r2 = android.provider.ContactsContract.Contacts.CONTENT_URI
            java.lang.String[] r3 = defpackage.wrf.b
            int r2 = defpackage.wrf.a(r0, r2, r3)
            android.net.Uri r3 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            java.lang.String[] r4 = defpackage.wrf.a
            int r3 = defpackage.wrf.a(r0, r3, r4)
            defpackage.xip.a()
            avdq r4 = defpackage.avdq.A
            aucd r4 = r4.o()
            avdk r4 = (defpackage.avdk) r4
            java.lang.String r5 = android.os.Build.MODEL
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x0926
            goto L_0x092c
        L_0x0926:
            r4.c()
            r6 = 0
            r4.c = r6
        L_0x092c:
            aucj r6 = r4.b
            avdq r6 = (defpackage.avdq) r6
            r5.getClass()
            int r7 = r6.a
            r8 = 1
            r7 = r7 | r8
            r6.a = r7
            r6.b = r5
            java.lang.String r5 = android.os.Build.BRAND
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x0942
            goto L_0x0948
        L_0x0942:
            r4.c()
            r6 = 0
            r4.c = r6
        L_0x0948:
            aucj r6 = r4.b
            avdq r6 = (defpackage.avdq) r6
            r5.getClass()
            int r7 = r6.a
            r8 = 2
            r7 = r7 | r8
            r6.a = r7
            r6.c = r5
            java.lang.String r5 = android.os.Build.DEVICE
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x095e
            goto L_0x0964
        L_0x095e:
            r4.c()
            r6 = 0
            r4.c = r6
        L_0x0964:
            aucj r6 = r4.b
            avdq r6 = (defpackage.avdq) r6
            r5.getClass()
            int r7 = r6.a
            r8 = 4
            r7 = r7 | r8
            r6.a = r7
            r6.d = r5
            java.lang.String r5 = android.os.Build.DISPLAY
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x097a
            goto L_0x0980
        L_0x097a:
            r4.c()
            r6 = 0
            r4.c = r6
        L_0x0980:
            aucj r6 = r4.b
            avdq r6 = (defpackage.avdq) r6
            r5.getClass()
            int r7 = r6.a
            r7 = r7 | 8
            r6.a = r7
            r6.e = r5
            java.lang.String r5 = android.os.Build.MANUFACTURER
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x0996
            goto L_0x099c
        L_0x0996:
            r4.c()
            r6 = 0
            r4.c = r6
        L_0x099c:
            aucj r6 = r4.b
            avdq r6 = (defpackage.avdq) r6
            r5.getClass()
            int r7 = r6.a
            r7 = r7 | 16
            r6.a = r7
            r6.f = r5
            r5 = r7 | 512(0x200, float:7.175E-43)
            r6.a = r5
            long r7 = (long) r2
            r6.i = r7
            r2 = r5 | 1024(0x400, float:1.435E-42)
            r6.a = r2
            long r2 = (long) r3
            r6.j = r2
            defpackage.avdq.a(r6)
            long r2 = java.lang.System.currentTimeMillis()
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x09c5
            goto L_0x09cb
        L_0x09c5:
            r4.c()
            r5 = 0
            r4.c = r5
        L_0x09cb:
            aucj r5 = r4.b
            avdq r5 = (defpackage.avdq) r5
            int r6 = r5.a
            r6 = r6 | 2048(0x800, float:2.87E-42)
            r5.a = r6
            r5.k = r2
            aywy r2 = defpackage.aywy.a
            ayxk r2 = r2.a()
            boolean r2 = r2.t()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0a06
            double r2 = defpackage.wrf.a()
            boolean r5 = r4.c
            if (r5 == 0) goto L_0x09f9
            r4.c()
            r5 = 0
            r4.c = r5
        L_0x09f9:
            aucj r5 = r4.b
            avdq r5 = (defpackage.avdq) r5
            int r6 = r5.a
            r6 = r6 | 8192(0x2000, float:1.14794E-41)
            r5.a = r6
            r5.m = r2
            goto L_0x0a1f
        L_0x0a06:
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0a0b
            goto L_0x0a11
        L_0x0a0b:
            r4.c()
            r2 = 0
            r4.c = r2
        L_0x0a11:
            aucj r2 = r4.b
            avdq r2 = (defpackage.avdq) r2
            int r3 = r2.a
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
            r2.a = r3
            r5 = 4628574517030027264(0x403c000000000000, double:28.0)
            r2.m = r5
        L_0x0a1f:
            int r2 = android.os.Build.VERSION.SDK_INT
            boolean r3 = r4.c
            if (r3 != 0) goto L_0x0a26
            goto L_0x0a2c
        L_0x0a26:
            r4.c()
            r3 = 0
            r4.c = r3
        L_0x0a2c:
            aucj r3 = r4.b
            avdq r3 = (defpackage.avdq) r3
            int r5 = r3.a
            r6 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 | r6
            r3.a = r5
            r3.p = r2
            aywy r2 = defpackage.aywy.a
            ayxk r2 = r2.a()
            boolean r2 = r2.y()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0aa4
            xsd r2 = new xsd
            r2.<init>(r0)
            amri r0 = r2.a()
            boolean r2 = r0.a()
            if (r2 == 0) goto L_0x0a7a
            java.lang.Object r0 = r0.b()     // Catch:{ NumberFormatException -> 0x0a6f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x0a6f }
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0a6f }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0a6f }
            amri r0 = defpackage.amri.b(r0)
            goto L_0x0a7c
        L_0x0a6f:
            r0 = move-exception
            java.lang.String r2 = "DeviceUsageSettingsHelper"
            java.lang.String r3 = "Invalid Android Id"
            android.util.Log.e(r2, r3, r0)
            ampu r0 = defpackage.ampu.a
            goto L_0x0a7c
        L_0x0a7a:
            ampu r0 = defpackage.ampu.a
        L_0x0a7c:
            boolean r2 = r0.a()
            if (r2 == 0) goto L_0x0aa4
            java.lang.Object r0 = r0.b()
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r4.c
            if (r0 != 0) goto L_0x0a91
            goto L_0x0a97
        L_0x0a91:
            r4.c()
            r5 = 0
            r4.c = r5
        L_0x0a97:
            aucj r0 = r4.b
            avdq r0 = (defpackage.avdq) r0
            int r5 = r0.a
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            r5 = r5 | r6
            r0.a = r5
            r0.v = r2
        L_0x0aa4:
            aucj r0 = r4.i()
            avdq r0 = (defpackage.avdq) r0
            long r2 = r0.i
            boolean r4 = r10.c
            if (r4 != 0) goto L_0x0ab1
            goto L_0x0ab7
        L_0x0ab1:
            r10.c()
            r4 = 0
            r10.c = r4
        L_0x0ab7:
            aucj r4 = r10.b
            avdi r4 = (defpackage.avdi) r4
            int r5 = r4.a
            r5 = r5 | 8
            r4.a = r5
            r4.e = r2
            long r2 = r0.j
            r5 = r5 | 32
            r4.a = r5
            r4.g = r2
            r0.getClass()
            r4.f = r0
            r0 = r5 | 16
            r4.a = r0
            aucv r0 = defpackage.aucj.r()
            r4.d = r0
            r3 = r41
            r10.a((java.lang.Iterable) r3)
            r6 = r42
            boolean r0 = r6.d
            if (r0 == 0) goto L_0x0b35
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x0aea
            goto L_0x0af0
        L_0x0aea:
            r10.c()
            r2 = 0
            r10.c = r2
        L_0x0af0:
            aucj r0 = r10.b
            avdi r0 = (defpackage.avdi) r0
            defpackage.avdi.a(r0)
            aucj r0 = r10.i()
            avdi r0 = (defpackage.avdi) r0
            aucx r0 = r0.b
            int r2 = r0.size()
            r3 = 0
            r4 = 0
        L_0x0b05:
            if (r3 >= r2) goto L_0x0b35
            int r5 = r4 + 1
            java.lang.Object r6 = r0.get(r3)
            avdf r6 = (defpackage.avdf) r6
            r7 = 5
            java.lang.Object r8 = r6.c(r7)
            aucd r8 = (defpackage.aucd) r8
            r8.a((defpackage.aucj) r6)
            avdd r8 = (defpackage.avdd) r8
            boolean r6 = r8.c
            if (r6 != 0) goto L_0x0b21
            r9 = 0
            goto L_0x0b27
        L_0x0b21:
            r8.c()
            r9 = 0
            r8.c = r9
        L_0x0b27:
            aucj r6 = r8.b
            avdf r6 = (defpackage.avdf) r6
            defpackage.avdf.a(r6)
            r10.a(r4, r8)
            int r3 = r3 + 1
            r4 = r5
            goto L_0x0b05
        L_0x0b35:
            aucj r0 = r10.i()
            avdi r0 = (defpackage.avdi) r0
            return r0
        L_0x0b3c:
            r0 = move-exception
            r16 = r3
        L_0x0b3f:
            if (r16 == 0) goto L_0x0b44
            r16.close()
        L_0x0b44:
            throw r0
        L_0x0b45:
            r0 = move-exception
            r16 = r12
        L_0x0b48:
            if (r16 == 0) goto L_0x0b4d
            r16.close()
        L_0x0b4d:
            throw r0
        L_0x0b4e:
            r0 = move-exception
            r16 = r8
        L_0x0b51:
            if (r16 == 0) goto L_0x0b56
            r16.close()
        L_0x0b56:
            throw r0
        L_0x0b57:
            r6 = r3
            r9 = 0
            r3 = r41
            java.lang.Object r8 = r2.get(r7)
            wrn r8 = (defpackage.wrn) r8
            long r10 = r8.a
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r5.add(r8)
            int r7 = r7 + 1
            r3 = r6
            r6 = 0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wre.a(java.util.List, java.util.Set, wrg):avdi");
    }

    /* access modifiers changed from: package-private */
    public final boolean a(wrg wrg, avdi avdi, String str) {
        wrg wrg2 = wrg;
        avdi avdi2 = avdi;
        String str2 = str;
        aucx aucx = avdi2.b;
        int size = aucx.size();
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            boolean a = a(wrg2, ((avdf) aucx.get(i4)).k(), str2);
            if (!a) {
                i3++;
            } else {
                i2++;
            }
            z &= a;
        }
        aucv aucv = avdi2.d;
        int size2 = aucv.size();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < size2) {
            long longValue = ((Long) aucv.get(i5)).longValue();
            avdd avdd = (avdd) avdf.q.o();
            if (avdd.c) {
                avdd.c();
                avdd.c = false;
            }
            avdf avdf = (avdf) avdd.b;
            aucv aucv2 = aucv;
            avdf.a |= 1;
            avdf.b = longValue;
            avdf.b(avdf);
            boolean a2 = a(wrg2, ((avdf) avdd.i()).k(), str2);
            if (!a2) {
                i7++;
            } else {
                i6++;
            }
            z &= a2;
            i5++;
            aucv = aucv2;
        }
        wml a3 = wml.a();
        aucd o = xlb.n.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xlb xlb = (xlb) o.b;
        int i8 = xlb.a | 16;
        xlb.a = i8;
        xlb.f = i2;
        int i9 = i8 | 32;
        xlb.a = i9;
        xlb.g = i3;
        int i10 = i9 | 64;
        xlb.a = i10;
        xlb.h = i6;
        xlb.a = i10 | 128;
        xlb.i = i7;
        xlb xlb2 = (xlb) o.i();
        aucd o2 = xlc.m.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        xlc xlc = (xlc) o2.b;
        xlb2.getClass();
        xlc.l = xlb2;
        xlc.a |= 131072;
        a3.a((xlc) o2.i());
        avdq avdq = avdi2.f;
        if (avdq == null) {
            avdq = avdq.A;
        }
        return wqz.a(avdq.k(), str2, this.l) & z;
    }
}
