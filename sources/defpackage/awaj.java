package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Array;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: awaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awaj {
    public static final byte[] a = new byte[0];
    public static final String[] b = new String[0];
    public static final Charset c = Charset.forName("UTF-8");

    public static batg a(batg batg) {
        try {
            return batg.a(MessageDigest.getInstance("SHA-1").digest(batg.f()));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static ThreadFactory b(String str) {
        return new awai(str);
    }

    public static String[] b(String[] strArr, String str) {
        int length = strArr.length;
        int i = length + 1;
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        strArr2[i - 1] = str;
        return strArr2;
    }

    public static String a(avzd avzd) {
        if (avzd.c == avzd.a(avzd.a)) {
            return avzd.b;
        }
        String str = avzd.b;
        int i = avzd.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }

    public static String a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt > 31 && codePointAt < 127) {
                i += Character.charCount(codePointAt);
            } else {
                batd batd = new batd();
                batd.a(str, 0, i);
                while (i < length) {
                    int codePointAt2 = str.codePointAt(i);
                    int i2 = 63;
                    if (codePointAt2 > 31 && codePointAt2 < 127) {
                        i2 = codePointAt2;
                    }
                    batd.g(i2);
                    i += Character.charCount(codePointAt2);
                }
                return batd.k();
            }
        }
        return str;
    }

    public static List a(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static List a(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static Map a(Map map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static void a(long j, long j2) {
        if (j2 < 0 || j < 0 || j < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    public static void a(Closeable closeable, Closeable closeable2) {
        try {
            closeable.close();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            closeable2.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw th;
        } else {
            throw new AssertionError(th);
        }
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!a(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
            }
        }
    }

    public static boolean a(baua baua, int i, TimeUnit timeUnit) {
        long j;
        long nanoTime = System.nanoTime();
        if (baua.bu().f()) {
            j = baua.bu().g() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        baua.bu().b(Math.min(j, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            batd batd = new batd();
            while (baua.c(batd, 2048) != -1) {
                batd.n();
            }
            if (j != Long.MAX_VALUE) {
                baua.bu().b(nanoTime + j);
                return true;
            }
            baua.bu().i();
            return true;
        } catch (InterruptedIOException e) {
            if (j != Long.MAX_VALUE) {
                baua.bu().b(nanoTime + j);
                return false;
            }
            baua.bu().i();
            return false;
        } catch (Throwable th) {
            if (j != Long.MAX_VALUE) {
                baua.bu().b(nanoTime + j);
            } else {
                baua.bu().i();
            }
            throw th;
        }
    }

    public static boolean a(baua baua, TimeUnit timeUnit) {
        try {
            return a(baua, 100, timeUnit);
        } catch (IOException e) {
            return false;
        }
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean a(String[] strArr, String str) {
        return Arrays.asList(strArr).contains(str);
    }

    public static Object[] a(Class cls, Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            int length = objArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Object obj2 = objArr2[i];
                if (obj.equals(obj2)) {
                    arrayList.add(obj2);
                    break;
                }
                i++;
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, arrayList.size()));
    }
}
