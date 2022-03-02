package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.contextmanager.producer.module.BroadcastReceiverProducer$InternalBroadcastReceiver;

/* renamed from: ccy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ccy extends ccv {
    private final BroadcastReceiverProducer$InternalBroadcastReceiver b;
    public final boolean j;

    public ccy(Context context, bsz bsz, ccj ccj, String str, but but) {
        this(context, bsz, ccj, str, but, true);
    }

    public abstract void a(Context context, Intent intent);

    /* access modifiers changed from: protected */
    public abstract IntentFilter c();

    public boolean e() {
        if (!super.e()) {
            return false;
        }
        IntentFilter c = c();
        if (c == null) {
            return true;
        }
        this.d.registerReceiver(this.b, c);
        return true;
    }

    public void f() {
        try {
            this.d.unregisterReceiver(this.b);
        } catch (IllegalArgumentException e) {
        }
        super.f();
    }

    public ccy(Context context, bsz bsz, ccj ccj, String str, but but, boolean z) {
        super(context, bsz, ccj, str, but);
        this.b = new BroadcastReceiverProducer$InternalBroadcastReceiver(this);
        this.j = z;
    }
}
