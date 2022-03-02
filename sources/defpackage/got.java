package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* renamed from: got  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class got implements View.OnApplyWindowInsetsListener {
    final /* synthetic */ View a;
    final /* synthetic */ MinuteMaidChimeraActivity b;

    public got(MinuteMaidChimeraActivity minuteMaidChimeraActivity, View view) {
        this.b = minuteMaidChimeraActivity;
        this.a = view;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ViewGroup viewGroup = this.b.r;
        if (viewGroup != null) {
            viewGroup.dispatchApplyWindowInsets(windowInsets);
        }
        this.a.dispatchApplyWindowInsets(windowInsets);
        return windowInsets.consumeStableInsets().consumeSystemWindowInsets();
    }
}
