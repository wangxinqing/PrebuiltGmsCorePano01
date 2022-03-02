package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsData;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsPayload;

/* renamed from: mqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mqm implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ mqo a;

    public mqm(mqo mqo) {
        this.a = mqo;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.a.getActivity();
        mqo mqo = this.a;
        String str = mqo.a;
        mfp p = mqo.d.p();
        Context context = this.a.getContext();
        adwq adwq = new adwq();
        adwq.b();
        adxa a2 = adws.a(context, adwq.a());
        mqo mqo2 = this.a;
        WalletCustomTheme walletCustomTheme = mqo2.e;
        mfr w = mqo2.d.w();
        mqo mqo3 = this.a;
        return new mmu(activity, str, p, a2, walletCustomTheme, w, mqo3.b, mqo3.g);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mhg mhg = (mhg) obj;
        if (!mhg.b) {
            mfv.f("UpgradePreconditionsFragment", "CanUpgradeFamilyLoader failure.", new Object[0]);
            this.a.b();
            return;
        }
        aphm aphm = (aphm) mhg.a;
        String valueOf = String.valueOf(aphm);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("CanUpgradeFamily response: ");
        sb.append(valueOf);
        sb.toString();
        ith ith = mfv.a;
        this.a.a();
        if (aphm.c.size() != 0 && aphm.c.size() == 1 && ((apku) aphm.d.a(Integer.valueOf(aphm.c.c(0)))) == apku.CVN_CHALLENGE_REQUIRED) {
            adxi adxi = new adxi(this.a.getActivity());
            adxi.a(axgd.c() ^ true ? 1 : 0);
            adxi.a(this.a.e);
            adxi.a(new Account(this.a.a, "com.google"));
            adxi.a(new SecurePaymentsPayload(aphm.f.k(), new SecurePaymentsData[0]));
            this.a.startActivityForResult(adxi.a(), 1);
            this.a.f = true;
        } else if (!aphm.b) {
            mfv.f("UpgradePreconditionsFragment", "CanUpgradeFamily false without CVN Verification precondition", new Object[0]);
            mqn mqn = this.a.d;
            apkp apkp = ((aphm) mhg.a).e;
            if (apkp == null) {
                apkp = apkp.e;
            }
            mqn.a(new PageData(apkp));
        } else {
            mqo mqo = this.a;
            mqo.d.d(mqo.c);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
