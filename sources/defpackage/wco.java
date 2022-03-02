package defpackage;

import android.net.Uri;
import android.os.Handler;

/* renamed from: wco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wco extends qvv {
    final /* synthetic */ wcp a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wco(wcp wcp, String str, String str2, Handler handler) {
        super(str, str2, handler);
        this.a = wcp;
    }

    public final void a(boolean z, Uri uri) {
        ((anih) ((anih) vvj.a.d()).a("wco", "a", 131, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The contact book (uri: %s) has been modified.", (Object) uri);
        if (!ayni.a.a().j()) {
            this.a.a(true);
        } else if (this.a.g.getAndSet(true)) {
            ((anih) ((anih) vvj.a.d()).a("wco", "a", 142, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring the contact book change, as we're already batching the request.");
        } else {
            this.a.f.postDelayed(new wcn(this), ayni.a.a().x());
            ((anih) ((anih) vvj.a.d()).a("wco", "a", 140, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Batching the contact book change. We will sync shortly.");
        }
    }
}
