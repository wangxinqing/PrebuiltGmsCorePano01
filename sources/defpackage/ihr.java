package defpackage;

import android.app.Application;
import android.app.usage.UsageStatsManager;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.DropBoxManager;
import android.os.Process;
import android.os.SystemClock;
import android.os.UserManager;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.google.android.gms.common.app.SignalHandler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ihr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ihr extends Application implements ComponentCallbacks {
    static final AtomicBoolean a = new AtomicBoolean(false);
    private final ihs b;
    private boolean c = false;
    private boolean d = false;
    private volatile ihh e;

    static {
        agmp agmp = agmp.a;
        if (agmp.c == 0) {
            agmp.c = SystemClock.elapsedRealtime();
            agmp.h.a = true;
        }
    }

    public ihr() {
        if (!a.getAndSet(true)) {
            int i = Build.VERSION.SDK_INT;
            try {
                Os.prctl(OsConstants.PR_SET_DUMPABLE, 1, 0, 0, 0);
            } catch (Exception e2) {
                Log.e("GmsApplication", "Failed to enable native stack dump capture", e2);
            }
            this.b = new ihs();
            return;
        }
        throw new ihq();
    }

    private final ihh a() {
        ihh ihh = this.e;
        if (ihh == null) {
            synchronized (this) {
                ihh = this.e;
                if (ihh == null) {
                    ihh = new ihh(this, super.getResources());
                    this.e = ihh;
                }
            }
        }
        return ihh;
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        HashSet hashSet;
        RandomAccessFile randomAccessFile;
        BufferedReader bufferedReader;
        String readLine;
        if (!this.c) {
            this.c = true;
            super.attachBaseContext(context);
            this.b.attachBaseContext(this);
            agvx.a((Context) this);
            iqh.a();
            if (awyd.a.a().a()) {
                qug.a(new qui());
            }
            if (awyz.a.a().a()) {
                aekv.b();
            }
            if (!aekv.b(this)) {
                hashSet = new HashSet(Arrays.asList(iks.a()));
                ikz[] a2 = heh.a();
                for (int i = 0; i < 3; i++) {
                    hashSet.add(a2[i].b);
                }
            } else {
                hashSet = null;
            }
            ikz.a((Context) this, (Set) hashSet);
            if (awyw.h()) {
                imr.a();
            }
            new ilz(this, new ism(), new ing()).a();
            int i2 = Build.VERSION.SDK_INT;
            new ihy(this).a();
            new ihj(this).a();
            int i3 = Build.VERSION.SDK_INT;
            if (!jkr.c()) {
                try {
                    UserManager.class.getMethod("get", new Class[]{Context.class}).invoke(getSystemService("user"), new Object[]{this});
                } catch (Exception e2) {
                    Log.e("GmsApplication", "Error calling UserManager.get()", e2);
                }
            }
            if (!aekv.b(this)) {
                Log.w("DirectBootExitBR", "User is in direct boot mode.");
                if (awyz.a.a().b()) {
                    registerReceiver(new ihk(), new IntentFilter("android.intent.action.BOOT_COMPLETED"));
                    if (aekv.b(this)) {
                        Process.killProcess(Process.myPid());
                    }
                }
            }
            bkv.a((Context) this);
            if (axco.a.a().a()) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Found ");
                sb.append(r3);
                sb.append(" crash report files");
                sb.toString();
                boolean z = false;
                for (File file : getDir("native_crashes", 0).listFiles()) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                        do {
                            readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                sb2.append(readLine);
                                continue;
                            }
                        } while (readLine != null);
                        bufferedReader.close();
                        String sb3 = sb2.toString();
                        DropBoxManager dropBoxManager = (DropBoxManager) getSystemService("dropbox");
                        if (dropBoxManager != null) {
                            if (dropBoxManager.isTagEnabled("system_app_crash")) {
                                dropBoxManager.addText("system_app_crash", sb3);
                                file.getCanonicalFile().delete();
                            }
                        }
                        String valueOf = String.valueOf(file.getAbsolutePath());
                        Log.w("GmsSignalHandler", valueOf.length() == 0 ? new String("Unable to write write crash report from file ") : "Unable to write write crash report from file ".concat(valueOf));
                        z = true;
                    } catch (IOException e3) {
                        Log.w("GmsSignalHandler", "Unable to process crash report(s): ", e3);
                        z = true;
                    } catch (Throwable th) {
                        apev.a(th, th);
                    }
                }
                if (!z) {
                    int c2 = (int) axco.a.a().c();
                    int b2 = (int) axco.a.a().b();
                    int d2 = (int) axco.a.a().d();
                    SignalHandler signalHandler = new SignalHandler(this);
                    try {
                        synchronized (SignalHandler.class) {
                            if (!SignalHandler.a) {
                                SignalHandler.a = jke.b(signalHandler.b, "gmscore");
                                boolean z2 = SignalHandler.a;
                                if (!z2) {
                                }
                            }
                            if (!SignalHandler.installShushSignalHandlers("", c2, b2, d2, true)) {
                                Log.w("GmsSignalHandler", "Shush SignalHandlers did not install.");
                            }
                        }
                    } catch (Throwable th2) {
                        Log.w("GmsSignalHandler", "Failed to install Shush SignalHandlers", th2);
                    }
                } else {
                    Log.e("GmsApplication", "Error reporting previously seen crashes, not installing shush signal handlers");
                }
            }
            hdh.a(ihs.b());
            int i4 = Build.VERSION.SDK_INT;
            amsv amsv = ihl.a;
            amsv amsv2 = ihm.a;
            bkn.a = amsv;
            bkn.b = amsv2;
            boolean booleanValue = ((Boolean) heg.a.c()).booleanValue();
            boolean booleanValue2 = ((Boolean) heg.b.c()).booleanValue();
            if ((booleanValue || booleanValue2) && !jlo.c().equals(jlo.e())) {
                Log.i("GmsApplication", "Staging modules and/or updating config");
                try {
                    randomAccessFile = new RandomAccessFile(new File(aekv.d(this).getCacheDir(), ".stage_update.lock"), "rw");
                    randomAccessFile.getChannel().lock();
                    if (booleanValue) {
                        Log.i("GmsApplication", "Staging modules");
                        blu a3 = blu.a((Context) this);
                        Log.i("FileApkMgr", "Extracting modules...");
                        a3.a((bpu) new bpt(), false, (bpq) null);
                        Log.i("FileApkMgr", "Extracting modules completed");
                        if (Build.VERSION.SDK_INT < 24) {
                            Log.i("FileApkMgr", "Optimizing modules...");
                            a3.a(true);
                            Log.i("FileApkMgr", "Optimizing modules completed");
                        }
                        Log.i("GmsApplication", "Staging modules completed");
                    }
                    if (booleanValue2) {
                        Log.i("GmsApplication", "Updating config");
                        hey.a(false, true);
                        Log.i("GmsApplication", "Updating config completed");
                    }
                    randomAccessFile.close();
                } catch (IOException e4) {
                    Log.w("GmsApplication", "Staging modules and/or updating config failed", e4);
                } catch (Throwable th3) {
                    apev.a(th, th3);
                }
            }
            if (jkr.i() && axal.a.a().a()) {
                iuz.a(this);
                return;
            }
            return;
        }
        return;
        throw th;
        throw th;
    }

    public final Context getApplicationContext() {
        return this;
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final String getFeatureId() {
        return "app";
    }

    public final Resources getResources() {
        return a().getResources();
    }

    public final Resources.Theme getTheme() {
        return a().getTheme();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        a().a(configuration);
        super.onConfigurationChanged(configuration);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03bf A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0065, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03cf A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0065, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03dd A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0065, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0409 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0065, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x044e A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0065, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x04ce A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0065, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x04d2 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0065, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x04f8 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0065, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x04f9 A[ADDED_TO_REGION, Catch:{ Exception | UnsatisfiedLinkError -> 0x0065, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0517 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0065, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0518 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0065, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0179 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0065, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x017a A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0065, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0183 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0065, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0184 A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0065, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ab A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0065, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ac A[Catch:{ Exception | UnsatisfiedLinkError -> 0x0065, all -> 0x056b }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01cb A[SYNTHETIC, Splitter:B:98:0x01cb] */
    public final void onCreate() {
        /*
            r15 = this;
            boolean r0 = r15.d
            if (r0 != 0) goto L_0x057a
            r0 = 1
            r15.d = r0
            super.onCreate()
            agmp r1 = defpackage.agmp.a
            boolean r2 = defpackage.agzj.a()
            if (r2 == 0) goto L_0x003a
            long r2 = r1.c
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x003a
            long r2 = r1.d
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x003a
            long r2 = android.os.SystemClock.elapsedRealtime()
            r1.d = r2
            agmo r2 = r1.h
            r2.b = r0
            agmj r2 = new agmj
            r2.<init>(r1)
            defpackage.agzj.a(r2)
            agmn r2 = new agmn
            r2.<init>(r1, r15)
            r15.registerActivityLifecycleCallbacks(r2)
        L_0x003a:
            agif r1 = defpackage.agif.a()
            defpackage.crj.a = r15     // Catch:{ all -> 0x056b }
            aedd r2 = new aedd     // Catch:{ all -> 0x056b }
            r2.<init>()     // Catch:{ all -> 0x056b }
            defpackage.jni.a = r2     // Catch:{ all -> 0x056b }
            aeda r2 = new aeda     // Catch:{ all -> 0x056b }
            r2.<init>()     // Catch:{ all -> 0x056b }
            defpackage.jhr.a = r2     // Catch:{ all -> 0x056b }
            defpackage.aeej.a((android.content.Context) r15)     // Catch:{ all -> 0x056b }
            int r2 = defpackage.jhg.d((android.content.Context) r15)     // Catch:{ all -> 0x056b }
            int r3 = defpackage.jlo.d()     // Catch:{ all -> 0x056b }
            if (r2 != r3) goto L_0x005c
            goto L_0x005f
        L_0x005c:
            defpackage.jke.b(r15)     // Catch:{ all -> 0x056b }
        L_0x005f:
            r2 = 0
            defpackage.aams.a(r15)     // Catch:{ UnsatisfiedLinkError -> 0x0067, Exception -> 0x0065 }
            r3 = 0
            goto L_0x009f
        L_0x0065:
            r3 = move-exception
            goto L_0x0068
        L_0x0067:
            r3 = move-exception
        L_0x0068:
            boolean r4 = defpackage.jke.c(r15)     // Catch:{ all -> 0x056b }
            if (r4 == 0) goto L_0x0097
            ikz r4 = defpackage.iks.d     // Catch:{ all -> 0x056b }
            java.lang.Object r4 = r4.c()     // Catch:{ all -> 0x056b }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x056b }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x056b }
            if (r4 == 0) goto L_0x0097
            java.lang.String r4 = "GmsApplication"
            java.lang.String r5 = "Unable to install secure provider, due to exception:"
            android.util.Log.w(r4, r5, r3)     // Catch:{ all -> 0x056b }
            defpackage.jke.d(r15)     // Catch:{ all -> 0x056b }
            defpackage.aams.a(r15)     // Catch:{ UnsatisfiedLinkError -> 0x008d, Exception -> 0x008b }
            r3 = 1
            goto L_0x009f
        L_0x008b:
            r4 = move-exception
            goto L_0x008e
        L_0x008d:
            r4 = move-exception
        L_0x008e:
            java.lang.String r4 = "GmsApplication"
            java.lang.String r5 = "Still unable to install secure provider, due to exception:"
            android.util.Log.w(r4, r5, r3)     // Catch:{ all -> 0x056b }
            r3 = 1
            goto L_0x009f
        L_0x0097:
            java.lang.String r4 = "GmsApplication"
            java.lang.String r5 = "Unable to install secure provider, due to exception:"
            android.util.Log.w(r4, r5, r3)     // Catch:{ all -> 0x056b }
            r3 = 0
        L_0x009f:
            boolean r4 = defpackage.axbk.c()     // Catch:{ all -> 0x056b }
            r5 = 0
            if (r4 != 0) goto L_0x00a8
            goto L_0x0173
        L_0x00a8:
            boolean r4 = defpackage.awyw.h()     // Catch:{ all -> 0x056b }
            if (r4 == 0) goto L_0x00af
            goto L_0x00b2
        L_0x00af:
            defpackage.imr.a()     // Catch:{ all -> 0x056b }
        L_0x00b2:
            inn r4 = new inn     // Catch:{ all -> 0x056b }
            r4.<init>()     // Catch:{ all -> 0x056b }
            boolean r6 = defpackage.axbk.c()     // Catch:{ all -> 0x056b }
            if (r6 == 0) goto L_0x0173
            java.lang.String r6 = "Safeboot"
            java.lang.String r7 = "Checking safeboot..."
            android.util.Log.i(r6, r7)     // Catch:{ all -> 0x056b }
            boolean r6 = defpackage.inp.b()     // Catch:{ all -> 0x056b }
            if (r6 != 0) goto L_0x00d3
            java.lang.String r4 = "Safeboot"
            java.lang.String r6 = "Not entering safeboot; wrong process."
            android.util.Log.i(r4, r6)     // Catch:{ all -> 0x056b }
            goto L_0x0173
        L_0x00d3:
            ina r6 = defpackage.inb.c()     // Catch:{ all -> 0x056b }
            r6.b = r15     // Catch:{ all -> 0x056b }
            aogr r7 = defpackage.aogr.SAFEBOOT_STARTUP     // Catch:{ all -> 0x056b }
            r6.a = r7     // Catch:{ all -> 0x056b }
            inw r7 = new inw     // Catch:{ all -> 0x056b }
            r7.<init>()     // Catch:{ all -> 0x056b }
            r6.c = r7     // Catch:{ all -> 0x056b }
            boolean r7 = defpackage.axbk.e()     // Catch:{ all -> 0x056b }
            if (r7 == 0) goto L_0x00eb
            goto L_0x0110
        L_0x00eb:
            ilw r7 = defpackage.ing.a()     // Catch:{ SQLiteException -> 0x0103 }
            ilu r8 = r7.c()     // Catch:{ all -> 0x00f9 }
            r7.close()     // Catch:{ SQLiteException -> 0x00f7 }
            goto L_0x010c
        L_0x00f7:
            r7 = move-exception
            goto L_0x0105
        L_0x00f9:
            r8 = move-exception
            r7.close()     // Catch:{ all -> 0x00fe }
            goto L_0x0102
        L_0x00fe:
            r7 = move-exception
            defpackage.apev.a((java.lang.Throwable) r8, (java.lang.Throwable) r7)     // Catch:{ SQLiteException -> 0x0103 }
        L_0x0102:
            throw r8     // Catch:{ SQLiteException -> 0x0103 }
        L_0x0103:
            r7 = move-exception
            r8 = r5
        L_0x0105:
            java.lang.String r9 = "Safeboot"
            java.lang.String r10 = "Couldn't fetch crashData"
            android.util.Log.e(r9, r10, r7)     // Catch:{ all -> 0x056b }
        L_0x010c:
            if (r8 == 0) goto L_0x0110
            r6.g = r8     // Catch:{ all -> 0x056b }
        L_0x0110:
            inb r6 = r6.a()     // Catch:{ all -> 0x056b }
            ing r7 = r4.a     // Catch:{ all -> 0x056b }
            inf r7 = r7.a((defpackage.inb) r6)     // Catch:{ all -> 0x056b }
            boolean r8 = defpackage.axbk.d()     // Catch:{ all -> 0x056b }
            if (r8 == 0) goto L_0x0132
            android.content.Context r8 = r6.b     // Catch:{ SecurityException -> 0x012a }
            java.io.File r8 = defpackage.ioi.a((android.content.Context) r8)     // Catch:{ SecurityException -> 0x012a }
            r8.delete()     // Catch:{ SecurityException -> 0x012a }
            goto L_0x0132
        L_0x012a:
            r8 = move-exception
            java.lang.String r9 = "Safeboot"
            java.lang.String r10 = "Failed to delete safeboot condition file."
            android.util.Log.w(r9, r10, r8)     // Catch:{ all -> 0x056b }
        L_0x0132:
            boolean r8 = r7.a     // Catch:{ all -> 0x056b }
            if (r8 == 0) goto L_0x0173
            java.lang.String r0 = "Safeboot"
            java.lang.String r2 = "Starting safeboot."
            android.util.Log.i(r0, r2)     // Catch:{ all -> 0x056b }
            aorr r0 = r7.b     // Catch:{ all -> 0x056b }
            awyw r2 = defpackage.awyw.a     // Catch:{ all -> 0x056b }
            awyx r2 = r2.a()     // Catch:{ all -> 0x056b }
            long r2 = r2.M()     // Catch:{ all -> 0x056b }
            long r4 = r4.b     // Catch:{ all -> 0x056b }
            long r2 = java.lang.Math.max(r2, r4)     // Catch:{ all -> 0x056b }
            java.lang.Thread r2 = defpackage.inm.a((long) r2, (defpackage.inb) r6)     // Catch:{ all -> 0x056b }
            java.lang.Thread r3 = new java.lang.Thread     // Catch:{ all -> 0x056b }
            inl r4 = new inl     // Catch:{ all -> 0x056b }
            r4.<init>(r0, r2)     // Catch:{ all -> 0x056b }
            r3.<init>(r4)     // Catch:{ all -> 0x056b }
            r3.start()     // Catch:{ all -> 0x056b }
            ihs r0 = r15.b     // Catch:{ all -> 0x056b }
            r0.setInSafeBoot()     // Catch:{ all -> 0x056b }
        L_0x0165:
            agfu r0 = defpackage.agfu.a()
            java.lang.String r2 = "GmsApplication#onCreate"
            agfe r2 = defpackage.agfe.a((java.lang.String) r2)
            r0.a((defpackage.agif) r1, (defpackage.agfe) r2)
            return
        L_0x0173:
            boolean r4 = defpackage.awyw.d()     // Catch:{ all -> 0x056b }
            if (r4 != 0) goto L_0x017a
            goto L_0x017d
        L_0x017a:
            defpackage.agvm.a(r15)     // Catch:{ all -> 0x056b }
        L_0x017d:
            boolean r4 = defpackage.awyw.h()     // Catch:{ all -> 0x056b }
            if (r4 == 0) goto L_0x0184
            goto L_0x0187
        L_0x0184:
            defpackage.imr.a()     // Catch:{ all -> 0x056b }
        L_0x0187:
            ina r4 = defpackage.inb.c()     // Catch:{ all -> 0x056b }
            r4.b = r15     // Catch:{ all -> 0x056b }
            aogr r6 = defpackage.aogr.STARTUP     // Catch:{ all -> 0x056b }
            r4.a = r6     // Catch:{ all -> 0x056b }
            inb r4 = r4.a()     // Catch:{ all -> 0x056b }
            ing r6 = new ing     // Catch:{ all -> 0x056b }
            r6.<init>()     // Catch:{ all -> 0x056b }
            r6.b(r4)     // Catch:{ all -> 0x056b }
            ikz r4 = defpackage.iks.z     // Catch:{ all -> 0x056b }
            java.lang.Object r4 = r4.c()     // Catch:{ all -> 0x056b }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x056b }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x056b }
            if (r4 != 0) goto L_0x01ac
            goto L_0x01b5
        L_0x01ac:
            ihs r4 = r15.b     // Catch:{ all -> 0x056b }
            android.content.res.Resources r6 = super.getResources()     // Catch:{ all -> 0x056b }
            r4.installLanguageAssets(r6)     // Catch:{ all -> 0x056b }
        L_0x01b5:
            axcr r4 = defpackage.axcr.a     // Catch:{ all -> 0x056b }
            axcs r4 = r4.b()     // Catch:{ all -> 0x056b }
            boolean r4 = r4.a()     // Catch:{ all -> 0x056b }
            r6 = 23
            r7 = 26
            r8 = 28
            r9 = 3
            r10 = 2
            if (r4 != 0) goto L_0x01cb
            goto L_0x039c
        L_0x01cb:
            java.util.concurrent.Executor r4 = defpackage.ihn.a     // Catch:{ Exception -> 0x0330 }
            ahhu r11 = new ahhu     // Catch:{ Exception -> 0x0330 }
            r11.<init>(r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "com.google.android.libraries.phenotype.client.PhenotypeFlag#get"
            r11.a(r10, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "androidx.work.impl.WorkDatabasePathHelper#getDatabasePath"
            r11.a(r9, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0330 }
            if (r4 == 0) goto L_0x0328
            java.lang.String r4 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0330 }
            java.util.Locale r12 = java.util.Locale.US     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = r4.toLowerCase(r12)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r12 = android.os.Build.MODEL     // Catch:{ Exception -> 0x0330 }
            java.util.Locale r13 = java.util.Locale.US     // Catch:{ Exception -> 0x0330 }
            java.lang.String r12 = r12.toLowerCase(r13)     // Catch:{ Exception -> 0x0330 }
            int r13 = r4.hashCode()
            switch(r13) {
                case -1320380160: goto L_0x0216;
                case -759499589: goto L_0x020c;
                case 3620012: goto L_0x0202;
                case 1864941562: goto L_0x01f8;
                default: goto L_0x01f7;
            }
        L_0x01f7:
            goto L_0x0220
        L_0x01f8:
            java.lang.String r13 = "samsung"
            boolean r4 = r4.equals(r13)
            if (r4 == 0) goto L_0x0220
            r4 = 0
            goto L_0x0221
        L_0x0202:
            java.lang.String r13 = "vivo"
            boolean r4 = r4.equals(r13)
            if (r4 == 0) goto L_0x0220
            r4 = 2
            goto L_0x0221
        L_0x020c:
            java.lang.String r13 = "xiaomi"
            boolean r4 = r4.equals(r13)
            if (r4 == 0) goto L_0x0220
            r4 = 3
            goto L_0x0221
        L_0x0216:
            java.lang.String r13 = "oneplus"
            boolean r4 = r4.equals(r13)
            if (r4 == 0) goto L_0x0220
            r4 = 1
            goto L_0x0221
        L_0x0220:
            r4 = -1
        L_0x0221:
            if (r4 == 0) goto L_0x0246
            if (r4 == r0) goto L_0x0240
            if (r4 == r10) goto L_0x023a
            if (r4 == r9) goto L_0x022a
            goto L_0x028d
        L_0x022a:
            java.lang.String r4 = "com.android.internal.policy.PhoneWindow#getDecorView"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "miui.content.res.ThemeResourcesSystem#checkUpdate"
            r11.b(r0, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "android.util.BoostFramework#<init>"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            goto L_0x028d
        L_0x023a:
            java.lang.String r4 = "android.content.res.VivoResources#loadThemeValues"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            goto L_0x028d
        L_0x0240:
            java.lang.String r4 = "com.android.server.am.ActivityManagerService#checkProcessExist"
            r11.b(r9, r4)     // Catch:{ Exception -> 0x0330 }
            goto L_0x028d
        L_0x0246:
            java.lang.String r4 = "android.util.GeneralUtil#isSupportedGloveModeInternal"
            r11.b(r9, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "android.graphics.Typeface#SetAppTypeFace"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "android.graphics.Typeface#setAppTypeFace"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "android.app.ApplicationPackageManager#queryIntentActivities"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "android.app.ActivityThread#parseCSCAppResource"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "android.app.ActivityThread#performLaunchActivity"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "com.samsung.android.knox.custom.ProKioskManager#getProKioskState"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "sm-g9350"
            boolean r4 = r12.equals(r4)     // Catch:{ Exception -> 0x0330 }
            if (r4 != 0) goto L_0x0272
            goto L_0x0277
        L_0x0272:
            java.lang.String r4 = "android.content.res.Resources#loadDrawable"
            r11.b(r0, r4)     // Catch:{ Exception -> 0x0330 }
        L_0x0277:
            java.lang.String r4 = "sm-j700f"
            boolean r4 = r12.equals(r4)     // Catch:{ Exception -> 0x0330 }
            if (r4 == 0) goto L_0x028d
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0330 }
            if (r4 != r6) goto L_0x028d
            java.lang.String r4 = "android.content.res.Resources#loadDrawable"
            r11.b(r9, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "android.app.ActivityThread#performLaunchActivity"
            r11.b(r0, r4)     // Catch:{ Exception -> 0x0330 }
        L_0x028d:
            java.lang.String r4 = "com.qualcomm.qti.Performance#<clinit>"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "com.android.messageformat.MessageFormat#formatNamedArgs"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            r4 = 16
            java.lang.String r12 = "com.android.internal.widget.SwipeDismissLayout#init"
            r11.b(r4, r12)     // Catch:{ Exception -> 0x0330 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "java.lang.ThreadGroup#uncaughtException"
            r11.b(r9, r4)     // Catch:{ Exception -> 0x0330 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "android.widget.VideoView#openVideo"
            r11.b(r9, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "com.google.android.gsf.UseLocationForServices#getUseLocationForServices"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "com.android.server.inputmethod.InputMethodManagerService#startInputOrWindowGainedFocus"
            r11.b(r9, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "android.support.v4.content.res.ResourcesCompat#getFont"
            r11.a(r9, r4)     // Catch:{ Exception -> 0x0330 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0330 }
            r12 = 25
            if (r4 < r12) goto L_0x02c2
            goto L_0x02c7
        L_0x02c2:
            java.lang.String r4 = "android.webkit.WebViewFactory#loadNativeLibrary"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
        L_0x02c7:
            java.lang.String r4 = "com.android.webview.chromium.WebViewChromiumFactoryProvider#startChromiumLocked"
            r11.b(r9, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "android.webkit.WebViewDelegate#addWebViewAssetPath"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "android.webkit.WebView#<init>"
            r11.b(r9, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "com.squareup.leakcanary.internal.DisplayLeakActivity$LeakListAdapter#getView"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "com.squareup.leakcanary.internal.DisplayLeakActivity#deleteAllLeaks"
            r11.b(r9, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "com.squareup.leakcanary.internal.DisplayLeakActivity#onCreateOptionsMenu"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "com.squareup.leakcanary.internal.DisplayLeakActivity#shareHeapDump"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "com.badlogic.gdx.utils.GdxNativesLoader#load"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r4 = "com.badlogic.gdx.backends.android.AndroidFragmentApplication#initializeForView"
            r11.b(r10, r4)     // Catch:{ Exception -> 0x0330 }
            boolean r4 = defpackage.mm.a()     // Catch:{ Exception -> 0x0330 }
            if (r4 == 0) goto L_0x02fb
        L_0x02fa:
            goto L_0x0311
        L_0x02fb:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0330 }
            if (r4 >= r8) goto L_0x02fa
            ahho r4 = new ahho     // Catch:{ Exception -> 0x0330 }
            amzt r12 = r11.b     // Catch:{ Exception -> 0x0330 }
            amzy r12 = r12.a()     // Catch:{ Exception -> 0x0330 }
            amzt r11 = r11.c     // Catch:{ Exception -> 0x0330 }
            amzy r11 = r11.a()     // Catch:{ Exception -> 0x0330 }
            r4.<init>(r12, r11)     // Catch:{ Exception -> 0x0330 }
            goto L_0x0324
        L_0x0311:
            ahhx r4 = new ahhx     // Catch:{ Exception -> 0x0330 }
            java.util.concurrent.Executor r12 = r11.a     // Catch:{ Exception -> 0x0330 }
            amzt r13 = r11.b     // Catch:{ Exception -> 0x0330 }
            amzy r13 = r13.a()     // Catch:{ Exception -> 0x0330 }
            amzt r11 = r11.c     // Catch:{ Exception -> 0x0330 }
            amzy r11 = r11.a()     // Catch:{ Exception -> 0x0330 }
            r4.<init>(r12, r13, r11)     // Catch:{ Exception -> 0x0330 }
        L_0x0324:
            r4.a()     // Catch:{ Exception -> 0x0330 }
            goto L_0x0338
        L_0x0328:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0330 }
            java.lang.String r11 = "Device manufacturer is null, something is horribly wrong"
            r4.<init>(r11)     // Catch:{ Exception -> 0x0330 }
            throw r4     // Catch:{ Exception -> 0x0330 }
        L_0x0330:
            r4 = move-exception
            java.lang.String r4 = "GmsApplication"
            java.lang.String r11 = "Failed to install StrictMode whitelists"
            android.util.Log.e(r4, r11)     // Catch:{ all -> 0x056b }
        L_0x0338:
            android.os.StrictMode$ThreadPolicy$Builder r4 = new android.os.StrictMode$ThreadPolicy$Builder     // Catch:{ all -> 0x056b }
            r4.<init>()     // Catch:{ all -> 0x056b }
            android.os.StrictMode$ThreadPolicy$Builder r4 = r4.penaltyDropBox()     // Catch:{ all -> 0x056b }
            android.os.StrictMode$ThreadPolicy r4 = r4.build()     // Catch:{ all -> 0x056b }
            android.os.StrictMode$ThreadPolicy r4 = defpackage.ahhr.b(r4)     // Catch:{ all -> 0x056b }
            defpackage.ahhr.a(r4)     // Catch:{ all -> 0x056b }
            android.os.StrictMode$VmPolicy$Builder r4 = new android.os.StrictMode$VmPolicy$Builder     // Catch:{ all -> 0x056b }
            r4.<init>()     // Catch:{ all -> 0x056b }
            android.os.StrictMode$VmPolicy$Builder r4 = r4.penaltyDropBox()     // Catch:{ all -> 0x056b }
            android.os.StrictMode$VmPolicy r4 = r4.build()     // Catch:{ all -> 0x056b }
            ahhk r11 = new ahhk     // Catch:{ all -> 0x056b }
            r11.<init>()     // Catch:{ all -> 0x056b }
            defpackage.amrl.a((java.lang.Object) r11)     // Catch:{ all -> 0x056b }
            android.os.StrictMode$VmPolicy$Builder r11 = new android.os.StrictMode$VmPolicy$Builder     // Catch:{ all -> 0x056b }
            r11.<init>(r4)     // Catch:{ all -> 0x056b }
            android.os.StrictMode$VmPolicy$Builder r4 = r11.detectLeakedClosableObjects()     // Catch:{ all -> 0x056b }
            android.os.StrictMode$VmPolicy$Builder r4 = r4.detectLeakedSqlLiteObjects()     // Catch:{ all -> 0x056b }
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            r4.detectLeakedRegistrationObjects()     // Catch:{ all -> 0x056b }
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            r4.detectFileUriExposure()     // Catch:{ all -> 0x056b }
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            r4.detectActivityLeaks()     // Catch:{ all -> 0x056b }
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            if (r11 >= r7) goto L_0x0384
            goto L_0x0387
        L_0x0384:
            r4.detectContentUriWithoutPermission()     // Catch:{ all -> 0x056b }
        L_0x0387:
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            r12 = 29
            if (r11 < r12) goto L_0x0395
            r4.detectCredentialProtectedWhileLocked()     // Catch:{ all -> 0x056b }
            r4.detectImplicitDirectBoot()     // Catch:{ all -> 0x056b }
        L_0x0395:
            android.os.StrictMode$VmPolicy r4 = r4.build()     // Catch:{ all -> 0x056b }
            android.os.StrictMode.setVmPolicy(r4)     // Catch:{ all -> 0x056b }
        L_0x039c:
            jda r4 = defpackage.jda.a()     // Catch:{ all -> 0x056b }
            boolean r4 = defpackage.jdc.a(r4)     // Catch:{ all -> 0x056b }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x056b }
            r12 = 34
            r11.<init>(r12)     // Catch:{ all -> 0x056b }
            java.lang.String r12 = "Set StatisticalEventTracker: "
            r11.append(r12)     // Catch:{ all -> 0x056b }
            r11.append(r4)     // Catch:{ all -> 0x056b }
            r11.toString()     // Catch:{ all -> 0x056b }
            defpackage.njf.a()     // Catch:{ all -> 0x056b }
            boolean r4 = defpackage.axdm.b()     // Catch:{ all -> 0x056b }
            if (r4 == 0) goto L_0x03cf
            jcv r4 = new jcv     // Catch:{ all -> 0x056b }
            qvh r11 = defpackage.qvj.b     // Catch:{ all -> 0x056b }
            java.util.concurrent.ScheduledExecutorService r11 = r11.c(r10)     // Catch:{ all -> 0x056b }
            jcs r12 = defpackage.jcs.a()     // Catch:{ all -> 0x056b }
            r4.<init>(r11, r12)     // Catch:{ all -> 0x056b }
            goto L_0x03d0
        L_0x03cf:
            r4 = r5
        L_0x03d0:
            jdo r11 = new jdo     // Catch:{ all -> 0x056b }
            r11.<init>(r4)     // Catch:{ all -> 0x056b }
            defpackage.acrz.n = r11     // Catch:{ all -> 0x056b }
            boolean r4 = defpackage.jkr.e()     // Catch:{ all -> 0x056b }
            if (r4 == 0) goto L_0x03f6
            android.content.pm.ApplicationInfo r4 = r15.getApplicationInfo()     // Catch:{ all -> 0x056b }
            int r4 = r4.targetSdkVersion     // Catch:{ all -> 0x056b }
            if (r4 >= r7) goto L_0x03e6
            goto L_0x03f6
        L_0x03e6:
            boolean r4 = defpackage.ijw.a()     // Catch:{ all -> 0x056b }
            if (r4 == 0) goto L_0x03f6
            java.lang.String r4 = "GmsApplication"
            java.lang.String r7 = "Registering the BackgroundBroadcastReceiverSupport receiver."
            android.util.Log.i(r4, r7)     // Catch:{ all -> 0x056b }
            defpackage.ijw.a(r15)     // Catch:{ all -> 0x056b }
        L_0x03f6:
            ihi r4 = new ihi     // Catch:{ all -> 0x056b }
            r4.<init>(r15)     // Catch:{ all -> 0x056b }
            awxf r7 = defpackage.awxf.a     // Catch:{ all -> 0x056b }
            awxg r7 = r7.b()     // Catch:{ all -> 0x056b }
            boolean r7 = r7.a()     // Catch:{ all -> 0x056b }
            r11 = 6
            r12 = 4
            if (r7 != 0) goto L_0x044e
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            java.lang.String r0 = "NOT_LMP"
            boolean r2 = defpackage.jkr.b()     // Catch:{ all -> 0x056b }
            if (r2 == 0) goto L_0x0417
            java.lang.String r0 = "NOT_MNC"
            r2 = 6
            goto L_0x0418
        L_0x0417:
            r2 = 4
        L_0x0418:
            int r6 = defpackage.jlo.m()     // Catch:{ all -> 0x056b }
            if (r6 != r10) goto L_0x041f
            goto L_0x0424
        L_0x041f:
            if (r2 == r11) goto L_0x0422
            goto L_0x042d
        L_0x0422:
            if (r6 != r12) goto L_0x042d
        L_0x0424:
            hxj r2 = defpackage.hxj.a     // Catch:{ all -> 0x056b }
            android.content.Context r4 = r4.a     // Catch:{ all -> 0x056b }
            r2.a((android.content.Context) r4, (int) r10, (java.lang.String) r0)     // Catch:{ all -> 0x056b }
            goto L_0x04f2
        L_0x042d:
            android.content.Context r2 = r4.a     // Catch:{ all -> 0x056b }
            java.lang.String r4 = "notification"
            java.lang.Object r2 = r2.getSystemService(r4)     // Catch:{ all -> 0x056b }
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2     // Catch:{ all -> 0x056b }
            r4 = 10436(0x28c4, float:1.4624E-41)
            r2.cancel(r0, r4)     // Catch:{ SecurityException -> 0x0444 }
            r4 = 39789(0x9b6d, float:5.5756E-41)
            r2.cancel(r0, r4)     // Catch:{ SecurityException -> 0x0444 }
            goto L_0x04f2
        L_0x0444:
            r0 = move-exception
            java.lang.String r2 = "BuildVerifier"
            java.lang.String r4 = "Failure to cancel notifications."
            android.util.Log.w(r2, r4, r0)     // Catch:{ all -> 0x056b }
            goto L_0x04f2
        L_0x044e:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            r10 = 13
            r13 = 10
            if (r7 >= r6) goto L_0x0457
            goto L_0x0468
        L_0x0457:
            android.content.Context r6 = r4.a     // Catch:{ all -> 0x056b }
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ all -> 0x056b }
            java.lang.String r7 = "android.hardware.type.watch"
            boolean r6 = r6.hasSystemFeature(r7)     // Catch:{ all -> 0x056b }
            if (r6 == 0) goto L_0x0468
            r11 = 7
            r6 = 0
            goto L_0x04c8
        L_0x0468:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            android.content.Context r6 = r4.a     // Catch:{ all -> 0x056b }
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ all -> 0x056b }
            java.lang.String r7 = "android.software.leanback"
            boolean r6 = r6.hasSystemFeature(r7)     // Catch:{ all -> 0x056b }
            if (r6 != 0) goto L_0x04c5
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            if (r6 < r8) goto L_0x048f
            android.content.Context r6 = r4.a     // Catch:{ all -> 0x056b }
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ all -> 0x056b }
            java.lang.String r7 = "android.hardware.type.automotive"
            boolean r6 = r6.hasSystemFeature(r7)     // Catch:{ all -> 0x056b }
            if (r6 != 0) goto L_0x048b
            goto L_0x048f
        L_0x048b:
            r11 = 8
            r6 = 0
            goto L_0x04c8
        L_0x048f:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            r7 = 27
            if (r6 < r7) goto L_0x04a8
            android.content.Context r6 = r4.a     // Catch:{ all -> 0x056b }
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ all -> 0x056b }
            java.lang.String r14 = "android.hardware.ram.low"
            boolean r6 = r6.hasSystemFeature(r14)     // Catch:{ all -> 0x056b }
            if (r6 != 0) goto L_0x04a4
            goto L_0x04a8
        L_0x04a4:
            r6 = 0
            r11 = 13
            goto L_0x04c8
        L_0x04a8:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            r14 = 22
            if (r6 <= r14) goto L_0x04c2
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            if (r6 <= r7) goto L_0x04bf
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x056b }
            if (r6 > r8) goto L_0x04bc
            r11 = 12
            r6 = 1
            goto L_0x04c8
        L_0x04bc:
            r11 = 14
            goto L_0x04c0
        L_0x04bf:
        L_0x04c0:
            r6 = 1
            goto L_0x04c8
        L_0x04c2:
            r6 = 1
            r11 = 4
            goto L_0x04c8
        L_0x04c5:
            r6 = 0
            r11 = 10
        L_0x04c8:
            int r7 = defpackage.jlo.m()     // Catch:{ all -> 0x056b }
            if (r7 != r11) goto L_0x04d2
            r4.a(r0, r2, r11, r7)     // Catch:{ all -> 0x056b }
            goto L_0x04f2
        L_0x04d2:
            if (r6 == 0) goto L_0x04ef
            int r6 = r7 + -1
            if (r7 == 0) goto L_0x04ed
            if (r6 == r0) goto L_0x04e8
            if (r6 == r9) goto L_0x04e8
            r8 = 5
            if (r6 == r8) goto L_0x04e8
            if (r6 == r10) goto L_0x04e8
            if (r6 == r13) goto L_0x04e8
            r8 = 11
            if (r6 == r8) goto L_0x04e8
            goto L_0x04ef
        L_0x04e8:
            r4.a(r0, r0, r11, r7)     // Catch:{ all -> 0x056b }
            goto L_0x04f2
        L_0x04ed:
            throw r5     // Catch:{ all -> 0x056b }
        L_0x04ef:
            r4.a(r2, r2, r11, r7)     // Catch:{ all -> 0x056b }
        L_0x04f2:
            boolean r0 = defpackage.jke.c(r15)     // Catch:{ all -> 0x056b }
            if (r0 != 0) goto L_0x04f9
            goto L_0x0511
        L_0x04f9:
            if (r3 != 0) goto L_0x0511
            ikz r0 = defpackage.iks.d     // Catch:{ all -> 0x056b }
            java.lang.Object r0 = r0.c()     // Catch:{ all -> 0x056b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x056b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x056b }
            if (r0 == 0) goto L_0x0511
            ihp r0 = new ihp     // Catch:{ all -> 0x056b }
            r0.<init>(r15)     // Catch:{ all -> 0x056b }
            r0.start()     // Catch:{ all -> 0x056b }
        L_0x0511:
            boolean r0 = defpackage.jkr.b()     // Catch:{ all -> 0x056b }
            if (r0 != 0) goto L_0x0518
            goto L_0x0521
        L_0x0518:
            ixm r0 = defpackage.ixm.b     // Catch:{ all -> 0x056b }
            android.content.pm.PackageManager r2 = r15.getPackageManager()     // Catch:{ all -> 0x056b }
            r0.a((android.content.pm.PackageManager) r2)     // Catch:{ all -> 0x056b }
        L_0x0521:
            defpackage.ilv.a()     // Catch:{ all -> 0x056b }
            hew r0 = new hew     // Catch:{ all -> 0x056b }
            r0.<init>()     // Catch:{ all -> 0x056b }
            java.lang.Class<ilv> r2 = defpackage.ilv.class
            monitor-enter(r2)     // Catch:{ all -> 0x056b }
            java.util.Set r3 = defpackage.ilv.a     // Catch:{ all -> 0x0568 }
            r3.add(r0)     // Catch:{ all -> 0x0568 }
            monitor-exit(r2)     // Catch:{ all -> 0x0568 }
            ilx r0 = new ilx     // Catch:{ all -> 0x056b }
            r0.<init>()     // Catch:{ all -> 0x056b }
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch:{ all -> 0x056b }
            java.lang.String r3 = "com.google.android.gms.common.config.devicedoctor.UPDATED"
            r2.<init>(r3)     // Catch:{ all -> 0x056b }
            java.lang.String r3 = "com.google.android.gms.permission.INTERNAL_BROADCAST"
            r15.registerReceiver(r0, r2, r3, r5)     // Catch:{ all -> 0x056b }
            defpackage.ixw.a((android.app.Application) r15)     // Catch:{ all -> 0x056b }
            defpackage.ikp.a(r15)     // Catch:{ all -> 0x056b }
            boolean r0 = defpackage.axai.e()     // Catch:{ all -> 0x056b }
            if (r0 == 0) goto L_0x0165
            qvr r0 = new qvr     // Catch:{ all -> 0x056b }
            r0.<init>()     // Catch:{ all -> 0x056b }
            iho r2 = new iho     // Catch:{ all -> 0x056b }
            r2.<init>(r15)     // Catch:{ all -> 0x056b }
            axai r3 = defpackage.axai.a     // Catch:{ all -> 0x056b }
            axaj r3 = r3.a()     // Catch:{ all -> 0x056b }
            long r3 = r3.d()     // Catch:{ all -> 0x056b }
            r0.postDelayed(r2, r3)     // Catch:{ all -> 0x056b }
            goto L_0x0165
        L_0x0568:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0568 }
            throw r0     // Catch:{ all -> 0x056b }
        L_0x056b:
            r0 = move-exception
            agfu r2 = defpackage.agfu.a()
            java.lang.String r3 = "GmsApplication#onCreate"
            agfe r3 = defpackage.agfe.a((java.lang.String) r3)
            r2.a((defpackage.agif) r1, (defpackage.agfe) r3)
            throw r0
        L_0x057a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihr.onCreate():void");
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (i >= 5) {
            SQLiteDatabase.releaseMemory();
        }
    }

    public final void setTheme(int i) {
        a().setTheme(i);
    }

    public final ComponentName startService(Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return super.startService(intent);
            } catch (IllegalStateException e2) {
                Log.e("GmsApplication", "/system/etc/sysconfig/google.xml must have <allow-in-power-save package=\"com.google.android.gms\"/>.");
                try {
                    ((UsageStatsManager) getSystemService(UsageStatsManager.class)).whitelistAppTemporarily("com.google.android.gms", 60000, Process.myUserHandle());
                } catch (SecurityException e3) {
                    Log.e("GmsApplication", "Unable to re-add to doze whitelist", e3);
                }
            }
        }
        try {
            return super.startService(intent);
        } catch (IllegalStateException e4) {
            if (Build.VERSION.SDK_INT >= 26 && ((amrk.a(intent.getPackage()) || "com.google.android.gms".equals(intent.getPackage())) && awxl.b() && ((double) new Random().nextFloat()) < awxl.c())) {
                Log.e("GmsApplication", "Google Play services is unable to start a service. Exiting.", e4);
                jhg.e();
            }
            throw e4;
        }
    }

    public final void a(String str, String str2) {
        qwq a2 = qwq.a((Context) this);
        long max = Math.max(TimeUnit.HOURS.toSeconds(12), axai.a.a().i());
        long max2 = Math.max(1 + max, axai.a.a().h());
        qxf qxf = new qxf();
        qxf.i = str;
        qxf.a(max, max2);
        qxf.a(2);
        qxf.a(0, 0);
        qxf.n = true;
        qxf.b(1);
        qxf.k = str2;
        qxf.a(true);
        a2.a((qxx) qxf.b());
    }
}
