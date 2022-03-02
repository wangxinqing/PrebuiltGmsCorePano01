package defpackage;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;
import com.google.android.gms.feedback.FeedbackChimeraActivity;

/* renamed from: mxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mxp extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        Drawable drawable;
        sr srVar = new sr(getActivity());
        Activity activity = getActivity();
        View inflate = activity.getLayoutInflater().inflate(R.layout.gf_material2_thank_you_dialog, (ViewGroup) null);
        inflate.findViewById(R.id.gf_suggestion_cardview_container).setVisibility(0);
        View findViewById = inflate.findViewById(R.id.gf_suggestion_button_container);
        findViewById.setVisibility(0);
        if (ofq.b(axhh.a.a().b()) && (activity instanceof FeedbackChimeraActivity)) {
            findViewById.findViewById(R.id.gf_dismiss_thank_you).setOnClickListener(new mxn(activity));
            findViewById.findViewById(R.id.gf_read_more_thank_you).setOnClickListener(new mxo(activity));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.gf_article_title);
        textView.setText(getArguments().getString("help_response_title"));
        if (ofq.b(axhh.a.a().c())) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if (compoundDrawables[0] != null) {
                if (ofy.b()) {
                    drawable = ofx.b(compoundDrawables[0], getContext(), ofy.a(getContext(), R.attr.gf_primaryBlueColor));
                } else {
                    drawable = ofx.a(compoundDrawables[0], getResources());
                    ofx.a(drawable, getContext(), (int) R.color.google_blue600);
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        ((TextView) inflate.findViewById(R.id.gf_article_snippet)).setText(Html.fromHtml(getArguments().getString("help_response_snippet")));
        srVar.b(inflate);
        return srVar.b();
    }
}
