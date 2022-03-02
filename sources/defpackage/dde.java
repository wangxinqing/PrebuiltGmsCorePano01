package defpackage;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.List;

/* renamed from: dde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dde extends atr {
    private final LayoutInflater b;
    private final List c;

    public dde(ddf ddf, Context context) {
        this.b = (LayoutInflater) context.getSystemService("layout_inflater");
        if (cyd.a(ddf.getContext())) {
            this.c = anda.a((List) ddf.b.c);
        } else {
            this.c = ddf.b.c;
        }
    }

    public final int a() {
        return this.c.size();
    }

    public final boolean a(View view, Object obj) {
        return view == obj;
    }

    public final Object a(ViewGroup viewGroup, int i) {
        View inflate = this.b.inflate(R.layout.as_onboarding_step, viewGroup, false);
        aqry aqry = (aqry) this.c.get(i);
        if (!aqry.a.isEmpty()) {
            TextView textView = (TextView) inflate.findViewById(R.id.onboarding_step_title);
            textView.setVisibility(0);
            textView.setText(aqry.a);
        }
        if (!aqry.b.isEmpty()) {
            TextView textView2 = (TextView) inflate.findViewById(R.id.onboarding_step_message);
            textView2.setVisibility(0);
            textView2.setText(aqry.b);
            textView2.setMovementMethod(new ScrollingMovementMethod());
        }
        viewGroup.addView(inflate);
        return inflate;
    }

    public final void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
