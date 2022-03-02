package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService;

/* renamed from: yie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yie extends ygu {
    private final ygj a;
    private final yif b;

    public final avst a() {
        yif yif = this.b;
        avss avss = (avss) avst.m.o();
        long j = yif.c;
        if (avss.c) {
            avss.c();
            avss.c = false;
        }
        avst avst = (avst) avss.b;
        int i = avst.a | 16;
        avst.a = i;
        avst.h = j;
        int i2 = yif.d;
        int i3 = i2 - 1;
        if (i2 != 0) {
            avst.a = i | 64;
            avst.j = i3;
            return (avst) avss.i();
        }
        throw null;
    }

    public final void b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public yie(ygj ygj, yik yik, String str, long j) {
        super("SyncAfterOperationCall", avtj.SYNC_AFTER);
        iva.a((Object) ygj);
        this.a = ygj;
        this.b = new yif(str, j, 5);
    }

    public final void b(Context context, yfw yfw) {
        Cursor query;
        Throwable th;
        Cursor query2;
        Throwable th2;
        long j;
        Cursor rawQuery;
        Throwable th3;
        long j2;
        String str;
        String str2;
        yif yif = this.b;
        if (azac.b()) {
            SQLiteDatabase writableDatabase = yfw.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                boolean z = false;
                query = writableDatabase.query("Packages", new String[]{"packageName"}, "packageName = ?", new String[]{yif.b}, (String) null, (String) null, (String) null);
                if (query.getCount() != 0) {
                    if (query != null) {
                        query.close();
                    }
                    String str3 = "yif";
                    String str4 = "a";
                    query2 = writableDatabase.query("LastSyncAfterRequest", new String[]{"servingVersion"}, "packageName = ?", new String[]{yif.b}, (String) null, (String) null, (String) null);
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
                    if (yif.c != j) {
                        rawQuery = writableDatabase.rawQuery("SELECT MIN(servingVersion) FROM ExperimentTokens WHERE packageName = ? AND isCommitted = 0;", new String[]{yif.b});
                        if (!rawQuery.moveToFirst()) {
                            str = str3;
                            str2 = str4;
                            ((anih) ((anih) yif.a.d()).a(str, str2, 104, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("First sync");
                            z = true;
                            j2 = 0;
                        } else {
                            str = str3;
                            str2 = str4;
                            long j4 = rawQuery.getLong(0);
                            if (j4 < yif.c) {
                                z = true;
                            }
                            j2 = j4;
                        }
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        if (z) {
                            ((anih) ((anih) yif.a.d()).a(str, str2, 114, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("New sync: %d > %d", yif.c, j2);
                            yiu b2 = HeterodyneSyncTaskChimeraService.b(context);
                            avta avta = (avta) avtd.h.o();
                            b2.a(yif.d, yif.b, avta);
                            int a2 = avtc.a(((avtd) avta.b).f);
                            if (a2 == 0 || a2 == 1) {
                                writableDatabase.beginTransaction();
                                try {
                                    String str5 = yif.b;
                                    long j5 = yif.c;
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("packageName", str5);
                                    contentValues.put("servingVersion", Long.valueOf(j5));
                                    if (writableDatabase.insertWithOnConflict("LastSyncAfterRequest", (String) null, contentValues, 5) == -1) {
                                        ((anih) ((anih) yif.a.d()).a(str, str2, 128, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Updating lastSyncAfter for package %s table failed", (Object) yif.b);
                                    }
                                    writableDatabase.setTransactionSuccessful();
                                } finally {
                                    writableDatabase.endTransaction();
                                }
                            } else {
                                ((anih) ((anih) yif.a.d()).a(str, str2, 137, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Sync as a result of syncAfter failed");
                                throw new yfy(29504);
                            }
                        }
                    } else {
                        ((anih) ((anih) yif.a.d()).a(str3, str4, 90, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Last successful syncAfter (%d) is equal to requested serving version (%d)", j, yif.c);
                        writableDatabase.endTransaction();
                    }
                    this.a.a(Status.a, 0);
                    return;
                }
                ((anih) ((anih) yif.a.d()).a("yif", "a", 80, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot call syncAfter before register(): %s", (Object) yif.b);
                throw new yfy(29503);
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

    public final void a(Status status) {
        this.a.a(status, 0);
    }
}
