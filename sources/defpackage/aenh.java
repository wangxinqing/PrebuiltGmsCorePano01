package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

/* renamed from: aenh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aenh {
    public static ActionMenuView a(Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public static ImageButton b(Toolbar toolbar) {
        if (toolbar.getChildCount() <= 0) {
            return null;
        }
        View childAt = toolbar.getChildAt(0);
        if (childAt instanceof ImageButton) {
            return (ImageButton) childAt;
        }
        return null;
    }
}
