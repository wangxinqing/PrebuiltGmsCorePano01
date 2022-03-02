package defpackage;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.OnMetadataResponse;
import com.google.android.gms.drive.internal.UpdateMetadataRequest;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: khg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class khg extends key {
    private final UpdateMetadataRequest f;

    public khg(kec kec, UpdateMetadataRequest updateMetadataRequest, kwg kwg) {
        super("UpdateMetadataOperation", kec, kwg, 22);
        this.f = updateMetadataRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        njc.a((Object) this.f, "Invalid update request.");
        njc.a((Object) this.f.a, "Invalid update request.");
        njc.a((Object) this.f.b, "Invalid update request.");
        MetadataBundle metadataBundle = this.f.b;
        this.c.a(metadataBundle);
        if (metadataBundle.c(lce.Q) || metadataBundle.c(lce.c) || metadataBundle.c(lce.N) || metadataBundle.c(lce.i) || metadataBundle.c(lce.F) || metadataBundle.c(lce.L)) {
            Date date = new Date();
            metadataBundle.b(lch.c, date);
            metadataBundle.b(lch.d, date);
        }
        kec kec = this.a;
        DriveId driveId = this.f.a;
        lfq lfq = this.c;
        if (kec.c(driveId)) {
            throw new nja(10, "Cannot edit metadata of the root folder");
        } else if (!metadataBundle.c(lce.g) || kec.f()) {
            kmp b = kec.b(driveId);
            if (b.ai()) {
                kec.a(driveId, "Cannot edit metadata of the App Folder");
            }
            if (!b.B()) {
                if (!iko.b(metadataBundle.c(), kec.b).isEmpty()) {
                    throw new nja(10, "Cannot update the provided metadata fields on a non-editable resource");
                }
            } else if (((Boolean) jzq.n.c()).booleanValue()) {
                if (!metadataBundle.c(lch.c)) {
                    metadataBundle.b(lch.c, b.C());
                }
                if (!metadataBundle.c(lch.d)) {
                    metadataBundle.b(lch.d, b.D());
                }
            }
            kyp.a(kec.d, b, metadataBundle);
            lfq.a(b);
            Boolean bool = (Boolean) metadataBundle.b(lce.M);
            knc a = b.a();
            khq khq = kec.d;
            if (kec.g.a(new kbf(khq.a, khq.c, a, metadataBundle)) == 0) {
                if (bool != null) {
                    lii.a(kec.n, kec.o, kec.e, kec.d, a, !bool.booleanValue() ? kpd.UNPINNED : kpd.PINNED_ACTIVE);
                }
                this.b.a(new OnMetadataResponse(kec.a(driveId, false)));
                return;
            }
            throw new nja(8, "Failed to process update");
        } else {
            throw new nja(10, "Field is not modifiable by the app");
        }
    }
}
