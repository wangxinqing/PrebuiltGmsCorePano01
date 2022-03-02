package defpackage;

import android.content.Context;
import java.io.File;
import java.security.SecureRandom;

/* renamed from: aiby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiby {
    private static aiby b;
    private final aica a;

    private aiby(aica aica) {
        this.a = aica;
    }

    public static synchronized aiby a(Context context) {
        aiby aiby;
        synchronized (aiby.class) {
            if (b == null) {
                SecureRandom secureRandom = new SecureRandom();
                aibx a2 = aibx.a(context, secureRandom);
                long a3 = jhg.a(context);
                if (a3 != 0) {
                    b = new aiby(new aica(a2, new aibz(secureRandom, Long.toString(a3))));
                } else {
                    throw new aicb();
                }
            }
            aiby = b;
        }
        return aiby;
    }

    public static final synchronized void c(Context context) {
        synchronized (aiby.class) {
            File a2 = a(context, "EARStorage");
            if (a2.exists()) {
                if (!a2.delete()) {
                    throw new aicb();
                }
            }
            File a3 = a(context, "EARStorage.tmp");
            if (a3.exists()) {
                if (!a3.delete()) {
                    throw new aicb();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0 = r2.a.b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x0013] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d A[ExcHandler: IOException (e java.io.IOException), Splitter:B:8:0x0013] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0054 A[SYNTHETIC, Splitter:B:36:0x0054] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.arpd b(android.content.Context r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "EARStorage"
            java.io.File r0 = a((android.content.Context) r5, (java.lang.String) r0)     // Catch:{ all -> 0x005c }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x005c }
            r2 = 0
            if (r1 == 0) goto L_0x005a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0044, aicb -> 0x0042, all -> 0x0040 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0044, aicb -> 0x0042, all -> 0x0040 }
            byte[] r0 = defpackage.anmr.a((java.io.InputStream) r1)     // Catch:{ IOException -> 0x003d, aicb -> 0x003b, all -> 0x0038 }
            aica r2 = r4.a     // Catch:{ IOException -> 0x003d, aicb -> 0x003b, all -> 0x0038 }
            aibz r3 = r2.b     // Catch:{ aicb -> 0x0022, NullPointerException -> 0x0020, IOException -> 0x003d, all -> 0x0038 }
            byte[] r0 = r3.b(r0)     // Catch:{ aicb -> 0x0022, NullPointerException -> 0x0020, IOException -> 0x003d, all -> 0x0038 }
            goto L_0x0029
        L_0x0020:
            r3 = move-exception
            goto L_0x0023
        L_0x0022:
            r3 = move-exception
        L_0x0023:
            aibx r2 = r2.a     // Catch:{ IOException -> 0x003d, aicb -> 0x003b, all -> 0x0038 }
            byte[] r0 = r2.b(r0)     // Catch:{ IOException -> 0x003d, aicb -> 0x003b, all -> 0x0038 }
        L_0x0029:
            arpd r2 = defpackage.arpd.d     // Catch:{ IOException -> 0x003d, aicb -> 0x003b, all -> 0x0038 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r2, (byte[]) r0)     // Catch:{ IOException -> 0x003d, aicb -> 0x003b, all -> 0x0038 }
            arpd r0 = (defpackage.arpd) r0     // Catch:{ IOException -> 0x003d, aicb -> 0x003b, all -> 0x0038 }
            r1.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0036
        L_0x0035:
            r5 = move-exception
        L_0x0036:
            monitor-exit(r4)
            return r0
        L_0x0038:
            r5 = move-exception
            r2 = r1
            goto L_0x0052
        L_0x003b:
            r0 = move-exception
            goto L_0x003e
        L_0x003d:
            r0 = move-exception
        L_0x003e:
            r2 = r1
            goto L_0x0045
        L_0x0040:
            r5 = move-exception
            goto L_0x0052
        L_0x0042:
            r0 = move-exception
            goto L_0x0045
        L_0x0044:
            r0 = move-exception
        L_0x0045:
            c(r5)     // Catch:{ Exception -> 0x004b }
            goto L_0x004c
        L_0x0049:
            r5 = move-exception
            goto L_0x0052
        L_0x004b:
            r5 = move-exception
        L_0x004c:
            aicb r5 = new aicb     // Catch:{ all -> 0x0049 }
            r5.<init>(r0)     // Catch:{ all -> 0x0049 }
            throw r5     // Catch:{ all -> 0x0049 }
        L_0x0052:
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ IOException -> 0x0058 }
            goto L_0x0059
        L_0x0058:
            r0 = move-exception
        L_0x0059:
            throw r5     // Catch:{ all -> 0x005c }
        L_0x005a:
            monitor-exit(r4)
            return r2
        L_0x005c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiby.b(android.content.Context):arpd");
    }

    public static aiby a(Context context, boolean z) {
        aiby a2 = a(context);
        a2.a.c = z;
        return a2;
    }

    private static File a(Context context, String str) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return new File(filesDir, str);
        }
        throw new aicb();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0091 A[SYNTHETIC, Splitter:B:40:0x0091] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Context r6, java.util.List r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            arpd r0 = defpackage.arpd.d     // Catch:{ all -> 0x0097 }
            aucd r0 = r0.o()     // Catch:{ all -> 0x0097 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0097 }
            boolean r3 = r0.c     // Catch:{ all -> 0x0097 }
            if (r3 != 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            r0.c()     // Catch:{ all -> 0x0097 }
            r3 = 0
            r0.c = r3     // Catch:{ all -> 0x0097 }
        L_0x0016:
            aucj r3 = r0.b     // Catch:{ all -> 0x0097 }
            arpd r3 = (defpackage.arpd) r3     // Catch:{ all -> 0x0097 }
            int r4 = r3.a     // Catch:{ all -> 0x0097 }
            r4 = r4 | 1
            r3.a = r4     // Catch:{ all -> 0x0097 }
            r3.b = r1     // Catch:{ all -> 0x0097 }
            aucx r1 = r3.c     // Catch:{ all -> 0x0097 }
            boolean r1 = r1.a()     // Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x0032
            aucx r1 = r3.c     // Catch:{ all -> 0x0097 }
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)     // Catch:{ all -> 0x0097 }
            r3.c = r1     // Catch:{ all -> 0x0097 }
        L_0x0032:
            aucx r1 = r3.c     // Catch:{ all -> 0x0097 }
            defpackage.auab.a((java.lang.Iterable) r7, (java.util.List) r1)     // Catch:{ all -> 0x0097 }
            aucj r7 = r0.i()     // Catch:{ all -> 0x0097 }
            arpd r7 = (defpackage.arpd) r7     // Catch:{ all -> 0x0097 }
            aica r0 = r5.a     // Catch:{ all -> 0x0097 }
            byte[] r7 = r7.k()     // Catch:{ all -> 0x0097 }
            boolean r1 = r0.c     // Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x004e
            aibx r0 = r0.a     // Catch:{ all -> 0x0097 }
            byte[] r7 = r0.a(r7)     // Catch:{ all -> 0x0097 }
            goto L_0x0054
        L_0x004e:
            aibz r0 = r0.b     // Catch:{ all -> 0x0097 }
            byte[] r7 = r0.a(r7)     // Catch:{ all -> 0x0097 }
        L_0x0054:
            r0 = 0
            java.lang.String r1 = "EARStorage"
            java.io.File r1 = a((android.content.Context) r6, (java.lang.String) r1)     // Catch:{ IOException -> 0x0087, all -> 0x0085 }
            java.lang.String r2 = "EARStorage.tmp"
            java.io.File r6 = a((android.content.Context) r6, (java.lang.String) r2)     // Catch:{ IOException -> 0x0087, all -> 0x0085 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0087, all -> 0x0085 }
            r2.<init>(r6)     // Catch:{ IOException -> 0x0087, all -> 0x0085 }
            r2.write(r7)     // Catch:{ IOException -> 0x0082, all -> 0x007f }
            boolean r6 = r6.renameTo(r1)     // Catch:{ IOException -> 0x0082, all -> 0x007f }
            if (r6 == 0) goto L_0x0077
            r2.close()     // Catch:{ IOException -> 0x0074 }
            monitor-exit(r5)
            return
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            return
        L_0x0077:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ IOException -> 0x0082, all -> 0x007f }
            java.lang.String r7 = "rename"
            r6.<init>(r7)     // Catch:{ IOException -> 0x0082, all -> 0x007f }
            throw r6     // Catch:{ IOException -> 0x0082, all -> 0x007f }
        L_0x007f:
            r6 = move-exception
            r0 = r2
            goto L_0x008f
        L_0x0082:
            r6 = move-exception
            r0 = r2
            goto L_0x0088
        L_0x0085:
            r6 = move-exception
            goto L_0x008f
        L_0x0087:
            r6 = move-exception
        L_0x0088:
            aicb r7 = new aicb     // Catch:{ all -> 0x008e }
            r7.<init>(r6)     // Catch:{ all -> 0x008e }
            throw r7     // Catch:{ all -> 0x008e }
        L_0x008e:
            r6 = move-exception
        L_0x008f:
            if (r0 == 0) goto L_0x0096
            r0.close()     // Catch:{ IOException -> 0x0095 }
            goto L_0x0096
        L_0x0095:
            r7 = move-exception
        L_0x0096:
            throw r6     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiby.a(android.content.Context, java.util.List):void");
    }
}
