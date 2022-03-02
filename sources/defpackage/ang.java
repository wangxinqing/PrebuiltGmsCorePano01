package defpackage;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;

/* renamed from: ang  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ang implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ SwitchPreference a;

    public ang(SwitchPreference switchPreference) {
        this.a = switchPreference;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.a.b((Object) Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            this.a.h(z);
        }
    }
}
