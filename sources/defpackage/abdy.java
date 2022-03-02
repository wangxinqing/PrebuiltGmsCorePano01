package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: abdy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abdy extends isy implements abag {
    public final ise a;
    private final boolean u;
    private final Bundle v;
    private final Integer w;

    public static Bundle a(ise ise) {
        abai abai = ise.g;
        Integer num = ise.h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", ise.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (abai != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", abai.b);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", abai.c);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", abai.d);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", abai.e);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", abai.f);
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", abai.g);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", abai.h);
            Long l = abai.i;
            if (l != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", l.longValue());
            }
            Long l2 = abai.j;
            if (l2 != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", l2.longValue());
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.signin.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final int d() {
        return 12451000;
    }

    public final void e() {
        a((irr) new iru(this));
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        if (!this.c.getPackageName().equals(this.a.e)) {
            this.v.putString("com.google.android.gms.signin.internal.realClientPackageName", this.a.e);
        }
        return this.v;
    }

    public final boolean g() {
        return this.u;
    }

    public abdy(Context context, Looper looper, boolean z, ise ise, Bundle bundle, ica ica, icb icb) {
        super(context, looper, 44, ise, ica, icb);
        this.u = z;
        this.a = ise;
        this.v = bundle;
        this.w = ise.h;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof abdu) {
            return (abdu) queryLocalInterface;
        }
        return new abds(iBinder);
    }

    public final void a() {
        try {
            ((abdu) x()).a(this.w.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final void a(abdr abdr) {
        GoogleSignInAccount googleSignInAccount;
        iva.a((Object) abdr, (Object) "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.a.b();
            if ("<<default account>>".equals(b.name)) {
                googleSignInAccount = fww.a(this.c).a();
            } else {
                googleSignInAccount = null;
            }
            ((abdu) x()).a(new SignInRequest(1, new ResolveAccountRequest(2, b, this.w.intValue(), googleSignInAccount)), abdr);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                abdr.a(new SignInResponse());
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public final void a(itm itm, boolean z) {
        try {
            ((abdu) x()).a(itm, this.w.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }
}
