package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.chip.Chip;

/* renamed from: dbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dbj implements ajsf {
    private final dbp a;

    public dbj(dbp dbp) {
        this.a = dbp;
    }

    public final void a(AppBarLayout appBarLayout, int i) {
        boolean z;
        boolean z2;
        int i2 = i;
        dbp dbp = this.a;
        if (dbp.c != i2) {
            dbp.c = i2;
            float abs = 1.0f - Math.abs(((float) i2) / ((float) appBarLayout.c()));
            if (dbp.v != 2) {
                dbp.l.setAlpha((float) Math.pow((double) abs, 4.0d));
            } else if (dbp.h.getLineCount() <= 1) {
                View findViewById = dbp.l.findViewById(R.id.account_spinner);
                View findViewById2 = dbp.l.findViewById(R.id.action_chip);
                TextView textView = (TextView) dbp.l.findViewById(R.id.welcome);
                double d = (double) abs;
                findViewById.setAlpha((float) Math.pow(d, 16.0d));
                findViewById2.setAlpha((float) Math.pow(d, 16.0d));
                float f = dbp.t;
                textView.setTextSize(0, f + ((dbp.s - f) * abs));
                float round = (float) Math.round(((float) (appBarLayout.c() - dbp.r)) * (1.0f - abs));
                View view = dbp.f;
                if (view != null) {
                    view.setTranslationY(round);
                    dbp.e.setTranslationY(-round);
                } else {
                    textView.setTranslationY(round);
                }
            } else {
                dbp.i.setTranslationY((float) (-i2));
                float f2 = 1.0f - abs;
                dbp.l.setAlpha((float) Math.pow((double) Math.max(1.0f - (1.5f * f2), 0.0f), 4.0d));
                TextView textView2 = dbp.i;
                float pow = (float) Math.pow((double) f2, 2.0d);
                textView2.setAlpha(Math.min(pow + pow, 1.0f));
            }
            View view2 = dbp.f;
            if (view2 == null) {
                dbp.e.setClickable(((double) abs) > 0.5d);
            } else {
                if (((double) abs) > 0.5d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                view2.setClickable(z2);
            }
            Chip chip = dbp.j;
            if (chip != null) {
                if (((double) abs) > 0.5d) {
                    z = true;
                } else {
                    z = false;
                }
                chip.setClickable(z);
            }
            if (dbp.n) {
                dbp.a((int) (((float) dbp.u) * (1.0f - abs)));
            }
            if (dbp.m.e) {
                dbp.m = abs < 1.0E-4f ? dbo.EXPANDABLE_MINIMIZED : abs <= 0.9999f ? dbo.EXPANDABLE_IN_TRANSITION : dbo.EXPANDABLE_MAXIMIZED;
            }
            ajsf ajsf = dbp.p;
            if (ajsf != null) {
                ajsf.a(appBarLayout, i2);
            }
        }
    }
}
