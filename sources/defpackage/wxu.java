package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: wxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wxu implements xaf {
    final /* synthetic */ wxw a;

    public wxu(wxw wxw) {
        this.a = wxw;
    }

    public final void a(int i, Bundle bundle) {
        bundle.setClassLoader(getClass().getClassLoader());
        DataHolder dataHolder = (DataHolder) bundle.getParcelable("gaia_map");
        boolean z = bundle.getBoolean("response_complete");
        if (dataHolder != null) {
            this.a.b.add(dataHolder);
        }
        wxw wxw = this.a;
        if (wxw.a.d && !wxw.p) {
            if (dataHolder != null || z) {
                wxw.p = true;
                this.a.a(dataHolder);
            }
        }
    }
}
