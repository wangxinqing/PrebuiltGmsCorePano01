package com.google.android.gms.family.common;

import android.accounts.Account;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.util.TypedValue;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class HelpLinkSpan extends URLSpan {
    private final String a;
    private final String b;
    private final String c;
    private final mfz d;

    public HelpLinkSpan(mfz mfz, String str, String str2, String str3) {
        super(str2);
        this.d = mfz;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public void onClick(View view) {
        GoogleHelp googleHelp = new GoogleHelp(this.a);
        googleHelp.q = Uri.parse(this.b);
        googleHelp.c = new Account(this.c, "com.google");
        TypedValue typedValue = new TypedValue();
        if (this.d.getActivity().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            ThemeSettings themeSettings = new ThemeSettings();
            themeSettings.a = 2132018418;
            themeSettings.b = typedValue.data;
            googleHelp.s = themeSettings;
        }
        new nyw(this.d.getActivity()).a(googleHelp.a());
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
