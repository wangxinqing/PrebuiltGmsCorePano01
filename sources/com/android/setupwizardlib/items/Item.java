package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Item extends AbstractItem {
    public boolean b;
    public Drawable c;
    public boolean d;
    private int e;
    private CharSequence f;
    private CharSequence g;

    public Item() {
        this.b = true;
        this.d = true;
        this.e = f();
    }

    public final int a() {
        return this.d ? 1 : 0;
    }

    public final void b(CharSequence charSequence) {
        this.g = charSequence;
        b();
    }

    public final void d(int i) {
        this.e = i;
        b();
    }

    public final boolean d() {
        return this.b;
    }

    public final int e() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public int f() {
        return R.layout.suw_items_default;
    }

    public CharSequence g() {
        return this.f;
    }

    public final void h() {
        this.b = false;
        b();
    }

    public Item(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
        this.d = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bdg.m);
        this.b = obtainStyledAttributes.getBoolean(1, true);
        this.c = obtainStyledAttributes.getDrawable(0);
        this.g = obtainStyledAttributes.getText(4);
        this.f = obtainStyledAttributes.getText(5);
        this.e = obtainStyledAttributes.getResourceId(2, f());
        this.d = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
    }

    public void a(View view) {
        ((TextView) view.findViewById(R.id.suw_items_title)).setText(this.g);
        TextView textView = (TextView) view.findViewById(R.id.suw_items_summary);
        CharSequence g2 = g();
        if (g2 == null || g2.length() <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(g2);
            textView.setVisibility(0);
        }
        View findViewById = view.findViewById(R.id.suw_items_icon_container);
        Drawable drawable = this.c;
        if (drawable != null) {
            ImageView imageView = (ImageView) view.findViewById(R.id.suw_items_icon);
            imageView.setImageDrawable((Drawable) null);
            imageView.setImageState(drawable.getState(), false);
            imageView.setImageLevel(drawable.getLevel());
            imageView.setImageDrawable(drawable);
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
        view.setId(this.a);
    }

    public final void a(CharSequence charSequence) {
        this.f = charSequence;
        b();
    }
}
