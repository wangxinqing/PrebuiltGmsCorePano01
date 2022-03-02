package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* renamed from: di  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class di implements Closeable {
    private static final String[] b = new String[0];
    public final SQLiteDatabase a;

    public di(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public final Cursor a(dg dgVar) {
        return this.a.rawQueryWithFactory(new dh(dgVar), dgVar.a(), b, (String) null);
    }

    public final void b() {
        this.a.endTransaction();
    }

    public final C0000do c(String str) {
        return new C0000do(this.a.compileStatement(str));
    }

    public final void close() {
        this.a.close();
    }

    public final boolean d() {
        return this.a.inTransaction();
    }

    public final boolean e() {
        return this.a.isOpen();
    }

    public final String f() {
        return this.a.getPath();
    }

    public final void b(String str) {
        this.a.execSQL(str);
    }

    public final void c() {
        this.a.setTransactionSuccessful();
    }

    public final Cursor a(String str) {
        return a((dg) new da(str));
    }

    public final void a() {
        this.a.beginTransaction();
    }
}
