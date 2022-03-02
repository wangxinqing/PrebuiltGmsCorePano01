package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.invites.Contact;
import com.google.android.gms.family.invites.SendInvitationsChimeraActivity;

/* renamed from: mha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mha implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ Contact a;
    final /* synthetic */ boolean b;
    final /* synthetic */ SendInvitationsChimeraActivity c;

    public mha(SendInvitationsChimeraActivity sendInvitationsChimeraActivity, Contact contact, boolean z) {
        this.c = sendInvitationsChimeraActivity;
        this.a = contact;
        this.b = z;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        SendInvitationsChimeraActivity sendInvitationsChimeraActivity = this.c;
        return new mhf(sendInvitationsChimeraActivity, sendInvitationsChimeraActivity.g, sendInvitationsChimeraActivity.f, this.a, this.b, sendInvitationsChimeraActivity.b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        SendInvitationsChimeraActivity sendInvitationsChimeraActivity;
        Contact contact;
        boolean z;
        apkw apkw = (apkw) obj;
        if (this.b) {
            sendInvitationsChimeraActivity = this.c;
            contact = this.a;
            z = true;
        } else {
            sendInvitationsChimeraActivity = this.c;
            contact = this.a;
            z = false;
        }
        sendInvitationsChimeraActivity.a(contact, z);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
