package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.os.CancellationSignal;
import android.util.Log;
import java.util.BitSet;

/* renamed from: wtx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wtx {
    public static int c = 0;
    public static int d = 0;
    public final wtu a;
    public final SQLiteDatabase b;
    private final Context e;
    private final wtz f;
    private final boolean g;
    private int h;
    private final BitSet i = new BitSet();
    private boolean j;

    public wtx(Context context, wtz wtz, wtu wtu, SQLiteDatabase sQLiteDatabase, boolean z) {
        this.e = context;
        this.f = wtz;
        this.a = wtu;
        this.b = sQLiteDatabase;
        this.g = z;
    }

    private final void a(boolean z) {
        if (ayws.i()) {
            d++;
        }
        j();
        e();
        this.a.c();
        int i2 = this.h - 1;
        this.h = i2;
        if (!this.i.get(i2)) {
            this.j = true;
            if (!z) {
                Log.i("PeopleDatabase", "Transaction rolling back");
                wus.a(this.e, "PeopleDatabase", "Transaction rolling back", (Throwable) new ycl());
            }
        }
        if (this.h == 0) {
            if (!this.j) {
                this.b.setTransactionSuccessful();
                this.f.d();
            } else {
                this.f.d();
            }
            this.b.endTransaction();
        }
        this.a.b();
    }

    public static final void h() {
        c = 0;
        d = 0;
    }

    private final void j() {
        if (!this.g) {
            Log.w("PeopleDatabase", "Write detected on readonly db", new ycl());
        }
    }

    public final long b(String str, String[] strArr) {
        return DatabaseUtils.longForQuery(this.b, str, strArr);
    }

    public final String c(String str, String[] strArr) {
        try {
            return DatabaseUtils.stringForQuery(this.b, str, strArr);
        } catch (SQLiteDoneException e2) {
            return null;
        }
    }

    public final void d() {
        a(false);
    }

    public final void e() {
        iva.a(g());
    }

    public final void f() {
        iva.a(!g());
    }

    public final boolean g() {
        return this.b.inTransaction();
    }

    public final void b() {
        j();
        e();
        this.a.c();
        this.i.set(this.h - 1, true);
    }

    public final void c() {
        a(true);
    }

    public final void i() {
        boolean z;
        j();
        e();
        this.a.c();
        if (this.h == 1) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        iva.a(!this.i.get(0), (Object) "Trying to yield after setTransactionSuccessful");
        iva.a(!this.j, (Object) "Trying to yield on failed transaction.");
        this.f.d();
        this.b.setTransactionSuccessful();
        this.b.endTransaction();
        this.b.beginTransaction();
    }

    public final int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        j();
        this.a.a();
        try {
            return this.b.update(str, contentValues, str2, strArr);
        } finally {
            this.a.b();
        }
    }

    public final int a(String str, String str2, String[] strArr) {
        j();
        this.a.a();
        try {
            return this.b.delete(str, str2, strArr);
        } finally {
            this.a.b();
        }
    }

    public final long a(String str, ContentValues contentValues) {
        j();
        this.a.a();
        try {
            return this.b.insertOrThrow(str, (String) null, contentValues);
        } finally {
            this.a.b();
        }
    }

    public final long a(String str, String[] strArr, long j2) {
        try {
            return DatabaseUtils.longForQuery(this.b, str, strArr);
        } catch (SQLiteDoneException e2) {
            return j2;
        }
    }

    public final Cursor a(String str, String[] strArr) {
        return this.b.rawQuery(str, strArr, (CancellationSignal) null);
    }

    public final Cursor a(String str, String[] strArr, String str2, String[] strArr2) {
        return this.b.query(str, strArr, str2, strArr2, (String) null, (String) null, (String) null);
    }

    public final void a() {
        if (ayws.i()) {
            c++;
        }
        j();
        this.a.a();
        this.i.set(this.h, false);
        int i2 = this.h + 1;
        this.h = i2;
        if (i2 == 1) {
            this.j = false;
            this.b.beginTransaction();
        }
    }

    public final void a(String str) {
        j();
        this.a.a();
        try {
            this.b.execSQL(str);
        } finally {
            this.a.b();
        }
    }

    public final void a(String str, Object[] objArr) {
        j();
        this.a.a();
        try {
            this.b.execSQL(str, objArr);
        } finally {
            this.a.b();
        }
    }
}
