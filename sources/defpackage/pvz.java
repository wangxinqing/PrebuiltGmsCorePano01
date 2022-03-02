package defpackage;

import android.widget.CompoundButton;

/* renamed from: pvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pvz implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ pwe a;

    public pvz(pwe pwe) {
        this.a = pwe;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        new puj().execute(new Object[]{this.a.getActivity(), Boolean.valueOf(z)});
        this.a.a(z);
    }
}
