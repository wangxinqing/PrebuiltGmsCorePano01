package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: gvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gvj extends ift {
    private final acwd a;

    public gvj(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status) {
        if (ibt.e(status.i)) {
            this.a.a((Exception) new ibr(status));
        } else {
            this.a.a((Object) Boolean.valueOf(ibt.d(status.i)));
        }
    }
}
