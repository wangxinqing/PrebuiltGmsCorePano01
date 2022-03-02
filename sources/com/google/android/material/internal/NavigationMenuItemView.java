package com.google.android.material.internal;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NavigationMenuItemView extends ajxm implements xi {
    private static final int[] d = {16842912};
    public boolean c;
    private int e;
    private final CheckedTextView i;
    private FrameLayout j;
    private ww k;
    private final oz l;

    public NavigationMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final ww a() {
        return this.k;
    }

    public final boolean b() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        ww wwVar = this.k;
        if (wwVar != null && wwVar.isCheckable() && this.k.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(ww wwVar) {
        StateListDrawable stateListDrawable;
        this.k = wwVar;
        int i2 = wwVar.a;
        if (i2 > 0) {
            setId(i2);
        }
        setVisibility(!wwVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(d, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            qb.a((View) this, (Drawable) stateListDrawable);
        }
        boolean isCheckable = wwVar.isCheckable();
        refreshDrawableState();
        if (this.c != isCheckable) {
            this.c = isCheckable;
            this.l.a((View) this.i, 2048);
        }
        boolean isChecked = wwVar.isChecked();
        refreshDrawableState();
        this.i.setChecked(isChecked);
        setEnabled(wwVar.isEnabled());
        this.i.setText(wwVar.d);
        Drawable icon = wwVar.getIcon();
        if (icon != null) {
            int i3 = this.e;
            icon.setBounds(0, 0, i3, i3);
        }
        ry.a(this.i, icon, (Drawable) null, (Drawable) null, (Drawable) null);
        View actionView = wwVar.getActionView();
        if (actionView != null) {
            if (this.j == null) {
                this.j = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.j.removeAllViews();
            this.j.addView(actionView);
        }
        setContentDescription(wwVar.k);
        afg.a(this, wwVar.l);
        ww wwVar2 = this.k;
        if (wwVar2.d == null && wwVar2.getIcon() == null && this.k.getActionView() != null) {
            this.i.setVisibility(8);
            FrameLayout frameLayout = this.j;
            if (frameLayout != null) {
                abe abe = (abe) frameLayout.getLayoutParams();
                abe.width = -1;
                this.j.setLayoutParams(abe);
                return;
            }
            return;
        }
        this.i.setVisibility(0);
        FrameLayout frameLayout2 = this.j;
        if (frameLayout2 != null) {
            abe abe2 = (abe) frameLayout2.getLayoutParams();
            abe2.width = -2;
            this.j.setLayoutParams(abe2);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.l = new ajxn(this);
        d(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.i = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        qb.a((View) this.i, this.l);
    }
}
