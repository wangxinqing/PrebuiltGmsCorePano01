package defpackage;

/* renamed from: xdp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xdp {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: xaq} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.icf a(defpackage.icc r9, defpackage.wln r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            if (r11 == 0) goto L_0x0043
            ibg r0 = defpackage.wlt.d
            ibo r0 = r9.a((defpackage.ibg) r0)
            xbi r0 = (defpackage.xbi) r0
            java.util.HashMap r1 = r0.w
            monitor-enter(r1)
            java.util.HashMap r2 = r0.w     // Catch:{ all -> 0x0040 }
            boolean r2 = r2.containsKey(r10)     // Catch:{ all -> 0x0040 }
            if (r2 != 0) goto L_0x0026
            xaq r2 = new xaq     // Catch:{ all -> 0x0040 }
            ige r3 = r9.a((java.lang.Object) r10)     // Catch:{ all -> 0x0040 }
            r2.<init>(r3)     // Catch:{ all -> 0x0040 }
            java.util.HashMap r0 = r0.w     // Catch:{ all -> 0x0040 }
            r0.put(r10, r2)     // Catch:{ all -> 0x0040 }
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            r5 = r2
            goto L_0x0031
        L_0x0026:
            java.util.HashMap r0 = r0.w     // Catch:{ all -> 0x0040 }
            java.lang.Object r10 = r0.get(r10)     // Catch:{ all -> 0x0040 }
            r2 = r10
            xaq r2 = (defpackage.xaq) r2     // Catch:{ all -> 0x0040 }
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            r5 = r2
        L_0x0031:
            xdn r10 = new xdn
            r3 = r10
            r4 = r9
            r6 = r11
            r7 = r12
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            idf r9 = r9.a((defpackage.idf) r10)
            return r9
        L_0x0040:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            throw r9
        L_0x0043:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "account must not be null"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xdp.a(icc, wln, java.lang.String, java.lang.String, int):icf");
    }

    public static final void a(icc icc, wln wln) {
        icc.a((idf) new xdo(icc, wln));
    }
}
