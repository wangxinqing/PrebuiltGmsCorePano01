package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.ConnectionInfo;

/* renamed from: nju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nju extends itu {
    public jff a;
    private final itv b;

    public nju(itv itv) {
        this.b = itv;
    }

    private final amky a() {
        jff jff = this.a;
        if (jff == null) {
            return null;
        }
        this.a = null;
        return jff.b();
    }

    public final void a(int i, Bundle bundle) {
        amky a2 = a();
        try {
            this.b.a(i, bundle);
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(int i, IBinder iBinder, Bundle bundle) {
        amky a2 = a();
        try {
            this.b.a(i, iBinder, bundle);
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
        amky a2 = a();
        try {
            if (njj.a(connectionInfo.c) != 0) {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                iva.a((Object) interfaceDescriptor);
                iBinder = new njl(interfaceDescriptor, iBinder);
            }
            this.b.a(i, iBinder, connectionInfo);
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
