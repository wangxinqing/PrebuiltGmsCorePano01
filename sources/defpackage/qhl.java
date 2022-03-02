package defpackage;

import android.os.Bundle;

/* renamed from: qhl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhl extends qic {
    final /* synthetic */ qij b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qhl(qij qij) {
        super(qij, "allowApiAccess");
        this.b = qij;
    }

    public final Bundle a(Bundle bundle) {
        qhj qhj = this.b.d;
        int i = bundle.getInt("uid");
        bundle.getString("packageName");
        int i2 = bundle.getInt("serviceId");
        String b2 = ((qhk) qhj).b.b(i);
        boolean z = true;
        if (b2 != null && !qfh.a().contains(Integer.valueOf(i2))) {
            z = false;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("result", z);
        return bundle2;
    }
}
