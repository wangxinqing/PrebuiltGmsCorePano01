package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse;
import com.google.android.gms.auth.firstparty.dataservice.ValidateAccountCredentialsResponse;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.auth.frp.UnlockFactoryResetProtectionRequest;
import com.google.android.gms.auth.frp.UnlockFactoryResetProtectionResponse;

/* renamed from: gfo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gfo extends bhw implements gfp {
    private final fyq a;
    private final gck b;
    private final Context c;
    private final qub d;
    private final eli e;

    public gfo() {
        super("com.google.android.gms.auth.frp.IFrpService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        AccountCredentials accountCredentials;
        UnlockFactoryResetProtectionResponse unlockFactoryResetProtectionResponse;
        String str;
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                int i3 = 0;
                if (i == 3) {
                    UnlockFactoryResetProtectionRequest unlockFactoryResetProtectionRequest = (UnlockFactoryResetProtectionRequest) bhx.a(parcel, UnlockFactoryResetProtectionRequest.CREATOR);
                    this.a.b(Binder.getCallingUid());
                    if (!TextUtils.isEmpty(unlockFactoryResetProtectionRequest.d)) {
                        accountCredentials = new AccountCredentials(unlockFactoryResetProtectionRequest.d);
                    } else {
                        accountCredentials = new AccountCredentials("com.google");
                    }
                    accountCredentials.c = unlockFactoryResetProtectionRequest.b;
                    accountCredentials.f = unlockFactoryResetProtectionRequest.c;
                    ValidateAccountCredentialsResponse validateAccountCredentialsResponse = (ValidateAccountCredentialsResponse) this.b.a((gcj) new gcf(accountCredentials));
                    int i4 = validateAccountCredentialsResponse.b;
                    if (i4 != 0 || (str = validateAccountCredentialsResponse.c) == null) {
                        if (i4 != 2) {
                            i2 = i4 != 3 ? 1 : 3;
                        }
                        unlockFactoryResetProtectionResponse = new UnlockFactoryResetProtectionResponse(i2);
                    } else {
                        CheckFactoryResetPolicyComplianceResponse a2 = this.b.a(CheckFactoryResetPolicyComplianceRequest.a(str));
                        if (a2.b) {
                            this.b.a();
                        }
                        if (!a2.b) {
                            i3 = 4;
                        }
                        unlockFactoryResetProtectionResponse = new UnlockFactoryResetProtectionResponse(i3);
                    }
                    parcel2.writeNoException();
                    bhx.b(parcel2, unlockFactoryResetProtectionResponse);
                } else if (i != 5) {
                    return false;
                } else {
                    FrpSnapshot d2 = d();
                    parcel2.writeNoException();
                    bhx.b(parcel2, d2);
                }
            } else {
                boolean c2 = c();
                parcel2.writeNoException();
                bhx.a(parcel2, c2);
            }
        } else {
            boolean b2 = b();
            parcel2.writeNoException();
            bhx.a(parcel2, b2);
        }
        return true;
    }

    public final boolean b() {
        if (elj.a(this.c) || this.d.a("com.google").length > 0) {
            return false;
        }
        if (this.e.f() == null) {
            return this.e.b().c;
        }
        if (!this.e.d()) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        return this.e.a();
    }

    public final FrpSnapshot d() {
        return this.e.b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gfo(Context context) {
        super("com.google.android.gms.auth.frp.IFrpService");
        fyq fyq = new fyq(new fyk(context));
        gck gck = new gck(context);
        qub a2 = qub.a(context);
        eli a3 = eli.a(context);
        iva.a((Object) context);
        this.c = context;
        iva.a((Object) fyq);
        this.a = fyq;
        iva.a((Object) gck);
        this.b = gck;
        iva.a((Object) a2);
        this.d = a2;
        iva.a((Object) a3);
        this.e = a3;
    }
}
