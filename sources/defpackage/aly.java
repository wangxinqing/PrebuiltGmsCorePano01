package defpackage;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;

/* renamed from: aly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aly implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ CheckBoxPreference a;

    public aly(CheckBoxPreference checkBoxPreference) {
        this.a = checkBoxPreference;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.a.b((Object) Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            this.a.h(z);
        }
    }
}
