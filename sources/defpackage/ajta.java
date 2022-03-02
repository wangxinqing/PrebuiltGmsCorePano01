package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: ajta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajta extends wt {
    public ajta(Context context) {
        super(context);
    }

    public final MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            e();
            MenuItem a = super.a(i, i2, i3, charSequence);
            if (a instanceof ww) {
                ((ww) a).a(true);
            }
            f();
            return a;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
