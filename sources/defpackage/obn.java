package defpackage;

import android.widget.CompoundButton;

/* renamed from: obn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class obn implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ obp a;

    public obn(obp obp) {
        this.a = obp;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        oct oct = this.a.c;
        if (oct != null) {
            oct.a();
        }
    }
}
