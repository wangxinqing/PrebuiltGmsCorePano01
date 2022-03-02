package com.google.android.gms.subscribedfeeds;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.google.android.chimera.ContentProvider;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GmsSubscribedFeedsChimeraProvider extends ContentProvider {
    private static final Map a;
    private UriMatcher b;
    private jjj c;
    private ContentResolver d;
    private final ScheduledExecutorService e = qvj.b.c(1);
    private acug f;

    private static ContentValues a(ContentValues contentValues) {
        ContentValues contentValues2 = new ContentValues(contentValues);
        contentValues2.put("_sync_dirty", 1);
        return contentValues2;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        try {
            if (a(3)) {
                if (azpv.d()) {
                    return this.d.delete(a(uri), str, strArr);
                }
                if (this.c != null) {
                    int delete = this.c.getWritableDatabase().delete("feeds", a(uri, str, "Delete"), strArr);
                    a(uri, (long) delete);
                    return delete;
                }
                Log.e("GmsSubscribedFeeds", "Cannot Open database.");
            }
            return 0;
        } catch (SQLiteException | UnsupportedOperationException e2) {
            Log.e("GmsSubscribedFeeds", "Could not perform the delete operation: ", e2);
            return 0;
        }
    }

    public final String getType(Uri uri) {
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("GetType: Uri: ");
        sb.append(valueOf);
        Log.i("GmsSubscribedFeeds", sb.toString());
        int match = a().match(uri);
        if (match == 1) {
            return "vnd.android.cursor.dir/com.google.android.gms.subscribedfeeds.feeds";
        }
        if (match == 2) {
            return "vnd.android.cursor.item/com.google.android.gms.subscribedfeeds.feeds";
        }
        Log.e("GmsSubscribedFeeds", "Unknown URL.");
        return "";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        try {
            if (a(1)) {
                if (azpv.d()) {
                    return this.d.insert(a(uri), contentValues);
                }
                jjj jjj = this.c;
                if (jjj != null) {
                    SQLiteDatabase writableDatabase = jjj.getWritableDatabase();
                    int match = a().match(uri);
                    if (match == 1) {
                        long insert = writableDatabase.insert("feeds", "feed", a(contentValues));
                        Uri uri2 = acur.a;
                        if (insert > 0) {
                            Uri withAppendedPath = Uri.withAppendedPath(uri2, String.valueOf(insert));
                            a(withAppendedPath, insert);
                            return withAppendedPath;
                        }
                        return null;
                    } else if (match != 3) {
                        String valueOf = String.valueOf(uri);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("Insert not permitted for URL: ");
                        sb.append(valueOf);
                        throw new UnsupportedOperationException(sb.toString());
                    } else {
                        throw new UnsupportedOperationException("_deleted_feeds table is only used by the old sync adapter during the sync operation and cannot be queried or updated from the external clients.");
                    }
                } else {
                    Log.e("GmsSubscribedFeeds", "Cannot Open database.");
                }
            }
            return null;
        } catch (SQLiteException | UnsupportedOperationException e2) {
            Log.e("GmsSubscribedFeeds", "Could not perform the insert operation: ", e2);
        }
    }

    public final boolean onCreate() {
        this.d = getContext().getContentResolver();
        try {
            this.c = new acur(getContext().createPackageContext("com.google.android.gsf", 0), "subscribedfeeds.db");
        } catch (Exception e2) {
            Log.e("GmsSubscribedFeeds", "Can't find package: com.google.android.gsf", e2);
        }
        if (!azpv.a.a().d()) {
            return true;
        }
        acug a2 = acug.a(this.e, new ahgr(getContext(), "STREAMZ_SUBSCRIBEDFEEDS"));
        this.f = a2;
        a2.a(azpv.e());
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        try {
            if (!a(4)) {
                return null;
            }
            if (!azpv.d()) {
                SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
                Uri uri2 = uri;
                int match = a().match(uri);
                if (match == 1) {
                    str3 = null;
                } else if (match == 2) {
                    String valueOf = String.valueOf(uri.getPathSegments().get(1));
                    sQLiteQueryBuilder.appendWhere(valueOf.length() == 0 ? new String("feeds._id=") : "feeds._id=".concat(valueOf));
                    str3 = null;
                } else if (match == 3) {
                    throw new UnsupportedOperationException("_deleted_feeds table is only used by the old sync adapter during the sync operation and cannot be queried or updated from the external clients.");
                } else if (match == 4) {
                    sQLiteQueryBuilder.setDistinct(true);
                    sQLiteQueryBuilder.setProjectionMap(a);
                    str3 = "_sync_account_type,_sync_account";
                } else {
                    String valueOf2 = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 18);
                    sb.append("Unrecognised url: ");
                    sb.append(valueOf2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (this.c != null) {
                    sQLiteQueryBuilder.setTables("feeds");
                    return sQLiteQueryBuilder.query(this.c.getReadableDatabase(), strArr, str, strArr2, str3, (String) null, str2);
                }
                Log.e("GmsSubscribedFeeds", "Cannot Open database.");
                return null;
            }
            Uri uri3 = uri;
            return this.d.query(a(uri), strArr, str, strArr2, str2);
        } catch (SQLiteException | UnsupportedOperationException e2) {
            Log.e("GmsSubscribedFeeds", "Could not process the query: ", e2);
            return null;
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            if (a(2)) {
                if (azpv.d()) {
                    return this.d.update(a(uri), contentValues, str, strArr);
                }
                if (this.c != null) {
                    int update = this.c.getWritableDatabase().update("feeds", a(contentValues), a(uri, str, "Update"), strArr);
                    a(uri, (long) update);
                    return update;
                }
                Log.e("GmsSubscribedFeeds", "Cannot Open database.");
            }
            return 0;
        } catch (SQLiteException | UnsupportedOperationException e2) {
            Log.e("GmsSubscribedFeeds", "Could not perform the update operation: ", e2);
            return 0;
        }
    }

    static {
        Map b2 = jir.b(3, false);
        b2.put("_count", "COUNT(*) AS _count");
        b2.put("_sync_account", "_sync_account");
        b2.put("_sync_account_type", "_sync_account_type");
        a = Collections.unmodifiableMap(b2);
    }

    private final UriMatcher a() {
        if (this.b == null) {
            UriMatcher uriMatcher = new UriMatcher(-1);
            this.b = uriMatcher;
            uriMatcher.addURI("com.google.android.gms.subscribedfeeds", "feeds", 1);
            this.b.addURI("com.google.android.gms.subscribedfeeds", "feeds/#", 2);
            this.b.addURI("com.google.android.gms.subscribedfeeds", "deleted_feeds", 3);
            this.b.addURI("com.google.android.gms.subscribedfeeds", "accounts", 4);
        }
        return this.b;
    }

    private static Uri a(Uri uri) {
        return uri.buildUpon().authority("subscribedfeeds").build();
    }

    private final String a(Uri uri, String str, String str2) {
        int match = a().match(uri);
        if (match == 1) {
            return str;
        }
        if (match == 2) {
            String valueOf = String.valueOf(uri.getPathSegments().get(1));
            String str3 = valueOf.length() == 0 ? new String("_id=") : "_id=".concat(valueOf);
            if (str == null || str.isEmpty()) {
                return str3;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 7 + str.length());
            sb.append(str3);
            sb.append(" AND (");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(str2.length() + 24 + String.valueOf(valueOf2).length());
        sb2.append(str2);
        sb2.append(" not permitted for URL: ");
        sb2.append(valueOf2);
        throw new UnsupportedOperationException(sb2.toString());
    }

    private final void a(Uri uri, long j) {
        if (j > 0) {
            this.d.notifyChange(uri, (ContentObserver) null, true);
        }
    }

    private final boolean a(int i) {
        long j;
        String str;
        if (i != 4) {
            if (Binder.getCallingUid() != Process.myUid()) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    hya.a(getContext()).a(getCallingPackage());
                } catch (SecurityException e2) {
                    Log.e("GmsSubscribedFeeds", "Signature check failed. The calling package is not google signed.", e2);
                    return false;
                }
            }
            int i3 = Build.VERSION.SDK_INT;
            if (Binder.getCallingUid() != Process.myUid()) {
                int i4 = i - 1;
                if (i4 == 0 || i4 == 1) {
                    j = azpv.a.a().b();
                } else {
                    j = azpv.a.a().a();
                }
                if (j > 0) {
                    try {
                        if (((long) getContext().getPackageManager().getApplicationInfo(getCallingPackage(), 0).targetSdkVersion) >= j) {
                            acug acug = this.f;
                            if (acug != null) {
                                if (i != 1) {
                                    str = i != 2 ? "DELETE" : "UPDATE";
                                } else {
                                    str = "INSERT";
                                }
                                ((ahgz) acug.c.a()).b(str);
                            }
                            return false;
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                    }
                }
            }
        }
        return true;
    }
}
