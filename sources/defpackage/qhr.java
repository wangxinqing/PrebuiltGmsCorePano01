package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;

/* renamed from: qhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhr extends qii {
    final /* synthetic */ qij b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qhr(qij qij) {
        super(qij, "getApplicationLabel");
        this.b = qij;
    }

    public final Bundle a(Bundle bundle, String str) {
        String str2;
        try {
            str2 = ((qhk) this.b.d).a.c(str);
        } catch (IOException e) {
            Log.e("IAMetadataManagerImpl", "Exception reading app name", e);
            str2 = null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("result", str2);
        return bundle2;
    }
}
