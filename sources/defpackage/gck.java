package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse;
import com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;

/* renamed from: gck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gck implements gbs {
    private final Context a;

    public gck(Context context) {
        iva.a((Object) context);
        this.a = context;
    }

    public final CheckFactoryResetPolicyComplianceResponse a(CheckFactoryResetPolicyComplianceRequest checkFactoryResetPolicyComplianceRequest) {
        return (CheckFactoryResetPolicyComplianceResponse) a((gcj) new gca(checkFactoryResetPolicyComplianceRequest));
    }

    public final void b() {
        a((gcj) new gcd());
    }

    public final TokenResponse a(AccountSignInRequest accountSignInRequest) {
        return (TokenResponse) a((gcj) new gbv(accountSignInRequest));
    }

    public final TokenResponse a(ConfirmCredentialsRequest confirmCredentialsRequest) {
        return (TokenResponse) a((gcj) new gbw(confirmCredentialsRequest));
    }

    public final TokenResponse a(TokenRequest tokenRequest) {
        iva.a((Object) tokenRequest, (Object) "TokenRequest cannot be null!");
        Bundle b = tokenRequest.b();
        b.putLong("gads_service_connection_start_time_millis", SystemClock.elapsedRealtime());
        tokenRequest.a(b);
        return (TokenResponse) a((gcj) new gbu(tokenRequest));
    }

    public final TokenResponse a(UpdateCredentialsRequest updateCredentialsRequest) {
        return (TokenResponse) a((gcj) new gbx(updateCredentialsRequest));
    }

    public final Object a(gcj gcj) {
        hwz hwz;
        itc a2;
        gcq gcq;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            hwz = new hwz();
            a2 = itc.a(this.a);
            if (a2.a("com.google.android.gms.auth.DATA_PROXY", (ServiceConnection) hwz, "GoogleAccountDataServiceClient")) {
                try {
                    IBinder a3 = hwz.a();
                    if (a3 != null) {
                        IInterface queryLocalInterface = a3.queryLocalInterface("com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService");
                        gcq = !(queryLocalInterface instanceof gcq) ? new gco(a3) : (gcq) queryLocalInterface;
                    } else {
                        gcq = null;
                    }
                    Object a4 = gcj.a(gcq);
                    a2.a("com.google.android.gms.auth.DATA_PROXY", (ServiceConnection) hwz);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return a4;
                } catch (InterruptedException e) {
                    Log.w("GoogleAccountDataServiceClient", "[GoogleAccountDataServiceClient] Interrupted when getting service.", e);
                    a2.a("com.google.android.gms.auth.DATA_PROXY", (ServiceConnection) hwz);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return null;
                } catch (RemoteException e2) {
                    Log.w("GoogleAccountDataServiceClient", "[GoogleAccountDataServiceClient] RemoteException when executing call.", e2);
                    a2.a("com.google.android.gms.auth.DATA_PROXY", (ServiceConnection) hwz);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return null;
                }
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return null;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public final String a(String str) {
        return (String) a((gcj) new gch(str));
    }

    @Deprecated
    public final void a() {
        a((gcj) new gcb());
    }
}
