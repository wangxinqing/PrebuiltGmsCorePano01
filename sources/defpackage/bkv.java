package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.container.ConfigurationManager$IntentHandler;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: bkv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bkv extends bjx {
    private static volatile bkv i = null;
    private static final long q = TimeUnit.MINUTES.toMillis(3);
    public final Object e = new Object();
    public FileInputStream f;
    public long g = 0;
    public final Set h = new ob();
    private boz j;
    private bpw k;
    private bpw l;
    private BroadcastReceiver m;
    private boolean n = false;
    private int o = 0;
    private volatile bks p;

    public bkv(Context context) {
        super(context, "current_config.fb");
    }

    private final Pair a(boz boz, bpw bpw, List list, List list2, List list3, bpw bpw2, String str, String str2, bpw bpw3, bpw bpw4, Map map) {
        int i2;
        boz boz2 = boz;
        bnz bnz = new bnz(this.a.getPackageName());
        bpw a = bnz.a(this.a, list, list2, list3, bpw, bpw3, bpw2, map);
        amtf.a(bnz.m);
        List list4 = bnz.c;
        amtf.a(bnz.m);
        brl brl = (brl) bnz.p.i();
        amtf.a(bnz.m);
        List unmodifiableList = Collections.unmodifiableList(bnz.h);
        amtf.a(bnz.m);
        bpw bpw5 = bnz.b;
        if (boz2 != null) {
            ByteBuffer byteBuffer = boz2.d;
            if (byteBuffer != null) {
                i2 = (byteBuffer.remaining() * 6) / 5;
            } else {
                i2 = 281600;
            }
        } else {
            i2 = 281600;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            boz a2 = bog.a(i2, a, list4, brl, str, bpw4, unmodifiableList, bpw2, str2, bpw5);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            StringBuilder sb = new StringBuilder(38);
            sb.append("Convert duration: ");
            sb.append(currentTimeMillis2);
            sb.toString();
            return Pair.create(a2, bpw5);
        } catch (AssertionError e2) {
            bla.a(this.a, 32, "convert");
            throw new InvalidConfigException((Throwable) e2);
        }
    }

    public static final bny b(Context context) {
        bkn.b();
        if (!awxs.a.a().b()) {
            return null;
        }
        amsk a = amsk.a(',').b().a();
        bkn.b();
        return new bny(context, a.a((CharSequence) awxs.a.a().c()));
    }

    static aucd o() {
        aucd o2 = bno.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        bno bno = (bno) o2.b;
        int i2 = bno.a | 1;
        bno.a = i2;
        bno.b = 15;
        int i3 = i2 | 2;
        bno.a = i3;
        bno.c = 0;
        bno.a = i3 | 4;
        bno.d = 0;
        return o2;
    }

    private final void p() {
        bjx.a(this.b, "downgrade_from_config.fb").delete();
    }

    public final bpw c(boz boz) {
        synchronized (this.e) {
            boz boz2 = this.j;
            if (boz2 == boz) {
                bpw bpw = this.l;
                if (bpw != null) {
                    return bpw;
                }
                ByteBuffer i2 = boz2.i(14);
                if (i2 == null) {
                    bpw bpw2 = bmy.c;
                    this.l = bpw2;
                    return bpw2;
                }
                try {
                    bpw a = bpw.a(((ansh) aucj.a((aucj) ansh.e, i2, aubs.b())).b, bmy.a);
                    this.l = a;
                    return a;
                } catch (auda e2) {
                    throw new InvalidConfigException((Throwable) e2);
                }
            } else {
                throw new InvalidConfigException("module configuration is not current");
            }
        }
    }

    public final bpw d() {
        return c(f());
    }

    public final boolean e() {
        boolean exists;
        synchronized (this.e) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                exists = h().exists();
            } catch (SecurityException e2) {
                return false;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        return exists;
    }

    public final boz f() {
        return a((bkp) null);
    }

    /* access modifiers changed from: package-private */
    public final File g() {
        return a(this.b);
    }

    /* access modifiers changed from: package-private */
    public final File h() {
        return new File(this.b, "current_modules_init.pb");
    }

    public final void i() {
        PendingIntent a = a(0);
        if (a != null) {
            ((AlarmManager) this.a.getSystemService("alarm")).cancel(a);
            a.cancel();
        }
    }

    public final void j() {
        try {
            this.a.startService(new Intent("com.google.android.chimera.container.MODULE_SCAN").setPackage(this.a.getPackageName()));
        } catch (SecurityException e2) {
        }
    }

    public final void k() {
        File h2 = h();
        String valueOf = String.valueOf(h2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Deleting config file: ");
        sb.append(valueOf);
        sb.toString();
        if (h2.delete()) {
            i();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean l() {
        return bjx.a(this.b, "downgrade_from_config.fb").exists();
    }

    /* access modifiers changed from: package-private */
    public final bks m() {
        if (!this.b.exists()) {
            return null;
        }
        bks bks = new bks(this, this.b.getPath());
        bks.startWatching();
        return bks;
    }

    public final aucd n() {
        aucd aucd;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            byte[] a = bkq.a(h());
            if (a == null) {
                aucd = o();
            } else {
                bno bno = (bno) aucj.a((aucj) bno.e, a, aubs.b());
                aucd aucd2 = (aucd) bno.c(5);
                aucd2.a((aucj) bno);
                aucd = ((bno) aucd2.b).b != 15 ? o() : aucd2;
            }
        } catch (auda e2) {
            aucd = o();
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return aucd;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034 A[SYNTHETIC, Splitter:B:16:0x0034] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.io.Closeable b(boolean r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L_0x0004
            goto L_0x0009
        L_0x0004:
            boolean r1 = r10.n
            if (r1 == 0) goto L_0x0009
            return r0
        L_0x0009:
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0030 }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0030 }
            java.io.File r3 = r10.b     // Catch:{ IOException -> 0x0030 }
            java.lang.String r4 = ".config.lock"
            r2.<init>(r3, r4)     // Catch:{ IOException -> 0x0030 }
            java.lang.String r3 = "rw"
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0030 }
            java.nio.channels.FileChannel r4 = r1.getChannel()     // Catch:{ IOException -> 0x002e }
            r5 = 0
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r11
            r4.lock(r5, r7, r9)     // Catch:{ IOException -> 0x002e }
            if (r11 != 0) goto L_0x002d
            r11 = 1
            r10.n = r11     // Catch:{ IOException -> 0x002e }
        L_0x002d:
            return r1
        L_0x002e:
            r11 = move-exception
            goto L_0x0032
        L_0x0030:
            r11 = move-exception
            r1 = r0
        L_0x0032:
            if (r1 == 0) goto L_0x0039
            r1.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x0039
        L_0x0038:
            r11 = move-exception
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkv.b(boolean):java.io.Closeable");
    }

    public static bkv a(Context context) {
        bkv bkv = i;
        if (bkv == null) {
            synchronized (bkv.class) {
                bkv = i;
                if (bkv == null) {
                    bkv = new bkv(context);
                    i = bkv;
                }
            }
        }
        return bkv;
    }

    public final bpw b(boz boz) {
        synchronized (this.e) {
            boz boz2 = this.j;
            if (boz2 == boz) {
                bpw bpw = this.k;
                if (bpw != null) {
                    return bpw;
                }
                int e2 = boz2.e();
                apxg apxg = new apxg();
                amzt b = amzy.b(e2);
                for (int i2 = 0; i2 < e2; i2++) {
                    this.j.a(apxg, i2);
                    b.c(bog.a(apxg));
                }
                bpw a = bpw.a(b.a(), blj.a);
                this.k = a;
                return a;
            }
            throw new InvalidConfigException("module configuration is not current");
        }
    }

    static File a(File file) {
        return new File(file, "current_config.fb");
    }

    private static Map a(boz boz, boz boz2) {
        nz nzVar = new nz();
        int c = boz2.c();
        bpa bpa = new bpa();
        bpa bpa2 = new bpa();
        boy boy = new boy();
        boy boy2 = new boy();
        for (int i2 = 0; i2 < c; i2++) {
            boz2.a(bpa, i2);
            String b = bpa.b();
            bpa bpa3 = null;
            if (boz != null) {
                int c2 = boz.c();
                int i3 = 0;
                while (true) {
                    if (i3 >= c2) {
                        break;
                    }
                    boz.a(bpa2, i3);
                    int compareTo = bpa2.b().compareTo(b);
                    if (compareTo != 0) {
                        if (compareTo > 0) {
                            break;
                        }
                        i3++;
                    } else {
                        boz.a(boy2, bpa2.S());
                        bpa3 = bpa2;
                        break;
                    }
                }
            }
            if (bpa3 != null) {
                boz2.a(boy, bpa.S());
                if (bkd.a(boy2, boy, true) != 0) {
                    nzVar.put(b, Integer.valueOf(bpa3.e()));
                }
            } else {
                nzVar.put(b, -1);
            }
        }
        return nzVar;
    }

    private static boolean a(Map map) {
        return map.containsKey("");
    }

    public final PendingIntent a(int i2) {
        int i3;
        Intent startIntent = IntentOperation.getStartIntent(this.a, ConfigurationManager$IntentHandler.class, "com.google.android.chimera.container.NEW_MODULE_TIMEOUT");
        if (startIntent == null) {
            return null;
        }
        startIntent.putExtra("chimera_retries", i2);
        Context context = this.a;
        if (i2 > 0) {
            i3 = 134217728;
        } else {
            i3 = 536870912;
        }
        return PendingIntent.getService(context, 0, startIntent, i3);
    }

    public final Context a(Context context, boz boz, int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 < boz.c()) {
            z = true;
        }
        amrl.b(z);
        return a(context, boz, boz.b(i2));
    }

    /* access modifiers changed from: package-private */
    public final Context a(Context context, boz boz, bpa bpa) {
        Context a;
        synchronized (this.e) {
            if (boz == this.j) {
                boolean z = false;
                if (bpa.S() >= 0 && bpa.S() < boz.b()) {
                    z = true;
                }
                amtf.a(z);
                try {
                    boo a2 = boo.a();
                    bkn.b();
                    boolean b = hei.b();
                    bkn.b();
                    boolean i2 = hei.i();
                    bkn.b();
                    a = a2.a(context, boz, bpa, b, i2, hei.c());
                } catch (bop e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.e("ChimeraCfgMgr", valueOf.length() == 0 ? new String("Module could not be loaded: ") : "Module could not be loaded: ".concat(valueOf));
                    return null;
                }
            } else {
                bla.a(this.a, 14);
                throw new InvalidConfigException("module configuration is not current");
            }
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0161 A[EDGE_INSN: B:102:0x0161->B:103:? ?: BREAK  , SYNTHETIC, Splitter:B:102:0x0161] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01b3 A[Catch:{ all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01b4 A[Catch:{ all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01c8 A[Catch:{ all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01c9 A[Catch:{ all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0207 A[Catch:{ all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x020d A[Catch:{ all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0058 A[Catch:{ FileNotFoundException -> 0x0079, all -> 0x0162, all -> 0x0045, all -> 0x015d }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0092 A[Catch:{ FileNotFoundException -> 0x0079, all -> 0x0162, all -> 0x0045, all -> 0x015d }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0134 A[SYNTHETIC, Splitter:B:97:0x0134] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:148:0x0216=Splitter:B:148:0x0216, B:71:0x00e9=Splitter:B:71:0x00e9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.boz a(defpackage.bkp r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            boolean r0 = r17.b()
            if (r0 != 0) goto L_0x0224
            java.io.File r0 = r17.g()
            java.lang.Object r3 = r1.e
            monitor-enter(r3)
            android.os.StrictMode$ThreadPolicy r4 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x0221 }
            r5 = 0
            r6 = 1
            long r7 = r0.lastModified()     // Catch:{ all -> 0x0215 }
            r8 = r7
            r10 = 0
            r11 = 0
            r7 = r0
        L_0x001f:
            boz r0 = r1.j     // Catch:{ all -> 0x0212 }
            if (r0 == 0) goto L_0x002d
            long r12 = r1.g     // Catch:{ all -> 0x0212 }
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x002a
            goto L_0x002d
        L_0x002a:
            r6 = r10
            goto L_0x00e9
        L_0x002d:
            r12 = 0
            java.io.Closeable r13 = r1.b((boolean) r6)     // Catch:{ FileNotFoundException -> 0x01ad, InvalidConfigException -> 0x01ab, IOException -> 0x0179 }
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0050, all -> 0x004c }
            r14.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0050, all -> 0x004c }
            boz r0 = defpackage.bkq.c(r14)     // Catch:{ FileNotFoundException -> 0x004a }
            boolean r15 = defpackage.aekv.a()     // Catch:{ FileNotFoundException -> 0x004a }
            if (r15 != 0) goto L_0x0042
            goto L_0x008a
        L_0x0042:
            r1.d = r6     // Catch:{ FileNotFoundException -> 0x004a }
            goto L_0x008a
        L_0x0045:
            r0 = move-exception
            r2 = r0
            r12 = r14
            goto L_0x0165
        L_0x004a:
            r0 = move-exception
            goto L_0x0052
        L_0x004c:
            r0 = move-exception
            r2 = r0
            goto L_0x0165
        L_0x0050:
            r0 = move-exception
            r14 = r12
        L_0x0052:
            boolean r15 = r17.a()     // Catch:{ all -> 0x0162 }
            if (r15 != 0) goto L_0x0161
            android.content.Context r0 = r1.a     // Catch:{ all -> 0x0162 }
            android.content.Context r0 = defpackage.blb.a(r0)     // Catch:{ all -> 0x0162 }
            java.io.File r0 = defpackage.bkq.a((android.content.Context) r0)     // Catch:{ all -> 0x0162 }
            java.io.File r0 = a((java.io.File) r0)     // Catch:{ all -> 0x0162 }
            java.io.FileInputStream r15 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0079 }
            r15.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0079 }
            boz r7 = defpackage.bkq.c(r15)     // Catch:{ FileNotFoundException -> 0x0079 }
            r8 = 0
            r14 = r15
            r11 = 1
            r16 = r7
            r7 = r0
            r0 = r16
            goto L_0x008a
        L_0x0079:
            r0 = move-exception
            long r8 = r7.lastModified()     // Catch:{ all -> 0x0162 }
            java.io.FileInputStream r15 = new java.io.FileInputStream     // Catch:{ all -> 0x0045 }
            r15.<init>(r7)     // Catch:{ all -> 0x0045 }
            boz r0 = defpackage.bkq.c(r15)     // Catch:{ all -> 0x015d }
            r1.d = r6     // Catch:{ all -> 0x015d }
            r14 = r15
        L_0x008a:
            int r15 = r0.R()     // Catch:{ all -> 0x0045 }
            r6 = 15
            if (r15 != r6) goto L_0x0134
            java.io.FileInputStream r6 = r1.f     // Catch:{ all -> 0x0045 }
            defpackage.bma.a((java.io.Closeable) r6)     // Catch:{ all -> 0x0045 }
            r1.j = r0     // Catch:{ all -> 0x0045 }
            r1.f = r14     // Catch:{ all -> 0x0045 }
            r1.g = r8     // Catch:{ all -> 0x0045 }
            r1.k = r12     // Catch:{ all -> 0x0045 }
            r1.l = r12     // Catch:{ all -> 0x0045 }
            if (r13 != 0) goto L_0x00a4
            goto L_0x00a7
        L_0x00a4:
            r13.close()     // Catch:{ FileNotFoundException -> 0x012f, InvalidConfigException -> 0x012d, IOException -> 0x0129 }
        L_0x00a7:
            android.content.BroadcastReceiver r0 = r1.m     // Catch:{ all -> 0x0125 }
            if (r0 != 0) goto L_0x00d4
            bkr r0 = new bkr     // Catch:{ all -> 0x0125 }
            r0.<init>(r1)     // Catch:{ all -> 0x0125 }
            r1.m = r0     // Catch:{ all -> 0x0125 }
            android.content.Context r0 = r1.a     // Catch:{ all -> 0x0125 }
            android.content.BroadcastReceiver r6 = r1.m     // Catch:{ all -> 0x0125 }
            android.content.IntentFilter r8 = new android.content.IntentFilter     // Catch:{ all -> 0x0125 }
            java.lang.String r9 = "com.google.android.chimera.MODULE_CONFIGURATION_CHANGED"
            r8.<init>(r9)     // Catch:{ all -> 0x0125 }
            boz r9 = r1.j     // Catch:{ all -> 0x0125 }
            r10 = 12
            int r10 = r9.d((int) r10)     // Catch:{ all -> 0x0125 }
            if (r10 == 0) goto L_0x00cf
            int r13 = r9.c     // Catch:{ all -> 0x0125 }
            int r10 = r10 + r13
            java.lang.String r9 = r9.f(r10)     // Catch:{ all -> 0x0125 }
            goto L_0x00d0
        L_0x00cf:
            r9 = r12
        L_0x00d0:
            r0.registerReceiver(r6, r8, r9, r12)     // Catch:{ all -> 0x0125 }
        L_0x00d4:
            bks r0 = r1.p     // Catch:{ all -> 0x0125 }
            if (r0 != 0) goto L_0x00de
            bks r0 = r17.m()     // Catch:{ all -> 0x0125 }
            r1.p = r0     // Catch:{ all -> 0x0125 }
        L_0x00de:
            if (r11 != 0) goto L_0x00e8
            long r8 = r7.lastModified()     // Catch:{ all -> 0x0125 }
            r6 = 1
            r10 = 1
            goto L_0x001f
        L_0x00e8:
            r6 = 1
        L_0x00e9:
            android.os.StrictMode.setThreadPolicy(r4)     // Catch:{ all -> 0x0221 }
            if (r6 == 0) goto L_0x011a
            boz r0 = r1.j     // Catch:{ all -> 0x0221 }
            r1.a((defpackage.boz) r0)     // Catch:{ all -> 0x0221 }
            boolean r0 = r17.e()     // Catch:{ all -> 0x0221 }
            if (r0 == 0) goto L_0x011a
            android.content.Context r0 = r1.a     // Catch:{ all -> 0x0221 }
            boolean r0 = defpackage.aekv.b(r0)     // Catch:{ all -> 0x0221 }
            if (r0 == 0) goto L_0x011a
            android.app.PendingIntent r0 = r1.a((int) r5)     // Catch:{ SecurityException -> 0x0119 }
            if (r0 != 0) goto L_0x011a
            android.content.Context r0 = r1.a     // Catch:{ SecurityException -> 0x0119 }
            java.lang.Class<com.google.android.chimera.container.ConfigurationManager$IntentHandler> r4 = com.google.android.chimera.container.ConfigurationManager$IntentHandler.class
            java.lang.String r5 = "com.google.android.chimera.container.CHECK_MODULES_INIT"
            android.content.Intent r0 = com.google.android.chimera.IntentOperation.getStartIntent((android.content.Context) r0, (java.lang.Class) r4, (java.lang.String) r5)     // Catch:{ SecurityException -> 0x0119 }
            if (r0 == 0) goto L_0x011a
            android.content.Context r4 = r1.a     // Catch:{ SecurityException -> 0x0119 }
            r4.startService(r0)     // Catch:{ SecurityException -> 0x0119 }
            goto L_0x011a
        L_0x0119:
            r0 = move-exception
        L_0x011a:
            if (r2 != 0) goto L_0x011d
            goto L_0x0121
        L_0x011d:
            long r4 = r1.g     // Catch:{ all -> 0x0221 }
            r2.a = r4     // Catch:{ all -> 0x0221 }
        L_0x0121:
            boz r0 = r1.j     // Catch:{ all -> 0x0221 }
            monitor-exit(r3)     // Catch:{ all -> 0x0221 }
            return r0
        L_0x0125:
            r0 = move-exception
            r5 = 1
            goto L_0x0216
        L_0x0129:
            r0 = move-exception
            r12 = r14
            r5 = 1
            goto L_0x017b
        L_0x012d:
            r0 = move-exception
            goto L_0x0130
        L_0x012f:
            r0 = move-exception
        L_0x0130:
            r12 = r14
            r5 = 1
            goto L_0x01af
        L_0x0134:
            int r0 = r0.R()     // Catch:{ all -> 0x0045 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            r5 = 86
            r2.<init>(r5)     // Catch:{ all -> 0x0045 }
            java.lang.String r5 = "Stored Chimera config has different version (current=15, stored="
            r2.append(r5)     // Catch:{ all -> 0x0045 }
            r2.append(r0)     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = "), ignoring"
            r2.append(r0)     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = "ChimeraCfgMgr"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0045 }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x0045 }
            com.google.android.chimera.config.InvalidConfigException r0 = new com.google.android.chimera.config.InvalidConfigException     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = "unexpected config format"
            r0.<init>((java.lang.String) r2)     // Catch:{ all -> 0x0045 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x015d:
            r0 = move-exception
            r2 = r0
            r12 = r15
            goto L_0x0165
        L_0x0161:
            throw r0     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            r2 = r0
            r12 = r14
        L_0x0165:
            if (r13 == 0) goto L_0x0170
            r13.close()     // Catch:{ all -> 0x016b }
            goto L_0x0170
        L_0x016b:
            r0 = move-exception
            r5 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r5)     // Catch:{ FileNotFoundException -> 0x0176, InvalidConfigException -> 0x0174, IOException -> 0x0171 }
        L_0x0170:
            throw r2     // Catch:{ FileNotFoundException -> 0x0176, InvalidConfigException -> 0x0174, IOException -> 0x0171 }
        L_0x0171:
            r0 = move-exception
            r5 = r10
            goto L_0x017b
        L_0x0174:
            r0 = move-exception
            goto L_0x0177
        L_0x0176:
            r0 = move-exception
        L_0x0177:
            r5 = r10
            goto L_0x01af
        L_0x0179:
            r0 = move-exception
            r5 = r10
        L_0x017b:
            java.lang.String r2 = "ChimeraCfgMgr"
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01a8 }
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x01a8 }
            int r7 = r7.length()     // Catch:{ all -> 0x01a8 }
            int r7 = r7 + 30
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a8 }
            r8.<init>(r7)     // Catch:{ all -> 0x01a8 }
            java.lang.String r7 = "Failed to read module config: "
            r8.append(r7)     // Catch:{ all -> 0x01a8 }
            r8.append(r6)     // Catch:{ all -> 0x01a8 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x01a8 }
            android.util.Log.e(r2, r6)     // Catch:{ all -> 0x01a8 }
            defpackage.bma.a((java.io.Closeable) r12)     // Catch:{ all -> 0x01a8 }
            com.google.android.chimera.config.InvalidConfigException r2 = new com.google.android.chimera.config.InvalidConfigException     // Catch:{ all -> 0x01a8 }
            r2.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x01a8 }
            throw r2     // Catch:{ all -> 0x01a8 }
        L_0x01a8:
            r0 = move-exception
            goto L_0x0216
        L_0x01ab:
            r0 = move-exception
            goto L_0x01ae
        L_0x01ad:
            r0 = move-exception
        L_0x01ae:
            r5 = r10
        L_0x01af:
            boz r2 = r1.j     // Catch:{ all -> 0x0210 }
            if (r2 != 0) goto L_0x01b4
            goto L_0x01c1
        L_0x01b4:
            boolean r2 = r17.l()     // Catch:{ all -> 0x0210 }
            if (r2 == 0) goto L_0x01c1
            int r2 = android.os.Process.myPid()     // Catch:{ all -> 0x0210 }
            android.os.Process.killProcess(r2)     // Catch:{ all -> 0x0210 }
        L_0x01c1:
            int r2 = r1.o     // Catch:{ all -> 0x0210 }
            int r2 = r2 % 25
            r6 = 5
            if (r2 == r6) goto L_0x01c9
            goto L_0x01d4
        L_0x01c9:
            android.content.Context r2 = r1.a     // Catch:{ all -> 0x0210 }
            java.lang.String r6 = r0.getMessage()     // Catch:{ all -> 0x0210 }
            r7 = 11
            defpackage.bla.a(r2, r7, r6)     // Catch:{ all -> 0x0210 }
        L_0x01d4:
            int r2 = r1.o     // Catch:{ all -> 0x0210 }
            r6 = 1
            int r2 = r2 + r6
            r1.o = r2     // Catch:{ all -> 0x0210 }
            java.lang.String r2 = "ChimeraCfgMgr"
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0210 }
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0210 }
            int r7 = r7.length()     // Catch:{ all -> 0x0210 }
            int r7 = r7 + 30
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0210 }
            r10.<init>(r7)     // Catch:{ all -> 0x0210 }
            java.lang.String r7 = "Failed to read module config: "
            r10.append(r7)     // Catch:{ all -> 0x0210 }
            r10.append(r6)     // Catch:{ all -> 0x0210 }
            java.lang.String r6 = r10.toString()     // Catch:{ all -> 0x0210 }
            android.util.Log.e(r2, r6)     // Catch:{ all -> 0x0210 }
            defpackage.bma.a((java.io.Closeable) r12)     // Catch:{ all -> 0x0210 }
            r1.g = r8     // Catch:{ all -> 0x0210 }
            boolean r2 = r0 instanceof com.google.android.chimera.config.InvalidConfigException     // Catch:{ all -> 0x0210 }
            if (r2 != 0) goto L_0x020d
            com.google.android.chimera.config.InvalidConfigException r2 = new com.google.android.chimera.config.InvalidConfigException     // Catch:{ all -> 0x0210 }
            r2.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x0210 }
            throw r2     // Catch:{ all -> 0x0210 }
        L_0x020d:
            com.google.android.chimera.config.InvalidConfigException r0 = (com.google.android.chimera.config.InvalidConfigException) r0     // Catch:{ all -> 0x0210 }
            throw r0     // Catch:{ all -> 0x0210 }
        L_0x0210:
            r0 = move-exception
            goto L_0x0216
        L_0x0212:
            r0 = move-exception
            r5 = r10
            goto L_0x0216
        L_0x0215:
            r0 = move-exception
        L_0x0216:
            android.os.StrictMode.setThreadPolicy(r4)     // Catch:{ all -> 0x0221 }
            if (r5 == 0) goto L_0x0220
            boz r2 = r1.j     // Catch:{ all -> 0x0221 }
            r1.a((defpackage.boz) r2)     // Catch:{ all -> 0x0221 }
        L_0x0220:
            throw r0     // Catch:{ all -> 0x0221 }
        L_0x0221:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0221 }
            throw r0
        L_0x0224:
            com.google.android.chimera.config.InvalidConfigException r0 = new com.google.android.chimera.config.InvalidConfigException
            java.lang.String r2 = "not migrated with user locked"
            r0.<init>((java.lang.String) r2)
            goto L_0x022d
        L_0x022c:
            throw r0
        L_0x022d:
            goto L_0x022c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkv.a(bkp):boz");
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        bks m2 = m();
        if (m2 != null) {
            try {
                m2.b.clear();
                long lastModified = m2.a.g().lastModified();
                if (!m2.a.l()) {
                    if (!(lastModified == j2 || lastModified == 0)) {
                        m2.stopWatching();
                    }
                }
                m2.a.j();
                m2.b.take();
            } catch (InterruptedException e2) {
                Log.e("ChimeraCfgMgr", "Waiting for downgrade to complete interrupted");
            } catch (Throwable th) {
                m2.stopWatching();
                throw th;
            }
            m2.stopWatching();
        }
        Log.e("ChimeraCfgMgr", "finish waiting for safemode to complete");
    }

    public final void a(bku bku) {
        synchronized (this.h) {
            this.h.add(bku);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boz boz) {
        boo.a().a(boz);
        synchronized (this.h) {
            for (bku a : this.h) {
                if (a.a(boz)) {
                    Process.killProcess(Process.myPid());
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0105, code lost:
        if (r14 == r0) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.boz r19, int r20) {
        /*
            r18 = this;
            r1 = r18
            r8 = r19
            java.io.File r0 = r1.b
            java.lang.String r2 = "downgrade_from_config.fb"
            java.io.File r2 = defpackage.bjx.a(r0, r2)
            long r3 = r2.lastModified()
            long r5 = android.os.SystemClock.uptimeMillis()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r7 = r20
            long r9 = (long) r7
            long r9 = r0.toMillis(r9)
            long r11 = r5 - r3
            r7 = 49
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0026
            goto L_0x002f
        L_0x0026:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x002b
            goto L_0x0037
        L_0x002b:
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0037
        L_0x002f:
            android.content.Context r0 = r1.a
            java.lang.String r2 = "Timeout"
            defpackage.bla.a(r0, r7, r2)
            return
        L_0x0037:
            long r9 = android.os.SystemClock.elapsedRealtime()
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x0041 }
            goto L_0x0042
        L_0x0041:
            r0 = move-exception
        L_0x0042:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0182, InvalidConfigException -> 0x0180 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0182, InvalidConfigException -> 0x0180 }
            boz r6 = defpackage.bkq.c(r3)     // Catch:{ all -> 0x0174 }
            r3.close()     // Catch:{ IOException -> 0x0182, InvalidConfigException -> 0x0180 }
            android.content.Context r7 = r1.a
            apxg r5 = r6.f()
            bru r4 = new bru
            r4.<init>()
            bpa r3 = new bpa
            r3.<init>()
            r17 = 0
            r2 = 0
        L_0x0061:
            int r0 = r5.H()
            if (r2 >= r0) goto L_0x0163
            r5.a((defpackage.bru) r4, (int) r2)
            int r0 = r4.T()
            r6.a((defpackage.bpa) r3, (int) r0)
            int r15 = r3.e()
            java.lang.String r0 = r3.b()
            int r0 = defpackage.bok.a(r8, r0)
            if (r0 >= r15) goto L_0x0152
            int r11 = r4.T()
            bpa r11 = r6.b(r11)
            int r11 = r11.S()
            boy r11 = r6.a((int) r11)
            int r12 = r11.a()
            r13 = 1
            if (r12 == r13) goto L_0x00c5
            bms r12 = defpackage.bms.a((android.content.Context) r7, (defpackage.boy) r11)
            if (r12 == 0) goto L_0x00c5
            bnm r12 = r12.f()     // Catch:{ NameNotFoundException -> 0x00c4 }
            int r11 = defpackage.bkd.a(r12, r11)
            if (r11 == 0) goto L_0x00a7
            goto L_0x00c5
        L_0x00a7:
            java.lang.String r11 = r5.F()
            java.lang.String r12 = r4.b()
            java.lang.String r14 = defpackage.brt.b((java.lang.String) r11, (java.lang.String) r12)
            r11 = r7
            r12 = r6
            r13 = r3
            r16 = r0
            defpackage.bok.a(r11, r12, r13, r14, r15, r16)
            r14 = r2
            r15 = r3
            r16 = r4
            r12 = r5
            r11 = r6
            r13 = r7
            goto L_0x0159
        L_0x00c4:
            r0 = move-exception
        L_0x00c5:
            java.lang.String r0 = r3.b()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r11 = "Executing downgrade handler in downgrade-to config: "
            int r12 = r0.length()
            if (r12 != 0) goto L_0x00db
            java.lang.String r0 = new java.lang.String
            r0.<init>(r11)
            goto L_0x00de
        L_0x00db:
            r11.concat(r0)
        L_0x00de:
            java.lang.String r0 = r3.b()
            int r0 = defpackage.bpz.a(r8, r0)
            if (r0 < 0) goto L_0x014a
            apxg r11 = r19.f()
            bru r12 = new bru
            r12.<init>()
            r13 = 0
        L_0x00f2:
            int r14 = r11.H()
            r15 = -1
            if (r13 >= r14) goto L_0x0108
            r11.a((defpackage.bru) r12, (int) r13)
            int r14 = r12.T()
            if (r14 >= r0) goto L_0x0105
            int r13 = r13 + 1
            goto L_0x00f2
        L_0x0105:
            if (r14 != r0) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r13 = -1
        L_0x0109:
            if (r13 < 0) goto L_0x0142
            java.lang.String r12 = r11.F()
            bru r14 = new bru
            r14.<init>()
            bru r11 = r11.a((defpackage.bru) r14, (int) r13)
            java.lang.String r11 = r11.b()
            java.lang.String r11 = defpackage.brt.b((java.lang.String) r12, (java.lang.String) r11)
            bpa r12 = r8.b(r0)
            int r13 = r3.e()
            bpa r0 = r8.b(r0)
            int r0 = r0.e()
            r14 = r2
            r2 = r7
            r15 = r3
            r3 = r19
            r16 = r4
            r4 = r12
            r12 = r5
            r5 = r11
            r11 = r6
            r6 = r13
            r13 = r7
            r7 = r0
            defpackage.bok.a(r2, r3, r4, r5, r6, r7)
            goto L_0x0159
        L_0x0142:
            r14 = r2
            r15 = r3
            r16 = r4
            r12 = r5
            r11 = r6
            r13 = r7
            goto L_0x0159
        L_0x014a:
            r14 = r2
            r15 = r3
            r16 = r4
            r12 = r5
            r11 = r6
            r13 = r7
            goto L_0x0159
        L_0x0152:
            r14 = r2
            r15 = r3
            r16 = r4
            r12 = r5
            r11 = r6
            r13 = r7
        L_0x0159:
            int r2 = r14 + 1
            r6 = r11
            r5 = r12
            r7 = r13
            r3 = r15
            r4 = r16
            goto L_0x0061
        L_0x0163:
            long r2 = android.os.SystemClock.elapsedRealtime()
            android.content.Context r0 = r1.a
            r4 = 48
            long r2 = r2 - r9
            java.lang.String r2 = java.lang.String.valueOf(r2)
            defpackage.bla.a(r0, r4, r2)
            return
        L_0x0174:
            r0 = move-exception
            r2 = r0
            r3.close()     // Catch:{ all -> 0x017a }
            goto L_0x017f
        L_0x017a:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r3)     // Catch:{ IOException -> 0x0182, InvalidConfigException -> 0x0180 }
        L_0x017f:
            throw r2     // Catch:{ IOException -> 0x0182, InvalidConfigException -> 0x0180 }
        L_0x0180:
            r0 = move-exception
            goto L_0x0183
        L_0x0182:
            r0 = move-exception
        L_0x0183:
            java.lang.String r2 = "ChimeraCfgMgr"
            java.lang.String r3 = "Failed to read downgrade-from config"
            android.util.Log.e(r2, r3, r0)
            android.content.Context r2 = r1.a
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "Read fail:"
            int r4 = r0.length()
            if (r4 != 0) goto L_0x01a2
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            goto L_0x01a6
        L_0x01a2:
            java.lang.String r0 = r3.concat(r0)
        L_0x01a6:
            defpackage.bla.a(r2, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkv.a(boz, int):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(Map map, int i2, boolean z, boolean z2) {
        int i3 = i2;
        boolean z3 = z;
        if (aekv.b(this.a)) {
            boolean z4 = !z2;
            StringBuilder sb = new StringBuilder(94);
            sb.append("Sending com.google.android.chimera.IntentOperation.NEW_MODULE Intents: ");
            sb.append(i3);
            sb.append(",");
            sb.append(z4);
            sb.append(",");
            sb.append(z3);
            Log.i("ChimeraCfgMgr", sb.toString());
            boolean a = a(map);
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                int intValue = ((Integer) entry.getValue()).intValue();
                Intent intent = new Intent(IntentOperation.ACTION_NEW_MODULE);
                if (intValue >= 0) {
                    intent.putExtra(IntentOperation.EXTRA_PREVIOUS_VERSION, intValue);
                }
                intent.putExtra(IntentOperation.EXTRA_CONTAINER_UPDATED, a);
                IntentOperation.startModuleIntentOperation(this.a, str, intent);
            }
            if (z3) {
                PendingIntent a2 = a(3);
                if (a2 != null) {
                    try {
                        ((AlarmManager) this.a.getSystemService("alarm")).setInexactRepeating(3, SystemClock.elapsedRealtime() + q, q, a2);
                    } catch (SecurityException e2) {
                    }
                }
                Log.w("ChimeraCfgMgr", "Can't set alarm for modules init watchdog");
            }
            Intent startIntent = IntentOperation.getStartIntent(this.a, ConfigurationManager$IntentHandler.class, IntentOperation.ACTION_NEW_MODULE);
            if (startIntent != null) {
                this.a.startService(startIntent.putExtra("chimera_complete", i3).putExtra("chimera_full_reinit", z4));
            } else {
                Log.w("ChimeraCfgMgr", "Failed to create NEW_MODULE cleanup intent");
            }
        }
    }

    public final void a(boolean z) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            bma.c(this.b);
            if (z) {
                bma.d(g());
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (a(0) == null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r7, boolean r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.e
            monitor-enter(r0)
            aucd r1 = r6.n()     // Catch:{ all -> 0x00a1 }
            aucj r2 = r1.b     // Catch:{ all -> 0x00a1 }
            bno r2 = (defpackage.bno) r2     // Catch:{ all -> 0x00a1 }
            int r3 = r2.c     // Catch:{ all -> 0x00a1 }
            int r2 = r2.d     // Catch:{ all -> 0x00a1 }
            if (r3 == r2) goto L_0x009c
            r2 = 0
            if (r7 == 0) goto L_0x0015
            goto L_0x001c
        L_0x0015:
            android.app.PendingIntent r7 = r6.a((int) r2)     // Catch:{ all -> 0x00a1 }
            if (r7 != 0) goto L_0x009f
        L_0x001c:
            aucj r7 = r1.b     // Catch:{ all -> 0x00a1 }
            bno r7 = (defpackage.bno) r7     // Catch:{ all -> 0x00a1 }
            int r3 = r7.d     // Catch:{ all -> 0x00a1 }
            int r7 = r7.c     // Catch:{ all -> 0x00a1 }
            if (r3 <= r7) goto L_0x0063
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r5 = 51
            r4.<init>(r5)     // Catch:{ all -> 0x00a1 }
            java.lang.String r5 = "Resetting bad ModulesInit ("
            r4.append(r5)     // Catch:{ all -> 0x00a1 }
            r4.append(r7)     // Catch:{ all -> 0x00a1 }
            java.lang.String r7 = "/"
            r4.append(r7)     // Catch:{ all -> 0x00a1 }
            r4.append(r3)     // Catch:{ all -> 0x00a1 }
            java.lang.String r7 = ")"
            r4.append(r7)     // Catch:{ all -> 0x00a1 }
            java.lang.String r7 = "ChimeraCfgMgr"
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x00a1 }
            android.util.Log.w(r7, r3)     // Catch:{ all -> 0x00a1 }
            boolean r7 = r1.c     // Catch:{ all -> 0x00a1 }
            if (r7 != 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            r1.c()     // Catch:{ all -> 0x00a1 }
            r1.c = r2     // Catch:{ all -> 0x00a1 }
        L_0x0055:
            aucj r7 = r1.b     // Catch:{ all -> 0x00a1 }
            bno r7 = (defpackage.bno) r7     // Catch:{ all -> 0x00a1 }
            bno r3 = defpackage.bno.e     // Catch:{ all -> 0x00a1 }
            int r3 = r7.a     // Catch:{ all -> 0x00a1 }
            r3 = r3 | 4
            r7.a = r3     // Catch:{ all -> 0x00a1 }
            r7.d = r2     // Catch:{ all -> 0x00a1 }
        L_0x0063:
            aucj r7 = r1.b     // Catch:{ all -> 0x00a1 }
            bno r7 = (defpackage.bno) r7     // Catch:{ all -> 0x00a1 }
            int r7 = r7.c     // Catch:{ all -> 0x00a1 }
            int r7 = r7 + 1
            boolean r3 = r1.c     // Catch:{ all -> 0x00a1 }
            if (r3 != 0) goto L_0x0070
            goto L_0x0075
        L_0x0070:
            r1.c()     // Catch:{ all -> 0x00a1 }
            r1.c = r2     // Catch:{ all -> 0x00a1 }
        L_0x0075:
            aucj r3 = r1.b     // Catch:{ all -> 0x00a1 }
            bno r3 = (defpackage.bno) r3     // Catch:{ all -> 0x00a1 }
            bno r4 = defpackage.bno.e     // Catch:{ all -> 0x00a1 }
            int r4 = r3.a     // Catch:{ all -> 0x00a1 }
            r4 = r4 | 2
            r3.a = r4     // Catch:{ all -> 0x00a1 }
            r3.c = r7     // Catch:{ all -> 0x00a1 }
            boolean r1 = r6.a((defpackage.aucd) r1)     // Catch:{ all -> 0x00a1 }
            if (r1 != 0) goto L_0x0091
            java.lang.String r7 = "ChimeraCfgMgr"
            java.lang.String r8 = "Not emitting NEW_MODULES due to failed modulesInit write"
            android.util.Log.w(r7, r8)     // Catch:{ all -> 0x00a1 }
            goto L_0x009f
        L_0x0091:
            r1 = 0
            boz r3 = r6.j     // Catch:{ all -> 0x00a1 }
            java.util.Map r1 = a((defpackage.boz) r1, (defpackage.boz) r3)     // Catch:{ all -> 0x00a1 }
            r6.a(r1, r7, r8, r2)     // Catch:{ all -> 0x00a1 }
            goto L_0x009f
        L_0x009c:
            r6.k()     // Catch:{ all -> 0x00a1 }
        L_0x009f:
            monitor-exit(r0)     // Catch:{ all -> 0x00a1 }
            return
        L_0x00a1:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a1 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkv.a(boolean, boolean):void");
    }

    public final boolean a(aucd aucd) {
        byte[] k2 = ((bno) aucd.i()).k();
        File file = new File(this.b, "pending_modules_init.pb");
        File h2 = h();
        if (bkq.a(k2, file, h2, false) != 0) {
            return true;
        }
        h2.delete();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x024f, code lost:
        r17 = r0 + 1;
        r14.a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0258, code lost:
        if (r4.t() != false) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x025a, code lost:
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0261, code lost:
        r19 = r8;
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0265, code lost:
        r0 = r34.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x026d, code lost:
        if (r7.size() != r0) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x026f, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0270, code lost:
        if (r9 >= r0) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0280, code lost:
        if (((java.lang.String) r7.get(r9)).equals(r14.c(r9)) == false) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0282, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x028c, code lost:
        if (a() == false) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0294, code lost:
        if (r13.g == 0) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        defpackage.bkq.a(r14.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x029c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        defpackage.bla.a(r13.a, 11, r0.getMessage());
        r0 = java.lang.String.valueOf(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02b8, code lost:
        if (r0.length() == 0) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02ba, code lost:
        r0 = new java.lang.String("Stored Chimera config verification failed: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02c0, code lost:
        r0 = "Stored Chimera config verification failed: ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02c4, code lost:
        android.util.Log.e("ChimeraCfgMgr", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02c8, code lost:
        if (r39 != false) goto L_0x02e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d4, code lost:
        r19 = r8;
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r3 = r15.b;
        r4 = r15.c;
        r0 = r15.d;
        r36 = r19;
        r18 = r21;
        r15 = r12;
        r0 = a(r34, r3, r4, r0, r15.e, r7, r37, r38, r10, r36, r41);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0311, code lost:
        r1 = (defpackage.boz) r0.first;
        r0 = (defpackage.bpw) r0.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x031b, code lost:
        monitor-enter(r13.e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x031e, code lost:
        if (r14 == r13.j) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0324, code lost:
        if (r18.isEmpty() != false) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0326, code lost:
        r3 = "<no config>";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0329, code lost:
        r3 = defpackage.bmy.a((java.util.List) r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x032d, code lost:
        r5 = defpackage.bmy.a((java.util.List) r36);
        r7 = new java.lang.StringBuilder((java.lang.String.valueOf(r3).length() + 28) + java.lang.String.valueOf(r5).length());
        r7.append("Updating module config: ");
        r7.append(r3);
        r7.append(" -> ");
        r7.append(r5);
        android.util.Log.i("ChimeraCfgMgr", r7.toString());
        r3 = b(r13.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0368, code lost:
        if (r15 > 0) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x036e, code lost:
        if (l() == false) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0370, code lost:
        if (r14 == null) goto L_0x0372;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0374, code lost:
        if (r1 != null) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0376, code lost:
        r4 = r34.f();
        r5 = new defpackage.bru();
        r6 = new defpackage.bpa();
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0389, code lost:
        if (r9 < r4.H()) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x038b, code lost:
        r4.a(r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0396, code lost:
        if (r5.T() < r34.c()) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0398, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x039a, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x039b, code lost:
        defpackage.amtf.a(r7);
        r14.a(r6, r5.T());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03b1, code lost:
        if (defpackage.bok.a(r1, r6.b()) < r6.e()) goto L_0x03b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03b3, code lost:
        android.util.Log.e("DowngradeHelper", "isModuleDowngradeRequired true");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03ba, code lost:
        if (r39 != false) goto L_0x03bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03be, code lost:
        if (r13.p == null) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03c1, code lost:
        r13.p.stopWatching();
        r13.p = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03c9, code lost:
        r4 = defpackage.bjx.a(r13.b, "current_config.fb");
        r5 = defpackage.bjx.a(r13.b, "downgrade_from_config.fb");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03dd, code lost:
        if (r4.renameTo(r5) != false) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03df, code lost:
        r5.setLastModified(android.os.SystemClock.uptimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03e7, code lost:
        r4.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03ea, code lost:
        a(defpackage.bog.a(1024, java.util.Collections.emptyList(), java.util.Collections.emptyList(), defpackage.brl.v, "", java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), "", java.util.Collections.emptyList()));
        a(r1, r15);
        p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0418, code lost:
        a(r13.g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x041e, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0422, code lost:
        android.util.Log.e("DowngradeHelper", "isModuleDowngradeRequired false");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x042a, code lost:
        if (r39 == false) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x042c, code lost:
        a(r13.g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0432, code lost:
        a(r1, r15);
        p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0439, code lost:
        p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x043c, code lost:
        r13.j = r1;
        r13.k = r0;
        r13.l = r36;
        defpackage.bma.a((java.io.Closeable) r13.f);
        r13.f = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x044c, code lost:
        if (r39 != false) goto L_0x044e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        r5 = b(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
        r0 = n();
        r4 = ((defpackage.bno) r0.b).c + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0461, code lost:
        if (r0.c == false) goto L_0x0463;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0464, code lost:
        r0.c();
        r0.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x046a, code lost:
        r6 = (defpackage.bno) r0.b;
        r7 = defpackage.bno.e;
        r8 = 2;
        r6.a |= 2;
        r6.c = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x047c, code lost:
        if (a(r0) != false) goto L_0x047e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0482, code lost:
        if (b() == false) goto L_0x0484;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0484, code lost:
        r6 = new java.io.File(r13.b, "pending_config.fb");
        r7 = g();
        r0 = false;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0493, code lost:
        if (r9 < r8) goto L_0x0495;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0495, code lost:
        r0 = r13.j.d.duplicate();
        r10 = new defpackage.bkp();
        r11 = defpackage.bkq.a(r0, r6, r7, r10, true, true);
        r35 = r9 + 1;
        r8 = r10.a;
        r13.g = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04bc, code lost:
        if (r11 != null) goto L_0x04be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04be, code lost:
        r36 = r5;
        r37 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04c6, code lost:
        if (r8 != 0) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        r0 = defpackage.bkq.c(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04d6, code lost:
        if (r0.d.equals(r13.j.d) != false) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04d8, code lost:
        r13.j = r0;
        r13.f = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04e4, code lost:
        throw new java.io.IOException("mapped file doesn't match original buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04e5, code lost:
        r36 = r5;
        r37 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04f2, code lost:
        throw new java.io.IOException("write failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:?, code lost:
        android.util.Log.e("ChimeraCfgMgr", "Failed to write/verify config", r0);
        r13.g = 0;
        r7.delete();
        defpackage.bma.a((java.io.Closeable) r11);
        r9 = r35;
        r5 = r36;
        r6 = r37;
        r0 = true;
        r8 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x050e, code lost:
        r36 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0510, code lost:
        if (r0 != false) goto L_0x0512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0514, code lost:
        r13.d = true;
        r0 = new java.lang.String[]{"current_config.pb", "current_features.pb"};
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0526, code lost:
        if (r9 >= 2) goto L_0x0537;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0528, code lost:
        new java.io.File(r13.b, r0[r9]).delete();
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x053b, code lost:
        if (defpackage.aekv.a() == false) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0543, code lost:
        if (defpackage.aekv.b(r13.a) == false) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0545, code lost:
        r0 = defpackage.bkq.a(defpackage.blb.a(r13.a));
        r6 = new java.lang.String[]{"current_config.pb", "current_features.pb", "current_config.fb", "pending_config.fb", "current_modules_init.pb", "pending_modules_init.pb"};
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x056f, code lost:
        if (r9 >= 6) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0571, code lost:
        new java.io.File(r0, r6[r9]).delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x057b, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x057e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0580, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0582, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0584, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0585, code lost:
        r36 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0587, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x058b, code lost:
        r36 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x058d, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        r0 = new android.content.Intent("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED");
        r0.putExtra("last_modified_time", r13.g);
        r13.a.sendBroadcast(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05a5, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L_0x05a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05af, code lost:
        if (r13.a.getApplicationInfo().targetSdkVersion < 26) goto L_0x05b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x05b2, code lost:
        r5 = r13.a;
        r5.sendBroadcast(r0.setPackage(r5.getPackageName()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        r0 = a(r14, r1);
        r5 = a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05c7, code lost:
        if (r3 != null) goto L_0x05c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05c9, code lost:
        if (r5 == false) goto L_0x05cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        r3.a(r1, r0.keySet());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05d3, code lost:
        r3.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05d6, code lost:
        if (r14 != null) goto L_0x05d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05d8, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05da, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:?, code lost:
        a(r0, r4, true, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05e0, code lost:
        if (r9 == false) goto L_0x05e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05e2, code lost:
        defpackage.bla.a(r13.a, 32, "main");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05ec, code lost:
        defpackage.blu.a(r13.a).g();
        defpackage.bla.a(r13.a, 47, defpackage.bmy.a((java.util.List) r18));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0600, code lost:
        if (r36 != null) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:?, code lost:
        r36.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:?, code lost:
        r13.n = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0609, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x060b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x060d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x060e, code lost:
        r36 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0611, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0612, code lost:
        if (r36 != null) goto L_0x0614;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:?, code lost:
        r36.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0618, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:?, code lost:
        defpackage.apev.a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x061d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0620, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:?, code lost:
        r13.n = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0624, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0627, code lost:
        r13.n = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x062b, code lost:
        j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x062f, code lost:
        a(r13.j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x063e, code lost:
        throw new com.google.android.chimera.config.InvalidConfigException("Config changed while recomputing");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0642, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0643, code lost:
        r1 = java.lang.String.valueOf(r35);
        r0 = java.lang.String.valueOf(r0);
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 28) + java.lang.String.valueOf(r0).length());
        r5.append("Invalid module set config ");
        r5.append(r1);
        r5.append(": ");
        r5.append(r0);
        android.util.Log.i("ChimeraCfgMgr", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b0, code lost:
        if (defpackage.bmy.a(r8, r9) == false) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b2, code lost:
        r0 = r15.b;
        defpackage.bkn.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bb, code lost:
        if (defpackage.hei.e() == false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01bd, code lost:
        r2 = r34.e();
        r4 = new defpackage.apxg();
        r0 = r0.iterator();
        r17 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d0, code lost:
        if (r0.hasNext() == false) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d2, code lost:
        r3 = (defpackage.bob) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01dc, code lost:
        if (r3.d == false) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01de, code lost:
        r5 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e0, code lost:
        if (r5 == r2) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e2, code lost:
        r17 = r5 + 1;
        r14.a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01eb, code lost:
        if (r4.t() == false) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f7, code lost:
        if (r4.Q().equals(r3.b) == false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f9, code lost:
        r19 = r8;
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0205, code lost:
        if (r4.s() != r3.c) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x020d, code lost:
        if (r4.t() != r3.d) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0215, code lost:
        if (r4.u() == r3.e) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x021b, code lost:
        r8 = r19;
        r9 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0229, code lost:
        r19 = r8;
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0231, code lost:
        r19 = r8;
        r21 = r9;
        r5 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0238, code lost:
        r19 = r8;
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0240, code lost:
        r19 = r8;
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0246, code lost:
        r19 = r8;
        r21 = r9;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x024c, code lost:
        if (r0 < r2) goto L_0x024f;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0614 A[SYNTHETIC, Splitter:B:276:0x0614] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0620 A[ExcHandler: all (r0v28 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:184:0x044f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.boz r34, defpackage.bkt r35, java.util.Set r36, java.lang.String r37, java.lang.String r38, boolean r39, int r40, java.util.Map r41) {
        /*
            r33 = this;
            r13 = r33
            r14 = r34
            r15 = r35
            r12 = r40
            r11 = r41
            boolean r0 = r33.b()
            if (r0 != 0) goto L_0x06b5
            defpackage.bkn.b()
            r0 = 44
            amsk r0 = defpackage.amsk.a((char) r0)
            amsk r0 = r0.b()
            amsk r0 = r0.a()
            amzt r1 = defpackage.amzy.j()
            awxs r2 = defpackage.awxs.a
            awxt r2 = r2.a()
            java.lang.String r2 = r2.d()
            java.lang.Iterable r2 = r0.a((java.lang.CharSequence) r2)
            r1.b((java.lang.Iterable) r2)
            int r2 = defpackage.jlo.m()
            int r3 = r2 + -1
            if (r2 == 0) goto L_0x06b2
            r2 = 13
            if (r3 == r2) goto L_0x0043
            goto L_0x0054
        L_0x0043:
            awxs r2 = defpackage.awxs.a
            awxt r2 = r2.a()
            java.lang.String r2 = r2.e()
            java.lang.Iterable r0 = r0.a((java.lang.CharSequence) r2)
            r1.b((java.lang.Iterable) r0)
        L_0x0054:
            amzy r0 = r1.a()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r36.iterator()
        L_0x0061:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0071
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.add(r3)
            goto L_0x0061
        L_0x0071:
            int r2 = r0.size()
            r9 = 0
            r3 = 0
        L_0x0077:
            if (r3 >= r2) goto L_0x0085
            java.lang.Object r4 = r0.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r1.add(r4)
            int r3 = r3 + 1
            goto L_0x0077
        L_0x0085:
            bpw r7 = defpackage.bpw.b(r1)
            bpw r8 = r15.a
            r6 = 1
            java.util.List r0 = r15.c     // Catch:{ NameNotFoundException -> 0x068a }
            java.util.List r1 = r15.d     // Catch:{ NameNotFoundException -> 0x068a }
            java.util.List r2 = r15.e     // Catch:{ NameNotFoundException -> 0x068a }
            int r3 = r0.size()     // Catch:{ NameNotFoundException -> 0x068a }
            int r4 = r1.size()     // Catch:{ NameNotFoundException -> 0x068a }
            int r5 = r2.size()     // Catch:{ NameNotFoundException -> 0x068a }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x068a }
            int r3 = r3 + r4
            int r3 = r3 + r5
            r10.<init>(r3)     // Catch:{ NameNotFoundException -> 0x068a }
            r5 = 3
            java.util.List[] r3 = new java.util.List[r5]     // Catch:{ NameNotFoundException -> 0x068a }
            r3[r9] = r0     // Catch:{ NameNotFoundException -> 0x068a }
            r3[r6] = r1     // Catch:{ NameNotFoundException -> 0x068a }
            r4 = 2
            r3[r4] = r2     // Catch:{ NameNotFoundException -> 0x068a }
            java.util.List r1 = java.util.Arrays.asList(r3)     // Catch:{ NameNotFoundException -> 0x068a }
            r2 = 0
        L_0x00b4:
            int r0 = r1.size()     // Catch:{ NameNotFoundException -> 0x068a }
            r3 = 5
            if (r2 >= r0) goto L_0x015d
            int r5 = defpackage.bnl.a(r2)     // Catch:{ NameNotFoundException -> 0x068a }
            java.lang.Object r0 = r1.get(r2)     // Catch:{ NameNotFoundException -> 0x068a }
            r6 = r0
            java.util.List r6 = (java.util.List) r6     // Catch:{ NameNotFoundException -> 0x068a }
            r4 = 0
        L_0x00c7:
            int r0 = r6.size()     // Catch:{ NameNotFoundException -> 0x068a }
            if (r4 < r0) goto L_0x00d3
            int r2 = r2 + 1
            r4 = 2
            r5 = 3
            r6 = 1
            goto L_0x00b4
        L_0x00d3:
            java.lang.Object r0 = r6.get(r4)     // Catch:{ NameNotFoundException -> 0x068a }
            r9 = r0
            bms r9 = (defpackage.bms) r9     // Catch:{ NameNotFoundException -> 0x0158 }
            bnm r0 = r9.f()     // Catch:{ NameNotFoundException -> 0x0119 }
            java.lang.Object r19 = r0.c(r3)     // Catch:{ NameNotFoundException -> 0x0119 }
            r3 = r19
            aucd r3 = (defpackage.aucd) r3     // Catch:{ NameNotFoundException -> 0x0119 }
            r3.a((defpackage.aucj) r0)     // Catch:{ NameNotFoundException -> 0x0119 }
            boolean r0 = r3.c     // Catch:{ NameNotFoundException -> 0x068a }
            if (r0 != 0) goto L_0x00ef
            r9 = 0
            goto L_0x00f5
        L_0x00ef:
            r3.c()     // Catch:{ NameNotFoundException -> 0x068a }
            r9 = 0
            r3.c = r9     // Catch:{ NameNotFoundException -> 0x068a }
        L_0x00f5:
            aucj r0 = r3.b     // Catch:{ NameNotFoundException -> 0x068a }
            bnm r0 = (defpackage.bnm) r0     // Catch:{ NameNotFoundException -> 0x068a }
            bnm r18 = defpackage.bnm.r     // Catch:{ NameNotFoundException -> 0x068a }
            int r9 = r5 + -1
            if (r5 == 0) goto L_0x0115
            r0.k = r9     // Catch:{ NameNotFoundException -> 0x068a }
            int r9 = r0.a     // Catch:{ NameNotFoundException -> 0x068a }
            r9 = r9 | 256(0x100, float:3.59E-43)
            r0.a = r9     // Catch:{ NameNotFoundException -> 0x068a }
            aucj r0 = r3.i()     // Catch:{ NameNotFoundException -> 0x068a }
            bnm r0 = (defpackage.bnm) r0     // Catch:{ NameNotFoundException -> 0x068a }
            r10.add(r0)     // Catch:{ NameNotFoundException -> 0x068a }
            int r4 = r4 + 1
            r3 = 5
            r9 = 0
            goto L_0x00c7
        L_0x0115:
            r16 = 0
            throw r16     // Catch:{ NameNotFoundException -> 0x068a }
        L_0x0119:
            r0 = move-exception
            r16 = 0
            r18 = 0
            r3 = 2
            if (r5 != r3) goto L_0x0151
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ NameNotFoundException -> 0x068a }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ NameNotFoundException -> 0x068a }
            int r2 = r2.length()     // Catch:{ NameNotFoundException -> 0x068a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x068a }
            int r2 = r2 + 38
            r3.<init>(r2)     // Catch:{ NameNotFoundException -> 0x068a }
            java.lang.String r2 = "Can't get descriptor for required APK "
            r3.append(r2)     // Catch:{ NameNotFoundException -> 0x068a }
            r3.append(r1)     // Catch:{ NameNotFoundException -> 0x068a }
            java.lang.String r1 = "ChimeraCfgMgr"
            java.lang.String r2 = r3.toString()     // Catch:{ NameNotFoundException -> 0x068a }
            android.util.Log.w(r1, r2)     // Catch:{ NameNotFoundException -> 0x068a }
            if (r11 == 0) goto L_0x0150
            bke r1 = new bke     // Catch:{ NameNotFoundException -> 0x068a }
            r3 = 2
            r1.<init>(r3)     // Catch:{ NameNotFoundException -> 0x068a }
            r11.put(r9, r1)     // Catch:{ NameNotFoundException -> 0x068a }
        L_0x0150:
            throw r0     // Catch:{ NameNotFoundException -> 0x068a }
        L_0x0151:
            r6.remove(r4)     // Catch:{ NameNotFoundException -> 0x068a }
            r3 = 5
            r9 = 0
            goto L_0x00c7
        L_0x0158:
            r0 = move-exception
            r18 = 0
            goto L_0x068b
        L_0x015d:
            r3 = 2
            r16 = 0
            r18 = 0
            java.util.Comparator r0 = defpackage.bkc.a     // Catch:{ NameNotFoundException -> 0x068a }
            bpw r10 = defpackage.bpw.b(r10, r0)     // Catch:{ NameNotFoundException -> 0x068a }
            java.lang.Object r1 = r13.e
            monitor-enter(r1)
            boz r0 = r13.j     // Catch:{ all -> 0x0687 }
            if (r14 != r0) goto L_0x067f
            if (r14 == 0) goto L_0x0177
            bpw r0 = r33.c(r34)     // Catch:{ all -> 0x0687 }
            r9 = r0
            goto L_0x017a
        L_0x0177:
            bpw r0 = defpackage.bmy.c     // Catch:{ all -> 0x0687 }
            r9 = r0
        L_0x017a:
            if (r14 == 0) goto L_0x02e2
            int r0 = r10.size()     // Catch:{ all -> 0x0687 }
            int r2 = r34.b()     // Catch:{ all -> 0x0687 }
            if (r0 != r2) goto L_0x02db
            boy r0 = new boy     // Catch:{ all -> 0x0687 }
            r0.<init>()     // Catch:{ all -> 0x0687 }
            r2 = 0
        L_0x018c:
            int r4 = r10.size()     // Catch:{ all -> 0x0687 }
            if (r2 >= r4) goto L_0x01ac
            r14.a((defpackage.boy) r0, (int) r2)     // Catch:{ all -> 0x0687 }
            java.lang.Object r4 = r10.get(r2)     // Catch:{ all -> 0x0687 }
            bnm r4 = (defpackage.bnm) r4     // Catch:{ all -> 0x0687 }
            int r4 = defpackage.bkd.a(r4, r0)     // Catch:{ all -> 0x0687 }
            if (r4 != 0) goto L_0x01a4
            int r2 = r2 + 1
            goto L_0x018c
        L_0x01a4:
            r19 = r8
            r21 = r9
            r5 = 0
            goto L_0x02e8
        L_0x01ac:
            boolean r0 = defpackage.bmy.a((defpackage.bpw) r8, (defpackage.bpw) r9)     // Catch:{ all -> 0x0687 }
            if (r0 == 0) goto L_0x02d4
            bpw r0 = r15.b     // Catch:{ all -> 0x0687 }
            defpackage.bkn.b()     // Catch:{ all -> 0x0687 }
            boolean r2 = defpackage.hei.e()     // Catch:{ all -> 0x0687 }
            if (r2 == 0) goto L_0x0261
            int r2 = r34.e()     // Catch:{ all -> 0x0687 }
            apxg r4 = new apxg     // Catch:{ all -> 0x0687 }
            r4.<init>()     // Catch:{ all -> 0x0687 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0687 }
            r17 = 0
        L_0x01cc:
            boolean r19 = r0.hasNext()     // Catch:{ all -> 0x0687 }
            if (r19 == 0) goto L_0x0246
            java.lang.Object r19 = r0.next()     // Catch:{ all -> 0x0687 }
            r3 = r19
            bob r3 = (defpackage.bob) r3     // Catch:{ all -> 0x0687 }
            boolean r5 = r3.d     // Catch:{ all -> 0x0687 }
            if (r5 == 0) goto L_0x0240
            r5 = r17
        L_0x01e0:
            if (r5 == r2) goto L_0x0238
            int r17 = r5 + 1
            r14.a((defpackage.apxg) r4, (int) r5)     // Catch:{ all -> 0x0687 }
            boolean r5 = r4.t()     // Catch:{ all -> 0x0687 }
            if (r5 == 0) goto L_0x0231
            java.lang.String r5 = r4.Q()     // Catch:{ all -> 0x0687 }
            java.lang.String r6 = r3.b     // Catch:{ all -> 0x0687 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0687 }
            if (r5 == 0) goto L_0x0229
            long r5 = r4.s()     // Catch:{ all -> 0x0687 }
            r19 = r8
            r21 = r9
            long r8 = r3.c     // Catch:{ all -> 0x0687 }
            int r22 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r22 != 0) goto L_0x0225
            boolean r5 = r4.t()     // Catch:{ all -> 0x0687 }
            boolean r6 = r3.d     // Catch:{ all -> 0x0687 }
            if (r5 != r6) goto L_0x0221
            boolean r5 = r4.u()     // Catch:{ all -> 0x0687 }
            boolean r3 = r3.e     // Catch:{ all -> 0x0687 }
            if (r5 == r3) goto L_0x021b
            r5 = 0
            goto L_0x02e8
        L_0x021b:
            r8 = r19
            r9 = r21
            r3 = 2
            goto L_0x01cc
        L_0x0221:
            r5 = 0
            goto L_0x02e8
        L_0x0225:
            r5 = 0
            goto L_0x02e8
        L_0x0229:
            r19 = r8
            r21 = r9
            r5 = 0
            goto L_0x02e8
        L_0x0231:
            r19 = r8
            r21 = r9
            r5 = r17
            goto L_0x01e0
        L_0x0238:
            r19 = r8
            r21 = r9
            r5 = 0
            goto L_0x02e8
        L_0x0240:
            r19 = r8
            r21 = r9
            r3 = 2
            goto L_0x01cc
        L_0x0246:
            r19 = r8
            r21 = r9
            r0 = r17
        L_0x024c:
            if (r0 < r2) goto L_0x024f
            goto L_0x0265
        L_0x024f:
            int r17 = r0 + 1
            r14.a((defpackage.apxg) r4, (int) r0)     // Catch:{ all -> 0x0687 }
            boolean r0 = r4.t()     // Catch:{ all -> 0x0687 }
            if (r0 != 0) goto L_0x025d
            r0 = r17
            goto L_0x024c
        L_0x025d:
            r5 = 0
            goto L_0x02e8
        L_0x0261:
            r19 = r8
            r21 = r9
        L_0x0265:
            int r0 = r34.d()     // Catch:{ all -> 0x0687 }
            int r2 = r7.size()     // Catch:{ all -> 0x0687 }
            if (r2 != r0) goto L_0x02d1
            r9 = 0
        L_0x0270:
            if (r9 >= r0) goto L_0x0288
            java.lang.Object r2 = r7.get(r9)     // Catch:{ all -> 0x0687 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0687 }
            java.lang.String r3 = r14.c(r9)     // Catch:{ all -> 0x0687 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0687 }
            if (r2 == 0) goto L_0x0285
            int r9 = r9 + 1
            goto L_0x0270
        L_0x0285:
            r5 = 0
            goto L_0x02e8
        L_0x0288:
            boolean r0 = r33.a()     // Catch:{ all -> 0x0687 }
            if (r0 == 0) goto L_0x02ce
            long r2 = r13.g     // Catch:{ all -> 0x0687 }
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x02c8
            java.nio.ByteBuffer r0 = r14.d     // Catch:{ InvalidConfigException -> 0x029c }
            defpackage.bkq.a((java.nio.ByteBuffer) r0)     // Catch:{ InvalidConfigException -> 0x029c }
            goto L_0x02ca
        L_0x029c:
            r0 = move-exception
            android.content.Context r2 = r13.a     // Catch:{ all -> 0x0687 }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x0687 }
            r4 = 11
            defpackage.bla.a(r2, r4, r3)     // Catch:{ all -> 0x0687 }
            java.lang.String r2 = "ChimeraCfgMgr"
            java.lang.String r3 = "Stored Chimera config verification failed: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0687 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0687 }
            int r4 = r0.length()     // Catch:{ all -> 0x0687 }
            if (r4 != 0) goto L_0x02c0
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0687 }
            r0.<init>(r3)     // Catch:{ all -> 0x0687 }
            goto L_0x02c4
        L_0x02c0:
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x0687 }
        L_0x02c4:
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x0687 }
            goto L_0x02e8
        L_0x02c8:
            if (r39 != 0) goto L_0x02e8
        L_0x02ca:
            monitor-exit(r1)     // Catch:{ all -> 0x0687 }
            r9 = 1
            goto L_0x06b1
        L_0x02ce:
            r5 = 0
            goto L_0x02e8
        L_0x02d1:
            r5 = 0
            goto L_0x02e8
        L_0x02d4:
            r19 = r8
            r21 = r9
            r5 = 0
            goto L_0x02e8
        L_0x02db:
            r19 = r8
            r21 = r9
            r5 = 0
            goto L_0x02e8
        L_0x02e2:
            r19 = r8
            r21 = r9
            r5 = 0
        L_0x02e8:
            monitor-exit(r1)     // Catch:{ all -> 0x0687 }
            bpw r3 = r15.b     // Catch:{ InvalidConfigException -> 0x0642 }
            java.util.List r4 = r15.c     // Catch:{ InvalidConfigException -> 0x0642 }
            java.util.List r0 = r15.d     // Catch:{ InvalidConfigException -> 0x0642 }
            java.util.List r8 = r15.e     // Catch:{ InvalidConfigException -> 0x0642 }
            r1 = r33
            r2 = r34
            r9 = 2
            r17 = 5
            r20 = 3
            r5 = r0
            r15 = 1
            r6 = r8
            r36 = r19
            r8 = r37
            r18 = r21
            r15 = 0
            r9 = r38
            r15 = r16
            r11 = r36
            r15 = r12
            r12 = r41
            android.util.Pair r0 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ InvalidConfigException -> 0x0642 }
            java.lang.Object r1 = r0.first
            boz r1 = (defpackage.boz) r1
            java.lang.Object r0 = r0.second
            bpw r0 = (defpackage.bpw) r0
            java.lang.Object r2 = r13.e
            monitor-enter(r2)
            boz r3 = r13.j     // Catch:{ all -> 0x063f }
            if (r14 != r3) goto L_0x0637
            boolean r3 = r18.isEmpty()     // Catch:{ all -> 0x063f }
            if (r3 == 0) goto L_0x0329
            java.lang.String r3 = "<no config>"
            goto L_0x032d
        L_0x0329:
            java.lang.String r3 = defpackage.bmy.a((java.util.List) r18)     // Catch:{ all -> 0x063f }
        L_0x032d:
            java.lang.String r4 = "ChimeraCfgMgr"
            java.lang.String r5 = defpackage.bmy.a((java.util.List) r36)     // Catch:{ all -> 0x063f }
            java.lang.String r6 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x063f }
            int r6 = r6.length()     // Catch:{ all -> 0x063f }
            int r6 = r6 + 28
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x063f }
            int r7 = r7.length()     // Catch:{ all -> 0x063f }
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x063f }
            r7.<init>(r6)     // Catch:{ all -> 0x063f }
            java.lang.String r6 = "Updating module config: "
            r7.append(r6)     // Catch:{ all -> 0x063f }
            r7.append(r3)     // Catch:{ all -> 0x063f }
            java.lang.String r3 = " -> "
            r7.append(r3)     // Catch:{ all -> 0x063f }
            r7.append(r5)     // Catch:{ all -> 0x063f }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x063f }
            android.util.Log.i(r4, r3)     // Catch:{ all -> 0x063f }
            android.content.Context r3 = r13.a     // Catch:{ all -> 0x063f }
            bny r3 = b((android.content.Context) r3)     // Catch:{ all -> 0x063f }
            if (r15 <= 0) goto L_0x0439
            boolean r4 = r33.l()     // Catch:{ all -> 0x063f }
            if (r4 != 0) goto L_0x042a
            if (r14 != 0) goto L_0x0374
            goto L_0x043c
        L_0x0374:
            if (r1 == 0) goto L_0x043c
            apxg r4 = r34.f()     // Catch:{ all -> 0x063f }
            bru r5 = new bru     // Catch:{ all -> 0x063f }
            r5.<init>()     // Catch:{ all -> 0x063f }
            bpa r6 = new bpa     // Catch:{ all -> 0x063f }
            r6.<init>()     // Catch:{ all -> 0x063f }
            r9 = 0
        L_0x0385:
            int r7 = r4.H()     // Catch:{ all -> 0x063f }
            if (r9 >= r7) goto L_0x0422
            r4.a((defpackage.bru) r5, (int) r9)     // Catch:{ all -> 0x063f }
            int r7 = r5.T()     // Catch:{ all -> 0x063f }
            int r8 = r34.c()     // Catch:{ all -> 0x063f }
            if (r7 >= r8) goto L_0x039a
            r7 = 1
            goto L_0x039b
        L_0x039a:
            r7 = 0
        L_0x039b:
            defpackage.amtf.a((boolean) r7)     // Catch:{ all -> 0x063f }
            int r7 = r5.T()     // Catch:{ all -> 0x063f }
            r14.a((defpackage.bpa) r6, (int) r7)     // Catch:{ all -> 0x063f }
            int r7 = r6.e()     // Catch:{ all -> 0x063f }
            java.lang.String r8 = r6.b()     // Catch:{ all -> 0x063f }
            int r8 = defpackage.bok.a(r1, r8)     // Catch:{ all -> 0x063f }
            if (r8 >= r7) goto L_0x041e
            java.lang.String r4 = "DowngradeHelper"
            java.lang.String r5 = "isModuleDowngradeRequired true"
            android.util.Log.e(r4, r5)     // Catch:{ all -> 0x063f }
            if (r39 == 0) goto L_0x0418
            bks r4 = r13.p     // Catch:{ all -> 0x063f }
            if (r4 != 0) goto L_0x03c1
            goto L_0x03c9
        L_0x03c1:
            bks r4 = r13.p     // Catch:{ all -> 0x063f }
            r4.stopWatching()     // Catch:{ all -> 0x063f }
            r4 = 0
            r13.p = r4     // Catch:{ all -> 0x063f }
        L_0x03c9:
            java.io.File r4 = r13.b     // Catch:{ all -> 0x063f }
            java.lang.String r5 = "current_config.fb"
            java.io.File r4 = defpackage.bjx.a(r4, r5)     // Catch:{ all -> 0x063f }
            java.io.File r5 = r13.b     // Catch:{ all -> 0x063f }
            java.lang.String r6 = "downgrade_from_config.fb"
            java.io.File r5 = defpackage.bjx.a(r5, r6)     // Catch:{ all -> 0x063f }
            boolean r6 = r4.renameTo(r5)     // Catch:{ all -> 0x063f }
            if (r6 == 0) goto L_0x03e7
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x063f }
            r5.setLastModified(r6)     // Catch:{ all -> 0x063f }
            goto L_0x03ea
        L_0x03e7:
            r4.delete()     // Catch:{ all -> 0x063f }
        L_0x03ea:
            java.util.List r24 = java.util.Collections.emptyList()     // Catch:{ all -> 0x063f }
            java.util.List r25 = java.util.Collections.emptyList()     // Catch:{ all -> 0x063f }
            r23 = 1024(0x400, float:1.435E-42)
            brl r26 = defpackage.brl.v     // Catch:{ all -> 0x063f }
            java.lang.String r27 = ""
            java.util.List r28 = java.util.Collections.emptyList()     // Catch:{ all -> 0x063f }
            java.util.List r29 = java.util.Collections.emptyList()     // Catch:{ all -> 0x063f }
            java.util.List r30 = java.util.Collections.emptyList()     // Catch:{ all -> 0x063f }
            java.lang.String r31 = ""
            java.util.List r32 = java.util.Collections.emptyList()     // Catch:{ all -> 0x063f }
            boz r4 = defpackage.bog.a(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x063f }
            r13.a((defpackage.boz) r4)     // Catch:{ all -> 0x063f }
            r13.a((defpackage.boz) r1, (int) r15)     // Catch:{ all -> 0x063f }
            r33.p()     // Catch:{ all -> 0x063f }
            goto L_0x043c
        L_0x0418:
            long r4 = r13.g     // Catch:{ all -> 0x063f }
            r13.a((long) r4)     // Catch:{ all -> 0x063f }
            goto L_0x043c
        L_0x041e:
            int r9 = r9 + 1
            goto L_0x0385
        L_0x0422:
            java.lang.String r4 = "DowngradeHelper"
            java.lang.String r5 = "isModuleDowngradeRequired false"
            android.util.Log.e(r4, r5)     // Catch:{ all -> 0x063f }
            goto L_0x043c
        L_0x042a:
            if (r39 != 0) goto L_0x0432
            long r4 = r13.g     // Catch:{ all -> 0x063f }
            r13.a((long) r4)     // Catch:{ all -> 0x063f }
            goto L_0x043c
        L_0x0432:
            r13.a((defpackage.boz) r1, (int) r15)     // Catch:{ all -> 0x063f }
            r33.p()     // Catch:{ all -> 0x063f }
            goto L_0x043c
        L_0x0439:
            r33.p()     // Catch:{ all -> 0x063f }
        L_0x043c:
            r13.j = r1     // Catch:{ all -> 0x063f }
            r13.k = r0     // Catch:{ all -> 0x063f }
            r4 = r36
            r13.l = r4     // Catch:{ all -> 0x063f }
            java.io.FileInputStream r0 = r13.f     // Catch:{ all -> 0x063f }
            defpackage.bma.a((java.io.Closeable) r0)     // Catch:{ all -> 0x063f }
            r4 = 0
            r13.f = r4     // Catch:{ all -> 0x063f }
            if (r39 == 0) goto L_0x062b
            r4 = 0
            java.io.Closeable r5 = r13.b((boolean) r4)     // Catch:{ IOException -> 0x0625, all -> 0x0620 }
            aucd r0 = r33.n()     // Catch:{ all -> 0x060d }
            aucj r4 = r0.b     // Catch:{ all -> 0x060d }
            bno r4 = (defpackage.bno) r4     // Catch:{ all -> 0x060d }
            int r4 = r4.c     // Catch:{ all -> 0x060d }
            r6 = 1
            int r4 = r4 + r6
            boolean r6 = r0.c     // Catch:{ all -> 0x060d }
            if (r6 != 0) goto L_0x0464
            goto L_0x046a
        L_0x0464:
            r0.c()     // Catch:{ all -> 0x060d }
            r6 = 0
            r0.c = r6     // Catch:{ all -> 0x060d }
        L_0x046a:
            aucj r6 = r0.b     // Catch:{ all -> 0x060d }
            bno r6 = (defpackage.bno) r6     // Catch:{ all -> 0x060d }
            bno r7 = defpackage.bno.e     // Catch:{ all -> 0x060d }
            int r7 = r6.a     // Catch:{ all -> 0x060d }
            r8 = 2
            r7 = r7 | r8
            r6.a = r7     // Catch:{ all -> 0x060d }
            r6.c = r4     // Catch:{ all -> 0x060d }
            boolean r0 = r13.a((defpackage.aucd) r0)     // Catch:{ all -> 0x060d }
            if (r0 == 0) goto L_0x058b
            boolean r0 = r33.b()     // Catch:{ all -> 0x0584 }
            if (r0 != 0) goto L_0x058b
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0584 }
            java.io.File r0 = r13.b     // Catch:{ all -> 0x0584 }
            java.lang.String r7 = "pending_config.fb"
            r6.<init>(r0, r7)     // Catch:{ all -> 0x0584 }
            java.io.File r7 = r33.g()     // Catch:{ all -> 0x0584 }
            r0 = 0
            r9 = 0
        L_0x0493:
            if (r9 >= r8) goto L_0x050e
            int r9 = r9 + 1
            boz r0 = r13.j     // Catch:{ all -> 0x0584 }
            java.nio.ByteBuffer r0 = r0.d     // Catch:{ all -> 0x0584 }
            java.nio.ByteBuffer r0 = r0.duplicate()     // Catch:{ all -> 0x0584 }
            bkp r10 = new bkp     // Catch:{ all -> 0x0584 }
            r10.<init>()     // Catch:{ all -> 0x0584 }
            r11 = 1
            r12 = 1
            r35 = r0
            r36 = r6
            r37 = r7
            r38 = r10
            r39 = r11
            r40 = r12
            java.io.FileInputStream r11 = defpackage.bkq.a(r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0584 }
            r35 = r9
            long r8 = r10.a     // Catch:{ all -> 0x0584 }
            r13.g = r8     // Catch:{ all -> 0x0584 }
            if (r11 == 0) goto L_0x04e5
            r36 = r5
            r37 = r6
            r5 = 0
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x04eb
            boz r0 = defpackage.bkq.c(r11)     // Catch:{ IOException -> 0x04f5, InvalidConfigException -> 0x04f3 }
            java.nio.ByteBuffer r8 = r0.d     // Catch:{ IOException -> 0x04f5, InvalidConfigException -> 0x04f3 }
            boz r9 = r13.j     // Catch:{ IOException -> 0x04f5, InvalidConfigException -> 0x04f3 }
            java.nio.ByteBuffer r9 = r9.d     // Catch:{ IOException -> 0x04f5, InvalidConfigException -> 0x04f3 }
            boolean r8 = r8.equals(r9)     // Catch:{ IOException -> 0x04f5, InvalidConfigException -> 0x04f3 }
            if (r8 == 0) goto L_0x04dd
            r13.j = r0     // Catch:{ IOException -> 0x04f5, InvalidConfigException -> 0x04f3 }
            r13.f = r11     // Catch:{ IOException -> 0x04f5, InvalidConfigException -> 0x04f3 }
            goto L_0x0514
        L_0x04dd:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x04f5, InvalidConfigException -> 0x04f3 }
            java.lang.String r8 = "mapped file doesn't match original buffer"
            r0.<init>(r8)     // Catch:{ IOException -> 0x04f5, InvalidConfigException -> 0x04f3 }
            throw r0     // Catch:{ IOException -> 0x04f5, InvalidConfigException -> 0x04f3 }
        L_0x04e5:
            r36 = r5
            r37 = r6
            r5 = 0
        L_0x04eb:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x04f5, InvalidConfigException -> 0x04f3 }
            java.lang.String r8 = "write failed"
            r0.<init>(r8)     // Catch:{ IOException -> 0x04f5, InvalidConfigException -> 0x04f3 }
            throw r0     // Catch:{ IOException -> 0x04f5, InvalidConfigException -> 0x04f3 }
        L_0x04f3:
            r0 = move-exception
            goto L_0x04f6
        L_0x04f5:
            r0 = move-exception
        L_0x04f6:
            java.lang.String r8 = "ChimeraCfgMgr"
            java.lang.String r9 = "Failed to write/verify config"
            android.util.Log.e(r8, r9, r0)     // Catch:{ all -> 0x0582 }
            r13.g = r5     // Catch:{ all -> 0x0582 }
            r7.delete()     // Catch:{ all -> 0x0582 }
            defpackage.bma.a((java.io.Closeable) r11)     // Catch:{ all -> 0x0582 }
            r9 = r35
            r5 = r36
            r6 = r37
            r0 = 1
            r8 = 2
            goto L_0x0493
        L_0x050e:
            r36 = r5
            if (r0 == 0) goto L_0x0514
            goto L_0x058d
        L_0x0514:
            r5 = 1
            r13.d = r5     // Catch:{ all -> 0x0582 }
            r5 = 2
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ all -> 0x0582 }
            java.lang.String r5 = "current_config.pb"
            r6 = 0
            r0[r6] = r5     // Catch:{ all -> 0x0582 }
            java.lang.String r5 = "current_features.pb"
            r6 = 1
            r0[r6] = r5     // Catch:{ all -> 0x0582 }
            r9 = 0
        L_0x0525:
            r5 = 2
            if (r9 >= r5) goto L_0x0537
            r5 = r0[r9]     // Catch:{ all -> 0x0582 }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0582 }
            java.io.File r7 = r13.b     // Catch:{ all -> 0x0582 }
            r6.<init>(r7, r5)     // Catch:{ all -> 0x0582 }
            r6.delete()     // Catch:{ all -> 0x0582 }
            int r9 = r9 + 1
            goto L_0x0525
        L_0x0537:
            boolean r0 = defpackage.aekv.a()     // Catch:{ all -> 0x0582 }
            if (r0 == 0) goto L_0x0580
            android.content.Context r0 = r13.a     // Catch:{ all -> 0x0582 }
            boolean r0 = defpackage.aekv.b(r0)     // Catch:{ all -> 0x0582 }
            if (r0 == 0) goto L_0x0580
            android.content.Context r0 = r13.a     // Catch:{ all -> 0x0582 }
            android.content.Context r0 = defpackage.blb.a(r0)     // Catch:{ all -> 0x0582 }
            java.io.File r0 = defpackage.bkq.a((android.content.Context) r0)     // Catch:{ all -> 0x0582 }
            r5 = 6
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ all -> 0x0582 }
            java.lang.String r7 = "current_config.pb"
            r8 = 0
            r6[r8] = r7     // Catch:{ all -> 0x0582 }
            java.lang.String r7 = "current_features.pb"
            r8 = 1
            r6[r8] = r7     // Catch:{ all -> 0x0582 }
            java.lang.String r7 = "current_config.fb"
            r8 = 2
            r6[r8] = r7     // Catch:{ all -> 0x0582 }
            java.lang.String r7 = "pending_config.fb"
            r6[r20] = r7     // Catch:{ all -> 0x0582 }
            r7 = 4
            java.lang.String r8 = "current_modules_init.pb"
            r6[r7] = r8     // Catch:{ all -> 0x0582 }
            java.lang.String r7 = "pending_modules_init.pb"
            r6[r17] = r7     // Catch:{ all -> 0x0582 }
            r9 = 0
        L_0x056f:
            if (r9 >= r5) goto L_0x057e
            r7 = r6[r9]     // Catch:{ all -> 0x0582 }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x0582 }
            r8.<init>(r0, r7)     // Catch:{ all -> 0x0582 }
            r8.delete()     // Catch:{ all -> 0x0582 }
            int r9 = r9 + 1
            goto L_0x056f
        L_0x057e:
            r9 = 1
            goto L_0x058e
        L_0x0580:
            r9 = 1
            goto L_0x058e
        L_0x0582:
            r0 = move-exception
            goto L_0x0587
        L_0x0584:
            r0 = move-exception
            r36 = r5
        L_0x0587:
            r1 = r0
            r3 = 1
            goto L_0x0612
        L_0x058b:
            r36 = r5
        L_0x058d:
            r9 = 0
        L_0x058e:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x060b }
            java.lang.String r5 = "com.google.android.chimera.MODULE_CONFIGURATION_CHANGED"
            r0.<init>(r5)     // Catch:{ all -> 0x060b }
            java.lang.String r5 = "last_modified_time"
            long r6 = r13.g     // Catch:{ all -> 0x060b }
            r0.putExtra(r5, r6)     // Catch:{ all -> 0x060b }
            android.content.Context r5 = r13.a     // Catch:{ all -> 0x060b }
            r5.sendBroadcast(r0)     // Catch:{ all -> 0x060b }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x060b }
            r6 = 26
            if (r5 < r6) goto L_0x05bf
            android.content.Context r5 = r13.a     // Catch:{ all -> 0x0582 }
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()     // Catch:{ all -> 0x0582 }
            int r5 = r5.targetSdkVersion     // Catch:{ all -> 0x0582 }
            if (r5 >= r6) goto L_0x05b2
            goto L_0x05bf
        L_0x05b2:
            android.content.Context r5 = r13.a     // Catch:{ all -> 0x0582 }
            java.lang.String r6 = r5.getPackageName()     // Catch:{ all -> 0x0582 }
            android.content.Intent r0 = r0.setPackage(r6)     // Catch:{ all -> 0x0582 }
            r5.sendBroadcast(r0)     // Catch:{ all -> 0x0582 }
        L_0x05bf:
            java.util.Map r0 = a((defpackage.boz) r14, (defpackage.boz) r1)     // Catch:{ all -> 0x060b }
            boolean r5 = a((java.util.Map) r0)     // Catch:{ all -> 0x060b }
            if (r3 == 0) goto L_0x05d6
            if (r5 != 0) goto L_0x05d3
            java.util.Set r5 = r0.keySet()     // Catch:{ all -> 0x0582 }
            r3.a((defpackage.boz) r1, (java.util.Set) r5)     // Catch:{ all -> 0x0582 }
            goto L_0x05d6
        L_0x05d3:
            r3.a((defpackage.boz) r1)     // Catch:{ all -> 0x0582 }
        L_0x05d6:
            if (r14 == 0) goto L_0x05da
            r1 = 1
            goto L_0x05db
        L_0x05da:
            r1 = 0
        L_0x05db:
            r3 = 1
            r13.a(r0, r4, r3, r1)     // Catch:{ all -> 0x0609 }
            if (r9 != 0) goto L_0x05ec
            android.content.Context r0 = r13.a     // Catch:{ all -> 0x0609 }
            java.lang.String r1 = "main"
            r4 = 32
            defpackage.bla.a(r0, r4, r1)     // Catch:{ all -> 0x0609 }
            goto L_0x0600
        L_0x05ec:
            android.content.Context r0 = r13.a     // Catch:{ all -> 0x0609 }
            blu r0 = defpackage.blu.a((android.content.Context) r0)     // Catch:{ all -> 0x0609 }
            r0.g()     // Catch:{ all -> 0x0609 }
            android.content.Context r0 = r13.a     // Catch:{ all -> 0x0609 }
            java.lang.String r1 = defpackage.bmy.a((java.util.List) r18)     // Catch:{ all -> 0x0609 }
            r4 = 47
            defpackage.bla.a(r0, r4, r1)     // Catch:{ all -> 0x0609 }
        L_0x0600:
            if (r36 == 0) goto L_0x0605
            r36.close()     // Catch:{ IOException -> 0x061e, all -> 0x0620 }
        L_0x0605:
            r1 = 0
            r13.n = r1     // Catch:{ all -> 0x063f }
            goto L_0x062f
        L_0x0609:
            r0 = move-exception
            goto L_0x0611
        L_0x060b:
            r0 = move-exception
            goto L_0x0610
        L_0x060d:
            r0 = move-exception
            r36 = r5
        L_0x0610:
            r3 = 1
        L_0x0611:
            r1 = r0
        L_0x0612:
            if (r36 == 0) goto L_0x061d
            r36.close()     // Catch:{ all -> 0x0618 }
            goto L_0x061d
        L_0x0618:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r4)     // Catch:{ IOException -> 0x061e, all -> 0x0620 }
        L_0x061d:
            throw r1     // Catch:{ IOException -> 0x061e, all -> 0x0620 }
        L_0x061e:
            r0 = move-exception
            goto L_0x0627
        L_0x0620:
            r0 = move-exception
            r1 = 0
            r13.n = r1     // Catch:{ all -> 0x063f }
            throw r0     // Catch:{ all -> 0x063f }
        L_0x0625:
            r0 = move-exception
            r3 = 1
        L_0x0627:
            r4 = 0
            r13.n = r4     // Catch:{ all -> 0x063f }
            goto L_0x062f
        L_0x062b:
            r3 = 1
            r33.j()     // Catch:{ all -> 0x063f }
        L_0x062f:
            boz r0 = r13.j     // Catch:{ all -> 0x063f }
            r13.a((defpackage.boz) r0)     // Catch:{ all -> 0x063f }
            monitor-exit(r2)     // Catch:{ all -> 0x063f }
            r9 = 1
            goto L_0x06b1
        L_0x0637:
            com.google.android.chimera.config.InvalidConfigException r0 = new com.google.android.chimera.config.InvalidConfigException     // Catch:{ all -> 0x063f }
            java.lang.String r1 = "Config changed while recomputing"
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x063f }
            throw r0     // Catch:{ all -> 0x063f }
        L_0x063f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x063f }
            throw r0
        L_0x0642:
            r0 = move-exception
            r4 = 0
            java.lang.String r1 = java.lang.String.valueOf(r35)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = r2 + 28
            int r2 = r2 + r3
            r5.<init>(r2)
            java.lang.String r2 = "Invalid module set config "
            r5.append(r2)
            r5.append(r1)
            java.lang.String r1 = ": "
            r5.append(r1)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r1 = "ChimeraCfgMgr"
            android.util.Log.i(r1, r0)
            r9 = 0
            goto L_0x06b1
        L_0x067f:
            com.google.android.chimera.config.InvalidConfigException r0 = new com.google.android.chimera.config.InvalidConfigException     // Catch:{ all -> 0x0687 }
            java.lang.String r2 = "Config changed while recomputing"
            r0.<init>((java.lang.String) r2)     // Catch:{ all -> 0x0687 }
            throw r0     // Catch:{ all -> 0x0687 }
        L_0x0687:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0687 }
            throw r0
        L_0x068a:
            r0 = move-exception
        L_0x068b:
            r4 = 0
            java.lang.String r0 = java.lang.String.valueOf(r35)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 41
            r2.<init>(r1)
            java.lang.String r1 = "Rejecting module set due to missing APK: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "ChimeraCfgMgr"
            android.util.Log.w(r1, r0)
            r9 = 0
        L_0x06b1:
            return r9
        L_0x06b2:
            r1 = 0
            throw r1
        L_0x06b5:
            com.google.android.chimera.config.InvalidConfigException r0 = new com.google.android.chimera.config.InvalidConfigException
            java.lang.String r1 = "Not migrated with user locked"
            r0.<init>((java.lang.String) r1)
            goto L_0x06be
        L_0x06bd:
            throw r0
        L_0x06be:
            goto L_0x06bd
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkv.a(boz, bkt, java.util.Set, java.lang.String, java.lang.String, boolean, int, java.util.Map):boolean");
    }
}
