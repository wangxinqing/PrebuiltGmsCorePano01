package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: jps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jps implements View.OnClickListener {
    private final jpz a;

    public jps(jpz jpz) {
        this.a = jpz;
    }

    public void onClick(View view) {
        jpz jpz = this.a;
        if (!jpz.a) {
            jpz.b.a(jth.SEE_MORE_BUTTON, jth.SMART_PROFILE_ABOUT_CARD);
            jpz.a = true;
            jpz.v.b();
            if (jpz.l.getChildCount() > 0) {
                ((TextView) jpz.l.getChildAt(0).findViewById(R.id.text)).setMaxLines(50);
            }
            if (jpz.u.getChildCount() > 0) {
                ((TextView) jpz.u.getChildAt(0).findViewById(R.id.text)).setMaxLines(50);
            }
            if (jpz.m.getChildCount() > 0) {
                jpz.a(jpz.d, jpz.m);
            }
            if (jpz.n.getChildCount() > 0) {
                jpz.a(jpz.e, jpz.n);
            }
            if (jpz.o.getChildCount() > 0) {
                jpz.a(jpz.f, jpz.o);
            }
            if (jpz.p.getChildCount() > 0) {
                jpz.a(jpz.g, jpz.p);
            }
            if (jpz.q.getChildCount() > 0) {
                jpz.a(jpz.h, jpz.q);
            }
            if (jpz.r.getChildCount() > 0) {
                jpz.a(jpz.i, jpz.r);
            }
            if (jpz.s.getChildCount() > 0) {
                jpz.a(jpz.j, jpz.s);
            }
            if (jpz.t.getChildCount() > 0) {
                jpz.a(jpz.k, jpz.t);
                return;
            }
            return;
        }
        jpz.b.a(jth.SEE_LESS_BUTTON, jth.SMART_PROFILE_ABOUT_CARD);
        jpz.a();
    }
}
