package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: amoz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amoz implements amog, amof {
    public final aejx a;
    public final BluetoothGattCharacteristic b;
    public amof c;
    private final int d;
    private final Executor e;

    public amoz(aejx aejx, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 20000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        this.a = aejx;
        this.b = bluetoothGattCharacteristic;
        this.d = i;
        this.e = threadPoolExecutor;
    }

    public final int a() {
        return this.d;
    }

    public final void b() {
        this.e.execute(new amov(this));
    }

    public final void e() {
        this.e.execute(new amoy(this));
    }

    public final void a(amof amof) {
        if (this.c == null) {
            this.c = amof;
            return;
        }
        throw new IllegalStateException("initialize() already called");
    }

    public final void b(byte[] bArr) {
        this.e.execute(new amou(this, bArr));
    }

    public final void a(amon amon) {
        this.e.execute(new amow(this, amon));
    }

    public final void a(byte[] bArr) {
        this.e.execute(new amox(this, bArr));
    }
}
