package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.util.List;

/* renamed from: tzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tzb {
    public static int a = ((int) SystemClock.elapsedRealtime());
    public final Context b;

    public tzb(Context context) {
        this.b = context;
    }

    public static Intent a(Context context, Integer num, tzf tzf) {
        String a2;
        String a3;
        if (aymw.v()) {
            jjg jjg = tsp.a;
            uam a4 = uan.a(context, tzf);
            Intent intent = a4.a;
            intent.putExtra("com.google.android.gms.nearby.discovery.fastpair:EXTRA_NOTIFICATION_ID", num).putExtra("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ID", num).putExtra("com.google.android.gms.nearby.discovery.EXTRA_DISCOVERY_ITEM", tvq.a(tzf).k());
            if (!tzf.h.isEmpty() && (a3 = tvq.a(tzf.h)) != null) {
                intent.putExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP", a3);
            }
            return DiscoveryChimeraService.a(context).setPackage(context.getPackageName()).setAction("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_CLICKED").putExtra("com.google.android.gms.nearby.discovery:ACTION_FORWARDED_ACTION_URL", intent).putExtra("com.google.android.gms.nearby.discovery:ACTION_FORWARDED_ACTION_URL_TYPE", a4.b).putExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID", tzf.b).putExtra("com.google.android.gms.nearby.discovery:EXTRA_PRIVATE_BLE_ADDRESS", tzf.i);
        }
        jjg jjg2 = tsp.a;
        Intent putExtra = DiscoveryChimeraService.a(context).setAction("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR").putExtra("com.google.android.gms.nearby.discovery.fastpair:EXTRA_NOTIFICATION_ID", num).putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", Long.valueOf(tzf.b, 16)).putExtra("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ID", num).putExtra("com.google.android.gms.nearby.discovery.EXTRA_DISCOVERY_ITEM", tvq.a(tzf).k()).putExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID", tzf.b).putExtra("com.google.android.gms.nearby.discovery:EXTRA_PRIVATE_BLE_ADDRESS", tzf.i);
        if (!tzf.h.isEmpty() && (a2 = tvq.a(tzf.h)) != null) {
            putExtra.putExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP", a2);
        }
        return putExtra;
    }

    public static String b(Context context, tzf tzf) {
        List d = jgu.d(context, context.getPackageName());
        if (d.isEmpty()) {
            tzc tzc = tzf.m;
            if (tzc == null) {
                tzc = tzc.d;
            }
            return tzc.c;
        }
        tzc tzc2 = tzf.m;
        if (tzc2 == null) {
            tzc2 = tzc.d;
        }
        if (!tzc2.b.contains("%s")) {
            tzc tzc3 = tzf.m;
            if (tzc3 == null) {
                tzc3 = tzc.d;
            }
            return tzc3.b;
        }
        tzc tzc4 = tzf.m;
        if (tzc4 == null) {
            tzc4 = tzc.d;
        }
        return String.format(tzc4.b, new Object[]{((Account) d.get(0)).name});
    }

    public static Bitmap a(Context context, tzf tzf) {
        if ((tzf.a & 8) != 0) {
            try {
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(tzf.e.k(), 0, tzf.e.a());
                if (aryg.a(decodeByteArray)) {
                    return aryg.a(context, decodeByteArray);
                }
            } catch (OutOfMemoryError e) {
                anih anih = (anih) tsp.a.c();
                anih.a((Throwable) e);
                anih.a("Failed to decode icon, returning null.");
            }
        }
        return null;
    }
}
