package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* renamed from: qyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qyg {
    private static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    public static Intent a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("serviceActionBundleKey", str);
        try {
            Bundle call = context.getContentResolver().call(a, "serviceIntentCall", (String) null, bundle);
            if (call == null) {
                String valueOf = String.valueOf(str);
                Log.e("BoundServiceResolver", valueOf.length() == 0 ? new String("Bound service resolution failed: ") : "Bound service resolution failed: ".concat(valueOf));
                return null;
            }
            Intent intent = (Intent) call.getParcelable("serviceResponseIntentKey");
            if (intent != null) {
                return intent;
            }
            String valueOf2 = String.valueOf(str);
            Log.e("BoundServiceResolver", valueOf2.length() == 0 ? new String("Bound service not found for action: ") : "Bound service not found for action: ".concat(valueOf2));
            return null;
        } catch (IllegalArgumentException e) {
            String valueOf3 = String.valueOf(str);
            Log.e("BoundServiceResolver", valueOf3.length() == 0 ? new String("Bound service resolution failed: ") : "Bound service resolution failed: ".concat(valueOf3), e);
            return null;
        }
    }
}
