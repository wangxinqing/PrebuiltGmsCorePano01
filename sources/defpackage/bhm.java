package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import com.google.ads.afma.proto2api.c;
import com.google.android.ads.tasks.u;
import com.google.android.gms.ads.identifier.d;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bhm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bhm {
    public final Context a;
    public ExecutorService b;
    public DexClassLoader c;
    public bgt d;
    public byte[] e;
    public volatile d f = null;
    public volatile boolean g;
    public Future h;
    public final boolean i;
    public volatile c j;
    public Future k;
    public bgm l;
    public boolean m;
    public boolean n;
    public boolean o;
    public bhf p;
    private final Map q;

    static {
        bhm.class.getSimpleName();
    }

    public bhm(Context context) {
        boolean z = false;
        this.g = false;
        this.h = null;
        this.j = null;
        this.k = null;
        this.m = false;
        this.n = false;
        this.o = false;
        Context applicationContext = context.getApplicationContext();
        z = applicationContext != null ? true : z;
        this.i = z;
        this.a = z ? applicationContext : context;
        this.q = new HashMap();
        if (this.p == null) {
            this.p = new bhf(this.a);
        }
    }

    public static final void a(File file) {
        if (!file.exists()) {
            new Object[1][0] = file.getAbsolutePath();
        } else {
            file.delete();
        }
    }

    public final int b() {
        if (this.l == null) {
            return Integer.MIN_VALUE;
        }
        try {
            int i2 = Build.VERSION.SDK_INT;
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException e2) {
            if (bgm.e == null) {
                synchronized (bgm.class) {
                    if (bgm.e == null) {
                        bgm.e = new Random();
                    }
                }
            }
            return bgm.e.nextInt();
        }
    }

    public static final void a(String str) {
        a(new File(str));
    }

    public final d a() {
        Future future;
        if (!this.g) {
            return null;
        }
        if (this.f == null && (future = this.h) != null) {
            try {
                future.get(2000, TimeUnit.MILLISECONDS);
                this.h = null;
            } catch (InterruptedException | ExecutionException e2) {
            } catch (TimeoutException e3) {
                this.h.cancel(true);
            }
        }
        return this.f;
    }

    public final Method a(String str, String str2) {
        u uVar = (u) this.q.get(new Pair(str, str2));
        if (uVar == null) {
            return null;
        }
        if (uVar.d != null) {
            return uVar.d;
        }
        try {
            if (uVar.f.await(2, TimeUnit.SECONDS)) {
                return uVar.d;
            }
            return null;
        } catch (InterruptedException e2) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e6 A[SYNTHETIC, Splitter:B:58:0x00e6] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ed A[SYNTHETIC, Splitter:B:62:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fb A[SYNTHETIC, Splitter:B:69:0x00fb] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0102 A[SYNTHETIC, Splitter:B:73:0x0102] */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.io.File r9, java.lang.String r10) {
        /*
            r8 = this;
            java.io.File r0 = new java.io.File
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r9
            r4 = 1
            r2[r4] = r10
            java.lang.String r5 = "%s/%s.tmp"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x0108
            java.io.File r2 = new java.io.File
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r9
            r1[r4] = r10
            java.lang.String r9 = "%s/%s.dex"
            java.lang.String r9 = java.lang.String.format(r9, r1)
            r2.<init>(r9)
            boolean r9 = r2.exists()
            if (r9 != 0) goto L_0x0108
            r9 = 0
            long r4 = r0.length()     // Catch:{ IOException -> 0x00f7, NoSuchAlgorithmException -> 0x00f5, bgs -> 0x00f3, all -> 0x00e2 }
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x00de
            int r1 = (int) r4     // Catch:{ IOException -> 0x00f7, NoSuchAlgorithmException -> 0x00f5, bgs -> 0x00f3, all -> 0x00e2 }
            byte[] r1 = new byte[r1]     // Catch:{ IOException -> 0x00f7, NoSuchAlgorithmException -> 0x00f5, bgs -> 0x00f3, all -> 0x00e2 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00f7, NoSuchAlgorithmException -> 0x00f5, bgs -> 0x00f3, all -> 0x00e2 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00f7, NoSuchAlgorithmException -> 0x00f5, bgs -> 0x00f3, all -> 0x00e2 }
            int r5 = r4.read(r1)     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            if (r5 <= 0) goto L_0x00c9
            aubs r5 = defpackage.aubs.c()     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            com.google.ads.afma.proto2api.d r6 = com.google.ads.afma.proto2api.d.f     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            aucj r1 = defpackage.aucj.a((defpackage.aucj) r6, (byte[]) r1, (defpackage.aubs) r5)     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            com.google.ads.afma.proto2api.d r1 = (com.google.ads.afma.proto2api.d) r1     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            auay r6 = r1.d     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            byte[] r6 = r6.k()     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            boolean r10 = r10.equals(r5)     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            if (r10 == 0) goto L_0x00c0
            auay r10 = r1.c     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            byte[] r10 = r10.k()     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            auay r5 = r1.b     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            byte[] r5 = r5.k()     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            byte[] r5 = defpackage.bfu.a((byte[]) r5)     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            boolean r10 = java.util.Arrays.equals(r10, r5)     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            if (r10 == 0) goto L_0x00c0
            auay r10 = r1.e     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            byte[] r10 = r10.k()     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            java.lang.String r5 = android.os.Build.VERSION.SDK     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            byte[] r5 = r5.getBytes()     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            boolean r10 = java.util.Arrays.equals(r10, r5)     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            if (r10 == 0) goto L_0x00c0
            byte[] r10 = r8.e     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            auay r1 = r1.b     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            byte[] r1 = r1.k()     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            byte[] r10 = defpackage.bgt.a((byte[]) r10, (java.lang.String) r0)     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            r2.createNewFile()     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            int r9 = r10.length     // Catch:{ IOException -> 0x00be, NoSuchAlgorithmException -> 0x00bc, bgs -> 0x00ba, all -> 0x00b7 }
            r0.write(r10, r3, r9)     // Catch:{ IOException -> 0x00be, NoSuchAlgorithmException -> 0x00bc, bgs -> 0x00ba, all -> 0x00b7 }
            r4.close()     // Catch:{ IOException -> 0x00b0 }
            goto L_0x00b1
        L_0x00b0:
            r9 = move-exception
        L_0x00b1:
            r0.close()     // Catch:{ IOException -> 0x00b5 }
            return
        L_0x00b5:
            r9 = move-exception
            return
        L_0x00b7:
            r9 = move-exception
            r10 = r9
            goto L_0x00d4
        L_0x00ba:
            r9 = move-exception
            goto L_0x00dc
        L_0x00bc:
            r9 = move-exception
            goto L_0x00dc
        L_0x00be:
            r9 = move-exception
            goto L_0x00dc
        L_0x00c0:
            a((java.io.File) r0)     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            r4.close()     // Catch:{ IOException -> 0x00c7 }
            return
        L_0x00c7:
            r9 = move-exception
            return
        L_0x00c9:
            a((java.io.File) r0)     // Catch:{ IOException -> 0x00da, NoSuchAlgorithmException -> 0x00d8, bgs -> 0x00d6, all -> 0x00d2 }
            r4.close()     // Catch:{ IOException -> 0x00d0 }
            return
        L_0x00d0:
            r9 = move-exception
            return
        L_0x00d2:
            r10 = move-exception
            r0 = r9
        L_0x00d4:
            r9 = r4
            goto L_0x00e4
        L_0x00d6:
            r10 = move-exception
            goto L_0x00db
        L_0x00d8:
            r10 = move-exception
            goto L_0x00db
        L_0x00da:
            r10 = move-exception
        L_0x00db:
            r0 = r9
        L_0x00dc:
            r9 = r4
            goto L_0x00f9
        L_0x00de:
            a((java.io.File) r0)     // Catch:{ IOException -> 0x00f7, NoSuchAlgorithmException -> 0x00f5, bgs -> 0x00f3, all -> 0x00e2 }
            return
        L_0x00e2:
            r10 = move-exception
            r0 = r9
        L_0x00e4:
            if (r9 == 0) goto L_0x00eb
            r9.close()     // Catch:{ IOException -> 0x00ea }
            goto L_0x00eb
        L_0x00ea:
            r9 = move-exception
        L_0x00eb:
            if (r0 == 0) goto L_0x00f2
            r0.close()     // Catch:{ IOException -> 0x00f1 }
            goto L_0x00f2
        L_0x00f1:
            r9 = move-exception
        L_0x00f2:
            throw r10
        L_0x00f3:
            r10 = move-exception
            goto L_0x00f8
        L_0x00f5:
            r10 = move-exception
            goto L_0x00f8
        L_0x00f7:
            r10 = move-exception
        L_0x00f8:
            r0 = r9
        L_0x00f9:
            if (r9 == 0) goto L_0x0100
            r9.close()     // Catch:{ IOException -> 0x00ff }
            goto L_0x0100
        L_0x00ff:
            r9 = move-exception
        L_0x0100:
            if (r0 == 0) goto L_0x0107
            r0.close()     // Catch:{ IOException -> 0x0106 }
            return
        L_0x0106:
            r9 = move-exception
        L_0x0107:
            return
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhm.b(java.io.File, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (this.n) {
            Future<?> submit = this.b.submit(new bhk(this, i2));
            if (i2 == 0) {
                this.k = submit;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0132 A[SYNTHETIC, Splitter:B:53:0x0132] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0139 A[SYNTHETIC, Splitter:B:57:0x0139] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014a A[SYNTHETIC, Splitter:B:65:0x014a] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0151 A[SYNTHETIC, Splitter:B:69:0x0151] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.io.File r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = "test"
            java.io.File r1 = new java.io.File
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r12
            r5 = 1
            r3[r5] = r13
            java.lang.String r6 = "%s/%s.tmp"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            r1.<init>(r3)
            boolean r3 = r1.exists()
            if (r3 != 0) goto L_0x0157
            java.io.File r3 = new java.io.File
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r4] = r12
            r6[r5] = r13
            java.lang.String r12 = "%s/%s.dex"
            java.lang.String r12 = java.lang.String.format(r12, r6)
            r3.<init>(r12)
            boolean r12 = r3.exists()
            if (r12 == 0) goto L_0x0157
            long r6 = r3.length()
            r8 = 0
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x0157
            int r12 = (int) r6
            byte[] r12 = new byte[r12]
            r6 = 0
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0146, NoSuchAlgorithmException -> 0x0144, bgs -> 0x0142, all -> 0x012d }
            r7.<init>(r3)     // Catch:{ IOException -> 0x0146, NoSuchAlgorithmException -> 0x0144, bgs -> 0x0142, all -> 0x012d }
            int r8 = r7.read(r12)     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            if (r8 <= 0) goto L_0x011a
            java.io.PrintStream r8 = java.lang.System.out     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r8.print(r0)     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            java.io.PrintStream r8 = java.lang.System.out     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r8.print(r0)     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            java.io.PrintStream r8 = java.lang.System.out     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r8.print(r0)     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            com.google.ads.afma.proto2api.d r0 = com.google.ads.afma.proto2api.d.f     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            aucd r0 = r0.o()     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            java.lang.String r8 = android.os.Build.VERSION.SDK     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            byte[] r8 = r8.getBytes()     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            auay r8 = defpackage.auay.a((byte[]) r8)     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            boolean r9 = r0.c     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            if (r9 != 0) goto L_0x0070
            goto L_0x0075
        L_0x0070:
            r0.c()     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r0.c = r4     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
        L_0x0075:
            aucj r9 = r0.b     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            com.google.ads.afma.proto2api.d r9 = (com.google.ads.afma.proto2api.d) r9     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r8.getClass()     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            int r10 = r9.a     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r10 = r10 | 8
            r9.a = r10     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r9.e = r8     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            byte[] r13 = r13.getBytes()     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            auay r13 = defpackage.auay.a((byte[]) r13)     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            boolean r8 = r0.c     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            if (r8 != 0) goto L_0x0091
            goto L_0x0096
        L_0x0091:
            r0.c()     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r0.c = r4     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
        L_0x0096:
            aucj r8 = r0.b     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            com.google.ads.afma.proto2api.d r8 = (com.google.ads.afma.proto2api.d) r8     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r13.getClass()     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            int r9 = r8.a     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r9 = r9 | 4
            r8.a = r9     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r8.d = r13     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            byte[] r13 = r11.e     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            java.lang.String r12 = defpackage.bgt.a((byte[]) r13, (byte[]) r12)     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            byte[] r12 = r12.getBytes()     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            auay r13 = defpackage.auay.a((byte[]) r12)     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            boolean r8 = r0.c     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            if (r8 != 0) goto L_0x00b8
            goto L_0x00bd
        L_0x00b8:
            r0.c()     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r0.c = r4     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
        L_0x00bd:
            aucj r8 = r0.b     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            com.google.ads.afma.proto2api.d r8 = (com.google.ads.afma.proto2api.d) r8     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r13.getClass()     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            int r9 = r8.a     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r5 = r5 | r9
            r8.a = r5     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r8.b = r13     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            byte[] r12 = defpackage.bfu.a((byte[]) r12)     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            auay r12 = defpackage.auay.a((byte[]) r12)     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            boolean r13 = r0.c     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            if (r13 != 0) goto L_0x00d8
            goto L_0x00dd
        L_0x00d8:
            r0.c()     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r0.c = r4     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
        L_0x00dd:
            aucj r13 = r0.b     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            com.google.ads.afma.proto2api.d r13 = (com.google.ads.afma.proto2api.d) r13     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r12.getClass()     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            int r5 = r13.a     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r2 = r2 | r5
            r13.a = r2     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r13.c = r12     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r1.createNewFile()     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            r12.<init>(r1)     // Catch:{ IOException -> 0x0129, NoSuchAlgorithmException -> 0x0127, bgs -> 0x0125, all -> 0x0120 }
            aucj r13 = r0.i()     // Catch:{ IOException -> 0x0118, NoSuchAlgorithmException -> 0x0116, bgs -> 0x0114, all -> 0x0112 }
            com.google.ads.afma.proto2api.d r13 = (com.google.ads.afma.proto2api.d) r13     // Catch:{ IOException -> 0x0118, NoSuchAlgorithmException -> 0x0116, bgs -> 0x0114, all -> 0x0112 }
            byte[] r13 = r13.k()     // Catch:{ IOException -> 0x0118, NoSuchAlgorithmException -> 0x0116, bgs -> 0x0114, all -> 0x0112 }
            int r0 = r13.length     // Catch:{ IOException -> 0x0118, NoSuchAlgorithmException -> 0x0116, bgs -> 0x0114, all -> 0x0112 }
            r12.write(r13, r4, r0)     // Catch:{ IOException -> 0x0118, NoSuchAlgorithmException -> 0x0116, bgs -> 0x0114, all -> 0x0112 }
            r12.close()     // Catch:{ IOException -> 0x0118, NoSuchAlgorithmException -> 0x0116, bgs -> 0x0114, all -> 0x0112 }
            r7.close()     // Catch:{ IOException -> 0x0108 }
            goto L_0x0109
        L_0x0108:
            r13 = move-exception
        L_0x0109:
            r12.close()     // Catch:{ IOException -> 0x010d }
            goto L_0x010e
        L_0x010d:
            r12 = move-exception
        L_0x010e:
            a((java.io.File) r3)
            return
        L_0x0112:
            r13 = move-exception
            goto L_0x0123
        L_0x0114:
            r13 = move-exception
            goto L_0x012b
        L_0x0116:
            r13 = move-exception
            goto L_0x012b
        L_0x0118:
            r13 = move-exception
            goto L_0x012b
        L_0x011a:
            r7.close()     // Catch:{ IOException -> 0x011e }
            goto L_0x010e
        L_0x011e:
            r12 = move-exception
            goto L_0x010e
        L_0x0120:
            r12 = move-exception
            r13 = r12
            r12 = r6
        L_0x0123:
            r6 = r7
            goto L_0x0130
        L_0x0125:
            r12 = move-exception
            goto L_0x012a
        L_0x0127:
            r12 = move-exception
            goto L_0x012a
        L_0x0129:
            r12 = move-exception
        L_0x012a:
            r12 = r6
        L_0x012b:
            r6 = r7
            goto L_0x0148
        L_0x012d:
            r12 = move-exception
            r13 = r12
            r12 = r6
        L_0x0130:
            if (r6 == 0) goto L_0x0137
            r6.close()     // Catch:{ IOException -> 0x0136 }
            goto L_0x0137
        L_0x0136:
            r0 = move-exception
        L_0x0137:
            if (r12 == 0) goto L_0x013e
            r12.close()     // Catch:{ IOException -> 0x013d }
            goto L_0x013e
        L_0x013d:
            r12 = move-exception
        L_0x013e:
            a((java.io.File) r3)
            throw r13
        L_0x0142:
            r12 = move-exception
            goto L_0x0147
        L_0x0144:
            r12 = move-exception
            goto L_0x0147
        L_0x0146:
            r12 = move-exception
        L_0x0147:
            r12 = r6
        L_0x0148:
            if (r6 == 0) goto L_0x014f
            r6.close()     // Catch:{ IOException -> 0x014e }
            goto L_0x014f
        L_0x014e:
            r13 = move-exception
        L_0x014f:
            if (r12 == 0) goto L_0x010e
            r12.close()     // Catch:{ IOException -> 0x0155 }
            goto L_0x010e
        L_0x0155:
            r12 = move-exception
            goto L_0x010e
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhm.a(java.io.File, java.lang.String):void");
    }

    public final void a(String str, String str2, Class... clsArr) {
        if (!this.q.containsKey(new Pair(str, str2))) {
            this.q.put(new Pair(str, str2), new u(this, str, str2, clsArr));
        }
    }
}
