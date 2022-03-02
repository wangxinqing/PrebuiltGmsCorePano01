package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.DisconnectRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: kvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kvf extends isy {
    public static final /* synthetic */ int z = 0;
    private final String A;
    private final Bundle B;
    private volatile DriveId C;
    public volatile DriveId a;
    public volatile boolean u = false;
    final Map v = new HashMap();
    final Map w = new HashMap();
    final Map x = new HashMap();
    final Map y = new HashMap();

    public final kwd A() {
        return (kwd) x();
    }

    public final boolean E() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveService");
        if (queryLocalInterface instanceof kwd) {
            return (kwd) queryLocalInterface;
        }
        return new kwb(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.drive.ApiService.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    public final int d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        String packageName = this.c.getPackageName();
        iva.a((Object) packageName);
        iva.a(!this.s.c.isEmpty());
        Bundle bundle = new Bundle();
        if (!packageName.equals(this.A)) {
            bundle.putString("proxy_package_name", this.A);
        }
        bundle.putAll(this.B);
        return bundle;
    }

    public final boolean g() {
        return !this.c.getPackageName().equals(this.A) || !jll.a(this.c, Process.myUid());
    }

    public final void j() {
        if (l()) {
            try {
                ((kwd) x()).a(new DisconnectRequest());
            } catch (RemoteException e) {
            }
        }
        super.j();
        synchronized (this.v) {
            this.v.clear();
        }
        synchronized (this.w) {
            this.w.clear();
        }
        synchronized (this.x) {
            this.x.clear();
        }
        synchronized (this.y) {
            this.y.clear();
        }
    }

    public kvf(Context context, Looper looper, ise ise, ica ica, icb icb, Bundle bundle) {
        super(context, looper, 11, ise, ica, icb);
        this.A = ise.e;
        this.B = bundle;
        Intent intent = new Intent("com.google.android.gms.drive.events.HANDLE_EVENT");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        int size = queryIntentServices.size();
        if (size == 0) {
            return;
        }
        if (size == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            if (!serviceInfo.exported) {
                String str = serviceInfo.name;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60);
                sb.append("Drive event service ");
                sb.append(str);
                sb.append(" must be exported in AndroidManifest.xml");
                throw new IllegalStateException(sb.toString());
            }
            return;
        }
        String action = intent.getAction();
        StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 72);
        sb2.append("AndroidManifest.xml can only define one service that handles the ");
        sb2.append(action);
        sb2.append(" action");
        throw new IllegalStateException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    public final void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.a = (DriveId) bundle.getParcelable("com.google.android.gms.drive.root_id");
            this.C = (DriveId) bundle.getParcelable("com.google.android.gms.drive.appdata_id");
            this.u = true;
        }
        super.a(i, iBinder, bundle, i2);
    }
}
