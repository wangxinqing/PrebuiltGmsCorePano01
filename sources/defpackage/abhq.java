package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.R;

/* renamed from: abhq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abhq {
    private final View a;
    private final Context b;

    public abhq(View view, Context context) {
        this.a = view;
        this.b = context;
    }

    public final akax a() {
        return a(R.string.common_something_went_wrong, 0, (abhp) null);
    }

    public final akax a(int i, int i2, abhp abhp) {
        boolean z;
        if (i2 == 0 && abhp == null) {
            z = true;
        } else {
            z = (i2 == 0 || abhp == null) ? false : true;
        }
        iva.b(z);
        int c = (int) azje.c();
        if (azim.b()) {
            if (azhx.a.a().c()) {
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.b.getSystemService("accessibility");
                if (accessibilityManager.isEnabled() && !accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty()) {
                    c = -2;
                }
            }
            View view = this.a;
            SpannableString spannableString = new SpannableString(this.b.getResources().getString(i));
            spannableString.setSpan(new ForegroundColorSpan(jsa.e(this.b)), 0, spannableString.length(), 0);
            akax a2 = akax.a(view, (CharSequence) spannableString, c);
            if (abhp != null) {
                a2.a(i2, new abhn(abhp));
                a2.b(jsa.d(this.b));
            }
            a2.c(jsa.c(this.b));
            return a2;
        }
        akax a3 = akax.a(this.a, i, c);
        if (abhp != null) {
            a3.a(i2, new abho(abhp));
            a3.b(kf.b(this.b, R.color.snackbar_button_color));
        }
        return a3;
    }
}
