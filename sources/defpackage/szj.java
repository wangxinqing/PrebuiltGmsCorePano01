package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* renamed from: szj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class szj extends swm {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"firebase_", "google_", "ga_"};
    private SecureRandom c;
    private final AtomicLong d = new AtomicLong(0);
    private int e;
    private Integer f = null;

    public szj(svv svv) {
        super(svv);
    }

    static long a(byte[] bArr) {
        boolean z;
        iva.a((Object) bArr);
        int length = bArr.length;
        int i = 0;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        int i2 = length - 1;
        long j = 0;
        while (i2 >= 0 && i2 >= bArr.length - 8) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
            i2--;
        }
        return j;
    }

    static final boolean b(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    private static boolean c(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
        }
    }

    static MessageDigest f() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e2) {
            }
        }
        return null;
    }

    static final boolean h(String str) {
        iva.a((Object) str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int i(String str) {
        if ("_ldl".equals(str)) {
            v();
            return 2048;
        } else if ("_id".equals(str)) {
            v();
            return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        } else if (!v().a(sud.at) || !"_lgclid".equals(str)) {
            v();
            return 36;
        } else {
            v();
            return 100;
        }
    }

    /* access modifiers changed from: protected */
    public final void G() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                E().f.a("Utils falling back to Random for random id");
            }
        }
        this.d.set(nextLong);
    }

    public final long a(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int d(String str) {
        if (!a("event param", str)) {
            return 3;
        }
        if (!a("event param", (String[]) null, str)) {
            return 14;
        }
        v();
        if (a("event param", 40, str)) {
            return 0;
        }
        return 3;
    }

    /* access modifiers changed from: package-private */
    public final SecureRandom e() {
        h();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String g = v().g();
        if (!u().a || !g.equals(z().getPackageName())) {
            return g.equals(str);
        }
        E().k.a("Debug mode not permitted on service");
        return false;
    }

    public final int n() {
        if (this.f == null) {
            int i = hxk.c;
            this.f = Integer.valueOf(hxz.j(z()) / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
        }
        return this.f.intValue();
    }

    /* access modifiers changed from: package-private */
    public final String o() {
        byte[] bArr = new byte[16];
        e().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    static boolean b(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null) {
            return str.equals(str2);
        }
        return false;
    }

    static boolean f(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* access modifiers changed from: package-private */
    public final int b(String str) {
        if (!a("event", str)) {
            return 2;
        }
        if (!a("event", swp.a, str)) {
            return 13;
        }
        v();
        if (a("event", 40, str)) {
            return 0;
        }
        return 2;
    }

    /* access modifiers changed from: package-private */
    public final int c(String str) {
        if (!a("user property", str)) {
            return 6;
        }
        if (!a("user property", swr.a, str)) {
            return 15;
        }
        v();
        if (a("user property", 24, str)) {
            return 0;
        }
        return 6;
    }

    /* access modifiers changed from: package-private */
    public final boolean e(String str) {
        h();
        if (jni.b(z()).a(str) == 0) {
            return true;
        }
        E().j.a("Permission not granted", str);
        return false;
    }

    private final Object a(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(!((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return a(String.valueOf(obj), i, z);
            }
            if (!ayij.b() || !v().a(sud.aN) || !v().a(sud.aM) || !z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle a2 = a((Bundle) parcelable);
                    if (!a2.isEmpty()) {
                        arrayList.add(a2);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public final long d() {
        long andIncrement;
        long j;
        if (this.d.get() == 0) {
            synchronized (this.d) {
                long nextLong = new Random(System.nanoTime() ^ A().a()).nextLong();
                int i = this.e + 1;
                this.e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.d) {
            this.d.compareAndSet(-1, 1);
            andIncrement = this.d.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: package-private */
    public final int b(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = b("user property referrer", str, i(str), obj);
        } else {
            z = b("user property", str, i(str), obj);
        }
        return !z ? 7 : 0;
    }

    /* access modifiers changed from: package-private */
    public final Object c(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return a(i(str), obj, true, false);
        }
        return a(i(str), obj, false, false);
    }

    /* access modifiers changed from: package-private */
    public final boolean c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            ayjy.c();
            if (TextUtils.isEmpty(str2)) {
                if (this.x.j()) {
                    E().e.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (h(str2)) {
                return true;
            } else {
                E().e.a("Invalid admob_app_id. Analytics disabled.", sut.a(str2));
                return false;
            }
        } else if (h(str)) {
            return true;
        } else {
            if (this.x.j()) {
                E().e.a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", sut.a(str));
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b2 = jni.b(context).b(str, 64);
            if (b2 == null || b2.signatures == null || b2.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b2.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e2) {
            E().c.a("Error obtaining certificate", e2);
            return true;
        } catch (PackageManager.NameNotFoundException e3) {
            E().c.a("Package name not found", e3);
            return true;
        }
    }

    static boolean a(Context context) {
        iva.a((Object) context);
        if (Build.VERSION.SDK_INT >= 24) {
            return c(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return c(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    static final boolean a(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                E().h.a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    static boolean a(String str) {
        iva.c(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    private static boolean a(String str, String[] strArr) {
        iva.a((Object) strArr);
        for (String b2 : strArr) {
            if (b(str, b2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int a(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z) {
        int i;
        int i2;
        String str4 = str3;
        Object obj2 = obj;
        Bundle bundle2 = bundle;
        h();
        if (!ayij.b() || !v().a(sud.aO)) {
            if (z) {
                v();
                if (!a("param", str4, (int) ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, obj2)) {
                    return 17;
                }
            }
            i = 0;
        } else if (!b(obj)) {
            i = 0;
        } else if (!z) {
            return 21;
        } else {
            if (!a(str4, swq.c)) {
                return 20;
            }
            sye l = this.x.l();
            l.h();
            l.l();
            if (l.s() && l.x().n() < 200900) {
                return 25;
            }
            v();
            if (!a("param", str4, 200, obj2)) {
                v();
                if (obj2 instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj2;
                    if (parcelableArr.length > 200) {
                        bundle2.putParcelableArray(str4, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                    i = 17;
                } else {
                    if (obj2 instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj2;
                        if (arrayList.size() > 200) {
                            bundle2.putParcelableArrayList(str4, new ArrayList(arrayList.subList(0, 200)));
                        }
                    }
                    i = 17;
                }
            } else {
                i = 0;
            }
        }
        String str5 = str;
        if ((!v().b(str, sud.J) || !f(str2)) && !f(str3)) {
            v();
            i2 = 100;
        } else {
            v();
            i2 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (b("param", str4, i2, obj2)) {
            return i;
        }
        if (!z) {
            return 4;
        }
        boolean z2 = ayij.b() && v().a(sud.aN);
        if (!(obj2 instanceof Bundle)) {
            if (obj2 instanceof Parcelable[]) {
                for (Parcelable parcelable : (Parcelable[]) obj2) {
                    if (!(parcelable instanceof Bundle)) {
                        E().h.a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str4);
                        return 4;
                    }
                    if (z2) {
                        a(str, str2, str3, (Bundle) parcelable, list);
                    }
                }
            } else if (!(obj2 instanceof ArrayList)) {
                return 4;
            } else {
                ArrayList arrayList2 = (ArrayList) obj2;
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj3 = arrayList2.get(i3);
                    if (!(obj3 instanceof Bundle)) {
                        E().h.a("All ArrayList elements must be of type Bundle. Value type, name", obj3.getClass(), str4);
                        return 4;
                    }
                    if (z2) {
                        a(str, str2, str3, (Bundle) obj3, list);
                    }
                }
            }
        } else if (z2) {
            a(str, str2, str3, (Bundle) obj2, list);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final long a(Context context, String str) {
        h();
        iva.a((Object) context);
        iva.c(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest f2 = f();
        if (f2 == null) {
            E().c.a("Could not get MD5 instance");
            return -1;
        } else if (packageManager == null) {
            return 0;
        } else {
            try {
                if (b(context, str)) {
                    return 0;
                }
                PackageInfo b2 = jni.b(context).b(z().getPackageName(), 64);
                if (b2.signatures != null && b2.signatures.length > 0) {
                    return a(f2.digest(b2.signatures[0].toByteArray()));
                }
                E().f.a("Could not get signatures");
                return -1;
            } catch (PackageManager.NameNotFoundException e2) {
                E().c.a("Package name not found", e2);
                return 0;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            E().f.a("Install referrer url isn't a hierarchical URI", e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a2 = a(str, bundle.get(str));
                if (a2 == null) {
                    E().h.a("Param value can't be null", y().b(str));
                } else {
                    a(bundle2, str, a2);
                }
            }
        }
        return bundle2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List r23, boolean r24) {
        /*
            r19 = this;
            r8 = r19
            r9 = r21
            r10 = r22
            r11 = r23
            boolean r0 = defpackage.ayij.b()
            r12 = 0
            if (r0 == 0) goto L_0x001e
            spg r0 = r19.v()
            suc r1 = defpackage.sud.aO
            boolean r0 = r0.a((defpackage.suc) r1)
            if (r0 == 0) goto L_0x001e
            r0 = 1
            r13 = 1
            goto L_0x001f
        L_0x001e:
            r13 = 0
        L_0x001f:
            if (r13 == 0) goto L_0x0029
            java.lang.String[] r0 = defpackage.swp.c
            boolean r0 = a((java.lang.String) r9, (java.lang.String[]) r0)
            r14 = r0
            goto L_0x002b
        L_0x0029:
            r14 = r24
        L_0x002b:
            if (r10 == 0) goto L_0x011b
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r10)
            r19.v()
            defpackage.spg.p()
            spg r0 = r19.v()
            suc r1 = defpackage.sud.ab
            r6 = r20
            boolean r0 = r0.b(r6, r1)
            if (r0 == 0) goto L_0x0050
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            goto L_0x0054
        L_0x0050:
            java.util.Set r0 = r22.keySet()
        L_0x0054:
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
        L_0x005a:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0118
            java.lang.Object r0 = r16.next()
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            if (r11 == 0) goto L_0x0072
            boolean r0 = r11.contains(r5)
            if (r0 != 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r0 = 0
            goto L_0x0076
        L_0x0072:
            int r0 = r8.d(r5)
        L_0x0076:
            if (r0 != 0) goto L_0x0105
            java.lang.Object r4 = r10.get(r5)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r5
            r15 = r5
            r5 = r7
            r6 = r23
            r18 = r7
            r7 = r14
            int r0 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            if (r13 == 0) goto L_0x009e
            r1 = 17
            if (r0 != r1) goto L_0x009e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r2 = r18
            r8.a((android.os.Bundle) r2, (int) r1, (java.lang.String) r15, (java.lang.Object) r0)
            goto L_0x00bc
        L_0x009e:
            r2 = r18
            if (r0 == 0) goto L_0x00bc
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x00bc
            r1 = 21
            if (r0 != r1) goto L_0x00b0
            r5 = r9
            goto L_0x00b1
        L_0x00b0:
            r5 = r15
        L_0x00b1:
            java.lang.Object r1 = r10.get(r15)
            r8.a((android.os.Bundle) r2, (int) r0, (java.lang.String) r5, (java.lang.Object) r1)
            r2.remove(r15)
            goto L_0x0113
        L_0x00bc:
            boolean r0 = a((java.lang.String) r15)
            if (r0 == 0) goto L_0x0113
            int r0 = r17 + 1
            r1 = 25
            if (r0 <= r1) goto L_0x0100
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 48
            r3.<init>(r4)
            java.lang.String r4 = "Event can't contain more than "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " params"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            sut r3 = r19.E()
            sur r3 = r3.e
            suk r4 = r19.y()
            java.lang.String r4 = r4.a((java.lang.String) r9)
            suk r5 = r19.y()
            java.lang.String r5 = r5.a((android.os.Bundle) r10)
            r3.a(r1, r4, r5)
            r1 = 5
            a((android.os.Bundle) r2, (int) r1)
            r2.remove(r15)
        L_0x0100:
            r6 = r20
            r17 = r0
            goto L_0x0115
        L_0x0105:
            r15 = r5
            r2 = r7
            r1 = 3
            if (r0 != r1) goto L_0x010c
            r5 = r15
            goto L_0x010d
        L_0x010c:
            r5 = 0
        L_0x010d:
            r8.a((android.os.Bundle) r2, (int) r0, (java.lang.String) r15, (java.lang.Object) r5)
            r2.remove(r15)
        L_0x0113:
            r6 = r20
        L_0x0115:
            r7 = r2
            goto L_0x005a
        L_0x0118:
            r2 = r7
            r15 = r2
            goto L_0x011c
        L_0x011b:
            r15 = 0
        L_0x011c:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.szj.a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final EventParcel a(String str, String str2, Bundle bundle, String str3, long j) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (b(str2) == 0) {
            Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
            bundle2.putString("_o", str3);
            return new EventParcel(str2, new EventParams(a(a(str, str2, bundle2, Collections.singletonList("_o"), false))), str3, j);
        }
        E().c.a("Invalid conditional property event name", y().c(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public final Object a(String str, Object obj) {
        boolean equals = "_ev".equals(str);
        int i = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (equals) {
            v();
            return a((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, obj, true, true);
        }
        if (f(str)) {
            v();
        } else {
            v();
            i = 100;
        }
        return a(i, obj, false, true);
    }

    public final String a(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    public final URL a(long j, String str, String str2, long j2) {
        try {
            iva.c(str2);
            iva.c(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(j), Integer.valueOf(n())}), str2, str, Long.valueOf(j2)});
            if (str.equals(v().a("debug.deferred.deeplink", ""))) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e2) {
            E().c.a("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
            return null;
        }
    }

    public final void a(int i, String str, String str2, int i2) {
        a((String) null, i, str, str2, i2);
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle, int i, String str, Object obj) {
        if (a(bundle, i)) {
            v();
            bundle.putString("_ev", a(str, 40, true));
            if (obj != null) {
                iva.a((Object) bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle, String str, Object obj) {
        String str2;
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (ayij.b() && v().a(sud.aN) && v().a(sud.aM) && (obj instanceof Bundle[])) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            if (obj != null) {
                str2 = obj.getClass().getSimpleName();
            } else {
                str2 = null;
            }
            E().h.a("Not putting event parameter. Invalid value type. name, type", y().b(str), str2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        a(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        svv svv = this.x;
        if (!svv.f.a) {
            svv.e().a("auto", "_err", bundle);
        } else if (!TextUtils.isEmpty(str)) {
            this.x.e().a("auto", "_err", bundle, str);
        } else {
            this.x.E().c.a("Null appId when logging error event on package side");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2, String str3, Bundle bundle, List list) {
        int i;
        int i2;
        String str4;
        String str5;
        int i3;
        String str6;
        int i4;
        String str7 = str2;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle2 != null) {
            boolean a2 = v().a(sud.aO);
            if (a2) {
                v();
                i = 0;
            } else {
                v();
                spg.p();
                i = 25;
            }
            int i5 = 0;
            for (String str8 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str8)) {
                    i2 = d(str8);
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    if (b(bundle2.get(str8))) {
                        E().h.a("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str7, str3, str8);
                        i3 = 22;
                        str5 = str8;
                    } else {
                        String str9 = str3;
                        str5 = str8;
                        i3 = a(str, str2, str8, bundle2.get(str8), bundle, list, false);
                    }
                    if (i3 != 0 && !"_ev".equals(str5)) {
                        a(bundle2, i3, str5, bundle2.get(str5));
                        bundle2.remove(str5);
                    } else if (a(str5) && (!a2 || !a(str5, swq.d))) {
                        int i6 = i5 + 1;
                        if (i6 > i) {
                            if (!a2) {
                                StringBuilder sb = new StringBuilder(63);
                                sb.append("Child bundles can't contain more than ");
                                sb.append(i);
                                sb.append(" custom params");
                                str6 = sb.toString();
                            } else {
                                str6 = "Item cannot contain custom parameters";
                            }
                            E().e.a(str6, y().a(str7), y().a(bundle2));
                            if (!a2) {
                                i4 = 5;
                            } else {
                                i4 = 23;
                            }
                            a(bundle2, i4);
                            bundle2.remove(str5);
                        }
                        i5 = i6;
                    }
                } else {
                    String str10 = str8;
                    if (i2 == 3) {
                        str4 = str10;
                    } else {
                        str4 = null;
                    }
                    a(bundle2, i2, str10, (Object) str4);
                    bundle2.remove(str10);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, int i, String str2) {
        if (str2 == null) {
            E().e.a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            E().e.a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, String str2) {
        if (str2 == null) {
            E().e.a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            E().e.a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt) && codePointAt != 95) {
                E().e.a("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    E().e.a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, String str2, int i, Object obj) {
        int i2;
        if (obj instanceof Parcelable[]) {
            i2 = ((Parcelable[]) obj).length;
        } else if (!(obj instanceof ArrayList)) {
            return true;
        } else {
            i2 = ((ArrayList) obj).size();
        }
        if (i2 <= i) {
            return true;
        }
        E().h.a("Parameter array is too long; discarded. Value kind, name, array length", str, str2, Integer.valueOf(i2));
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (!TextUtils.isEmpty(str4)) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, String[] strArr, String str2) {
        if (str2 != null) {
            iva.a((Object) str2);
            String[] strArr2 = b;
            int length = strArr2.length;
            int i = 0;
            while (i < length) {
                if (!str2.startsWith(strArr2[i])) {
                    i++;
                } else {
                    E().e.a("Name starts with reserved prefix. Type, name", str, str2);
                    return false;
                }
            }
            if (strArr == null || !a(str2, strArr)) {
                return true;
            }
            E().e.a("Name is reserved. Type, name", str, str2);
            return false;
        }
        E().e.a("Name is required and can't be null. Type", str);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final byte[] a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle[] a(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }
}
