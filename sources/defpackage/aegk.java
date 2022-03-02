package defpackage;

import android.bluetooth.BluetoothDevice;
import com.google.android.libraries.bluetooth.fastpair.AutoValue_Event;
import com.google.android.libraries.bluetooth.fastpair.Event;

/* renamed from: aegk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aegk {
    public Short a;
    public BluetoothDevice b;
    public Exception c;
    private aspb d;
    private Long e;

    public final Event a() {
        String str = this.d == null ? " eventCode" : "";
        if (this.e == null) {
            str = str.concat(" timestamp");
        }
        if (str.isEmpty()) {
            return new AutoValue_Event(this.d, this.e.longValue(), this.a, this.b, this.c);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void a(long j) {
        this.e = Long.valueOf(j);
    }

    public final void a(aspb aspb) {
        if (aspb != null) {
            this.d = aspb;
            return;
        }
        throw new NullPointerException("Null eventCode");
    }
}
