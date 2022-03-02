package defpackage;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* renamed from: lvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class lvu extends IntentOperation {
    public void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.drivingmode.GEARHEAD_FRX_COMPLETED".equals(intent.getAction())) {
            lww.a();
            lww.h(getApplicationContext()).a.edit().putBoolean("gearhead_frx_completed", true).apply();
        }
    }
}
