package defpackage;

import android.content.Context;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;

/* renamed from: aaxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaxk extends aatv {
    private static aaxk c = null;
    private LevelDb d = null;

    static {
        aaxk.class.getSimpleName();
    }

    private aaxk(Context context) {
        super(context);
        d();
        aayz.a(this.d, 0);
    }

    static synchronized aaxk a(Context context) {
        aaxk aaxk;
        synchronized (aaxk.class) {
            if (c == null) {
                c = new aaxk(context);
            }
            aaxk = c;
        }
        return aaxk;
    }

    /* access modifiers changed from: package-private */
    public final synchronized long c() {
        return aayz.a(this.d);
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        LevelDb a = a(false, this.d, "blocked_bal_logs");
        this.d = a;
        return a != null;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        try {
            this.d.close();
            this.d = null;
        } catch (Exception e) {
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x000d] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080 A[SYNTHETIC, Splitter:B:30:0x0080] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List f() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0090 }
            r0.<init>()     // Catch:{ all -> 0x0090 }
            r1 = 0
            com.google.android.gms.leveldb.LevelDb r2 = r6.d     // Catch:{ Exception -> 0x0086, all -> 0x007d }
            com.google.android.gms.leveldb.LevelDb$Iterator r1 = r2.iterator()     // Catch:{ Exception -> 0x0086, all -> 0x007d }
            r1.seekToFirst()     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
        L_0x0010:
            boolean r2 = r1.isValid()     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
            if (r2 == 0) goto L_0x0073
            aarr r2 = defpackage.aarr.d     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            aarr r2 = defpackage.aarr.d     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            aucd r2 = r2.o()     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            byte[] r3 = r1.key()     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            aars r4 = defpackage.aars.d     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            aars r4 = defpackage.aars.d     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            aucj r3 = defpackage.aucj.a((defpackage.aucj) r4, (byte[]) r3)     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            aars r3 = (defpackage.aars) r3     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            boolean r4 = r2.c     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            r5 = 0
            if (r4 != 0) goto L_0x0032
            goto L_0x0037
        L_0x0032:
            r2.c()     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            r2.c = r5     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
        L_0x0037:
            aucj r4 = r2.b     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            aarr r4 = (defpackage.aarr) r4     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            r3.getClass()     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            r4.b = r3     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            int r3 = r4.a     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            r3 = r3 | 1
            r4.a = r3     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            byte[] r3 = r1.value()     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            int r3 = defpackage.aoog.a((byte[]) r3)     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            boolean r4 = r2.c     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            if (r4 != 0) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            r2.c()     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            r2.c = r5     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
        L_0x0058:
            aucj r4 = r2.b     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            aarr r4 = (defpackage.aarr) r4     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            int r5 = r4.a     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            r5 = r5 | 2
            r4.a = r5     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            r4.c = r3     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            aucj r2 = r2.i()     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            aarr r2 = (defpackage.aarr) r2     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            r0.add(r2)     // Catch:{ Exception -> 0x006e, all -> 0x0079 }
            goto L_0x006f
        L_0x006e:
            r2 = move-exception
        L_0x006f:
            r1.next()     // Catch:{ Exception -> 0x007b, all -> 0x0079 }
            goto L_0x0010
        L_0x0073:
            if (r1 == 0) goto L_0x008e
            r1.close()     // Catch:{ Exception -> 0x008d }
            goto L_0x008e
        L_0x0079:
            r0 = move-exception
            goto L_0x007e
        L_0x007b:
            r2 = move-exception
            goto L_0x0087
        L_0x007d:
            r0 = move-exception
        L_0x007e:
            if (r1 == 0) goto L_0x0085
            r1.close()     // Catch:{ Exception -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r1 = move-exception
        L_0x0085:
            throw r0     // Catch:{ all -> 0x0090 }
        L_0x0086:
            r2 = move-exception
        L_0x0087:
            if (r1 == 0) goto L_0x008e
            r1.close()     // Catch:{ Exception -> 0x008d }
            goto L_0x008e
        L_0x008d:
            r1 = move-exception
        L_0x008e:
            monitor-exit(r6)
            return r0
        L_0x0090:
            r0 = move-exception
            monitor-exit(r6)
            goto L_0x0094
        L_0x0093:
            throw r0
        L_0x0094:
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaxk.f():java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void g() {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.c()     // Catch:{ Exception -> 0x001a, all -> 0x0017 }
            boolean r2 = r5.a()     // Catch:{ Exception -> 0x001a, all -> 0x0017 }
            com.google.android.gms.leveldb.LevelDb r3 = r5.d     // Catch:{ Exception -> 0x001a, all -> 0x0017 }
            r4 = 0
            r3.deleteRange(r4, r4)     // Catch:{ Exception -> 0x001a, all -> 0x0017 }
            r5.a((long) r0)     // Catch:{ Exception -> 0x001a, all -> 0x0017 }
            r5.a((boolean) r2)     // Catch:{ Exception -> 0x001a, all -> 0x0017 }
        L_0x0015:
            monitor-exit(r5)
            return
        L_0x0017:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x001a:
            r0 = move-exception
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaxk.g():void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(long j) {
        aayz.a(this.d, j);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0058 A[SYNTHETIC, Splitter:B:33:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0063 A[SYNTHETIC, Splitter:B:40:0x0063] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.util.List r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L_0x004a
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x004a
            r0 = 0
            com.google.android.gms.leveldb.WriteBatch r0 = com.google.android.gms.leveldb.WriteBatch.create()     // Catch:{ Exception -> 0x0060, OutOfMemoryError -> 0x005e, all -> 0x0055 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004f }
        L_0x0012:
            boolean r1 = r5.hasNext()     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004f }
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r5.next()     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004f }
            aarr r1 = (defpackage.aarr) r1     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004f }
            aars r2 = r1.b     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004f }
            if (r2 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            aars r2 = defpackage.aars.d     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004f }
        L_0x0025:
            byte[] r2 = r2.k()     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004f }
            com.google.android.gms.leveldb.LevelDb r3 = r4.d     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004f }
            byte[] r3 = r3.get(r2)     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004f }
            if (r3 == 0) goto L_0x0036
            int r3 = defpackage.aoog.a((byte[]) r3)     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004f }
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            int r1 = r1.c     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004f }
            int r3 = r3 + r1
            byte[] r1 = defpackage.aoog.a((int) r3)     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004f }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004f }
            goto L_0x0012
        L_0x0042:
            com.google.android.gms.leveldb.LevelDb r5 = r4.d     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004f }
            r5.write(r0)     // Catch:{ Exception -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004f }
            r0.close()     // Catch:{ Exception -> 0x004c }
        L_0x004a:
            monitor-exit(r4)
            return
        L_0x004c:
            r5 = move-exception
        L_0x004d:
            monitor-exit(r4)
            return
        L_0x004f:
            r5 = move-exception
            goto L_0x0056
        L_0x0051:
            r5 = move-exception
            goto L_0x0061
        L_0x0053:
            r5 = move-exception
            goto L_0x0061
        L_0x0055:
            r5 = move-exception
        L_0x0056:
            if (r0 == 0) goto L_0x005d
            r0.close()     // Catch:{ Exception -> 0x005c }
            goto L_0x005d
        L_0x005c:
            r0 = move-exception
        L_0x005d:
            throw r5     // Catch:{ all -> 0x0067 }
        L_0x005e:
            r5 = move-exception
            goto L_0x0061
        L_0x0060:
            r5 = move-exception
        L_0x0061:
            if (r0 == 0) goto L_0x004d
            r0.close()     // Catch:{ Exception -> 0x004c }
            goto L_0x004a
        L_0x0067:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x006b
        L_0x006a:
            throw r5
        L_0x006b:
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaxk.a(java.util.List):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            byte[] r0 = new byte[r0]     // Catch:{ LevelDbException -> 0x0018, RuntimeException -> 0x0016, all -> 0x0013 }
            r1 = 0
            r0[r1] = r3     // Catch:{ LevelDbException -> 0x0018, RuntimeException -> 0x0016, all -> 0x0013 }
            com.google.android.gms.leveldb.LevelDb r3 = r2.d     // Catch:{ LevelDbException -> 0x0018, RuntimeException -> 0x0016, all -> 0x0013 }
            r1 = 2
            byte[] r1 = defpackage.aoog.a((int) r1)     // Catch:{ LevelDbException -> 0x0018, RuntimeException -> 0x0016, all -> 0x0013 }
            r3.put(r1, r0)     // Catch:{ LevelDbException -> 0x0018, RuntimeException -> 0x0016, all -> 0x0013 }
        L_0x0011:
            monitor-exit(r2)
            return
        L_0x0013:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0016:
            r3 = move-exception
            goto L_0x0011
        L_0x0018:
            r3 = move-exception
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaxk.a(boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a() {
        boolean z;
        azft.c();
        z = false;
        try {
            if (this.d.get(aoog.a(2))[0] == 0) {
                return false;
            }
            z = true;
        } catch (LevelDbException | RuntimeException e) {
        }
        return z;
    }
}
