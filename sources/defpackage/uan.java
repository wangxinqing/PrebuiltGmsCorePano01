package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: uan  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uan {
    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    private static final uam b = new uam((Intent) null, 0);
    private final Context c;

    public uan(Context context) {
        this.c = context;
    }

    public static Intent a(String str) {
        try {
            return Intent.parseUri(str, 1);
        } catch (URISyntaxException e) {
            ((anih) tsp.a.b()).a("Failed to parse action URL using intent scheme: %s", (Object) str);
            return null;
        }
    }

    private static boolean b(String str) {
        try {
            String scheme = new URI(str).getScheme();
            if (scheme != null) {
                return a.contains(scheme.toLowerCase(Locale.US));
            }
            return false;
        } catch (URISyntaxException e) {
            return false;
        }
    }

    private static Intent a(String str, BluetoothDevice bluetoothDevice, String str2, Context context) {
        Intent putExtra = DiscoveryChimeraService.a(context.getApplicationContext()).setAction("com.google.android.gms.nearby.discovery.ACTION_LAUNCH_WEB_URL_IN_BROWSER").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", str2).putExtra("com.google.android.gms.nearby.discovery.EXTRA_URL", str);
        a(putExtra, bluetoothDevice);
        return putExtra;
    }

    public static uam a(Context context, String str, String str2, Integer num, byte[] bArr, String str3, int i) {
        BluetoothDevice bluetoothDevice;
        int i2;
        BluetoothManager bluetoothManager;
        jjg jjg = tsp.a;
        if (str == null) {
            return b;
        }
        String str4 = null;
        if (str2 == null || (bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth")) == null) {
            bluetoothDevice = null;
        } else {
            try {
                bluetoothDevice = bluetoothManager.getAdapter().getRemoteDevice(str2);
            } catch (IllegalArgumentException e) {
                ((anih) tsp.a.b()).a("Invalid device address: %s", (Object) str2);
                bluetoothDevice = null;
            }
        }
        if (b(str)) {
            return new uam(a(str, bluetoothDevice, str3, context), 1);
        }
        Intent a2 = a(str);
        if (a2 == null || TextUtils.isEmpty(a2.getPackage())) {
            return b;
        }
        if (aymq.a.a().z() && !arxk.a(context, a2.getPackage()) && a2.getPackage() != null) {
            List c2 = amsk.a(".").c(a2.getPackage());
            Iterator<ApplicationInfo> it = context.getPackageManager().getInstalledApplications(128).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ApplicationInfo next = it.next();
                if (amsk.a(".").c(next.packageName).containsAll(c2)) {
                    ((anih) tsp.a.d()).a("%s not installed, but found similar alternative and replaced with %s", (Object) a2.getPackage(), (Object) next.packageName);
                    a2 = a2.setPackage(next.packageName);
                    break;
                }
            }
        }
        ((anih) tsp.a.d()).a("ActionUrlParser: intent type : %s", (Object) a2.toUri(1));
        PackageManager packageManager = context.getPackageManager();
        if (jir.a((Collection) packageManager.queryIntentActivities(a2, 64))) {
            i2 = jir.a((Collection) packageManager.queryIntentServices(a2, 64)) ? !jir.a((Collection) packageManager.queryBroadcastReceivers(a2, 64)) ? 6 : 0 : 5;
        } else {
            i2 = 2;
        }
        if (i2 != 0) {
            if (arze.a(context, a2.getPackage(), "android.permission.ACCESS_FINE_LOCATION")) {
                a(a2, bluetoothDevice);
                a(a2, num, bArr);
            } else if (aymq.a.a().g() && arze.a(context, a2.getPackage(), "android.permission.BLUETOOTH")) {
                a(a2, bluetoothDevice);
            }
            return new uam(a2, i2, a2.getPackage());
        }
        String stringExtra = a2.getStringExtra("browser_fallback_url");
        if (stringExtra == null || !b(stringExtra)) {
            stringExtra = null;
        }
        if (stringExtra != null) {
            return new uam(a(stringExtra, bluetoothDevice, str3, context), 3);
        }
        if (i - 1 < 700 || aymq.a.a().e()) {
            String str5 = a2.getPackage();
            if (a2.getData() != null) {
                a2.setComponent((ComponentName) null);
                a2.addCategory("android.intent.category.BROWSABLE");
                str4 = a2.getData().toString();
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", str5);
            if (str4 != null) {
                appendQueryParameter.appendQueryParameter("url", str4);
            }
            return new uam(new Intent("android.intent.action.VIEW", appendQueryParameter.build()), 4, a2.getPackage());
        } else if (!"com.google.android.googlequicksearchbox".equals(a2.getPackage()) || !"com.google.android.apps.gsa.bisto.MAGIC_PAIR".equals(a2.getAction())) {
            return b;
        } else {
            Intent intent = DiscoveryChimeraService.a(context).setAction("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR").setPackage(context.getPackageName());
            a(intent, bluetoothDevice);
            a(intent, num, bArr);
            return new uam(intent, 5, intent.getPackage());
        }
    }

    public static uam a(Context context, tzf tzf) {
        byte[] bArr;
        String str = tzf.h;
        String str2 = tzf.i;
        Integer valueOf = Integer.valueOf(tzf.c);
        if (!tzf.w.equals(auay.b)) {
            bArr = tzf.w.k();
        } else {
            bArr = null;
        }
        return a(context, str, str2, valueOf, bArr, tzf.b, 601);
    }

    static void a(Intent intent, BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null) {
            intent.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothDevice);
        }
    }

    private static void a(Intent intent, Integer num, byte[] bArr) {
        if (num != null) {
            intent.putExtra("android.bluetooth.device.extra.RSSI", num);
        }
        if (bArr != null) {
            intent.putExtra("com.google.android.gms.nearby.messages.ble.EXTRA_BLE_RECORD_BYTES", bArr);
        }
    }

    public final uam a(String str, ttg ttg) {
        Context context = this.c;
        String m = ttg.m();
        Integer u = ttg.u();
        byte[] v = ttg.v();
        String i = ttg.i();
        int b2 = avbj.b(ttg.s().b);
        return a(context, str, m, u, v, i, b2 == 0 ? 1 : b2);
    }
}
