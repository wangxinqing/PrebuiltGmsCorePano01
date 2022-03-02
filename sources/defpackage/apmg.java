package defpackage;

/* renamed from: apmg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apmg extends ihb {
    final /* synthetic */ apmh a;

    public apmg(apmh apmh) {
        this.a = apmh;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: apmh} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a(defpackage.ibf r6, defpackage.acwd r7) {
        /*
            r5 = this;
            apmc r6 = (defpackage.apmc) r6
            android.os.IInterface r6 = r6.x()
            apmt r6 = (defpackage.apmt) r6
            apmf r0 = new apmf
            r0.<init>(r5, r7)
            apmh r1 = r5.a
            com.google.firebase.appindexing.internal.MutateRequest r1 = r1.a
            com.google.firebase.appindexing.internal.CallStatus r6 = r6.a((defpackage.ifu) r0, (com.google.firebase.appindexing.internal.MutateRequest) r1)
            r0 = 2
            if (r6 == 0) goto L_0x001b
            int r6 = r6.d
            goto L_0x001c
        L_0x001b:
            r6 = 2
        L_0x001c:
            r1 = 3
            r2 = 0
            r3 = 1
            r4 = 0
            if (r6 != r1) goto L_0x0062
            r6 = 4
            boolean r6 = defpackage.apmu.a((int) r6)
            if (r6 == 0) goto L_0x0030
            java.lang.String r6 = "FirebaseAppIndex"
            java.lang.String r1 = "Queue was full. API call will be retried."
            android.util.Log.i(r6, r1)
        L_0x0030:
            boolean r6 = r7.b((java.lang.Object) r4)
            if (r6 == 0) goto L_0x0061
            apmh r6 = r5.a
            apmi r6 = r6.c
            java.util.Queue r6 = r6.b
            monitor-enter(r6)
            apmh r7 = r5.a     // Catch:{ all -> 0x005e }
            apmi r7 = r7.c     // Catch:{ all -> 0x005e }
            int r1 = r7.c     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x005a
            java.util.Queue r7 = r7.b     // Catch:{ all -> 0x005e }
            java.lang.Object r7 = r7.peek()     // Catch:{ all -> 0x005e }
            apmh r7 = (defpackage.apmh) r7     // Catch:{ all -> 0x005e }
            apmh r0 = r5.a     // Catch:{ all -> 0x005e }
            if (r7 != r0) goto L_0x0054
            r2 = 1
            goto L_0x0055
        L_0x0054:
        L_0x0055:
            defpackage.iva.a((boolean) r2)     // Catch:{ all -> 0x005e }
            r4 = r7
            goto L_0x005c
        L_0x005a:
            r7.c = r0     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r6)     // Catch:{ all -> 0x005e }
            goto L_0x00be
        L_0x005e:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x005e }
            throw r7
        L_0x0061:
            goto L_0x00be
        L_0x0062:
            if (r6 == r3) goto L_0x008e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 41
            r0.<init>(r1)
            java.lang.String r1 = "API call failed. Status code: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            defpackage.apmu.b(r6)
            boolean r6 = r7.b((java.lang.Object) r4)
            if (r6 == 0) goto L_0x008e
            apmh r6 = r5.a
            acwd r6 = r6.b
            apli r7 = new apli
            java.lang.String r0 = "Indexing error."
            r7.<init>(r0)
            r6.a((java.lang.Exception) r7)
        L_0x008e:
            apmh r6 = r5.a
            apmi r6 = r6.c
            java.util.Queue r6 = r6.b
            monitor-enter(r6)
            apmh r7 = r5.a     // Catch:{ all -> 0x00c4 }
            apmi r7 = r7.c     // Catch:{ all -> 0x00c4 }
            java.util.Queue r7 = r7.b     // Catch:{ all -> 0x00c4 }
            java.lang.Object r7 = r7.poll()     // Catch:{ all -> 0x00c4 }
            apmh r7 = (defpackage.apmh) r7     // Catch:{ all -> 0x00c4 }
            apmh r0 = r5.a     // Catch:{ all -> 0x00c4 }
            if (r7 != r0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r3 = 0
        L_0x00a7:
            defpackage.iva.a((boolean) r3)     // Catch:{ all -> 0x00c4 }
            apmh r7 = r5.a     // Catch:{ all -> 0x00c4 }
            apmi r7 = r7.c     // Catch:{ all -> 0x00c4 }
            java.util.Queue r7 = r7.b     // Catch:{ all -> 0x00c4 }
            java.lang.Object r7 = r7.peek()     // Catch:{ all -> 0x00c4 }
            r4 = r7
            apmh r4 = (defpackage.apmh) r4     // Catch:{ all -> 0x00c4 }
            apmh r7 = r5.a     // Catch:{ all -> 0x00c4 }
            apmi r7 = r7.c     // Catch:{ all -> 0x00c4 }
            r7.c = r2     // Catch:{ all -> 0x00c4 }
            monitor-exit(r6)     // Catch:{ all -> 0x00c4 }
        L_0x00be:
            if (r4 == 0) goto L_0x00c3
            r4.a()
        L_0x00c3:
            return
        L_0x00c4:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00c4 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apmg.a(ibf, acwd):void");
    }
}
