package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: ajwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajwc extends acg {
    public final ajvf a;

    public ajwc(ajvf ajvf) {
        this.a = ajvf;
    }

    public final int a() {
        return this.a.b.e;
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        return new ajwb((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    public final int f(int i) {
        return i - this.a.b.a.d;
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i) {
        ajwb ajwb = (ajwb) adl;
        int i2 = this.a.b.a.d + i;
        String string = ajwb.s.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        TextView textView = ajwb.s;
        Locale locale = Locale.getDefault();
        Integer valueOf = Integer.valueOf(i2);
        textView.setText(String.format(locale, "%d", new Object[]{valueOf}));
        ajwb.s.setContentDescription(String.format(string, new Object[]{valueOf}));
        ajus ajus = this.a.d;
        Calendar b = ajvz.b();
        ajur ajur = b.get(1) != i2 ? ajus.d : ajus.f;
        for (Long longValue : this.a.a.c()) {
            b.setTimeInMillis(longValue.longValue());
            if (b.get(1) == i2) {
                ajur = ajus.e;
            }
        }
        ajur.a(ajwb.s);
        ajwb.s.setOnClickListener(new ajwa(this, i2));
    }
}
