package com.google.android.gms.auth.uiflows.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BaseAuthProgressDialogLayout extends fzc {
    public BaseAuthProgressDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.common_progress_dialog, this);
    }

    public final void a(CharSequence charSequence) {
        ((TextView) findViewById(R.id.message)).setText(charSequence);
    }
}
