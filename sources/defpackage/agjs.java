package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import java.util.Iterator;
import java.util.List;

/* renamed from: agjs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agjs {
    static volatile boolean a;
    public static final /* synthetic */ int b = 0;
    private static volatile ActivityManager c = null;

    private agjs() {
    }

    public static ActivityManager a(Context context) {
        if (c == null) {
            synchronized (agjs.class) {
                if (c == null) {
                    c = (ActivityManager) context.getSystemService("activity");
                }
            }
        }
        return c;
    }

    public static boolean c(Context context) {
        int i = Build.VERSION.SDK_INT;
        return ((PowerManager) context.getSystemService("power")).isInteractive();
    }

    public static boolean d(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = a(context).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == Process.myPid()) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.importance == 100 && next.processName.contains(context.getPackageName())) {
                    if (Build.VERSION.SDK_INT >= 23 || c(context)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f A[SYNTHETIC, Splitter:B:14:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049 A[SYNTHETIC, Splitter:B:21:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            int r0 = android.os.Process.myPid()
            r1 = 0
            if (r0 <= 0) goto L_0x004e
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0045, all -> 0x003c }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ IOException -> 0x0045, all -> 0x003c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0045, all -> 0x003c }
            r5 = 25
            r4.<init>(r5)     // Catch:{ IOException -> 0x0045, all -> 0x003c }
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch:{ IOException -> 0x0045, all -> 0x003c }
            r4.append(r0)     // Catch:{ IOException -> 0x0045, all -> 0x003c }
            java.lang.String r0 = "/cmdline"
            r4.append(r0)     // Catch:{ IOException -> 0x0045, all -> 0x003c }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x0045, all -> 0x003c }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0045, all -> 0x003c }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0045, all -> 0x003c }
            java.lang.String r0 = r2.readLine()     // Catch:{ IOException -> 0x003a, all -> 0x0037 }
            java.lang.String r1 = r0.trim()     // Catch:{ IOException -> 0x003a, all -> 0x0037 }
            r2.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x004e
        L_0x0035:
            r0 = move-exception
            goto L_0x004d
        L_0x0037:
            r0 = move-exception
            r1 = r2
            goto L_0x003d
        L_0x003a:
            r0 = move-exception
            goto L_0x0047
        L_0x003c:
            r0 = move-exception
        L_0x003d:
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0044
        L_0x0043:
            r1 = move-exception
        L_0x0044:
            throw r0
        L_0x0045:
            r0 = move-exception
            r2 = r1
        L_0x0047:
            if (r2 == 0) goto L_0x004d
            r2.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x004e
        L_0x004d:
            goto L_0x004f
        L_0x004e:
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agjs.a():java.lang.String");
    }
}
