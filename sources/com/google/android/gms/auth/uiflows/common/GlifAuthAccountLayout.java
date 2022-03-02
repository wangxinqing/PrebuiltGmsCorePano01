package com.google.android.gms.auth.uiflows.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GlifAuthAccountLayout extends GlifLayout implements fza, fzd {
    public GlifAuthAccountLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a() {
    }

    public final void a(fyz fyz) {
    }

    public final void a(boolean z) {
    }

    public final void b() {
        findViewById(R.id.circular_progress_bar).setVisibility(0);
    }

    public final void c(CharSequence charSequence) {
    }

    public GlifAuthAccountLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(Window window) {
        alhk alhk = (alhk) a(alhk.class);
        alhk.a(window);
    }

    public final void b(Window window) {
        a(window);
    }

    public GlifAuthAccountLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.auth_glif_auth_account_layout, this);
        b(false);
    }

    public final void a(Window window, Context context) {
        ((alhk) a(alhk.class)).a(window, context);
    }

    public final void b(Window window, Context context) {
        a(window, context);
    }

    public final void b(CharSequence charSequence) {
        ((TextView) findViewById(R.id.message)).setText(charSequence);
    }
}
