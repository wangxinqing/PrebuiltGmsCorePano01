package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: lea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lea {
    private static final ith a = new ith("FeedProcessorDriver", "");
    private final BlockingQueue b;
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private final kkz e;
    private final lsm f;
    private final kkf g;
    private final kkb h;
    private long i = 0;

    public lea(lsm lsm, kkz kkz, String str) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(4);
        iva.a((Object) lsm);
        this.f = lsm;
        iva.a((Object) kkz);
        this.e = kkz;
        iva.a((Object) str);
        iva.a((Object) linkedBlockingQueue);
        this.b = linkedBlockingQueue;
        this.g = lsm.d;
        this.h = lsm.c;
    }

    private final void a() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((lei) arrayList.get(i2)).interrupt();
        }
        ArrayList arrayList2 = this.d;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            lei lei = (lei) arrayList2.get(i3);
            try {
                lei.join();
            } catch (Exception e2) {
                if (lei.isAlive()) {
                    a.c("FeedProcessorDriver", "Producer not cleaned up correctly.", e2);
                }
            }
        }
        do {
            try {
                if (this.b.isEmpty() || ((lej) this.b.take()).a()) {
                }
                return;
            } catch (Exception e3) {
                if (!this.b.isEmpty()) {
                    a.c("FeedProcessorDriver", "Producer not cleaned up correctly.", e3);
                    return;
                }
                return;
            }
        } while (((lej) this.b.take()).a());
    }

    private final void a(Set set) {
        if (!set.isEmpty()) {
            this.f.v.a(set);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:174:0x02a9 A[Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251, all -> 0x02df }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02aa A[Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251, all -> 0x02df }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a A[Catch:{ SQLException -> 0x0197, led -> 0x0190, NetworkError | TimeoutError -> 0x0187, VolleyError | InterruptedException -> 0x017e, eif -> 0x0177, Exception -> 0x0170, all -> 0x0169 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0103 A[Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError | TimeoutError -> 0x014f, VolleyError | InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(android.content.SyncResult r21, boolean r22) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            java.lang.String r3 = "Exception in finally block"
            r4 = 0
            r1.i = r4
            java.util.ArrayList r4 = r1.c
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x02fa
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            r8.<init>()     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            kkf r9 = r1.g     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            kkz r10 = r1.e     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            java.lang.String r10 = r10.a     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            klb r9 = r9.b((java.lang.String) r10)     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            long r9 = r9.a     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            java.util.ArrayList r11 = r1.c     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
        L_0x002e:
            boolean r12 = r11.hasNext()     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            if (r12 == 0) goto L_0x0042
            java.lang.Object r12 = r11.next()     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            ldz r12 = (defpackage.ldz) r12     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            r12.a((long) r9)     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            r12 = 0
            r8.add(r12)     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            goto L_0x002e
        L_0x0042:
            r10 = 0
        L_0x0043:
            boolean r11 = java.lang.Thread.interrupted()     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            if (r11 != 0) goto L_0x0235
            java.util.concurrent.BlockingQueue r11 = r1.b     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            java.lang.Object r11 = r11.take()     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            lej r11 = (defpackage.lej) r11     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            java.lang.Exception r12 = r11.b     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            if (r12 != 0) goto L_0x0232
            boolean r12 = r11.a()     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            if (r12 != 0) goto L_0x019e
            boolean r12 = java.lang.Thread.interrupted()     // Catch:{ SQLException -> 0x0197, led -> 0x0190, NetworkError -> 0x0189, TimeoutError -> 0x0187, VolleyError -> 0x0180, InterruptedException -> 0x017e, eif -> 0x0177, Exception -> 0x0170, all -> 0x0169 }
            if (r12 != 0) goto L_0x0110
            int r12 = r11.a     // Catch:{ SQLException -> 0x0197, led -> 0x0190, NetworkError -> 0x0189, TimeoutError -> 0x0187, VolleyError -> 0x0180, InterruptedException -> 0x017e, eif -> 0x0177, Exception -> 0x0170, all -> 0x0169 }
            if (r12 < 0) goto L_0x006f
            java.util.ArrayList r13 = r1.c     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            int r13 = r13.size()     // Catch:{ SQLException -> 0x02d0, led -> 0x02a1, NetworkError -> 0x0293, TimeoutError -> 0x0291, VolleyError -> 0x0283, InterruptedException -> 0x0281, eif -> 0x026c, Exception -> 0x0257, all -> 0x0251 }
            if (r12 >= r13) goto L_0x006f
            r12 = 1
            goto L_0x0070
        L_0x006f:
            r12 = 0
        L_0x0070:
            java.lang.String r13 = "Item in processor results queue is invalid."
            defpackage.iva.a((boolean) r12, (java.lang.Object) r13)     // Catch:{ SQLException -> 0x0197, led -> 0x0190, NetworkError -> 0x0189, TimeoutError -> 0x0187, VolleyError -> 0x0180, InterruptedException -> 0x017e, eif -> 0x0177, Exception -> 0x0170, all -> 0x0169 }
            java.util.ArrayList r12 = r1.c     // Catch:{ SQLException -> 0x0197, led -> 0x0190, NetworkError -> 0x0189, TimeoutError -> 0x0187, VolleyError -> 0x0180, InterruptedException -> 0x017e, eif -> 0x0177, Exception -> 0x0170, all -> 0x0169 }
            int r13 = r11.a     // Catch:{ SQLException -> 0x0197, led -> 0x0190, NetworkError -> 0x0189, TimeoutError -> 0x0187, VolleyError -> 0x0180, InterruptedException -> 0x017e, eif -> 0x0177, Exception -> 0x0170, all -> 0x0169 }
            java.lang.Object r12 = r12.get(r13)     // Catch:{ SQLException -> 0x0197, led -> 0x0190, NetworkError -> 0x0189, TimeoutError -> 0x0187, VolleyError -> 0x0180, InterruptedException -> 0x017e, eif -> 0x0177, Exception -> 0x0170, all -> 0x0169 }
            ldz r12 = (defpackage.ldz) r12     // Catch:{ SQLException -> 0x0197, led -> 0x0190, NetworkError -> 0x0189, TimeoutError -> 0x0187, VolleyError -> 0x0180, InterruptedException -> 0x017e, eif -> 0x0177, Exception -> 0x0170, all -> 0x0169 }
            lno r11 = r11.d     // Catch:{ SQLException -> 0x0197, led -> 0x0190, NetworkError -> 0x0189, TimeoutError -> 0x0187, VolleyError -> 0x0180, InterruptedException -> 0x017e, eif -> 0x0177, Exception -> 0x0170, all -> 0x0169 }
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ SQLException -> 0x0197, led -> 0x0190, NetworkError -> 0x0189, TimeoutError -> 0x0187, VolleyError -> 0x0180, InterruptedException -> 0x017e, eif -> 0x0177, Exception -> 0x0170, all -> 0x0169 }
            r13.<init>()     // Catch:{ SQLException -> 0x0197, led -> 0x0190, NetworkError -> 0x0189, TimeoutError -> 0x0187, VolleyError -> 0x0180, InterruptedException -> 0x017e, eif -> 0x0177, Exception -> 0x0170, all -> 0x0169 }
            java.util.List r14 = r11.a     // Catch:{ SQLException -> 0x0197, led -> 0x0190, NetworkError -> 0x0189, TimeoutError -> 0x0187, VolleyError -> 0x0180, InterruptedException -> 0x017e, eif -> 0x0177, Exception -> 0x0170, all -> 0x0169 }
            if (r14 == 0) goto L_0x0103
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLException -> 0x0197, led -> 0x0190, NetworkError -> 0x0189, TimeoutError -> 0x0187, VolleyError -> 0x0180, InterruptedException -> 0x017e, eif -> 0x0177, Exception -> 0x0170, all -> 0x0169 }
            kkb r9 = r1.h     // Catch:{ SQLException -> 0x0197, led -> 0x0190, NetworkError -> 0x0189, TimeoutError -> 0x0187, VolleyError -> 0x0180, InterruptedException -> 0x017e, eif -> 0x0177, Exception -> 0x0170, all -> 0x0169 }
            kkh r9 = r9.c()     // Catch:{ SQLException -> 0x0197, led -> 0x0190, NetworkError -> 0x0189, TimeoutError -> 0x0187, VolleyError -> 0x0180, InterruptedException -> 0x017e, eif -> 0x0177, Exception -> 0x0170, all -> 0x0169 }
            kkl r5 = r9.a     // Catch:{ all -> 0x00fb }
            kkz r6 = r1.e     // Catch:{ all -> 0x00fb }
            java.lang.String r6 = r6.a     // Catch:{ all -> 0x00fb }
            krk r6 = r5.b((java.lang.String) r6)     // Catch:{ all -> 0x00fb }
            r5.a((defpackage.krk) r6, (java.util.Collection) r14)     // Catch:{ all -> 0x00fb }
            r12.a(r6, r11)     // Catch:{ all -> 0x00fb }
            java.util.Iterator r5 = r14.iterator()     // Catch:{ all -> 0x00fb }
        L_0x00a8:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x00fb }
            if (r7 == 0) goto L_0x00e1
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x00fb }
            lnj r7 = (defpackage.lnj) r7     // Catch:{ all -> 0x00fb }
            r14 = r22
            com.google.android.gms.drive.DriveId r7 = r12.a(r6, r7, r14)     // Catch:{ RuntimeException -> 0x00c5, all -> 0x00c0 }
            if (r7 == 0) goto L_0x00a8
            r13.add(r7)     // Catch:{ RuntimeException -> 0x00c5, all -> 0x00c0 }
            goto L_0x00a8
        L_0x00c0:
            r0 = move-exception
            r2 = r0
            r19 = r3
            goto L_0x00ff
        L_0x00c5:
            r0 = move-exception
            r7 = r0
            android.content.SyncStats r11 = r2.stats     // Catch:{ all -> 0x00fb }
            r19 = r3
            long r2 = r11.numParseExceptions     // Catch:{ all -> 0x00f9 }
            r17 = 1
            long r2 = r2 + r17
            r11.numParseExceptions = r2     // Catch:{ all -> 0x00f9 }
            java.lang.String r2 = "Error while syncing entry."
            ith r3 = a     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = "FeedProcessorDriver"
            r3.c(r11, r2, r7)     // Catch:{ all -> 0x00f9 }
            r2 = r21
            r3 = r19
            goto L_0x00a8
        L_0x00e1:
            r14 = r22
            r19 = r3
            r12.a((defpackage.krk) r6)     // Catch:{ all -> 0x00f9 }
            r9.a()     // Catch:{ all -> 0x00f9 }
            r9.b()     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            long r2 = r2 - r15
            long r5 = r1.i     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            long r5 = r5 + r2
            r1.i = r5     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            goto L_0x0107
        L_0x00f9:
            r0 = move-exception
            goto L_0x00fe
        L_0x00fb:
            r0 = move-exception
            r19 = r3
        L_0x00fe:
            r2 = r0
        L_0x00ff:
            r9.b()     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            throw r2     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
        L_0x0103:
            r14 = r22
            r19 = r3
        L_0x0107:
            r4.addAll(r13)     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            r2 = r21
            r3 = r19
            goto L_0x0043
        L_0x0110:
            r19 = r3
            java.lang.InterruptedException r2 = new java.lang.InterruptedException     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            int r3 = r11.a     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            r6 = 41
            r5.<init>(r6)     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            java.lang.String r6 = "Interrupted while processing #"
            r5.append(r6)     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            r5.append(r3)     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            java.lang.String r3 = r5.toString()     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            r2.<init>(r3)     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            throw r2     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
        L_0x012d:
            r0 = move-exception
            r3 = r21
            r2 = r0
            r5 = r19
            goto L_0x02e2
        L_0x0135:
            r0 = move-exception
            r3 = r21
            r2 = r0
            r5 = r19
            goto L_0x025b
        L_0x013d:
            r0 = move-exception
            r3 = r21
            r2 = r0
            r5 = r19
            goto L_0x0270
        L_0x0145:
            r0 = move-exception
            goto L_0x0148
        L_0x0147:
            r0 = move-exception
        L_0x0148:
            r3 = r21
            r2 = r0
            r5 = r19
            goto L_0x0287
        L_0x014f:
            r0 = move-exception
            goto L_0x0152
        L_0x0151:
            r0 = move-exception
        L_0x0152:
            r3 = r21
            r2 = r0
            r5 = r19
            goto L_0x0297
        L_0x0159:
            r0 = move-exception
            r3 = r21
            r2 = r0
            r5 = r19
            goto L_0x02a5
        L_0x0161:
            r0 = move-exception
            r3 = r21
            r2 = r0
            r5 = r19
            goto L_0x02d4
        L_0x0169:
            r0 = move-exception
            r2 = r0
            r5 = r3
            r3 = r21
            goto L_0x02e2
        L_0x0170:
            r0 = move-exception
            r2 = r0
            r5 = r3
            r3 = r21
            goto L_0x025b
        L_0x0177:
            r0 = move-exception
            r2 = r0
            r5 = r3
            r3 = r21
            goto L_0x0270
        L_0x017e:
            r0 = move-exception
            goto L_0x0181
        L_0x0180:
            r0 = move-exception
        L_0x0181:
            r2 = r0
            r5 = r3
            r3 = r21
            goto L_0x0287
        L_0x0187:
            r0 = move-exception
            goto L_0x018a
        L_0x0189:
            r0 = move-exception
        L_0x018a:
            r2 = r0
            r5 = r3
            r3 = r21
            goto L_0x0297
        L_0x0190:
            r0 = move-exception
            r2 = r0
            r5 = r3
            r3 = r21
            goto L_0x02a5
        L_0x0197:
            r0 = move-exception
            r2 = r0
            r5 = r3
            r3 = r21
            goto L_0x02d4
        L_0x019e:
            r14 = r22
            r19 = r3
            int r10 = r10 + 1
            int r2 = r11.a     // Catch:{ SQLException -> 0x022b, led -> 0x0224, NetworkError -> 0x021d, TimeoutError -> 0x021b, VolleyError -> 0x0214, InterruptedException -> 0x0212, eif -> 0x020b, Exception -> 0x0204, all -> 0x01fd }
            lno r3 = r11.d     // Catch:{ SQLException -> 0x022b, led -> 0x0224, NetworkError -> 0x021d, TimeoutError -> 0x021b, VolleyError -> 0x0214, InterruptedException -> 0x0212, eif -> 0x020b, Exception -> 0x0204, all -> 0x01fd }
            if (r3 != 0) goto L_0x01ad
            java.lang.String r3 = r11.c     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            goto L_0x01af
        L_0x01ad:
            java.lang.String r3 = r3.b     // Catch:{ SQLException -> 0x022b, led -> 0x0224, NetworkError -> 0x021d, TimeoutError -> 0x021b, VolleyError -> 0x0214, InterruptedException -> 0x0212, eif -> 0x020b, Exception -> 0x0204, all -> 0x01fd }
        L_0x01af:
            r8.set(r2, r3)     // Catch:{ SQLException -> 0x022b, led -> 0x0224, NetworkError -> 0x021d, TimeoutError -> 0x021b, VolleyError -> 0x0214, InterruptedException -> 0x0212, eif -> 0x020b, Exception -> 0x0204, all -> 0x01fd }
            java.util.ArrayList r2 = r1.c     // Catch:{ SQLException -> 0x022b, led -> 0x0224, NetworkError -> 0x021d, TimeoutError -> 0x021b, VolleyError -> 0x0214, InterruptedException -> 0x0212, eif -> 0x020b, Exception -> 0x0204, all -> 0x01fd }
            int r2 = r2.size()     // Catch:{ SQLException -> 0x022b, led -> 0x0224, NetworkError -> 0x021d, TimeoutError -> 0x021b, VolleyError -> 0x0214, InterruptedException -> 0x0212, eif -> 0x020b, Exception -> 0x0204, all -> 0x01fd }
            if (r10 != r2) goto L_0x01f5
            r9 = 0
        L_0x01bb:
            java.util.ArrayList r2 = r1.c     // Catch:{ SQLException -> 0x022b, led -> 0x0224, NetworkError -> 0x021d, TimeoutError -> 0x021b, VolleyError -> 0x0214, InterruptedException -> 0x0212, eif -> 0x020b, Exception -> 0x0204, all -> 0x01fd }
            int r2 = r2.size()     // Catch:{ SQLException -> 0x022b, led -> 0x0224, NetworkError -> 0x021d, TimeoutError -> 0x021b, VolleyError -> 0x0214, InterruptedException -> 0x0212, eif -> 0x020b, Exception -> 0x0204, all -> 0x01fd }
            if (r9 >= r2) goto L_0x01d7
            java.util.ArrayList r2 = r1.c     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            java.lang.Object r2 = r2.get(r9)     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            ldz r2 = (defpackage.ldz) r2     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            java.lang.Object r3 = r8.get(r9)     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            r2.a((java.lang.String) r3)     // Catch:{ SQLException -> 0x0161, led -> 0x0159, NetworkError -> 0x0151, TimeoutError -> 0x014f, VolleyError -> 0x0147, InterruptedException -> 0x0145, eif -> 0x013d, Exception -> 0x0135, all -> 0x012d }
            int r9 = r9 + 1
            goto L_0x01bb
        L_0x01d7:
            long r2 = r1.i     // Catch:{ SQLException -> 0x022b, led -> 0x0224, NetworkError -> 0x021d, TimeoutError -> 0x021b, VolleyError -> 0x0214, InterruptedException -> 0x0212, eif -> 0x020b, Exception -> 0x0204, all -> 0x01fd }
            r20.a()     // Catch:{ Exception -> 0x01e0 }
            r1.a(r4)     // Catch:{ Exception -> 0x01e0 }
            return r2
        L_0x01e0:
            r0 = move-exception
            r2 = r0
            r3 = r21
            android.content.SyncStats r3 = r3.stats
            long r4 = r3.numParseExceptions
            r6 = 1
            long r4 = r4 + r6
            r3.numParseExceptions = r4
            leo r3 = new leo
            r5 = r19
            r3.<init>(r5, r2)
            throw r3
        L_0x01f5:
            r3 = r21
            r5 = r19
            r2 = r3
            r3 = r5
            goto L_0x0043
        L_0x01fd:
            r0 = move-exception
            r3 = r21
            r5 = r19
            goto L_0x0254
        L_0x0204:
            r0 = move-exception
            r3 = r21
            r5 = r19
            goto L_0x025a
        L_0x020b:
            r0 = move-exception
            r3 = r21
            r5 = r19
            goto L_0x026f
        L_0x0212:
            r0 = move-exception
            goto L_0x0215
        L_0x0214:
            r0 = move-exception
        L_0x0215:
            r3 = r21
            r5 = r19
            goto L_0x0286
        L_0x021b:
            r0 = move-exception
            goto L_0x021e
        L_0x021d:
            r0 = move-exception
        L_0x021e:
            r3 = r21
            r5 = r19
            goto L_0x0296
        L_0x0224:
            r0 = move-exception
            r3 = r21
            r5 = r19
            goto L_0x02a4
        L_0x022b:
            r0 = move-exception
            r3 = r21
            r5 = r19
            goto L_0x02d3
        L_0x0232:
            r5 = r3
            r3 = r2
            throw r12     // Catch:{ SQLException -> 0x024e, led -> 0x024b, NetworkError -> 0x0249, TimeoutError -> 0x0247, VolleyError -> 0x0245, InterruptedException -> 0x0243, eif -> 0x0241, Exception -> 0x023f }
        L_0x0235:
            r5 = r3
            r3 = r2
            java.lang.InterruptedException r2 = new java.lang.InterruptedException     // Catch:{ SQLException -> 0x024e, led -> 0x024b, NetworkError -> 0x0249, TimeoutError -> 0x0247, VolleyError -> 0x0245, InterruptedException -> 0x0243, eif -> 0x0241, Exception -> 0x023f }
            java.lang.String r6 = "Interrupted during processing"
            r2.<init>(r6)     // Catch:{ SQLException -> 0x024e, led -> 0x024b, NetworkError -> 0x0249, TimeoutError -> 0x0247, VolleyError -> 0x0245, InterruptedException -> 0x0243, eif -> 0x0241, Exception -> 0x023f }
            throw r2     // Catch:{ SQLException -> 0x024e, led -> 0x024b, NetworkError -> 0x0249, TimeoutError -> 0x0247, VolleyError -> 0x0245, InterruptedException -> 0x0243, eif -> 0x0241, Exception -> 0x023f }
        L_0x023f:
            r0 = move-exception
            goto L_0x025a
        L_0x0241:
            r0 = move-exception
            goto L_0x026f
        L_0x0243:
            r0 = move-exception
            goto L_0x0286
        L_0x0245:
            r0 = move-exception
            goto L_0x0286
        L_0x0247:
            r0 = move-exception
            goto L_0x0296
        L_0x0249:
            r0 = move-exception
            goto L_0x0296
        L_0x024b:
            r0 = move-exception
            goto L_0x02a4
        L_0x024e:
            r0 = move-exception
            goto L_0x02d3
        L_0x0251:
            r0 = move-exception
            r5 = r3
            r3 = r2
        L_0x0254:
            r2 = r0
            goto L_0x02e2
        L_0x0257:
            r0 = move-exception
            r5 = r3
            r3 = r2
        L_0x025a:
            r2 = r0
        L_0x025b:
            android.content.SyncStats r6 = r3.stats     // Catch:{ all -> 0x02df }
            long r7 = r6.numParseExceptions     // Catch:{ all -> 0x02df }
            r9 = 1
            long r7 = r7 + r9
            r6.numParseExceptions = r7     // Catch:{ all -> 0x02df }
            leo r6 = new leo     // Catch:{ all -> 0x02df }
            java.lang.String r7 = "Runtime Exception"
            r6.<init>(r7, r2)     // Catch:{ all -> 0x02df }
            throw r6     // Catch:{ all -> 0x02df }
        L_0x026c:
            r0 = move-exception
            r5 = r3
            r3 = r2
        L_0x026f:
            r2 = r0
        L_0x0270:
            android.content.SyncStats r6 = r3.stats     // Catch:{ all -> 0x02df }
            long r7 = r6.numAuthExceptions     // Catch:{ all -> 0x02df }
            r9 = 1
            long r7 = r7 + r9
            r6.numAuthExceptions = r7     // Catch:{ all -> 0x02df }
            leo r6 = new leo     // Catch:{ all -> 0x02df }
            java.lang.String r7 = "Authorization exception received from server"
            r6.<init>(r7, r2)     // Catch:{ all -> 0x02df }
            throw r6     // Catch:{ all -> 0x02df }
        L_0x0281:
            r0 = move-exception
            goto L_0x0284
        L_0x0283:
            r0 = move-exception
        L_0x0284:
            r5 = r3
            r3 = r2
        L_0x0286:
            r2 = r0
        L_0x0287:
            android.content.SyncStats r6 = r3.stats     // Catch:{ all -> 0x02df }
            long r7 = r6.numParseExceptions     // Catch:{ all -> 0x02df }
            r9 = 1
            long r7 = r7 + r9
            r6.numParseExceptions = r7     // Catch:{ all -> 0x02df }
            throw r2     // Catch:{ all -> 0x02df }
        L_0x0291:
            r0 = move-exception
            goto L_0x0294
        L_0x0293:
            r0 = move-exception
        L_0x0294:
            r5 = r3
            r3 = r2
        L_0x0296:
            r2 = r0
        L_0x0297:
            android.content.SyncStats r6 = r3.stats     // Catch:{ all -> 0x02df }
            long r7 = r6.numIoExceptions     // Catch:{ all -> 0x02df }
            r9 = 1
            long r7 = r7 + r9
            r6.numIoExceptions = r7     // Catch:{ all -> 0x02df }
            throw r2     // Catch:{ all -> 0x02df }
        L_0x02a1:
            r0 = move-exception
            r5 = r3
            r3 = r2
        L_0x02a4:
            r2 = r0
        L_0x02a5:
            java.lang.Long r6 = r2.a     // Catch:{ all -> 0x02df }
            if (r6 != 0) goto L_0x02aa
            goto L_0x02bf
        L_0x02aa:
            kkb r6 = r1.h     // Catch:{ all -> 0x02df }
            kql r7 = defpackage.kod.a     // Catch:{ all -> 0x02df }
            kql r8 = defpackage.kod.a     // Catch:{ all -> 0x02df }
            kqh r8 = r8.a     // Catch:{ all -> 0x02df }
            java.lang.Long r9 = r2.a     // Catch:{ all -> 0x02df }
            long r9 = r9.longValue()     // Catch:{ all -> 0x02df }
            kqy r8 = r8.e((long) r9)     // Catch:{ all -> 0x02df }
            r6.a((defpackage.kql) r7, (defpackage.kqy) r8)     // Catch:{ all -> 0x02df }
        L_0x02bf:
            android.content.SyncStats r6 = r3.stats     // Catch:{ all -> 0x02df }
            long r7 = r6.numParseExceptions     // Catch:{ all -> 0x02df }
            r9 = 1
            long r7 = r7 + r9
            r6.numParseExceptions = r7     // Catch:{ all -> 0x02df }
            leo r6 = new leo     // Catch:{ all -> 0x02df }
            java.lang.String r7 = "Invalid feed while syncing"
            r6.<init>(r7, r2)     // Catch:{ all -> 0x02df }
            throw r6     // Catch:{ all -> 0x02df }
        L_0x02d0:
            r0 = move-exception
            r5 = r3
            r3 = r2
        L_0x02d3:
            r2 = r0
        L_0x02d4:
            r6 = 1
            r3.databaseError = r6     // Catch:{ all -> 0x02df }
            leo r6 = new leo     // Catch:{ all -> 0x02df }
            java.lang.String r7 = "Database corrupted"
            r6.<init>(r7, r2)     // Catch:{ all -> 0x02df }
            throw r6     // Catch:{ all -> 0x02df }
        L_0x02df:
            r0 = move-exception
            goto L_0x0254
        L_0x02e2:
            r20.a()     // Catch:{ Exception -> 0x02e9 }
            r1.a(r4)     // Catch:{ Exception -> 0x02e9 }
            throw r2
        L_0x02e9:
            r0 = move-exception
            r2 = r0
            android.content.SyncStats r3 = r3.stats
            long r6 = r3.numParseExceptions
            r8 = 1
            long r6 = r6 + r8
            r3.numParseExceptions = r6
            leo r3 = new leo
            r3.<init>(r5, r2)
            throw r3
        L_0x02fa:
            leo r2 = new leo
            java.lang.String r3 = "No feeds to process"
            r2.<init>(r3)
            goto L_0x0303
        L_0x0302:
            throw r2
        L_0x0303:
            goto L_0x0302
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lea.a(android.content.SyncResult, boolean):long");
    }

    public final void a(lcq lcq, Long l, kkz kkz, int i2, ldz ldz, lnk lnk) {
        boolean z;
        if (this.c.size() == this.d.size()) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        kkz kkz2 = kkz;
        iva.b(this.e.equals(kkz));
        int size = this.c.size();
        this.c.add(ldz);
        lei lei = new lei(khq.a(this.e).a(this.f.b), this.f, this.b, lcq, l, this.g.d(this.e), i2, size, lnk);
        lei.start();
        this.d.add(lei);
    }
}
