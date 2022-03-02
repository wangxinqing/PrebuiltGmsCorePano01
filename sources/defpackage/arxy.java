package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: arxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class arxy extends bhw implements arxz {
    public final DiscoveryChimeraService a;
    private final arwm b = new ubo(this, "StubImpl.onRegister");
    private final arwm c = new ubp(this, "StubImpl.onUnregister");
    private final IBinder.DeathRecipient d = new ubn(this);
    private final arwg e;
    private aryc f;
    private final Object g = new Object();

    private final boolean c(aryc aryc) {
        aryc aryc2 = this.f;
        return (aryc2 == null || aryc2.asBinder() == aryc.asBinder()) ? false : true;
    }

    public void a() {
        throw null;
    }

    public void b() {
        throw null;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.g) {
            z = this.f != null;
        }
        return z;
    }

    public arxy(DiscoveryChimeraService discoveryChimeraService, arwg arwg) {
        super("com.google.location.nearby.common.fastpair.IDiscoveryService");
        this.a = discoveryChimeraService;
        this.e = arwg;
    }

    public final void a(int i, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DiscoveryListItem discoveryListItem = (DiscoveryListItem) it.next();
            avbx avbx = avbx.NEARBY_TYPE_UNKNOWN;
            int ordinal = discoveryListItem.l.ordinal();
            if (ordinal == 3 || ordinal == 4 || ordinal == 5) {
                arrayList.add(discoveryListItem);
            }
        }
        synchronized (this.g) {
            aryc aryc = this.f;
            if (aryc != null) {
                try {
                    aryc.a(i, arrayList);
                } catch (RemoteException e2) {
                    anih anih = (anih) tsp.a.b();
                    anih.a((Throwable) e2);
                    anih.a("DiscoveryService failed to notify Service");
                }
            }
        }
    }

    public final void b(aryc aryc) {
        synchronized (this.g) {
            if (c(aryc)) {
                jjg jjg = tsp.a;
            } else {
                c();
            }
        }
    }

    public final void c() {
        synchronized (this.g) {
            aryc aryc = this.f;
            if (aryc != null) {
                aryc.asBinder().unlinkToDeath(this.d, 1);
            }
            this.f = null;
        }
        this.e.c(this.c);
    }

    public final void a(aryc aryc) {
        synchronized (this.g) {
            if (c(aryc)) {
                jjg jjg = tsp.a;
                c();
            }
            this.f = aryc;
            try {
                aryc.asBinder().linkToDeath(this.d, 1);
            } catch (RemoteException e2) {
                anih anih = (anih) tsp.a.b();
                anih.a((Throwable) e2);
                anih.a("DiscoveryService failed to register.");
            }
        }
        this.e.c(this.b);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, android.os.Parcel r5, android.os.Parcel r6) {
        /*
            r3 = this;
            java.lang.String r6 = "com.google.location.nearby.common.fastpair.IDiscoveryServiceCallback"
            r0 = 0
            r1 = 1
            if (r4 == r1) goto L_0x0028
            r2 = 2
            if (r4 == r2) goto L_0x000b
            r4 = 0
            return r4
        L_0x000b:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0023
            android.os.IInterface r5 = r4.queryLocalInterface(r6)
            boolean r6 = r5 instanceof defpackage.aryc
            if (r6 == 0) goto L_0x001d
            r0 = r5
            aryc r0 = (defpackage.aryc) r0
            goto L_0x0024
        L_0x001d:
            arya r0 = new arya
            r0.<init>(r4)
            goto L_0x0024
        L_0x0023:
        L_0x0024:
            r3.b(r0)
            goto L_0x0044
        L_0x0028:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0040
            android.os.IInterface r5 = r4.queryLocalInterface(r6)
            boolean r6 = r5 instanceof defpackage.aryc
            if (r6 == 0) goto L_0x003a
            r0 = r5
            aryc r0 = (defpackage.aryc) r0
            goto L_0x0041
        L_0x003a:
            arya r0 = new arya
            r0.<init>(r4)
            goto L_0x0041
        L_0x0040:
        L_0x0041:
            r3.a(r0)
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arxy.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
