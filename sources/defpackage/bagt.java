package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bagt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bagt {
    public static final baab a = baab.a("grpc-timeout", (azzx) new bags());
    public static final baab b = baab.a("grpc-encoding", baaf.a);
    public static final baab c = azyz.a("grpc-accept-encoding", new bagq());
    public static final baab d = baab.a("content-encoding", baaf.a);
    public static final baab e = azyz.a("accept-encoding", new bagq());
    public static final baab f = baab.a("content-type", baaf.a);
    public static final baab g = baab.a("te", baaf.a);
    public static final baab h = baab.a("user-agent", baaf.a);
    public static final long i = TimeUnit.SECONDS.toNanos(20);
    public static final babb j = new bakk();
    public static final azxg k = azxg.a("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
    public static final balj l = new bagn();
    public static final balj m = new bago();
    public static final amsv n = new bagp();
    private static final Logger o = Logger.getLogger(bagt.class.getName());

    static {
        Charset.forName("US-ASCII");
        amsk.a(',').b();
        TimeUnit.HOURS.toNanos(2);
        TimeUnit.SECONDS.toNanos(20);
    }

    private bagt() {
    }

    public static babj a(int i2) {
        babg babg;
        if (i2 < 100 || i2 >= 200) {
            if (i2 != 400) {
                if (i2 == 401) {
                    babg = babg.UNAUTHENTICATED;
                } else if (i2 == 403) {
                    babg = babg.PERMISSION_DENIED;
                } else if (i2 != 404) {
                    if (i2 != 429) {
                        if (i2 != 431) {
                            switch (i2) {
                                case 502:
                                case 503:
                                case 504:
                                    break;
                                default:
                                    babg = babg.UNKNOWN;
                                    break;
                            }
                        }
                    }
                    babg = babg.UNAVAILABLE;
                } else {
                    babg = babg.UNIMPLEMENTED;
                }
            }
            babg = babg.INTERNAL;
        } else {
            babg = babg.INTERNAL;
        }
        babj a2 = babg.a();
        StringBuilder sb = new StringBuilder(28);
        sb.append("HTTP status code ");
        sb.append(i2);
        return a2.a(sb.toString());
    }

    public static URI b(String str) {
        amrl.a((Object) str, (Object) "authority");
        try {
            return new URI((String) null, str, (String) null, (String) null, (String) null);
        } catch (URISyntaxException e2) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid authority: ") : "Invalid authority: ".concat(valueOf), e2);
        }
    }

    public static ThreadFactory c(String str) {
        aosj aosj = new aosj();
        aosj.a();
        aosj.a(str);
        return aosj.a(aosj);
    }

    static baei a(azzh azzh, boolean z) {
        baei baei;
        azzl azzl = azzh.b;
        if (azzl != null) {
            bajg bajg = (bajg) azzl;
            amrl.b(bajg.f, (Object) "Subchannel is not started");
            baei = bajg.e.a();
        } else {
            baei = null;
        }
        if (baei != null) {
            return baei;
        }
        if (!azzh.c.a()) {
            if (azzh.d) {
                return new bagf(azzh.c, baeg.DROPPED);
            }
            if (!z) {
                return new bagf(azzh.c, baeg.PROCESSED);
            }
        }
        return null;
    }

    public static String a(String str, int i2) {
        try {
            return new URI((String) null, (String) null, str, i2, (String) null, (String) null, (String) null).getAuthority();
        } catch (URISyntaxException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
            sb.append("Invalid host or port: ");
            sb.append(str);
            sb.append(" ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString(), e2);
        }
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append("/1.29.0-SNAPSHOT");
        return sb.toString();
    }

    public static String a(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            return inetSocketAddress.getHostName();
        }
    }

    static void a(bajq bajq) {
        while (true) {
            InputStream a2 = bajq.a();
            if (a2 != null) {
                a(a2);
            } else {
                return;
            }
        }
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                o.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", e2);
            }
        }
    }

    public static boolean a(azxh azxh) {
        return !Boolean.TRUE.equals(azxh.a(k));
    }

    public static boolean a(String str) {
        char charAt;
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("application/grpc")) {
                if (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';') {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
