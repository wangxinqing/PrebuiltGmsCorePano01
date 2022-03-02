package com.google.android.gms.contactsheet.header;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class QuickActionsBarContainerView extends LinearLayout {
    public QuickActionsBarContainerView(Context context) {
        super(context);
    }

    private final void a() {
        if (!azhx.a.a().d()) {
            inflate(getContext(), R.layout.gm_quick_actions_bar, this);
        } else {
            inflate(getContext(), R.layout.gm_quick_actions_bar_fix, this);
        }
    }

    public QuickActionsBarContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public QuickActionsBarContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
