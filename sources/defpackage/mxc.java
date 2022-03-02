package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.common.ui.URLSpanNoUnderline;
import com.google.android.material.card.MaterialCardView;

/* renamed from: mxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mxc extends mwb implements TextWatcher {
    private View a;
    private Intent b;

    public final ClickableSpan a(String str) {
        return new mwz(this, str);
    }

    public final void afterTextChanged(Editable editable) {
        if (getActivity() instanceof mwa) {
            ((mwa) getActivity()).a((CharSequence) editable);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        Activity activity = getActivity();
        if (!jkf.a(activity)) {
            Toast.makeText(activity, activity.getString(R.string.gh_network_request_failed), 0).show();
            return;
        }
        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(str));
        if (!jhg.a((Context) activity, data)) {
            data.setClassName(activity, "com.google.android.gms.googlehelp.webview.GoogleHelpWebViewActivity");
            activity.startActivityForResult(data, 0);
            return;
        }
        activity.startActivity(data);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (getActivity() instanceof mwa) {
            ((mwa) getActivity()).b(i3);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        this.b = (Intent) getArguments().getParcelable("extra_intent");
        if (!ofy.b()) {
            i = R.layout.feedback_activity;
        } else {
            i = R.layout.gf_feedback_activity;
        }
        this.a = layoutInflater.inflate(i, viewGroup, false);
        ((EditText) a((int) R.id.gf_issue_description)).addTextChangedListener(this);
        return this.a;
    }

    public final void onResume() {
        super.onResume();
        EditText editText = (EditText) a((int) R.id.gf_issue_description);
        editText.post(new mws(editText));
        if (getActivity() instanceof mwa) {
            ((mwa) getActivity()).c(this.b);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final View a(int i) {
        return this.a.findViewById(i);
    }

    public final void a(Bitmap bitmap, boolean z) {
        TextView textView = (TextView) a((int) R.id.gf_edit_screenshot);
        ImageView imageView = (ImageView) a((int) R.id.gf_screenshot_icon);
        ((MaterialCardView) a((int) R.id.gf_include_screenshot_card)).setVisibility(0);
        ((ProgressBar) a((int) R.id.gf_progress_spinner)).setVisibility(8);
        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(0);
        if (z) {
            textView.setVisibility(0);
            String string = getString(R.string.gf_pii_sub_text);
            textView.setLinksClickable(true);
            Spannable a2 = URLSpanNoUnderline.a(Html.fromHtml(string));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(a2);
            CharSequence text = textView.getText();
            int indexOf = text.toString().indexOf(string);
            int length = string.length() + indexOf;
            if (indexOf != -1 && !string.isEmpty()) {
                mwx mwx = new mwx(this);
                if (text instanceof Spannable) {
                    ((Spannable) text).setSpan(mwx, indexOf, length, 33);
                } else {
                    SpannableString valueOf = SpannableString.valueOf(text);
                    valueOf.setSpan(mwx, indexOf, length, 33);
                    textView.setText(valueOf);
                }
                MovementMethod movementMethod = textView.getMovementMethod();
                if (movementMethod == null || !(movementMethod instanceof LinkMovementMethod)) {
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    return;
                }
                return;
            }
            return;
        }
        textView.setVisibility(8);
    }
}
