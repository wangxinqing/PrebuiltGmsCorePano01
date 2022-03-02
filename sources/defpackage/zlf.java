package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: zlf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zlf extends DialogFragment implements CompoundButton.OnCheckedChangeListener, DialogInterface.OnClickListener {
    public static final /* synthetic */ int a = 0;
    private zle b;
    private String c;
    private String d;
    private String e;
    private boolean f;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.b = (zle) activity;
        } catch (ClassCastException e2) {
            throw new ClassCastException(String.valueOf(activity.toString()).concat(" must implement InstallAppDialogFragmentCallbacks"));
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.b.a(this.f);
        dismiss();
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.getId() == R.id.plus_install_app_dialog_checkbox) {
            this.f = z;
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            zle zle = this.b;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("http://market.android.com/details?id=%1$s&rdid=%1$s&rdot=1", new Object[]{this.e})));
            intent.setPackage("com.android.vending");
            intent.putExtra("use_direct_purchase", true);
            intent.addFlags(524288);
            zle.a(intent, this.f);
        } else {
            this.b.a(this.f);
        }
        dismiss();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.c = arguments.getString("dialog_title");
        this.d = arguments.getString("dialog_message");
        this.e = arguments.getString("target_package");
        boolean z = false;
        if (bundle != null && bundle.getBoolean("dont_ask_again")) {
            z = true;
        }
        this.f = z;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder title = new AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 2132019132)).setTitle(this.c);
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.plus_install_app_dialog, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.plus_install_app_dialog_message)).setText(this.d);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.plus_install_app_dialog_checkbox);
        checkBox.setText(getString(R.string.plus_install_app_dialog_checkbox_text));
        checkBox.setChecked(this.f);
        checkBox.setOnCheckedChangeListener(this);
        AlertDialog create = title.setView(inflate).setPositiveButton(R.string.plus_install_app_dialog_positive_button, this).setNegativeButton(R.string.plus_install_app_dialog_negative_button, this).setInverseBackgroundForced(true).setCancelable(true).create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("dont_ask_again", this.f);
    }
}
