package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;
import java.util.List;

/* renamed from: cyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cyd {
    private static int a(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 5 ? R.style.AsStyledTextAppearanceDescription : R.style.AsStyledTextAppearanceCaption : R.style.AsStyledTextAppearanceStatus : R.style.AsStyledTextAppearanceTitle : R.style.AsStyledTextAppearanceLabel;
    }

    public static void b(LinearLayout linearLayout, int i) {
        int childCount = linearLayout.getChildCount();
        for (int i2 = 0; i2 < childCount - 1; i2++) {
            View childAt = linearLayout.getChildAt(i2);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.bottomMargin = i;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public static int a(int i, Context context) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static int a(avoo avoo) {
        auca auca = avoo.d;
        if (auca != null) {
            return Color.argb(Math.round(auca.a * 255.0f), Math.round(avoo.a * 255.0f), Math.round(avoo.b * 255.0f), Math.round(avoo.c * 255.0f));
        }
        return Color.rgb(Math.round(avoo.a * 255.0f), Math.round(avoo.b * 255.0f), Math.round(avoo.c * 255.0f));
    }

    public static boolean b(Context context) {
        Resources resources = context.getResources();
        return a(resources.getConfiguration().screenHeightDp, context) >= resources.getDimensionPixelSize(R.dimen.as_expanded_header_min_screen_height);
    }

    public static void a() {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    public static void a(Drawable drawable, avoo avoo) {
        if (drawable != null && avoo != null) {
            Drawable f = ma.f(drawable);
            int a = a(avoo);
            if (Build.VERSION.SDK_INT >= 23) {
                ma.a(f, a);
            } else {
                f.mutate().setColorFilter(a, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    public static void a(View view, aqsr aqsr, cyg cyg) {
        if (aqsr != null && aqsr.b != 0) {
            view.setOnClickListener(new cyb(cyg, aqsr));
            view.setClickable(true);
            view.setFocusable(true);
        } else if (qb.E(view)) {
            view.setOnClickListener((View.OnClickListener) null);
            view.setClickable(false);
            view.setFocusable(false);
        }
    }

    public static void a(View view, aqsr aqsr, cyg cyg, int i) {
        if (aqsr != null && aqsr.b != 0) {
            view.setOnClickListener(new cyc(cyg, aqsr));
            view.setClickable(true);
            view.setFocusable(true);
            qb.a(view, kf.a(view.getContext(), i));
        } else if (qb.E(view)) {
            view.setOnClickListener((View.OnClickListener) null);
            view.setBackgroundResource(0);
            view.setClickable(false);
            view.setFocusable(false);
        }
    }

    public static void a(LinearLayout linearLayout, int i) {
        int childCount = linearLayout.getChildCount();
        linearLayout.getContext();
        a();
        for (int i2 = 0; i2 < childCount - 1; i2++) {
            View childAt = linearLayout.getChildAt(i2);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (a(linearLayout.getContext())) {
                    layoutParams.leftMargin = i;
                } else {
                    layoutParams.rightMargin = i;
                }
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public static void a(ProgressBar progressBar, avoo avoo, avoo avoo2) {
        Drawable drawable;
        Drawable mutate = progressBar.getContext().getResources().getDrawable(que.a(progressBar.getContext(), R.attr.asProgressDrawable, R.drawable.as_progress_drawable_light)).mutate();
        Drawable drawable2 = null;
        if (mutate instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) mutate;
            if (layerDrawable.getNumberOfLayers() == 2) {
                Drawable mutate2 = layerDrawable.getDrawable(0).mutate();
                drawable2 = layerDrawable.getDrawable(1).mutate();
                drawable = mutate2;
                a(drawable2, avoo);
                a(drawable, avoo2);
                Rect bounds = progressBar.getProgressDrawable().getBounds();
                progressBar.setProgressDrawable(mutate);
                progressBar.getProgressDrawable().setBounds(bounds);
            }
        }
        drawable = null;
        a(drawable2, avoo);
        a(drawable, avoo2);
        Rect bounds2 = progressBar.getProgressDrawable().getBounds();
        progressBar.setProgressDrawable(mutate);
        progressBar.getProgressDrawable().setBounds(bounds2);
    }

    public static void a(TextView textView, int i) {
        int a = a(i);
        ry.a(textView, a);
        TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(a, crk.a);
        textView.setLineSpacing((float) obtainStyledAttributes.getDimensionPixelSize(1, 0), textView.getLineSpacingMultiplier());
        textView.setMinHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
        obtainStyledAttributes.recycle();
    }

    public static void a(TextView textView, avoo avoo) {
        if (avoo != null) {
            textView.setTextColor(a(avoo));
        }
    }

    public static void a(TextView textView, String str) {
        if (!amrk.a(str)) {
            textView.setText(str);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    public static void a(TextView textView, String str, aqsr aqsr, cyg cyg) {
        if (amrk.a(str)) {
            textView.setClickable(false);
            textView.setFocusable(false);
            return;
        }
        String valueOf = String.valueOf(textView.getText());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
        sb.append(valueOf);
        sb.append(" ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(que.b(textView.getContext(), R.attr.colorPrimaryGoogle, R.color.google_blue600)), length, str.length() + length, 33);
        textView.setOnClickListener(new cya(cyg, aqsr));
        textView.setText(spannableStringBuilder);
        textView.setFocusable(true);
        textView.setClickable(true);
    }

    public static void a(TextView textView, String str, avoo avoo) {
        if (!amrk.a(str)) {
            textView.setText(str);
            textView.setVisibility(0);
            a(textView, avoo);
            return;
        }
        textView.setVisibility(8);
    }

    public static void a(djk djk, LinearLayout linearLayout, List list) {
        boolean z;
        avoo avoo;
        Context context = linearLayout.getContext();
        int size = list.size();
        int i = 0;
        int i2 = 0;
        boolean z2 = true;
        while (i < size) {
            aqtg aqtg = (aqtg) list.get(i);
            View inflate = LayoutInflater.from(context).inflate(R.layout.as_card_styled_text_entry, linearLayout, false);
            FadeInImageView fadeInImageView = (FadeInImageView) inflate.findViewById(R.id.icon);
            if ((aqtg.a & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            aqrl aqrl = aqtg.d;
            if (aqrl == null) {
                aqrl = aqrl.g;
            }
            a(djk, fadeInImageView, z, aqrl);
            TextView textView = (TextView) inflate.findViewById(R.id.text);
            int a = aqto.a(aqtg.e);
            if (a == 0) {
                a = 1;
            }
            a(textView, a);
            a(textView, aqtg.b);
            if ((aqtg.a & 2) != 0) {
                avoo = aqtg.c;
                if (avoo == null) {
                    avoo = avoo.e;
                }
            } else {
                avoo = null;
            }
            a(textView, avoo);
            if ((aqtg.a & 16) != 0) {
                aqtp aqtp = aqtg.f;
                if (aqtp == null) {
                    aqtp = aqtp.b;
                }
                if (aqtp.a != 0) {
                    aqtp aqtp2 = aqtg.f;
                    if (aqtp2 == null) {
                        aqtp2 = aqtp.b;
                    }
                    textView.setMaxLines(aqtp2.a);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            int a2 = aqto.a(aqtg.e);
            if (a2 == 0) {
                a2 = 1;
            }
            int a3 = a(a2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) inflate.getLayoutParams();
            if (a3 != i2 && !z2) {
                layoutParams.setMargins(0, context.getResources().getDimensionPixelOffset(R.dimen.as_styled_text_entry_vertical_margin), 0, 0);
            }
            inflate.setLayoutParams(layoutParams);
            linearLayout.addView(inflate);
            i++;
            i2 = a3;
            z2 = false;
        }
    }

    public static void a(djk djk, FadeInImageView fadeInImageView, boolean z, aqrl aqrl) {
        a(djk, fadeInImageView, z, aqrl, -1);
    }

    public static void a(djk djk, FadeInImageView fadeInImageView, boolean z, aqrl aqrl, int i) {
        a(djk, fadeInImageView, z, aqrl, i, 0.0f);
    }

    public static void a(djk djk, FadeInImageView fadeInImageView, boolean z, aqrl aqrl, int i, float f) {
        Drawable drawable;
        if (z && aqrl != null) {
            DisplayMetrics displayMetrics = fadeInImageView.getContext().getResources().getDisplayMetrics();
            int i2 = aqrl.d;
            if (!(i2 == 0 || aqrl.e == 0)) {
                float f2 = f + f;
                int round = Math.round(TypedValue.applyDimension(1, (float) i2, displayMetrics) + f2);
                int round2 = Math.round(TypedValue.applyDimension(1, (float) aqrl.e, displayMetrics) + f2);
                ViewGroup.LayoutParams layoutParams = fadeInImageView.getLayoutParams();
                layoutParams.width = round;
                layoutParams.height = round2;
                if (i > 0) {
                    layoutParams.width = Math.min(layoutParams.width, i);
                    layoutParams.height = (int) (((float) layoutParams.height) * (((float) layoutParams.width) / ((float) round)));
                }
                fadeInImageView.setLayoutParams(layoutParams);
            }
            aqrk a = aqrk.a(aqrl.b);
            if (!(a == null || cxz.a(fadeInImageView.getContext(), a) == 0)) {
                fadeInImageView.setImageResource(cxz.a(fadeInImageView.getContext(), a));
                if (awgy.d() && (drawable = fadeInImageView.getDrawable()) != null) {
                    ma.a(drawable, cxz.a(a));
                }
            }
            if ((aqrl.a & 2) != 0) {
                djk.a(aqrl.c, new cxw(fadeInImageView));
            }
            if (f > 0.0f) {
                int round3 = Math.round(f);
                fadeInImageView.setPadding(round3, round3, round3, round3);
            }
            fadeInImageView.setContentDescription(aqrl.f);
            fadeInImageView.setVisibility(0);
            return;
        }
        fadeInImageView.setVisibility(8);
    }

    public static boolean a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
