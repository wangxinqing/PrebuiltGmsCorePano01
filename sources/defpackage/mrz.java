package defpackage;

import android.accounts.Account;
import android.view.View;
import android.widget.CompoundButton;

/* renamed from: mrz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mrz implements CompoundButton.OnCheckedChangeListener {
    private final msl a;

    public mrz(msl msl) {
        this.a = msl;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        msl msl = this.a;
        boolean isChecked = msl.d.isChecked();
        Account b = msl.b();
        int i = 0;
        msl.d.setEnabled(false);
        msl.c().execute(new msb(msl, isChecked, b));
        View view = msl.e;
        if (!isChecked) {
            i = 8;
        }
        view.setVisibility(i);
        msl.g.setVisibility(i);
    }
}
