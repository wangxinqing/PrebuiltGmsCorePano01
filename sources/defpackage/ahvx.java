package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: ahvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahvx {
    static final ajrh a = new ajrh("CollectionLib");
    public static final /* synthetic */ int b = 0;

    public static ajrh a(ajrh ajrh) {
        return ajrh == null ? a : ajrh;
    }

    static String b(String str) {
        return String.format("%s/%s", new Object[]{"sglclt", str});
    }

    public static aqek a(aqek aqek) {
        try {
            aqek aqek2 = new aqek(aqek.b);
            aqek2.a(aqek.b());
            if (aqek2.a()) {
                return aqek2;
            }
            throw new IOException("isValid returned after parsing proto");
        } catch (IOException e) {
            throw new RuntimeException("Could not serialize and parse ProtoBuf.");
        }
    }

    static Map b() {
        return Collections.synchronizedMap(new HashMap());
    }

    static byte[] b(byte[] bArr) {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read != -1) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                byteArrayOutputStream.close();
                gZIPInputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    static List a() {
        return Collections.synchronizedList(new ArrayList());
    }

    public static boolean a(String str) {
        return str == null || str.trim().equals("");
    }

    static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}
