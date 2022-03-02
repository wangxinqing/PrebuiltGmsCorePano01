package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: xax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xax extends wzu {
    private final idg a;

    public final void a(int i, Bundle bundle, DataHolder dataHolder) {
        xfh xfh;
        Status a2 = xbi.a(i, bundle);
        if (dataHolder != null) {
            xfh = new xfh(dataHolder);
        } else {
            xfh = null;
        }
        this.a.a((Object) new xbd(a2, xfh));
    }

    public xax(idg idg) {
        this.a = idg;
    }
}
