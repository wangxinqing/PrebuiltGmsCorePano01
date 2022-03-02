package defpackage;

import android.view.View;
import com.google.android.gms.R;

/* renamed from: ajva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajva extends oz {
    final /* synthetic */ ajvf b;

    public ajva(ajvf ajvf) {
        this.b = ajvf;
    }

    public final void a(View view, qs qsVar) {
        super.a(view, qsVar);
        qsVar.e((CharSequence) this.b.g.getVisibility() == 0 ? this.b.getString(R.string.mtrl_picker_toggle_to_year_selection) : this.b.getString(R.string.mtrl_picker_toggle_to_day_selection));
    }
}
