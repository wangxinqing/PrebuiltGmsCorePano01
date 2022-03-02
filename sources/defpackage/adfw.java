package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* renamed from: adfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adfw extends adfz implements DialogInterface.OnClickListener, View.OnClickListener {
    private CharSequence c;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.udc_alert_fragment, viewGroup, false);
        Bundle arguments = getArguments();
        adfz.a(inflate, R.id.header, arguments.getCharSequence("UdcDialogTitle"));
        adfz.a(inflate, R.id.text, arguments.getCharSequence("UdcDialogMessage"));
        this.c = TextUtils.concat(new CharSequence[]{arguments.getCharSequence("UdcDialogTitle"), " ", arguments.getCharSequence("UdcDialogMessage")});
        if (arguments.getBoolean("UdcDialogShowRetry", false)) {
            Button button = (Button) inflate.findViewById(R.id.udc_retry_button);
            button.setVisibility(0);
            button.setOnClickListener(this);
        }
        return inflate;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = getActivity();
        if (activity instanceof adfu) {
            ((adfu) activity).a();
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.udc_alert_dialog_message, (ViewGroup) null);
        adfz.a(inflate, R.id.udc_alert_message, arguments.getCharSequence("UdcDialogMessage"));
        AlertDialog.Builder view = new AlertDialog.Builder(getActivity()).setTitle(arguments.getCharSequence("UdcDialogTitle")).setView(inflate);
        if (arguments.containsKey("UdcDialogPositive")) {
            view.setPositiveButton(arguments.getCharSequence("UdcDialogPositive"), this);
        }
        if (arguments.containsKey("UdcDialogNegative")) {
            view.setNegativeButton(arguments.getCharSequence("UdcDialogNegative"), this);
        }
        return view.create();
    }

    public final void onResume() {
        super.onResume();
        adgq.a(getView(), this.c);
    }

    public void onClick(View view) {
        Activity activity = getActivity();
        if (activity instanceof adfv) {
            ((adfv) activity).a();
        }
    }
}
