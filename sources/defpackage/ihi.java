package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.util.Log;
import java.util.Locale;

/* renamed from: ihi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ihi {
    public final Context a;

    public ihi(Context context) {
        this.a = context;
    }

    private static String a(int i) {
        int i2 = i - 1;
        if (i != 0) {
            return Integer.toString(i2);
        }
        throw null;
    }

    public final void a(boolean z, boolean z2, int i, int i2) {
        if (!z) {
            Log.e("BuildVerifier", String.format(Locale.US, "Incorrect Google Play Services build variant used, expected %s, but actual is %s", new Object[]{a(i), a(i2)}));
        } else if (!z2) {
            NotificationManager notificationManager = (NotificationManager) this.a.getSystemService("notification");
            String[] strArr = {"NOT_LMP", "NOT_MNC", "OLD_VARIANT", "BAD_VARIANT"};
            for (int i3 = 0; i3 < 4; i3++) {
                String str = strArr[i3];
                try {
                    notificationManager.cancel(str, 10436);
                    notificationManager.cancel(str, 39789);
                } catch (SecurityException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                    sb.append("Failure to cancel notifications: ");
                    sb.append(valueOf);
                    Log.w("BuildVerifier", sb.toString());
                }
            }
        } else {
            Log.w("BuildVerifier", String.format(Locale.US, "Old Google Play Services build variant used, expected %s, but actual is %s, should be fixed when it updates", new Object[]{a(i), a(i2)}));
            hxj.a.a(this.a, 2, "OLD_VARIANT");
        }
    }
}
