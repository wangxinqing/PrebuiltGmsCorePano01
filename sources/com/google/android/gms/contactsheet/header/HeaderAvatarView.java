package com.google.android.gms.contactsheet.header;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HeaderAvatarView extends FrameLayout {
    public HeaderAvatarView(Context context) {
        super(context);
        a();
    }

    private final void a() {
        inflate(getContext(), R.layout.header_avatar, this);
    }

    public HeaderAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
