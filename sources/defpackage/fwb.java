package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Scope;

/* renamed from: fwb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fwb extends isy {
    public final GoogleSignInOptions a;

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof fwt) {
            return (fwt) queryLocalInterface;
        }
        return new fwr(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final int d() {
        return 12451000;
    }

    public final boolean h() {
        return true;
    }

    public final Intent i() {
        Context context = this.c;
        GoogleSignInOptions googleSignInOptions = this.a;
        fwh.a.b("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public fwb(Context context, Looper looper, ise ise, GoogleSignInOptions googleSignInOptions, ica ica, icb icb) {
        super(context, looper, 91, ise, ica, icb);
        fvt fvt;
        if (googleSignInOptions == null) {
            fvt = new fvt();
        } else {
            fvt = new fvt(googleSignInOptions);
        }
        fvt.b = qbw.a();
        if (!ise.c.isEmpty()) {
            for (Scope a2 : ise.c) {
                fvt.a(a2, new Scope[0]);
            }
        }
        this.a = fvt.a();
    }
}
