package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.fastpair.slice.ServiceBindHelper$1;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: mts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mts {
    private static final amzy g = amzy.a((Object) "device_status_list_item", (Object) "pair_header_suggestion");
    private static final amzy h = amzy.a((Object) "links", (Object) "ota_contextual_cards");
    public final arwg a;
    public final Map b = new HashMap();
    private arxe c;
    private arxb d;
    private final Context e;
    private final arxd f;
    private boolean i;
    private boolean j;
    private final BroadcastReceiver k = new ServiceBindHelper$1("nearby");

    public mts(Context context, arwg arwg, arxd arxd) {
        this.e = context;
        this.a = arwg;
        this.f = arxd;
    }

    private final synchronized boolean a(List list) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            i2++;
            if (this.b.containsKey((String) list.get(i2))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final synchronized aorr b() {
        arxb arxb = this.d;
        if (arxb == null) {
            ((anih) ((anih) mte.a.c()).a("mts", "b", 278, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ServiceBindHelper.getFirmwareUpdatableItems failed due to no service connection.");
            return null;
        }
        long x = aymt.x();
        aosh f2 = aosh.f();
        aoqm.a.execute(new arwy(arxb, x, f2));
        return f2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "mts"
            java.lang.String r1 = "a"
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            boolean r3 = r7.i     // Catch:{ all -> 0x00d8 }
            if (r3 != 0) goto L_0x0030
            amzy r3 = g     // Catch:{ all -> 0x00d8 }
            boolean r3 = r7.a((java.util.List) r3)     // Catch:{ all -> 0x00d8 }
            if (r3 != 0) goto L_0x0030
            arxe r3 = r7.c     // Catch:{ all -> 0x00d8 }
            if (r3 == 0) goto L_0x005c
            r3.b()     // Catch:{ all -> 0x00d8 }
            jjg r3 = defpackage.mte.a     // Catch:{ all -> 0x00d8 }
            anie r3 = r3.d()     // Catch:{ all -> 0x00d8 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x00d8 }
            r4 = 184(0xb8, float:2.58E-43)
            anie r3 = r3.a((java.lang.String) r0, (java.lang.String) r1, (int) r4, (java.lang.String) r2)     // Catch:{ all -> 0x00d8 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x00d8 }
            java.lang.String r4 = "ServiceBindHelper: Unbind DiscoveryService for pair"
            r3.a((java.lang.String) r4)     // Catch:{ all -> 0x00d8 }
            goto L_0x005c
        L_0x0030:
            arxe r3 = r7.c     // Catch:{ all -> 0x00d8 }
            if (r3 == 0) goto L_0x0035
            goto L_0x0042
        L_0x0035:
            arxe r3 = new arxe     // Catch:{ all -> 0x00d8 }
            android.content.Context r4 = r7.e     // Catch:{ all -> 0x00d8 }
            java.lang.String r5 = "com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_SLICE"
            arxd r6 = r7.f     // Catch:{ all -> 0x00d8 }
            r3.<init>(r4, r5, r6)     // Catch:{ all -> 0x00d8 }
            r7.c = r3     // Catch:{ all -> 0x00d8 }
        L_0x0042:
            arxe r3 = r7.c     // Catch:{ all -> 0x00d8 }
            r3.a()     // Catch:{ all -> 0x00d8 }
            jjg r3 = defpackage.mte.a     // Catch:{ all -> 0x00d8 }
            anie r3 = r3.d()     // Catch:{ all -> 0x00d8 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x00d8 }
            r4 = 179(0xb3, float:2.51E-43)
            anie r3 = r3.a((java.lang.String) r0, (java.lang.String) r1, (int) r4, (java.lang.String) r2)     // Catch:{ all -> 0x00d8 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x00d8 }
            java.lang.String r4 = "ServiceBindHelper: Bind DiscoveryService for pair"
            r3.a((java.lang.String) r4)     // Catch:{ all -> 0x00d8 }
        L_0x005c:
            amzy r3 = h     // Catch:{ all -> 0x00d8 }
            boolean r3 = r7.a((java.util.List) r3)     // Catch:{ all -> 0x00d8 }
            if (r3 != 0) goto L_0x0090
            arxb r3 = r7.d     // Catch:{ all -> 0x00d8 }
            if (r3 == 0) goto L_0x0080
            r3.b()     // Catch:{ all -> 0x00d8 }
            jjg r3 = defpackage.mte.a     // Catch:{ all -> 0x00d8 }
            anie r3 = r3.d()     // Catch:{ all -> 0x00d8 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x00d8 }
            r4 = 214(0xd6, float:3.0E-43)
            anie r0 = r3.a((java.lang.String) r0, (java.lang.String) r1, (int) r4, (java.lang.String) r2)     // Catch:{ all -> 0x00d8 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = "ServiceBindHelper: Unbind DiscoveryChimeraService for battery and device details."
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x00d8 }
        L_0x0080:
            boolean r0 = r7.j     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x008e
            r0 = 0
            r7.j = r0     // Catch:{ all -> 0x00d8 }
            android.content.Context r0 = r7.e     // Catch:{ all -> 0x00d8 }
            android.content.BroadcastReceiver r1 = r7.k     // Catch:{ all -> 0x00d8 }
            r0.unregisterReceiver(r1)     // Catch:{ all -> 0x00d8 }
        L_0x008e:
            monitor-exit(r7)
            return
        L_0x0090:
            arxb r3 = r7.d     // Catch:{ all -> 0x00d8 }
            if (r3 != 0) goto L_0x00a2
            arxb r3 = new arxb     // Catch:{ all -> 0x00d8 }
            android.content.Context r4 = r7.e     // Catch:{ all -> 0x00d8 }
            mtr r5 = new mtr     // Catch:{ all -> 0x00d8 }
            r5.<init>(r7)     // Catch:{ all -> 0x00d8 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00d8 }
            r7.d = r3     // Catch:{ all -> 0x00d8 }
        L_0x00a2:
            arxb r3 = r7.d     // Catch:{ all -> 0x00d8 }
            r3.a()     // Catch:{ all -> 0x00d8 }
            boolean r3 = r7.j     // Catch:{ all -> 0x00d8 }
            if (r3 != 0) goto L_0x00c1
            r3 = 1
            r7.j = r3     // Catch:{ all -> 0x00d8 }
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch:{ all -> 0x00d8 }
            java.lang.String r4 = "android.bluetooth.device.action.ACL_CONNECTED"
            r3.<init>(r4)     // Catch:{ all -> 0x00d8 }
            java.lang.String r4 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            r3.addAction(r4)     // Catch:{ all -> 0x00d8 }
            android.content.Context r4 = r7.e     // Catch:{ all -> 0x00d8 }
            android.content.BroadcastReceiver r5 = r7.k     // Catch:{ all -> 0x00d8 }
            r4.registerReceiver(r5, r3)     // Catch:{ all -> 0x00d8 }
        L_0x00c1:
            jjg r3 = defpackage.mte.a     // Catch:{ all -> 0x00d8 }
            anie r3 = r3.d()     // Catch:{ all -> 0x00d8 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x00d8 }
            r4 = 208(0xd0, float:2.91E-43)
            anie r0 = r3.a((java.lang.String) r0, (java.lang.String) r1, (int) r4, (java.lang.String) r2)     // Catch:{ all -> 0x00d8 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = "ServiceBindHelper: Bind DiscoveryChimeraService for battery and device details."
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x00d8 }
            monitor-exit(r7)
            return
        L_0x00d8:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mts.a():void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized DeviceDetailsLinks b(String str) {
        arxb arxb = this.d;
        if (arxb == null) {
            ((anih) ((anih) mte.a.c()).a("mts", "b", 267, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ServiceBindHelper.getDeviceDetailsLinks failed due to no service connection.");
            return null;
        }
        return arxb.a(str);
    }

    /* access modifiers changed from: package-private */
    public final void b(Uri uri) {
        if (!a(uri.getLastPathSegment())) {
            ((anih) ((anih) mte.a.d()).a("mts", "b", 152, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ServiceBindHelper.onSliceUnpinned, slice not pinned, uri = %s", (Object) uri.toString());
            return;
        }
        ((anih) ((anih) mte.a.d()).a("mts", "b", 156, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ServiceBindHelper.onSliceUnpinned, unpin slice, uri = %s", (Object) uri.toString());
        a();
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        if (z) {
            anhk i2 = h.listIterator();
            while (i2.hasNext()) {
                mtk.a(this.e, (String) i2.next());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Uri uri) {
        boolean a2 = a(uri.getLastPathSegment());
        mtq mtq = new mtq(this, "AutoUnpinRunnable", uri);
        synchronized (this) {
            this.b.put(uri.getLastPathSegment(), mtq);
            this.a.a(mtq, aymt.a.a().aV());
        }
        if (!a2) {
            ((anih) ((anih) mte.a.d()).a("mts", "a", 146, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ServiceBindHelper.onSlicePinned, pin slice, uri = %s", (Object) uri.toString());
            a();
            return;
        }
        ((anih) ((anih) mte.a.d()).a("mts", "a", 142, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ServiceBindHelper.onSlicePinned, slice already pinned, uri = %s", (Object) uri.toString());
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(boolean z) {
        if (this.i != z) {
            ((anih) ((anih) mte.a.d()).a("mts", "a", 117, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ServiceBindHelper.setBindServiceForDiscoveryItem, bindServiceForDiscoveryItem = %b", (Object) Boolean.valueOf(z));
            this.i = z;
            a();
        }
    }

    public final synchronized boolean a(String str) {
        boolean z;
        if (this.b.containsKey(str)) {
            this.a.e((arwm) this.b.get(str));
            this.b.remove(str);
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
