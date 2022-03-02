package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsData;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsPayload;

/* renamed from: mma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mma implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ mmc a;

    public mma(mmc mmc) {
        this.a = mmc;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        apix apix;
        apix a2 = apix.a(this.a.getArguments().getInt("inviteeRole"));
        if (a2 != null) {
            apix = a2;
        } else {
            apix = apix.UNKNOWN_FAMILY_ROLE;
        }
        Activity activity = this.a.getActivity();
        String string = this.a.getArguments().getString("accountName");
        mfp k = this.a.a.k();
        Context context = this.a.getContext();
        adwq adwq = new adwq();
        adwq.b();
        adxa a3 = adws.a(context, adwq.a());
        mmc mmc = this.a;
        return new mmt(activity, string, k, a3, mmc.c, mmc.a.j(), apix);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mhg mhg = (mhg) obj;
        if (!mhg.b) {
            mfv.f("InvitationsPreconditionsFragment", "CanAddMemberLoader failure.", new Object[0]);
            this.a.a();
            return;
        }
        aphe aphe = (aphe) mhg.a;
        String valueOf = String.valueOf(aphe);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("CanAddMember response: ");
        sb.append(valueOf);
        sb.toString();
        ith ith = mfv.a;
        if (aphe.b.size() != 0 && aphe.b.size() == 1 && ((apku) aphe.c.a(Integer.valueOf(aphe.b.c(0)))) == apku.CVN_CHALLENGE_REQUIRED) {
            adxi adxi = new adxi(this.a.getActivity());
            adxi.a(axgd.c() ^ true ? 1 : 0);
            adxi.a(this.a.c);
            adxi.a(new Account(this.a.getArguments().getString("accountName"), "com.google"));
            adxi.a(new SecurePaymentsPayload(aphe.d.k(), new SecurePaymentsData[0]));
            Intent a2 = adxi.a();
            this.a.b.setVisibility(8);
            this.a.startActivityForResult(a2, 1);
            this.a.d = true;
        } else if (!aphe.a) {
            mfv.f("InvitationsPreconditionsFragment", "CanAddMember false without CVN Verification precondition", new Object[0]);
            this.a.a();
        } else {
            mmc mmc = this.a;
            mmc.a.a(mmc.getArguments().getInt("maxAvailableSlots"), this.a.getArguments().getInt("inviteeRole"));
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
