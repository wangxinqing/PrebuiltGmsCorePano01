package defpackage;

/* renamed from: akek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akek {
    static final String[] a = {"_id", "contact_id", "raw_contact_id", "lookup", "photo_uri", "photo_file_id"};

    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r11v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r10, android.accounts.Account r11) {
        /*
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r11 = r11.name
            r7 = 0
            r5[r7] = r11
            r11 = 0
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch:{ all -> 0x00d5 }
            android.net.Uri r2 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x00d5 }
            java.lang.String[] r3 = a     // Catch:{ all -> 0x00d5 }
            java.lang.String r4 = "data1 LIKE ?"
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00d5 }
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x00d2 }
            r3 = -1
            if (r2 == 0) goto L_0x003b
            long r5 = r1.getLong(r0)     // Catch:{ all -> 0x00d2 }
            r11 = 2
            long r7 = r1.getLong(r11)     // Catch:{ all -> 0x00d2 }
            r11 = 3
            java.lang.String r11 = r1.getString(r11)     // Catch:{ all -> 0x00d2 }
            r0 = 4
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00d2 }
            r2 = 5
            int r2 = r1.getInt(r2)     // Catch:{ all -> 0x00d2 }
            r8 = r7
            r7 = r2
            goto L_0x0040
        L_0x003b:
            r5 = 0
            r0 = r11
            r8 = r5
            r5 = r3
        L_0x0040:
            if (r1 != 0) goto L_0x0043
            goto L_0x0046
        L_0x0043:
            r1.close()
        L_0x0046:
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x004b
            goto L_0x007b
        L_0x004b:
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x007b
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 != 0) goto L_0x007b
            if (r7 != 0) goto L_0x007a
            android.net.Uri r11 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            android.net.Uri r11 = android.content.ContentUris.withAppendedId(r11, r8)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.google.android.syncadapters.contacts"
            java.lang.String r3 = "com.google.android.syncadapters.contacts.SyncHighResPhotoIntentService"
            r1.setClassName(r2, r3)
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.setAction(r2)
            java.lang.String r2 = "vnd.android.cursor.item/raw_contact"
            r1.setDataAndType(r11, r2)
            r10.startService(r1)     // Catch:{ Exception -> 0x0079 }
            goto L_0x007a
        L_0x0079:
            r10 = move-exception
        L_0x007a:
            return r0
        L_0x007b:
            android.content.Intent$ShortcutIconResource r11 = new android.content.Intent$ShortcutIconResource
            r11.<init>()
            java.lang.String r0 = r10.getPackageName()
            r11.packageName = r0
            android.content.res.Resources r10 = r10.getResources()
            r0 = 2131231675(0x7f0803bb, float:1.8079438E38)
            java.lang.String r10 = r10.getResourceName(r0)
            r11.resourceName = r10
            java.lang.String r10 = r11.packageName
            java.lang.String r11 = r11.resourceName
            java.lang.String r0 = ":"
            java.lang.String r1 = "/"
            java.lang.String r11 = r11.replace(r0, r1)
            java.lang.String r0 = java.lang.String.valueOf(r10)
            int r0 = r0.length()
            java.lang.String r2 = java.lang.String.valueOf(r11)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r0 = r0 + 26
            int r0 = r0 + r2
            r3.<init>(r0)
            java.lang.String r0 = "shortcut.icon.resource://"
            r3.append(r0)
            r3.append(r10)
            r3.append(r1)
            r3.append(r11)
            java.lang.String r10 = r3.toString()
            android.net.Uri r10 = android.net.Uri.parse(r10)
            java.lang.String r10 = r10.toString()
            return r10
        L_0x00d2:
            r10 = move-exception
            r11 = r1
            goto L_0x00d6
        L_0x00d5:
            r10 = move-exception
        L_0x00d6:
            if (r11 == 0) goto L_0x00db
            r11.close()
        L_0x00db:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akek.a(android.content.Context, android.accounts.Account):java.lang.String");
    }
}
