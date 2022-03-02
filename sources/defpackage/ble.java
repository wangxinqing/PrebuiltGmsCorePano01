package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: ble  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ble {
    public static Intent a(Context context, byte[] bArr, boj boj, String str) {
        Intent intent = new Intent("com.google.android.chimera.container.REQUESTED_FEATURES_CHANGED");
        intent.setPackage(context.getPackageName());
        bpx.a(intent, "progressListener", boj);
        if (bArr != null) {
            intent.putExtra("chimera.URGENTLY_REQUESTED_FEATURES", bArr);
        }
        if (str != null) {
            intent.putExtra("chimera.CLIENT_SESSION_ID", str);
        }
        return intent;
    }
}
