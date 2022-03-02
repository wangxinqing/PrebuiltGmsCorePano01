package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;

/* renamed from: arza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class arza {
    public static Intent a(Context context) {
        return b(context).setAction("com.google.android.gms.nearby.discovery.ACTION_LIST_ACTIVITY_AUTO_REFRESH");
    }

    public static Intent b(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.nearby.discovery.service.DiscoveryService");
    }

    public static Intent a(Context context, asom asom) {
        return b(context).setAction("com.google.android.gms.nearby.discovery.ACTION_LOG_EVENT").putExtra("com.google.android.gms.nearby.discovery.EXTRA_LOG_EVENT", asom.bt);
    }

    public static Intent a(Context context, asom asom, String str, avbh avbh, String str2, byte[] bArr, Parcelable parcelable) {
        Intent b = b(context);
        if (parcelable instanceof Intent) {
            b.setAction("com.google.android.gms.nearby.discovery.ACTION_LOG_SLICE_AND_LAUNCH_INTENT").putExtra("com.google.android.gms.nearby.discovery.EXTRA_INTENT", parcelable);
        } else {
            b.setAction("com.google.android.gms.nearby.discovery.ACTION_LOG_SLICE_AND_SEND_PENDING_INTENT").putExtra("com.google.android.gms.nearby.discovery.EXTRA_PENDING_INTENT", parcelable);
        }
        return b.putExtra("com.google.android.gms.nearby.discovery.EXTRA_LOG_EVENT", asom.bt).putExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP", str).putExtra("com.google.android.gms.nearby.discovery:EXTRA_ENTRY_POINT", avbh.e).putExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS", str2).putExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY", bArr);
    }

    public static Intent a(Context context, String str, String str2, long j, int i, Throwable th) {
        Intent putExtra = b(context).setAction("com.google.android.gms.nearby.discovery.ACTION_FOOTPRINTS_ANALYTICS").putExtra("com.google.android.gms.nearby.discovery.EXTRA_TRIGGER_ID", str).putExtra("com.google.android.gms.nearby.discovery.EXTRA_BLE_ADDRESS", str2).putExtra("com.google.android.gms.nearby.discovery.EXTRA_DURATION_MILLIS", j).putExtra("com.google.android.gms.nearby.discovery.EXTRA_NUMBER_DEVICES", i);
        if (th != null) {
            putExtra.putExtra("com.google.android.gms.nearby.discovery.EXTRA_UPLOAD_FAIL_REASON", th);
        }
        return putExtra;
    }
}
