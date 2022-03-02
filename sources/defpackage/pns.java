package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: pns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pns extends pmu {
    private final Cursor a;
    private final int b;

    public pns(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("contacts", new String[]{"contact_id"}, str, (String[]) null, (String) null, (String) null, "contact_id");
        this.a = query;
        this.b = query.getColumnIndex("contact_id");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object d() {
        try {
            if (this.a.moveToNext()) {
                return Long.valueOf(this.a.getLong(this.b));
            }
            return null;
        } catch (IllegalStateException e) {
            return null;
        }
    }
}
