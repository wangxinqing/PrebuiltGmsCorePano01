package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: appg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class appg {
    static final Map a = Collections.synchronizedMap(new HashMap());
    private static final Object b = new Object();
    private static final iwd c = new iwd("FirebaseAuth", "PhoneVerificationSessionManager");

    public static void a(long j) {
        long j2 = 0;
        while (j2 < j) {
            synchronized (a) {
                Iterator it = a.entrySet().iterator();
                while (it.hasNext()) {
                    appf appf = (appf) ((Map.Entry) it.next()).getValue();
                    if (!appf.a()) {
                        appf.c.quit();
                        it.remove();
                    }
                }
            }
            if (a.isEmpty()) {
                break;
            }
            try {
                Thread.sleep(200);
                j2 += 200;
            } catch (InterruptedException e) {
                c.d("Interrupted while waiting for terminating inactive phone auth sessions", new Object[0]);
            }
        }
        if (j2 >= j) {
            c.d(String.format("There are still %d sessions alive after %d milliseconds' wait", new Object[]{Integer.valueOf(a.size()), Long.valueOf(j2)}), new Object[0]);
        }
    }

    private static String b(String... strArr) {
        return TextUtils.join(":", strArr);
    }

    public static void c(String str, String str2) {
        a(str, str2);
    }

    public static void b(String str, String str2) {
        a(str, str2, "enroll");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: appf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(defpackage.aptv r14, android.content.Context r15, java.lang.String r16, defpackage.apte r17, defpackage.aptg r18, java.lang.String r19, long r20, boolean r22, boolean r23) {
        /*
            r0 = r14
            r1 = r19
            defpackage.iva.a((java.lang.Object) r14)
            defpackage.iva.a((java.lang.Object) r16)
            defpackage.iva.a((java.lang.Object) r19)
            defpackage.iva.a((java.lang.Object) r15)
            defpackage.iva.a((java.lang.Object) r17)
            defpackage.iva.a((java.lang.Object) r18)
            boolean r2 = r0 instanceof com.google.firebase.auth.api.model.SendVerificationCodeRequest
            if (r2 != 0) goto L_0x002a
            boolean r2 = r0 instanceof defpackage.apvb
            if (r2 != 0) goto L_0x002a
            boolean r2 = r0 instanceof defpackage.apvd
            if (r2 == 0) goto L_0x0022
            goto L_0x002a
        L_0x0022:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid request proto wrapper."
            r0.<init>(r1)
            throw r0
        L_0x002a:
            java.lang.Object r2 = b
            monitor-enter(r2)
            boolean r3 = r0 instanceof defpackage.apvd     // Catch:{ all -> 0x00ff }
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x0045
            r8 = r0
            apvd r8 = (defpackage.apvd) r8     // Catch:{ all -> 0x00ff }
            java.lang.String r8 = r8.a     // Catch:{ all -> 0x00ff }
            java.lang.String[] r9 = new java.lang.String[r5]     // Catch:{ all -> 0x00ff }
            r9[r6] = r16     // Catch:{ all -> 0x00ff }
            r9[r7] = r8     // Catch:{ all -> 0x00ff }
            java.lang.String r8 = b(r9)     // Catch:{ all -> 0x00ff }
            goto L_0x0062
        L_0x0045:
            boolean r8 = r0 instanceof defpackage.apvb     // Catch:{ all -> 0x00ff }
            if (r8 == 0) goto L_0x0058
            java.lang.String[] r8 = new java.lang.String[r4]     // Catch:{ all -> 0x00ff }
            r8[r6] = r16     // Catch:{ all -> 0x00ff }
            r8[r7] = r1     // Catch:{ all -> 0x00ff }
            java.lang.String r9 = "enroll"
            r8[r5] = r9     // Catch:{ all -> 0x00ff }
            java.lang.String r8 = b(r8)     // Catch:{ all -> 0x00ff }
            goto L_0x0062
        L_0x0058:
            java.lang.String[] r8 = new java.lang.String[r5]     // Catch:{ all -> 0x00ff }
            r8[r6] = r16     // Catch:{ all -> 0x00ff }
            r8[r7] = r1     // Catch:{ all -> 0x00ff }
            java.lang.String r8 = b(r8)     // Catch:{ all -> 0x00ff }
        L_0x0062:
            java.util.Map r9 = a     // Catch:{ all -> 0x00ff }
            boolean r9 = r9.containsKey(r8)     // Catch:{ all -> 0x00ff }
            if (r9 != 0) goto L_0x006b
        L_0x006a:
            goto L_0x008d
        L_0x006b:
            if (r22 != 0) goto L_0x007b
            java.util.Map r9 = a     // Catch:{ all -> 0x00ff }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x00ff }
            appf r9 = (defpackage.appf) r9     // Catch:{ all -> 0x00ff }
            boolean r9 = r9.a()     // Catch:{ all -> 0x00ff }
            if (r9 != 0) goto L_0x006a
        L_0x007b:
            java.util.Map r9 = a     // Catch:{ all -> 0x00ff }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x00ff }
            appf r9 = (defpackage.appf) r9     // Catch:{ all -> 0x00ff }
            jfp r9 = r9.c     // Catch:{ all -> 0x00ff }
            r9.quit()     // Catch:{ all -> 0x00ff }
            java.util.Map r9 = a     // Catch:{ all -> 0x00ff }
            r9.remove(r8)     // Catch:{ all -> 0x00ff }
        L_0x008d:
            java.util.Map r9 = a     // Catch:{ all -> 0x00ff }
            boolean r9 = r9.containsKey(r8)     // Catch:{ all -> 0x00ff }
            if (r9 != 0) goto L_0x00cd
            jfp r9 = new jfp     // Catch:{ all -> 0x00ff }
            java.lang.String r10 = "PhoneVerificationSession"
            r11 = 9
            r9.<init>(r10, r11)     // Catch:{ all -> 0x00ff }
            r9.start()     // Catch:{ all -> 0x00ff }
            r10 = 0
            int r12 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00a9
            r10 = 1
            goto L_0x00aa
        L_0x00a9:
            r10 = 0
        L_0x00aa:
            r11 = 30
            int r13 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r11 = r20
        L_0x00b3:
            appf r13 = new appf     // Catch:{ all -> 0x00ff }
            r13.<init>(r14, r1, r10, r9)     // Catch:{ all -> 0x00ff }
            jfo r1 = r13.b     // Catch:{ all -> 0x00ff }
            android.os.Message r9 = r1.obtainMessage(r4)     // Catch:{ all -> 0x00ff }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00ff }
            long r10 = r10.toMillis(r11)     // Catch:{ all -> 0x00ff }
            r1.sendMessageDelayed(r9, r10)     // Catch:{ all -> 0x00ff }
            java.util.Map r1 = a     // Catch:{ all -> 0x00ff }
            r1.put(r8, r13)     // Catch:{ all -> 0x00ff }
            goto L_0x00d6
        L_0x00cd:
            java.util.Map r1 = a     // Catch:{ all -> 0x00ff }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x00ff }
            r13 = r1
            appf r13 = (defpackage.appf) r13     // Catch:{ all -> 0x00ff }
        L_0x00d6:
            boolean r1 = defpackage.axif.b()     // Catch:{ all -> 0x00ff }
            if (r1 != 0) goto L_0x00dd
            goto L_0x00e5
        L_0x00dd:
            if (r3 == 0) goto L_0x00e5
            apvd r0 = (defpackage.apvd) r0     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = r0.b     // Catch:{ all -> 0x00ff }
            r13.k = r0     // Catch:{ all -> 0x00ff }
        L_0x00e5:
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x00ff }
            r0[r6] = r15     // Catch:{ all -> 0x00ff }
            r0[r7] = r17     // Catch:{ all -> 0x00ff }
            r0[r5] = r18     // Catch:{ all -> 0x00ff }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r23)     // Catch:{ all -> 0x00ff }
            r0[r4] = r1     // Catch:{ all -> 0x00ff }
            jfo r1 = r13.b     // Catch:{ all -> 0x00ff }
            android.os.Message r0 = r1.obtainMessage(r7, r0)     // Catch:{ all -> 0x00ff }
            r1.sendMessage(r0)     // Catch:{ all -> 0x00ff }
            monitor-exit(r2)     // Catch:{ all -> 0x00ff }
            return
        L_0x00ff:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ff }
            goto L_0x0103
        L_0x0102:
            throw r0
        L_0x0103:
            goto L_0x0102
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.appg.a(aptv, android.content.Context, java.lang.String, apte, aptg, java.lang.String, long, boolean, boolean):void");
    }

    public static void a(String str, String str2) {
        a(str, str2);
    }

    private static void a(String... strArr) {
        synchronized (b) {
            String b2 = b(strArr);
            if (a.containsKey(b2)) {
                jfo jfo = ((appf) a.get(b2)).b;
                jfo.sendMessage(jfo.obtainMessage(3, 4));
            }
        }
    }
}
