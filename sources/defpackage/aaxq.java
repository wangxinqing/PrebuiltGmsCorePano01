package defpackage;

import android.content.Context;
import com.google.android.gms.leveldb.LevelDb;

/* renamed from: aaxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaxq extends aatv {
    private static aaxq c = null;
    private LevelDb d = null;

    static {
        aaxq.class.getSimpleName();
    }

    private aaxq(Context context) {
        super(context);
        c();
        aayz.a(this.d, 0);
    }

    static synchronized aaxq a(Context context) {
        aaxq aaxq;
        synchronized (aaxq.class) {
            if (c == null) {
                c = new aaxq(context);
            }
            aaxq = c;
        }
        return aaxq;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean c() {
        LevelDb a = a(false, this.d, "snet_cached_events");
        this.d = a;
        return a != null;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        try {
            this.d.close();
            this.d = null;
        } catch (Exception e) {
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x000d] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a A[SYNTHETIC, Splitter:B:22:0x003a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List e() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x004a }
            r0.<init>()     // Catch:{ all -> 0x004a }
            r1 = 0
            com.google.android.gms.leveldb.LevelDb r2 = r4.d     // Catch:{ Exception -> 0x0040, all -> 0x0037 }
            com.google.android.gms.leveldb.LevelDb$Iterator r1 = r2.iterator()     // Catch:{ Exception -> 0x0040, all -> 0x0037 }
            r1.seekToFirst()     // Catch:{ Exception -> 0x0035, all -> 0x0033 }
        L_0x0010:
            boolean r2 = r1.isValid()     // Catch:{ Exception -> 0x0035, all -> 0x0033 }
            if (r2 == 0) goto L_0x002d
            byte[] r2 = r1.value()     // Catch:{ Exception -> 0x0028, all -> 0x0033 }
            aart r3 = defpackage.aart.g     // Catch:{ Exception -> 0x0028, all -> 0x0033 }
            aart r3 = defpackage.aart.g     // Catch:{ Exception -> 0x0028, all -> 0x0033 }
            aucj r2 = defpackage.aucj.a((defpackage.aucj) r3, (byte[]) r2)     // Catch:{ Exception -> 0x0028, all -> 0x0033 }
            aart r2 = (defpackage.aart) r2     // Catch:{ Exception -> 0x0028, all -> 0x0033 }
            r0.add(r2)     // Catch:{ Exception -> 0x0028, all -> 0x0033 }
            goto L_0x0029
        L_0x0028:
            r2 = move-exception
        L_0x0029:
            r1.next()     // Catch:{ Exception -> 0x0035, all -> 0x0033 }
            goto L_0x0010
        L_0x002d:
            if (r1 == 0) goto L_0x0048
            r1.close()     // Catch:{ Exception -> 0x0047 }
            goto L_0x0048
        L_0x0033:
            r0 = move-exception
            goto L_0x0038
        L_0x0035:
            r2 = move-exception
            goto L_0x0041
        L_0x0037:
            r0 = move-exception
        L_0x0038:
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ Exception -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            throw r0     // Catch:{ all -> 0x004a }
        L_0x0040:
            r2 = move-exception
        L_0x0041:
            if (r1 == 0) goto L_0x0048
            r1.close()     // Catch:{ Exception -> 0x0047 }
            goto L_0x0048
        L_0x0047:
            r1 = move-exception
        L_0x0048:
            monitor-exit(r4)
            return r0
        L_0x004a:
            r0 = move-exception
            monitor-exit(r4)
            goto L_0x004e
        L_0x004d:
            throw r0
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaxq.e():java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.a()     // Catch:{ Exception -> 0x0013, all -> 0x0010 }
            com.google.android.gms.leveldb.LevelDb r2 = r4.d     // Catch:{ Exception -> 0x0013, all -> 0x0010 }
            r3 = 0
            r2.deleteRange(r3, r3)     // Catch:{ Exception -> 0x0013, all -> 0x0010 }
            r4.a((long) r0)     // Catch:{ Exception -> 0x0013, all -> 0x0010 }
        L_0x000e:
            monitor-exit(r4)
            return
        L_0x0010:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0013:
            r0 = move-exception
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaxq.f():void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized long a() {
        return aayz.a(this.d);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(long j) {
        aayz.a(this.d, j);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042 A[SYNTHETIC, Splitter:B:25:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004d A[SYNTHETIC, Splitter:B:32:0x004d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.util.List r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L_0x0034
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x0034
            r0 = 0
            com.google.android.gms.leveldb.WriteBatch r0 = com.google.android.gms.leveldb.WriteBatch.create()     // Catch:{ Exception -> 0x004a, OutOfMemoryError -> 0x0048, all -> 0x003f }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x003d, OutOfMemoryError -> 0x003b, all -> 0x0039 }
        L_0x0012:
            boolean r1 = r5.hasNext()     // Catch:{ Exception -> 0x003d, OutOfMemoryError -> 0x003b, all -> 0x0039 }
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r5.next()     // Catch:{ Exception -> 0x003d, OutOfMemoryError -> 0x003b, all -> 0x0039 }
            aart r1 = (defpackage.aart) r1     // Catch:{ Exception -> 0x003d, OutOfMemoryError -> 0x003b, all -> 0x0039 }
            long r2 = r1.d     // Catch:{ Exception -> 0x003d, OutOfMemoryError -> 0x003b, all -> 0x0039 }
            byte[] r2 = defpackage.aook.b(r2)     // Catch:{ Exception -> 0x003d, OutOfMemoryError -> 0x003b, all -> 0x0039 }
            byte[] r1 = r1.k()     // Catch:{ Exception -> 0x003d, OutOfMemoryError -> 0x003b, all -> 0x0039 }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x003d, OutOfMemoryError -> 0x003b, all -> 0x0039 }
            goto L_0x0012
        L_0x002c:
            com.google.android.gms.leveldb.LevelDb r5 = r4.d     // Catch:{ Exception -> 0x003d, OutOfMemoryError -> 0x003b, all -> 0x0039 }
            r5.write(r0)     // Catch:{ Exception -> 0x003d, OutOfMemoryError -> 0x003b, all -> 0x0039 }
            r0.close()     // Catch:{ Exception -> 0x0036 }
        L_0x0034:
            monitor-exit(r4)
            return
        L_0x0036:
            r5 = move-exception
        L_0x0037:
            monitor-exit(r4)
            return
        L_0x0039:
            r5 = move-exception
            goto L_0x0040
        L_0x003b:
            r5 = move-exception
            goto L_0x004b
        L_0x003d:
            r5 = move-exception
            goto L_0x004b
        L_0x003f:
            r5 = move-exception
        L_0x0040:
            if (r0 == 0) goto L_0x0047
            r0.close()     // Catch:{ Exception -> 0x0046 }
            goto L_0x0047
        L_0x0046:
            r0 = move-exception
        L_0x0047:
            throw r5     // Catch:{ all -> 0x0051 }
        L_0x0048:
            r5 = move-exception
            goto L_0x004b
        L_0x004a:
            r5 = move-exception
        L_0x004b:
            if (r0 == 0) goto L_0x0037
            r0.close()     // Catch:{ Exception -> 0x0036 }
            goto L_0x0034
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x0055
        L_0x0054:
            throw r5
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaxq.a(java.util.List):void");
    }
}
