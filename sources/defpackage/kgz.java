package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveFileRange;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.OnDownloadProgressResponse;
import com.google.android.gms.drive.internal.OnStartStreamSession;
import com.google.android.gms.drive.internal.StreamContentsRequest;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: kgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kgz extends kfe {
    public static final ith g = new ith("StreamContentsOperation", "");
    public final kei h;
    public final StreamContentsRequest i;
    public volatile kis j;
    public volatile long k = -1;
    public volatile boolean l = false;
    private final kip o = new kgy(this);
    private final AtomicBoolean p = new AtomicBoolean(false);
    private final lgy q;

    public kgz(kec kec, kei kei, StreamContentsRequest streamContentsRequest, lgy lgy, kwg kwg) {
        super("StreamContentsOperation", kec, kwg);
        this.h = kei;
        this.i = streamContentsRequest;
        this.q = lgy;
    }

    private final synchronized void k() {
        DriveId driveId;
        if (!this.p.getAndSet(true)) {
            StreamContentsRequest streamContentsRequest = this.i;
            if (streamContentsRequest != null) {
                driveId = streamContentsRequest.a;
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
                if (!this.l) {
                    this.b.a(status);
                } else {
                    this.b.a(new OnDownloadProgressResponse(0, -1, 2, OnDownloadProgressResponse.a));
                }
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
    public final void d() {
        String str = this.e.b;
        if (this.a.g() || ((String) jzq.aC.c()).contains(str)) {
            njc.a((Object) this.i, "Invalid stream contents request: no request");
            njc.a((Object) this.i.a, "Invalid stream contents request: no id");
            k();
            this.j = this.a.a(this.i.a, this.o);
            return;
        }
        throw new nja(10, "App is not whitelisted to make this request.");
    }

    /* access modifiers changed from: protected */
    public final void h() {
        k();
        a(4);
        if (this.j != null) {
            this.j.a();
        }
        b(Status.e);
    }

    public final void a(int i2) {
        Long l2;
        if (this.k >= 0) {
            l2 = Long.valueOf(this.k);
        } else {
            l2 = null;
        }
        this.c.a(2, i2, l2, this.q.b());
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [itp, android.os.IBinder] */
    public final synchronized void a(ParcelFileDescriptor parcelFileDescriptor, String str) {
        njc.a(!this.l, "A session is already in progress");
        if (this.a.u) {
            ? r2 = this.f;
            r2.asBinder();
            try {
                this.b.a(new OnStartStreamSession(parcelFileDescriptor, r2, str));
                this.l = true;
            } catch (RemoteException e) {
                g.b("StreamContentsOperation", "Failed to start a session", (Throwable) e);
            }
        }
    }

    public final boolean a(int i2, long j2, long j3) {
        if (!this.a.u) {
            return false;
        }
        try {
            this.b.a(new OnDownloadProgressResponse(j2, j3, i2, Collections.singletonList(new DriveFileRange(0, j2))));
            return true;
        } catch (RemoteException e) {
            g.b("StreamContentsOperation", "Failed to call download progress listener", (Throwable) e);
            return false;
        }
    }
}
