package defpackage;

import android.util.Log;
import android.widget.ScrollView;
import com.android.setupwizardlib.view.BottomScrollView;

@Deprecated
/* renamed from: bee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bee {
    public bee(ScrollView scrollView) {
        if (scrollView instanceof BottomScrollView) {
            BottomScrollView bottomScrollView = (BottomScrollView) scrollView;
            return;
        }
        String valueOf = String.valueOf(scrollView);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("Cannot set non-BottomScrollView. Found=");
        sb.append(valueOf);
        Log.w("ScrollViewDelegate", sb.toString());
    }
}
