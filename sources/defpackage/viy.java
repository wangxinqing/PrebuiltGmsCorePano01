package defpackage;

import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;

/* renamed from: viy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class viy implements aef {
    final /* synthetic */ ContactSelectChimeraActivity a;

    public viy(ContactSelectChimeraActivity contactSelectChimeraActivity) {
        this.a = contactSelectChimeraActivity;
    }

    public final boolean a(String str) {
        this.a.a(str, false);
        this.a.c.clearFocus();
        return true;
    }

    public final void b(String str) {
        ContactSelectChimeraActivity contactSelectChimeraActivity = this.a;
        Runnable runnable = contactSelectChimeraActivity.b;
        if (runnable != null) {
            contactSelectChimeraActivity.a.removeCallbacks(runnable);
        }
        this.a.b = new vix(this, str);
        ContactSelectChimeraActivity contactSelectChimeraActivity2 = this.a;
        contactSelectChimeraActivity2.a.postDelayed(contactSelectChimeraActivity2.b, 500);
    }
}
