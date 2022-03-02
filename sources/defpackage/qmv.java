package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: qmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qmv extends qnh {
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.d.a(R.string.common_ok, new qmt(this));
        this.d.b(R.string.common_settings, new qmu(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.setup_restore_supervisor_success_fragment, viewGroup, false);
    }
}
