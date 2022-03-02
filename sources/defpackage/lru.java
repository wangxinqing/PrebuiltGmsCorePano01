package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: lru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lru {
    private static final ith a = new ith("HashUtils", "");
    private static final Pattern b = Pattern.compile("[0-9A-F]+");

    public static String a(InputStream inputStream) {
        MessageDigest b2 = jhg.b("SHA-256");
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                return jjp.d(b2.digest());
            }
            b2.update(bArr, 0, read);
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        try {
            String valueOf = String.valueOf(a((InputStream) new ByteArrayInputStream(str.getBytes())));
            return valueOf.length() == 0 ? new String("UUID#") : "UUID#".concat(valueOf);
        } catch (IOException e) {
            a.b("HashUtils", String.format(Locale.US, "Could not compute signature for string %s", new Object[]{str}), (Throwable) e);
            return null;
        }
    }

    public static String a(String str) {
        return a(str, 64);
    }

    public static String a(String str, int i) {
        String upperCase = str.toUpperCase(Locale.US);
        if (!b.matcher(upperCase).matches()) {
            throw new IllegalArgumentException("hash contains invalid characters; only [0-9a-fA-F] are allowed");
        } else if (upperCase.length() == i) {
            return upperCase;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "hash must be %d characters in length, but was %d", new Object[]{Integer.valueOf(i), Integer.valueOf(upperCase.length())}));
        }
    }
}
