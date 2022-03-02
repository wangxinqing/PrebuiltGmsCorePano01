package defpackage;

import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.BluetoothTimeoutException;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* renamed from: aeix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeix {
    public final BlockingDeque a = new LinkedBlockingDeque();
    public volatile aegu b;

    public final byte[] a(long j) {
        try {
            byte[] bArr = (byte[]) this.a.poll(j, TimeUnit.MILLISECONDS);
            if (bArr != null) {
                return bArr;
            }
            throw new BluetoothTimeoutException(String.format("Operation timed out after %dms", new Object[]{Long.valueOf(j)}));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new BluetoothException("Operation interrupted.");
        }
    }
}
