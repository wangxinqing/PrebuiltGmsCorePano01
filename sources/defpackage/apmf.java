package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: apmf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apmf extends ift {
    final /* synthetic */ acwd a;
    final /* synthetic */ apmg b;

    public apmf(apmg apmg, acwd acwd) {
        this.b = apmg;
        this.a = acwd;
    }

    public final void a(Status status) {
        if (!this.a.b((Object) null)) {
            return;
        }
        if (status.c()) {
            this.b.a.b.a((Object) null);
        } else {
            this.b.a.b.a((Exception) apnd.a(status, "Indexing error, please try again."));
        }
    }
}
