package defpackage;

import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;
import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;

/* renamed from: viq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class viq implements acvv {
    private final ContactSelectChimeraActivity a;

    public viq(ContactSelectChimeraActivity contactSelectChimeraActivity) {
        this.a = contactSelectChimeraActivity;
    }

    public final void a(Object obj) {
        ContactSelectChimeraActivity contactSelectChimeraActivity = this.a;
        if (!((Boolean) obj).booleanValue()) {
            contactSelectChimeraActivity.startActivityForResult(ConsentsChimeraActivity.a(contactSelectChimeraActivity), 1004);
        }
    }
}
