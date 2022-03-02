package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.feedback.Screenshot;

/* renamed from: mwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mwj {
    public static Pair a(Resources resources, Rect rect, int i, int i2, boolean z) {
        int i3;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (!z) {
            i3 = displayMetrics.heightPixels;
        } else if (i2 <= i) {
            i3 = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
        } else {
            i3 = Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
        }
        int dimension = (int) resources.getDimension(R.dimen.gf_drawable_top_margin);
        int dimension2 = (int) resources.getDimension(R.dimen.gf_drawable_border);
        int dimension3 = ((((i3 - ((int) resources.getDimension(R.dimen.gf_top_menu_size))) - (dimension + dimension)) - rect.top) - (dimension2 + dimension2)) - ((int) resources.getDimension(R.dimen.gf_separator_size));
        return new Pair(Integer.valueOf(Math.round((((float) i) / ((float) i2)) * ((float) dimension3))), Integer.valueOf(dimension3));
    }

    public static HelpConfig a(ErrorReport errorReport, Context context) {
        GoogleHelp googleHelp = new GoogleHelp("gms:feedback:suggestions");
        if (!TextUtils.isEmpty(errorReport.B)) {
            googleHelp.c = new Account(errorReport.B, "com.google");
        }
        new nyt(googleHelp).a(errorReport.ag);
        HelpConfig a = HelpConfig.a(googleHelp, context);
        a.b = errorReport.a.packageName;
        return a;
    }

    public static void a(View view) {
        View view2 = (View) view.getParent();
        if (view2 != null) {
            view2.post(new mwi(view.getResources().getDimensionPixelSize(R.dimen.gf_accessibility_required_min_touch_target_size), view, view2));
        }
    }

    public static boolean a(Pair pair, Screenshot screenshot) {
        return screenshot.a >= ((Integer) pair.first).intValue() / 2 || screenshot.b >= ((Integer) pair.first).intValue() / 2 || screenshot.a >= ((Integer) pair.second).intValue() / 2 || screenshot.b >= ((Integer) pair.second).intValue() / 2;
    }

    public static boolean a(ErrorReport errorReport) {
        return errorReport != null && errorReport.a.type == 11;
    }
}
