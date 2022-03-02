package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: teo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class teo implements idg {
    final /* synthetic */ acwd a;

    public teo(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status) {
        a(status);
    }

    /* renamed from: b */
    public final void a(Status status) {
        if (status.c()) {
            this.a.a((Object) true);
        } else {
            this.a.a((Exception) new ibr(status));
        }
    }
}
