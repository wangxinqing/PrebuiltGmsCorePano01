package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: pnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pnt extends pmu {
    public final Cursor a;
    public long b;
    private final int c;
    private final int d = this.a.getColumnIndex("lookup_key");
    private final int e = this.a.getColumnIndex("score");
    private final int f = this.a.getColumnIndex("icon_uri");
    private final int g = this.a.getColumnIndex("display_name");
    private final int h = this.a.getColumnIndex("given_names");
    private final int i = this.a.getColumnIndex("emails");
    private final int j = this.a.getColumnIndex("nickname");
    private final int k = this.a.getColumnIndex("note");
    private final int l = this.a.getColumnIndex("organization");
    private final int m = this.a.getColumnIndex("phone_numbers");
    private final int n = this.a.getColumnIndex("postal_address");
    private final int o = this.a.getColumnIndex("phonetic_name");

    public pnt(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("contacts", pmn.a, str, (String[]) null, (String) null, (String) null, "contact_id");
        this.a = query;
        this.c = query.getColumnIndex("contact_id");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object d() {
        try {
            if (!this.a.moveToNext()) {
                return null;
            }
            this.b += poz.a(this.a);
            return pmw.a(this.a.getLong(this.c), this.a.getString(this.d), this.a.getString(this.f), this.a.getString(this.g), this.a.getString(this.h), this.a.getLong(this.e), this.a.getString(this.i), this.a.getString(this.j), this.a.getString(this.k), this.a.getString(this.l), this.a.getString(this.m), this.a.getString(this.n), this.a.getString(this.o));
        } catch (IllegalStateException e2) {
            pnz.e("Cursor improperly initialized. Return null.");
            return null;
        }
    }
}
