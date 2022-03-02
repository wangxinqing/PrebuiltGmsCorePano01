package com.google.android.gms.googlehelp.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.material.button.MaterialButton;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ContactOptionsContainer extends LinearLayout {
    public static final String a;
    public ocl b;
    public int c;
    public boolean d;
    public HelpChimeraActivity e;
    public HelpConfig f;
    public MaterialButton g;

    static {
        String valueOf = String.valueOf(oco.class.getSimpleName());
        a = valueOf.length() == 0 ? new String("gH_ContactOptsContainer-") : "gH_ContactOptsContainer-".concat(valueOf);
    }

    public ContactOptionsContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public ContactOptionsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.gh_contact_options_content, this, true);
    }
}
