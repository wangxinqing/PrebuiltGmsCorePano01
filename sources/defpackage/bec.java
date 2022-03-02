package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.setupwizardlib.TemplateLayout;
import com.android.setupwizardlib.view.HeaderRecyclerView;

@Deprecated
/* renamed from: bec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bec implements bea {
    public final TemplateLayout a;
    public final RecyclerView b;
    public View c;
    public Drawable d;
    private final bde e = new bde(this.a.getContext());
    private Drawable f;
    private int g;
    private int h;

    public bec(TemplateLayout templateLayout, RecyclerView recyclerView) {
        this.a = templateLayout;
        this.b = recyclerView;
        this.a.getContext();
        recyclerView.setLayoutManager(new abk());
        if (recyclerView instanceof HeaderRecyclerView) {
            this.c = ((HeaderRecyclerView) recyclerView).a;
        }
        this.b.addItemDecoration(this.e);
    }

    public final void a() {
        InsetDrawable insetDrawable;
        int i = Build.VERSION.SDK_INT;
        if (this.a.isLayoutDirectionResolved()) {
            if (this.f == null) {
                this.f = this.e.a;
            }
            Drawable drawable = this.f;
            int i2 = this.g;
            int i3 = this.h;
            TemplateLayout templateLayout = this.a;
            int i4 = Build.VERSION.SDK_INT;
            if (templateLayout.getLayoutDirection() == 1) {
                insetDrawable = new InsetDrawable(drawable, i3, 0, i2, 0);
            } else {
                insetDrawable = new InsetDrawable(drawable, i2, 0, i3, 0);
            }
            this.d = insetDrawable;
            this.e.a(insetDrawable);
        }
    }

    public final void a(int i, int i2) {
        this.g = i;
        this.h = i2;
        a();
    }

    public final void a(acg acg) {
        this.b.setAdapter(acg);
    }
}
