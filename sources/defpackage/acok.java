package defpackage;

import android.widget.CompoundButton;

/* renamed from: acok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acok implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ acom a;

    public acok(acom acom) {
        this.a = acom;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        acom acom = this.a;
        acom.d = z;
        acom.a();
    }
}
