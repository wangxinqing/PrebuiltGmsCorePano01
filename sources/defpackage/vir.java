package defpackage;

import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;

/* renamed from: vir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vir implements acvs {
    private final ContactSelectChimeraActivity a;

    public vir(ContactSelectChimeraActivity contactSelectChimeraActivity) {
        this.a = contactSelectChimeraActivity;
    }

    public final void a(Exception exc) {
        ContactSelectChimeraActivity contactSelectChimeraActivity = this.a;
        if (!ayni.a.a().y() || !(exc instanceof ibr) || ((ibr) exc).a.i != 4) {
            Toast.makeText(contactSelectChimeraActivity, contactSelectChimeraActivity.getResources().getString(R.string.sharing_setup_toast_contact_mode_not_available), 1).show();
        } else {
            Toast.makeText(contactSelectChimeraActivity, contactSelectChimeraActivity.getResources().getString(R.string.sharing_setup_toast_contact_mode_no_account), 1).show();
        }
        contactSelectChimeraActivity.i.a(0);
        contactSelectChimeraActivity.e();
    }
}
