package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* renamed from: afg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afg {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        if (afj.b != null && afj.b.a == view) {
            afj.a((afj) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (afj.c != null && afj.c.a == view) {
                afj.c.a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new afj(view, charSequence);
    }
}
