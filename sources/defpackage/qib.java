package defpackage;

import android.os.Bundle;

/* renamed from: qib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qib extends qic {
    final /* synthetic */ qij b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qib(qij qij) {
        super(qij, "packageHasPermission");
        this.b = qij;
    }

    public final Bundle a(Bundle bundle) {
        boolean a = this.b.d.a(bundle.getString("packageName"), bundle.getString("permissionName"));
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("result", a);
        return bundle2;
    }
}
