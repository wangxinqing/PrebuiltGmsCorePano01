package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dt implements Runnable {
    final /* synthetic */ dw a;

    public dt(dw dwVar) {
        this.a = dwVar;
    }

    /* JADX INFO: finally extract failed */
    private final Set a() {
        HashSet hashSet = new HashSet();
        Cursor a2 = this.a.c.a((dg) new da("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (a2.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(a2.getInt(0)));
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        }
        a2.close();
        if (!hashSet.isEmpty()) {
            this.a.i.b();
        }
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            dw r0 = r6.a
            eb r0 = r0.c
            java.util.concurrent.locks.Lock r0 = r0.a()
            r0.lock()
            r1 = 0
            dw r2 = r6.a     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            eb r3 = r2.c     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            boolean r3 = r3.c()     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            if (r3 == 0) goto L_0x006c
            boolean r3 = r2.e     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            if (r3 != 0) goto L_0x0021
            eb r3 = r2.c     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            de r3 = r3.b     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            r3.a()     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
        L_0x0021:
            boolean r2 = r2.e     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            if (r2 == 0) goto L_0x0070
            dw r2 = r6.a     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.d     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            r3 = 1
            r4 = 0
            boolean r2 = r2.compareAndSet(r3, r4)     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            if (r2 == 0) goto L_0x006c
            dw r2 = r6.a     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            eb r2 = r2.c     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            boolean r2 = r2.i()     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            if (r2 != 0) goto L_0x006c
            dw r2 = r6.a     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            eb r2 = r2.c     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            boolean r3 = r2.d     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            if (r3 == 0) goto L_0x0067
            de r2 = r2.b     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            di r2 = r2.a()     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            r2.a()     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            java.util.Set r3 = r6.a()     // Catch:{ all -> 0x005d }
            r2.c()     // Catch:{ all -> 0x005b }
            r2.b()     // Catch:{ IllegalStateException -> 0x0059, SQLiteException -> 0x0057 }
            goto L_0x0085
        L_0x0057:
            r2 = move-exception
            goto L_0x007e
        L_0x0059:
            r2 = move-exception
            goto L_0x007e
        L_0x005b:
            r4 = move-exception
            goto L_0x005f
        L_0x005d:
            r4 = move-exception
            r3 = r1
        L_0x005f:
            r2.b()     // Catch:{ IllegalStateException -> 0x0065, SQLiteException -> 0x0063 }
            throw r4     // Catch:{ IllegalStateException -> 0x0065, SQLiteException -> 0x0063 }
        L_0x0063:
            r2 = move-exception
            goto L_0x007e
        L_0x0065:
            r2 = move-exception
            goto L_0x007e
        L_0x0067:
            java.util.Set r3 = r6.a()     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            goto L_0x0085
        L_0x006c:
            r0.unlock()
            return
        L_0x0070:
            java.lang.String r2 = "ROOM"
            java.lang.String r3 = "database is not initialized even though it is open"
            android.util.Log.e(r2, r3)     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
            goto L_0x006c
        L_0x0078:
            r1 = move-exception
            goto L_0x00b6
        L_0x007a:
            r2 = move-exception
            goto L_0x007d
        L_0x007c:
            r2 = move-exception
        L_0x007d:
            r3 = r1
        L_0x007e:
            java.lang.String r4 = "ROOM"
            java.lang.String r5 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r4, r5, r2)     // Catch:{ all -> 0x0078 }
        L_0x0085:
            r0.unlock()
            if (r3 == 0) goto L_0x00b5
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00b5
            dw r0 = r6.a
            n r0 = r0.f
            monitor-enter(r0)
            dw r2 = r6.a     // Catch:{ all -> 0x00b2 }
            n r2 = r2.f     // Catch:{ all -> 0x00b2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00b2 }
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00b2 }
            if (r3 != 0) goto L_0x00a5
            monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
            return
        L_0x00a5:
            java.lang.Object r2 = r2.next()     // Catch:{ all -> 0x00b2 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00b2 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00b2 }
            dv r2 = (defpackage.dv) r2     // Catch:{ all -> 0x00b2 }
            throw r1     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
            throw r1
        L_0x00b5:
            return
        L_0x00b6:
            r0.unlock()
            goto L_0x00bb
        L_0x00ba:
            throw r1
        L_0x00bb:
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt.run():void");
    }
}
