package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: jmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jmq implements jms {
    private static jmq a;

    public static jmq a() {
        if (a == null) {
            a = new jmq();
        }
        return a;
    }

    public final jmr a(ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == R.layout.common_settings_category) {
            view = from.inflate(R.layout.common_settings_category, viewGroup, false);
        } else {
            view = from.inflate(R.layout.common_settings_item, viewGroup, false);
        }
        if (i == R.layout.common_settings_toggle_widget) {
            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(16908312);
            viewGroup2.addView(from.inflate(R.layout.common_settings_toggle_widget, viewGroup2, false));
        }
        if (i == R.layout.common_settings_item) {
            return new jna(view);
        }
        if (i == R.layout.common_settings_category) {
            return new jmv(view);
        }
        if (i == R.layout.common_settings_toggle_widget) {
            return new jnc(view);
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Unknown view type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
