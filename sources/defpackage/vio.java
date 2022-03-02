package defpackage;

import android.view.View;
import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;

/* renamed from: vio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vio implements View.OnClickListener {
    private final ContactSelectChimeraActivity a;

    public vio(ContactSelectChimeraActivity contactSelectChimeraActivity) {
        this.a = contactSelectChimeraActivity;
    }

    public void onClick(View view) {
        ContactSelectChimeraActivity contactSelectChimeraActivity = this.a;
        contactSelectChimeraActivity.setResult(-1);
        contactSelectChimeraActivity.finish();
    }
}
