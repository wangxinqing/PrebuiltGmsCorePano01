package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pnv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class pnv {
    protected final Cursor a;
    public long b;
    private final Map c = new HashMap();
    private final int d;
    private final int e = this.a.getColumnIndex("data_id");
    private final int f = this.a.getColumnIndex("type");
    private final int g = this.a.getColumnIndex("label");
    private final int h = this.a.getColumnIndex("score");
    private long i = -1;

    public pnv(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        Cursor query = sQLiteDatabase.query(str2, strArr, str, (String[]) null, (String) null, (String) null, "contact_id");
        this.a = query;
        this.d = query.getColumnIndex("contact_id");
    }

    private final void b() {
        long j = this.a.getLong(this.e);
        this.c.put(Long.valueOf(j), a(this.i, j, this.a.getInt(this.f), this.a.getString(this.g), this.a.getInt(this.h)));
    }

    /* access modifiers changed from: protected */
    public abstract ContentValues a(long j, long j2, int i2, String str, int i3);

    public final Map a(long j) {
        long j2 = this.i;
        if (j2 > j) {
            return Collections.emptyMap();
        }
        if (j2 < j) {
            this.c.clear();
        }
        while (this.i < j && this.a.moveToNext()) {
            this.b += poz.a(this.a);
            long j3 = this.a.getLong(this.d);
            this.i = j3;
            if (j3 >= j) {
                b();
            }
        }
        if (this.i != j) {
            return Collections.emptyMap();
        }
        while (this.i == j && this.a.moveToNext()) {
            this.b += poz.a(this.a);
            long j4 = this.a.getLong(this.d);
            if (j4 == this.i) {
                b();
            } else {
                HashMap hashMap = new HashMap(this.c);
                this.c.clear();
                this.i = j4;
                b();
                return hashMap;
            }
        }
        return new HashMap(this.c);
    }

    public final void a() {
        pnz.d("Closing data iterator (read %s). ", poz.a(this.b));
        this.a.close();
    }
}
