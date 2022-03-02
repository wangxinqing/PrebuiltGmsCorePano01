package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: vwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class vwz {
    public final Context a;
    public BroadcastReceiver b;

    public vwz(Context context) {
        this.a = context;
    }

    public abstract boolean a();

    public abstract IntentFilter b();
}
