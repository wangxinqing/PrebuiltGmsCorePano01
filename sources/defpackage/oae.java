package defpackage;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oae {
    public static View a(HelpChimeraActivity helpChimeraActivity, oab oab, View.OnClickListener onClickListener, int i, boolean z) {
        View inflate = ((LayoutInflater) helpChimeraActivity.getSystemService("layout_inflater")).inflate(i, (ViewGroup) null);
        if (!a(inflate, oab, helpChimeraActivity)) {
            return null;
        }
        a(inflate, helpChimeraActivity, oab, onClickListener, z);
        return inflate;
    }

    public static void a(View view, HelpChimeraActivity helpChimeraActivity, oab oab, View.OnClickListener onClickListener, boolean z) {
        TextView textView = (TextView) view.findViewById(R.id.gh_help_content_line_item_title);
        Spanned fromHtml = Html.fromHtml(oab.d);
        textView.setText(fromHtml);
        if (oab.l()) {
            ImageSpan imageSpan = new ImageSpan(view.getContext(), R.drawable.quantum_ic_open_in_new_black_12, 1);
            SpannableStringBuilder append = new SpannableStringBuilder().append(fromHtml).append("  ");
            append.setSpan(imageSpan, fromHtml.length() + 1, fromHtml.length() + 2, 0);
            textView.setText(append);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.gh_help_content_line_item_snippet);
        textView2.setVisibility(8);
        if (z && !TextUtils.isEmpty(oab.r())) {
            textView2.setText(Html.fromHtml(oab.r()));
            textView2.setVisibility(0);
        }
        view.setOnClickListener(onClickListener);
        if (oab.g()) {
            if (!ofy.b()) {
                view.setBackgroundColor(helpChimeraActivity.getResources().getColor(17170443));
            }
            view.setEnabled(false);
        }
    }

    public static boolean a(View view, oab oab, HelpChimeraActivity helpChimeraActivity) {
        if (!new oaf(helpChimeraActivity).a(oab)) {
            return false;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.gh_help_content_line_item_icon);
        boolean a = oad.a(imageView, oab, (Context) helpChimeraActivity);
        if (ofy.b()) {
            ofx.a(imageView, (Context) helpChimeraActivity, ofy.b() ? ofy.a(helpChimeraActivity, R.attr.gh_primaryBlueColor) : kf.b(helpChimeraActivity, R.color.google_blue600));
        } else if (imageView.getDrawable() != null) {
            imageView.setImageDrawable(oad.a((Context) helpChimeraActivity, imageView.getDrawable(), (int) R.color.google_blue600));
        }
        return a;
    }
}
