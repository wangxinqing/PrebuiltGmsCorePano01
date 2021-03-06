package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: ngh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ngh extends jjj {
    static {
        anax.a("metadata", "manifest_deps", "pinned_deps");
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        ngz.c("FontsDBHelper", "Creating database with version %s", 1);
        ngz.c("FontsDBHelper", "Executing SQL to create metadata table: %s", "CREATE TABLE metadata(id INTEGER PRIMARY KEY AUTOINCREMENT, family TEXT, width FLOAT DEFAULT 100, weight INTEGER DEFAULT 400, italic INTEGER DEFAULT 0, version INTEGER DEFAULT 1, last_accessed TIMESTAMP DEFAULT CURRENT_TIMESTAMP, UNIQUE (family, width, weight, italic));");
        sQLiteDatabase.execSQL("CREATE TABLE metadata(id INTEGER PRIMARY KEY AUTOINCREMENT, family TEXT, width FLOAT DEFAULT 100, weight INTEGER DEFAULT 400, italic INTEGER DEFAULT 0, version INTEGER DEFAULT 1, last_accessed TIMESTAMP DEFAULT CURRENT_TIMESTAMP, UNIQUE (family, width, weight, italic));");
        ngz.c("FontsDBHelper", "Executing SQL to create manifest dep table: %s", "CREATE TABLE manifest_deps(package TEXT, font_id INTEGER, FOREIGN KEY (font_id) REFERENCES metadata(id));");
        sQLiteDatabase.execSQL("CREATE TABLE manifest_deps(package TEXT, font_id INTEGER, FOREIGN KEY (font_id) REFERENCES metadata(id));");
        ngz.c("FontsDBHelper", "Executing SQL to create pinned dep table: %s", "CREATE TABLE pinned_deps(package TEXT, font_id INTEGER, FOREIGN KEY (font_id) REFERENCES metadata(id));");
        sQLiteDatabase.execSQL("CREATE TABLE pinned_deps(package TEXT, font_id INTEGER, FOREIGN KEY (font_id) REFERENCES metadata(id));");
    }

    public final void c(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Exception e) {
                ngz.a("FontsDBHelper", "Error closing SQLiteDatabase ", e);
            }
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public ngh(Context context) {
        super(context, "metadata.db", "metadata.db", 1);
    }

    public final void a(String str) {
        try {
            getWritableDatabase().delete("manifest_deps", "package = ?", new String[]{str});
            try {
                getWritableDatabase().close();
            } catch (SQLiteException e) {
            }
        } catch (SQLiteException e2) {
        }
    }

    public final boolean a(String str, FontMatchSpec fontMatchSpec, SQLiteDatabase sQLiteDatabase) {
        int i;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT id FROM metadata WHERE family = ?  AND width = ?  AND weight = ?  AND italic = ?", new String[]{fontMatchSpec.b, String.valueOf(fontMatchSpec.c), String.valueOf(fontMatchSpec.d), String.valueOf(fontMatchSpec.e)});
        if (rawQuery.getCount() == 0) {
            rawQuery.close();
            i = -1;
        } else {
            rawQuery.moveToNext();
            i = rawQuery.getInt(0);
            rawQuery.close();
        }
        if (i != -1) {
            Integer valueOf = Integer.valueOf(i);
            ngz.c("FontsDBHelper", "Add manifest dep: Font %s resolved to fontId %d", fontMatchSpec.toString(), valueOf);
            ContentValues contentValues = new ContentValues();
            contentValues.put("package", str);
            contentValues.put("font_id", valueOf);
            sQLiteDatabase.insertWithOnConflict("manifest_deps", (String) null, contentValues, 5);
            return true;
        }
        ngz.c("FontsDBHelper", "Add manifest dep: Font not found in database: %s", fontMatchSpec.toString());
        return false;
    }
}
