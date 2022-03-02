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

/* renamed from: evy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class evy extends qce {
    public static final anaf a;
    public BottomSheetBehavior b;
    public fcl c;
    private eyf d;
    private fcq e;
    private int f;
    private int g;
    private View h;
    private fgr i;

    static {
        anab h2 = anaf.h();
        h2.a(1, "fragment_tag_loading_page");
        h2.a(3, "fragment_tag_multi_credential");
        h2.a(2, "fragment_tag_single_credential");
        h2.a(4, "fragment_tag_confirmation");
        a = h2.a();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f = displayMetrics.widthPixels;
        this.g = displayMetrics.heightPixels;
        this.c = new fcl(getChildFragmentManager(), this.h, this.g, bundle);
        Activity activity = getActivity();
        this.e = (fcq) qck.a(activity).a(fcq.class);
        eyf eyf = (eyf) qck.a(activity).a(eyf.class);
        this.d = eyf;
        eyf.k.a(this, new evv(this));
        this.e.c.a(this, new evw(this));
        this.i = new fgr(this, this.d.g, (hol) null);
        eyf eyf2 = this.d;
        if (!eyf2.t) {
            eyf2.t = true;
            eyf2.c();
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        ajtu ajtu = (ajtu) super.onCreateDialog(bundle);
        ajtu.setOnShowListener(new evx(this, ajtu));
        return ajtu;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.credentials_gis_bottomsheet_dialog, viewGroup, false);
        this.h = inflate;
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!getActivity().isChangingConfigurations() && this.d.j.b() == null) {
            this.i.a(6);
            this.d.b();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onResume() {
        int i2;
        Window window;
        super.onResume();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.credentials_gis_bottomsheet_dialog_lower_width_threshold);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.credentials_gis_bottomsheet_dialog_upper_width_threshold);
        int i3 = this.f;
        if (i3 > dimensionPixelSize2) {
            i2 = getResources().getDimensionPixelSize(R.dimen.credentials_gis_bottomsheet_dialog_adjusted_larger_width);
        } else {
            i2 = i3 > dimensionPixelSize ? getResources().getDimensionPixelSize(R.dimen.credentials_gis_bottomsheet_dialog_adjusted_intermediate_width) : 0;
        }
        Dialog dialog = getDialog();
        if (dialog != null && i2 > 0 && (window = dialog.getWindow()) != null) {
            window.setLayout(i2, -1);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.c.a(bundle);
        super.onSaveInstanceState(bundle);
    }
}
