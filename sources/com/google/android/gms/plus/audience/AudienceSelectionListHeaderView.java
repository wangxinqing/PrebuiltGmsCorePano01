package com.google.android.gms.plus.audience;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AudienceSelectionListHeaderView extends LinearLayout {
    public TextView a;

    public AudienceSelectionListHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        findViewById(R.id.top_border);
        this.a = (TextView) findViewById(R.id.audience_selection_header_text);
    }
}
