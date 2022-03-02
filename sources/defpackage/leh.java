package defpackage;

/* renamed from: leh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class leh implements Runnable {
    final /* synthetic */ lcp a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ aosh d;
    final /* synthetic */ aosh e;
    final /* synthetic */ aosh f;
    final /* synthetic */ lei g;
    final /* synthetic */ leg h;

    public leh(lei lei, lcp lcp, String str, boolean z, leg leg, aosh aosh, aosh aosh2, aosh aosh3) {
        this.g = lei;
        this.a = lcp;
        this.b = str;
        this.c = z;
        this.h = leg;
        this.d = aosh;
        this.e = aosh2;
        this.f = aosh3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02c4, code lost:
        r4 = "Error fetching page";
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x024f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0251, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0253, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0255, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x026b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0275, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0276, code lost:
        r17 = "Error fetching page";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0278, code lost:
        r2 = r0;
        defpackage.lei.a.c(r17);
        r3 = r2.networkResponse;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0282, code lost:
        if (r3 != null) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x028b, code lost:
        r2 = new defpackage.led(r1.g.f);
        r1.f.a((java.lang.Throwable) r2);
        r1.e.a((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x029e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x029f, code lost:
        r1.f.a((java.lang.Throwable) r2);
        r1.e.a((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02aa, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02bf A[ExcHandler: eif | InterruptedException | led (r0v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0251 A[Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }, ExcHandler: led (e led), PHI: r1 r17 
      PHI: (r1v8 leh) = (r1v10 leh), (r1v0 leh), (r1v0 leh), (r1v0 leh), (r1v0 leh) binds: [B:62:0x0211, B:22:0x00f0, B:25:0x0110, B:26:?, B:27:0x0112] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r17v5 java.lang.String) = (r17v7 java.lang.String), (r17v9 java.lang.String), (r17v9 java.lang.String), (r17v9 java.lang.String) binds: [B:62:0x0211, B:25:0x0110, B:26:?, B:27:0x0112] A[DONT_GENERATE, DONT_INLINE], Splitter:B:25:0x0110] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0253 A[Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }, ExcHandler: InterruptedException (e java.lang.InterruptedException), PHI: r1 r17 
      PHI: (r1v7 leh) = (r1v10 leh), (r1v0 leh), (r1v0 leh), (r1v0 leh), (r1v0 leh) binds: [B:62:0x0211, B:22:0x00f0, B:25:0x0110, B:26:?, B:27:0x0112] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r17v4 java.lang.String) = (r17v7 java.lang.String), (r17v9 java.lang.String), (r17v9 java.lang.String), (r17v9 java.lang.String) binds: [B:62:0x0211, B:25:0x0110, B:26:?, B:27:0x0112] A[DONT_GENERATE, DONT_INLINE], Splitter:B:25:0x0110] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0255 A[Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }, ExcHandler: eif (e eif), PHI: r1 r17 
      PHI: (r1v6 leh) = (r1v10 leh), (r1v0 leh), (r1v0 leh), (r1v0 leh), (r1v0 leh) binds: [B:62:0x0211, B:22:0x00f0, B:25:0x0110, B:26:?, B:27:0x0112] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r17v3 java.lang.String) = (r17v7 java.lang.String), (r17v9 java.lang.String), (r17v9 java.lang.String), (r17v9 java.lang.String) binds: [B:62:0x0211, B:25:0x0110, B:26:?, B:27:0x0112] A[DONT_GENERATE, DONT_INLINE], Splitter:B:25:0x0110] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02aa A[ExcHandler: ExecutionException (e java.util.concurrent.ExecutionException), PHI: r1 
      PHI: (r1v3 leh) = (r1v0 leh), (r1v10 leh), (r1v0 leh), (r1v0 leh), (r1v0 leh), (r1v0 leh) binds: [B:1:0x0004, B:62:0x0211, B:22:0x00f0, B:25:0x0110, B:26:?, B:27:0x0112] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "Error fetching page"
            lcr r3 = defpackage.lcr.CHANGELOG     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lcp r3 = r1.a     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lcr r3 = r3.c     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            int r3 = r3.ordinal()     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            r4 = 1
            if (r3 == 0) goto L_0x00ca
            if (r3 == r4) goto L_0x009d
            r6 = 2
            if (r3 == r6) goto L_0x007b
            r6 = 3
            if (r3 == r6) goto L_0x0057
            r6 = 4
            if (r3 != r6) goto L_0x003b
            lei r3 = r1.g     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lnn r6 = r3.b     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            com.google.android.gms.common.internal.ClientContext r7 = r3.d     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            java.lang.String r9 = r1.b     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            boolean r13 = r1.c     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            leg r14 = r1.h     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lnk r15 = r3.h     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            r8 = 0
            r10 = 0
            com.google.android.gms.drive.DriveSpace r3 = com.google.android.gms.drive.DriveSpace.c     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            java.lang.String r11 = r3.f     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            r12 = 0
            r16 = 2824(0xb08, float:3.957E-42)
            lno r3 = r6.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            r17 = r2
            goto L_0x020f
        L_0x003b:
            ith r3 = defpackage.lei.a     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lcp r5 = r1.a     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lcr r5 = r5.c     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            r6 = 0
            r4[r6] = r5     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            java.lang.String r5 = "ResultsPageProducer"
            java.lang.String r6 = "Unexpected feed type: %s"
            r3.b((java.lang.String) r5, (java.lang.String) r6, (java.lang.Object[]) r4)     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            led r3 = new led     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lei r4 = r1.g     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            java.lang.Long r4 = r4.f     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            r3.<init>(r4)     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            throw r3     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
        L_0x0057:
            lcp r3 = r1.a     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lcm r3 = (defpackage.lcm) r3     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lei r4 = r1.g     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lnn r6 = r4.b     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            com.google.android.gms.common.internal.ClientContext r7 = r4.d     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            java.util.Set r8 = r3.a     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            java.lang.String r9 = r1.b     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            com.google.android.gms.drive.DriveSpace r3 = com.google.android.gms.drive.DriveSpace.b     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            java.lang.String r11 = r3.f     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            boolean r13 = r1.c     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            leg r14 = r1.h     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lei r3 = r1.g     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lnk r15 = r3.h     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            r10 = 0
            r12 = 0
            lno r3 = r6.a(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            r17 = r2
            goto L_0x020f
        L_0x007b:
            lcp r3 = r1.a     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lct r3 = (defpackage.lct) r3     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lei r4 = r1.g     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lnn r6 = r4.b     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            com.google.android.gms.common.internal.ClientContext r7 = r4.d     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            java.util.Set r8 = r4.e     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            java.lang.String r9 = r1.b     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            java.lang.String r10 = r3.a     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            java.lang.String r11 = r3.b     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            java.lang.String r12 = r3.d     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            boolean r13 = r1.c     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            leg r14 = r1.h     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lnk r15 = r4.h     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lno r3 = r6.a(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            r17 = r2
            goto L_0x020f
        L_0x009d:
            lcp r3 = r1.a     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lco r3 = (defpackage.lco) r3     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lei r4 = r1.g     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lnn r6 = r4.b     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            com.google.android.gms.common.internal.ClientContext r7 = r4.d     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            java.lang.String r9 = r1.b     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            boolean r3 = r3.a     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            boolean r13 = r1.c     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            leg r14 = r1.h     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lnk r15 = r4.h     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            if (r3 == 0) goto L_0x00b7
            java.lang.String r3 = defpackage.lnn.b     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            r10 = r3
            goto L_0x00ba
        L_0x00b7:
            java.lang.String r3 = defpackage.lnn.c     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            r10 = r3
        L_0x00ba:
            r8 = 0
            com.google.android.gms.drive.DriveSpace r3 = com.google.android.gms.drive.DriveSpace.a     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            java.lang.String r11 = r3.f     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            r12 = 0
            r16 = 2823(0xb07, float:3.956E-42)
            lno r3 = r6.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            r17 = r2
            goto L_0x020f
        L_0x00ca:
            lcp r3 = r1.a     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lcn r3 = (defpackage.lcn) r3     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lei r6 = r1.g     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lnn r7 = r6.b     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            com.google.android.gms.common.internal.ClientContext r14 = r6.d     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            java.util.Set r8 = r3.b     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            java.lang.String r9 = r1.b     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            long r10 = r3.a     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            boolean r12 = r1.c     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            leg r13 = r1.h     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            lnk r3 = r6.h     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            defpackage.iva.a((java.lang.Object) r13)     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            boolean r6 = defpackage.lnn.a((com.google.android.gms.common.internal.ClientContext) r14)     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            defpackage.iva.a((boolean) r6)     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            r6 = 2826(0xb0a, float:3.96E-42)
            lns r6 = r7.a((com.google.android.gms.common.internal.ClientContext) r14, (int) r6)     // Catch:{ eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa, VolleyError -> 0x0275 }
            iyu r15 = new iyu     // Catch:{ VolleyError -> 0x026d, eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa }
            r15.<init>()     // Catch:{ VolleyError -> 0x026d, eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa }
            java.lang.Class<com.google.android.gms.drive.internal.model.ChangeList> r5 = com.google.android.gms.drive.internal.model.ChangeList.class
            java.lang.String r5 = defpackage.lnn.a((java.lang.Class) r5, (boolean) r4)     // Catch:{ VolleyError -> 0x026d, eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa }
            r15.a((java.lang.String) r5)     // Catch:{ VolleyError -> 0x026d, eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ VolleyError -> 0x026d, eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa }
            java.lang.Boolean r5 = r3.e     // Catch:{ VolleyError -> 0x026d, eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa }
            java.lang.String r7 = r7.a((java.util.Set) r8)     // Catch:{ VolleyError -> 0x026d, eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa }
            r8 = 100
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ VolleyError -> 0x026d, eif -> 0x02c3, InterruptedException -> 0x02c1, led -> 0x02bf, ExecutionException -> 0x02aa }
            r17 = r2
            java.lang.Boolean r2 = r3.d     // Catch:{ VolleyError -> 0x026b, eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa }
            java.lang.Boolean r1 = r3.c     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            java.lang.String r18 = r3.a()     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            agvx r19 = defpackage.jzq.av     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            java.lang.Object r19 = r19.c()     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            java.lang.Boolean r19 = (java.lang.Boolean) r19     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            boolean r19 = r19.booleanValue()     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            if (r19 == 0) goto L_0x0129
            java.lang.String r19 = com.google.android.gms.drive.DriveSpace.e     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            goto L_0x012b
        L_0x0129:
            r19 = 0
        L_0x012b:
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            java.lang.Integer r3 = r3.b     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            r20 = r13
            java.lang.String r13 = "changes"
            r11.<init>(r13)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            r15.a((java.lang.StringBuilder) r11)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            java.lang.String r13 = "allProperties"
            java.lang.String r15 = java.lang.String.valueOf(r4)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            defpackage.iyv.a((java.lang.StringBuilder) r11, (java.lang.String) r13, (java.lang.String) r15)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            if (r5 == 0) goto L_0x0151
            java.lang.String r13 = "errorRecovery"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            defpackage.iyv.a((java.lang.StringBuilder) r11, (java.lang.String) r13, (java.lang.String) r5)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
        L_0x0151:
            if (r7 != 0) goto L_0x0154
            goto L_0x015d
        L_0x0154:
            java.lang.String r5 = "fileScopeAppIds"
            java.lang.String r7 = defpackage.iyv.a(r7)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            defpackage.iyv.a((java.lang.StringBuilder) r11, (java.lang.String) r5, (java.lang.String) r7)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
        L_0x015d:
            java.lang.String r5 = "includeDeleted"
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            defpackage.iyv.a((java.lang.StringBuilder) r11, (java.lang.String) r5, (java.lang.String) r7)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            java.lang.String r5 = "includeSubscribed"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            defpackage.iyv.a((java.lang.StringBuilder) r11, (java.lang.String) r5, (java.lang.String) r4)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            java.lang.String r4 = "maxResults"
            java.lang.String r5 = java.lang.String.valueOf(r8)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            defpackage.iyv.a((java.lang.StringBuilder) r11, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            if (r2 == 0) goto L_0x0183
            java.lang.String r4 = "mutationPrecondition"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            defpackage.iyv.a((java.lang.StringBuilder) r11, (java.lang.String) r4, (java.lang.String) r2)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
        L_0x0183:
            if (r1 == 0) goto L_0x018e
            java.lang.String r2 = "openDrive"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            defpackage.iyv.a((java.lang.StringBuilder) r11, (java.lang.String) r2, (java.lang.String) r1)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
        L_0x018e:
            if (r9 == 0) goto L_0x0199
            java.lang.String r1 = "pageToken"
            java.lang.String r2 = defpackage.iyv.a(r9)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            defpackage.iyv.a((java.lang.StringBuilder) r11, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
        L_0x0199:
            if (r18 == 0) goto L_0x01a4
            java.lang.String r1 = "reason"
            java.lang.String r2 = defpackage.iyv.a(r18)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            defpackage.iyv.a((java.lang.StringBuilder) r11, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
        L_0x01a4:
            if (r19 == 0) goto L_0x01af
            java.lang.String r1 = "spaces"
            java.lang.String r2 = defpackage.iyv.a(r19)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            defpackage.iyv.a((java.lang.StringBuilder) r11, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
        L_0x01af:
            java.lang.String r1 = "startChangeId"
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            defpackage.iyv.a((java.lang.StringBuilder) r11, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            if (r3 == 0) goto L_0x01c3
            java.lang.String r1 = "syncType"
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            defpackage.iyv.a((java.lang.StringBuilder) r11, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
        L_0x01c3:
            java.lang.String r10 = r11.toString()     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            java.lang.Class<com.google.android.gms.drive.internal.model.ChangeList> r11 = com.google.android.gms.drive.internal.model.ChangeList.class
            r8 = r6
            r9 = r14
            r13 = r20
            jag r1 = r8.a((com.google.android.gms.common.internal.ClientContext) r9, (java.lang.String) r10, (java.lang.Class) r11, (boolean) r12, (defpackage.leg) r13)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            com.google.android.gms.drive.internal.model.ChangeList r1 = (com.google.android.gms.drive.internal.model.ChangeList) r1     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            r2.<init>()     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            java.util.List r3 = r1.b     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
        L_0x01de:
            boolean r4 = r3.hasNext()     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            if (r4 == 0) goto L_0x0202
            java.lang.Object r4 = r3.next()     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            com.google.android.gms.drive.internal.model.Change r4 = (com.google.android.gms.drive.internal.model.Change) r4     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            boolean r5 = r4.b     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            if (r5 == 0) goto L_0x01f6
            lnq r5 = new lnq     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            java.lang.String r4 = r4.d     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            r5.<init>(r4)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            goto L_0x01fe
        L_0x01f6:
            lnl r5 = new lnl     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            com.google.android.gms.drive.internal.model.File r4 = r4.c     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            r6 = 0
            r5.<init>(r4, r14, r6)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
        L_0x01fe:
            r2.add(r5)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            goto L_0x01de
        L_0x0202:
            lno r3 = new lno     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            java.lang.String r4 = r1.d     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            long r5 = r1.c     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
            r3.<init>(r2, r4, r1)     // Catch:{ VolleyError -> 0x0267, eif -> 0x0263, InterruptedException -> 0x0261, led -> 0x025f, ExecutionException -> 0x025b }
        L_0x020f:
            r1 = r21
            aosh r2 = r1.d     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            r2.get()     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            lei r2 = r1.g     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            int r4 = r2.j     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            java.util.List r5 = r3.a     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            int r5 = r5.size()     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            int r4 = r4 + r5
            r2.j = r4     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            java.util.concurrent.BlockingQueue r6 = r2.c     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            int r7 = r2.g     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            defpackage.iva.a((java.lang.Object) r3)     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            lej r8 = new lej     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            r9 = 0
            r8.<init>(r7, r3, r9, r9)     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            r6.offer(r8, r9, r3)     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            long r8 = r2.i     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            long r6 = r6 - r4
            long r8 = r8 + r6
            r2.i = r8     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            aosh r2 = r1.e     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            r3 = 0
            r2.b((java.lang.Object) r3)     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            return
        L_0x024f:
            r0 = move-exception
            goto L_0x0278
        L_0x0251:
            r0 = move-exception
            goto L_0x0256
        L_0x0253:
            r0 = move-exception
            goto L_0x0256
        L_0x0255:
            r0 = move-exception
        L_0x0256:
            r2 = r0
            r4 = r17
            goto L_0x02c6
        L_0x025b:
            r0 = move-exception
            r1 = r21
            goto L_0x02ab
        L_0x025f:
            r0 = move-exception
            goto L_0x0264
        L_0x0261:
            r0 = move-exception
            goto L_0x0264
        L_0x0263:
            r0 = move-exception
        L_0x0264:
            r1 = r21
            goto L_0x0256
        L_0x0267:
            r0 = move-exception
            r1 = r21
            goto L_0x0270
        L_0x026b:
            r0 = move-exception
            goto L_0x0270
        L_0x026d:
            r0 = move-exception
            r17 = r2
        L_0x0270:
            r2 = r0
            defpackage.lry.a((com.android.volley.VolleyError) r2)     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
            throw r2     // Catch:{ eif -> 0x0255, InterruptedException -> 0x0253, led -> 0x0251, ExecutionException -> 0x02aa, VolleyError -> 0x024f }
        L_0x0275:
            r0 = move-exception
            r17 = r2
        L_0x0278:
            r2 = r0
            ith r3 = defpackage.lei.a
            r4 = r17
            r3.c(r4)
            com.android.volley.NetworkResponse r3 = r2.networkResponse
            if (r3 != 0) goto L_0x0285
            goto L_0x029f
        L_0x0285:
            int r3 = r3.statusCode
            r4 = 400(0x190, float:5.6E-43)
            if (r3 != r4) goto L_0x029f
            led r2 = new led
            lei r3 = r1.g
            java.lang.Long r3 = r3.f
            r2.<init>(r3)
            aosh r3 = r1.f
            r3.a((java.lang.Throwable) r2)
            aosh r3 = r1.e
            r3.a((java.lang.Throwable) r2)
            return
        L_0x029f:
            aosh r3 = r1.f
            r3.a((java.lang.Throwable) r2)
            aosh r3 = r1.e
            r3.a((java.lang.Throwable) r2)
            return
        L_0x02aa:
            r0 = move-exception
        L_0x02ab:
            r2 = r0
            aosh r3 = r1.f
            java.lang.Throwable r4 = r2.getCause()
            r3.a((java.lang.Throwable) r4)
            aosh r3 = r1.e
            java.lang.Throwable r2 = r2.getCause()
            r3.a((java.lang.Throwable) r2)
            return
        L_0x02bf:
            r0 = move-exception
            goto L_0x02c4
        L_0x02c1:
            r0 = move-exception
            goto L_0x02c4
        L_0x02c3:
            r0 = move-exception
        L_0x02c4:
            r4 = r2
            r2 = r0
        L_0x02c6:
            ith r3 = defpackage.lei.a
            r3.c(r4)
            aosh r3 = r1.f
            r3.a((java.lang.Throwable) r2)
            aosh r3 = r1.e
            r3.a((java.lang.Throwable) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.leh.run():void");
    }
}
