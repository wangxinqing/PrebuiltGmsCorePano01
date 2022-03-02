package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnMetadataResponse;

/* renamed from: kvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kvm extends kwf {
    private final idg a;

    public final void a(Status status) {
        this.a.a((Object) new kvn(status, (jzr) null));
    }

    public kvm(idg idg) {
        this.a = idg;
    }

    public final void a(OnMetadataResponse onMetadataResponse) {
        this.a.a((Object) new kvn(Status.a, new kuj(onMetadataResponse.a)));
    }
}
