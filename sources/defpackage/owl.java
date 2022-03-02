package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: owl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class owl implements owt {
    final /* synthetic */ apms a;
    private final Deque b;
    private final Deque c;
    private int d = 0;

    public owl(apms apms, amzy amzy) {
        this.a = apms;
        this.b = new ArrayDeque(amzy);
        this.c = new ArrayDeque();
    }

    private static final void a(String str, aolx aolx, Deque deque) {
        while (!deque.isEmpty()) {
            ((owm) deque.removeFirst()).a(str, aolx);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c0, code lost:
        r15.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        defpackage.oso.c((java.lang.Throwable) r0, "AppIndexing batch request failed", new java.lang.Object[0]);
        r2 = defpackage.aolx.e;
        r1.a.c.a("AppIndexingService INTERNAL_ERROR", r0, defpackage.axrp.f());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0186, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0187, code lost:
        defpackage.oso.c((java.lang.Throwable) r0, "AppIndexing batch request failed", new java.lang.Object[0]);
        r2 = defpackage.aolx.d;
        r3 = r0.getMessage();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0186 A[Catch:{ oye -> 0x0186 }, ExcHandler: oye (r0v9 'e' oye A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:5:0x0009] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.owv r17) {
        /*
            r16 = this;
            r1 = r16
            monitor-enter(r16)
            aolx r2 = defpackage.aolx.NO_ERROR     // Catch:{ all -> 0x01bf }
            r3 = 0
            r4 = 0
            java.lang.String r0 = "Batch request initializing"
            defpackage.oso.a(r0)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            apms r0 = r1.a     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            prm r5 = r0.a     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            android.content.Context r5 = r5.b     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.lang.String r0 = r0.e     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            ovw r5 = defpackage.ovw.a((android.content.Context) r5, (java.lang.String) r0)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            apms r0 = r1.a     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            prm r0 = r0.a     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            osf r12 = r0.b()     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            apms r0 = r1.a     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            prm r0 = r0.a     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            android.content.Context r0 = r0.b     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            oyb r13 = defpackage.oyb.a((android.content.Context) r0)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.lang.String r0 = "Batch request validating %d tasks"
            java.util.Deque r6 = r1.b     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            int r6 = r6.size()     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            defpackage.oso.a((java.lang.String) r0, (java.lang.Object) r6)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
        L_0x0039:
            java.util.Deque r0 = r1.b     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            boolean r0 = r0.isEmpty()     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            if (r0 == 0) goto L_0x00c4
            java.lang.String r0 = "Batch request executing %d mutations"
            java.util.Deque r6 = r1.c     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            int r6 = r6.size()     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            defpackage.oso.a((java.lang.String) r0, (java.lang.Object) r6)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            r0.<init>()     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.util.HashSet r14 = new java.util.HashSet     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            r14.<init>()     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            apms r6 = r1.a     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            r6.a((defpackage.ovw) r5, (defpackage.oyb) r13)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            android.database.sqlite.SQLiteDatabase r15 = r5.getWritableDatabase()     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            r15.beginTransaction()     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            int r11 = r1.d     // Catch:{ all -> 0x00bf }
            if (r11 > 0) goto L_0x006b
            goto L_0x0076
        L_0x006b:
            apms r6 = r1.a     // Catch:{ all -> 0x00bf }
            ozc r8 = r6.f     // Catch:{ all -> 0x00bf }
            r6 = r5
            r7 = r15
            r9 = r12
            r10 = r13
            r6.a(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00bf }
        L_0x0076:
            java.util.Deque r6 = r1.c     // Catch:{ all -> 0x00bf }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x00bf }
        L_0x007c:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x00bf }
            if (r7 == 0) goto L_0x009f
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x00bf }
            owm r7 = (defpackage.owm) r7     // Catch:{ all -> 0x00bf }
            oxl r7 = r7.a     // Catch:{ all -> 0x00bf }
            oxk r7 = (defpackage.oxk) r7     // Catch:{ all -> 0x00bf }
            apms r8 = r1.a     // Catch:{ all -> 0x00bf }
            ozc r8 = r8.f     // Catch:{ all -> 0x00bf }
            oxj r7 = r7.a(r15, r5, r8, r13)     // Catch:{ all -> 0x00bf }
            java.util.Set r8 = r7.a     // Catch:{ all -> 0x00bf }
            r0.addAll(r8)     // Catch:{ all -> 0x00bf }
            java.util.Set r7 = r7.b     // Catch:{ all -> 0x00bf }
            r14.addAll(r7)     // Catch:{ all -> 0x00bf }
            goto L_0x007c
        L_0x009f:
            r15.setTransactionSuccessful()     // Catch:{ all -> 0x00bf }
            r15.endTransaction()     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.lang.String r6 = "Batch request syncing corpora"
            defpackage.oso.a(r6)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            r0.removeAll(r14)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            apms r6 = r1.a     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            ozc r6 = r6.f     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            r7 = 8
            r5.a((java.util.Set) r14, (defpackage.ozc) r6, (defpackage.osf) r12, (int) r7)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            apms r6 = r1.a     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            ozc r6 = r6.f     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            r5.b(r0, r6, r12, r7)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            goto L_0x0194
        L_0x00bf:
            r0 = move-exception
            r15.endTransaction()     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            throw r0     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
        L_0x00c4:
            java.util.Deque r0 = r1.b     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.lang.Object r0 = r0.getFirst()     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            r6 = r0
            owm r6 = (defpackage.owm) r6     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            oxl r0 = r6.a     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            r7 = 1
            apms r8 = r1.a     // Catch:{ oye -> 0x0186 }
            ozc r8 = r8.f     // Catch:{ oxy -> 0x012f, oyf -> 0x0107, Exception -> 0x00e9 }
            r0.a((defpackage.ozc) r8, (defpackage.osf) r12, (defpackage.oyb) r13)     // Catch:{ oye -> 0x0186 }
            int r8 = r1.d     // Catch:{ oye -> 0x0186 }
            int r9 = r0.a()     // Catch:{ oye -> 0x0186 }
            int r8 = r8 + r9
            r1.d = r8     // Catch:{ oye -> 0x0186 }
            apms r8 = r1.a     // Catch:{ oye -> 0x0186 }
            ozc r8 = r8.f     // Catch:{ oxy -> 0x012f, oyf -> 0x0107, Exception -> 0x00e9 }
            r0.a(r8, r12)     // Catch:{ oye -> 0x0186 }
            r0 = r3
            goto L_0x0156
        L_0x00e9:
            r0 = move-exception
            java.lang.String r8 = "AppIndexing batch request validation of task failed"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            defpackage.oso.c((java.lang.Throwable) r0, (java.lang.String) r8, (java.lang.Object[]) r9)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.util.Deque r8 = r1.b     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.lang.Object r8 = r8.removeFirst()     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            owm r8 = (defpackage.owm) r8     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            if (r8 != r6) goto L_0x00fd
            r9 = 1
            goto L_0x00fe
        L_0x00fd:
            r9 = 0
        L_0x00fe:
            defpackage.iva.a((boolean) r9)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            aolx r9 = defpackage.aolx.INTERNAL_ERROR     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            r8.a((java.lang.String) r3, (defpackage.aolx) r9)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            goto L_0x0156
        L_0x0107:
            r0 = move-exception
            java.lang.String r8 = "AppIndexing batch request validation of task failed"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            defpackage.oso.c((java.lang.Throwable) r0, (java.lang.String) r8, (java.lang.Object[]) r9)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            android.util.Pair r8 = r6.a((defpackage.oyf) r0)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.util.Deque r9 = r1.b     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.lang.Object r9 = r9.removeFirst()     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            owm r9 = (defpackage.owm) r9     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            if (r9 != r6) goto L_0x011f
            r10 = 1
            goto L_0x0120
        L_0x011f:
            r10 = 0
        L_0x0120:
            defpackage.iva.a((boolean) r10)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.lang.Object r10 = r8.first     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.lang.Object r8 = r8.second     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            aolx r8 = (defpackage.aolx) r8     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            r9.a((java.lang.String) r10, (defpackage.aolx) r8)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            goto L_0x0156
        L_0x012f:
            r0 = move-exception
            java.lang.String r8 = "AppIndexing batch request validation of task failed"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            defpackage.oso.c((java.lang.Throwable) r0, (java.lang.String) r8, (java.lang.Object[]) r9)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            android.util.Pair r8 = r6.a((defpackage.oxy) r0)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.util.Deque r9 = r1.b     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.lang.Object r9 = r9.removeFirst()     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            owm r9 = (defpackage.owm) r9     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            if (r9 != r6) goto L_0x0147
            r10 = 1
            goto L_0x0148
        L_0x0147:
            r10 = 0
        L_0x0148:
            defpackage.iva.a((boolean) r10)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.lang.Object r10 = r8.first     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.lang.Object r8 = r8.second     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            aolx r8 = (defpackage.aolx) r8     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            r9.a((java.lang.String) r10, (defpackage.aolx) r8)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
        L_0x0156:
            if (r0 != 0) goto L_0x0039
            java.util.Deque r0 = r1.b     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            owm r0 = (defpackage.owm) r0     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            if (r0 != r6) goto L_0x0163
            goto L_0x0164
        L_0x0163:
            r7 = 0
        L_0x0164:
            defpackage.iva.a((boolean) r7)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            java.util.Deque r6 = r1.c     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            r6.add(r0)     // Catch:{ oye -> 0x0186, Exception -> 0x016e }
            goto L_0x0039
        L_0x016e:
            r0 = move-exception
            java.lang.String r2 = "AppIndexing batch request failed"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x01bf }
            defpackage.oso.c((java.lang.Throwable) r0, (java.lang.String) r2, (java.lang.Object[]) r4)     // Catch:{ all -> 0x01bf }
            aolx r2 = defpackage.aolx.INTERNAL_ERROR     // Catch:{ all -> 0x01bf }
            apms r4 = r1.a     // Catch:{ all -> 0x01bf }
            oyt r4 = r4.c     // Catch:{ all -> 0x01bf }
            java.lang.String r5 = "AppIndexingService INTERNAL_ERROR"
            long r6 = defpackage.axrp.f()     // Catch:{ all -> 0x01bf }
            r4.a(r5, r0, r6)     // Catch:{ all -> 0x01bf }
            goto L_0x0194
        L_0x0186:
            r0 = move-exception
            java.lang.String r2 = "AppIndexing batch request failed"
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x01bf }
            defpackage.oso.c((java.lang.Throwable) r0, (java.lang.String) r2, (java.lang.Object[]) r3)     // Catch:{ all -> 0x01bf }
            aolx r2 = defpackage.aolx.SEQUENCE_TABLE_FULL     // Catch:{ all -> 0x01bf }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x01bf }
        L_0x0194:
            int r0 = defpackage.oxz.a((defpackage.aolx) r2)     // Catch:{ all -> 0x01bf }
            boolean r0 = defpackage.ibt.b(r0)     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x01a7
            boolean r0 = r17.b()     // Catch:{ all -> 0x01bf }
            if (r0 != 0) goto L_0x01a5
            goto L_0x01a7
        L_0x01a5:
            monitor-exit(r16)
            return
        L_0x01a7:
            java.lang.String r0 = "Batch request sending results"
            defpackage.oso.a(r0)     // Catch:{ all -> 0x01bf }
            r17.a()     // Catch:{ all -> 0x01bf }
            java.util.Deque r0 = r1.b     // Catch:{ all -> 0x01bf }
            a(r3, r2, r0)     // Catch:{ all -> 0x01bf }
            java.util.Deque r0 = r1.c     // Catch:{ all -> 0x01bf }
            a(r3, r2, r0)     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = "Batch request finished"
            defpackage.oso.a(r0)     // Catch:{ all -> 0x01bf }
            goto L_0x01a5
        L_0x01bf:
            r0 = move-exception
            monitor-exit(r16)
            goto L_0x01c3
        L_0x01c2:
            throw r0
        L_0x01c3:
            goto L_0x01c2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owl.a(owv):void");
    }
}
