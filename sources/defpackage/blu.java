package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseBooleanArray;
import com.google.android.chimera.FragmentTransaction;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: blu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class blu extends bjx {
    public static final ReadWriteLock e = new ReentrantReadWriteLock(true);
    public static final Object f = new Object();
    private static volatile blu g;
    private static final Object h = new Object();

    private blu(Context context) {
        super(context, "current_fileapks.pb");
    }

    public static blu a(Context context) {
        blu blu = g;
        if (blu == null) {
            synchronized (blu.class) {
                blu = g;
                if (blu == null) {
                    blu = new blu(context);
                    g = blu;
                }
            }
        }
        return blu;
    }

    static File b(File file) {
        return new File(file, "current_fileapks.pb");
    }

    static bpe l() {
        aucd o = bpe.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        bpe bpe = (bpe) o.b;
        bpe.a |= 1;
        bpe.b = 7;
        return (bpe) o.i();
    }

    public final File d() {
        return a(this.b);
    }

    public final anaf e() {
        anaf anaf = null;
        if (b()) {
            return null;
        }
        synchronized (f) {
            bpe k = k();
            anab a = anaf.a(k.c.size());
            File d = d();
            if (d != null) {
                for (bpd bpd : k.c) {
                    int a2 = bpc.a(bpd.g);
                    if (a2 != 0 && a2 == 3) {
                        for (bpf bpf : bpd.e) {
                            int binarySearch = Collections.binarySearch(k.d, bpf, blz.b);
                            if (binarySearch >= 0) {
                                bpf bpf2 = (bpf) k.d.get(binarySearch);
                                a.a(blz.a(bpf), new File(blz.b(d, bpf2.d), bpf2.b).getAbsolutePath());
                            }
                        }
                    }
                }
                anaf = a.a();
            }
        }
        return anaf;
    }

    public final String f() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 2097152).applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("FileApkMgr", "Could not find system container");
            return null;
        }
    }

    public final void g() {
        this.a.startService(new Intent("com.google.android.chimera.FileApkManager.DELETE_UNUSED_FILEAPKS").setPackage(this.a.getPackageName()));
    }

    public final List i() {
        List list;
        int a;
        e.readLock().lock();
        try {
            bln j = j();
            File file = j.b;
            bpe bpe = j.c;
            File a2 = a(file);
            if (a2 != null) {
                if (a2.isDirectory()) {
                    list = new ArrayList();
                    for (bpd bpd : bpe.c) {
                        if (bpd.i && (a = bpc.a(bpd.g)) != 0 && a == 4) {
                            list.add(bpd.h);
                        }
                    }
                    return list;
                }
            }
            Log.w("FileApkMgr", "Main modules directory could not be created.");
            list = Collections.emptyList();
            return list;
        } finally {
            e.readLock().unlock();
        }
    }

    public final bln j() {
        Context context = this.a;
        File file = this.b;
        File b = b(file);
        if (c()) {
            context = blb.a(context);
            file = bkq.a(context);
            b = b(file);
        }
        return new bln(context, file, a(context, b));
    }

    public final bpe k() {
        if (c()) {
            Context a = blb.a(this.a);
            File a2 = bkq.a(this.a);
            File file = new File(a2, "current_fileapks.pb");
            File file2 = new File(a2, "m");
            bma.a(file2);
            File a3 = bkq.a(a);
            File file3 = new File(a3, "current_fileapks.pb");
            File file4 = new File(a3, "m");
            if (file3.isFile() && file4.isDirectory()) {
                try {
                    byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
                    File[] listFiles = file4.listFiles();
                    if (listFiles != null) {
                        Set singleton = Collections.singleton("oat");
                        for (File file5 : listFiles) {
                            if (file5.isDirectory()) {
                                String name = file5.getName();
                                try {
                                    Integer.parseInt(name, 16);
                                    bma.a(file5, new File(file2, name), singleton, bArr);
                                } catch (NumberFormatException e2) {
                                }
                            }
                        }
                        bma.a(file3, file, bArr);
                    } else {
                        throw new IOException("Failed to list CE modules dir");
                    }
                } catch (IOException e3) {
                    Log.w("DPSUtils", "Migrating to Device Protected Storage failed", e3);
                    bma.a(file2);
                    blb.a(a, "current_fileapks.pb", "m");
                    d();
                }
            }
            this.d = true;
        }
        return a(this.a, b(this.b));
    }

    public final Collection h() {
        return a(-1, false, false, anfv.a);
    }

    static File a(File file) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            File file2 = new File(file, "m");
            if (!file2.isDirectory()) {
                synchronized (f) {
                    if (!file2.isDirectory()) {
                        file2.delete();
                        if (!file2.mkdir()) {
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return null;
                        }
                    }
                }
            }
            bma.c(file2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return file2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    private static void a(File file, bpf bpf, boolean z) {
        File a = blz.a(file, bpf);
        String valueOf = String.valueOf(a.getAbsolutePath());
        if (valueOf.length() == 0) {
            new String("Optimizing: ");
        } else {
            "Optimizing: ".concat(valueOf);
        }
        if (!bld.a(a, z)) {
            String valueOf2 = String.valueOf(a.getAbsolutePath());
            Log.e("FileApkMgr", valueOf2.length() == 0 ? new String("Failed to optimize: ") : "Failed to optimize: ".concat(valueOf2));
        }
        int i = bpf.f;
        if (i > 0) {
            for (String str : boq.a(a.getAbsolutePath(), i).split(File.pathSeparator)) {
                String valueOf3 = String.valueOf(str);
                if (valueOf3.length() == 0) {
                    new String("Optimizing extra dex: ");
                } else {
                    "Optimizing extra dex: ".concat(valueOf3);
                }
                if (!bld.a(new File(str), z)) {
                    String valueOf4 = String.valueOf(str);
                    Log.e("FileApkMgr", valueOf4.length() == 0 ? new String("Failed to optimize extra dex: ") : "Failed to optimize extra dex: ".concat(valueOf4));
                }
            }
        }
    }

    private final boolean a(bpe bpe, bpq bpq) {
        amzy a;
        if (a(this.b, bpe, true)) {
            if (bpq != null) {
                synchronized (bpq.b) {
                    ArrayList arrayList = bpq.d;
                    a = amzy.a((Collection) arrayList.subList(bpq.e, arrayList.size()));
                    bpq.e = bpq.d.size();
                }
                bpq.a.execute(new bpp(bpq, a));
            }
            return true;
        }
        Log.w("FileApkMgr", "Failed to write incremental config");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x029f A[Catch:{ auda -> 0x035b }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01a1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af A[Catch:{ auda -> 0x035b }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9 A[Catch:{ auda -> 0x035b }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0171 A[Catch:{ auda -> 0x035b }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ec A[Catch:{ auda -> 0x035b }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ed A[Catch:{ auda -> 0x035b }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0204 A[Catch:{ auda -> 0x035b }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x020e A[Catch:{ auda -> 0x035b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bpe a(android.content.Context r18, java.io.File r19) {
        /*
            r17 = this;
            java.lang.String r1 = "FileApkMgr"
            byte[] r0 = defpackage.bkq.a((java.io.File) r19)
            if (r0 == 0) goto L_0x0379
            bpe r2 = defpackage.bpe.f     // Catch:{ auda -> 0x035b }
            aucd r2 = r2.o()     // Catch:{ auda -> 0x035b }
            aubs r3 = defpackage.aubs.b()     // Catch:{ auda -> 0x035b }
            r2.b(r0, r3)     // Catch:{ auda -> 0x035b }
            aucj r0 = r2.b     // Catch:{ auda -> 0x035b }
            bpe r0 = (defpackage.bpe) r0     // Catch:{ auda -> 0x035b }
            int r0 = r0.b     // Catch:{ auda -> 0x035b }
            java.lang.String r3 = "file"
            r4 = 7
            r5 = 6
            r6 = 4
            r7 = 3
            r8 = 5
            r9 = 1
            r10 = 0
            if (r0 == r7) goto L_0x004e
            if (r0 == r6) goto L_0x0070
            if (r0 == r8) goto L_0x004b
            if (r0 == r5) goto L_0x01fe
            if (r0 == r4) goto L_0x0231
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ auda -> 0x035b }
            r3 = 89
            r2.<init>(r3)     // Catch:{ auda -> 0x035b }
            java.lang.String r3 = "Stored Staged Apks config has different version (current=7, stored="
            r2.append(r3)     // Catch:{ auda -> 0x035b }
            r2.append(r0)     // Catch:{ auda -> 0x035b }
            java.lang.String r0 = "), ignoring"
            r2.append(r0)     // Catch:{ auda -> 0x035b }
            java.lang.String r0 = r2.toString()     // Catch:{ auda -> 0x035b }
            android.util.Log.w(r1, r0)     // Catch:{ auda -> 0x035b }
            goto L_0x0379
        L_0x004b:
            r0 = 0
            goto L_0x01dc
        L_0x004e:
            r0 = 0
        L_0x004f:
            aucj r11 = r2.b     // Catch:{ auda -> 0x035b }
            bpe r11 = (defpackage.bpe) r11     // Catch:{ auda -> 0x035b }
            aucx r11 = r11.c     // Catch:{ auda -> 0x035b }
            int r11 = r11.size()     // Catch:{ auda -> 0x035b }
            if (r0 < r11) goto L_0x02f0
            boolean r0 = r2.c     // Catch:{ auda -> 0x035b }
            if (r0 != 0) goto L_0x0060
            goto L_0x0065
        L_0x0060:
            r2.c()     // Catch:{ auda -> 0x035b }
            r2.c = r10     // Catch:{ auda -> 0x035b }
        L_0x0065:
            aucj r0 = r2.b     // Catch:{ auda -> 0x035b }
            bpe r0 = (defpackage.bpe) r0     // Catch:{ auda -> 0x035b }
            int r11 = r0.a     // Catch:{ auda -> 0x035b }
            r11 = r11 | r9
            r0.a = r11     // Catch:{ auda -> 0x035b }
            r0.b = r6     // Catch:{ auda -> 0x035b }
        L_0x0070:
            android.content.pm.PackageManager r6 = r18.getPackageManager()     // Catch:{ auda -> 0x035b }
            aucj r0 = r2.b     // Catch:{ auda -> 0x035b }
            bpe r0 = (defpackage.bpe) r0     // Catch:{ auda -> 0x035b }
            aucx r0 = r0.c     // Catch:{ auda -> 0x035b }
            int r11 = r0.size()     // Catch:{ auda -> 0x035b }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ auda -> 0x035b }
            r12.<init>(r11)     // Catch:{ auda -> 0x035b }
            r13 = 0
        L_0x0084:
            aucj r0 = r2.b     // Catch:{ auda -> 0x035b }
            bpe r0 = (defpackage.bpe) r0     // Catch:{ auda -> 0x035b }
            aucx r0 = r0.c     // Catch:{ auda -> 0x035b }
            int r0 = r0.size()     // Catch:{ auda -> 0x035b }
            if (r13 >= r0) goto L_0x01a8
            bpd r14 = r2.c((int) r13)     // Catch:{ auda -> 0x035b }
            int r0 = r14.g     // Catch:{ auda -> 0x035b }
            int r0 = defpackage.bpc.a(r0)     // Catch:{ auda -> 0x035b }
            if (r0 != 0) goto L_0x009d
            goto L_0x00a3
        L_0x009d:
            if (r0 != r7) goto L_0x00a3
            java.lang.String r15 = ""
        L_0x00a1:
            goto L_0x016f
        L_0x00a3:
            java.lang.String r0 = r14.b     // Catch:{ auda -> 0x035b }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ auda -> 0x035b }
            java.lang.String r7 = r0.getPath()     // Catch:{ auda -> 0x035b }
            if (r7 != 0) goto L_0x00c9
            java.lang.String r0 = "Staged apk path is null: "
            java.lang.String r7 = r14.b     // Catch:{ auda -> 0x035b }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ auda -> 0x035b }
            int r16 = r7.length()     // Catch:{ auda -> 0x035b }
            if (r16 != 0) goto L_0x00c3
            java.lang.String r7 = new java.lang.String     // Catch:{ auda -> 0x035b }
            r7.<init>(r0)     // Catch:{ auda -> 0x035b }
            goto L_0x00c6
        L_0x00c3:
            r0.concat(r7)     // Catch:{ auda -> 0x035b }
        L_0x00c6:
            r15 = 0
            goto L_0x016f
        L_0x00c9:
            java.io.File r0 = new java.io.File     // Catch:{ auda -> 0x035b }
            r0.<init>(r7)     // Catch:{ auda -> 0x035b }
            boolean r16 = r0.exists()     // Catch:{ auda -> 0x035b }
            if (r16 != 0) goto L_0x00e8
            java.lang.String r0 = "Staged apk file not found: "
            int r16 = r7.length()     // Catch:{ auda -> 0x035b }
            if (r16 != 0) goto L_0x00e2
            java.lang.String r7 = new java.lang.String     // Catch:{ auda -> 0x035b }
            r7.<init>(r0)     // Catch:{ auda -> 0x035b }
            goto L_0x00e5
        L_0x00e2:
            r0.concat(r7)     // Catch:{ auda -> 0x035b }
        L_0x00e5:
            r15 = 0
            goto L_0x016f
        L_0x00e8:
            java.lang.String r15 = r0.getAbsolutePath()     // Catch:{ auda -> 0x035b }
            android.content.pm.PackageInfo r15 = r6.getPackageArchiveInfo(r15, r10)     // Catch:{ auda -> 0x035b }
            if (r15 != 0) goto L_0x0105
            java.lang.String r0 = "Staged apk package archive info null: "
            int r15 = r7.length()     // Catch:{ auda -> 0x035b }
            if (r15 != 0) goto L_0x0100
            java.lang.String r7 = new java.lang.String     // Catch:{ auda -> 0x035b }
            r7.<init>(r0)     // Catch:{ auda -> 0x035b }
            goto L_0x0103
        L_0x0100:
            r0.concat(r7)     // Catch:{ auda -> 0x035b }
        L_0x0103:
            r15 = 0
            goto L_0x016f
        L_0x0105:
            java.lang.String r15 = r15.packageName     // Catch:{ auda -> 0x035b }
            android.content.pm.ApplicationInfo r4 = r6.getApplicationInfo(r15, r10)     // Catch:{ NameNotFoundException -> 0x0146 }
            java.lang.String r4 = r4.sourceDir     // Catch:{ auda -> 0x035b }
            java.io.File r5 = new java.io.File     // Catch:{ auda -> 0x035b }
            r5.<init>(r4)     // Catch:{ auda -> 0x035b }
            boolean r0 = r0.equals(r5)     // Catch:{ auda -> 0x035b }
            if (r0 != 0) goto L_0x00a1
            int r0 = r7.length()     // Catch:{ auda -> 0x035b }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ auda -> 0x035b }
            int r5 = r5.length()     // Catch:{ auda -> 0x035b }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ auda -> 0x035b }
            int r0 = r0 + 26
            int r0 = r0 + r5
            r15.<init>(r0)     // Catch:{ auda -> 0x035b }
            java.lang.String r0 = "Staged apk not active: "
            r15.append(r0)     // Catch:{ auda -> 0x035b }
            r15.append(r7)     // Catch:{ auda -> 0x035b }
            java.lang.String r0 = " ["
            r15.append(r0)     // Catch:{ auda -> 0x035b }
            r15.append(r4)     // Catch:{ auda -> 0x035b }
            java.lang.String r0 = "]"
            r15.append(r0)     // Catch:{ auda -> 0x035b }
            r15.toString()     // Catch:{ auda -> 0x035b }
            r15 = 0
            goto L_0x016f
        L_0x0146:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r15)     // Catch:{ auda -> 0x035b }
            int r0 = r0.length()     // Catch:{ auda -> 0x035b }
            int r4 = r7.length()     // Catch:{ auda -> 0x035b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ auda -> 0x035b }
            int r0 = r0 + 36
            int r0 = r0 + r4
            r5.<init>(r0)     // Catch:{ auda -> 0x035b }
            java.lang.String r0 = "Staged apk package name "
            r5.append(r0)     // Catch:{ auda -> 0x035b }
            r5.append(r15)     // Catch:{ auda -> 0x035b }
            java.lang.String r0 = " not found: "
            r5.append(r0)     // Catch:{ auda -> 0x035b }
            r5.append(r7)     // Catch:{ auda -> 0x035b }
            r5.toString()     // Catch:{ auda -> 0x035b }
            r15 = 0
        L_0x016f:
            if (r15 == 0) goto L_0x01a1
            java.lang.Object r0 = r14.c(r8)     // Catch:{ auda -> 0x035b }
            aucd r0 = (defpackage.aucd) r0     // Catch:{ auda -> 0x035b }
            r0.a((defpackage.aucj) r14)     // Catch:{ auda -> 0x035b }
            boolean r4 = r0.c     // Catch:{ auda -> 0x035b }
            if (r4 != 0) goto L_0x017f
            goto L_0x0184
        L_0x017f:
            r0.c()     // Catch:{ auda -> 0x035b }
            r0.c = r10     // Catch:{ auda -> 0x035b }
        L_0x0184:
            aucj r4 = r0.b     // Catch:{ auda -> 0x035b }
            bpd r4 = (defpackage.bpd) r4     // Catch:{ auda -> 0x035b }
            bpd r5 = defpackage.bpd.j     // Catch:{ auda -> 0x035b }
            r15.getClass()     // Catch:{ auda -> 0x035b }
            int r5 = r4.a     // Catch:{ auda -> 0x035b }
            r5 = r5 | 32
            r4.a = r5     // Catch:{ auda -> 0x035b }
            r4.h = r15     // Catch:{ auda -> 0x035b }
            aucj r0 = r0.i()     // Catch:{ auda -> 0x035b }
            bpd r0 = (defpackage.bpd) r0     // Catch:{ auda -> 0x035b }
            r12.add(r0)     // Catch:{ auda -> 0x035b }
            r2.a((int) r13, (defpackage.bpd) r0)     // Catch:{ auda -> 0x035b }
        L_0x01a1:
            int r13 = r13 + 1
            r4 = 7
            r5 = 6
            r7 = 3
            goto L_0x0084
        L_0x01a8:
            int r0 = r12.size()     // Catch:{ auda -> 0x035b }
            if (r0 >= r11) goto L_0x01c6
            boolean r0 = r2.c     // Catch:{ auda -> 0x035b }
            if (r0 != 0) goto L_0x01b3
        L_0x01b2:
            goto L_0x01b9
        L_0x01b3:
            r2.c()     // Catch:{ auda -> 0x035b }
            r2.c = r10     // Catch:{ auda -> 0x035b }
            goto L_0x01b2
        L_0x01b9:
            aucj r0 = r2.b     // Catch:{ auda -> 0x035b }
            bpe r0 = (defpackage.bpe) r0     // Catch:{ auda -> 0x035b }
            aucx r4 = defpackage.aucj.s()     // Catch:{ auda -> 0x035b }
            r0.c = r4     // Catch:{ auda -> 0x035b }
            r2.l((java.lang.Iterable) r12)     // Catch:{ auda -> 0x035b }
        L_0x01c6:
            boolean r0 = r2.c     // Catch:{ auda -> 0x035b }
            if (r0 != 0) goto L_0x01cb
            goto L_0x01d0
        L_0x01cb:
            r2.c()     // Catch:{ auda -> 0x035b }
            r2.c = r10     // Catch:{ auda -> 0x035b }
        L_0x01d0:
            aucj r0 = r2.b     // Catch:{ auda -> 0x035b }
            bpe r0 = (defpackage.bpe) r0     // Catch:{ auda -> 0x035b }
            int r4 = r0.a     // Catch:{ auda -> 0x035b }
            r4 = r4 | r9
            r0.a = r4     // Catch:{ auda -> 0x035b }
            r0.b = r8     // Catch:{ auda -> 0x035b }
            r0 = 0
        L_0x01dc:
            aucj r4 = r2.b     // Catch:{ auda -> 0x035b }
            bpe r4 = (defpackage.bpe) r4     // Catch:{ auda -> 0x035b }
            aucx r4 = r4.c     // Catch:{ auda -> 0x035b }
            int r4 = r4.size()     // Catch:{ auda -> 0x035b }
            if (r0 < r4) goto L_0x029f
            boolean r0 = r2.c     // Catch:{ auda -> 0x035b }
            if (r0 != 0) goto L_0x01ed
            goto L_0x01f2
        L_0x01ed:
            r2.c()     // Catch:{ auda -> 0x035b }
            r2.c = r10     // Catch:{ auda -> 0x035b }
        L_0x01f2:
            aucj r0 = r2.b     // Catch:{ auda -> 0x035b }
            bpe r0 = (defpackage.bpe) r0     // Catch:{ auda -> 0x035b }
            int r3 = r0.a     // Catch:{ auda -> 0x035b }
            r3 = r3 | r9
            r0.a = r3     // Catch:{ auda -> 0x035b }
            r4 = 6
            r0.b = r4     // Catch:{ auda -> 0x035b }
        L_0x01fe:
            java.io.File r0 = r17.d()     // Catch:{ auda -> 0x035b }
            if (r0 != 0) goto L_0x020e
            java.lang.String r0 = "Failed fetching module directory during config upgrade"
            android.util.Log.e(r1, r0)     // Catch:{ auda -> 0x035b }
            bpe r0 = l()     // Catch:{ auda -> 0x035b }
            return r0
        L_0x020e:
            r3 = 0
        L_0x020f:
            aucj r4 = r2.b     // Catch:{ auda -> 0x035b }
            bpe r4 = (defpackage.bpe) r4     // Catch:{ auda -> 0x035b }
            aucx r4 = r4.d     // Catch:{ auda -> 0x035b }
            int r4 = r4.size()     // Catch:{ auda -> 0x035b }
            if (r3 < r4) goto L_0x0238
            boolean r0 = r2.c     // Catch:{ auda -> 0x035b }
            if (r0 != 0) goto L_0x0220
            goto L_0x0225
        L_0x0220:
            r2.c()     // Catch:{ auda -> 0x035b }
            r2.c = r10     // Catch:{ auda -> 0x035b }
        L_0x0225:
            aucj r0 = r2.b     // Catch:{ auda -> 0x035b }
            bpe r0 = (defpackage.bpe) r0     // Catch:{ auda -> 0x035b }
            int r3 = r0.a     // Catch:{ auda -> 0x035b }
            r3 = r3 | r9
            r0.a = r3     // Catch:{ auda -> 0x035b }
            r5 = 7
            r0.b = r5     // Catch:{ auda -> 0x035b }
        L_0x0231:
            aucj r0 = r2.i()     // Catch:{ auda -> 0x035b }
            bpe r0 = (defpackage.bpe) r0     // Catch:{ auda -> 0x035b }
            return r0
        L_0x0238:
            r5 = 7
            bpf r4 = r2.d((int) r3)     // Catch:{ auda -> 0x035b }
            java.io.File r6 = defpackage.blz.a((java.io.File) r0, (defpackage.bpf) r4)     // Catch:{ auda -> 0x035b }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ auda -> 0x035b }
            bmr r6 = defpackage.bmr.a(r6)     // Catch:{ auda -> 0x035b }
            if (r6 == 0) goto L_0x029b
            java.lang.Object r7 = r4.c(r8)     // Catch:{ auda -> 0x035b }
            aucd r7 = (defpackage.aucd) r7     // Catch:{ auda -> 0x035b }
            r7.a((defpackage.aucj) r4)     // Catch:{ auda -> 0x035b }
            java.lang.String r4 = r6.a     // Catch:{ auda -> 0x035b }
            boolean r11 = r7.c     // Catch:{ auda -> 0x035b }
            if (r11 != 0) goto L_0x025b
            goto L_0x0260
        L_0x025b:
            r7.c()     // Catch:{ auda -> 0x035b }
            r7.c = r10     // Catch:{ auda -> 0x035b }
        L_0x0260:
            aucj r11 = r7.b     // Catch:{ auda -> 0x035b }
            bpf r11 = (defpackage.bpf) r11     // Catch:{ auda -> 0x035b }
            bpf r12 = defpackage.bpf.i     // Catch:{ auda -> 0x035b }
            r4.getClass()     // Catch:{ auda -> 0x035b }
            int r12 = r11.a     // Catch:{ auda -> 0x035b }
            r12 = r12 | 32
            r11.a = r12     // Catch:{ auda -> 0x035b }
            r11.g = r4     // Catch:{ auda -> 0x035b }
            java.lang.String r4 = r6.b     // Catch:{ auda -> 0x035b }
            r4.getClass()     // Catch:{ auda -> 0x035b }
            r6 = r12 | 64
            r11.a = r6     // Catch:{ auda -> 0x035b }
            r11.h = r4     // Catch:{ auda -> 0x035b }
            boolean r4 = r2.c     // Catch:{ auda -> 0x035b }
            if (r4 != 0) goto L_0x0281
            goto L_0x0286
        L_0x0281:
            r2.c()     // Catch:{ auda -> 0x035b }
            r2.c = r10     // Catch:{ auda -> 0x035b }
        L_0x0286:
            aucj r4 = r2.b     // Catch:{ auda -> 0x035b }
            bpe r4 = (defpackage.bpe) r4     // Catch:{ auda -> 0x035b }
            aucj r6 = r7.i()     // Catch:{ auda -> 0x035b }
            bpf r6 = (defpackage.bpf) r6     // Catch:{ auda -> 0x035b }
            r6.getClass()     // Catch:{ auda -> 0x035b }
            r4.b()     // Catch:{ auda -> 0x035b }
            aucx r4 = r4.d     // Catch:{ auda -> 0x035b }
            r4.set(r3, r6)     // Catch:{ auda -> 0x035b }
        L_0x029b:
            int r3 = r3 + 1
            goto L_0x020f
        L_0x029f:
            r4 = 6
            r5 = 7
            bpd r6 = r2.c((int) r0)     // Catch:{ auda -> 0x035b }
            java.lang.Object r7 = r6.c(r8)     // Catch:{ auda -> 0x035b }
            aucd r7 = (defpackage.aucd) r7     // Catch:{ auda -> 0x035b }
            r7.a((defpackage.aucj) r6)     // Catch:{ auda -> 0x035b }
            aucj r6 = r7.b     // Catch:{ auda -> 0x035b }
            bpd r6 = (defpackage.bpd) r6     // Catch:{ auda -> 0x035b }
            java.lang.String r6 = r6.b     // Catch:{ auda -> 0x035b }
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ auda -> 0x035b }
            boolean r11 = r6.isRelative()     // Catch:{ auda -> 0x035b }
            if (r11 != 0) goto L_0x02ca
            java.lang.String r6 = r6.getScheme()     // Catch:{ auda -> 0x035b }
            boolean r6 = r3.equals(r6)     // Catch:{ auda -> 0x035b }
            if (r6 != 0) goto L_0x02ca
            r6 = 0
            goto L_0x02cb
        L_0x02ca:
            r6 = 1
        L_0x02cb:
            boolean r11 = r7.c     // Catch:{ auda -> 0x035b }
            if (r11 != 0) goto L_0x02d0
            goto L_0x02d5
        L_0x02d0:
            r7.c()     // Catch:{ auda -> 0x035b }
            r7.c = r10     // Catch:{ auda -> 0x035b }
        L_0x02d5:
            aucj r11 = r7.b     // Catch:{ auda -> 0x035b }
            bpd r11 = (defpackage.bpd) r11     // Catch:{ auda -> 0x035b }
            bpd r12 = defpackage.bpd.j     // Catch:{ auda -> 0x035b }
            int r12 = r11.a     // Catch:{ auda -> 0x035b }
            r12 = r12 | 64
            r11.a = r12     // Catch:{ auda -> 0x035b }
            r11.i = r6     // Catch:{ auda -> 0x035b }
            aucj r6 = r7.i()     // Catch:{ auda -> 0x035b }
            bpd r6 = (defpackage.bpd) r6     // Catch:{ auda -> 0x035b }
            r2.a((int) r0, (defpackage.bpd) r6)     // Catch:{ auda -> 0x035b }
            int r0 = r0 + 1
            goto L_0x01dc
        L_0x02f0:
            r4 = 6
            r5 = 7
            bpd r7 = r2.c((int) r0)     // Catch:{ auda -> 0x035b }
            java.lang.Object r11 = r7.c(r8)     // Catch:{ auda -> 0x035b }
            aucd r11 = (defpackage.aucd) r11     // Catch:{ auda -> 0x035b }
            r11.a((defpackage.aucj) r7)     // Catch:{ auda -> 0x035b }
            aucj r7 = r11.b     // Catch:{ auda -> 0x035b }
            bpd r7 = (defpackage.bpd) r7     // Catch:{ auda -> 0x035b }
            java.lang.String r7 = r7.b     // Catch:{ auda -> 0x035b }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ auda -> 0x035b }
            boolean r12 = r7.isRelative()     // Catch:{ auda -> 0x035b }
            if (r12 != 0) goto L_0x0333
            java.lang.String r7 = r7.getScheme()     // Catch:{ auda -> 0x035b }
            boolean r7 = r3.equals(r7)     // Catch:{ auda -> 0x035b }
            if (r7 != 0) goto L_0x0333
            boolean r7 = r11.c     // Catch:{ auda -> 0x035b }
            if (r7 != 0) goto L_0x031e
            goto L_0x0323
        L_0x031e:
            r11.c()     // Catch:{ auda -> 0x035b }
            r11.c = r10     // Catch:{ auda -> 0x035b }
        L_0x0323:
            aucj r7 = r11.b     // Catch:{ auda -> 0x035b }
            bpd r7 = (defpackage.bpd) r7     // Catch:{ auda -> 0x035b }
            bpd r12 = defpackage.bpd.j     // Catch:{ auda -> 0x035b }
            r12 = 2
            r7.g = r12     // Catch:{ auda -> 0x035b }
            int r12 = r7.a     // Catch:{ auda -> 0x035b }
            r12 = r12 | 16
            r7.a = r12     // Catch:{ auda -> 0x035b }
            goto L_0x034b
        L_0x0333:
            boolean r7 = r11.c     // Catch:{ auda -> 0x035b }
            if (r7 != 0) goto L_0x0338
            goto L_0x033d
        L_0x0338:
            r11.c()     // Catch:{ auda -> 0x035b }
            r11.c = r10     // Catch:{ auda -> 0x035b }
        L_0x033d:
            aucj r7 = r11.b     // Catch:{ auda -> 0x035b }
            bpd r7 = (defpackage.bpd) r7     // Catch:{ auda -> 0x035b }
            bpd r12 = defpackage.bpd.j     // Catch:{ auda -> 0x035b }
            r7.g = r9     // Catch:{ auda -> 0x035b }
            int r12 = r7.a     // Catch:{ auda -> 0x035b }
            r12 = r12 | 16
            r7.a = r12     // Catch:{ auda -> 0x035b }
        L_0x034b:
            aucj r7 = r11.i()     // Catch:{ auda -> 0x035b }
            bpd r7 = (defpackage.bpd) r7     // Catch:{ auda -> 0x035b }
            r2.a((int) r0, (defpackage.bpd) r7)     // Catch:{ auda -> 0x035b }
            int r0 = r0 + 1
            r4 = 7
            r5 = 6
            r7 = 3
            goto L_0x004f
        L_0x035b:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Failed to read config file: "
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0372
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x0376
        L_0x0372:
            java.lang.String r0 = r2.concat(r0)
        L_0x0376:
            android.util.Log.e(r1, r0)
        L_0x0379:
            bpe r0 = l()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blu.a(android.content.Context, java.io.File):bpe");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0080 A[Catch:{ all -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0081 A[Catch:{ all -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099 A[Catch:{ all -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f2 A[Catch:{ all -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f4 A[Catch:{ all -> 0x0134 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection a(int r24, boolean r25, boolean r26, java.util.Set r27) {
        /*
            r23 = this;
            r0 = r24
            java.util.concurrent.locks.ReadWriteLock r1 = e
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.lock()
            bln r1 = r23.j()     // Catch:{ all -> 0x0134 }
            android.content.Context r10 = r1.a     // Catch:{ all -> 0x0134 }
            java.io.File r2 = r1.b     // Catch:{ all -> 0x0134 }
            bpe r1 = r1.c     // Catch:{ all -> 0x0134 }
            java.io.File r11 = a((java.io.File) r2)     // Catch:{ all -> 0x0134 }
            if (r11 != 0) goto L_0x001d
            goto L_0x011f
        L_0x001d:
            boolean r2 = r11.isDirectory()     // Catch:{ all -> 0x0134 }
            if (r2 == 0) goto L_0x011f
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0134 }
            r12.<init>()     // Catch:{ all -> 0x0134 }
            if (r26 == 0) goto L_0x0037
            java.util.BitSet r2 = new java.util.BitSet     // Catch:{ all -> 0x0134 }
            aucx r3 = r1.d     // Catch:{ all -> 0x0134 }
            int r3 = r3.size()     // Catch:{ all -> 0x0134 }
            r2.<init>(r3)     // Catch:{ all -> 0x0134 }
            r13 = r2
            goto L_0x0039
        L_0x0037:
            r2 = 0
            r13 = r2
        L_0x0039:
            aucx r2 = r1.c     // Catch:{ all -> 0x0134 }
            java.util.Iterator r14 = r2.iterator()     // Catch:{ all -> 0x0134 }
        L_0x003f:
            boolean r2 = r14.hasNext()     // Catch:{ all -> 0x0134 }
            if (r2 == 0) goto L_0x011e
            java.lang.Object r2 = r14.next()     // Catch:{ all -> 0x0134 }
            r15 = r2
            bpd r15 = (defpackage.bpd) r15     // Catch:{ all -> 0x0134 }
            r16 = 0
            r17 = 1
            if (r0 < 0) goto L_0x0058
            boolean r2 = r15.d     // Catch:{ all -> 0x0134 }
            if (r2 == 0) goto L_0x0058
            r2 = 0
            goto L_0x0059
        L_0x0058:
            r2 = 1
        L_0x0059:
            if (r0 >= 0) goto L_0x005d
            r3 = 1
            goto L_0x0062
        L_0x005d:
            if (r2 == 0) goto L_0x0061
            r3 = 0
            goto L_0x0062
        L_0x0061:
            r3 = 1
        L_0x0062:
            int r4 = r15.g     // Catch:{ all -> 0x0134 }
            int r4 = defpackage.bpc.a(r4)     // Catch:{ all -> 0x0134 }
            if (r4 != 0) goto L_0x006b
            goto L_0x007a
        L_0x006b:
            r5 = 2
            if (r4 == r5) goto L_0x006f
        L_0x006e:
            goto L_0x007a
        L_0x006f:
            if (r0 < 0) goto L_0x006e
            int r2 = r15.f     // Catch:{ all -> 0x0134 }
            if (r0 != r2) goto L_0x003f
            r18 = 0
            r19 = 1
            goto L_0x007e
        L_0x007a:
            r18 = r2
            r19 = r3
        L_0x007e:
            if (r25 != 0) goto L_0x0081
            goto L_0x008d
        L_0x0081:
            int r2 = r15.g     // Catch:{ all -> 0x0134 }
            int r2 = defpackage.bpc.a(r2)     // Catch:{ all -> 0x0134 }
            if (r2 == 0) goto L_0x008d
            r3 = 3
            if (r2 != r3) goto L_0x008d
            goto L_0x003f
        L_0x008d:
            aucx r2 = r15.e     // Catch:{ all -> 0x0134 }
            java.util.Iterator r20 = r2.iterator()     // Catch:{ all -> 0x0134 }
        L_0x0093:
            boolean r2 = r20.hasNext()     // Catch:{ all -> 0x0134 }
            if (r2 == 0) goto L_0x011a
            java.lang.Object r2 = r20.next()     // Catch:{ all -> 0x0134 }
            bpf r2 = (defpackage.bpf) r2     // Catch:{ all -> 0x0134 }
            boolean r3 = r2.e     // Catch:{ all -> 0x0134 }
            if (r3 == 0) goto L_0x00a6
            if (r18 == 0) goto L_0x0093
            goto L_0x00a8
        L_0x00a6:
            if (r19 == 0) goto L_0x0116
        L_0x00a8:
            aucx r3 = r1.d     // Catch:{ all -> 0x0134 }
            java.util.Comparator r4 = defpackage.blz.b     // Catch:{ all -> 0x0134 }
            int r2 = java.util.Collections.binarySearch(r3, r2, r4)     // Catch:{ all -> 0x0134 }
            if (r2 < 0) goto L_0x0112
            if (r13 != 0) goto L_0x00b5
            goto L_0x00be
        L_0x00b5:
            boolean r3 = r13.get(r2)     // Catch:{ all -> 0x0134 }
            if (r3 != 0) goto L_0x010f
            r13.set(r2)     // Catch:{ all -> 0x0134 }
        L_0x00be:
            aucx r3 = r1.d     // Catch:{ all -> 0x0134 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x0134 }
            bpf r2 = (defpackage.bpf) r2     // Catch:{ all -> 0x0134 }
            java.io.File r3 = defpackage.blz.a((java.io.File) r11, (defpackage.bpf) r2)     // Catch:{ all -> 0x0134 }
            int r4 = r15.g     // Catch:{ all -> 0x0134 }
            int r4 = defpackage.bpc.a(r4)     // Catch:{ all -> 0x0134 }
            if (r4 == 0) goto L_0x00e1
            r5 = 4
            if (r4 != r5) goto L_0x00e1
            java.lang.String r4 = r15.h     // Catch:{ all -> 0x0134 }
            r9 = r27
            boolean r4 = r9.contains(r4)     // Catch:{ all -> 0x0134 }
            if (r4 == 0) goto L_0x00e3
            r4 = 1
            goto L_0x00e4
        L_0x00e1:
            r9 = r27
        L_0x00e3:
            r4 = 0
        L_0x00e4:
            blk r8 = new blk     // Catch:{ all -> 0x0134 }
            java.lang.String r5 = r3.getAbsolutePath()     // Catch:{ all -> 0x0134 }
            int r3 = r15.g     // Catch:{ all -> 0x0134 }
            int r3 = defpackage.bpc.a(r3)     // Catch:{ all -> 0x0134 }
            if (r3 == 0) goto L_0x00f4
            r6 = r3
            goto L_0x00f5
        L_0x00f4:
            r6 = 1
        L_0x00f5:
            int r7 = r2.f     // Catch:{ all -> 0x0134 }
            java.lang.String r3 = r15.b     // Catch:{ all -> 0x0134 }
            bmr r21 = defpackage.blz.a((defpackage.bpf) r2)     // Catch:{ all -> 0x0134 }
            r2 = r8
            r22 = r3
            r3 = r10
            r0 = r8
            r8 = r22
            r9 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0134 }
            r12.add(r0)     // Catch:{ all -> 0x0134 }
            r0 = r24
            goto L_0x0093
        L_0x010f:
            r0 = r24
            goto L_0x0093
        L_0x0112:
            r0 = r24
            goto L_0x0093
        L_0x0116:
            r0 = r24
            goto L_0x0093
        L_0x011a:
            r0 = r24
            goto L_0x003f
        L_0x011e:
            goto L_0x012a
        L_0x011f:
            java.lang.String r0 = "FileApkMgr"
            java.lang.String r1 = "Main modules directory could not be created."
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0134 }
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0134 }
        L_0x012a:
            java.util.concurrent.locks.ReadWriteLock r0 = e
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.unlock()
            return r12
        L_0x0134:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = e
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            goto L_0x0140
        L_0x013f:
            throw r0
        L_0x0140:
            goto L_0x013f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blu.a(int, boolean, boolean, java.util.Set):java.util.Collection");
    }

    public final void a(boz boz, File file, File file2, aucd aucd, boolean z) {
        String str;
        File parentFile;
        boz boz2 = boz;
        File file3 = file;
        aucd aucd2 = aucd;
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int c = boz.c();
        bpa bpa = new bpa();
        boy boy = new boy();
        for (int i = 0; i < c; i++) {
            boz2.a(bpa, i);
            boz2.a(boy, bpa.S());
            if (boy.a() == 3 && (parentFile = new File(boy.b()).getParentFile()) != null) {
                try {
                    int parseInt = Integer.parseInt(parentFile.getName(), 16);
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Adding active module unique id: [");
                    sb.append(parseInt);
                    sb.append("]");
                    sb.toString();
                    sparseBooleanArray.put(parseInt, true);
                } catch (NumberFormatException e2) {
                }
            }
        }
        for (bpd bpd : Collections.unmodifiableList(((bpe) aucd2.b).c)) {
            aucx aucx = bpd.e;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                bpf bpf = (bpf) aucx.get(i2);
                if (!bpf.e) {
                    str = "active";
                } else {
                    str = "outdated";
                }
                int i3 = bpf.d;
                StringBuilder sb2 = new StringBuilder(str.length() + 46);
                sb2.append("Adding ");
                sb2.append(str);
                sb2.append(" installed APK unique id: [");
                sb2.append(i3);
                sb2.append("]");
                sb2.toString();
                sparseBooleanArray.put(bpf.d, true);
            }
        }
        ArrayList arrayList = new ArrayList(((bpe) aucd2.b).d.size());
        boolean z2 = false;
        for (bpf bpf2 : Collections.unmodifiableList(((bpe) aucd2.b).d)) {
            if (!sparseBooleanArray.get(bpf2.d)) {
                int i4 = bpf2.d;
                StringBuilder sb3 = new StringBuilder(44);
                sb3.append("Unreferenced module unique id: [");
                sb3.append(i4);
                sb3.append("]");
                sb3.toString();
                z2 = true;
            } else {
                int i5 = bpf2.d;
                StringBuilder sb4 = new StringBuilder(42);
                sb4.append("Referenced module unique id: [");
                sb4.append(i5);
                sb4.append("]");
                sb4.toString();
                arrayList.add(bpf2);
            }
        }
        if (z2) {
            if (aucd2.c) {
                aucd.c();
                aucd2.c = false;
            }
            bpe bpe = bpe.f;
            ((bpe) aucd2.b).d = aucj.s();
            aucd2.k((Iterable) arrayList);
            if (z) {
                if (!a(file2, (bpe) aucd.i(), false)) {
                    Log.e("FileApkMgr", "Failed to update config file");
                }
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            Log.w("FileApkMgr", "Main module directory could not be listed.");
            File a = blz.a(file.getParentFile(), file3);
            if (a != null) {
                d();
                if (!file.isDirectory()) {
                    Log.w("FileApkMgr", "Main modules directory could not be created.");
                } else if (!a.renameTo(new File(file3, a.getName()))) {
                    Log.e("FileApkMgr", "Failed to rename condemned module directory.");
                    if (!bma.a(a)) {
                        Log.e("FileApkMgr", "Failed to delete condemned module directory.");
                    }
                }
            }
        } else {
            for (File file4 : listFiles) {
                if (file4.isDirectory()) {
                    String name = file4.getName();
                    if (!name.startsWith("c-")) {
                        try {
                            if (sparseBooleanArray.get(Integer.parseInt(name, 16))) {
                                String valueOf = String.valueOf(name);
                                if (valueOf.length() == 0) {
                                    new String("Keeping up-to-date module: ");
                                } else {
                                    "Keeping up-to-date module: ".concat(valueOf);
                                }
                            } else {
                                String valueOf2 = String.valueOf(name);
                                Log.i("FileApkMgr", valueOf2.length() == 0 ? new String("Deleting stale module: ") : "Deleting stale module: ".concat(valueOf2));
                                File a2 = blz.a(file3, file4);
                                if (a2 != null) {
                                    bma.a(a2);
                                }
                            }
                        } catch (NumberFormatException e3) {
                        }
                    } else if (!bma.a(file4)) {
                        String valueOf3 = String.valueOf(name);
                        Log.w("FileApkMgr", valueOf3.length() == 0 ? new String("Failed to delete condemned module: ") : "Failed to delete condemned module: ".concat(valueOf3));
                    }
                }
            }
        }
    }

    public final void a(boolean z) {
        a(z, false);
    }

    public final void a(boolean z, boolean z2) {
        String str;
        if (a()) {
            File d = d();
            if (d == null || !d.isDirectory()) {
                Log.e("FileApkMgr", "Failed to get module files directory");
                return;
            }
            synchronized (h) {
                if (!z) {
                    str = "";
                } else {
                    str = " container-only";
                }
                if (str.length() == 0) {
                    new String("Starting optimizing");
                } else {
                    "Starting optimizing".concat(str);
                }
                e.readLock().lock();
                try {
                    bpe bpe = j().c;
                    if (z) {
                        for (bpd bpd : bpe.c) {
                            int a = bpc.a(bpd.g);
                            if (a != 0 && a == 2) {
                                for (bpf binarySearch : bpd.e) {
                                    int binarySearch2 = Collections.binarySearch(bpe.d, binarySearch, blz.b);
                                    if (binarySearch2 >= 0) {
                                        a(d, (bpf) bpe.d.get(binarySearch2), z2);
                                    }
                                }
                            }
                        }
                    } else {
                        for (bpf a2 : bpe.d) {
                            a(d, a2, z2);
                        }
                    }
                    String str2 = !z ? "" : " container-only";
                    StringBuilder sb = new StringBuilder(str2.length() + 19);
                    sb.append("Optimizing");
                    sb.append(str2);
                    sb.append(" complete");
                    sb.toString();
                } finally {
                    e.readLock().unlock();
                }
            }
        }
    }

    public final boolean a(aucd aucd, File file, bkw bkw, Set set, bpu bpu) {
        aucd aucd2 = aucd;
        File file2 = file;
        ArrayList arrayList = new ArrayList(((bpe) aucd2.b).d.size());
        boolean z = false;
        for (bpf bpf : Collections.unmodifiableList(((bpe) aucd2.b).d)) {
            File a = blz.a(file2, bpf);
            try {
                bnm f2 = new blk(this.a, 0, a.getAbsolutePath(), 2, bpf.f, "", (bmr) null).f();
                try {
                    if (bpu.a(a)) {
                        arrayList.add(bpf);
                    } else {
                        String str = bpf.c;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
                        sb.append("Module signature verification failed: [");
                        sb.append(str);
                        sb.append("]");
                        Log.w("FileApkMgr", sb.toString());
                        Context context = this.a;
                        String str2 = bpf.b;
                        int i = f2.h;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 14);
                        sb2.append(str2);
                        sb2.append(" (");
                        sb2.append(i);
                        sb2.append(")");
                        bla.a(context, 44, sb2.toString());
                        blz.a(file2, blz.b(file2, bpf.d));
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                }
            } catch (PackageManager.NameNotFoundException e3) {
                bpu bpu2 = bpu;
                String str3 = bpf.c;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 20);
                sb3.append("Module not found: [");
                sb3.append(str3);
                sb3.append("]");
                sb3.toString();
                blz.a(file2, blz.b(file2, bpf.d));
                z = true;
            }
        }
        if (z) {
            if (aucd2.c) {
                aucd.c();
                aucd2.c = false;
            }
            bpe bpe = bpe.f;
            ((bpe) aucd2.b).d = aucj.s();
            aucd2.k((Iterable) arrayList);
        }
        return z | blz.a(aucd2, bkw, set);
    }

    public final boolean a(bpq bpq) {
        bpu a = bkn.a();
        bkn.b();
        return a(a, hei.h(), bpq);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: aucd} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x026d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.bpu r19, defpackage.aucd r20, defpackage.bms r21, java.io.File r22, boolean r23, defpackage.bpq r24) {
        /*
            r18 = this;
            r10 = r20
            r0 = r21
            r9 = r24
            java.lang.String r1 = r21.m()
            r2 = 0
            if (r1 == 0) goto L_0x02c5
            bnm r3 = r21.f()     // Catch:{ NameNotFoundException -> 0x02c1 }
            java.lang.String r4 = r3.f
            long r5 = r3.d
            int r7 = r3.h
            bpd r8 = defpackage.bpd.j
            aucd r8 = r8.o()
            boolean r11 = r8.c
            if (r11 != 0) goto L_0x0022
            goto L_0x0027
        L_0x0022:
            r8.c()
            r8.c = r2
        L_0x0027:
            aucj r11 = r8.b
            bpd r11 = (defpackage.bpd) r11
            r1.getClass()
            int r12 = r11.a
            r13 = 1
            r12 = r12 | r13
            r11.a = r12
            r11.b = r1
            aucj r11 = r10.b
            bpe r11 = (defpackage.bpe) r11
            aucx r11 = r11.c
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            aucj r12 = r8.i()
            bpd r12 = (defpackage.bpd) r12
            java.util.Comparator r14 = defpackage.blz.c
            int r11 = java.util.Collections.binarySearch(r11, r12, r14)
            r12 = 4
            r14 = 2
            if (r11 >= 0) goto L_0x00c0
            java.lang.String r15 = "Starting staging: "
            int r16 = r1.length()
            if (r16 != 0) goto L_0x005e
            java.lang.String r1 = new java.lang.String
            r1.<init>(r15)
            goto L_0x0061
        L_0x005e:
            r15.concat(r1)
        L_0x0061:
            boolean r1 = r8.c
            if (r1 != 0) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            r8.c()
            r8.c = r2
        L_0x006b:
            aucj r1 = r8.b
            bpd r1 = (defpackage.bpd) r1
            int r15 = r1.a
            r15 = r15 | r14
            r1.a = r15
            r1.c = r5
            r5 = r15 | 8
            r1.a = r5
            r1.f = r7
            int r1 = r3.b
            int r1 = defpackage.bnj.a(r1)
            if (r1 != 0) goto L_0x0085
            goto L_0x0089
        L_0x0085:
            if (r1 == r14) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r12 = 2
        L_0x0089:
            boolean r1 = r8.c
            if (r1 != 0) goto L_0x008e
            goto L_0x0093
        L_0x008e:
            r8.c()
            r8.c = r2
        L_0x0093:
            aucj r1 = r8.b
            bpd r1 = (defpackage.bpd) r1
            int r12 = r12 + -1
            r1.g = r12
            int r3 = r1.a
            r3 = r3 | 16
            r1.a = r3
            r4.getClass()
            r3 = r3 | 32
            r1.a = r3
            r1.h = r4
            boolean r4 = r0 instanceof defpackage.bmb
            r3 = r3 | 64
            r1.a = r3
            r1.i = r4
            aucj r1 = r8.i()
            bpd r1 = (defpackage.bpd) r1
            int r11 = defpackage.blz.a((defpackage.aucd) r10, (int) r11, (defpackage.bpd) r1)
            r12 = r11
            r11 = r8
            goto L_0x01ff
        L_0x00c0:
            bpd r8 = r10.c((int) r11)
            r15 = 5
            java.lang.Object r16 = r8.c(r15)
            r13 = r16
            aucd r13 = (defpackage.aucd) r13
            r13.a((defpackage.aucj) r8)
            aucj r8 = r13.b
            bpd r8 = (defpackage.bpd) r8
            long r14 = r8.c
            int r17 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r17 == 0) goto L_0x00db
            goto L_0x0117
        L_0x00db:
            int r14 = r8.f
            if (r7 != r14) goto L_0x0117
            java.lang.String r8 = r8.h
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x0117
            aucj r3 = r13.b
            bpd r3 = (defpackage.bpd) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L_0x0101
            java.lang.String r0 = "Staging already complete: "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x00fd
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            goto L_0x0100
        L_0x00fd:
            r0.concat(r1)
        L_0x0100:
            return r2
        L_0x0101:
            java.lang.String r3 = "Continuing staging: "
            int r4 = r1.length()
            if (r4 != 0) goto L_0x010f
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
            goto L_0x0112
        L_0x010f:
            r3.concat(r1)
        L_0x0112:
            r12 = r11
            r11 = r13
            r13 = 0
            goto L_0x01ff
        L_0x0117:
            java.lang.String r8 = "Restarting staging: "
            int r14 = r1.length()
            if (r14 != 0) goto L_0x0125
            java.lang.String r1 = new java.lang.String
            r1.<init>(r8)
            goto L_0x0128
        L_0x0125:
            r8.concat(r1)
        L_0x0128:
            boolean r1 = r13.c
            if (r1 != 0) goto L_0x012d
            goto L_0x0132
        L_0x012d:
            r13.c()
            r13.c = r2
        L_0x0132:
            aucj r1 = r13.b
            bpd r1 = (defpackage.bpd) r1
            int r8 = r1.a
            r14 = 2
            r8 = r8 | r14
            r1.a = r8
            r1.c = r5
            r5 = r8 | 8
            r1.a = r5
            r1.f = r7
            int r1 = r3.b
            int r1 = defpackage.bnj.a(r1)
            if (r1 != 0) goto L_0x014e
            r14 = 4
            goto L_0x0154
        L_0x014e:
            r3 = 2
            if (r1 == r3) goto L_0x0153
            r14 = 4
            goto L_0x0154
        L_0x0153:
            r14 = 2
        L_0x0154:
            boolean r1 = r13.c
            if (r1 != 0) goto L_0x0159
            goto L_0x015e
        L_0x0159:
            r13.c()
            r13.c = r2
        L_0x015e:
            aucj r1 = r13.b
            bpd r1 = (defpackage.bpd) r1
            int r14 = r14 + -1
            r1.g = r14
            int r3 = r1.a
            r3 = r3 | 16
            r1.a = r3
            r4.getClass()
            r3 = r3 | 32
            r1.a = r3
            r1.h = r4
            boolean r4 = r0 instanceof defpackage.bmb
            r3 = r3 | 64
            r1.a = r3
            r1.i = r4
            boolean r4 = r1.d
            if (r4 == 0) goto L_0x01ca
            r3 = r3 | r12
            r1.a = r3
            r1.d = r2
            r1 = 0
        L_0x0187:
            aucj r3 = r13.b
            bpd r3 = (defpackage.bpd) r3
            aucx r3 = r3.e
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x01c6
            bpf r3 = r13.b((int) r1)
            r4 = 5
            java.lang.Object r5 = r3.c(r4)
            aucd r5 = (defpackage.aucd) r5
            r5.a((defpackage.aucj) r3)
            boolean r3 = r5.c
            if (r3 != 0) goto L_0x01a6
            goto L_0x01ab
        L_0x01a6:
            r5.c()
            r5.c = r2
        L_0x01ab:
            aucj r3 = r5.b
            bpf r3 = (defpackage.bpf) r3
            bpf r6 = defpackage.bpf.i
            int r6 = r3.a
            r6 = r6 | 8
            r3.a = r6
            r6 = 1
            r3.e = r6
            aucj r3 = r5.i()
            bpf r3 = (defpackage.bpf) r3
            r13.a((int) r1, (defpackage.bpf) r3)
            int r1 = r1 + 1
            goto L_0x0187
        L_0x01c6:
            r12 = r11
            r11 = r13
            r13 = 1
            goto L_0x01ff
        L_0x01ca:
            aucx r1 = r1.e
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x01d4:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01fc
            java.lang.Object r3 = r1.next()
            bpf r3 = (defpackage.bpf) r3
            boolean r3 = r3.e
            if (r3 != 0) goto L_0x01d4
            boolean r1 = r13.c
            if (r1 != 0) goto L_0x01e9
            goto L_0x01ee
        L_0x01e9:
            r13.c()
            r13.c = r2
        L_0x01ee:
            aucj r1 = r13.b
            bpd r1 = (defpackage.bpd) r1
            aucx r3 = defpackage.aucj.s()
            r1.e = r3
            r12 = r11
            r11 = r13
            r13 = 1
            goto L_0x01ff
        L_0x01fc:
            r12 = r11
            r11 = r13
            r13 = 1
        L_0x01ff:
            aucj r1 = r11.b
            bpd r1 = (defpackage.bpd) r1
            boolean r1 = r1.d
            r3 = 1
            r1 = r1 ^ r3
            defpackage.amtf.a((boolean) r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r4 = r0 instanceof defpackage.bkw
            if (r4 == 0) goto L_0x0231
            java.lang.String r4 = "/system/"
            java.lang.String r5 = "m/container"
            boolean r5 = defpackage.blt.a(r4, r5, r0, r1)
            if (r5 != 0) goto L_0x0224
            java.lang.String r3 = "app_chimera/m"
            boolean r3 = defpackage.blt.a(r4, r3, r0, r1)
            goto L_0x0225
        L_0x0224:
        L_0x0225:
            java.lang.String r5 = "m/optional"
            defpackage.blt.a(r4, r5, r0, r1)
            if (r3 != 0) goto L_0x022e
            goto L_0x0231
        L_0x022e:
            r14 = r18
            goto L_0x0260
        L_0x0231:
            r14 = r18
            android.content.Context r3 = r14.a
            android.content.res.Resources r0 = r21.c()     // Catch:{ NameNotFoundException -> 0x028e, bop -> 0x028c, IOException -> 0x028a }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ NameNotFoundException -> 0x028e, bop -> 0x028c, IOException -> 0x028a }
            java.lang.String r4 = "chimera-modules"
            java.lang.String[] r4 = r0.list(r4)     // Catch:{ NameNotFoundException -> 0x028e, bop -> 0x028c, IOException -> 0x028a }
            if (r4 == 0) goto L_0x0282
            java.util.Arrays.sort(r4)     // Catch:{ NameNotFoundException -> 0x028e, bop -> 0x028c, IOException -> 0x028a }
            int r5 = r4.length     // Catch:{ NameNotFoundException -> 0x028e, bop -> 0x028c, IOException -> 0x028a }
        L_0x0249:
            if (r2 >= r5) goto L_0x0260
            r6 = r4[r2]     // Catch:{ NameNotFoundException -> 0x028e, bop -> 0x028c, IOException -> 0x028a }
            java.lang.String r7 = ".apk"
            boolean r7 = r6.endsWith(r7)     // Catch:{ NameNotFoundException -> 0x028e, bop -> 0x028c, IOException -> 0x028a }
            if (r7 == 0) goto L_0x025d
            blr r7 = new blr     // Catch:{ NameNotFoundException -> 0x028e, bop -> 0x028c, IOException -> 0x028a }
            r7.<init>(r0, r6)     // Catch:{ NameNotFoundException -> 0x028e, bop -> 0x028c, IOException -> 0x028a }
            r1.add(r7)     // Catch:{ NameNotFoundException -> 0x028e, bop -> 0x028c, IOException -> 0x028a }
        L_0x025d:
            int r2 = r2 + 1
            goto L_0x0249
        L_0x0260:
            if (r9 == 0) goto L_0x026d
            blp r0 = new blp
            amzy r1 = defpackage.amzy.a((java.util.Collection) r1)
            r0.<init>(r1, r9)
            r7 = r0
            goto L_0x026e
        L_0x026d:
            r7 = r1
        L_0x026e:
            r1 = r18
            r2 = r19
            r3 = r23
            r4 = r20
            r5 = r11
            r6 = r12
            r8 = r22
            r9 = r24
            boolean r0 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9)
            r13 = r13 | r0
            goto L_0x02b7
        L_0x0282:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ NameNotFoundException -> 0x028e, bop -> 0x028c, IOException -> 0x028a }
            java.lang.String r1 = "unknown error"
            r0.<init>(r1)     // Catch:{ NameNotFoundException -> 0x028e, bop -> 0x028c, IOException -> 0x028a }
            throw r0     // Catch:{ NameNotFoundException -> 0x028e, bop -> 0x028c, IOException -> 0x028a }
        L_0x028a:
            r0 = move-exception
            goto L_0x028f
        L_0x028c:
            r0 = move-exception
            goto L_0x028f
        L_0x028e:
            r0 = move-exception
        L_0x028f:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Error while unpacking chimera modules:"
            int r4 = r1.length()
            if (r4 != 0) goto L_0x02a5
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x02a9
        L_0x02a5:
            java.lang.String r1 = r2.concat(r1)
        L_0x02a9:
            java.lang.String r2 = "FileApkMgr"
            android.util.Log.e(r2, r1)
            r1 = 33
            java.lang.String r0 = r0.getMessage()
            defpackage.bla.a(r3, r1, r0)
        L_0x02b7:
            aucj r0 = r11.i()
            bpd r0 = (defpackage.bpd) r0
            r10.a((int) r12, (defpackage.bpd) r0)
            return r13
        L_0x02c1:
            r0 = move-exception
            r14 = r18
            return r2
        L_0x02c5:
            r14 = r18
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blu.a(bpu, aucd, bms, java.io.File, boolean, bpq):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: aucd} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0336  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.bpu r23, java.util.Set r24, boolean r25, boolean r26, defpackage.bpq r27) {
        /*
            r22 = this;
            r10 = r22
            r0 = r24
            boolean r1 = r22.b()
            r11 = 0
            if (r1 != 0) goto L_0x0395
            bkw r7 = new bkw
            android.content.Context r1 = r10.a
            r7.<init>(r1)
            r12 = 1
            if (r0 == 0) goto L_0x001d
            boolean r1 = r0.contains(r7)
            r1 = r1 ^ r12
            defpackage.amrl.b(r1)
        L_0x001d:
            java.lang.Object r13 = f
            monitor-enter(r13)
            java.io.File r14 = r22.d()     // Catch:{ all -> 0x0392 }
            if (r14 != 0) goto L_0x0028
            goto L_0x0388
        L_0x0028:
            boolean r1 = r14.isDirectory()     // Catch:{ all -> 0x0392 }
            if (r1 == 0) goto L_0x0388
            bpe r1 = r22.k()     // Catch:{ all -> 0x0392 }
            r15 = 5
            java.lang.Object r2 = r1.c(r15)     // Catch:{ all -> 0x0392 }
            r9 = r2
            aucd r9 = (defpackage.aucd) r9     // Catch:{ all -> 0x0392 }
            r9.a((defpackage.aucj) r1)     // Catch:{ all -> 0x0392 }
            if (r25 == 0) goto L_0x004e
            r1 = r22
            r2 = r9
            r3 = r14
            r4 = r7
            r5 = r24
            r6 = r23
            boolean r1 = r1.a((defpackage.aucd) r2, (java.io.File) r3, (defpackage.bkw) r4, (java.util.Set) r5, (defpackage.bpu) r6)     // Catch:{ all -> 0x0392 }
            r8 = r1
            goto L_0x0053
        L_0x004e:
            boolean r1 = defpackage.blz.a((defpackage.aucd) r9, (defpackage.bkw) r7, (java.util.Set) r0)     // Catch:{ all -> 0x0392 }
            r8 = r1
        L_0x0053:
            r1 = r22
            r2 = r23
            r3 = r9
            r4 = r7
            r5 = r14
            r6 = r26
            r7 = r27
            boolean r1 = r1.a(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0392 }
            r16 = r8 | r1
            defpackage.bkn.b()     // Catch:{ all -> 0x0392 }
            awxs r1 = defpackage.awxs.a     // Catch:{ all -> 0x0392 }
            awxt r1 = r1.a()     // Catch:{ all -> 0x0392 }
            boolean r1 = r1.C()     // Catch:{ all -> 0x0392 }
            if (r1 == 0) goto L_0x033b
            java.lang.String r1 = r22.f()     // Catch:{ all -> 0x0392 }
            r2 = 0
            if (r1 == 0) goto L_0x010f
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0392 }
            r3.<init>(r1)     // Catch:{ all -> 0x0392 }
            java.io.File r1 = r3.getParentFile()     // Catch:{ all -> 0x0392 }
            if (r1 != 0) goto L_0x00ab
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0392 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0392 }
            int r3 = r3.length()     // Catch:{ all -> 0x0392 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0392 }
            int r3 = r3 + 36
            r4.<init>(r3)     // Catch:{ all -> 0x0392 }
            java.lang.String r3 = "Failed fetching parent directory of "
            r4.append(r3)     // Catch:{ all -> 0x0392 }
            r4.append(r1)     // Catch:{ all -> 0x0392 }
            java.lang.String r1 = "FileApkMgr"
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0392 }
            android.util.Log.e(r1, r3)     // Catch:{ all -> 0x0392 }
            r8 = r2
            goto L_0x0110
        L_0x00ab:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0392 }
            java.lang.String r4 = "m/independent"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0392 }
            boolean r1 = r3.isDirectory()     // Catch:{ all -> 0x0392 }
            if (r1 != 0) goto L_0x00dd
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0392 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0392 }
            int r3 = r3.length()     // Catch:{ all -> 0x0392 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0392 }
            int r3 = r3 + 61
            r4.<init>(r3)     // Catch:{ all -> 0x0392 }
            java.lang.String r3 = "System image independent module root not found at "
            r4.append(r3)     // Catch:{ all -> 0x0392 }
            r4.append(r1)     // Catch:{ all -> 0x0392 }
            java.lang.String r1 = ". Ignoring."
            r4.append(r1)     // Catch:{ all -> 0x0392 }
            r4.toString()     // Catch:{ all -> 0x0392 }
            r8 = r2
            goto L_0x0110
        L_0x00dd:
            java.io.File[] r1 = r3.listFiles()     // Catch:{ all -> 0x0392 }
            if (r1 != 0) goto L_0x010d
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0392 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0392 }
            int r3 = r3.length()     // Catch:{ all -> 0x0392 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0392 }
            int r3 = r3 + 44
            r4.<init>(r3)     // Catch:{ all -> 0x0392 }
            java.lang.String r3 = "Failed to list independent module files in "
            r4.append(r3)     // Catch:{ all -> 0x0392 }
            r4.append(r1)     // Catch:{ all -> 0x0392 }
            java.lang.String r1 = "."
            r4.append(r1)     // Catch:{ all -> 0x0392 }
            java.lang.String r1 = "FileApkMgr"
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0392 }
            android.util.Log.e(r1, r3)     // Catch:{ all -> 0x0392 }
            goto L_0x010f
        L_0x010d:
            r8 = r1
            goto L_0x0110
        L_0x010f:
            r8 = r2
        L_0x0110:
            if (r8 == 0) goto L_0x0336
            java.util.Arrays.sort(r8)     // Catch:{ all -> 0x0392 }
            int r7 = r8.length     // Catch:{ all -> 0x0392 }
            r1 = 0
            r6 = 0
        L_0x0118:
            if (r6 >= r7) goto L_0x0332
            r5 = r8[r6]     // Catch:{ all -> 0x0392 }
            java.lang.String r2 = r5.getName()     // Catch:{ all -> 0x0392 }
            java.lang.String r3 = ".apk"
            boolean r2 = r2.endsWith(r3)     // Catch:{ all -> 0x0392 }
            if (r2 == 0) goto L_0x031b
            android.content.Context r2 = r10.a     // Catch:{ all -> 0x0392 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ all -> 0x0392 }
            java.lang.String r3 = r5.getAbsolutePath()     // Catch:{ all -> 0x0392 }
            android.content.pm.PackageInfo r2 = r2.getPackageArchiveInfo(r3, r11)     // Catch:{ all -> 0x0392 }
            if (r2 != 0) goto L_0x0162
            java.lang.String r2 = "FileApkMgr"
            java.lang.String r3 = "Failed fetching package info for "
            java.lang.String r4 = r5.getAbsolutePath()     // Catch:{ all -> 0x0392 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0392 }
            int r5 = r4.length()     // Catch:{ all -> 0x0392 }
            if (r5 != 0) goto L_0x0150
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0392 }
            r4.<init>(r3)     // Catch:{ all -> 0x0392 }
            goto L_0x0154
        L_0x0150:
            java.lang.String r4 = r3.concat(r4)     // Catch:{ all -> 0x0392 }
        L_0x0154:
            android.util.Log.w(r2, r4)     // Catch:{ all -> 0x0392 }
            r25 = r1
            r19 = r6
            r20 = r7
            r21 = r8
            r12 = r9
            goto L_0x0324
        L_0x0162:
            bpd r3 = defpackage.bpd.j     // Catch:{ all -> 0x0392 }
            aucd r3 = r3.o()     // Catch:{ all -> 0x0392 }
            android.net.Uri r4 = android.net.Uri.fromFile(r5)     // Catch:{ all -> 0x0392 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0392 }
            boolean r15 = r3.c     // Catch:{ all -> 0x0392 }
            if (r15 != 0) goto L_0x0175
            goto L_0x017a
        L_0x0175:
            r3.c()     // Catch:{ all -> 0x0392 }
            r3.c = r11     // Catch:{ all -> 0x0392 }
        L_0x017a:
            aucj r15 = r3.b     // Catch:{ all -> 0x0392 }
            bpd r15 = (defpackage.bpd) r15     // Catch:{ all -> 0x0392 }
            r4.getClass()     // Catch:{ all -> 0x0392 }
            int r11 = r15.a     // Catch:{ all -> 0x0392 }
            r11 = r11 | r12
            r15.a = r11     // Catch:{ all -> 0x0392 }
            r15.b = r4     // Catch:{ all -> 0x0392 }
            aucj r4 = r9.b     // Catch:{ all -> 0x0392 }
            bpe r4 = (defpackage.bpe) r4     // Catch:{ all -> 0x0392 }
            aucx r4 = r4.c     // Catch:{ all -> 0x0392 }
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)     // Catch:{ all -> 0x0392 }
            aucj r11 = r3.i()     // Catch:{ all -> 0x0392 }
            bpd r11 = (defpackage.bpd) r11     // Catch:{ all -> 0x0392 }
            java.util.Comparator r15 = defpackage.blz.c     // Catch:{ all -> 0x0392 }
            int r4 = java.util.Collections.binarySearch(r4, r11, r15)     // Catch:{ all -> 0x0392 }
            if (r4 >= 0) goto L_0x01b5
            aucj r11 = r3.i()     // Catch:{ all -> 0x0392 }
            bpd r11 = (defpackage.bpd) r11     // Catch:{ all -> 0x0392 }
            int r4 = defpackage.blz.a((defpackage.aucd) r9, (int) r4, (defpackage.bpd) r11)     // Catch:{ all -> 0x0392 }
            r25 = r1
            r11 = r3
            r15 = r4
            r20 = r6
            r27 = r7
            r1 = 1
            r12 = 5
            goto L_0x0205
        L_0x01b5:
            bpd r3 = r9.c((int) r4)     // Catch:{ all -> 0x0392 }
            r11 = 5
            java.lang.Object r15 = r3.c(r11)     // Catch:{ all -> 0x0392 }
            r11 = r15
            aucd r11 = (defpackage.aucd) r11     // Catch:{ all -> 0x0392 }
            r11.a((defpackage.aucj) r3)     // Catch:{ all -> 0x0392 }
            aucj r3 = r11.i()     // Catch:{ all -> 0x0392 }
            bpd r3 = (defpackage.bpd) r3     // Catch:{ all -> 0x0392 }
            java.lang.String r15 = r2.packageName     // Catch:{ all -> 0x0392 }
            int r12 = r2.versionCode     // Catch:{ all -> 0x0392 }
            r25 = r1
            boolean r1 = r3.d     // Catch:{ all -> 0x0392 }
            if (r1 == 0) goto L_0x01fe
            long r18 = r5.lastModified()     // Catch:{ all -> 0x0392 }
            r20 = r6
            r27 = r7
            long r6 = r3.c     // Catch:{ all -> 0x0392 }
            int r1 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0202
            int r1 = r3.f     // Catch:{ all -> 0x0392 }
            if (r12 != r1) goto L_0x0202
            java.lang.String r1 = r3.h     // Catch:{ all -> 0x0392 }
            boolean r1 = r15.equals(r1)     // Catch:{ all -> 0x0392 }
            if (r1 == 0) goto L_0x0202
            int r1 = r3.g     // Catch:{ all -> 0x0392 }
            int r1 = defpackage.bpc.a(r1)     // Catch:{ all -> 0x0392 }
            if (r1 != 0) goto L_0x01f9
            r1 = 1
            r12 = 5
            goto L_0x0204
        L_0x01f9:
            r12 = 5
            if (r1 != r12) goto L_0x0203
            r1 = 0
            goto L_0x0204
        L_0x01fe:
            r20 = r6
            r27 = r7
        L_0x0202:
            r12 = 5
        L_0x0203:
            r1 = 1
        L_0x0204:
            r15 = r4
        L_0x0205:
            if (r1 != 0) goto L_0x0233
            java.lang.String r1 = r5.getAbsolutePath()     // Catch:{ all -> 0x0392 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0392 }
            int r2 = r2.length()     // Catch:{ all -> 0x0392 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0392 }
            int r2 = r2 + 37
            r3.<init>(r2)     // Catch:{ all -> 0x0392 }
            java.lang.String r2 = "Skipping "
            r3.append(r2)     // Catch:{ all -> 0x0392 }
            r3.append(r1)     // Catch:{ all -> 0x0392 }
            java.lang.String r1 = ", source APK has not changed"
            r3.append(r1)     // Catch:{ all -> 0x0392 }
            r3.toString()     // Catch:{ all -> 0x0392 }
            r21 = r8
            r12 = r9
            r19 = r20
            r20 = r27
            goto L_0x0324
        L_0x0233:
            java.lang.String r1 = "Staging: "
            java.lang.String r3 = r5.getAbsolutePath()     // Catch:{ all -> 0x0392 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0392 }
            int r4 = r3.length()     // Catch:{ all -> 0x0392 }
            if (r4 != 0) goto L_0x0249
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0392 }
            r3.<init>(r1)     // Catch:{ all -> 0x0392 }
            goto L_0x024c
        L_0x0249:
            r1.concat(r3)     // Catch:{ all -> 0x0392 }
        L_0x024c:
            boolean r1 = r11.c     // Catch:{ all -> 0x0392 }
            if (r1 != 0) goto L_0x0251
            goto L_0x0257
        L_0x0251:
            r11.c()     // Catch:{ all -> 0x0392 }
            r1 = 0
            r11.c = r1     // Catch:{ all -> 0x0392 }
        L_0x0257:
            aucj r1 = r11.b     // Catch:{ all -> 0x0392 }
            bpd r1 = (defpackage.bpd) r1     // Catch:{ all -> 0x0392 }
            r3 = 4
            r1.g = r3     // Catch:{ all -> 0x0392 }
            int r3 = r1.a     // Catch:{ all -> 0x0392 }
            r3 = r3 | 16
            r1.a = r3     // Catch:{ all -> 0x0392 }
            long r3 = r5.lastModified()     // Catch:{ all -> 0x0392 }
            boolean r1 = r11.c     // Catch:{ all -> 0x0392 }
            if (r1 != 0) goto L_0x026d
            goto L_0x0273
        L_0x026d:
            r11.c()     // Catch:{ all -> 0x0392 }
            r1 = 0
            r11.c = r1     // Catch:{ all -> 0x0392 }
        L_0x0273:
            aucj r1 = r11.b     // Catch:{ all -> 0x0392 }
            bpd r1 = (defpackage.bpd) r1     // Catch:{ all -> 0x0392 }
            int r6 = r1.a     // Catch:{ all -> 0x0392 }
            r6 = r6 | 2
            r1.a = r6     // Catch:{ all -> 0x0392 }
            r1.c = r3     // Catch:{ all -> 0x0392 }
            int r1 = r2.versionCode     // Catch:{ all -> 0x0392 }
            boolean r3 = r11.c     // Catch:{ all -> 0x0392 }
            if (r3 != 0) goto L_0x0286
            goto L_0x028c
        L_0x0286:
            r11.c()     // Catch:{ all -> 0x0392 }
            r3 = 0
            r11.c = r3     // Catch:{ all -> 0x0392 }
        L_0x028c:
            aucj r3 = r11.b     // Catch:{ all -> 0x0392 }
            bpd r3 = (defpackage.bpd) r3     // Catch:{ all -> 0x0392 }
            int r4 = r3.a     // Catch:{ all -> 0x0392 }
            r4 = r4 | 8
            r3.a = r4     // Catch:{ all -> 0x0392 }
            r3.f = r1     // Catch:{ all -> 0x0392 }
            java.lang.String r1 = r2.packageName     // Catch:{ all -> 0x0392 }
            boolean r2 = r11.c     // Catch:{ all -> 0x0392 }
            if (r2 != 0) goto L_0x029f
            goto L_0x02a5
        L_0x029f:
            r11.c()     // Catch:{ all -> 0x0392 }
            r2 = 0
            r11.c = r2     // Catch:{ all -> 0x0392 }
        L_0x02a5:
            aucj r2 = r11.b     // Catch:{ all -> 0x0392 }
            bpd r2 = (defpackage.bpd) r2     // Catch:{ all -> 0x0392 }
            r1.getClass()     // Catch:{ all -> 0x0392 }
            int r3 = r2.a     // Catch:{ all -> 0x0392 }
            r3 = r3 | 32
            r2.a = r3     // Catch:{ all -> 0x0392 }
            r2.h = r1     // Catch:{ all -> 0x0392 }
            r1 = r3 | 4
            r2.a = r1     // Catch:{ all -> 0x0392 }
            r1 = 0
            r2.d = r1     // Catch:{ all -> 0x0392 }
            aucx r1 = defpackage.aucj.s()     // Catch:{ all -> 0x0392 }
            r2.e = r1     // Catch:{ all -> 0x0392 }
            blt r1 = new blt     // Catch:{ all -> 0x0392 }
            r1.<init>(r5)     // Catch:{ all -> 0x0392 }
            java.util.List r7 = java.util.Collections.singletonList(r1)     // Catch:{ all -> 0x0392 }
            r17 = 0
            r1 = r22
            r2 = r23
            r3 = r26
            r4 = r9
            r18 = r5
            r5 = r11
            r19 = r20
            r6 = r15
            r20 = r27
            r21 = r8
            r8 = r14
            r12 = r9
            r9 = r17
            boolean r1 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0392 }
            if (r1 != 0) goto L_0x0310
            java.lang.String r1 = r18.getAbsolutePath()     // Catch:{ all -> 0x0392 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0392 }
            int r2 = r2.length()     // Catch:{ all -> 0x0392 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0392 }
            int r2 = r2 + 25
            r3.<init>(r2)     // Catch:{ all -> 0x0392 }
            java.lang.String r2 = "Failed staging "
            r3.append(r2)     // Catch:{ all -> 0x0392 }
            r3.append(r1)     // Catch:{ all -> 0x0392 }
            java.lang.String r1 = ", skipping"
            r3.append(r1)     // Catch:{ all -> 0x0392 }
            java.lang.String r1 = "FileApkMgr"
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0392 }
            android.util.Log.e(r1, r2)     // Catch:{ all -> 0x0392 }
        L_0x0310:
            aucj r1 = r11.i()     // Catch:{ all -> 0x0392 }
            bpd r1 = (defpackage.bpd) r1     // Catch:{ all -> 0x0392 }
            r12.a((int) r15, (defpackage.bpd) r1)     // Catch:{ all -> 0x0392 }
            r1 = 1
            goto L_0x0326
        L_0x031b:
            r25 = r1
            r19 = r6
            r20 = r7
            r21 = r8
            r12 = r9
        L_0x0324:
            r1 = r25
        L_0x0326:
            int r6 = r19 + 1
            r9 = r12
            r7 = r20
            r8 = r21
            r11 = 0
            r12 = 1
            r15 = 5
            goto L_0x0118
        L_0x0332:
            r25 = r1
            r12 = r9
            goto L_0x0338
        L_0x0336:
            r12 = r9
            r1 = 0
        L_0x0338:
            r16 = r16 | r1
            goto L_0x033c
        L_0x033b:
            r12 = r9
        L_0x033c:
            if (r0 == 0) goto L_0x0360
            java.util.Iterator r0 = r24.iterator()     // Catch:{ all -> 0x0392 }
        L_0x0342:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0392 }
            if (r1 == 0) goto L_0x035f
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0392 }
            r4 = r1
            bms r4 = (defpackage.bms) r4     // Catch:{ all -> 0x0392 }
            r7 = 0
            r1 = r22
            r2 = r23
            r3 = r12
            r5 = r14
            r6 = r26
            boolean r1 = r1.a(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0392 }
            r16 = r16 | r1
            goto L_0x0342
        L_0x035f:
            goto L_0x0361
        L_0x0360:
        L_0x0361:
            boolean r0 = defpackage.blz.a((defpackage.aucd) r12)     // Catch:{ all -> 0x0392 }
            r0 = r16 | r0
            if (r0 == 0) goto L_0x0385
            java.io.File r0 = r10.b     // Catch:{ all -> 0x0392 }
            aucj r1 = r12.i()     // Catch:{ all -> 0x0392 }
            bpe r1 = (defpackage.bpe) r1     // Catch:{ all -> 0x0392 }
            r2 = 1
            boolean r0 = r10.a((java.io.File) r0, (defpackage.bpe) r1, (boolean) r2)     // Catch:{ all -> 0x0392 }
            if (r0 != 0) goto L_0x0382
            java.lang.String r0 = "FileApkMgr"
            java.lang.String r1 = "Failed to write config file"
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0392 }
            monitor-exit(r13)     // Catch:{ all -> 0x0392 }
            r0 = 0
            return r0
        L_0x0382:
            monitor-exit(r13)     // Catch:{ all -> 0x0392 }
            r0 = 1
            return r0
        L_0x0385:
            monitor-exit(r13)     // Catch:{ all -> 0x0392 }
            r0 = 0
            return r0
        L_0x0388:
            java.lang.String r0 = "FileApkMgr"
            java.lang.String r1 = "Failed to get module files directory"
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0392 }
            monitor-exit(r13)     // Catch:{ all -> 0x0392 }
            r0 = 0
            return r0
        L_0x0392:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0392 }
            throw r0
        L_0x0395:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blu.a(bpu, java.util.Set, boolean, boolean, bpq):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v21, resolved type: anfv} */
    /* JADX WARNING: type inference failed for: r28v12, types: [java.util.Enumeration] */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03c5, code lost:
        r12 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03cb, code lost:
        r28 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        r13 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03d7, code lost:
        r32 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r12).length() + 57);
        r7.append("FileApk ");
        r7.append(r12);
        r7.append(" wants min-sdk ");
        r7.append(r1);
        r7.append(", but found ");
        r7.append(r13);
        android.util.Log.e("FileApkUtils", r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0401, code lost:
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        r9.close();
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0404, code lost:
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:?, code lost:
        r4.close();
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0407, code lost:
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        r3.close();
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x040a, code lost:
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:?, code lost:
        r15.close();
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0439, code lost:
        r0 = th;
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x043b, code lost:
        r0 = th;
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0461, code lost:
        r28 = r13;
        r32 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0465, code lost:
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:?, code lost:
        r9.close();
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0468, code lost:
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:?, code lost:
        r4.close();
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x046b, code lost:
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        r3.close();
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x046e, code lost:
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:?, code lost:
        r15.close();
        r28 = r28;
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0473, code lost:
        r0 = th;
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x047f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0481, code lost:
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:?, code lost:
        defpackage.apev.a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x048f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0491, code lost:
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        defpackage.apev.a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04a8, code lost:
        r0 = th;
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x04b2, code lost:
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        defpackage.apev.a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04b6, code lost:
        r0 = th;
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x04d8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x016a, code lost:
        if (r22 == false) goto L_0x016c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04ac A[SYNTHETIC, Splitter:B:247:0x04ac] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x052a  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x057f A[Catch:{ all -> 0x0a93 }] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0595 A[Catch:{ all -> 0x0a93 }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0615 A[Catch:{ IOException -> 0x091d }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0616 A[Catch:{ IOException -> 0x091d }] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0631 A[SYNTHETIC, Splitter:B:326:0x0631] */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0822 A[Catch:{ all -> 0x0a93 }] */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0834 A[Catch:{ all -> 0x0a93 }] */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x096e A[Catch:{ all -> 0x0a93 }] */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x0a6d  */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x0a9c  */
    /* JADX WARNING: Removed duplicated region for block: B:568:0x04b5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ac A[SYNTHETIC, Splitter:B:67:0x01ac] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.bpu r35, boolean r36, defpackage.aucd r37, defpackage.aucd r38, int r39, java.lang.Iterable r40, java.io.File r41, defpackage.bpq r42) {
        /*
            r34 = this;
            r7 = r34
            r8 = r37
            r9 = r38
            r10 = r39
            r11 = r41
            r12 = r42
            aucj r1 = r9.b
            bpd r1 = (defpackage.bpd) r1
            int r1 = r1.g
            int r1 = defpackage.bpc.a(r1)
            r13 = 44
            r14 = 2
            if (r1 != 0) goto L_0x001c
            goto L_0x0041
        L_0x001c:
            if (r1 != r14) goto L_0x0041
            defpackage.bkn.b()
            amsk r1 = defpackage.amsk.a((char) r13)
            amsk r1 = r1.b()
            amsk r1 = r1.a()
            awxs r2 = defpackage.awxs.a
            awxt r2 = r2.a()
            java.lang.String r2 = r2.h()
            java.lang.Iterable r1 = r1.a((java.lang.CharSequence) r2)
            anax r1 = defpackage.anax.a((java.lang.Iterable) r1)
            r15 = r1
            goto L_0x0044
        L_0x0041:
            anfv r1 = defpackage.anfv.a
            r15 = r1
        L_0x0044:
            java.util.Iterator r16 = r40.iterator()
            r6 = 1
            r5 = 0
            r1 = 0
            r17 = 0
            r18 = 0
        L_0x004f:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0b51
            java.lang.Object r2 = r16.next()
            r4 = r2
            blq r4 = (defpackage.blq) r4
            if (r1 == 0) goto L_0x0076
            aucj r1 = r38.i()
            bpd r1 = (defpackage.bpd) r1
            r8.a((int) r10, (defpackage.bpd) r1)
            aucj r1 = r37.i()
            bpe r1 = (defpackage.bpe) r1
            boolean r1 = r7.a((defpackage.bpe) r1, (defpackage.bpq) r12)
            if (r1 != 0) goto L_0x0075
            r1 = 1
            goto L_0x0076
        L_0x0075:
            r1 = 0
        L_0x0076:
            java.lang.String r3 = r4.a()
            boolean r2 = r15.contains(r3)
            if (r2 != 0) goto L_0x0b38
            bpf r2 = defpackage.bpf.i
            aucd r2 = r2.o()
            boolean r13 = r2.c
            if (r13 != 0) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            r2.c()
            r2.c = r5
        L_0x0090:
            aucj r13 = r2.b
            bpf r13 = (defpackage.bpf) r13
            r3.getClass()
            int r14 = r13.a
            r14 = r14 | r6
            r13.a = r14
            r13.b = r3
            aucj r13 = r9.b
            bpd r13 = (defpackage.bpd) r13
            aucx r13 = r13.e
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            aucj r14 = r2.i()
            bpf r14 = (defpackage.bpf) r14
            java.util.Comparator r6 = defpackage.blz.a
            int r13 = java.util.Collections.binarySearch(r13, r14, r6)
            if (r13 < 0) goto L_0x00c6
            bpf r2 = r9.b((int) r13)
            r6 = 5
            java.lang.Object r6 = r2.c(r6)
            aucd r6 = (defpackage.aucd) r6
            r6.a((defpackage.aucj) r2)
            r14 = r6
            goto L_0x00c7
        L_0x00c6:
            r14 = r2
        L_0x00c7:
            if (r13 < 0) goto L_0x0129
            aucj r6 = r14.b
            bpf r6 = (defpackage.bpf) r6
            boolean r6 = r6.e
            if (r6 != 0) goto L_0x0129
            aucj r6 = r8.b
            bpe r6 = (defpackage.bpe) r6
            aucx r6 = r6.d
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)
            aucj r20 = r14.i()
            r2 = r20
            bpf r2 = (defpackage.bpf) r2
            java.util.Comparator r5 = defpackage.blz.b
            int r2 = java.util.Collections.binarySearch(r6, r2, r5)
            if (r2 < 0) goto L_0x0129
            aucj r5 = r14.b
            bpf r5 = (defpackage.bpf) r5
            java.lang.String r5 = r5.c
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.String r22 = java.lang.String.valueOf(r5)
            int r22 = r22.length()
            r23 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r6 = r6 + 19
            int r6 = r6 + r22
            r1.<init>(r6)
            java.lang.String r6 = "Already staged: "
            r1.append(r6)
            r1.append(r3)
            java.lang.String r6 = " ["
            r1.append(r6)
            r1.append(r5)
            java.lang.String r5 = "]"
            r1.append(r5)
            r1.toString()
            bpf r1 = r8.d((int) r2)
            goto L_0x012c
        L_0x0129:
            r23 = r1
            r1 = 0
        L_0x012c:
            if (r1 != 0) goto L_0x0aa0
            java.lang.String r1 = "Staging: "
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0a97 }
            int r5 = r2.length()     // Catch:{ all -> 0x0a97 }
            if (r5 != 0) goto L_0x0140
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0a97 }
            r2.<init>(r1)     // Catch:{ all -> 0x0a97 }
            goto L_0x0143
        L_0x0140:
            r1.concat(r2)     // Catch:{ all -> 0x0a97 }
        L_0x0143:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0a97 }
            java.lang.String r2 = "s"
            r1.<init>(r11, r2)     // Catch:{ all -> 0x0a97 }
            boolean r2 = r1.isDirectory()     // Catch:{ all -> 0x0a97 }
            if (r2 == 0) goto L_0x0184
            java.io.File[] r2 = r1.listFiles()     // Catch:{ all -> 0x0a97 }
            if (r2 == 0) goto L_0x016c
            int r5 = r2.length     // Catch:{ all -> 0x0a97 }
            r6 = 0
            r22 = 1
        L_0x015a:
            if (r6 >= r5) goto L_0x016a
            r24 = r2[r6]     // Catch:{ all -> 0x0a97 }
            boolean r24 = defpackage.bma.a((java.io.File) r24)     // Catch:{ all -> 0x0a97 }
            if (r24 == 0) goto L_0x0165
            goto L_0x0167
        L_0x0165:
            r22 = 0
        L_0x0167:
            int r6 = r6 + 1
            goto L_0x015a
        L_0x016a:
            if (r22 != 0) goto L_0x0181
        L_0x016c:
            java.io.File r2 = defpackage.blz.a((java.io.File) r11, (java.io.File) r1)     // Catch:{ all -> 0x0a97 }
            if (r2 == 0) goto L_0x0182
            boolean r2 = r1.mkdirs()     // Catch:{ all -> 0x0a97 }
            if (r2 != 0) goto L_0x0181
            java.lang.String r1 = "FileApkUtils"
            java.lang.String r2 = "Failed to create module scratch directory."
            android.util.Log.e(r1, r2)     // Catch:{ all -> 0x0a97 }
            r6 = 0
            goto L_0x01aa
        L_0x0181:
            goto L_0x01a9
        L_0x0182:
            r6 = 0
            goto L_0x01aa
        L_0x0184:
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0a97 }
            if (r2 == 0) goto L_0x0199
            boolean r2 = r1.delete()     // Catch:{ all -> 0x0a97 }
            if (r2 != 0) goto L_0x0199
            java.lang.String r1 = "FileApkUtils"
            java.lang.String r2 = "Failed to delete file with name of module scratch directory."
            android.util.Log.e(r1, r2)     // Catch:{ all -> 0x0a97 }
            r6 = 0
            goto L_0x01aa
        L_0x0199:
            boolean r2 = r1.mkdirs()     // Catch:{ all -> 0x0a97 }
            if (r2 != 0) goto L_0x01a8
            java.lang.String r1 = "FileApkUtils"
            java.lang.String r2 = "Failed to create module scratch directory."
            android.util.Log.e(r1, r2)     // Catch:{ all -> 0x0a97 }
            r6 = 0
            goto L_0x01aa
        L_0x01a8:
        L_0x01a9:
            r6 = r1
        L_0x01aa:
            if (r6 == 0) goto L_0x0a6d
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0a6a }
            r5.<init>(r6, r3)     // Catch:{ all -> 0x0a6a }
            java.lang.String r2 = r4.a(r5)     // Catch:{ all -> 0x0a6a }
            if (r2 != 0) goto L_0x01ec
            java.lang.String r1 = "FileApkMgr"
            java.lang.String r2 = "Failed to stage: "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01e7 }
            int r4 = r3.length()     // Catch:{ all -> 0x01e7 }
            if (r4 != 0) goto L_0x01cb
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x01e7 }
            r3.<init>(r2)     // Catch:{ all -> 0x01e7 }
            goto L_0x01cf
        L_0x01cb:
            java.lang.String r3 = r2.concat(r3)     // Catch:{ all -> 0x01e7 }
        L_0x01cf:
            android.util.Log.e(r1, r3)     // Catch:{ all -> 0x01e7 }
            android.content.Context r1 = r7.a     // Catch:{ all -> 0x01e7 }
            r2 = 34
            defpackage.bla.a((android.content.Context) r1, (int) r2)     // Catch:{ all -> 0x01e7 }
            defpackage.bma.a((java.io.File) r6)
            r1 = r23
            r5 = 0
            r6 = 1
            r13 = 44
            r14 = 2
            r17 = 1
            goto L_0x004f
        L_0x01e7:
            r0 = move-exception
            r1 = r0
            r7 = r6
            goto L_0x0a95
        L_0x01ec:
            boolean r1 = r14.c     // Catch:{ all -> 0x0a6a }
            if (r1 != 0) goto L_0x01f1
            goto L_0x01f7
        L_0x01f1:
            r14.c()     // Catch:{ all -> 0x0a6a }
            r1 = 0
            r14.c = r1     // Catch:{ all -> 0x0a6a }
        L_0x01f7:
            aucj r1 = r14.b     // Catch:{ all -> 0x0a6a }
            bpf r1 = (defpackage.bpf) r1     // Catch:{ all -> 0x0a6a }
            r2.getClass()     // Catch:{ all -> 0x0a6a }
            r22 = r3
            int r3 = r1.a     // Catch:{ all -> 0x0a6a }
            r19 = 2
            r3 = r3 | 2
            r1.a = r3     // Catch:{ all -> 0x0a6a }
            r1.c = r2     // Catch:{ all -> 0x0a6a }
            r3 = r3 | 8
            r1.a = r3     // Catch:{ all -> 0x0a6a }
            r3 = 0
            r1.e = r3     // Catch:{ all -> 0x0a6a }
            aucj r1 = r8.b     // Catch:{ all -> 0x0a6a }
            bpe r1 = (defpackage.bpe) r1     // Catch:{ all -> 0x0a6a }
            aucx r1 = r1.d     // Catch:{ all -> 0x0a6a }
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ all -> 0x0a6a }
            aucj r3 = r14.i()     // Catch:{ all -> 0x0a6a }
            bpf r3 = (defpackage.bpf) r3     // Catch:{ all -> 0x0a6a }
            r24 = r2
            java.util.Comparator r2 = defpackage.blz.b     // Catch:{ all -> 0x0a6a }
            int r3 = java.util.Collections.binarySearch(r1, r3, r2)     // Catch:{ all -> 0x0a6a }
            if (r3 >= 0) goto L_0x0a25
            java.lang.String r1 = r5.getAbsolutePath()     // Catch:{ all -> 0x0a6a }
            android.content.Context r2 = r7.a     // Catch:{ all -> 0x0a6a }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ all -> 0x0a6a }
            r25 = r6
            r6 = 0
            android.content.pm.PackageInfo r2 = r2.getPackageArchiveInfo(r1, r6)     // Catch:{ all -> 0x0a20 }
            bmr r1 = defpackage.bmr.a(r1)     // Catch:{ all -> 0x0a20 }
            android.content.Context r6 = r7.a     // Catch:{ all -> 0x0a20 }
            r23 = r1
            r1 = 38
            if (r2 != 0) goto L_0x027f
            java.lang.String r2 = r5.getName()     // Catch:{ all -> 0x0279 }
            defpackage.bla.a(r6, r1, r2)     // Catch:{ all -> 0x0279 }
            java.lang.String r1 = "FileApkMgr"
            java.lang.String r3 = "File is not a valid apk: "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0279 }
            int r4 = r2.length()     // Catch:{ all -> 0x0279 }
            if (r4 != 0) goto L_0x0263
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0279 }
            r2.<init>(r3)     // Catch:{ all -> 0x0279 }
            goto L_0x0267
        L_0x0263:
            java.lang.String r2 = r3.concat(r2)     // Catch:{ all -> 0x0279 }
        L_0x0267:
            android.util.Log.e(r1, r2)     // Catch:{ all -> 0x0279 }
            r5 = r8
            r10 = r11
            r26 = r15
            r11 = r22
            r12 = r24
            r7 = r25
            r2 = 44
            r8 = 2
            goto L_0x09d5
        L_0x0279:
            r0 = move-exception
            r1 = r0
            r7 = r25
            goto L_0x0a95
        L_0x027f:
            r1 = r35
            boolean r26 = r1.a(r5)     // Catch:{ all -> 0x0a20 }
            if (r26 == 0) goto L_0x09a5
            java.lang.String r26 = "^\\s*(.+?): \"(.*?)\"$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r26)     // Catch:{ all -> 0x0a20 }
            r26 = r15
            java.util.zip.ZipFile r15 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x04de, NumberFormatException -> 0x04dc }
            r15.<init>(r5)     // Catch:{ IOException -> 0x04de, NumberFormatException -> 0x04dc }
            java.util.Enumeration r28 = r15.entries()     // Catch:{ all -> 0x04c4 }
            r29 = r3
            ob r3 = new ob     // Catch:{ all -> 0x04c2 }
            r3.<init>()     // Catch:{ all -> 0x04c2 }
        L_0x029f:
            boolean r30 = r28.hasMoreElements()     // Catch:{ all -> 0x04c2 }
            if (r30 == 0) goto L_0x02e4
            java.lang.Object r30 = r28.nextElement()     // Catch:{ all -> 0x02da }
            java.util.zip.ZipEntry r30 = (java.util.zip.ZipEntry) r30     // Catch:{ all -> 0x02da }
            r31 = r4
            java.lang.String r4 = r30.getName()     // Catch:{ all -> 0x02f6 }
            java.lang.String r10 = "lib/"
            boolean r10 = r4.startsWith(r10)     // Catch:{ all -> 0x02f6 }
            if (r10 == 0) goto L_0x02d5
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x02f6 }
            r10.<init>(r4)     // Catch:{ all -> 0x02f6 }
            java.io.File r4 = r10.getParentFile()     // Catch:{ all -> 0x02f6 }
            if (r4 == 0) goto L_0x02d0
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x02f6 }
            r3.add(r4)     // Catch:{ all -> 0x02f6 }
            r10 = r39
            r4 = r31
            goto L_0x029f
        L_0x02d0:
            r10 = r39
            r4 = r31
            goto L_0x029f
        L_0x02d5:
            r10 = r39
            r4 = r31
            goto L_0x029f
        L_0x02da:
            r0 = move-exception
            r31 = r4
        L_0x02dd:
            r1 = r0
            r28 = r13
            r32 = r14
            goto L_0x04ce
        L_0x02e4:
            r31 = r4
            int r4 = r3.b     // Catch:{ all -> 0x04c0 }
            r10 = 1
            if (r4 != r10) goto L_0x02f8
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x02f6 }
            java.lang.Object r3 = r3.next()     // Catch:{ all -> 0x02f6 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x02f6 }
            goto L_0x0312
        L_0x02f6:
            r0 = move-exception
            goto L_0x02dd
        L_0x02f8:
            r10 = 2
            if (r4 != r10) goto L_0x0311
            java.lang.String r4 = "arm64-v8a"
            boolean r4 = r3.contains(r4)     // Catch:{ all -> 0x02f6 }
            if (r4 != 0) goto L_0x030e
            java.lang.String r4 = "x86_64"
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x02f6 }
            if (r3 == 0) goto L_0x0311
            java.lang.String r3 = "x86_64"
            goto L_0x0312
        L_0x030e:
            java.lang.String r3 = "arm64-v8a"
            goto L_0x0312
        L_0x0311:
            r3 = 0
        L_0x0312:
            if (r3 == 0) goto L_0x0379
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x02f6 }
            java.lang.String[] r4 = android.os.Build.SUPPORTED_ABIS     // Catch:{ all -> 0x02f6 }
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ all -> 0x02f6 }
            boolean r10 = r4.contains(r3)     // Catch:{ all -> 0x02f6 }
            if (r10 != 0) goto L_0x0379
            java.lang.String r1 = "FileApkUtils"
            java.lang.String r10 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x02f6 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x02f6 }
            java.lang.String r21 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02f6 }
            int r21 = r21.length()     // Catch:{ all -> 0x02f6 }
            int r21 = r21 + 36
            int r28 = r3.length()     // Catch:{ all -> 0x02f6 }
            int r21 = r21 + r28
            java.lang.String r28 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x02f6 }
            int r28 = r28.length()     // Catch:{ all -> 0x02f6 }
            int r12 = r21 + r28
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x02f6 }
            r9.<init>(r12)     // Catch:{ all -> 0x02f6 }
            java.lang.String r12 = "FileApk "
            r9.append(r12)     // Catch:{ all -> 0x02f6 }
            r9.append(r10)     // Catch:{ all -> 0x02f6 }
            java.lang.String r10 = " wants ABI "
            r9.append(r10)     // Catch:{ all -> 0x02f6 }
            r9.append(r3)     // Catch:{ all -> 0x02f6 }
            java.lang.String r3 = ", but found ABIs "
            r9.append(r3)     // Catch:{ all -> 0x02f6 }
            r9.append(r4)     // Catch:{ all -> 0x02f6 }
            java.lang.String r3 = r9.toString()     // Catch:{ all -> 0x02f6 }
            android.util.Log.e(r1, r3)     // Catch:{ all -> 0x02f6 }
            r15.close()     // Catch:{ IOException -> 0x0371, NumberFormatException -> 0x036f }
            goto L_0x040d
        L_0x036f:
            r0 = move-exception
            goto L_0x0372
        L_0x0371:
            r0 = move-exception
        L_0x0372:
            r1 = r0
            r28 = r13
            r32 = r14
            goto L_0x04e8
        L_0x0379:
            java.lang.String r3 = "assets/module.yaml"
            java.util.zip.ZipEntry r3 = r15.getEntry(r3)     // Catch:{ all -> 0x04c0 }
            if (r3 != 0) goto L_0x0387
            java.lang.String r3 = "module.yaml"
            java.util.zip.ZipEntry r3 = r15.getEntry(r3)     // Catch:{ all -> 0x02f6 }
        L_0x0387:
            if (r3 == 0) goto L_0x04b8
            java.io.InputStream r3 = r15.getInputStream(r3)     // Catch:{ all -> 0x04c0 }
            if (r3 == 0) goto L_0x049c
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x0495 }
            r4.<init>(r3)     // Catch:{ all -> 0x0495 }
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ all -> 0x0485 }
            r9.<init>(r4)     // Catch:{ all -> 0x0485 }
        L_0x0399:
            java.lang.String r10 = r9.readLine()     // Catch:{ all -> 0x0475 }
            if (r10 == 0) goto L_0x0461
            java.util.regex.Matcher r10 = r1.matcher(r10)     // Catch:{ all -> 0x0475 }
            boolean r12 = r10.matches()     // Catch:{ all -> 0x0475 }
            if (r12 == 0) goto L_0x0455
            r40 = r1
            r12 = 1
            java.lang.String r1 = r10.group(r12)     // Catch:{ all -> 0x0475 }
            r12 = 2
            java.lang.String r10 = r10.group(r12)     // Catch:{ all -> 0x0475 }
            java.lang.String r12 = "min_sdk"
            boolean r1 = r12.equals(r1)     // Catch:{ all -> 0x0475 }
            if (r1 == 0) goto L_0x0449
            int r1 = java.lang.Integer.parseInt(r10)     // Catch:{ all -> 0x0475 }
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0475 }
            if (r1 <= r10) goto L_0x043d
            java.lang.String r10 = "FileApkUtils"
            java.lang.String r12 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0475 }
            r28 = r13
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x043b }
            java.lang.String r30 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x043b }
            int r30 = r30.length()     // Catch:{ all -> 0x043b }
            r32 = r14
            r27 = 57
            int r14 = r30 + 57
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0439 }
            r7.<init>(r14)     // Catch:{ all -> 0x0439 }
            java.lang.String r14 = "FileApk "
            r7.append(r14)     // Catch:{ all -> 0x0439 }
            r7.append(r12)     // Catch:{ all -> 0x0439 }
            java.lang.String r12 = " wants min-sdk "
            r7.append(r12)     // Catch:{ all -> 0x0439 }
            r7.append(r1)     // Catch:{ all -> 0x0439 }
            java.lang.String r1 = ", but found "
            r7.append(r1)     // Catch:{ all -> 0x0439 }
            r7.append(r13)     // Catch:{ all -> 0x0439 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x0439 }
            android.util.Log.e(r10, r1)     // Catch:{ all -> 0x0439 }
            r9.close()     // Catch:{ all -> 0x0473 }
            r4.close()     // Catch:{ all -> 0x04a8 }
            r3.close()     // Catch:{ all -> 0x04b6 }
            r15.close()     // Catch:{ IOException -> 0x04da, NumberFormatException -> 0x04d8 }
        L_0x040d:
            java.lang.String r1 = r5.getName()     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = "compat:"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0279 }
            int r3 = r1.length()     // Catch:{ all -> 0x0279 }
            if (r3 != 0) goto L_0x0423
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0279 }
            r1.<init>(r2)     // Catch:{ all -> 0x0279 }
            goto L_0x0427
        L_0x0423:
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x0279 }
        L_0x0427:
            r7 = 38
            defpackage.bla.a(r6, r7, r1)     // Catch:{ all -> 0x0279 }
            r5 = r8
            r10 = r11
            r11 = r22
            r12 = r24
            r7 = r25
            r2 = 44
            r8 = 2
            goto L_0x09d5
        L_0x0439:
            r0 = move-exception
            goto L_0x047a
        L_0x043b:
            r0 = move-exception
            goto L_0x0478
        L_0x043d:
            r28 = r13
            r32 = r14
            r7 = 38
            r7 = r34
            r1 = r40
            goto L_0x0399
        L_0x0449:
            r28 = r13
            r32 = r14
            r7 = 38
            r7 = r34
            r1 = r40
            goto L_0x0399
        L_0x0455:
            r40 = r1
            r28 = r13
            r32 = r14
            r7 = 38
            r7 = r34
            goto L_0x0399
        L_0x0461:
            r28 = r13
            r32 = r14
            r9.close()     // Catch:{ all -> 0x0473 }
            r4.close()     // Catch:{ all -> 0x04a8 }
            r3.close()     // Catch:{ all -> 0x04b6 }
            r15.close()     // Catch:{ IOException -> 0x04da, NumberFormatException -> 0x04d8 }
            goto L_0x051b
        L_0x0473:
            r0 = move-exception
            goto L_0x048a
        L_0x0475:
            r0 = move-exception
            r28 = r13
        L_0x0478:
            r32 = r14
        L_0x047a:
            r1 = r0
            r9.close()     // Catch:{ all -> 0x047f }
            goto L_0x0484
        L_0x047f:
            r0 = move-exception
            r6 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r6)     // Catch:{ all -> 0x0473 }
        L_0x0484:
            throw r1     // Catch:{ all -> 0x0473 }
        L_0x0485:
            r0 = move-exception
            r28 = r13
            r32 = r14
        L_0x048a:
            r1 = r0
            r4.close()     // Catch:{ all -> 0x048f }
            goto L_0x0494
        L_0x048f:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r4)     // Catch:{ all -> 0x04a8 }
        L_0x0494:
            throw r1     // Catch:{ all -> 0x04a8 }
        L_0x0495:
            r0 = move-exception
            r28 = r13
            r32 = r14
        L_0x049a:
            r1 = r0
            goto L_0x04aa
        L_0x049c:
            r28 = r13
            r32 = r14
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x04a8 }
            java.lang.String r4 = "Failed to open zip entry input stream."
            r1.<init>(r4)     // Catch:{ all -> 0x04a8 }
            throw r1     // Catch:{ all -> 0x04a8 }
        L_0x04a8:
            r0 = move-exception
            goto L_0x049a
        L_0x04aa:
            if (r3 == 0) goto L_0x04b5
            r3.close()     // Catch:{ all -> 0x04b0 }
            goto L_0x04b5
        L_0x04b0:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r3)     // Catch:{ all -> 0x04b6 }
        L_0x04b5:
            throw r1     // Catch:{ all -> 0x04b6 }
        L_0x04b6:
            r0 = move-exception
            goto L_0x04cd
        L_0x04b8:
            r28 = r13
            r32 = r14
            r15.close()     // Catch:{ IOException -> 0x04da, NumberFormatException -> 0x04d8 }
            goto L_0x051b
        L_0x04c0:
            r0 = move-exception
            goto L_0x04c9
        L_0x04c2:
            r0 = move-exception
            goto L_0x04c7
        L_0x04c4:
            r0 = move-exception
            r29 = r3
        L_0x04c7:
            r31 = r4
        L_0x04c9:
            r28 = r13
            r32 = r14
        L_0x04cd:
            r1 = r0
        L_0x04ce:
            r15.close()     // Catch:{ all -> 0x04d2 }
            goto L_0x04d7
        L_0x04d2:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r3)     // Catch:{ IOException -> 0x04da, NumberFormatException -> 0x04d8 }
        L_0x04d7:
            throw r1     // Catch:{ IOException -> 0x04da, NumberFormatException -> 0x04d8 }
        L_0x04d8:
            r0 = move-exception
            goto L_0x04e7
        L_0x04da:
            r0 = move-exception
            goto L_0x04e7
        L_0x04dc:
            r0 = move-exception
            goto L_0x04df
        L_0x04de:
            r0 = move-exception
        L_0x04df:
            r29 = r3
            r31 = r4
            r28 = r13
            r32 = r14
        L_0x04e7:
            r1 = r0
        L_0x04e8:
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0a20 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0a20 }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0a20 }
            int r4 = r4.length()     // Catch:{ all -> 0x0a20 }
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0a20 }
            int r6 = r6.length()     // Catch:{ all -> 0x0a20 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a20 }
            int r4 = r4 + 35
            int r4 = r4 + r6
            r7.<init>(r4)     // Catch:{ all -> 0x0a20 }
            java.lang.String r4 = "Failed to read module.yaml from : "
            r7.append(r4)     // Catch:{ all -> 0x0a20 }
            r7.append(r3)     // Catch:{ all -> 0x0a20 }
            java.lang.String r3 = ":"
            r7.append(r3)     // Catch:{ all -> 0x0a20 }
            r7.append(r1)     // Catch:{ all -> 0x0a20 }
            r7.toString()     // Catch:{ all -> 0x0a20 }
        L_0x051b:
            defpackage.amtf.a((java.lang.Object) r2)     // Catch:{ all -> 0x0a20 }
            aucj r1 = r8.b     // Catch:{ all -> 0x0a20 }
            bpe r1 = (defpackage.bpe) r1     // Catch:{ all -> 0x0a20 }
            int r1 = r1.e     // Catch:{ all -> 0x0a20 }
            java.lang.Integer r7 = defpackage.blz.a((java.io.File) r11, (int) r1)     // Catch:{ all -> 0x0a20 }
            if (r7 != 0) goto L_0x057f
            r9 = r34
            android.content.Context r1 = r9.a     // Catch:{ InvalidConfigException -> 0x0563 }
            bkv r1 = defpackage.bkv.a((android.content.Context) r1)     // Catch:{ InvalidConfigException -> 0x0563 }
            boz r3 = r1.f()     // Catch:{ InvalidConfigException -> 0x0563 }
            java.io.File r4 = r9.b     // Catch:{ InvalidConfigException -> 0x0563 }
            r6 = 0
            r10 = r23
            r1 = r34
            r13 = r2
            r12 = r24
            r2 = r3
            r14 = r22
            r15 = r29
            r3 = r41
            r22 = r31
            r33 = r5
            r40 = r7
            r7 = 0
            r5 = r37
            r7 = r25
            r9 = -1
            r1.a((defpackage.boz) r2, (java.io.File) r3, (java.io.File) r4, (defpackage.aucd) r5, (boolean) r6)     // Catch:{ InvalidConfigException -> 0x0561 }
            aucj r1 = r8.b     // Catch:{ InvalidConfigException -> 0x0561 }
            bpe r1 = (defpackage.bpe) r1     // Catch:{ InvalidConfigException -> 0x0561 }
            int r1 = r1.e     // Catch:{ InvalidConfigException -> 0x0561 }
            java.lang.Integer r1 = defpackage.blz.a((java.io.File) r11, (int) r1)     // Catch:{ InvalidConfigException -> 0x0561 }
            goto L_0x0593
        L_0x0561:
            r0 = move-exception
            goto L_0x0576
        L_0x0563:
            r0 = move-exception
            r13 = r2
            r33 = r5
            r40 = r7
            r14 = r22
            r10 = r23
            r12 = r24
            r7 = r25
            r15 = r29
            r22 = r31
            r9 = -1
        L_0x0576:
            r1 = r0
            java.lang.String r2 = "FileApkMgr"
            java.lang.String r3 = "Failed to get current config for cleanup"
            android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0a93 }
            goto L_0x0591
        L_0x057f:
            r13 = r2
            r33 = r5
            r40 = r7
            r14 = r22
            r10 = r23
            r12 = r24
            r7 = r25
            r15 = r29
            r22 = r31
            r9 = -1
        L_0x0591:
            r1 = r40
        L_0x0593:
            if (r1 == 0) goto L_0x096e
            android.content.pm.ApplicationInfo r2 = r13.applicationInfo     // Catch:{ all -> 0x0a93 }
            int r3 = r1.intValue()     // Catch:{ all -> 0x0a93 }
            boolean r4 = r22.b()     // Catch:{ all -> 0x0a93 }
            java.io.File r3 = defpackage.blz.b(r11, r3)     // Catch:{ all -> 0x0a93 }
            boolean r5 = r3.exists()     // Catch:{ all -> 0x0a93 }
            if (r5 == 0) goto L_0x05b6
            java.lang.String r2 = "FileApkMgr"
            java.lang.String r3 = "Module directory already exists."
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x0a93 }
            r5 = r8
            r10 = r11
            r11 = r14
            r8 = 2
            goto L_0x092a
        L_0x05b6:
            r5 = 1
            r6 = 0
            boolean r13 = r7.setExecutable(r5, r6)     // Catch:{ all -> 0x0a93 }
            if (r13 != 0) goto L_0x05cc
            java.lang.String r2 = "FileApkMgr"
            java.lang.String r3 = "Failed to make module directory world traversable."
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x0a93 }
            r5 = r8
            r10 = r11
            r11 = r14
            r8 = 2
            goto L_0x092a
        L_0x05cc:
            if (r4 != 0) goto L_0x05e5
            r4 = r33
            r5 = 1
            r6 = 0
            boolean r13 = r4.setReadable(r5, r6)     // Catch:{ all -> 0x0a93 }
            if (r13 != 0) goto L_0x05e7
            java.lang.String r2 = "FileApkMgr"
            java.lang.String r3 = "Failed to make apk world readable."
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x0a93 }
            r5 = r8
            r10 = r11
            r11 = r14
            r8 = 2
            goto L_0x092a
        L_0x05e5:
            r4 = r33
        L_0x05e7:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0a93 }
            r6 = 23
            if (r5 >= r6) goto L_0x05ee
        L_0x05ed:
            goto L_0x0600
        L_0x05ee:
            if (r2 == 0) goto L_0x0600
            int r2 = r2.flags     // Catch:{ all -> 0x0a93 }
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r5
            if (r2 == 0) goto L_0x05f8
            goto L_0x05ed
        L_0x05f8:
            r24 = r12
            r25 = r14
            r29 = r15
            goto L_0x081a
        L_0x0600:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x091d }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x091d }
            java.io.File r13 = r4.getParentFile()     // Catch:{ IOException -> 0x091d }
            java.lang.String r9 = "n"
            r2.<init>(r13, r9)     // Catch:{ IOException -> 0x091d }
            boolean r9 = r2.isDirectory()     // Catch:{ IOException -> 0x091d }
            if (r9 == 0) goto L_0x0616
            goto L_0x0622
        L_0x0616:
            boolean r9 = r2.mkdir()     // Catch:{ IOException -> 0x091d }
            if (r9 == 0) goto L_0x090f
            defpackage.bma.d(r2)     // Catch:{ IOException -> 0x091d }
            defpackage.bma.c(r2)     // Catch:{ IOException -> 0x091d }
        L_0x0622:
            java.util.zip.ZipFile r9 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x091d }
            r9.<init>(r4)     // Catch:{ IOException -> 0x091d }
            java.util.Enumeration r4 = r9.entries()     // Catch:{ all -> 0x08ff }
        L_0x062b:
            boolean r13 = r4.hasMoreElements()     // Catch:{ all -> 0x08ff }
            if (r13 == 0) goto L_0x07f5
            java.lang.Object r13 = r4.nextElement()     // Catch:{ all -> 0x07eb }
            java.util.zip.ZipEntry r13 = (java.util.zip.ZipEntry) r13     // Catch:{ all -> 0x07eb }
            r40 = r4
            java.lang.String r4 = r13.getName()     // Catch:{ all -> 0x07eb }
            r24 = r12
            java.lang.String r12 = "lib/"
            boolean r4 = r4.startsWith(r12)     // Catch:{ all -> 0x07e1 }
            if (r4 == 0) goto L_0x07d1
            boolean r4 = r13.isDirectory()     // Catch:{ all -> 0x07e1 }
            if (r4 != 0) goto L_0x07c1
            java.lang.String r4 = r13.getName()     // Catch:{ all -> 0x07e1 }
            java.io.File r12 = new java.io.File     // Catch:{ all -> 0x07e1 }
            r12.<init>(r4)     // Catch:{ all -> 0x07e1 }
            java.lang.String r4 = r12.getName()     // Catch:{ all -> 0x07e1 }
            java.io.File r22 = r12.getParentFile()     // Catch:{ all -> 0x07e1 }
            if (r22 == 0) goto L_0x07b1
            r25 = r14
            java.lang.String r14 = r22.getName()     // Catch:{ all -> 0x07a6 }
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x07a6 }
            r11.<init>(r2, r14)     // Catch:{ all -> 0x07a6 }
            boolean r22 = r11.exists()     // Catch:{ all -> 0x07a6 }
            if (r22 != 0) goto L_0x069b
            int r22 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x07a6 }
            r22 = r2
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS     // Catch:{ all -> 0x07a6 }
            int r8 = r2.length     // Catch:{ all -> 0x07a6 }
            r29 = r15
            r15 = 0
        L_0x067b:
            if (r15 >= r8) goto L_0x068c
            r23 = r8
            r8 = r2[r15]     // Catch:{ all -> 0x07a6 }
            boolean r8 = r8.equals(r14)     // Catch:{ all -> 0x07a6 }
            if (r8 != 0) goto L_0x069f
            int r15 = r15 + 1
            r8 = r23
            goto L_0x067b
        L_0x068c:
            r8 = r37
            r4 = r40
            r11 = r41
            r2 = r22
            r12 = r24
            r14 = r25
            r15 = r29
            goto L_0x062b
        L_0x069b:
            r22 = r2
            r29 = r15
        L_0x069f:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x07a6 }
            r2.<init>(r11, r4)     // Catch:{ all -> 0x07a6 }
            java.io.InputStream r4 = r9.getInputStream(r13)     // Catch:{ IOException -> 0x075b }
            if (r4 == 0) goto L_0x0745
            java.io.File r8 = r2.getParentFile()     // Catch:{ IOException -> 0x06f7 }
            if (r8 == 0) goto L_0x06ef
            boolean r11 = r8.exists()     // Catch:{ IOException -> 0x06f7 }
            if (r11 == 0) goto L_0x06b7
            goto L_0x06c3
        L_0x06b7:
            boolean r11 = r8.mkdirs()     // Catch:{ IOException -> 0x06f7 }
            if (r11 == 0) goto L_0x0732
            defpackage.bma.d(r8)     // Catch:{ IOException -> 0x06f7 }
            defpackage.bma.c(r8)     // Catch:{ IOException -> 0x06f7 }
        L_0x06c3:
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x06f7 }
            r8.<init>(r2)     // Catch:{ IOException -> 0x06f7 }
            r11 = 8192(0x2000, float:1.14794E-41)
            byte[] r11 = new byte[r11]     // Catch:{ all -> 0x06e3 }
        L_0x06cc:
            int r13 = r4.read(r11)     // Catch:{ all -> 0x06e3 }
            r14 = -1
            if (r13 != r14) goto L_0x06dd
            r8.close()     // Catch:{ IOException -> 0x06f7 }
            defpackage.bma.d(r2)     // Catch:{ IOException -> 0x06f7 }
            defpackage.bma.c(r2)     // Catch:{ IOException -> 0x06f7 }
            goto L_0x0732
        L_0x06dd:
            r14 = 0
            r8.write(r11, r14, r13)     // Catch:{ all -> 0x06e3 }
            goto L_0x06cc
        L_0x06e3:
            r0 = move-exception
            r11 = r0
            r8.close()     // Catch:{ all -> 0x06e9 }
            goto L_0x06ee
        L_0x06e9:
            r0 = move-exception
            r8 = r0
            defpackage.apev.a((java.lang.Throwable) r11, (java.lang.Throwable) r8)     // Catch:{ IOException -> 0x06f7 }
        L_0x06ee:
            throw r11     // Catch:{ IOException -> 0x06f7 }
        L_0x06ef:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ IOException -> 0x06f7 }
            java.lang.String r11 = "No parent dir."
            r8.<init>(r11)     // Catch:{ IOException -> 0x06f7 }
            throw r8     // Catch:{ IOException -> 0x06f7 }
        L_0x06f7:
            r0 = move-exception
            r8 = r0
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x074d }
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x074d }
            java.lang.String r11 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x074d }
            int r11 = r11.length()     // Catch:{ all -> 0x074d }
            java.lang.String r13 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x074d }
            int r13 = r13.length()     // Catch:{ all -> 0x074d }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x074d }
            int r11 = r11 + 24
            int r11 = r11 + r13
            r14.<init>(r11)     // Catch:{ all -> 0x074d }
            java.lang.String r11 = "Failed to extract to "
            r14.append(r11)     // Catch:{ all -> 0x074d }
            r14.append(r2)     // Catch:{ all -> 0x074d }
            java.lang.String r2 = " : "
            r14.append(r2)     // Catch:{ all -> 0x074d }
            r14.append(r8)     // Catch:{ all -> 0x074d }
            java.lang.String r2 = "ChimeraNativeLib"
            java.lang.String r8 = r14.toString()     // Catch:{ all -> 0x074d }
            android.util.Log.w(r2, r8)     // Catch:{ all -> 0x074d }
        L_0x0732:
            r4.close()     // Catch:{ IOException -> 0x075b }
            r8 = r37
            r4 = r40
            r11 = r41
            r2 = r22
            r12 = r24
            r14 = r25
            r15 = r29
            goto L_0x062b
        L_0x0745:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x074d }
            java.lang.String r8 = "Can't open zip entry."
            r2.<init>(r8)     // Catch:{ all -> 0x074d }
            throw r2     // Catch:{ all -> 0x074d }
        L_0x074d:
            r0 = move-exception
            r2 = r0
            if (r4 == 0) goto L_0x075a
            r4.close()     // Catch:{ all -> 0x0755 }
            goto L_0x075a
        L_0x0755:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r4)     // Catch:{ IOException -> 0x075b }
        L_0x075a:
            throw r2     // Catch:{ IOException -> 0x075b }
        L_0x075b:
            r0 = move-exception
            r2 = r0
            java.lang.String r4 = r12.getAbsolutePath()     // Catch:{ all -> 0x07a6 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x07a6 }
            java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x07a6 }
            int r8 = r8.length()     // Catch:{ all -> 0x07a6 }
            java.lang.String r11 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x07a6 }
            int r11 = r11.length()     // Catch:{ all -> 0x07a6 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x07a6 }
            int r8 = r8 + 24
            int r8 = r8 + r11
            r12.<init>(r8)     // Catch:{ all -> 0x07a6 }
            java.lang.String r8 = "Failed to extract to "
            r12.append(r8)     // Catch:{ all -> 0x07a6 }
            r12.append(r4)     // Catch:{ all -> 0x07a6 }
            java.lang.String r4 = " : "
            r12.append(r4)     // Catch:{ all -> 0x07a6 }
            r12.append(r2)     // Catch:{ all -> 0x07a6 }
            java.lang.String r2 = "ChimeraNativeLib"
            java.lang.String r4 = r12.toString()     // Catch:{ all -> 0x07a6 }
            android.util.Log.w(r2, r4)     // Catch:{ all -> 0x07a6 }
            r8 = r37
            r4 = r40
            r11 = r41
            r2 = r22
            r12 = r24
            r14 = r25
            r15 = r29
            goto L_0x062b
        L_0x07a6:
            r0 = move-exception
            r5 = r37
            r10 = r41
            r2 = r0
            r12 = r24
            r11 = r25
            goto L_0x07f2
        L_0x07b1:
            r22 = r2
            r25 = r14
            r29 = r15
            r8 = r37
            r4 = r40
            r11 = r41
            r12 = r24
            goto L_0x062b
        L_0x07c1:
            r22 = r2
            r25 = r14
            r29 = r15
            r8 = r37
            r4 = r40
            r11 = r41
            r12 = r24
            goto L_0x062b
        L_0x07d1:
            r22 = r2
            r25 = r14
            r29 = r15
            r8 = r37
            r4 = r40
            r11 = r41
            r12 = r24
            goto L_0x062b
        L_0x07e1:
            r0 = move-exception
            r5 = r37
            r10 = r41
            r2 = r0
            r11 = r14
            r12 = r24
            goto L_0x07f2
        L_0x07eb:
            r0 = move-exception
            r5 = r37
            r10 = r41
            r2 = r0
            r11 = r14
        L_0x07f2:
            r8 = 2
            goto L_0x0905
        L_0x07f5:
            r24 = r12
            r25 = r14
            r29 = r15
            r9.close()     // Catch:{ IOException -> 0x08f5 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x08f5 }
            long r8 = r8 - r5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x08f5 }
            r4 = 57
            r2.<init>(r4)     // Catch:{ IOException -> 0x08f5 }
            java.lang.String r4 = "Spent "
            r2.append(r4)     // Catch:{ IOException -> 0x08f5 }
            r2.append(r8)     // Catch:{ IOException -> 0x08f5 }
            java.lang.String r4 = "ms extracting native libraries."
            r2.append(r4)     // Catch:{ IOException -> 0x08f5 }
            r2.toString()     // Catch:{ IOException -> 0x08f5 }
        L_0x081a:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0a93 }
            boolean r2 = r7.renameTo(r3)     // Catch:{ all -> 0x0a93 }
            if (r2 != 0) goto L_0x0834
            java.lang.String r2 = "FileApkMgr"
            java.lang.String r3 = "Failed to rename module directory to final name. It won't be visible for module finding."
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x0a93 }
            r5 = r37
            r10 = r41
            r12 = r24
            r11 = r25
            r8 = 2
            goto L_0x092a
        L_0x0834:
            int r2 = r1.intValue()     // Catch:{ all -> 0x0a93 }
            r6 = r32
            boolean r3 = r6.c     // Catch:{ all -> 0x0a93 }
            if (r3 != 0) goto L_0x083f
            goto L_0x0845
        L_0x083f:
            r6.c()     // Catch:{ all -> 0x0a93 }
            r3 = 0
            r6.c = r3     // Catch:{ all -> 0x0a93 }
        L_0x0845:
            aucj r3 = r6.b     // Catch:{ all -> 0x0a93 }
            bpf r3 = (defpackage.bpf) r3     // Catch:{ all -> 0x0a93 }
            int r4 = r3.a     // Catch:{ all -> 0x0a93 }
            r4 = r4 | 4
            r3.a = r4     // Catch:{ all -> 0x0a93 }
            r3.d = r2     // Catch:{ all -> 0x0a93 }
            if (r10 != 0) goto L_0x0854
            goto L_0x086a
        L_0x0854:
            java.lang.String r2 = r10.a     // Catch:{ all -> 0x0a93 }
            r2.getClass()     // Catch:{ all -> 0x0a93 }
            r4 = r4 | 32
            r3.a = r4     // Catch:{ all -> 0x0a93 }
            r3.g = r2     // Catch:{ all -> 0x0a93 }
            java.lang.String r2 = r10.b     // Catch:{ all -> 0x0a93 }
            r2.getClass()     // Catch:{ all -> 0x0a93 }
            r4 = r4 | 64
            r3.a = r4     // Catch:{ all -> 0x0a93 }
            r3.h = r2     // Catch:{ all -> 0x0a93 }
        L_0x086a:
            aucj r2 = r6.i()     // Catch:{ all -> 0x0a93 }
            bpf r2 = (defpackage.bpf) r2     // Catch:{ all -> 0x0a93 }
            r3 = 1
            defpackage.amrl.b(r3)     // Catch:{ all -> 0x0a93 }
            r3 = r29
            int r3 = -r3
            r4 = -1
            int r3 = r3 + r4
            r5 = r37
            boolean r4 = r5.c     // Catch:{ all -> 0x0a93 }
            if (r4 != 0) goto L_0x0880
            goto L_0x0886
        L_0x0880:
            r37.c()     // Catch:{ all -> 0x0a93 }
            r4 = 0
            r5.c = r4     // Catch:{ all -> 0x0a93 }
        L_0x0886:
            aucj r4 = r5.b     // Catch:{ all -> 0x0a93 }
            bpe r4 = (defpackage.bpe) r4     // Catch:{ all -> 0x0a93 }
            bpe r8 = defpackage.bpe.f     // Catch:{ all -> 0x0a93 }
            r2.getClass()     // Catch:{ all -> 0x0a93 }
            r4.b()     // Catch:{ all -> 0x0a93 }
            aucx r4 = r4.d     // Catch:{ all -> 0x0a93 }
            r4.add(r3, r2)     // Catch:{ all -> 0x0a93 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0a93 }
            r3 = 1
            int r1 = r1 + r3
            boolean r3 = r5.c     // Catch:{ all -> 0x0a93 }
            if (r3 != 0) goto L_0x08a2
            goto L_0x08a8
        L_0x08a2:
            r37.c()     // Catch:{ all -> 0x0a93 }
            r3 = 0
            r5.c = r3     // Catch:{ all -> 0x0a93 }
        L_0x08a8:
            aucj r3 = r5.b     // Catch:{ all -> 0x0a93 }
            bpe r3 = (defpackage.bpe) r3     // Catch:{ all -> 0x0a93 }
            int r4 = r3.a     // Catch:{ all -> 0x0a93 }
            r8 = 2
            r4 = r4 | r8
            r3.a = r4     // Catch:{ all -> 0x0a93 }
            r3.e = r1     // Catch:{ all -> 0x0a93 }
            if (r36 != 0) goto L_0x08b9
            r10 = r41
            goto L_0x08c0
        L_0x08b9:
            r10 = r41
            r1 = 0
            a((java.io.File) r10, (defpackage.bpf) r2, (boolean) r1)     // Catch:{ all -> 0x0a93 }
        L_0x08c0:
            java.lang.String r1 = java.lang.String.valueOf(r25)     // Catch:{ all -> 0x0a93 }
            int r1 = r1.length()     // Catch:{ all -> 0x0a93 }
            int r1 = r1 + 11
            int r3 = r24.length()     // Catch:{ all -> 0x0a93 }
            int r1 = r1 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a93 }
            r3.<init>(r1)     // Catch:{ all -> 0x0a93 }
            java.lang.String r1 = "Staged: "
            r3.append(r1)     // Catch:{ all -> 0x0a93 }
            r11 = r25
            r3.append(r11)     // Catch:{ all -> 0x0a93 }
            java.lang.String r1 = " ["
            r3.append(r1)     // Catch:{ all -> 0x0a93 }
            r12 = r24
            r3.append(r12)     // Catch:{ all -> 0x0a93 }
            java.lang.String r1 = "]"
            r3.append(r1)     // Catch:{ all -> 0x0a93 }
            r3.toString()     // Catch:{ all -> 0x0a93 }
            r1 = r2
            r2 = 44
            goto L_0x0a64
        L_0x08f5:
            r0 = move-exception
            r5 = r37
            r10 = r41
            r12 = r24
            r11 = r25
            goto L_0x0921
        L_0x08ff:
            r0 = move-exception
            r5 = r8
            r10 = r11
            r11 = r14
            r8 = 2
            r2 = r0
        L_0x0905:
            r9.close()     // Catch:{ all -> 0x0909 }
            goto L_0x090e
        L_0x0909:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r3)     // Catch:{ IOException -> 0x091b }
        L_0x090e:
            throw r2     // Catch:{ IOException -> 0x091b }
        L_0x090f:
            r5 = r8
            r10 = r11
            r11 = r14
            r8 = 2
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x091b }
            java.lang.String r3 = "Failed to create native library root."
            r2.<init>(r3)     // Catch:{ IOException -> 0x091b }
            throw r2     // Catch:{ IOException -> 0x091b }
        L_0x091b:
            r0 = move-exception
            goto L_0x0922
        L_0x091d:
            r0 = move-exception
            r5 = r8
            r10 = r11
            r11 = r14
        L_0x0921:
            r8 = 2
        L_0x0922:
            r2 = r0
            java.lang.String r3 = "FileApkMgr"
            java.lang.String r4 = "Failed to extract all native libraries."
            android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x0a93 }
        L_0x092a:
            java.lang.String r2 = "FileApkMgr"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0a93 }
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0a93 }
            int r3 = r3.length()     // Catch:{ all -> 0x0a93 }
            int r3 = r3 + 29
            int r4 = r12.length()     // Catch:{ all -> 0x0a93 }
            int r3 = r3 + r4
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0a93 }
            int r4 = r4.length()     // Catch:{ all -> 0x0a93 }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a93 }
            r4.<init>(r3)     // Catch:{ all -> 0x0a93 }
            java.lang.String r3 = "Failed to stage: "
            r4.append(r3)     // Catch:{ all -> 0x0a93 }
            r4.append(r11)     // Catch:{ all -> 0x0a93 }
            java.lang.String r3 = " ["
            r4.append(r3)     // Catch:{ all -> 0x0a93 }
            r4.append(r12)     // Catch:{ all -> 0x0a93 }
            java.lang.String r3 = "] with id "
            r4.append(r3)     // Catch:{ all -> 0x0a93 }
            r4.append(r1)     // Catch:{ all -> 0x0a93 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0a93 }
            android.util.Log.e(r2, r1)     // Catch:{ all -> 0x0a93 }
            goto L_0x0a07
        L_0x096e:
            r5 = r8
            r10 = r11
            r11 = r14
            r8 = 2
            java.lang.String r1 = "FileApkMgr"
            java.lang.String r2 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0a93 }
            int r2 = r2.length()     // Catch:{ all -> 0x0a93 }
            int r2 = r2 + 20
            int r3 = r12.length()     // Catch:{ all -> 0x0a93 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a93 }
            r3.<init>(r2)     // Catch:{ all -> 0x0a93 }
            java.lang.String r2 = "Failed to stage: "
            r3.append(r2)     // Catch:{ all -> 0x0a93 }
            r3.append(r11)     // Catch:{ all -> 0x0a93 }
            java.lang.String r2 = " ["
            r3.append(r2)     // Catch:{ all -> 0x0a93 }
            r3.append(r12)     // Catch:{ all -> 0x0a93 }
            java.lang.String r2 = "]"
            r3.append(r2)     // Catch:{ all -> 0x0a93 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0a93 }
            android.util.Log.e(r1, r2)     // Catch:{ all -> 0x0a93 }
            goto L_0x0a07
        L_0x09a5:
            r4 = r5
            r5 = r8
            r10 = r11
            r26 = r15
            r11 = r22
            r12 = r24
            r7 = r25
            r8 = 2
            java.lang.String r1 = r4.getName()     // Catch:{ all -> 0x0a93 }
            r2 = 44
            defpackage.bla.a(r6, r2, r1)     // Catch:{ all -> 0x0a93 }
            java.lang.String r3 = "FileApkMgr"
            java.lang.String r4 = "File is not properly signed: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0a93 }
            int r6 = r1.length()     // Catch:{ all -> 0x0a93 }
            if (r6 != 0) goto L_0x09ce
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0a93 }
            r1.<init>(r4)     // Catch:{ all -> 0x0a93 }
            goto L_0x09d2
        L_0x09ce:
            java.lang.String r1 = r4.concat(r1)     // Catch:{ all -> 0x0a93 }
        L_0x09d2:
            android.util.Log.e(r3, r1)     // Catch:{ all -> 0x0a93 }
        L_0x09d5:
            java.lang.String r1 = "FileApkMgr"
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0a93 }
            int r3 = r3.length()     // Catch:{ all -> 0x0a93 }
            int r3 = r3 + 20
            int r4 = r12.length()     // Catch:{ all -> 0x0a93 }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a93 }
            r4.<init>(r3)     // Catch:{ all -> 0x0a93 }
            java.lang.String r3 = "Failed to stage: "
            r4.append(r3)     // Catch:{ all -> 0x0a93 }
            r4.append(r11)     // Catch:{ all -> 0x0a93 }
            java.lang.String r3 = " ["
            r4.append(r3)     // Catch:{ all -> 0x0a93 }
            r4.append(r12)     // Catch:{ all -> 0x0a93 }
            java.lang.String r3 = "]"
            r4.append(r3)     // Catch:{ all -> 0x0a93 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0a93 }
            android.util.Log.e(r1, r3)     // Catch:{ all -> 0x0a93 }
        L_0x0a07:
            defpackage.bma.a((java.io.File) r7)
            r7 = r34
            r9 = r38
            r12 = r42
            r8 = r5
            r11 = r10
            r15 = r26
            r1 = 1
            r5 = 0
            r6 = 1
            r13 = 44
            r14 = 2
            r17 = 1
            r10 = r39
            goto L_0x004f
        L_0x0a20:
            r0 = move-exception
            r7 = r25
            goto L_0x0a94
        L_0x0a25:
            r7 = r6
            r5 = r8
            r10 = r11
            r28 = r13
            r6 = r14
            r26 = r15
            r11 = r22
            r12 = r24
            r2 = 44
            r8 = 2
            java.lang.String r1 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0a93 }
            int r1 = r1.length()     // Catch:{ all -> 0x0a93 }
            int r1 = r1 + 19
            int r4 = r12.length()     // Catch:{ all -> 0x0a93 }
            int r1 = r1 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a93 }
            r4.<init>(r1)     // Catch:{ all -> 0x0a93 }
            java.lang.String r1 = "Already staged: "
            r4.append(r1)     // Catch:{ all -> 0x0a93 }
            r4.append(r11)     // Catch:{ all -> 0x0a93 }
            java.lang.String r1 = " ["
            r4.append(r1)     // Catch:{ all -> 0x0a93 }
            r4.append(r12)     // Catch:{ all -> 0x0a93 }
            java.lang.String r1 = "]"
            r4.append(r1)     // Catch:{ all -> 0x0a93 }
            r4.toString()     // Catch:{ all -> 0x0a93 }
            bpf r1 = r5.d((int) r3)     // Catch:{ all -> 0x0a93 }
        L_0x0a64:
            defpackage.bma.a((java.io.File) r7)
            r23 = 1
            goto L_0x0aab
        L_0x0a6a:
            r0 = move-exception
            r7 = r6
            goto L_0x0a94
        L_0x0a6d:
            r7 = r6
            r5 = r8
            r10 = r11
            r26 = r15
            r2 = 44
            r8 = 2
            java.lang.String r1 = "FileApkMgr"
            java.lang.String r3 = "Failed to create scratch dir"
            android.util.Log.e(r1, r3)     // Catch:{ all -> 0x0a93 }
            r7 = r34
            r9 = r38
            r12 = r42
            r8 = r5
            r11 = r10
            r1 = r23
            r15 = r26
            r5 = 0
            r6 = 1
            r13 = 44
            r14 = 2
            r17 = 1
            r10 = r39
            goto L_0x004f
        L_0x0a93:
            r0 = move-exception
        L_0x0a94:
            r1 = r0
        L_0x0a95:
            r2 = r7
            goto L_0x0a9a
        L_0x0a97:
            r0 = move-exception
            r1 = r0
            r2 = 0
        L_0x0a9a:
            if (r2 == 0) goto L_0x0a9f
            defpackage.bma.a((java.io.File) r2)
        L_0x0a9f:
            throw r1
        L_0x0aa0:
            r5 = r8
            r10 = r11
            r28 = r13
            r6 = r14
            r26 = r15
            r2 = 44
            r8 = 2
            r11 = r3
        L_0x0aab:
            aucj r3 = r6.b
            bpf r3 = (defpackage.bpf) r3
            int r3 = r3.d
            int r1 = r1.d
            if (r3 == r1) goto L_0x0acf
            boolean r3 = r6.c
            if (r3 != 0) goto L_0x0aba
            goto L_0x0ac0
        L_0x0aba:
            r6.c()
            r3 = 0
            r6.c = r3
        L_0x0ac0:
            aucj r3 = r6.b
            bpf r3 = (defpackage.bpf) r3
            int r4 = r3.a
            r4 = r4 | 4
            r3.a = r4
            r3.d = r1
            r23 = 1
            goto L_0x0ad0
        L_0x0acf:
        L_0x0ad0:
            if (r28 >= 0) goto L_0x0b01
            aucj r1 = r6.i()
            bpf r1 = (defpackage.bpf) r1
            r3 = 1
            defpackage.amrl.b(r3)
            r3 = r28
            int r3 = -r3
            r4 = -1
            int r3 = r3 + r4
            r4 = r38
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x0ae8
            goto L_0x0aee
        L_0x0ae8:
            r38.c()
            r6 = 0
            r4.c = r6
        L_0x0aee:
            aucj r6 = r4.b
            bpd r6 = (defpackage.bpd) r6
            bpd r7 = defpackage.bpd.j
            r1.getClass()
            r6.a()
            aucx r6 = r6.e
            r6.add(r3, r1)
            r1 = 1
            goto L_0x0b10
        L_0x0b01:
            r4 = r38
            r3 = r28
            aucj r1 = r6.i()
            bpf r1 = (defpackage.bpf) r1
            r4.a((int) r3, (defpackage.bpf) r1)
            r1 = r23
        L_0x0b10:
            r3 = r42
            if (r3 == 0) goto L_0x0b27
            java.lang.Object r6 = r3.b
            monitor-enter(r6)
            java.util.ArrayDeque r7 = r3.c     // Catch:{ all -> 0x0b23 }
            r7.remove(r11)     // Catch:{ all -> 0x0b23 }
            java.util.ArrayList r7 = r3.d     // Catch:{ all -> 0x0b23 }
            r7.add(r11)     // Catch:{ all -> 0x0b23 }
            monitor-exit(r6)     // Catch:{ all -> 0x0b23 }
            goto L_0x0b27
        L_0x0b23:
            r0 = move-exception
            r1 = r0
            monitor-exit(r6)     // Catch:{ all -> 0x0b23 }
            throw r1
        L_0x0b27:
            r7 = r34
            r12 = r3
            r9 = r4
            r8 = r5
            r11 = r10
            r15 = r26
            r5 = 0
            r6 = 1
            r13 = 44
            r14 = 2
            r10 = r39
            goto L_0x004f
        L_0x0b38:
            r23 = r1
            r5 = r8
            r4 = r9
            r10 = r11
            r3 = r12
            r26 = r15
            r2 = 44
            r8 = 2
            r7 = r34
            r8 = r5
            r5 = 0
            r6 = 1
            r13 = 44
            r14 = 2
            r18 = 1
            r10 = r39
            goto L_0x004f
        L_0x0b51:
            r5 = r8
            r4 = r9
            r3 = r12
            if (r17 == 0) goto L_0x0b58
            r6 = 0
            goto L_0x0b5d
        L_0x0b58:
            if (r18 != 0) goto L_0x0b5c
            r6 = 1
            goto L_0x0b5d
        L_0x0b5c:
            r6 = 0
        L_0x0b5d:
            if (r6 != 0) goto L_0x0b62
            java.lang.String r2 = "incomplete"
            goto L_0x0b64
        L_0x0b62:
            java.lang.String r2 = "complete"
        L_0x0b64:
            aucj r7 = r4.b
            bpd r7 = (defpackage.bpd) r7
            java.lang.String r7 = r7.b
            int r8 = r2.length()
            java.lang.String r9 = java.lang.String.valueOf(r7)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r8 = r8 + 10
            int r8 = r8 + r9
            r10.<init>(r8)
            java.lang.String r8 = "Staging "
            r10.append(r8)
            r10.append(r2)
            java.lang.String r2 = ": "
            r10.append(r2)
            r10.append(r7)
            r10.toString()
            boolean r2 = r4.c
            if (r2 == 0) goto L_0x0b9b
            r38.c()
            r2 = 0
            r4.c = r2
        L_0x0b9b:
            aucj r2 = r4.b
            bpd r2 = (defpackage.bpd) r2
            bpd r7 = defpackage.bpd.j
            int r7 = r2.a
            r7 = r7 | 4
            r2.a = r7
            r2.d = r6
            r1 = r1 | r6
            if (r17 != 0) goto L_0x0c0f
            java.util.ArrayList r6 = new java.util.ArrayList
            aucx r2 = r2.e
            int r2 = r2.size()
            r6.<init>(r2)
            aucj r2 = r4.b
            bpd r2 = (defpackage.bpd) r2
            aucx r2 = r2.e
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            java.util.Iterator r2 = r2.iterator()
            r7 = 0
        L_0x0bc6:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0bdc
            java.lang.Object r8 = r2.next()
            bpf r8 = (defpackage.bpf) r8
            boolean r9 = r8.e
            if (r9 != 0) goto L_0x0bda
            r6.add(r8)
            goto L_0x0bc6
        L_0x0bda:
            r7 = 1
            goto L_0x0bc6
        L_0x0bdc:
            if (r7 == 0) goto L_0x0c0c
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0be3
            goto L_0x0be9
        L_0x0be3:
            r38.c()
            r2 = 0
            r4.c = r2
        L_0x0be9:
            aucj r2 = r4.b
            bpd r2 = (defpackage.bpd) r2
            aucx r7 = defpackage.aucj.s()
            r2.e = r7
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0bf8
            goto L_0x0bfe
        L_0x0bf8:
            r38.c()
            r2 = 0
            r4.c = r2
        L_0x0bfe:
            aucj r2 = r4.b
            bpd r2 = (defpackage.bpd) r2
            r2.a()
            aucx r2 = r2.e
            defpackage.auab.a((java.lang.Iterable) r6, (java.util.List) r2)
            r6 = 1
            goto L_0x0c0d
        L_0x0c0c:
            r6 = 0
        L_0x0c0d:
            r1 = r1 | r6
            goto L_0x0c10
        L_0x0c0f:
        L_0x0c10:
            if (r1 == 0) goto L_0x0c2a
            aucj r1 = r38.i()
            bpd r1 = (defpackage.bpd) r1
            r2 = r39
            r5.a((int) r2, (defpackage.bpd) r1)
            aucj r1 = r37.i()
            bpe r1 = (defpackage.bpe) r1
            r2 = r34
            r2.a((defpackage.bpe) r1, (defpackage.bpq) r3)
            r1 = 1
            return r1
        L_0x0c2a:
            r2 = r34
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blu.a(bpu, boolean, aucd, aucd, int, java.lang.Iterable, java.io.File, bpq):boolean");
    }

    public final boolean a(bpu bpu, boolean z, bpq bpq) {
        return a(bpu, (Set) null, false, z, bpq);
    }

    public final boolean a(File file, bpe bpe, boolean z) {
        boolean z2 = false;
        if (bkq.a(bpe.k(), new File(file, "pending_fileapks.pb"), b(file), false) > 0) {
            z2 = true;
        }
        if (aekv.a() && z && z2) {
            this.d = true;
        }
        return z2;
    }

    public final boolean a(Set set, bpq bpq, boolean z) {
        bpu a = bkn.a();
        bkn.b();
        return a(a, set, z, hei.h(), bpq);
    }
}
