package defpackage;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.internal.OnEventResponse;

/* renamed from: kse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kse extends kta {
    private final DriveId c;
    private final long d;

    public kse(kwj kwj, DriveId driveId, long j) {
        super(1, kwj);
        iva.a((Object) driveId);
        this.c = driveId;
        this.d = j;
    }

    public static kta a(kwj kwj) {
        return new kta(1, kwj);
    }

    public final boolean a(ChangeEvent changeEvent, long j) {
        if (!this.c.equals(changeEvent.a) || j <= this.d) {
            return false;
        }
        this.b.a(new OnEventResponse(changeEvent));
        return true;
    }
}
