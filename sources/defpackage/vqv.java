package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: vqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vqv implements acvv {
    private final SetupChimeraActivity a;

    public vqv(SetupChimeraActivity setupChimeraActivity) {
        this.a = setupChimeraActivity;
    }

    public final void a(Object obj) {
        SetupChimeraActivity setupChimeraActivity = this.a;
        Integer num = (Integer) obj;
        setupChimeraActivity.l = num.intValue();
        int intValue = num.intValue();
        if (intValue == 0) {
            setupChimeraActivity.i.setText(R.string.sharing_visibility_option_hidden);
            setupChimeraActivity.j.setText(R.string.sharing_setup_subtitle_visibility_none);
            setupChimeraActivity.k.setImageDrawable(SetupChimeraActivity.a(setupChimeraActivity, 2132017970));
        } else if (intValue == 1) {
            setupChimeraActivity.i.setText(R.string.sharing_all_contacts);
            setupChimeraActivity.j.setText(R.string.sharing_setup_subtitle_visibility_contacts);
            setupChimeraActivity.k.setImageDrawable(SetupChimeraActivity.a(setupChimeraActivity, 2132017969));
        } else if (intValue == 2) {
            vts vts = setupChimeraActivity.b;
            vik vik = new vik();
            vik.b(true);
            vts.a(vik.a).a((acvv) new vqw(setupChimeraActivity));
            setupChimeraActivity.j.setText(R.string.sharing_setup_subtitle_visibility_contacts);
            setupChimeraActivity.k.setImageDrawable(SetupChimeraActivity.a(setupChimeraActivity, 2132017971));
        }
    }
}
