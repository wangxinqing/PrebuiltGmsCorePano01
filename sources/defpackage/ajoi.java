package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: ajoi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajoi extends DialogFragment implements DialogInterface.OnClickListener {
    private final ajoh a() {
        if (getTargetFragment() instanceof ajoh) {
            return (ajoh) getTargetFragment();
        }
        if (getActivity() instanceof ajoh) {
            return (ajoh) getActivity();
        }
        return null;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        ajoh a = a();
        if (a != null) {
            getArguments();
            a.a(getTag());
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ajoh a = a();
        if (a == null) {
            return;
        }
        if (i == -2) {
            getArguments();
            a.b(getTag());
        } else if (i == -1) {
            getArguments();
            a.c(getTag());
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        CharSequence charSequence;
        Bundle arguments = getArguments();
        Activity activity = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        if (arguments.containsKey("title")) {
            builder.setTitle(arguments.getString("title"));
        }
        if (arguments.containsKey("titleId")) {
            builder.setTitle(arguments.getInt("titleId"));
        }
        if (arguments.containsKey("message")) {
            charSequence = arguments.getCharSequence("message");
        } else {
            charSequence = null;
        }
        if (arguments.containsKey("messageId")) {
            charSequence = activity.getString(arguments.getInt("messageId"));
        }
        if (charSequence != null) {
            if (!arguments.containsKey("process_html")) {
                builder.setMessage(charSequence);
            } else {
                TextView textView = (TextView) getActivity().getLayoutInflater().inflate(R.layout.common_dialog_message, (ViewGroup) null);
                textView.setText(Html.fromHtml(charSequence.toString()));
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                builder.setView(textView);
            }
        }
        if (arguments.containsKey("positive")) {
            builder.setPositiveButton(arguments.getString("positive"), this);
        }
        if (arguments.containsKey("positiveId")) {
            builder.setPositiveButton(arguments.getInt("positiveId"), this);
        }
        if (arguments.containsKey("negative")) {
            builder.setNegativeButton(arguments.getString("negative"), this);
        }
        if (arguments.containsKey("negativeId")) {
            builder.setNegativeButton(arguments.getInt("negativeId"), this);
        }
        AlertDialog create = builder.create();
        if (arguments.containsKey("enablingCheckbox")) {
            int i = arguments.getInt("enablingCheckbox");
            View inflate = getActivity().getLayoutInflater().inflate(R.layout.alert_dialog_checkbox, (ViewGroup) null);
            create.setView(inflate);
            CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.checkbox);
            checkBox.setText(i);
            checkBox.setOnCheckedChangeListener(new ajoe(create));
            create.setOnShowListener(new ajof(create, checkBox));
            create.setOnDismissListener(new ajog(checkBox));
        }
        return create;
    }

    public final void onResume() {
        TextView textView;
        super.onResume();
        if (getDialog() != null && (textView = (TextView) getDialog().findViewById(16908299)) != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public static ajoi a(int i, int i2, int i3, int i4) {
        ajoi ajoi = new ajoi();
        Bundle bundle = new Bundle();
        if (i != 0) {
            bundle.putInt("titleId", i);
        }
        bundle.putInt("messageId", i2);
        bundle.putInt("positiveId", i3);
        if (i4 != 0) {
            bundle.putInt("negativeId", i4);
        }
        ajoi.setArguments(bundle);
        return ajoi;
    }
}
