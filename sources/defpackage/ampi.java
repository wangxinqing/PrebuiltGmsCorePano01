package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ampi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ampi implements amog, amof {
    public final aeka a;
    public final BluetoothGattCharacteristic b;
    public final aejw c;
    public amof d;
    private final Executor e;
    private final int f;

    public ampi(aeka aeka, aejw aejw, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 20000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        this.a = aeka;
        this.c = aejw;
        this.b = bluetoothGattCharacteristic;
        this.f = i;
        this.e = threadPoolExecutor;
    }

    public final int a() {
        return this.f;
    }

    public final void b() {
        this.e.execute(new ampe(this));
    }

    public final String c() {
        return this.c.a();
    }

    public final void e() {
        this.e.execute(new amph(this));
    }

    public final void a(amof amof) {
        if (this.d == null) {
            this.d = amof;
            return;
        }
        String valueOf = String.valueOf(amof);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("initialize() already called: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    public final void b(byte[] bArr) {
        this.e.execute(new ampd(this, bArr));
    }

    public final void a(amon amon) {
        this.e.execute(new ampf(this, amon));
    }

    public final void a(byte[] bArr) {
        this.e.execute(new ampg(this, bArr));
    }
}
