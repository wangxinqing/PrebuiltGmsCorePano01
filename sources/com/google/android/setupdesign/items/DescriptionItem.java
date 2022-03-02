package com.google.android.setupdesign.items;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DescriptionItem extends Item {
    public DescriptionItem() {
    }

    public final void a(View view) {
        super.a(view);
        TextView textView = (TextView) view.findViewById(R.id.sud_items_title);
    }

    public DescriptionItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
