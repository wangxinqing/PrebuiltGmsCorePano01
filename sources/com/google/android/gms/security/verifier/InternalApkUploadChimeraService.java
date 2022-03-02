package com.google.android.gms.security.verifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import com.google.android.chimera.Service;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InternalApkUploadChimeraService extends Service {
    public static final int a = aazz.b(1);
    public static final int b = aazz.a(15);
    public static final int c = 86400000;
    public static final int d = 7200000;
    private static final long j = 86400000;
    private static final int k = aazz.b(20);
    protected aazv e;
    public aazk f;
    protected HandlerThread g;
    public aazu h;
    protected aazx i;
    private boolean l = false;
    private final BroadcastReceiver m = new NetworkChangeBroadcastReceiver();
    private final BroadcastReceiver n = new PackageChangeBroadcastReceiver();
    private final Object o = new Object();
    private aaal p;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class NetworkChangeBroadcastReceiver extends nla {
        public NetworkChangeBroadcastReceiver() {
            super("security");
        }

        public final void a(Context context, Intent intent) {
            InternalApkUploadChimeraService.this.e.a(context);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class PackageChangeBroadcastReceiver extends nla {
        public PackageChangeBroadcastReceiver() {
            super("security");
        }

        public final void a(Context context, Intent intent) {
            InternalApkUploadChimeraService.a(context, (long) InternalApkUploadChimeraService.b);
        }
    }

    public static void a(Context context) {
        Intent a2 = aann.a(context, InternalApkUploadChimeraService.class);
        a2.setAction("com.google.android.gms.security.verifyapps.BOOT_COMPLETE");
        context.startService(a2);
    }

    public final boolean b() {
        if (!a() || !azfy.b() || !this.e.b()) {
            return false;
        }
        return true;
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.e = new aazv((ConnectivityManager) getSystemService("connectivity"));
        this.i = new aazx();
        this.p = new aaal(this);
        HandlerThread handlerThread = new HandlerThread("apk_upload_thread");
        this.g = handlerThread;
        handlerThread.start();
        this.h = new aazu(this, this.g.getLooper());
        this.f = new aazk(this);
    }

    public final void onDestroy() {
        a(false);
        this.g.quit();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = intent != null ? intent.getAction() : "null";
        objArr[1] = Integer.valueOf(i3);
        if (!a()) {
            stopSelf(i3);
            return 2;
        } else if (!azfy.b()) {
            stopSelf(i3);
            return 2;
        } else if (!aaal.c(this)) {
            stopSelf(i3);
            return 2;
        } else {
            if (intent != null) {
                str = intent.getAction();
            } else {
                str = null;
            }
            if (str == null) {
                this.h.sendMessage(this.h.obtainMessage(1, i3, 0));
                return 1;
            }
            if (str.equals("com.google.android.gms.security.verifyapps.UPLOAD_APK")) {
                new aazt(this, intent, i3).execute(new Void[0]);
            } else if (str.equals("com.google.android.gms.security.verifyapps.PROCESS_QUEUE")) {
                Message obtainMessage = this.h.obtainMessage(0, i3, 0);
                long longExtra = intent.getLongExtra("delay", -1);
                this.h.removeMessages(0);
                if (longExtra != -1) {
                    this.h.sendMessageDelayed(obtainMessage, longExtra);
                } else {
                    this.h.sendMessage(obtainMessage);
                }
            } else if (str.equals("com.google.android.gms.security.verifyapps.BOOT_COMPLETE")) {
                this.h.sendMessage(this.h.obtainMessage(1, i3, 0));
            } else {
                Log.w("ApkUploadChimeraService", abaa.c("Unknown action: %s", str));
                this.h.sendMessage(this.h.obtainMessage(2, i3, 0));
            }
            return 1;
        }
    }

    public static void a(Context context, long j2) {
        Intent a2 = aann.a(context, InternalApkUploadChimeraService.class);
        a2.setAction("com.google.android.gms.security.verifyapps.PROCESS_QUEUE");
        if (j2 != -1) {
            a2.putExtra("delay", j2);
        }
        context.startService(a2);
    }

    public static boolean a(ApkUploadEntry apkUploadEntry) {
        long j2;
        boolean z;
        long currentTimeMillis = System.currentTimeMillis() - apkUploadEntry.f;
        int i2 = apkUploadEntry.g;
        if (i2 == 0) {
            j2 = (long) d;
        } else if (i2 == 1) {
            j2 = (long) c;
        } else {
            abaa.a("Invalid entry state for entry id=%d: %d.", Long.valueOf(apkUploadEntry.a), Integer.valueOf(apkUploadEntry.g));
            return true;
        }
        if (currentTimeMillis > j2 || apkUploadEntry.f - System.currentTimeMillis() > j) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = {Boolean.toString(z), Long.valueOf(apkUploadEntry.a), apkUploadEntry.b, Integer.valueOf(apkUploadEntry.g), Double.valueOf(aazz.a(currentTimeMillis))};
        return z;
    }

    public final int a(File file, byte[] bArr, byte[] bArr2, int i2) {
        int i3;
        aazf aazf = new aazf(this, file, bArr, bArr2, i2);
        long length = aazf.b.length();
        if (length != 0 && length <= 52428800) {
            aazf.i = (int) length;
            try {
                aazf.j = new FileInputStream(aazf.b);
                aazf.k = 0;
                aucd o2 = aazm.f.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aazm aazm = (aazm) o2.b;
                aazm.b = 0;
                aazm.a |= 1;
                aucd o3 = aazo.f.o();
                aazn aazn = aazn.c;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aazo aazo = (aazo) o3.b;
                aazn.getClass();
                aazo.c = aazn;
                int i4 = aazo.a | 4;
                aazo.a = i4;
                "".getClass();
                int i5 = i4 | 1;
                aazo.a = i5;
                aazo.b = "";
                int i6 = aazf.i;
                aazo.a = i5 | 8;
                aazo.d = (long) i6;
                aucd o4 = aazn.c.o();
                auay a2 = auay.a(aazf.c);
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                aazn aazn2 = (aazn) o4.b;
                a2.getClass();
                aazn2.a |= 1;
                aazn2.b = a2;
                aazn aazn3 = (aazn) o4.i();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aazo aazo2 = (aazo) o3.b;
                aazn3.getClass();
                aazo2.c = aazn3;
                aazo2.a |= 4;
                long a3 = jhg.a((Context) aazf.a);
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aazo aazo3 = (aazo) o3.b;
                aazo3.a |= 1024;
                aazo3.e = a3;
                if (azfv.u() && (i3 = aazf.l) != 0) {
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aazm aazm2 = (aazm) o2.b;
                    aazm2.e = i3 - 1;
                    aazm2.a |= 32;
                }
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aazm aazm3 = (aazm) o2.b;
                aazo aazo4 = (aazo) o3.i();
                aazo4.getClass();
                aazm3.c = aazo4;
                aazm3.a |= 2;
                aucd o5 = aazq.d.o();
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                aazq aazq = (aazq) o5.b;
                aazq.b = 0;
                aazq.a |= 1;
                auay a4 = auay.a(aazf.d);
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                aazq aazq2 = (aazq) o5.b;
                a4.getClass();
                aazq2.a |= 4;
                aazq2.c = a4;
                aazq aazq3 = (aazq) o5.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aazm aazm4 = (aazm) o2.b;
                aazq3.getClass();
                aazm4.d = aazq3;
                aazm4.a |= 16;
                aazf.g = ihs.b().getRequestQueue();
                aazf.g.add(new aazy("https://safebrowsing.google.com/safebrowsing/uploads/android", new aazb(aazf), new aazc(aazf), (aazm) o2.i(), aazf.i));
            } catch (IOException e2) {
                aazf.e.add(1);
            }
        } else {
            aazf.e.add(1);
        }
        try {
            long nanoTime = System.nanoTime() + (((long) k) * 1000000);
            while (true) {
                try {
                    long nanoTime2 = System.nanoTime();
                    if (nanoTime2 <= nanoTime) {
                        Integer num = (Integer) aazf.e.poll(nanoTime - nanoTime2, TimeUnit.NANOSECONDS);
                        if (num != null) {
                            int intValue = num.intValue();
                            new Object[1][0] = Integer.valueOf(intValue);
                            return intValue;
                        }
                        throw new TimeoutException();
                    }
                    throw new TimeoutException();
                } catch (InterruptedException e3) {
                }
            }
        } catch (TimeoutException e4) {
            abaa.b("Upload timed out. Canceling upload", new Object[0]);
            aazf.f = true;
            return 0;
        } finally {
            aazf.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto L_0x0016
            boolean r2 = r1.l     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x0014
            android.content.BroadcastReceiver r2 = r1.m     // Catch:{ all -> 0x0051 }
            r1.unregisterReceiver(r2)     // Catch:{ all -> 0x0051 }
            android.content.BroadcastReceiver r2 = r1.n     // Catch:{ all -> 0x0051 }
            r1.unregisterReceiver(r2)     // Catch:{ all -> 0x0051 }
            r2 = 0
            r1.l = r2     // Catch:{ all -> 0x0051 }
        L_0x0014:
            monitor-exit(r1)
            return
        L_0x0016:
            boolean r2 = r1.l     // Catch:{ all -> 0x0051 }
            if (r2 != 0) goto L_0x004f
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2.addAction(r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED"
            r2.addAction(r0)     // Catch:{ all -> 0x0051 }
            android.content.BroadcastReceiver r0 = r1.m     // Catch:{ all -> 0x0051 }
            r1.registerReceiver(r0, r2)     // Catch:{ all -> 0x0051 }
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "android.intent.action.PACKAGE_ADDED"
            r2.addAction(r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "android.intent.action.PACKAGE_REPLACED"
            r2.addAction(r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "android.intent.action.PACKAGE_REMOVED"
            r2.addAction(r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "package"
            r2.addDataScheme(r0)     // Catch:{ all -> 0x0051 }
            android.content.BroadcastReceiver r0 = r1.n     // Catch:{ all -> 0x0051 }
            r1.registerReceiver(r0, r2)     // Catch:{ all -> 0x0051 }
            r2 = 1
            r1.l = r2     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r1)
            return
        L_0x0051:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.security.verifier.InternalApkUploadChimeraService.a(boolean):void");
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return this.p.a();
    }

    public final boolean a(int i2) {
        if (!a() || !azfy.b()) {
            stopSelf(i2);
            return true;
        }
        synchronized (this.o) {
            if (this.f.a()) {
                new Object[1][0] = Integer.valueOf(i2);
                stopSelf(i2);
                return true;
            }
            new Object[1][0] = Integer.valueOf(i2);
            return false;
        }
    }

    public final boolean a(PackageInfo packageInfo, byte[] bArr) {
        if (!packageInfo.applicationInfo.sourceDir.equals(packageInfo.applicationInfo.publicSourceDir)) {
            return false;
        }
        try {
            byte[] a2 = this.i.a(packageInfo.packageName, packageInfo.lastUpdateTime, new File(packageInfo.applicationInfo.sourceDir));
            if (a2 == null) {
                return false;
            }
            boolean equals = Arrays.equals(a2, bArr);
            new Object[1][0] = Boolean.valueOf(equals);
            return equals;
        } catch (IOException e2) {
            abaa.a(e2, "exception while reading apk", new Object[0]);
            return false;
        }
    }
}
