package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.google.android.gms.R;
import com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView;

/* renamed from: aldu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aldu extends FrameLayout implements alek, aldk {
    public final aleo a;
    public final aldp b = new aldp(this.a, akyr.a(getContext()));
    final ExpandingScrollView c;
    public final View d;
    public final ViewGroup e;
    private final Animation f;
    private final Animation g;
    private final Animation h;
    private final Animation i;
    private final Animation j;
    private final Animation k;
    private final RecyclerView l;
    private final View m;
    private int n;

    public aldu(Context context, aleo aleo, boolean z) {
        super(context);
        this.a = aleo;
        this.f = AnimationUtils.loadAnimation(context, R.anim.place_picker_show_action_bar_icons);
        this.g = AnimationUtils.loadAnimation(context, R.anim.place_picker_hide_action_bar_icons);
        this.h = AnimationUtils.loadAnimation(context, R.anim.place_picker_show_action_bar);
        this.i = AnimationUtils.loadAnimation(context, R.anim.place_picker_hide_action_bar);
        this.j = AnimationUtils.loadAnimation(context, R.anim.place_picker_show_action_bar_title);
        this.k = AnimationUtils.loadAnimation(context, R.anim.place_picker_hide_action_bar_title);
        LayoutInflater from = LayoutInflater.from(context);
        from.inflate(R.layout.place_picker_list, this);
        this.d = findViewById(R.id.toolbar_background);
        this.e = (ViewGroup) findViewById(R.id.toolbar_foreground);
        this.m = findViewById(R.id.toolbar_shadow);
        this.e.findViewById(R.id.back_button).setOnClickListener(new aldq(this));
        this.e.findViewById(R.id.search_button).setOnClickListener(new aldr(this));
        ExpandingScrollView expandingScrollView = (ExpandingScrollView) findViewById(R.id.expanding_scroll_view);
        this.c = expandingScrollView;
        expandingScrollView.a(alfg.COLLAPSED, false);
        ExpandingScrollView expandingScrollView2 = this.c;
        aleo aleo2 = this.a;
        expandingScrollView2.e.add(aleo2);
        if (expandingScrollView2.d != null) {
            aleo2.c();
        }
        expandingScrollView2.a((Iterable) amzy.a((Object) aleo2));
        if (!z) {
            this.c.setVisibility(8);
        }
        Resources resources = getResources();
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).topMargin = resources.getDimensionPixelSize(R.dimen.place_picker_action_bar_size) - resources.getDimensionPixelSize(R.dimen.place_picker_list_title_height);
        RecyclerView recyclerView = (RecyclerView) from.inflate(R.layout.place_picker_list_contents, this.c, false);
        this.l = recyclerView;
        recyclerView.setAdapter(this.b);
        this.l.setLayoutManager(new abk());
        RecyclerView recyclerView2 = this.l;
        recyclerView2.setAccessibilityDelegateCompat(new aldt(this, recyclerView2));
        ExpandingScrollView expandingScrollView3 = this.c;
        RecyclerView recyclerView3 = this.l;
        expandingScrollView3.removeAllViews();
        expandingScrollView3.b.e.b();
        expandingScrollView3.g = recyclerView3;
        if (recyclerView3 != null) {
            expandingScrollView3.addView(recyclerView3);
        }
        alan.a((View) this.c, (Runnable) new alds(this));
        this.n = 0;
        this.a.a((alek) this);
    }

    public final void a() {
        this.c.a(alfg.COLLAPSED, true);
        this.l.scrollToPosition(0);
    }

    public final void b(boolean z) {
        if (!z) {
            alex.a(this.i, this.d, 4);
        } else {
            alex.a(this.h, this.d, 0);
        }
        View findViewById = this.e.findViewById(R.id.toolbar_title);
        if (z) {
            alex.a(this.j, findViewById, 0);
        } else {
            alex.a(this.k, findViewById, 4);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean fitSystemWindows(Rect rect) {
        int i2 = rect.top - this.n;
        this.n = rect.top;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin += i2;
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).topMargin += i2;
        this.d.getLayoutParams().height += i2;
        return false;
    }

    public final void a(float f2) {
        int i2 = Build.VERSION.SDK_INT;
        this.m.setVisibility(0);
        this.m.setAlpha(f2);
    }

    public final void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public final void a(boolean z) {
        if (!z) {
            alex.a(this.g, this.e, 4);
        } else {
            alex.a(this.f, this.e, 0);
        }
    }
}
