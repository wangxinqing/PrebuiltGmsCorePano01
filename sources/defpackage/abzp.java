package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: abzp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abzp implements idg {
    private final acwd a;

    public abzp(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status) {
        this.a.b((Exception) new ibr(status));
    }

    public final void a(Object obj) {
        this.a.b(obj);
    }
}
