package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.provider.ContactsContract;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: zsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zsz {
    private static final String[] A = {"raw_contact_id", "data1", "data2", "data3"};
    private static final String[] B = {"raw_contact_id", "data1"};
    private static final String[] C = {"contact_id", "contact_deleted_timestamp"};
    private static final String[] D = {"contact_id", "display_name"};
    private static final String[] E = {"contact_id", "display_name", "lookup"};
    private static final String[] F = {"_id", "data_set", "title", "notes", "system_id", "group_visible", "deleted", "should_sync", "account_name", "account_type", "dirty", "sourceid"};
    private static final String[] G = {"raw_contact_id", "data1"};
    public static final Integer a = 0;
    public static final boolean b = true;
    public static Set c;
    public static final byte[] d = new byte[0];
    static final String[] h = {"_id", "times_contacted", "last_time_contacted", "starred"};
    static final String[] i = {"_id", "contact_id", "account_type", "account_name", "sourceid", "data_set", "times_contacted", "last_time_contacted", "starred"};
    static final String[] j = {"raw_contact_id", "data1", "data2", "data3"};
    static final String[] k = {"raw_contact_id", "data1", "data2", "data3", "data5", "data6"};
    static final String[] l = {"raw_contact_id", "data1", "data2", "data3"};
    static final String[] m = {"raw_contact_id", "data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10"};
    static final String[] n = {"raw_contact_id", "data1", "data2", "data5", "data3", "data10", "data4", "data6", "data7", "data8", "data9"};
    static final String[] o = {"raw_contact_id", "data1", "data2", "data5", "data3", "data10", "data4", "data6", "data7", "data8", "data9", "data11"};
    private static final boolean p = true;
    private static final String[] q = {"raw_contact_id", "data1", "data2", "data3"};
    private static final String[] r = {"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used"};
    private static final String[] s = {"raw_contact_id", "data1", "data2", "data3", "is_super_primary"};
    private static final String[] t = {"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used", "is_super_primary"};
    private static final String[] u = {"raw_contact_id", "data1", "data2", "data3"};
    private static final String[] v = {"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used"};
    private static final String[] w = {"raw_contact_id", "data1", "data2", "data3", "is_super_primary"};
    private static final String[] x = {"raw_contact_id", "data1", "data2", "data3", "last_time_used", "times_used", "is_super_primary"};
    private static final String[] y = {"raw_contact_id", "data1", "data2", "data3"};
    private static final String[] z = {"raw_contact_id", "data1"};
    public final Context e;
    public long f = 0;
    public final zsg g;

    static {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
    }

    public zsz(Context context) {
        this.e = context;
        this.g = zsg.a("ReadContactsHelper");
    }

    private final Cursor a(String str, String[] strArr) {
        ContentResolver contentResolver = this.e.getContentResolver();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append("mimetype = '");
        sb.append(str);
        sb.append('\'');
        return contentResolver.query(ContactsContract.Data.CONTENT_URI, strArr, sb.toString(), (String[]) null, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
        if (r1 != null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cf, code lost:
        if (r1 != null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d1, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d4, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map b(java.util.HashSet r12) {
        /*
            r11 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.lang.String r2 = "vnd.android.cursor.item/im"
            java.lang.String[] r3 = k     // Catch:{ SQLiteException -> 0x00c7, all -> 0x00c5 }
            android.database.Cursor r1 = r11.a((java.lang.String) r2, (java.lang.String[]) r3)     // Catch:{ SQLiteException -> 0x00c7, all -> 0x00c5 }
            if (r1 == 0) goto L_0x00bb
        L_0x0010:
            boolean r2 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x00b9 }
            if (r2 == 0) goto L_0x00c2
            java.lang.String r2 = "raw_contact_id"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x00b9 }
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x00b9 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ SQLiteException -> 0x00b9 }
            boolean r3 = r12.contains(r2)     // Catch:{ SQLiteException -> 0x00b9 }
            if (r3 == 0) goto L_0x0010
            java.lang.String r3 = "data1"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x00b9 }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ SQLiteException -> 0x00b9 }
            java.lang.String r4 = "data2"
            int r4 = r1.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x00b9 }
            int r4 = r1.getInt(r4)     // Catch:{ SQLiteException -> 0x00b9 }
            java.lang.String r5 = "data3"
            int r5 = r1.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x00b9 }
            java.lang.String r5 = r1.getString(r5)     // Catch:{ SQLiteException -> 0x00b9 }
            java.lang.String r6 = "data5"
            int r6 = r1.getColumnIndex(r6)     // Catch:{ SQLiteException -> 0x00b9 }
            int r6 = r1.getInt(r6)     // Catch:{ SQLiteException -> 0x00b9 }
            java.lang.String r7 = "data6"
            int r7 = r1.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x00b9 }
            java.lang.String r7 = r1.getString(r7)     // Catch:{ SQLiteException -> 0x00b9 }
            boolean r8 = r0.containsKey(r2)     // Catch:{ SQLiteException -> 0x00b9 }
            if (r8 != 0) goto L_0x006a
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00b9 }
            r8.<init>()     // Catch:{ SQLiteException -> 0x00b9 }
            r0.put(r2, r8)     // Catch:{ SQLiteException -> 0x00b9 }
        L_0x006a:
            java.lang.Object r2 = r0.get(r2)     // Catch:{ SQLiteException -> 0x00b9 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ SQLiteException -> 0x00b9 }
            aqxy r8 = defpackage.aqxy.h     // Catch:{ SQLiteException -> 0x00b9 }
            aucd r8 = r8.o()     // Catch:{ SQLiteException -> 0x00b9 }
            r9 = 0
            if (r3 == 0) goto L_0x008d
            boolean r10 = r8.c     // Catch:{ SQLiteException -> 0x00b9 }
            if (r10 != 0) goto L_0x007e
        L_0x007d:
            goto L_0x0084
        L_0x007e:
            r8.c()     // Catch:{ SQLiteException -> 0x00b9 }
            r8.c = r9     // Catch:{ SQLiteException -> 0x00b9 }
            goto L_0x007d
        L_0x0084:
            aucj r10 = r8.b     // Catch:{ SQLiteException -> 0x00b9 }
            aqxy r10 = (defpackage.aqxy) r10     // Catch:{ SQLiteException -> 0x00b9 }
            r3.getClass()     // Catch:{ SQLiteException -> 0x00b9 }
            r10.a = r3     // Catch:{ SQLiteException -> 0x00b9 }
        L_0x008d:
            boolean r3 = r8.c     // Catch:{ SQLiteException -> 0x00b9 }
            if (r3 != 0) goto L_0x0092
            goto L_0x0097
        L_0x0092:
            r8.c()     // Catch:{ SQLiteException -> 0x00b9 }
            r8.c = r9     // Catch:{ SQLiteException -> 0x00b9 }
        L_0x0097:
            aucj r3 = r8.b     // Catch:{ SQLiteException -> 0x00b9 }
            aqxy r3 = (defpackage.aqxy) r3     // Catch:{ SQLiteException -> 0x00b9 }
            r3.b = r4     // Catch:{ SQLiteException -> 0x00b9 }
            if (r5 == 0) goto L_0x00a4
            r5.getClass()     // Catch:{ SQLiteException -> 0x00b9 }
            r3.c = r5     // Catch:{ SQLiteException -> 0x00b9 }
        L_0x00a4:
            r3.d = r6     // Catch:{ SQLiteException -> 0x00b9 }
            if (r7 != 0) goto L_0x00a9
            goto L_0x00ae
        L_0x00a9:
            r7.getClass()     // Catch:{ SQLiteException -> 0x00b9 }
            r3.e = r7     // Catch:{ SQLiteException -> 0x00b9 }
        L_0x00ae:
            aucj r3 = r8.i()     // Catch:{ SQLiteException -> 0x00b9 }
            aqxy r3 = (defpackage.aqxy) r3     // Catch:{ SQLiteException -> 0x00b9 }
            r2.add(r3)     // Catch:{ SQLiteException -> 0x00b9 }
            goto L_0x0010
        L_0x00b9:
            r12 = move-exception
            goto L_0x00c8
        L_0x00bb:
            zsg r12 = r11.g     // Catch:{ SQLiteException -> 0x00b9 }
            java.lang.String r2 = "Could not query ContactsProvider to fetch im info; disabled? Give up."
            r12.c(r2)     // Catch:{ SQLiteException -> 0x00b9 }
        L_0x00c2:
            if (r1 == 0) goto L_0x00d4
            goto L_0x00d1
        L_0x00c5:
            r12 = move-exception
            goto L_0x00d6
        L_0x00c7:
            r12 = move-exception
        L_0x00c8:
            zsg r2 = r11.g     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = "ContentResolver.query threw an exception when fetching im info"
            r2.a((java.lang.Throwable) r12, (java.lang.String) r3)     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00d4
        L_0x00d1:
            r1.close()
        L_0x00d4:
            return r0
        L_0x00d5:
            r12 = move-exception
        L_0x00d6:
            if (r1 == 0) goto L_0x00db
            r1.close()
        L_0x00db:
            goto L_0x00dd
        L_0x00dc:
            throw r12
        L_0x00dd:
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsz.b(java.util.HashSet):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.HashMap c(long r11) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            r2 = 0
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0025
            boolean r2 = b
            if (r2 == 0) goto L_0x0025
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 51
            r2.<init>(r3)
            java.lang.String r3 = "contact_last_updated_timestamp>"
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r5 = r11
            goto L_0x0026
        L_0x0025:
            r5 = r1
        L_0x0026:
            android.net.Uri r11 = android.provider.ContactsContract.Contacts.CONTENT_URI
            android.net.Uri$Builder r11 = r11.buildUpon()
            java.lang.String r12 = "directory"
            java.lang.String r2 = "0"
            android.net.Uri$Builder r11 = r11.appendQueryParameter(r12, r2)
            android.net.Uri r3 = r11.build()
            android.content.Context r11 = r10.e     // Catch:{ SQLiteException -> 0x00a3, all -> 0x00a1 }
            android.content.ContentResolver r2 = r11.getContentResolver()     // Catch:{ SQLiteException -> 0x00a3, all -> 0x00a1 }
            java.lang.String[] r4 = h     // Catch:{ SQLiteException -> 0x00a3, all -> 0x00a1 }
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x00a3, all -> 0x00a1 }
            if (r1 == 0) goto L_0x0092
        L_0x0048:
            boolean r11 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0090 }
            if (r11 == 0) goto L_0x008c
            java.lang.String r11 = "_id"
            int r11 = r1.getColumnIndex(r11)     // Catch:{ SQLiteException -> 0x0090 }
            long r11 = r1.getLong(r11)     // Catch:{ SQLiteException -> 0x0090 }
            java.lang.String r2 = "times_contacted"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x0090 }
            int r5 = r1.getInt(r2)     // Catch:{ SQLiteException -> 0x0090 }
            java.lang.String r2 = "last_time_contacted"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x0090 }
            long r6 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x0090 }
            java.lang.String r2 = "starred"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x0090 }
            int r2 = r1.getInt(r2)     // Catch:{ SQLiteException -> 0x0090 }
            r3 = 1
            if (r2 != r3) goto L_0x007b
            r8 = 1
            goto L_0x007d
        L_0x007b:
            r2 = 0
            r8 = 0
        L_0x007d:
            zsq r9 = new zsq     // Catch:{ SQLiteException -> 0x0090 }
            r2 = r9
            r3 = r11
            r2.<init>(r3, r5, r6, r8)     // Catch:{ SQLiteException -> 0x0090 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteException -> 0x0090 }
            r0.put(r11, r9)     // Catch:{ SQLiteException -> 0x0090 }
            goto L_0x0048
        L_0x008c:
            r1.close()
            return r0
        L_0x0090:
            r11 = move-exception
            goto L_0x00a4
        L_0x0092:
            zsg r11 = r10.g     // Catch:{ SQLiteException -> 0x0090 }
            java.lang.String r12 = "Could not query ContactsProvider to fetch Contact Ids; disabled? Give up."
            r11.c(r12)     // Catch:{ SQLiteException -> 0x0090 }
            zst r11 = new zst     // Catch:{ SQLiteException -> 0x0090 }
            java.lang.String r12 = "Contacts query cursor is null"
            r11.<init>(r12)     // Catch:{ SQLiteException -> 0x0090 }
            throw r11     // Catch:{ SQLiteException -> 0x0090 }
        L_0x00a1:
            r11 = move-exception
            goto L_0x00d1
        L_0x00a3:
            r11 = move-exception
        L_0x00a4:
            zsg r12 = r10.g     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "ContentResolver.query threw an exception when fetching Contact Ids."
            r12.a((java.lang.Throwable) r11, (java.lang.String) r0)     // Catch:{ all -> 0x00d0 }
            zsu r12 = new zsu     // Catch:{ all -> 0x00d0 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00d0 }
            int r0 = r0.length()     // Catch:{ all -> 0x00d0 }
            int r0 = r0 + 34
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            r2.<init>(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "Fetching Contact Ids query failed."
            r2.append(r0)     // Catch:{ all -> 0x00d0 }
            r2.append(r11)     // Catch:{ all -> 0x00d0 }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x00d0 }
            r12.<init>(r11)     // Catch:{ all -> 0x00d0 }
            throw r12     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r11 = move-exception
        L_0x00d1:
            if (r1 == 0) goto L_0x00d6
            r1.close()
        L_0x00d6:
            goto L_0x00d8
        L_0x00d7:
            throw r11
        L_0x00d8:
            goto L_0x00d7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsz.c(long):java.util.HashMap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0132, code lost:
        if (r8 != null) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013f, code lost:
        if (r8 != null) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0141, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0144, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map a(java.util.HashSet r12) {
        /*
            r11 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.content.Context r1 = r11.e
            android.content.ContentResolver r2 = r1.getContentResolver()
            boolean r1 = defpackage.azdq.i()
            if (r1 == 0) goto L_0x0014
            java.lang.String[] r1 = x
            goto L_0x0016
        L_0x0014:
            java.lang.String[] r1 = v
        L_0x0016:
            boolean r3 = defpackage.azdq.i()
            if (r3 == 0) goto L_0x001f
            java.lang.String[] r3 = w
            goto L_0x0021
        L_0x001f:
            java.lang.String[] r3 = u
        L_0x0021:
            r8 = 0
            android.net.Uri r4 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            boolean r5 = p     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            if (r5 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = r3
        L_0x002a:
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r4
            r4 = r1
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x0137, all -> 0x0135 }
            if (r8 == 0) goto L_0x012b
        L_0x0035:
            boolean r1 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x0129 }
            if (r1 == 0) goto L_0x0132
            java.lang.String r1 = "raw_contact_id"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ SQLiteException -> 0x0129 }
            long r1 = r8.getLong(r1)     // Catch:{ SQLiteException -> 0x0129 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x0129 }
            boolean r2 = r12.contains(r1)     // Catch:{ SQLiteException -> 0x0129 }
            if (r2 == 0) goto L_0x0035
            java.lang.String r2 = "data1"
            int r2 = r8.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x0129 }
            java.lang.String r2 = r8.getString(r2)     // Catch:{ SQLiteException -> 0x0129 }
            java.lang.String r3 = "data2"
            int r3 = r8.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x0129 }
            int r3 = r8.getInt(r3)     // Catch:{ SQLiteException -> 0x0129 }
            java.lang.String r4 = "data3"
            int r4 = r8.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x0129 }
            java.lang.String r4 = r8.getString(r4)     // Catch:{ SQLiteException -> 0x0129 }
            boolean r5 = r0.containsKey(r1)     // Catch:{ SQLiteException -> 0x0129 }
            if (r5 != 0) goto L_0x007b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0129 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0129 }
            r0.put(r1, r5)     // Catch:{ SQLiteException -> 0x0129 }
        L_0x007b:
            java.lang.Object r1 = r0.get(r1)     // Catch:{ SQLiteException -> 0x0129 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ SQLiteException -> 0x0129 }
            aqxs r5 = defpackage.aqxs.h     // Catch:{ SQLiteException -> 0x0129 }
            aucd r5 = r5.o()     // Catch:{ SQLiteException -> 0x0129 }
            r6 = 0
            if (r2 == 0) goto L_0x009e
            boolean r7 = r5.c     // Catch:{ SQLiteException -> 0x0129 }
            if (r7 != 0) goto L_0x008f
        L_0x008e:
            goto L_0x0095
        L_0x008f:
            r5.c()     // Catch:{ SQLiteException -> 0x0129 }
            r5.c = r6     // Catch:{ SQLiteException -> 0x0129 }
            goto L_0x008e
        L_0x0095:
            aucj r7 = r5.b     // Catch:{ SQLiteException -> 0x0129 }
            aqxs r7 = (defpackage.aqxs) r7     // Catch:{ SQLiteException -> 0x0129 }
            r2.getClass()     // Catch:{ SQLiteException -> 0x0129 }
            r7.a = r2     // Catch:{ SQLiteException -> 0x0129 }
        L_0x009e:
            boolean r2 = r5.c     // Catch:{ SQLiteException -> 0x0129 }
            if (r2 != 0) goto L_0x00a3
            goto L_0x00a8
        L_0x00a3:
            r5.c()     // Catch:{ SQLiteException -> 0x0129 }
            r5.c = r6     // Catch:{ SQLiteException -> 0x0129 }
        L_0x00a8:
            aucj r2 = r5.b     // Catch:{ SQLiteException -> 0x0129 }
            aqxs r2 = (defpackage.aqxs) r2     // Catch:{ SQLiteException -> 0x0129 }
            r2.e = r3     // Catch:{ SQLiteException -> 0x0129 }
            android.content.Context r2 = r11.e     // Catch:{ SQLiteException -> 0x0129 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ SQLiteException -> 0x0129 }
            java.lang.CharSequence r2 = android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabel(r2, r3, r4)     // Catch:{ SQLiteException -> 0x0129 }
            java.lang.String r2 = r2.toString()     // Catch:{ SQLiteException -> 0x0129 }
            boolean r3 = r5.c     // Catch:{ SQLiteException -> 0x0129 }
            if (r3 != 0) goto L_0x00c1
            goto L_0x00c6
        L_0x00c1:
            r5.c()     // Catch:{ SQLiteException -> 0x0129 }
            r5.c = r6     // Catch:{ SQLiteException -> 0x0129 }
        L_0x00c6:
            aucj r3 = r5.b     // Catch:{ SQLiteException -> 0x0129 }
            aqxs r3 = (defpackage.aqxs) r3     // Catch:{ SQLiteException -> 0x0129 }
            r2.getClass()     // Catch:{ SQLiteException -> 0x0129 }
            r3.b = r2     // Catch:{ SQLiteException -> 0x0129 }
            boolean r2 = defpackage.azdq.i()     // Catch:{ SQLiteException -> 0x0129 }
            if (r2 == 0) goto L_0x00f4
            java.lang.String r2 = "is_super_primary"
            int r2 = r8.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x0129 }
            int r2 = r8.getInt(r2)     // Catch:{ SQLiteException -> 0x0129 }
            r3 = 1
            if (r2 != r3) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r3 = 0
        L_0x00e4:
            boolean r2 = r5.c     // Catch:{ SQLiteException -> 0x0129 }
            if (r2 != 0) goto L_0x00e9
            goto L_0x00ee
        L_0x00e9:
            r5.c()     // Catch:{ SQLiteException -> 0x0129 }
            r5.c = r6     // Catch:{ SQLiteException -> 0x0129 }
        L_0x00ee:
            aucj r2 = r5.b     // Catch:{ SQLiteException -> 0x0129 }
            aqxs r2 = (defpackage.aqxs) r2     // Catch:{ SQLiteException -> 0x0129 }
            r2.g = r3     // Catch:{ SQLiteException -> 0x0129 }
        L_0x00f4:
            boolean r2 = p     // Catch:{ SQLiteException -> 0x0129 }
            if (r2 == 0) goto L_0x011e
            java.lang.String r2 = "times_used"
            int r2 = r8.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x0129 }
            long r2 = r8.getLong(r2)     // Catch:{ SQLiteException -> 0x0129 }
            java.lang.String r4 = "last_time_used"
            int r4 = r8.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x0129 }
            long r9 = r8.getLong(r4)     // Catch:{ SQLiteException -> 0x0129 }
            boolean r4 = r5.c     // Catch:{ SQLiteException -> 0x0129 }
            if (r4 != 0) goto L_0x0111
            goto L_0x0116
        L_0x0111:
            r5.c()     // Catch:{ SQLiteException -> 0x0129 }
            r5.c = r6     // Catch:{ SQLiteException -> 0x0129 }
        L_0x0116:
            aucj r4 = r5.b     // Catch:{ SQLiteException -> 0x0129 }
            aqxs r4 = (defpackage.aqxs) r4     // Catch:{ SQLiteException -> 0x0129 }
            r4.c = r2     // Catch:{ SQLiteException -> 0x0129 }
            r4.d = r9     // Catch:{ SQLiteException -> 0x0129 }
        L_0x011e:
            aucj r2 = r5.i()     // Catch:{ SQLiteException -> 0x0129 }
            aqxs r2 = (defpackage.aqxs) r2     // Catch:{ SQLiteException -> 0x0129 }
            r1.add(r2)     // Catch:{ SQLiteException -> 0x0129 }
            goto L_0x0035
        L_0x0129:
            r12 = move-exception
            goto L_0x0138
        L_0x012b:
            zsg r12 = r11.g     // Catch:{ SQLiteException -> 0x0129 }
            java.lang.String r1 = "Could not query ContactsProvider to fetch Email info; disabled? Give up."
            r12.c(r1)     // Catch:{ SQLiteException -> 0x0129 }
        L_0x0132:
            if (r8 == 0) goto L_0x0144
            goto L_0x0141
        L_0x0135:
            r12 = move-exception
            goto L_0x0146
        L_0x0137:
            r12 = move-exception
        L_0x0138:
            zsg r1 = r11.g     // Catch:{ all -> 0x0145 }
            java.lang.String r2 = "ContentResolver.query threw an exception when fetching email info"
            r1.a((java.lang.Throwable) r12, (java.lang.String) r2)     // Catch:{ all -> 0x0145 }
            if (r8 == 0) goto L_0x0144
        L_0x0141:
            r8.close()
        L_0x0144:
            return r0
        L_0x0145:
            r12 = move-exception
        L_0x0146:
            if (r8 == 0) goto L_0x014b
            r8.close()
        L_0x014b:
            goto L_0x014d
        L_0x014c:
            throw r12
        L_0x014d:
            goto L_0x014c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsz.a(java.util.HashSet):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c(java.util.Map r5) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = "vnd.android.cursor.item/group_membership"
            java.lang.String[] r2 = G     // Catch:{ SQLiteException -> 0x0050, all -> 0x004e }
            android.database.Cursor r0 = r4.a((java.lang.String) r1, (java.lang.String[]) r2)     // Catch:{ SQLiteException -> 0x0050, all -> 0x004e }
            if (r0 == 0) goto L_0x0041
        L_0x000b:
            boolean r1 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x003f }
            if (r1 == 0) goto L_0x0048
            java.lang.String r1 = "raw_contact_id"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ SQLiteException -> 0x003f }
            long r1 = r0.getLong(r1)     // Catch:{ SQLiteException -> 0x003f }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x003f }
            boolean r2 = r5.containsKey(r1)     // Catch:{ SQLiteException -> 0x003f }
            if (r2 == 0) goto L_0x000b
            java.lang.String r2 = "data1"
            int r2 = r0.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x003f }
            long r2 = r0.getLong(r2)     // Catch:{ SQLiteException -> 0x003f }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ SQLiteException -> 0x003f }
            java.lang.Object r1 = r5.get(r1)     // Catch:{ SQLiteException -> 0x003f }
            zsy r1 = (defpackage.zsy) r1     // Catch:{ SQLiteException -> 0x003f }
            java.util.List r1 = r1.o     // Catch:{ SQLiteException -> 0x003f }
            r1.add(r2)     // Catch:{ SQLiteException -> 0x003f }
            goto L_0x000b
        L_0x003f:
            r5 = move-exception
            goto L_0x0051
        L_0x0041:
            zsg r5 = r4.g     // Catch:{ SQLiteException -> 0x003f }
            java.lang.String r1 = "Could not query ContactsProvider to fetch group membership info."
            r5.c(r1)     // Catch:{ SQLiteException -> 0x003f }
        L_0x0048:
            if (r0 == 0) goto L_0x005b
        L_0x004a:
            r0.close()
            return
        L_0x004e:
            r5 = move-exception
            goto L_0x005d
        L_0x0050:
            r5 = move-exception
        L_0x0051:
            zsg r1 = r4.g     // Catch:{ all -> 0x005c }
            java.lang.String r2 = "ContentResolver.query threw an exception when fetching group membership info"
            r1.a((java.lang.Throwable) r5, (java.lang.String) r2)     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x005b
            goto L_0x004a
        L_0x005b:
            return
        L_0x005c:
            r5 = move-exception
        L_0x005d:
            if (r0 == 0) goto L_0x0062
            r0.close()
        L_0x0062:
            goto L_0x0064
        L_0x0063:
            throw r5
        L_0x0064:
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsz.c(java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(java.util.Map r9) {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = "vnd.android.cursor.item/nickname"
            java.lang.String[] r2 = A     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009f }
            android.database.Cursor r0 = r8.a((java.lang.String) r1, (java.lang.String[]) r2)     // Catch:{ SQLiteException -> 0x00a1, all -> 0x009f }
            if (r0 == 0) goto L_0x0092
        L_0x000b:
            boolean r1 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x0090 }
            if (r1 == 0) goto L_0x0099
            java.lang.String r1 = "raw_contact_id"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ SQLiteException -> 0x0090 }
            long r1 = r0.getLong(r1)     // Catch:{ SQLiteException -> 0x0090 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x0090 }
            boolean r2 = r9.containsKey(r1)     // Catch:{ SQLiteException -> 0x0090 }
            if (r2 == 0) goto L_0x000b
            java.lang.String r2 = "data1"
            int r2 = r0.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x0090 }
            java.lang.String r2 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0090 }
            java.lang.String r3 = "data2"
            int r3 = r0.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x0090 }
            int r3 = r0.getInt(r3)     // Catch:{ SQLiteException -> 0x0090 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0090 }
            java.lang.String r4 = "data3"
            int r4 = r0.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x0090 }
            java.lang.String r4 = r0.getString(r4)     // Catch:{ SQLiteException -> 0x0090 }
            aqxz r5 = defpackage.aqxz.d     // Catch:{ SQLiteException -> 0x0090 }
            aucd r5 = r5.o()     // Catch:{ SQLiteException -> 0x0090 }
            r6 = 0
            if (r2 == 0) goto L_0x0064
            boolean r7 = r5.c     // Catch:{ SQLiteException -> 0x0090 }
            if (r7 != 0) goto L_0x0055
        L_0x0054:
            goto L_0x005b
        L_0x0055:
            r5.c()     // Catch:{ SQLiteException -> 0x0090 }
            r5.c = r6     // Catch:{ SQLiteException -> 0x0090 }
            goto L_0x0054
        L_0x005b:
            aucj r7 = r5.b     // Catch:{ SQLiteException -> 0x0090 }
            aqxz r7 = (defpackage.aqxz) r7     // Catch:{ SQLiteException -> 0x0090 }
            r2.getClass()     // Catch:{ SQLiteException -> 0x0090 }
            r7.a = r2     // Catch:{ SQLiteException -> 0x0090 }
        L_0x0064:
            int r2 = r3.intValue()     // Catch:{ SQLiteException -> 0x0090 }
            boolean r3 = r5.c     // Catch:{ SQLiteException -> 0x0090 }
            if (r3 != 0) goto L_0x006d
            goto L_0x0072
        L_0x006d:
            r5.c()     // Catch:{ SQLiteException -> 0x0090 }
            r5.c = r6     // Catch:{ SQLiteException -> 0x0090 }
        L_0x0072:
            aucj r3 = r5.b     // Catch:{ SQLiteException -> 0x0090 }
            aqxz r3 = (defpackage.aqxz) r3     // Catch:{ SQLiteException -> 0x0090 }
            r3.c = r2     // Catch:{ SQLiteException -> 0x0090 }
            if (r4 != 0) goto L_0x007b
            goto L_0x0080
        L_0x007b:
            r4.getClass()     // Catch:{ SQLiteException -> 0x0090 }
            r3.b = r4     // Catch:{ SQLiteException -> 0x0090 }
        L_0x0080:
            java.lang.Object r1 = r9.get(r1)     // Catch:{ SQLiteException -> 0x0090 }
            zsy r1 = (defpackage.zsy) r1     // Catch:{ SQLiteException -> 0x0090 }
            aucj r2 = r5.i()     // Catch:{ SQLiteException -> 0x0090 }
            aqxz r2 = (defpackage.aqxz) r2     // Catch:{ SQLiteException -> 0x0090 }
            r1.l = r2     // Catch:{ SQLiteException -> 0x0090 }
            goto L_0x000b
        L_0x0090:
            r9 = move-exception
            goto L_0x00a2
        L_0x0092:
            zsg r9 = r8.g     // Catch:{ SQLiteException -> 0x0090 }
            java.lang.String r1 = "Could not query ContactsProvider to fetch Nickname info; disabled? Give up."
            r9.c(r1)     // Catch:{ SQLiteException -> 0x0090 }
        L_0x0099:
            if (r0 == 0) goto L_0x00ac
        L_0x009b:
            r0.close()
            return
        L_0x009f:
            r9 = move-exception
            goto L_0x00ae
        L_0x00a1:
            r9 = move-exception
        L_0x00a2:
            zsg r1 = r8.g     // Catch:{ all -> 0x00ad }
            java.lang.String r2 = "ContentResolver.query threw an exception when fetching note info"
            r1.a((java.lang.Throwable) r9, (java.lang.String) r2)     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x00ac
            goto L_0x009b
        L_0x00ac:
            return
        L_0x00ad:
            r9 = move-exception
        L_0x00ae:
            if (r0 == 0) goto L_0x00b3
            r0.close()
        L_0x00b3:
            goto L_0x00b5
        L_0x00b4:
            throw r9
        L_0x00b5:
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsz.b(java.util.Map):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b1, code lost:
        if (r5 == null) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01be, code lost:
        if (r5 != null) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c0, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cb, code lost:
        return (defpackage.aqxt[]) r2.toArray(new defpackage.aqxt[0]);
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aqxt[] c() {
        /*
            r16 = this;
            r1 = r16
            boolean r0 = defpackage.azfa.g()
            java.lang.String r2 = "Group ID : starting fetch of Groups"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0012
            zsg r0 = r1.g
            r0.b(r2)
            goto L_0x002c
        L_0x0012:
            zsg r0 = r1.g
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r4] = r2
            java.lang.String r2 = r0.a
            r6 = 4
            boolean r2 = android.util.Log.isLoggable(r2, r6)
            if (r2 == 0) goto L_0x002c
            java.lang.String r0 = r0.a
            java.lang.String r2 = "ContactsLogger"
            java.lang.String r2 = defpackage.zsg.f(r2, r5)
            android.util.Log.i(r0, r2)
        L_0x002c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = 0
            android.content.Context r0 = r1.e     // Catch:{ SQLiteException -> 0x01b6, all -> 0x01b4 }
            android.content.ContentResolver r6 = r0.getContentResolver()     // Catch:{ SQLiteException -> 0x01b6, all -> 0x01b4 }
            android.net.Uri r7 = android.provider.ContactsContract.Groups.CONTENT_URI     // Catch:{ SQLiteException -> 0x01b6, all -> 0x01b4 }
            java.lang.String[] r8 = F     // Catch:{ SQLiteException -> 0x01b6, all -> 0x01b4 }
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x01b6, all -> 0x01b4 }
            if (r5 == 0) goto L_0x01aa
        L_0x0045:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x01a8 }
            if (r0 == 0) goto L_0x01b1
            java.lang.String r0 = "_id"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ SQLiteException -> 0x01a8 }
            long r6 = r5.getLong(r0)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.String r6 = "data_set"
            int r6 = r5.getColumnIndex(r6)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.String r7 = "title"
            int r7 = r5.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.String r7 = r5.getString(r7)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.String r8 = "notes"
            int r8 = r5.getColumnIndex(r8)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.String r8 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.String r9 = "system_id"
            int r9 = r5.getColumnIndex(r9)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.String r9 = r5.getString(r9)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.String r10 = "group_visible"
            int r10 = r5.getColumnIndex(r10)     // Catch:{ SQLiteException -> 0x01a8 }
            int r10 = r5.getInt(r10)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.String r11 = "deleted"
            int r11 = r5.getColumnIndex(r11)     // Catch:{ SQLiteException -> 0x01a8 }
            int r11 = r5.getInt(r11)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.String r12 = "should_sync"
            int r12 = r5.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x01a8 }
            int r12 = r5.getInt(r12)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.String r13 = "account_name"
            int r13 = r5.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.String r13 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.String r14 = "account_type"
            int r14 = r5.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.String r14 = r5.getString(r14)     // Catch:{ SQLiteException -> 0x01a8 }
            aqxt r15 = defpackage.aqxt.m     // Catch:{ SQLiteException -> 0x01a8 }
            aucd r15 = r15.o()     // Catch:{ SQLiteException -> 0x01a8 }
            int r10 = r10.intValue()     // Catch:{ SQLiteException -> 0x01a8 }
            if (r10 != r3) goto L_0x00cd
            r10 = 1
            goto L_0x00ce
        L_0x00cd:
            r10 = 0
        L_0x00ce:
            boolean r3 = r15.c     // Catch:{ SQLiteException -> 0x01a8 }
            if (r3 != 0) goto L_0x00d3
            goto L_0x00d8
        L_0x00d3:
            r15.c()     // Catch:{ SQLiteException -> 0x01a8 }
            r15.c = r4     // Catch:{ SQLiteException -> 0x01a8 }
        L_0x00d8:
            aucj r3 = r15.b     // Catch:{ SQLiteException -> 0x01a8 }
            aqxt r3 = (defpackage.aqxt) r3     // Catch:{ SQLiteException -> 0x01a8 }
            r3.f = r10     // Catch:{ SQLiteException -> 0x01a8 }
            int r3 = r11.intValue()     // Catch:{ SQLiteException -> 0x01a8 }
            r10 = 1
            if (r3 != r10) goto L_0x00e7
            r3 = 1
            goto L_0x00e8
        L_0x00e7:
            r3 = 0
        L_0x00e8:
            boolean r10 = r15.c     // Catch:{ SQLiteException -> 0x01a8 }
            if (r10 != 0) goto L_0x00ed
            goto L_0x00f2
        L_0x00ed:
            r15.c()     // Catch:{ SQLiteException -> 0x01a8 }
            r15.c = r4     // Catch:{ SQLiteException -> 0x01a8 }
        L_0x00f2:
            aucj r10 = r15.b     // Catch:{ SQLiteException -> 0x01a8 }
            aqxt r10 = (defpackage.aqxt) r10     // Catch:{ SQLiteException -> 0x01a8 }
            r10.g = r3     // Catch:{ SQLiteException -> 0x01a8 }
            int r3 = r12.intValue()     // Catch:{ SQLiteException -> 0x01a8 }
            r10 = 1
            if (r3 != r10) goto L_0x0101
            r10 = 1
            goto L_0x0102
        L_0x0101:
            r10 = 0
        L_0x0102:
            boolean r3 = r15.c     // Catch:{ SQLiteException -> 0x01a8 }
            if (r3 != 0) goto L_0x0107
            goto L_0x010c
        L_0x0107:
            r15.c()     // Catch:{ SQLiteException -> 0x01a8 }
            r15.c = r4     // Catch:{ SQLiteException -> 0x01a8 }
        L_0x010c:
            aucj r3 = r15.b     // Catch:{ SQLiteException -> 0x01a8 }
            aqxt r3 = (defpackage.aqxt) r3     // Catch:{ SQLiteException -> 0x01a8 }
            r3.h = r10     // Catch:{ SQLiteException -> 0x01a8 }
            boolean r3 = defpackage.azec.b()     // Catch:{ SQLiteException -> 0x01a8 }
            if (r3 == 0) goto L_0x0139
            java.lang.String r3 = "dirty"
            int r3 = r5.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x01a8 }
            int r3 = r5.getInt(r3)     // Catch:{ SQLiteException -> 0x01a8 }
            r10 = 1
            if (r3 != r10) goto L_0x0127
            r3 = 1
            goto L_0x0128
        L_0x0127:
            r3 = 0
        L_0x0128:
            boolean r11 = r15.c     // Catch:{ SQLiteException -> 0x01a8 }
            if (r11 != 0) goto L_0x012d
            goto L_0x0132
        L_0x012d:
            r15.c()     // Catch:{ SQLiteException -> 0x01a8 }
            r15.c = r4     // Catch:{ SQLiteException -> 0x01a8 }
        L_0x0132:
            aucj r11 = r15.b     // Catch:{ SQLiteException -> 0x01a8 }
            aqxt r11 = (defpackage.aqxt) r11     // Catch:{ SQLiteException -> 0x01a8 }
            r11.k = r3     // Catch:{ SQLiteException -> 0x01a8 }
            goto L_0x013a
        L_0x0139:
            r10 = 1
        L_0x013a:
            boolean r3 = defpackage.azec.c()     // Catch:{ SQLiteException -> 0x01a8 }
            if (r3 == 0) goto L_0x015d
            java.lang.String r3 = "sourceid"
            int r3 = r5.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.String r3 = r5.getString(r3)     // Catch:{ SQLiteException -> 0x01a8 }
            boolean r11 = r15.c     // Catch:{ SQLiteException -> 0x01a8 }
            if (r11 != 0) goto L_0x014f
            goto L_0x0154
        L_0x014f:
            r15.c()     // Catch:{ SQLiteException -> 0x01a8 }
            r15.c = r4     // Catch:{ SQLiteException -> 0x01a8 }
        L_0x0154:
            aucj r11 = r15.b     // Catch:{ SQLiteException -> 0x01a8 }
            aqxt r11 = (defpackage.aqxt) r11     // Catch:{ SQLiteException -> 0x01a8 }
            r3.getClass()     // Catch:{ SQLiteException -> 0x01a8 }
            r11.l = r3     // Catch:{ SQLiteException -> 0x01a8 }
        L_0x015d:
            long r11 = r0.longValue()     // Catch:{ SQLiteException -> 0x01a8 }
            boolean r0 = r15.c     // Catch:{ SQLiteException -> 0x01a8 }
            if (r0 != 0) goto L_0x0166
            goto L_0x016b
        L_0x0166:
            r15.c()     // Catch:{ SQLiteException -> 0x01a8 }
            r15.c = r4     // Catch:{ SQLiteException -> 0x01a8 }
        L_0x016b:
            aucj r0 = r15.b     // Catch:{ SQLiteException -> 0x01a8 }
            aqxt r0 = (defpackage.aqxt) r0     // Catch:{ SQLiteException -> 0x01a8 }
            r0.a = r11     // Catch:{ SQLiteException -> 0x01a8 }
            if (r6 == 0) goto L_0x0178
            r6.getClass()     // Catch:{ SQLiteException -> 0x01a8 }
            r0.b = r6     // Catch:{ SQLiteException -> 0x01a8 }
        L_0x0178:
            if (r7 == 0) goto L_0x017f
            r7.getClass()     // Catch:{ SQLiteException -> 0x01a8 }
            r0.c = r7     // Catch:{ SQLiteException -> 0x01a8 }
        L_0x017f:
            if (r8 == 0) goto L_0x0186
            r8.getClass()     // Catch:{ SQLiteException -> 0x01a8 }
            r0.d = r8     // Catch:{ SQLiteException -> 0x01a8 }
        L_0x0186:
            if (r9 == 0) goto L_0x018d
            r9.getClass()     // Catch:{ SQLiteException -> 0x01a8 }
            r0.e = r9     // Catch:{ SQLiteException -> 0x01a8 }
        L_0x018d:
            if (r13 == 0) goto L_0x0194
            r13.getClass()     // Catch:{ SQLiteException -> 0x01a8 }
            r0.i = r13     // Catch:{ SQLiteException -> 0x01a8 }
        L_0x0194:
            if (r14 != 0) goto L_0x0197
            goto L_0x019c
        L_0x0197:
            r14.getClass()     // Catch:{ SQLiteException -> 0x01a8 }
            r0.j = r14     // Catch:{ SQLiteException -> 0x01a8 }
        L_0x019c:
            aucj r0 = r15.i()     // Catch:{ SQLiteException -> 0x01a8 }
            aqxt r0 = (defpackage.aqxt) r0     // Catch:{ SQLiteException -> 0x01a8 }
            r2.add(r0)     // Catch:{ SQLiteException -> 0x01a8 }
            r3 = 1
            goto L_0x0045
        L_0x01a8:
            r0 = move-exception
            goto L_0x01b7
        L_0x01aa:
            zsg r0 = r1.g     // Catch:{ SQLiteException -> 0x01a8 }
            java.lang.String r3 = "Could not query ContactsProvider to fetch Group info; disabled? Give up."
            r0.c(r3)     // Catch:{ SQLiteException -> 0x01a8 }
        L_0x01b1:
            if (r5 != 0) goto L_0x01c0
            goto L_0x01c3
        L_0x01b4:
            r0 = move-exception
            goto L_0x01cd
        L_0x01b6:
            r0 = move-exception
        L_0x01b7:
            zsg r3 = r1.g     // Catch:{ all -> 0x01cc }
            java.lang.String r6 = "ContentResolver.query threw an exception when fetching Group info"
            r3.a((java.lang.Throwable) r0, (java.lang.String) r6)     // Catch:{ all -> 0x01cc }
            if (r5 == 0) goto L_0x01c3
        L_0x01c0:
            r5.close()
        L_0x01c3:
            aqxt[] r0 = new defpackage.aqxt[r4]
            java.lang.Object[] r0 = r2.toArray(r0)
            aqxt[] r0 = (defpackage.aqxt[]) r0
            return r0
        L_0x01cc:
            r0 = move-exception
        L_0x01cd:
            if (r5 == 0) goto L_0x01d2
            r5.close()
        L_0x01d2:
            goto L_0x01d4
        L_0x01d3:
            throw r0
        L_0x01d4:
            goto L_0x01d3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsz.c():aqxt[]");
    }

    private final Map a(String[] strArr) {
        HashMap hashMap = new HashMap();
        try {
            Cursor query = this.e.getContentResolver().query(ContactsContract.Data.CONTENT_URI, strArr, (String) null, (String[]) null, (String) null);
            if (query != null) {
                while (query.moveToNext()) {
                    Long valueOf = Long.valueOf(query.getLong(query.getColumnIndex("contact_id")));
                    String string = query.getString(query.getColumnIndex("display_name"));
                    aucd o2 = aqxp.c.o();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    string.getClass();
                    ((aqxp) o2.b).b = string;
                    if (azdq.k()) {
                        String string2 = query.getString(query.getColumnIndex("lookup"));
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        string2.getClass();
                        ((aqxp) o2.b).a = string2;
                    }
                    hashMap.put(valueOf, (aqxp) o2.i());
                    new Object[1][0] = string;
                }
                query.close();
            } else {
                this.g.c("CP2 query failed when fetching lookup key.");
            }
            return hashMap;
        } catch (SQLiteException e2) {
            if (azfa.g()) {
                this.g.a((Throwable) e2, "CP2 query exception when fetching display name.");
            } else {
                this.g.e("CP2 query exception when fetching display name.", e2);
            }
            return hashMap;
        }
    }

    public final Map b() {
        if (azdq.k()) {
            return a(E);
        }
        return a(D);
    }

    public final boolean b(long j2) {
        synchronized (this) {
            if (this.f + j2 > azfa.n()) {
                return false;
            }
            this.f += j2;
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.util.Map r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = "vnd.android.cursor.item/name"
            java.lang.String[] r2 = z     // Catch:{ SQLiteException -> 0x0049, all -> 0x0047 }
            android.database.Cursor r0 = r3.a((java.lang.String) r1, (java.lang.String[]) r2)     // Catch:{ SQLiteException -> 0x0049, all -> 0x0047 }
            if (r0 == 0) goto L_0x003a
        L_0x000b:
            boolean r1 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x0038 }
            if (r1 == 0) goto L_0x0041
            java.lang.String r1 = "raw_contact_id"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ SQLiteException -> 0x0038 }
            long r1 = r0.getLong(r1)     // Catch:{ SQLiteException -> 0x0038 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x0038 }
            boolean r2 = r4.containsKey(r1)     // Catch:{ SQLiteException -> 0x0038 }
            if (r2 == 0) goto L_0x000b
            java.lang.String r2 = "data1"
            int r2 = r0.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x0038 }
            java.lang.String r2 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0038 }
            java.lang.Object r1 = r4.get(r1)     // Catch:{ SQLiteException -> 0x0038 }
            zsy r1 = (defpackage.zsy) r1     // Catch:{ SQLiteException -> 0x0038 }
            r1.k = r2     // Catch:{ SQLiteException -> 0x0038 }
            goto L_0x000b
        L_0x0038:
            r4 = move-exception
            goto L_0x004a
        L_0x003a:
            zsg r4 = r3.g     // Catch:{ SQLiteException -> 0x0038 }
            java.lang.String r1 = "Could not query ContactsProvider to fetch display name; disabled? Give up."
            r4.c(r1)     // Catch:{ SQLiteException -> 0x0038 }
        L_0x0041:
            if (r0 == 0) goto L_0x0054
        L_0x0043:
            r0.close()
            return
        L_0x0047:
            r4 = move-exception
            goto L_0x0056
        L_0x0049:
            r4 = move-exception
        L_0x004a:
            zsg r1 = r3.g     // Catch:{ all -> 0x0055 }
            java.lang.String r2 = "ContentResolver.query threw an exception when fetching note info"
            r1.a((java.lang.Throwable) r4, (java.lang.String) r2)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0054
            goto L_0x0043
        L_0x0054:
            return
        L_0x0055:
            r4 = move-exception
        L_0x0056:
            if (r0 == 0) goto L_0x005b
            r0.close()
        L_0x005b:
            goto L_0x005d
        L_0x005c:
            throw r4
        L_0x005d:
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsz.a(java.util.Map):void");
    }

    public final aqxb a() {
        return a(true);
    }

    public final aqxb a(boolean z2) {
        aqxx[] a2 = a(z2, 0);
        aqxa aqxa = (aqxa) aqxb.c.o();
        aqxa.a(Arrays.asList(a2));
        return (aqxb) aqxa.i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashSet a(long r11) {
        /*
            r10 = this;
            boolean r0 = b
            java.lang.String r1 = "Delta API not supported"
            defpackage.iva.a((boolean) r0, (java.lang.Object) r1)
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            boolean r0 = defpackage.zsm.a(r0)
            if (r0 == 0) goto L_0x008f
            r0 = 0
            r1 = 0
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x002b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 46
            r3.<init>(r4)
            java.lang.String r4 = "contact_deleted_timestamp>"
            r3.append(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r7 = r3
            goto L_0x002c
        L_0x002b:
            r7 = r0
        L_0x002c:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            android.content.Context r4 = r10.e     // Catch:{ all -> 0x0088 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x0088 }
            android.net.Uri r5 = android.provider.ContactsContract.DeletedContacts.CONTENT_URI     // Catch:{ all -> 0x0088 }
            java.lang.String[] r6 = C     // Catch:{ all -> 0x0088 }
            r8 = 0
            r9 = 0
            android.database.Cursor r0 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0073
            java.lang.String r4 = "contact_id"
            int r4 = r0.getColumnIndex(r4)     // Catch:{ all -> 0x0086 }
        L_0x0049:
            boolean r5 = r0.moveToNext()     // Catch:{ all -> 0x0086 }
            if (r5 != 0) goto L_0x0064
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0086 }
            r5 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0086 }
            r4[r5] = r1     // Catch:{ all -> 0x0086 }
            r1 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0086 }
            r4[r1] = r2     // Catch:{ all -> 0x0086 }
            r0.close()
            goto L_0x007a
        L_0x0064:
            r5 = 1
            long r1 = r1 + r5
            long r5 = r0.getLong(r4)     // Catch:{ all -> 0x0086 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0086 }
            r3.add(r5)     // Catch:{ all -> 0x0086 }
            goto L_0x0049
        L_0x0073:
            zsg r1 = r10.g     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "Could not fetch deleted contacts"
            r1.c(r2)     // Catch:{ all -> 0x0086 }
        L_0x007a:
            java.util.HashMap r11 = r10.c((long) r11)
            java.util.Set r11 = r11.keySet()
            r3.removeAll(r11)
            return r3
        L_0x0086:
            r11 = move-exception
            goto L_0x0089
        L_0x0088:
            r11 = move-exception
        L_0x0089:
            if (r0 == 0) goto L_0x008e
            r0.close()
        L_0x008e:
            throw r11
        L_0x008f:
            zsg r11 = r10.g
            java.lang.String r12 = "Don't have READ_CONTACTS permission; giving up reading deleted contacts."
            r11.c(r12)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsz.a(long):java.util.HashSet");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.util.concurrent.ExecutorCompletionService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.util.concurrent.ExecutorCompletionService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v12, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v13, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v14, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v17, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v53, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v21, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v21, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v22, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v8, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v23, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v9, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v10, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v11, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v12, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v13, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v14, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v15, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v16, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v17, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v18, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v19, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v20, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v21, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v26, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v24, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v22, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v42, resolved type: aoru} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v43, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v23, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v26, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v22, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v23, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v27, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v28, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v33, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v37, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v51, resolved type: aoru} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v52, resolved type: aoru} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v34, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v35, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v38, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v39, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v42, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v43, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v49 */
    /* JADX WARNING: type inference failed for: r32v16 */
    /* JADX WARNING: type inference failed for: r4v50 */
    /* JADX WARNING: type inference failed for: r9v68, types: [java.util.concurrent.ExecutorCompletionService] */
    /* JADX WARNING: type inference failed for: r4v55 */
    /* JADX WARNING: type inference failed for: r4v57 */
    /* JADX WARNING: type inference failed for: r32v24 */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0285, code lost:
        if (r13 == null) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02a2, code lost:
        if (r13 != null) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        r2 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r3 = a("vnd.android.cursor.item/website", j);
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02b2, code lost:
        if (r3 == null) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02b4, code lost:
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02b8, code lost:
        if (r3.moveToNext() == false) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ba, code lost:
        r6 = java.lang.Long.valueOf(r3.getLong(r3.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02cc, code lost:
        if (r5.contains(r6) == false) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02ce, code lost:
        r7 = r3.getString(r3.getColumnIndex("data1"));
        r13 = r3.getInt(r3.getColumnIndex("data2"));
        r14 = r3.getString(r3.getColumnIndex("data3"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02f0, code lost:
        if (r2.containsKey(r6) != false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r2.put(r6, new java.util.ArrayList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02fb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02fc, code lost:
        r2 = r0;
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0301, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0302, code lost:
        r6 = r0;
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r6 = (java.util.ArrayList) r2.get(r6);
        r15 = defpackage.aqye.d.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0313, code lost:
        if (r7 == null) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0315, code lost:
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0319, code lost:
        if (r15.c != false) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x031c, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0323, code lost:
        r7.getClass();
        ((defpackage.aqye) r15.b).a = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x032d, code lost:
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0331, code lost:
        if (r15.c != false) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0334, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x033a, code lost:
        r7 = (defpackage.aqye) r15.b;
        r7.b = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0340, code lost:
        if (r14 != null) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0343, code lost:
        r14.getClass();
        r7.c = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0348, code lost:
        r6.add((defpackage.aqye) r15.i());
        r8 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0355, code lost:
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0359, code lost:
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x035c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x035d, code lost:
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x035f, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0361, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0362, code lost:
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0364, code lost:
        r6 = r0;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0366, code lost:
        r20 = r8;
        r1.g.c("Could not query ContactsProvider to fetch Website info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x036f, code lost:
        if (r3 != null) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0372, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0374, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0377, code lost:
        r0 = e;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0379, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x037a, code lost:
        r20 = r8;
        r2 = r0;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0380, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0381, code lost:
        r20 = r8;
        r6 = r0;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        r1.g.a((java.lang.Throwable) r6, "ContentResolver.query threw an exception when fetching website info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x038c, code lost:
        if (r3 == null) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0391, code lost:
        r3 = new java.util.HashMap();
        r21 = r1.e.getContentResolver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:?, code lost:
        r22 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI;
        r23 = y;
        r24 = null;
        r25 = null;
        r26 = null;
        r6 = r21.query(r22, r23, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null);
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03aa, code lost:
        if (r6 == null) goto L_0x0470;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03b0, code lost:
        if (r6.moveToNext() == false) goto L_0x0465;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03b2, code lost:
        r7 = java.lang.Long.valueOf(r6.getLong(r6.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03c4, code lost:
        if (r5.contains(r7) == false) goto L_0x0461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03c6, code lost:
        r8 = r6.getString(r6.getColumnIndex("data1"));
        r13 = r6.getInt(r6.getColumnIndex("data2"));
        r14 = r6.getString(r6.getColumnIndex("data3"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03e8, code lost:
        if (r3.containsKey(r7) != false) goto L_0x03f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:?, code lost:
        r3.put(r7, new java.util.ArrayList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x03f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03f4, code lost:
        r7 = r0;
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        r7 = (java.util.List) r3.get(r7);
        r15 = defpackage.aqxv.f.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0405, code lost:
        if (r8 == null) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0407, code lost:
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x040b, code lost:
        if (r15.c != false) goto L_0x040e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x040e, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0415, code lost:
        r8.getClass();
        ((defpackage.aqxv) r15.b).a = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x041f, code lost:
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0423, code lost:
        if (r15.c != false) goto L_0x0426;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0426, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x042c, code lost:
        ((defpackage.aqxv) r15.b).c = r13;
        r8 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabel(r1.e.getResources(), r13, r14).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0442, code lost:
        if (r15.c != false) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0445, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x044b, code lost:
        r8.getClass();
        ((defpackage.aqxv) r15.b).b = r8;
        r7.add((defpackage.aqxv) r15.i());
        r9 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0461, code lost:
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0465, code lost:
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0468, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0469, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x046b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x046c, code lost:
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x046e, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0470, code lost:
        r21 = r9;
        r1.g.c("Could not query ContactsProvider to fetch Postal info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0479, code lost:
        if (r6 != null) goto L_0x0494;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x047c, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x047f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0481, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0482, code lost:
        r2 = r0;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0486, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0487, code lost:
        r21 = r9;
        r7 = r0;
        r6 = null;
        r24 = r24;
        r23 = r23;
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        r1.g.a((java.lang.Throwable) r7, "ContentResolver.query threw an exception when fetching postal info");
        r24 = r24;
        r24 = r24;
        r23 = r23;
        r23 = r23;
        r22 = r22;
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0492, code lost:
        if (r6 == null) goto L_0x0497;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        r6.close();
        r24 = r24;
        r23 = r23;
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0497, code lost:
        r6 = b(r5);
        r7 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        r8 = a("vnd.android.cursor.item/relation", l);
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04a8, code lost:
        if (r8 == null) goto L_0x055e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04aa, code lost:
        r32 = r32;
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04ae, code lost:
        if (r8.moveToNext() == false) goto L_0x054f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04b0, code lost:
        r9 = java.lang.Long.valueOf(r8.getLong(r8.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04c2, code lost:
        if (r5.contains(r9) == false) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04c4, code lost:
        r13 = r8.getString(r8.getColumnIndex("data1"));
        r14 = r8.getInt(r8.getColumnIndex("data2"));
        r15 = r8.getString(r8.getColumnIndex("data3"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04e6, code lost:
        if (r7.containsKey(r9) != false) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04e8, code lost:
        r22 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x04ea, code lost:
        r32 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:?, code lost:
        r7.put(r9, new java.util.ArrayList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x04f3, code lost:
        r22 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x04f5, code lost:
        r4 = (java.util.ArrayList) r7.get(r9);
        r9 = defpackage.aqyc.d.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0501, code lost:
        if (r13 == null) goto L_0x051b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0503, code lost:
        r32 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0505, code lost:
        r32 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0507, code lost:
        if (r9.c != false) goto L_0x050a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x050a, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0511, code lost:
        r13.getClass();
        ((defpackage.aqyc) r9.b).a = r13;
        r32 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x051b, code lost:
        r32 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x051f, code lost:
        if (r9.c != false) goto L_0x0522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0522, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0528, code lost:
        r3 = (defpackage.aqyc) r9.b;
        r3.b = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x052e, code lost:
        if (r15 != null) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0531, code lost:
        r15.getClass();
        r3.c = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0536, code lost:
        r4.add((defpackage.aqyc) r9.i());
        r3 = r32;
        r4 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0545, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0546, code lost:
        r32 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0549, code lost:
        r32 = r3;
        r22 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x054f, code lost:
        r32 = r3;
        r22 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0554, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0555, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0557, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0558, code lost:
        r32 = r3;
        r22 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x055c, code lost:
        r3 = r0;
        r32 = r32;
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x055e, code lost:
        r32 = r3;
        r22 = r4;
        r1.g.c("Could not query CP2 to fetch relation info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0569, code lost:
        if (r8 == null) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x056f, code lost:
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0572, code lost:
        r0 = e;
        r32 = r32;
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0574, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0575, code lost:
        r2 = r0;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0579, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x057a, code lost:
        r32 = r3;
        r22 = r4;
        r3 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:?, code lost:
        r1.g.a((java.lang.Throwable) r3, "ContentResolver.query threw an exception when fetching relation info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0587, code lost:
        if (r8 != null) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:?, code lost:
        a((java.util.Map) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:?, code lost:
        r3 = a("vnd.android.cursor.item/note", B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0595, code lost:
        if (r3 == null) goto L_0x05ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x059b, code lost:
        if (r3.moveToNext() == false) goto L_0x05d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x059d, code lost:
        r4 = java.lang.Long.valueOf(r3.getLong(r3.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05af, code lost:
        if (r10.containsKey(r4) == false) goto L_0x0597;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05b1, code lost:
        ((defpackage.zsy) r10.get(r4)).j = r3.getString(r3.getColumnIndex("data1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x05c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x05c5, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x05c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x05c8, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x05ca, code lost:
        r1.g.c("Could not query ContactsProvider to fetch Note info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x05d1, code lost:
        if (r3 == null) goto L_0x05ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05d7, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x05da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x05db, code lost:
        r2 = r0;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x05df, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x05e0, code lost:
        r4 = r0;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
        r1.g.a((java.lang.Throwable) r4, "ContentResolver.query threw an exception when fetching note info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x05e9, code lost:
        if (r3 != null) goto L_0x05d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:?, code lost:
        b((java.util.Map) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:?, code lost:
        r3 = a("vnd.android.cursor.item/organization", m);
        r24 = r24;
        r23 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x05f7, code lost:
        if (r3 == null) goto L_0x076a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x05f9, code lost:
        r24 = r24;
        r23 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x05fd, code lost:
        if (r3.moveToNext() == false) goto L_0x0745;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x05ff, code lost:
        r4 = java.lang.Long.valueOf(r3.getLong(r3.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0611, code lost:
        if (r10.containsKey(r4) == false) goto L_0x0735;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0613, code lost:
        r8 = r3.getString(r3.getColumnIndex("data1"));
        r9 = r3.getInt(r3.getColumnIndex("data2"));
        r13 = r3.getString(r3.getColumnIndex("data3"));
        r14 = r3.getString(r3.getColumnIndex("data4"));
        r15 = r3.getString(r3.getColumnIndex("data5"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0645, code lost:
        r33 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0649, code lost:
        r24 = r24;
        r23 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:?, code lost:
        r7 = r3.getString(r3.getColumnIndex("data6"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0651, code lost:
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0655, code lost:
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:?, code lost:
        r6 = r3.getString(r3.getColumnIndex("data7"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x065d, code lost:
        r24 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:?, code lost:
        r2 = r3.getString(r3.getColumnIndex("data8"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0669, code lost:
        r25 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        r12 = r3.getString(r3.getColumnIndex("data9"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0675, code lost:
        r26 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:?, code lost:
        r11 = r3.getString(r3.getColumnIndex("data10"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0683, code lost:
        r28 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:?, code lost:
        r5 = defpackage.aqya.k.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0689, code lost:
        if (r8 == null) goto L_0x06a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x068b, code lost:
        r27 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x068f, code lost:
        if (r5.c != false) goto L_0x0692;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0692, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0699, code lost:
        r8.getClass();
        ((defpackage.aqya) r5.b).a = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x06a3, code lost:
        r27 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x06a7, code lost:
        if (r5.c != false) goto L_0x06aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x06aa, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x06b0, code lost:
        r3 = (defpackage.aqya) r5.b;
        r3.b = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x06b6, code lost:
        if (r13 == null) goto L_0x06bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x06b8, code lost:
        r13.getClass();
        r3.c = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x06bd, code lost:
        if (r14 == null) goto L_0x06c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x06bf, code lost:
        r14.getClass();
        r3.d = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x06c4, code lost:
        if (r15 == null) goto L_0x06cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x06c6, code lost:
        r15.getClass();
        r3.e = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x06cb, code lost:
        if (r7 == null) goto L_0x06d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x06cd, code lost:
        r7.getClass();
        r3.f = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x06d2, code lost:
        if (r6 == null) goto L_0x06d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x06d4, code lost:
        r6.getClass();
        r3.g = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x06d9, code lost:
        if (r2 == null) goto L_0x06e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x06db, code lost:
        r2.getClass();
        r3.h = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x06e0, code lost:
        if (r12 == null) goto L_0x06e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x06e2, code lost:
        r12.getClass();
        r3.i = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x06e7, code lost:
        if (r11 != null) goto L_0x06ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x06ea, code lost:
        r11.getClass();
        r3.j = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x06ef, code lost:
        ((defpackage.zsy) r10.get(r4)).m = (defpackage.aqya) r5.i();
        r7 = r33;
        r6 = r23;
        r2 = r24;
        r12 = r25;
        r11 = r26;
        r3 = r27;
        r5 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x070d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x070e, code lost:
        r27 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0712, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0713, code lost:
        r27 = r3;
        r28 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0719, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x071a, code lost:
        r27 = r3;
        r28 = r5;
        r26 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0721, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0723, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0724, code lost:
        r24 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0726, code lost:
        r27 = r3;
        r28 = r5;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x072b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x072c, code lost:
        r24 = r2;
        r27 = r3;
        r28 = r5;
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0735, code lost:
        r24 = r2;
        r27 = r3;
        r28 = r5;
        r23 = r6;
        r33 = r7;
        r26 = r11;
        r25 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0745, code lost:
        r24 = r2;
        r27 = r3;
        r28 = r5;
        r23 = r6;
        r33 = r7;
        r26 = r11;
        r25 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0754, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0755, code lost:
        r27 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0757, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0759, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x075a, code lost:
        r24 = r2;
        r27 = r3;
        r28 = r5;
        r23 = r6;
        r33 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0764, code lost:
        r26 = r11;
        r25 = r12;
        r24 = r24;
        r23 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0768, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x076a, code lost:
        r24 = r2;
        r27 = r3;
        r28 = r5;
        r23 = r6;
        r33 = r7;
        r26 = r11;
        r25 = r12;
        r1.g.c("Could not query CP2 to fetch Organization info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x077f, code lost:
        if (r27 != null) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:?, code lost:
        r27.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0786, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0788, code lost:
        r5 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x078c, code lost:
        r0 = e;
        r24 = r24;
        r23 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x078e, code lost:
        r3 = r27;
        r24 = r24;
        r23 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0791, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0792, code lost:
        r2 = r0;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0796, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0797, code lost:
        r24 = r2;
        r28 = r5;
        r23 = r6;
        r33 = r7;
        r26 = r11;
        r25 = r12;
        r2 = r0;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:?, code lost:
        r1.g.a((java.lang.Throwable) r2, "ContentResolver.query threw an exception when fetching organization info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x07ac, code lost:
        if (r3 != null) goto L_0x07ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x07b5, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x07b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x07b7, code lost:
        r2 = android.os.Build.VERSION.SDK_INT;
        r2 = n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x07bc, code lost:
        r2 = o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x07be, code lost:
        r2 = a("vnd.android.cursor.item/name", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x07c4, code lost:
        if (r2 != null) goto L_0x07c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x07ca, code lost:
        if (r2.moveToNext() != false) goto L_0x07cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x07cc, code lost:
        r4 = java.lang.Long.valueOf(r2.getLong(r2.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x07de, code lost:
        if (r10.containsKey(r4) != false) goto L_0x07e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x07e0, code lost:
        r5 = r2.getString(r2.getColumnIndex("data1"));
        r6 = r2.getString(r2.getColumnIndex("data2"));
        r7 = r2.getString(r2.getColumnIndex("data5"));
        r8 = r2.getString(r2.getColumnIndex("data3"));
        r9 = android.os.Build.VERSION.SDK_INT;
        r9 = java.lang.Integer.valueOf(r2.getInt(r2.getColumnIndex("data10")));
        r11 = r2.getString(r2.getColumnIndex("data4"));
        r12 = r2.getString(r2.getColumnIndex("data6"));
        r13 = r2.getString(r2.getColumnIndex("data7"));
        r14 = r2.getString(r2.getColumnIndex("data8"));
        r15 = r2.getString(r2.getColumnIndex("data9"));
        r27 = 0;
        r29 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0856, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 24) goto L_0x0858;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0858, code lost:
        r27 = java.lang.Integer.valueOf(r2.getInt(r2.getColumnIndex("data11")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0866, code lost:
        r3 = defpackage.aqyd.l.o();
        r4 = r27.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0870, code lost:
        r27 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0874, code lost:
        if (r3.c == false) goto L_0x0876;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0877, code lost:
        r3.c();
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x087d, code lost:
        ((defpackage.aqyd) r3.b).k = r4;
        r2 = r9.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0889, code lost:
        if (r3.c == false) goto L_0x088b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x088c, code lost:
        r3.c();
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0892, code lost:
        r4 = (defpackage.aqyd) r3.b;
        r4.e = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0898, code lost:
        if (r5 != null) goto L_0x089a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x089a, code lost:
        r5.getClass();
        r4.a = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x089f, code lost:
        if (r6 != null) goto L_0x08a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x08a1, code lost:
        r6.getClass();
        r4.b = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x08a6, code lost:
        if (r7 != null) goto L_0x08a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x08a8, code lost:
        r7.getClass();
        r4.c = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x08ad, code lost:
        if (r8 != null) goto L_0x08af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x08af, code lost:
        r8.getClass();
        r4.d = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x08b4, code lost:
        if (r11 != null) goto L_0x08b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x08b6, code lost:
        r11.getClass();
        r4.f = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x08bb, code lost:
        if (r12 != null) goto L_0x08bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x08bd, code lost:
        r12.getClass();
        r4.g = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x08c2, code lost:
        if (r13 != null) goto L_0x08c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x08c4, code lost:
        r13.getClass();
        r4.h = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x08c9, code lost:
        if (r14 != null) goto L_0x08cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x08cb, code lost:
        r14.getClass();
        r4.i = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x08d0, code lost:
        if (r15 == null) goto L_0x08d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x08d3, code lost:
        r15.getClass();
        r4.j = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x08d8, code lost:
        ((defpackage.zsy) r10.get(r29)).n = (defpackage.aqyd) r3.i();
        r2 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x08ee, code lost:
        r27 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x08f4, code lost:
        r27 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x08f7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x08f8, code lost:
        r27 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x08fa, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x08fc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x08fd, code lost:
        r27 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x08ff, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0901, code lost:
        r27 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0907, code lost:
        if (defpackage.azfa.g() == false) goto L_0x0909;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0909, code lost:
        r1.g.c("ReadContactsHelper", "Could not query ContactsProvider to fetch structured name.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0919, code lost:
        r1.g.c("Could not query ContactsProvider to fetch structured name.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0920, code lost:
        if (r27 == null) goto L_0x0959;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0923, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0925, code lost:
        r5 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0929, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x092b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x092c, code lost:
        r2 = r0;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0930, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0931, code lost:
        r2 = r0;
        r27 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0938, code lost:
        if (defpackage.azfa.g() == false) goto L_0x093a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x093a, code lost:
        r1.g.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching note info", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x094d, code lost:
        r1.g.a((java.lang.Throwable) r2, "ContentResolver.query threw an exception when fetching note info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0954, code lost:
        if (r27 != null) goto L_0x0956;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:?, code lost:
        r27.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x095d, code lost:
        if (defpackage.azdq.j() != false) goto L_0x0960;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0960, code lost:
        c((java.util.Map) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0963, code lost:
        r2 = r10.size();
        r3 = new defpackage.aqxx[r2];
        r4 = r28.iterator();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0972, code lost:
        if (r4.hasNext() == false) goto L_0x0bbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0974, code lost:
        r6 = (java.lang.Long) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x097e, code lost:
        if (java.lang.Thread.interrupted() != false) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0980, code lost:
        r7 = (defpackage.zsy) r10.get(r6);
        r8 = (defpackage.aqxw) defpackage.aqxx.E.o();
        r11 = r6.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0994, code lost:
        if (r8.c != false) goto L_0x0997;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0997, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x099d, code lost:
        r6 = (defpackage.aqxx) r8.b;
        r6.m = r11;
        r9 = r7.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x09a5, code lost:
        if (r9 == null) goto L_0x09ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x09a7, code lost:
        r9.getClass();
        r6.l = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x09ac, code lost:
        r11 = r7.b.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x09b4, code lost:
        if (r8.c != false) goto L_0x09b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x09b7, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x09bd, code lost:
        ((defpackage.aqxx) r8.b).n = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x09c7, code lost:
        if (r7.a() != false) goto L_0x09ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x09ca, code lost:
        r6 = r7.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x09ce, code lost:
        if (r8.c != false) goto L_0x09d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x09d1, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x09d7, code lost:
        r6.getClass();
        ((defpackage.aqxx) r8.b).g = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x09e6, code lost:
        if (android.text.TextUtils.isEmpty(r7.k) == false) goto L_0x09e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x09e9, code lost:
        r6 = r7.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x09ed, code lost:
        if (r8.c != false) goto L_0x09f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x09f0, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x09f6, code lost:
        r6.getClass();
        ((defpackage.aqxx) r8.b).a = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0a05, code lost:
        if (android.text.TextUtils.isEmpty(r7.j) != false) goto L_0x0a1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0a07, code lost:
        r6 = r7.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0a0b, code lost:
        if (r8.c != false) goto L_0x0a0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0a0e, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0a14, code lost:
        r6.getClass();
        ((defpackage.aqxx) r8.b).o = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0a1d, code lost:
        r6 = r7.l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0a1f, code lost:
        if (r6 == null) goto L_0x0a3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0a27, code lost:
        if (android.text.TextUtils.isEmpty(r6.a) != false) goto L_0x0a3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0a29, code lost:
        r6 = r7.l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0a2d, code lost:
        if (r8.c != false) goto L_0x0a30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0a30, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0a36, code lost:
        r6.getClass();
        ((defpackage.aqxx) r8.b).r = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0a3f, code lost:
        r6 = r7.n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0a41, code lost:
        if (r6 == null) goto L_0x0a57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0a45, code lost:
        if (r8.c != false) goto L_0x0a48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0a48, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0a4e, code lost:
        r6.getClass();
        ((defpackage.aqxx) r8.b).c = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0a57, code lost:
        r6 = r7.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0a59, code lost:
        if (r6 == null) goto L_0x0a70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0a5d, code lost:
        if (r8.c != false) goto L_0x0a60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0a60, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0a67, code lost:
        r6.getClass();
        ((defpackage.aqxx) r8.b).u = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0a74, code lost:
        if (r7.b() == false) goto L_0x0a8c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0a76, code lost:
        r6 = r7.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0a7a, code lost:
        if (r8.c != false) goto L_0x0a7d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0a7d, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0a83, code lost:
        r6.getClass();
        ((defpackage.aqxx) r8.b).x = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0a90, code lost:
        if (r7.c() == false) goto L_0x0aa8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0a92, code lost:
        r6 = r7.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0a96, code lost:
        if (r8.c != false) goto L_0x0a99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0a99, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0a9f, code lost:
        r6.getClass();
        ((defpackage.aqxx) r8.b).B = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0aaa, code lost:
        if (r7.i != false) goto L_0x0aae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x0ab0, code lost:
        if (r8.c != false) goto L_0x0ab3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0ab3, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x0ab9, code lost:
        ((defpackage.aqxx) r8.b).s = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x0ac6, code lost:
        if (r7.o.isEmpty() != false) goto L_0x0ade;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x0ac8, code lost:
        r8.b(defpackage.aook.a(defpackage.jhx.a((java.lang.Long[]) r7.o.toArray(new java.lang.Long[0]))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x0ade, code lost:
        r6 = defpackage.aoog.a(r7.g.longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x0aea, code lost:
        if (r8.c != false) goto L_0x0aed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0aed, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0af3, code lost:
        ((defpackage.aqxx) r8.b).h = r6;
        r11 = (r7.h.longValue() / 86400000) * 86400000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0b07, code lost:
        if (r8.c != false) goto L_0x0b0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0b0b, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x0b11, code lost:
        ((defpackage.aqxx) r8.b).i = r11;
        r12 = r26;
        r11 = (java.util.List) r12.get(r7.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0b21, code lost:
        if (r11 != null) goto L_0x0b24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x0b24, code lost:
        r8.a(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:0x0b27, code lost:
        r13 = r25;
        r11 = (java.util.List) r13.get(r7.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:0x0b31, code lost:
        if (r11 != null) goto L_0x0b34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x0b34, code lost:
        r8.d(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x0b37, code lost:
        r14 = r24;
        r11 = (java.util.List) r14.get(r7.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x0b41, code lost:
        if (r11 != null) goto L_0x0b44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x0b44, code lost:
        r8.g(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x0b47, code lost:
        r15 = r23;
        r11 = (java.util.List) r15.get(r7.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x0b51, code lost:
        if (r11 != null) goto L_0x0b54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x0b54, code lost:
        r8.c(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x0b57, code lost:
        r6 = r33;
        r11 = (java.util.List) r6.get(r7.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:0x0b61, code lost:
        if (r11 != null) goto L_0x0b64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:628:0x0b64, code lost:
        r8.f(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:629:0x0b67, code lost:
        r9 = r32;
        r11 = (java.util.List) r9.get(r7.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:0x0b71, code lost:
        if (r11 == null) goto L_0x0b76;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:631:0x0b73, code lost:
        r8.e(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:632:0x0b76, code lost:
        if (r22 == null) goto L_0x0b98;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x0b78, code lost:
        r11 = new defpackage.zsx(r1, (defpackage.aqxx) r8.i(), r7);
        r7 = r21;
        r7.submit(r11);
        r33 = r6;
        r21 = r7;
        r32 = r9;
        r26 = r12;
        r25 = r13;
        r24 = r14;
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:0x0b98, code lost:
        r3[r5] = (defpackage.aqxx) r8.i();
        r33 = r6;
        r21 = r21;
        r32 = r9;
        r5 = r5 + 1;
        r26 = r12;
        r25 = r13;
        r24 = r14;
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:636:0x0bba, code lost:
        throw new java.lang.InterruptedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:637:0x0bbb, code lost:
        r7 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x0bbd, code lost:
        if (r22 == null) goto L_0x0bfa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x0bbf, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:0x0bc0, code lost:
        if (r4 >= r2) goto L_0x0bfa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:?, code lost:
        r3[r4] = (defpackage.aqxx) r7.take().get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x0bce, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x0bfa, code lost:
        if (r20 == null) goto L_0x0bff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x0bfc, code lost:
        r20.shutdownNow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x0bff, code lost:
        monitor-enter(r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:668:?, code lost:
        r1.f = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:669:0x0c04, code lost:
        monitor-exit(r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:670:0x0c05, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:671:0x0c06, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:0x0c09, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x0c0a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:676:0x0c0b, code lost:
        r2 = r0;
        r5 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:677:0x0c0e, code lost:
        if (r5 != null) goto L_0x0c10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:679:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x0c13, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x0c14, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:0x0c15, code lost:
        r2 = r0;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x0c17, code lost:
        if (r5 != null) goto L_0x0c19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x0c19, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x0c1c, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x0c1d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:687:0x0c1e, code lost:
        r2 = r0;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:688:0x0c20, code lost:
        if (r5 != null) goto L_0x0c22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:0x0c22, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x0c25, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:0x0c26, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x0c27, code lost:
        r2 = r0;
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:0x0c29, code lost:
        if (r5 != null) goto L_0x0c2b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x0c2b, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x0c2e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:0x0c2f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x0c30, code lost:
        r2 = r0;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:698:0x0c32, code lost:
        if (r5 != null) goto L_0x0c34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:0x0c34, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:700:0x0c37, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:701:0x0c38, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:702:0x0c39, code lost:
        r2 = r0;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:703:0x0c3b, code lost:
        if (r5 != null) goto L_0x0c3d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x0c3d, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:705:0x0c40, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:769:0x02b4, code lost:
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:773:0x03ac, code lost:
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:776:0x03ac, code lost:
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:777:0x04aa, code lost:
        r32 = r32;
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:779:0x04aa, code lost:
        r32 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:785:0x05f9, code lost:
        r24 = r24;
        r23 = r23;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0468 A[Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }, ExcHandler: all (r0v62 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }]), Splitter:B:209:0x03f9] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0554 A[Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }, ExcHandler: all (r0v54 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }]), Splitter:B:254:0x04aa] */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0754 A[Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:340:0x05f9] */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x07ae A[SYNTHETIC, Splitter:B:433:0x07ae] */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x07b7 A[Catch:{ SQLiteException -> 0x0930, all -> 0x092b }] */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x07bc A[Catch:{ SQLiteException -> 0x0930, all -> 0x092b }] */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x07c6 A[LOOP:7: B:442:0x07c6->B:789:0x07c6, LOOP_START, PHI: r2 r27 
      PHI: (r2v48 android.database.Cursor) = (r2v44 android.database.Cursor), (r2v51 android.database.Cursor) binds: [B:441:0x07c4, B:789:0x07c6] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r27v6 android.database.Cursor) = (r27v0 android.database.Cursor), (r27v14 android.database.Cursor) binds: [B:441:0x07c4, B:789:0x07c6] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:442:0x07c6] */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x0901 A[Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }] */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x093a A[Catch:{ all -> 0x0c0a }] */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x094d A[Catch:{ all -> 0x0c0a }] */
    /* JADX WARNING: Removed duplicated region for block: B:678:0x0c10 A[SYNTHETIC, Splitter:B:678:0x0c10] */
    /* JADX WARNING: Removed duplicated region for block: B:684:0x0c19 A[Catch:{ ExecutionException -> 0x0bd7, InterruptedException -> 0x0bd1, all -> 0x0cae, all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:689:0x0c22 A[Catch:{ ExecutionException -> 0x0bd7, InterruptedException -> 0x0bd1, all -> 0x0cae, all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:694:0x0c2b A[Catch:{ ExecutionException -> 0x0bd7, InterruptedException -> 0x0bd1, all -> 0x0cae, all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:699:0x0c34 A[Catch:{ ExecutionException -> 0x0bd7, InterruptedException -> 0x0bd1, all -> 0x0cae, all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:704:0x0c3d A[Catch:{ ExecutionException -> 0x0bd7, InterruptedException -> 0x0bd1, all -> 0x0cae, all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:709:0x0c48 A[Catch:{ ExecutionException -> 0x0bd7, InterruptedException -> 0x0bd1, all -> 0x0cae, all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:735:0x0caa A[SYNTHETIC, Splitter:B:735:0x0caa] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aqxx[] a(boolean r31, long r32) {
        /*
            r30 = this;
            r1 = r30
            java.lang.String r2 = "android.permission.READ_CONTACTS"
            boolean r2 = defpackage.zsm.a(r2)
            r3 = 0
            if (r2 != 0) goto L_0x0015
            zsg r2 = r1.g
            java.lang.String r4 = "Don't have READ_CONTACTS permission; giving up reading contacts."
            r2.c(r4)
            aqxx[] r2 = new defpackage.aqxx[r3]
            return r2
        L_0x0015:
            monitor-enter(r30)
            long r4 = r1.f     // Catch:{ all -> 0x0cc6 }
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0020
            r4 = 1
            goto L_0x0021
        L_0x0020:
            r4 = 0
        L_0x0021:
            defpackage.iva.a((boolean) r4)     // Catch:{ all -> 0x0cc6 }
            monitor-exit(r30)     // Catch:{ all -> 0x0cc6 }
            if (r31 != 0) goto L_0x002f
            boolean r4 = defpackage.azfa.d()
            if (r4 == 0) goto L_0x002f
            r4 = 1
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            if (r4 == 0) goto L_0x0048
            r8 = 5
            r9 = 9
            aoru r8 = defpackage.jfb.a(r8, r9)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.ExecutorCompletionService r9 = new java.util.concurrent.ExecutorCompletionService     // Catch:{ all -> 0x003f }
            r9.<init>(r8)     // Catch:{ all -> 0x003f }
            goto L_0x004a
        L_0x003f:
            r0 = move-exception
            r2 = r0
            r5 = r8
            goto L_0x0cb6
        L_0x0044:
            r0 = move-exception
            r2 = r0
            goto L_0x0beb
        L_0x0048:
            r8 = 0
            r9 = 0
        L_0x004a:
            boolean r10 = defpackage.azfa.b()     // Catch:{ all -> 0x0cb0 }
            if (r10 != 0) goto L_0x0051
            goto L_0x005e
        L_0x0051:
            zsr r10 = new zsr     // Catch:{ all -> 0x0cb0 }
            android.content.Context r11 = r1.e     // Catch:{ all -> 0x0cb0 }
            r10.<init>(r11)     // Catch:{ all -> 0x0cb0 }
            java.util.Set r10 = r10.a()     // Catch:{ all -> 0x0cb0 }
            c = r10     // Catch:{ all -> 0x0cb0 }
        L_0x005e:
            r10 = r32
            java.util.HashMap r10 = r1.c((long) r10)     // Catch:{ all -> 0x0cb0 }
            java.util.HashSet r11 = new java.util.HashSet     // Catch:{ all -> 0x0cb0 }
            java.util.Set r10 = r10.keySet()     // Catch:{ all -> 0x0cb0 }
            r11.<init>(r10)     // Catch:{ all -> 0x0cb0 }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ all -> 0x0cb0 }
            r10.<init>()     // Catch:{ all -> 0x0cb0 }
            android.content.Context r12 = r1.e     // Catch:{ all -> 0x0cb0 }
            android.content.ContentResolver r13 = r12.getContentResolver()     // Catch:{ all -> 0x0cb0 }
            android.net.Uri r14 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ SQLiteException -> 0x0c75, all -> 0x0c6f }
            java.lang.String[] r15 = i     // Catch:{ SQLiteException -> 0x0c75, all -> 0x0c6f }
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r12 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0c75, all -> 0x0c6f }
            if (r12 == 0) goto L_0x0c56
        L_0x0088:
            boolean r13 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x0c51, all -> 0x0c4c }
            if (r13 == 0) goto L_0x0128
            java.lang.String r13 = "_id"
            int r13 = r12.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            long r13 = r12.getLong(r13)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            java.lang.String r14 = "contact_id"
            int r14 = r12.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            long r14 = r12.getLong(r14)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            boolean r15 = r11.contains(r14)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            if (r15 == 0) goto L_0x0088
            zsy r15 = new zsy     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            java.lang.String r5 = "sourceid"
            int r5 = r12.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            java.lang.String r18 = r12.getString(r5)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            java.lang.String r5 = "account_type"
            int r5 = r12.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            java.lang.String r19 = r12.getString(r5)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            java.lang.String r5 = "account_name"
            int r5 = r12.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            java.lang.String r20 = r12.getString(r5)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            java.lang.String r5 = "data_set"
            int r5 = r12.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            java.lang.String r21 = r12.getString(r5)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            java.lang.String r5 = "times_contacted"
            int r5 = r12.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            long r16 = r12.getLong(r5)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            java.lang.Long r22 = java.lang.Long.valueOf(r16)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            java.lang.String r5 = "last_time_contacted"
            int r5 = r12.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            long r16 = r12.getLong(r5)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            java.lang.Long r23 = java.lang.Long.valueOf(r16)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            java.lang.String r5 = "starred"
            int r5 = r12.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            int r24 = r12.getInt(r5)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            r5 = r15
            r16 = r13
            r17 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            boolean r14 = r10.containsKey(r13)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            if (r14 == 0) goto L_0x0117
            zsg r5 = r1.g     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            java.lang.String r13 = "Raw contact id already exists, this should not happen."
            r5.d(r13)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            goto L_0x0088
        L_0x0117:
            r10.put(r13, r5)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011c }
            goto L_0x0088
        L_0x011c:
            r0 = move-exception
            r2 = r0
            r20 = r8
            goto L_0x0c69
        L_0x0122:
            r0 = move-exception
            r2 = r0
            r20 = r8
            goto L_0x0c6d
        L_0x0128:
            r12.close()     // Catch:{ all -> 0x0cb0 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x0cb0 }
            java.util.Set r11 = r10.keySet()     // Catch:{ all -> 0x0cb0 }
            r5.<init>(r11)     // Catch:{ all -> 0x0cb0 }
            java.util.Map r11 = r1.a((java.util.HashSet) r5)     // Catch:{ all -> 0x0cb0 }
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ all -> 0x0cb0 }
            r12.<init>()     // Catch:{ all -> 0x0cb0 }
            android.content.Context r13 = r1.e     // Catch:{ all -> 0x0cb0 }
            android.content.ContentResolver r14 = r13.getContentResolver()     // Catch:{ all -> 0x0cb0 }
            boolean r13 = defpackage.azdq.i()     // Catch:{ all -> 0x0cb0 }
            if (r13 == 0) goto L_0x0152
            java.lang.String[] r13 = t     // Catch:{ all -> 0x014c }
            goto L_0x0154
        L_0x014c:
            r0 = move-exception
            r2 = r0
            r20 = r8
            goto L_0x0cb4
        L_0x0152:
            java.lang.String[] r13 = r     // Catch:{ all -> 0x0cb0 }
        L_0x0154:
            boolean r15 = defpackage.azdq.i()     // Catch:{ all -> 0x0cb0 }
            if (r15 == 0) goto L_0x015d
            java.lang.String[] r15 = s     // Catch:{ all -> 0x014c }
            goto L_0x015f
        L_0x015d:
            java.lang.String[] r15 = q     // Catch:{ all -> 0x0cb0 }
        L_0x015f:
            android.net.Uri r16 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch:{ SQLiteException -> 0x0298, all -> 0x0291 }
            boolean r17 = p     // Catch:{ SQLiteException -> 0x0298, all -> 0x0291 }
            if (r17 == 0) goto L_0x0166
            goto L_0x0167
        L_0x0166:
            r13 = r15
        L_0x0167:
            r17 = 0
            r18 = 0
            r19 = 0
            r15 = r16
            r16 = r13
            android.database.Cursor r13 = r14.query(r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0298, all -> 0x0291 }
            if (r13 == 0) goto L_0x027e
        L_0x0177:
            boolean r14 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            if (r14 == 0) goto L_0x0285
            java.lang.String r14 = "raw_contact_id"
            int r14 = r13.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            long r14 = r13.getLong(r14)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            boolean r15 = r5.contains(r14)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            if (r15 == 0) goto L_0x0273
            java.lang.String r15 = "data1"
            int r15 = r13.getColumnIndex(r15)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            java.lang.String r15 = r13.getString(r15)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            java.lang.String r6 = "data2"
            int r6 = r13.getColumnIndex(r6)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            int r6 = r13.getInt(r6)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            java.lang.String r7 = "data3"
            int r7 = r13.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            java.lang.String r7 = r13.getString(r7)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            boolean r18 = r12.containsKey(r14)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            if (r18 != 0) goto L_0x01bd
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r12.put(r14, r2)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
        L_0x01bd:
            java.lang.Object r2 = r12.get(r14)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            aqxu r14 = defpackage.aqxu.h     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            aucd r14 = r14.o()     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            if (r15 == 0) goto L_0x01e0
            boolean r3 = r14.c     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            if (r3 != 0) goto L_0x01d0
        L_0x01cf:
            goto L_0x01d7
        L_0x01d0:
            r14.c()     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r3 = 0
            r14.c = r3     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            goto L_0x01cf
        L_0x01d7:
            aucj r3 = r14.b     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            aqxu r3 = (defpackage.aqxu) r3     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r15.getClass()     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r3.a = r15     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
        L_0x01e0:
            boolean r3 = r14.c     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            if (r3 != 0) goto L_0x01e5
            goto L_0x01eb
        L_0x01e5:
            r14.c()     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r3 = 0
            r14.c = r3     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
        L_0x01eb:
            aucj r3 = r14.b     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            aqxu r3 = (defpackage.aqxu) r3     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r3.e = r6     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            android.content.Context r3 = r1.e     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            java.lang.CharSequence r3 = android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabel(r3, r6, r7)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            java.lang.String r3 = r3.toString()     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            boolean r6 = r14.c     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            if (r6 != 0) goto L_0x0204
            goto L_0x020a
        L_0x0204:
            r14.c()     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r6 = 0
            r14.c = r6     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
        L_0x020a:
            aucj r6 = r14.b     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            aqxu r6 = (defpackage.aqxu) r6     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r3.getClass()     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r6.b = r3     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            boolean r3 = defpackage.azdq.i()     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            if (r3 == 0) goto L_0x023a
            java.lang.String r3 = "is_super_primary"
            int r3 = r13.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            int r3 = r13.getInt(r3)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r6 = 1
            if (r3 != r6) goto L_0x0228
            r3 = 1
            goto L_0x0229
        L_0x0228:
            r3 = 0
        L_0x0229:
            boolean r6 = r14.c     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            if (r6 != 0) goto L_0x022e
            goto L_0x0234
        L_0x022e:
            r14.c()     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r6 = 0
            r14.c = r6     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
        L_0x0234:
            aucj r6 = r14.b     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            aqxu r6 = (defpackage.aqxu) r6     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r6.g = r3     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
        L_0x023a:
            boolean r3 = p     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            if (r3 == 0) goto L_0x0265
            java.lang.String r3 = "times_used"
            int r3 = r13.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            int r3 = r13.getInt(r3)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            java.lang.String r6 = "last_time_used"
            int r6 = r13.getColumnIndex(r6)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            long r6 = r13.getLong(r6)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            boolean r15 = r14.c     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            if (r15 != 0) goto L_0x0257
            goto L_0x025d
        L_0x0257:
            r14.c()     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r15 = 0
            r14.c = r15     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
        L_0x025d:
            aucj r15 = r14.b     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            aqxu r15 = (defpackage.aqxu) r15     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r15.c = r3     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r15.d = r6     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
        L_0x0265:
            aucj r3 = r14.i()     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            aqxu r3 = (defpackage.aqxu) r3     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r2.add(r3)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            r3 = 0
            r6 = 0
            goto L_0x0177
        L_0x0273:
            r3 = 0
            r6 = 0
            goto L_0x0177
        L_0x0278:
            r0 = move-exception
            r2 = r0
            goto L_0x028c
        L_0x027b:
            r0 = move-exception
            r2 = r0
            goto L_0x029b
        L_0x027e:
            zsg r2 = r1.g     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
            java.lang.String r3 = "Could not query ContactsProvider to fetch Phone info; disabled? Give up."
            r2.c(r3)     // Catch:{ SQLiteException -> 0x027b, all -> 0x0278 }
        L_0x0285:
            if (r13 != 0) goto L_0x0288
            goto L_0x02a5
        L_0x0288:
            r13.close()     // Catch:{ all -> 0x014c }
            goto L_0x02a5
        L_0x028c:
            r20 = r8
            r5 = r13
            goto L_0x0c46
        L_0x0291:
            r0 = move-exception
            r2 = r0
            r20 = r8
            r5 = 0
            goto L_0x0c46
        L_0x0298:
            r0 = move-exception
            r2 = r0
            r13 = 0
        L_0x029b:
            zsg r3 = r1.g     // Catch:{ all -> 0x0c41 }
            java.lang.String r6 = "ContentResolver.query threw an exception when fetching phone info"
            r3.a((java.lang.Throwable) r2, (java.lang.String) r6)     // Catch:{ all -> 0x0c41 }
            if (r13 == 0) goto L_0x02a5
            goto L_0x0288
        L_0x02a5:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0cb0 }
            r2.<init>()     // Catch:{ all -> 0x0cb0 }
            java.lang.String r3 = "vnd.android.cursor.item/website"
            java.lang.String[] r6 = j     // Catch:{ SQLiteException -> 0x0380, all -> 0x0379 }
            android.database.Cursor r3 = r1.a((java.lang.String) r3, (java.lang.String[]) r6)     // Catch:{ SQLiteException -> 0x0380, all -> 0x0379 }
            if (r3 == 0) goto L_0x0366
        L_0x02b4:
            boolean r6 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0361, all -> 0x035c }
            if (r6 == 0) goto L_0x0359
            java.lang.String r6 = "raw_contact_id"
            int r6 = r3.getColumnIndex(r6)     // Catch:{ SQLiteException -> 0x0361, all -> 0x035c }
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0361, all -> 0x035c }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x0361, all -> 0x035c }
            boolean r7 = r5.contains(r6)     // Catch:{ SQLiteException -> 0x0361, all -> 0x035c }
            if (r7 == 0) goto L_0x0355
            java.lang.String r7 = "data1"
            int r7 = r3.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x0361, all -> 0x035c }
            java.lang.String r7 = r3.getString(r7)     // Catch:{ SQLiteException -> 0x0361, all -> 0x035c }
            java.lang.String r13 = "data2"
            int r13 = r3.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x0361, all -> 0x035c }
            int r13 = r3.getInt(r13)     // Catch:{ SQLiteException -> 0x0361, all -> 0x035c }
            java.lang.String r14 = "data3"
            int r14 = r3.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x0361, all -> 0x035c }
            java.lang.String r14 = r3.getString(r14)     // Catch:{ SQLiteException -> 0x0361, all -> 0x035c }
            boolean r15 = r2.containsKey(r6)     // Catch:{ SQLiteException -> 0x0361, all -> 0x035c }
            if (r15 != 0) goto L_0x0307
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0301, all -> 0x02fb }
            r15.<init>()     // Catch:{ SQLiteException -> 0x0301, all -> 0x02fb }
            r2.put(r6, r15)     // Catch:{ SQLiteException -> 0x0301, all -> 0x02fb }
            goto L_0x0307
        L_0x02fb:
            r0 = move-exception
            r2 = r0
            r20 = r8
            goto L_0x0374
        L_0x0301:
            r0 = move-exception
            r6 = r0
            r20 = r8
            goto L_0x0385
        L_0x0307:
            java.lang.Object r6 = r2.get(r6)     // Catch:{ SQLiteException -> 0x0361, all -> 0x035c }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ SQLiteException -> 0x0361, all -> 0x035c }
            aqye r15 = defpackage.aqye.d     // Catch:{ SQLiteException -> 0x0361, all -> 0x035c }
            aucd r15 = r15.o()     // Catch:{ SQLiteException -> 0x0361, all -> 0x035c }
            if (r7 == 0) goto L_0x032d
            r20 = r8
            boolean r8 = r15.c     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
            if (r8 != 0) goto L_0x031c
        L_0x031b:
            goto L_0x0323
        L_0x031c:
            r15.c()     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
            r8 = 0
            r15.c = r8     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
            goto L_0x031b
        L_0x0323:
            aucj r8 = r15.b     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
            aqye r8 = (defpackage.aqye) r8     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
            r7.getClass()     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
            r8.a = r7     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
            goto L_0x032f
        L_0x032d:
            r20 = r8
        L_0x032f:
            boolean r7 = r15.c     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
            if (r7 != 0) goto L_0x0334
            goto L_0x033a
        L_0x0334:
            r15.c()     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
            r7 = 0
            r15.c = r7     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
        L_0x033a:
            aucj r7 = r15.b     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
            aqye r7 = (defpackage.aqye) r7     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
            r7.b = r13     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
            if (r14 != 0) goto L_0x0343
            goto L_0x0348
        L_0x0343:
            r14.getClass()     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
            r7.c = r14     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
        L_0x0348:
            aucj r7 = r15.i()     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
            aqye r7 = (defpackage.aqye) r7     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
            r6.add(r7)     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
            r8 = r20
            goto L_0x02b4
        L_0x0355:
            r20 = r8
            goto L_0x02b4
        L_0x0359:
            r20 = r8
            goto L_0x036f
        L_0x035c:
            r0 = move-exception
            r20 = r8
        L_0x035f:
            r2 = r0
            goto L_0x0374
        L_0x0361:
            r0 = move-exception
            r20 = r8
        L_0x0364:
            r6 = r0
            goto L_0x0385
        L_0x0366:
            r20 = r8
            zsg r6 = r1.g     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
            java.lang.String r7 = "Could not query ContactsProvider to fetch Website info; disabled? Give up."
            r6.c(r7)     // Catch:{ SQLiteException -> 0x0377, all -> 0x0372 }
        L_0x036f:
            if (r3 != 0) goto L_0x038e
            goto L_0x0391
        L_0x0372:
            r0 = move-exception
            goto L_0x035f
        L_0x0374:
            r5 = r3
            goto L_0x0c3b
        L_0x0377:
            r0 = move-exception
            goto L_0x0364
        L_0x0379:
            r0 = move-exception
            r20 = r8
            r2 = r0
            r5 = 0
            goto L_0x0c3b
        L_0x0380:
            r0 = move-exception
            r20 = r8
            r6 = r0
            r3 = 0
        L_0x0385:
            zsg r7 = r1.g     // Catch:{ all -> 0x0c38 }
            java.lang.String r8 = "ContentResolver.query threw an exception when fetching website info"
            r7.a((java.lang.Throwable) r6, (java.lang.String) r8)     // Catch:{ all -> 0x0c38 }
            if (r3 == 0) goto L_0x0391
        L_0x038e:
            r3.close()     // Catch:{ all -> 0x0cae }
        L_0x0391:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0cae }
            r3.<init>()     // Catch:{ all -> 0x0cae }
            android.content.Context r6 = r1.e     // Catch:{ all -> 0x0cae }
            android.content.ContentResolver r21 = r6.getContentResolver()     // Catch:{ all -> 0x0cae }
            android.net.Uri r22 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI     // Catch:{ SQLiteException -> 0x0486, all -> 0x0481 }
            java.lang.String[] r23 = y     // Catch:{ SQLiteException -> 0x0486, all -> 0x0481 }
            r24 = 0
            r25 = 0
            r26 = 0
            android.database.Cursor r6 = r21.query(r22, r23, r24, r25, r26)     // Catch:{ SQLiteException -> 0x0486, all -> 0x0481 }
            if (r6 == 0) goto L_0x0470
        L_0x03ac:
            boolean r7 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x046b, all -> 0x0468 }
            if (r7 == 0) goto L_0x0465
            java.lang.String r7 = "raw_contact_id"
            int r7 = r6.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x046b, all -> 0x0468 }
            long r7 = r6.getLong(r7)     // Catch:{ SQLiteException -> 0x046b, all -> 0x0468 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x046b, all -> 0x0468 }
            boolean r8 = r5.contains(r7)     // Catch:{ SQLiteException -> 0x046b, all -> 0x0468 }
            if (r8 == 0) goto L_0x0461
            java.lang.String r8 = "data1"
            int r8 = r6.getColumnIndex(r8)     // Catch:{ SQLiteException -> 0x046b, all -> 0x0468 }
            java.lang.String r8 = r6.getString(r8)     // Catch:{ SQLiteException -> 0x046b, all -> 0x0468 }
            java.lang.String r13 = "data2"
            int r13 = r6.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x046b, all -> 0x0468 }
            int r13 = r6.getInt(r13)     // Catch:{ SQLiteException -> 0x046b, all -> 0x0468 }
            java.lang.String r14 = "data3"
            int r14 = r6.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x046b, all -> 0x0468 }
            java.lang.String r14 = r6.getString(r14)     // Catch:{ SQLiteException -> 0x046b, all -> 0x0468 }
            boolean r15 = r3.containsKey(r7)     // Catch:{ SQLiteException -> 0x046b, all -> 0x0468 }
            if (r15 != 0) goto L_0x03f9
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x03f3, all -> 0x0468 }
            r15.<init>()     // Catch:{ SQLiteException -> 0x03f3, all -> 0x0468 }
            r3.put(r7, r15)     // Catch:{ SQLiteException -> 0x03f3, all -> 0x0468 }
            goto L_0x03f9
        L_0x03f3:
            r0 = move-exception
            r7 = r0
            r21 = r9
            goto L_0x048b
        L_0x03f9:
            java.lang.Object r7 = r3.get(r7)     // Catch:{ SQLiteException -> 0x046b, all -> 0x0468 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ SQLiteException -> 0x046b, all -> 0x0468 }
            aqxv r15 = defpackage.aqxv.f     // Catch:{ SQLiteException -> 0x046b, all -> 0x0468 }
            aucd r15 = r15.o()     // Catch:{ SQLiteException -> 0x046b, all -> 0x0468 }
            if (r8 == 0) goto L_0x041f
            r21 = r9
            boolean r9 = r15.c     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            if (r9 != 0) goto L_0x040e
        L_0x040d:
            goto L_0x0415
        L_0x040e:
            r15.c()     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            r9 = 0
            r15.c = r9     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            goto L_0x040d
        L_0x0415:
            aucj r9 = r15.b     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            aqxv r9 = (defpackage.aqxv) r9     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            r8.getClass()     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            r9.a = r8     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            goto L_0x0421
        L_0x041f:
            r21 = r9
        L_0x0421:
            boolean r8 = r15.c     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            if (r8 != 0) goto L_0x0426
            goto L_0x042c
        L_0x0426:
            r15.c()     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            r8 = 0
            r15.c = r8     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
        L_0x042c:
            aucj r8 = r15.b     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            aqxv r8 = (defpackage.aqxv) r8     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            r8.c = r13     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            android.content.Context r8 = r1.e     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            java.lang.CharSequence r8 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabel(r8, r13, r14)     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            java.lang.String r8 = r8.toString()     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            boolean r9 = r15.c     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            if (r9 != 0) goto L_0x0445
            goto L_0x044b
        L_0x0445:
            r15.c()     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            r9 = 0
            r15.c = r9     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
        L_0x044b:
            aucj r9 = r15.b     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            aqxv r9 = (defpackage.aqxv) r9     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            r8.getClass()     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            r9.b = r8     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            aucj r8 = r15.i()     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            aqxv r8 = (defpackage.aqxv) r8     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            r7.add(r8)     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            r9 = r21
            goto L_0x03ac
        L_0x0461:
            r21 = r9
            goto L_0x03ac
        L_0x0465:
            r21 = r9
            goto L_0x0479
        L_0x0468:
            r0 = move-exception
            r2 = r0
            goto L_0x047c
        L_0x046b:
            r0 = move-exception
            r21 = r9
        L_0x046e:
            r7 = r0
            goto L_0x048b
        L_0x0470:
            r21 = r9
            zsg r7 = r1.g     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
            java.lang.String r8 = "Could not query ContactsProvider to fetch Postal info; disabled? Give up."
            r7.c(r8)     // Catch:{ SQLiteException -> 0x047f, all -> 0x0468 }
        L_0x0479:
            if (r6 != 0) goto L_0x0494
            goto L_0x0497
        L_0x047c:
            r5 = r6
            goto L_0x0c32
        L_0x047f:
            r0 = move-exception
            goto L_0x046e
        L_0x0481:
            r0 = move-exception
            r2 = r0
            r5 = 0
            goto L_0x0c32
        L_0x0486:
            r0 = move-exception
            r21 = r9
            r7 = r0
            r6 = 0
        L_0x048b:
            zsg r8 = r1.g     // Catch:{ all -> 0x0c2f }
            java.lang.String r9 = "ContentResolver.query threw an exception when fetching postal info"
            r8.a((java.lang.Throwable) r7, (java.lang.String) r9)     // Catch:{ all -> 0x0c2f }
            if (r6 == 0) goto L_0x0497
        L_0x0494:
            r6.close()     // Catch:{ all -> 0x0cae }
        L_0x0497:
            java.util.Map r6 = r1.b((java.util.HashSet) r5)     // Catch:{ all -> 0x0cae }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0cae }
            r7.<init>()     // Catch:{ all -> 0x0cae }
            java.lang.String r8 = "vnd.android.cursor.item/relation"
            java.lang.String[] r9 = l     // Catch:{ SQLiteException -> 0x0579, all -> 0x0574 }
            android.database.Cursor r8 = r1.a((java.lang.String) r8, (java.lang.String[]) r9)     // Catch:{ SQLiteException -> 0x0579, all -> 0x0574 }
            if (r8 == 0) goto L_0x055e
        L_0x04aa:
            boolean r9 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x0557, all -> 0x0554 }
            if (r9 == 0) goto L_0x054f
            java.lang.String r9 = "raw_contact_id"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ SQLiteException -> 0x0557, all -> 0x0554 }
            long r13 = r8.getLong(r9)     // Catch:{ SQLiteException -> 0x0557, all -> 0x0554 }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteException -> 0x0557, all -> 0x0554 }
            boolean r13 = r5.contains(r9)     // Catch:{ SQLiteException -> 0x0557, all -> 0x0554 }
            if (r13 == 0) goto L_0x0549
            java.lang.String r13 = "data1"
            int r13 = r8.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x0557, all -> 0x0554 }
            java.lang.String r13 = r8.getString(r13)     // Catch:{ SQLiteException -> 0x0557, all -> 0x0554 }
            java.lang.String r14 = "data2"
            int r14 = r8.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x0557, all -> 0x0554 }
            int r14 = r8.getInt(r14)     // Catch:{ SQLiteException -> 0x0557, all -> 0x0554 }
            java.lang.String r15 = "data3"
            int r15 = r8.getColumnIndex(r15)     // Catch:{ SQLiteException -> 0x0557, all -> 0x0554 }
            java.lang.String r15 = r8.getString(r15)     // Catch:{ SQLiteException -> 0x0557, all -> 0x0554 }
            boolean r22 = r7.containsKey(r9)     // Catch:{ SQLiteException -> 0x0557, all -> 0x0554 }
            if (r22 != 0) goto L_0x04f3
            r22 = r4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0545, all -> 0x0554 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0545, all -> 0x0554 }
            r7.put(r9, r4)     // Catch:{ SQLiteException -> 0x0545, all -> 0x0554 }
            goto L_0x04f5
        L_0x04f3:
            r22 = r4
        L_0x04f5:
            java.lang.Object r4 = r7.get(r9)     // Catch:{ SQLiteException -> 0x0545, all -> 0x0554 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ SQLiteException -> 0x0545, all -> 0x0554 }
            aqyc r9 = defpackage.aqyc.d     // Catch:{ SQLiteException -> 0x0545, all -> 0x0554 }
            aucd r9 = r9.o()     // Catch:{ SQLiteException -> 0x0545, all -> 0x0554 }
            if (r13 == 0) goto L_0x051b
            r32 = r3
            boolean r3 = r9.c     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
            if (r3 != 0) goto L_0x050a
        L_0x0509:
            goto L_0x0511
        L_0x050a:
            r9.c()     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
            r3 = 0
            r9.c = r3     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
            goto L_0x0509
        L_0x0511:
            aucj r3 = r9.b     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
            aqyc r3 = (defpackage.aqyc) r3     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
            r13.getClass()     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
            r3.a = r13     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
            goto L_0x051d
        L_0x051b:
            r32 = r3
        L_0x051d:
            boolean r3 = r9.c     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
            if (r3 != 0) goto L_0x0522
            goto L_0x0528
        L_0x0522:
            r9.c()     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
            r3 = 0
            r9.c = r3     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
        L_0x0528:
            aucj r3 = r9.b     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
            aqyc r3 = (defpackage.aqyc) r3     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
            r3.b = r14     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
            if (r15 != 0) goto L_0x0531
            goto L_0x0536
        L_0x0531:
            r15.getClass()     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
            r3.c = r15     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
        L_0x0536:
            aucj r3 = r9.i()     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
            aqyc r3 = (defpackage.aqyc) r3     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
            r4.add(r3)     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
            r3 = r32
            r4 = r22
            goto L_0x04aa
        L_0x0545:
            r0 = move-exception
            r32 = r3
            goto L_0x055c
        L_0x0549:
            r32 = r3
            r22 = r4
            goto L_0x04aa
        L_0x054f:
            r32 = r3
            r22 = r4
            goto L_0x0569
        L_0x0554:
            r0 = move-exception
            r2 = r0
            goto L_0x056f
        L_0x0557:
            r0 = move-exception
            r32 = r3
            r22 = r4
        L_0x055c:
            r3 = r0
            goto L_0x0580
        L_0x055e:
            r32 = r3
            r22 = r4
            zsg r3 = r1.g     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
            java.lang.String r4 = "Could not query CP2 to fetch relation info; disabled? Give up."
            r3.c(r4)     // Catch:{ SQLiteException -> 0x0572, all -> 0x0554 }
        L_0x0569:
            if (r8 == 0) goto L_0x058a
        L_0x056b:
            r8.close()     // Catch:{ all -> 0x0cae }
            goto L_0x058a
        L_0x056f:
            r5 = r8
            goto L_0x0c29
        L_0x0572:
            r0 = move-exception
            goto L_0x055c
        L_0x0574:
            r0 = move-exception
            r2 = r0
            r5 = 0
            goto L_0x0c29
        L_0x0579:
            r0 = move-exception
            r32 = r3
            r22 = r4
            r3 = r0
            r8 = 0
        L_0x0580:
            zsg r4 = r1.g     // Catch:{ all -> 0x0c26 }
            java.lang.String r9 = "ContentResolver.query threw an exception when fetching relation info"
            r4.a((java.lang.Throwable) r3, (java.lang.String) r9)     // Catch:{ all -> 0x0c26 }
            if (r8 == 0) goto L_0x058a
            goto L_0x056b
        L_0x058a:
            r1.a((java.util.Map) r10)     // Catch:{ all -> 0x0cae }
            java.lang.String r3 = "vnd.android.cursor.item/note"
            java.lang.String[] r4 = B     // Catch:{ SQLiteException -> 0x05df, all -> 0x05da }
            android.database.Cursor r3 = r1.a((java.lang.String) r3, (java.lang.String[]) r4)     // Catch:{ SQLiteException -> 0x05df, all -> 0x05da }
            if (r3 == 0) goto L_0x05ca
        L_0x0597:
            boolean r4 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x05c7, all -> 0x05c4 }
            if (r4 == 0) goto L_0x05d1
            java.lang.String r4 = "raw_contact_id"
            int r4 = r3.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x05c7, all -> 0x05c4 }
            long r8 = r3.getLong(r4)     // Catch:{ SQLiteException -> 0x05c7, all -> 0x05c4 }
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteException -> 0x05c7, all -> 0x05c4 }
            boolean r8 = r10.containsKey(r4)     // Catch:{ SQLiteException -> 0x05c7, all -> 0x05c4 }
            if (r8 == 0) goto L_0x0597
            java.lang.String r8 = "data1"
            int r8 = r3.getColumnIndex(r8)     // Catch:{ SQLiteException -> 0x05c7, all -> 0x05c4 }
            java.lang.String r8 = r3.getString(r8)     // Catch:{ SQLiteException -> 0x05c7, all -> 0x05c4 }
            java.lang.Object r4 = r10.get(r4)     // Catch:{ SQLiteException -> 0x05c7, all -> 0x05c4 }
            zsy r4 = (defpackage.zsy) r4     // Catch:{ SQLiteException -> 0x05c7, all -> 0x05c4 }
            r4.j = r8     // Catch:{ SQLiteException -> 0x05c7, all -> 0x05c4 }
            goto L_0x0597
        L_0x05c4:
            r0 = move-exception
            r2 = r0
            goto L_0x05d7
        L_0x05c7:
            r0 = move-exception
            r4 = r0
            goto L_0x05e2
        L_0x05ca:
            zsg r4 = r1.g     // Catch:{ SQLiteException -> 0x05c7, all -> 0x05c4 }
            java.lang.String r8 = "Could not query ContactsProvider to fetch Note info; disabled? Give up."
            r4.c(r8)     // Catch:{ SQLiteException -> 0x05c7, all -> 0x05c4 }
        L_0x05d1:
            if (r3 == 0) goto L_0x05ec
        L_0x05d3:
            r3.close()     // Catch:{ all -> 0x0cae }
            goto L_0x05ec
        L_0x05d7:
            r5 = r3
            goto L_0x0c20
        L_0x05da:
            r0 = move-exception
            r2 = r0
            r5 = 0
            goto L_0x0c20
        L_0x05df:
            r0 = move-exception
            r4 = r0
            r3 = 0
        L_0x05e2:
            zsg r8 = r1.g     // Catch:{ all -> 0x0c1d }
            java.lang.String r9 = "ContentResolver.query threw an exception when fetching note info"
            r8.a((java.lang.Throwable) r4, (java.lang.String) r9)     // Catch:{ all -> 0x0c1d }
            if (r3 == 0) goto L_0x05ec
            goto L_0x05d3
        L_0x05ec:
            r1.b((java.util.Map) r10)     // Catch:{ all -> 0x0cae }
            java.lang.String r3 = "vnd.android.cursor.item/organization"
            java.lang.String[] r4 = m     // Catch:{ SQLiteException -> 0x0796, all -> 0x0791 }
            android.database.Cursor r3 = r1.a((java.lang.String) r3, (java.lang.String[]) r4)     // Catch:{ SQLiteException -> 0x0796, all -> 0x0791 }
            if (r3 == 0) goto L_0x076a
        L_0x05f9:
            boolean r4 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0759, all -> 0x0754 }
            if (r4 == 0) goto L_0x0745
            java.lang.String r4 = "raw_contact_id"
            int r4 = r3.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x0759, all -> 0x0754 }
            long r8 = r3.getLong(r4)     // Catch:{ SQLiteException -> 0x0759, all -> 0x0754 }
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteException -> 0x0759, all -> 0x0754 }
            boolean r8 = r10.containsKey(r4)     // Catch:{ SQLiteException -> 0x0759, all -> 0x0754 }
            if (r8 == 0) goto L_0x0735
            java.lang.String r8 = "data1"
            int r8 = r3.getColumnIndex(r8)     // Catch:{ SQLiteException -> 0x0759, all -> 0x0754 }
            java.lang.String r8 = r3.getString(r8)     // Catch:{ SQLiteException -> 0x0759, all -> 0x0754 }
            java.lang.String r9 = "data2"
            int r9 = r3.getColumnIndex(r9)     // Catch:{ SQLiteException -> 0x0759, all -> 0x0754 }
            int r9 = r3.getInt(r9)     // Catch:{ SQLiteException -> 0x0759, all -> 0x0754 }
            java.lang.String r13 = "data3"
            int r13 = r3.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x0759, all -> 0x0754 }
            java.lang.String r13 = r3.getString(r13)     // Catch:{ SQLiteException -> 0x0759, all -> 0x0754 }
            java.lang.String r14 = "data4"
            int r14 = r3.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x0759, all -> 0x0754 }
            java.lang.String r14 = r3.getString(r14)     // Catch:{ SQLiteException -> 0x0759, all -> 0x0754 }
            java.lang.String r15 = "data5"
            int r15 = r3.getColumnIndex(r15)     // Catch:{ SQLiteException -> 0x0759, all -> 0x0754 }
            java.lang.String r15 = r3.getString(r15)     // Catch:{ SQLiteException -> 0x0759, all -> 0x0754 }
            r33 = r7
            java.lang.String r7 = "data6"
            int r7 = r3.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x072b, all -> 0x0754 }
            java.lang.String r7 = r3.getString(r7)     // Catch:{ SQLiteException -> 0x072b, all -> 0x0754 }
            r23 = r6
            java.lang.String r6 = "data7"
            int r6 = r3.getColumnIndex(r6)     // Catch:{ SQLiteException -> 0x0723, all -> 0x0754 }
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0723, all -> 0x0754 }
            r24 = r2
            java.lang.String r2 = "data8"
            int r2 = r3.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x0721, all -> 0x0754 }
            java.lang.String r2 = r3.getString(r2)     // Catch:{ SQLiteException -> 0x0721, all -> 0x0754 }
            r25 = r12
            java.lang.String r12 = "data9"
            int r12 = r3.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x0719, all -> 0x0754 }
            java.lang.String r12 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x0719, all -> 0x0754 }
            r26 = r11
            java.lang.String r11 = "data10"
            int r11 = r3.getColumnIndex(r11)     // Catch:{ SQLiteException -> 0x0712, all -> 0x0754 }
            java.lang.String r11 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0712, all -> 0x0754 }
            aqya r27 = defpackage.aqya.k     // Catch:{ SQLiteException -> 0x0712, all -> 0x0754 }
            r28 = r5
            aucd r5 = r27.o()     // Catch:{ SQLiteException -> 0x070d, all -> 0x0754 }
            if (r8 == 0) goto L_0x06a3
            r27 = r3
            boolean r3 = r5.c     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            if (r3 != 0) goto L_0x0692
        L_0x0691:
            goto L_0x0699
        L_0x0692:
            r5.c()     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            r3 = 0
            r5.c = r3     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            goto L_0x0691
        L_0x0699:
            aucj r3 = r5.b     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            aqya r3 = (defpackage.aqya) r3     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            r8.getClass()     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            r3.a = r8     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            goto L_0x06a5
        L_0x06a3:
            r27 = r3
        L_0x06a5:
            boolean r3 = r5.c     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            if (r3 != 0) goto L_0x06aa
            goto L_0x06b0
        L_0x06aa:
            r5.c()     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            r3 = 0
            r5.c = r3     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
        L_0x06b0:
            aucj r3 = r5.b     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            aqya r3 = (defpackage.aqya) r3     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            r3.b = r9     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            if (r13 == 0) goto L_0x06bd
            r13.getClass()     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            r3.c = r13     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
        L_0x06bd:
            if (r14 == 0) goto L_0x06c4
            r14.getClass()     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            r3.d = r14     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
        L_0x06c4:
            if (r15 == 0) goto L_0x06cb
            r15.getClass()     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            r3.e = r15     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
        L_0x06cb:
            if (r7 == 0) goto L_0x06d2
            r7.getClass()     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            r3.f = r7     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
        L_0x06d2:
            if (r6 == 0) goto L_0x06d9
            r6.getClass()     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            r3.g = r6     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
        L_0x06d9:
            if (r2 == 0) goto L_0x06e0
            r2.getClass()     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            r3.h = r2     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
        L_0x06e0:
            if (r12 == 0) goto L_0x06e7
            r12.getClass()     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            r3.i = r12     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
        L_0x06e7:
            if (r11 != 0) goto L_0x06ea
            goto L_0x06ef
        L_0x06ea:
            r11.getClass()     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            r3.j = r11     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
        L_0x06ef:
            java.lang.Object r2 = r10.get(r4)     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            zsy r2 = (defpackage.zsy) r2     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            aucj r3 = r5.i()     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            aqya r3 = (defpackage.aqya) r3     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            r2.m = r3     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            r7 = r33
            r6 = r23
            r2 = r24
            r12 = r25
            r11 = r26
            r3 = r27
            r5 = r28
            goto L_0x05f9
        L_0x070d:
            r0 = move-exception
            r27 = r3
            goto L_0x0768
        L_0x0712:
            r0 = move-exception
            r27 = r3
            r28 = r5
            goto L_0x0768
        L_0x0719:
            r0 = move-exception
            r27 = r3
            r28 = r5
            r26 = r11
            goto L_0x0768
        L_0x0721:
            r0 = move-exception
            goto L_0x0726
        L_0x0723:
            r0 = move-exception
            r24 = r2
        L_0x0726:
            r27 = r3
            r28 = r5
            goto L_0x0764
        L_0x072b:
            r0 = move-exception
            r24 = r2
            r27 = r3
            r28 = r5
            r23 = r6
            goto L_0x0764
        L_0x0735:
            r24 = r2
            r27 = r3
            r28 = r5
            r23 = r6
            r33 = r7
            r26 = r11
            r25 = r12
            goto L_0x05f9
        L_0x0745:
            r24 = r2
            r27 = r3
            r28 = r5
            r23 = r6
            r33 = r7
            r26 = r11
            r25 = r12
            goto L_0x077f
        L_0x0754:
            r0 = move-exception
            r27 = r3
        L_0x0757:
            r2 = r0
            goto L_0x0788
        L_0x0759:
            r0 = move-exception
            r24 = r2
            r27 = r3
            r28 = r5
            r23 = r6
            r33 = r7
        L_0x0764:
            r26 = r11
            r25 = r12
        L_0x0768:
            r2 = r0
            goto L_0x078e
        L_0x076a:
            r24 = r2
            r27 = r3
            r28 = r5
            r23 = r6
            r33 = r7
            r26 = r11
            r25 = r12
            zsg r2 = r1.g     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
            java.lang.String r3 = "Could not query CP2 to fetch Organization info; disabled? Give up."
            r2.c(r3)     // Catch:{ SQLiteException -> 0x078c, all -> 0x0786 }
        L_0x077f:
            if (r27 != 0) goto L_0x0782
            goto L_0x07b1
        L_0x0782:
            r27.close()     // Catch:{ all -> 0x0cae }
            goto L_0x07b1
        L_0x0786:
            r0 = move-exception
            goto L_0x0757
        L_0x0788:
            r5 = r27
            goto L_0x0c17
        L_0x078c:
            r0 = move-exception
            goto L_0x0768
        L_0x078e:
            r3 = r27
            goto L_0x07a5
        L_0x0791:
            r0 = move-exception
            r2 = r0
            r5 = 0
            goto L_0x0c17
        L_0x0796:
            r0 = move-exception
            r24 = r2
            r28 = r5
            r23 = r6
            r33 = r7
            r26 = r11
            r25 = r12
            r2 = r0
            r3 = 0
        L_0x07a5:
            zsg r4 = r1.g     // Catch:{ all -> 0x0c14 }
            java.lang.String r5 = "ContentResolver.query threw an exception when fetching organization info"
            r4.a((java.lang.Throwable) r2, (java.lang.String) r5)     // Catch:{ all -> 0x0c14 }
            if (r3 == 0) goto L_0x07b1
            r3.close()     // Catch:{ all -> 0x0cae }
        L_0x07b1:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException -> 0x0930, all -> 0x092b }
            r3 = 24
            if (r2 >= r3) goto L_0x07bc
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException -> 0x0930, all -> 0x092b }
            java.lang.String[] r2 = n     // Catch:{ SQLiteException -> 0x0930, all -> 0x092b }
            goto L_0x07be
        L_0x07bc:
            java.lang.String[] r2 = o     // Catch:{ SQLiteException -> 0x0930, all -> 0x092b }
        L_0x07be:
            java.lang.String r4 = "vnd.android.cursor.item/name"
            android.database.Cursor r2 = r1.a((java.lang.String) r4, (java.lang.String[]) r2)     // Catch:{ SQLiteException -> 0x0930, all -> 0x092b }
            if (r2 == 0) goto L_0x0901
        L_0x07c6:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            if (r4 == 0) goto L_0x08f4
            java.lang.String r4 = "raw_contact_id"
            int r4 = r2.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            long r4 = r2.getLong(r4)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            boolean r5 = r10.containsKey(r4)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            if (r5 == 0) goto L_0x08ee
            java.lang.String r5 = "data1"
            int r5 = r2.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r5 = r2.getString(r5)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r6 = "data2"
            int r6 = r2.getColumnIndex(r6)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r6 = r2.getString(r6)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r7 = "data5"
            int r7 = r2.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r7 = r2.getString(r7)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r8 = "data3"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r8 = r2.getString(r8)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r9 = "data10"
            int r9 = r2.getColumnIndex(r9)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            int r9 = r2.getInt(r9)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r11 = "data4"
            int r11 = r2.getColumnIndex(r11)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r11 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r12 = "data6"
            int r12 = r2.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r12 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r13 = "data7"
            int r13 = r2.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r13 = r2.getString(r13)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r14 = "data8"
            int r14 = r2.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r14 = r2.getString(r14)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r15 = "data9"
            int r15 = r2.getColumnIndex(r15)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.String r15 = r2.getString(r15)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            r19 = 0
            java.lang.Integer r27 = java.lang.Integer.valueOf(r19)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            r29 = r4
            r4 = 24
            if (r3 < r4) goto L_0x0866
            java.lang.String r3 = "data11"
            int r3 = r2.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            int r3 = r2.getInt(r3)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            java.lang.Integer r27 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
        L_0x0866:
            aqyd r3 = defpackage.aqyd.l     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            aucd r3 = r3.o()     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            int r4 = r27.intValue()     // Catch:{ SQLiteException -> 0x08fc, all -> 0x08f7 }
            r27 = r2
            boolean r2 = r3.c     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            if (r2 != 0) goto L_0x0877
            goto L_0x087d
        L_0x0877:
            r3.c()     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            r2 = 0
            r3.c = r2     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
        L_0x087d:
            aucj r2 = r3.b     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            aqyd r2 = (defpackage.aqyd) r2     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            r2.k = r4     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            int r2 = r9.intValue()     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            boolean r4 = r3.c     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            if (r4 != 0) goto L_0x088c
            goto L_0x0892
        L_0x088c:
            r3.c()     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            r4 = 0
            r3.c = r4     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
        L_0x0892:
            aucj r4 = r3.b     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            aqyd r4 = (defpackage.aqyd) r4     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            r4.e = r2     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            if (r5 == 0) goto L_0x089f
            r5.getClass()     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            r4.a = r5     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
        L_0x089f:
            if (r6 == 0) goto L_0x08a6
            r6.getClass()     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            r4.b = r6     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
        L_0x08a6:
            if (r7 == 0) goto L_0x08ad
            r7.getClass()     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            r4.c = r7     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
        L_0x08ad:
            if (r8 == 0) goto L_0x08b4
            r8.getClass()     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            r4.d = r8     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
        L_0x08b4:
            if (r11 == 0) goto L_0x08bb
            r11.getClass()     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            r4.f = r11     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
        L_0x08bb:
            if (r12 == 0) goto L_0x08c2
            r12.getClass()     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            r4.g = r12     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
        L_0x08c2:
            if (r13 == 0) goto L_0x08c9
            r13.getClass()     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            r4.h = r13     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
        L_0x08c9:
            if (r14 == 0) goto L_0x08d0
            r14.getClass()     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            r4.i = r14     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
        L_0x08d0:
            if (r15 != 0) goto L_0x08d3
            goto L_0x08d8
        L_0x08d3:
            r15.getClass()     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            r4.j = r15     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
        L_0x08d8:
            r2 = r29
            java.lang.Object r2 = r10.get(r2)     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            zsy r2 = (defpackage.zsy) r2     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            aucj r3 = r3.i()     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            aqyd r3 = (defpackage.aqyd) r3     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            r2.n = r3     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            r2 = r27
            r3 = 24
            goto L_0x07c6
        L_0x08ee:
            r27 = r2
            r3 = 24
            goto L_0x07c6
        L_0x08f4:
            r27 = r2
            goto L_0x0920
        L_0x08f7:
            r0 = move-exception
            r27 = r2
        L_0x08fa:
            r2 = r0
            goto L_0x0925
        L_0x08fc:
            r0 = move-exception
            r27 = r2
        L_0x08ff:
            r2 = r0
            goto L_0x0934
        L_0x0901:
            r27 = r2
            boolean r2 = defpackage.azfa.g()     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            if (r2 != 0) goto L_0x0919
            zsg r2 = r1.g     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            java.lang.String r3 = "Could not query ContactsProvider to fetch structured name."
            r5 = 0
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            java.lang.String r3 = "ReadContactsHelper"
            r2.c(r3, r4)     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            goto L_0x0920
        L_0x0919:
            zsg r2 = r1.g     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
            java.lang.String r3 = "Could not query ContactsProvider to fetch structured name."
            r2.c(r3)     // Catch:{ SQLiteException -> 0x0929, all -> 0x0923 }
        L_0x0920:
            if (r27 != 0) goto L_0x0956
            goto L_0x0959
        L_0x0923:
            r0 = move-exception
            goto L_0x08fa
        L_0x0925:
            r5 = r27
            goto L_0x0c0e
        L_0x0929:
            r0 = move-exception
            goto L_0x08ff
        L_0x092b:
            r0 = move-exception
            r2 = r0
            r5 = 0
            goto L_0x0c0e
        L_0x0930:
            r0 = move-exception
            r2 = r0
            r27 = 0
        L_0x0934:
            boolean r3 = defpackage.azfa.g()     // Catch:{ all -> 0x0c0a }
            if (r3 != 0) goto L_0x094d
            zsg r3 = r1.g     // Catch:{ all -> 0x0c0a }
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0c0a }
            java.lang.String r5 = "ContentResolver.query threw an exception when fetching note info"
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x0c0a }
            r5 = 1
            r4[r5] = r2     // Catch:{ all -> 0x0c0a }
            java.lang.String r2 = "ReadContactsHelper"
            r3.e(r2, r4)     // Catch:{ all -> 0x0c0a }
            goto L_0x0954
        L_0x094d:
            zsg r3 = r1.g     // Catch:{ all -> 0x0c0a }
            java.lang.String r4 = "ContentResolver.query threw an exception when fetching note info"
            r3.a((java.lang.Throwable) r2, (java.lang.String) r4)     // Catch:{ all -> 0x0c0a }
        L_0x0954:
            if (r27 == 0) goto L_0x0959
        L_0x0956:
            r27.close()     // Catch:{ all -> 0x0cae }
        L_0x0959:
            boolean r2 = defpackage.azdq.j()     // Catch:{ all -> 0x0cae }
            if (r2 != 0) goto L_0x0960
            goto L_0x0963
        L_0x0960:
            r1.c((java.util.Map) r10)     // Catch:{ all -> 0x0cae }
        L_0x0963:
            int r2 = r10.size()     // Catch:{ all -> 0x0cae }
            aqxx[] r3 = new defpackage.aqxx[r2]     // Catch:{ all -> 0x0cae }
            java.util.Iterator r4 = r28.iterator()     // Catch:{ all -> 0x0cae }
            r5 = 0
        L_0x096e:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x0cae }
            if (r6 == 0) goto L_0x0bbb
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x0cae }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0cae }
            boolean r7 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0cae }
            if (r7 != 0) goto L_0x0bb5
            java.lang.Object r7 = r10.get(r6)     // Catch:{ all -> 0x0cae }
            zsy r7 = (defpackage.zsy) r7     // Catch:{ all -> 0x0cae }
            aqxx r8 = defpackage.aqxx.E     // Catch:{ all -> 0x0cae }
            aucd r8 = r8.o()     // Catch:{ all -> 0x0cae }
            aqxw r8 = (defpackage.aqxw) r8     // Catch:{ all -> 0x0cae }
            long r11 = r6.longValue()     // Catch:{ all -> 0x0cae }
            boolean r6 = r8.c     // Catch:{ all -> 0x0cae }
            if (r6 != 0) goto L_0x0997
            goto L_0x099d
        L_0x0997:
            r8.c()     // Catch:{ all -> 0x0cae }
            r6 = 0
            r8.c = r6     // Catch:{ all -> 0x0cae }
        L_0x099d:
            aucj r6 = r8.b     // Catch:{ all -> 0x0cae }
            aqxx r6 = (defpackage.aqxx) r6     // Catch:{ all -> 0x0cae }
            r6.m = r11     // Catch:{ all -> 0x0cae }
            java.lang.String r9 = r7.c     // Catch:{ all -> 0x0cae }
            if (r9 == 0) goto L_0x09ac
            r9.getClass()     // Catch:{ all -> 0x0cae }
            r6.l = r9     // Catch:{ all -> 0x0cae }
        L_0x09ac:
            java.lang.Long r6 = r7.b     // Catch:{ all -> 0x0cae }
            long r11 = r6.longValue()     // Catch:{ all -> 0x0cae }
            boolean r6 = r8.c     // Catch:{ all -> 0x0cae }
            if (r6 != 0) goto L_0x09b7
            goto L_0x09bd
        L_0x09b7:
            r8.c()     // Catch:{ all -> 0x0cae }
            r6 = 0
            r8.c = r6     // Catch:{ all -> 0x0cae }
        L_0x09bd:
            aucj r6 = r8.b     // Catch:{ all -> 0x0cae }
            aqxx r6 = (defpackage.aqxx) r6     // Catch:{ all -> 0x0cae }
            r6.n = r11     // Catch:{ all -> 0x0cae }
            boolean r6 = r7.a()     // Catch:{ all -> 0x0cae }
            if (r6 != 0) goto L_0x09ca
            goto L_0x09e0
        L_0x09ca:
            java.lang.String r6 = r7.d     // Catch:{ all -> 0x0cae }
            boolean r9 = r8.c     // Catch:{ all -> 0x0cae }
            if (r9 != 0) goto L_0x09d1
            goto L_0x09d7
        L_0x09d1:
            r8.c()     // Catch:{ all -> 0x0cae }
            r9 = 0
            r8.c = r9     // Catch:{ all -> 0x0cae }
        L_0x09d7:
            aucj r9 = r8.b     // Catch:{ all -> 0x0cae }
            aqxx r9 = (defpackage.aqxx) r9     // Catch:{ all -> 0x0cae }
            r6.getClass()     // Catch:{ all -> 0x0cae }
            r9.g = r6     // Catch:{ all -> 0x0cae }
        L_0x09e0:
            java.lang.String r6 = r7.k     // Catch:{ all -> 0x0cae }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0cae }
            if (r6 == 0) goto L_0x09e9
            goto L_0x09ff
        L_0x09e9:
            java.lang.String r6 = r7.k     // Catch:{ all -> 0x0cae }
            boolean r9 = r8.c     // Catch:{ all -> 0x0cae }
            if (r9 != 0) goto L_0x09f0
            goto L_0x09f6
        L_0x09f0:
            r8.c()     // Catch:{ all -> 0x0cae }
            r9 = 0
            r8.c = r9     // Catch:{ all -> 0x0cae }
        L_0x09f6:
            aucj r9 = r8.b     // Catch:{ all -> 0x0cae }
            aqxx r9 = (defpackage.aqxx) r9     // Catch:{ all -> 0x0cae }
            r6.getClass()     // Catch:{ all -> 0x0cae }
            r9.a = r6     // Catch:{ all -> 0x0cae }
        L_0x09ff:
            java.lang.String r6 = r7.j     // Catch:{ all -> 0x0cae }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0cae }
            if (r6 != 0) goto L_0x0a1d
            java.lang.String r6 = r7.j     // Catch:{ all -> 0x0cae }
            boolean r9 = r8.c     // Catch:{ all -> 0x0cae }
            if (r9 != 0) goto L_0x0a0e
            goto L_0x0a14
        L_0x0a0e:
            r8.c()     // Catch:{ all -> 0x0cae }
            r9 = 0
            r8.c = r9     // Catch:{ all -> 0x0cae }
        L_0x0a14:
            aucj r9 = r8.b     // Catch:{ all -> 0x0cae }
            aqxx r9 = (defpackage.aqxx) r9     // Catch:{ all -> 0x0cae }
            r6.getClass()     // Catch:{ all -> 0x0cae }
            r9.o = r6     // Catch:{ all -> 0x0cae }
        L_0x0a1d:
            aqxz r6 = r7.l     // Catch:{ all -> 0x0cae }
            if (r6 == 0) goto L_0x0a3f
            java.lang.String r6 = r6.a     // Catch:{ all -> 0x0cae }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0cae }
            if (r6 != 0) goto L_0x0a3f
            aqxz r6 = r7.l     // Catch:{ all -> 0x0cae }
            boolean r9 = r8.c     // Catch:{ all -> 0x0cae }
            if (r9 != 0) goto L_0x0a30
            goto L_0x0a36
        L_0x0a30:
            r8.c()     // Catch:{ all -> 0x0cae }
            r9 = 0
            r8.c = r9     // Catch:{ all -> 0x0cae }
        L_0x0a36:
            aucj r9 = r8.b     // Catch:{ all -> 0x0cae }
            aqxx r9 = (defpackage.aqxx) r9     // Catch:{ all -> 0x0cae }
            r6.getClass()     // Catch:{ all -> 0x0cae }
            r9.r = r6     // Catch:{ all -> 0x0cae }
        L_0x0a3f:
            aqyd r6 = r7.n     // Catch:{ all -> 0x0cae }
            if (r6 == 0) goto L_0x0a57
            boolean r9 = r8.c     // Catch:{ all -> 0x0cae }
            if (r9 != 0) goto L_0x0a48
            goto L_0x0a4e
        L_0x0a48:
            r8.c()     // Catch:{ all -> 0x0cae }
            r9 = 0
            r8.c = r9     // Catch:{ all -> 0x0cae }
        L_0x0a4e:
            aucj r9 = r8.b     // Catch:{ all -> 0x0cae }
            aqxx r9 = (defpackage.aqxx) r9     // Catch:{ all -> 0x0cae }
            r6.getClass()     // Catch:{ all -> 0x0cae }
            r9.c = r6     // Catch:{ all -> 0x0cae }
        L_0x0a57:
            aqya r6 = r7.m     // Catch:{ all -> 0x0cae }
            if (r6 == 0) goto L_0x0a70
            boolean r9 = r8.c     // Catch:{ all -> 0x0cae }
            if (r9 != 0) goto L_0x0a60
        L_0x0a5f:
            goto L_0x0a67
        L_0x0a60:
            r8.c()     // Catch:{ all -> 0x0cae }
            r9 = 0
            r8.c = r9     // Catch:{ all -> 0x0cae }
            goto L_0x0a5f
        L_0x0a67:
            aucj r9 = r8.b     // Catch:{ all -> 0x0cae }
            aqxx r9 = (defpackage.aqxx) r9     // Catch:{ all -> 0x0cae }
            r6.getClass()     // Catch:{ all -> 0x0cae }
            r9.u = r6     // Catch:{ all -> 0x0cae }
        L_0x0a70:
            boolean r6 = r7.b()     // Catch:{ all -> 0x0cae }
            if (r6 == 0) goto L_0x0a8c
            java.lang.String r6 = r7.e     // Catch:{ all -> 0x0cae }
            boolean r9 = r8.c     // Catch:{ all -> 0x0cae }
            if (r9 != 0) goto L_0x0a7d
            goto L_0x0a83
        L_0x0a7d:
            r8.c()     // Catch:{ all -> 0x0cae }
            r9 = 0
            r8.c = r9     // Catch:{ all -> 0x0cae }
        L_0x0a83:
            aucj r9 = r8.b     // Catch:{ all -> 0x0cae }
            aqxx r9 = (defpackage.aqxx) r9     // Catch:{ all -> 0x0cae }
            r6.getClass()     // Catch:{ all -> 0x0cae }
            r9.x = r6     // Catch:{ all -> 0x0cae }
        L_0x0a8c:
            boolean r6 = r7.c()     // Catch:{ all -> 0x0cae }
            if (r6 == 0) goto L_0x0aa8
            java.lang.String r6 = r7.f     // Catch:{ all -> 0x0cae }
            boolean r9 = r8.c     // Catch:{ all -> 0x0cae }
            if (r9 != 0) goto L_0x0a99
            goto L_0x0a9f
        L_0x0a99:
            r8.c()     // Catch:{ all -> 0x0cae }
            r9 = 0
            r8.c = r9     // Catch:{ all -> 0x0cae }
        L_0x0a9f:
            aucj r9 = r8.b     // Catch:{ all -> 0x0cae }
            aqxx r9 = (defpackage.aqxx) r9     // Catch:{ all -> 0x0cae }
            r6.getClass()     // Catch:{ all -> 0x0cae }
            r9.B = r6     // Catch:{ all -> 0x0cae }
        L_0x0aa8:
            boolean r6 = r7.i     // Catch:{ all -> 0x0cae }
            if (r6 != 0) goto L_0x0aae
            r9 = 1
            goto L_0x0ac0
        L_0x0aae:
            boolean r6 = r8.c     // Catch:{ all -> 0x0cae }
            if (r6 != 0) goto L_0x0ab3
            goto L_0x0ab9
        L_0x0ab3:
            r8.c()     // Catch:{ all -> 0x0cae }
            r6 = 0
            r8.c = r6     // Catch:{ all -> 0x0cae }
        L_0x0ab9:
            aucj r6 = r8.b     // Catch:{ all -> 0x0cae }
            aqxx r6 = (defpackage.aqxx) r6     // Catch:{ all -> 0x0cae }
            r9 = 1
            r6.s = r9     // Catch:{ all -> 0x0cae }
        L_0x0ac0:
            java.util.List r6 = r7.o     // Catch:{ all -> 0x0cae }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0cae }
            if (r6 != 0) goto L_0x0ade
            java.util.List r6 = r7.o     // Catch:{ all -> 0x0cae }
            r11 = 0
            java.lang.Long[] r12 = new java.lang.Long[r11]     // Catch:{ all -> 0x0cae }
            java.lang.Object[] r6 = r6.toArray(r12)     // Catch:{ all -> 0x0cae }
            java.lang.Long[] r6 = (java.lang.Long[]) r6     // Catch:{ all -> 0x0cae }
            long[] r6 = defpackage.jhx.a((java.lang.Long[]) r6)     // Catch:{ all -> 0x0cae }
            java.util.List r6 = defpackage.aook.a((long[]) r6)     // Catch:{ all -> 0x0cae }
            r8.b(r6)     // Catch:{ all -> 0x0cae }
        L_0x0ade:
            java.lang.Long r6 = r7.g     // Catch:{ all -> 0x0cae }
            long r11 = r6.longValue()     // Catch:{ all -> 0x0cae }
            int r6 = defpackage.aoog.a((long) r11)     // Catch:{ all -> 0x0cae }
            boolean r11 = r8.c     // Catch:{ all -> 0x0cae }
            if (r11 != 0) goto L_0x0aed
            goto L_0x0af3
        L_0x0aed:
            r8.c()     // Catch:{ all -> 0x0cae }
            r11 = 0
            r8.c = r11     // Catch:{ all -> 0x0cae }
        L_0x0af3:
            aucj r11 = r8.b     // Catch:{ all -> 0x0cae }
            aqxx r11 = (defpackage.aqxx) r11     // Catch:{ all -> 0x0cae }
            r11.h = r6     // Catch:{ all -> 0x0cae }
            java.lang.Long r6 = r7.h     // Catch:{ all -> 0x0cae }
            long r11 = r6.longValue()     // Catch:{ all -> 0x0cae }
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r11 / r13
            long r11 = r11 * r13
            boolean r6 = r8.c     // Catch:{ all -> 0x0cae }
            if (r6 != 0) goto L_0x0b0b
            r6 = 0
            goto L_0x0b11
        L_0x0b0b:
            r8.c()     // Catch:{ all -> 0x0cae }
            r6 = 0
            r8.c = r6     // Catch:{ all -> 0x0cae }
        L_0x0b11:
            aucj r13 = r8.b     // Catch:{ all -> 0x0cae }
            aqxx r13 = (defpackage.aqxx) r13     // Catch:{ all -> 0x0cae }
            r13.i = r11     // Catch:{ all -> 0x0cae }
            java.lang.Long r11 = r7.a     // Catch:{ all -> 0x0cae }
            r12 = r26
            java.lang.Object r11 = r12.get(r11)     // Catch:{ all -> 0x0cae }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0cae }
            if (r11 != 0) goto L_0x0b24
            goto L_0x0b27
        L_0x0b24:
            r8.a(r11)     // Catch:{ all -> 0x0cae }
        L_0x0b27:
            java.lang.Long r11 = r7.a     // Catch:{ all -> 0x0cae }
            r13 = r25
            java.lang.Object r11 = r13.get(r11)     // Catch:{ all -> 0x0cae }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0cae }
            if (r11 != 0) goto L_0x0b34
            goto L_0x0b37
        L_0x0b34:
            r8.d(r11)     // Catch:{ all -> 0x0cae }
        L_0x0b37:
            java.lang.Long r11 = r7.a     // Catch:{ all -> 0x0cae }
            r14 = r24
            java.lang.Object r11 = r14.get(r11)     // Catch:{ all -> 0x0cae }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0cae }
            if (r11 != 0) goto L_0x0b44
            goto L_0x0b47
        L_0x0b44:
            r8.g(r11)     // Catch:{ all -> 0x0cae }
        L_0x0b47:
            java.lang.Long r11 = r7.a     // Catch:{ all -> 0x0cae }
            r15 = r23
            java.lang.Object r11 = r15.get(r11)     // Catch:{ all -> 0x0cae }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0cae }
            if (r11 != 0) goto L_0x0b54
            goto L_0x0b57
        L_0x0b54:
            r8.c(r11)     // Catch:{ all -> 0x0cae }
        L_0x0b57:
            java.lang.Long r11 = r7.a     // Catch:{ all -> 0x0cae }
            r6 = r33
            java.lang.Object r11 = r6.get(r11)     // Catch:{ all -> 0x0cae }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0cae }
            if (r11 != 0) goto L_0x0b64
            goto L_0x0b67
        L_0x0b64:
            r8.f(r11)     // Catch:{ all -> 0x0cae }
        L_0x0b67:
            java.lang.Long r11 = r7.a     // Catch:{ all -> 0x0cae }
            r9 = r32
            java.lang.Object r11 = r9.get(r11)     // Catch:{ all -> 0x0cae }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0cae }
            if (r11 == 0) goto L_0x0b76
            r8.e(r11)     // Catch:{ all -> 0x0cae }
        L_0x0b76:
            if (r22 == 0) goto L_0x0b98
            zsx r11 = new zsx     // Catch:{ all -> 0x0cae }
            aucj r8 = r8.i()     // Catch:{ all -> 0x0cae }
            aqxx r8 = (defpackage.aqxx) r8     // Catch:{ all -> 0x0cae }
            r11.<init>(r1, r8, r7)     // Catch:{ all -> 0x0cae }
            r7 = r21
            r7.submit(r11)     // Catch:{ all -> 0x0cae }
            r33 = r6
            r21 = r7
            r32 = r9
            r26 = r12
            r25 = r13
            r24 = r14
            r23 = r15
            goto L_0x096e
        L_0x0b98:
            r7 = r21
            int r11 = r5 + 1
            aucj r8 = r8.i()     // Catch:{ all -> 0x0cae }
            aqxx r8 = (defpackage.aqxx) r8     // Catch:{ all -> 0x0cae }
            r3[r5] = r8     // Catch:{ all -> 0x0cae }
            r33 = r6
            r21 = r7
            r32 = r9
            r5 = r11
            r26 = r12
            r25 = r13
            r24 = r14
            r23 = r15
            goto L_0x096e
        L_0x0bb5:
            java.lang.InterruptedException r2 = new java.lang.InterruptedException     // Catch:{ all -> 0x0cae }
            r2.<init>()     // Catch:{ all -> 0x0cae }
            throw r2     // Catch:{ all -> 0x0cae }
        L_0x0bbb:
            r7 = r21
            if (r22 == 0) goto L_0x0bfa
            r4 = 0
        L_0x0bc0:
            if (r4 >= r2) goto L_0x0bfa
            java.util.concurrent.Future r5 = r7.take()     // Catch:{ ExecutionException -> 0x0bd7, InterruptedException -> 0x0bd1 }
            java.lang.Object r5 = r5.get()     // Catch:{ ExecutionException -> 0x0bd7, InterruptedException -> 0x0bd1 }
            aqxx r5 = (defpackage.aqxx) r5     // Catch:{ ExecutionException -> 0x0bd7, InterruptedException -> 0x0bd1 }
            r3[r4] = r5     // Catch:{ ExecutionException -> 0x0bd7, InterruptedException -> 0x0bd1 }
            int r4 = r4 + 1
            goto L_0x0bc0
        L_0x0bd1:
            r0 = move-exception
            r2 = r0
            r20.shutdownNow()     // Catch:{ all -> 0x0cae }
            throw r2     // Catch:{ all -> 0x0044 }
        L_0x0bd7:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x0cae }
            boolean r3 = r3 instanceof java.lang.InterruptedException     // Catch:{ all -> 0x0cae }
            if (r3 == 0) goto L_0x0bee
            r20.shutdownNow()     // Catch:{ all -> 0x0cae }
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ all -> 0x0044 }
            java.lang.InterruptedException r2 = (java.lang.InterruptedException) r2     // Catch:{ all -> 0x0044 }
            throw r2     // Catch:{ all -> 0x0044 }
        L_0x0beb:
            r5 = 0
            goto L_0x0cb6
        L_0x0bee:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0cae }
            java.lang.String r4 = "Exception when fetching contact images"
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ all -> 0x0cae }
            r3.<init>(r4, r2)     // Catch:{ all -> 0x0cae }
            throw r3     // Catch:{ all -> 0x0cae }
        L_0x0bfa:
            if (r20 == 0) goto L_0x0bff
            r20.shutdownNow()
        L_0x0bff:
            monitor-enter(r30)
            r4 = 0
            r1.f = r4     // Catch:{ all -> 0x0c06 }
            monitor-exit(r30)     // Catch:{ all -> 0x0c06 }
            return r3
        L_0x0c06:
            r0 = move-exception
            r2 = r0
            monitor-exit(r30)     // Catch:{ all -> 0x0c06 }
            throw r2
        L_0x0c0a:
            r0 = move-exception
            r2 = r0
            r5 = r27
        L_0x0c0e:
            if (r5 == 0) goto L_0x0c13
            r5.close()     // Catch:{ all -> 0x0cae }
        L_0x0c13:
            throw r2     // Catch:{ all -> 0x0cae }
        L_0x0c14:
            r0 = move-exception
            r2 = r0
            r5 = r3
        L_0x0c17:
            if (r5 == 0) goto L_0x0c1c
            r5.close()     // Catch:{ all -> 0x0cae }
        L_0x0c1c:
            throw r2     // Catch:{ all -> 0x0cae }
        L_0x0c1d:
            r0 = move-exception
            r2 = r0
            r5 = r3
        L_0x0c20:
            if (r5 == 0) goto L_0x0c25
            r5.close()     // Catch:{ all -> 0x0cae }
        L_0x0c25:
            throw r2     // Catch:{ all -> 0x0cae }
        L_0x0c26:
            r0 = move-exception
            r2 = r0
            r5 = r8
        L_0x0c29:
            if (r5 == 0) goto L_0x0c2e
            r5.close()     // Catch:{ all -> 0x0cae }
        L_0x0c2e:
            throw r2     // Catch:{ all -> 0x0cae }
        L_0x0c2f:
            r0 = move-exception
            r2 = r0
            r5 = r6
        L_0x0c32:
            if (r5 == 0) goto L_0x0c37
            r5.close()     // Catch:{ all -> 0x0cae }
        L_0x0c37:
            throw r2     // Catch:{ all -> 0x0cae }
        L_0x0c38:
            r0 = move-exception
            r2 = r0
            r5 = r3
        L_0x0c3b:
            if (r5 == 0) goto L_0x0c40
            r5.close()     // Catch:{ all -> 0x0cae }
        L_0x0c40:
            throw r2     // Catch:{ all -> 0x0cae }
        L_0x0c41:
            r0 = move-exception
            r20 = r8
            r2 = r0
            r5 = r13
        L_0x0c46:
            if (r5 == 0) goto L_0x0c4b
            r5.close()     // Catch:{ all -> 0x0cae }
        L_0x0c4b:
            throw r2     // Catch:{ all -> 0x0cae }
        L_0x0c4c:
            r0 = move-exception
            r20 = r8
        L_0x0c4f:
            r2 = r0
            goto L_0x0c69
        L_0x0c51:
            r0 = move-exception
            r20 = r8
        L_0x0c54:
            r2 = r0
            goto L_0x0c6d
        L_0x0c56:
            r20 = r8
            zsg r2 = r1.g     // Catch:{ SQLiteException -> 0x0c6b, all -> 0x0c67 }
            java.lang.String r3 = "Could not query ContactsProvider to fetch RawContacts; disabled? Give up."
            r2.c(r3)     // Catch:{ SQLiteException -> 0x0c6b, all -> 0x0c67 }
            zst r2 = new zst     // Catch:{ SQLiteException -> 0x0c6b, all -> 0x0c67 }
            java.lang.String r3 = "Raw contacts query cursor is null"
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x0c6b, all -> 0x0c67 }
            throw r2     // Catch:{ SQLiteException -> 0x0c6b, all -> 0x0c67 }
        L_0x0c67:
            r0 = move-exception
            goto L_0x0c4f
        L_0x0c69:
            r5 = r12
            goto L_0x0ca8
        L_0x0c6b:
            r0 = move-exception
            goto L_0x0c54
        L_0x0c6d:
            r5 = r12
            goto L_0x0c7a
        L_0x0c6f:
            r0 = move-exception
            r20 = r8
            r2 = r0
            r5 = 0
            goto L_0x0ca8
        L_0x0c75:
            r0 = move-exception
            r20 = r8
            r2 = r0
            r5 = 0
        L_0x0c7a:
            zsg r3 = r1.g     // Catch:{ all -> 0x0ca6 }
            java.lang.String r4 = "ContentResolver.query threw an exception when fetching raw-contacts."
            r3.a((java.lang.Throwable) r2, (java.lang.String) r4)     // Catch:{ all -> 0x0ca6 }
            zsu r3 = new zsu     // Catch:{ all -> 0x0ca6 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0ca6 }
            int r4 = r4.length()     // Catch:{ all -> 0x0ca6 }
            int r4 = r4 + 35
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ca6 }
            r6.<init>(r4)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r4 = "Fetching raw contacts query failed."
            r6.append(r4)     // Catch:{ all -> 0x0ca6 }
            r6.append(r2)     // Catch:{ all -> 0x0ca6 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0ca6 }
            r3.<init>(r2)     // Catch:{ all -> 0x0ca6 }
            throw r3     // Catch:{ all -> 0x0ca6 }
        L_0x0ca6:
            r0 = move-exception
            r2 = r0
        L_0x0ca8:
            if (r5 == 0) goto L_0x0cad
            r5.close()     // Catch:{ all -> 0x0cae }
        L_0x0cad:
            throw r2     // Catch:{ all -> 0x0cae }
        L_0x0cae:
            r0 = move-exception
            goto L_0x0cb3
        L_0x0cb0:
            r0 = move-exception
            r20 = r8
        L_0x0cb3:
            r2 = r0
        L_0x0cb4:
            r5 = r20
        L_0x0cb6:
            if (r5 == 0) goto L_0x0cbb
            r5.shutdownNow()
        L_0x0cbb:
            monitor-enter(r30)
            r3 = 0
            r1.f = r3     // Catch:{ all -> 0x0cc2 }
            monitor-exit(r30)     // Catch:{ all -> 0x0cc2 }
            throw r2
        L_0x0cc2:
            r0 = move-exception
            r2 = r0
            monitor-exit(r30)     // Catch:{ all -> 0x0cc2 }
            throw r2
        L_0x0cc6:
            r0 = move-exception
            r2 = r0
            monitor-exit(r30)     // Catch:{ all -> 0x0cc6 }
            goto L_0x0ccb
        L_0x0cca:
            throw r2
        L_0x0ccb:
            goto L_0x0cca
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsz.a(boolean, long):aqxx[]");
    }
}
