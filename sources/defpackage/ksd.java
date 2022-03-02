package defpackage;

import android.os.RemoteException;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.query.Query;
import java.util.Set;

/* renamed from: ksd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ksd implements krr {
    public static final ith a = new ith("CallbackStoreImpl", "");
    final krq b = new krq();
    final krq c = new krq();
    private final kro d = new kro();
    private final kro e = new kro();
    private final kro f = new kro();
    private final lfr g;
    private final ksz h;
    private volatile ldm i;

    public ksd(lfr lfr, ksz ksz) {
        iva.a((Object) lfr);
        this.g = lfr;
        iva.a((Object) ksz);
        this.h = ksz;
    }

    private static final krp a(TransferProgressEvent transferProgressEvent, String str) {
        return new krz(transferProgressEvent, str);
    }

    public final void a(ldm ldm) {
        this.i = ldm;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        ldm ldm = this.i;
        if (ldm != null) {
            boolean z = true;
            if (this.d.b() && this.e.b() && this.b.b() && this.c.b()) {
                z = false;
            }
            ldm.a(z);
        }
    }

    public final void a() {
        this.d.a();
        this.e.a();
        this.f.a();
        this.b.a();
        this.c.a();
        b();
    }

    public final void b(TransferProgressEvent transferProgressEvent, DriveId driveId) {
        this.f.a(driveId, a(transferProgressEvent, "pinned download"));
    }

    public final void a(int i2, kmp kmp) {
        lgc d2 = ((lfv) this.g).d();
        d2.c(2, i2);
        d2.c(0);
        d2.j();
        if (kmp != null) {
            d2.a(kmp);
        }
        d2.a();
    }

    public final void b(kwj kwj) {
        this.c.b(ksi.a(kwj));
    }

    public final void a(DriveId driveId, long j, kwj kwj) {
        if (this.d.a(driveId, (kta) new kse(kwj, driveId, j))) {
            b();
        }
    }

    public final void a(DriveId driveId, kwj kwj) {
        this.d.b(driveId, kse.a(kwj));
    }

    public final void a(DriveId driveId, kwj kwj, TransferProgressOptions transferProgressOptions) {
        int i2 = transferProgressOptions.a;
        if (i2 == 0) {
            this.e.b(driveId, ktn.a(kwj));
        } else if (i2 != 1) {
            a.b("CallbackStoreImpl", "Invalid transfer type: %d", Integer.valueOf(transferProgressOptions.a));
        } else {
            this.f.b(driveId, ktn.a(kwj));
        }
    }

    public final void a(ChangeEvent changeEvent, kmp kmp) {
        DriveId driveId = changeEvent.a;
        iva.a((Object) driveId);
        iva.a((Object) kmp, (Object) "Entry can't be null for change events");
        iva.b(driveId.equals(kmp.g()), "Event and entry mismatch");
        this.d.a(kmp.g(), (krp) new ksb(this, changeEvent, kmp));
        this.c.a((krp) new ksc(this, kmp));
    }

    public final void a(TransferProgressEvent transferProgressEvent, DriveId driveId) {
        this.e.a(driveId, a(transferProgressEvent, "upload"));
    }

    public final void a(String str, boolean z) {
        this.b.a((krp) new ksa(str, z));
    }

    public final void a(Set set) {
        this.b.a((krp) new kry(this, set));
    }

    public final void a(ktn ktn) {
        int i2 = ktn.d;
        if (i2 == 0) {
            this.e.a(ktn.c, (kta) ktn);
        } else if (i2 != 1) {
            a.b("CallbackStoreImpl", "Invalid transfer type: %s", Integer.valueOf(ktn.d));
        } else {
            this.f.a(ktn.c, (kta) ktn);
        }
        try {
            ktn.a(new TransferProgressEvent(this.h.a(ktn.d, ktn.c)));
        } catch (RemoteException e2) {
            a.c("CallbackStoreImpl", "Error raising progress event", e2);
        }
    }

    public final void a(kwj kwj) {
        this.b.b(kte.a(kwj));
    }

    public final void a(kwj kwj, long j, ChangesAvailableOptions changesAvailableOptions, Set set) {
        iva.a((Object) kwj);
        iva.a((Object) changesAvailableOptions);
        iva.a((Object) set);
        if (this.c.a((kta) new ksi(kwj, j, changesAvailableOptions, set))) {
            b();
        }
    }

    public final void a(kwj kwj, Query query, String str, kea kea, Set set, boolean z) {
        kte kte = new kte(kwj, query, str, kea, set, this.g);
        try {
            kte.a(true, z);
            if (this.b.a((kta) kte)) {
                b();
            }
        } catch (RemoteException e2) {
            a.c("Unable to raise a query callback. The callback is not added.");
        }
    }

    public final boolean a(DriveId driveId) {
        return !this.c.b() || this.d.a.containsKey(driveId);
    }
}
