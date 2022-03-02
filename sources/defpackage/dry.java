package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: dry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dry extends DialogFragment implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
    public final void onCancel(DialogInterface dialogInterface) {
        Activity activity = getActivity();
        activity.setResult(0);
        activity.finish();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = getActivity();
        if (i == -1) {
            Intent a = itg.a("com.google.android.gms");
            if (a.resolveActivity(activity.getPackageManager()) != null) {
                activity.startActivityForResult(a, 0);
                return;
            }
        }
        activity.setResult(0);
        activity.finish();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        ArrayList<String> stringArrayList = getArguments().getStringArrayList("missingGroups");
        Collections.sort(stringArrayList);
        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        View inflate = layoutInflater.inflate(R.layout.common_permissions_dialog_contents, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.permissions_list);
        Resources resources = getResources();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            View inflate2 = layoutInflater.inflate(R.layout.common_permissions_list, (ViewGroup) null);
            ((TextView) inflate2.findViewById(R.id.permission_name)).setText(resources.getString(((Integer) ixm.a.get(str)).intValue()));
            int intExtra = getActivity().getIntent().getIntExtra(str, 0);
            if (intExtra != 0) {
                TextView textView = (TextView) inflate2.findViewById(R.id.permission_explanation);
                textView.setText(resources.getString(intExtra));
                textView.setVisibility(0);
            }
            linearLayout.addView(inflate2);
        }
        return new AlertDialog.Builder(getActivity()).setView(inflate).setPositiveButton(R.string.common_permissions_open_settings, this).setNegativeButton(17039360, this).setInverseBackgroundForced(true).create();
    }
}
