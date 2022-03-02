package defpackage;

import android.bluetooth.BluetoothSocket;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gkq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gkq {
    public static final iwd a = new iwd("D2D", "BluetoothConnection");
    public final DataInputStream b = new DataInputStream(this.f.getInputStream());
    public final DataOutputStream c = new DataOutputStream(new BufferedOutputStream(this.f.getOutputStream()));
    public final AtomicBoolean d = new AtomicBoolean(false);
    public gjz e;
    private final BluetoothSocket f;
    private final ExecutorService g = jfm.b(9);

    public gkq(BluetoothSocket bluetoothSocket) {
        iva.a((Object) bluetoothSocket);
        this.f = bluetoothSocket;
    }

    public final void a() {
        if (this.d.compareAndSet(false, true)) {
            try {
                this.b.close();
            } catch (IOException e2) {
                a.a((Throwable) e2);
            }
            try {
                this.c.close();
            } catch (IOException e3) {
                a.a((Throwable) e3);
            }
            try {
                this.f.close();
            } catch (IOException e4) {
                a.a((Throwable) e4);
            }
            this.g.shutdown();
            SourceChimeraActivity sourceChimeraActivity = this.e.a.b;
            sourceChimeraActivity.n = null;
            sourceChimeraActivity.s = null;
            sourceChimeraActivity.finish();
        }
    }

    public final void a(byte[] bArr) {
        this.g.execute(new gkp(this, bArr));
    }
}
