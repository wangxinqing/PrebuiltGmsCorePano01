package com.google.android.gms.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.format.DateUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.chimera.Service;
import com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmChimeraService extends Service {
    public static volatile GcmChimeraService a;
    public static Semaphore b = new Semaphore(0);
    private static final Collection k = amyh.a(c());
    HeartbeatChimeraAlarm c;
    public nva d;
    public nut e;
    nsm f;
    final aoru g = jfm.b(10);
    public ntt h;
    private nsj i;
    private nrj j;

    public static void a(String str, Object... objArr) {
        if (c() > 0) {
            int i2 = -2;
            if (!(a == null || a.d == null)) {
                i2 = a.d.h();
            }
            synchronized (k) {
                k.add(new nrz(i2, str, objArr));
            }
        }
    }

    public static amzy b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        amzt amzt = new amzt();
        synchronized (k) {
            for (nrz nrz : k) {
                String format = simpleDateFormat.format(Long.valueOf(nrz.a));
                int i2 = nrz.b;
                String format2 = String.format(nrz.c, nrz.d);
                StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 18 + String.valueOf(format2).length());
                sb.append(format);
                sb.append(" net=");
                sb.append(i2);
                sb.append(": ");
                sb.append(format2);
                amzt.c(sb.toString());
            }
        }
        return amzt.a();
    }

    private static int c() {
        return (int) axkk.a.a().a();
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        TreeMap treeMap;
        TreeMap treeMap2;
        if (!axlc.e() || nqw.c()) {
            a(printWriter);
            amzy b2 = b();
            int size = b2.size();
            for (int i2 = 0; i2 < size; i2++) {
                printWriter.println((String) b2.get(i2));
            }
            nud nud = this.j.h;
            if (nud.a) {
                nua nua = nud.c;
                printWriter.println("\nApps supporting client queue:");
                synchronized (nua) {
                    treeMap = new TreeMap(nua.b);
                    treeMap2 = new TreeMap(nua.c);
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    printWriter.print(entry.getKey());
                    printWriter.print(" v");
                    printWriter.println(entry.getValue());
                }
                printWriter.println("\nHigh priority quota usage:");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm", Locale.US);
                for (Map.Entry entry2 : treeMap2.entrySet()) {
                    ntz ntz = (ntz) entry2.getValue();
                    printWriter.printf("%s used %d since %s\n", new Object[]{(ntx) entry2.getKey(), Integer.valueOf(ntz.c), simpleDateFormat.format(Long.valueOf(ntz.b))});
                }
                nud.d.a(printWriter);
            }
            printWriter.println("For scheduler stats see SchedulerService dump.");
            return;
        }
        printWriter.println("Not dumping stats for secondary user GcmService");
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        nrr a2 = nrr.a();
        if (nqw.c()) {
            this.f = a2.b;
            this.d = a2.d();
            iva.a(nqw.c());
            this.c = a2.e;
            this.j = a2.f();
            this.e = a2.g();
            a = this;
            nsj nsj = new nsj(this.c, this.d, this.j, this);
            this.i = nsj;
            nva nva = nsj.d;
            nva.n = nva.a(axkw.a.a().b());
            nva.o = nva.a(axkw.a.a().a());
            nva.f();
            NetworkInfo activeNetworkInfo = nva.b.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    nva.p = SystemClock.elapsedRealtime();
                }
                nva.k = true;
                nva.a(activeNetworkInfo.getState(), activeNetworkInfo.getType());
            } else {
                nva.k = false;
                nva.a(NetworkInfo.State.DISCONNECTED, -1);
            }
            if ((axlc.u() || axlc.n() || axlc.m()) && jkr.b()) {
                nva.a();
            }
            nuy nuy = nva.e;
            nuy.a(false);
            if (nuy.b()) {
                nuy.a(activeNetworkInfo, false);
            }
            BroadcastReceiver broadcastReceiver = nsj.e.m;
            if (broadcastReceiver != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_ADDED");
                intentFilter.addAction("android.intent.action.USER_REMOVED");
                intentFilter.addAction("android.intent.action.USER_STARTING");
                intentFilter.addAction("android.intent.action.USER_STOPPED");
                intentFilter.addAction("android.intent.action.USER_STOPPING");
                intentFilter.addAction("android.intent.action.USER_SWITCHED");
                nsj.b.registerReceiver(broadcastReceiver, intentFilter);
            }
            IntentFilter intentFilter2 = new IntentFilter("android.provider.Telephony.SECRET_CODE");
            intentFilter2.addDataScheme("android_secret_code");
            intentFilter2.addDataAuthority("426", (String) null);
            nsj.b.registerReceiver(nsj.a, intentFilter2);
            if (axlf.e() > 0) {
                IntentFilter intentFilter3 = new IntentFilter();
                if (!axlf.a.a().q()) {
                    intentFilter3.addAction("android.intent.action.USER_PRESENT");
                    intentFilter3.addAction("android.intent.action.SCREEN_OFF");
                } else {
                    intentFilter3.addAction("com.google.android.intent.action.MCS_HEARTBEAT");
                    intentFilter3.addAction("com.google.android.gms.gcm.ACTION_HEARTBEAT_NOW");
                }
                nsj.b.registerReceiver(nsj.c, intentFilter3);
            }
            nsj.b.registerReceiver(nsj.c, new IntentFilter("com.google.android.gms.gcm.HEARTBEAT_ALARM"), "com.google.android.gms.permission.INTERNAL_BROADCAST", (Handler) null);
            IntentFilter intentFilter4 = new IntentFilter();
            intentFilter4.addAction("android.intent.action.AIRPLANE_MODE");
            intentFilter4.addAction("com.google.android.intent.action.GCM_RECONNECT");
            if (jkr.c()) {
                intentFilter4.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            nsj.b.registerReceiver(nsj.d.d, intentFilter4);
            a();
            b.release();
        }
    }

    public final void onDestroy() {
        BroadcastReceiver broadcastReceiver;
        super.onDestroy();
        if (!axlc.e() || nqw.c()) {
            nrr.a().c().b();
            a = null;
            nsj nsj = this.i;
            nva nva = nsj.d;
            if (nva != null) {
                nsj.b.unregisterReceiver(nva.d);
                nva nva2 = nsj.d;
                nva2.e.b.b();
                if (nva2.s.b()) {
                    nva2.s.a();
                }
            }
            HeartbeatChimeraAlarm heartbeatChimeraAlarm = nsj.c;
            if (heartbeatChimeraAlarm != null) {
                nsj.b.unregisterReceiver(heartbeatChimeraAlarm);
                nsj.c.e.b();
                nsj.c.d.a();
            }
            nrj nrj = nsj.e;
            if (!(nrj == null || (broadcastReceiver = nrj.m) == null)) {
                nsj.b.unregisterReceiver(broadcastReceiver);
            }
            nsj.b.unregisterReceiver(nsj.a);
            nut nut = this.e;
            if (nut != null) {
                nut.a(15);
            }
            aoru aoru = this.g;
            if (aoru != null) {
                aoru.shutdownNow();
            }
        }
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!nqw.c()) {
            Log.e("GCM", "Unexpected GcmService started as secondary user !");
            stopSelf(i3);
            return 2;
        } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(str) || "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED".equals(str)) {
            if (!jkr.c()) {
                this.d.d.onReceive(this, intent);
            }
            return 1;
        } else {
            this.g.execute(new nry(this, intent));
            return 1;
        }
    }

    public final synchronized void a() {
        this.e.i().a(axlc.r());
        this.e.i().a((int) axlc.s());
        this.e.a((Context) this);
        if (((int) axlc.i()) > 0) {
            this.d.b();
        }
    }

    public final void a(PrintWriter printWriter) {
        if (aekv.a(this)) {
            printWriter.println("Direct boot mode (DeviceID not available");
        } else {
            String valueOf = String.valueOf(this.f.b());
            printWriter.println(valueOf.length() == 0 ? new String("DeviceID: ") : "DeviceID: ".concat(valueOf));
        }
        if (this.e.i().a() == -1) {
            printWriter.println("Disabled");
            return;
        }
        if (this.e.b()) {
            printWriter.println(this.e.toString());
            HeartbeatChimeraAlarm heartbeatChimeraAlarm = this.c;
            if (heartbeatChimeraAlarm.b.g()) {
                String valueOf2 = String.valueOf(heartbeatChimeraAlarm.e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 22);
                sb.append("Heartbeat waiting ack ");
                sb.append(valueOf2);
                printWriter.println(sb.toString());
            } else {
                String valueOf3 = String.valueOf(heartbeatChimeraAlarm.e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 11);
                sb2.append("Heartbeat: ");
                sb2.append(valueOf3);
                printWriter.println(sb2.toString());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = heartbeatChimeraAlarm.f;
            if (j2 > 0) {
                String formatElapsedTime = DateUtils.formatElapsedTime((elapsedRealtime - j2) / 1000);
                StringBuilder sb3 = new StringBuilder(String.valueOf(formatElapsedTime).length() + 36);
                sb3.append("Last heartbeat reset connection ");
                sb3.append(formatElapsedTime);
                sb3.append(" ago");
                printWriter.println(sb3.toString());
            }
            long j3 = heartbeatChimeraAlarm.k;
            if (j3 > 0) {
                StringBuilder sb4 = new StringBuilder(31);
                sb4.append("Last ping: ");
                sb4.append(j3);
                printWriter.println(sb4.toString());
            }
            SparseArray clone = heartbeatChimeraAlarm.d.a.clone();
            for (int i2 = 0; i2 < clone.size(); i2++) {
                nun nun = (nun) clone.valueAt(i2);
                boolean a2 = HeartbeatChimeraAlarm.a(clone.keyAt(i2));
                int i3 = nun.c;
                StringBuilder sb5 = new StringBuilder(42);
                sb5.append("Adaptive Heartbeat type ");
                sb5.append(i3);
                sb5.append(": ");
                sb5.append(a2);
                printWriter.println(sb5.toString());
                int i4 = nun.d;
                StringBuilder sb6 = new StringBuilder(29);
                sb6.append("connectionsLimit: ");
                sb6.append(i4);
                printWriter.println(sb6.toString());
                printWriter.println();
                printWriter.println("All stored connections: ");
                int i5 = 0;
                while (true) {
                    ou ouVar = nun.a;
                    if (i5 >= ouVar.h) {
                        break;
                    }
                    printWriter.println(ouVar.c(i5));
                    i5++;
                }
                printWriter.println();
            }
            printWriter.println();
            nul nul = heartbeatChimeraAlarm.h;
            if (nul != null) {
                String valueOf4 = String.valueOf(nul);
                StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf4).length() + 16);
                sb7.append("Last connected: ");
                sb7.append(valueOf4);
                printWriter.println(sb7.toString());
                boolean z = heartbeatChimeraAlarm.j;
                StringBuilder sb8 = new StringBuilder(45);
                sb8.append("Seen good heartbeat in last connection? ");
                sb8.append(z);
                printWriter.println(sb8.toString());
                printWriter.println();
            }
            this.d.a(printWriter);
        } else if (this.e.a()) {
            printWriter.println("Connecting");
            printWriter.println(this.e.toString());
            this.d.a(printWriter);
        } else {
            printWriter.println("Not connected");
            this.d.a(printWriter);
        }
        printWriter.println();
    }
}
