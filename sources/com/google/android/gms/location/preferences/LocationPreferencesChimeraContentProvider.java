package com.google.android.gms.location.preferences;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.chimera.ContentProvider;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationPreferencesChimeraContentProvider extends ContentProvider {
    private SharedPreferences a;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle call(java.lang.String r7, java.lang.String r8, android.os.Bundle r9) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -934610812: goto L_0x002a;
                case 3496342: goto L_0x0020;
                case 113399775: goto L_0x0016;
                case 1181639041: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "DrivingModePreferenceSummary"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0034
            r7 = 3
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "write"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0034
            r7 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "read"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0034
            r7 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "remove"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0034
            r7 = 2
            goto L_0x0035
        L_0x0034:
            r7 = -1
        L_0x0035:
            java.lang.String r0 = "value"
            r5 = 0
            if (r7 == 0) goto L_0x00b8
            if (r7 == r4) goto L_0x0096
            if (r7 == r3) goto L_0x0079
            if (r7 == r2) goto L_0x0041
            return r5
        L_0x0041:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            defpackage.lww.a()
            android.content.Context r8 = r6.getContext()
            lxb r9 = new lxb
            r9.<init>(r8)
            boolean r8 = r9.b()
            java.lang.String r9 = "com.android.settings.summary"
            if (r8 == 0) goto L_0x0069
            android.content.Context r8 = r6.getContext()
            r0 = 2131952276(0x7f130294, float:1.954099E38)
            java.lang.String r8 = r8.getString(r0)
            r7.putString(r9, r8)
            goto L_0x0078
        L_0x0069:
            android.content.Context r8 = r6.getContext()
            r0 = 2131952273(0x7f130291, float:1.9540984E38)
            java.lang.String r8 = r8.getString(r0)
            r7.putString(r9, r8)
        L_0x0078:
            return r7
        L_0x0079:
            android.content.SharedPreferences r7 = r6.a
            android.content.SharedPreferences$Editor r7 = r7.edit()
            android.content.SharedPreferences$Editor r7 = r7.remove(r8)
            r7.apply()
            android.content.Context r7 = r6.getContext()
            android.content.ContentResolver r7 = r7.getContentResolver()
            android.net.Uri r8 = defpackage.rlu.a(r8)
            r7.notifyChange(r8, r5)
            return r5
        L_0x0096:
            java.lang.String r7 = r9.getString(r0)
            android.content.SharedPreferences r9 = r6.a
            android.content.SharedPreferences$Editor r9 = r9.edit()
            android.content.SharedPreferences$Editor r7 = r9.putString(r8, r7)
            r7.apply()
            android.content.Context r7 = r6.getContext()
            android.content.ContentResolver r7 = r7.getContentResolver()
            android.net.Uri r8 = defpackage.rlu.a(r8)
            r7.notifyChange(r8, r5)
            return r5
        L_0x00b8:
            if (r9 == 0) goto L_0x00c7
            java.lang.String r7 = "valueType"
            int r1 = r9.getInt(r7, r1)
            java.lang.String r7 = "defaultValue"
            java.lang.String r5 = r9.getString(r7, r5)
            goto L_0x00c8
        L_0x00c7:
        L_0x00c8:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            android.content.SharedPreferences r9 = r6.a     // Catch:{ ClassCastException -> 0x00d4 }
            java.lang.String r8 = r9.getString(r8, r5)     // Catch:{ ClassCastException -> 0x00d4 }
            goto L_0x013a
        L_0x00d4:
            r9 = move-exception
            if (r1 == r4) goto L_0x0124
            if (r1 == r3) goto L_0x0115
            if (r1 == r2) goto L_0x0106
            r9 = 4
            if (r1 != r9) goto L_0x00ed
            android.content.SharedPreferences r9 = r6.a     // Catch:{ ClassCastException -> 0x0133 }
            float r1 = java.lang.Float.parseFloat(r5)     // Catch:{ ClassCastException -> 0x0133 }
            float r9 = r9.getFloat(r8, r1)     // Catch:{ ClassCastException -> 0x0133 }
            java.lang.String r8 = java.lang.Float.toString(r9)     // Catch:{ ClassCastException -> 0x0133 }
            goto L_0x013a
        L_0x00ed:
            java.lang.ClassCastException r9 = new java.lang.ClassCastException     // Catch:{ ClassCastException -> 0x0133 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ClassCastException -> 0x0133 }
            r3 = 33
            r2.<init>(r3)     // Catch:{ ClassCastException -> 0x0133 }
            java.lang.String r3 = "unknown fallback type "
            r2.append(r3)     // Catch:{ ClassCastException -> 0x0133 }
            r2.append(r1)     // Catch:{ ClassCastException -> 0x0133 }
            java.lang.String r1 = r2.toString()     // Catch:{ ClassCastException -> 0x0133 }
            r9.<init>(r1)     // Catch:{ ClassCastException -> 0x0133 }
            throw r9     // Catch:{ ClassCastException -> 0x0133 }
        L_0x0106:
            android.content.SharedPreferences r9 = r6.a     // Catch:{ ClassCastException -> 0x0133 }
            long r1 = java.lang.Long.parseLong(r5)     // Catch:{ ClassCastException -> 0x0133 }
            long r1 = r9.getLong(r8, r1)     // Catch:{ ClassCastException -> 0x0133 }
            java.lang.String r8 = java.lang.Long.toString(r1)     // Catch:{ ClassCastException -> 0x0133 }
            goto L_0x013a
        L_0x0115:
            android.content.SharedPreferences r9 = r6.a     // Catch:{ ClassCastException -> 0x0133 }
            int r1 = java.lang.Integer.parseInt(r5)     // Catch:{ ClassCastException -> 0x0133 }
            int r9 = r9.getInt(r8, r1)     // Catch:{ ClassCastException -> 0x0133 }
            java.lang.String r8 = java.lang.Integer.toString(r9)     // Catch:{ ClassCastException -> 0x0133 }
            goto L_0x013a
        L_0x0124:
            android.content.SharedPreferences r9 = r6.a     // Catch:{ ClassCastException -> 0x0133 }
            boolean r1 = java.lang.Boolean.parseBoolean(r5)     // Catch:{ ClassCastException -> 0x0133 }
            boolean r9 = r9.getBoolean(r8, r1)     // Catch:{ ClassCastException -> 0x0133 }
            java.lang.String r8 = java.lang.Boolean.toString(r9)     // Catch:{ ClassCastException -> 0x0133 }
            goto L_0x013a
        L_0x0133:
            r9 = move-exception
            android.content.SharedPreferences r1 = r6.a     // Catch:{ ClassCastException -> 0x013f }
            java.lang.String r8 = r1.getString(r8, r5)     // Catch:{ ClassCastException -> 0x013f }
        L_0x013a:
            r7.putString(r0, r8)
            return r7
        L_0x013f:
            r7 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.preferences.LocationPreferencesChimeraContentProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        this.a = getContext().getSharedPreferences("nlp-prefs", 0);
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
