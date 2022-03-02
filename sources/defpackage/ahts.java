package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ahts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahts extends ahum {
    public volatile boolean a = false;
    public volatile String b;
    public final byte[] c;
    public volatile boolean d = false;
    public volatile ahrc e;
    public final aizx f;
    public final ajbg g;
    private final ThreadPoolExecutor m;
    private volatile String n = null;
    private final Object o = new Object();

    public ahts(ajbg ajbg, String str, byte[] bArr, ahss ahss, ajrh ajrh, ahuz ahuz, aizx aizx) {
        super(ahss, ajrh, ahuz);
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unsupported policy: 0");
        amrl.a(true, (Object) sb.toString());
        if (!str.endsWith(File.separator)) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(File.separator);
            str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        }
        this.b = str;
        this.c = bArr;
        this.f = aizx;
        this.g = ajbg;
        this.m = new ahtq(this, TimeUnit.SECONDS, new ArrayBlockingQueue(50), new ThreadPoolExecutor.AbortPolicy());
    }

    private static final ahul b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            String valueOf = String.valueOf(file.getAbsolutePath());
            if (valueOf.length() == 0) {
                new String("mkdir: ");
            } else {
                "mkdir: ".concat(valueOf);
            }
            if (!file.mkdir()) {
                return new ahul(false, (String) null, String.format(Locale.ENGLISH, "Failed to create dir: %s", new Object[]{str}));
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.m.shutdown();
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            if (!this.m.isShutdown()) {
                this.m.shutdown();
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ahuz ahuz) {
        if (ahuz != null) {
            try {
                ahuz.a(this.b);
            } catch (FileNotFoundException e2) {
                String valueOf = String.valueOf(e2.getMessage());
                if (valueOf.length() == 0) {
                    new String("Failed to create sessionSummary ");
                } else {
                    "Failed to create sessionSummary ".concat(valueOf);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(aqek aqek) {
        if (!this.j) {
            b(aqek);
        }
    }

    private final boolean b(aqek aqek) {
        boolean z;
        if (!aqek.i(6) || !aqek.e(6).i(3)) {
            z = false;
        } else {
            z = true;
        }
        amrl.b(z, (Object) "No sequence number specified!");
        int b2 = aqek.e(6).b(3);
        try {
            this.m.execute(new ahtr(this, b2, aqek));
            return true;
        } catch (RejectedExecutionException e2) {
            ahss ahss = this.h;
            if (ahss != null) {
                ahss.a(b2, (String) null, "Failed to write to file: work queue full.");
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0045 A[SYNTHETIC, Splitter:B:28:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x004e A[SYNTHETIC, Splitter:B:35:0x004e] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0038=Splitter:B:18:0x0038, B:31:0x004a=Splitter:B:31:0x004a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.n     // Catch:{ all -> 0x0055 }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r4.n     // Catch:{ all -> 0x0055 }
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0010
            r1 = 0
            goto L_0x0011
        L_0x0010:
        L_0x0011:
            java.lang.String r0 = "sessionId in two writes should be consistent."
            defpackage.amrl.a((boolean) r1, (java.lang.Object) r0)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = r4.n     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x003a
            byte[] r0 = r5.getBytes()     // Catch:{ all -> 0x0055 }
            r4.b()     // Catch:{ all -> 0x0055 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0055 }
            java.lang.String r2 = r4.b     // Catch:{ all -> 0x0055 }
            java.lang.String r3 = "sessionId"
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0055 }
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004b, all -> 0x0042 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x004b, all -> 0x0042 }
            r3.write(r0)     // Catch:{ IOException -> 0x003f, all -> 0x003c }
            r3.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x0038
        L_0x0037:
            r0 = move-exception
        L_0x0038:
            r4.n = r5     // Catch:{ all -> 0x0055 }
        L_0x003a:
            monitor-exit(r4)
            return
        L_0x003c:
            r5 = move-exception
            r2 = r3
            goto L_0x0043
        L_0x003f:
            r5 = move-exception
            r2 = r3
            goto L_0x004c
        L_0x0042:
            r5 = move-exception
        L_0x0043:
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x004a
        L_0x0049:
            r0 = move-exception
        L_0x004a:
            throw r5     // Catch:{ all -> 0x0055 }
        L_0x004b:
            r5 = move-exception
        L_0x004c:
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x003a
        L_0x0052:
            r5 = move-exception
            monitor-exit(r4)
            return
        L_0x0055:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x0059
        L_0x0058:
            throw r5
        L_0x0059:
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahts.a(java.lang.String):void");
    }

    public final ahul b() {
        synchronized (this.o) {
            if (this.d) {
                return null;
            }
            ahul b2 = b(this.b);
            if (b2 != null) {
                return b2;
            }
            String format = String.format(Locale.ENGLISH, "%d-%d", new Object[]{Long.valueOf(System.currentTimeMillis()), Integer.valueOf((int) (Math.random() * 1000000.0d))});
            String valueOf = String.valueOf(this.b);
            String str = File.separator;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(format).length() + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(format);
            sb.append(str);
            this.b = sb.toString();
            ahul b3 = b(this.b);
            if (b3 != null) {
                return b3;
            }
            this.d = true;
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(aqek aqek, aqek aqek2) {
        aqek.b(6, (Object) aqek2);
        return b(aqek);
    }
}
