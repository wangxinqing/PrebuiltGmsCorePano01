package defpackage;

import android.os.Bundle;

/* renamed from: qhm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhm extends qic {
    final /* synthetic */ qij b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qhm(qij qij) {
        super(qij, "checkAppPackage");
        this.b = qij;
    }

    public final Bundle a(Bundle bundle) {
        qhj qhj = this.b.d;
        int i = bundle.getInt("uid");
        String string = bundle.getString("packageName");
        boolean z = false;
        if (string != null && string.equals(((qhk) qhj).a(i))) {
            z = true;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("result", z);
        return bundle2;
    }
}
