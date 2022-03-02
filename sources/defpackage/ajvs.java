package defpackage;

import android.os.Build;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.material.datepicker.MaterialCalendarGridView;

/* renamed from: ajvs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajvs extends adl {
    final TextView s;
    final MaterialCalendarGridView t;

    public ajvs(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        boolean z2;
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.s = textView;
        py a = qb.a();
        Boolean bool = true;
        if (a.a()) {
            textView.setAccessibilityHeading(bool.booleanValue());
        } else {
            int i = Build.VERSION.SDK_INT;
            Boolean bool2 = (Boolean) a.b(textView);
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            } else {
                z2 = false;
            }
            if (z2 != bool.booleanValue()) {
                qb.I(textView);
                textView.setTag(a.a, bool);
                qb.i(textView, 0);
            }
        }
        this.t = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z) {
            this.s.setVisibility(8);
        }
    }
}
