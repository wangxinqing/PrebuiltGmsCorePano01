package defpackage;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.UnsubscribeResourceRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: khe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class khe extends kez {
    private final UnsubscribeResourceRequest f;

    public khe(kec kec, UnsubscribeResourceRequest unsubscribeResourceRequest, kwg kwg) {
        super("UnsubscribeResourceOperation", kec, kwg, 43);
        this.f = unsubscribeResourceRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL);
    }

    public final void d(Context context) {
        njc.a((Object) this.f, "Invalid unsubscribe request.");
        njc.a((Object) this.f.a, "Invalid unsubscribe request.");
        kec kec = this.a;
        DriveId driveId = this.f.a;
        lfq lfq = this.c;
        kmp b = kec.b(driveId);
        if (!b.j()) {
            lfq.a(b);
            khq khq = kec.d;
            if (kec.g.a(new kbu(khq.a, khq.c, b.a(), false, kbi.NORMAL), lfq) == 0) {
                this.b.b();
                return;
            }
            throw new nja(8, "Failed to unsubscribe resource.");
        }
        throw new nja(10, "Cannot unsubscribe from a resource you own.");
    }
}
