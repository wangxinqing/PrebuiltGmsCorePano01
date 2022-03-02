package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService;

/* renamed from: yif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yif {
    public static final jjg a = jjg.a(iyc.PHENOTYPE);
    public final String b;
    public final long c;
    public final int d;

    public yif(String str, long j, int i) {
        this.b = str;
        this.c = j;
        this.d = i;
    }

    public final Void a(Context context, yfw yfw) {
        Cursor query;
        Throwable th;
        Cursor query2;
        Throwable th2;
        long j;
        Cursor rawQuery;
        Throwable th3;
        long j2;
        String str;
        if (azac.b()) {
            SQLiteDatabase writableDatabase = yfw.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                boolean z = false;
                query = writableDatabase.query("Packages", new String[]{"packageName"}, "packageName = ?", new String[]{this.b}, (String) null, (String) null, (String) null);
                if (query.getCount() != 0) {
                    if (query != null) {
                        query.close();
                    }
                    String str2 = "yif";
                    query2 = writableDatabase.query("LastSyncAfterRequest", new String[]{"servingVersion"}, "packageName = ?", new String[]{this.b}, (String) null, (String) null, (String) null);
                    if (query2.moveToFirst()) {
                        long j3 = query2.getLong(0);
                        if (query2 != null) {
                            query2.close();
                        }
                        j = j3;
                    } else {
                        if (query2 != null) {
                            query2.close();
                        }
                        j = 0;
                    }
                    if (this.c != j) {
                        rawQuery = writableDatabase.rawQuery("SELECT MIN(servingVersion) FROM ExperimentTokens WHERE packageName = ? AND isCommitted = 0;", new String[]{this.b});
                        if (!rawQuery.moveToFirst()) {
                            str = str2;
                            ((anih) ((anih) a.d()).a(str, "a", 104, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("First sync");
                            j2 = 0;
                            z = true;
                        } else {
                            str = str2;
                            long j4 = rawQuery.getLong(0);
                            if (j4 < this.c) {
                                z = true;
                            }
                            j2 = j4;
                        }
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        if (!z) {
                            return null;
                        }
                        ((anih) ((anih) a.d()).a(str, "a", 114, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("New sync: %d > %d", this.c, j2);
                        yiu b2 = HeterodyneSyncTaskChimeraService.b(context);
                        avta avta = (avta) avtd.h.o();
                        b2.a(this.d, this.b, avta);
                        int a2 = avtc.a(((avtd) avta.b).f);
                        if (a2 == 0 || a2 == 1) {
                            writableDatabase.beginTransaction();
                            try {
                                String str3 = this.b;
                                long j5 = this.c;
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("packageName", str3);
                                contentValues.put("servingVersion", Long.valueOf(j5));
                                if (writableDatabase.insertWithOnConflict("LastSyncAfterRequest", (String) null, contentValues, 5) == -1) {
                                    ((anih) ((anih) a.d()).a(str, "a", 128, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Updating lastSyncAfter for package %s table failed", (Object) this.b);
                                }
                                writableDatabase.setTransactionSuccessful();
                                return null;
                            } finally {
                                writableDatabase.endTransaction();
                            }
                        } else {
                            ((anih) ((anih) a.d()).a(str, "a", 137, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Sync as a result of syncAfter failed");
                            throw new yfy(29504);
                        }
                    } else {
                        ((anih) ((anih) a.d()).a(str2, "a", 90, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Last successful syncAfter (%d) is equal to requested serving version (%d)", j, this.c);
                        writableDatabase.endTransaction();
                        return null;
                    }
                } else {
                    ((anih) ((anih) a.d()).a("yif", "a", 80, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot call syncAfter before register(): %s", (Object) this.b);
                    throw new yfy(29503);
                }
            } catch (Throwable th4) {
                writableDatabase.endTransaction();
                throw th4;
            }
        } else {
            throw new UnsupportedOperationException();
        }
        throw th;
        throw th2;
        throw th3;
    }
}
