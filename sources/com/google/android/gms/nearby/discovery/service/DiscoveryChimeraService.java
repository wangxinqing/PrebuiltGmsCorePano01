package com.google.android.gms.nearby.discovery.service;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import com.google.android.gms.nearby.discovery.fastpair.autotest.AutoTestBroadcastReceiver;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DiscoveryChimeraService extends Service implements thm, ucz {
    private arye A;
    public thl a;
    public tsm b;
    public ttf c;
    public ubv d;
    public arwg e;
    public udf f;
    public udc g;
    public tst h;
    public tsu i;
    public udb j;
    public tul k;
    public aoe l;
    public ubj m;
    private final IntentReceiver n = new IntentReceiver();
    private final GuardedIntentReceiver o = new GuardedIntentReceiver();
    private AutoTestBroadcastReceiver p;
    private arxg q;
    private Executor r = jfm.b(10);
    private final arwm s = new uba(this, "stopIfNotScheduled");
    private final arwm t = new ubb(this, "unsubscribeAndClearData");
    private final arwm u = new ubc(this, "subscribe");
    private ubj v;
    private boolean w = false;
    private final Object x = new Object();
    private Executor y;
    private arxv z;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class GuardedIntentReceiver extends nla {
        public GuardedIntentReceiver() {
            super("nearby");
        }

        public final void a(Context context, Intent intent) {
            if (tul.a(intent.getAction())) {
                DiscoveryChimeraService.this.e.c(new ubk(this, "fastPairGuardedBroadcastHandler", intent));
            }
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class IntentReceiver extends nla {
        public IntentReceiver() {
            super("nearby");
        }

        public final void a(Context context, Intent intent) {
            if (tul.a(intent.getAction())) {
                DiscoveryChimeraService.this.e.c(new ubl(this, "fastPairBroadcastHandler", intent));
            }
        }
    }

    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.nearby.discovery.service.DiscoveryService");
    }

    public static PendingIntent b(Context context) {
        return PendingIntent.getService(context, 0, a(context).setAction("com.google.android.gms.nearby.discovery:ACTION_MESSAGES_CALLBACK"), 134217728);
    }

    private final void e() {
        this.e.e(this.s);
        b();
    }

    private final void f() {
        if (!arxk.a((Context) this, tfx.a(this)) || !this.q.d()) {
            h();
        } else {
            g();
        }
    }

    private final void g() {
        this.e.c(this.u);
        i();
    }

    private final void h() {
        this.e.e(this.s);
        this.e.c(this.t);
        this.e.c(this.s);
    }

    private final void i() {
        this.e.e(this.s);
        long W = aymq.a.a().W();
        jjg jjg = tsp.a;
        this.e.a(this.s, W);
    }

    public final thl a() {
        return this.a;
    }

    public final void c() {
        jjg jjg = tsp.a;
        udb udb = this.j;
        if (aymw.B() && aymw.ab()) {
            udb.l.d();
        }
        udb.o.shutdownNow();
        AtomicReference atomicReference = new AtomicReference();
        try {
            udb.a.a((arwm) new ucs(udb, "FastPairControllerOnDestroy", atomicReference));
        } catch (InterruptedException e2) {
            anih anih = (anih) tsp.a.b();
            anih.a((Throwable) e2);
            anih.a("FastPair: OnDestroy: Fail to unregister listeners");
        }
        CountDownLatch countDownLatch = (CountDownLatch) atomicReference.get();
        if (countDownLatch != null) {
            try {
                System.currentTimeMillis();
                countDownLatch.await(aymt.b(), TimeUnit.MILLISECONDS);
                System.currentTimeMillis();
                countDownLatch.getCount();
            } catch (InterruptedException e3) {
                anih anih2 = (anih) tsp.a.b();
                anih2.a((Throwable) e3);
                anih2.a("FastPair: OnDestroy: Interrupted when countdown");
            }
        }
        if (!aymq.h()) {
            this.e.c(new uaz(this, "ReadyForDestroy"));
        } else if (aymq.i()) {
            this.e.c(new uax(this, "DestroyEventLoop"));
        } else {
            try {
                this.e.a((arwm) new uay(this, "onDestroy"));
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                anih anih3 = (anih) tsp.a.b();
                anih3.a((Throwable) e4);
                anih3.a("Attempted to wait for EventLoop to destroy locator, but was interrupted.");
                this.a.a();
            }
        }
    }

    public final void d() {
        List list;
        acwa a2 = ((rxy) this.a.a(rxy.class)).a(aymt.a.a().R(), "com.google.android.gms");
        try {
            acws.a(a2, (long) ((int) aymt.a.a().S()), TimeUnit.MILLISECONDS);
            FileGroupResponse fileGroupResponse = (FileGroupResponse) a2.d();
            if (fileGroupResponse == null || (list = fileGroupResponse.c) == null || list.isEmpty()) {
                ((anih) tsp.a.c()).a("FastPairOffline: MDD response is empty");
                return;
            }
            agzs agzs = new agzs(Collections.singletonList((ahcn) this.a.a(ahcn.class)));
            Uri parse = Uri.parse(((MddFile) fileGroupResponse.c.get(0)).b);
            try {
                aubs c2 = aubs.c();
                tzd tzd = (tzd) aucj.a((aucj) tzd.b, (byte[]) agzs.a(parse, ahcg.a(), new agzk[0]), c2);
                jjg jjg = tsp.a;
                tzd.a.size();
                txr txr = (txr) this.a.a(txr.class);
                for (asqq a3 : tzd.a) {
                    txr.a(a3, false);
                }
                ((anih) tsp.a.d()).a("FastPair: finished offline cache populate device number in cache: %s", txr.a.d().size());
            } catch (IOException e2) {
                anih anih = (anih) tsp.a.c();
                anih.a((Throwable) e2);
                anih.a("FastPairOffline: Cache does not populate correctly");
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            anih anih2 = (anih) tsp.a.c();
            anih2.a(e3);
            anih2.a("FastPairOffline: mdd task does not finish");
        }
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        try {
            this.e.a((arwm) new uaw(this, "dump", printWriter));
        } catch (InterruptedException e2) {
            printWriter.format("Failed to dump: %s\n", new Object[]{e2});
        }
    }

    public final IBinder onBind(Intent intent) {
        jjg jjg = tsp.a;
        if ("com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_ACTIVITY".equals(intent.getAction())) {
            if (this.m == null) {
                this.m = new ubj(this, this.e);
            }
            return this.m;
        } else if ("com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_SLICE".equals(intent.getAction())) {
            if (this.v == null) {
                this.v = new ubj(this, this.e);
            }
            return this.v;
        } else if ("com.google.android.gms.nearby.discovery:ACTION_DEVICE_DETAILS_SLICE".equals(intent.getAction())) {
            if (this.z == null) {
                this.z = new arxv(this);
            }
            return this.z;
        } else if (!"com.google.android.gms.nearby.discovery.ACTION_START_PAIRING_WITH_PROGRESS".equals(intent.getAction())) {
            return null;
        } else {
            if (this.A == null) {
                this.A = new arye(this.j);
            }
            return this.A;
        }
    }

    public final void onCreate() {
        super.onCreate();
        ((anih) tsp.a.d()).a("DiscoveryService created");
        thl thl = new thl(this);
        this.a = thl;
        thl.a((thn) new tsb());
        this.b = (tsm) thl.a((Context) this, tsm.class);
        this.d = (ubv) thl.a((Context) this, ubv.class);
        this.g = (udc) thl.a((Context) this, udc.class);
        this.j = (udb) thl.a((Context) this, udb.class);
        this.k = new tul(this);
        this.c = (ttf) thl.a((Context) this, ttf.class);
        this.q = (arxg) thl.a((Context) this, arxg.class);
        this.e = (arwg) thl.a((Context) this, arwg.class);
        this.f = (udf) thl.a((Context) this, udf.class);
        this.h = (tst) thl.a((Context) this, tst.class);
        this.i = (tsu) thl.a((Context) this, tsu.class);
        this.j.q = this;
        List a2 = tul.a();
        if (!a2.isEmpty()) {
            IntentFilter intentFilter = new IntentFilter();
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                intentFilter.addAction((String) a2.get(i2));
            }
            registerReceiver(this.n, intentFilter);
        }
        List b2 = tul.b();
        if (!b2.isEmpty()) {
            IntentFilter intentFilter2 = new IntentFilter();
            int size2 = b2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                intentFilter2.addAction((String) b2.get(i3));
            }
            thp.a(this, this.o, intentFilter2);
        }
        if (aymw.W()) {
            AutoTestBroadcastReceiver autoTestBroadcastReceiver = new AutoTestBroadcastReceiver(this);
            this.p = autoTestBroadcastReceiver;
            IntentFilter intentFilter3 = new IntentFilter();
            anhj a3 = AutoTestBroadcastReceiver.a.iterator();
            while (a3.hasNext()) {
                intentFilter3.addAction((String) a3.next());
            }
            autoTestBroadcastReceiver.c.registerReceiver(autoTestBroadcastReceiver, intentFilter3);
            ((anih) tsp.a.c()).a("FastPairAutoTestReceiver: Receiver registered!");
        }
        a((Runnable) new uaq(this));
    }

    public final void onDestroy() {
        if (aymq.m()) {
            ((anih) tsp.a.d()).a("FastPairHandler: unregistering intent receivers");
            thp.a((Context) this, (BroadcastReceiver) this.o);
            thp.a((Context) this, (BroadcastReceiver) this.n);
        }
        AutoTestBroadcastReceiver autoTestBroadcastReceiver = this.p;
        if (autoTestBroadcastReceiver != null) {
            thp.a(autoTestBroadcastReceiver.c, (BroadcastReceiver) autoTestBroadcastReceiver);
        }
        ((anih) tsp.a.d()).a("DiscoveryService destroyed");
        if (!aymq.h()) {
            try {
                this.e.a((arwm) new uav(this, "onDestroy"));
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                anih anih = (anih) tsp.a.b();
                anih.a((Throwable) e2);
                anih.a("Attempted to wait for EventLoop to destroy locator, but was interrupted.");
                this.a.a();
            }
        } else {
            if (aymq.i()) {
                try {
                    this.e.a((arwm) new uau(this, "onDestroy"));
                } catch (InterruptedException e3) {
                    Thread.currentThread().interrupt();
                    anih anih2 = (anih) tsp.a.b();
                    anih2.a((Throwable) e3);
                    anih2.a("Attempted to wait for EventLoop to destroy locator, but was interrupted.");
                    this.a.a();
                }
            }
            a((Runnable) new uar(this));
        }
        super.onDestroy();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x058e, code lost:
        return 2;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x002e=Splitter:B:15:0x002e, B:209:0x058f=Splitter:B:209:0x058f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int onStartCommand(android.content.Intent r20, int r21, int r22) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            monitor-enter(r19)
            r9 = 2
            if (r0 != 0) goto L_0x000a
            goto L_0x058f
        L_0x000a:
            java.lang.String r2 = r20.getAction()     // Catch:{ all -> 0x05a1 }
            if (r2 == 0) goto L_0x058f
            boolean r2 = r1.w     // Catch:{ all -> 0x05a1 }
            if (r2 != 0) goto L_0x0015
            goto L_0x002e
        L_0x0015:
            boolean r2 = defpackage.aymq.h()     // Catch:{ all -> 0x05a1 }
            if (r2 != 0) goto L_0x002e
            jjg r2 = defpackage.tsp.a     // Catch:{ all -> 0x05a1 }
            anie r2 = r2.b()     // Catch:{ all -> 0x05a1 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "DiscoveryService is now destroying, skip %s"
            java.lang.String r0 = r20.getAction()     // Catch:{ all -> 0x05a1 }
            r2.a((java.lang.String) r3, (java.lang.Object) r0)     // Catch:{ all -> 0x05a1 }
            monitor-exit(r19)
            return r9
        L_0x002e:
            android.os.Bundle r2 = r20.getExtras()     // Catch:{ all -> 0x05a1 }
            jjg r3 = defpackage.tsp.a     // Catch:{ all -> 0x05a1 }
            r20.getAction()     // Catch:{ all -> 0x05a1 }
            boolean r3 = defpackage.aymq.m()     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0053
            java.lang.String r3 = r20.getAction()     // Catch:{ all -> 0x05a1 }
            boolean r3 = defpackage.tul.a((java.lang.String) r3)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0053
            arwg r3 = r1.e     // Catch:{ all -> 0x05a1 }
            ubd r4 = new ubd     // Catch:{ all -> 0x05a1 }
            java.lang.String r5 = "fastPairHandleIntent"
            r4.<init>(r1, r5, r0)     // Catch:{ all -> 0x05a1 }
            r3.c(r4)     // Catch:{ all -> 0x05a1 }
        L_0x0053:
            java.lang.String r3 = r20.getAction()     // Catch:{ all -> 0x05a1 }
            int r4 = r3.hashCode()     // Catch:{ all -> 0x05a1 }
            r5 = 9
            r6 = 0
            r7 = 1
            r8 = 10
            r10 = -1
            switch(r4) {
                case -1985371032: goto L_0x0177;
                case -1852939788: goto L_0x016d;
                case -1703372784: goto L_0x0162;
                case -1582561631: goto L_0x0157;
                case -1530327060: goto L_0x014d;
                case -1331063108: goto L_0x0142;
                case -1094157721: goto L_0x0137;
                case -883289033: goto L_0x012c;
                case -867080949: goto L_0x0121;
                case -368627191: goto L_0x0116;
                case -366060771: goto L_0x010a;
                case -362543359: goto L_0x00ff;
                case -301431627: goto L_0x00f4;
                case -102165123: goto L_0x00e9;
                case 411712845: goto L_0x00dd;
                case 545516589: goto L_0x00d1;
                case 579327048: goto L_0x00c5;
                case 1174571750: goto L_0x00b9;
                case 1244161670: goto L_0x00ad;
                case 1821585647: goto L_0x00a1;
                case 1949616771: goto L_0x0095;
                case 2068642361: goto L_0x0089;
                case 2094935584: goto L_0x007e;
                case 2108582660: goto L_0x0072;
                case 2116862345: goto L_0x0067;
                default: goto L_0x0065;
            }     // Catch:{ all -> 0x05a1 }
        L_0x0065:
            goto L_0x0181
        L_0x0067:
            java.lang.String r4 = "android.bluetooth.device.action.BOND_STATE_CHANGED"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 6
            goto L_0x0182
        L_0x0072:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 13
            goto L_0x0182
        L_0x007e:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery:ACTION_MESSAGES_CALLBACK"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 1
            goto L_0x0182
        L_0x0089:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery.fastpair.service.POPULATE_CACHE"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 24
            goto L_0x0182
        L_0x0095:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_PAIRING_PROCESS_DONE"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 16
            goto L_0x0182
        L_0x00a1:
            java.lang.String r4 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 8
            goto L_0x0182
        L_0x00ad:
            java.lang.String r4 = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 11
            goto L_0x0182
        L_0x00b9:
            java.lang.String r4 = "android.bluetooth.device.action.ALIAS_CHANGED"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 9
            goto L_0x0182
        L_0x00c5:
            java.lang.String r4 = "android.bluetooth.device.action.BATTERY_LEVEL_CHANGED"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 10
            goto L_0x0182
        L_0x00d1:
            java.lang.String r4 = "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 12
            goto L_0x0182
        L_0x00dd:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_UNPAIR"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 19
            goto L_0x0182
        L_0x00e9:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery:ACTION_LOCALE_CHANGE"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 4
            goto L_0x0182
        L_0x00f4:
            java.lang.String r4 = "android.bluetooth.device.action.ACL_CONNECTED"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 7
            goto L_0x0182
        L_0x00ff:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery:ACTION_INIT_MESSAGES_PATH"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 0
            goto L_0x0182
        L_0x010a:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_DEVICE_ADDED"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 17
            goto L_0x0182
        L_0x0116:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery:ACTION_SET_BEACON_SETTINGS"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 23
            goto L_0x0182
        L_0x0121:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_PAIR"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 20
            goto L_0x0182
        L_0x012c:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery:ACTION_SET_DEVICE_SETTINGS"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 22
            goto L_0x0182
        L_0x0137:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_BLOOM_FILTER_DETECTED"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 18
            goto L_0x0182
        L_0x0142:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery:ACTION_SET_MASTER_SWITCH"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 21
            goto L_0x0182
        L_0x014d:
            java.lang.String r4 = "android.bluetooth.adapter.action.STATE_CHANGED"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 2
            goto L_0x0182
        L_0x0157:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_PAIRED_NOTIFICATION_DISMISSED"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 15
            goto L_0x0182
        L_0x0162:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery:ACTION_CANCEL_FAST_PAIR"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 14
            goto L_0x0182
        L_0x016d:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery:ACTION_DEBUG_CHANGE"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 5
            goto L_0x0182
        L_0x0177:
            java.lang.String r4 = "com.google.android.gms.nearby.discovery:ACTION_PERMISSION_CHANGE"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0181
            r3 = 3
            goto L_0x0182
        L_0x0181:
            r3 = -1
        L_0x0182:
            switch(r3) {
                case 0: goto L_0x0570;
                case 1: goto L_0x0565;
                case 2: goto L_0x0527;
                case 3: goto L_0x0523;
                case 4: goto L_0x0518;
                case 5: goto L_0x0518;
                case 6: goto L_0x04ce;
                case 7: goto L_0x04c2;
                case 8: goto L_0x04b6;
                case 9: goto L_0x0469;
                case 10: goto L_0x044e;
                case 11: goto L_0x0406;
                case 12: goto L_0x0406;
                case 13: goto L_0x03a7;
                case 14: goto L_0x0368;
                case 15: goto L_0x032a;
                case 16: goto L_0x02f1;
                case 17: goto L_0x02b6;
                case 18: goto L_0x028d;
                case 19: goto L_0x0272;
                case 20: goto L_0x020f;
                case 21: goto L_0x01d3;
                case 22: goto L_0x0197;
                case 23: goto L_0x0197;
                case 24: goto L_0x0189;
                default: goto L_0x0185;
            }     // Catch:{ all -> 0x05a1 }
        L_0x0185:
            arwg r2 = r1.e     // Catch:{ all -> 0x05a1 }
            goto L_0x0580
        L_0x0189:
            arwg r0 = r1.e     // Catch:{ all -> 0x05a1 }
            ubh r2 = new ubh     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "offlineCachePopulate"
            r2.<init>(r1, r3)     // Catch:{ all -> 0x05a1 }
            r0.c(r2)     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x0197:
            if (r2 != 0) goto L_0x019a
            goto L_0x01c1
        L_0x019a:
            java.lang.String r3 = "com.google.android.gms.nearby.discovery:EXTRA_CATEGORY_SWITCH_ENABLED"
            boolean r3 = r2.containsKey(r3)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x01c1
            java.lang.String r3 = "com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ENABLED"
            boolean r3 = r2.containsKey(r3)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x01c1
            arwg r3 = r1.e     // Catch:{ all -> 0x05a1 }
            ubg r4 = new ubg     // Catch:{ all -> 0x05a1 }
            java.lang.String r5 = "handleCategorySwitchEvent"
            r4.<init>(r1, r5, r2, r0)     // Catch:{ all -> 0x05a1 }
            r3.c(r4)     // Catch:{ all -> 0x05a1 }
            java.lang.String r0 = "com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ENABLED"
            boolean r0 = r2.getBoolean(r0)     // Catch:{ all -> 0x05a1 }
            r1.b((boolean) r0)     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x01c1:
            jjg r0 = defpackage.tsp.a     // Catch:{ all -> 0x05a1 }
            anie r0 = r0.b()     // Catch:{ all -> 0x05a1 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "Got settings Intent with no enabled extra"
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x05a1 }
            r19.e()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x01d3:
            if (r2 != 0) goto L_0x01d6
            goto L_0x01fd
        L_0x01d6:
            java.lang.String r0 = "com.google.android.gms.nearby.discovery:EXTRA_MASTER_SWITCH_ENABLED"
            boolean r0 = r2.containsKey(r0)     // Catch:{ all -> 0x05a1 }
            if (r0 == 0) goto L_0x01fd
            java.lang.String r0 = "com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ENABLED"
            boolean r0 = r2.containsKey(r0)     // Catch:{ all -> 0x05a1 }
            if (r0 == 0) goto L_0x01fd
            arwg r0 = r1.e     // Catch:{ all -> 0x05a1 }
            ubf r3 = new ubf     // Catch:{ all -> 0x05a1 }
            java.lang.String r4 = "handleMasterSwitchEvent"
            r3.<init>(r1, r4, r2)     // Catch:{ all -> 0x05a1 }
            r0.c(r3)     // Catch:{ all -> 0x05a1 }
            java.lang.String r0 = "com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ENABLED"
            boolean r0 = r2.getBoolean(r0)     // Catch:{ all -> 0x05a1 }
            r1.b((boolean) r0)     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x01fd:
            jjg r0 = defpackage.tsp.a     // Catch:{ all -> 0x05a1 }
            anie r0 = r0.b()     // Catch:{ all -> 0x05a1 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "Got settings Intent with no enabled extra"
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x05a1 }
            r19.e()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x020f:
            udb r4 = r1.j     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "com.google.android.gms.nearby.discovery.BLE_ADDRESS"
            java.lang.String r2 = r0.getStringExtra(r2)     // Catch:{ all -> 0x05a1 }
            aymw r3 = defpackage.aymw.a     // Catch:{ all -> 0x05a1 }
            aymx r3 = r3.a()     // Catch:{ all -> 0x05a1 }
            boolean r3 = r3.h()     // Catch:{ all -> 0x05a1 }
            if (r3 != 0) goto L_0x022d
            android.content.Context r0 = r4.e     // Catch:{ all -> 0x05a1 }
            com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Step r3 = com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Step.FINISHED     // Catch:{ all -> 0x05a1 }
            com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Result r4 = com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Result.FAILURE     // Catch:{ all -> 0x05a1 }
            defpackage.aein.a(r0, r2, r3, r4)     // Catch:{ all -> 0x05a1 }
            goto L_0x026d
        L_0x022d:
            boolean r3 = android.bluetooth.BluetoothAdapter.checkBluetoothAddress(r2)     // Catch:{ all -> 0x05a1 }
            if (r3 != 0) goto L_0x024a
            jjg r0 = defpackage.tsp.a     // Catch:{ all -> 0x05a1 }
            anie r0 = r0.c()     // Catch:{ all -> 0x05a1 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "FastPair: Received invalid address, skipping pair: %s"
            r0.a((java.lang.String) r3, (java.lang.Object) r2)     // Catch:{ all -> 0x05a1 }
            android.content.Context r0 = r4.e     // Catch:{ all -> 0x05a1 }
            com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Step r3 = com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Step.FINISHED     // Catch:{ all -> 0x05a1 }
            com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Result r4 = com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Result.FAILURE     // Catch:{ all -> 0x05a1 }
            defpackage.aein.a(r0, r2, r3, r4)     // Catch:{ all -> 0x05a1 }
            goto L_0x026d
        L_0x024a:
            java.lang.String r3 = "com.google.android.gms.nearby.discovery.KEY"
            byte[] r8 = r0.getByteArrayExtra(r3)     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "com.google.android.gms.nearby.discovery.DEVICE_NAME"
            java.lang.String r6 = r0.getStringExtra(r3)     // Catch:{ all -> 0x05a1 }
            ubx r0 = new ubx     // Catch:{ all -> 0x05a1 }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x05a1 }
            r4.r = r7     // Catch:{ all -> 0x05a1 }
            aoru r10 = defpackage.jfm.b(r5)     // Catch:{ all -> 0x05a1 }
            uby r11 = new uby     // Catch:{ all -> 0x05a1 }
            r3 = r11
            r5 = r2
            r7 = r8
            r8 = r0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x05a1 }
            r10.execute(r11)     // Catch:{ all -> 0x05a1 }
        L_0x026d:
            r19.i()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x0272:
            udb r2 = r1.j     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "com.google.android.gms.nearby.discovery.ACCOUNT_KEY"
            boolean r3 = r0.hasExtra(r3)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x0288
            arwg r3 = r2.a     // Catch:{ all -> 0x05a1 }
            ucx r4 = new ucx     // Catch:{ all -> 0x05a1 }
            java.lang.String r5 = "fastPairUnpair"
            r4.<init>(r2, r5, r0)     // Catch:{ all -> 0x05a1 }
            r3.c(r4)     // Catch:{ all -> 0x05a1 }
        L_0x0288:
            r19.i()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x028d:
            udb r2 = r1.j     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "com.google.android.gms.nearby.discovery.BLOOM_FILTER"
            boolean r3 = r0.hasExtra(r3)     // Catch:{ all -> 0x05a1 }
            if (r3 != 0) goto L_0x02a5
            jjg r0 = defpackage.tsp.a     // Catch:{ all -> 0x05a1 }
            anie r0 = r0.c()     // Catch:{ all -> 0x05a1 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "FastPair: No bloom filter extra available."
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x05a1 }
            goto L_0x02b1
        L_0x02a5:
            arwg r3 = r2.a     // Catch:{ all -> 0x05a1 }
            uce r4 = new uce     // Catch:{ all -> 0x05a1 }
            java.lang.String r5 = "bloomFilterDetected"
            r4.<init>(r2, r5, r0)     // Catch:{ all -> 0x05a1 }
            r3.c(r4)     // Catch:{ all -> 0x05a1 }
        L_0x02b1:
            r19.i()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x02b6:
            udb r2 = r1.j     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "com.google.android.gms.nearby.discovery.BLE_ADDRESS"
            boolean r3 = r0.hasExtra(r3)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x02df
            java.lang.String r3 = "com.google.android.gms.nearby.discovery.ACCOUNT_KEY"
            boolean r3 = r0.hasExtra(r3)     // Catch:{ all -> 0x05a1 }
            if (r3 != 0) goto L_0x02c9
            goto L_0x02df
        L_0x02c9:
            jjg r3 = defpackage.tsp.a     // Catch:{ all -> 0x05a1 }
            anie r3 = r3.d()     // Catch:{ all -> 0x05a1 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x05a1 }
            java.lang.String r4 = "FastPair: upload device to footprints."
            r3.a((java.lang.String) r4)     // Catch:{ all -> 0x05a1 }
            ubz r3 = new ubz     // Catch:{ all -> 0x05a1 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x05a1 }
            defpackage.tvd.a((java.lang.Runnable) r3)     // Catch:{ all -> 0x05a1 }
            goto L_0x02ec
        L_0x02df:
            jjg r0 = defpackage.tsp.a     // Catch:{ all -> 0x05a1 }
            anie r0 = r0.c()     // Catch:{ all -> 0x05a1 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "Got device added intent with no extras."
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x05a1 }
        L_0x02ec:
            r19.i()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x02f1:
            udb r3 = r1.j     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID"
            java.lang.String r6 = r0.getStringExtra(r2)     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "com.google.android.gms.nearby.discovery:EXTRA_SUCCESS"
            boolean r5 = r0.getBooleanExtra(r2, r7)     // Catch:{ all -> 0x05a1 }
            r7 = r5 ^ 1
            arwg r10 = r3.a     // Catch:{ all -> 0x05a1 }
            ucj r11 = new ucj     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x05a1 }
            java.lang.String r4 = "fastPairPairingProcessDone="
            int r8 = r2.length()     // Catch:{ all -> 0x05a1 }
            if (r8 != 0) goto L_0x0317
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x05a1 }
            r2.<init>(r4)     // Catch:{ all -> 0x05a1 }
            goto L_0x031b
        L_0x0317:
            java.lang.String r2 = r4.concat(r2)     // Catch:{ all -> 0x05a1 }
        L_0x031b:
            r4 = r2
            r2 = r11
            r8 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x05a1 }
            r10.c(r11)     // Catch:{ all -> 0x05a1 }
            r19.i()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x032a:
            udb r3 = r1.j     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID"
            java.lang.String r7 = r0.getStringExtra(r2)     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "com.google.android.gms.nearby.discovery:EXTRA_PENDING_INTENT"
            android.os.Parcelable r2 = r0.getParcelableExtra(r2)     // Catch:{ all -> 0x05a1 }
            r8 = r2
            android.app.PendingIntent r8 = (android.app.PendingIntent) r8     // Catch:{ all -> 0x05a1 }
            boolean r5 = defpackage.udb.a((android.app.PendingIntent) r8)     // Catch:{ all -> 0x05a1 }
            arwg r10 = r3.a     // Catch:{ all -> 0x05a1 }
            uci r11 = new uci     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x05a1 }
            java.lang.String r4 = "fastPairPairedNotificationDismissed="
            int r6 = r2.length()     // Catch:{ all -> 0x05a1 }
            if (r6 != 0) goto L_0x0355
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x05a1 }
            r2.<init>(r4)     // Catch:{ all -> 0x05a1 }
            goto L_0x0359
        L_0x0355:
            java.lang.String r2 = r4.concat(r2)     // Catch:{ all -> 0x05a1 }
        L_0x0359:
            r4 = r2
            r2 = r11
            r6 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x05a1 }
            r10.c(r11)     // Catch:{ all -> 0x05a1 }
            r19.i()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x0368:
            udb r2 = r1.j     // Catch:{ all -> 0x05a1 }
            boolean r3 = defpackage.aymt.k()     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x03a2
            java.lang.String r3 = "com.google.android.gms.nearby.discovery.BLE_ADDRESS"
            java.lang.String r0 = r0.getStringExtra(r3)     // Catch:{ all -> 0x05a1 }
            if (r0 != 0) goto L_0x0379
            goto L_0x03a2
        L_0x0379:
            jjg r3 = defpackage.tsp.a     // Catch:{ all -> 0x05a1 }
            anie r3 = r3.d()     // Catch:{ all -> 0x05a1 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x05a1 }
            java.lang.String r4 = "FastPair: cancel pairing with %s"
            r3.a((java.lang.String) r4, (java.lang.Object) r0)     // Catch:{ all -> 0x05a1 }
            arwg r3 = r2.a     // Catch:{ all -> 0x05a1 }
            ucv r4 = new ucv     // Catch:{ all -> 0x05a1 }
            java.lang.String r5 = "cancelPairing="
            int r6 = r0.length()     // Catch:{ all -> 0x05a1 }
            if (r6 != 0) goto L_0x0398
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x05a1 }
            r6.<init>(r5)     // Catch:{ all -> 0x05a1 }
            goto L_0x039c
        L_0x0398:
            java.lang.String r6 = r5.concat(r0)     // Catch:{ all -> 0x05a1 }
        L_0x039c:
            r4.<init>(r2, r6, r0)     // Catch:{ all -> 0x05a1 }
            r3.c(r4)     // Catch:{ all -> 0x05a1 }
        L_0x03a2:
            r19.i()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x03a7:
            udb r11 = r1.j     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID"
            java.lang.String r13 = r0.getStringExtra(r2)     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ID"
            int r17 = r0.getIntExtra(r2, r10)     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "com.google.android.gms.nearby.discovery.EXTRA_DISCOVERY_ITEM"
            byte[] r14 = r0.getByteArrayExtra(r2)     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "com.google.android.gms.nearby.discovery.EXTRA_FAST_PAIR_SECRET"
            java.lang.String r2 = r0.getStringExtra(r2)     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP"
            java.lang.String r3 = r0.getStringExtra(r3)     // Catch:{ all -> 0x05a1 }
            java.lang.String r18 = defpackage.udb.a((java.lang.String) r3)     // Catch:{ all -> 0x05a1 }
            if (r2 == 0) goto L_0x03d6
            anml r3 = defpackage.anml.g     // Catch:{ all -> 0x05a1 }
            byte[] r2 = r3.b((java.lang.CharSequence) r2)     // Catch:{ all -> 0x05a1 }
            r16 = r2
            goto L_0x03d9
        L_0x03d6:
            r2 = 0
            r16 = r2
        L_0x03d9:
            java.lang.String r2 = "com.google.android.gms.nearby.discovery.EXTRA_RETROACTIVE_PAIR"
            boolean r15 = r0.getBooleanExtra(r2, r6)     // Catch:{ all -> 0x05a1 }
            arwg r0 = r11.a     // Catch:{ all -> 0x05a1 }
            ucu r2 = new ucu     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x05a1 }
            java.lang.String r4 = "fastPairWith="
            int r5 = r3.length()     // Catch:{ all -> 0x05a1 }
            if (r5 != 0) goto L_0x03f5
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x05a1 }
            r3.<init>(r4)     // Catch:{ all -> 0x05a1 }
            goto L_0x03f9
        L_0x03f5:
            java.lang.String r3 = r4.concat(r3)     // Catch:{ all -> 0x05a1 }
        L_0x03f9:
            r12 = r3
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x05a1 }
            r0.c(r2)     // Catch:{ all -> 0x05a1 }
            r19.i()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x0406:
            udb r4 = r1.j     // Catch:{ all -> 0x05a1 }
            java.lang.String r7 = r20.getAction()     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "android.bluetooth.profile.extra.PREVIOUS_STATE"
            int r2 = r0.getIntExtra(r2, r10)     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "android.bluetooth.profile.extra.STATE"
            int r8 = r0.getIntExtra(r3, r10)     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "android.bluetooth.device.extra.DEVICE"
            android.os.Parcelable r0 = r0.getParcelableExtra(r3)     // Catch:{ all -> 0x05a1 }
            r6 = r0
            android.bluetooth.BluetoothDevice r6 = (android.bluetooth.BluetoothDevice) r6     // Catch:{ all -> 0x05a1 }
            jjg r0 = defpackage.tsp.a     // Catch:{ all -> 0x05a1 }
            anie r0 = r0.d()     // Catch:{ all -> 0x05a1 }
            r11 = r0
            anih r11 = (defpackage.anih) r11     // Catch:{ all -> 0x05a1 }
            java.lang.String r12 = "onProfileConnectionStateChange: action=%s prevState=%s, state=%s, device=%s"
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x05a1 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x05a1 }
            r13 = r7
            r16 = r6
            r11.a(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x05a1 }
            if (r6 == 0) goto L_0x0449
            arwg r0 = r4.a     // Catch:{ all -> 0x05a1 }
            ucn r2 = new ucn     // Catch:{ all -> 0x05a1 }
            java.lang.String r5 = "onProfileConnectionStateChange"
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x05a1 }
            r0.c(r2)     // Catch:{ all -> 0x05a1 }
        L_0x0449:
            r19.i()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x044e:
            aymw r2 = defpackage.aymw.a     // Catch:{ all -> 0x05a1 }
            aymx r2 = r2.a()     // Catch:{ all -> 0x05a1 }
            boolean r2 = r2.aH()     // Catch:{ all -> 0x05a1 }
            if (r2 == 0) goto L_0x0464
            java.lang.String r2 = "android.bluetooth.device.extra.DEVICE"
            r0.getParcelableExtra(r2)     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "android.bluetooth.device.extra.BATTERY_LEVEL"
            r0.getIntExtra(r2, r10)     // Catch:{ all -> 0x05a1 }
        L_0x0464:
            r19.i()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x0469:
            udb r2 = r1.j     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "android.bluetooth.device.extra.DEVICE"
            boolean r3 = r0.hasExtra(r3)     // Catch:{ all -> 0x05a1 }
            if (r3 == 0) goto L_0x04a4
            java.lang.String r3 = "android.bluetooth.device.extra.NAME"
            boolean r3 = r0.hasExtra(r3)     // Catch:{ all -> 0x05a1 }
            if (r3 != 0) goto L_0x047c
            goto L_0x04a4
        L_0x047c:
            java.lang.String r3 = "android.bluetooth.device.extra.DEVICE"
            android.os.Parcelable r3 = r0.getParcelableExtra(r3)     // Catch:{ all -> 0x05a1 }
            android.bluetooth.BluetoothDevice r3 = (android.bluetooth.BluetoothDevice) r3     // Catch:{ all -> 0x05a1 }
            java.lang.String r4 = "android.bluetooth.device.extra.NAME"
            java.lang.String r0 = r0.getStringExtra(r4)     // Catch:{ all -> 0x05a1 }
            jjg r4 = defpackage.tsp.a     // Catch:{ all -> 0x05a1 }
            anie r4 = r4.d()     // Catch:{ all -> 0x05a1 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x05a1 }
            java.lang.String r5 = "FastPair: Received alias name change, alias = %s"
            r4.a((java.lang.String) r5, (java.lang.Object) r0)     // Catch:{ all -> 0x05a1 }
            arwg r4 = r2.a     // Catch:{ all -> 0x05a1 }
            ucm r5 = new ucm     // Catch:{ all -> 0x05a1 }
            java.lang.String r6 = "aliasNameChange"
            r5.<init>(r2, r6, r3, r0)     // Catch:{ all -> 0x05a1 }
            r4.c(r5)     // Catch:{ all -> 0x05a1 }
            goto L_0x04b1
        L_0x04a4:
            jjg r0 = defpackage.tsp.a     // Catch:{ all -> 0x05a1 }
            anie r0 = r0.c()     // Catch:{ all -> 0x05a1 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "Got device alias change intent with no extras."
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x05a1 }
        L_0x04b1:
            r19.i()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x04b6:
            udb r2 = r1.j     // Catch:{ all -> 0x05a1 }
            ucy r3 = defpackage.ucy.DISCONNECTED     // Catch:{ all -> 0x05a1 }
            r2.a((android.content.Intent) r0, (defpackage.ucy) r3)     // Catch:{ all -> 0x05a1 }
            r19.i()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x04c2:
            udb r2 = r1.j     // Catch:{ all -> 0x05a1 }
            ucy r3 = defpackage.ucy.CONNECTED     // Catch:{ all -> 0x05a1 }
            r2.a((android.content.Intent) r0, (defpackage.ucy) r3)     // Catch:{ all -> 0x05a1 }
            r19.i()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x04ce:
            udb r11 = r1.j     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "android.bluetooth.device.extra.BOND_STATE"
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r13 = r0.getIntExtra(r2, r3)     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "android.bluetooth.device.extra.PREVIOUS_BOND_STATE"
            int r15 = r0.getIntExtra(r2, r3)     // Catch:{ all -> 0x05a1 }
            java.lang.String r2 = "android.bluetooth.device.extra.DEVICE"
            android.os.Parcelable r0 = r0.getParcelableExtra(r2)     // Catch:{ all -> 0x05a1 }
            r14 = r0
            android.bluetooth.BluetoothDevice r14 = (android.bluetooth.BluetoothDevice) r14     // Catch:{ all -> 0x05a1 }
            jjg r0 = defpackage.tsp.a     // Catch:{ all -> 0x05a1 }
            anie r0 = r0.d()     // Catch:{ all -> 0x05a1 }
            r2 = r0
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "FastPair: onBondStateChange: prevState=%s, state=%s, device=%s, isFastPairing=%s"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x05a1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x05a1 }
            boolean r0 = r11.r     // Catch:{ all -> 0x05a1 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x05a1 }
            r6 = r14
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x05a1 }
            if (r14 == 0) goto L_0x0513
            arwg r0 = r11.a     // Catch:{ all -> 0x05a1 }
            ucd r2 = new ucd     // Catch:{ all -> 0x05a1 }
            java.lang.String r12 = "bondStateChanged"
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x05a1 }
            r0.c(r2)     // Catch:{ all -> 0x05a1 }
        L_0x0513:
            r19.i()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x0518:
            arwg r0 = r1.e     // Catch:{ all -> 0x05a1 }
            arwm r2 = r1.t     // Catch:{ all -> 0x05a1 }
            r0.c(r2)     // Catch:{ all -> 0x05a1 }
            r19.f()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x0523:
            r19.f()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x0527:
            boolean r2 = defpackage.aymw.aa()     // Catch:{ all -> 0x05a1 }
            if (r2 == 0) goto L_0x058d
            jjg r2 = defpackage.tsp.a     // Catch:{ all -> 0x05a1 }
            anie r2 = r2.d()     // Catch:{ all -> 0x05a1 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "DiscoveryService created for ACTION_STATE_CHANGED."
            r2.a((java.lang.String) r3)     // Catch:{ all -> 0x05a1 }
            udb r2 = r1.j     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "android.bluetooth.adapter.extra.STATE"
            int r3 = r0.getIntExtra(r3, r8)     // Catch:{ all -> 0x05a1 }
            if (r3 != r8) goto L_0x0551
            arwg r0 = r2.a     // Catch:{ all -> 0x05a1 }
            ucf r3 = new ucf     // Catch:{ all -> 0x05a1 }
            java.lang.String r4 = "onAdapterStateOff"
            r3.<init>(r2, r4)     // Catch:{ all -> 0x05a1 }
            r0.c(r3)     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x0551:
            jjg r2 = defpackage.tsp.a     // Catch:{ all -> 0x05a1 }
            anie r2 = r2.d()     // Catch:{ all -> 0x05a1 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "FastPair: BluetoothAdapter state change to (%s)."
            java.lang.String r4 = "android.bluetooth.adapter.extra.STATE"
            int r0 = r0.getIntExtra(r4, r8)     // Catch:{ all -> 0x05a1 }
            r2.a((java.lang.String) r3, (int) r0)     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x0565:
            tsm r2 = r1.b     // Catch:{ all -> 0x05a1 }
            uxh r2 = r2.d     // Catch:{ all -> 0x05a1 }
            defpackage.vce.a((android.content.Intent) r0, (defpackage.uxh) r2)     // Catch:{ all -> 0x05a1 }
            r19.i()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x0570:
            arwg r0 = r1.e     // Catch:{ all -> 0x05a1 }
            ube r2 = new ube     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "reenableSystemDisabledItems"
            r2.<init>(r1, r3)     // Catch:{ all -> 0x05a1 }
            r0.c(r2)     // Catch:{ all -> 0x05a1 }
            r19.f()     // Catch:{ all -> 0x05a1 }
            goto L_0x058d
        L_0x0580:
            ubi r3 = new ubi     // Catch:{ all -> 0x05a1 }
            java.lang.String r4 = "handleUserAction"
            r3.<init>(r1, r4, r0)     // Catch:{ all -> 0x05a1 }
            r2.c(r3)     // Catch:{ all -> 0x05a1 }
            r19.i()     // Catch:{ all -> 0x05a1 }
        L_0x058d:
            monitor-exit(r19)
            return r9
        L_0x058f:
            jjg r2 = defpackage.tsp.a     // Catch:{ all -> 0x05a1 }
            anie r2 = r2.b()     // Catch:{ all -> 0x05a1 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x05a1 }
            java.lang.String r3 = "DiscoveryService unexpectedly started with null intent or action: %s"
            r2.a((java.lang.String) r3, (java.lang.Object) r0)     // Catch:{ all -> 0x05a1 }
            r19.e()     // Catch:{ all -> 0x05a1 }
            monitor-exit(r19)
            return r9
        L_0x05a1:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService.onStartCommand(android.content.Intent, int, int):int");
    }

    public final boolean onUnbind(Intent intent) {
        arye arye;
        jjg jjg = tsp.a;
        if ("com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_ACTIVITY".equals(intent.getAction())) {
            ubj ubj = this.m;
            if (ubj != null && ubj.d()) {
                this.m.c();
            }
            return false;
        } else if (!"com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_SLICE".equals(intent.getAction())) {
            if ("com.google.android.gms.nearby.discovery.ACTION_START_PAIRING_WITH_PROGRESS".equals(intent.getAction()) && (arye = this.A) != null) {
                arye.a();
            }
            return false;
        } else {
            ubj ubj2 = this.v;
            if (ubj2 != null && ubj2.d()) {
                this.v.c();
            }
            return false;
        }
    }

    private final void a(Runnable runnable) {
        Executor executor;
        synchronized (this.x) {
            if (this.y == null) {
                this.y = jfm.b(10);
            }
            executor = this.y;
        }
        executor.execute(runnable);
    }

    private final void b(boolean z2) {
        if (arxk.a((Context) this, tfx.a(this)) && z2) {
            g();
        } else {
            h();
        }
    }

    public final synchronized void b() {
        if (this.e.b(this.s)) {
            jjg jjg = tsp.a;
            return;
        }
        udb udb = this.j;
        if (aymw.ab()) {
            if (udb.l.g()) {
                ((anih) tsp.a.d()).a("FastPair: isDestroyable: Scanner is alive.");
                ((anih) tsp.a.d()).a("DiscoveryService: Skip stopSelf(), fast pair controller is not destroyable.");
                return;
            }
        }
        if (aymq.a.a().h()) {
            if (!udb.i.b.isEmpty()) {
                ((anih) tsp.a.d()).a("FastPair: isDestroyable: Event stream is still connected.");
                ((anih) tsp.a.d()).a("DiscoveryService: Skip stopSelf(), fast pair controller is not destroyable.");
                return;
            }
        }
        if (aymq.h()) {
            jjg jjg2 = tsp.a;
            stopSelf();
        } else if (!this.w) {
            this.w = true;
            a((Runnable) new uat(this));
        } else {
            jjg jjg3 = tsp.a;
        }
    }

    public final void a(int i2) {
        this.d.a(i2);
    }

    public final void a(int i2, List list) {
        jjg jjg = tsp.a;
        list.size();
        ubj ubj = this.m;
        if (ubj != null) {
            ubj.a(i2, list);
        }
        ubj ubj2 = this.v;
        if (ubj2 != null) {
            ubj2.a(i2, list);
        }
        if (!list.isEmpty()) {
            ((tvg) thl.a((Context) this, tvg.class)).a();
        }
        if (jkr.h() && aymw.y()) {
            this.r.execute(new uas(this, list));
        }
    }

    public final void a(boolean z2) {
        ttf ttf = this.c;
        if (ttf.h != z2) {
            ttf.h = z2;
            for (ttg ttg : ttf.c()) {
                if (ttg.j() == avbx.NEARBY_DEVICE) {
                    ttg.a(z2);
                }
            }
        }
        this.d.a(1);
    }
}
