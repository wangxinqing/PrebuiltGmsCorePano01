package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.common.ui.URLSpanNoUnderline;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: oay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oay {
    public static EditText a(Context context, CompoundButton compoundButton) {
        EditText editText = new EditText(context);
        editText.setSingleLine();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(compoundButton.getCompoundPaddingLeft(), 0, 0, 0);
        editText.setLayoutParams(layoutParams);
        a(editText, compoundButton.getText().toString(), false);
        return editText;
    }

    public static TextView b(Context context, String str, boolean z) {
        String str2 = !z ? "" : " *";
        TextView a = a(context, str2.length() == 0 ? new String(str) : str.concat(str2), true);
        a(a, z);
        return a;
    }

    public static TextView a(Context context, String str, boolean z) {
        TextView textView = new TextView(context);
        textView.setText(Html.fromHtml(str));
        if (z) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        return textView;
    }

    public static void a(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void a(View view, int i) {
        view.announceForAccessibility(view.getResources().getString(i));
    }

    public static void a(View view, int i, View.OnClickListener onClickListener) {
        ImageView imageView = (ImageView) view.findViewById(R.id.gh_error_icon);
        if (imageView != null) {
            ofx.a(imageView, view.getContext(), ofy.a(view.getContext(), R.attr.gh_primaryRedColor));
        }
        TextView textView = (TextView) view.findViewById(R.id.gh_error_status_subtext);
        if (textView != null) {
            textView.setText(i);
        }
        Button button = (Button) view.findViewById(R.id.gh_error_request_again_button);
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    public static void a(EditText editText, String str, boolean z) {
        Context context = editText.getContext();
        String obj = Html.fromHtml(jlh.a(str)).toString();
        if (z) {
            String valueOf = String.valueOf(obj);
            String valueOf2 = String.valueOf(context.getString(R.string.gh_required_announce_suffix));
            obj = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        }
        editText.setContentDescription(obj);
    }

    public static void a(TextView textView, oiy oiy, avmt avmt) {
        Resources resources = oiy.getResources();
        String string = resources.getString(R.string.common_system_info_composed_string);
        String string2 = resources.getString(R.string.common_privacy_policy_composed_string);
        String string3 = resources.getString(R.string.common_terms_of_service_composed_string);
        Spannable a = URLSpanNoUnderline.a(Html.fromHtml(resources.getString(R.string.gh_application_info_privacy_policy_message, new Object[]{string, string2, string3})));
        HelpConfig helpConfig = oiy.x;
        if (helpConfig != null) {
            ofx.a(a, string, (ClickableSpan) new oav(oiy, helpConfig, avmt));
            ofx.a(a, string2, (ClickableSpan) new oaw(helpConfig, new agxz(), oiy));
            ofx.a(a, string3, (ClickableSpan) new oax(oiy, helpConfig));
        }
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(a);
    }

    public static void a(TextView textView, boolean z) {
        if (z) {
            String valueOf = String.valueOf(textView.getText());
            String string = textView.getContext().getString(R.string.gh_required_announce_suffix);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(string).length());
            sb.append(valueOf);
            sb.append(string);
            textView.setContentDescription(sb.toString());
        }
    }

    public static void a(Activity activity) {
        if ((activity.getApplicationContext().getResources().getConfiguration().screenLayout & 15) < 3) {
            activity.setRequestedOrientation(1);
        }
    }

    public static boolean a(Resources resources) {
        return resources.getBoolean(R.bool.gh_is_right_to_left);
    }
}
