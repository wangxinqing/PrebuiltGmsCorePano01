package defpackage;

import android.widget.RadioGroup;

/* renamed from: oca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oca implements RadioGroup.OnCheckedChangeListener {
    final /* synthetic */ occ a;

    public oca(occ occ) {
        this.a = occ;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        oct oct = this.a.a;
        if (oct != null) {
            oct.a();
        }
    }
}
