package defpackage;

import android.content.res.AssetManager;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.concurrent.ScheduledFuture;

/* renamed from: ngb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ngb implements Runnable {
    public final aosh a;
    ScheduledFuture b;
    private final String c;
    private final ngm d;
    private final AssetManager e;
    private final Object f = new Object();
    private Status g = ngd.a;

    public ngb(String str, ngm ngm, AssetManager assetManager) {
        this.c = str;
        this.d = ngm;
        this.e = assetManager;
        this.a = aosh.f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f
            monitor-enter(r0)
            com.google.android.gms.common.api.Status r1 = r3.g     // Catch:{ all -> 0x002e }
            int r1 = r1.i     // Catch:{ all -> 0x002e }
            r2 = 23509(0x5bd5, float:3.2943E-41)
            if (r1 != r2) goto L_0x002c
            r3.g = r4     // Catch:{ all -> 0x002e }
            aosh r4 = r3.a     // Catch:{ all -> 0x002e }
            boolean r4 = r4.isDone()     // Catch:{ all -> 0x002e }
            if (r4 != 0) goto L_0x001c
            aosh r4 = r3.a     // Catch:{ all -> 0x002e }
            com.google.android.gms.common.api.Status r1 = r3.g     // Catch:{ all -> 0x002e }
            r4.b((java.lang.Object) r1)     // Catch:{ all -> 0x002e }
        L_0x001c:
            java.util.concurrent.ScheduledFuture r4 = r3.b     // Catch:{ all -> 0x002e }
            boolean r4 = r4.isDone()     // Catch:{ all -> 0x002e }
            if (r4 != 0) goto L_0x002a
            java.util.concurrent.ScheduledFuture r4 = r3.b     // Catch:{ all -> 0x002e }
            r1 = 0
            r4.cancel(r1)     // Catch:{ all -> 0x002e }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x002e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngb.b(com.google.android.gms.common.api.Status):void");
    }

    public final void a(Status status) {
        amrl.a((Object) status, (Object) "cancellationStatus");
        b(status);
    }

    public final void run() {
        Status status;
        long j;
        try {
            byte[] a2 = anmr.a(this.e.open(this.c));
            ngm ngm = this.d;
            String str = this.c;
            iva.a((Object) str, (Object) "fileName");
            iva.a((Object) a2, (Object) "content");
            File file = new File(ngm.a, str);
            synchronized (ngm.c) {
                File file2 = new File(ngm.a, String.valueOf(str).concat(".tmp"));
                try {
                    ngm.a((long) a2.length);
                    if (file2.exists()) {
                        if (!file2.delete()) {
                            String valueOf = String.valueOf(file2);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                            sb.append("Unable to delete ");
                            sb.append(valueOf);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    anne.a(a2, file2);
                } catch (Exception e2) {
                    ngz.c("FontDisk", "Unable to write bundled font %s to %s on disk", str, file, e2);
                }
                long length = (long) a2.length;
                if (!ngm.a(length, file2, file)) {
                    boolean exists = file.exists();
                    if (exists) {
                        j = file.length();
                    } else {
                        j = -1;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("FontDisk failed to take file ");
                    if (exists) {
                        sb2.append("wrong size, actual ");
                        sb2.append(j);
                        sb2.append(" != expected ");
                        sb2.append(length);
                    } else {
                        sb2.append("missing");
                    }
                    sb2.append(" at ");
                    sb2.append(file);
                    throw new IllegalStateException(sb2.toString());
                }
            }
            status = Status.a;
        } catch (Exception e3) {
            ngz.a("FontsBundledExtractor", (Throwable) e3, "Exception in extracting assets.", new Object[0]);
            status = new Status(8, e3.getMessage());
        }
        b(status);
    }
}
