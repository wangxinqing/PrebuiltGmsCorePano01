package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.BoundService;
import com.google.android.chimera.IntentOperation;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FindBinderBufferSizeOperation extends IntentOperation {
    static final int a(IBinder iBinder) {
        bkn.b();
        int f = hei.f();
        int i = f;
        int i2 = 0;
        while (i2 < 8) {
            int i3 = i * 1024;
            Parcel obtain = Parcel.obtain();
            try {
                bna.a(obtain, i3);
                try {
                    iBinder.transact(1, obtain, Parcel.obtain(), 0);
                    i += i;
                    i2++;
                } catch (RemoteException e) {
                    return i;
                }
            } catch (OutOfMemoryError e2) {
                Log.w("FindBufferSizeOperation", "OOM allocating parcel. NullBinder will use flag-set size.");
                return f;
            }
        }
        Log.w("FindBufferSizeOperation", "Could not trigger a RemoteException. NullBinder will use flag-set size.");
        return f;
    }

    public final void onHandleIntent(Intent intent) {
        FileWriter fileWriter;
        bkn.b();
        if (hei.d()) {
            hwz hwz = new hwz();
            Intent startIntent = BoundService.getStartIntent(this, "com.google.android.gms.chimera.container.BIND_FIND_BUFFER_SIZE");
            if (startIntent == null) {
                Log.w("FindBufferSizeOperation", "Failed to get the intent to bind to FindBinderBufferSizeBoundService. NullBinder will use a pre-determined size.");
                return;
            }
            jca.a().a(this, startIntent, hwz, 1);
            try {
                int a = a(hwz.a(5000, TimeUnit.MILLISECONDS));
                jca.a().b((Context) this, (ServiceConnection) hwz);
                try {
                    fileWriter = new FileWriter(new File(getFilesDir(), "binder_buffer_size.txt"));
                    StringBuilder sb = new StringBuilder(11);
                    sb.append(a);
                    fileWriter.write(sb.toString());
                    fileWriter.close();
                    return;
                } catch (IOException e) {
                    Log.w("FindBufferSizeOperation", "Failed to write binder buffer size to file. NullBinder will use flag-set size.");
                    return;
                } catch (Throwable th) {
                    apev.a(th, th);
                }
            } catch (InterruptedException | TimeoutException e2) {
                Log.w("FindBufferSizeOperation", "Binding interrupted or timed out. NullBinder will use a pre-determined size.");
                jca.a().b((Context) this, (ServiceConnection) hwz);
                return;
            } catch (Throwable th2) {
                jca.a().b((Context) this, (ServiceConnection) hwz);
                throw th2;
            }
        } else {
            return;
        }
        throw th;
    }
}
