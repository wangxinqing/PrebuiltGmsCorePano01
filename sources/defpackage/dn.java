package defpackage;

import android.database.sqlite.SQLiteProgram;

/* renamed from: dn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class dn implements df {
    public final SQLiteProgram a;

    public dn(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    public final void a(int i) {
        this.a.bindNull(i);
    }

    public final void close() {
        this.a.close();
    }

    public final void a(int i, long j) {
        this.a.bindLong(i, j);
    }

    public final void a(int i, String str) {
        this.a.bindString(i, str);
    }

    public final void a(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }
}
