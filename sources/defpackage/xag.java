package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: xag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xag extends wzu {
    private final idg a;

    public final void a(int i, Bundle bundle, Bundle bundle2) {
        Status a2 = xbi.a(i, bundle);
        String str = null;
        String string = bundle2 != null ? bundle2.getString("circle_id") : null;
        if (bundle2 != null) {
            str = bundle2.getString("circle_name");
        }
        this.a.a((Object) new xah(a2, string, str));
    }

    public xag(idg idg) {
        this.a = idg;
    }
}
