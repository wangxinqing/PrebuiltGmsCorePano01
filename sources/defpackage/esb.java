package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: esb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class esb extends irg {
    final esc a;
    final fys b;

    public esb(Context context, esc esc, fys fys) {
        super(context, 120, new int[0]);
        this.a = esc;
        this.b = fys;
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        esc esc = this.a;
        esc.asBinder();
        isv.a(0, (IBinder) esc, (Bundle) null);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, int i) {
        if (jhg.b()) {
            return;
        }
        if (str == null || !this.b.a(str)) {
            String valueOf = String.valueOf(str);
            throw new SecurityException(valueOf.length() == 0 ? new String("Can't manage work accounts: ") : "Can't manage work accounts: ".concat(valueOf));
        }
    }
}
