package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PreferenceScreen extends PreferenceGroup {
    public boolean d = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, lj.a(context, (int) R.attr.preferenceScreenStyle, 16842891));
    }

    /* access modifiers changed from: protected */
    public final void a() {
        amw amw;
        if (this.u == null && this.v == null && g() != 0 && (amw = this.l.f) != null) {
            amw.a();
        }
    }

    public final boolean r() {
        return false;
    }
}
