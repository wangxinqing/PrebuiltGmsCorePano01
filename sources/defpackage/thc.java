package defpackage;

import android.content.Context;
import android.net.nsd.NsdManager;

/* renamed from: thc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class thc {
    public final NsdManager a;

    public thc(Context context) {
        this.a = jkr.g() ? (NsdManager) context.getApplicationContext().getSystemService("servicediscovery") : null;
    }
}
