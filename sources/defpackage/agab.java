package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: agab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agab {
    public static final String a = agab.class.getSimpleName();
    private static final amry d = new afzt();
    private static final amry e = new afzu();
    private static final amry f = new afzv();
    public final afzx b;
    protected final List c = new ArrayList();
    private final Context g;
    private final Executor h;
    private final agac i;
    private final ConnectivityManager j;
    private final Map k = new HashMap();
    private final Map l = new HashMap();
    private final Queue m = new ConcurrentLinkedQueue();
    private boolean n = false;
    private final BroadcastReceiver o = new afzw(this);

    public agab(agac agac, Context context, Executor executor) {
        afzx afzx = new afzx();
        this.g = context;
        this.i = agac;
        this.h = executor;
        this.b = afzx;
        this.j = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static void a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (IllegalStateException e2) {
            } catch (NullPointerException e3) {
            }
        }
    }

    public static String b(File file, String str) {
        String absolutePath = file.getAbsolutePath();
        StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 1 + String.valueOf(str).length());
        sb.append(absolutePath);
        sb.append("/");
        sb.append(str);
        return sb.toString();
    }

    public final void c(afzs afzs) {
        List list;
        synchronized (this) {
            boolean isEmpty = this.m.isEmpty();
            this.m.add(afzs);
            if (isEmpty) {
                this.g.registerReceiver(this.o, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.n = true;
                a();
            }
            if (this.m.containsAll(this.k.values())) {
                list = b();
            } else {
                list = null;
            }
        }
        if (list != null) {
            a(list, d);
        }
    }

    private static final void a(List list, amry amry) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            amry.a((afzz) list.get(i2));
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized List b() {
        amzt j2;
        j2 = amzy.j();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            afzz afzz = (afzz) ((WeakReference) it.next()).get();
            if (afzz == null) {
                it.remove();
            } else {
                j2.c(afzz);
            }
        }
        return j2.a();
    }

    private static boolean a(Context context, String str) {
        return kf.a(context, str) == 0;
    }

    public final synchronized HttpURLConnection a(String str, String str2) {
        HttpURLConnection a2;
        if (a(this.g, "android.permission.INTERNET")) {
            a2 = this.i.a(str2);
            String str3 = this.b.b;
            this.l.put(str, a2);
        } else {
            throw new IllegalStateException("Missing INTERNET permission, can't start download");
        }
        return a2;
    }

    public final void b(afzs afzs) {
        a(b(), e);
        this.h.execute(new afzy(this, afzs));
    }

    public final synchronized void a() {
        int size = this.m.size();
        StringBuilder sb = new StringBuilder(49);
        sb.append("Running ");
        sb.append(size);
        sb.append(" requests pending connectivity");
        sb.toString();
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            afzs afzs = (afzs) it.next();
            if (a(afzs.a()) || afzs.b()) {
                it.remove();
                b(afzs);
            }
        }
        if (this.m.isEmpty() && this.n) {
            this.g.unregisterReceiver(this.o);
            this.n = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(afzs afzs) {
        String b2 = b(afzs.b, afzs.c);
        if (this.k.containsKey(b2)) {
            String str = a;
            String valueOf = String.valueOf(b2);
            Log.i(str, valueOf.length() == 0 ? new String("Request is already being executed for key: ") : "Request is already being executed for key: ".concat(valueOf));
            return;
        }
        this.k.put(b2, afzs);
        b(afzs);
    }

    public final synchronized void a(afzz afzz) {
        this.c.add(new WeakReference(afzz));
    }

    public final synchronized void a(File file, String str) {
        String b2 = b(file, str);
        afzs afzs = (afzs) this.k.get(b2);
        if (afzs != null) {
            afzs.d();
        } else {
            String valueOf = String.valueOf(b2);
            if (valueOf.length() == 0) {
                new String("Attempted to setCanceled unknown request: ");
            } else {
                "Attempted to setCanceled unknown request: ".concat(valueOf);
            }
        }
        a((HttpURLConnection) this.l.get(b2));
        if (afzs != null) {
            a();
        }
    }

    public final void a(File file, String str, afzq afzq, afzp afzp, File file2, long j2) {
        List list;
        List list2;
        String b2 = b(file, str);
        synchronized (this) {
            this.k.remove(b2);
            this.l.remove(b2);
            list = null;
            if (this.k.isEmpty()) {
                list = b();
                list2 = null;
            } else if (this.m.containsAll(this.k.values())) {
                list2 = b();
            } else {
                list2 = null;
            }
        }
        if (afzp != null) {
            afzq.a(file2, afzp);
        } else {
            afzq.a(file2, j2);
        }
        if (list != null) {
            a(list, f);
        } else if (list2 != null) {
            a(list2, d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a0, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(defpackage.afzr r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            afzr r0 = defpackage.afzr.NONE     // Catch:{ all -> 0x00a9 }
            r1 = 1
            if (r7 == r0) goto L_0x009d
            android.content.Context r0 = r6.g     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = a((android.content.Context) r0, (java.lang.String) r2)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a1
            android.net.ConnectivityManager r0 = r6.j     // Catch:{ all -> 0x00a9 }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ all -> 0x00a9 }
            r2 = 0
            if (r0 == 0) goto L_0x009f
            boolean r3 = r0.isConnected()     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x009f
            int r3 = r7.ordinal()     // Catch:{ all -> 0x00a9 }
            r4 = 17
            r5 = 9
            if (r3 == 0) goto L_0x007f
            if (r3 == r1) goto L_0x004c
            java.lang.String r0 = a     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = r7.name()     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = "Unknown connectivity type checked: "
            int r3 = r7.length()     // Catch:{ all -> 0x00a9 }
            if (r3 != 0) goto L_0x0043
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x00a9 }
            r7.<init>(r2)     // Catch:{ all -> 0x00a9 }
            goto L_0x0047
        L_0x0043:
            java.lang.String r7 = r2.concat(r7)     // Catch:{ all -> 0x00a9 }
        L_0x0047:
            android.util.Log.e(r0, r7)     // Catch:{ all -> 0x00a9 }
            monitor-exit(r6)
            return r1
        L_0x004c:
            int r7 = r0.getType()     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x007d
            int r7 = r0.getType()     // Catch:{ all -> 0x00a9 }
            r3 = 4
            if (r7 == r3) goto L_0x007d
            int r7 = r0.getType()     // Catch:{ all -> 0x00a9 }
            r3 = 6
            if (r7 == r3) goto L_0x007d
            int r7 = r0.getType()     // Catch:{ all -> 0x00a9 }
            r3 = 7
            if (r7 == r3) goto L_0x007d
            int r7 = r0.getType()     // Catch:{ all -> 0x00a9 }
            if (r7 == r1) goto L_0x007d
            int r7 = r0.getType()     // Catch:{ all -> 0x00a9 }
            if (r7 == r5) goto L_0x007d
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00a9 }
            int r7 = r0.getType()     // Catch:{ all -> 0x00a9 }
            if (r7 == r4) goto L_0x007d
            monitor-exit(r6)
            return r2
        L_0x007d:
            monitor-exit(r6)
            return r1
        L_0x007f:
            android.net.ConnectivityManager r7 = r6.j     // Catch:{ all -> 0x00a9 }
            boolean r7 = defpackage.ml.a(r7)     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x009d
            int r7 = r0.getType()     // Catch:{ all -> 0x00a9 }
            if (r7 == r1) goto L_0x009d
            int r7 = r0.getType()     // Catch:{ all -> 0x00a9 }
            if (r7 == r5) goto L_0x009d
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00a9 }
            int r7 = r0.getType()     // Catch:{ all -> 0x00a9 }
            if (r7 == r4) goto L_0x009d
            monitor-exit(r6)
            return r2
        L_0x009d:
            monitor-exit(r6)
            return r1
        L_0x009f:
            monitor-exit(r6)
            return r2
        L_0x00a1:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "Attempting to determine connectivity without the ACCESS_NETWORK_STATE permission."
            r7.<init>(r0)     // Catch:{ all -> 0x00a9 }
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agab.a(afzr):boolean");
    }
}
