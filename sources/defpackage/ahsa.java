package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import org.chromium.net.UrlRequest;

/* renamed from: ahsa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahsa extends ahuo {
    protected final ahrz a = new ahrz(this);
    protected final Context b;

    public ahsa(Context context, ahsr ahsr, ahss ahss, ajrh ajrh) {
        super(ahsr, ahss, ajrh);
        this.b = context;
    }

    public static int a(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 3;
            case 12:
                return 4;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return 2;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        ahrz ahrz = this.a;
        ahrz.a.b.unregisterReceiver(ahrz);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        ahrz ahrz = this.a;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        ahsa ahsa = ahrz.a;
        ahsa.b.registerReceiver(ahrz, intentFilter, (String) null, ahsa.h);
    }

    public final void a(aizo aizo, int i, long j) {
        String valueOf = String.valueOf(aizo.a());
        if (valueOf.length() == 0) {
            new String("adding new BluetoothDevice: ");
        } else {
            "adding new BluetoothDevice: ".concat(valueOf);
        }
        this.h.a.a(aizo, i, j);
    }
}
