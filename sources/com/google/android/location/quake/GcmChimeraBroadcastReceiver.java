package com.google.android.location.quake;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if (ayab.d()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (ajft.b != null) {
                ajgt ajgt = ajft.b.a.b;
                int i = ajgu.d;
                String str = ajgt.a.a;
                Bundle bundle = new Bundle();
                bundle.putLong("t", currentTimeMillis);
                Message obtainMessage = ajgt.obtainMessage(4);
                obtainMessage.setData(bundle);
                ajgt.sendMessage(obtainMessage);
            }
        }
    }
}
