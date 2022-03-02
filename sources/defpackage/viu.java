package defpackage;

import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;

/* renamed from: viu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class viu implements acvv {
    private final ContactSelectChimeraActivity a;

    public viu(ContactSelectChimeraActivity contactSelectChimeraActivity) {
        this.a = contactSelectChimeraActivity;
    }

    public final void a(Object obj) {
        ContactSelectChimeraActivity contactSelectChimeraActivity = this.a;
        Integer num = (Integer) obj;
        contactSelectChimeraActivity.d.a(contactSelectChimeraActivity.e.b((Object) num), false);
        contactSelectChimeraActivity.a(num.intValue());
        contactSelectChimeraActivity.a((String) null, true);
    }
}
