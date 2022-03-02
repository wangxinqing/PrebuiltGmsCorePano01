package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.leveldb.LevelDb;

/* renamed from: aaun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaun extends aatv {
    private static final byte[] c = {0};
    private final int d;
    private final aauv e;
    private SQLiteDatabase f;
    private final String g;
    private LevelDb h;

    static {
        aaun.class.getSimpleName();
    }

    public aaun(Context context, int i, aauv aauv) {
        super(context);
        this.d = i;
        StringBuilder sb = new StringBuilder(21);
        sb.append("blacklist_");
        sb.append(i);
        String valueOf = String.valueOf(sb.toString());
        this.g = valueOf.length() == 0 ? new String("snet_sb_") : "snet_sb_".concat(valueOf);
        this.e = aauv;
        LevelDb levelDb = (LevelDb) aaur.l.get(this.d);
        this.h = levelDb;
        if (levelDb == null) {
            this.h = a(false, (LevelDb) null, this.g);
            aaur.l.put(this.d, this.h);
        }
    }

    private final void d() {
        aauv aauv = this.e;
        if (aauv != null) {
            try {
                this.f = aauv.getWritableDatabase();
                return;
            } catch (SQLException e2) {
            }
        }
        this.f = null;
    }

    private final void e() {
        SQLiteDatabase sQLiteDatabase = this.f;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        LevelDb levelDb = this.h;
        if (levelDb != null) {
            try {
                levelDb.close();
            } catch (IllegalStateException e2) {
            }
        }
        aaur.l.delete(this.d);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0058 A[SYNTHETIC, Splitter:B:37:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0064 A[SYNTHETIC, Splitter:B:45:0x0064] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List c() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x006a }
            r0.<init>()     // Catch:{ all -> 0x006a }
            boolean r1 = r5.b     // Catch:{ all -> 0x006a }
            r2 = 0
            if (r1 != 0) goto L_0x003b
            com.google.android.gms.leveldb.LevelDb r1 = r5.h     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.leveldb.LevelDb$Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0060, OutOfMemoryError -> 0x005e, all -> 0x0055 }
            r1.seekToFirst()     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004e }
            boolean r3 = r1.isValid()     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004e }
            if (r3 == 0) goto L_0x0046
        L_0x001c:
            boolean r3 = r1.isValid()     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004e }
            if (r3 == 0) goto L_0x003d
            byte[] r3 = r1.key()     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004e }
            if (r3 == 0) goto L_0x0034
            aaae r4 = new aaae     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004e }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004e }
            r0.add(r4)     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004e }
            r1.next()     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004e }
            goto L_0x001c
        L_0x0034:
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ Exception -> 0x003a }
            goto L_0x003b
        L_0x003a:
            r0 = move-exception
        L_0x003b:
            monitor-exit(r5)
            return r2
        L_0x003d:
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ Exception -> 0x0043 }
            goto L_0x0044
        L_0x0043:
            r1 = move-exception
        L_0x0044:
            monitor-exit(r5)
            return r0
        L_0x0046:
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ Exception -> 0x004c }
            goto L_0x003b
        L_0x004c:
            r0 = move-exception
            goto L_0x003b
        L_0x004e:
            r0 = move-exception
            r2 = r1
            goto L_0x0056
        L_0x0051:
            r0 = move-exception
            goto L_0x0062
        L_0x0053:
            r0 = move-exception
            goto L_0x0062
        L_0x0055:
            r0 = move-exception
        L_0x0056:
            if (r2 == 0) goto L_0x005d
            r2.close()     // Catch:{ Exception -> 0x005c }
            goto L_0x005d
        L_0x005c:
            r1 = move-exception
        L_0x005d:
            throw r0     // Catch:{ all -> 0x006a }
        L_0x005e:
            r0 = move-exception
            goto L_0x0061
        L_0x0060:
            r0 = move-exception
        L_0x0061:
            r1 = r2
        L_0x0062:
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ Exception -> 0x0068 }
            goto L_0x003b
        L_0x0068:
            r0 = move-exception
            goto L_0x003b
        L_0x006a:
            r0 = move-exception
            monitor-exit(r5)
            goto L_0x006e
        L_0x006d:
            throw r0
        L_0x006e:
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaun.c():java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00f0, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d9 A[SYNTHETIC, Splitter:B:69:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e4 A[SYNTHETIC, Splitter:B:76:0x00e4] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:53:0x00be=Splitter:B:53:0x00be, B:72:0x00de=Splitter:B:72:0x00de, B:43:0x00af=Splitter:B:43:0x00af} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.aauw r6, defpackage.aavb r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r7 == 0) goto L_0x00ef
            java.util.concurrent.locks.ReadWriteLock r7 = r6.c     // Catch:{ all -> 0x00fc }
            java.util.concurrent.locks.Lock r7 = r7.readLock()     // Catch:{ all -> 0x00fc }
            r7.lock()     // Catch:{ all -> 0x00fc }
            byte[] r7 = r6.d     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.locks.ReadWriteLock r0 = r6.c     // Catch:{ all -> 0x00fc }
            java.util.concurrent.locks.Lock r0 = r0.readLock()     // Catch:{ all -> 0x00fc }
            r0.unlock()     // Catch:{ all -> 0x00fc }
            byte[] r0 = r6.a()     // Catch:{ all -> 0x00fc }
            if (r7 == 0) goto L_0x00ef
            int r1 = r7.length     // Catch:{ all -> 0x00fc }
            if (r1 == 0) goto L_0x00ef
            com.google.android.gms.leveldb.LevelDb r1 = r5.h     // Catch:{ all -> 0x00fc }
            if (r1 != 0) goto L_0x0025
            goto L_0x0031
        L_0x0025:
            com.google.android.gms.leveldb.LevelDb$Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0030 }
            r1.close()     // Catch:{ Exception -> 0x0030 }
            r5.a()     // Catch:{ Exception -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r1 = move-exception
        L_0x0031:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00ec }
            java.io.File r2 = r5.b()     // Catch:{ Exception -> 0x00ec }
            java.lang.String r3 = r5.g     // Catch:{ Exception -> 0x00ec }
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x00ec }
            com.google.android.gms.leveldb.LevelDb.destroy(r1)     // Catch:{ Exception -> 0x00ec }
            android.util.SparseArray r1 = defpackage.aaur.l     // Catch:{ all -> 0x00fc }
            int r2 = r5.d     // Catch:{ all -> 0x00fc }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x00fc }
            com.google.android.gms.leveldb.LevelDb r1 = (com.google.android.gms.leveldb.LevelDb) r1     // Catch:{ all -> 0x00fc }
            r5.h = r1     // Catch:{ all -> 0x00fc }
            r2 = 0
            if (r1 != 0) goto L_0x0060
            r1 = 1
            java.lang.String r3 = r5.g     // Catch:{ all -> 0x00fc }
            com.google.android.gms.leveldb.LevelDb r1 = r5.a(r1, r2, r3)     // Catch:{ all -> 0x00fc }
            r5.h = r1     // Catch:{ all -> 0x00fc }
            android.util.SparseArray r1 = defpackage.aaur.l     // Catch:{ all -> 0x00fc }
            int r3 = r5.d     // Catch:{ all -> 0x00fc }
            com.google.android.gms.leveldb.LevelDb r4 = r5.h     // Catch:{ all -> 0x00fc }
            r1.put(r3, r4)     // Catch:{ all -> 0x00fc }
        L_0x0060:
            com.google.android.gms.leveldb.LevelDb r1 = r5.h     // Catch:{ all -> 0x00fc }
            if (r1 == 0) goto L_0x00b2
            com.google.android.gms.leveldb.WriteBatch r2 = com.google.android.gms.leveldb.WriteBatch.create()     // Catch:{ Exception -> 0x00e1, OutOfMemoryError -> 0x00df, all -> 0x00d6 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ Exception -> 0x00d4, OutOfMemoryError -> 0x00d2, all -> 0x00d0 }
            r1.<init>()     // Catch:{ Exception -> 0x00d4, OutOfMemoryError -> 0x00d2, all -> 0x00d0 }
            r6.a(r1)     // Catch:{ Exception -> 0x00d4, OutOfMemoryError -> 0x00d2, all -> 0x00d0 }
            java.util.Iterator r6 = r1.iterator()     // Catch:{ Exception -> 0x00d4, OutOfMemoryError -> 0x00d2, all -> 0x00d0 }
        L_0x0074:
            boolean r1 = r6.hasNext()     // Catch:{ Exception -> 0x00d4, OutOfMemoryError -> 0x00d2, all -> 0x00d0 }
            if (r1 == 0) goto L_0x0088
            java.lang.Object r1 = r6.next()     // Catch:{ Exception -> 0x00d4, OutOfMemoryError -> 0x00d2, all -> 0x00d0 }
            aaae r1 = (defpackage.aaae) r1     // Catch:{ Exception -> 0x00d4, OutOfMemoryError -> 0x00d2, all -> 0x00d0 }
            byte[] r1 = r1.a     // Catch:{ Exception -> 0x00d4, OutOfMemoryError -> 0x00d2, all -> 0x00d0 }
            byte[] r3 = c     // Catch:{ Exception -> 0x00d4, OutOfMemoryError -> 0x00d2, all -> 0x00d0 }
            r2.put(r1, r3)     // Catch:{ Exception -> 0x00d4, OutOfMemoryError -> 0x00d2, all -> 0x00d0 }
            goto L_0x0074
        L_0x0088:
            com.google.android.gms.leveldb.LevelDb r6 = r5.h     // Catch:{ Exception -> 0x00d4, OutOfMemoryError -> 0x00d2, all -> 0x00d0 }
            r6.write(r2)     // Catch:{ Exception -> 0x00d4, OutOfMemoryError -> 0x00d2, all -> 0x00d0 }
            r2.close()     // Catch:{ Exception -> 0x00cd }
            r5.d()     // Catch:{ SQLException -> 0x00c2, all -> 0x00b4 }
            android.database.sqlite.SQLiteDatabase r6 = r5.f     // Catch:{ SQLException -> 0x00c2, all -> 0x00b4 }
            if (r6 == 0) goto L_0x00af
            r6.beginTransaction()     // Catch:{ SQLException -> 0x00c2, all -> 0x00b4 }
            android.database.sqlite.SQLiteDatabase r6 = r5.f     // Catch:{ SQLException -> 0x00c2, all -> 0x00b4 }
            int r1 = r5.d     // Catch:{ SQLException -> 0x00c2, all -> 0x00b4 }
            defpackage.aavb.a(r6, r1, r7, r0)     // Catch:{ SQLException -> 0x00c2, all -> 0x00b4 }
            android.database.sqlite.SQLiteDatabase r6 = r5.f     // Catch:{ SQLException -> 0x00c2, all -> 0x00b4 }
            r6.setTransactionSuccessful()     // Catch:{ SQLException -> 0x00c2, all -> 0x00b4 }
            android.database.sqlite.SQLiteDatabase r6 = r5.f     // Catch:{ SQLException -> 0x00ae }
            if (r6 == 0) goto L_0x00af
            r6.endTransaction()     // Catch:{ SQLException -> 0x00ae }
            goto L_0x00af
        L_0x00ae:
            r6 = move-exception
        L_0x00af:
            r5.e()     // Catch:{ all -> 0x00fc }
        L_0x00b2:
            monitor-exit(r5)
            return
        L_0x00b4:
            r6 = move-exception
            android.database.sqlite.SQLiteDatabase r7 = r5.f     // Catch:{ SQLException -> 0x00bd }
            if (r7 == 0) goto L_0x00be
            r7.endTransaction()     // Catch:{ SQLException -> 0x00bd }
            goto L_0x00be
        L_0x00bd:
            r7 = move-exception
        L_0x00be:
            r5.e()     // Catch:{ all -> 0x00fc }
            throw r6     // Catch:{ all -> 0x00fc }
        L_0x00c2:
            r6 = move-exception
            android.database.sqlite.SQLiteDatabase r6 = r5.f     // Catch:{ SQLException -> 0x00cb }
            if (r6 == 0) goto L_0x00af
            r6.endTransaction()     // Catch:{ SQLException -> 0x00cb }
            goto L_0x00af
        L_0x00cb:
            r6 = move-exception
            goto L_0x00af
        L_0x00cd:
            r6 = move-exception
            monitor-exit(r5)
            return
        L_0x00d0:
            r6 = move-exception
            goto L_0x00d7
        L_0x00d2:
            r6 = move-exception
            goto L_0x00e2
        L_0x00d4:
            r6 = move-exception
            goto L_0x00e2
        L_0x00d6:
            r6 = move-exception
        L_0x00d7:
            if (r2 == 0) goto L_0x00de
            r2.close()     // Catch:{ Exception -> 0x00dd }
            goto L_0x00de
        L_0x00dd:
            r7 = move-exception
        L_0x00de:
            throw r6     // Catch:{ all -> 0x00fc }
        L_0x00df:
            r6 = move-exception
            goto L_0x00e2
        L_0x00e1:
            r6 = move-exception
        L_0x00e2:
            if (r2 == 0) goto L_0x00ea
            r2.close()     // Catch:{ Exception -> 0x00e9 }
            monitor-exit(r5)
            return
        L_0x00e9:
            r6 = move-exception
        L_0x00ea:
            monitor-exit(r5)
            return
        L_0x00ec:
            r6 = move-exception
            monitor-exit(r5)
            return
        L_0x00ef:
            monitor-exit(r5)
            return
        L_0x00f1:
            r7 = move-exception
            java.util.concurrent.locks.ReadWriteLock r6 = r6.c     // Catch:{ all -> 0x00fc }
            java.util.concurrent.locks.Lock r6 = r6.readLock()     // Catch:{ all -> 0x00fc }
            r6.unlock()     // Catch:{ all -> 0x00fc }
            throw r7     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x0100
        L_0x00ff:
            throw r6
        L_0x0100:
            goto L_0x00ff
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaun.a(aauw, aavb):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0048 A[SYNTHETIC, Splitter:B:37:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0051 A[SYNTHETIC, Splitter:B:44:0x0051] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(defpackage.aaae r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 == 0) goto L_0x002e
            boolean r1 = r3.b     // Catch:{ all -> 0x0057 }
            if (r1 != 0) goto L_0x002e
            com.google.android.gms.leveldb.LevelDb r1 = r3.h     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x002e
            r2 = 0
            com.google.android.gms.leveldb.LevelDb$Iterator r2 = r1.iterator()     // Catch:{ Exception -> 0x004e, all -> 0x0045 }
            r2.seekToFirst()     // Catch:{ Exception -> 0x0043, all -> 0x0041 }
            boolean r1 = r2.isValid()     // Catch:{ Exception -> 0x0043, all -> 0x0041 }
            if (r1 == 0) goto L_0x0039
            com.google.android.gms.leveldb.LevelDb r1 = r3.h     // Catch:{ LevelDbException -> 0x0030 }
            byte[] r4 = r4.a     // Catch:{ LevelDbException -> 0x0030 }
            byte[] r4 = r1.get(r4)     // Catch:{ LevelDbException -> 0x0030 }
            if (r4 == 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
        L_0x0027:
            if (r2 == 0) goto L_0x002e
            r2.close()     // Catch:{ Exception -> 0x002d }
            goto L_0x002e
        L_0x002d:
            r4 = move-exception
        L_0x002e:
            monitor-exit(r3)
            return r0
        L_0x0030:
            r4 = move-exception
            if (r2 == 0) goto L_0x002e
            r2.close()     // Catch:{ Exception -> 0x0037 }
            goto L_0x002e
        L_0x0037:
            r4 = move-exception
            goto L_0x002e
        L_0x0039:
            if (r2 == 0) goto L_0x002e
            r2.close()     // Catch:{ Exception -> 0x003f }
            goto L_0x002e
        L_0x003f:
            r4 = move-exception
            goto L_0x002e
        L_0x0041:
            r4 = move-exception
            goto L_0x0046
        L_0x0043:
            r4 = move-exception
            goto L_0x004f
        L_0x0045:
            r4 = move-exception
        L_0x0046:
            if (r2 == 0) goto L_0x004d
            r2.close()     // Catch:{ Exception -> 0x004c }
            goto L_0x004d
        L_0x004c:
            r0 = move-exception
        L_0x004d:
            throw r4     // Catch:{ all -> 0x0057 }
        L_0x004e:
            r4 = move-exception
        L_0x004f:
            if (r2 == 0) goto L_0x002e
            r2.close()     // Catch:{ Exception -> 0x0055 }
            goto L_0x002e
        L_0x0055:
            r4 = move-exception
            goto L_0x002e
        L_0x0057:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x005b
        L_0x005a:
            throw r4
        L_0x005b:
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaun.a(aaae):boolean");
    }
}
