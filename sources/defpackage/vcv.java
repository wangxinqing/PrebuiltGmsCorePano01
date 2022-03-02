package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.HandleClientLifecycleEventRequest;

/* renamed from: vcv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vcv extends isy {
    public final vec a = new vec();
    public final ClientAppContext u;
    private final int v;

    static int a(Context context) {
        if (context instanceof Activity) {
            return 1;
        }
        if (!(context instanceof Application)) {
            return context instanceof Service ? 3 : 0;
        }
        return 2;
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    public final int d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        Bundle f = super.f();
        f.putInt("NearbyPermissions", this.v);
        f.putParcelable("ClientAppContext", this.u);
        return f;
    }

    public final void j() {
        try {
            b(2);
        } catch (RemoteException e) {
        }
        this.a.a.clear();
        super.j();
    }

    public final boolean n() {
        return tcn.d(this.c);
    }

    public vcv(Context context, Looper looper, ica ica, icb icb, ise ise, uxk uxk) {
        super(context, looper, 62, ise, ica, icb);
        String str = ise.e;
        int a2 = a(context);
        if (uxk != null) {
            this.u = new ClientAppContext(str, uxk.a, uxk.b, a2);
            this.v = uxk.c;
        } else {
            this.u = new ClientAppContext(str, (String) null, false, a2);
            this.v = -1;
        }
        if (a2 == 1) {
            int i = Build.VERSION.SDK_INT;
            Activity activity = (Activity) context;
            activity.getApplication().registerActivityLifecycleCallbacks(new vcu(activity, this));
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i) {
        if (l()) {
            ((vcl) x()).a(new HandleClientLifecycleEventRequest(1, (ClientAppContext) null, i));
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (queryLocalInterface instanceof vcl) {
            return (vcl) queryLocalInterface;
        }
        return new vcj(iBinder);
    }
}
