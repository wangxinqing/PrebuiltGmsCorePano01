package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.gms.auth.uiflows.addaccount.CheckinReceiver;

/* renamed from: gln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gln extends Loader implements glo {
    private static final iwd a = ehv.a("CheckinLoader");
    private boolean b;
    private final CheckinReceiver c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gln(Context context) {
        super(context);
        CheckinReceiver checkinReceiver = new CheckinReceiver(ihs.b());
        this.c = checkinReceiver;
    }

    public final void a(boolean z) {
        this.c.a();
        Bundle bundle = new Bundle();
        bundle.putBoolean("checkin_loader_result", z);
        deliverResult(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        this.c.a();
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        if (!this.b) {
            this.b = true;
            if (jhg.a(getContext()) != 0) {
                a.b("Checkin already completed.", new Object[0]);
                a(true);
                return;
            }
            CheckinReceiver checkinReceiver = this.c;
            synchronized (checkinReceiver.c) {
                if (!checkinReceiver.d) {
                    checkinReceiver.a = this;
                    checkinReceiver.b.registerReceiver(checkinReceiver, new IntentFilter("com.google.android.checkin.CHECKIN_COMPLETE"));
                    checkinReceiver.d = true;
                }
            }
            a.b("Broadcasting to checkin.", new Object[0]);
            getContext().sendBroadcast(new Intent("android.server.checkin.CHECKIN_NOW").setPackage("com.google.android.gms"));
        }
    }
}
