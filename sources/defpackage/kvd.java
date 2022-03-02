package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnSyncMoreResponse;

/* renamed from: kvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kvd extends kwf {
    private final idg a;

    public final void a(Status status) {
        this.a.a((Object) new kve(status));
    }

    public kvd(idg idg) {
        this.a = idg;
    }

    public final void a(OnSyncMoreResponse onSyncMoreResponse) {
        this.a.a((Object) new kve(Status.a));
    }
}
