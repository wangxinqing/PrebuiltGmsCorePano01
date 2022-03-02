package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: hka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hka extends ift {
    private final acwd a;

    public hka(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status) {
        if (status.c()) {
            this.a.a((Object) null);
        } else {
            this.a.a((Exception) irj.a(status));
        }
    }
}
