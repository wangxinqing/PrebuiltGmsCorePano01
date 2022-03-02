package defpackage;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: adgp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adgp extends adfz {
    public static final /* synthetic */ int c = 0;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.udc_loading_fragment, viewGroup, false);
        adfz.a(inflate, R.id.text, getArguments().getString("UdcDialogMessage"));
        return inflate;
    }

    public final /* bridge */ /* synthetic */ Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage(arguments.getString("UdcDialogMessage"));
        return progressDialog;
    }
}
