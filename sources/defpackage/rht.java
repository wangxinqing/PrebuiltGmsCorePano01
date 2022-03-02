package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: rht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rht extends ift {
    final /* synthetic */ acwd a;

    public rht(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status) {
        int i = status.i;
        if (i == 9201) {
            this.a.a((Object) true);
        } else if (i == 9202) {
            this.a.a((Object) false);
        } else {
            this.a.a((Exception) irj.a(status));
        }
    }
}
