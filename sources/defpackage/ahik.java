package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ahik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahik {
    public static final anhq a = anhq.a("ahik");
    public final Context b;
    public final aoru c;
    public final AtomicReference d = new AtomicReference();
    public boolean e;

    public ahik(Context context, aoru aoru) {
        this.b = context;
        this.c = aoru;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ defpackage.ou a() {
        /*
            r10 = this;
            java.lang.String r0 = "ahik"
            java.lang.String r1 = "a"
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r3 = 0
            android.content.Context r4 = r10.b     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            r5 = 2131886173(0x7f12005d, float:1.9406917E38)
            java.io.InputStream r4 = r4.openRawResource(r5)     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            aujt r5 = defpackage.aujt.b     // Catch:{ IOException -> 0x0024 }
            r6 = 7
            java.lang.Object r5 = r5.c(r6)     // Catch:{ IOException -> 0x0024 }
            auef r5 = (defpackage.auef) r5     // Catch:{ IOException -> 0x0024 }
            java.lang.Object r5 = r5.a((java.io.InputStream) r4)     // Catch:{ IOException -> 0x0024 }
            aujt r5 = (defpackage.aujt) r5     // Catch:{ IOException -> 0x0024 }
            goto L_0x0046
        L_0x0024:
            r5 = move-exception
            goto L_0x002c
        L_0x0026:
            r0 = move-exception
            goto L_0x00c3
        L_0x0029:
            r4 = move-exception
            r5 = r4
            r4 = r3
        L_0x002c:
            anhq r6 = a     // Catch:{ all -> 0x00c1 }
            anie r6 = r6.b()     // Catch:{ all -> 0x00c1 }
            anhn r6 = (defpackage.anhn) r6     // Catch:{ all -> 0x00c1 }
            r6.a((java.lang.Throwable) r5)     // Catch:{ all -> 0x00c1 }
            r5 = 98
            anie r0 = r6.a((java.lang.String) r0, (java.lang.String) r1, (int) r5, (java.lang.String) r2)     // Catch:{ all -> 0x00c1 }
            anhn r0 = (defpackage.anhn) r0     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = "Error reading config, using defaults."
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x00c1 }
            aujt r5 = defpackage.aujt.b     // Catch:{ all -> 0x00c1 }
        L_0x0046:
            defpackage.anmt.a((java.io.InputStream) r4)
            audr r0 = r5.a
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            ou r1 = new ou
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0060:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00c0
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.getValue()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0085
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0086
        L_0x0085:
            r2 = r4
        L_0x0086:
            char[] r4 = r4.toCharArray()
            int r5 = r4.length
            r6 = 0
            r7 = r3
        L_0x008d:
            if (r6 >= r5) goto L_0x00bd
            char r8 = r4[r6]
            if (r7 == 0) goto L_0x00a2
            ou r9 = r7.b
            if (r9 == 0) goto L_0x0098
            goto L_0x009f
        L_0x0098:
            ou r9 = new ou
            r9.<init>()
            r7.b = r9
        L_0x009f:
            ou r7 = r7.b
            goto L_0x00a3
        L_0x00a2:
            r7 = r1
        L_0x00a3:
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            java.lang.Object r9 = r7.get(r8)
            ahij r9 = (defpackage.ahij) r9
            if (r9 != 0) goto L_0x00b8
            ahij r9 = new ahij
            r9.<init>()
            r7.put(r8, r9)
            goto L_0x00b9
        L_0x00b8:
        L_0x00b9:
            r7 = r9
            int r6 = r6 + 1
            goto L_0x008d
        L_0x00bd:
            r7.a = r2
            goto L_0x0060
        L_0x00c0:
            return r1
        L_0x00c1:
            r0 = move-exception
            r3 = r4
        L_0x00c3:
            defpackage.anmt.a((java.io.InputStream) r3)
            goto L_0x00c8
        L_0x00c7:
            throw r0
        L_0x00c8:
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahik.a():ou");
    }
}
