package defpackage;

import java.util.concurrent.Future;

/* renamed from: abos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class abos {
    private final int a;
    private final int b;
    private final float c;

    public abos(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i);

    /* access modifiers changed from: protected */
    public abstract Future a();

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if ((r3 instanceof com.android.volley.NetworkError) == false) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b() {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            int r2 = r11.b
            if (r1 >= r2) goto L_0x0094
            java.util.concurrent.Future r2 = r11.a()
            java.lang.Object r0 = r2.get()     // Catch:{ ExecutionException -> 0x0037, InterruptedException -> 0x000f }
            return r0
        L_0x000f:
            r1 = move-exception
            iwd r2 = defpackage.abot.b
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 23
            r5.<init>(r4)
            java.lang.String r4 = "Operation interrupted: "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.d(r3, r1, r0)
            goto L_0x0094
        L_0x0037:
            r2 = move-exception
            java.lang.Throwable r3 = r2.getCause()
            if (r3 == 0) goto L_0x0094
            boolean r4 = r3 instanceof defpackage.augd
            if (r4 != 0) goto L_0x0085
            boolean r4 = r3 instanceof com.android.volley.NoConnectionError
            if (r4 == 0) goto L_0x006e
            int r3 = r11.a
            float r4 = r11.c
            int r5 = r11.b
            int r6 = r1 + 1
            long r7 = (long) r3
            double r7 = (double) r7
            double r3 = (double) r4
            double r9 = (double) r1
            double r3 = java.lang.Math.pow(r3, r9)     // Catch:{ InterruptedException -> 0x0060 }
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r3
            long r3 = (long) r7
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x0060 }
            goto L_0x006a
        L_0x0060:
            r1 = move-exception
            iwd r3 = defpackage.abot.b
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r7 = "Wait interrupted."
            r3.a(r7, r1, r4)
        L_0x006a:
            if (r6 >= r5) goto L_0x0076
            r1 = r6
            goto L_0x0002
        L_0x006e:
            boolean r1 = r3 instanceof com.android.volley.TimeoutError
            if (r1 != 0) goto L_0x0076
            boolean r1 = r3 instanceof com.android.volley.NetworkError
            if (r1 == 0) goto L_0x0094
        L_0x0076:
            iwd r1 = defpackage.abot.b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "Network error calling exchange_session_checkpoints"
            r1.e(r3, r2, r0)
            r0 = 3
            java.lang.Object r0 = r11.a(r0)
            return r0
        L_0x0085:
            iwd r1 = defpackage.abot.b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "Failed to parse protobuf from server."
            r1.e(r3, r2, r0)
            r0 = 2
            java.lang.Object r0 = r11.a(r0)
            return r0
        L_0x0094:
            r0 = 1
            java.lang.Object r0 = r11.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abos.b():java.lang.Object");
    }
}
