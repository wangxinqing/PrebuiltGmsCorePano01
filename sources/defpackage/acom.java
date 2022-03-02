package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: acom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acom extends DialogFragment {
    private static final Boolean e = false;
    public acol a;
    public String b;
    public String c;
    public boolean d;

    public static acom a(String str, boolean z) {
        amrl.a((Object) str);
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.ssid", str);
        bundle.putBoolean("failure", z);
        acom acom = new acom();
        acom.setArguments(bundle);
        return acom;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            try {
                this.a = (acol) parentFragment;
            } catch (ClassCastException e2) {
                throw new RuntimeException("Containing fragment must implement WifiPasswordFragment.Listener", e2);
            }
        } else {
            Activity activity2 = getActivity();
            if (activity2 != null) {
                try {
                    this.a = (acol) activity2;
                } catch (ClassCastException e3) {
                    throw new RuntimeException("Containing activity must implement WifiPasswordFragment.Listener", e3);
                }
            }
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        String string = arguments.getString("smartdevice.ssid");
        amrl.a((Object) string);
        this.b = string;
        arguments.getBoolean("failure", false);
        this.c = "";
        if (bundle != null) {
            this.d = bundle.getBoolean("smartdevice.WifiPasswordFragment.showPassword", e.booleanValue());
            this.c = bundle.getString("smartdevice.wifiPassword", this.c);
        }
        Activity activity = getActivity();
        if (activity != null) {
            View inflate = activity.getLayoutInflater().inflate(R.layout.smartdevice_wifi_password_fragment, (ViewGroup) null);
            AlertDialog create = new AlertDialog.Builder(activity).setTitle(this.b).setView(inflate).setPositiveButton(R.string.common_continue, new acoh(this)).setNegativeButton(R.string.common_cancel, new acof()).create();
            create.setOnShowListener(new acoi(this, create));
            EditText editText = (EditText) inflate.findViewById(R.id.password_edittext);
            editText.requestFocus();
            editText.setText(this.c);
            editText.addTextChangedListener(new acoj(this, create));
            CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.checkbox_meat);
            checkBox.setChecked(this.d);
            checkBox.setOnCheckedChangeListener(new acok(this));
            return create;
        }
        throw new IllegalStateException("null activity");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("smartdevice.wifiPassword", this.c);
        bundle.putBoolean("smartdevice.WifiPasswordFragment.showPassword", this.d);
    }

    public final void a() {
        Dialog dialog = getDialog();
        amrl.a((Object) dialog);
        ((EditText) dialog.findViewById(R.id.password_edittext)).setTransformationMethod(!this.d ? new PasswordTransformationMethod() : new SingleLineTransformationMethod());
    }

    public final void a(AlertDialog alertDialog) {
        alertDialog.getButton(-1).setEnabled(this.c.length() >= 8);
    }
}
