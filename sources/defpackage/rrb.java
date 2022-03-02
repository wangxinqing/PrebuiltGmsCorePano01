package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import com.android.volley.ExecutorDelivery;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.google.android.gms.maps.auth.ApiTokenChimeraService;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: rrb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rrb extends bhw implements IInterface {
    final /* synthetic */ ApiTokenChimeraService a;

    public rrb() {
        super("com.google.android.gms.maps.auth.IApiTokenService");
    }

    /* JADX INFO: finally extract failed */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        Bundle bundle;
        String[] a2;
        atft atft;
        long j;
        long j2;
        if (i == 1) {
            Bundle bundle2 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
            ApiTokenChimeraService apiTokenChimeraService = this.a;
            if (apiTokenChimeraService.c == null) {
                Context applicationContext = apiTokenChimeraService.getApplicationContext();
                boolean z = bundle2.getBoolean("M4B", false);
                athc athc = new athc(applicationContext, new HurlStack());
                StrictMode.ThreadPolicy a3 = atga.a.a();
                try {
                    atgl atgl = new atgl(new DiskBasedCache(new File(applicationContext.getCacheDir(), "com.google.android.gms.maps.volley"), 20971520), athc, new atgj((((ActivityManager) applicationContext.getSystemService("activity")).getMemoryClass() * 1048576) / 8), new ExecutorDelivery((Handler) new qvr(Looper.getMainLooper())));
                    atga.a.a(a3);
                    atgl.start();
                    String str = athb.a;
                    boolean z2 = atgr.g;
                    String format = String.format("android:%s-%s-%s", new Object[]{Build.MANUFACTURER.replace('-', '_'), Build.DEVICE.replace('-', '_'), Build.MODEL.replace('-', '_')});
                    atgq a4 = atgp.a(applicationContext, z2 ? String.valueOf(format).concat("-wear") : format, String.valueOf(hxy.a), atgl, "com.google.android.gms", z);
                    ((atgp) a4).d.addIfAbsent(new rqx());
                    apiTokenChimeraService.c = a4;
                    atgq atgq = apiTokenChimeraService.c;
                    synchronized (atgq) {
                        ((atgp) atgq).e = true;
                    }
                    ((atgp) atgq).d();
                } catch (Throwable th) {
                    atga.a.a(a3);
                    throw th;
                }
            }
            String string = bundle2.getString("PACKAGE_NAME");
            if (!(string == null || (a2 = jni.b(apiTokenChimeraService.getApplicationContext()).a(Binder.getCallingUid())) == null)) {
                List asList = Arrays.asList(a2);
                if (asList.contains(string) || asList.contains("com.google.android.gms")) {
                    String a5 = atgn.a(apiTokenChimeraService.getApplicationContext(), string);
                    if (a5 == null) {
                        if (atfx.a(ApiTokenChimeraService.a, 6)) {
                            String str2 = ApiTokenChimeraService.a;
                            StringBuilder sb = new StringBuilder(string.length() + 55);
                            sb.append("Certificate footprint was not found for the package: \"");
                            sb.append(string);
                            sb.append("\"");
                            Log.e(str2, sb.toString());
                        }
                        bundle = ApiTokenChimeraService.a(2);
                    } else {
                        String string2 = bundle2.getString("API_KEY");
                        if (string2 == null) {
                            if (atfx.a(ApiTokenChimeraService.a, 6)) {
                                Log.e(ApiTokenChimeraService.a, "API Key was not found in the request.");
                            }
                            bundle = ApiTokenChimeraService.a(3);
                        } else {
                            atfu atfu = new atfu(string2, string, a5);
                            atgq atgq2 = apiTokenChimeraService.c;
                            long j3 = ApiTokenChimeraService.b;
                            atfy.a(atgq2, "drd");
                            atgq2.a(atfu);
                            try {
                                atfu.a.tryAcquire(j3, TimeUnit.MILLISECONDS);
                            } catch (InterruptedException e) {
                            }
                            synchronized (atfu) {
                                atft = atfu.b;
                            }
                            if (atft == null) {
                                if (atfx.a(ApiTokenChimeraService.a, 6)) {
                                    Log.e(ApiTokenChimeraService.a, "Timeout of the request to GMM server");
                                }
                                bundle = ApiTokenChimeraService.a(5);
                            } else if (atft.a) {
                                Bundle bundle3 = new Bundle(3);
                                bundle3.putString("API_TOKEN", atft.b);
                                Long l = atft.c;
                                if (l != null) {
                                    j = l.longValue();
                                } else {
                                    j = -1;
                                }
                                bundle3.putLong("EXPIRY_TIME", j);
                                Long l2 = atft.d;
                                if (l2 != null) {
                                    j2 = l2.longValue();
                                } else {
                                    j2 = 0;
                                }
                                bundle3.putLong("VALIDITY_DURATION", j2);
                                bundle = bundle3;
                            } else {
                                if (atfx.a(ApiTokenChimeraService.a, 6)) {
                                    Log.e(ApiTokenChimeraService.a, "Authentication failed. ");
                                }
                                bundle = ApiTokenChimeraService.a(4);
                            }
                        }
                    }
                    parcel2.writeNoException();
                    bhx.b(parcel2, bundle);
                    return true;
                }
            }
            if (atfx.a(ApiTokenChimeraService.a, 6)) {
                String str3 = ApiTokenChimeraService.a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 73);
                sb2.append("Package name \"");
                sb2.append(string);
                sb2.append("\" doesn't match any process executed with the caller's UID.");
                Log.e(str3, sb2.toString());
            }
            bundle = ApiTokenChimeraService.a(1);
            parcel2.writeNoException();
            bhx.b(parcel2, bundle);
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rrb(ApiTokenChimeraService apiTokenChimeraService) {
        super("com.google.android.gms.maps.auth.IApiTokenService");
        this.a = apiTokenChimeraService;
    }
}
