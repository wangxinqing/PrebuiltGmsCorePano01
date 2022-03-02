package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: nhz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nhz {
    public static final nhz a = new nhz((byte[]) null);
    public final Object b;
    protected ngy c;
    public ngm d;
    public nhf e;
    protected ngh f;
    protected ExecutorService g;
    protected ScheduledExecutorService h;
    public ngo i;
    protected nge j;
    protected nhy k;
    public boolean l;
    public boolean m;
    public long n;
    public long o;
    public boolean p;
    protected nhm q;
    protected nhn r;
    protected nhn s;
    private nhv t;

    public nhz() {
    }

    public static void a(Context context, amsn amsn, int i2, int i3) {
        ngy a2 = a.a(context);
        long a3 = amsn.a(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(54);
        sb.append("com.google.android.gms.fonts.state.bundled.");
        sb.append(i3);
        a2.a(ngy.a(1, i2, sb.toString(), a3));
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[2];
        objArr[0] = i2 != 0 ? "failed or no action" : "succeeded";
        objArr[1] = Long.valueOf(a3);
        ngz.c("FontsSharedState", String.format(locale, "Extracting bundled assets %s in %d ms", objArr), new Object[0]);
    }

    public final ExecutorService b() {
        ExecutorService executorService;
        synchronized (this.b) {
            if (this.g == null) {
                this.g = jfb.a(4, 10);
            }
            executorService = this.g;
        }
        return executorService;
    }

    public final ScheduledExecutorService c() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (this.b) {
            if (this.h == null) {
                this.h = jfm.a(1, 10);
            }
            scheduledExecutorService = this.h;
        }
        return scheduledExecutorService;
    }

    public final nhm d(Context context) {
        nhm nhm;
        iva.a((Object) context, (Object) "context");
        synchronized (this.b) {
            nhm = this.q;
        }
        if (nhm.a()) {
            nhm = e(context);
        }
        if (nhm.a()) {
            this.k.a();
        }
        return nhm;
    }

    public final nhm e(Context context) {
        nhm nhm;
        synchronized (this.b) {
            nhm = this.q;
        }
        Context applicationContext = context.getApplicationContext();
        int i2 = nhm.a.b;
        ngm c2 = c(applicationContext);
        nfv nfv = null;
        if (c2.b.exists()) {
            File[] listFiles = c2.b.listFiles(ngk.a);
            if (listFiles != null) {
                Arrays.sort(listFiles, new ngl());
                int length = listFiles.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    File file = listFiles[i3];
                    File file2 = new File(file, "directory.pb");
                    ngz.c("FontDisk", "Consider %s", file2);
                    try {
                        int parseInt = Integer.parseInt(file.getName());
                        if (file2.exists() && parseInt > i2) {
                            ngz.c("FontDisk", "Checking %s", file2);
                            try {
                                nfv = nhg.a(anne.b(file2));
                                break;
                            } catch (IOException | IllegalArgumentException | IllegalStateException | NullPointerException e2) {
                                ngz.a("FontDisk", e2, "Directory parsing failed for %s", file2.getPath());
                            }
                        }
                    } catch (NumberFormatException e3) {
                        ngz.a("FontDisk", "Invalid directory %s exists", file);
                    }
                    i3++;
                }
            } else {
                ngz.c("FontDisk", "Directory path is deemed invalid: %s", c2.b);
            }
        } else {
            ngz.c("FontDisk", "No directory at %s", c2.b);
        }
        if (nfv != null) {
            ngz.b("FontsSharedState", "Updating from directory version %d to %d from disk", Integer.valueOf(i2), Integer.valueOf(nfv.b));
            nhm = new nhm(nfv);
        } else {
            ngz.b("FontsSharedState", "No directory on disk newer than version %d", Integer.valueOf(i2));
        }
        synchronized (this.b) {
            int i4 = nhm.a.b;
            nhm nhm2 = this.q;
            int i5 = nhm2.a.b;
            if (i4 <= i5) {
                return nhm2;
            }
            ngz.c("FontsSharedState", "Updating directory from v%d to v%d", Integer.valueOf(i5), Integer.valueOf(nhm.a.b));
            this.q = nhm;
            nhn nhn = new nhn(this.q);
            this.r = nhn;
            nhf nhf = this.e;
            if (nhf != null) {
                nhf.a(nhn);
            }
            nhm nhm3 = this.q;
            return nhm3;
        }
    }

    public nhz(byte[] bArr) {
        this.b = new Object();
        this.q = new nhm(nfv.c);
    }

    public final ngm c(Context context) {
        ngm ngm;
        iva.a((Object) context, (Object) "context");
        synchronized (this.b) {
            if (this.d == null) {
                Context applicationContext = context.getApplicationContext();
                this.d = new ngm(applicationContext, b(applicationContext), b(), a(applicationContext), axiu.d(), axiu.a.a().h(), axiu.c());
            }
            ngm = this.d;
        }
        return ngm;
    }

    public final ngh b(Context context) {
        ngh ngh;
        synchronized (this.b) {
            if (this.f == null) {
                this.f = new ngh(context.getApplicationContext());
            }
            ngh = this.f;
        }
        return ngh;
    }

    public final void d() {
        this.l = axir.d();
        this.n = axiu.a.a().e();
        this.m = axiu.c();
        this.o = axiu.d();
        this.p = axio.b();
    }

    public final ngy a(Context context) {
        ngy ngy;
        iva.a((Object) context, (Object) "context");
        synchronized (this.b) {
            if (this.c == null) {
                this.c = new ngy(context.getApplicationContext());
            }
            ngy = this.c;
        }
        return ngy;
    }

    public final nhf a() {
        nhf nhf;
        synchronized (this.b) {
            nhf = this.e;
        }
        return nhf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4 = r1.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r4 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r4 = new defpackage.ngs(r15, r2, r10, r0);
        r1.i = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r4 = r1.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r1.k != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r1.k = new defpackage.nhy(r1, r9, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        r0 = r1.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        r14 = a(r10);
        r12 = c(r10);
        r3 = r1.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        if (defpackage.axio.b() != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005a, code lost:
        r4 = r1.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
        if (r4 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        r1.j = new defpackage.ngd(r15, r2, r12, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0065, code lost:
        r2 = r1.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0068, code lost:
        r18 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006b, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006c, code lost:
        r18 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006e, code lost:
        d();
        r2 = r1.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0073, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0078, code lost:
        if (r1.e != null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007a, code lost:
        defpackage.ngz.c("FontsSharedState", "Creating a FontServer using %s for downloads", r13.getClass().getSimpleName());
        r11 = new defpackage.nhf(r12, r13, r14, r15, r0, r1.s, r18);
        r1.e = r11;
        r0 = r1.r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
        if (r0 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009f, code lost:
        r11.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a2, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a7, code lost:
        if (defpackage.axio.b() == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a9, code lost:
        defpackage.ngz.c("FontsSharedState", "Starting pre extraction of bundled fonts", new java.lang.Object[0]);
        r11 = defpackage.amsn.b(defpackage.ampt.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r2 = new defpackage.nhm(defpackage.nhg.a(defpackage.anmr.a(r25.getResources().getAssets().open("googlesansdirectory.pb"))));
        r3 = r2.a.b;
        r4 = new java.lang.StringBuilder(40);
        r4.append("Bundled directory version is ");
        r4.append(r3);
        defpackage.ngz.c("FontsSharedState", r4.toString(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f3, code lost:
        defpackage.ngz.a("FontsSharedState", (java.lang.Throwable) r0, "Exception in extracting bundled directory", new java.lang.Object[0]);
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r15 = b();
        r2 = c();
        r3 = r1.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        monitor-enter(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r25, java.lang.Runnable r26) {
        /*
            r24 = this;
            r1 = r24
            r9 = r25
            r0 = r26
            java.lang.String r2 = "context"
            defpackage.iva.a((java.lang.Object) r9, (java.lang.Object) r2)
            android.content.Context r10 = r25.getApplicationContext()
            java.lang.Object r2 = r1.b
            monitor-enter(r2)
            nhf r3 = r1.e     // Catch:{ all -> 0x025a }
            if (r3 != 0) goto L_0x0258
            java.lang.String r3 = "resultPump"
            defpackage.iva.a((java.lang.Object) r0, (java.lang.Object) r3)     // Catch:{ all -> 0x025a }
            monitor-exit(r2)     // Catch:{ all -> 0x025a }
            java.util.concurrent.ExecutorService r15 = r24.b()
            java.util.concurrent.ScheduledExecutorService r2 = r24.c()
            java.lang.Object r3 = r1.b
            monitor-enter(r3)
            ngo r4 = r1.i     // Catch:{ all -> 0x0255 }
            if (r4 != 0) goto L_0x0035
            ngs r4 = new ngs     // Catch:{ all -> 0x0255 }
            r4.<init>(r15, r2, r10, r0)     // Catch:{ all -> 0x0255 }
            r1.i = r4     // Catch:{ all -> 0x0255 }
            monitor-exit(r3)     // Catch:{ all -> 0x0255 }
            r13 = r4
            goto L_0x0037
        L_0x0035:
            monitor-exit(r3)     // Catch:{ all -> 0x0255 }
            r13 = r4
        L_0x0037:
            java.lang.Object r4 = r1.b
            monitor-enter(r4)
            nhy r0 = r1.k     // Catch:{ all -> 0x0252 }
            if (r0 != 0) goto L_0x0045
            nhy r0 = new nhy     // Catch:{ all -> 0x0252 }
            r0.<init>(r1, r9, r13)     // Catch:{ all -> 0x0252 }
            r1.k = r0     // Catch:{ all -> 0x0252 }
        L_0x0045:
            nhy r0 = r1.k     // Catch:{ all -> 0x0252 }
            monitor-exit(r4)     // Catch:{ all -> 0x0252 }
            ngy r14 = r1.a(r10)
            ngm r12 = r1.c(r10)
            java.lang.Object r3 = r1.b
            monitor-enter(r3)
            boolean r4 = defpackage.axio.b()     // Catch:{ all -> 0x024f }
            if (r4 != 0) goto L_0x005a
            goto L_0x0065
        L_0x005a:
            nge r4 = r1.j     // Catch:{ all -> 0x024f }
            if (r4 != 0) goto L_0x006b
            ngd r4 = new ngd     // Catch:{ all -> 0x024f }
            r4.<init>(r15, r2, r12, r9)     // Catch:{ all -> 0x024f }
            r1.j = r4     // Catch:{ all -> 0x024f }
        L_0x0065:
            nge r2 = r1.j     // Catch:{ all -> 0x024f }
            monitor-exit(r3)     // Catch:{ all -> 0x024f }
            r18 = r2
            goto L_0x006e
        L_0x006b:
            monitor-exit(r3)     // Catch:{ all -> 0x024f }
            r18 = r4
        L_0x006e:
            r24.d()
            java.lang.Object r2 = r1.b
            monitor-enter(r2)
            nhf r3 = r1.e     // Catch:{ all -> 0x024c }
            r8 = 1
            r7 = 0
            if (r3 != 0) goto L_0x00a2
            java.lang.String r3 = "FontsSharedState"
            java.lang.String r4 = "Creating a FontServer using %s for downloads"
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x024c }
            java.lang.Class r6 = r13.getClass()     // Catch:{ all -> 0x024c }
            java.lang.String r6 = r6.getSimpleName()     // Catch:{ all -> 0x024c }
            r5[r7] = r6     // Catch:{ all -> 0x024c }
            defpackage.ngz.c(r3, r4, r5)     // Catch:{ all -> 0x024c }
            nhf r3 = new nhf     // Catch:{ all -> 0x024c }
            nhn r4 = r1.s     // Catch:{ all -> 0x024c }
            r11 = r3
            r16 = r0
            r17 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x024c }
            r1.e = r3     // Catch:{ all -> 0x024c }
            nhn r0 = r1.r     // Catch:{ all -> 0x024c }
            if (r0 == 0) goto L_0x00a2
            r3.a((defpackage.nhn) r0)     // Catch:{ all -> 0x024c }
        L_0x00a2:
            monitor-exit(r2)     // Catch:{ all -> 0x024c }
            boolean r0 = defpackage.axio.b()
            if (r0 == 0) goto L_0x0248
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r2 = "FontsSharedState"
            java.lang.String r3 = "Starting pre extraction of bundled fonts"
            defpackage.ngz.c(r2, r3, r0)
            amtd r0 = defpackage.ampt.a
            amsn r11 = defpackage.amsn.b(r0)
            android.content.res.Resources r0 = r25.getResources()     // Catch:{ IOException -> 0x00f2 }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x00f2 }
            java.lang.String r2 = "googlesansdirectory.pb"
            java.io.InputStream r0 = r0.open(r2)     // Catch:{ IOException -> 0x00f2 }
            nhm r2 = new nhm     // Catch:{ IOException -> 0x00f2 }
            byte[] r0 = defpackage.anmr.a((java.io.InputStream) r0)     // Catch:{ IOException -> 0x00f2 }
            nfv r0 = defpackage.nhg.a(r0)     // Catch:{ IOException -> 0x00f2 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x00f2 }
            java.lang.String r0 = "FontsSharedState"
            nfv r3 = r2.a     // Catch:{ IOException -> 0x00f2 }
            int r3 = r3.b     // Catch:{ IOException -> 0x00f2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00f2 }
            r5 = 40
            r4.<init>(r5)     // Catch:{ IOException -> 0x00f2 }
            java.lang.String r5 = "Bundled directory version is "
            r4.append(r5)     // Catch:{ IOException -> 0x00f2 }
            r4.append(r3)     // Catch:{ IOException -> 0x00f2 }
            java.lang.String r3 = r4.toString()     // Catch:{ IOException -> 0x00f2 }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x00f2 }
            defpackage.ngz.c(r0, r3, r4)     // Catch:{ IOException -> 0x00f2 }
            goto L_0x00fd
        L_0x00f2:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r3 = "FontsSharedState"
            java.lang.String r4 = "Exception in extracting bundled directory"
            defpackage.ngz.a((java.lang.String) r3, (java.lang.Throwable) r0, (java.lang.String) r4, (java.lang.Object[]) r2)
            r2 = 0
        L_0x00fd:
            if (r2 == 0) goto L_0x0242
            nhn r0 = new nhn
            r0.<init>(r2)
            nhv r12 = new nhv
            java.lang.String r3 = "context"
            defpackage.iva.a((java.lang.Object) r9, (java.lang.Object) r3)
            java.lang.Object r3 = r1.b
            monitor-enter(r3)
            nge r4 = r1.j     // Catch:{ all -> 0x023f }
            monitor-exit(r3)     // Catch:{ all -> 0x023f }
            java.util.concurrent.ExecutorService r5 = r24.b()
            ngm r6 = r24.c(r25)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r3 = 44
            amsk r3 = defpackage.amsk.a((char) r3)
            amsk r3 = r3.a()
            amsk r3 = r3.b()
            axiu r14 = defpackage.axiu.a
            axiv r14 = r14.a()
            java.lang.String r14 = r14.a()
            java.util.List r3 = r3.c(r14)
            nfv r2 = r2.a
            aucx r2 = r2.a
            int r14 = r2.size()
            r15 = 0
        L_0x0143:
            if (r15 >= r14) goto L_0x01bc
            java.lang.Object r16 = r2.get(r15)
            r7 = r16
            nfz r7 = (defpackage.nfz) r7
            aucx r8 = r7.d
            r17 = r2
            int r2 = r8.size()
            r18 = r14
            r14 = 0
        L_0x0158:
            int r19 = r15 + 1
            if (r14 >= r2) goto L_0x01ae
            java.lang.Object r19 = r8.get(r14)
            r20 = r2
            r2 = r19
            nfy r2 = (defpackage.nfy) r2
            r21 = r8
            java.lang.String r8 = r7.b
            java.lang.String r8 = defpackage.ngm.a((java.lang.String) r8, (defpackage.nfy) r2)
            boolean r19 = r3.contains(r8)
            if (r19 != 0) goto L_0x017c
            r22 = r3
            r23 = r15
            r15 = 1
            r16 = 0
            goto L_0x01a3
        L_0x017c:
            r22 = r3
            ngm r3 = r24.c(r25)
            r23 = r15
            r15 = 1
            java.io.File r3 = r3.a((defpackage.nfz) r7, (defpackage.nfy) r2, (boolean) r15)
            if (r3 == 0) goto L_0x0199
            java.lang.Object[] r2 = new java.lang.Object[r15]
            r16 = 0
            r2[r16] = r8
            java.lang.String r3 = "FontsSharedState"
            java.lang.String r8 = "%s already present on disk; extraction not required"
            defpackage.ngz.c(r3, r8, r2)
            goto L_0x01a3
        L_0x0199:
            r16 = 0
            oq r3 = new oq
            r3.<init>(r7, r2)
            r13.add(r3)
        L_0x01a3:
            int r14 = r14 + 1
            r2 = r20
            r8 = r21
            r3 = r22
            r15 = r23
            goto L_0x0158
        L_0x01ae:
            r22 = r3
            r15 = 1
            r16 = 0
            r2 = r17
            r14 = r18
            r15 = r19
            r7 = 0
            r8 = 1
            goto L_0x0143
        L_0x01bc:
            r15 = 1
            r16 = 0
            r2 = r12
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r25
            r14 = 0
            r7 = r11
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.Object r2 = r1.b
            monitor-enter(r2)
            nhv r3 = r1.t     // Catch:{ all -> 0x023c }
            if (r3 != 0) goto L_0x01d3
            goto L_0x01dd
        L_0x01d3:
            java.lang.Object r4 = r3.b     // Catch:{ all -> 0x023c }
            monitor-enter(r4)     // Catch:{ all -> 0x023c }
            int r3 = r3.d     // Catch:{ all -> 0x0239 }
            monitor-exit(r4)     // Catch:{ all -> 0x0239 }
            if (r3 != 0) goto L_0x01dd
            monitor-exit(r2)     // Catch:{ all -> 0x023c }
            goto L_0x0248
        L_0x01dd:
            r1.s = r0     // Catch:{ all -> 0x023c }
            nhf r3 = r1.e     // Catch:{ all -> 0x023c }
            java.lang.String r4 = "FontsServer"
            java.lang.String r5 = "setResolver. Null? %s"
            java.lang.Object[] r6 = new java.lang.Object[r15]     // Catch:{ all -> 0x023c }
            if (r0 != 0) goto L_0x01eb
            r8 = 1
            goto L_0x01ec
        L_0x01eb:
            r8 = 0
        L_0x01ec:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x023c }
            r6[r14] = r7     // Catch:{ all -> 0x023c }
            defpackage.ngz.c(r4, r5, r6)     // Catch:{ all -> 0x023c }
            java.lang.Object r4 = r3.e     // Catch:{ all -> 0x023c }
            monitor-enter(r4)     // Catch:{ all -> 0x023c }
            r3.k = r0     // Catch:{ all -> 0x0236 }
            monitor-exit(r4)     // Catch:{ all -> 0x0236 }
            nhf r0 = r1.e     // Catch:{ all -> 0x023c }
            long r3 = defpackage.axiu.b()     // Catch:{ all -> 0x023c }
            java.lang.Object r5 = r0.e     // Catch:{ all -> 0x023c }
            monitor-enter(r5)     // Catch:{ all -> 0x023c }
            r0.i = r3     // Catch:{ all -> 0x0233 }
            monitor-exit(r5)     // Catch:{ all -> 0x0233 }
            r1.t = r12     // Catch:{ all -> 0x023c }
            monitor-exit(r2)     // Catch:{ all -> 0x023c }
            java.util.concurrent.ScheduledExecutorService r0 = r24.c()
            java.util.List r2 = r12.a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0220
            r0 = 23515(0x5bdb, float:3.2952E-41)
            r12.a((int) r0)
            a(r9, r11, r0, r14)
            goto L_0x0248
        L_0x0220:
            nhw r2 = new nhw
            r2.<init>(r12)
            r3 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r2, r3, r5)
            r12.c = r0
            r12.a()
            goto L_0x0248
        L_0x0233:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0233 }
            throw r0     // Catch:{ all -> 0x023c }
        L_0x0236:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0236 }
            throw r0     // Catch:{ all -> 0x023c }
        L_0x0239:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0239 }
            throw r0     // Catch:{ all -> 0x023c }
        L_0x023c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x023c }
            throw r0
        L_0x023f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x023f }
            throw r0
        L_0x0242:
            r14 = 0
            r0 = 23514(0x5bda, float:3.295E-41)
            a(r9, r11, r0, r14)
        L_0x0248:
            r1.d(r10)
            return
        L_0x024c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x024c }
            throw r0
        L_0x024f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x024f }
            throw r0
        L_0x0252:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0252 }
            throw r0
        L_0x0255:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0255 }
            throw r0
        L_0x0258:
            monitor-exit(r2)     // Catch:{ all -> 0x025a }
            return
        L_0x025a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x025a }
            goto L_0x025e
        L_0x025d:
            throw r0
        L_0x025e:
            goto L_0x025d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhz.a(android.content.Context, java.lang.Runnable):void");
    }
}
