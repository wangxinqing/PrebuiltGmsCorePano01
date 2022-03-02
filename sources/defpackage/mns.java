package defpackage;

import android.accounts.Account;
import android.util.TypedValue;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: mns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mns implements View.OnClickListener {
    final /* synthetic */ mob a;

    public mns(mob mob) {
        this.a = mob;
    }

    public void onClick(View view) {
        mob mob = this.a;
        TypedValue typedValue = new TypedValue();
        mob.getActivity().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        GoogleHelp googleHelp = new GoogleHelp("family_disabled_android_ota");
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = 2132018418;
        themeSettings.b = typedValue.data;
        googleHelp.s = themeSettings;
        googleHelp.c = new Account(mob.d, "com.google");
        new nyw(mob.getActivity()).a(googleHelp.a());
    }
}
