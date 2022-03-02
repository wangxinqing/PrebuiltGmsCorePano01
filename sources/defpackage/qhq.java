package defpackage;

import android.os.Bundle;
import java.io.IOException;

/* renamed from: qhq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhq extends qii {
    final /* synthetic */ qij b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qhq(qij qij) {
        super(qij, "getWHApplicationInfo");
        this.b = qij;
    }

    public final Bundle a(Bundle bundle, String str) {
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("result", this.b.d.a(str, bundle.getInt("flags")));
            return bundle2;
        } catch (IOException e) {
            return new Bundle();
        }
    }
}
