package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnDriveIdResponse;

/* renamed from: kvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kvh extends kwf {
    private final idg a;

    public final void a(Status status) {
        this.a.a((Object) new kvi(status, (kvp) null));
    }

    public kvh(idg idg) {
        this.a = idg;
    }

    public final void a(OnDriveIdResponse onDriveIdResponse) {
        this.a.a((Object) new kvi(Status.a, new kvp(onDriveIdResponse.a)));
    }
}
