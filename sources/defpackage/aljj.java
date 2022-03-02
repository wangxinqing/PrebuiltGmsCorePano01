package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: aljj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aljj {
    public static void a(TextView textView, alji alji) {
        Typeface create;
        int a;
        int a2;
        Context context = textView.getContext();
        if (!(alji.a == null || (a2 = alhb.a(context).a(context, alji.a)) == 0)) {
            textView.setTextColor(a2);
        }
        if (!(alji.b == null || (a = alhb.a(context).a(context, alji.b)) == 0)) {
            textView.setLinkTextColor(a);
        }
        if (alji.c != null) {
            float e = alhb.a(context).e(context, alji.c);
            if (e > 0.0f) {
                textView.setTextSize(0, e);
            }
        }
        if (!(alji.d == null || (create = Typeface.create(alhb.a(context).c(context, alji.d), 0)) == null)) {
            textView.setTypeface(create);
        }
        textView.setGravity(alji.e);
    }
}
