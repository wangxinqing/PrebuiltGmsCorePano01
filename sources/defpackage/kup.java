package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.OnDriveIdResponse;
import com.google.android.gms.drive.internal.OnMetadataResponse;

/* renamed from: kup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kup extends kwf {
    private final idg a;

    public final void a(Status status) {
        this.a.a((Object) new kuq(status, (DriveId) null));
    }

    public kup(idg idg) {
        this.a = idg;
    }

    public final void a(OnDriveIdResponse onDriveIdResponse) {
        this.a.a((Object) new kuq(Status.a, onDriveIdResponse.a));
    }

    public final void a(OnMetadataResponse onMetadataResponse) {
        this.a.a((Object) new kuq(Status.a, new kuj(onMetadataResponse.a).a()));
    }
}
