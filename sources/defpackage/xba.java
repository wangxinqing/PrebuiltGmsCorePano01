package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: xba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xba extends wzu {
    private final idg a;

    public final void a(int i, Bundle bundle, DataHolder dataHolder) {
        String str;
        Status a2 = xbi.a(i, bundle);
        xfk a3 = xbi.a(dataHolder);
        if (dataHolder != null) {
            str = dataHolder.f.getString("pageToken");
        } else {
            str = null;
        }
        this.a.a((Object) new xbg(a2, a3, str));
    }

    public xba(idg idg) {
        this.a = idg;
    }
}
