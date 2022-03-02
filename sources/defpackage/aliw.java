package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupdesign.items.ItemGroup;

/* renamed from: aliw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aliw implements alhi {
    private final TemplateLayout a;
    private ListView b;
    private Drawable c;
    private Drawable d;
    private int e;
    private int f;

    public aliw(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        this.a = templateLayout;
        Context context = templateLayout.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alhx.m, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            alif alif = new alif((ItemGroup) new alio(context).a(resourceId));
            ListView a2 = a();
            if (a2 != null) {
                a2.setAdapter(alif);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize == -1) {
            a(obtainStyledAttributes.getDimensionPixelSize(3, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0));
        } else {
            a(dimensionPixelSize, 0);
        }
        obtainStyledAttributes.recycle();
    }

    private final void c() {
        ListView a2 = a();
        if (a2 != null) {
            int i = Build.VERSION.SDK_INT;
            if (this.a.isLayoutDirectionResolved()) {
                if (this.d == null) {
                    this.d = a2.getDivider();
                }
                InsetDrawable a3 = alje.a(this.d, this.e, this.f, this.a);
                this.c = a3;
                a2.setDivider(a3);
            }
        }
    }

    public final ListView a() {
        if (this.b == null) {
            View b2 = this.a.b(16908298);
            if (b2 instanceof ListView) {
                this.b = (ListView) b2;
            }
        }
        return this.b;
    }

    public final void b() {
        if (this.c == null) {
            c();
        }
    }

    public final void a(int i, int i2) {
        this.e = i;
        this.f = i2;
        c();
    }
}
