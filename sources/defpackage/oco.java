package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oco extends DialogFragment {
    private boolean a;

    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        HelpConfig helpConfig = ((HelpChimeraActivity) getActivity()).x;
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.gh_operation_hours_dialog, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.gh_operation_hours_items);
        for (avmt a2 : helpConfig.u()) {
            avmt a3 = obl.a(a2, this.a, helpConfig, getContext());
            if (a3 != avmt.UNKNOWN_CONTACT_MODE) {
                avnm a4 = obl.a(a3, helpConfig);
                avmt a5 = avmt.a(a4.b);
                if (a5 == null) {
                    a5 = avmt.UNKNOWN_CONTACT_MODE;
                }
                aucd aucd = (aucd) a4.c(5);
                aucd.a((aucj) a4);
                if (a4.e || !helpConfig.b(a5)) {
                    z = true;
                } else {
                    z = false;
                }
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                avnm avnm = (avnm) aucd.b;
                avnm avnm2 = avnm.f;
                avnm.a |= 4;
                avnm.e = z;
                avnm avnm3 = (avnm) aucd.i();
                if (obl.a(avnm3)) {
                    new ocl(avnm3, linearLayout, R.layout.gh_operation_hours_dialog_item, (View.OnClickListener) null);
                }
                if (a5 == avmt.PHONE || a5 == avmt.C2C) {
                    this.a = true;
                }
            }
        }
        sr srVar = new sr(getContext());
        srVar.b(inflate);
        ss b = srVar.b();
        inflate.findViewById(R.id.gh_operation_hours_ok_button).setOnClickListener(new ocm(b));
        inflate.findViewById(R.id.gh_operation_hours_transparent_layout).setOnClickListener(new ocn(b));
        Window window = b.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return b;
    }
}
