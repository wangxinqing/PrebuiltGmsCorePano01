package defpackage;

import android.os.RemoteException;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.query.Query;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: krx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class krx implements krr {
    public static final ith a = new ith("CallbackStoreImpl", "");
    final Set b = new HashSet();
    final Set c = new HashSet();
    private final ConcurrentMap d = new ConcurrentHashMap();
    private final Object e = new Object();
    private final ConcurrentMap f = new ConcurrentHashMap();
    private final Object g = new Object();
    private final ConcurrentMap h = new ConcurrentHashMap();
    private final Object i = new Object();
    private final lfr j;
    private final ksz k;
    private volatile ldm l;

    public krx(lfr lfr, ksz ksz) {
        iva.a((Object) lfr);
        this.j = lfr;
        iva.a((Object) ksz);
        this.k = ksz;
    }

    private static final krp a(TransferProgressEvent transferProgressEvent, String str) {
        return new krt(transferProgressEvent, str);
    }

    public final void a(ldm ldm) {
        this.l = ldm;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        boolean z;
        boolean z2;
        ldm ldm = this.l;
        if (ldm != null) {
            boolean z3 = (!this.d.isEmpty()) | (!this.f.isEmpty());
            synchronized (this.b) {
                z = z3 | (!this.b.isEmpty());
            }
            synchronized (this.c) {
                z2 = z | (!this.c.isEmpty());
            }
            ldm.a(z2);
        }
    }

    private static void a(DriveId driveId, Set set, ConcurrentMap concurrentMap) {
        synchronized (set) {
            if (set.isEmpty()) {
                concurrentMap.remove(driveId, set);
            }
        }
    }

    private final void a(DriveId driveId, ConcurrentMap concurrentMap, krp krp) {
        Set set = (Set) concurrentMap.get(driveId);
        if (set != null) {
            a(set, krp);
            a(driveId, set, concurrentMap);
        }
    }

    public final void b(TransferProgressEvent transferProgressEvent, DriveId driveId) {
        a(driveId, this.h, a(transferProgressEvent, "pinned download"));
    }

    public final void b(kwj kwj) {
        a(ksi.a(kwj), this.c);
    }

    private final void a(DriveId driveId, kta kta, Object obj, ConcurrentMap concurrentMap) {
        boolean add;
        iva.a((Object) driveId);
        synchronized (obj) {
            Set set = (Set) concurrentMap.get(driveId);
            if (set == null) {
                set = new HashSet();
            }
            synchronized (set) {
                add = set.add(kta);
                concurrentMap.putIfAbsent(driveId, set);
            }
        }
        if (add) {
            b();
        }
    }

    private final void a(DriveId driveId, kta kta, ConcurrentMap concurrentMap) {
        iva.a((Object) driveId);
        Set set = (Set) concurrentMap.get(driveId);
        if (set != null) {
            a(kta, set);
            a(driveId, set, concurrentMap);
        }
    }

    private final void a(Set set, krp krp) {
        boolean removeAll;
        HashSet<kta> hashSet = new HashSet<>();
        synchronized (set) {
            hashSet.addAll(set);
        }
        HashSet hashSet2 = new HashSet();
        for (kta kta : hashSet) {
            try {
                if (!krp.a(kta)) {
                    a.b("CallbackStoreImpl", "Callback is no longer needed; removing");
                    hashSet2.add(kta);
                }
            } catch (RemoteException e2) {
                a.b("CallbackStoreImpl", "Callback caused RemoteException; removing", (Throwable) e2);
                hashSet2.add(kta);
            }
        }
        synchronized (set) {
            removeAll = set.removeAll(hashSet2);
        }
        if (removeAll) {
            b();
        }
    }

    private final void a(kta kta, Set set) {
        boolean remove;
        synchronized (set) {
            remove = set.remove(kta);
        }
        if (remove) {
            b();
        }
    }

    public final void a() {
        this.d.clear();
        this.f.clear();
        this.h.clear();
        synchronized (this.b) {
            this.b.clear();
        }
        synchronized (this.c) {
            this.c.clear();
        }
        b();
    }

    public final void a(int i2, kmp kmp) {
        lgc d2 = ((lfv) this.j).d();
        d2.c(2, i2);
        d2.c(0);
        d2.j();
        if (kmp != null) {
            d2.a(kmp);
        }
        d2.a();
    }

    public final void a(DriveId driveId, long j2, kwj kwj) {
        a(driveId, (kta) new kse(kwj, driveId, j2), this.e, this.d);
    }

    public final void a(DriveId driveId, kwj kwj) {
        a(driveId, kse.a(kwj), this.d);
    }

    public final void a(DriveId driveId, kwj kwj, TransferProgressOptions transferProgressOptions) {
        int i2 = transferProgressOptions.a;
        if (i2 == 0) {
            a(driveId, ktn.a(kwj), this.f);
        } else if (i2 != 1) {
            a.b("CallbackStoreImpl", "Invalid transfer type: %d", Integer.valueOf(transferProgressOptions.a));
        } else {
            a(driveId, ktn.a(kwj), this.h);
        }
    }

    public final void a(ChangeEvent changeEvent, kmp kmp) {
        DriveId driveId = changeEvent.a;
        iva.a((Object) driveId);
        iva.a((Object) kmp, (Object) "Entry can't be null for change events");
        iva.b(driveId.equals(kmp.g()), "Event and entry mismatch");
        a(kmp.g(), this.d, (krp) new krv(this, changeEvent, kmp));
        a(this.c, (krp) new krw(this, kmp));
    }

    public final void a(TransferProgressEvent transferProgressEvent, DriveId driveId) {
        a(driveId, this.f, a(transferProgressEvent, "upload"));
    }

    public final void a(String str, boolean z) {
        a(this.b, (krp) new kru(str, z));
    }

    public final void a(Set set) {
        a(this.b, (krp) new krs(this, set));
    }

    public final void a(ktn ktn) {
        int i2 = ktn.d;
        if (i2 == 0) {
            a(ktn.c, (kta) ktn, this.i, this.f);
        } else if (i2 != 1) {
            a.b("CallbackStoreImpl", "Invalid transfer type: %s", Integer.valueOf(ktn.d));
        } else {
            a(ktn.c, (kta) ktn, this.g, this.h);
        }
        try {
            ktn.a(new TransferProgressEvent(this.k.a(ktn.d, ktn.c)));
        } catch (RemoteException e2) {
            a.c("CallbackStoreImpl", "Error raising progress event", e2);
        }
    }

    public final void a(kwj kwj) {
        a(kte.a(kwj), this.b);
    }

    public final void a(kwj kwj, long j2, ChangesAvailableOptions changesAvailableOptions, Set set) {
        boolean add;
        iva.a((Object) kwj);
        iva.a((Object) changesAvailableOptions);
        iva.a((Object) set);
        synchronized (this.c) {
            add = this.c.add(new ksi(kwj, j2, changesAvailableOptions, set));
        }
        if (add) {
            b();
        }
    }

    public final void a(kwj kwj, Query query, String str, kea kea, Set set, boolean z) {
        boolean add;
        kte kte = new kte(kwj, query, str, kea, set, this.j);
        try {
            kte.a(true, z);
            synchronized (this.b) {
                add = this.b.add(kte);
            }
            if (add) {
                b();
            }
        } catch (RemoteException e2) {
            a.c("Unable to raise a query callback. The callback is not added.");
        }
    }

    public final boolean a(DriveId driveId) {
        synchronized (this.c) {
            if (this.c.isEmpty()) {
                return this.d.containsKey(driveId);
            }
            return true;
        }
    }
}
