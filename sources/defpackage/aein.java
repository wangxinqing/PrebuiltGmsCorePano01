package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Result;
import com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Step;

/* renamed from: aein  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aein {
    static void a(Context context, String str) {
        if (a(context)) {
            ((anih) ((anih) aehd.a.d()).a("aein", "a", 48, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Send device name (%s) to validator", (Object) str);
            context.sendBroadcast(new Intent("com.google.android.libraries.bluetooth.fastpair.action.GET_DEVICE_NAME").setPackage("com.google.location.nearby.apps.fastpair.validator").putExtra("com.google.android.gms.nearby.discovery.DEVICE_NAME", str));
            return;
        }
        anil anil = aehd.a;
    }

    public static void a(Context context, String str, BroadcastConstants$Step broadcastConstants$Step, BroadcastConstants$Result broadcastConstants$Result) {
        if (a(context)) {
            ((anih) ((anih) aehd.a.d()).a("aein", "a", 31, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Send pair progress to validator, bleAddress=%s, step=%s, result=%s", (Object) str, (Object) broadcastConstants$Step, (Object) broadcastConstants$Result);
            context.sendBroadcast(new Intent("com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_PAIR_PROGRESS").setPackage("com.google.location.nearby.apps.fastpair.validator").putExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS", str).putExtra("com.google.android.gms.nearby.discovery.EXTRA_STEP", broadcastConstants$Step).putExtra("com.google.android.gms.nearby.discovery.EXTRA_RESULT", broadcastConstants$Result));
            return;
        }
        anil anil = aehd.a;
    }

    public static void a(Context context, String str, boolean z) {
        if (a(context)) {
            ((anih) ((anih) aehd.a.d()).a("aein", "a", 76, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Send silent mode to validator");
            context.sendBroadcast(new Intent("com.google.android.libraries.bluetooth.fastpair.action.SILENT_STATE_CHANGE").setPackage("com.google.location.nearby.apps.fastpair.validator").putExtra("com.google.android.gms.nearby.discovery.PUBLIC_ADDRESS", str).putExtra("com.google.android.gms.nearby.discovery.EXTRA_SILENT_STATE", z));
            return;
        }
        anil anil = aehd.a;
    }

    static void a(Context context, byte[] bArr) {
        if (a(context)) {
            ((anih) ((anih) aehd.a.d()).a("aein", "a", 62, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Send account key to validator");
            context.sendBroadcast(new Intent("com.google.android.libraries.bluetooth.fastpair.action.SEND_ACCOUNT_KEY").setPackage("com.google.location.nearby.apps.fastpair.validator").putExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY", bArr));
            return;
        }
        anil anil = aehd.a;
    }

    public static boolean a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.google.location.nearby.apps.fastpair.validator", 0).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            anil anil = aehd.a;
            return false;
        }
    }
}
