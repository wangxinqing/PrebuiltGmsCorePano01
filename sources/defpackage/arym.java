package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

/* renamed from: arym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arym {
    public static Intent a(Context context, String str, byte[] bArr) {
        if (Build.VERSION.SDK_INT >= 29 && ((aymw.a.a().by() && aymz.b()) || !aymz.b())) {
            Intent intent = new Intent("com.android.settings.BLUETOOTH_DEVICE_DETAIL_SETTINGS");
            Bundle bundle = new Bundle();
            bundle.putString("device_address", str);
            intent.putExtra(":settings:show_fragment_args", bundle);
            return intent;
        } else if (!aymw.U()) {
            return null;
        } else {
            Intent a = aryn.a(context);
            a.setAction("com.google.android.gms.nearby.fastpair.GMSCORE_DEVICE_DETAILS");
            a.putExtra("account_key", bArr);
            return a;
        }
    }
}
