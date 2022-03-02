package defpackage;

import android.os.Bundle;

/* renamed from: qhu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhu extends qfd {
    final /* synthetic */ qij b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qhu(qij qij) {
        super("getInstantAppCookieMaxSize");
        this.b = qij;
    }

    public final Bundle a(qfc qfc, String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt("result", this.b.a());
        return bundle2;
    }
}
