package defpackage;

import android.accounts.Account;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentEntity;

/* renamed from: yms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yms extends DialogFragment implements DialogInterface.OnClickListener {
    private ymr a;
    private Account b;
    private MomentEntity c;
    private String d;
    private String e;

    public static yms a(Account account, MomentEntity momentEntity, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("account", account);
        bundle.putParcelable("moment", momentEntity);
        bundle.putString("calling_package_name", str);
        yms yms = new yms();
        yms.setShowsDialog(true);
        yms.setArguments(bundle);
        return yms;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof ymr) {
            this.a = (ymr) activity;
            return;
        }
        throw new IllegalStateException("DeleteMomentChimeraDialog has to be hosted by an Activity that implements OnDeleteMomentAcceptedListener.");
    }

    public final void onCancel(DialogInterface dialogInterface) {
        izr.a((Context) getActivity(), this.b.name, (String) null, iak.j, ial.i, this.d);
        int i = Build.VERSION.SDK_INT;
        a();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != -1) {
            izr.a((Context) getActivity(), this.b.name, (String) null, iak.j, ial.i, this.d);
            int i2 = Build.VERSION.SDK_INT;
            a();
        } else {
            ymr ymr = this.a;
            if (ymr != null) {
                ymr.a(this.c.g);
                izr.a((Context) getActivity(), this.b.name, (String) null, iak.i, ial.i, this.d);
            } else {
                return;
            }
        }
        dismiss();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.b = (Account) arguments.getParcelable("account");
        this.c = (MomentEntity) arguments.getParcelable("moment");
        this.d = arguments.getString("calling_package_name");
        this.e = arguments.getString("acl_text");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(getActivity()).setIcon(0).setPositiveButton(R.string.common_ui_confirm_deleting_button, this).setNegativeButton(R.string.common_cancel, this);
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.plus_delete_moment_dialog_contents, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.message)).setText(this.c.e);
        if (this.e != null) {
            String string = getActivity().getString(R.string.plus_delete_dialog_acl_label);
            String str = this.e;
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
            sb.append(string);
            sb.append("\n");
            sb.append(str);
            ((TextView) inflate.findViewById(R.id.acl_message)).setText(sb.toString());
        }
        return negativeButton.setView(inflate).setInverseBackgroundForced(true).create();
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }

    private final void a() {
        dismiss();
        getActivity().setResult(0);
        getActivity().finish();
    }
}
