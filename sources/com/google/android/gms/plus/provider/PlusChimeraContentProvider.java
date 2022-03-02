package com.google.android.gms.plus.provider;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlusChimeraContentProvider extends iyh implements OnAccountsUpdateListener {
    private static UriMatcher d;
    public zai b;
    public File c;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        d = uriMatcher;
        uriMatcher.addURI("com.google.android.gms.plus.action", "frames", 2);
        d.addURI("com.google.android.gms.plus.action", "frames/#", 3);
        d.addURI("com.google.android.gms.plus.action", "analytics", 4);
        d.addURI("com.google.android.gms.plus", "images", 5);
        d.addURI("com.google.android.gms.plus", "avatars/*", 6);
        d.addURI("com.google.android.gms.plus.action", "profiles", 7);
    }

    public final ContentValues b(String str, SQLiteDatabase sQLiteDatabase) {
        Cursor query;
        if (str == null || (query = sQLiteDatabase.query("plus_accounts", new String[]{"account_name", "profile_image_url"}, "account_name=?", new String[]{str}, (String) null, (String) null, (String) null)) == null) {
            return null;
        }
        try {
            if (query.moveToFirst()) {
                ContentValues contentValues = new ContentValues(2);
                DatabaseUtils.cursorRowToContentValues(query, contentValues);
                return contentValues;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "plus.db";
    }

    /* access modifiers changed from: protected */
    public final SQLiteOpenHelper c() {
        return this.b;
    }

    public final String getType(Uri uri) {
        switch (d.match(uri)) {
            case 2:
                return "vnd.android.cursor.dir/vnd.google.android.gms.plus.actions";
            case 3:
                return "vnd.android.cursor.dir/vnd.google.android.gms.plus.action";
            case 4:
                return "vnd.android.cursor.dir/vnd.google.android.gms.plus.analytics";
            case 5:
            case 6:
                return "vnd.android.cursor.item/vnd.google.android.gms.image";
            case 7:
                return "vnd.android.cursor.dir/vnd.google.android.gms.plus.profiles";
            default:
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unknown content URI: ");
                sb.append(valueOf);
                throw new UnsupportedOperationException(sb.toString());
        }
    }

    public final void onAccountsUpdated(Account[] accountArr) {
        new zag(getContext().getContentResolver()).execute(accountArr);
    }

    public final boolean onCreate() {
        Context context = getContext();
        qub.a(context).a((OnAccountsUpdateListener) this, true);
        this.c = new File(context.getCacheDir(), "avatars");
        this.b = new zai(getContext(), "plus.db");
        return true;
    }

    private final ContentValues a(Uri uri) {
        String str;
        iva.a((Object) uri, (Object) "URI must not be null.");
        if ("com.google.android.gms.plus".equals(uri.getAuthority())) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 2) {
                str = pathSegments.get(1);
            } else {
                str = null;
            }
            if (str != null) {
                return b(str, this.b.getReadableDatabase());
            }
            return null;
        }
        throw new IllegalArgumentException("URI is not a +1 URI.");
    }

    /* access modifiers changed from: protected */
    public final int a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Unknown URI: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final int a(SQLiteDatabase sQLiteDatabase, Uri uri, String str, String[] strArr) {
        int match = d.match(uri);
        if (match == 3) {
            return sQLiteDatabase.delete("offline_frames", "_id=?", new String[]{Long.toString(ContentUris.parseId(uri))});
        } else if (match == 4) {
            return sQLiteDatabase.delete("offline_logs", str, strArr);
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Unknown URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0122 A[Catch:{ all -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0148 A[SYNTHETIC, Splitter:B:55:0x0148] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0158 A[SYNTHETIC, Splitter:B:64:0x0158] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.res.AssetFileDescriptor a(android.net.Uri r13, java.lang.String r14) {
        /*
            r12 = this;
            android.content.UriMatcher r0 = d
            int r0 = r0.match(r13)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = 5
            r3 = 0
            if (r0 == r2) goto L_0x00c8
            r2 = 6
            if (r0 == r2) goto L_0x0014
            android.content.res.AssetFileDescriptor r13 = super.openAssetFile(r13, r14)
            return r13
        L_0x0014:
            java.lang.String r0 = "r"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x008d
            android.content.ContentValues r14 = r12.a(r13)
            if (r14 == 0) goto L_0x0068
            java.lang.String r0 = "account_name"
            java.lang.String r14 = r14.getAsString(r0)
            if (r14 == 0) goto L_0x0043
            java.io.File r13 = new java.io.File
            java.io.File r0 = r12.c
            r13.<init>(r0, r14)
            android.content.res.AssetFileDescriptor r14 = new android.content.res.AssetFileDescriptor
            android.os.ParcelFileDescriptor r3 = android.os.ParcelFileDescriptor.open(r13, r1)
            r4 = 0
            long r6 = r13.length()
            r2 = r14
            r2.<init>(r3, r4, r6)
            return r14
        L_0x0043:
            java.io.FileNotFoundException r14 = new java.io.FileNotFoundException
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 12
            r1.<init>(r0)
            java.lang.String r0 = "No account: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r14.<init>(r13)
            throw r14
        L_0x0068:
            java.io.FileNotFoundException r14 = new java.io.FileNotFoundException
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 15
            r1.<init>(r0)
            java.lang.String r0 = "No image data: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r14.<init>(r13)
            throw r14
        L_0x008d:
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r0 = r0.length()
            java.lang.String r1 = java.lang.String.valueOf(r14)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r0 = r0 + 30
            int r0 = r0 + r1
            r2.<init>(r0)
            java.lang.String r0 = "Failed to open '"
            r2.append(r0)
            r2.append(r13)
            java.lang.String r13 = "' with mode '"
            r2.append(r13)
            r2.append(r14)
            java.lang.String r13 = "'"
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            java.lang.String r14 = "PlusContentProvider"
            android.util.Log.e(r14, r13)
            return r3
        L_0x00c8:
            yrv r0 = defpackage.yrv.a()
            oi r4 = r0.c
            monitor-enter(r4)
            oi r0 = r0.c     // Catch:{ all -> 0x0168 }
            java.lang.Object r0 = r0.a((java.lang.Object) r13)     // Catch:{ all -> 0x0168 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0168 }
            monitor-exit(r4)     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x0163
            java.lang.String r4 = "img"
            android.content.Context r5 = r12.getContext()     // Catch:{ IOException -> 0x0118, all -> 0x0115 }
            java.io.File r5 = r5.getCacheDir()     // Catch:{ IOException -> 0x0118, all -> 0x0115 }
            java.io.File r4 = java.io.File.createTempFile(r4, r3, r5)     // Catch:{ IOException -> 0x0118, all -> 0x0115 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0111, all -> 0x010f }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0111, all -> 0x010f }
            r5.write(r0)     // Catch:{ IOException -> 0x010d, all -> 0x010b }
            android.content.res.AssetFileDescriptor r0 = new android.content.res.AssetFileDescriptor     // Catch:{ IOException -> 0x010d, all -> 0x010b }
            android.os.ParcelFileDescriptor r7 = android.os.ParcelFileDescriptor.open(r4, r1)     // Catch:{ IOException -> 0x010d, all -> 0x010b }
            r8 = 0
            long r10 = r4.length()     // Catch:{ IOException -> 0x010d, all -> 0x010b }
            r6 = r0
            r6.<init>(r7, r8, r10)     // Catch:{ IOException -> 0x010d, all -> 0x010b }
            r5.close()     // Catch:{ IOException -> 0x0104 }
            goto L_0x0105
        L_0x0104:
            r13 = move-exception
        L_0x0105:
            if (r4 == 0) goto L_0x010a
            r4.delete()
        L_0x010a:
            return r0
        L_0x010b:
            r13 = move-exception
            goto L_0x0155
        L_0x010d:
            r0 = move-exception
            goto L_0x0113
        L_0x010f:
            r13 = move-exception
            goto L_0x0156
        L_0x0111:
            r0 = move-exception
            r5 = r3
        L_0x0113:
            r3 = r4
            goto L_0x011a
        L_0x0115:
            r13 = move-exception
            r4 = r3
            goto L_0x0156
        L_0x0118:
            r0 = move-exception
            r5 = r3
        L_0x011a:
            java.lang.String r1 = "PlusContentProvider"
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x0153 }
            if (r1 == 0) goto L_0x0146
            java.lang.String r1 = "PlusContentProvider"
            java.lang.String r2 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0153 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0153 }
            int r4 = r4.length()     // Catch:{ all -> 0x0153 }
            int r4 = r4 + 37
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0153 }
            r6.<init>(r4)     // Catch:{ all -> 0x0153 }
            java.lang.String r4 = "Failed to create temp image file for "
            r6.append(r4)     // Catch:{ all -> 0x0153 }
            r6.append(r2)     // Catch:{ all -> 0x0153 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0153 }
            android.util.Log.w(r1, r2, r0)     // Catch:{ all -> 0x0153 }
        L_0x0146:
            if (r5 == 0) goto L_0x014d
            r5.close()     // Catch:{ IOException -> 0x014c }
            goto L_0x014d
        L_0x014c:
            r0 = move-exception
        L_0x014d:
            if (r3 == 0) goto L_0x0163
            r3.delete()
            goto L_0x0163
        L_0x0153:
            r13 = move-exception
            r4 = r3
        L_0x0155:
            r3 = r5
        L_0x0156:
            if (r3 == 0) goto L_0x015d
            r3.close()     // Catch:{ IOException -> 0x015c }
            goto L_0x015d
        L_0x015c:
            r14 = move-exception
        L_0x015d:
            if (r4 == 0) goto L_0x0162
            r4.delete()
        L_0x0162:
            throw r13
        L_0x0163:
            android.content.res.AssetFileDescriptor r13 = super.openAssetFile(r13, r14)
            return r13
        L_0x0168:
            r13 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0168 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.plus.provider.PlusChimeraContentProvider.a(android.net.Uri, java.lang.String):android.content.res.AssetFileDescriptor");
    }

    public final Cursor a(SQLiteDatabase sQLiteDatabase, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        ContentValues a;
        int i;
        Uri uri2 = uri;
        String[] strArr3 = strArr;
        int match = d.match(uri);
        if (match == 2) {
            Cursor query = sQLiteDatabase.query("offline_frames", strArr, str, strArr2, (String) null, (String) null, str2);
            query.setNotificationUri(getContext().getContentResolver(), yty.a);
            return query;
        } else if (match == 4) {
            Cursor query2 = sQLiteDatabase.query("offline_logs", strArr, str, strArr2, (String) null, (String) null, str2);
            query2.setNotificationUri(getContext().getContentResolver(), ytx.a);
            return query2;
        } else if (match == 5) {
            MatrixCursor matrixCursor = new MatrixCursor(strArr);
            if (strArr3.length == 2 && "url".equals(strArr3[0]) && "local".equals(strArr3[1])) {
                String queryParameter = uri.getQueryParameter("url");
                String queryParameter2 = uri.getQueryParameter("bounding_box");
                if (queryParameter2 != null) {
                    iqu iqu = new iqu(queryParameter);
                    iqu.a(Integer.parseInt(queryParameter2));
                    queryParameter = iqu.a();
                }
                matrixCursor.addRow(new Object[]{queryParameter, 0});
            }
            return matrixCursor;
        } else if (match == 6) {
            MatrixCursor matrixCursor2 = new MatrixCursor(strArr);
            if (strArr3.length == 2 && strArr3[0] == "url" && strArr3[1] == "local" && (a = a(uri)) != null) {
                String asString = a.getAsString("profile_image_url");
                String asString2 = a.getAsString("account_name");
                if (asString2 != null) {
                    File file = new File(this.c, asString2);
                    if (file.exists()) {
                        i = System.currentTimeMillis() - file.lastModified() > 21600000 ? 2 : 1;
                        matrixCursor2.addRow(new Object[]{asString, Integer.valueOf(i)});
                    }
                }
                i = 0;
                matrixCursor2.addRow(new Object[]{asString, Integer.valueOf(i)});
            }
            return matrixCursor2;
        } else if (match == 7) {
            Cursor query3 = sQLiteDatabase.query("plus_profiles", strArr, str, strArr2, (String) null, (String) null, str2);
            query3.setNotificationUri(getContext().getContentResolver(), yty.a);
            return query3;
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Unknown URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final Uri a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues) {
        int match = d.match(uri);
        if (match == 2) {
            return ContentUris.withAppendedId(uri, sQLiteDatabase.insertOrThrow("offline_frames", (String) null, contentValues));
        }
        if (match == 4) {
            return ContentUris.withAppendedId(uri, sQLiteDatabase.insertOrThrow("offline_logs", (String) null, contentValues));
        }
        if (match == 5) {
            yrv a = yrv.a();
            byte[] asByteArray = contentValues.getAsByteArray("image_data");
            synchronized (a.c) {
                a.c.a((Object) uri, (Object) asByteArray);
            }
            return uri;
        } else if (match == 6) {
            ContentValues a2 = a(uri);
            if (a2 != null) {
                String asString = a2.getAsString("account_name");
                if (asString != null) {
                    File file = new File(this.c, asString);
                    if (file.exists()) {
                        Log.e("PlusContentProvider", "Unexpected cache file found...removing.");
                        file.delete();
                    }
                }
                try {
                    if (!this.c.exists()) {
                        this.c.mkdir();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(this.c, asString));
                    fileOutputStream.write(contentValues.getAsByteArray("image_data"));
                    fileOutputStream.close();
                } catch (FileNotFoundException e) {
                    Log.e("PlusContentProvider", e.getLocalizedMessage());
                } catch (IOException e2) {
                    Log.e("PlusContentProvider", e2.getLocalizedMessage());
                }
            }
            return uri;
        } else if (match == 7) {
            return ContentUris.withAppendedId(uri, sQLiteDatabase.insertOrThrow("plus_profiles", (String) null, contentValues));
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Unknown URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        getContext().getContentResolver().notifyChange(yua.a, (ContentObserver) null, true);
    }

    public final void a(String str, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {str};
        sQLiteDatabase.delete("plus_accounts", "account_name=?", strArr);
        sQLiteDatabase.delete("plus_profiles", "accountName=?", strArr);
        sQLiteDatabase.delete("offline_frames", "accountName=?", strArr);
        sQLiteDatabase.delete("offline_logs", "accountName=?", strArr);
        File file = new File(this.c, str);
        if (file.exists()) {
            file.delete();
        }
    }
}
