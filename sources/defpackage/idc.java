package defpackage;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: idc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class idc extends idk {
    public final SparseArray a = new SparseArray();

    public idc(ify ify) {
        super(ify);
        this.e.a("AutoManageHelper", (LifecycleCallback) this);
    }

    private final idb a(int i) {
        if (this.a.size() <= i) {
            return null;
        }
        SparseArray sparseArray = this.a;
        return (idb) sparseArray.get(sparseArray.keyAt(i));
    }

    public final void b() {
        super.b();
        for (int i = 0; i < this.a.size(); i++) {
            idb a2 = a(i);
            if (a2 != null) {
                a2.b.g();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            idb a2 = a(i);
            if (a2 != null) {
                a2.b.e();
            }
        }
    }

    public final void a() {
        super.a();
        boolean z = this.b;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        sb.toString();
        if (this.c.get() == null) {
            for (int i = 0; i < this.a.size(); i++) {
                idb a2 = a(i);
                if (a2 != null) {
                    a2.b.e();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        idb idb = (idb) this.a.get(i);
        if (idb != null) {
            idb idb2 = (idb) this.a.get(i);
            this.a.remove(i);
            if (idb2 != null) {
                ita ita = ((iey) idb2.b).c;
                iva.a((Object) idb2);
                synchronized (ita.d) {
                    if (!ita.c.remove(idb2)) {
                        String valueOf = String.valueOf(idb2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                        sb.append("unregisterConnectionFailedListener(): listener ");
                        sb.append(valueOf);
                        sb.append(" not found");
                        Log.w("GmsClientEvents", sb.toString());
                    }
                }
                idb2.b.g();
            }
            icb icb = idb.c;
            if (icb != null) {
                icb.a(connectionResult);
            }
        }
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.a.size(); i++) {
            idb a2 = a(i);
            if (a2 != null) {
                printWriter.append(str).append("GoogleApiClient #").print(a2.a);
                printWriter.println(":");
                a2.b.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }
}
