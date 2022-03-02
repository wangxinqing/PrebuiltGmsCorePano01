package defpackage;

import android.view.View;
import com.google.android.chimera.Activity;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: gqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gqe {
    public final View a;
    public final Collection b = new HashSet();
    public int c;
    public int d;

    public gqe(Activity activity) {
        View findViewById = activity.findViewById(16908290);
        this.a = findViewById;
        findViewById.getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new gqd(this));
    }
}
