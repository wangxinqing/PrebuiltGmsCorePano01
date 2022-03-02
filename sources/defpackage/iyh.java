package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.ContentProvider;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: iyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class iyh extends ContentProvider implements SQLiteTransactionListener {
    protected static final ReentrantLock a = new ReentrantLock();
    private volatile boolean b;
    private final ThreadLocal c = new ThreadLocal();

    protected static final int a(SQLiteDatabase sQLiteDatabase, Uri uri, String str, String str2, ContentValues contentValues) {
        long parseId = ContentUris.parseId(uri);
        return sQLiteDatabase.update(str, contentValues, str2.concat("=?"), new String[]{String.valueOf(parseId)});
    }

    private final boolean e() {
        return this.c.get() != null && ((Boolean) this.c.get()).booleanValue();
    }

    /* access modifiers changed from: protected */
    public abstract int a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues, String str, String[] strArr);

    /* access modifiers changed from: protected */
    public abstract int a(SQLiteDatabase sQLiteDatabase, Uri uri, String str, String[] strArr);

    /* access modifiers changed from: protected */
    public abstract AssetFileDescriptor a(Uri uri, String str);

    /* access modifiers changed from: protected */
    public abstract Cursor a(SQLiteDatabase sQLiteDatabase, Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    /* access modifiers changed from: protected */
    public abstract Uri a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues);

    /* access modifiers changed from: protected */
    public abstract void a();

    public final ContentProviderResult[] applyBatch(ArrayList arrayList) {
        if (a(arrayList) == null) {
            return new ContentProviderResult[0];
        }
        a.lock();
        try {
            ContentProviderResult[] a2 = a(c().getWritableDatabase(), arrayList);
            a.unlock();
            return a2;
        } catch (SQLiteCantOpenDatabaseException e) {
            throw new OperationApplicationException(e);
        } catch (Throwable th) {
            a.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public abstract String b();

    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        SQLiteDatabase writableDatabase;
        a.lock();
        try {
            writableDatabase = c().getWritableDatabase();
            writableDatabase.beginTransactionWithListener(this);
            for (ContentValues a2 : contentValuesArr) {
                if (a(writableDatabase, uri, a2) != null) {
                    this.b = true;
                }
                boolean z = this.b;
                writableDatabase.yieldIfContendedSafely();
                this.b = z;
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            d();
            a.unlock();
            return r1;
        } catch (Throwable th) {
            a.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public abstract SQLiteOpenHelper c();

    /* access modifiers changed from: protected */
    public final void d() {
        if (this.b) {
            this.b = false;
            a();
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase writableDatabase;
        int i;
        a.lock();
        try {
            writableDatabase = c().getWritableDatabase();
            if (e()) {
                i = a(writableDatabase, uri, str, strArr);
                if (i > 0) {
                    this.b = true;
                }
            } else {
                writableDatabase.beginTransactionWithListener(this);
                i = a(writableDatabase, uri, str, strArr);
                if (i > 0) {
                    this.b = true;
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                d();
            }
            a.unlock();
            return i;
        } catch (Throwable th) {
            a.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final Uri insert(Uri uri, ContentValues contentValues) {
        SQLiteDatabase writableDatabase;
        Uri uri2;
        a.lock();
        try {
            writableDatabase = c().getWritableDatabase();
            if (e()) {
                uri2 = a(writableDatabase, uri, contentValues);
                if (uri2 != null) {
                    this.b = true;
                }
            } else {
                writableDatabase.beginTransactionWithListener(this);
                uri2 = a(writableDatabase, uri, contentValues);
                if (uri2 != null) {
                    this.b = true;
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                d();
            }
            a.unlock();
            return uri2;
        } catch (SQLiteCantOpenDatabaseException e) {
            try {
                Log.e("BaseGmsContentProvider", "Failed to open db", e);
                a.unlock();
                return null;
            } catch (Throwable th) {
                a.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            writableDatabase.endTransaction();
            throw th2;
        }
    }

    public final void onBegin() {
    }

    public final void onCommit() {
    }

    public boolean onCreate() {
        return true;
    }

    public final void onRollback() {
    }

    public final AssetFileDescriptor openAssetFile(Uri uri, String str) {
        a.lock();
        try {
            return a(uri, str);
        } finally {
            a.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        a.lock();
        try {
            Cursor a2 = a(c().getReadableDatabase(), uri, strArr, str, strArr2, str2);
            a.unlock();
            return a2;
        } catch (SQLiteCantOpenDatabaseException e) {
            Log.e("BaseGmsContentProvider", "Failed to open db", e);
            a.unlock();
            return null;
        } catch (Throwable th) {
            a.unlock();
            throw th;
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        SQLiteDatabase writableDatabase;
        int i;
        a.lock();
        try {
            writableDatabase = c().getWritableDatabase();
            if (e()) {
                i = a(writableDatabase, uri, contentValues, str, strArr);
                if (i > 0) {
                    this.b = true;
                }
            } else {
                writableDatabase.beginTransactionWithListener(this);
                i = a(writableDatabase, uri, contentValues, str, strArr);
                if (i > 0) {
                    this.b = true;
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                d();
            }
            a.unlock();
            return i;
        } catch (Throwable th) {
            a.unlock();
            throw th;
        }
    }

    private final Uri a(ArrayList arrayList) {
        if (arrayList.size() == 0) {
            return null;
        }
        Uri uri = ((ContentProviderOperation) arrayList.get(0)).getUri();
        String b2 = b();
        if (!Build.TYPE.equals("user")) {
            int size = arrayList.size();
            for (int i = 1; i < size; i++) {
                ((ContentProviderOperation) arrayList.get(i)).getUri();
                irk.a(ius.a(b2, b()), (Object) "URIs in batch operation refer to different databases");
            }
        }
        return uri;
    }

    private final ContentProviderResult[] a(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        sQLiteDatabase.beginTransactionWithListener(this);
        try {
            this.c.set(true);
            int size = arrayList.size();
            ContentProviderResult[] contentProviderResultArr = new ContentProviderResult[size];
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < size) {
                i2++;
                if (i2 <= 500) {
                    try {
                        ContentProviderOperation contentProviderOperation = (ContentProviderOperation) arrayList.get(i);
                        if (i > 0) {
                            if (contentProviderOperation.isYieldAllowed()) {
                                boolean z = this.b;
                                if (sQLiteDatabase.yieldIfContendedSafely(4000)) {
                                    a(arrayList);
                                    sQLiteDatabase = c().getWritableDatabase();
                                    this.b = z;
                                    i3++;
                                }
                                i2 = 0;
                            }
                        }
                        contentProviderResultArr[i] = contentProviderOperation.apply(getContainerContentProvider(), contentProviderResultArr, i);
                        i++;
                    } catch (SQLiteCantOpenDatabaseException e) {
                        e = e;
                        try {
                            throw new OperationApplicationException(e);
                        } catch (Throwable th) {
                            th = th;
                            this.c.set(false);
                            sQLiteDatabase.endTransaction();
                            d();
                            throw th;
                        }
                    }
                } else {
                    throw new OperationApplicationException("Too many content provider operations between yield points. The maximum number of operations per yield point is 500", i3);
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            this.c.set(false);
            sQLiteDatabase.endTransaction();
            d();
            return contentProviderResultArr;
        } catch (SQLiteCantOpenDatabaseException e2) {
            e = e2;
            throw new OperationApplicationException(e);
        } catch (Throwable th2) {
            th = th2;
            this.c.set(false);
            sQLiteDatabase.endTransaction();
            d();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final Uri a(SQLiteDatabase sQLiteDatabase, Uri uri, Uri uri2, String str, ContentValues contentValues, String str2, String[] strArr) {
        int update = update(uri2, contentValues, str2, strArr);
        if (update == 1) {
            Cursor query = query(uri2, new String[]{"_id"}, str2, strArr, (String) null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        long j = query.getLong(0);
                        query.close();
                        return ContentUris.withAppendedId(uri, j);
                    }
                } catch (Throwable th) {
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
            String valueOf = String.valueOf(uri2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Could not find internal ID for URI ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        if (update == 0) {
            long insert = sQLiteDatabase.insert(str, (String) null, contentValues);
            if (insert >= 0) {
                return ContentUris.withAppendedId(uri, insert);
            }
        } else if (update > 1) {
            throw new IllegalArgumentException("Upsert affected multiple rows");
        }
        return null;
    }
}
