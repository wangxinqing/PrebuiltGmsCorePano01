package defpackage;

import android.accounts.Account;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: ync  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ync extends DialogFragment implements DialogInterface.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private ynb a;
    private Account b;
    private yxi c;
    private boolean d;
    private yls e;
    private String f;
    private boolean g;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof ynb) {
            this.a = (ynb) activity;
            return;
        }
        throw new IllegalStateException("DisconnectSourceChimeraDialog has to be hosted by an Activity that implements OnDisconnectSourceAcceptedListener.");
    }

    public final void onCancel(DialogInterface dialogInterface) {
        izr.a((Context) getActivity(), this.b.name, (String) null, iak.h, ial.c, this.f);
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.getId() == R.id.checkbox) {
            this.d = z;
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != -1) {
            izr.a((Context) getActivity(), this.b.name, (String) null, iak.h, ial.c, this.f);
        } else {
            ynb ynb = this.a;
            if (ynb != null) {
                ynb.a(this.c, this.d);
                if (this.d) {
                    izr.a((Context) getActivity(), this.b.name, (String) null, iak.g, ial.c, this.f);
                } else {
                    izr.a((Context) getActivity(), this.b.name, (String) null, iak.f, ial.c, this.f);
                }
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
        this.c = (yxi) arguments.getParcelable("application");
        boolean z = false;
        if (bundle != null && bundle.getBoolean("delete_all_frames")) {
            z = true;
        }
        this.d = z;
        this.e = ylt.a((Context) getActivity()).a(this.c);
        this.f = arguments.getString("calling_package_name");
        this.g = arguments.getBoolean("signed_up");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setIcon(0);
        builder.setPositiveButton(R.string.plus_disconnect_source_dialog_positive_button, this);
        builder.setNegativeButton(R.string.plus_disconnect_source_dialog_negative_button, this);
        builder.setInverseBackgroundForced(true);
        if (!this.g || !this.c.e()) {
            View inflate = getActivity().getLayoutInflater().inflate(R.layout.plus_disconnect_source_non_aspen_dialog_contents, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.message);
            if (!TextUtils.isEmpty(this.c.i())) {
                textView.setText(this.c.i());
            } else {
                textView.setText(getString(R.string.plus_disconnect_source_non_aspen_dialog_message));
            }
            builder.setView(inflate);
        } else {
            builder.setTitle(getString(R.string.plus_disconnect_source_dialog_title));
            CharSequence charSequence = this.e.a;
            View inflate2 = getActivity().getLayoutInflater().inflate(R.layout.plus_disconnect_source_dialog_contents, (ViewGroup) null);
            TextView textView2 = (TextView) inflate2.findViewById(R.id.message);
            if (!TextUtils.isEmpty(this.c.i())) {
                textView2.setText(this.c.i());
            } else {
                textView2.setText(getString(R.string.plus_disconnect_source_dialog_message, charSequence, charSequence));
            }
            CheckBox checkBox = (CheckBox) inflate2.findViewById(R.id.checkbox);
            checkBox.setText(getString(R.string.plus_disconnect_source_dialog_checkbox, charSequence));
            checkBox.setChecked(this.d);
            checkBox.setOnCheckedChangeListener(this);
            builder.setView(inflate2);
        }
        return builder.create();
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delete_all_frames", this.d);
    }
}
