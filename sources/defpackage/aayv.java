package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: aayv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aayv extends jjj {
    private final void c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE files_info");
        } catch (SQLException e) {
        }
        onCreate(sQLiteDatabase);
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE files_info (full_path TEXT PRIMARY KEY, time_ms INTEGER, sha256_digest BLOB, is_setuid_root INTEGER, is_symlink INTEGER, symlink_target TEXT, file_permissions INTEGER, file_owner INTEGER, file_group INTEGER, se_linux_security_context TEXT);");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(64);
        sb.append("Can't downgrade database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        throw new SQLiteException(sb.toString());
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        c(sQLiteDatabase);
    }

    public aayv(Context context) {
        super(context, "snet_files_info.db", "snet_files_info.db", 1);
    }
}
