package defpackage;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* renamed from: zux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zux {
    public static final zsg a = zsg.a("ContactsProviderHelper");
    public static final boolean b = true;
    private final ContentResolver c;

    static {
        int i = ztz.a;
    }

    public zux(ContentResolver contentResolver) {
        this.c = contentResolver;
    }

    /* JADX INFO: finally extract failed */
    public final Pair a(Resources resources, String str, String str2) {
        long j;
        String[] strArr;
        long j2 = -1;
        if (ixk.a.a("android.permission.READ_CONTACTS") != 0) {
            return new Pair(new zuw(), -1L);
        }
        Uri build = ContactsContract.Contacts.CONTENT_URI.buildUpon().appendQueryParameter("directory", "0").build();
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = this.c;
            if (b) {
                strArr = new String[]{"_id", "contact_last_updated_timestamp"};
            } else {
                strArr = new String[]{"_id"};
            }
            cursor = contentResolver.query(build, strArr, str, (String[]) null, str2);
        } catch (SQLiteException e) {
            if (azfa.g()) {
                a.a((Throwable) e, "Caught exception thrown by the ContactsProvider.");
            } else {
                a.c("Caught exception thrown by the ContactsProvider.", e);
            }
        }
        if (cursor != null) {
            new Object[1][0] = str;
            ArrayList arrayList = new ArrayList();
            try {
                int columnIndex = cursor.getColumnIndex("_id");
                while (cursor.moveToNext()) {
                    long j3 = cursor.getLong(columnIndex);
                    if (b) {
                        int columnIndex2 = cursor.getColumnIndex("contact_last_updated_timestamp");
                        if (columnIndex2 != -1) {
                            j = cursor.getLong(columnIndex2);
                        } else {
                            j = 0;
                        }
                        j2 = Math.max(j2, j);
                    }
                    arrayList.add(Long.valueOf(j3));
                }
                cursor.close();
                new Object[1][0] = Integer.valueOf(arrayList.size());
                Collections.sort(arrayList);
                return new Pair(new zup(this.c, resources, arrayList), Long.valueOf(j2));
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        } else {
            a.c("Could not query ContactsProvider; disabled? Wiping local DB.");
            return new Pair(new zuw(), -1L);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j, Set set) {
        a(j, set, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r12, java.util.Set r14, java.lang.String r15) {
        /*
            r11 = this;
            java.lang.String r0 = "contact_deleted_timestamp"
            java.lang.String r1 = "contact_id"
            ixk r2 = defpackage.ixk.a
            java.lang.String r3 = "android.permission.READ_CONTACTS"
            int r2 = r2.a(r3)
            if (r2 != 0) goto L_0x007f
            boolean r2 = b
            java.lang.String r3 = "Delta API not supported"
            defpackage.iva.a((boolean) r2, (java.lang.Object) r3)
            r2 = 1
            java.lang.String[] r7 = new java.lang.String[r2]
            java.lang.String r3 = java.lang.Long.toString(r12)
            r9 = 0
            r7[r9] = r3
            java.lang.String r6 = "contact_deleted_timestamp>?"
            android.content.ContentResolver r3 = r11.c     // Catch:{ all -> 0x0077 }
            android.net.Uri r4 = android.provider.ContactsContract.DeletedContacts.CONTENT_URI     // Catch:{ all -> 0x0077 }
            r10 = 2
            java.lang.String[] r5 = new java.lang.String[r10]     // Catch:{ all -> 0x0077 }
            r5[r9] = r1     // Catch:{ all -> 0x0077 }
            r5[r2] = r0     // Catch:{ all -> 0x0077 }
            r8 = r15
            android.database.Cursor r15 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0077 }
            if (r15 == 0) goto L_0x006d
            int r1 = r15.getColumnIndex(r1)     // Catch:{ all -> 0x0075 }
            int r0 = r15.getColumnIndex(r0)     // Catch:{ all -> 0x0075 }
            r3 = 0
            r5 = r12
        L_0x003e:
            boolean r7 = r15.moveToNext()     // Catch:{ all -> 0x0075 }
            if (r7 != 0) goto L_0x0056
            java.lang.Object[] r14 = new java.lang.Object[r10]     // Catch:{ all -> 0x0075 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0075 }
            r14[r9] = r0     // Catch:{ all -> 0x0075 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0075 }
            r14[r2] = r12     // Catch:{ all -> 0x0075 }
            r15.close()
            return
        L_0x0056:
            r7 = 1
            long r3 = r3 + r7
            long r7 = r15.getLong(r1)     // Catch:{ all -> 0x0075 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0075 }
            r14.add(r7)     // Catch:{ all -> 0x0075 }
            long r7 = r15.getLong(r0)     // Catch:{ all -> 0x0075 }
            long r5 = java.lang.Math.max(r5, r7)     // Catch:{ all -> 0x0075 }
            goto L_0x003e
        L_0x006d:
            zsg r12 = a     // Catch:{ all -> 0x0075 }
            java.lang.String r13 = "Could not fetch deleted contacts - no contacts provider present?"
            r12.c(r13)     // Catch:{ all -> 0x0075 }
            return
        L_0x0075:
            r12 = move-exception
            goto L_0x0079
        L_0x0077:
            r12 = move-exception
            r15 = 0
        L_0x0079:
            if (r15 == 0) goto L_0x007e
            r15.close()
        L_0x007e:
            throw r12
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zux.a(long, java.util.Set, java.lang.String):void");
    }
}
