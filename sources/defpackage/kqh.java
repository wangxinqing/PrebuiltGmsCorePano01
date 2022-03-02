package defpackage;

import android.database.Cursor;
import android.database.DatabaseUtils;

/* renamed from: kqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kqh extends kqt {
    public final kql a;

    public kqh(int i, kql kql, kqs kqs) {
        super(i, kqs);
        this.a = kql;
    }

    public static String a(Object obj) {
        if (obj == null) {
            return "NULL";
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        return DatabaseUtils.sqlEscapeString(obj.toString());
    }

    public final Long b(Cursor cursor) {
        iva.a(g());
        b(1);
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(a());
        if (!cursor.isNull(columnIndexOrThrow)) {
            return Long.valueOf(cursor.getLong(columnIndexOrThrow));
        }
        return null;
    }

    public final long c(Cursor cursor) {
        Long b = b(cursor);
        if (b != null) {
            return b.longValue();
        }
        return 0;
    }

    public final Boolean d(Cursor cursor) {
        Long b = b(cursor);
        if (b == null) {
            return null;
        }
        return Boolean.valueOf(b.longValue() != 0);
    }

    public final kqy e() {
        h();
        return kqz.b(a());
    }

    public final kqy f() {
        return a(true);
    }

    public final String toString() {
        String valueOf = String.valueOf(!g() ? ((kqp) this.b).toString() : "[not present]");
        return valueOf.length() == 0 ? new String("DatabaseField:") : "DatabaseField:".concat(valueOf);
    }

    public final String b() {
        String b = this.a.b();
        String a2 = a();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 1 + String.valueOf(a2).length());
        sb.append(b);
        sb.append('.');
        sb.append(a2);
        return sb.toString();
    }

    public final kqy c() {
        return a(false);
    }

    public final kqy e(long j) {
        b(1);
        return kqz.a(a(), j);
    }

    public final boolean f(Cursor cursor) {
        Boolean d = d(cursor);
        if (d != null) {
            return d.booleanValue();
        }
        return false;
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return sb.toString();
    }

    public final kqy b(long j) {
        b(1);
        return kqz.d(a(), j);
    }

    public final kqy c(long j) {
        b(1);
        return kqz.e(a(), j);
    }

    public final kqy d() {
        h();
        return kqz.c(a());
    }

    public final boolean e(Cursor cursor) {
        return d(cursor).booleanValue();
    }

    public final String a() {
        h();
        return ((kqp) this.b).a;
    }

    public final kqy b(String str) {
        b(2);
        return kqz.a(a(), str);
    }

    public final kqy d(long j) {
        b(1);
        return kqz.f(a(), j);
    }

    public final String a(int i) {
        return ((kqp) c(i)).a;
    }

    public final String a(Cursor cursor) {
        iva.a(g());
        b(2);
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(a());
        if (!cursor.isNull(columnIndexOrThrow)) {
            return cursor.getString(columnIndexOrThrow);
        }
        return null;
    }

    public final void b(int i) {
        h();
        if (i != ((kqp) this.b).i) {
            String valueOf = String.valueOf(this);
            String a2 = kqo.a(i);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + a2.length());
            sb.append(valueOf);
            sb.append(" is not a ");
            sb.append(a2);
            sb.append(" field");
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    public final kqy a(long j) {
        b(1);
        return kqz.c(a(), j);
    }

    public final kqy a(boolean z) {
        String str;
        h();
        b(1);
        if (!z) {
            str = "=0";
        } else {
            str = "!=0";
        }
        String valueOf = String.valueOf(a());
        return kqz.a(str.length() == 0 ? new String(valueOf) : valueOf.concat(str));
    }
}
