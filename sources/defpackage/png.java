package defpackage;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: png  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class png {
    public final pni a;

    public png(oyq oyq, ContentResolver contentResolver) {
        this.a = new pni(oyq, contentResolver);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(defpackage.pni r8, android.net.Uri r9) {
        /*
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x001e }
            java.lang.String r0 = "_id"
            r7 = 0
            r3[r7] = r0     // Catch:{ all -> 0x001e }
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r8
            r2 = r9
            android.database.Cursor r8 = r1.a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x001e }
            if (r8 == 0) goto L_0x001d
            int r9 = r8.getCount()     // Catch:{ all -> 0x001b }
            r8.close()
            return r9
        L_0x001b:
            r9 = move-exception
            goto L_0x0021
        L_0x001d:
            return r7
        L_0x001e:
            r8 = move-exception
            r9 = r8
            r8 = 0
        L_0x0021:
            if (r8 == 0) goto L_0x0026
            r8.close()
        L_0x0026:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.png.a(pni, android.net.Uri):int");
    }

    /* JADX INFO: finally extract failed */
    public final Pair a(Resources resources, String str) {
        long j;
        Uri build = ContactsContract.Contacts.CONTENT_URI.buildUpon().appendQueryParameter("directory", "0").build();
        pni pni = this.a;
        int i = pmr.a;
        Cursor a2 = pni.a(build, new String[]{"_id", "contact_last_updated_timestamp"}, str, (String[]) null, (String) null);
        long j2 = -1;
        if (a2 == null) {
            pnz.e("Could not query ContactsProvider; disabled? Wiping local DB.");
            return new Pair(new pne(), -1L);
        }
        pnz.a("getWantedContacts with selection=%s", (Object) str);
        ArrayList arrayList = new ArrayList();
        try {
            int columnIndex = a2.getColumnIndex("_id");
            while (a2.moveToNext()) {
                long j3 = a2.getLong(columnIndex);
                int columnIndex2 = a2.getColumnIndex("contact_last_updated_timestamp");
                if (columnIndex2 != -1) {
                    j = a2.getLong(columnIndex2);
                } else {
                    j = 0;
                }
                j2 = Math.max(j2, j);
                arrayList.add(Long.valueOf(j3));
            }
            a2.close();
            pnz.a("%d matching contacts", (Object) Integer.valueOf(arrayList.size()));
            Collections.sort(arrayList);
            return new Pair(new pmx(this.a.a, resources, arrayList), Long.valueOf(j2));
        } catch (Throwable th) {
            a2.close();
            throw th;
        }
    }
}
