package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import android.provider.Settings;

/* renamed from: adtl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adtl {
    public static void a(Context context, boolean z) {
        long serialNumberForUser = ((UserManager) context.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle());
        Intent className = new Intent("com.google.android.gms.usagereporting.update_optin.ACTION").setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsIntentOperationService$PersistentInternalReceiver");
        className.putExtra("SOURCE_SERIAL_ID", serialNumberForUser);
        className.putExtra("SOURCE_USER", UserHandle.myUserId());
        className.putExtra("OPT_VALUE", z);
        if (jkr.c()) {
            context.sendBroadcastAsUser(className, UserHandle.of(0));
            return;
        }
        Parcel obtain = Parcel.obtain();
        obtain.writeInt(0);
        obtain.setDataPosition(0);
        context.sendBroadcastAsUser(className, UserHandle.readFromParcel(obtain));
    }

    public static boolean a() {
        int i = Build.VERSION.SDK_INT;
        return Process.myUserHandle().isOwner();
    }

    public static boolean a(Context context) {
        try {
            if (!azuf.d()) {
                return Settings.Global.getInt(context.getContentResolver(), "multi_cb") == 1;
            }
            int c = adtm.a().c();
            return c != 0 && Settings.Global.getInt(context.getContentResolver(), "multi_cb") == c;
        } catch (Settings.SettingNotFoundException e) {
            return false;
        }
    }
}
