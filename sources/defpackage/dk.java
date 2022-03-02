package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* renamed from: dk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dk extends SQLiteOpenHelper {
    final di[] a;
    final db b;
    private boolean c;

    public dk(Context context, String str, di[] diVarArr, db dbVar) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 10, new dj(diVarArr));
        this.b = dbVar;
        this.a = diVarArr;
    }

    static di a(di[] diVarArr, SQLiteDatabase sQLiteDatabase) {
        di diVar = diVarArr[0];
        if (diVar != null && diVar.a == sQLiteDatabase) {
            return diVar;
        }
        di diVar2 = new di(sQLiteDatabase);
        diVarArr[0] = diVar2;
        return diVar2;
    }

    public final synchronized void close() {
        super.close();
        this.a[0] = null;
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    /* JADX INFO: finally extract failed */
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        db dbVar = this.b;
        di a2 = a(sQLiteDatabase);
        Cursor a3 = a2.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (a3.moveToFirst() && a3.getInt(0) == 0) {
                z = true;
            }
            a3.close();
            dbVar.b.a(a2);
            if (!z) {
                ed b2 = dbVar.b.b(a2);
                if (!b2.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + b2.b);
                }
            }
            dbVar.a(a2);
        } catch (Throwable th) {
            a3.close();
            throw th;
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.c = true;
        this.b.a(a(sQLiteDatabase), i, i2);
    }

    /* JADX INFO: finally extract failed */
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        boolean z;
        String str;
        if (!this.c) {
            db dbVar = this.b;
            di a2 = a(sQLiteDatabase);
            Cursor a3 = a2.a("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                if (!a3.moveToFirst() || a3.getInt(0) == 0) {
                    z = false;
                } else {
                    z = true;
                }
                a3.close();
                if (!z) {
                    ed b2 = dbVar.b.b(a2);
                    if (b2.a) {
                        dbVar.a(a2);
                    } else {
                        throw new IllegalStateException("Pre-packaged database has an invalid schema: " + b2.b);
                    }
                } else {
                    Cursor a4 = a2.a((dg) new da("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                    try {
                        if (a4.moveToFirst()) {
                            str = a4.getString(0);
                        } else {
                            str = null;
                        }
                        a4.close();
                        if (!dbVar.c.equals(str) && !dbVar.d.equals(str)) {
                            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                        }
                    } catch (Throwable th) {
                        a4.close();
                        throw th;
                    }
                }
                cua cua = (cua) dbVar.b;
                cua.a.e = a2;
                dw dwVar = cua.a.c;
                synchronized (dwVar) {
                    if (!dwVar.e) {
                        a2.b("PRAGMA temp_store = MEMORY;");
                        a2.b("PRAGMA recursive_triggers='ON';");
                        a2.b("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                        dwVar.a(a2);
                        dwVar.i = a2.c("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                        dwVar.e = true;
                    } else {
                        Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                    }
                }
                dbVar.a = null;
            } catch (Throwable th2) {
                a3.close();
                throw th2;
            }
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.c = true;
        this.b.a(a(sQLiteDatabase), i, i2);
    }

    /* access modifiers changed from: package-private */
    public final synchronized di a() {
        this.c = false;
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        if (this.c) {
            close();
            return a();
        }
        return a(writableDatabase);
    }

    /* access modifiers changed from: package-private */
    public final di a(SQLiteDatabase sQLiteDatabase) {
        return a(this.a, sQLiteDatabase);
    }
}
