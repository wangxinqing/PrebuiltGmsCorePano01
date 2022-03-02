package defpackage;

import android.view.View;
import android.widget.CompoundButton;

/* renamed from: zxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zxb implements View.OnClickListener {
    final /* synthetic */ zxc a;

    public zxb(zxc zxc) {
        this.a = zxc;
    }

    public void onClick(View view) {
        CompoundButton compoundButton = this.a.e;
        compoundButton.setChecked(!compoundButton.isChecked());
    }
}
