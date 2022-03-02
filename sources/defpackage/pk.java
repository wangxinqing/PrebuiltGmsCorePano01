package defpackage;

import android.os.Build;
import android.view.MenuItem;
import android.view.View;

/* renamed from: pk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pk {
    @Deprecated
    public static View a(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static void a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof mi) {
            ((mi) menuItem).a(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    @Deprecated
    public static void a(MenuItem menuItem, pj pjVar) {
        menuItem.setOnActionExpandListener(new pi(pjVar));
    }
}
