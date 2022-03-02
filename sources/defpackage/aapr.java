package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.common.widget.phone.SwitchBar;

/* renamed from: aapr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aapr extends jmr {
    private final SwitchBar t;
    private final Context u;

    public aapr(View view, Context context) {
        super(view);
        this.u = context;
        SwitchBar switchBar = (SwitchBar) view.findViewById(R.id.toggle);
        this.t = switchBar;
        if (context instanceof jmo) {
            switchBar.a = (jmo) context;
        }
    }

    public final void a(jmt jmt) {
        if (jmt instanceof aapt) {
            this.t.a(((aapt) jmt).i);
            View childAt = this.t.getChildAt(0);
            if (childAt != null) {
                ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).leftMargin = Math.round(TypedValue.applyDimension(1, 72.0f, this.u.getResources().getDisplayMetrics()));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("settingItem must be FindMyDeviceTopToggleItem");
    }
}
