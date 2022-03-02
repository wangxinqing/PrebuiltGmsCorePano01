package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.FetchThumbnailRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kfv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfv extends kez {
    private static final ith g = new ith("FetchThumbnailOperation", "");
    public final FetchThumbnailRequest f;

    public kfv(kec kec, FetchThumbnailRequest fetchThumbnailRequest, kwg kwg) {
        super("FetchThumbnailOperation", kec, kwg, 39, (byte[]) null);
        this.f = fetchThumbnailRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Status status) {
        lfn g2 = this.c.g();
        g2.b(status.i);
        try {
            this.b.a(status);
        } catch (RemoteException e) {
            g2.b();
            g.c("FetchThumbnailOperation", "Error notifying client.", e);
        }
        g2.a();
    }

    public final void d(Context context) {
        kis kis;
        njc.a((Object) this.f, "Invalid fetch thumbnail request: no request");
        njc.a((Object) this.f.a, "Invalid fetch thumbnail request: no id");
        kec kec = this.a;
        DriveId driveId = this.f.a;
        kfu kfu = new kfu(this);
        kmp b = kec.b(driveId);
        lht a = kec.c.D.a();
        kim kim = kec.f;
        khq a2 = khq.a(kec.d.a);
        if (kim.g.a(b, false) != null) {
            kim.a.a("ContentDownloadManager", "Up-to-date thumbnail is already available locally: %s", b.a());
            kis = new kis(3);
        } else if (b.ab()) {
            kis = new kis(5);
        } else if (!b.W()) {
            kis = new kis(5);
        } else {
            kis = kim.f.a(b.a(), new kih(kim, a2, b, a));
        }
        kis.a(kfu);
    }
}
