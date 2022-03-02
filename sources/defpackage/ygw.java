package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* renamed from: ygw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ygw extends ygu {
    private final ygj a;
    private final ygx b;

    public static void a(Context context, yfw yfw, ygx ygx) {
        SQLiteDatabase sQLiteDatabase;
        Cursor query;
        Throwable th;
        Cursor query2;
        Throwable th2;
        Cursor query3;
        Throwable th3;
        Cursor query4;
        Throwable th4;
        Cursor query5;
        Throwable th5;
        Cursor query6;
        Throwable th6;
        ygx ygx2 = ygx;
        if (yhe.b(ygx2.c)) {
            SQLiteDatabase readableDatabase = yfw.getReadableDatabase();
            yfg b2 = yfg.b(context);
            try {
                SQLiteDatabase writableDatabase = b2.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    sQLiteDatabase = writableDatabase;
                    try {
                        query = readableDatabase.query("Packages", (String[]) yfu.a.a(), "packageName = ?", new String[]{ygx2.c}, (String) null, (String) null, (String) null);
                        while (query.moveToNext()) {
                            sQLiteDatabase.replaceOrThrow("Packages", (String) null, yfw.a(query));
                        }
                        if (query != null) {
                            query.close();
                        }
                        sQLiteDatabase.delete("LogSources", "packageName = ?", new String[]{ygx2.c});
                        query2 = readableDatabase.query("LogSources", yfr.a, "packageName = ?", new String[]{ygx2.c}, (String) null, (String) null, (String) null);
                        while (query2.moveToNext()) {
                            sQLiteDatabase.insertOrThrow("LogSources", (String) null, yfw.a(query2));
                        }
                        if (query2 != null) {
                            query2.close();
                        }
                        sQLiteDatabase.delete("Flags", "packageName = ? AND committed = 1", new String[]{ygx2.c});
                        query3 = readableDatabase.query("Flags", yfq.a, "packageName = ? AND committed = 1", new String[]{ygx2.c}, (String) null, (String) null, (String) null);
                        while (query3.moveToNext()) {
                            sQLiteDatabase.insertOrThrow("Flags", (String) null, yfw.a(query3));
                        }
                        if (query3 != null) {
                            query3.close();
                        }
                        sQLiteDatabase.delete("FlagOverrides", "packageName = ? AND committed = 1", new String[]{ygx2.c});
                        query4 = readableDatabase.query("FlagOverrides", yfp.a, "packageName = ? AND committed = 1", new String[]{ygx2.c}, (String) null, (String) null, (String) null);
                        while (query4.moveToNext()) {
                            sQLiteDatabase.insertOrThrow("FlagOverrides", (String) null, yfw.a(query4));
                        }
                        if (query4 != null) {
                            query4.close();
                        }
                        sQLiteDatabase.delete("ExperimentTokens", "packageName = ? AND isCommitted = 1", new String[]{ygx2.c});
                        query5 = readableDatabase.query("ExperimentTokens", yfo.a, "packageName = ? AND isCommitted = 1", new String[]{ygx2.c}, (String) null, (String) null, (String) null);
                        while (query5.moveToNext()) {
                            sQLiteDatabase.insertOrThrow("ExperimentTokens", (String) null, yfw.a(query5));
                        }
                        if (query5 != null) {
                            query5.close();
                        }
                        sQLiteDatabase.delete("CrossLoggedExperimentTokens", "fromPackageName = ? AND isCommitted = 1", new String[]{ygx2.c});
                        query6 = readableDatabase.query("CrossLoggedExperimentTokens", yfn.a, "fromPackageName = ? AND isCommitted = 1", new String[]{ygx2.c}, (String) null, (String) null, (String) null);
                        while (query6.moveToNext()) {
                            sQLiteDatabase.insertOrThrow("CrossLoggedExperimentTokens", (String) null, yfw.a(query6));
                        }
                        if (query6 != null) {
                            query6.close();
                        }
                        Pair a2 = yfw.a(readableDatabase, ygx2.c, ygx2.e);
                        ygx2.a(sQLiteDatabase, (String) a2.first, (long) ((Integer) a2.second).intValue());
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th7) {
                        th = th7;
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    sQLiteDatabase = writableDatabase;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            } finally {
                b2.close();
            }
        }
        context.getContentResolver().notifyChange(yef.a(ygx2.c), (ContentObserver) null);
        for (String str : yge.a) {
            Intent intent = new Intent("com.google.android.gms.phenotype.COMMIT");
            intent.setPackage(str);
            intent.putExtra("package_name", ygx2.c);
            context.sendBroadcast(intent);
        }
        return;
        throw th6;
        throw th;
        throw th2;
        throw th3;
        throw th4;
        throw th5;
    }

    public final void b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ygw(defpackage.ygj r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String[] r0 = defpackage.yhe.a((java.lang.String) r5)
            if (r0 == 0) goto L_0x0016
            r1 = 1
            r1 = r0[r1]
            r2 = 5
            r0 = r0[r2]
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            avtj r0 = defpackage.avtj.COMMIT_ALT_CONFIG
            goto L_0x0018
        L_0x0016:
            avtj r0 = defpackage.avtj.COMMIT_CONFIG
        L_0x0018:
            java.lang.String r1 = "CommitToConfigurationOperationCall"
            r3.<init>(r1, r0)
            defpackage.iva.a((java.lang.Object) r4)
            r3.a = r4
            ygx r4 = new ygx
            r4.<init>(r5, r6)
            r3.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygw.<init>(ygj, java.lang.String, java.lang.String):void");
    }

    public final void b(Context context, yfw yfw) {
        try {
            this.b.a(context, yfw);
            a(context, yfw, this.b);
            this.a.e(Status.a);
        } catch (yfx e) {
            if (e.a == 29512 && yhs.a(this.b.c, 21)) {
                yij.a(context, 21, this.b.c);
            }
            throw e;
        }
    }

    public final avst a() {
        ygx ygx = this.b;
        avss avss = (avss) avst.m.o();
        String str = ygx.c;
        if (str != null) {
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst = (avst) avss.b;
            str.getClass();
            avst.a |= 1;
            avst.b = str;
        }
        String str2 = ygx.b;
        if (str2 != null) {
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst2 = (avst) avss.b;
            str2.getClass();
            avst2.a |= 128;
            avst2.k = str2;
        }
        int i = ygx.d;
        if (avss.c) {
            avss.c();
            avss.c = false;
        }
        avst avst3 = (avst) avss.b;
        int i2 = avst3.a | 2;
        avst3.a = i2;
        avst3.c = i;
        String str3 = ygx.e;
        if (str3 != null) {
            str3.getClass();
            i2 |= 4;
            avst3.a = i2;
            avst3.f = str3;
        }
        String str4 = ygx.a;
        if (str4 != null) {
            str4.getClass();
            i2 |= 8;
            avst3.a = i2;
            avst3.g = str4;
        }
        int i3 = ygx.f;
        avst3.a = i2 | 32;
        avst3.i = (long) i3;
        return (avst) avss.i();
    }

    public final void a(Status status) {
        this.a.e(status);
    }
}
