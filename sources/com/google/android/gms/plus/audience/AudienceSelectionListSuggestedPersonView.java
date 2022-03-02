package com.google.android.gms.plus.audience;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AudienceSelectionListSuggestedPersonView extends AudienceSelectionListPersonView {
    public ImageView i;
    private View j;

    public AudienceSelectionListSuggestedPersonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(int i2) {
        this.i.setImageResource(i2);
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        super.onCheckedChanged(compoundButton, z);
        this.j.setVisibility(!z ? 8 : 0);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.j = findViewById(R.id.audience_selection_suggested_check);
        this.i = (ImageView) findViewById(R.id.audience_selection_person_avatar);
    }

    public final void setChecked(boolean z) {
        super.setChecked(z);
        this.j.setVisibility(!z ? 8 : 0);
    }
}
