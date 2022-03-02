package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import java.io.File;
import java.net.IDN;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* renamed from: bauo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bauo extends ICronetEngineBuilder {
    private static final Pattern c = Pattern.compile("^[0-9\\.]*$");
    public String a;
    public int b = 20;
    private final Context d;
    private final List e = new LinkedList();
    private final List f = new LinkedList();
    private String g;

    public bauo(Context context) {
        this.d = context.getApplicationContext();
        a(0);
    }

    public final void a(int i) {
        if (i == 3 || i == 2) {
            if (this.g == null) {
                throw new IllegalArgumentException("Storage path must be set");
            }
        } else if (this.g != null) {
            throw new IllegalArgumentException("Storage path must not be set");
        }
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalArgumentException("Unknown cache mode");
        }
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        if (str == null) {
            throw new NullPointerException("The hostname cannot be null");
        } else if (set == null) {
            throw new NullPointerException("The set of SHA256 pins cannot be null");
        } else if (date == null) {
            throw new NullPointerException("The pin expiration date cannot be null");
        } else if (c.matcher(str).matches()) {
            throw new IllegalArgumentException("Hostname " + str + " is illegal. A hostname should not consist of digits and/or dots only.");
        } else if (str.length() <= 255) {
            try {
                IDN.toASCII(str, 2);
                HashMap hashMap = new HashMap();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    byte[] bArr = (byte[]) it.next();
                    if (bArr == null || bArr.length != 32) {
                        throw new IllegalArgumentException("Public key pin is invalid");
                    }
                    hashMap.put(Base64.encodeToString(bArr, 0), bArr);
                }
                List list = this.f;
                byte[][] bArr2 = (byte[][]) hashMap.values().toArray(new byte[hashMap.size()][]);
                list.add(new baum());
                return this;
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("Hostname " + str + " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123.");
            }
        } else {
            throw new IllegalArgumentException("Hostname " + str + " is too long. The name of the host does not comply with RFC 1122 and RFC 1123.");
        }
    }

    public final ExperimentalCronetEngine build() {
        if (this.a == null) {
            this.a = getDefaultUserAgent();
        }
        return new bauu(this);
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        a(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    public final String getDefaultUserAgent() {
        int i;
        Context context = this.d;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append('/');
        synchronized (bawk.a) {
            if (bawk.b == 0) {
                try {
                    bawk.b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalStateException("Cannot determine package version");
                }
            }
            i = bawk.b;
        }
        sb.append(i);
        sb.append(" (Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            sb.append("; ");
            sb.append(str);
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            sb.append("; Build/");
            sb.append(str2);
        }
        sb.append("; Cronet/82.0.4081.3)");
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        if (new File(str).isDirectory()) {
            this.g = str;
            return this;
        }
        throw new IllegalArgumentException("Storage path must be set to existing directory");
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        if (i > 19 || i < -20) {
            throw new IllegalArgumentException("Thread priority invalid");
        }
        this.b = i;
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.a = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        if (!str.contains("/")) {
            this.e.add(new baun());
            return this;
        }
        throw new IllegalArgumentException("Illegal QUIC Hint Host: " + str);
    }
}
