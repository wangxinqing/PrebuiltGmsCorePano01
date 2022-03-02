package com.google.android.gms.mdm.services;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MdmPhoneWearableListenerChimeraService extends adze {
    public final void a(MessageEventParcelable messageEventParcelable) {
        if (messageEventParcelable.b.equals("com.google.android.gms.mdm.ACTION_RING")) {
            ihs b = ihs.b();
            String str = messageEventParcelable.d;
            int i = RingChimeraService.o;
            Intent a = aann.a((Context) b, "com.google.android.gms.mdm.services.RingService");
            a.putExtra("remote", false);
            a.putExtra("requestorNodeId", str);
            acrm.c(b, a);
        } else if (messageEventParcelable.b.equals("com.google.android.gms.mdm.ACTION_CANCEL_RING")) {
            smx.a((Context) ihs.b());
        }
    }
}
