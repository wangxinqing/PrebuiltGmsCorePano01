package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: acjp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acjp implements idg {
    private final acwd a;
    private final acjo b;

    public acjp(acwd acwd, acjo acjo) {
        this.a = acwd;
        this.b = acjo;
    }

    public final void a(Status status) {
        this.a.a((Exception) new ibr(status));
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        icl icl = (icl) obj;
        if (icl.aO().c()) {
            this.a.a(this.b.a(icl));
        } else {
            this.a.a((Exception) new ibr(icl.aO()));
        }
    }
}
