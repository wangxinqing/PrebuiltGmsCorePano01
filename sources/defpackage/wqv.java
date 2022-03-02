package defpackage;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* renamed from: wqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wqv {
    public static final /* synthetic */ int a = 0;
    private final ContentResolver b;

    static {
        int i = wqi.a;
    }

    public wqv(ContentResolver contentResolver) {
        this.b = contentResolver;
    }

    /* JADX INFO: finally extract failed */
    public final Pair a(Resources resources, String str, String str2) {
        Cursor cursor;
        long j;
        long j2 = -1;
        if (ixk.a.a("android.permission.READ_CONTACTS") != 0) {
            return new Pair(new wqu(), -1L);
        }
        try {
            cursor = this.b.query(ContactsContract.Contacts.CONTENT_URI.buildUpon().appendQueryParameter("directory", "0").build(), new String[]{"_id", "contact_last_updated_timestamp"}, str, (String[]) null, str2);
        } catch (SQLiteException e) {
            Log.w("ContactsProviderHelper", "Caught exception thrown by the ContactsProvider.", e);
            cursor = null;
        }
        if (cursor == null) {
            Log.w("ContactsProviderHelper", "Could not query ContactsProvider; disabled? Wiping local DB.");
            return new Pair(new wqu(), -1L);
        }
        ArrayList arrayList = new ArrayList();
        try {
            int columnIndex = cursor.getColumnIndex("_id");
            while (cursor.moveToNext()) {
                long j3 = cursor.getLong(columnIndex);
                int columnIndex2 = cursor.getColumnIndex("contact_last_updated_timestamp");
                if (columnIndex2 != -1) {
                    j = cursor.getLong(columnIndex2);
                } else {
                    j = 0;
                }
                j2 = Math.max(j2, j);
                arrayList.add(Long.valueOf(j3));
            }
            cursor.close();
            arrayList.size();
            Collections.sort(arrayList);
            Resources resources2 = resources;
            return new Pair(new wqn(this.b, resources, arrayList), Long.valueOf(j2));
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
    }

    public final void a(long j, Set set) {
        a(j, set, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r11, java.util.Set r13, java.lang.String r14) {
        /*
            r10 = this;
            java.lang.String r0 = "contact_deleted_timestamp"
            java.lang.String r1 = "contact_id"
            ixk r2 = defpackage.ixk.a
            java.lang.String r3 = "android.permission.READ_CONTACTS"
            int r2 = r2.a(r3)
            if (r2 != 0) goto L_0x006a
            r2 = 1
            java.lang.String r3 = "Delta API not supported"
            defpackage.iva.a((boolean) r2, (java.lang.Object) r3)
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.String r3 = java.lang.Long.toString(r11)
            r4 = 0
            r8[r4] = r3
            java.lang.String r7 = "contact_deleted_timestamp>?"
            android.content.ContentResolver r3 = r10.b     // Catch:{ all -> 0x0062 }
            android.net.Uri r5 = android.provider.ContactsContract.DeletedContacts.CONTENT_URI     // Catch:{ all -> 0x0062 }
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x0062 }
            r6[r4] = r1     // Catch:{ all -> 0x0062 }
            r6[r2] = r0     // Catch:{ all -> 0x0062 }
            r4 = r3
            r9 = r14
            android.database.Cursor r14 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0062 }
            if (r14 == 0) goto L_0x0058
            int r1 = r14.getColumnIndex(r1)     // Catch:{ all -> 0x0060 }
            int r0 = r14.getColumnIndex(r0)     // Catch:{ all -> 0x0060 }
        L_0x003a:
            boolean r2 = r14.moveToNext()     // Catch:{ all -> 0x0060 }
            if (r2 == 0) goto L_0x0054
            long r2 = r14.getLong(r1)     // Catch:{ all -> 0x0060 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0060 }
            r13.add(r2)     // Catch:{ all -> 0x0060 }
            long r2 = r14.getLong(r0)     // Catch:{ all -> 0x0060 }
            long r11 = java.lang.Math.max(r11, r2)     // Catch:{ all -> 0x0060 }
            goto L_0x003a
        L_0x0054:
            r14.close()
            return
        L_0x0058:
            java.lang.String r11 = "ContactsProviderHelper"
            java.lang.String r12 = "Could not fetch deleted contacts - no contacts provider present?"
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x0060 }
            return
        L_0x0060:
            r11 = move-exception
            goto L_0x0064
        L_0x0062:
            r11 = move-exception
            r14 = 0
        L_0x0064:
            if (r14 == 0) goto L_0x0069
            r14.close()
        L_0x0069:
            throw r11
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqv.a(long, java.util.Set, java.lang.String):void");
    }
}
