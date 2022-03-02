package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: aljy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aljy {
    public static final alkd a = new alkd("LoggingStore");
    private static aljy e;
    public File b = null;
    public final File c;
    public final Context d;
    private final aoru f;

    protected aljy(Context context, ExecutorService executorService) {
        this.d = context;
        this.c = new File(context.getFilesDir(), "metrics");
        this.f = aosd.a(executorService);
        a(this.c);
    }

    public static synchronized aljy a(Context context) {
        aljy a2;
        synchronized (aljy.class) {
            a2 = a(context, (ExecutorService) null);
        }
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.util.concurrent.ThreadPoolExecutor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.util.concurrent.ThreadPoolExecutor} */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized defpackage.aljy a(android.content.Context r9, java.util.concurrent.ExecutorService r10) {
        /*
            java.lang.Class<aljy> r0 = defpackage.aljy.class
            monitor-enter(r0)
            if (r10 != 0) goto L_0x001a
            java.util.concurrent.ThreadPoolExecutor r10 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x002d }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x002d }
            java.util.concurrent.ArrayBlockingQueue r7 = new java.util.concurrent.ArrayBlockingQueue     // Catch:{ all -> 0x002d }
            r1 = 50
            r7.<init>(r1)     // Catch:{ all -> 0x002d }
            r2 = 1
            r3 = 1
            r4 = 0
            java.util.concurrent.ThreadFactory r8 = defpackage.aljw.a     // Catch:{ all -> 0x002d }
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch:{ all -> 0x002d }
        L_0x001a:
            aljy r1 = e     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x0029
            aljy r1 = new aljy     // Catch:{ all -> 0x002d }
            android.content.Context r9 = r9.getApplicationContext()     // Catch:{ all -> 0x002d }
            r1.<init>(r9, r10)     // Catch:{ all -> 0x002d }
            e = r1     // Catch:{ all -> 0x002d }
        L_0x0029:
            aljy r9 = e     // Catch:{ all -> 0x002d }
            monitor-exit(r0)
            return r9
        L_0x002d:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aljy.a(android.content.Context, java.util.concurrent.ExecutorService):aljy");
    }

    public static void a(File file) {
        if (!file.exists() && !file.mkdirs()) {
            alkd alkd = a;
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
            sb.append("Failed to create internal storage directory: ");
            sb.append(valueOf);
            alkd.b(sb.toString());
        }
    }

    public final aoqw a(byte[] bArr) {
        try {
            return aoqw.c(this.f.b(new aljx(this, bArr)));
        } catch (RejectedExecutionException e2) {
            return aoqw.c(aorl.a((Throwable) e2));
        }
    }

    public final void a(String str) {
        File file;
        if (str != null) {
            file = new File(this.c, str);
        } else {
            file = this.c;
        }
        a(file);
        aljt.b(file);
    }
}
