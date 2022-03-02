package defpackage;

import android.os.AsyncTask;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest;
import com.google.android.gms.auth.frp.FrpInterstitialChimeraActivity;

/* renamed from: gfj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gfj extends AsyncTask {
    final /* synthetic */ FrpInterstitialChimeraActivity a;

    public gfj(FrpInterstitialChimeraActivity frpInterstitialChimeraActivity) {
        this.a = frpInterstitialChimeraActivity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        gck gck = new gck(this.a);
        boolean z = gck.a(CheckFactoryResetPolicyComplianceRequest.a(this.a.a)).b;
        if (z) {
            gck.a();
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.a.setResult(!((Boolean) obj).booleanValue() ? 0 : -1);
        this.a.finish();
    }
}
