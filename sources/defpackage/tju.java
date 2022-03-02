package defpackage;

import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;

/* renamed from: tju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tju extends ugz {
    final /* synthetic */ AcceptConnectionRequestParams a;
    final /* synthetic */ tjv b;

    public tju(tjv tjv, AcceptConnectionRequestParams acceptConnectionRequestParams) {
        this.b = tjv;
        this.a = acceptConnectionRequestParams;
    }

    public final void a(int i) {
        if (i == 0) {
            ((anih) ((anih) tky.a.d()).a("tju", "a", 432, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ApiCompat.AdvertiserConnectionLifecycleListener is dropping the result for acceptConnectionRequest() to endpoint %s until onConnectionResult() is called. This is a workaround for legacy clients.", (Object) this.a.c);
        } else {
            this.b.b.a(i);
        }
    }
}
