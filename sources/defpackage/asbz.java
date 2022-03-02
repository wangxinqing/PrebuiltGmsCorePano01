package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.content.Context;
import android.os.Build;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: asbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asbz implements asjb {
    public final BluetoothAdapter a;
    public final asda b;
    public final ascd c;
    public final Set d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    BluetoothServerSocket f;
    public asgs g;

    public asbz(Context context) {
        this.b = (asda) thl.a(context, asda.class);
        this.c = (ascd) thl.a(context, ascd.class);
        this.d = new HashSet();
        this.a = BluetoothAdapter.getDefaultAdapter();
    }

    public static void a(Context context) {
        int i = Build.VERSION.SDK_INT;
        asda asda = (asda) thl.b(context, asda.class);
        if (asda == null || !asda.a()) {
            throw new asjk(asda.class, asbz.class);
        }
    }

    public final /* bridge */ /* synthetic */ audx c() {
        return asem.e;
    }

    public final ashq a(asgs asgs) {
        this.g = asgs;
        return new asby(this);
    }

    public final void a(asiz asiz) {
        synchronized (this.d) {
            for (ascc b2 : this.d) {
                this.c.b((ashv) b2);
            }
        }
        this.b.b(asiz);
    }

    public final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                anih anih = (anih) asil.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("asbz", "a", 149, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothRfcommAccept: Error closing connection");
            }
        }
    }
}
