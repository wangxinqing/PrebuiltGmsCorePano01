package defpackage;

import android.hardware.TriggerEvent;
import android.hardware.TriggerEventListener;

/* renamed from: ajbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajbq extends TriggerEventListener {
    private final ajbp a;

    public ajbq(ajbg ajbg, ajbr ajbr) {
        this.a = new ajbp(ajbg, ajbr);
    }

    public final void onTrigger(TriggerEvent triggerEvent) {
        this.a.a();
    }
}
