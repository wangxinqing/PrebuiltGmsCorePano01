package defpackage;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.io.IOException;

/* renamed from: qhw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhw extends qii {
    final /* synthetic */ qij b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qhw(qij qij) {
        super(qij, "getWHPackageInfo");
        this.b = qij;
    }

    public final Bundle a(Bundle bundle, String str) {
        try {
            PackageInfo b2 = this.b.d.b(str, bundle.getInt("flags"));
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("result", b2);
            return bundle2;
        } catch (IOException e) {
            return new Bundle();
        }
    }
}
