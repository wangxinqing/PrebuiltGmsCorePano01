package defpackage;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.internal.OnEventResponse;

/* renamed from: ktn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ktn extends kta {
    public final DriveId c;
    public final int d;

    public ktn(kwj kwj, DriveId driveId, TransferProgressOptions transferProgressOptions) {
        super(8, kwj);
        iva.a((Object) driveId);
        this.c = driveId;
        this.d = transferProgressOptions.a;
    }

    public static kta a(kwj kwj) {
        return new kta(8, kwj);
    }

    public final boolean a(TransferProgressEvent transferProgressEvent) {
        if (this.a != 8 || !this.c.equals(transferProgressEvent.a.b) || this.d != transferProgressEvent.a.a) {
            return false;
        }
        this.b.a(new OnEventResponse(transferProgressEvent));
        return true;
    }
}
