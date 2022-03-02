package defpackage;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: vpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vpo implements acvv {
    private final SettingsChimeraActivity a;
    private final RadioGroup b;
    private final RadioButton c;
    private final RadioButton d;
    private final RadioButton e;
    private final ss f;
    private final Bundle g;

    public vpo(SettingsChimeraActivity settingsChimeraActivity, RadioGroup radioGroup, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, ss ssVar, Bundle bundle) {
        this.a = settingsChimeraActivity;
        this.b = radioGroup;
        this.c = radioButton;
        this.d = radioButton2;
        this.e = radioButton3;
        this.f = ssVar;
        this.g = bundle;
    }

    public final void a(Object obj) {
        SettingsChimeraActivity settingsChimeraActivity = this.a;
        RadioGroup radioGroup = this.b;
        RadioButton radioButton = this.c;
        RadioButton radioButton2 = this.d;
        RadioButton radioButton3 = this.e;
        ss ssVar = this.f;
        Bundle bundle = this.g;
        Integer num = (Integer) obj;
        radioGroup.setTag(R.id.data_usage, num);
        int intValue = num.intValue();
        if (intValue == 1) {
            radioGroup.check(radioButton3.getId());
        } else if (intValue == 2) {
            radioGroup.check(radioButton.getId());
        } else if (intValue == 3) {
            radioGroup.check(radioButton2.getId());
        }
        ssVar.setOnDismissListener(new vpp(settingsChimeraActivity));
        if (bundle != null) {
            ssVar.onRestoreInstanceState(bundle);
        }
        if (settingsChimeraActivity.isFinishing()) {
            ((anih) vvj.a.c()).a("SettingsActivity#editDataUsage: Alert dialog cannot show because Settings Activity is not running.");
            return;
        }
        ssVar.show();
        settingsChimeraActivity.l = ssVar;
    }
}
