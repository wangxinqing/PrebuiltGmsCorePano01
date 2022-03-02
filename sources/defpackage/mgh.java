package defpackage;

import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.google.android.gms.family.common.StringUtil$1;

/* renamed from: mgh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mgh {
    public static void a(TextView textView, CharSequence charSequence) {
        if (charSequence != null) {
            SpannableString spannableString = new SpannableString(charSequence);
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
            for (URLSpan uRLSpan : uRLSpanArr) {
                spannableString.setSpan(new StringUtil$1(), spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 33);
            }
            if (uRLSpanArr.length > 0) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            textView.setText(spannableString);
            return;
        }
        textView.setText((CharSequence) null);
    }

    public static void a(TextView textView, String str, Html.TagHandler tagHandler) {
        a(textView, Html.fromHtml(jlh.a(str), (Html.ImageGetter) null, tagHandler));
    }
}
