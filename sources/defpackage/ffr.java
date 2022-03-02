package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: ffr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ffr extends qcg {
    public View a;
    public fcq b;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b = (fcq) qck.a(getActivity()).a(fcq.class);
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(new ffq(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(new vt((Context) getActivity(), (int) R.style.AppBottomSheetDialogTheme)).inflate(R.layout.credentials_gis_password_saving_loading, viewGroup, false);
        this.a = inflate.findViewById(R.id.loading_container);
        ((TextView) inflate.findViewById(R.id.title_text)).setText(R.string.credentials_gis_pw_saving_save_password);
        return inflate;
    }
}
