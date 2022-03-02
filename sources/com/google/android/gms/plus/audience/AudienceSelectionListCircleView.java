package com.google.android.gms.plus.audience;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AudienceSelectionListCircleView extends ypo {
    public TextView a;
    public TextView b;
    public TextView c;
    private ImageView h;

    public AudienceSelectionListCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        a(R.drawable.ic_circles_24dp);
        b();
        c();
        super.a();
    }

    public final void b() {
        this.b.setVisibility(8);
    }

    public final void c() {
        this.c.setVisibility(8);
    }

    public /* bridge */ /* synthetic */ void onClick(View view) {
        super.onClick(view);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.audience_selection_circle_name);
        this.b = (TextView) findViewById(R.id.audience_selection_circle_count);
        this.h = (ImageView) findViewById(R.id.audience_selection_circle_icon);
        this.c = (TextView) findViewById(R.id.audience_selection_circle_description);
    }

    public final void a(int i) {
        this.h.setImageResource(i);
    }
}
