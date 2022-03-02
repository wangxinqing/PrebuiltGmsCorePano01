package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: abtw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abtw implements idg {
    private final acwd a;

    public abtw(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status) {
        this.a.a((Exception) new ibr(status));
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        abni abni = (abni) obj;
        if (abni.a.c()) {
            this.a.a((Object) abni.b);
        } else {
            this.a.a((Exception) new ibr(abni.a));
        }
    }
}
