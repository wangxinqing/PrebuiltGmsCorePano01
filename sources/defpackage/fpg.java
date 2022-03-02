package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: fpg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fpg implements amqy {
    private final fpl a;
    private final boolean b;
    private final InternalCredentialWrapper c;

    public fpg(fpl fpl, boolean z, InternalCredentialWrapper internalCredentialWrapper) {
        this.a = fpl;
        this.b = z;
        this.c = internalCredentialWrapper;
    }

    public final Object a(Object obj) {
        fpl fpl = this.a;
        boolean z = this.b;
        InternalCredentialWrapper internalCredentialWrapper = this.c;
        Credential credential = (Credential) obj;
        if (!z) {
            Context context = fpl.a;
            Credential credential2 = internalCredentialWrapper.a;
            String str = fpl.e;
            Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.api.credentials.ui.AutoSignInSnackbarService");
            className.putExtra("log_session_id", str);
            ivy.a((SafeParcelable) credential2, className, "com.google.android.gms.credentials.Credential");
            context.startService(className);
        } else {
            Context context2 = fpl.a;
            Credential credential3 = internalCredentialWrapper.a;
            String str2 = fpl.e;
            Intent className2 = new Intent().setClassName(context2, "com.google.android.gms.auth.api.credentials.ui.AutoSignInWarmWelcomeService");
            className2.putExtra("log_session_id", str2);
            ivy.a((SafeParcelable) credential3, className2, "com.google.android.gms.credentials.Credential");
            context2.startService(className2);
        }
        return credential;
    }
}
