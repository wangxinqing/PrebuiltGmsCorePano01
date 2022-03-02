package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: ysh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ysh extends DialogFragment implements DialogInterface.OnClickListener {
    private String a;
    private String b;
    private String c;

    private final void a(boolean z) {
        ysg ysg = (ysg) getActivity();
        if (ysg != null) {
            ysg.a(z);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof ysg)) {
            throw new IllegalStateException("Activity must implement AddToCircleConsentDialogHost.");
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        a(false);
        super.onCancel(dialogInterface);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        a(i == -1);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.a = arguments.getString("consentHtml");
        this.b = arguments.getString("titleText");
        this.c = arguments.getString("buttonText");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        AlertDialog.Builder title = new AlertDialog.Builder(new ContextThemeWrapper(activity, 2132019132)).setTitle(this.b);
        View inflate = activity.getLayoutInflater().inflate(R.layout.plus_add_to_circle_consent_dialog, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.consent_text);
        textView.setText(Html.fromHtml(this.a));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setClickable(true);
        return title.setView(inflate).setPositiveButton(this.c, this).setInverseBackgroundForced(true).setCancelable(true).create();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        a(false);
        super.onDismiss(dialogInterface);
    }
}
