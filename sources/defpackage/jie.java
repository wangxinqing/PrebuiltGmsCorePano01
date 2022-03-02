package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: jie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jie {
    public final Object a = new Object();
    public final Object b = new Object();
    public SQLiteDatabase c;
    public int d;
    public final ob e;
    ScheduledFuture f;
    final Runnable g = new jia(this);
    private final String h;
    private final ScheduledExecutorService i;
    private final long j;
    private final long k;
    private final TimeUnit l;
    private final SQLiteOpenHelper m;
    private final jic n;

    public jie(SQLiteOpenHelper sQLiteOpenHelper, String str, jic jic, ScheduledExecutorService scheduledExecutorService, long j2, TimeUnit timeUnit, int i2) {
        boolean z;
        if (i2 < 0) {
            Log.w("CachingDatabaseWriter", "buffer size should be >= 0");
        }
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "bufferSize must be >= 0");
        this.m = sQLiteOpenHelper;
        this.h = str;
        this.n = jic;
        this.i = scheduledExecutorService;
        this.j = (long) i2;
        this.k = j2;
        this.l = timeUnit;
        this.e = new ob(i2);
    }

    public final int a(String str, String str2, String[] strArr) {
        SQLiteDatabase writableDatabase;
        int delete;
        synchronized (this.a) {
            ScheduledFuture scheduledFuture = this.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            synchronized (this.b) {
                a(this.e);
                this.e.clear();
                try {
                    writableDatabase = this.m.getWritableDatabase();
                    delete = writableDatabase.delete(str, str2, strArr);
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } catch (SQLiteException e2) {
                    Log.e("CachingDatabaseWriter", "Unable to open database", e2);
                    return -1;
                } catch (Throwable th) {
                    apev.a(th, th);
                }
            }
        }
        return delete;
        throw th;
    }

    public final Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4) {
        Cursor query;
        synchronized (this.b) {
            try {
                SQLiteDatabase readableDatabase = this.m.getReadableDatabase();
                this.c = readableDatabase;
                this.d++;
                query = readableDatabase.query(str, strArr, str2, strArr2, (String) null, (String) null, str3, str4);
            } catch (SQLiteException e2) {
                Log.e("CachingDatabaseWriter", "Unable to open database", e2);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return query;
    }

    public final void a() {
        this.i.execute(new jib(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r6.isDone() != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            ob r1 = r5.e     // Catch:{ all -> 0x004a }
            r1.add(r6)     // Catch:{ all -> 0x004a }
            ob r6 = r5.e     // Catch:{ all -> 0x004a }
            int r6 = r6.b     // Catch:{ all -> 0x004a }
            long r1 = (long) r6     // Catch:{ all -> 0x004a }
            long r3 = r5.j     // Catch:{ all -> 0x004a }
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x002f
            java.util.concurrent.ScheduledFuture r6 = r5.f     // Catch:{ all -> 0x004a }
            if (r6 != 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            boolean r6 = r6.isDone()     // Catch:{ all -> 0x004a }
            if (r6 == 0) goto L_0x0048
        L_0x001e:
            java.util.concurrent.ScheduledExecutorService r6 = r5.i     // Catch:{ all -> 0x004a }
            java.lang.Runnable r1 = r5.g     // Catch:{ all -> 0x004a }
            long r2 = r5.k     // Catch:{ all -> 0x004a }
            java.util.concurrent.TimeUnit r4 = r5.l     // Catch:{ all -> 0x004a }
            jfv r6 = (defpackage.jfv) r6     // Catch:{ all -> 0x004a }
            aort r6 = r6.schedule((java.lang.Runnable) r1, (long) r2, (java.util.concurrent.TimeUnit) r4)     // Catch:{ all -> 0x004a }
            r5.f = r6     // Catch:{ all -> 0x004a }
            goto L_0x0048
        L_0x002f:
            java.util.concurrent.ScheduledFuture r6 = r5.f     // Catch:{ all -> 0x004a }
            if (r6 == 0) goto L_0x0037
            r1 = 0
            r6.cancel(r1)     // Catch:{ all -> 0x004a }
        L_0x0037:
            java.util.concurrent.ScheduledExecutorService r6 = r5.i     // Catch:{ all -> 0x004a }
            jid r1 = new jid     // Catch:{ all -> 0x004a }
            ob r2 = r5.e     // Catch:{ all -> 0x004a }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x004a }
            r6.execute(r1)     // Catch:{ all -> 0x004a }
            ob r6 = r5.e     // Catch:{ all -> 0x004a }
            r6.clear()     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jie.a(java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ob r8) {
        /*
            r7 = this;
            int r0 = r8.b
            if (r0 == 0) goto L_0x005b
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            r2 = 0
            android.database.sqlite.SQLiteOpenHelper r3 = r7.m     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            r3.beginTransaction()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0036 }
            r4 = 0
        L_0x0014:
            if (r4 >= r0) goto L_0x002a
            java.lang.Object r5 = r8.b(r4)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0036 }
            jic r6 = r7.n     // Catch:{ SQLiteException -> 0x0039, all -> 0x0036 }
            r6.a(r5, r1)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0036 }
            java.lang.String r5 = r7.h     // Catch:{ SQLiteException -> 0x0039, all -> 0x0036 }
            r3.insert(r5, r2, r1)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0036 }
            r1.clear()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0036 }
            int r4 = r4 + 1
            goto L_0x0014
        L_0x002a:
            r3.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0036 }
            if (r3 == 0) goto L_0x0050
            r3.endTransaction()
            r3.close()
            return
        L_0x0036:
            r8 = move-exception
            r2 = r3
            goto L_0x0052
        L_0x0039:
            r8 = move-exception
            r2 = r3
            goto L_0x003f
        L_0x003c:
            r8 = move-exception
            goto L_0x0052
        L_0x003e:
            r8 = move-exception
        L_0x003f:
            java.lang.String r0 = "CachingDatabaseWriter"
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x0051 }
            android.util.Log.e(r0, r8)     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x0050
            r2.endTransaction()
            r2.close()
        L_0x0050:
            return
        L_0x0051:
            r8 = move-exception
        L_0x0052:
            if (r2 == 0) goto L_0x005a
            r2.endTransaction()
            r2.close()
        L_0x005a:
            throw r8
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jie.a(ob):void");
    }
}
