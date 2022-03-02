package com.google.android.setupdesign;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GlifLayout extends algc {
    private ColorStateList a;
    private boolean b;
    private ColorStateList c;
    public boolean g;

    public GlifLayout(Context context) {
        this(context, 0, 0);
    }

    private final void a() {
        int i;
        Drawable drawable;
        if (b(R.id.suc_layout_status) != null) {
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                i = colorStateList.getDefaultColor();
            } else {
                ColorStateList colorStateList2 = this.a;
                i = colorStateList2 != null ? colorStateList2.getDefaultColor() : 0;
            }
            if (this.b) {
                drawable = new alhw(i);
            } else {
                drawable = new ColorDrawable(i);
            }
            ((alhj) a(alhj.class)).a(drawable);
        }
    }

    private void b(AttributeSet attributeSet, int i) {
        boolean z;
        ScrollView scrollView;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, alhx.g, i, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(4, false);
        if (!c()) {
            z = false;
        } else {
            z = z2;
        }
        this.g = z;
        a(aliu.class, (alhi) new aliu(this, attributeSet, i));
        a(aliv.class, (alhi) new aliv(this, attributeSet, i));
        a(aliz.class, (alhi) new aliz(this));
        a(aljc.class, (alhi) new aljc());
        View b2 = b(R.id.sud_scroll_view);
        if (b2 instanceof ScrollView) {
            scrollView = (ScrollView) b2;
        } else {
            scrollView = null;
        }
        if (scrollView != null) {
            new aljd(scrollView);
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
        if (colorStateList != null) {
            this.a = colorStateList;
            a();
            ((aliz) a(aliz.class)).a(colorStateList);
        }
        if (this.g) {
            getRootView().setBackgroundColor(alhb.a(getContext()).a(getContext(), alha.CONFIG_LAYOUT_BACKGROUND_COLOR));
        }
        this.c = obtainStyledAttributes.getColorStateList(0);
        a();
        this.b = obtainStyledAttributes.getBoolean(1, true);
        a();
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            ViewStub viewStub = (ViewStub) b(R.id.sud_layout_sticky_header);
            viewStub.setLayoutResource(resourceId);
            viewStub.inflate();
        }
        obtainStyledAttributes.recycle();
    }

    public final void c(int i) {
        TextView a2 = ((aliu) a(aliu.class)).a();
        if (a2 != null) {
            a2.setText(i);
        }
    }

    public final CharSequence e() {
        TextView a2 = ((aliu) a(aliu.class)).a();
        if (a2 != null) {
            return a2.getText();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        TextView textView;
        ImageView imageView;
        int a2;
        super.onFinishInflate();
        aliv aliv = (aliv) a(aliv.class);
        if (aljh.a((FrameLayout) aliv.a) && (imageView = (ImageView) aliv.a.b(R.id.sud_layout_icon)) != null && (a2 = aljh.a(imageView.getContext())) != 0 && (imageView.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.gravity = a2;
            imageView.setLayoutParams(layoutParams);
        }
        aliu aliu = (aliu) a(aliu.class);
        if (aljh.a((FrameLayout) aliu.a)) {
            TextView textView2 = (TextView) aliu.a.b(R.id.suc_layout_title);
            if (textView2 != null) {
                aljj.a(textView2, new alji(alha.CONFIG_HEADER_TEXT_COLOR, (alha) null, alha.CONFIG_HEADER_TEXT_SIZE, alha.CONFIG_HEADER_FONT_FAMILY, aljh.a(textView2.getContext())));
            }
            LinearLayout linearLayout = (LinearLayout) aliu.a.b(R.id.sud_layout_header);
            if (linearLayout != null) {
                Context context = linearLayout.getContext();
                linearLayout.setBackgroundColor(alhb.a(context).a(context, alha.CONFIG_HEADER_AREA_BACKGROUND_COLOR));
            }
        }
        if (this.g && (textView = (TextView) b(R.id.sud_layout_description)) != null) {
            aljj.a(textView, new alji(alha.CONFIG_DESCRIPTION_TEXT_COLOR, alha.CONFIG_DESCRIPTION_LINK_TEXT_COLOR, alha.CONFIG_DESCRIPTION_TEXT_SIZE, alha.CONFIG_DESCRIPTION_FONT_FAMILY, aljh.a(textView.getContext())));
        }
    }

    public GlifLayout(Context context, int i) {
        this(context, i, 0);
    }

    public GlifLayout(Context context, int i, int i2) {
        super(context, i, i2);
        this.b = true;
        this.g = false;
        b((AttributeSet) null, R.attr.sudLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
        this.g = false;
        b(attributeSet, R.attr.sudLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        this.g = false;
        b(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public View a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = R.layout.sud_glif_template;
        }
        return a(layoutInflater, 2132018089, i);
    }

    /* access modifiers changed from: protected */
    public ViewGroup a(int i) {
        if (i == 0) {
            i = R.id.sud_layout_content;
        }
        return super.a(i);
    }

    public final void a(Drawable drawable) {
        ImageView a2 = ((aliv) a(aliv.class)).a();
        if (a2 != null) {
            a2.setImageDrawable(drawable);
            a2.setVisibility(drawable != null ? 0 : 8);
        }
    }

    public final void a(CharSequence charSequence) {
        ((aliu) a(aliu.class)).a(charSequence);
    }

    public final void b(boolean z) {
        ((aliz) a(aliz.class)).a(z);
    }
}
