package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: bmp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bmp extends Service implements bmg {
    static final long a = TimeUnit.SECONDS.toMillis(7);
    public long b;
    public boolean c;
    public final Object d = new Object();
    public final List e = new ArrayList();
    public int f = 0;
    public boolean g = false;
    public final SparseArray h = new SparseArray();
    private boolean i;
    private Handler j;
    private final bnh k;
    private final ReentrantLock l = new ReentrantLock();
    private final Deque m = new ArrayDeque();
    private final SparseArray n = new SparseArray();
    private long o = 0;
    private long p = 0;
    private bml q;
    private int r = 0;
    private int s = 0;
    private int t = 0;
    private int u = 0;
    private Thread v;
    private PendingIntent w = null;
    private final SparseArray x = new SparseArray();
    private boolean y = false;

    public bmp(bnh bnh) {
        this.k = bnh;
    }

    /* JADX INFO: finally extract failed */
    private final int a(String str, Intent intent, bmh bmh) {
        Intent intent2;
        Intent intent3;
        String str2 = null;
        if ("com.google.android.chimera.container.IntentOperationService.WAKEFUL_INTENT".equals(str)) {
            Intent intent4 = bmh.e;
            if (intent4 == null || (intent3 = (Intent) intent4.getParcelableExtra("intent")) == null) {
                str = null;
            } else {
                bmh.f = bmh.e;
                bmh.e = intent3;
                str = bmh.e.getAction();
            }
            if (str == null) {
                Log.w("IntentOperationSvc", "Dropping malformed WAKEFUL_INTENT_ACTION");
            }
        }
        if ("com.google.android.chimera.container.IntentOperationService.EXTERNAL_INTENT".equals(str)) {
            Intent intent5 = bmh.e;
            if (!(intent5 == null || (intent2 = (Intent) intent5.getParcelableExtra("intent")) == null)) {
                bmh.k = true;
                bmh.e = intent2;
                str2 = bmh.e.getAction();
            }
            if (str2 == null) {
                Log.w("IntentOperationSvc", "Dropping malformed EXTERNAL_INTENT_ACTION");
            }
            str = str2;
        }
        if ("com.google.android.chimera.container.IntentOperationService.MODULE_SPECIFIC".equals(str) && ((str = bmh.a()) == null || bmh.j == null)) {
            Log.w("IntentOperationSvc", "Dropping malformed MODULE_SPECIFIC_ACTION");
        }
        if (str == null) {
            bmh.b();
            return 2;
        } else if ("com.google.android.chimera.container.IntentOperationService.RELEASE_WAKELOCK_ACTION".equals(str)) {
            b(intent);
            bmh.b();
            a(true);
            return 2;
        } else if ("com.google.android.chimera.container.IntentOperationService.KEEPALIVE".equals(str)) {
            int intExtra = intent.getIntExtra("keepAliveDuration", 0);
            if (intExtra > 0) {
                long uptimeMillis = SystemClock.uptimeMillis() + ((long) intExtra);
                long j2 = this.p;
                if (j2 > uptimeMillis) {
                    uptimeMillis = j2;
                }
                this.p = uptimeMillis;
                bnh bnh = this.k;
                synchronized (bnh.c) {
                    int i2 = bnh.e - 1;
                    bnh.e = i2;
                    if (i2 < 0) {
                        Log.e("WakelockManager", "Keep alive invocation counter should never be below zero.");
                    }
                }
            }
            bmh.b();
            a(true);
            return 2;
        } else {
            bml bml = this.q;
            bml.f.lock();
            try {
                bml.c.execute(new bmj(bml, bmh));
                bml.h++;
                bml.f.unlock();
                this.j.removeMessages(0);
                return 3;
            } catch (Throwable th) {
                bml.f.unlock();
                throw th;
            }
        }
    }

    private final void b(Intent intent) {
        boolean z;
        bnh bnh = this.k;
        synchronized (bnh.c) {
            boolean z2 = true;
            if (bnh.c.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            int intExtra = intent.getIntExtra("wakelockId", -1);
            if (intExtra != -1) {
                if (intent.getLongExtra("uniqueId", 0) == bnh.b) {
                    Object obj = bnh.c.get(intExtra);
                    if (obj == null) {
                        long j2 = bnh.b;
                        StringBuilder sb = new StringBuilder(71);
                        sb.append("No active wake lock id #");
                        sb.append(intExtra);
                        sb.append(" and unique id #");
                        sb.append(j2);
                        Log.w("WakelockManager", sb.toString());
                    } else {
                        bnh.a(obj);
                        bnh.c.remove(intExtra);
                        if (bnh.c.size() != 0) {
                            z2 = false;
                        }
                        z = z2;
                    }
                }
            }
        }
        if (z) {
            this.p = 0;
        }
    }

    public void a(IntentOperation intentOperation, Context context) {
        throw null;
    }

    public final void c() {
        int size;
        int[] iArr;
        Parcelable[] parcelableArr;
        synchronized (this.h) {
            size = this.h.size();
            iArr = new int[size];
            parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.h.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.h.valueAt(i2);
            }
        }
        if (size == 0 || iArr[0] > this.t) {
            this.r = 0;
        }
        Intent putExtra = a("com.google.android.chimera.container.IntentOperationService.SAVED_INTENT").putExtra("requestCodes", iArr).putExtra("pendingIntents", parcelableArr).putExtra("crashCount", this.r);
        PendingIntent pendingIntent = this.w;
        PendingIntent service = PendingIntent.getService(this, 0, putExtra, 134217728);
        this.w = service;
        if (pendingIntent != null) {
            return;
        }
        if (service != null) {
            try {
                ((AlarmManager) getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + 315360000000L, service);
            } catch (SecurityException e2) {
                Log.w("IntentOperationSvc", "Failed to save index PendingIntent in AlarmManager.");
            }
        } else {
            throw new SecurityException("indexPendingIntent is null.");
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print("IntentOperationService [");
        printWriter.print(getClass().getName());
        printWriter.println("] active actions:");
        bml bml = this.q;
        bml.f.lock();
        try {
            ArrayList arrayList = new ArrayList(bml.g.keySet());
            bml.f.unlock();
            Collections.sort(arrayList);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                printWriter.print("  ");
                printWriter.println((String) arrayList.get(i2));
            }
        } catch (Throwable th) {
            bml.f.unlock();
            throw th;
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.b = SystemClock.uptimeMillis();
        do {
        } while (SystemClock.uptimeMillis() == this.b);
        this.i = this.k.d.getClassName().equals(getContainerService().getClass().getName());
        bml bml = new bml(this.l, this.k, getContainerService(), this);
        this.q = bml;
        String name = bml.getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 19);
        sb.append("[");
        sb.append(name);
        sb.append("] operation loader");
        bml.c = Executors.newSingleThreadExecutor(new bqa(sb.toString()));
        String name2 = bml.getClass().getName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 7);
        sb2.append("[");
        sb2.append(name2);
        sb2.append("] idle");
        bml.b = sb2.toString();
        bml.d = new ThreadPoolExecutor(1, 25, 5, TimeUnit.SECONDS, new SynchronousQueue(), new bqa(bml.b));
        bml.d.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        this.j = new bmo(this);
        bkn.b();
        boolean j2 = hei.j();
        this.y = j2;
        if (j2) {
            bkn.b();
            if (awxo.a.a().I()) {
                Thread thread = new Thread(new bmn(this), getClass().getSimpleName());
                this.v = thread;
                thread.start();
            }
        }
        if (this.y) {
            synchronized (this.d) {
                PendingIntent service = PendingIntent.getService(this, 0, a("com.google.android.chimera.container.IntentOperationService.SAVED_INTENT"), 536870912);
                if (service != null) {
                    try {
                        service.send(this, 0, new Intent().putExtra("uniqueid", this.b));
                        this.c = true;
                    } catch (PendingIntent.CanceledException e2) {
                        Log.w("IntentOperationSvc", "Failed to send index PendingIntent. Continue as a fresh start.");
                        this.c = false;
                    }
                } else {
                    this.c = false;
                }
            }
        }
    }

    public final void onDestroy() {
        if (this.y) {
            Thread thread = this.v;
            if (thread != null) {
                thread.interrupt();
                try {
                    thread.join();
                } catch (InterruptedException e2) {
                }
            }
            PendingIntent pendingIntent = this.w;
            if (pendingIntent != null) {
                ((AlarmManager) getSystemService("alarm")).cancel(pendingIntent);
                pendingIntent.cancel();
            }
        }
        bml bml = this.q;
        bml.c.shutdown();
        bml.d.shutdown();
        super.onDestroy();
    }

    /* JADX INFO: finally extract failed */
    public final int onStartCommand(Intent intent, int i2, int i3) {
        boolean a2;
        boolean z = false;
        String str = null;
        if (this.y) {
            if (intent != null && "com.google.android.chimera.container.IntentOperationService.NEW_START_INTENT".equals(intent.getAction())) {
                bmh a3 = this.q.a(intent, i2, i3, (List) null);
                this.l.lock();
                try {
                    a3.a();
                    intent = a3.e;
                } finally {
                    this.l.unlock();
                }
            }
            if (this.v != null) {
                if (intent != null) {
                    String action = intent.getAction();
                    synchronized (this.d) {
                        this.u = i3;
                        if (!"com.google.android.chimera.container.IntentOperationService.NO_OP".equals(action)) {
                            this.e.add(intent);
                            this.f = i3;
                            this.d.notifyAll();
                            return 3;
                        }
                    }
                }
                a(true);
                return 1;
            }
            if (intent != null) {
                str = intent.getAction();
            }
            if (intent != null) {
                if (this.c) {
                    synchronized (this.d) {
                        if ("com.google.android.chimera.container.IntentOperationService.SAVED_INTENT".equals(str)) {
                            if (intent.getLongExtra("uniqueid", -1) == this.b) {
                                synchronized (this.h) {
                                    a(intent, this.e);
                                }
                                this.e.clear();
                                c();
                                stopSelf(this.u);
                                this.c = false;
                            }
                        }
                        this.e.add(intent);
                        this.u = i3;
                        return 3;
                    }
                }
                synchronized (this.h) {
                    a2 = a(intent);
                }
                z = a2;
                b();
            }
            synchronized (this.d) {
                this.u = i3;
                if (z) {
                    c();
                }
                if (this.x.size() > 0) {
                    return 1;
                }
                a(true);
                return 2;
            }
        } else if (intent == null) {
            return 2;
        } else {
            bmh a4 = this.q.a(intent, i2, i3, (List) null);
            this.l.lock();
            try {
                String action2 = intent.getAction();
                if (!"com.google.android.chimera.container.IntentOperationService.NEW_START_INTENT".equals(action2)) {
                    str = action2;
                } else if (!intent.hasExtra("startid") || !intent.hasExtra("intent")) {
                    Log.w("IntentOperationSvc", "Dropping malformed NEW_START_ACTION");
                } else if (intent.getLongExtra("uniqueid", -1) == this.b) {
                    int indexOfKey = this.n.indexOfKey(intent.getIntExtra("startid", -1));
                    if (indexOfKey >= 0) {
                        a4 = (bmh) this.n.valueAt(indexOfKey);
                        this.n.removeAt(indexOfKey);
                        str = action2;
                    } else {
                        Log.w("IntentOperationSvc", "Dropping NEW_START_ACTION with invalid startId");
                    }
                } else {
                    str = a4.a();
                    if (str == null) {
                        Log.w("IntentOperationSvc", "Dropping intent-less NEW_START_ACTION");
                    }
                }
                this.m.addLast(a4);
                if ("com.google.android.chimera.container.IntentOperationService.NEW_START_INTENT".equals(str)) {
                    amtf.a(a4.i);
                    a4.i = false;
                    a4.g = i3;
                    a4.b();
                    this.l.unlock();
                    return 3;
                }
                int a5 = a(str, intent, a4);
                this.l.unlock();
                return a5;
            } catch (Throwable th) {
                this.l.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void b() {
        Intent intent;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.x.size() && (intent = (Intent) this.x.valueAt(i3)) != null) {
            int keyAt = this.x.keyAt(i3);
            if (keyAt <= this.t) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            Intent intent2 = (Intent) intent.getParcelableExtra("intent");
            amtf.a((Object) intent2);
            this.l.lock();
            try {
                if (a(intent2.getAction(), intent2, this.q.a(intent2, i2, keyAt, intent.getStringArrayListExtra("blacklistedOperations"))) == 2) {
                    a(keyAt);
                }
                this.l.unlock();
                i4++;
                i3++;
            } catch (Throwable th) {
                this.l.unlock();
                throw th;
            }
        }
        for (int i5 = 0; i5 < i4; i5++) {
            this.x.removeAt(i5);
        }
    }

    public final void b(bmh bmh) {
        Intent intent = bmh.f;
        if (intent != null) {
            if (!this.i) {
                intent.removeExtra("intent");
                bmh.f.setAction("com.google.android.chimera.container.IntentOperationService.RELEASE_WAKELOCK_ACTION");
                bmh.f.setComponent(this.k.d);
                startService(bmh.f);
            } else {
                b(intent);
                a(true);
            }
            bmh.f = null;
        }
    }

    private final void a(int i2) {
        synchronized (this.h) {
            int indexOfKey = this.h.indexOfKey(i2);
            if (indexOfKey >= 0) {
                ((PendingIntent) this.h.valueAt(indexOfKey)).cancel();
                this.h.removeAt(indexOfKey);
            }
        }
    }

    public final Intent a(String str) {
        return new Intent(this, getContainerService().getClass()).setPackage(getPackageName()).setAction(str);
    }

    public IntentOperation a(Constructor constructor, Context context) {
        return (IntentOperation) constructor.newInstance(new Object[0]);
    }

    public final void a() {
        this.o = SystemClock.uptimeMillis() + a;
        a(true);
    }

    public final void a(Intent intent, List list) {
        this.r = intent.getIntExtra("crashCount", 0) + 1;
        int[] intArrayExtra = intent.getIntArrayExtra("requestCodes");
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("pendingIntents");
        if (this.r >= 4) {
            Log.e("IntentOperationSvc", "Dropping the index due to too many crashes. Continue as a fresh start.");
            this.r = 0;
            intArrayExtra = new int[0];
        } else if (intArrayExtra == null || parcelableArrayExtra == null || intArrayExtra.length != parcelableArrayExtra.length) {
            Log.e("IntentOperationSvc", "Dropping the index due to malformed data. Continue as a fresh start.");
            this.r = 0;
            intArrayExtra = new int[0];
        }
        for (int i2 = 0; i2 < intArrayExtra.length; i2++) {
            Parcelable parcelable = parcelableArrayExtra[i2];
            if (parcelable != null && (parcelable instanceof PendingIntent)) {
                int i3 = intArrayExtra[i2];
                this.s = i3;
                this.h.append(i3, (PendingIntent) parcelable);
                this.x.append(this.s, (Object) null);
            }
        }
        this.t = this.s;
        int size = this.x.size();
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            a((Intent) list.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            if (this.x.valueAt(i6) == null) {
                try {
                    ((PendingIntent) this.h.valueAt(i6)).send();
                } catch (PendingIntent.CanceledException e2) {
                    intArrayExtra[i5] = i6;
                    i5++;
                }
            }
        }
        for (int i7 = 0; i7 < i5; i7++) {
            this.h.removeAt(intArrayExtra[i7]);
            this.x.removeAt(intArrayExtra[i7]);
        }
    }

    public final void a(bmh bmh) {
        boolean z;
        if (bmh.e == null) {
            z = true;
        } else {
            z = false;
        }
        amtf.a(z);
        if (this.y) {
            a(bmh.g);
        } else if (!bmh.b) {
            while (true) {
                amtf.a(!this.m.isEmpty());
                bmh bmh2 = (bmh) this.m.remove();
                amtf.a(!bmh2.i);
                if (bmh2 == bmh) {
                    break;
                }
                Intent intent = bmh2.e;
                if (intent != null) {
                    String str = bmh2.j;
                    if (str != null) {
                        intent = IntentOperation.getModuleSpecificIntent(str, intent);
                    }
                    if (bmh2.k) {
                        intent = IntentOperation.getExternalIntent(intent);
                    }
                    Intent intent2 = bmh2.f;
                    if (intent2 != null) {
                        intent = intent2;
                    }
                    startService(new Intent(this, getContainerService().getClass()).setAction("com.google.android.chimera.container.IntentOperationService.NEW_START_INTENT").putExtra("uniqueid", this.b).putExtra("startid", bmh2.g).putExtra("intent", intent));
                    this.n.append(bmh2.g, bmh2);
                    amtf.a(!bmh2.i);
                    bmh2.i = true;
                    bmh2.h++;
                } else {
                    amtf.a(bmh2.b);
                }
            }
            if (this.m.isEmpty() && this.n.size() == 0) {
                startService(new Intent(this, getContainerService().getClass()).setAction("com.google.android.chimera.container.IntentOperationService.KEEPALIVE"));
            }
            stopSelf(bmh.g);
        }
    }

    public final void a(bmh bmh, String str) {
        amtf.a(this.y);
        int i2 = bmh.g;
        ArrayList arrayList = new ArrayList();
        List list = bmh.d;
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(str);
        PendingIntent.getService(this, i2, a("com.google.android.chimera.container.IntentOperationService.SAVED_INTENT").putExtra("intent", bmh.c).putExtra("requestCode", i2).putStringArrayListExtra("blacklistedOperations", arrayList), 134217728);
    }

    public final void a(IntentOperation intentOperation) {
        intentOperation.onDestroy();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        if (r6.g != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r7) {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r6.l
            r0.lock()
            bml r0 = r6.q     // Catch:{ all -> 0x00de }
            java.util.concurrent.locks.ReentrantLock r1 = r0.f     // Catch:{ all -> 0x00de }
            r1.lock()     // Catch:{ all -> 0x00de }
            int r1 = r0.h     // Catch:{ all -> 0x00d7 }
            java.util.concurrent.locks.ReentrantLock r0 = r0.f     // Catch:{ all -> 0x00de }
            r0.unlock()     // Catch:{ all -> 0x00de }
            if (r1 > 0) goto L_0x00d3
            boolean r0 = r6.y     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x0029
            android.util.SparseArray r0 = r6.n     // Catch:{ all -> 0x00de }
            int r0 = r0.size()     // Catch:{ all -> 0x00de }
            if (r0 > 0) goto L_0x0022
            goto L_0x0029
        L_0x0022:
            java.util.concurrent.locks.ReentrantLock r7 = r6.l
        L_0x0024:
        L_0x0025:
            r7.unlock()
            return
        L_0x0029:
            boolean r0 = r6.y     // Catch:{ all -> 0x00de }
            r1 = 0
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r6.d     // Catch:{ all -> 0x00de }
            monitor-enter(r0)     // Catch:{ all -> 0x00de }
            java.util.List r2 = r6.e     // Catch:{ all -> 0x0049 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0049 }
            if (r2 != 0) goto L_0x003a
            goto L_0x0041
        L_0x003a:
            if (r7 != 0) goto L_0x003d
            goto L_0x0045
        L_0x003d:
            boolean r7 = r6.g     // Catch:{ all -> 0x0049 }
            if (r7 == 0) goto L_0x0045
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            java.util.concurrent.locks.ReentrantLock r7 = r6.l
            goto L_0x0024
        L_0x0045:
            int r7 = r6.u     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r7     // Catch:{ all -> 0x00de }
        L_0x004c:
            r7 = 0
        L_0x004d:
            long r2 = r6.o     // Catch:{ all -> 0x00de }
            long r4 = r6.p     // Catch:{ all -> 0x00de }
            long r2 = java.lang.Math.max(r2, r4)     // Catch:{ all -> 0x00de }
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00de }
            long r2 = r2 - r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
            android.os.Handler r7 = r6.j     // Catch:{ all -> 0x00de }
            r7.sendEmptyMessageDelayed(r1, r2)     // Catch:{ all -> 0x00de }
            goto L_0x00c1
        L_0x0066:
            bnh r0 = r6.k     // Catch:{ all -> 0x00de }
            android.util.SparseArray r2 = r0.c     // Catch:{ all -> 0x00de }
            monitor-enter(r2)     // Catch:{ all -> 0x00de }
            int r3 = r0.e     // Catch:{ all -> 0x00d0 }
            if (r3 > 0) goto L_0x009a
            android.util.SparseArray r3 = r0.c     // Catch:{ all -> 0x00d0 }
            int r3 = r3.size()     // Catch:{ all -> 0x00d0 }
            if (r3 != 0) goto L_0x0079
            monitor-exit(r2)     // Catch:{ all -> 0x00d0 }
            goto L_0x009b
        L_0x0079:
            r3 = 0
        L_0x007a:
            android.util.SparseArray r4 = r0.c     // Catch:{ all -> 0x00d0 }
            int r4 = r4.size()     // Catch:{ all -> 0x00d0 }
            if (r3 < r4) goto L_0x008e
            android.util.SparseArray r3 = r0.c     // Catch:{ all -> 0x00d0 }
            r3.clear()     // Catch:{ all -> 0x00d0 }
            r0.a()     // Catch:{ all -> 0x00d0 }
            r0.a = r1     // Catch:{ all -> 0x00d0 }
            monitor-exit(r2)     // Catch:{ all -> 0x00d0 }
            goto L_0x009b
        L_0x008e:
            android.util.SparseArray r4 = r0.c     // Catch:{ all -> 0x00d0 }
            java.lang.Object r4 = r4.valueAt(r3)     // Catch:{ all -> 0x00d0 }
            r0.a(r4)     // Catch:{ all -> 0x00d0 }
            int r3 = r3 + 1
            goto L_0x007a
        L_0x009a:
            monitor-exit(r2)     // Catch:{ all -> 0x00d0 }
        L_0x009b:
            boolean r0 = r6.y     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x00c9
            java.util.Deque r7 = r6.m     // Catch:{ all -> 0x00de }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x00de }
            if (r7 != 0) goto L_0x00c5
        L_0x00a7:
            java.util.Deque r7 = r6.m     // Catch:{ all -> 0x00de }
            java.lang.Object r7 = r7.remove()     // Catch:{ all -> 0x00de }
            bmh r7 = (defpackage.bmh) r7     // Catch:{ all -> 0x00de }
            boolean r0 = r7.b     // Catch:{ all -> 0x00de }
            defpackage.amtf.a((boolean) r0)     // Catch:{ all -> 0x00de }
            java.util.Deque r0 = r6.m     // Catch:{ all -> 0x00de }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x00a7
            int r7 = r7.g     // Catch:{ all -> 0x00de }
            r6.stopSelf(r7)     // Catch:{ all -> 0x00de }
        L_0x00c1:
            java.util.concurrent.locks.ReentrantLock r7 = r6.l
            goto L_0x0024
        L_0x00c5:
            java.util.concurrent.locks.ReentrantLock r7 = r6.l
            goto L_0x0024
        L_0x00c9:
            r6.stopSelf(r7)     // Catch:{ all -> 0x00de }
            java.util.concurrent.locks.ReentrantLock r7 = r6.l
            goto L_0x0024
        L_0x00d0:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d0 }
            throw r7     // Catch:{ all -> 0x00de }
        L_0x00d3:
            java.util.concurrent.locks.ReentrantLock r7 = r6.l
            goto L_0x0025
        L_0x00d7:
            r7 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r0.f     // Catch:{ all -> 0x00de }
            r0.unlock()     // Catch:{ all -> 0x00de }
            throw r7     // Catch:{ all -> 0x00de }
        L_0x00de:
            r7 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r6.l
            r0.unlock()
            goto L_0x00e6
        L_0x00e5:
            throw r7
        L_0x00e6:
            goto L_0x00e5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmp.a(boolean):void");
    }

    public final boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        if ("com.google.android.chimera.container.IntentOperationService.SAVED_INTENT".equals(intent.getAction())) {
            int indexOfKey = this.x.indexOfKey(intent.getIntExtra("requestCode", 0));
            if (indexOfKey >= 0) {
                this.x.setValueAt(indexOfKey, intent);
            }
            return false;
        }
        this.s++;
        Intent putExtra = a("com.google.android.chimera.container.IntentOperationService.SAVED_INTENT").putExtra("intent", intent).putExtra("requestCode", this.s);
        this.h.append(this.s, PendingIntent.getService(this, this.s, putExtra, 134217728));
        this.x.append(this.s, putExtra);
        return true;
    }
}
