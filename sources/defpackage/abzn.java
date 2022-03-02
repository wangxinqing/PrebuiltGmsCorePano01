package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: abzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abzn implements idg {
    private final acwd a;

    public abzn(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status) {
        this.a.a((Exception) new ibr(status));
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Status status = (Status) obj;
        if (status.c()) {
            this.a.a((Object) null);
        } else {
            this.a.a((Exception) new ibr(status));
        }
    }
}
