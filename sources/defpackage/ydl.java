package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.provider.ContactsContract;

/* renamed from: ydl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ydl {
    public static final String[] b = {"_id", "times_contacted", "last_time_contacted", "starred", "custom_ringtone", "send_to_voicemail"};
    public static final String[] c = {"_id", "times_contacted", "last_time_contacted", "starred", "custom_ringtone", "send_to_voicemail", "contact_last_updated_timestamp"};
    public static final String[] d = {"_id", "contact_id", "account_type", "account_name", "sourceid", "data_set", "times_contacted", "last_time_contacted", "display_name", "display_name_alt"};
    public static final String[] e = {"raw_contact_id", "data1", "data2", "data3"};
    static final String[] f = {"raw_contact_id", "data1", "data2", "data3", "data5", "data6", "is_primary", "is_super_primary"};
    public static final String[] g = {"raw_contact_id", "data1", "data2", "data3"};
    static final String[] h = {"raw_contact_id", "data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10"};
    public static final String[] i = {"raw_contact_id", "data1", "data2", "data3", "is_primary", "is_super_primary"};
    public static final String[] j = {"raw_contact_id", "data1"};
    public static final String[] k = {"raw_contact_id", "photo_uri"};
    public static final String[] l = {"raw_contact_id", "data1", "data2", "data5", "data3", "data10", "data4", "data6", "data7", "data8", "data9"};
    public static final String[] m = {"raw_contact_id", "data1", "data2", "data5", "data3", "data10", "data4", "data6", "data7", "data8", "data9", "data11"};
    public static final String[] n = {"raw_contact_id", "data1"};
    private static final String[] o = {"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used", "is_primary", "is_super_primary"};
    private static final String[] p = {"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used", "is_primary", "is_super_primary"};
    private static final String[] q = {"raw_contact_id", "data1", "data2", "data3"};
    public final Context a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = Build.VERSION.SDK_INT;
    }

    public ydl(Context context) {
        this.a = context;
    }

    public static final boolean a() {
        int i2 = Build.VERSION.SDK_INT;
        xip.a();
        return Boolean.valueOf(ayrg.a.a().c()).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
        if (r2 != null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0102, code lost:
        if (r2 != null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0104, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0107, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map b(java.util.HashSet r13) {
        /*
            r12 = this;
            java.lang.String r0 = "ReadContactsHelper"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            android.content.Context r2 = r12.a
            android.content.ContentResolver r3 = r2.getContentResolver()
            r2 = 0
            android.net.Uri r4 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00fa }
            java.lang.String[] r5 = o     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00fa }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00fa }
            if (r2 == 0) goto L_0x00f2
        L_0x001b:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00f0 }
            if (r3 == 0) goto L_0x00f7
            java.lang.String r3 = "raw_contact_id"
            int r3 = r2.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x00f0 }
            long r3 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x00f0 }
            boolean r4 = r13.contains(r3)     // Catch:{ SQLiteException -> 0x00f0 }
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "data1"
            int r4 = r2.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r5 = "data2"
            int r5 = r2.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x00f0 }
            int r5 = r2.getInt(r5)     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r6 = "data3"
            int r6 = r2.getColumnIndex(r6)     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r6 = r2.getString(r6)     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r7 = "is_primary"
            int r7 = r2.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x00f0 }
            int r7 = r2.getInt(r7)     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r8 = "is_super_primary"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ SQLiteException -> 0x00f0 }
            int r8 = r2.getInt(r8)     // Catch:{ SQLiteException -> 0x00f0 }
            boolean r9 = r1.containsKey(r3)     // Catch:{ SQLiteException -> 0x00f0 }
            if (r9 != 0) goto L_0x0075
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00f0 }
            r9.<init>()     // Catch:{ SQLiteException -> 0x00f0 }
            r1.put(r3, r9)     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x0075:
            java.lang.Object r3 = r1.get(r3)     // Catch:{ SQLiteException -> 0x00f0 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ SQLiteException -> 0x00f0 }
            aqxu r9 = defpackage.aqxu.h     // Catch:{ SQLiteException -> 0x00f0 }
            aucd r9 = r9.o()     // Catch:{ SQLiteException -> 0x00f0 }
            r10 = 0
            if (r4 == 0) goto L_0x0098
            boolean r11 = r9.c     // Catch:{ SQLiteException -> 0x00f0 }
            if (r11 != 0) goto L_0x0089
        L_0x0088:
            goto L_0x008f
        L_0x0089:
            r9.c()     // Catch:{ SQLiteException -> 0x00f0 }
            r9.c = r10     // Catch:{ SQLiteException -> 0x00f0 }
            goto L_0x0088
        L_0x008f:
            aucj r11 = r9.b     // Catch:{ SQLiteException -> 0x00f0 }
            aqxu r11 = (defpackage.aqxu) r11     // Catch:{ SQLiteException -> 0x00f0 }
            r4.getClass()     // Catch:{ SQLiteException -> 0x00f0 }
            r11.a = r4     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x0098:
            boolean r4 = r9.c     // Catch:{ SQLiteException -> 0x00f0 }
            if (r4 != 0) goto L_0x009d
            goto L_0x00a2
        L_0x009d:
            r9.c()     // Catch:{ SQLiteException -> 0x00f0 }
            r9.c = r10     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00a2:
            aucj r4 = r9.b     // Catch:{ SQLiteException -> 0x00f0 }
            aqxu r4 = (defpackage.aqxu) r4     // Catch:{ SQLiteException -> 0x00f0 }
            r4.e = r5     // Catch:{ SQLiteException -> 0x00f0 }
            if (r6 != 0) goto L_0x00ab
            goto L_0x00b0
        L_0x00ab:
            r6.getClass()     // Catch:{ SQLiteException -> 0x00f0 }
            r4.b = r6     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00b0:
            java.lang.String r4 = "times_used"
            int r4 = r2.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x00f0 }
            int r4 = r2.getInt(r4)     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r5 = "last_time_used"
            int r5 = r2.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x00f0 }
            long r5 = r2.getLong(r5)     // Catch:{ SQLiteException -> 0x00f0 }
            boolean r11 = r9.c     // Catch:{ SQLiteException -> 0x00f0 }
            if (r11 != 0) goto L_0x00c9
            goto L_0x00ce
        L_0x00c9:
            r9.c()     // Catch:{ SQLiteException -> 0x00f0 }
            r9.c = r10     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00ce:
            aucj r11 = r9.b     // Catch:{ SQLiteException -> 0x00f0 }
            aqxu r11 = (defpackage.aqxu) r11     // Catch:{ SQLiteException -> 0x00f0 }
            r11.c = r4     // Catch:{ SQLiteException -> 0x00f0 }
            r11.d = r5     // Catch:{ SQLiteException -> 0x00f0 }
            r4 = 1
            if (r7 != r4) goto L_0x00db
            r5 = 1
            goto L_0x00dc
        L_0x00db:
            r5 = 0
        L_0x00dc:
            r11.f = r5     // Catch:{ SQLiteException -> 0x00f0 }
            if (r8 != r4) goto L_0x00e2
            r10 = 1
            goto L_0x00e3
        L_0x00e2:
        L_0x00e3:
            r11.g = r10     // Catch:{ SQLiteException -> 0x00f0 }
            aucj r4 = r9.i()     // Catch:{ SQLiteException -> 0x00f0 }
            aqxu r4 = (defpackage.aqxu) r4     // Catch:{ SQLiteException -> 0x00f0 }
            r3.add(r4)     // Catch:{ SQLiteException -> 0x00f0 }
            goto L_0x001b
        L_0x00f0:
            r13 = move-exception
            goto L_0x00fd
        L_0x00f2:
            java.lang.String r13 = "Could not query ContactsProvider to fetch Phone info; disabled? Give up."
            android.util.Log.w(r0, r13)     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00f7:
            if (r2 == 0) goto L_0x0107
            goto L_0x0104
        L_0x00fa:
            r13 = move-exception
            goto L_0x0109
        L_0x00fc:
            r13 = move-exception
        L_0x00fd:
            java.lang.String r3 = "ContentResolver.query threw an exception when fetching phone info"
            android.util.Log.e(r0, r3, r13)     // Catch:{ all -> 0x0108 }
            if (r2 == 0) goto L_0x0107
        L_0x0104:
            r2.close()
        L_0x0107:
            return r1
        L_0x0108:
            r13 = move-exception
        L_0x0109:
            if (r2 == 0) goto L_0x010e
            r2.close()
        L_0x010e:
            goto L_0x0110
        L_0x010f:
            throw r13
        L_0x0110:
            goto L_0x010f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydl.b(java.util.HashSet):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        if (r2 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e6, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f2, code lost:
        if (r2 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f5, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map c(java.util.HashSet r15) {
        /*
            r14 = this;
            java.lang.String r0 = "ReadContactsHelper"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            java.lang.String r3 = "vnd.android.cursor.item/im"
            java.lang.String[] r4 = f     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00ea }
            android.database.Cursor r2 = r14.a(r3, r4)     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00ea }
            if (r2 == 0) goto L_0x00df
        L_0x0012:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00dd }
            if (r3 == 0) goto L_0x00e4
            java.lang.String r3 = "raw_contact_id"
            int r3 = r2.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x00dd }
            long r3 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x00dd }
            boolean r4 = r15.contains(r3)     // Catch:{ SQLiteException -> 0x00dd }
            if (r4 == 0) goto L_0x0012
            java.lang.String r4 = "data1"
            int r4 = r2.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.String r5 = "data2"
            int r5 = r2.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x00dd }
            int r5 = r2.getInt(r5)     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.String r6 = "data3"
            int r6 = r2.getColumnIndex(r6)     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.String r6 = r2.getString(r6)     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.String r7 = "data5"
            int r7 = r2.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x00dd }
            int r7 = r2.getInt(r7)     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.String r8 = "data6"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.String r8 = r2.getString(r8)     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.String r9 = "is_primary"
            int r9 = r2.getColumnIndex(r9)     // Catch:{ SQLiteException -> 0x00dd }
            int r9 = r2.getInt(r9)     // Catch:{ SQLiteException -> 0x00dd }
            java.lang.String r10 = "is_super_primary"
            int r10 = r2.getColumnIndex(r10)     // Catch:{ SQLiteException -> 0x00dd }
            int r10 = r2.getInt(r10)     // Catch:{ SQLiteException -> 0x00dd }
            boolean r11 = r1.containsKey(r3)     // Catch:{ SQLiteException -> 0x00dd }
            if (r11 != 0) goto L_0x0080
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00dd }
            r11.<init>()     // Catch:{ SQLiteException -> 0x00dd }
            r1.put(r3, r11)     // Catch:{ SQLiteException -> 0x00dd }
        L_0x0080:
            java.lang.Object r3 = r1.get(r3)     // Catch:{ SQLiteException -> 0x00dd }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ SQLiteException -> 0x00dd }
            aqxy r11 = defpackage.aqxy.h     // Catch:{ SQLiteException -> 0x00dd }
            aucd r11 = r11.o()     // Catch:{ SQLiteException -> 0x00dd }
            r12 = 0
            if (r4 == 0) goto L_0x00a3
            boolean r13 = r11.c     // Catch:{ SQLiteException -> 0x00dd }
            if (r13 != 0) goto L_0x0094
        L_0x0093:
            goto L_0x009a
        L_0x0094:
            r11.c()     // Catch:{ SQLiteException -> 0x00dd }
            r11.c = r12     // Catch:{ SQLiteException -> 0x00dd }
            goto L_0x0093
        L_0x009a:
            aucj r13 = r11.b     // Catch:{ SQLiteException -> 0x00dd }
            aqxy r13 = (defpackage.aqxy) r13     // Catch:{ SQLiteException -> 0x00dd }
            r4.getClass()     // Catch:{ SQLiteException -> 0x00dd }
            r13.a = r4     // Catch:{ SQLiteException -> 0x00dd }
        L_0x00a3:
            boolean r4 = r11.c     // Catch:{ SQLiteException -> 0x00dd }
            if (r4 != 0) goto L_0x00a8
            goto L_0x00ad
        L_0x00a8:
            r11.c()     // Catch:{ SQLiteException -> 0x00dd }
            r11.c = r12     // Catch:{ SQLiteException -> 0x00dd }
        L_0x00ad:
            aucj r4 = r11.b     // Catch:{ SQLiteException -> 0x00dd }
            aqxy r4 = (defpackage.aqxy) r4     // Catch:{ SQLiteException -> 0x00dd }
            r4.b = r5     // Catch:{ SQLiteException -> 0x00dd }
            if (r6 == 0) goto L_0x00ba
            r6.getClass()     // Catch:{ SQLiteException -> 0x00dd }
            r4.c = r6     // Catch:{ SQLiteException -> 0x00dd }
        L_0x00ba:
            r4.d = r7     // Catch:{ SQLiteException -> 0x00dd }
            if (r8 == 0) goto L_0x00c3
            r8.getClass()     // Catch:{ SQLiteException -> 0x00dd }
            r4.e = r8     // Catch:{ SQLiteException -> 0x00dd }
        L_0x00c3:
            r5 = 1
            if (r9 != r5) goto L_0x00c8
            r6 = 1
            goto L_0x00c9
        L_0x00c8:
            r6 = 0
        L_0x00c9:
            r4.f = r6     // Catch:{ SQLiteException -> 0x00dd }
            if (r10 != r5) goto L_0x00cf
            r12 = 1
            goto L_0x00d0
        L_0x00cf:
        L_0x00d0:
            r4.g = r12     // Catch:{ SQLiteException -> 0x00dd }
            aucj r4 = r11.i()     // Catch:{ SQLiteException -> 0x00dd }
            aqxy r4 = (defpackage.aqxy) r4     // Catch:{ SQLiteException -> 0x00dd }
            r3.add(r4)     // Catch:{ SQLiteException -> 0x00dd }
            goto L_0x0012
        L_0x00dd:
            r15 = move-exception
            goto L_0x00ed
        L_0x00df:
            java.lang.String r15 = "Could not query ContactsProvider to fetch im info; disabled? Give up."
            android.util.Log.w(r0, r15)     // Catch:{ SQLiteException -> 0x00dd }
        L_0x00e4:
            if (r2 == 0) goto L_0x00f5
        L_0x00e6:
            r2.close()
            goto L_0x00f5
        L_0x00ea:
            r15 = move-exception
            goto L_0x00f7
        L_0x00ec:
            r15 = move-exception
        L_0x00ed:
            java.lang.String r3 = "ContentResolver.query threw an exception when fetching im info"
            android.util.Log.e(r0, r3, r15)     // Catch:{ all -> 0x00f6 }
            if (r2 == 0) goto L_0x00f5
            goto L_0x00e6
        L_0x00f5:
            return r1
        L_0x00f6:
            r15 = move-exception
        L_0x00f7:
            if (r2 == 0) goto L_0x00fc
            r2.close()
        L_0x00fc:
            goto L_0x00fe
        L_0x00fd:
            throw r15
        L_0x00fe:
            goto L_0x00fd
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydl.c(java.util.HashSet):java.util.Map");
    }

    public final Cursor a(String str, String[] strArr) {
        ContentResolver contentResolver = this.a.getContentResolver();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append("mimetype = '");
        sb.append(str);
        sb.append('\'');
        return contentResolver.query(ContactsContract.Data.CONTENT_URI, strArr, sb.toString(), (String[]) null, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
        if (r2 != null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0102, code lost:
        if (r2 != null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0104, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0107, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map a(java.util.HashSet r14) {
        /*
            r13 = this;
            java.lang.String r0 = "ReadContactsHelper"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            android.content.Context r2 = r13.a
            android.content.ContentResolver r3 = r2.getContentResolver()
            r2 = 0
            android.net.Uri r4 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00fa }
            java.lang.String[] r5 = p     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00fa }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00fa }
            if (r2 == 0) goto L_0x00f2
        L_0x001b:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00f0 }
            if (r3 == 0) goto L_0x00f7
            java.lang.String r3 = "raw_contact_id"
            int r3 = r2.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x00f0 }
            long r3 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x00f0 }
            boolean r4 = r14.contains(r3)     // Catch:{ SQLiteException -> 0x00f0 }
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "data1"
            int r4 = r2.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r5 = "data2"
            int r5 = r2.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x00f0 }
            int r5 = r2.getInt(r5)     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r6 = "data3"
            int r6 = r2.getColumnIndex(r6)     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r6 = r2.getString(r6)     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r7 = "is_primary"
            int r7 = r2.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x00f0 }
            int r7 = r2.getInt(r7)     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r8 = "is_super_primary"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ SQLiteException -> 0x00f0 }
            int r8 = r2.getInt(r8)     // Catch:{ SQLiteException -> 0x00f0 }
            boolean r9 = r1.containsKey(r3)     // Catch:{ SQLiteException -> 0x00f0 }
            if (r9 != 0) goto L_0x0075
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00f0 }
            r9.<init>()     // Catch:{ SQLiteException -> 0x00f0 }
            r1.put(r3, r9)     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x0075:
            java.lang.Object r3 = r1.get(r3)     // Catch:{ SQLiteException -> 0x00f0 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ SQLiteException -> 0x00f0 }
            aqxs r9 = defpackage.aqxs.h     // Catch:{ SQLiteException -> 0x00f0 }
            aucd r9 = r9.o()     // Catch:{ SQLiteException -> 0x00f0 }
            r10 = 0
            if (r4 == 0) goto L_0x0098
            boolean r11 = r9.c     // Catch:{ SQLiteException -> 0x00f0 }
            if (r11 != 0) goto L_0x0089
        L_0x0088:
            goto L_0x008f
        L_0x0089:
            r9.c()     // Catch:{ SQLiteException -> 0x00f0 }
            r9.c = r10     // Catch:{ SQLiteException -> 0x00f0 }
            goto L_0x0088
        L_0x008f:
            aucj r11 = r9.b     // Catch:{ SQLiteException -> 0x00f0 }
            aqxs r11 = (defpackage.aqxs) r11     // Catch:{ SQLiteException -> 0x00f0 }
            r4.getClass()     // Catch:{ SQLiteException -> 0x00f0 }
            r11.a = r4     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x0098:
            boolean r4 = r9.c     // Catch:{ SQLiteException -> 0x00f0 }
            if (r4 != 0) goto L_0x009d
            goto L_0x00a2
        L_0x009d:
            r9.c()     // Catch:{ SQLiteException -> 0x00f0 }
            r9.c = r10     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00a2:
            aucj r4 = r9.b     // Catch:{ SQLiteException -> 0x00f0 }
            aqxs r4 = (defpackage.aqxs) r4     // Catch:{ SQLiteException -> 0x00f0 }
            r4.e = r5     // Catch:{ SQLiteException -> 0x00f0 }
            if (r6 != 0) goto L_0x00ab
            goto L_0x00b0
        L_0x00ab:
            r6.getClass()     // Catch:{ SQLiteException -> 0x00f0 }
            r4.b = r6     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00b0:
            java.lang.String r4 = "times_used"
            int r4 = r2.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x00f0 }
            long r4 = r2.getLong(r4)     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r6 = "last_time_used"
            int r6 = r2.getColumnIndex(r6)     // Catch:{ SQLiteException -> 0x00f0 }
            long r11 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x00f0 }
            boolean r6 = r9.c     // Catch:{ SQLiteException -> 0x00f0 }
            if (r6 != 0) goto L_0x00c9
            goto L_0x00ce
        L_0x00c9:
            r9.c()     // Catch:{ SQLiteException -> 0x00f0 }
            r9.c = r10     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00ce:
            aucj r6 = r9.b     // Catch:{ SQLiteException -> 0x00f0 }
            aqxs r6 = (defpackage.aqxs) r6     // Catch:{ SQLiteException -> 0x00f0 }
            r6.c = r4     // Catch:{ SQLiteException -> 0x00f0 }
            r6.d = r11     // Catch:{ SQLiteException -> 0x00f0 }
            r4 = 1
            if (r7 != r4) goto L_0x00db
            r5 = 1
            goto L_0x00dc
        L_0x00db:
            r5 = 0
        L_0x00dc:
            r6.f = r5     // Catch:{ SQLiteException -> 0x00f0 }
            if (r8 != r4) goto L_0x00e2
            r10 = 1
            goto L_0x00e3
        L_0x00e2:
        L_0x00e3:
            r6.g = r10     // Catch:{ SQLiteException -> 0x00f0 }
            aucj r4 = r9.i()     // Catch:{ SQLiteException -> 0x00f0 }
            aqxs r4 = (defpackage.aqxs) r4     // Catch:{ SQLiteException -> 0x00f0 }
            r3.add(r4)     // Catch:{ SQLiteException -> 0x00f0 }
            goto L_0x001b
        L_0x00f0:
            r14 = move-exception
            goto L_0x00fd
        L_0x00f2:
            java.lang.String r14 = "Could not query ContactsProvider to fetch Email info; disabled? Give up."
            android.util.Log.w(r0, r14)     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00f7:
            if (r2 == 0) goto L_0x0107
            goto L_0x0104
        L_0x00fa:
            r14 = move-exception
            goto L_0x0109
        L_0x00fc:
            r14 = move-exception
        L_0x00fd:
            java.lang.String r3 = "ContentResolver.query threw an exception when fetching email info"
            android.util.Log.e(r0, r3, r14)     // Catch:{ all -> 0x0108 }
            if (r2 == 0) goto L_0x0107
        L_0x0104:
            r2.close()
        L_0x0107:
            return r1
        L_0x0108:
            r14 = move-exception
        L_0x0109:
            if (r2 == 0) goto L_0x010e
            r2.close()
        L_0x010e:
            goto L_0x0110
        L_0x010f:
            throw r14
        L_0x0110:
            goto L_0x010f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydl.a(java.util.HashSet):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.Map r10) {
        /*
            r9 = this;
            java.lang.String r0 = "ReadContactsHelper"
            r1 = 0
            java.lang.String r2 = "vnd.android.cursor.item/nickname"
            java.lang.String[] r3 = q     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009f }
            android.database.Cursor r1 = r9.a(r2, r3)     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009f }
            if (r1 == 0) goto L_0x0094
        L_0x000d:
            boolean r2 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0092 }
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = "raw_contact_id"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x0092 }
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x0092 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ SQLiteException -> 0x0092 }
            boolean r3 = r10.containsKey(r2)     // Catch:{ SQLiteException -> 0x0092 }
            if (r3 == 0) goto L_0x000d
            java.lang.String r3 = "data1"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x0092 }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ SQLiteException -> 0x0092 }
            java.lang.String r4 = "data2"
            int r4 = r1.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x0092 }
            int r4 = r1.getInt(r4)     // Catch:{ SQLiteException -> 0x0092 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x0092 }
            java.lang.String r5 = "data3"
            int r5 = r1.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x0092 }
            java.lang.String r5 = r1.getString(r5)     // Catch:{ SQLiteException -> 0x0092 }
            aqxz r6 = defpackage.aqxz.d     // Catch:{ SQLiteException -> 0x0092 }
            aucd r6 = r6.o()     // Catch:{ SQLiteException -> 0x0092 }
            r7 = 0
            if (r3 == 0) goto L_0x0066
            boolean r8 = r6.c     // Catch:{ SQLiteException -> 0x0092 }
            if (r8 != 0) goto L_0x0057
        L_0x0056:
            goto L_0x005d
        L_0x0057:
            r6.c()     // Catch:{ SQLiteException -> 0x0092 }
            r6.c = r7     // Catch:{ SQLiteException -> 0x0092 }
            goto L_0x0056
        L_0x005d:
            aucj r8 = r6.b     // Catch:{ SQLiteException -> 0x0092 }
            aqxz r8 = (defpackage.aqxz) r8     // Catch:{ SQLiteException -> 0x0092 }
            r3.getClass()     // Catch:{ SQLiteException -> 0x0092 }
            r8.a = r3     // Catch:{ SQLiteException -> 0x0092 }
        L_0x0066:
            int r3 = r4.intValue()     // Catch:{ SQLiteException -> 0x0092 }
            boolean r4 = r6.c     // Catch:{ SQLiteException -> 0x0092 }
            if (r4 != 0) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            r6.c()     // Catch:{ SQLiteException -> 0x0092 }
            r6.c = r7     // Catch:{ SQLiteException -> 0x0092 }
        L_0x0074:
            aucj r4 = r6.b     // Catch:{ SQLiteException -> 0x0092 }
            aqxz r4 = (defpackage.aqxz) r4     // Catch:{ SQLiteException -> 0x0092 }
            r4.c = r3     // Catch:{ SQLiteException -> 0x0092 }
            if (r5 != 0) goto L_0x007d
            goto L_0x0082
        L_0x007d:
            r5.getClass()     // Catch:{ SQLiteException -> 0x0092 }
            r4.b = r5     // Catch:{ SQLiteException -> 0x0092 }
        L_0x0082:
            java.lang.Object r2 = r10.get(r2)     // Catch:{ SQLiteException -> 0x0092 }
            ydk r2 = (defpackage.ydk) r2     // Catch:{ SQLiteException -> 0x0092 }
            aucj r3 = r6.i()     // Catch:{ SQLiteException -> 0x0092 }
            aqxz r3 = (defpackage.aqxz) r3     // Catch:{ SQLiteException -> 0x0092 }
            r2.i = r3     // Catch:{ SQLiteException -> 0x0092 }
            goto L_0x000d
        L_0x0092:
            r10 = move-exception
            goto L_0x00a2
        L_0x0094:
            java.lang.String r10 = "Could not query ContactsProvider to fetch Nickname info; disabled? Give up."
            android.util.Log.w(r0, r10)     // Catch:{ SQLiteException -> 0x0092 }
        L_0x0099:
            if (r1 == 0) goto L_0x00aa
        L_0x009b:
            r1.close()
            return
        L_0x009f:
            r10 = move-exception
            goto L_0x00ac
        L_0x00a1:
            r10 = move-exception
        L_0x00a2:
            java.lang.String r2 = "ContentResolver.query threw an exception when fetching note info"
            android.util.Log.e(r0, r2, r10)     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x00aa
            goto L_0x009b
        L_0x00aa:
            return
        L_0x00ab:
            r10 = move-exception
        L_0x00ac:
            if (r1 == 0) goto L_0x00b1
            r1.close()
        L_0x00b1:
            goto L_0x00b3
        L_0x00b2:
            throw r10
        L_0x00b3:
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydl.b(java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Map r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "ReadContactsHelper"
            r2 = 0
            java.lang.String r3 = "vnd.android.cursor.item/organization"
            java.lang.String[] r4 = h     // Catch:{ SQLiteException -> 0x011b, all -> 0x0119 }
            r5 = r16
            android.database.Cursor r2 = r5.a(r3, r4)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0119 }
            if (r2 == 0) goto L_0x010e
        L_0x0011:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x010c }
            if (r3 == 0) goto L_0x0113
            java.lang.String r3 = "raw_contact_id"
            int r3 = r2.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x010c }
            long r3 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x010c }
            boolean r4 = r0.containsKey(r3)     // Catch:{ SQLiteException -> 0x010c }
            if (r4 == 0) goto L_0x0108
            java.lang.String r4 = "data1"
            int r4 = r2.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r6 = "data2"
            int r6 = r2.getColumnIndex(r6)     // Catch:{ SQLiteException -> 0x010c }
            int r6 = r2.getInt(r6)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r7 = "data3"
            int r7 = r2.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r7 = r2.getString(r7)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r8 = "data4"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r8 = r2.getString(r8)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r9 = "data5"
            int r9 = r2.getColumnIndex(r9)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r9 = r2.getString(r9)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r10 = "data6"
            int r10 = r2.getColumnIndex(r10)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r10 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r11 = "data7"
            int r11 = r2.getColumnIndex(r11)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r11 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r12 = "data8"
            int r12 = r2.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r12 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r13 = "data9"
            int r13 = r2.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r13 = r2.getString(r13)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r14 = "data10"
            int r14 = r2.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r14 = r2.getString(r14)     // Catch:{ SQLiteException -> 0x010c }
            aqya r15 = defpackage.aqya.k     // Catch:{ SQLiteException -> 0x010c }
            aucd r15 = r15.o()     // Catch:{ SQLiteException -> 0x010c }
            if (r4 == 0) goto L_0x00ac
            boolean r5 = r15.c     // Catch:{ SQLiteException -> 0x010c }
            if (r5 != 0) goto L_0x009c
        L_0x009b:
            goto L_0x00a3
        L_0x009c:
            r15.c()     // Catch:{ SQLiteException -> 0x010c }
            r5 = 0
            r15.c = r5     // Catch:{ SQLiteException -> 0x010c }
            goto L_0x009b
        L_0x00a3:
            aucj r5 = r15.b     // Catch:{ SQLiteException -> 0x010c }
            aqya r5 = (defpackage.aqya) r5     // Catch:{ SQLiteException -> 0x010c }
            r4.getClass()     // Catch:{ SQLiteException -> 0x010c }
            r5.a = r4     // Catch:{ SQLiteException -> 0x010c }
        L_0x00ac:
            boolean r4 = r15.c     // Catch:{ SQLiteException -> 0x010c }
            if (r4 != 0) goto L_0x00b1
            goto L_0x00b7
        L_0x00b1:
            r15.c()     // Catch:{ SQLiteException -> 0x010c }
            r4 = 0
            r15.c = r4     // Catch:{ SQLiteException -> 0x010c }
        L_0x00b7:
            aucj r4 = r15.b     // Catch:{ SQLiteException -> 0x010c }
            aqya r4 = (defpackage.aqya) r4     // Catch:{ SQLiteException -> 0x010c }
            r4.b = r6     // Catch:{ SQLiteException -> 0x010c }
            if (r7 == 0) goto L_0x00c4
            r7.getClass()     // Catch:{ SQLiteException -> 0x010c }
            r4.c = r7     // Catch:{ SQLiteException -> 0x010c }
        L_0x00c4:
            if (r8 == 0) goto L_0x00cb
            r8.getClass()     // Catch:{ SQLiteException -> 0x010c }
            r4.d = r8     // Catch:{ SQLiteException -> 0x010c }
        L_0x00cb:
            if (r9 == 0) goto L_0x00d2
            r9.getClass()     // Catch:{ SQLiteException -> 0x010c }
            r4.e = r9     // Catch:{ SQLiteException -> 0x010c }
        L_0x00d2:
            if (r10 == 0) goto L_0x00d9
            r10.getClass()     // Catch:{ SQLiteException -> 0x010c }
            r4.f = r10     // Catch:{ SQLiteException -> 0x010c }
        L_0x00d9:
            if (r11 == 0) goto L_0x00e0
            r11.getClass()     // Catch:{ SQLiteException -> 0x010c }
            r4.g = r11     // Catch:{ SQLiteException -> 0x010c }
        L_0x00e0:
            if (r12 == 0) goto L_0x00e7
            r12.getClass()     // Catch:{ SQLiteException -> 0x010c }
            r4.h = r12     // Catch:{ SQLiteException -> 0x010c }
        L_0x00e7:
            if (r13 == 0) goto L_0x00ee
            r13.getClass()     // Catch:{ SQLiteException -> 0x010c }
            r4.i = r13     // Catch:{ SQLiteException -> 0x010c }
        L_0x00ee:
            if (r14 != 0) goto L_0x00f1
            goto L_0x00f6
        L_0x00f1:
            r14.getClass()     // Catch:{ SQLiteException -> 0x010c }
            r4.j = r14     // Catch:{ SQLiteException -> 0x010c }
        L_0x00f6:
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x010c }
            ydk r3 = (defpackage.ydk) r3     // Catch:{ SQLiteException -> 0x010c }
            aucj r4 = r15.i()     // Catch:{ SQLiteException -> 0x010c }
            aqya r4 = (defpackage.aqya) r4     // Catch:{ SQLiteException -> 0x010c }
            r3.j = r4     // Catch:{ SQLiteException -> 0x010c }
            r5 = r16
            goto L_0x0011
        L_0x0108:
            r5 = r16
            goto L_0x0011
        L_0x010c:
            r0 = move-exception
            goto L_0x011c
        L_0x010e:
            java.lang.String r0 = "Could not query CP2 to fetch Organization info; disabled? Give up."
            android.util.Log.w(r1, r0)     // Catch:{ SQLiteException -> 0x010c }
        L_0x0113:
            if (r2 == 0) goto L_0x0124
        L_0x0115:
            r2.close()
            return
        L_0x0119:
            r0 = move-exception
            goto L_0x0126
        L_0x011b:
            r0 = move-exception
        L_0x011c:
            java.lang.String r3 = "ContentResolver.query threw an exception when fetching organization info"
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x0125 }
            if (r2 == 0) goto L_0x0124
            goto L_0x0115
        L_0x0124:
            return
        L_0x0125:
            r0 = move-exception
        L_0x0126:
            if (r2 == 0) goto L_0x012b
            r2.close()
        L_0x012b:
            goto L_0x012d
        L_0x012c:
            throw r0
        L_0x012d:
            goto L_0x012c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydl.a(java.util.Map):void");
    }
}
