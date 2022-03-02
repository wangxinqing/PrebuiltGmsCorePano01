package defpackage;

import java.util.Map;

/* renamed from: aaup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaup implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ aavs b;
    final /* synthetic */ aaur c;

    public aaup(aaur aaur, Map map, aavs aavs) {
        this.c = aaur;
        this.a = map;
        this.b = aavs;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d9, code lost:
        r4 = (defpackage.aaux) r3.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            aaur r0 = r10.c
            aauz r0 = r0.i
            java.util.Map r1 = r10.a
            aavs r2 = r10.b
            java.util.Set r3 = r1.keySet()
            java.util.Map r2 = defpackage.aawf.a(r3, r2)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Map r4 = r0.a
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0088
            java.util.concurrent.locks.ReadWriteLock r4 = r0.b
            java.util.concurrent.locks.Lock r4 = r4.readLock()
            r4.lock()
            java.util.Map r4 = r0.a     // Catch:{ all -> 0x007d }
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x007d }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x007d }
        L_0x0030:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x007d }
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x007d }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x007d }
            java.lang.Object r6 = r5.getValue()     // Catch:{ all -> 0x007d }
            aaux r6 = (defpackage.aaux) r6     // Catch:{ all -> 0x007d }
            aaux r7 = new aaux     // Catch:{ all -> 0x007d }
            r7.<init>()     // Catch:{ all -> 0x007d }
            java.util.Map r8 = r6.a     // Catch:{ all -> 0x007d }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x007d }
            r9.<init>()     // Catch:{ all -> 0x007d }
            r7.a = r9     // Catch:{ all -> 0x007d }
            if (r8 != 0) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            java.util.Map r9 = r7.a     // Catch:{ all -> 0x007d }
            r9.putAll(r8)     // Catch:{ all -> 0x007d }
        L_0x0058:
            java.util.Map r6 = r6.b     // Catch:{ all -> 0x007d }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x007d }
            r8.<init>()     // Catch:{ all -> 0x007d }
            r7.b = r8     // Catch:{ all -> 0x007d }
            if (r6 != 0) goto L_0x0064
            goto L_0x0069
        L_0x0064:
            java.util.Map r8 = r7.b     // Catch:{ all -> 0x007d }
            r8.putAll(r6)     // Catch:{ all -> 0x007d }
        L_0x0069:
            java.lang.Object r5 = r5.getKey()     // Catch:{ all -> 0x007d }
            aaae r5 = (defpackage.aaae) r5     // Catch:{ all -> 0x007d }
            r3.put(r5, r7)     // Catch:{ all -> 0x007d }
            goto L_0x0030
        L_0x0073:
            java.util.concurrent.locks.ReadWriteLock r4 = r0.b
            java.util.concurrent.locks.Lock r4 = r4.readLock()
            r4.unlock()
            goto L_0x0088
        L_0x007d:
            r1 = move-exception
            java.util.concurrent.locks.ReadWriteLock r0 = r0.b
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.unlock()
            throw r1
        L_0x0088:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0090:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00bb
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            aaae r5 = (defpackage.aaae) r5
            java.lang.Object r4 = r4.getValue()
            aavs r4 = (defpackage.aavs) r4
            if (r4 == 0) goto L_0x0090
            aauy r6 = new aauy
            r6.<init>()
            r6.a = r4
            long r7 = java.lang.System.currentTimeMillis()
            r6.b = r7
            r0.a(r3, r5, r6)
            goto L_0x0090
        L_0x00bb:
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x00c3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ff
            java.lang.Object r2 = r1.next()
            aaae r2 = (defpackage.aaae) r2
            aaae r4 = r2.b()
            boolean r5 = r3.containsKey(r4)
            if (r5 == 0) goto L_0x00c3
            java.lang.Object r4 = r3.get(r4)
            aaux r4 = (defpackage.aaux) r4
            java.util.Map r5 = r4.b
            if (r5 == 0) goto L_0x00c3
            boolean r5 = r5.containsKey(r2)
            if (r5 == 0) goto L_0x00c3
            java.util.Map r5 = r4.b
            java.lang.Object r5 = r5.get(r2)
            aauy r5 = (defpackage.aauy) r5
            if (r5 == 0) goto L_0x00c3
            aauy r5 = defpackage.aauz.a(r5)
            if (r5 != 0) goto L_0x00c3
            java.util.Map r4 = r4.b
            r4.remove(r2)
            goto L_0x00c3
        L_0x00ff:
            java.util.concurrent.locks.ReadWriteLock r1 = r0.b
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            java.util.Map r1 = r0.a     // Catch:{ all -> 0x016f }
            r1.clear()     // Catch:{ all -> 0x016f }
            r1 = 0
            r0.a = r1     // Catch:{ all -> 0x016f }
            r0.a = r3     // Catch:{ all -> 0x016f }
            java.util.concurrent.locks.ReadWriteLock r0 = r0.b
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            aaur r0 = r10.c
            long r0 = r0.p
            long r2 = defpackage.aaur.e
            long r0 = r0 + r2
            long r2 = java.lang.System.currentTimeMillis()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x016e
            aaur r0 = r10.c
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.o
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L_0x016d
            aaur r0 = r10.c     // Catch:{ all -> 0x0164 }
            aaus r1 = r0.h     // Catch:{ all -> 0x0164 }
            aauz r0 = r0.i     // Catch:{ all -> 0x0164 }
            boolean r0 = r1.b(r0)     // Catch:{ all -> 0x0164 }
            if (r0 == 0) goto L_0x015c
            aarq r0 = new aarq     // Catch:{ all -> 0x0164 }
            aaur r1 = r10.c     // Catch:{ all -> 0x0164 }
            android.content.Context r1 = r1.f     // Catch:{ all -> 0x0164 }
            r0.<init>(r1)     // Catch:{ all -> 0x0164 }
            aaur r1 = r10.c     // Catch:{ all -> 0x0164 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0164 }
            r1.p = r3     // Catch:{ all -> 0x0164 }
            aaur r1 = r10.c     // Catch:{ all -> 0x0164 }
            long r3 = r1.p     // Catch:{ all -> 0x0164 }
            java.lang.String r1 = "snet_safe_browsing_last_cache_write_ms"
            r0.a((java.lang.String) r1, (long) r3)     // Catch:{ all -> 0x0164 }
        L_0x015c:
            aaur r0 = r10.c
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.o
            r0.set(r2)
            return
        L_0x0164:
            r0 = move-exception
            aaur r1 = r10.c
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.o
            r1.set(r2)
            throw r0
        L_0x016d:
            return
        L_0x016e:
            return
        L_0x016f:
            r1 = move-exception
            java.util.concurrent.locks.ReadWriteLock r0 = r0.b
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            goto L_0x017b
        L_0x017a:
            throw r1
        L_0x017b:
            goto L_0x017a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaup.run():void");
    }
}
