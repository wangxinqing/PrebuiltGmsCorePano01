package defpackage;

import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import com.google.android.chimera.ContentProvider;
import java.util.Map;

/* renamed from: plk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class plk extends ContentProvider {
    private dvg a;
    private final UriMatcher b = new UriMatcher(-1);

    /* access modifiers changed from: protected */
    public abstract Cursor a(Uri uri, String[] strArr);

    public abstract String a(String str);

    /* access modifiers changed from: protected */
    public abstract dvf b();

    /* access modifiers changed from: protected */
    public abstract boolean c();

    /* access modifiers changed from: protected */
    public abstract dvg d();

    /* access modifiers changed from: protected */
    public abstract String e();

    public final String getType(Uri uri) {
        if (this.b.match(uri) == -1) {
            return e();
        }
        dsb.a(getContext());
        return "vnd.android.cursor.dir/vnd.goodle.appdatasearch";
    }

    public final boolean onCreate() {
        boolean c = c();
        dvg d = d();
        this.a = d;
        int length = d.b.length;
        String[] strArr = new String[length];
        int i = 0;
        while (true) {
            dvj[] dvjArr = d.b;
            if (i >= dvjArr.length) {
                break;
            }
            strArr[i] = dvjArr[i].a;
            i++;
        }
        for (int i2 = 0; i2 < length; i2++) {
            this.b.addURI(this.a.a, a(strArr[i2]), i2);
        }
        return c;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return query(uri, strArr, str, strArr2, str2, (CancellationSignal) null);
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        SQLiteDatabase sQLiteDatabase;
        Cursor query;
        Uri uri2 = uri;
        int match = this.b.match(uri2);
        if (match == -1) {
            return a(uri2, strArr2);
        }
        dsb.a(getContext());
        dum a2 = dum.a(strArr2);
        dvj dvj = this.a.b[match];
        dvf b2 = b();
        if (b2 == null) {
            b2 = null;
        } else if (!this.a.equals(b2.c)) {
            throw new IllegalStateException("Content provider spec in db does not match content provider's");
        }
        if (b2 == null) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
            sb.append("Could not get appdatasearch database for uri ");
            sb.append(valueOf);
            Log.e(".AppDataSearchProvider", sb.toString());
            return null;
        }
        if (a2.c()) {
            SQLiteDatabase b3 = b2.b();
            if (b3 == null) {
                return null;
            }
            b3.beginTransaction();
            try {
                SQLiteDatabase sQLiteDatabase2 = b3;
                try {
                    query = b3.query("incarnation_appdatasearch", new String[]{"seqno_table_complete"}, "corpus_name = ?", new String[]{dvj.a}, (String) null, (String) null, (String) null);
                    if (query != null) {
                        if (query.moveToNext()) {
                            int i = query.getInt(query.getColumnIndex("seqno_table_complete"));
                            query.close();
                            if (i == 1) {
                                sQLiteDatabase2.endTransaction();
                            }
                        } else {
                            query.close();
                        }
                    }
                    sQLiteDatabase = sQLiteDatabase2;
                    try {
                        dvf.a(sQLiteDatabase, dvj);
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = sQLiteDatabase2;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabase = b3;
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }
        if (a2.a()) {
            dvf dvf = b2;
            long j = a2.a;
            long j2 = a2.b;
            String str3 = dvj.d;
            String a3 = dve.a(dvj);
            long j3 = j2;
            String a4 = dvf.a(str3, dvj.f);
            String str4 = " LIMIT ";
            StringBuilder sb2 = new StringBuilder(1024);
            sb2.append("SELECT ");
            sb2.append(dvf.a(a3, "seqno"));
            sb2.append(" AS seqno, CASE WHEN ");
            sb2.append(dvf.a(a3, "action_type"));
            sb2.append(" = '0' AND ");
            sb2.append(a4);
            sb2.append(" IS NOT NULL THEN 'add' ELSE 'del' END AS action,");
            sb2.append(dvf.a(a3, "uri"));
            sb2.append(" AS uri,");
            sb2.append(dvj.h);
            sb2.append(" AS doc_score,");
            sb2.append(dvj.i);
            sb2.append(" AS created_timestamp");
            for (Map.Entry entry : dvj.j.entrySet()) {
                String a5 = dul.a((String) entry.getKey());
                sb2.append(",");
                sb2.append(dvf.a(str3, (String) entry.getValue()));
                sb2.append(" AS ");
                sb2.append(a5);
            }
            sb2.append(" FROM (SELECT * FROM [");
            sb2.append(a3);
            sb2.append("] WHERE ");
            sb2.append(dvf.a(a3, "tag"));
            sb2.append(" IS NULL) AS ");
            sb2.append(a3);
            sb2.append(" LEFT OUTER JOIN [");
            sb2.append(str3);
            sb2.append("] ON ");
            sb2.append(dvf.a(a3, "uri"));
            sb2.append(" = ");
            sb2.append(a4);
            sb2.append(" WHERE ");
            sb2.append(dvf.a(a3, "seqno"));
            sb2.append(" > ");
            sb2.append(j);
            if (!dvj.k) {
                sb2.append(" GROUP BY ");
                sb2.append(dvf.a(a3, "seqno"));
            }
            sb2.append(" ORDER BY ");
            sb2.append(dvf.a(a3, "seqno"));
            sb2.append(str4);
            sb2.append(j3);
            SQLiteDatabase c = dvf.c();
            if (c != null) {
                return dvf.a(c.rawQuery(sb2.toString(), (String[]) null), dvj, c);
            }
            return null;
        } else if (!a2.b()) {
            return null;
        } else {
            long j4 = a2.a;
            long j5 = a2.b;
            if (dvj.e == null) {
                return dvf.a((Cursor) new MatrixCursor((String[]) dul.a.toArray(new String[dul.a.size()])), dvj, b2.c());
            }
            String a6 = dve.a(dvj);
            dvj dvj2 = dvj;
            agyu a7 = agyu.a();
            a7.a("SELECT ");
            a7.a(dvf.a(a6, "seqno"));
            a7.a(" AS ");
            a7.a("seqno");
            a7.a(", CASE WHEN ");
            a7.a(dvf.a(a6, "action_type"));
            a7.a(" = '");
            amrl.a(true, "value must be non-negative: %s", 0);
            a7.a("0");
            a7.a("' THEN '");
            a7.a("add");
            a7.a("' ELSE '");
            a7.a("del");
            a7.a("' END AS ");
            a7.a("action");
            a7.a(",");
            a7.a(dvf.a(a6, "uri"));
            a7.a(" AS ");
            a7.a("uri");
            a7.a(",");
            a7.a(dvf.a(a6, "tag"));
            a7.a(" AS ");
            a7.a("tag");
            a7.a(" FROM [");
            a7.a(a6);
            a7.a("] WHERE (");
            a7.a(dvf.a(a6, "tag"));
            a7.a(" IS NOT NULL ");
            a7.a(" AND ");
            a7.a(dvf.a(a6, "seqno"));
            a7.a(" > ");
            a7.a(agyv.a(j4));
            a7.a(") ORDER BY ");
            a7.a(dvf.a(a6, "seqno"));
            a7.a(" LIMIT ");
            a7.a(agyv.a(j5));
            agyt b4 = a7.b();
            SQLiteDatabase c2 = b2.c();
            if (c2 == null) {
                return null;
            }
            return dvf.a(c2.rawQuery(((agys) b4).a, (String[]) null), dvj2, c2);
        }
    }
}
