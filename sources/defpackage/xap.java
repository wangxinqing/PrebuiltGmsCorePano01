package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: xap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xap extends wzu {
    private final idg a;

    public final void a(int i, Bundle bundle, DataHolder dataHolder) {
        xfe xfe;
        Status a2 = xbi.a(i, bundle);
        if (dataHolder != null) {
            xfe = new xfe(dataHolder);
        } else {
            xfe = null;
        }
        this.a.a((Object) new xad(a2, xfe));
    }

    public xap(idg idg) {
        this.a = idg;
    }
}
