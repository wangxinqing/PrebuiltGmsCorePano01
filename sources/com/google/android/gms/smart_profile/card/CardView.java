package com.google.android.gms.smart_profile.card;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CardView extends androidx.cardview.widget.CardView {
    public CardView(Context context) {
        super(context);
        if (getResources().getConfiguration().orientation != 2) {
            b();
        }
        a((float) getResources().getDimensionPixelSize(R.dimen.sp_card_elevation));
    }

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getResources().getConfiguration().orientation != 2) {
            b();
        }
        a((float) getResources().getDimensionPixelSize(R.dimen.sp_card_elevation));
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getResources().getConfiguration().orientation != 2) {
            b();
        }
        a((float) getResources().getDimensionPixelSize(R.dimen.sp_card_elevation));
    }
}
