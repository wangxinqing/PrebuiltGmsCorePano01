package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.invites.Contact;
import com.google.android.gms.family.invites.SendInvitationsChimeraActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mhb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mhb implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ SendInvitationsChimeraActivity a;
    private final String b;
    private final List c;

    public mhb(SendInvitationsChimeraActivity sendInvitationsChimeraActivity, String str, List list) {
        this.a = sendInvitationsChimeraActivity;
        this.b = str;
        this.c = list;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        SendInvitationsChimeraActivity sendInvitationsChimeraActivity = this.a;
        return new mgv(sendInvitationsChimeraActivity, sendInvitationsChimeraActivity.g, sendInvitationsChimeraActivity.f, this.b, this.c, sendInvitationsChimeraActivity.b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mhg mhg = (mhg) obj;
        if (mhg.b) {
            SendInvitationsChimeraActivity sendInvitationsChimeraActivity = this.a;
            sendInvitationsChimeraActivity.c = (ArrayList) mhg.a;
            ArrayList arrayList = sendInvitationsChimeraActivity.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (((Contact) arrayList.get(i)).j != 16) {
                    i = i2;
                } else {
                    this.a.f();
                    return;
                }
            }
            this.a.a(-1, 0);
            return;
        }
        ArrayList arrayList2 = this.a.c;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Contact) arrayList2.get(i3)).j = 16;
        }
        this.a.f();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
