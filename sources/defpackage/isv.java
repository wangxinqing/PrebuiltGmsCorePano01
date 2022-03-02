package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: isv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class isv extends itu {
    public final List a = new ArrayList();
    private final itv b;
    private final GetServiceRequest c;
    private final ConnectionInfo d;
    private final Context e;
    private final nig f;
    private final int g;

    public isv(itv itv, GetServiceRequest getServiceRequest, ConnectionInfo connectionInfo, Context context, nig nig, int i) {
        this.b = itv;
        this.c = getServiceRequest;
        this.d = connectionInfo;
        this.e = context;
        this.f = nig;
        this.g = i;
    }

    public final void a(int i, Bundle bundle) {
        this.b.a(i, bundle);
    }

    public final IBinder asBinder() {
        return this.b.asBinder();
    }

    public final void a(int i, IBinder iBinder, Bundle bundle) {
        int i2;
        int i3;
        ConnectionInfo connectionInfo = this.d;
        connectionInfo.a = bundle;
        if (!(iBinder == null || this.e == null || !a() || (i2 = this.g) == -1)) {
            if (!this.c.k || i2 != jhg.a) {
                i3 = 0;
            } else {
                int a2 = njj.a(this.c.l);
                connectionInfo.c = a2;
                i3 = a2;
            }
            if ((!(iBinder instanceof niz) && !(iBinder instanceof jbh)) || i3 != 0 || axda.a.a().T()) {
                Context context = this.e;
                nig nig = this.f;
                int i4 = this.g;
                if (nkt.a(iBinder)) {
                    iBinder = new nkt((Binder) iBinder, context, nig, i4, i3);
                }
            }
        }
        a(i, iBinder, this.d);
    }

    public final void a(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
        if (connectionInfo == null) {
            connectionInfo = this.d;
        }
        List list = this.a;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (((isr) list.get(i2)).a(this.c, i)) {
                i2 = i3;
            } else {
                return;
            }
        }
        if (!this.c.k) {
            this.b.a(i, iBinder, connectionInfo.a);
        } else {
            this.b.a(i, iBinder, connectionInfo);
        }
    }

    public final boolean a() {
        return this.b.asBinder() != this.b;
    }
}
