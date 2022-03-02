package defpackage;

import android.os.Bundle;

/* renamed from: qhy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhy extends qic {
    final /* synthetic */ qij b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qhy(qij qij) {
        super(qij, "hasPermission");
        this.b = qij;
    }

    public final Bundle a(Bundle bundle) {
        boolean z;
        qhj qhj = this.b.d;
        int i = bundle.getInt("uid");
        String string = bundle.getString("permissionName");
        qhk qhk = (qhk) qhj;
        String a = qhk.a(i);
        if (a != null) {
            z = qhk.a(a, string);
        } else {
            z = false;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("result", z);
        return bundle2;
    }
}
