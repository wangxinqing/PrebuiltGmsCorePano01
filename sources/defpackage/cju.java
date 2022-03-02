package defpackage;

/* renamed from: cju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cju {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v59 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02f6 A[Catch:{ auda -> 0x044e }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x031a A[Catch:{ auda -> 0x044e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.contextmanager.internal.WriteBatchImpl a(defpackage.bsz r21, java.util.List r22, defpackage.atpr r23, int r24) {
        /*
            com.google.android.gms.contextmanager.internal.WriteBatchImpl r1 = defpackage.juc.b()
            cjt r2 = new cjt
            r0 = r23
            r2.<init>(r0)
            java.util.Iterator r3 = r22.iterator()
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0012:
            boolean r0 = r3.hasNext()
            java.lang.String r10 = "cju"
            java.lang.String r11 = "a"
            java.lang.String r12 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            if (r0 == 0) goto L_0x04c5
            java.lang.Object r0 = r3.next()
            auay r0 = (defpackage.auay) r0
            aubs r14 = defpackage.aubs.c()     // Catch:{ auda -> 0x04a1 }
            atjl r15 = defpackage.atjl.k     // Catch:{ auda -> 0x04a1 }
            aubc r0 = r0.h()     // Catch:{ auda -> 0x0496 }
            r8 = 4
            java.lang.Object r9 = r15.c(r8)     // Catch:{ auda -> 0x0496 }
            aucj r9 = (defpackage.aucj) r9     // Catch:{ auda -> 0x0496 }
            aueh r15 = defpackage.aueh.a     // Catch:{ IOException -> 0x0473, RuntimeException -> 0x045b }
            aueq r15 = r15.a((java.lang.Object) r9)     // Catch:{ IOException -> 0x0473, RuntimeException -> 0x045b }
            aubd r13 = defpackage.aubd.a((defpackage.aubc) r0)     // Catch:{ IOException -> 0x0473, RuntimeException -> 0x045b }
            r15.a(r9, r13, r14)     // Catch:{ IOException -> 0x0473, RuntimeException -> 0x045b }
            r15.d(r9)     // Catch:{ IOException -> 0x0473, RuntimeException -> 0x045b }
            r0.a((int) r5)     // Catch:{ auda -> 0x0451 }
            defpackage.aucj.b((defpackage.aucj) r9)     // Catch:{ auda -> 0x04a1 }
            atjl r9 = (defpackage.atjl) r9     // Catch:{ auda -> 0x04a1 }
            com.google.android.gms.contextmanager.ContextData r0 = new com.google.android.gms.contextmanager.ContextData     // Catch:{ auda -> 0x04a1 }
            r0.<init>((defpackage.atjl) r9)     // Catch:{ auda -> 0x04a1 }
            int r13 = r0.m()     // Catch:{ auda -> 0x04a1 }
            atjv r14 = r0.h()     // Catch:{ auda -> 0x04a1 }
            int r15 = r9.e     // Catch:{ auda -> 0x04a1 }
            atjv r15 = defpackage.atjv.a(r15)     // Catch:{ auda -> 0x04a1 }
            if (r15 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            atjv r15 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x04a1 }
        L_0x0065:
            atjv r8 = defpackage.atjv.CONTEXT_DELTA     // Catch:{ auda -> 0x04a1 }
            if (r15 != r8) goto L_0x03a6
            atjm r8 = r9.h     // Catch:{ auda -> 0x039d }
            if (r8 != 0) goto L_0x006f
            atjm r8 = defpackage.atjm.a     // Catch:{ auda -> 0x04a1 }
        L_0x006f:
            auci r15 = defpackage.atsc.f     // Catch:{ auda -> 0x039d }
            r8.a(r15)     // Catch:{ auda -> 0x039d }
            aubx r8 = r8.m     // Catch:{ auda -> 0x039d }
            auch r15 = r15.d     // Catch:{ auda -> 0x039d }
            boolean r8 = r8.a((defpackage.auch) r15)     // Catch:{ auda -> 0x039d }
            if (r8 == 0) goto L_0x037f
            atjm r8 = r9.h     // Catch:{ auda -> 0x039d }
            if (r8 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            atjm r8 = defpackage.atjm.a     // Catch:{ auda -> 0x039d }
        L_0x0085:
            auci r15 = defpackage.atsc.f     // Catch:{ auda -> 0x039d }
            r8.a(r15)     // Catch:{ auda -> 0x039d }
            aubx r8 = r8.m     // Catch:{ auda -> 0x039d }
            auch r4 = r15.d     // Catch:{ auda -> 0x039d }
            java.lang.Object r4 = r8.b((defpackage.auch) r4)     // Catch:{ auda -> 0x039d }
            if (r4 != 0) goto L_0x0097
            java.lang.Object r4 = r15.b     // Catch:{ auda -> 0x04a1 }
            goto L_0x009a
        L_0x0097:
            r15.a(r4)     // Catch:{ auda -> 0x039d }
        L_0x009a:
            atsc r4 = (defpackage.atsc) r4     // Catch:{ auda -> 0x039d }
            jjg r8 = defpackage.bxk.a     // Catch:{ auda -> 0x039d }
            anie r8 = r8.d()     // Catch:{ auda -> 0x039d }
            anih r8 = (defpackage.anih) r8     // Catch:{ auda -> 0x039d }
            r15 = 130(0x82, float:1.82E-43)
            anie r8 = r8.a((java.lang.String) r10, (java.lang.String) r11, (int) r15, (java.lang.String) r12)     // Catch:{ auda -> 0x039d }
            anih r8 = (defpackage.anih) r8     // Catch:{ auda -> 0x039d }
            java.lang.String r15 = "[CloudContextWriter] Handling delta context for context name = %s"
            int r5 = r4.a     // Catch:{ auda -> 0x039d }
            atjv r5 = defpackage.atjv.a(r5)     // Catch:{ auda -> 0x039d }
            if (r5 == 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            atjv r5 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x039d }
        L_0x00b9:
            r8.a((java.lang.String) r15, (java.lang.Object) r5)     // Catch:{ auda -> 0x039d }
            jut r5 = r0.j()     // Catch:{ auda -> 0x039d }
            java.lang.String r0 = "cjw"
            boolean r8 = com.google.android.gms.libs.vcdiff.VcDiffDecoder.a     // Catch:{ auda -> 0x039d }
            if (r8 != 0) goto L_0x00e7
            jjg r5 = defpackage.bxk.a     // Catch:{ auda -> 0x04a1 }
            anie r5 = r5.b()     // Catch:{ auda -> 0x04a1 }
            anih r5 = (defpackage.anih) r5     // Catch:{ auda -> 0x04a1 }
            r8 = 47
            anie r0 = r5.a((java.lang.String) r0, (java.lang.String) r11, (int) r8, (java.lang.String) r12)     // Catch:{ auda -> 0x04a1 }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x04a1 }
            java.lang.String r5 = "[ContextDeltaHandler] VcDiff decoding library is not initialized!!!!"
            r0.a((java.lang.String) r5)     // Catch:{ auda -> 0x04a1 }
            r16 = r3
            r17 = r6
            r20 = r9
            r19 = r14
            r0 = 0
            r9 = 0
            goto L_0x02f4
        L_0x00e7:
            auay r8 = r4.c     // Catch:{ auda -> 0x039d }
            byte[] r8 = r8.k()     // Catch:{ auda -> 0x039d }
            if (r8 != 0) goto L_0x00fa
            r16 = r3
            r17 = r6
            r20 = r9
            r19 = r14
            r9 = 0
            goto L_0x02d4
        L_0x00fa:
            int r15 = r8.length     // Catch:{ auda -> 0x039d }
            if (r15 <= 0) goto L_0x02cb
            atpr r15 = r4.b     // Catch:{ auda -> 0x039d }
            if (r15 == 0) goto L_0x0102
            goto L_0x0104
        L_0x0102:
            atpr r15 = defpackage.atpr.b     // Catch:{ auda -> 0x039d }
        L_0x0104:
            r16 = r3
            int r3 = r4.a     // Catch:{ auda -> 0x02c8 }
            atjv r3 = defpackage.atjv.a(r3)     // Catch:{ auda -> 0x02c8 }
            if (r3 != 0) goto L_0x0116
            atjv r3 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x0111 }
            goto L_0x0116
        L_0x0111:
            r0 = move-exception
            r4 = r24
            goto L_0x04a6
        L_0x0116:
            if (r15 == 0) goto L_0x0146
            r17 = r6
            aucx r6 = r15.a     // Catch:{ auda -> 0x044e }
            int r6 = r6.size()     // Catch:{ auda -> 0x044e }
            if (r6 == 0) goto L_0x0148
            aucx r6 = r15.a     // Catch:{ auda -> 0x044e }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ auda -> 0x044e }
        L_0x0128:
            boolean r15 = r6.hasNext()     // Catch:{ auda -> 0x044e }
            if (r15 == 0) goto L_0x0148
            java.lang.Object r15 = r6.next()     // Catch:{ auda -> 0x044e }
            atpx r15 = (defpackage.atpx) r15     // Catch:{ auda -> 0x044e }
            r18 = r6
            int r6 = r15.b     // Catch:{ auda -> 0x044e }
            atjv r6 = defpackage.atjv.a(r6)     // Catch:{ auda -> 0x044e }
            if (r6 != 0) goto L_0x0140
            atjv r6 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x044e }
        L_0x0140:
            if (r6 != r3) goto L_0x0143
            goto L_0x0149
        L_0x0143:
            r6 = r18
            goto L_0x0128
        L_0x0146:
            r17 = r6
        L_0x0148:
            r15 = 0
        L_0x0149:
            r3 = 64
            if (r15 != 0) goto L_0x0172
            jjg r5 = defpackage.bxk.a     // Catch:{ auda -> 0x044e }
            anie r5 = r5.b()     // Catch:{ auda -> 0x044e }
            anih r5 = (defpackage.anih) r5     // Catch:{ auda -> 0x044e }
            anie r0 = r5.a((java.lang.String) r0, (java.lang.String) r11, (int) r3, (java.lang.String) r12)     // Catch:{ auda -> 0x044e }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x044e }
            java.lang.String r3 = "[ContextDeltaHandler] Received invalid delta context sync token for context = %s"
            int r5 = r4.a     // Catch:{ auda -> 0x044e }
            atjv r5 = defpackage.atjv.a(r5)     // Catch:{ auda -> 0x044e }
            if (r5 != 0) goto L_0x0167
            atjv r5 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x044e }
        L_0x0167:
            r0.a((java.lang.String) r3, (java.lang.Object) r5)     // Catch:{ auda -> 0x044e }
            r20 = r9
            r19 = r14
            r0 = 0
            r9 = 0
            goto L_0x02f4
        L_0x0172:
            jtm r6 = new jtm     // Catch:{ auda -> 0x044e }
            r6.<init>()     // Catch:{ auda -> 0x044e }
            int r3 = r15.b     // Catch:{ auda -> 0x044e }
            atjv r3 = defpackage.atjv.a(r3)     // Catch:{ auda -> 0x044e }
            if (r3 == 0) goto L_0x0180
            goto L_0x0182
        L_0x0180:
            atjv r3 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x044e }
        L_0x0182:
            int r3 = r3.bA     // Catch:{ auda -> 0x044e }
            r19 = r14
            long r14 = r15.c     // Catch:{ auda -> 0x044e }
            long r14 = defpackage.bvl.a((long) r14)     // Catch:{ auda -> 0x044e }
            r20 = r9
            juu r9 = new juu     // Catch:{ auda -> 0x044e }
            r9.<init>()     // Catch:{ auda -> 0x044e }
            r9.a(r14, r14)     // Catch:{ auda -> 0x044e }
            com.google.android.gms.contextmanager.internal.TimeFilterImpl r9 = r9.a()     // Catch:{ auda -> 0x044e }
            r6.a(r3, r9)     // Catch:{ auda -> 0x044e }
            jtn r3 = r6.a()     // Catch:{ auda -> 0x044e }
            cjd r6 = defpackage.cbi.p()     // Catch:{ auda -> 0x044e }
            java.lang.String r9 = "ContextDeltaHandler"
            r14 = r21
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r9 = defpackage.cbi.a(r14, r9)     // Catch:{ auda -> 0x044e }
            com.google.android.gms.contextmanager.internal.ContextDataFilterImpl r3 = (com.google.android.gms.contextmanager.internal.ContextDataFilterImpl) r3     // Catch:{ auda -> 0x044e }
            cjb r3 = r6.a((com.google.android.gms.contextmanager.internal.ContextDataFilterImpl) r3, (com.google.android.gms.contextmanager.internal.ContextManagerClientInfo) r9)     // Catch:{ auda -> 0x044e }
            java.util.ArrayList r3 = r3.b     // Catch:{ auda -> 0x044e }
            int r6 = r3.size()     // Catch:{ auda -> 0x044e }
            if (r6 <= 0) goto L_0x01c3
            r6 = 0
            java.lang.Object r3 = r3.get(r6)     // Catch:{ auda -> 0x044e }
            com.google.android.gms.contextmanager.ContextData r3 = (com.google.android.gms.contextmanager.ContextData) r3     // Catch:{ auda -> 0x044e }
            goto L_0x01c4
        L_0x01c3:
            r3 = 0
        L_0x01c4:
            if (r3 != 0) goto L_0x01e9
            jjg r3 = defpackage.bxk.a     // Catch:{ auda -> 0x044e }
            anie r3 = r3.b()     // Catch:{ auda -> 0x044e }
            anih r3 = (defpackage.anih) r3     // Catch:{ auda -> 0x044e }
            r5 = 73
            anie r0 = r3.a((java.lang.String) r0, (java.lang.String) r11, (int) r5, (java.lang.String) r12)     // Catch:{ auda -> 0x044e }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x044e }
            java.lang.String r3 = "[ContextDeltaHandler] No existing data for context name = %s"
            int r5 = r4.a     // Catch:{ auda -> 0x044e }
            atjv r5 = defpackage.atjv.a(r5)     // Catch:{ auda -> 0x044e }
            if (r5 != 0) goto L_0x01e2
            atjv r5 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x044e }
        L_0x01e2:
            r0.a((java.lang.String) r3, (java.lang.Object) r5)     // Catch:{ auda -> 0x044e }
            r0 = 0
            r9 = 0
            goto L_0x02f4
        L_0x01e9:
            byte[] r0 = r3.k()     // Catch:{ auda -> 0x044e }
            byte[] r0 = com.google.android.gms.libs.vcdiff.VcDiffDecoder.nativeDecoder(r0, r8)     // Catch:{ auda -> 0x044e }
            if (r0 == 0) goto L_0x02c5
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ auda -> 0x044e }
            int r9 = r0.length     // Catch:{ auda -> 0x044e }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ auda -> 0x044e }
            r15 = 0
            r8[r15] = r9     // Catch:{ auda -> 0x044e }
            jti r8 = new jti     // Catch:{ auda -> 0x044e }
            int r9 = r3.f()     // Catch:{ auda -> 0x044e }
            int r15 = r3.g()     // Catch:{ auda -> 0x044e }
            int r6 = r3.i()     // Catch:{ auda -> 0x044e }
            r8.<init>(r9, r15, r6)     // Catch:{ auda -> 0x044e }
            int r6 = r4.d     // Catch:{ auda -> 0x044e }
            int r6 = r6 << 3
            r6 = r6 | 2
            defpackage.iva.a((java.lang.Object) r0)     // Catch:{ auda -> 0x044e }
            int r9 = defpackage.aubk.i(r6)     // Catch:{ auda -> 0x044e }
            int r15 = defpackage.aubk.d((byte[]) r0)     // Catch:{ auda -> 0x044e }
            int r9 = r9 + r15
            byte[] r9 = new byte[r9]     // Catch:{ auda -> 0x044e }
            aubk r15 = defpackage.aubk.a((byte[]) r9)     // Catch:{ auda -> 0x044e }
            r15.d((int) r6)     // Catch:{ IOException -> 0x02a1 }
            r15.c((byte[]) r0)     // Catch:{ IOException -> 0x02a1 }
            aubc r0 = defpackage.aubc.a((byte[]) r9)     // Catch:{ IOException -> 0x02a1 }
            aucd r6 = r8.a     // Catch:{ IOException -> 0x02a1 }
            aubs r9 = defpackage.aubs.c()     // Catch:{ IOException -> 0x02a1 }
            atjm r15 = defpackage.atjm.a     // Catch:{ IOException -> 0x02a1 }
            r14 = 4
            java.lang.Object r14 = r15.c(r14)     // Catch:{ IOException -> 0x02a1 }
            aucj r14 = (defpackage.aucj) r14     // Catch:{ IOException -> 0x02a1 }
            aueh r15 = defpackage.aueh.a     // Catch:{ IOException -> 0x0284, RuntimeException -> 0x0272 }
            aueq r15 = r15.a((java.lang.Object) r14)     // Catch:{ IOException -> 0x0284, RuntimeException -> 0x0272 }
            aubd r0 = defpackage.aubd.a((defpackage.aubc) r0)     // Catch:{ IOException -> 0x0284, RuntimeException -> 0x0272 }
            r15.a(r14, r0, r9)     // Catch:{ IOException -> 0x0284, RuntimeException -> 0x0272 }
            r15.d(r14)     // Catch:{ IOException -> 0x0284, RuntimeException -> 0x0272 }
            defpackage.aucj.b((defpackage.aucj) r14)     // Catch:{ IOException -> 0x02a1 }
            atjm r14 = (defpackage.atjm) r14     // Catch:{ IOException -> 0x02a1 }
            boolean r0 = r6.c     // Catch:{ IOException -> 0x02a1 }
            if (r0 != 0) goto L_0x025b
            r9 = 0
            goto L_0x0261
        L_0x025b:
            r6.c()     // Catch:{ IOException -> 0x02a1 }
            r9 = 0
            r6.c = r9     // Catch:{ IOException -> 0x029f }
        L_0x0261:
            aucj r0 = r6.b     // Catch:{ IOException -> 0x029f }
            atjl r0 = (defpackage.atjl) r0     // Catch:{ IOException -> 0x029f }
            r14.getClass()     // Catch:{ IOException -> 0x029f }
            r0.h = r14     // Catch:{ IOException -> 0x029f }
            int r6 = r0.a     // Catch:{ IOException -> 0x029f }
            r14 = 64
            r6 = r6 | r14
            r0.a = r6     // Catch:{ IOException -> 0x029f }
            goto L_0x02aa
        L_0x0272:
            r0 = move-exception
            r9 = 0
            java.lang.Throwable r6 = r0.getCause()     // Catch:{ IOException -> 0x029f }
            boolean r6 = r6 instanceof defpackage.auda     // Catch:{ IOException -> 0x029f }
            if (r6 == 0) goto L_0x0283
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ IOException -> 0x029f }
            auda r0 = (defpackage.auda) r0     // Catch:{ IOException -> 0x029f }
            throw r0     // Catch:{ IOException -> 0x029f }
        L_0x0283:
            throw r0     // Catch:{ IOException -> 0x029f }
        L_0x0284:
            r0 = move-exception
            r9 = 0
            java.lang.Throwable r6 = r0.getCause()     // Catch:{ IOException -> 0x029f }
            boolean r6 = r6 instanceof defpackage.auda     // Catch:{ IOException -> 0x029f }
            if (r6 != 0) goto L_0x0298
            auda r6 = new auda     // Catch:{ IOException -> 0x029f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ IOException -> 0x029f }
            r6.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x029f }
            throw r6     // Catch:{ IOException -> 0x029f }
        L_0x0298:
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ IOException -> 0x029f }
            auda r0 = (defpackage.auda) r0     // Catch:{ IOException -> 0x029f }
            throw r0     // Catch:{ IOException -> 0x029f }
        L_0x029f:
            r0 = move-exception
            goto L_0x02a3
        L_0x02a1:
            r0 = move-exception
            r9 = 0
        L_0x02a3:
            java.lang.String r6 = "ContextData"
            java.lang.String r14 = "Could not write extension."
            android.util.Log.e(r6, r14, r0)     // Catch:{ auda -> 0x044e }
        L_0x02aa:
            r8.a((defpackage.jut) r5)     // Catch:{ auda -> 0x044e }
            com.google.android.gms.contextmanager.ContextData r0 = r8.a()     // Catch:{ auda -> 0x044e }
            jue r5 = r3.e()     // Catch:{ auda -> 0x044e }
            java.lang.String r5 = r5.c()     // Catch:{ auda -> 0x044e }
            jue r3 = r3.e()     // Catch:{ auda -> 0x044e }
            atjw r3 = r3.a     // Catch:{ auda -> 0x044e }
            java.lang.String r3 = r3.e     // Catch:{ auda -> 0x044e }
            r0.a(r5, r3)     // Catch:{ auda -> 0x044e }
            goto L_0x02f4
        L_0x02c5:
            r9 = 0
            r0 = 0
            goto L_0x02f4
        L_0x02c8:
            r0 = move-exception
            goto L_0x03a0
        L_0x02cb:
            r16 = r3
            r17 = r6
            r20 = r9
            r19 = r14
            r9 = 0
        L_0x02d4:
            jjg r3 = defpackage.bxk.a     // Catch:{ auda -> 0x044e }
            anie r3 = r3.c()     // Catch:{ auda -> 0x044e }
            anih r3 = (defpackage.anih) r3     // Catch:{ auda -> 0x044e }
            r5 = 54
            anie r0 = r3.a((java.lang.String) r0, (java.lang.String) r11, (int) r5, (java.lang.String) r12)     // Catch:{ auda -> 0x044e }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x044e }
            java.lang.String r3 = "[ContextDeltaHandler] Received invalid encoded differential for context = %s"
            int r5 = r4.a     // Catch:{ auda -> 0x044e }
            atjv r5 = defpackage.atjv.a(r5)     // Catch:{ auda -> 0x044e }
            if (r5 != 0) goto L_0x02f0
            atjv r5 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x044e }
        L_0x02f0:
            r0.a((java.lang.String) r3, (java.lang.Object) r5)     // Catch:{ auda -> 0x044e }
            r0 = 0
        L_0x02f4:
            if (r0 == 0) goto L_0x031a
            int r3 = r4.a     // Catch:{ auda -> 0x044e }
            atjv r3 = defpackage.atjv.a(r3)     // Catch:{ auda -> 0x044e }
            if (r3 != 0) goto L_0x0300
            atjv r3 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x044e }
        L_0x0300:
            r5 = 8
            r6 = 0
            a(r3, r5, r6)     // Catch:{ auda -> 0x044e }
            buc r3 = defpackage.cbi.F()     // Catch:{ auda -> 0x044e }
            int r4 = r4.a     // Catch:{ auda -> 0x044e }
            atjv r4 = defpackage.atjv.a(r4)     // Catch:{ auda -> 0x044e }
            if (r4 != 0) goto L_0x0314
            atjv r4 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x044e }
        L_0x0314:
            r3.a((defpackage.atjv) r4, (int) r5, (int) r13)     // Catch:{ auda -> 0x044e }
            r6 = 1
            goto L_0x03b0
        L_0x031a:
            jjg r0 = defpackage.bxk.a     // Catch:{ auda -> 0x044e }
            anie r0 = r0.b()     // Catch:{ auda -> 0x044e }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x044e }
            r3 = 139(0x8b, float:1.95E-43)
            anie r0 = r0.a((java.lang.String) r10, (java.lang.String) r11, (int) r3, (java.lang.String) r12)     // Catch:{ auda -> 0x044e }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x044e }
            java.lang.String r3 = "[CloudContextWriter] failed to decode delta for %s"
            int r5 = r4.a     // Catch:{ auda -> 0x044e }
            atjv r5 = defpackage.atjv.a(r5)     // Catch:{ auda -> 0x044e }
            if (r5 == 0) goto L_0x0335
            goto L_0x0337
        L_0x0335:
            atjv r5 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x044e }
        L_0x0337:
            int r5 = r5.bA     // Catch:{ auda -> 0x044e }
            r0.a((java.lang.String) r3, (int) r5)     // Catch:{ auda -> 0x044e }
            int r0 = r4.a     // Catch:{ auda -> 0x044e }
            atjv r0 = defpackage.atjv.a(r0)     // Catch:{ auda -> 0x044e }
            if (r0 == 0) goto L_0x0345
            goto L_0x0347
        L_0x0345:
            atjv r0 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x044e }
        L_0x0347:
            cce r3 = defpackage.cbi.j()     // Catch:{ auda -> 0x044e }
            int r0 = r0.bA     // Catch:{ auda -> 0x044e }
            r5 = 0
            r3.a(r0, r5)     // Catch:{ auda -> 0x044e }
            int r0 = r4.a     // Catch:{ auda -> 0x0378 }
            atjv r0 = defpackage.atjv.a(r0)     // Catch:{ auda -> 0x0378 }
            if (r0 != 0) goto L_0x035c
            atjv r0 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x0378 }
        L_0x035c:
            r3 = 7
            r5 = 0
            a(r0, r3, r5)     // Catch:{ auda -> 0x0378 }
            buc r0 = defpackage.cbi.F()     // Catch:{ auda -> 0x0378 }
            int r4 = r4.a     // Catch:{ auda -> 0x0378 }
            atjv r4 = defpackage.atjv.a(r4)     // Catch:{ auda -> 0x0378 }
            if (r4 != 0) goto L_0x036f
            atjv r4 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x0378 }
        L_0x036f:
            r0.a((defpackage.atjv) r4, (int) r3, (int) r13)     // Catch:{ auda -> 0x0378 }
            r3 = r16
            r5 = 0
            r6 = 1
            goto L_0x0012
        L_0x0378:
            r0 = move-exception
            r4 = r24
            r5 = r10
            r6 = 1
            goto L_0x04ab
        L_0x037f:
            r16 = r3
            r17 = r6
            r9 = 0
            jjg r0 = defpackage.bxk.a     // Catch:{ auda -> 0x044e }
            anie r0 = r0.b()     // Catch:{ auda -> 0x044e }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x044e }
            r3 = 124(0x7c, float:1.74E-43)
            anie r0 = r0.a((java.lang.String) r10, (java.lang.String) r11, (int) r3, (java.lang.String) r12)     // Catch:{ auda -> 0x044e }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x044e }
            java.lang.String r3 = "[CloudContextWriter] No delta extension!"
            r0.a((java.lang.String) r3)     // Catch:{ auda -> 0x044e }
            r4 = r24
            goto L_0x0443
        L_0x039d:
            r0 = move-exception
            r16 = r3
        L_0x03a0:
            r17 = r6
        L_0x03a2:
            r4 = r24
            goto L_0x04a8
        L_0x03a6:
            r16 = r3
            r17 = r6
            r20 = r9
            r19 = r14
            r9 = 0
            r6 = 0
        L_0x03b0:
            jut r3 = r0.j()     // Catch:{ auda -> 0x044e }
            if (r3 == 0) goto L_0x041d
            jut r4 = defpackage.bvl.a((defpackage.jut) r3)     // Catch:{ auda -> 0x044e }
            if (r4 == 0) goto L_0x03cc
            jti r5 = new jti     // Catch:{ auda -> 0x044e }
            r5.<init>(r0)     // Catch:{ auda -> 0x044e }
            r5.a((defpackage.jut) r4)     // Catch:{ auda -> 0x044e }
            com.google.android.gms.contextmanager.ContextData r0 = r5.a()     // Catch:{ auda -> 0x044e }
            r1.a(r0)     // Catch:{ auda -> 0x044e }
            goto L_0x03cf
        L_0x03cc:
            r1.a(r0)     // Catch:{ auda -> 0x044e }
        L_0x03cf:
            r5 = r19
            atpx r0 = r2.a(r5)     // Catch:{ auda -> 0x044e }
            if (r0 != 0) goto L_0x03ef
            jjg r0 = defpackage.bxk.a     // Catch:{ auda -> 0x044e }
            anie r0 = r0.b()     // Catch:{ auda -> 0x044e }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x044e }
            r8 = 228(0xe4, float:3.2E-43)
            anie r0 = r0.a((java.lang.String) r10, (java.lang.String) r11, (int) r8, (java.lang.String) r12)     // Catch:{ auda -> 0x044e }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x044e }
            java.lang.String r8 = "[CloudContextWriter] Found no sync token for context = %s"
            r0.a((java.lang.String) r8, (java.lang.Object) r5)     // Catch:{ auda -> 0x044e }
            r15 = r10
            goto L_0x03fb
        L_0x03ef:
            cce r8 = defpackage.cbi.j()     // Catch:{ auda -> 0x044e }
            int r14 = r5.bA     // Catch:{ auda -> 0x044e }
            r15 = r10
            long r9 = r0.c     // Catch:{ auda -> 0x0419 }
            r8.a(r14, r9)     // Catch:{ auda -> 0x0419 }
        L_0x03fb:
            if (r4 != 0) goto L_0x03fe
            goto L_0x03ff
        L_0x03fe:
            r3 = r4
        L_0x03ff:
            r4 = r24
            a(r5, r4, r3)     // Catch:{ auda -> 0x044a }
            if (r6 == 0) goto L_0x0407
            goto L_0x0410
        L_0x0407:
            buc r0 = defpackage.cbi.F()     // Catch:{ auda -> 0x044a }
            r3 = 13
            r0.a((defpackage.atjv) r5, (int) r3, (int) r13)     // Catch:{ auda -> 0x044a }
        L_0x0410:
            int r7 = r7 + 1
            r3 = r16
            r6 = r17
            r5 = 0
            goto L_0x0012
        L_0x0419:
            r0 = move-exception
            r4 = r24
            goto L_0x044b
        L_0x041d:
            r4 = r24
            r15 = r10
            jjg r0 = defpackage.bxk.a     // Catch:{ auda -> 0x044a }
            anie r0 = r0.b()     // Catch:{ auda -> 0x044a }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x044a }
            r3 = 172(0xac, float:2.41E-43)
            r5 = r15
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r11, (int) r3, (java.lang.String) r12)     // Catch:{ auda -> 0x049f }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x049f }
            java.lang.String r3 = "[CloudContextWriter] Could not find a valid time for context %s. Cannot proceed"
            r9 = r20
            int r6 = r9.e     // Catch:{ auda -> 0x049f }
            atjv r6 = defpackage.atjv.a(r6)     // Catch:{ auda -> 0x049f }
            if (r6 == 0) goto L_0x043e
            goto L_0x0440
        L_0x043e:
            atjv r6 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x049f }
        L_0x0440:
            r0.a((java.lang.String) r3, (java.lang.Object) r6)     // Catch:{ auda -> 0x049f }
        L_0x0443:
            r3 = r16
            r6 = r17
            r5 = 0
            goto L_0x0012
        L_0x044a:
            r0 = move-exception
        L_0x044b:
            r5 = r15
            goto L_0x04a9
        L_0x044e:
            r0 = move-exception
            goto L_0x03a2
        L_0x0451:
            r0 = move-exception
            r4 = r24
            r16 = r3
            r17 = r6
            r5 = r10
            r3 = r0
            throw r3     // Catch:{ auda -> 0x0494 }
        L_0x045b:
            r0 = move-exception
            r4 = r24
            r16 = r3
            r17 = r6
            r5 = r10
            java.lang.Throwable r3 = r0.getCause()     // Catch:{ auda -> 0x0494 }
            boolean r3 = r3 instanceof defpackage.auda     // Catch:{ auda -> 0x0494 }
            if (r3 == 0) goto L_0x0472
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x0494 }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x0494 }
            throw r0     // Catch:{ auda -> 0x0494 }
        L_0x0472:
            throw r0     // Catch:{ auda -> 0x0494 }
        L_0x0473:
            r0 = move-exception
            r4 = r24
            r16 = r3
            r17 = r6
            r5 = r10
            java.lang.Throwable r3 = r0.getCause()     // Catch:{ auda -> 0x0494 }
            boolean r3 = r3 instanceof defpackage.auda     // Catch:{ auda -> 0x0494 }
            if (r3 != 0) goto L_0x048d
            auda r3 = new auda     // Catch:{ auda -> 0x0494 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ auda -> 0x0494 }
            r3.<init>((java.lang.String) r0)     // Catch:{ auda -> 0x0494 }
            throw r3     // Catch:{ auda -> 0x0494 }
        L_0x048d:
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x0494 }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x0494 }
            throw r0     // Catch:{ auda -> 0x0494 }
        L_0x0494:
            r0 = move-exception
            goto L_0x049e
        L_0x0496:
            r0 = move-exception
            r4 = r24
            r16 = r3
            r17 = r6
            r5 = r10
        L_0x049e:
            throw r0     // Catch:{ auda -> 0x049f }
        L_0x049f:
            r0 = move-exception
            goto L_0x04a9
        L_0x04a1:
            r0 = move-exception
            r4 = r24
            r16 = r3
        L_0x04a6:
            r17 = r6
        L_0x04a8:
            r5 = r10
        L_0x04a9:
            r6 = r17
        L_0x04ab:
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r3 = 194(0xc2, float:2.72E-43)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r11, (int) r3, (java.lang.String) r12)
            anih r0 = (defpackage.anih) r0
            java.lang.String r3 = "[CloudContextWriter] Could not deserialize context data."
            r0.a((java.lang.String) r3)
            r3 = r16
            r5 = 0
            goto L_0x0012
        L_0x04c5:
            r17 = r6
            r5 = r10
            if (r17 == 0) goto L_0x04e8
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r2 = 202(0xca, float:2.83E-43)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r11, (int) r2, (java.lang.String) r12)
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "[CloudContextWriter] Found sync token resets. Scheduling download sync with delay = %s"
            r3 = 0
            r0.a((java.lang.String) r2, (long) r3)
            cjz r0 = defpackage.cbi.z()
            r0.a()
        L_0x04e8:
            if (r7 != 0) goto L_0x04eb
            r1 = 0
        L_0x04eb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cju.a(bsz, java.util.List, atpr, int):com.google.android.gms.contextmanager.internal.WriteBatchImpl");
    }

    private static void a(atjv atjv, int i, jut jut) {
        if (jut != null) {
            long c = jut.a() == 2 ? jut.c() : jut.d();
            buc F = cbi.F();
            long a = cbi.i().a() - c;
            bug bug = F.e;
            if (a < 0) {
                bug.f.a((double) a);
            } else {
                bug.e.a((double) a);
            }
            F.a = true;
        }
        cbi.F().a(atjv, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01bb A[Catch:{ auda -> 0x017f }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01e0 A[SYNTHETIC, Splitter:B:112:0x01e0] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0362 A[Catch:{ auda -> 0x04de }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0386 A[Catch:{ auda -> 0x04de }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(defpackage.bsz r23, defpackage.atpp[] r24, java.util.List r25, defpackage.atpr r26, int r27) {
        /*
            r1 = r23
            r0 = r24
            java.lang.String r2 = "CloudContextWriter"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0057
            int r5 = r0.length
            if (r5 <= 0) goto L_0x0057
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6[r4] = r7
            jtm r6 = new jtm
            r6.<init>()
            r7 = 0
        L_0x001b:
            if (r7 < r5) goto L_0x0033
            jtn r0 = r6.a()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r4] = r0
            cjd r5 = defpackage.cbi.p()
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r6 = defpackage.cbi.a(r1, r2)
            com.google.android.gms.contextmanager.internal.ContextDataFilterImpl r0 = (com.google.android.gms.contextmanager.internal.ContextDataFilterImpl) r0
            r5.b((com.google.android.gms.contextmanager.internal.ContextDataFilterImpl) r0, (com.google.android.gms.contextmanager.internal.ContextManagerClientInfo) r6)
            goto L_0x0057
        L_0x0033:
            r8 = r0[r7]
            java.lang.Object[] r9 = new java.lang.Object[r3]
            int r10 = r8.a
            atjv r10 = defpackage.atjv.a(r10)
            if (r10 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            atjv r10 = defpackage.atjv.UNKNOWN_CONTEXT_NAME
        L_0x0042:
            r9[r4] = r10
            int r8 = r8.a
            atjv r8 = defpackage.atjv.a(r8)
            if (r8 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            atjv r8 = defpackage.atjv.UNKNOWN_CONTEXT_NAME
        L_0x004f:
            int r8 = r8.bA
            r6.a((int) r8)
            int r7 = r7 + 1
            goto L_0x001b
        L_0x0057:
            if (r25 == 0) goto L_0x05c8
            boolean r0 = r25.isEmpty()
            if (r0 != 0) goto L_0x05c8
            com.google.android.gms.contextmanager.internal.WriteBatchImpl r5 = defpackage.juc.b()
            cjt r6 = new cjt
            r0 = r26
            r6.<init>(r0)
            java.util.Iterator r7 = r25.iterator()
            r8 = 0
            r9 = 0
        L_0x0070:
            boolean r0 = r7.hasNext()
            java.lang.String r12 = "cju"
            java.lang.String r13 = "a"
            java.lang.String r14 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            if (r0 == 0) goto L_0x056e
            java.lang.Object r0 = r7.next()
            auay r0 = (defpackage.auay) r0
            aubs r10 = defpackage.aubs.c()     // Catch:{ auda -> 0x0541 }
            atjl r11 = defpackage.atjl.k     // Catch:{ auda -> 0x0541 }
            aubc r0 = r0.h()     // Catch:{ auda -> 0x0532 }
            r15 = 4
            java.lang.Object r11 = r11.c(r15)     // Catch:{ auda -> 0x0532 }
            aucj r11 = (defpackage.aucj) r11     // Catch:{ auda -> 0x0532 }
            aueh r15 = defpackage.aueh.a     // Catch:{ IOException -> 0x050b, RuntimeException -> 0x04ef }
            aueq r15 = r15.a((java.lang.Object) r11)     // Catch:{ IOException -> 0x050b, RuntimeException -> 0x04ef }
            aubd r3 = defpackage.aubd.a((defpackage.aubc) r0)     // Catch:{ IOException -> 0x050b, RuntimeException -> 0x04ef }
            r15.a(r11, r3, r10)     // Catch:{ IOException -> 0x050b, RuntimeException -> 0x04ef }
            r15.d(r11)     // Catch:{ IOException -> 0x050b, RuntimeException -> 0x04ef }
            r0.a((int) r4)     // Catch:{ auda -> 0x04e1 }
            defpackage.aucj.b((defpackage.aucj) r11)     // Catch:{ auda -> 0x0541 }
            atjl r11 = (defpackage.atjl) r11     // Catch:{ auda -> 0x0541 }
            com.google.android.gms.contextmanager.ContextData r0 = new com.google.android.gms.contextmanager.ContextData     // Catch:{ auda -> 0x0541 }
            r0.<init>((defpackage.atjl) r11)     // Catch:{ auda -> 0x0541 }
            int r3 = r0.m()     // Catch:{ auda -> 0x0541 }
            atjv r10 = r0.h()     // Catch:{ auda -> 0x0541 }
            int r15 = r11.e     // Catch:{ auda -> 0x0541 }
            atjv r15 = defpackage.atjv.a(r15)     // Catch:{ auda -> 0x0541 }
            if (r15 == 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            atjv r15 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x0541 }
        L_0x00c3:
            atjv r4 = defpackage.atjv.CONTEXT_DELTA     // Catch:{ auda -> 0x0541 }
            if (r15 != r4) goto L_0x0425
            atjm r4 = r11.h     // Catch:{ auda -> 0x0418 }
            if (r4 != 0) goto L_0x00cd
            atjm r4 = defpackage.atjm.a     // Catch:{ auda -> 0x0541 }
        L_0x00cd:
            auci r15 = defpackage.atsc.f     // Catch:{ auda -> 0x0418 }
            r4.a(r15)     // Catch:{ auda -> 0x0418 }
            aubx r4 = r4.m     // Catch:{ auda -> 0x0418 }
            auch r15 = r15.d     // Catch:{ auda -> 0x0418 }
            boolean r4 = r4.a((defpackage.auch) r15)     // Catch:{ auda -> 0x0418 }
            if (r4 == 0) goto L_0x03f6
            atjm r4 = r11.h     // Catch:{ auda -> 0x0418 }
            if (r4 == 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            atjm r4 = defpackage.atjm.a     // Catch:{ auda -> 0x0418 }
        L_0x00e3:
            auci r15 = defpackage.atsc.f     // Catch:{ auda -> 0x0418 }
            r4.a(r15)     // Catch:{ auda -> 0x0418 }
            aubx r4 = r4.m     // Catch:{ auda -> 0x0418 }
            r16 = r7
            auch r7 = r15.d     // Catch:{ auda -> 0x03f2 }
            java.lang.Object r4 = r4.b((defpackage.auch) r7)     // Catch:{ auda -> 0x03f2 }
            if (r4 != 0) goto L_0x00fe
            java.lang.Object r4 = r15.b     // Catch:{ auda -> 0x00f7 }
            goto L_0x0101
        L_0x00f7:
            r0 = move-exception
            r4 = r27
            r17 = r2
            goto L_0x0548
        L_0x00fe:
            r15.a(r4)     // Catch:{ auda -> 0x03f2 }
        L_0x0101:
            atsc r4 = (defpackage.atsc) r4     // Catch:{ auda -> 0x03f2 }
            jjg r7 = defpackage.bxk.a     // Catch:{ auda -> 0x03f2 }
            anie r7 = r7.d()     // Catch:{ auda -> 0x03f2 }
            anih r7 = (defpackage.anih) r7     // Catch:{ auda -> 0x03f2 }
            r15 = 130(0x82, float:1.82E-43)
            anie r7 = r7.a((java.lang.String) r12, (java.lang.String) r13, (int) r15, (java.lang.String) r14)     // Catch:{ auda -> 0x03f2 }
            anih r7 = (defpackage.anih) r7     // Catch:{ auda -> 0x03f2 }
            java.lang.String r15 = "[CloudContextWriter] Handling delta context for context name = %s"
            r17 = r2
            int r2 = r4.a     // Catch:{ auda -> 0x03f0 }
            atjv r2 = defpackage.atjv.a(r2)     // Catch:{ auda -> 0x03f0 }
            if (r2 == 0) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            atjv r2 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x03f0 }
        L_0x0122:
            r7.a((java.lang.String) r15, (java.lang.Object) r2)     // Catch:{ auda -> 0x03f0 }
            jut r2 = r0.j()     // Catch:{ auda -> 0x03f0 }
            java.lang.String r0 = "cjw"
            boolean r7 = com.google.android.gms.libs.vcdiff.VcDiffDecoder.a     // Catch:{ auda -> 0x03f0 }
            if (r7 != 0) goto L_0x0155
            jjg r2 = defpackage.bxk.a     // Catch:{ auda -> 0x0150 }
            anie r2 = r2.b()     // Catch:{ auda -> 0x0150 }
            anih r2 = (defpackage.anih) r2     // Catch:{ auda -> 0x0150 }
            r7 = 47
            anie r0 = r2.a((java.lang.String) r0, (java.lang.String) r13, (int) r7, (java.lang.String) r14)     // Catch:{ auda -> 0x0150 }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x0150 }
            java.lang.String r2 = "[ContextDeltaHandler] VcDiff decoding library is not initialized!!!!"
            r0.a((java.lang.String) r2)     // Catch:{ auda -> 0x0150 }
            r18 = r8
            r21 = r9
            r22 = r10
            r19 = r11
            r0 = 0
            r11 = 0
            goto L_0x0360
        L_0x0150:
            r0 = move-exception
            r4 = r27
            goto L_0x0548
        L_0x0155:
            auay r7 = r4.c     // Catch:{ auda -> 0x03f0 }
            byte[] r7 = r7.k()     // Catch:{ auda -> 0x03f0 }
            if (r7 != 0) goto L_0x0168
            r18 = r8
            r21 = r9
            r22 = r10
            r19 = r11
            r11 = 0
            goto L_0x0340
        L_0x0168:
            int r15 = r7.length     // Catch:{ auda -> 0x03f0 }
            if (r15 <= 0) goto L_0x0337
            atpr r15 = r4.b     // Catch:{ auda -> 0x03f0 }
            if (r15 == 0) goto L_0x0170
            goto L_0x0172
        L_0x0170:
            atpr r15 = defpackage.atpr.b     // Catch:{ auda -> 0x03f0 }
        L_0x0172:
            r18 = r8
            int r8 = r4.a     // Catch:{ auda -> 0x0334 }
            atjv r8 = defpackage.atjv.a(r8)     // Catch:{ auda -> 0x0334 }
            if (r8 != 0) goto L_0x0184
            atjv r8 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x017f }
            goto L_0x0184
        L_0x017f:
            r0 = move-exception
            r4 = r27
            goto L_0x054a
        L_0x0184:
            if (r15 == 0) goto L_0x01b4
            r19 = r11
            aucx r11 = r15.a     // Catch:{ auda -> 0x017f }
            int r11 = r11.size()     // Catch:{ auda -> 0x017f }
            if (r11 == 0) goto L_0x01b6
            aucx r11 = r15.a     // Catch:{ auda -> 0x017f }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ auda -> 0x017f }
        L_0x0196:
            boolean r15 = r11.hasNext()     // Catch:{ auda -> 0x017f }
            if (r15 == 0) goto L_0x01b6
            java.lang.Object r15 = r11.next()     // Catch:{ auda -> 0x017f }
            atpx r15 = (defpackage.atpx) r15     // Catch:{ auda -> 0x017f }
            r20 = r11
            int r11 = r15.b     // Catch:{ auda -> 0x017f }
            atjv r11 = defpackage.atjv.a(r11)     // Catch:{ auda -> 0x017f }
            if (r11 != 0) goto L_0x01ae
            atjv r11 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x017f }
        L_0x01ae:
            if (r11 != r8) goto L_0x01b1
            goto L_0x01b7
        L_0x01b1:
            r11 = r20
            goto L_0x0196
        L_0x01b4:
            r19 = r11
        L_0x01b6:
            r15 = 0
        L_0x01b7:
            r8 = 64
            if (r15 != 0) goto L_0x01e0
            jjg r2 = defpackage.bxk.a     // Catch:{ auda -> 0x017f }
            anie r2 = r2.b()     // Catch:{ auda -> 0x017f }
            anih r2 = (defpackage.anih) r2     // Catch:{ auda -> 0x017f }
            anie r0 = r2.a((java.lang.String) r0, (java.lang.String) r13, (int) r8, (java.lang.String) r14)     // Catch:{ auda -> 0x017f }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x017f }
            java.lang.String r2 = "[ContextDeltaHandler] Received invalid delta context sync token for context = %s"
            int r7 = r4.a     // Catch:{ auda -> 0x017f }
            atjv r7 = defpackage.atjv.a(r7)     // Catch:{ auda -> 0x017f }
            if (r7 != 0) goto L_0x01d5
            atjv r7 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x017f }
        L_0x01d5:
            r0.a((java.lang.String) r2, (java.lang.Object) r7)     // Catch:{ auda -> 0x017f }
            r21 = r9
            r22 = r10
            r0 = 0
            r11 = 0
            goto L_0x0360
        L_0x01e0:
            jtm r11 = new jtm     // Catch:{ auda -> 0x0334 }
            r11.<init>()     // Catch:{ auda -> 0x0334 }
            int r8 = r15.b     // Catch:{ auda -> 0x0334 }
            atjv r8 = defpackage.atjv.a(r8)     // Catch:{ auda -> 0x0334 }
            if (r8 == 0) goto L_0x01ee
            goto L_0x01f0
        L_0x01ee:
            atjv r8 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x0334 }
        L_0x01f0:
            int r8 = r8.bA     // Catch:{ auda -> 0x0334 }
            r21 = r9
            r22 = r10
            long r9 = r15.c     // Catch:{ auda -> 0x04de }
            long r9 = defpackage.bvl.a((long) r9)     // Catch:{ auda -> 0x04de }
            juu r15 = new juu     // Catch:{ auda -> 0x04de }
            r15.<init>()     // Catch:{ auda -> 0x04de }
            r15.a(r9, r9)     // Catch:{ auda -> 0x04de }
            com.google.android.gms.contextmanager.internal.TimeFilterImpl r9 = r15.a()     // Catch:{ auda -> 0x04de }
            r11.a(r8, r9)     // Catch:{ auda -> 0x04de }
            jtn r8 = r11.a()     // Catch:{ auda -> 0x04de }
            cjd r9 = defpackage.cbi.p()     // Catch:{ auda -> 0x04de }
            java.lang.String r10 = "ContextDeltaHandler"
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r10 = defpackage.cbi.a(r1, r10)     // Catch:{ auda -> 0x04de }
            com.google.android.gms.contextmanager.internal.ContextDataFilterImpl r8 = (com.google.android.gms.contextmanager.internal.ContextDataFilterImpl) r8     // Catch:{ auda -> 0x04de }
            cjb r8 = r9.a((com.google.android.gms.contextmanager.internal.ContextDataFilterImpl) r8, (com.google.android.gms.contextmanager.internal.ContextManagerClientInfo) r10)     // Catch:{ auda -> 0x04de }
            java.util.ArrayList r8 = r8.b     // Catch:{ auda -> 0x04de }
            int r9 = r8.size()     // Catch:{ auda -> 0x04de }
            if (r9 <= 0) goto L_0x022f
            r9 = 0
            java.lang.Object r8 = r8.get(r9)     // Catch:{ auda -> 0x04de }
            com.google.android.gms.contextmanager.ContextData r8 = (com.google.android.gms.contextmanager.ContextData) r8     // Catch:{ auda -> 0x04de }
            goto L_0x0230
        L_0x022f:
            r8 = 0
        L_0x0230:
            if (r8 != 0) goto L_0x0255
            jjg r2 = defpackage.bxk.a     // Catch:{ auda -> 0x04de }
            anie r2 = r2.b()     // Catch:{ auda -> 0x04de }
            anih r2 = (defpackage.anih) r2     // Catch:{ auda -> 0x04de }
            r7 = 73
            anie r0 = r2.a((java.lang.String) r0, (java.lang.String) r13, (int) r7, (java.lang.String) r14)     // Catch:{ auda -> 0x04de }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x04de }
            java.lang.String r2 = "[ContextDeltaHandler] No existing data for context name = %s"
            int r7 = r4.a     // Catch:{ auda -> 0x04de }
            atjv r7 = defpackage.atjv.a(r7)     // Catch:{ auda -> 0x04de }
            if (r7 != 0) goto L_0x024e
            atjv r7 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x04de }
        L_0x024e:
            r0.a((java.lang.String) r2, (java.lang.Object) r7)     // Catch:{ auda -> 0x04de }
            r0 = 0
            r11 = 0
            goto L_0x0360
        L_0x0255:
            byte[] r0 = r8.k()     // Catch:{ auda -> 0x04de }
            byte[] r0 = com.google.android.gms.libs.vcdiff.VcDiffDecoder.nativeDecoder(r0, r7)     // Catch:{ auda -> 0x04de }
            if (r0 == 0) goto L_0x0331
            r9 = 1
            java.lang.Object[] r7 = new java.lang.Object[r9]     // Catch:{ auda -> 0x04de }
            int r10 = r0.length     // Catch:{ auda -> 0x04de }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ auda -> 0x04de }
            r11 = 0
            r7[r11] = r10     // Catch:{ auda -> 0x04de }
            jti r7 = new jti     // Catch:{ auda -> 0x04de }
            int r10 = r8.f()     // Catch:{ auda -> 0x04de }
            int r11 = r8.g()     // Catch:{ auda -> 0x04de }
            int r15 = r8.i()     // Catch:{ auda -> 0x04de }
            r7.<init>(r10, r11, r15)     // Catch:{ auda -> 0x04de }
            int r10 = r4.d     // Catch:{ auda -> 0x04de }
            int r10 = r10 << 3
            r10 = r10 | 2
            defpackage.iva.a((java.lang.Object) r0)     // Catch:{ auda -> 0x04de }
            int r11 = defpackage.aubk.i(r10)     // Catch:{ auda -> 0x04de }
            int r15 = defpackage.aubk.d((byte[]) r0)     // Catch:{ auda -> 0x04de }
            int r11 = r11 + r15
            byte[] r11 = new byte[r11]     // Catch:{ auda -> 0x04de }
            aubk r15 = defpackage.aubk.a((byte[]) r11)     // Catch:{ auda -> 0x04de }
            r15.d((int) r10)     // Catch:{ IOException -> 0x030d }
            r15.c((byte[]) r0)     // Catch:{ IOException -> 0x030d }
            aubc r0 = defpackage.aubc.a((byte[]) r11)     // Catch:{ IOException -> 0x030d }
            aucd r10 = r7.a     // Catch:{ IOException -> 0x030d }
            aubs r11 = defpackage.aubs.c()     // Catch:{ IOException -> 0x030d }
            atjm r15 = defpackage.atjm.a     // Catch:{ IOException -> 0x030d }
            r9 = 4
            java.lang.Object r9 = r15.c(r9)     // Catch:{ IOException -> 0x030d }
            aucj r9 = (defpackage.aucj) r9     // Catch:{ IOException -> 0x030d }
            aueh r15 = defpackage.aueh.a     // Catch:{ IOException -> 0x02f0, RuntimeException -> 0x02de }
            aueq r15 = r15.a((java.lang.Object) r9)     // Catch:{ IOException -> 0x02f0, RuntimeException -> 0x02de }
            aubd r0 = defpackage.aubd.a((defpackage.aubc) r0)     // Catch:{ IOException -> 0x02f0, RuntimeException -> 0x02de }
            r15.a(r9, r0, r11)     // Catch:{ IOException -> 0x02f0, RuntimeException -> 0x02de }
            r15.d(r9)     // Catch:{ IOException -> 0x02f0, RuntimeException -> 0x02de }
            defpackage.aucj.b((defpackage.aucj) r9)     // Catch:{ IOException -> 0x030d }
            atjm r9 = (defpackage.atjm) r9     // Catch:{ IOException -> 0x030d }
            boolean r0 = r10.c     // Catch:{ IOException -> 0x030d }
            if (r0 != 0) goto L_0x02c7
            r11 = 0
            goto L_0x02cd
        L_0x02c7:
            r10.c()     // Catch:{ IOException -> 0x030d }
            r11 = 0
            r10.c = r11     // Catch:{ IOException -> 0x030b }
        L_0x02cd:
            aucj r0 = r10.b     // Catch:{ IOException -> 0x030b }
            atjl r0 = (defpackage.atjl) r0     // Catch:{ IOException -> 0x030b }
            r9.getClass()     // Catch:{ IOException -> 0x030b }
            r0.h = r9     // Catch:{ IOException -> 0x030b }
            int r9 = r0.a     // Catch:{ IOException -> 0x030b }
            r10 = 64
            r9 = r9 | r10
            r0.a = r9     // Catch:{ IOException -> 0x030b }
            goto L_0x0316
        L_0x02de:
            r0 = move-exception
            r11 = 0
            java.lang.Throwable r9 = r0.getCause()     // Catch:{ IOException -> 0x030b }
            boolean r9 = r9 instanceof defpackage.auda     // Catch:{ IOException -> 0x030b }
            if (r9 == 0) goto L_0x02ef
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ IOException -> 0x030b }
            auda r0 = (defpackage.auda) r0     // Catch:{ IOException -> 0x030b }
            throw r0     // Catch:{ IOException -> 0x030b }
        L_0x02ef:
            throw r0     // Catch:{ IOException -> 0x030b }
        L_0x02f0:
            r0 = move-exception
            r11 = 0
            java.lang.Throwable r9 = r0.getCause()     // Catch:{ IOException -> 0x030b }
            boolean r9 = r9 instanceof defpackage.auda     // Catch:{ IOException -> 0x030b }
            if (r9 != 0) goto L_0x0304
            auda r9 = new auda     // Catch:{ IOException -> 0x030b }
            java.lang.String r0 = r0.getMessage()     // Catch:{ IOException -> 0x030b }
            r9.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x030b }
            throw r9     // Catch:{ IOException -> 0x030b }
        L_0x0304:
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ IOException -> 0x030b }
            auda r0 = (defpackage.auda) r0     // Catch:{ IOException -> 0x030b }
            throw r0     // Catch:{ IOException -> 0x030b }
        L_0x030b:
            r0 = move-exception
            goto L_0x030f
        L_0x030d:
            r0 = move-exception
            r11 = 0
        L_0x030f:
            java.lang.String r9 = "ContextData"
            java.lang.String r10 = "Could not write extension."
            android.util.Log.e(r9, r10, r0)     // Catch:{ auda -> 0x04de }
        L_0x0316:
            r7.a((defpackage.jut) r2)     // Catch:{ auda -> 0x04de }
            com.google.android.gms.contextmanager.ContextData r0 = r7.a()     // Catch:{ auda -> 0x04de }
            jue r2 = r8.e()     // Catch:{ auda -> 0x04de }
            java.lang.String r2 = r2.c()     // Catch:{ auda -> 0x04de }
            jue r7 = r8.e()     // Catch:{ auda -> 0x04de }
            atjw r7 = r7.a     // Catch:{ auda -> 0x04de }
            java.lang.String r7 = r7.e     // Catch:{ auda -> 0x04de }
            r0.a(r2, r7)     // Catch:{ auda -> 0x04de }
            goto L_0x0360
        L_0x0331:
            r11 = 0
            r0 = 0
            goto L_0x0360
        L_0x0334:
            r0 = move-exception
            goto L_0x041f
        L_0x0337:
            r18 = r8
            r21 = r9
            r22 = r10
            r19 = r11
            r11 = 0
        L_0x0340:
            jjg r2 = defpackage.bxk.a     // Catch:{ auda -> 0x04de }
            anie r2 = r2.c()     // Catch:{ auda -> 0x04de }
            anih r2 = (defpackage.anih) r2     // Catch:{ auda -> 0x04de }
            r7 = 54
            anie r0 = r2.a((java.lang.String) r0, (java.lang.String) r13, (int) r7, (java.lang.String) r14)     // Catch:{ auda -> 0x04de }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x04de }
            java.lang.String r2 = "[ContextDeltaHandler] Received invalid encoded differential for context = %s"
            int r7 = r4.a     // Catch:{ auda -> 0x04de }
            atjv r7 = defpackage.atjv.a(r7)     // Catch:{ auda -> 0x04de }
            if (r7 != 0) goto L_0x035c
            atjv r7 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x04de }
        L_0x035c:
            r0.a((java.lang.String) r2, (java.lang.Object) r7)     // Catch:{ auda -> 0x04de }
            r0 = 0
        L_0x0360:
            if (r0 == 0) goto L_0x0386
            int r2 = r4.a     // Catch:{ auda -> 0x04de }
            atjv r2 = defpackage.atjv.a(r2)     // Catch:{ auda -> 0x04de }
            if (r2 != 0) goto L_0x036c
            atjv r2 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x04de }
        L_0x036c:
            r7 = 8
            r8 = 0
            a(r2, r7, r8)     // Catch:{ auda -> 0x04de }
            buc r2 = defpackage.cbi.F()     // Catch:{ auda -> 0x04de }
            int r4 = r4.a     // Catch:{ auda -> 0x04de }
            atjv r4 = defpackage.atjv.a(r4)     // Catch:{ auda -> 0x04de }
            if (r4 != 0) goto L_0x0380
            atjv r4 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x04de }
        L_0x0380:
            r2.a((defpackage.atjv) r4, (int) r7, (int) r3)     // Catch:{ auda -> 0x04de }
            r9 = 1
            goto L_0x0433
        L_0x0386:
            jjg r0 = defpackage.bxk.a     // Catch:{ auda -> 0x04de }
            anie r0 = r0.b()     // Catch:{ auda -> 0x04de }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x04de }
            r2 = 139(0x8b, float:1.95E-43)
            anie r0 = r0.a((java.lang.String) r12, (java.lang.String) r13, (int) r2, (java.lang.String) r14)     // Catch:{ auda -> 0x04de }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x04de }
            java.lang.String r2 = "[CloudContextWriter] failed to decode delta for %s"
            int r7 = r4.a     // Catch:{ auda -> 0x04de }
            atjv r7 = defpackage.atjv.a(r7)     // Catch:{ auda -> 0x04de }
            if (r7 == 0) goto L_0x03a1
            goto L_0x03a3
        L_0x03a1:
            atjv r7 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x04de }
        L_0x03a3:
            int r7 = r7.bA     // Catch:{ auda -> 0x04de }
            r0.a((java.lang.String) r2, (int) r7)     // Catch:{ auda -> 0x04de }
            int r0 = r4.a     // Catch:{ auda -> 0x04de }
            atjv r0 = defpackage.atjv.a(r0)     // Catch:{ auda -> 0x04de }
            if (r0 == 0) goto L_0x03b1
            goto L_0x03b3
        L_0x03b1:
            atjv r0 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x04de }
        L_0x03b3:
            cce r2 = defpackage.cbi.j()     // Catch:{ auda -> 0x04de }
            int r0 = r0.bA     // Catch:{ auda -> 0x04de }
            r7 = 0
            r2.a(r0, r7)     // Catch:{ auda -> 0x04de }
            int r0 = r4.a     // Catch:{ auda -> 0x03e9 }
            atjv r0 = defpackage.atjv.a(r0)     // Catch:{ auda -> 0x03e9 }
            if (r0 != 0) goto L_0x03c8
            atjv r0 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x03e9 }
        L_0x03c8:
            r2 = 7
            r7 = 0
            a(r0, r2, r7)     // Catch:{ auda -> 0x03e9 }
            buc r0 = defpackage.cbi.F()     // Catch:{ auda -> 0x03e9 }
            int r4 = r4.a     // Catch:{ auda -> 0x03e9 }
            atjv r4 = defpackage.atjv.a(r4)     // Catch:{ auda -> 0x03e9 }
            if (r4 != 0) goto L_0x03db
            atjv r4 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x03e9 }
        L_0x03db:
            r0.a((defpackage.atjv) r4, (int) r2, (int) r3)     // Catch:{ auda -> 0x03e9 }
            r7 = r16
            r2 = r17
            r9 = r21
            r3 = 1
            r4 = 0
            r8 = 1
            goto L_0x0070
        L_0x03e9:
            r0 = move-exception
            r4 = r27
            r3 = r12
            r8 = 1
            goto L_0x054f
        L_0x03f0:
            r0 = move-exception
            goto L_0x041d
        L_0x03f2:
            r0 = move-exception
            r17 = r2
            goto L_0x041d
        L_0x03f6:
            r17 = r2
            r16 = r7
            r18 = r8
            r21 = r9
            r11 = 0
            jjg r0 = defpackage.bxk.a     // Catch:{ auda -> 0x04de }
            anie r0 = r0.b()     // Catch:{ auda -> 0x04de }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x04de }
            r2 = 124(0x7c, float:1.74E-43)
            anie r0 = r0.a((java.lang.String) r12, (java.lang.String) r13, (int) r2, (java.lang.String) r14)     // Catch:{ auda -> 0x04de }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x04de }
            java.lang.String r2 = "[CloudContextWriter] No delta extension!"
            r0.a((java.lang.String) r2)     // Catch:{ auda -> 0x04de }
            r4 = r27
            goto L_0x04cd
        L_0x0418:
            r0 = move-exception
            r17 = r2
            r16 = r7
        L_0x041d:
            r18 = r8
        L_0x041f:
            r21 = r9
        L_0x0421:
            r4 = r27
            goto L_0x054c
        L_0x0425:
            r17 = r2
            r16 = r7
            r18 = r8
            r21 = r9
            r22 = r10
            r19 = r11
            r11 = 0
            r9 = 0
        L_0x0433:
            jut r2 = r0.j()     // Catch:{ auda -> 0x04de }
            if (r2 == 0) goto L_0x04a5
            jut r4 = defpackage.bvl.a((defpackage.jut) r2)     // Catch:{ auda -> 0x04de }
            if (r4 == 0) goto L_0x044f
            jti r7 = new jti     // Catch:{ auda -> 0x04de }
            r7.<init>(r0)     // Catch:{ auda -> 0x04de }
            r7.a((defpackage.jut) r4)     // Catch:{ auda -> 0x04de }
            com.google.android.gms.contextmanager.ContextData r0 = r7.a()     // Catch:{ auda -> 0x04de }
            r5.a(r0)     // Catch:{ auda -> 0x04de }
            goto L_0x0452
        L_0x044f:
            r5.a(r0)     // Catch:{ auda -> 0x04de }
        L_0x0452:
            r7 = r22
            atpx r0 = r6.a(r7)     // Catch:{ auda -> 0x04de }
            if (r0 != 0) goto L_0x0473
            jjg r0 = defpackage.bxk.a     // Catch:{ auda -> 0x04de }
            anie r0 = r0.b()     // Catch:{ auda -> 0x04de }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x04de }
            r8 = 228(0xe4, float:3.2E-43)
            anie r0 = r0.a((java.lang.String) r12, (java.lang.String) r13, (int) r8, (java.lang.String) r14)     // Catch:{ auda -> 0x04de }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x04de }
            java.lang.String r8 = "[CloudContextWriter] Found no sync token for context = %s"
            r0.a((java.lang.String) r8, (java.lang.Object) r7)     // Catch:{ auda -> 0x04de }
            r26 = r12
            goto L_0x0480
        L_0x0473:
            cce r8 = defpackage.cbi.j()     // Catch:{ auda -> 0x04de }
            int r10 = r7.bA     // Catch:{ auda -> 0x04de }
            r26 = r12
            long r11 = r0.c     // Catch:{ auda -> 0x04a1 }
            r8.a(r10, r11)     // Catch:{ auda -> 0x04a1 }
        L_0x0480:
            if (r4 != 0) goto L_0x0483
            goto L_0x0484
        L_0x0483:
            r2 = r4
        L_0x0484:
            r4 = r27
            a(r7, r4, r2)     // Catch:{ auda -> 0x04d9 }
            if (r9 == 0) goto L_0x048c
            goto L_0x0495
        L_0x048c:
            buc r0 = defpackage.cbi.F()     // Catch:{ auda -> 0x04d9 }
            r2 = 13
            r0.a((defpackage.atjv) r7, (int) r2, (int) r3)     // Catch:{ auda -> 0x04d9 }
        L_0x0495:
            int r9 = r21 + 1
            r7 = r16
            r2 = r17
            r8 = r18
            r3 = 1
            r4 = 0
            goto L_0x0070
        L_0x04a1:
            r0 = move-exception
            r4 = r27
            goto L_0x04da
        L_0x04a5:
            r4 = r27
            r26 = r12
            jjg r0 = defpackage.bxk.a     // Catch:{ auda -> 0x04d9 }
            anie r0 = r0.b()     // Catch:{ auda -> 0x04d9 }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x04d9 }
            r2 = 172(0xac, float:2.41E-43)
            r3 = r26
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r13, (int) r2, (java.lang.String) r14)     // Catch:{ auda -> 0x053f }
            anih r0 = (defpackage.anih) r0     // Catch:{ auda -> 0x053f }
            java.lang.String r2 = "[CloudContextWriter] Could not find a valid time for context %s. Cannot proceed"
            r11 = r19
            int r7 = r11.e     // Catch:{ auda -> 0x053f }
            atjv r7 = defpackage.atjv.a(r7)     // Catch:{ auda -> 0x053f }
            if (r7 == 0) goto L_0x04c8
            goto L_0x04ca
        L_0x04c8:
            atjv r7 = defpackage.atjv.UNKNOWN_CONTEXT_NAME     // Catch:{ auda -> 0x053f }
        L_0x04ca:
            r0.a((java.lang.String) r2, (java.lang.Object) r7)     // Catch:{ auda -> 0x053f }
        L_0x04cd:
            r7 = r16
            r2 = r17
            r8 = r18
            r9 = r21
            r3 = 1
            r4 = 0
            goto L_0x0070
        L_0x04d9:
            r0 = move-exception
        L_0x04da:
            r3 = r26
            goto L_0x054d
        L_0x04de:
            r0 = move-exception
            goto L_0x0421
        L_0x04e1:
            r0 = move-exception
            r4 = r27
            r17 = r2
            r16 = r7
            r18 = r8
            r21 = r9
            r3 = r12
            r2 = r0
            throw r2     // Catch:{ auda -> 0x0530 }
        L_0x04ef:
            r0 = move-exception
            r4 = r27
            r17 = r2
            r16 = r7
            r18 = r8
            r21 = r9
            r3 = r12
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ auda -> 0x0530 }
            boolean r2 = r2 instanceof defpackage.auda     // Catch:{ auda -> 0x0530 }
            if (r2 == 0) goto L_0x050a
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x0530 }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x0530 }
            throw r0     // Catch:{ auda -> 0x0530 }
        L_0x050a:
            throw r0     // Catch:{ auda -> 0x0530 }
        L_0x050b:
            r0 = move-exception
            r4 = r27
            r17 = r2
            r16 = r7
            r18 = r8
            r21 = r9
            r3 = r12
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ auda -> 0x0530 }
            boolean r2 = r2 instanceof defpackage.auda     // Catch:{ auda -> 0x0530 }
            if (r2 != 0) goto L_0x0529
            auda r2 = new auda     // Catch:{ auda -> 0x0530 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ auda -> 0x0530 }
            r2.<init>((java.lang.String) r0)     // Catch:{ auda -> 0x0530 }
            throw r2     // Catch:{ auda -> 0x0530 }
        L_0x0529:
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x0530 }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x0530 }
            throw r0     // Catch:{ auda -> 0x0530 }
        L_0x0530:
            r0 = move-exception
            goto L_0x053e
        L_0x0532:
            r0 = move-exception
            r4 = r27
            r17 = r2
            r16 = r7
            r18 = r8
            r21 = r9
            r3 = r12
        L_0x053e:
            throw r0     // Catch:{ auda -> 0x053f }
        L_0x053f:
            r0 = move-exception
            goto L_0x054d
        L_0x0541:
            r0 = move-exception
            r4 = r27
            r17 = r2
            r16 = r7
        L_0x0548:
            r18 = r8
        L_0x054a:
            r21 = r9
        L_0x054c:
            r3 = r12
        L_0x054d:
            r8 = r18
        L_0x054f:
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r2 = 194(0xc2, float:2.72E-43)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r13, (int) r2, (java.lang.String) r14)
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "[CloudContextWriter] Could not deserialize context data."
            r0.a((java.lang.String) r2)
            r7 = r16
            r2 = r17
            r9 = r21
            r3 = 1
            r4 = 0
            goto L_0x0070
        L_0x056e:
            r17 = r2
            r18 = r8
            r21 = r9
            r3 = r12
            r7 = 0
            if (r18 == 0) goto L_0x0596
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r2 = 202(0xca, float:2.83E-43)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r13, (int) r2, (java.lang.String) r14)
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "[CloudContextWriter] Found sync token resets. Scheduling download sync with delay = %s"
            r8 = 0
            r0.a((java.lang.String) r2, (long) r8)
            cjz r0 = defpackage.cbi.z()
            r0.a()
        L_0x0596:
            if (r21 != 0) goto L_0x059a
            r5 = r7
            goto L_0x059b
        L_0x059a:
        L_0x059b:
            if (r5 == 0) goto L_0x05c8
            java.lang.String r0 = r1.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x05bb
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r1 = 87
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r13, (int) r1, (java.lang.String) r14)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "[CloudContextWriter] Account name is empty."
            r0.a((java.lang.String) r1)
            return
        L_0x05bb:
            cjd r0 = defpackage.cbi.p()
            r2 = r17
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r1 = defpackage.cbi.a(r1, r2)
            r0.a((com.google.android.gms.contextmanager.internal.WriteBatchImpl) r5, (com.google.android.gms.contextmanager.internal.ContextManagerClientInfo) r1)
        L_0x05c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cju.a(bsz, atpp[], java.util.List, atpr, int):void");
    }

    private static void a(cjt cjt, atjv atjv) {
        atpx a = cjt.a(atjv);
        if (a != null) {
            cbi.j().a(atjv.bA, a.c);
        } else {
            ((anih) ((anih) bxk.a.b()).a("cju", "a", 228, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[CloudContextWriter] Found no sync token for context = %s", (Object) atjv);
        }
    }
}
