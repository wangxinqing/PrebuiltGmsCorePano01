package defpackage;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.drive.ui.select.path.ViewPathElement;

/* renamed from: lqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lqa extends acg {
    public lpi a;

    public final int a() {
        int length = lqj.d.length;
        return 4;
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        return new lpz(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.drive_top_level_view_item, viewGroup, false));
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i) {
        lpy lpy;
        lpz lpz = (lpz) adl;
        ViewPathElement viewPathElement = lqj.d[i];
        lpi lpi = this.a;
        lpz.s.setText(viewPathElement.a(lpz.a.getContext()));
        TextView textView = lpz.s;
        int i2 = viewPathElement.a;
        int i3 = Build.VERSION.SDK_INT;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, 0, 0, 0);
        View view = lpz.a;
        if (lpi != null) {
            lpy = new lpy(lpi, viewPathElement);
        } else {
            lpy = null;
        }
        view.setOnClickListener(lpy);
    }
}
