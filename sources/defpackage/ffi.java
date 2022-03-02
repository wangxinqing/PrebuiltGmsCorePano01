package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* renamed from: ffi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ffi extends qcg implements fcr {
    public fez a;
    public fcq b;
    public RecyclerView c;
    public fco d;
    private TextView e;

    public final void a(fcp fcp, int i) {
        fez fez = this.a;
        fez.m.b(fcp);
        fez.g.b((Object) qcu.ACCOUNT_CONFIRMATION);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.a.k.a(this, new ffg(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(new vt(getContext(), (int) R.style.AppBottomSheetDialogTheme)).inflate(R.layout.credentials_gis_password_saving_account_selection, viewGroup, false);
        Activity activity = getActivity();
        this.a = (fez) qck.a(activity).a(fez.class);
        this.b = (fcq) qck.a(activity).a(fcq.class);
        this.e = (TextView) inflate.findViewById(R.id.save_informative_text);
        this.c = (RecyclerView) inflate.findViewById(R.id.list);
        ((TextView) inflate.findViewById(R.id.title_text)).setText(R.string.common_choose_account_label);
        this.e.setText(getString(R.string.credentials_gis_pw_saving_selection_text, this.a.c()));
        fco fco = new fco(this, this.a.c);
        this.d = fco;
        this.c.setAdapter(fco);
        this.c.setHasFixedSize(true);
        RecyclerView recyclerView = this.c;
        getContext();
        recyclerView.setLayoutManager(new abk());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.credentials_assisted_dialog_side_padding);
        qcm.a(getContext(), this.c, 0, R.drawable.credentials_assisted_divider_drawable, dimensionPixelSize, dimensionPixelSize);
        return inflate;
    }
}
