package defpackage;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* renamed from: mgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mgj {
    public static void a(Toolbar toolbar, String str, Activity activity) {
        toolbar.a((CharSequence) str);
        toolbar.getChildAt(0).setFocusable(true);
        toolbar.b((Drawable) atg.a(toolbar.getResources(), R.drawable.quantum_ic_arrow_back_vd_theme_24, toolbar.getContext().getTheme()));
        toolbar.c((int) R.string.fm_navigate_up);
        toolbar.a((View.OnClickListener) new mgi(activity));
        if (axfx.b()) {
            toolbar.a(2132018373);
        }
    }
}
