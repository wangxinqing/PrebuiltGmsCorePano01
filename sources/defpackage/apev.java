package defpackage;

import java.io.PrintWriter;

/* renamed from: apev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apev {
    public static final apep a;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "android.os.Build$VERSION"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0017 }
            java.lang.String r2 = "SDK_INT"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ Exception -> 0x0017 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x0017 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0017 }
            r0 = r1
            goto L_0x0024
        L_0x0015:
            r1 = move-exception
            goto L_0x004a
        L_0x0017:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ all -> 0x0015 }
            java.lang.String r3 = "Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception."
            r2.println(r3)     // Catch:{ all -> 0x0015 }
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ all -> 0x0015 }
            r1.printStackTrace(r2)     // Catch:{ all -> 0x0015 }
        L_0x0024:
            if (r0 != 0) goto L_0x0027
            goto L_0x0035
        L_0x0027:
            int r1 = r0.intValue()     // Catch:{ all -> 0x0049 }
            r2 = 19
            if (r1 < r2) goto L_0x0035
            apeu r1 = new apeu     // Catch:{ all -> 0x0049 }
            r1.<init>()     // Catch:{ all -> 0x0049 }
            goto L_0x007f
        L_0x0035:
            java.lang.String r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch:{ all -> 0x0049 }
            if (r1 != 0) goto L_0x0043
            apes r1 = new apes     // Catch:{ all -> 0x0049 }
            r1.<init>()     // Catch:{ all -> 0x0049 }
            goto L_0x007f
        L_0x0043:
            apet r1 = new apet     // Catch:{ all -> 0x0049 }
            r1.<init>()     // Catch:{ all -> 0x0049 }
            goto L_0x007f
        L_0x0049:
            r1 = move-exception
        L_0x004a:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.Class<apet> r3 = defpackage.apet.class
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 133
            r5.<init>(r4)
            java.lang.String r4 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "will be used. The error is: "
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.err
            r1.printStackTrace(r2)
            apet r1 = new apet
            r1.<init>()
        L_0x007f:
            a = r1
            if (r0 == 0) goto L_0x0086
            r0.intValue()
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apev.<clinit>():void");
    }

    public static void a(Throwable th) {
        a.a(th);
    }

    public static void a(Throwable th, PrintWriter printWriter) {
        a.a(th, printWriter);
    }

    public static void a(Throwable th, Throwable th2) {
        a.a(th, th2);
    }
}
