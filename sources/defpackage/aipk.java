package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aipk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aipk {
    public static void a(Intent intent, Context context) {
        a(intent, context, new ArrayList(), -1);
    }

    public static void a(Intent intent, Context context, List list, int i) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            aibo aibo = (aibo) list.get(i2);
            if (!(aibo == null || aibo.c == null)) {
                Location a = aips.a(new aiax(aibo, aibo));
                aibw aibw = aibo.b;
                if (aibw != null) {
                    a.setTime(aibw.d());
                }
                arrayList.add(a);
            }
        }
        Intent intent2 = new Intent();
        intent2.putParcelableArrayListExtra("com.google.android.location.internal.EXTRA_COMPUTE_WIFI_LOCATIONS_RESPONSE_PARCELABLE_ARRAY_LIST", arrayList);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("com.google.android.location.internal.EXTRA_COMPUTE_WIFI_LOCATIONS_RESPONSE");
        if (pendingIntent != null) {
            try {
                jjy.a(pendingIntent, context, i, intent2, (PendingIntent.OnFinished) null);
            } catch (PendingIntent.CanceledException e) {
            }
        }
    }
}
