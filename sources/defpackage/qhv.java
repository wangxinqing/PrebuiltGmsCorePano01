package defpackage;

import android.os.Bundle;

/* renamed from: qhv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhv extends qfd {
    final /* synthetic */ qij b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qhv(qij qij) {
        super("getAppPackageForUid");
        this.b = qij;
    }

    public final Bundle a(qfc qfc, String str, Bundle bundle) {
        if (jkr.e()) {
            return new Bundle();
        }
        String a = this.b.d.a(bundle.getInt("uid"));
        Bundle bundle2 = new Bundle();
        if (a != null && this.b.a(qfc, a)) {
            bundle2.putString("result", a);
        }
        return bundle2;
    }
}
