package com.android.setupwizard.navigationbar;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SetupWizardNavBar extends Fragment implements ViewTreeObserver.OnPreDrawListener, View.OnClickListener {
    public Button a;
    public Button b;
    private int c = 4610;
    private ViewGroup d;
    private bdc e;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class NavButton extends Button {
        public NavButton(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            super.onTextChanged(charSequence, i, i2, i3);
            if (!TextUtils.isEmpty(charSequence)) {
                i4 = getResources().getDimensionPixelSize(R.dimen.auth_setup_wizard_navbar_button_drawable_padding);
            } else {
                i4 = 0;
            }
            setCompoundDrawablePadding(i4);
        }

        public final void setEnabled(boolean z) {
            float f;
            super.setEnabled(z);
            if (!z) {
                f = 0.23f;
            } else {
                f = 1.0f;
            }
            setAlpha(f);
        }

        public NavButton(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public NavButton(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        public NavButton(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
        }
    }

    public final void a(boolean z, boolean z2) {
        if (!z) {
            this.c &= -4611;
            getActivity().getWindow().clearFlags(Integer.MIN_VALUE);
        } else {
            int i = this.c | 4098;
            this.c = i;
            if (z2) {
                this.c = i | 512;
            }
            getActivity().getWindow().addFlags(Integer.MIN_VALUE);
        }
        getActivity().getWindow().getDecorView().setSystemUiVisibility(this.c);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.e = (bdc) activity;
    }

    public void onClick(View view) {
        if (view == this.b) {
            this.e.a();
        } else if (view == this.a) {
            this.e.b();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity activity = getActivity();
        TypedArray obtainStyledAttributes = getActivity().obtainStyledAttributes(new int[]{R.attr.auth_setup_wizard_navbar_theme, 16842800, 16842801});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId == 0) {
            float[] fArr = new float[3];
            float[] fArr2 = new float[3];
            Color.colorToHSV(obtainStyledAttributes.getColor(1, 0), fArr);
            Color.colorToHSV(obtainStyledAttributes.getColor(2, 0), fArr2);
            if (fArr[2] <= fArr2[2]) {
                resourceId = R.style.auth_setup_wizard_navbar_theme_light;
            } else {
                resourceId = R.style.auth_setup_wizard_navbar_theme_dark;
            }
        }
        obtainStyledAttributes.recycle();
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(new ContextThemeWrapper(activity, resourceId)).inflate(R.layout.auth_setup_wizard_navbar_layout, viewGroup, false);
        this.d = viewGroup2;
        this.a = (Button) viewGroup2.findViewById(R.id.auth_setup_wizard_navbar_next);
        this.b = (Button) this.d.findViewById(R.id.auth_setup_wizard_navbar_back);
        this.a.setOnClickListener(this);
        this.b.setOnClickListener(this);
        return this.d;
    }

    public final boolean onPreDraw() {
        getActivity().getWindow().getDecorView().setSystemUiVisibility(this.c);
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.e.a(this);
        View decorView = getActivity().getWindow().getDecorView();
        decorView.setSystemUiVisibility(this.c);
        decorView.getViewTreeObserver().addOnPreDrawListener(this);
    }
}
