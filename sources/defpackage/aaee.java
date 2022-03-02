package defpackage;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.scheduler.standalone.ContentTaskController$UserStartingReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: aaee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaee implements aabo {
    final ContentTaskController$UserStartingReceiver a = new ContentTaskController$UserStartingReceiver(this);
    private final ContentResolver b;
    private Handler c;
    private final Context d;
    private final aaez e;
    private final nz f = new nz();
    private final SparseArray g = new SparseArray();

    public aaee(Context context, aaez aaez) {
        this.d = context;
        this.b = context.getContentResolver();
        this.e = aaez;
    }

    private final void a(int i, Collection collection, int i2) {
        Intent intent = new Intent();
        intent.setClassName(this.d, "com.google.android.gms.gcm.nts.SchedulerInternalReceiver");
        intent.putExtra("OP_CODE", i2);
        int[] iArr = new int[collection.size()];
        Uri[] uriArr = new Uri[collection.size()];
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < collection.size() && it.hasNext(); i3++) {
            qvz qvz = (qvz) it.next();
            iArr[i3] = qvz.b;
            uriArr[i3] = qvz.a;
        }
        intent.putExtra("content_uri_flags_array", iArr);
        intent.putExtra("content_uri_array", uriArr);
        nqw.a(this.d, i, intent, "com.google.android.gms.permission.INTERNAL_BROADCAST", (BroadcastReceiver) null, (Handler) null);
    }

    private final synchronized nz b(int i) {
        nz nzVar;
        nzVar = (nz) this.g.get(i);
        if (nzVar == null) {
            if (this.g.size() == 0) {
                this.d.registerReceiver(this.a, new IntentFilter("android.intent.action.USER_STARTING"));
            }
            nzVar = new nz();
            this.g.put(i, nzVar);
        }
        return nzVar;
    }

    public final synchronized void a(Handler handler) {
        if (this.c == null) {
            this.c = handler;
        }
    }

    private final void b(int i, Collection collection, int i2) {
        if (jir.a(collection)) {
            return;
        }
        if (collection.size() <= 100) {
            a(i, collection, i2);
            return;
        }
        ArrayList arrayList = new ArrayList(100);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((qvz) it.next());
            if (arrayList.size() >= 100) {
                a(i, (Collection) arrayList, i2);
                arrayList.clear();
            }
        }
        if (!arrayList.isEmpty()) {
            a(i, (Collection) arrayList, i2);
        }
    }

    private final synchronized void a(aabq aabq, int i, qwb qwb) {
        nz nzVar = (nz) this.g.get(i);
        if (nzVar != null) {
            ob obVar = new ob();
            for (qvz qvz : qwb.a) {
                Set set = (Set) nzVar.get(qvz);
                if (set != null) {
                    set.remove(aabq);
                    if (set.isEmpty()) {
                        nzVar.remove(qvz);
                        obVar.add(qvz);
                    }
                }
            }
            b(i, obVar, 2);
            if (nzVar.isEmpty()) {
                this.g.remove(i);
                if (this.g.size() == 0) {
                    this.d.unregisterReceiver(this.a);
                }
            }
        }
    }

    private final synchronized void a(aabq aabq, int i, boolean z) {
        Set set;
        nz b2 = b(i);
        Set<qvz> set2 = ((qwb) aabq.n).a;
        ArrayList arrayList = new ArrayList();
        for (qvz qvz : set2) {
            if (b2.containsKey(qvz)) {
                set = (Set) b2.get(qvz);
            } else {
                if (z) {
                    Log.w("NetworkScheduler", String.format(Locale.US, "%s should already be observed.", new Object[]{qvz}));
                }
                ob obVar = new ob();
                arrayList.add(qvz);
                b2.put(qvz, obVar);
                set = obVar;
            }
            if (set != null) {
                a(aabq, z, set);
            }
        }
        if (!z) {
            b(i, arrayList, 1);
        }
    }

    private final synchronized void a(aabq aabq, qwb qwb) {
        for (qvz qvz : qwb.a) {
            aaeo aaeo = (aaeo) this.f.get(qvz);
            if (aaeo != null) {
                Set set = aaeo.a;
                set.remove(aabq);
                if (set.isEmpty()) {
                    this.b.unregisterContentObserver(aaeo);
                    this.f.remove(qvz);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0095 A[Catch:{ SecurityException -> 0x0058, IllegalArgumentException -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x000b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void a(defpackage.aabq r7, boolean r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            qxx r0 = r7.n     // Catch:{ all -> 0x009e }
            qwb r0 = (defpackage.qwb) r0     // Catch:{ all -> 0x009e }
            java.util.Set r0 = r0.a     // Catch:{ all -> 0x009e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x009e }
        L_0x000b:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x009c
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x009e }
            qvz r1 = (defpackage.qvz) r1     // Catch:{ all -> 0x009e }
            nz r2 = r6.f     // Catch:{ all -> 0x009e }
            boolean r2 = r2.containsKey(r1)     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x0028
            nz r2 = r6.f     // Catch:{ all -> 0x009e }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x009e }
            aaeo r1 = (defpackage.aaeo) r1     // Catch:{ all -> 0x009e }
            goto L_0x0093
        L_0x0028:
            if (r8 == 0) goto L_0x003d
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x009e }
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x009e }
            r4 = 0
            r3[r4] = r1     // Catch:{ all -> 0x009e }
            java.lang.String r4 = "NetworkScheduler"
            java.lang.String r5 = "%s should already be observed."
            java.lang.String r2 = java.lang.String.format(r2, r5, r3)     // Catch:{ all -> 0x009e }
            android.util.Log.w(r4, r2)     // Catch:{ all -> 0x009e }
        L_0x003d:
            aaeo r2 = new aaeo     // Catch:{ all -> 0x009e }
            android.os.Handler r3 = r6.c     // Catch:{ all -> 0x009e }
            r2.<init>(r3, r1, r6)     // Catch:{ all -> 0x009e }
            android.content.ContentResolver r3 = r6.b     // Catch:{ SecurityException -> 0x0058, IllegalArgumentException -> 0x0056 }
            android.net.Uri r4 = r1.a     // Catch:{ SecurityException -> 0x0058, IllegalArgumentException -> 0x0056 }
            boolean r5 = r1.a()     // Catch:{ SecurityException -> 0x0058, IllegalArgumentException -> 0x0056 }
            r3.registerContentObserver(r4, r5, r2)     // Catch:{ SecurityException -> 0x0058, IllegalArgumentException -> 0x0056 }
            nz r3 = r6.f     // Catch:{ all -> 0x009e }
            r3.put(r1, r2)     // Catch:{ all -> 0x009e }
            r1 = r2
            goto L_0x0093
        L_0x0056:
            r2 = move-exception
            goto L_0x0059
        L_0x0058:
            r2 = move-exception
        L_0x0059:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x009e }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x009e }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x009e }
            int r3 = r3.length()     // Catch:{ all -> 0x009e }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x009e }
            int r4 = r4.length()     // Catch:{ all -> 0x009e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
            int r3 = r3 + 42
            int r3 = r3 + r4
            r5.<init>(r3)     // Catch:{ all -> 0x009e }
            java.lang.String r3 = "Failed to register content observer for "
            r5.append(r3)     // Catch:{ all -> 0x009e }
            r5.append(r1)     // Catch:{ all -> 0x009e }
            java.lang.String r1 = ": "
            r5.append(r1)     // Catch:{ all -> 0x009e }
            r5.append(r2)     // Catch:{ all -> 0x009e }
            java.lang.String r1 = "NetworkScheduler"
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x009e }
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x009e }
            r1 = 0
        L_0x0093:
            if (r1 == 0) goto L_0x000b
            java.util.Set r1 = r1.a     // Catch:{ all -> 0x009e }
            a((defpackage.aabq) r7, (boolean) r8, (java.util.Set) r1)     // Catch:{ all -> 0x009e }
            goto L_0x000b
        L_0x009c:
            monitor-exit(r6)
            return
        L_0x009e:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x00a2
        L_0x00a1:
            throw r7
        L_0x00a2:
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaee.a(aabq, boolean):void");
    }

    private static final void a(aabq aabq, boolean z, Set set) {
        if (z) {
            set.remove(aabq);
        }
        set.add(aabq);
    }

    public final synchronized void a(int i) {
        nz nzVar = (nz) this.g.get(i);
        if (!jir.a((Map) nzVar)) {
            b(i, nzVar.keySet(), 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.aabq r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x001b
            int r0 = r3.o     // Catch:{ all -> 0x001d }
            r1 = 2
            if (r0 != r1) goto L_0x001b
            nxc r0 = r3.a     // Catch:{ all -> 0x001d }
            long r0 = r0.e     // Catch:{ all -> 0x001d }
            int r1 = (int) r0     // Catch:{ all -> 0x001d }
            qxx r0 = r3.n     // Catch:{ all -> 0x001d }
            qwb r0 = (defpackage.qwb) r0     // Catch:{ all -> 0x001d }
            if (r1 != 0) goto L_0x0018
            r2.a((defpackage.aabq) r3, (defpackage.qwb) r0)     // Catch:{ all -> 0x001d }
            monitor-exit(r2)
            return
        L_0x0018:
            r2.a((defpackage.aabq) r3, (int) r1, (defpackage.qwb) r0)     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r2)
            return
        L_0x001d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaee.a(aabq):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0078, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0025 A[Catch:{ all -> 0x000d }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0026 A[Catch:{ all -> 0x000d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.aabq r5, defpackage.aabq r6, int r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0010
            boolean r2 = r5.q()     // Catch:{ all -> 0x000d }
            if (r2 == 0) goto L_0x0010
            r2 = 1
            goto L_0x0011
        L_0x000d:
            r5 = move-exception
            goto L_0x0075
        L_0x0010:
            r2 = 0
        L_0x0011:
            if (r7 != r0) goto L_0x0017
            if (r6 != 0) goto L_0x0017
            r3 = 1
            goto L_0x0029
        L_0x0017:
            if (r6 == 0) goto L_0x0028
            boolean r3 = r6.q()     // Catch:{ all -> 0x000d }
            if (r3 == 0) goto L_0x0028
            boolean r3 = r5.equals(r6)     // Catch:{ all -> 0x000d }
            if (r3 != 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r3 = 1
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            if (r2 == 0) goto L_0x0077
            if (r3 == 0) goto L_0x0077
            android.os.Handler r2 = r4.c     // Catch:{ all -> 0x000d }
            if (r2 == 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            java.lang.String r2 = "Handler should be populated."
            defpackage.iva.a((boolean) r0, (java.lang.Object) r2)     // Catch:{ all -> 0x000d }
            if (r6 == 0) goto L_0x0063
            qxx r0 = r5.n     // Catch:{ all -> 0x000d }
            qwb r0 = (defpackage.qwb) r0     // Catch:{ all -> 0x000d }
            qxx r1 = r6.n     // Catch:{ all -> 0x000d }
            qwb r1 = (defpackage.qwb) r1     // Catch:{ all -> 0x000d }
            java.util.Set r0 = r0.a     // Catch:{ all -> 0x000d }
            java.util.Set r1 = r1.a     // Catch:{ all -> 0x000d }
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x000d }
            if (r1 != 0) goto L_0x0050
            r4.a((defpackage.aabq) r6)     // Catch:{ all -> 0x000d }
            goto L_0x0064
        L_0x0050:
            r0 = 3
            if (r7 == r0) goto L_0x0054
            goto L_0x005b
        L_0x0054:
            java.util.Set r7 = r6.d()     // Catch:{ all -> 0x000d }
            r5.a((java.util.Collection) r7)     // Catch:{ all -> 0x000d }
        L_0x005b:
            java.util.Set r6 = r6.b()     // Catch:{ all -> 0x000d }
            r5.a((java.util.Collection) r6)     // Catch:{ all -> 0x000d }
            goto L_0x0064
        L_0x0063:
        L_0x0064:
            nxc r6 = r5.a     // Catch:{ all -> 0x000d }
            long r6 = r6.e     // Catch:{ all -> 0x000d }
            int r7 = (int) r6     // Catch:{ all -> 0x000d }
            if (r7 == 0) goto L_0x0070
            r4.a((defpackage.aabq) r5, (int) r7, (boolean) r1)     // Catch:{ all -> 0x000d }
            monitor-exit(r4)
            return
        L_0x0070:
            r4.a((defpackage.aabq) r5, (boolean) r1)     // Catch:{ all -> 0x000d }
            monitor-exit(r4)
            return
        L_0x0075:
            monitor-exit(r4)
            throw r5
        L_0x0077:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaee.a(aabq, aabq, int):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0010 A[Catch:{ all -> 0x007a, all -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029 A[Catch:{ all -> 0x007a, all -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039 A[Catch:{ all -> 0x007a, all -> 0x0081 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.qvz r3, android.net.Uri r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r3.a()     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x0008
            goto L_0x000b
        L_0x0008:
            if (r4 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            android.net.Uri r4 = r3.a     // Catch:{ all -> 0x0086 }
        L_0x000d:
            r0 = 0
            if (r5 == 0) goto L_0x0029
            android.util.SparseArray r1 = r2.g     // Catch:{ all -> 0x0086 }
            java.lang.Object r5 = r1.get(r5)     // Catch:{ all -> 0x0086 }
            nz r5 = (defpackage.nz) r5     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x0027
            boolean r1 = r5.containsKey(r3)     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0027
            java.lang.Object r3 = r5.get(r3)     // Catch:{ all -> 0x0086 }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x0086 }
            goto L_0x0037
        L_0x0027:
            r3 = r0
            goto L_0x0037
        L_0x0029:
            nz r5 = r2.f     // Catch:{ all -> 0x0086 }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ all -> 0x0086 }
            aaeo r3 = (defpackage.aaeo) r3     // Catch:{ all -> 0x0086 }
            if (r3 == 0) goto L_0x0036
            java.util.Set r3 = r3.a     // Catch:{ all -> 0x0086 }
            goto L_0x0037
        L_0x0036:
            r3 = r0
        L_0x0037:
            if (r3 == 0) goto L_0x0078
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0086 }
        L_0x003d:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x0054
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0086 }
            aabq r5 = (defpackage.aabq) r5     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x003d
            r5.a((android.net.Uri) r4)     // Catch:{ all -> 0x0086 }
            aaez r1 = r2.e     // Catch:{ all -> 0x0086 }
            r1.a(r5, r0)     // Catch:{ all -> 0x0086 }
            goto L_0x003d
        L_0x0054:
            aabg r3 = defpackage.aabg.a()     // Catch:{ all -> 0x0086 }
            aaaz r3 = r3.a     // Catch:{ all -> 0x0086 }
            if (r3 == 0) goto L_0x0078
            java.lang.String r4 = "NetworkScheduler_contentUriTriggered"
            amkr r4 = defpackage.amlv.a((java.lang.String) r4)     // Catch:{ all -> 0x0086 }
            java.util.concurrent.Executor r5 = r3.b     // Catch:{ all -> 0x007a }
            aabi r3 = r3.a     // Catch:{ all -> 0x007a }
            nxn r0 = defpackage.nxn.CONTENT_URI_UPDATED     // Catch:{ all -> 0x007a }
            aaax r3 = defpackage.aaax.a(r3, r0)     // Catch:{ all -> 0x007a }
            java.lang.Runnable r3 = defpackage.amll.a((java.lang.Runnable) r3)     // Catch:{ all -> 0x007a }
            r5.execute(r3)     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x0078
            r4.close()     // Catch:{ all -> 0x0086 }
        L_0x0078:
            monitor-exit(r2)
            return
        L_0x007a:
            r3 = move-exception
            if (r4 == 0) goto L_0x0085
            r4.close()     // Catch:{ all -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r4 = move-exception
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0086 }
        L_0x0085:
            throw r3     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r3 = move-exception
            monitor-exit(r2)
            goto L_0x008a
        L_0x0089:
            throw r3
        L_0x008a:
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaee.a(qvz, android.net.Uri, int):void");
    }
}
