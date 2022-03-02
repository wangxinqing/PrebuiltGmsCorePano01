package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: tso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tso {
    private String a = null;
    private final Context b;
    private final aryz c;
    private aryd d;

    public tso(Context context) {
        this.b = context;
        this.c = new aryz(context);
    }

    private final aryd a() {
        aryd aryd = this.d;
        if (aryd != null) {
            return aryd;
        }
        aosh f = aosh.f();
        this.c.a(new Intent("com.google.android.gms.fastpair.ACTION_BIND_LOC_WRAPPER").setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsBoundBrokerService"), new tsn(f), 200);
        try {
            return (aryd) f.get(200, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            anih anih = (anih) tsp.a.c();
            anih.a(e);
            anih.a("LocalizedStringWrapperUtil: get binder failed");
            return null;
        }
    }

    private final String b(String str, Object... objArr) {
        if (TextUtils.isEmpty(this.a)) {
            ModuleManager.ModuleInfo c2 = jil.c(this.b);
            this.a = c2 == null ? this.b.getPackageName() : c2.moduleApk.apkPackageName;
        }
        int identifier = this.b.getResources().getIdentifier(str, "string", this.a);
        if (identifier != 0) {
            try {
                return this.b.getString(identifier, objArr);
            } catch (Resources.NotFoundException e) {
                String format = String.format("String name:%s with id:%s is not existing in package:%s", new Object[]{str, Integer.valueOf(identifier), this.a});
                throw (Build.VERSION.SDK_INT >= 24 ? new Resources.NotFoundException(format, e) : new Resources.NotFoundException(format));
            }
        } else {
            String str2 = this.a;
            StringBuilder sb = new StringBuilder(str.length() + 40 + String.valueOf(str2).length());
            sb.append("String name:");
            sb.append(str);
            sb.append(" is not existing in package:");
            sb.append(str2);
            throw new Resources.NotFoundException(sb.toString());
        }
    }

    private final String a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        aryd a2 = a();
        if (a2 != null) {
            try {
                Parcel aQ = a2.aQ();
                aQ.writeString(str);
                Parcel a3 = a2.a(2, aQ);
                String readString = a3.readString();
                a3.recycle();
                ((anih) tsp.a.d()).a("LocalizedStringWrapperUtil: get string %s with result %s, spent time %d ms", (Object) str, (Object) readString, (Object) Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                this.d = a2;
                return readString;
            } catch (RemoteException e) {
                if (this.d != null) {
                    anih anih = (anih) tsp.a.c();
                    anih.a((Throwable) e);
                    anih.a("LocalizedStringWrapperUtil: RemoteException with cached iBinder, try to renew it.");
                    this.d = null;
                    return a(str);
                }
                anih anih2 = (anih) tsp.a.c();
                anih2.a((Throwable) e);
                anih2.a("LocalizedStringWrapperUtil: RemoteException");
                return null;
            }
        } else {
            ((anih) tsp.a.d()).a("LocalizedStringWrapperUtil: binder is null");
            return null;
        }
    }

    public final synchronized String a(String str, Object... objArr) {
        if (aymw.a.a().W()) {
            iva.b("Only call getWrappedString on worker thread!");
            boolean startsWith = str.startsWith("fast_pair_");
            StringBuilder sb = new StringBuilder(str.length() + 74);
            sb.append("Inputted string name ");
            sb.append(str);
            sb.append(" is invalid. Please name it with 'fast_pair_' prefix!");
            iva.b(startsWith, sb.toString());
            String a2 = a(str);
            if (TextUtils.isEmpty(a2)) {
                return b(str, objArr);
            } else if (objArr.length <= 0) {
                return a2;
            } else {
                return String.format(arxk.d(), a2, objArr);
            }
        } else {
            ((anih) tsp.a.d()).a("LocalizedStringWrapper not enabled");
            return b(str, objArr);
        }
    }
}
