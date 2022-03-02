package defpackage;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnDownloadProgressResponse;
import java.util.List;

/* renamed from: kgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kgl implements kip {
    final /* synthetic */ kgm a;

    public kgl(kgm kgm) {
        this.a = kgm;
    }

    public final void a(int i) {
        boolean z;
        if (kiq.a(i) && this.a.f()) {
            this.a.a(i);
            boolean z2 = false;
            switch (i) {
                case 2:
                case 3:
                case 4:
                case 6:
                    lfq lfq = this.a.c;
                    if (i == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    lfq.a(z);
                    kgm kgm = this.a;
                    khq b = kgm.b();
                    if (i == 6) {
                        z2 = true;
                    }
                    kgm.a(b, z2);
                    return;
                case 5:
                case 7:
                case 8:
                    this.a.b(new Status(kiq.d(i), "Error downloading file", (PendingIntent) null));
                    return;
                default:
                    kgm.g.b("OpenContentsOperation", "Invalid state here: %s", Integer.valueOf(i));
                    return;
            }
        }
    }

    public final void a(long j, long j2) {
        this.a.h = j2;
        kgm kgm = this.a;
        if (kgm.a.u) {
            try {
                kgm.b.a(new OnDownloadProgressResponse(j, j2, 0, (List) null));
            } catch (RemoteException e) {
                kgm.g.b("OpenContentsOperation", "Failed to call download progress listener", (Throwable) e);
            }
        }
    }
}
