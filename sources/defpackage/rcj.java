package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: rcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rcj implements idg {
    private final acwd a;

    public rcj(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status) {
        this.a.a((Exception) new ibr(status));
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ihd.a((Status) obj, (Object) null, this.a);
    }
}
