package defpackage;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.internal.AuthorizeAccessRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfc extends kez {
    private final AuthorizeAccessRequest f;

    public kfc(kec kec, AuthorizeAccessRequest authorizeAccessRequest, kwg kwg) {
        super("AuthorizeAccessOperation", kec, kwg);
        this.f = authorizeAccessRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL);
    }

    public final void d(Context context) {
        boolean z;
        njc.a((Object) this.f, "Invalid authorize access request: no request");
        long j = this.f.a;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        njc.a(z, "Invalid authorize access request: app id is zero");
        njc.a((Object) this.f.b, "Invalid authorize access request: no drive id");
        kec kec = this.a;
        String l = Long.toString(j);
        DriveId driveId = this.f.b;
        if (!kec.c(driveId)) {
            kmp b = kec.b(driveId);
            if (b.aj().contains(DriveSpace.a)) {
                khq khq = kec.d;
                if (kec.g.a(new kbp(khq.a, khq.c, b.a(), l, khi.AUTHORIZED, kbi.NORMAL)) != 0) {
                    throw new nja(8, "Failed to process authorization");
                }
            } else {
                throw new nja(10, "Can only authorize access to resources in the DRIVE space");
            }
        }
        this.b.b();
    }
}
