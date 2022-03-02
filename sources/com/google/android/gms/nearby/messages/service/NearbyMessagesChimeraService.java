package com.google.android.gms.nearby.messages.service;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.CopresenceBroadcastReceiver;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NearbyMessagesChimeraService extends Service implements thm {
    public static final Object a = new Object();
    public static final anax b = anax.a((Object) "android.permission-group.MICROPHONE");
    public static final Map c = jir.a((Object[]) new String[]{"android.permission-group.MICROPHONE"}, (Object[]) new Integer[]{Integer.valueOf(R.string.messages_microphone_permission)});
    private static boolean k;
    private static WeakReference p;
    public Map d;
    public CountDownLatch e;
    public CopresenceBroadcastReceiver f;
    public vgm g;
    public thl h;
    public arwg i;
    public uwl j;
    private ServiceConnection l;
    private BroadcastReceiver m;
    private BroadcastReceiver n;
    private jkn o;
    private final arwm q = new vfi(this, "resubscribeOnGmsCoreRestart");

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class AppUninstallAndForceStopReceiver extends nla {
        public AppUninstallAndForceStopReceiver() {
            super("nearby");
        }

        public final void a(Context context, Intent intent) {
            jjg jjg = tgc.a;
            intent.getAction();
            Uri data = intent.getData();
            if (data != null) {
                NearbyMessagesChimeraService.this.a(data.getSchemeSpecificPart(), true);
            }
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class OptInChangeBroadcastReceiver extends nla {
        public OptInChangeBroadcastReceiver() {
            super("nearby");
        }

        public final void a(Context context, Intent intent) {
            NearbyMessagesChimeraService nearbyMessagesChimeraService = NearbyMessagesChimeraService.this;
            Object obj = NearbyMessagesChimeraService.a;
            nearbyMessagesChimeraService.i.c(new vfr(this, "OptInChangeBroadcastReceiver.onReceive", intent, context));
        }
    }

    public static synchronized thl e() {
        thl thl;
        synchronized (NearbyMessagesChimeraService.class) {
            thl = p != null ? (thl) p.get() : null;
        }
        return thl;
    }

    private final void f() {
        this.i.c(new vfh(this, "NearbyMessagesService.stopServiceIfIdle"));
    }

    public final thl a() {
        return this.h;
    }

    public final void b() {
        try {
            this.j.a();
            if (aync.i()) {
                ArrayList arrayList = new ArrayList();
                for (Bundle bundle : this.j.b()) {
                    SubscribeRequest b2 = uwl.b(bundle);
                    ClientAppIdentifier e2 = uwl.e(bundle);
                    if (e2 == null) {
                        ((anih) ((anih) tgc.a.c()).a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "b", 209, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearbyMessagesService: Failed resubscribing, null client for subscribe request: %s", (Object) b2);
                    } else {
                        val b3 = ((vbp) this.h.a(vbp.class)).b(e2);
                        if (!a(uwl.d(bundle), b2, e2, uwl.f(bundle), b3.d())) {
                            this.j.a(bundle);
                        }
                        arrayList.add(b3);
                    }
                }
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((val) arrayList.get(i2)).c();
                }
            } else {
                val val = ((vbp) this.h.a(vbp.class)).g;
                List d2 = val.d();
                for (Bundle bundle2 : this.j.b()) {
                    if (!a(uwl.d(bundle2), uwl.b(bundle2), uwl.e(bundle2), uwl.f(bundle2), d2)) {
                        this.j.a(bundle2);
                    }
                }
                val.c();
            }
            Map map = this.d;
            if (map == null || map.isEmpty()) {
                stopSelf();
            }
        } catch (InterruptedException | TimeoutException e3) {
            anih anih = (anih) tgc.a.b();
            anih.a(e3);
            ((anih) anih.a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "b", 194, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Exception while waiting for BackgroundSubscribeCache init.");
            stopSelf();
        }
    }

    public final void c() {
        List list;
        acwa a2 = ((rxy) this.h.a(rxy.class)).a(aync.a.a().C(), "com.google.android.gms");
        try {
            acws.a(a2, (long) ((int) aync.a.a().D()), TimeUnit.MILLISECONDS);
            FileGroupResponse fileGroupResponse = (FileGroupResponse) a2.d();
            if (fileGroupResponse == null || (list = fileGroupResponse.c) == null || list.isEmpty()) {
                ((anih) ((anih) tgc.a.c()).a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "c", (int) ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MDD response is empty");
                return;
            }
            agzs agzs = new agzs(Collections.singletonList((ahcn) this.h.a(ahcn.class)));
            Uri parse = Uri.parse(((MddFile) fileGroupResponse.c.get(0)).b);
            try {
                aubs c2 = aubs.c();
                avdb avdb = (avdb) aucj.a((aucj) avdb.f, (byte[]) agzs.a(parse, ahcg.a(), new agzk[0]), c2);
                ((ves) this.h.a(ves.class)).a(ClientAppIdentifier.a("com.google.android.gms", new ClientAppContext(getPackageName(), "0p:discoverer"))).a((avae[]) avdb.c.toArray(new avae[0]), true);
                ((vak) this.h.a(vak.class)).a((auze[]) avdb.e.toArray(new auze[0]));
            } catch (IOException e2) {
                anih anih = (anih) tgc.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "c", 1023, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cache does not populate correctly");
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            anih anih2 = (anih) tgc.a.c();
            anih2.a(e3);
            ((anih) anih2.a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "c", 995, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("mdd task does not finish");
        }
    }

    public final boolean d() {
        try {
            this.j.a();
            if (!this.j.b().isEmpty()) {
                return false;
            }
            uyj uyj = (uyj) this.h.a(uyj.class);
            uyj.d.b();
            uyj.c();
            if (!uyj.c.isEmpty() || !Collections.unmodifiableSet(((uyj) this.h.a(uyj.class)).b.keySet()).isEmpty() || !((uyt) this.h.a(uyt.class)).d() || !new HashSet(((uyt) this.h.a(uyt.class)).c.n()).isEmpty() || ((uws) this.h.a(uws.class)).a()) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "d", 1109, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Exception while waiting for BackgroundSubscribeCache init.");
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.i.c(new vfq(this, "NearbyMessagesService.dump", printWriter, countDownLatch));
        try {
            countDownLatch.await(10, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "dump", 1079, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted during dump");
        }
    }

    public final IBinder onBind(Intent intent) {
        jjg jjg = tgc.a;
        hashCode();
        if ("com.google.android.gms.nearby.messages.service.NearbyMessagesService.START".equals(intent.getAction())) {
            return new vfs(this);
        }
        if (!"com.google.android.gms.nearby.messages.service.ACTION_DEBUG_POKE".equals(intent.getAction())) {
            return null;
        }
        uyd.a(this);
        synchronized (NearbyMessagesChimeraService.class) {
            p = new WeakReference(this.h);
        }
        return new vfs(this);
    }

    public final void onCreate() {
        super.onCreate();
        jjg jjg = tgc.a;
        hashCode();
        thl thl = new thl(this);
        thl.a((thn) new vfv());
        this.h = thl;
        this.g = new vgm(this);
        arwg arwg = (arwg) this.h.a(arwg.class);
        this.i = arwg;
        try {
            arwg.a((arwm) new vfj(this, "EventLoop.Initializer"));
            this.e = new CountDownLatch(1);
            if (this.l == null) {
                this.l = new vfp(this, "nearby");
                jca.a().a(this, asec.a((Context) this), this.l, 1);
            }
            this.i.c(new vfk(this, "resetNearbyDirect"));
            OptInChangeBroadcastReceiver optInChangeBroadcastReceiver = new OptInChangeBroadcastReceiver();
            this.m = optInChangeBroadcastReceiver;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.nearby.settings.MESSAGES_OPT_IN_CHANGE");
            registerReceiver(optInChangeBroadcastReceiver, intentFilter);
            AppUninstallAndForceStopReceiver appUninstallAndForceStopReceiver = new AppUninstallAndForceStopReceiver();
            this.n = appUninstallAndForceStopReceiver;
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.PACKAGE_FULLY_REMOVED");
            intentFilter2.addAction("android.intent.action.PACKAGE_RESTARTED");
            intentFilter2.addDataScheme("package");
            registerReceiver(appUninstallAndForceStopReceiver, intentFilter2);
            CopresenceBroadcastReceiver copresenceBroadcastReceiver = this.f;
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
            registerReceiver(copresenceBroadcastReceiver, intentFilter3);
            jkn a2 = jkn.a(this);
            this.o = a2;
            a2.a(new vfu(this), new qvr());
            this.j = new uwl(this, "com.google.android.gms.nearby.messages.service.NearbyMessagesService");
        } catch (InterruptedException e2) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "onCreate", 384, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted during initialization");
            Thread.currentThread().interrupt();
        }
    }

    public final void onDestroy() {
        Class<NearbyMessagesChimeraService> cls = NearbyMessagesChimeraService.class;
        jjg jjg = tgc.a;
        hashCode();
        try {
            vfl vfl = new vfl(this, "destroyLocator");
            if (!aync.a.a().G()) {
                this.i.a((arwm) vfl);
            } else {
                ((arwl) this.i.a).a(vfl, true);
            }
            synchronized (cls) {
                p = null;
            }
        } catch (InterruptedException e2) {
            try {
                anih anih = (anih) tgc.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "onDestroy", 453, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Attempted to wait for EventLoop to destroy locator, but was interrupted.");
                this.h.a();
                synchronized (cls) {
                    p = null;
                }
            } catch (Throwable th) {
                synchronized (cls) {
                    p = null;
                    throw th;
                }
            }
        }
        try {
            unregisterReceiver(this.n);
            unregisterReceiver(this.m);
            unregisterReceiver(this.f);
            this.o.b();
        } catch (IllegalArgumentException e3) {
        }
        if (this.l != null) {
            try {
                jca.a().a((Context) this, this.l);
            } catch (IllegalArgumentException e4) {
                if (aync.a.a().E()) {
                    throw e4;
                }
            }
            this.h.a(ased.class, (Object) null);
            this.l = null;
        }
        super.onDestroy();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int onStartCommand(android.content.Intent r7, int r8, int r9) {
        /*
            r6 = this;
            java.lang.String r8 = "com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService"
            java.lang.String r9 = "onStartCommand"
            java.lang.String r0 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r1 = 1
            boolean r2 = k     // Catch:{ all -> 0x00bf }
            r3 = 0
            if (r2 != 0) goto L_0x001f
            k = r1     // Catch:{ all -> 0x00bf }
            thl r2 = r6.h     // Catch:{ all -> 0x00bf }
            java.lang.Class<arwg> r4 = defpackage.arwg.class
            java.lang.Object r2 = r2.a((java.lang.Class) r4)     // Catch:{ all -> 0x00bf }
            arwg r2 = (defpackage.arwg) r2     // Catch:{ all -> 0x00bf }
            arwm r4 = r6.q     // Catch:{ all -> 0x00bf }
            r2.c(r4)     // Catch:{ all -> 0x00bf }
            r2 = 0
            goto L_0x0020
        L_0x001f:
            r2 = 1
        L_0x0020:
            if (r7 != 0) goto L_0x0029
            jjg r7 = defpackage.tgc.a     // Catch:{ all -> 0x00bc }
            r6.hashCode()     // Catch:{ all -> 0x00bc }
            goto L_0x00b6
        L_0x0029:
            jjg r4 = defpackage.tgc.a     // Catch:{ all -> 0x00bc }
            r6.hashCode()     // Catch:{ all -> 0x00bc }
            r7.getAction()     // Catch:{ all -> 0x00bc }
            boolean r4 = defpackage.ikh.a((android.content.Intent) r7)     // Catch:{ all -> 0x00bc }
            if (r4 == 0) goto L_0x004c
            uwl r8 = r6.j     // Catch:{ all -> 0x00bc }
            ikh r9 = r8.a     // Catch:{ all -> 0x00bc }
            r9.c((android.content.Intent) r7)     // Catch:{ all -> 0x00bc }
            ikh r7 = r8.a     // Catch:{ all -> 0x00bc }
            boolean r7 = r7.a()     // Catch:{ all -> 0x00bc }
            if (r7 == 0) goto L_0x00b6
            java.util.concurrent.CountDownLatch r7 = r8.b     // Catch:{ all -> 0x00bc }
            r7.countDown()     // Catch:{ all -> 0x00bc }
            goto L_0x00b6
        L_0x004c:
            java.lang.String r4 = "com.google.android.gms.nearby.messages.service.STOP_CLIENT"
            java.lang.String r5 = r7.getAction()     // Catch:{ all -> 0x00bc }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00bc }
            if (r4 == 0) goto L_0x007b
            java.lang.String r4 = "com.google.android.gms.nearby.messages.CALLING_APP_PACKAGE_NAME"
            java.lang.String r7 = r7.getStringExtra(r4)     // Catch:{ all -> 0x00bc }
            if (r7 != 0) goto L_0x0076
            jjg r7 = defpackage.tgc.a     // Catch:{ all -> 0x00bc }
            anie r7 = r7.b()     // Catch:{ all -> 0x00bc }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x00bc }
            r3 = 570(0x23a, float:7.99E-43)
            anie r7 = r7.a((java.lang.String) r8, (java.lang.String) r9, (int) r3, (java.lang.String) r0)     // Catch:{ all -> 0x00bc }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x00bc }
            java.lang.String r8 = "Missing CallingAppPackageName in Intent."
            r7.a((java.lang.String) r8)     // Catch:{ all -> 0x00bc }
            goto L_0x00b6
        L_0x0076:
            r6.a((java.lang.String) r7, (boolean) r3)     // Catch:{ all -> 0x00bc }
            goto L_0x00b6
        L_0x007b:
            int r8 = com.google.android.gms.nearby.messages.GcmChimeraBroadcastReceiver.b     // Catch:{ all -> 0x00bc }
            java.lang.String r8 = "isCopresenceGcm"
            boolean r8 = r7.getBooleanExtra(r8, r3)     // Catch:{ all -> 0x00bc }
            if (r8 != 0) goto L_0x00aa
            java.lang.String r8 = "com.google.android.gms.nearby.messages.service.START_SERVICE_PERSISTENT"
            java.lang.String r9 = r7.getAction()     // Catch:{ all -> 0x00bc }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x00bc }
            if (r8 != 0) goto L_0x00bb
            java.lang.String r8 = "com.google.android.gms.nearby.messages.service.POPULATE_CACHE"
            java.lang.String r7 = r7.getAction()     // Catch:{ all -> 0x00bc }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x00bc }
            if (r7 == 0) goto L_0x00b6
            arwg r7 = r6.i     // Catch:{ all -> 0x00bc }
            vfo r8 = new vfo     // Catch:{ all -> 0x00bc }
            java.lang.String r9 = "offlineCachePopulate"
            r8.<init>(r6, r9)     // Catch:{ all -> 0x00bc }
            r7.c(r8)     // Catch:{ all -> 0x00bc }
            goto L_0x00b6
        L_0x00aa:
            arwg r8 = r6.i     // Catch:{ all -> 0x00bc }
            vfn r9 = new vfn     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "handleGcmMessage"
            r9.<init>(r6, r0, r7)     // Catch:{ all -> 0x00bc }
            r8.c(r9)     // Catch:{ all -> 0x00bc }
        L_0x00b6:
            if (r2 == 0) goto L_0x00bb
            r6.f()
        L_0x00bb:
            return r1
        L_0x00bc:
            r7 = move-exception
            r1 = r2
            goto L_0x00c0
        L_0x00bf:
            r7 = move-exception
        L_0x00c0:
            if (r1 == 0) goto L_0x00c5
            r6.f()
        L_0x00c5:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService.onStartCommand(android.content.Intent, int, int):int");
    }

    public final boolean onUnbind(Intent intent) {
        jjg jjg = tgc.a;
        hashCode();
        synchronized (a) {
            Map map = this.d;
            if (map != null) {
                for (vgh a2 : map.values()) {
                    a2.a(false, true);
                }
            }
        }
        this.i.c(new vfm(this, "discardForegroundImpls"));
        f();
        return true;
    }

    /* access modifiers changed from: private */
    public final void a(String str, boolean z) {
        jjg jjg = tgc.a;
        amzy a2 = a(str);
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((vgh) a2.get(i2)).a(z, false);
        }
    }

    public final amzy a(String str) {
        String str2;
        synchronized (a) {
            if (this.d != null) {
                ArrayList arrayList = new ArrayList(2);
                for (Map.Entry entry : this.d.entrySet()) {
                    ClientAppContext clientAppContext = ((ClientAppIdentifier) entry.getKey()).c;
                    if (clientAppContext.b.equals(str) || (clientAppContext.b.equals("com.google.android.gms") && (str2 = clientAppContext.c) != null && str2.equals(str))) {
                        arrayList.add((vgh) entry.getValue());
                    }
                }
                amzy a2 = amzy.a((Collection) arrayList);
                return a2;
            }
            amzy h2 = amzy.h();
            return h2;
        }
    }

    public final vgh a(ClientAppIdentifier clientAppIdentifier) {
        vgh vgh;
        synchronized (a) {
            if (this.d == null) {
                this.d = new nz();
            }
            vgh = (vgh) this.d.get(clientAppIdentifier);
            if (vgh == null) {
                vgh = new vgh(this, clientAppIdentifier, this.j);
                this.d.put(clientAppIdentifier, vgh);
            }
        }
        return vgh;
    }

    /* access modifiers changed from: protected */
    public final boolean a(long j2, SubscribeRequest subscribeRequest, ClientAppIdentifier clientAppIdentifier, String str, List list) {
        String a2;
        SubscribeRequest subscribeRequest2 = subscribeRequest;
        ClientAppIdentifier clientAppIdentifier2 = clientAppIdentifier;
        if (subscribeRequest2 == null || clientAppIdentifier2 == null) {
            ((anih) ((anih) tgc.a.c()).a("com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService", "a", 275, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearbyMessagesService: Failed resubscribing, null subscribeRequest(%s) or clientAppIdentifier(%s).", (Object) subscribeRequest2, (Object) clientAppIdentifier2);
            return false;
        }
        int elapsedRealtime = j2 != Long.MAX_VALUE ? (int) ((j2 - SystemClock.elapsedRealtime()) / 1000) : Integer.MAX_VALUE;
        PendingIntent pendingIntent = subscribeRequest2.f;
        if (!(elapsedRealtime <= 0 || pendingIntent == null || (a2 = vcr.a(pendingIntent)) == null)) {
            try {
                if (getPackageManager().getApplicationInfo(a2, 0).enabled && !subscribeRequest2.o) {
                    if (!list.isEmpty()) {
                        uyp uyp = new uyp(pendingIntent);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            avae avae = (avae) it.next();
                            auzr auzr = avae.c;
                            if (auzr == null) {
                                auzr = auzr.e;
                            }
                            Message a3 = vem.a(auzr);
                            if (aync.i()) {
                                if (subscribeRequest2.e.a(a3)) {
                                    vdx vdx = new vdx();
                                    vdx.b = a3;
                                    vdx.d();
                                    uyp.a((Context) this, vdx.a());
                                }
                            } else if (avae.b.contains(str)) {
                                vdx vdx2 = new vdx();
                                vdx2.b = a3;
                                vdx2.d();
                                uyp.a((Context) this, vdx2.a());
                            }
                        }
                    }
                    uyk uyk = new uyk(subscribeRequest2.c);
                    uyk.a(elapsedRealtime);
                    Strategy a4 = uyk.a();
                    SubscribeRequest subscribeRequest3 = new SubscribeRequest((IBinder) null, a4, (IBinder) null, subscribeRequest2.e, subscribeRequest2.f, subscribeRequest2.j, (IBinder) null, false, subscribeRequest2.p, subscribeRequest2.q);
                    vgh a5 = a(clientAppIdentifier2);
                    if (a4.c()) {
                        a5.a(2);
                    }
                    if (a4.d()) {
                        a5.a(6);
                    }
                    if (a4.e()) {
                        a5.a(1);
                    }
                    a5.a(subscribeRequest3);
                    return true;
                }
            } catch (PackageManager.NameNotFoundException e2) {
            }
        }
        return false;
    }
}
