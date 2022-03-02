package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.AsyncTask;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse;

/* renamed from: gly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gly extends AsyncTask {
    private static final iwd a = ehv.a("FrpUnlockTask");
    private final glh b;
    private final gck c;
    private final gfi d;
    private final String e;

    public gly(glh glh, gfi gfi, gck gck, String str) {
        this.b = glh;
        this.d = gfi;
        this.c = gck;
        this.e = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (!this.d.a()) {
            a.d("FRP not required. Device was not locked.", new Object[0]);
            return new glx(1, 0);
        }
        CheckFactoryResetPolicyComplianceResponse a2 = this.c.a(CheckFactoryResetPolicyComplianceRequest.a(this.e));
        int i = a2.c;
        if (i != 1) {
            return new glx(0, i);
        }
        this.c.a();
        this.c.b();
        return new glx(2, a2.c);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        glx glx = (glx) obj;
        glh glh = this.b;
        int i = glx.a;
        if (i == 1) {
            ((glg) glh).a();
        } else if (i == 2) {
            ((glg) glh).deliverResult(new gli(3, (Account) null, (Intent) null, (String) null, false, (String) null, glx.b));
        } else {
            ((glg) glh).deliverResult(new gli(2, (Account) null, (Intent) null, (String) null, false, (String) null, glx.b));
        }
    }
}
