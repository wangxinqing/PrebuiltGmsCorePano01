package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.setupwizard.util.SetupWizardIllustration;

/* renamed from: alkg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alkg extends RelativeLayout {
    private static final RelativeLayout.LayoutParams a;
    private final LayoutInflater b;

    static {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        a = layoutParams;
        layoutParams.addRule(10);
        a.addRule(9);
        a.addRule(11);
        a.addRule(2, R.id.navigation_bar);
    }

    private static void a(View view, Drawable drawable) {
        View findViewById = view.findViewById(R.id.title_area);
        if (findViewById instanceof SetupWizardIllustration) {
            ((SetupWizardIllustration) findViewById).a = drawable;
        }
    }

    private static void b(View view, Drawable drawable) {
        View findViewById = view.findViewById(R.id.title_area);
        if (findViewById != null) {
            findViewById.setBackground(drawable);
        }
    }

    public alkg(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        LayoutInflater from = LayoutInflater.from(context);
        this.b = from;
        from.inflate(R.layout.auth_setup_wizard_nav_bar, this);
    }

    public final View a() {
        View a2 = a((int) R.string.auth_gls_name_checking_info_title, (int) R.layout.auth_setup_wizard_interstitial);
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(R.attr.auth_setup_wizard_progress_bar_color, typedValue, true) && typedValue.type >= 28 && typedValue.type <= 31) {
            ((ProgressBar) a2.findViewById(R.id.progress_bar)).setIndeterminateTintList(ColorStateList.valueOf(typedValue.data));
        }
        if (a2.getId() != R.id.title_area) {
            getContext().getTheme().resolveAttribute(16842836, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                Log.i("SetupWizardUI", "WindowBackground is not a color but could be a drawable.");
            } else {
                a2.setBackgroundColor(typedValue.data);
            }
        }
        return a2;
    }

    public final View a(int i, int i2) {
        Drawable drawable;
        Drawable drawable2 = null;
        View inflate = this.b.inflate(R.layout.auth_setup_wizard_content_container, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(i);
        this.b.inflate(i2, (ViewGroup) inflate.findViewById(R.id.setup_content));
        Context context = getContext();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.auth_setup_wizard_header_foreground, typedValue, true)) {
            if (typedValue.type == 1) {
                if (typedValue.data != 0) {
                    drawable = context.getDrawable(typedValue.data);
                } else {
                    drawable = null;
                }
                a(inflate, drawable);
            } else if (typedValue.resourceId != 0) {
                a(inflate, context.getDrawable(typedValue.resourceId));
            }
        }
        if (context.getTheme().resolveAttribute(R.attr.auth_setup_wizard_header_background, typedValue, true)) {
            if (typedValue.type == 1) {
                if (typedValue.data != 0) {
                    drawable2 = context.getDrawable(typedValue.data);
                }
                b(inflate, drawable2);
            } else if (typedValue.type >= 28 && typedValue.type <= 31) {
                int i3 = typedValue.data;
                View findViewById = inflate.findViewById(R.id.title_area);
                if (findViewById != null) {
                    findViewById.setBackground((Drawable) null);
                    findViewById.setBackgroundColor(i3);
                }
            } else if (typedValue.resourceId != 0) {
                b(inflate, context.getDrawable(typedValue.resourceId));
            }
        }
        addView(inflate, a);
        return inflate;
    }
}
