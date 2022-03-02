package com.google.android.places;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlatformKeyManager$1 extends nla {
    final /* synthetic */ akif a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlatformKeyManager$1(akif akif, String str) {
        super(str);
        this.a = akif;
    }

    public final void a(Context context, Intent intent) {
        if ("com.google.android.places.PLATFORM_KEY_CHANGED_ACTION".equals(intent.getAction())) {
            akif akif = this.a;
            akif.a = akif.b();
            if (akif.a == null && Log.isLoggable("Places", 5)) {
                alfy.c("Places", "Failed to read platform key from disk after key changed broadcast.");
            }
        }
    }
}
