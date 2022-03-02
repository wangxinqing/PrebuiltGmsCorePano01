package defpackage;

import android.view.View;
import android.widget.CompoundButton;

/* renamed from: mrn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mrn implements View.OnClickListener {
    private final CompoundButton a;

    public mrn(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public void onClick(View view) {
        this.a.toggle();
    }
}
