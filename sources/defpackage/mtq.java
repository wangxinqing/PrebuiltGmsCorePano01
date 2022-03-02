package defpackage;

import android.net.Uri;

/* renamed from: mtq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mtq extends arwm {
    final /* synthetic */ Uri a;
    final /* synthetic */ mts b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mtq(mts mts, String str, Uri uri) {
        super(str);
        this.b = mts;
        this.a = uri;
    }

    public final void run() {
        ((anih) ((anih) mte.a.d()).a("mtq", "run", 131, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ServiceBindHelper: auto unpin triggered, uri = %s", (Object) this.a.toString());
        this.b.b(this.a);
    }
}
