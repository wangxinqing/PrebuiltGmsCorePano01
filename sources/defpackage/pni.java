package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;

/* renamed from: pni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pni {
    public final ContentResolver a;
    private final oyq b;

    public pni(oyq oyq, ContentResolver contentResolver) {
        this.b = oyq;
        this.a = contentResolver;
    }

    public final int a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            return this.a.update(uri, contentValues, str, strArr);
        } catch (SecurityException e) {
            this.b.a("cr_update_security_exc");
            return 0;
        } catch (SQLiteException e2) {
            this.b.a("cr_update_sqlite_exc");
            return 0;
        } catch (NullPointerException e3) {
            this.b.a("cr_update_npe");
            return 0;
        } catch (IllegalArgumentException e4) {
            this.b.a("cr_update_illegal_arg_exc");
            return 0;
        } catch (NoClassDefFoundError e5) {
            this.b.a("cr_update_no_class_def_found_err");
            return 0;
        }
    }

    public final Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            return this.a.query(uri, strArr, str, strArr2, str2);
        } catch (SecurityException e) {
            this.b.a("cr_query_security_exc");
            return null;
        } catch (SQLiteException e2) {
            this.b.a("cr_query_sqlite_exc");
            return null;
        } catch (NullPointerException e3) {
            this.b.a("cr_query_npe");
            return null;
        } catch (NoClassDefFoundError e4) {
            this.b.a("cr_query_no_class_def_found_err");
            return null;
        }
    }
}
