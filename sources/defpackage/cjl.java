package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* renamed from: cjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cjl {
    public final SQLiteStatement a;
    public final SQLiteStatement b;

    public cjl(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder(154);
        sb.append("DELETE FROM feature WHERE type = ? AND account_id = ? AND _id NOT IN (SELECT _id FROM feature WHERE type = ? AND account_id = ? ORDER BY _id DESC LIMIT 1)");
        this.a = sQLiteDatabase.compileStatement(sb.toString());
        StringBuilder sb2 = new StringBuilder(204);
        sb2.append("DELETE FROM feature WHERE type = ? AND (account_id IS NULL OR account_id = '') AND _id NOT IN (SELECT _id FROM feature WHERE type = ? AND (account_id IS NULL OR account_id = '') ORDER BY _id DESC LIMIT 1)");
        this.b = sQLiteDatabase.compileStatement(sb2.toString());
    }
}
