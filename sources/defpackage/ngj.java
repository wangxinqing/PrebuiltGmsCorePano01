package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.TimeUnit;

/* renamed from: ngj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ngj implements Runnable {
    private final ngm a;
    private final nfz b;
    private final nfy c;

    public ngj(ngm ngm, nfz nfz, nfy nfy) {
        this.a = ngm;
        this.b = nfz;
        this.c = nfy;
    }

    public final void run() {
        ngm ngm = this.a;
        nfz nfz = this.b;
        nfy nfy = this.c;
        try {
            amsn b2 = amsn.b(ampt.a);
            ngh ngh = ngm.d;
            Object[] objArr = new Object[5];
            objArr[0] = nfz.b;
            nga nga = nfy.b;
            if (nga == null) {
                nga = nga.c;
            }
            objArr[1] = Integer.valueOf(nga.a);
            nfx nfx = nfy.c;
            if (nfx == null) {
                nfx = nfx.c;
            }
            objArr[2] = Float.valueOf(nfx.a);
            nfx nfx2 = nfy.d;
            if (nfx2 == null) {
                nfx2 = nfx.c;
            }
            objArr[3] = Float.valueOf(nfx2.a);
            objArr[4] = Integer.valueOf(nfz.c);
            ngz.c("FontsDBHelper", "Inserting font metadata into database (%s,%d,%.01f,%.01f,%d)", objArr);
            ContentValues contentValues = new ContentValues();
            contentValues.put("family", nfz.b);
            nga nga2 = nfy.b;
            if (nga2 == null) {
                nga2 = nga.c;
            }
            contentValues.put("weight", Integer.valueOf(nga2.a));
            nfx nfx3 = nfy.c;
            if (nfx3 == null) {
                nfx3 = nfx.c;
            }
            contentValues.put("width", Float.valueOf(nfx3.a));
            nfx nfx4 = nfy.d;
            if (nfx4 == null) {
                nfx4 = nfx.c;
            }
            contentValues.put("italic", Float.valueOf(nfx4.a));
            contentValues.put("version", Integer.valueOf(nfz.c));
            SQLiteDatabase sQLiteDatabase = null;
            try {
                SQLiteDatabase writableDatabase = ngh.getWritableDatabase();
                try {
                    if (writableDatabase.insertWithOnConflict("metadata", (String) null, contentValues, 5) == -1) {
                        String str = nfz.b;
                        nga nga3 = nfy.b;
                        if (nga3 == null) {
                            nga3 = nga.c;
                        }
                        int i = nga3.a;
                        nfx nfx5 = nfy.c;
                        if (nfx5 == null) {
                            nfx5 = nfx.c;
                        }
                        float f = nfx5.a;
                        nfx nfx6 = nfy.d;
                        if (nfx6 == null) {
                            nfx6 = nfx.c;
                        }
                        float f2 = nfx6.a;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 84);
                        sb.append(str);
                        sb.append(":wght");
                        sb.append(i);
                        sb.append(":wdth");
                        sb.append(f);
                        sb.append(":ital");
                        sb.append(f2);
                        sb.append(" could not be written to DB!");
                        throw new IllegalStateException(sb.toString());
                    }
                    ngh.c(writableDatabase);
                    b2.e();
                    ngz.c("FontDisk", "Inserting metadata for %s took %d ms", nfz.b, Long.valueOf(b2.a(TimeUnit.MILLISECONDS)));
                } catch (SQLiteException e) {
                    sQLiteDatabase = writableDatabase;
                    ngh.c(sQLiteDatabase);
                    b2.e();
                    ngz.c("FontDisk", "Inserting metadata for %s took %d ms", nfz.b, Long.valueOf(b2.a(TimeUnit.MILLISECONDS)));
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = writableDatabase;
                    ngh.c(sQLiteDatabase);
                    throw th;
                }
            } catch (SQLiteException e2) {
                ngh.c(sQLiteDatabase);
                b2.e();
                ngz.c("FontDisk", "Inserting metadata for %s took %d ms", nfz.b, Long.valueOf(b2.a(TimeUnit.MILLISECONDS)));
            } catch (Throwable th2) {
                th = th2;
                ngh.c(sQLiteDatabase);
                throw th;
            }
        } catch (Exception e3) {
            ngz.a("FontDisk", (Throwable) e3, "Error inserting metadata for %s", nfz.b);
        }
    }
}
