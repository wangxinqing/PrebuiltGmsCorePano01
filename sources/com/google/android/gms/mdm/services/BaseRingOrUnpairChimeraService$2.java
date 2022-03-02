package com.google.android.gms.mdm.services;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BaseRingOrUnpairChimeraService$2 extends nla {
    final /* synthetic */ smx a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseRingOrUnpairChimeraService$2(smx smx, String str) {
        super(str);
        this.a = smx;
    }

    public final void a(Context context, Intent intent) {
        if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction())) {
            smh.a(new avuj[]{avuj.SUCCESS}, this.a.g, snh.a(context), snh.a());
            this.a.stopSelf();
        }
    }
}
