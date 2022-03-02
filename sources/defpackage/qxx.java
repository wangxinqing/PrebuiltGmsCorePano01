package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;

/* renamed from: qxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class qxx {
    public static final qyj c = new qyj(qxu.a);
    public static final qyj d = new qyj(qxv.a);
    private final boolean a;
    private final boolean b;
    public final String e;
    public final int f;
    public final String g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final Set k;
    public final qxl l;
    public final Bundle m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    private final boolean r;
    private final int s;
    private final int t;

    public qxx(Bundle bundle) {
        String string = bundle.getString("service");
        iva.a((Object) string);
        this.e = string;
        this.a = bundle.getBoolean("is_tag_loggable");
        String string2 = bundle.getString("tag");
        iva.a((Object) string2);
        this.g = string2;
        this.f = bundle.getInt("service_kind", 0);
        boolean z = bundle.getBoolean("update_current");
        this.h = z;
        this.i = bundle.getInt("update_current_task", z ? 1 : 0);
        this.j = bundle.getBoolean("persisted");
        int i2 = bundle.getInt("requiredNetwork");
        this.n = i2;
        this.o = bundle.getInt("preferredNetwork", i2);
        boolean z2 = bundle.getBoolean("requiresCharging");
        this.b = z2;
        this.p = bundle.getInt("requiredChargingState", z2 ? 1 : 0);
        this.q = bundle.getInt("preferredChargingState", this.b ? 1 : 0);
        boolean z3 = bundle.getBoolean("requiresIdle");
        this.r = z3;
        this.s = bundle.getInt("requiredIdleness", z3 ? 1 : 0);
        this.t = bundle.getInt("preferredIdleness", this.r ? 1 : 0);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("reachabilityUris");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            this.k = anfv.a;
        } else {
            this.k = new ob(stringArrayList.size());
            int size = stringArrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.k.add(Uri.parse(stringArrayList.get(i3)));
            }
        }
        this.m = (Bundle) bundle.getParcelable("extras");
        qxl a2 = qxl.a((Bundle) bundle.getParcelable("retryStrategy"));
        this.l = a2 == null ? qxl.a : a2;
    }

    public static Uri a(String str) {
        boolean z;
        boolean z2;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.b(z2);
        int port = parse.getPort();
        if (port == -1) {
            if ("http".equalsIgnoreCase(scheme)) {
                port = 80;
            } else {
                port = 443;
            }
        }
        String host = parse.getHost();
        Uri parse2 = Uri.parse(String.format(Locale.US, "tcp://%s:%d", new Object[]{host, Integer.valueOf(port)}));
        a(parse2);
        return parse2;
    }

    public static void b(Bundle bundle) {
        if (bundle != null) {
            int c2 = c(bundle);
            if (c2 <= 10240) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof Boolean)) {
                        if (obj instanceof Bundle) {
                            b((Bundle) obj);
                        } else {
                            throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                        }
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("Extras exceeding maximum size(10240 bytes): ");
            sb.append(c2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static int c(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        bundle.writeToParcel(obtain, 0);
        int dataSize = obtain.dataSize();
        obtain.recycle();
        return dataSize;
    }

    public boolean equals(Object obj) {
        if (obj instanceof qxx) {
            qxx qxx = (qxx) obj;
            if (this.e.equals(qxx.e) && this.a == qxx.a && this.g.equals(qxx.g) && this.h == qxx.h && this.i == qxx.i && this.j == qxx.j && this.k.equals(qxx.k) && this.b == qxx.b && this.r == qxx.r && this.l.equals(qxx.l) && this.n == qxx.n && this.o == qxx.o && this.p == qxx.p && this.q == qxx.q && this.s == qxx.s && this.t == qxx.t) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int b(qxr qxr) {
        iva.a((Object) qxr);
        return this.t;
    }

    public static qxx a(Bundle bundle) {
        int length;
        if (bundle.getLong("period", -1) != -1) {
            return new qxj(bundle);
        }
        if (bundle.getLong("window_start", -1) != -1) {
            return new qxg(bundle);
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("content_uri_array");
        int[] intArray = bundle.getIntArray("content_uri_flags_array");
        if (parcelableArray != null && intArray != null && (length = parcelableArray.length) > 0 && length == intArray.length && !Arrays.asList(parcelableArray).contains((Object) null)) {
            return new qwb(bundle);
        }
        String valueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("Invalid bundle provided to #fromBundle: ");
        sb.append(valueOf);
        Log.e("GmsTaskScheduler", sb.toString());
        return null;
    }

    public static void a(Uri uri) {
        if (uri != null) {
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (TextUtils.isEmpty(host) || "null".equals(host)) {
                throw new IllegalArgumentException("URI hostname is required");
            }
            try {
                int port = uri.getPort();
                if (!"tcp".equals(scheme)) {
                    if (!"ping".equals(scheme)) {
                        String valueOf = String.valueOf(scheme);
                        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unsupported required URI scheme: ") : "Unsupported required URI scheme: ".concat(valueOf));
                    } else if (port != -1) {
                        throw new IllegalArgumentException("Ping does not support port numbers");
                    }
                } else if (port <= 0 || port > 65535) {
                    int port2 = uri.getPort();
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Invalid required URI port: ");
                    sb.append(port2);
                    throw new IllegalArgumentException(sb.toString());
                }
            } catch (NumberFormatException e2) {
                String valueOf2 = String.valueOf(e2.getMessage());
                throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Invalid port number: ") : "Invalid port number: ".concat(valueOf2));
            }
        } else {
            throw new IllegalArgumentException("Null URI");
        }
    }

    public qxx(qxw qxw) {
        this.e = qxw.i;
        this.a = false;
        this.f = qxw.j;
        this.g = qxw.k;
        this.h = qxw.l;
        this.i = qxw.m;
        this.j = qxw.n;
        this.n = qxw.c;
        this.o = qxw.d;
        this.p = qxw.e;
        this.q = qxw.f;
        this.s = qxw.g;
        this.t = qxw.h;
        this.k = qxw.q;
        this.b = qxw.o;
        this.r = qxw.p;
        this.m = qxw.s;
        qxl qxl = qxw.r;
        this.l = qxl == null ? qxl.a : qxl;
    }

    public final int a(qxr qxr) {
        iva.a((Object) qxr);
        return this.s;
    }

    public void a(Bundle bundle, int i2) {
        bundle.putBoolean("is_tag_loggable", this.a);
        bundle.putString("tag", this.g);
        bundle.putBoolean("update_current", this.h);
        bundle.putInt("update_current_task", this.i);
        bundle.putBoolean("persisted", this.j);
        bundle.putString("service", this.e);
        bundle.putInt("service_kind", this.f);
        bundle.putInt("requiredNetwork", this.n);
        bundle.putBoolean("requiresCharging", this.b);
        if (i2 >= 18585000) {
            bundle.putInt("preferredNetwork", this.o);
            bundle.putInt("requiredChargingState", this.p);
            bundle.putInt("preferredChargingState", this.q);
        }
        if (i2 >= 20231000) {
            bundle.putInt("requiredIdleness", this.s);
            bundle.putInt("preferredIdleness", this.t);
        }
        if (!this.k.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Uri uri : this.k) {
                arrayList.add(uri.toString());
            }
            bundle.putStringArrayList("reachabilityUris", arrayList);
        }
        bundle.putBoolean("requiresIdle", this.r);
        qxl qxl = this.l;
        Bundle bundle2 = new Bundle();
        qxl.b(bundle2);
        bundle.putBundle("retryStrategy", bundle2);
        bundle.putBundle("extras", this.m);
    }
}
