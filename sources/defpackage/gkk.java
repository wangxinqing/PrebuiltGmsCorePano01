package defpackage;

import android.accounts.Account;
import android.os.AsyncTask;
import com.google.android.gms.R;
import com.google.android.gms.auth.cryptauth.CryptauthPublicKey;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: gkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gkk extends AsyncTask {
    final /* synthetic */ SourceChimeraActivity a;

    public gkk(SourceChimeraActivity sourceChimeraActivity) {
        this.a = sourceChimeraActivity;
    }

    /* access modifiers changed from: protected */
    public final aqec[] a() {
        SourceChimeraActivity sourceChimeraActivity = this.a;
        iwd iwd = SourceChimeraActivity.a;
        aqec[] aqecArr = new aqec[sourceChimeraActivity.b.length];
        int i = 0;
        while (true) {
            Account[] accountArr = this.a.b;
            if (i >= accountArr.length) {
                return aqecArr;
            }
            String str = accountArr[i].name;
            aucd o = aqec.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqec aqec = (aqec) o.b;
            str.getClass();
            aqec.a |= 1;
            aqec.b = str;
            try {
                SourceChimeraActivity sourceChimeraActivity2 = this.a;
                auay a2 = auay.a(ausq.a(ausq.b(((CryptauthPublicKey) SourceChimeraActivity.a(sourceChimeraActivity2.p.a("PublicKey", sourceChimeraActivity2.b[i]))).b)));
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aqec aqec2 = (aqec) o.b;
                a2.getClass();
                aqec2.a |= 2;
                aqec2.c = a2;
                aqecArr[i] = (aqec) o.i();
                i++;
            } catch (InvalidKeySpecException e) {
                iwd iwd2 = SourceChimeraActivity.a;
                String valueOf = String.valueOf(str);
                iwd2.e(valueOf.length() == 0 ? new String("Could not get public key of user: ") : "Could not get public key of user: ".concat(valueOf), e, new Object[0]);
                return null;
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                iwd iwd3 = SourceChimeraActivity.a;
                String valueOf2 = String.valueOf(iwd.a((Object) str));
                iwd3.e(valueOf2.length() == 0 ? new String("Failed retrieve PublicKey for account: ") : "Failed retrieve PublicKey for account: ".concat(valueOf2), e2, new Object[0]);
                return null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return a();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        aqec[] aqecArr = (aqec[]) obj;
        if (aqecArr != null) {
            aqdw aqdw = (aqdw) aqdx.d.o();
            if (aqdw.c) {
                aqdw.c();
                aqdw.c = false;
            }
            aqdx aqdx = (aqdx) aqdw.b;
            aqdx.c = 1;
            aqdx.a |= 1;
            aqdw.a(Arrays.asList(aqecArr));
            aqdx aqdx2 = (aqdx) aqdw.i();
            aucd o = avov.c.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avov avov = (avov) o.b;
            aqdx2.getClass();
            avov.b = aqdx2;
            avov.a |= 1;
            avov avov2 = (avov) o.i();
            aucd o2 = gkt.h.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gkt.a((gkt) o2.b);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gkt gkt = (gkt) o2.b;
            avov2.getClass();
            gkt.d = avov2;
            gkt.a |= 8;
            String string = this.a.getString(R.string.auth_d2d_target_wait_progress_message);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gkt gkt2 = (gkt) o2.b;
            string.getClass();
            gkt2.a |= 2;
            gkt2.b = string;
            try {
                this.a.s.a((gkt) o2.i());
            } catch (IOException e) {
                SourceChimeraActivity.a.a((Throwable) e);
            }
            SourceChimeraActivity sourceChimeraActivity = this.a;
            iwd iwd = SourceChimeraActivity.a;
            sourceChimeraActivity.r = null;
            return;
        }
        SourceChimeraActivity sourceChimeraActivity2 = this.a;
        iwd iwd2 = SourceChimeraActivity.a;
        sourceChimeraActivity2.a((int) R.string.common_something_went_wrong);
    }
}
