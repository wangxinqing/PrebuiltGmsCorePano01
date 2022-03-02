package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: qdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qdc {
    public static qdu a;
    private static final Map d = new nz();
    private static final long e = TimeUnit.DAYS.toMillis(7);
    private static qdt f;
    private static String g;
    final Context b;
    String c = "";

    protected qdc(Context context, String str) {
        this.b = context.getApplicationContext();
        this.c = str;
    }

    static String a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e2) {
            Log.w("InstanceID", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    @Deprecated
    public final String b() {
        return a(a());
    }

    public static synchronized qdc a(Context context) {
        qdc qdc;
        synchronized (qdc.class) {
            Context applicationContext = context.getApplicationContext();
            if (a == null) {
                a = new qdu(applicationContext);
                f = new qdt(applicationContext);
            }
            g = Integer.toString(201216073);
            qdc = (qdc) d.get("");
            if (qdc == null) {
                qdc = new qdc(applicationContext, "");
                d.put("", qdc);
            }
        }
        return qdc;
    }

    @Deprecated
    public final String a(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String a2 = a.a("appVersion");
            String str3 = null;
            if (a2 != null && a2.equals(g)) {
                long b2 = a.b(this.c, str, str2);
                if (b2 >= 0 && System.currentTimeMillis() - b2 < e) {
                    str3 = a.a(this.c, str, str2);
                }
            }
            if (str3 != null) {
                return str3;
            }
            String a3 = a(str, str2, new Bundle());
            if (axke.a.a().a() && a3.contains(":") && !a3.startsWith(String.valueOf(b()).concat(":"))) {
                qdd.a(this.b, a);
                throw new IOException("SERVICE_NOT_AVAILABLE");
            } else if (a3 == null) {
                return a3;
            } else {
                a.a(this.c, str, str2, a3, g);
                return a3;
            }
        } else {
            throw new IOException("MAIN_THREAD");
        }
    }

    public final String a(String str, String str2, Bundle bundle) {
        Bundle a2;
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        String str3 = !"".equals(this.c) ? this.c : str;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        qdt qdt = f;
        KeyPair a3 = a();
        bundle.putString("gmsv", Integer.toString(201216073));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", Integer.toString(201216073));
        bundle.putString("app_ver_name", "20.12.16 (080306-{{cl}})");
        StringBuilder sb = new StringBuilder(15);
        sb.append("iid-201216000");
        bundle.putString("cliv", sb.toString());
        bundle.putString("appid", a(a3));
        qdq qdq = new qdq(qdt.e);
        Bundle bundle2 = null;
        try {
            a2 = (Bundle) acws.a(qdq.a(new qdo(qdq.a(), bundle)));
        } catch (InterruptedException | ExecutionException e2) {
            if ((e2.getCause() instanceof qdp) && ((qdp) e2.getCause()).a == 4) {
                a2 = qdt.a(bundle);
                if (a2 != null && a2.containsKey("google.messenger")) {
                    Bundle a4 = qdt.a(bundle);
                    if (a4 == null || !a4.containsKey("google.messenger")) {
                        bundle2 = a4;
                    }
                }
            }
        }
        bundle2 = a2;
        if (bundle2 != null) {
            String string = bundle2.getString("registration_id");
            if (string == null) {
                string = bundle2.getString("unregistered");
            }
            if (string == null) {
                String string2 = bundle2.getString("error");
                if (string2 != null) {
                    throw new IOException(string2);
                }
                String valueOf = String.valueOf(bundle2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb2.append("Unexpected response from GCM ");
                sb2.append(valueOf);
                Log.w("InstanceID", sb2.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            } else if (!"RST".equals(string) && !string.startsWith("RST|")) {
                return string;
            } else {
                qdd.a(this.b, a);
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* access modifiers changed from: package-private */
    public final KeyPair a() {
        return a.b(this.c).a;
    }
}
