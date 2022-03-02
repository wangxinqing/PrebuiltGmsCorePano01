package defpackage;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;

/* renamed from: czg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class czg extends czj {
    final RelativeLayout s;
    final /* synthetic */ czi t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public czg(czi czi, View view) {
        super(view);
        this.t = czi;
        this.s = (RelativeLayout) view.findViewById(R.id.error_banner);
    }

    public final void a(cze cze) {
        SpannableString spannableString;
        if (cze.a() == 1) {
            RelativeLayout relativeLayout = this.s;
            cyf cyf = ((czh) cze).a;
            TextView textView = (TextView) relativeLayout.findViewById(R.id.error_summary);
            FadeInImageView fadeInImageView = (FadeInImageView) relativeLayout.findViewById(R.id.error_image);
            ((TextView) relativeLayout.findViewById(R.id.error_title)).setText(cyf.a);
            if (TextUtils.isEmpty(cyf.c)) {
                spannableString = new SpannableString(cyf.b);
            } else {
                SpannableString spannableString2 = new SpannableString(cyf.c);
                spannableString2.setSpan(new ForegroundColorSpan(que.b(this.t.j, R.attr.colorPrimaryGoogle, R.color.google_blue600)), 0, cyf.c.length(), 33);
                spannableString = spannableString2;
                if (!TextUtils.isEmpty(cyf.b)) {
                    spannableString = (Spanned) TextUtils.concat(new CharSequence[]{cyf.b, " ", spannableString2});
                }
            }
            textView.setText(spannableString);
            if (cyf.e || cyf.f != null) {
                relativeLayout.setOnClickListener(new czf(this, cyf));
                relativeLayout.setClickable(true);
            } else {
                relativeLayout.setOnClickListener((View.OnClickListener) null);
                relativeLayout.setClickable(false);
            }
            cyd.a(this.t.k, fadeInImageView, cyf.a(), cyf.d);
            cxy.a(fadeInImageView, que.b(relativeLayout.getContext(), R.attr.colorOnSurfaceVariant, R.color.google_grey700));
            this.s.setFocusable(true);
        }
    }
}
