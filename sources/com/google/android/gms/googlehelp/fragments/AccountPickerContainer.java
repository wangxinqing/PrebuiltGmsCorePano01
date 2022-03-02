package com.google.android.gms.googlehelp.fragments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AccountPickerContainer extends LinearLayout {
    public AccountPickerContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public AccountPickerContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.gh_account_picker_content, this, true);
    }
}
