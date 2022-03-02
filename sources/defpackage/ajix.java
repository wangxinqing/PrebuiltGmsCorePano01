package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.io.PrintWriter;
import java.util.Map;
import java.util.logging.Level;

/* renamed from: ajix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajix {
    private static File a = null;
    private static volatile Map b = new nz();
    private static boolean c = false;
    private static boolean[] d;

    public static void a() {
        boolean[] zArr = new boolean[63];
        for (int i = 0; i < 63; i++) {
            zArr[i] = false;
        }
        for (String str : amsk.a(',').a((CharSequence) aztb.a.a().aF())) {
            if (!str.isEmpty()) {
                try {
                    int parseInt = Integer.parseInt(str);
                    if (parseInt >= 0 && parseInt <= 62) {
                        zArr[parseInt] = true;
                    }
                } catch (NumberFormatException e) {
                    Log.e("GCoreUlr", "Bad errorId configuring silent feedback");
                }
            }
        }
        d = zArr;
    }

    private static synchronized void b() {
        synchronized (ajix.class) {
            if (!b.isEmpty()) {
                for (ajiy a2 : b.values()) {
                    a2.a();
                }
                b.clear();
                if (a != null && a.exists() && !ajnw.a(a)) {
                    String valueOf = String.valueOf(a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                    sb.append("Error deleting ");
                    sb.append(valueOf);
                    Log.e("GCoreUlr", sb.toString());
                }
                a = null;
            }
        }
    }

    private static synchronized void c(Context context) {
        synchronized (ajix.class) {
            if (!c) {
                ajnw.a(new File(context.getFilesDir(), "reporting-log"));
                c = true;
            }
        }
    }

    public static synchronized void c(String str, int i, String str2) {
        synchronized (ajix.class) {
            a(str, i, (Throwable) new ajiw(str, str2));
        }
    }

    public static synchronized void c(String str, String str2) {
        synchronized (ajix.class) {
            b(str, 0, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0102, code lost:
        r8 = r5.length;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r13) {
        /*
            java.lang.String r0 = "GCoreUlr"
            defpackage.jhg.c()     // Catch:{ RuntimeException -> 0x0027 }
            c(r13)     // Catch:{ RuntimeException -> 0x0027 }
            aztb r1 = defpackage.aztb.a     // Catch:{ RuntimeException -> 0x0027 }
            aztc r1 = r1.a()     // Catch:{ RuntimeException -> 0x0027 }
            long r1 = r1.bc()     // Catch:{ RuntimeException -> 0x0027 }
            int r2 = (int) r1     // Catch:{ RuntimeException -> 0x0027 }
            a((android.content.Context) r13, (java.lang.String) r0, (int) r2)     // Catch:{ RuntimeException -> 0x0027 }
            java.lang.String r1 = "GCoreUlrLong"
            aztb r2 = defpackage.aztb.a     // Catch:{ RuntimeException -> 0x0027 }
            aztc r2 = r2.a()     // Catch:{ RuntimeException -> 0x0027 }
            long r2 = r2.be()     // Catch:{ RuntimeException -> 0x0027 }
            int r3 = (int) r2     // Catch:{ RuntimeException -> 0x0027 }
            a((android.content.Context) r13, (java.lang.String) r1, (int) r3)     // Catch:{ RuntimeException -> 0x0027 }
            return
        L_0x0027:
            r13 = move-exception
            java.lang.String r1 = "Best-effort configureForUlr() failed"
            android.util.Log.wtf(r0, r1, r13)
            dlc r0 = defpackage.ahpx.a()
            if (r0 != 0) goto L_0x0052
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 39
            r1.<init>(r0)
            java.lang.String r0 = "location tracking disabled, can't send "
            r1.append(r0)
            r1.append(r13)
            r1.toString()
            return
        L_0x0052:
            android.content.Context r1 = defpackage.ahpx.b
            if (r1 == 0) goto L_0x0158
            dkz r1 = new dkz
            android.content.Context r2 = defpackage.ahpx.b
            java.util.Collection r3 = defpackage.ahpx.a
            r1.<init>(r2, r3)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r3 = defpackage.axwx.p()
            java.lang.String r4 = java.lang.String.valueOf(r13)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 52
            int r5 = r5 + r6
            r7.<init>(r5)
            java.lang.String r5 = "Exception "
            r7.append(r5)
            r7.append(r4)
            java.lang.String r4 = ", fatal: false. AnalyticsUtil userDomain: "
            r7.append(r4)
            r7.append(r3)
            r7.toString()
            dki r4 = new dki
            r4.<init>()
            java.lang.String r5 = "utm_source=location"
            r4.a((java.lang.String) r5)
            java.lang.String r2 = r2.getName()
            java.lang.Throwable r5 = defpackage.dkz.a(r13)
            java.lang.Throwable r13 = defpackage.dkz.a(r13)
            java.lang.StackTraceElement[] r13 = r13.getStackTrace()
            r6 = 0
            r7 = 0
            if (r13 == 0) goto L_0x00e2
            int r8 = r13.length
            if (r8 != 0) goto L_0x00b8
            goto L_0x00e3
        L_0x00b8:
            r6 = 0
        L_0x00b9:
            if (r6 >= r8) goto L_0x00de
            r9 = r13[r6]
            java.lang.String r10 = r9.getClassName()
            java.util.TreeSet r11 = r1.a
            java.util.Iterator r11 = r11.iterator()
        L_0x00c7:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00db
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = r10.startsWith(r12)
            if (r12 == 0) goto L_0x00c7
            r6 = r9
            goto L_0x00e3
        L_0x00db:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x00de:
            r6 = r13[r7]
            goto L_0x00e3
        L_0x00e2:
        L_0x00e3:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r13.append(r1)
            r1 = 1
            if (r6 == 0) goto L_0x012c
            java.lang.String r5 = r6.getClassName()
            java.lang.String r8 = "\\."
            java.lang.String[] r5 = r5.split(r8)
            if (r5 == 0) goto L_0x010a
            int r8 = r5.length
            if (r8 <= 0) goto L_0x010a
            int r8 = r8 + -1
            r5 = r5[r8]
            goto L_0x010d
        L_0x010a:
            java.lang.String r5 = "unknown"
        L_0x010d:
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r7] = r5
            java.lang.String r5 = r6.getMethodName()
            r8[r1] = r5
            r5 = 2
            int r6 = r6.getLineNumber()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8[r5] = r6
            java.lang.String r5 = " (@%s:%s:%s)"
            java.lang.String r5 = java.lang.String.format(r5, r8)
            r13.append(r5)
        L_0x012c:
            if (r2 != 0) goto L_0x012f
            goto L_0x013c
        L_0x012f:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r7] = r2
            java.lang.String r2 = " {%s}"
            java.lang.String r2 = java.lang.String.format(r2, r5)
            r13.append(r2)
        L_0x013c:
            java.lang.String r13 = r13.toString()
            java.lang.String r2 = "&exd"
            r4.a((java.lang.String) r2, (java.lang.String) r13)
            java.lang.String r13 = "&exf"
            java.lang.String r2 = "0"
            r4.a((java.lang.String) r13, (java.lang.String) r2)
            r4.a((int) r1, (java.lang.String) r3)
            java.util.Map r13 = r4.a()
            r0.a((java.util.Map) r13)
            return
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajix.b(android.content.Context):void");
    }

    public static void a(Context context) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            new ajiv(context).start();
        } else {
            b(context);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void a(android.content.Context r3, java.lang.String r4, int r5) {
        /*
            java.lang.Class<ajix> r0 = defpackage.ajix.class
            monitor-enter(r0)
            aztb r1 = defpackage.aztb.a     // Catch:{ all -> 0x00fe }
            aztc r1 = r1.a()     // Catch:{ all -> 0x00fe }
            boolean r1 = r1.bd()     // Catch:{ all -> 0x00fe }
            if (r1 == 0) goto L_0x00f9
            java.io.File r1 = a     // Catch:{ all -> 0x00fe }
            if (r1 != 0) goto L_0x0020
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00fe }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ all -> 0x00fe }
            java.lang.String r2 = "flog"
            r1.<init>(r3, r2)     // Catch:{ all -> 0x00fe }
            a = r1     // Catch:{ all -> 0x00fe }
        L_0x0020:
            java.io.File r3 = a     // Catch:{ all -> 0x00fe }
            boolean r3 = r3.isDirectory()     // Catch:{ all -> 0x00fe }
            if (r3 != 0) goto L_0x0060
            java.io.File r3 = a     // Catch:{ all -> 0x00fe }
            boolean r3 = r3.mkdir()     // Catch:{ all -> 0x00fe }
            if (r3 == 0) goto L_0x0031
            goto L_0x0060
        L_0x0031:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x00fe }
            java.io.File r4 = a     // Catch:{ all -> 0x00fe }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00fe }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00fe }
            int r5 = r5.length()     // Catch:{ all -> 0x00fe }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fe }
            int r5 = r5 + 24
            r1.<init>(r5)     // Catch:{ all -> 0x00fe }
            java.lang.String r5 = "Error creating sRootDir "
            r1.append(r5)     // Catch:{ all -> 0x00fe }
            r1.append(r4)     // Catch:{ all -> 0x00fe }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x00fe }
            r3.<init>(r4)     // Catch:{ all -> 0x00fe }
            java.lang.String r4 = "GCoreUlr"
            java.lang.String r5 = ""
            android.util.Log.e(r4, r5, r3)     // Catch:{ all -> 0x00fe }
            monitor-exit(r0)
            return
        L_0x0060:
            java.util.Map r3 = b     // Catch:{ all -> 0x00fe }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00fe }
            ajiy r3 = (defpackage.ajiy) r3     // Catch:{ all -> 0x00fe }
            if (r3 != 0) goto L_0x0072
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00fe }
            java.io.File r2 = a     // Catch:{ all -> 0x00fe }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x00fe }
            goto L_0x0074
        L_0x0072:
            java.io.File r1 = r3.a     // Catch:{ all -> 0x00fe }
        L_0x0074:
            if (r5 > 0) goto L_0x0088
            java.util.Map r3 = b     // Catch:{ all -> 0x00fe }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00fe }
            ajiy r3 = (defpackage.ajiy) r3     // Catch:{ all -> 0x00fe }
            if (r3 == 0) goto L_0x0083
            r3.a()     // Catch:{ all -> 0x00fe }
        L_0x0083:
            defpackage.ajnw.a((java.io.File) r1)     // Catch:{ all -> 0x00fe }
            monitor-exit(r0)
            return
        L_0x0088:
            boolean r2 = r1.isDirectory()     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x00c2
            boolean r2 = r1.mkdir()     // Catch:{ all -> 0x00fe }
            if (r2 == 0) goto L_0x0095
            goto L_0x00c2
        L_0x0095:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x00fe }
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00fe }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00fe }
            int r5 = r5.length()     // Catch:{ all -> 0x00fe }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fe }
            int r5 = r5 + 19
            r1.<init>(r5)     // Catch:{ all -> 0x00fe }
            java.lang.String r5 = "Error creating dir "
            r1.append(r5)     // Catch:{ all -> 0x00fe }
            r1.append(r4)     // Catch:{ all -> 0x00fe }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x00fe }
            r3.<init>(r4)     // Catch:{ all -> 0x00fe }
            java.lang.String r4 = "GCoreUlr"
            java.lang.String r5 = ""
            android.util.Log.e(r4, r5, r3)     // Catch:{ all -> 0x00fe }
            monitor-exit(r0)
            return
        L_0x00c2:
            if (r3 != 0) goto L_0x00ce
            ajiy r3 = new ajiy     // Catch:{ IllegalArgumentException -> 0x00d2, IOException -> 0x00d0 }
            r3.<init>(r1, r5)     // Catch:{ IllegalArgumentException -> 0x00d2, IOException -> 0x00d0 }
            java.util.Map r5 = b     // Catch:{ IllegalArgumentException -> 0x00d2, IOException -> 0x00d0 }
            r5.put(r4, r3)     // Catch:{ IllegalArgumentException -> 0x00d2, IOException -> 0x00d0 }
        L_0x00ce:
            monitor-exit(r0)
            return
        L_0x00d0:
            r3 = move-exception
            goto L_0x00d3
        L_0x00d2:
            r3 = move-exception
        L_0x00d3:
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00fe }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00fe }
            int r5 = r5.length()     // Catch:{ all -> 0x00fe }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fe }
            int r5 = r5 + 26
            r1.<init>(r5)     // Catch:{ all -> 0x00fe }
            java.lang.String r5 = "Failed to create log file "
            r1.append(r5)     // Catch:{ all -> 0x00fe }
            r1.append(r4)     // Catch:{ all -> 0x00fe }
            java.lang.String r4 = "GCoreUlr"
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x00fe }
            android.util.Log.e(r4, r5, r3)     // Catch:{ all -> 0x00fe }
            monitor-exit(r0)
            return
        L_0x00f9:
            b()     // Catch:{ all -> 0x00fe }
            monitor-exit(r0)
            return
        L_0x00fe:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajix.a(android.content.Context, java.lang.String, int):void");
    }

    public static synchronized void a(PrintWriter printWriter, String str) {
        synchronized (ajix.class) {
            ajiy ajiy = (ajiy) b.get(str);
            if (ajiy != null) {
                ajiy.a(printWriter);
            }
        }
    }

    public static synchronized void a(String str, int i, String str2) {
        synchronized (ajix.class) {
            if (Log.isLoggable(str, 5)) {
                Log.w(str, str2);
            }
            if (i != 0) {
                ajjb.a(i);
            }
            ajiy ajiy = (ajiy) b.get(str);
            if (ajiy != null) {
                ajiy.a(Level.WARNING, str, str2);
            }
        }
    }

    public static synchronized void a(String str, int i, String str2, Throwable th) {
        synchronized (ajix.class) {
            if (a(i)) {
                ajjf.a(th);
            }
            if (i != 0) {
                if (i >= 65535) {
                    ajjb.a("UlrDeviceTagEvents", i);
                } else {
                    ajjb.a(i);
                }
            }
            if (Log.isLoggable(str, 6)) {
                Log.e(str, str2, th);
            }
            ajiy ajiy = (ajiy) b.get(str);
            if (ajiy != null) {
                ajiy.a(Level.SEVERE, str, str2, th);
            }
        }
    }

    public static synchronized void b(String str, int i, String str2) {
        ajiw ajiw;
        synchronized (ajix.class) {
            if (a(i)) {
                ajiw = new ajiw(str, str2);
            } else {
                ajiw = null;
            }
            a(str, i, str2, ajiw);
        }
    }

    public static synchronized void b(String str, int i, String str2, Throwable th) {
        synchronized (ajix.class) {
            ajiy ajiy = (ajiy) b.get(str);
            if (ajiy != null) {
                ajiy.a(Level.SEVERE, str, str2, th);
            }
            ajjb.a(i);
            if (a(i)) {
                ajjf.a(th);
            }
            Log.wtf(str, str2, th);
        }
    }

    public static synchronized void a(String str, int i, Throwable th) {
        synchronized (ajix.class) {
            b(str, i, th.getMessage(), th);
        }
    }

    public static synchronized void a(String str, String str2) {
        synchronized (ajix.class) {
            if (Log.isLoggable(str, 4)) {
                Log.i(str, str2);
            }
            ajiy ajiy = (ajiy) b.get(str);
            if (ajiy != null) {
                ajiy.a(Level.INFO, str, str2);
            }
        }
    }

    public static synchronized void b(String str, String str2) {
        synchronized (ajix.class) {
            a(str, 0, str2);
        }
    }

    public static synchronized void b(String str, String str2, Throwable th) {
        synchronized (ajix.class) {
            a(str, 0, str2, th);
        }
    }

    public static synchronized void a(String str, String str2, Throwable th) {
        synchronized (ajix.class) {
            if (Log.isLoggable(str, 5)) {
                Log.w(str, str2, th);
            }
            ajiy ajiy = (ajiy) b.get(str);
            if (ajiy != null) {
                ajiy.a(Level.WARNING, str, str2, th);
            }
        }
    }

    public static synchronized void b(String str, Throwable th) {
        synchronized (ajix.class) {
            b(str, th.getMessage(), th);
        }
    }

    public static synchronized void a(String str, Throwable th) {
        synchronized (ajix.class) {
            if (Log.isLoggable(str, 5)) {
                Log.w(str, th);
            }
            ajiy ajiy = (ajiy) b.get(str);
            if (ajiy != null) {
                ajiy.a(Level.WARNING, str, th);
            }
        }
    }

    public static synchronized void a(Level level, String str, String str2) {
        synchronized (ajix.class) {
            ajiy ajiy = (ajiy) b.get(str);
            if (ajiy != null) {
                ajiy.a(level, str, str2);
            }
        }
    }

    private static boolean a(int i) {
        boolean[] zArr;
        if (!aztb.a.a().au() || (zArr = d) == null || i > 62) {
            return false;
        }
        return zArr[i];
    }
}
