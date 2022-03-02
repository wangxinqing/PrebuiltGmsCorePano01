package com.android.setupwizardlib;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.setupwizardlib.view.StatusBarBackgroundLayout;
import com.google.android.gms.R;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GlifLayout extends TemplateLayout {
    private ColorStateList a;
    private boolean d;
    private ColorStateList e;
    private boolean f;

    public GlifLayout(Context context) {
        this(context, 0, 0);
    }

    private void a(AttributeSet attributeSet, int i) {
        ScrollView scrollView;
        a(bdy.class, (bea) new bdy(this, attributeSet, i));
        a(bdz.class, (bea) new bdz(this, attributeSet, i));
        a(beb.class, (bea) new beb(this));
        a(bdx.class, (bea) new bdx(this));
        a(bed.class, (bea) new bed());
        View c = c(R.id.suw_scroll_view);
        if (c instanceof ScrollView) {
            scrollView = (ScrollView) c;
        } else {
            scrollView = null;
        }
        if (scrollView != null) {
            new bee(scrollView);
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bdg.g, i, 0);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
        if (colorStateList != null) {
            this.a = colorStateList;
            b();
            int i2 = Build.VERSION.SDK_INT;
            ProgressBar progressBar = (ProgressBar) ((beb) a(beb.class)).a.c(R.id.suw_layout_progress);
            if (progressBar != null) {
                progressBar.setIndeterminateTintList(colorStateList);
                int i3 = Build.VERSION.SDK_INT;
                progressBar.setProgressBackgroundTintList(colorStateList);
            }
        }
        this.e = obtainStyledAttributes.getColorStateList(0);
        b();
        this.d = obtainStyledAttributes.getBoolean(1, true);
        b();
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            ViewStub viewStub = (ViewStub) c(R.id.suw_layout_footer);
            viewStub.setLayoutResource(resourceId);
            viewStub.inflate();
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(5, 0);
        if (resourceId2 != 0) {
            ViewStub viewStub2 = (ViewStub) c(R.id.suw_layout_sticky_header);
            viewStub2.setLayoutResource(resourceId2);
            viewStub2.inflate();
        }
        this.f = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        int i4 = Build.VERSION.SDK_INT;
        if (this.f) {
            setSystemUiVisibility(1024);
        }
    }

    private final void b() {
        int i;
        Drawable drawable;
        View c = c(R.id.suw_pattern_bg);
        if (c != null) {
            ColorStateList colorStateList = this.e;
            if (colorStateList != null) {
                i = colorStateList.getDefaultColor();
            } else {
                ColorStateList colorStateList2 = this.a;
                i = colorStateList2 != null ? colorStateList2.getDefaultColor() : 0;
            }
            if (this.d) {
                drawable = new bdf(i);
            } else {
                drawable = new ColorDrawable(i);
            }
            if (c instanceof StatusBarBackgroundLayout) {
                ((StatusBarBackgroundLayout) c).a(drawable);
            } else {
                c.setBackgroundDrawable(drawable);
            }
        }
    }

    public GlifLayout(Context context, int i) {
        this(context, i, 0);
    }

    public GlifLayout(Context context, int i, int i2) {
        super(context, i, i2);
        this.d = true;
        this.f = true;
        a((AttributeSet) null, (int) R.attr.suwLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
        this.f = true;
        a(attributeSet, (int) R.attr.suwLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        this.f = true;
        a(attributeSet, i);
    }

    public final void b(int i) {
        TextView a2 = ((bdy) a(bdy.class)).a();
        if (a2 != null) {
            a2.setText(i);
        }
    }

    /* access modifiers changed from: protected */
    public View a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = R.layout.suw_glif_template;
        }
        return a(layoutInflater, 2132018147, i);
    }

    /* access modifiers changed from: protected */
    public ViewGroup a(int i) {
        if (i == 0) {
            i = R.id.suw_layout_content;
        }
        return super.a(i);
    }
}
