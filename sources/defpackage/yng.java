package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* renamed from: yng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yng {
    public static final CharSequence a(CharSequence charSequence, String str) {
        SpannableString spannableString = new SpannableString(charSequence);
        Annotation[] annotationArr = (Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
        ynf ynf = new ynf(str);
        int length = annotationArr.length;
        for (int i = 0; i < length; i++) {
            spannableStringBuilder.setSpan(ynf, spannableString.getSpanStart(annotationArr[i]), spannableString.getSpanEnd(annotationArr[i]), spannableString.getSpanFlags(ynf));
        }
        return spannableStringBuilder;
    }

    public static final boolean a(String str, Activity activity, DialogInterface.OnClickListener onClickListener) {
        Intent intent;
        if (!TextUtils.isEmpty(str)) {
            intent = new Intent("android.intent.action.VIEW").setData(Uri.parse(str));
        } else {
            intent = null;
        }
        if (intent == null || intent.resolveActivity(activity.getPackageManager()) == null) {
            new AlertDialog.Builder(activity).setPositiveButton(R.string.plus_done, onClickListener).setMessage(R.string.plus_list_moments_view_moment_url_error).setInverseBackgroundForced(true).show();
            return false;
        }
        activity.startActivity(intent);
        return true;
    }
}
