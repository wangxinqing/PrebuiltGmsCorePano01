package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ahii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahii implements Callable {
    private final ahik a;

    public ahii(ahik ahik) {
        this.a = ahik;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r10 = this;
            ahik r0 = r10.a
            java.lang.String r1 = "ahik"
            java.lang.String r2 = "a"
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r4 = 0
            android.content.Context r0 = r0.b     // Catch:{ IOException -> 0x002c, all -> 0x0028 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IOException -> 0x002c, all -> 0x0028 }
            r5 = 2131886173(0x7f12005d, float:1.9406917E38)
            java.io.InputStream r0 = r0.openRawResource(r5)     // Catch:{ IOException -> 0x002c, all -> 0x0028 }
            aujt r5 = defpackage.aujt.b     // Catch:{ IOException -> 0x0026 }
            r6 = 7
            java.lang.Object r5 = r5.c(r6)     // Catch:{ IOException -> 0x0026 }
            auef r5 = (defpackage.auef) r5     // Catch:{ IOException -> 0x0026 }
            java.lang.Object r5 = r5.a((java.io.InputStream) r0)     // Catch:{ IOException -> 0x0026 }
            aujt r5 = (defpackage.aujt) r5     // Catch:{ IOException -> 0x0026 }
            goto L_0x0049
        L_0x0026:
            r5 = move-exception
            goto L_0x002f
        L_0x0028:
            r0 = move-exception
            r1 = r0
            goto L_0x00c6
        L_0x002c:
            r0 = move-exception
            r5 = r0
            r0 = r4
        L_0x002f:
            anhq r6 = defpackage.ahik.a     // Catch:{ all -> 0x00c4 }
            anie r6 = r6.b()     // Catch:{ all -> 0x00c4 }
            anhn r6 = (defpackage.anhn) r6     // Catch:{ all -> 0x00c4 }
            r6.a((java.lang.Throwable) r5)     // Catch:{ all -> 0x00c4 }
            r5 = 98
            anie r1 = r6.a((java.lang.String) r1, (java.lang.String) r2, (int) r5, (java.lang.String) r3)     // Catch:{ all -> 0x00c4 }
            anhn r1 = (defpackage.anhn) r1     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = "Error reading config, using defaults."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x00c4 }
            aujt r5 = defpackage.aujt.b     // Catch:{ all -> 0x00c4 }
        L_0x0049:
            defpackage.anmt.a((java.io.InputStream) r0)
            audr r0 = r5.a
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            ou r1 = new ou
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0063:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00c3
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r2.getValue()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0088
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0089
        L_0x0088:
            r2 = r3
        L_0x0089:
            char[] r3 = r3.toCharArray()
            int r5 = r3.length
            r6 = 0
            r7 = r4
        L_0x0090:
            if (r6 >= r5) goto L_0x00c0
            char r8 = r3[r6]
            if (r7 == 0) goto L_0x00a5
            ou r9 = r7.b
            if (r9 == 0) goto L_0x009b
            goto L_0x00a2
        L_0x009b:
            ou r9 = new ou
            r9.<init>()
            r7.b = r9
        L_0x00a2:
            ou r7 = r7.b
            goto L_0x00a6
        L_0x00a5:
            r7 = r1
        L_0x00a6:
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            java.lang.Object r9 = r7.get(r8)
            ahij r9 = (defpackage.ahij) r9
            if (r9 != 0) goto L_0x00bb
            ahij r9 = new ahij
            r9.<init>()
            r7.put(r8, r9)
            goto L_0x00bc
        L_0x00bb:
        L_0x00bc:
            r7 = r9
            int r6 = r6 + 1
            goto L_0x0090
        L_0x00c0:
            r7.a = r2
            goto L_0x0063
        L_0x00c3:
            return r1
        L_0x00c4:
            r1 = move-exception
            r4 = r0
        L_0x00c6:
            defpackage.anmt.a((java.io.InputStream) r4)
            goto L_0x00cb
        L_0x00ca:
            throw r1
        L_0x00cb:
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahii.call():java.lang.Object");
    }
}
