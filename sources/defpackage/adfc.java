package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;

/* renamed from: adfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adfc {
    public static final jjg a = jjg.a();
    public final View b;
    public final Double c;
    private final double d;

    public adfc(View view, double d2, Double d3) {
        this.b = view;
        this.d = d2;
        this.c = d3;
    }

    /* access modifiers changed from: protected */
    public final int a(TextView textView, int i) {
        if (textView == null) {
            ((anih) ((anih) a.b()).a("adfc", "a", 187, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("textView is null.");
            return 0;
        } else if (TextUtils.isEmpty(textView.getText())) {
            return 0;
        } else {
            textView.measure(View.MeasureSpec.makeMeasureSpec(this.b.getWidth(), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE));
            return textView.getMeasuredHeight();
        }
    }

    public final void b() {
        int i;
        View findViewById = this.b.findViewById(R.id.udc_consent_header);
        if (findViewById == null) {
            ((anih) ((anih) a.b()).a("adfc", "b", 119, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot find headerView.");
            return;
        }
        int c2 = c();
        int i2 = 0;
        if (this.c != null) {
            i = a((TextView) findViewById.findViewById(R.id.header), c2);
            int a2 = adfh.a(c2 - i, this.c.doubleValue(), this.b.getWidth());
            ImageView imageView = (ImageView) findViewById.findViewById(R.id.illustration);
            if (imageView == null) {
                ((anih) ((anih) a.b()).a("adfc", "b", 138, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot find illustrationView.");
            } else if (a2 == 0) {
                if (imageView.getVisibility() != 8) {
                    imageView.setVisibility(8);
                }
            } else if (!(imageView.getVisibility() == 0 && imageView.getMaxHeight() == a2)) {
                imageView.setVisibility(0);
                imageView.setMaxHeight(a2);
            }
            i2 = a2;
        } else {
            i = 0;
        }
        if (i2 > 0) {
            c2 = i2 + i;
        }
        if (findViewById.getMinimumHeight() != c2) {
            findViewById.setMinimumHeight(c2);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = c2;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    public final int c() {
        int i = Resources.getSystem().getDisplayMetrics().heightPixels;
        if (jix.a(Resources.getSystem())) {
            double d2 = this.d;
            int height = this.b.getHeight();
            double d3 = this.d;
            double d4 = (double) i;
            Double.isNaN(d4);
            double d5 = (double) height;
            Double.isNaN(d5);
            return Math.min((int) (d4 * d2), (int) ((d5 * d3) / (1.0d - d3)));
        }
        double d6 = (double) i;
        double d7 = this.d;
        Double.isNaN(d6);
        return (int) (d6 * d7);
    }

    public final void a() {
        int i;
        int i2;
        int i3 = 0;
        if (azrb.a.a().f()) {
            View findViewById = this.b.findViewById(R.id.udc_consent_header);
            if (findViewById == null) {
                ((anih) ((anih) a.b()).a("adfc", "b", 119, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot find headerView.");
                return;
            }
            int c2 = c();
            if (this.c != null) {
                i2 = a((TextView) findViewById.findViewById(R.id.header), c2);
                int a2 = adfh.a(c2 - i2, this.c.doubleValue(), this.b.getWidth());
                ImageView imageView = (ImageView) findViewById.findViewById(R.id.illustration);
                if (imageView == null) {
                    ((anih) ((anih) a.b()).a("adfc", "b", 138, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot find illustrationView.");
                } else if (a2 != 0) {
                    if (!(imageView.getVisibility() == 0 && imageView.getMaxHeight() == a2)) {
                        imageView.setVisibility(0);
                        imageView.setMaxHeight(a2);
                    }
                } else if (imageView.getVisibility() != 8) {
                    imageView.setVisibility(8);
                }
                i3 = a2;
            } else {
                i2 = 0;
            }
            if (i3 > 0) {
                c2 = i3 + i2;
            }
            if (findViewById.getMinimumHeight() != c2) {
                findViewById.setMinimumHeight(c2);
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = c2;
                findViewById.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        View findViewById2 = this.b.findViewById(R.id.udc_consent_header);
        if (findViewById2 == null) {
            ((anih) ((anih) a.b()).a("adfc", "a", 63, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot find headerView.");
            return;
        }
        int c3 = c();
        if (this.c != null) {
            i = a((TextView) findViewById2.findViewById(R.id.header), c3);
            int a3 = adfh.a(c3 - i, this.c.doubleValue(), this.b.getWidth());
            ImageView imageView2 = (ImageView) findViewById2.findViewById(R.id.illustration);
            if (imageView2 == null) {
                ((anih) ((anih) a.b()).a("adfc", "a", 82, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot find illustrationView.");
            } else if (a3 != 0) {
                imageView2.setMaxHeight(a3);
                if (imageView2.getVisibility() != 0) {
                    imageView2.setVisibility(0);
                }
            } else if (imageView2.getVisibility() != 8) {
                imageView2.setVisibility(8);
            }
            i3 = a3;
        } else {
            i = 0;
        }
        if (i3 > 0) {
            c3 = i3 + i;
        }
        ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
        if (layoutParams2.height != c3) {
            findViewById2.setMinimumHeight(c3);
            layoutParams2.height = c3;
            findViewById2.setLayoutParams(layoutParams2);
        }
    }
}
