package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.OnContentsResponse;
import com.google.android.gms.drive.internal.OpenContentsRequest;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: kgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kgm extends kfg {
    public static final ith g = new ith("OpenContentsOperation", "");
    public volatile long h = -1;
    private final kei i;
    private final OpenContentsRequest j;
    private final kip k = new kgl(this);
    private volatile kis l;
    private final AtomicBoolean o = new AtomicBoolean(false);
    private final lgy p;

    public kgm(kec kec, kei kei, OpenContentsRequest openContentsRequest, lgy lgy, kwg kwg) {
        super("OpenContentsOperation", kec, kwg, 14);
        this.i = kei;
        this.j = openContentsRequest;
        this.p = lgy;
    }

    private final void d() {
        DriveId driveId;
        if (!this.o.getAndSet(true)) {
            OpenContentsRequest openContentsRequest = this.j;
            if (openContentsRequest != null) {
                driveId = openContentsRequest.a;
            } else {
                driveId = null;
            }
            if (driveId != null) {
                this.a.a(this.c, driveId);
            }
        }
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Status status) {
        lfn g2 = this.c.g();
        g2.b(status.i);
        if (this.a.u) {
            try {
                this.b.a(status);
            } catch (RemoteException e) {
                g2.b();
            }
        }
        g2.a();
        lfq lfq = this.c;
        lfq.h();
        lfq.a();
    }

    /* access modifiers changed from: protected */
    public final void e() {
        njc.a((Object) this.j, "Invalid open contents request: no request");
        njc.a((Object) this.j.a, "Invalid open contents request: no id");
        int i2 = this.j.b;
        boolean z = true;
        if (!(i2 == 268435456 || i2 == 536870912 || i2 == 805306368)) {
            z = false;
        }
        njc.a(z, "Invalid open contents request: invalid mode");
        d();
        this.c.b(this.j.b);
        kmp b = this.a.b(this.j.a);
        if (b.ad()) {
            int i3 = this.j.b;
            if (!(i3 == 805306368 || i3 == 536870912) || b.B()) {
                khq b2 = b();
                OpenContentsRequest openContentsRequest = this.j;
                if (openContentsRequest.b == 536870912) {
                    a(b2, false);
                    f();
                    return;
                }
                this.l = this.a.a(openContentsRequest.a, this.k);
                return;
            }
            throw new nja(10, "The user cannot edit the resource.");
        }
        throw new nja(10, "This file is not openable.");
    }

    /* access modifiers changed from: protected */
    public final void h() {
        d();
        a(4);
        lfn g2 = this.c.g();
        g2.b(16);
        if (this.l != null) {
            this.l.a();
        }
        if (this.a.u) {
            try {
                this.b.a(Status.e);
            } catch (RemoteException e) {
                g.b("OpenContentsOperation", "Failed to report error to client", (Throwable) e);
                g2.b();
            }
        }
        g2.a();
        lfq lfq = this.c;
        lfq.h();
        lfq.a();
    }

    public final void a(int i2) {
        this.c.a(2, i2, this.h >= 0 ? Long.valueOf(this.h) : null, this.p.b());
    }

    public final void a(khq khq, boolean z) {
        try {
            kmp b = this.a.b(this.j.a);
            kei kei = this.i;
            OpenContentsRequest openContentsRequest = this.j;
            OnContentsResponse onContentsResponse = new OnContentsResponse(((keh) kei).a(khq, b, openContentsRequest.c, openContentsRequest.b, this.b.asBinder()), z);
            boolean z2 = true;
            if (this.a.u) {
                try {
                    this.b.a(onContentsResponse);
                    z2 = false;
                } catch (RemoteException e) {
                    g.b("OpenContentsOperation", "Error returning opened contents to client", (Throwable) e);
                    lfn g2 = this.c.g();
                    g2.b();
                    g2.a();
                }
            }
            lfq lfq = this.c;
            lfq.h();
            lfq.a();
            if (z2) {
                try {
                    this.i.a(khq, onContentsResponse.a.b, MetadataBundle.a(), false, kdo.a);
                } catch (nja e2) {
                    g.b("OpenContentsOperation", "Failed to close file", (Throwable) e2);
                }
            }
        } catch (nja e3) {
            b(e3.a);
        }
    }
}
