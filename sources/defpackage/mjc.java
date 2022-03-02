package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity;
import com.google.android.gms.family.v2.model.UpgradeParams;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

/* renamed from: mjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mjc implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ FamilyCreationChimeraActivity a;
    private final boolean b;

    public mjc(FamilyCreationChimeraActivity familyCreationChimeraActivity, boolean z) {
        this.a = familyCreationChimeraActivity;
        this.b = z;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.a;
        String str = familyCreationChimeraActivity.a;
        mfp mfp = familyCreationChimeraActivity.s;
        adwq adwq = new adwq();
        adwq.b();
        adxa a2 = adws.a(familyCreationChimeraActivity, adwq.a());
        FamilyCreationChimeraActivity familyCreationChimeraActivity2 = this.a;
        int a3 = mfx.a(familyCreationChimeraActivity2.getIntent());
        WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
        walletCustomTheme.a = hdg.a(familyCreationChimeraActivity2, a3);
        FamilyCreationChimeraActivity familyCreationChimeraActivity3 = this.a;
        return new mlx(familyCreationChimeraActivity, str, mfp, a2, walletCustomTheme, familyCreationChimeraActivity3.b, familyCreationChimeraActivity3.d, familyCreationChimeraActivity3.t);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mhg mhg = (mhg) obj;
        if (mhg.b) {
            this.a.m = new UpgradeParams((apjr) mhg.a);
            if (!this.b) {
                this.a.r();
            } else if (!axfr.b()) {
                Context applicationContext = this.a.getApplicationContext();
                adwq adwq = new adwq();
                adwq.b();
                this.a.a(adws.a(applicationContext, adwq.a()));
            } else {
                this.a.s();
            }
        } else {
            this.a.r.a(3, 20);
            mfu.a(this.a, new mja(this, this.b), new mjb(this)).show();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
