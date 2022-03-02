package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

/* renamed from: onj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class onj implements oar {
    static final String[] a = {"_id", "suggest_intent_query"};
    private final oni b;
    private final String c;

    public onj(Context context, String str) {
        this.b = new oni(context);
        this.c = str;
    }

    private final SQLiteDatabase d() {
        return this.b.getReadableDatabase();
    }

    public final synchronized Cursor a() {
        SQLiteDatabase d = d();
        if (!d.isOpen()) {
            return new nzk();
        }
        String str = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19);
        sb.append("app_package_name=\"");
        sb.append(str);
        sb.append("\"");
        return d.query("suggestions", a, sb.toString(), (String[]) null, (String) null, (String) null, "date DESC", axmj.m());
    }

    public final synchronized void b() {
        SQLiteDatabase c2 = c();
        if (c2 != null && c2.isOpen() && !c2.isReadOnly()) {
            String str = this.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19);
            sb.append("app_package_name=\"");
            sb.append(str);
            sb.append("\"");
            c2.delete("suggestions", sb.toString(), (String[]) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase c() {
        try {
            return this.b.getWritableDatabase();
        } catch (SQLiteException e) {
            Log.e("gH_SearchQueryHDb", "Error opening Autocomplete database.", e);
            return null;
        }
    }

    public final synchronized void close() {
        nzi.a(this.b);
    }

    public final synchronized Cursor a(String str) {
        SQLiteDatabase d = d();
        if (!d.isOpen()) {
            return new nzk();
        }
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 51);
        sb.append("app_package_name=\"");
        sb.append(str2);
        sb.append("\" AND suggest_intent_query LIKE ?");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 2);
        sb3.append("%");
        sb3.append(str);
        sb3.append("%");
        String sb4 = sb3.toString();
        return d.query("suggestions", a, sb2, new String[]{sb4}, (String) null, (String) null, "date DESC", axmj.m());
    }

    public final synchronized void a(omv omv, long j) {
        SQLiteDatabase c2 = c();
        if (c2 != null && c2.isOpen() && !c2.isReadOnly()) {
            String str = omv.c;
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_package_name", this.c);
            contentValues.put("suggest_intent_query", str);
            contentValues.put("date", Long.valueOf(j));
            c2.insert("suggestions", "suggest_intent_query", contentValues);
        }
    }
}
