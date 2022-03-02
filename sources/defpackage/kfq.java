package defpackage;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.CreateFolderRequest;
import com.google.android.gms.drive.internal.OnDriveIdResponse;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfq extends key {
    private final CreateFolderRequest f;

    public kfq(kec kec, CreateFolderRequest createFolderRequest, kwg kwg) {
        super("CreateFolderOperation", kec, kwg, 6);
        this.f = createFolderRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        int i;
        njc.a((Object) this.f, "Invalid create request: no request");
        CreateFolderRequest createFolderRequest = this.f;
        DriveId driveId = createFolderRequest.a;
        MetadataBundle metadataBundle = createFolderRequest.b;
        njc.a((Object) driveId, "Invalid create request: no parent");
        njc.a((Object) metadataBundle, "Invalid create request: no metadata");
        boolean a = this.a.a(driveId);
        lfq lfq = this.c;
        lfq.a(a, "application/vnd.google-apps.folder");
        lfq.a(metadataBundle);
        Date date = new Date();
        metadataBundle.b(lch.c, date);
        metadataBundle.b(lch.d, date);
        metadataBundle.b(lch.a, date);
        kec kec = this.a;
        DriveId e = kec.e(driveId);
        kyp.a(kec.d, metadataBundle, true);
        if (kyo.a(metadataBundle)) {
            kkf kkf = kec.e;
            khq khq = kec.d;
            kyo.a(kkf, khq.a, e, metadataBundle, khq.b);
        }
        khq khq2 = kec.d;
        kax kax = new kax(khq2.a, khq2.c, metadataBundle, e);
        int a2 = kec.g.a(kax);
        if (a2 == 0) {
            this.b.a(new OnDriveIdResponse(kax.g));
            return;
        }
        if (a2 != 3) {
            i = a2 == 4 ? 1501 : 8;
        } else {
            i = 1502;
        }
        throw new nja(i, "Failed to create folder.");
    }
}
