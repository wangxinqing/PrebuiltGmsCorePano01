package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: bna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bna extends Binder {
    private final String a;
    private final Context b;
    private int c = hei.f();
    private boolean d = false;

    public bna(Context context, String str) {
        this.a = str;
        this.b = context;
        bkn.b();
    }

    public static void a(Parcel parcel, int i) {
        parcel.setDataSize(i);
        int dataSize = (parcel.dataSize() - parcel.dataPosition()) / 8;
        for (int i2 = 0; i2 < dataSize; i2++) {
            parcel.writeLong(0);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        BufferedReader bufferedReader;
        if (Binder.getCallingPid() != Process.myPid()) {
            synchronized (this) {
                bkn.b();
                if (hei.d()) {
                    if (!this.d) {
                        File file = new File(this.b.getFilesDir(), "binder_buffer_size.txt");
                        int i4 = this.c;
                        try {
                            bufferedReader = new BufferedReader(new FileReader(file));
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                Log.w("ChimeraSrvcProxy", "Failed to read the buffer size file. Using default NullBinder reply size.");
                            } else {
                                int parseInt = Integer.parseInt(readLine);
                                if (parseInt > i4) {
                                    bufferedReader.close();
                                    i4 = parseInt;
                                    this.c = i4;
                                    this.d = true;
                                }
                            }
                            bufferedReader.close();
                        } catch (IOException | NumberFormatException e) {
                            String valueOf = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74);
                            sb.append("Failed to read the buffer size file. Using default NullBinder reply size. ");
                            sb.append(valueOf);
                            Log.w("ChimeraSrvcProxy", sb.toString());
                        } catch (Throwable th) {
                            apev.a(th, th);
                        }
                        this.c = i4;
                        this.d = true;
                    }
                }
                i3 = this.c;
            }
            parcel2.writeException(new IllegalStateException("Service without Chimera impl"));
            try {
                a(parcel2, i3 * 1024);
                String str = this.a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 98);
                sb2.append("NullBinder for ");
                sb2.append(str);
                sb2.append(" triggering remote TransactionTooLargeException due to Service without Chimera impl");
                Log.i("ChimeraSrvcProxy", sb2.toString());
            } catch (OutOfMemoryError e2) {
                Log.w("ChimeraSrvcProxy", "OOM allocating NullBinder reply");
            }
            return true;
        }
        String str2 = this.a;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 76);
        sb3.append("NullBinder for ");
        sb3.append(str2);
        sb3.append(" throwing RemoteException due to Service without Chimera impl");
        Log.i("ChimeraSrvcProxy", sb3.toString());
        int i5 = Build.VERSION.SDK_INT;
        throw new RemoteException("Service without Chimera impl");
        throw th;
    }

    public final IInterface queryLocalInterface(String str) {
        return null;
    }
}
