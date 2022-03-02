package defpackage;

import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: qhn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhn extends qic {
    final /* synthetic */ qij b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qhn(qij qij) {
        super(qij, "checkOpNoThrow");
        this.b = qij;
    }

    public final Bundle a(Bundle bundle) {
        qhj qhj = this.b.d;
        String string = bundle.getString("op");
        int i = 2;
        if (((qhk) qhj).a(bundle.getInt("uid"), bundle.getString("packageName"))) {
            try {
                i = ((qhk) qhj).c.d(string, ((qhk) qhj).d.getPackageInfo("com.google.android.instantapps.supervisor", 0).applicationInfo.uid, "com.google.android.instantapps.supervisor");
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("result", i);
        return bundle2;
    }
}
