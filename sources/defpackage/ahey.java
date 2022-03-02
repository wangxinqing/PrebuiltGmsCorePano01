package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: ahey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahey implements ahfw {
    public final String a;
    public final aorr b;
    public final ahek c;
    public final Executor d;
    public final agzs e;
    public final ahel f;
    public final Object g = new Object();
    public Object h = null;
    public boolean i;
    private final aoqu j = aoqu.a();
    private final aoqu k = aoqu.a();

    public ahey(String str, aorr aorr, ahek ahek, Executor executor, agzs agzs, ahel ahel) {
        this.a = str;
        this.b = aorl.a(aorr);
        this.c = ahek;
        this.d = executor;
        this.e = agzs;
        this.f = ahel;
    }

    public static final aorr a(IOException iOException) {
        if (iOException.getCause() instanceof ahax) {
            return aorl.a((Throwable) iOException);
        }
        return aorl.a((Throwable) iOException);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = !r4.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0011, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0012, code lost:
        if (r0 != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0015, code lost:
        r0 = a(r5);
        r3 = r4.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001e, code lost:
        if (r4.i != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0020, code lost:
        r4.h = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0022, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0023, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0024, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0025, code lost:
        r0 = r4.e;
        r1 = new defpackage.ahcf(true);
        r1.a = true;
        r0 = (java.io.Closeable) r0.a(r5, r1, new defpackage.agzk[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r5 = a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003b, code lost:
        if (r0 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003d, code lost:
        r1 = r4.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003f, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r4.h = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0042, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0047, code lost:
        if (r0 == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0049, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x004c, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x004d, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x004e, code lost:
        if (r0 != null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0055, code lost:
        defpackage.apev.a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0058, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        r1 = r4.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        monitor-enter(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(android.net.Uri r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.g
            monitor-enter(r0)
            java.lang.Object r1 = r4.h     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            return r1
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            java.lang.Object r1 = r4.g
            monitor-enter(r1)
            boolean r0 = r4.i     // Catch:{ all -> 0x005c }
            r2 = 1
            r0 = r0 ^ r2
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x0015
            goto L_0x0025
        L_0x0015:
            java.lang.Object r0 = r4.a((android.net.Uri) r5)
            java.lang.Object r3 = r4.g
            monitor-enter(r3)
            boolean r1 = r4.i     // Catch:{ all -> 0x0059 }
            if (r1 != 0) goto L_0x0024
            r4.h = r0     // Catch:{ all -> 0x0059 }
            monitor-exit(r3)     // Catch:{ all -> 0x0059 }
            return r0
        L_0x0024:
            monitor-exit(r3)     // Catch:{ all -> 0x0059 }
        L_0x0025:
            agzs r0 = r4.e
            ahcf r1 = new ahcf
            r1.<init>(r2)
            r1.a = r2
            r2 = 0
            agzk[] r2 = new defpackage.agzk[r2]
            java.lang.Object r0 = r0.a(r5, r1, r2)
            java.io.Closeable r0 = (java.io.Closeable) r0
            java.lang.Object r5 = r4.a((android.net.Uri) r5)     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0047
            java.lang.Object r1 = r4.g     // Catch:{ all -> 0x004d }
            monitor-enter(r1)     // Catch:{ all -> 0x004d }
            r4.h = r5     // Catch:{ all -> 0x0044 }
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            goto L_0x0047
        L_0x0044:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            throw r5     // Catch:{ all -> 0x004d }
        L_0x0047:
            if (r0 == 0) goto L_0x004c
            r0.close()
        L_0x004c:
            return r5
        L_0x004d:
            r5 = move-exception
            if (r0 == 0) goto L_0x0058
            r0.close()     // Catch:{ all -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r5, (java.lang.Throwable) r0)
        L_0x0058:
            throw r5
        L_0x0059:
            r5 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0059 }
            throw r5
        L_0x005c:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            throw r5
        L_0x005f:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahey.b(android.net.Uri):java.lang.Object");
    }

    public final String b() {
        return this.a;
    }

    public final aorr c() {
        synchronized (this.g) {
            Object obj = this.h;
            if (obj == null) {
                return aorl.a(this.k.a(amll.a((aoqa) new ahep(this)), this.d));
            }
            aorr a2 = aorl.a(obj);
            return a2;
        }
    }

    public final aoqa a() {
        return new ahen(this);
    }

    public final aorr a(aoqb aoqb, Executor executor) {
        return this.j.a(amll.a((aoqa) new aheq(this, aoqb, executor)), this.d);
    }

    public final Object a(Uri uri) {
        InputStream inputStream;
        try {
            String valueOf = String.valueOf(this.a);
            amkr a2 = amlv.a(valueOf.length() == 0 ? new String("Read ") : "Read ".concat(valueOf), amlw.a);
            try {
                inputStream = (InputStream) this.e.a(uri, ahcj.a(), new agzk[0]);
                audx a3 = ((ahgj) this.c).a(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                if (a2 != null) {
                    a2.close();
                }
                return a3;
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.close();
                }
                throw th;
            }
            throw th;
        } catch (FileNotFoundException e2) {
            if (!this.e.c(uri)) {
                return ((ahgi) this.c).a;
            }
            throw e2;
        } catch (IOException e3) {
            throw ahfy.a(this.e, uri, e3);
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
    }
}
