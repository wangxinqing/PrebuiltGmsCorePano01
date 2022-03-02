package com.google.android.gms.appstate.provider;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppStateChimeraContentProvider extends iyh {
    private static final UriMatcher b = new UriMatcher(-1);
    private static final String[] c = {"_id"};
    private static final bbh d;
    private static final bbh e;
    private static final String f;

    static {
        boolean z;
        for (ebb ebb : ebb.values()) {
            b.addURI("com.google.android.gms.appstate", ebb.g, ebb.ordinal());
        }
        boolean z2 = true;
        bbg a = bbh.a();
        a.a("_id", "client_contexts._id");
        a.a(ebd.a);
        d = a.a();
        bbg a2 = bbh.a();
        a2.a("_id", "app_states._id");
        a2.a(ebc.a);
        a2.a(ebd.a);
        e = a2.a();
        iyk iyk = new iyk();
        if (iyk.a == null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "Cannot add multiple base tables!");
        iva.a((Object) "app_states");
        iyk.a = "app_states";
        ArrayList arrayList = iyk.b;
        StringBuilder sb = new StringBuilder(62);
        sb.append(" JOIN client_contexts ON client_context_id=client_contexts._id");
        arrayList.add(sb.toString());
        if (iyk.a == null) {
            z2 = false;
        }
        iva.a(z2);
        StringBuilder sb2 = new StringBuilder(iyk.a);
        ArrayList arrayList2 = iyk.b;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            sb2.append((String) arrayList2.get(i));
        }
        f = sb2.toString();
    }

    private static ebb a(Uri uri) {
        int match = b.match(uri);
        iva.a(match >= 0, "Unrecognized URI: %s", uri);
        return ((ebb[]) ebb.class.getEnumConstants())[match];
    }

    private static final long b(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() >= 2) {
            return (long) Integer.parseInt(pathSegments.get(1));
        }
        throw new IllegalArgumentException("Given URI is malformed");
    }

    /* access modifiers changed from: protected */
    public final AssetFileDescriptor a(Uri uri, String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "app_state.db";
    }

    public final String getType(Uri uri) {
        ebb ebb = ebb.CLIENT_CONTEXTS;
        int ordinal = a(uri).ordinal();
        if (ordinal == 0) {
            return "vnd.android.cursor.dir/vnd.google.android.appstate.client_contexts";
        }
        if (ordinal == 1) {
            return "vnd.android.cursor.item/vnd.google.android.appstate.client_context";
        }
        if (ordinal == 2) {
            return "vnd.android.cursor.dir/vnd.google.android.appstate.states";
        }
        if (ordinal == 3 || ordinal == 4) {
            return "vnd.android.cursor.item/vnd.google.android.appstate.state";
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Unknown URI: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final int a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (contentValues.size() == 0) {
            return 0;
        }
        ebb ebb = ebb.CLIENT_CONTEXTS;
        int ordinal = a(uri).ordinal();
        if (ordinal == 0) {
            iva.a(contentValues.get("package_name"));
            iva.a(contentValues.get("package_uid"));
            iva.a(contentValues.get("account_name"));
            return sQLiteDatabase.update("client_contexts", contentValues, str, strArr);
        } else if (ordinal == 1) {
            iva.a(contentValues.get("package_name"));
            iva.a(contentValues.get("package_uid"));
            iva.a(contentValues.get("account_name"));
            return iyh.a(sQLiteDatabase, uri, "client_contexts", "_id", contentValues);
        } else if (ordinal == 2) {
            iva.a("app_id", contentValues);
            iva.a("key", contentValues);
            iyi iyi = new iyi(uri, str, strArr);
            iyi.a("client_context_id", b(uri));
            return sQLiteDatabase.update("app_states", contentValues, iyi.a(), iyi.a);
        } else if (ordinal == 3) {
            iva.a("app_id", contentValues);
            iva.a("key", contentValues);
            return iyh.a(sQLiteDatabase, uri, "app_states", "_id", contentValues);
        } else if (ordinal == 4) {
            iva.a("app_id", contentValues);
            iva.a("key", contentValues);
            iyi iyi2 = new iyi(uri, str, strArr);
            iyi2.b("app_id");
            iyi2.a("state_key", "key");
            iyi2.a("client_context_id", b(uri));
            return sQLiteDatabase.update("app_states", contentValues, iyi2.a(), iyi2.a);
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Invalid update URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ SQLiteOpenHelper c() {
        return ebf.a(getContext());
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final int a(SQLiteDatabase sQLiteDatabase, Uri uri, String str, String[] strArr) {
        String str2;
        ebb ebb = ebb.CLIENT_CONTEXTS;
        int ordinal = a(uri).ordinal();
        if (ordinal == 0 || ordinal == 1) {
            Cursor query = query(uri, new String[]{"_id"}, str, strArr, (String) null);
            int i = 0;
            while (query.moveToNext()) {
                try {
                    String[] strArr2 = {String.valueOf(query.getLong(0))};
                    sQLiteDatabase.delete("app_states", "client_context_id=?", strArr2);
                    i += sQLiteDatabase.delete("client_contexts", "_id=?", strArr2);
                } finally {
                    query.close();
                }
            }
            return i;
        } else if (ordinal == 2) {
            iyi iyi = new iyi(uri, str, strArr);
            iyi.a("client_context_id", b(uri));
            return sQLiteDatabase.delete("app_states", iyi.a(), iyi.a);
        } else if (ordinal == 3) {
            return sQLiteDatabase.delete("app_states", "_id=?", new String[]{String.valueOf(ContentUris.parseId(uri))});
        } else if (ordinal == 4) {
            iyi iyi2 = new iyi(uri, str, strArr);
            iyi2.b("app_id");
            iyi2.a("state_key", "key");
            iyi2.a("client_context_id", b(uri));
            return sQLiteDatabase.delete("app_states", iyi2.a(), iyi2.a);
        } else if (ordinal == 5) {
            String lastPathSegment = uri.getLastPathSegment();
            ArrayList arrayList = new ArrayList();
            Cursor query2 = query(ebd.b, c, "account_name=?", new String[]{lastPathSegment}, (String) null);
            while (query2.moveToNext()) {
                try {
                    arrayList.add(Long.valueOf(query2.getLong(0)));
                } catch (Throwable th) {
                    query2.close();
                    throw th;
                }
            }
            query2.close();
            Object[] array = arrayList.toArray();
            int length = array.length;
            iyj iyj = new iyj("client_context_id IN ", length);
            for (int i2 = 0; i2 < length; i2++) {
                StringBuilder sb = iyj.a;
                if (i2 != 0) {
                    str2 = ",?";
                } else {
                    str2 = "?";
                }
                sb.append(str2);
                iyj.b[i2] = String.valueOf(array[i2]);
            }
            return sQLiteDatabase.delete("app_states", String.valueOf(iyj.a.toString()).concat(")"), iyj.b);
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb2.append("Invalid delete URI: ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final Cursor a(SQLiteDatabase sQLiteDatabase, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        iyi iyi = new iyi(uri, str, strArr2);
        ebb ebb = ebb.CLIENT_CONTEXTS;
        int ordinal = a(uri).ordinal();
        if (ordinal == 0) {
            sQLiteQueryBuilder.setTables("client_contexts");
            sQLiteQueryBuilder.setProjectionMap(d);
        } else if (ordinal == 1) {
            iyi.a("client_contexts._id");
            sQLiteQueryBuilder.setTables("client_contexts");
            sQLiteQueryBuilder.setProjectionMap(d);
        } else if (ordinal == 2) {
            iyi.a("client_context_id", b(uri));
            sQLiteQueryBuilder.setTables(f);
            sQLiteQueryBuilder.setProjectionMap(e);
        } else if (ordinal == 3) {
            iyi.a("app_states._id");
            sQLiteQueryBuilder.setTables(f);
            sQLiteQueryBuilder.setProjectionMap(e);
        } else if (ordinal == 4) {
            iyi.a("client_context_id", b(uri));
            iyi.b("app_id");
            iyi.a("state_key", "key");
            sQLiteQueryBuilder.setTables(f);
            sQLiteQueryBuilder.setProjectionMap(e);
        } else if (ordinal == 5) {
            iyi.b("account_name");
            sQLiteQueryBuilder.setTables(f);
            sQLiteQueryBuilder.setProjectionMap(e);
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Invalid query URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        Cursor query = sQLiteQueryBuilder.query(sQLiteDatabase, strArr, iyi.a(), iyi.a, (String) null, (String) null, str2, (String) null);
        if (query != null) {
            query.setNotificationUri(getContext().getContentResolver(), ebe.a);
        }
        return query;
    }

    /* access modifiers changed from: protected */
    public final Uri a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues) {
        boolean z;
        ebb ebb = ebb.CLIENT_CONTEXTS;
        int ordinal = a(uri).ordinal();
        if (ordinal == 0) {
            String asString = contentValues.getAsString("package_name");
            iva.a((Object) asString);
            int intValue = contentValues.getAsInteger("package_uid").intValue();
            if (intValue > 0) {
                z = true;
            } else {
                z = false;
            }
            iva.a(z);
            String asString2 = contentValues.getAsString("account_name");
            iva.a((Object) asString2);
            iyi iyi = new iyi(uri, (String) null, (String[]) null);
            iyi.b("package_name", asString);
            iyi.a("package_uid", (long) intValue);
            iyi.b("account_name", asString2);
            return a(sQLiteDatabase, uri, uri, "client_contexts", contentValues, iyi.a(), iyi.a);
        } else if (ordinal == 2 || ordinal == 4) {
            String asString3 = contentValues.getAsString("app_id");
            iva.a((Object) asString3);
            iva.a(contentValues.containsKey("key"));
            String valueOf = String.valueOf(contentValues.getAsInteger("key"));
            long b2 = b(uri);
            iyi iyi2 = new iyi(uri, (String) null, (String[]) null);
            iyi2.b("app_id", asString3);
            iyi2.b("key", valueOf);
            iyi2.a("client_context_id", b2);
            return a(sQLiteDatabase, uri, uri, "app_states", contentValues, iyi2.a(), iyi2.a);
        } else {
            String valueOf2 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 20);
            sb.append("Invalid insert URI: ");
            sb.append(valueOf2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        getContext().getContentResolver().notifyChange(ebe.a, (ContentObserver) null, false);
    }
}
