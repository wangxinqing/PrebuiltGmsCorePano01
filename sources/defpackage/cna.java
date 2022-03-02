package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cna {
    private final Context a;
    private Map b = null;

    public cna(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: package-private */
    public final cmt a(String str) {
        Bundle bundle;
        Map map;
        if (this.b == null) {
            Context context = this.a;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                        bundle = null;
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                } else {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    bundle = null;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("BackendRegistry", "Application info not found.");
                bundle = null;
            }
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.emptyMap();
            } else {
                HashMap hashMap = new HashMap();
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if ((obj instanceof String) && str2.startsWith("backend:")) {
                        for (String trim : ((String) obj).split(",", -1)) {
                            String trim2 = trim.trim();
                            if (!trim2.isEmpty()) {
                                hashMap.put(trim2, str2.substring(8));
                            }
                        }
                    }
                }
                map = hashMap;
            }
            this.b = map;
        }
        String str3 = (String) this.b.get(str);
        if (str3 == null) {
            return null;
        }
        try {
            return (cmt) Class.forName(str3).asSubclass(cmt.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e2) {
            Log.w("BackendRegistry", String.format("Class %s is not found.", new Object[]{str3}), e2);
            return null;
        } catch (IllegalAccessException e3) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str3}), e3);
            return null;
        } catch (InstantiationException e4) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str3}), e4);
            return null;
        } catch (NoSuchMethodException e5) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str3}), e5);
            return null;
        } catch (InvocationTargetException e6) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str3}), e6);
            return null;
        }
    }
}
