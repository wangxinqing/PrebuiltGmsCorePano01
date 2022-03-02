package defpackage;

import android.view.View;
import com.google.android.gms.drivingmode.MasterSwitchPreference;

/* renamed from: lxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class lxd implements View.OnClickListener {
    private final MasterSwitchPreference a;

    public lxd(MasterSwitchPreference masterSwitchPreference) {
        this.a = masterSwitchPreference;
    }

    public void onClick(View view) {
        MasterSwitchPreference masterSwitchPreference = this.a;
        if (masterSwitchPreference.a.isEnabled()) {
            masterSwitchPreference.h(!masterSwitchPreference.b);
            if (!masterSwitchPreference.b((Object) Boolean.valueOf(masterSwitchPreference.b))) {
                masterSwitchPreference.h(!masterSwitchPreference.b);
            } else {
                masterSwitchPreference.g(masterSwitchPreference.b);
            }
        }
    }
}
