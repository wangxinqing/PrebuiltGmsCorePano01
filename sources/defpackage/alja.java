package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupdesign.view.HeaderRecyclerView;

/* renamed from: alja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alja implements alhi {
    public final TemplateLayout a;
    public final RecyclerView b;
    public View c;
    public alhv d = new alhv(this.a.getContext());
    public Drawable e;
    private Drawable f;
    private int g;
    private int h;

    public alja(TemplateLayout templateLayout, RecyclerView recyclerView) {
        this.a = templateLayout;
        this.b = recyclerView;
        this.a.getContext();
        recyclerView.setLayoutManager(new abk());
        if (recyclerView instanceof HeaderRecyclerView) {
            this.c = ((HeaderRecyclerView) recyclerView).a;
        }
        this.b.addItemDecoration(this.d);
    }

    public final void a() {
        int i = Build.VERSION.SDK_INT;
        if (this.a.isLayoutDirectionResolved()) {
            if (this.f == null) {
                this.f = this.d.a;
            }
            InsetDrawable a2 = alje.a(this.f, this.g, this.h, this.a);
            this.e = a2;
            this.d.a(a2);
        }
    }

    public final void a(int i, int i2) {
        this.g = i;
        this.h = i2;
        a();
    }
}
