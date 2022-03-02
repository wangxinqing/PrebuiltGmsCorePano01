package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.family.model.InvitationDataModel;

/* renamed from: mnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mnr implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ InvitationDataModel a;
    final /* synthetic */ mob b;

    public mnr(mob mob, InvitationDataModel invitationDataModel) {
        this.b = mob;
        this.a = invitationDataModel;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.b.getActivity();
        mob mob = this.b;
        return new mpm(activity, mob.d, mob.c.k(), this.b.c.j(), this.a.a);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.b.d();
        if (((Boolean) obj).booleanValue()) {
            akax.a(this.b.getView(), (int) R.string.fm_uninvite_success_message, 0).c();
            this.b.c.g();
            this.b.a();
        } else {
            this.b.g();
            this.b.a.setVisibility(0);
            akax.a(this.b.getView(), (int) R.string.fm_uninvite_failure_message, 0).c();
        }
        this.b.getActivity().getSupportLoaderManager().destroyLoader(3);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
