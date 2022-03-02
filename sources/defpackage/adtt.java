package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;
import com.google.android.gms.usagereporting.ui.UsageReportingDialogChimeraActivity;

/* renamed from: adtt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adtt extends DialogFragment implements DialogInterface.OnClickListener {
    public final void onClick(DialogInterface dialogInterface, int i) {
        UsageReportingDialogChimeraActivity usageReportingDialogChimeraActivity = (UsageReportingDialogChimeraActivity) getActivity();
        if (i == -1) {
            usageReportingDialogChimeraActivity.a("com.google.android.gms.usagereporting.OPTIN_UR");
        } else if (i == -2) {
            usageReportingDialogChimeraActivity.a("com.google.android.gms.usagereporting.OPTOUT_UR");
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.usage_reporting_dialog, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.learn_more_text)).setOnClickListener(new adts((TextView) inflate.findViewById(R.id.usage_reporting_more_text), (TextView) inflate.findViewById(R.id.usage_reporting_control_text)));
        builder.setView(inflate).setInverseBackgroundForced(true).setTitle(R.string.usage_reporting_dialog_title).setPositiveButton(R.string.common_allow, this).setNegativeButton(R.string.common_deny, this);
        return builder.create();
    }

    public final void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage((Message) null);
        }
        super.onDestroyView();
    }
}
