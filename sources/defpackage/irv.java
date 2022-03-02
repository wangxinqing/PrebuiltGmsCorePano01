package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: irv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class irv extends irm {
    public final IBinder g;
    final /* synthetic */ irx h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public irv(irx irx, int i, IBinder iBinder, Bundle bundle) {
        super(irx, i, bundle);
        this.h = irx;
        this.g = iBinder;
    }

    /* access modifiers changed from: protected */
    public final void a(ConnectionResult connectionResult) {
        iro iro = this.h.m;
        if (iro != null) {
            iro.a(connectionResult);
        }
        this.h.a(connectionResult);
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        try {
            String interfaceDescriptor = this.g.getInterfaceDescriptor();
            if (!this.h.c().equals(interfaceDescriptor)) {
                String c = this.h.c();
                StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(c);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.e("GmsClient", sb.toString());
                return false;
            }
            IInterface a = this.h.a(this.g);
            if (a == null || (!this.h.a(2, 4, a) && !this.h.a(3, 4, a))) {
                return false;
            }
            irx irx = this.h;
            irx.n = null;
            Bundle C = irx.C();
            irn irn = this.h.l;
            if (irn == null) {
                return true;
            }
            irn.a(C);
            return true;
        } catch (RemoteException e) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
