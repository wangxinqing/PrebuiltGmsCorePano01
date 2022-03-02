package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: fdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fdu extends qce {
    public static final anaf a;
    public BottomSheetBehavior b;
    public fcl c;
    private int d;
    private int e;
    private View f;
    private fez g;
    private fcq h;

    static {
        anab h2 = anaf.h();
        h2.a(1, "loading_page");
        h2.a(2, "confirmation_page");
        h2.a(3, "account_selection_page");
        a = h2.a();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.d = displayMetrics.widthPixels;
        this.e = displayMetrics.heightPixels;
        this.c = new fcl(getChildFragmentManager(), this.f, this.e, bundle);
        this.h = (fcq) qck.a(activity).a(fcq.class);
        fez fez = (fez) qck.a(activity).a(fez.class);
        this.g = fez;
        fez.i.a(this, new fdr(this));
        this.h.c.a(this, new fds(this));
        fez fez2 = this.g;
        if (!fez2.q) {
            fez2.q = true;
            fez2.a();
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        ajtu ajtu = (ajtu) super.onCreateDialog(bundle);
        ajtu.setOnShowListener(new fdt(this, ajtu));
        return ajtu;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.credentials_gis_bottomsheet_dialog, viewGroup, false);
        this.f = inflate;
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!getActivity().isChangingConfigurations() && this.g.l.b() == null) {
            this.g.b();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onResume() {
        int i;
        Window window;
        super.onResume();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.credentials_gis_bottomsheet_dialog_lower_width_threshold);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.credentials_gis_bottomsheet_dialog_upper_width_threshold);
        int i2 = this.d;
        if (i2 > dimensionPixelSize2) {
            i = getResources().getDimensionPixelSize(R.dimen.credentials_gis_bottomsheet_dialog_adjusted_larger_width);
        } else {
            i = i2 > dimensionPixelSize ? getResources().getDimensionPixelSize(R.dimen.credentials_gis_bottomsheet_dialog_adjusted_intermediate_width) : 0;
        }
        Dialog dialog = getDialog();
        if (dialog != null && i > 0 && (window = dialog.getWindow()) != null) {
            window.setLayout(i, -1);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.c.a(bundle);
        super.onSaveInstanceState(bundle);
    }
}
