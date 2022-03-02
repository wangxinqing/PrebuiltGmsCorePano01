package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, lj.a(context, (int) R.attr.preferenceCategoryStyle, 16842892), (byte[]) null);
    }

    public final void a(anb anb) {
        super.a(anb);
        if (Build.VERSION.SDK_INT >= 28) {
            anb.a.setAccessibilityHeading(true);
        } else {
            int i = Build.VERSION.SDK_INT;
        }
    }

    public final boolean c() {
        return !super.h();
    }

    public final boolean h() {
        return false;
    }
}
