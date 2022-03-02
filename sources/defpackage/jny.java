package defpackage;

/* renamed from: jny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jny extends joo {
    final /* synthetic */ jop a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ joq e;

    public jny(joq joq, jop jop, int i, String str, String str2) {
        this.e = joq;
        this.a = jop;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.common.api.Status r8, com.google.android.gms.config.internal.FetchConfigIpcResponse r9) {
        /*
            r7 = this;
            if (r9 != 0) goto L_0x0003
            goto L_0x0006
        L_0x0003:
            r9.a()
        L_0x0006:
            jop r8 = r7.a     // Catch:{ RemoteException -> 0x0098 }
            com.google.android.gms.common.api.Status r9 = com.google.android.gms.common.api.Status.a     // Catch:{ RemoteException -> 0x0098 }
            joq r0 = r7.e     // Catch:{ RemoteException -> 0x0098 }
            com.google.android.gms.config.ConfigChimeraService r0 = r0.a     // Catch:{ RemoteException -> 0x0098 }
            int r1 = r7.b     // Catch:{ RemoteException -> 0x0098 }
            java.lang.String r2 = r7.c     // Catch:{ RemoteException -> 0x0098 }
            java.lang.String r3 = r7.d     // Catch:{ RemoteException -> 0x0098 }
            boolean r1 = r0.a((int) r1, (java.lang.String) r2)     // Catch:{ RemoteException -> 0x0098 }
            r4 = 0
            if (r1 == 0) goto L_0x0093
            java.lang.Object r1 = r0.a     // Catch:{ RemoteException -> 0x0098 }
            monitor-enter(r1)     // Catch:{ RemoteException -> 0x0098 }
            java.util.Map r5 = r0.b     // Catch:{ all -> 0x0090 }
            if (r5 == 0) goto L_0x008e
            java.lang.Object r5 = r5.get(r2)     // Catch:{ all -> 0x0090 }
            if (r5 == 0) goto L_0x008e
            java.util.Map r5 = r0.b     // Catch:{ all -> 0x0090 }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ all -> 0x0090 }
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x0090 }
            java.lang.String r6 = "configns:p4"
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x0090 }
            if (r5 == 0) goto L_0x008e
            java.util.Map r0 = r0.b     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0090 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = "configns:p4"
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0090 }
            java.util.TreeMap r0 = (java.util.TreeMap) r0     // Catch:{ all -> 0x0090 }
            monitor-exit(r1)     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008d
            int r1 = r3.length()     // Catch:{ RemoteException -> 0x0098 }
            int r1 = r1 + -1
        L_0x0051:
            if (r1 < 0) goto L_0x0081
            char r2 = r3.charAt(r1)     // Catch:{ RemoteException -> 0x0098 }
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r2 >= r5) goto L_0x007e
            r4 = 0
            java.lang.String r1 = r3.substring(r4, r1)     // Catch:{ RemoteException -> 0x0098 }
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ RemoteException -> 0x0098 }
            int r4 = r4.length()     // Catch:{ RemoteException -> 0x0098 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0098 }
            int r4 = r4 + 1
            r5.<init>(r4)     // Catch:{ RemoteException -> 0x0098 }
            r5.append(r1)     // Catch:{ RemoteException -> 0x0098 }
            int r2 = r2 + 1
            char r1 = (char) r2     // Catch:{ RemoteException -> 0x0098 }
            r5.append(r1)     // Catch:{ RemoteException -> 0x0098 }
            java.lang.String r4 = r5.toString()     // Catch:{ RemoteException -> 0x0098 }
            goto L_0x0082
        L_0x007e:
            int r1 = r1 + -1
            goto L_0x0051
        L_0x0081:
        L_0x0082:
            if (r4 == 0) goto L_0x0089
            java.util.SortedMap r4 = r0.subMap(r3, r4)     // Catch:{ RemoteException -> 0x0098 }
            goto L_0x0094
        L_0x0089:
            java.util.SortedMap r4 = r0.tailMap(r3)     // Catch:{ RemoteException -> 0x0098 }
        L_0x008d:
            goto L_0x0094
        L_0x008e:
            monitor-exit(r1)     // Catch:{ all -> 0x0090 }
            goto L_0x0093
        L_0x0090:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0090 }
            throw r8     // Catch:{ RemoteException -> 0x0098 }
        L_0x0093:
        L_0x0094:
            r8.a((com.google.android.gms.common.api.Status) r9, (java.util.Map) r4)     // Catch:{ RemoteException -> 0x0098 }
            return
        L_0x0098:
            r8 = move-exception
            java.lang.String r9 = "ConfigChimeraService"
            java.lang.String r0 = "Exception at callback."
            android.util.Log.e(r9, r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jny.a(com.google.android.gms.common.api.Status, com.google.android.gms.config.internal.FetchConfigIpcResponse):void");
    }
}
