package defpackage;

import android.transition.TransitionManager;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: vpa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vpa implements acvv {
    private final SettingsChimeraActivity a;
    private final boolean b;

    public vpa(SettingsChimeraActivity settingsChimeraActivity, boolean z) {
        this.a = settingsChimeraActivity;
        this.b = z;
    }

    public final void a(Object obj) {
        SettingsChimeraActivity settingsChimeraActivity = this.a;
        Integer num = (Integer) obj;
        if (this.b) {
            TransitionManager.beginDelayedTransition((ViewGroup) settingsChimeraActivity.findViewById(16908290));
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            settingsChimeraActivity.i.setText(R.string.sharing_visibility_option_hidden);
        } else if (intValue == 1) {
            settingsChimeraActivity.i.setText(R.string.sharing_all_contacts);
        } else if (intValue == 2) {
            vts vts = settingsChimeraActivity.a;
            vik vik = new vik();
            vik.b(true);
            vts.a(vik.a).a((acvv) new vpc(settingsChimeraActivity));
        }
    }
}
