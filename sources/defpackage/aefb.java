package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothProfile;
import com.google.android.libraries.bluetooth.fastpair.ConnectException;
import java.util.concurrent.TimeUnit;

/* renamed from: aefb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aefb implements AutoCloseable {
    public final BluetoothProfile a;
    final /* synthetic */ aefi b;
    private final BluetoothAdapter c = BluetoothAdapter.getDefaultAdapter();
    private final aefu d;

    public aefb(aefi aefi, aefu aefu) {
        this.b = aefi;
        this.d = aefu;
        int i = aefu.a;
        aosh f = aosh.f();
        if (this.c.getProfileProxy(this.b.a, new aefa(f), aefu.a)) {
            this.a = (BluetoothProfile) f.get((long) this.b.b.C(), TimeUnit.SECONDS);
            return;
        }
        throw new ConnectException(3, "getProfileProxy failed immediately", new Object[0]);
    }

    public final void close() {
        aeij aeij = this.b.f;
        String valueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("Close profile: ");
        sb.append(valueOf);
        aeih aeih = new aeih(aeij, sb.toString());
        try {
            this.c.closeProfileProxy(this.d.a, this.a);
            aeih.close();
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
