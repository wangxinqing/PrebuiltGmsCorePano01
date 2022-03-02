package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: afjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afjq extends Exception {
    public final amzy a;

    private afjq(String str, Throwable th, amzy amzy) {
        super(str, th);
        this.a = amzy;
    }

    private static String a(Throwable th, int i) {
        String name = th.getClass().getName();
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 2 + String.valueOf(message).length());
        sb.append(name);
        sb.append(": ");
        sb.append(message);
        String sb2 = sb.toString();
        Throwable cause = th.getCause();
        if (cause == null) {
            return sb2;
        }
        if (i >= 5) {
            return String.valueOf(sb2).concat("\n(...)");
        }
        String a2 = a(cause, i + 1);
        StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 12 + String.valueOf(a2).length());
        sb3.append(sb2);
        sb3.append("\nCaused by: ");
        sb3.append(a2);
        return sb3.toString();
    }

    static Throwable a(Throwable th) {
        Throwable cause = th.getCause();
        return (cause == null || !th.getClass().equals(ExecutionException.class)) ? th : a(cause);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.util.Collection r7, java.lang.String r8, java.lang.Object... r9) {
        /*
            int r0 = r7.size()
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r3 >= r0) goto L_0x0027
            java.lang.Object r4 = r7.get(r3)
            aorr r4 = (defpackage.aorr) r4
            defpackage.aorl.a((java.util.concurrent.Future) r4)     // Catch:{ CancellationException -> 0x0015, ExecutionException -> 0x0013 }
            goto L_0x0024
        L_0x0013:
            r4 = move-exception
            goto L_0x0016
        L_0x0015:
            r4 = move-exception
        L_0x0016:
            if (r2 == 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            amzt r2 = defpackage.amzy.j()
        L_0x001d:
            java.lang.Throwable r4 = a(r4)
            r2.c(r4)
        L_0x0024:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0027:
            if (r2 == 0) goto L_0x00e8
            amzy r7 = r2.a()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r8 = java.lang.String.format(r0, r8, r9)
            afjq r9 = new afjq
            int r0 = r7.size()
            r2 = 1
            if (r0 <= r2) goto L_0x00dd
            int r0 = r7.size()
            java.lang.String r3 = java.lang.String.valueOf(r8)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 34
            r4.<init>(r3)
            r4.append(r8)
            java.lang.String r8 = "\n"
            r4.append(r8)
            r4.append(r0)
            java.lang.String r8 = " failure(s) in total:\n"
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch:{ all -> 0x00bd }
            r0.<init>()     // Catch:{ all -> 0x00bd }
            java.io.PrintWriter r3 = new java.io.PrintWriter     // Catch:{ all -> 0x00b3 }
            r3.<init>(r0)     // Catch:{ all -> 0x00b3 }
            if (r8 == 0) goto L_0x0076
            r3.println(r8)     // Catch:{ all -> 0x0074 }
            r8 = 0
            goto L_0x0077
        L_0x0074:
            r8 = move-exception
            goto L_0x00aa
        L_0x0076:
            r8 = 0
        L_0x0077:
            int r4 = r7.size()     // Catch:{ all -> 0x0074 }
            if (r8 >= r4) goto L_0x009a
            java.lang.Object r4 = r7.get(r8)     // Catch:{ all -> 0x0074 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0074 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0074 }
            int r8 = r8 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0074 }
            r5[r1] = r6     // Catch:{ all -> 0x0074 }
            java.lang.String r6 = "--- Failure %d ----------------------------\n"
            r3.printf(r6, r5)     // Catch:{ all -> 0x0074 }
            java.lang.String r4 = a(r4, r2)     // Catch:{ all -> 0x0074 }
            r3.println(r4)     // Catch:{ all -> 0x0074 }
            goto L_0x0077
        L_0x009a:
            java.lang.String r8 = "-------------------------------------------"
            r3.println(r8)     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x0074 }
            r3.close()     // Catch:{ all -> 0x00b3 }
            r0.close()     // Catch:{ all -> 0x00bd }
            goto L_0x00dd
        L_0x00aa:
            r3.close()     // Catch:{ all -> 0x00ae }
            goto L_0x00b2
        L_0x00ae:
            r2 = move-exception
            defpackage.apev.a((java.lang.Throwable) r8, (java.lang.Throwable) r2)     // Catch:{ all -> 0x00b3 }
        L_0x00b2:
            throw r8     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r8 = move-exception
            r0.close()     // Catch:{ all -> 0x00b8 }
            goto L_0x00bc
        L_0x00b8:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r8, (java.lang.Throwable) r0)     // Catch:{ all -> 0x00bd }
        L_0x00bc:
            throw r8     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r8 = move-exception
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = java.lang.String.valueOf(r8)
            int r0 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r0 = r0 + 40
            r2.<init>(r0)
            java.lang.String r0 = "Failed to build string from throwables: "
            r2.append(r0)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
        L_0x00dd:
            java.lang.Object r0 = r7.get(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r9.<init>(r8, r0, r7)
            throw r9
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afjq.a(java.util.Collection, java.lang.String, java.lang.Object[]):void");
    }
}
