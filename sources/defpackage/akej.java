package defpackage;

import java.util.HashMap;

/* renamed from: akej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akej {
    private static final Object a = new Object();
    private static akej b;
    private final HashMap c = new HashMap();

    public static final akej a() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new akej();
                }
            }
        }
        return b;
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f2, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ed A[SYNTHETIC, Splitter:B:62:0x00ed] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.akfl r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            monitor-enter(r18)
            android.net.Uri r2 = r0.b     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x00f1
            boolean r3 = defpackage.akeh.b(r2)     // Catch:{ all -> 0x0118 }
            if (r3 == 0) goto L_0x00f1
            boolean r3 = defpackage.akeh.b(r2)     // Catch:{ all -> 0x0118 }
            if (r3 == 0) goto L_0x00f3
            java.lang.String r3 = "change_notify_uri"
            java.lang.String r3 = r2.getQueryParameter(r3)     // Catch:{ all -> 0x0118 }
            r4 = 0
            if (r3 == 0) goto L_0x0023
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ all -> 0x0118 }
            goto L_0x0024
        L_0x0023:
            r3 = r4
        L_0x0024:
            android.net.Uri$Builder r2 = r2.buildUpon()     // Catch:{ all -> 0x0118 }
            android.net.Uri$Builder r2 = r2.clearQuery()     // Catch:{ all -> 0x0118 }
            android.net.Uri r2 = r2.build()     // Catch:{ all -> 0x0118 }
            if (r3 == 0) goto L_0x00f1
            java.lang.String r2 = defpackage.akeh.c(r2)     // Catch:{ all -> 0x0118 }
            android.content.Context r0 = r0.e     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x00f1
            if (r0 == 0) goto L_0x00f1
            android.accounts.AccountManager r5 = android.accounts.AccountManager.get(r0)     // Catch:{ all -> 0x0118 }
            java.lang.String r6 = "com.google"
            android.accounts.Account[] r5 = r5.getAccountsByType(r6)     // Catch:{ all -> 0x0118 }
            int r6 = r5.length     // Catch:{ all -> 0x0118 }
            r7 = 0
            r8 = 0
        L_0x0049:
            if (r8 >= r6) goto L_0x0058
            r9 = r5[r8]     // Catch:{ all -> 0x0118 }
            java.lang.String r10 = r9.name     // Catch:{ all -> 0x0118 }
            boolean r10 = r10.equals(r2)     // Catch:{ all -> 0x0118 }
            if (r10 != 0) goto L_0x0059
            int r8 = r8 + 1
            goto L_0x0049
        L_0x0058:
            r9 = r4
        L_0x0059:
            if (r9 == 0) goto L_0x00f1
            java.util.HashMap r2 = r1.c     // Catch:{ all -> 0x0118 }
            java.lang.String r5 = r9.name     // Catch:{ all -> 0x0118 }
            boolean r2 = r2.containsKey(r5)     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x0076
            java.util.HashMap r0 = r1.c     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = r9.name     // Catch:{ all -> 0x0118 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0118 }
            akei r0 = (defpackage.akei) r0     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x00f1
            r0.a(r3)     // Catch:{ all -> 0x0118 }
            monitor-exit(r18)
            return
        L_0x0076:
            r2 = 3
            java.lang.String[] r12 = new java.lang.String[r2]     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = "_id"
            r12[r7] = r2     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = "contact_id"
            r5 = 1
            r12[r5] = r2     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = "lookup"
            r6 = 2
            r12[r6] = r2     // Catch:{ all -> 0x0118 }
            java.lang.String[] r14 = new java.lang.String[r5]     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = r9.name     // Catch:{ all -> 0x0118 }
            r14[r7] = r2     // Catch:{ all -> 0x0118 }
            java.lang.String r13 = "data1 LIKE ?"
            android.content.ContentResolver r10 = r0.getContentResolver()     // Catch:{ all -> 0x00ea }
            android.net.Uri r11 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x00ea }
            r15 = 0
            android.database.Cursor r2 = r10.query(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00ea }
            boolean r8 = r2.moveToNext()     // Catch:{ all -> 0x00e7 }
            r10 = -1
            if (r8 == 0) goto L_0x00b0
            long r4 = r2.getLong(r5)     // Catch:{ all -> 0x00e7 }
            java.lang.String r6 = r2.getString(r6)     // Catch:{ all -> 0x00e7 }
            r16 = r4
            r4 = r6
            r5 = r16
            goto L_0x00b1
        L_0x00b0:
            r5 = r10
        L_0x00b1:
            if (r2 != 0) goto L_0x00b4
            goto L_0x00b7
        L_0x00b4:
            r2.close()     // Catch:{ all -> 0x0118 }
        L_0x00b7:
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x00c4
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x00c3
            r5 = r10
            goto L_0x00c5
        L_0x00c3:
            goto L_0x00c5
        L_0x00c4:
            r5 = r10
        L_0x00c5:
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x00f1
            android.net.Uri r2 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ all -> 0x0118 }
            android.net.Uri r2 = android.content.ContentUris.withAppendedId(r2, r5)     // Catch:{ all -> 0x0118 }
            akei r4 = new akei     // Catch:{ all -> 0x0118 }
            r4.<init>(r0, r9)     // Catch:{ all -> 0x0118 }
            java.util.HashMap r5 = r1.c     // Catch:{ all -> 0x0118 }
            java.lang.String r6 = r9.name     // Catch:{ all -> 0x0118 }
            r5.put(r6, r4)     // Catch:{ all -> 0x0118 }
            r4.a(r3)     // Catch:{ all -> 0x0118 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x0118 }
            r0.registerContentObserver(r2, r7, r4)     // Catch:{ all -> 0x0118 }
            monitor-exit(r18)
            return
        L_0x00e7:
            r0 = move-exception
            r4 = r2
            goto L_0x00eb
        L_0x00ea:
            r0 = move-exception
        L_0x00eb:
            if (r4 == 0) goto L_0x00f0
            r4.close()     // Catch:{ all -> 0x0118 }
        L_0x00f0:
            throw r0     // Catch:{ all -> 0x0118 }
        L_0x00f1:
            monitor-exit(r18)
            return
        L_0x00f3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0118 }
            int r3 = r3.length()     // Catch:{ all -> 0x0118 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            int r3 = r3 + 27
            r4.<init>(r3)     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = "Invalid account image URI. "
            r4.append(r3)     // Catch:{ all -> 0x0118 }
            r4.append(r2)     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0118 }
            r0.<init>(r2)     // Catch:{ all -> 0x0118 }
            throw r0     // Catch:{ all -> 0x0118 }
        L_0x0118:
            r0 = move-exception
            monitor-exit(r18)
            goto L_0x011c
        L_0x011b:
            throw r0
        L_0x011c:
            goto L_0x011b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akej.a(akfl):void");
    }
}
