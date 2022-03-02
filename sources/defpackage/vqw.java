package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: vqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vqw implements acvv {
    private final SetupChimeraActivity a;

    public vqw(SetupChimeraActivity setupChimeraActivity) {
        this.a = setupChimeraActivity;
    }

    public final void a(Object obj) {
        SetupChimeraActivity setupChimeraActivity = this.a;
        Integer num = (Integer) obj;
        setupChimeraActivity.i.setText(setupChimeraActivity.getResources().getQuantityString(R.plurals.sharing_settings_button_select_contacts_description, num.intValue(), new Object[]{num}));
    }
}
