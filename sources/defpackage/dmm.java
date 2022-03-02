package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: dmm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dmm extends dma implements Closeable {
    public static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});
    public static final String b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[]{"hit_time", "hits2"});
    public final dpw c = new dpw(c());
    public final dpw e = new dpw(c());
    private final dml f;

    public dmm(dmd dmd) {
        super(dmd);
        this.f = new dml(this, dmd.a, w());
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(java.lang.String r3, java.lang.String[] r4) {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.v()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x0028, all -> 0x0026 }
            boolean r4 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0024 }
            if (r4 == 0) goto L_0x001a
            r4 = 0
            long r3 = r1.getLong(r4)     // Catch:{ SQLiteException -> 0x0024 }
            if (r1 == 0) goto L_0x0019
            r1.close()
        L_0x0019:
            return r3
        L_0x001a:
            if (r1 == 0) goto L_0x001f
            r1.close()
        L_0x001f:
            r3 = 0
            return r3
        L_0x0022:
            r3 = move-exception
            goto L_0x002f
        L_0x0024:
            r4 = move-exception
            goto L_0x0029
        L_0x0026:
            r3 = move-exception
            goto L_0x002f
        L_0x0028:
            r4 = move-exception
        L_0x0029:
            java.lang.String r0 = "Database error"
            r2.d(r0, r3, r4)     // Catch:{ all -> 0x0022 }
            throw r4     // Catch:{ all -> 0x0022 }
        L_0x002f:
            if (r1 == 0) goto L_0x0034
            r1.close()
        L_0x0034:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmm.a(java.lang.String, java.lang.String[]):long");
    }

    /* access modifiers changed from: protected */
    public final void a() {
    }

    public final void b() {
        q();
        v().beginTransaction();
    }

    public final void close() {
        try {
            this.f.close();
        } catch (SQLiteException e2) {
            e("Sql error closing database", e2);
        } catch (IllegalStateException e3) {
            e("Error closing database", e3);
        }
    }

    public final void s() {
        q();
        v().setTransactionSuccessful();
    }

    public final void t() {
        q();
        v().endTransaction();
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase v() {
        try {
            return this.f.getWritableDatabase();
        } catch (SQLiteException e2) {
            d("Error opening database", e2);
            throw e2;
        }
    }

    public final String w() {
        f();
        if (f().a()) {
            f();
            return "google_analytics_v4.db";
        }
        f();
        return "google_analytics2_v4.db";
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long u() {
        /*
            r4 = this;
            defpackage.dkw.a()
            r4.q()
            android.database.sqlite.SQLiteDatabase r0 = r4.v()
            java.lang.String r1 = "SELECT COUNT(*) FROM hits2"
            r2 = 0
            android.database.Cursor r2 = r0.rawQuery(r1, r2)     // Catch:{ SQLiteException -> 0x0030, all -> 0x002e }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x002c }
            if (r0 == 0) goto L_0x0022
            r0 = 0
            long r0 = r2.getLong(r0)     // Catch:{ SQLiteException -> 0x002c }
            if (r2 == 0) goto L_0x0021
            r2.close()
        L_0x0021:
            return r0
        L_0x0022:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x002c }
            java.lang.String r3 = "Database returned empty set"
            r0.<init>(r3)     // Catch:{ SQLiteException -> 0x002c }
            throw r0     // Catch:{ SQLiteException -> 0x002c }
        L_0x002a:
            r0 = move-exception
            goto L_0x0037
        L_0x002c:
            r0 = move-exception
            goto L_0x0031
        L_0x002e:
            r0 = move-exception
            goto L_0x0037
        L_0x0030:
            r0 = move-exception
        L_0x0031:
            java.lang.String r3 = "Database error"
            r4.d(r3, r1, r0)     // Catch:{ all -> 0x002a }
            throw r0     // Catch:{ all -> 0x002a }
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r2.close()
        L_0x003c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmm.u():long");
    }

    /* access modifiers changed from: package-private */
    public final Map a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                String valueOf = String.valueOf(str);
                str = valueOf.length() == 0 ? new String("?") : "?".concat(valueOf);
            }
            return jjq.a(new URI(str), "UTF-8");
        } catch (URISyntaxException e2) {
            e("Error parsing hit parameters", e2);
            return new HashMap(0);
        }
    }

    public final void a(List list) {
        iva.a((Object) list);
        dkw.a();
        q();
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder("hit_id");
            sb.append(" in (");
            for (int i = 0; i < list.size(); i++) {
                Long l = (Long) list.get(i);
                if (l == null || l.longValue() == 0) {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(l);
            }
            sb.append(")");
            String sb2 = sb.toString();
            try {
                SQLiteDatabase v = v();
                a("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int delete = v.delete("hits2", sb2, (String[]) null);
                if (delete != list.size()) {
                    a("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb2);
                }
            } catch (SQLiteException e2) {
                e("Error deleting hits", e2);
                throw e2;
            }
        }
    }
}
