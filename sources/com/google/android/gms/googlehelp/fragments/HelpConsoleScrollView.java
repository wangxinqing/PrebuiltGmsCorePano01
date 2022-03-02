package com.google.android.gms.googlehelp.fragments;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HelpConsoleScrollView extends ScrollView {
    public HelpConsoleScrollView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return true;
    }

    public HelpConsoleScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HelpConsoleScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
