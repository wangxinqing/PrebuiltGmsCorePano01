package defpackage;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: yst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yst {
    public static void a(Resources resources, TextView textView, int i) {
        int i2;
        int i3;
        yss yss = new yss();
        if (i == 1) {
            i2 = resources.getColor(R.color.talladega_text_white);
            i3 = 1;
        } else if (i == 2) {
            i2 = resources.getColor(R.color.talladega_text_white);
            i3 = 0;
        } else if (i == 3) {
            i2 = resources.getColor(R.color.talladega_text_dark);
            i3 = 1;
        } else if (i != 4) {
            i2 = resources.getColor(R.color.talladega_text_gray);
            i3 = 1;
        } else {
            i2 = resources.getColor(R.color.talladega_text_dark);
            i3 = 0;
        }
        yss.a = i2;
        yss.b = i3;
        if (textView != null) {
            textView.setTextSize(0, resources.getDimension(R.dimen.talladega_text_size_14));
            textView.setTextColor(yss.a);
            if (yss.b != 1) {
                textView.setTypeface(Typeface.DEFAULT);
            } else {
                textView.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }
    }
}
