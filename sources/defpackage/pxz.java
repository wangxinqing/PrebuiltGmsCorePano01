package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.accounts.api.AccountData;

/* renamed from: pxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxz {
    static final pxy a = new pxy();
    public static final /* synthetic */ int b = 0;

    static {
        new pya(a);
    }

    public static void a(Context context, Intent intent, AccountData accountData) {
        String str;
        iva.a((Object) context, (Object) "Context must not be null.");
        iva.a((Object) intent, (Object) "Intent must not be null.");
        iva.a((Object) accountData, (Object) "Account data must not be null.");
        ComponentName component = intent.getComponent();
        if (component != null) {
            str = component.getPackageName();
        } else {
            str = intent.getPackage();
        }
        if (str != null) {
            iva.a((Object) context, (Object) "Context must not be null.");
            iva.a(str, (Object) "Package name must not be empty.");
            if (hya.a(context).b(str)) {
                ivy.a((SafeParcelable) accountData, intent, "com.google.android.gms.accounts.ACCOUNT_DATA");
            }
        }
    }
}
