package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: aikq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aikq {
    public static volatile boolean a = false;
    private static PrintWriter b;

    static {
        new FieldPosition(0);
        new Date();
        new SimpleDateFormat("yyyy.MM.dd HH:mm:ss ");
        new StringBuffer(20);
    }

    public static synchronized void a() {
        synchronized (aikq.class) {
        }
    }

    public static void b(String str, String str2) {
        Log.e(str, str2);
        a();
    }

    public static void c(String str, String str2) {
        Log.w(str, str2);
        a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r5) {
        /*
            java.lang.Class<aikq> r0 = defpackage.aikq.class
            monitor-enter(r0)
            java.io.PrintWriter r1 = b     // Catch:{ all -> 0x0049 }
            if (r1 != 0) goto L_0x0032
            int r1 = defpackage.jhg.a     // Catch:{ all -> 0x0049 }
            r1 = 0
            a = r1     // Catch:{ all -> 0x0049 }
            r1 = 0
            java.io.File r5 = r5.getExternalFilesDir(r1)     // Catch:{ Exception -> 0x0037 }
            if (r5 == 0) goto L_0x0032
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "geofencer_debug_log"
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0049 }
            boolean r5 = r1.exists()     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x0032
            java.io.PrintWriter r5 = new java.io.PrintWriter     // Catch:{ Exception -> 0x0034 }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0034 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0034 }
            r4 = 1
            r3.<init>(r1, r4)     // Catch:{ Exception -> 0x0034 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0034 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x0034 }
            b = r5     // Catch:{ Exception -> 0x0034 }
        L_0x0032:
            monitor-exit(r0)
            return
        L_0x0034:
            r5 = move-exception
        L_0x0035:
            monitor-exit(r0)
            return
        L_0x0037:
            r5 = move-exception
            java.lang.String r5 = "Logger"
            r1 = 6
            boolean r5 = android.util.Log.isLoggable(r5, r1)     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x0035
            java.lang.String r5 = "Logger"
            java.lang.String r1 = "Unable to retrieve external files dir."
            android.util.Log.e(r5, r1)     // Catch:{ all -> 0x0049 }
            goto L_0x0035
        L_0x0049:
            r5 = move-exception
            monitor-exit(r0)
            goto L_0x004d
        L_0x004c:
            throw r5
        L_0x004d:
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aikq.a(android.content.Context):void");
    }

    public static void a(String str, String str2) {
        Log.i(str, str2);
        a();
    }
}
