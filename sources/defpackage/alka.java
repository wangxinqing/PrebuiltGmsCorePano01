package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import java.util.function.BiConsumer;

/* renamed from: alka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class alka implements BiConsumer {
    private final Context a;
    private final BroadcastReceiver b;

    public alka(Context context, BroadcastReceiver broadcastReceiver) {
        this.a = context;
        this.b = broadcastReceiver;
    }

    public final void accept(Object obj, Object obj2) {
        Void voidR = (Void) obj;
        Throwable th = (Throwable) obj2;
        this.a.unregisterReceiver(this.b);
    }
}
