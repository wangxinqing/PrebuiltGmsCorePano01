package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Item extends AbstractItem {
    private boolean a;
    public Drawable c;
    public int d;
    public CharSequence e;
    public int f;
    private CharSequence g;
    private boolean h;
    private int i;

    public Item() {
        this.a = true;
        this.h = true;
        this.i = 0;
        this.f = 16;
        this.d = f();
    }

    public final int a() {
        return this.h ? 1 : 0;
    }

    public boolean d() {
        return this.a;
    }

    public final int e() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public int f() {
        return R.layout.sud_items_default;
    }

    public CharSequence g() {
        return this.g;
    }

    public Item(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        this.h = true;
        this.i = 0;
        this.f = 16;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alhx.l);
        this.a = obtainStyledAttributes.getBoolean(1, true);
        this.c = obtainStyledAttributes.getDrawable(0);
        this.e = obtainStyledAttributes.getText(4);
        this.g = obtainStyledAttributes.getText(5);
        this.d = obtainStyledAttributes.getResourceId(2, f());
        this.h = obtainStyledAttributes.getBoolean(3, true);
        this.i = obtainStyledAttributes.getColor(7, 0);
        this.f = obtainStyledAttributes.getInt(6, 16);
        obtainStyledAttributes.recycle();
    }

    public final void a(Drawable drawable) {
        this.c = drawable;
        b();
    }

    public void a(View view) {
        ((TextView) view.findViewById(R.id.sud_items_title)).setText(this.e);
        TextView textView = (TextView) view.findViewById(R.id.sud_items_summary);
        CharSequence g2 = g();
        if (g2 == null || g2.length() <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(g2);
            textView.setVisibility(0);
        }
        View findViewById = view.findViewById(R.id.sud_items_icon_container);
        Drawable drawable = this.c;
        if (drawable != null) {
            ImageView imageView = (ImageView) view.findViewById(R.id.sud_items_icon);
            imageView.setImageDrawable((Drawable) null);
            imageView.setImageState(drawable.getState(), false);
            imageView.setImageLevel(drawable.getLevel());
            imageView.setImageDrawable(drawable);
            int i2 = this.i;
            if (i2 != 0) {
                imageView.setColorFilter(i2);
            } else {
                imageView.clearColorFilter();
            }
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).gravity = this.f;
            }
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
        view.setId(this.b);
    }
}
