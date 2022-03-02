package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnListParentsResponse;

/* renamed from: kvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kvl extends kwf {
    private final idg a;

    public final void a(Status status) {
        this.a.a((Object) new kus(status, (jzt) null, false));
    }

    public kvl(idg idg) {
        this.a = idg;
    }

    public final void a(OnListParentsResponse onListParentsResponse) {
        this.a.a((Object) new kus(Status.a, new jzt(onListParentsResponse.b), false));
    }
}
