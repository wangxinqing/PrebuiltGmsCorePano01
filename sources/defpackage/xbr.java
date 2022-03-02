package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: xbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xbr {
    public static final String[] a = {"contact_id", "display_name", "mimetype", "data1", "data2", "data3"};
    private static boolean b = false;
    private static boolean c = false;

    public static final String a() {
        int i = Build.VERSION.SDK_INT;
        return "((data_set IS NULL) OR (account_type='com.google' AND data_set!='plus'))";
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000b A[LOOP:0: B:3:0x000b->B:6:0x0017, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.database.Cursor r6) {
        /*
            boolean r0 = r6.isAfterLast()
            if (r0 != 0) goto L_0x0019
            r0 = 0
            long r1 = r6.getLong(r0)
        L_0x000b:
            boolean r3 = r6.moveToNext()
            if (r3 == 0) goto L_0x0019
            long r3 = r6.getLong(r0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x000b
        L_0x0019:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbr.a(android.database.Cursor):void");
    }

    public static final void a(ycr ycr) {
        ycr.b("(mimetype IN ('vnd.android.cursor.item/email_v2','vnd.android.cursor.item/phone_v2'))");
    }

    public static final void a(ycr ycr, Context context) {
        int i = Build.VERSION.SDK_INT;
        if (a(context)) {
            ycr.b("(contact_id IN (SELECT _id FROM default_directory))");
        }
        String a2 = a();
        if (!TextUtils.isEmpty(a2)) {
            ycr.b(a2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r2 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r2 == null) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045 A[SYNTHETIC, Splitter:B:27:0x0045] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final synchronized boolean a(android.content.Context r9) {
        /*
            java.lang.Class<xbr> r0 = defpackage.xbr.class
            monitor-enter(r0)
            boolean r1 = c     // Catch:{ all -> 0x0049 }
            if (r1 != 0) goto L_0x003e
            r1 = 1
            c = r1     // Catch:{ all -> 0x0049 }
            r2 = 0
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch:{ Exception -> 0x0029, all -> 0x0027 }
            android.net.Uri r4 = android.provider.ContactsContract.Groups.CONTENT_URI     // Catch:{ Exception -> 0x0029, all -> 0x0027 }
            r5 = 0
            java.lang.String r6 = "EXISTS (SELECT _id FROM default_directory LIMIT 1)"
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0029, all -> 0x0027 }
            if (r2 == 0) goto L_0x0021
            b = r1     // Catch:{ Exception -> 0x001f }
            goto L_0x0021
        L_0x001f:
            r9 = move-exception
            goto L_0x002a
        L_0x0021:
            if (r2 == 0) goto L_0x003e
        L_0x0023:
            r2.close()     // Catch:{ all -> 0x0049 }
            goto L_0x003e
        L_0x0027:
            r9 = move-exception
            goto L_0x0043
        L_0x0029:
            r9 = move-exception
        L_0x002a:
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0042 }
            r3 = 0
            java.lang.String r4 = "default_directory"
            r1[r3] = r4     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = "PeopleAggregator"
            java.lang.String r4 = "Error occurred when checking for %s table."
            defpackage.xdt.a((java.lang.String) r3, (java.lang.String) r4, (java.lang.Object[]) r1)     // Catch:{ all -> 0x0042 }
            r9.getMessage()     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x003e
            goto L_0x0023
        L_0x003e:
            boolean r9 = b     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)
            return r9
        L_0x0042:
            r9 = move-exception
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r2.close()     // Catch:{ all -> 0x0049 }
        L_0x0048:
            throw r9     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r9 = move-exception
            monitor-exit(r0)
            goto L_0x004d
        L_0x004c:
            throw r9
        L_0x004d:
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbr.a(android.content.Context):boolean");
    }
}
