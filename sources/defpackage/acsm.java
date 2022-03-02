package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.android.volley.toolbox.ImageRequest;
import java.util.List;

/* renamed from: acsm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acsm extends jjj {
    private static acsm a = null;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private acsm(android.content.Context r9) {
        /*
            r8 = this;
            aznq r0 = defpackage.aznq.a
            aznx r0 = r0.a()
            long r0 = r0.l()
            r2 = 1
            java.lang.String r3 = "min (%s) must be less than or equal to max (%s)"
            r4 = 2
            r6 = 2
            defpackage.amrl.a((boolean) r2, (java.lang.String) r3, (long) r4, (long) r6)
            r2 = 2
            long r0 = java.lang.Math.max(r0, r2)
            long r0 = java.lang.Math.min(r0, r2)
            int r1 = (int) r0
            java.lang.String r0 = "eastworld.db"
            r8.<init>((android.content.Context) r9, (java.lang.String) r0, (java.lang.String) r0, (int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acsm.<init>(android.content.Context):void");
    }

    public static final int a(int i, boolean z, boolean z2, boolean z3) {
        return (i * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS) + ((z ? 1 : 0) * true) + ((z2 ? 1 : 0) * true) + (z3 ? 1 : 0);
    }

    public final int b(String str) {
        Cursor query;
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            query = readableDatabase.query("battery_counter", new String[]{"counter_val"}, "counter_key = ?", new String[]{str}, (String) null, (String) null, (String) null);
            if (query.moveToFirst()) {
                int i = query.getInt(query.getColumnIndexOrThrow("counter_val"));
                if (query != null) {
                    query.close();
                }
                return i;
            }
            if (query != null) {
                query.close();
            }
            return 0;
        } catch (SQLiteException e) {
            return 0;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final long c() {
        Cursor query;
        long j = -1;
        try {
            query = getReadableDatabase().query("error_status", new String[]{"last_upload_wallclock_time"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            if (query.moveToFirst()) {
                j = query.getLong(query.getColumnIndexOrThrow("last_upload_wallclock_time"));
            }
            if (query != null) {
                try {
                    query.close();
                } catch (SQLiteException e) {
                    e = e;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            Log.e("EastworldSqliteHelper", "Failed to fetch last upload time.", e);
            return j;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        return j;
        throw th;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (sQLiteDatabase == null) {
            sQLiteDatabase = getWritableDatabase();
        }
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS eastworld_stats;");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS battery_status;");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS battery_counter;");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS error_data;");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS error_status;");
        } catch (SQLiteException e) {
        }
        onCreate(sQLiteDatabase);
    }

    public static synchronized acsm a(Context context) {
        acsm acsm;
        synchronized (acsm.class) {
            if (a == null) {
                a = new acsm(context);
            }
            acsm = a;
        }
        return acsm;
    }

    public static final List a(int i) {
        amzt j = amzy.j();
        j.c(Integer.valueOf(a(i, true, true, true)));
        j.c(Integer.valueOf(a(i, false, true, true)));
        j.c(Integer.valueOf(a(i, true, false, true)));
        j.c(Integer.valueOf(a(i, false, false, true)));
        j.c(Integer.valueOf(a(i, true, true, false)));
        j.c(Integer.valueOf(a(i, false, true, false)));
        j.c(Integer.valueOf(a(i, true, false, false)));
        j.c(Integer.valueOf(a(i, false, false, false)));
        return j.a();
    }

    public final boolean b() {
        Cursor rawQuery;
        try {
            rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM battery_status", (String[]) null);
            boolean z = rawQuery.getCount() > 0;
            if (rawQuery != null) {
                rawQuery.close();
            }
            return z;
        } catch (SQLiteException e) {
            return false;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* JADX INFO: finally extract failed */
    public static void a(SQLiteDatabase sQLiteDatabase, aucd aucd, long j, long j2, long j3) {
        String str;
        Throwable th;
        Throwable th2;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        aucd aucd2 = aucd;
        boolean z = false;
        String[] strArr = {Long.toString(j2), Long.toString(j3), Long.toString(j), Long.toString(j3)};
        if (!aznu.e()) {
            str = "SELECT package_name, package_version, dropbox_tag, SUM(CASE WHEN wallclock_time > ? AND wallclock_time <= ? THEN 1 ELSE 0 END) AS cnt_since_random_split, SUM(CASE WHEN wallclock_time > ?  AND wallclock_time <= ? THEN 1 ELSE 0 END) AS cnt_since_last_upload FROM error_data GROUP BY package_name, package_version, dropbox_tag HAVING cnt_since_last_upload > 0";
        } else {
            str = "SELECT package_name, dropbox_tag, SUM(CASE WHEN wallclock_time > ? AND wallclock_time <= ? THEN 1 ELSE 0 END) AS cnt_since_random_split, SUM(CASE WHEN wallclock_time > ?  AND wallclock_time <= ? THEN 1 ELSE 0 END) AS cnt_since_last_upload FROM error_data GROUP BY package_name, dropbox_tag HAVING cnt_since_last_upload > 0";
        }
        Cursor rawQuery = sQLiteDatabase2.rawQuery(str, strArr);
        try {
            if (rawQuery.moveToFirst()) {
                do {
                    aucd o = avuz.g.o();
                    String string = rawQuery.getString(rawQuery.getColumnIndexOrThrow("package_name"));
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avuz avuz = (avuz) o.b;
                    string.getClass();
                    avuz.a |= 1;
                    avuz.b = string;
                    if (!aznu.e()) {
                        int i = (int) rawQuery.getLong(rawQuery.getColumnIndexOrThrow("package_version"));
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        avuz avuz2 = (avuz) o.b;
                        avuz2.a |= 2;
                        avuz2.c = i;
                    }
                    String string2 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("dropbox_tag"));
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avuz avuz3 = (avuz) o.b;
                    string2.getClass();
                    avuz3.a |= 4;
                    avuz3.d = string2;
                    int i2 = (int) rawQuery.getLong(rawQuery.getColumnIndexOrThrow("cnt_since_random_split"));
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avuz avuz4 = (avuz) o.b;
                    avuz4.a |= 16;
                    avuz4.e = i2;
                    int i3 = (int) rawQuery.getLong(rawQuery.getColumnIndexOrThrow("cnt_since_last_upload"));
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avuz avuz5 = (avuz) o.b;
                    avuz5.a |= 32;
                    avuz5.f = i3;
                    avuz avuz6 = (avuz) o.i();
                    if (aucd2.c) {
                        aucd.c();
                        aucd2.c = false;
                    }
                    avva avva = (avva) aucd2.b;
                    avva avva2 = avva.g;
                    avuz6.getClass();
                    if (!avva.b.a()) {
                        avva.b = aucj.a(avva.b);
                    }
                    avva.b.add(avuz6);
                } while (rawQuery.moveToNext());
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            if (aznu.a.a().i()) {
                Cursor rawQuery2 = sQLiteDatabase2.rawQuery("SELECT dropbox_tag, SUM(CASE WHEN wallclock_time > ? AND wallclock_time <= ? THEN 1 ELSE 0 END) AS cnt_since_random_split, SUM(CASE WHEN wallclock_time > ?  AND wallclock_time <= ? THEN 1 ELSE 0 END) AS cnt_since_last_upload FROM error_data GROUP BY dropbox_tag", strArr);
                try {
                    if (rawQuery2.moveToFirst()) {
                        long j4 = 0;
                        long j5 = 0;
                        while (true) {
                            String string3 = rawQuery2.getString(rawQuery2.getColumnIndexOrThrow("dropbox_tag"));
                            long j6 = rawQuery2.getLong(rawQuery2.getColumnIndexOrThrow("cnt_since_random_split"));
                            j4 += j6;
                            long j7 = rawQuery2.getLong(rawQuery2.getColumnIndexOrThrow("cnt_since_last_upload"));
                            j5 += j7;
                            aucd o2 = avuz.g.o();
                            if (o2.c) {
                                o2.c();
                                o2.c = z;
                            }
                            avuz avuz7 = (avuz) o2.b;
                            string3.getClass();
                            avuz7.a |= 4;
                            avuz7.d = string3;
                            int b = aoog.b(j6);
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            avuz avuz8 = (avuz) o2.b;
                            avuz8.a |= 16;
                            avuz8.e = b;
                            int b2 = aoog.b(j7);
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            avuz avuz9 = (avuz) o2.b;
                            avuz9.a |= 32;
                            avuz9.f = b2;
                            avuz avuz10 = (avuz) o2.i();
                            if (aucd2.c) {
                                aucd.c();
                                aucd2.c = false;
                            }
                            avva avva3 = (avva) aucd2.b;
                            avva avva4 = avva.g;
                            avuz10.getClass();
                            if (!avva3.c.a()) {
                                avva3.c = aucj.a(avva3.c);
                            }
                            avva3.c.add(avuz10);
                            if (!rawQuery2.moveToNext()) {
                                break;
                            }
                            z = false;
                        }
                        aucd o3 = avuz.g.o();
                        int b3 = aoog.b(j4);
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        avuz avuz11 = (avuz) o3.b;
                        avuz11.a |= 16;
                        avuz11.e = b3;
                        int b4 = aoog.b(j5);
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        avuz avuz12 = (avuz) o3.b;
                        avuz12.a |= 32;
                        avuz12.f = b4;
                        avuz avuz13 = (avuz) o3.i();
                        if (aucd2.c) {
                            aucd.c();
                            aucd2.c = false;
                        }
                        avva avva5 = (avva) aucd2.b;
                        avuz13.getClass();
                        if (!avva5.d.a()) {
                            avva5.d = aucj.a(avva5.d);
                        }
                        avva5.d.add(avuz13);
                    }
                    if (rawQuery2 != null) {
                        rawQuery2.close();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    apev.a(th2, th3);
                }
            } else {
                return;
            }
            throw th;
            throw th2;
        } catch (Throwable th4) {
            apev.a(th, th4);
        }
    }

    public final int a(String str) {
        Cursor query;
        try {
            query = getReadableDatabase().query("battery_status", new String[]{str}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            if (query.moveToFirst()) {
                int i = query.getInt(query.getColumnIndexOrThrow(str));
                if (query != null) {
                    query.close();
                }
                return i;
            }
            if (query != null) {
                query.close();
            }
            return -1;
        } catch (SQLiteException e) {
            return -1;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final long a() {
        Cursor query;
        try {
            query = getReadableDatabase().query("eastworld_stats", new String[]{"last_split_millis"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            if (query.moveToFirst()) {
                long j = query.getLong(query.getColumnIndexOrThrow("last_split_millis"));
                if (query != null) {
                    query.close();
                }
                return j;
            }
            if (query != null) {
                query.close();
            }
            return -1;
        } catch (SQLiteException e) {
            return -1;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(int i, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("counter_val", Integer.valueOf(i2));
        try {
            getWritableDatabase().update("battery_counter", contentValues, "counter_key = ?", new String[]{String.valueOf(i)});
        } catch (SQLiteException e) {
        }
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE eastworld_stats (mtv_day INTEGER,last_split_millis LONG,stats_proto TEXT NOT NULL);");
            sQLiteDatabase.execSQL("CREATE TABLE battery_status (elapsed_time LONG,wallclock_time LONG,battery_level INTEGER,screen_on INTEGER,on_battery INTEGER,boot_count INTEGER,event_count INTEGER DEFAULT 0,last_event_time LONG,log_upload_count INTEGER DEFAULT 0,last_upload_elapsed_time LONG DEFAULT 0,last_upload_wallclock_time LONG DEFAULT 0);");
            sQLiteDatabase.execSQL("CREATE TABLE battery_counter (counter_key INTEGER,counter_val INTEGER);");
            sQLiteDatabase.execSQL("CREATE TABLE error_data (package_name TEXT NOT NULL,package_version INTEGER,dropbox_tag TEXT NOT NULL,wallclock_time LONG);");
            sQLiteDatabase.execSQL("CREATE TABLE error_status (last_upload_wallclock_time LONG DEFAULT 0);");
            sQLiteDatabase.execSQL("INSERT INTO eastworld_stats(mtv_day,last_split_millis,stats_proto) VALUES (-1,-1,'');");
        } catch (SQLiteException e) {
        }
    }
}
