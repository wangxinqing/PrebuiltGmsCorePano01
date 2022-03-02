package com.google.android.places.signals;

import android.content.Context;
import android.content.Intent;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SignalManager$GeofenceBroadcastReceiver extends nla {
    final /* synthetic */ akyn a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignalManager$GeofenceBroadcastReceiver(akyn akyn) {
        super("places");
        this.a = akyn;
    }

    public final void a(Context context, Intent intent) {
        if ("com.google.android.places.action.SIGNAL_MANAGER_GEOFENCE_RESULT".equals(intent.getAction())) {
            akyn akyn = this.a;
            int[] iArr = akyn.a;
            akyn.r++;
            rdu a2 = rdu.a(intent);
            if (akyn.c()) {
                List list = akyn.e;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((akyl) list.get(i)).a(a2);
                }
            }
        }
    }
}
