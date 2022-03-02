package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: jwu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jwu extends isy {
    public static bus a = bus.a;
    public final Looper u;
    public final ContextManagerClientInfo v;
    public clc w;
    private clc x;

    private final clc A() {
        if (this.x == null) {
            this.x = new clc(this.u, jwl.a);
        }
        return this.x;
    }

    public static Handler a(Looper looper) {
        bus bus = a;
        if (bus == null) {
            return bus.a.a(looper);
        }
        return bus.a(looper);
    }

    public final boolean E() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.contextmanager.service.ContextManagerService.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.contextmanager.internal.IContextManagerService";
    }

    public final int d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("com.google.android.contextmanager.service.args", ivy.a(this.v));
        return bundle;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jwu(Context context, Looper looper, ise ise, grb grb, ica ica, icb icb) {
        super(context, looper, 47, ise, ica, icb);
        String str;
        ContextManagerClientInfo contextManagerClientInfo;
        Context context2 = context;
        grb grb2 = grb;
        this.u = looper;
        Account account = ise.a;
        if (account != null) {
            str = account.name;
        } else {
            str = "@@ContextManagerNullAccount@@";
        }
        if (grb2 == null) {
            contextManagerClientInfo = new ContextManagerClientInfo(str, context.getPackageName(), Process.myUid(), context.getPackageName(), jim.a(context2, context.getPackageName()), 3, (String) null, (String) null, -1, Process.myPid());
        } else {
            contextManagerClientInfo = ContextManagerClientInfo.a(context2, str, grb2);
        }
        this.v = contextManagerClientInfo;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
        if (queryLocalInterface instanceof jxi) {
            return (jxi) queryLocalInterface;
        }
        return new jxg(iBinder);
    }

    public final void a(idg idg, ContextDataFilterImpl contextDataFilterImpl, jtv jtv, PendingIntent pendingIntent) {
        boolean z;
        jxc jxc;
        boolean z2 = true;
        if (jtv == null) {
            z = true;
        } else {
            z = false;
        }
        if (pendingIntent != null) {
            z2 = false;
        }
        iva.a(z2 ^ z);
        w();
        jxi jxi = (jxi) x();
        jwz a2 = jwz.a(idg, (jwt) null);
        ContextManagerClientInfo contextManagerClientInfo = this.v;
        String str = contextManagerClientInfo.b;
        String str2 = contextManagerClientInfo.a;
        String str3 = contextManagerClientInfo.d;
        if (jtv != null) {
            jxc = (jxc) A().a(jtv);
        } else {
            jxc = null;
        }
        jxi.a(a2, str, str2, str3, contextDataFilterImpl, jxc, pendingIntent);
    }

    public final void a(idg idg, jtv jtv, PendingIntent pendingIntent) {
        boolean z;
        jwl jwl;
        boolean z2 = true;
        if (jtv == null) {
            z = true;
        } else {
            z = false;
        }
        if (pendingIntent != null) {
            z2 = false;
        }
        iva.a(z2 ^ z);
        w();
        if (jtv != null) {
            jwl jwl2 = (jwl) ((IInterface) A().a.remove(jtv));
            if (jwl2 != null) {
                jwl = jwl2;
            } else {
                idg.a((Object) new Status(0));
                return;
            }
        } else {
            jwl = null;
        }
        jwz a2 = jwz.a(idg, new jwt(jwl));
        ContextManagerClientInfo contextManagerClientInfo = this.v;
        ((jxi) x()).a((jxf) a2, contextManagerClientInfo.b, contextManagerClientInfo.a, contextManagerClientInfo.d, (jxc) jwl, pendingIntent);
    }
}
