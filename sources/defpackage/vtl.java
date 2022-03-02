package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: vtl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vtl extends ift {
    final /* synthetic */ acwd a;

    public vtl(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status) {
        if (status.c()) {
            this.a.a((Object) null);
        } else {
            this.a.a((Exception) new ibr(status));
        }
    }
}
