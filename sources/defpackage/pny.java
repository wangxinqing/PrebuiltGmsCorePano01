package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: pny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pny implements pmt {
    private final pnt a;
    private final pnv b;
    private final pnv c;
    private final pnv d;

    public pny(SQLiteDatabase sQLiteDatabase, String str) {
        this.a = new pnt(sQLiteDatabase, str);
        this.b = new pnu(sQLiteDatabase, str);
        this.c = new pnw(sQLiteDatabase, str);
        this.d = new pnx(sQLiteDatabase, str);
    }

    public final void a() {
        pnz.d("Closing local iterator (read %s)", poz.a(b()));
        pnt pnt = this.a;
        pnz.d("Closing contacts iterator (read %s)", poz.a(pnt.b));
        pnt.a.close();
        this.b.a();
        this.c.a();
        this.d.a();
    }

    public final long b() {
        return this.a.b + this.b.b + this.c.b + this.d.b;
    }

    public final boolean c() {
        return true;
    }

    /* renamed from: d */
    public final pms next() {
        ContentValues contentValues = (ContentValues) this.a.next();
        long longValue = contentValues.getAsLong("contact_id").longValue();
        return new pms(contentValues, (ContentValues) null, this.b.a(longValue), this.c.a(longValue), this.d.a(longValue));
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
