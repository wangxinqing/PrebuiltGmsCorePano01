package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: apdz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class apdz {
    private static final apdx a;
    private static final Map b;
    private static final Map c;
    private static final Map d;
    private static final Map e;
    private static final Map f;
    private static final Map g;
    private static final Map h;
    private static final Map i;
    private static final Map j;
    private static final Map k;
    private static final Map l;
    private static final Map m;
    private static final Map n;
    private static final Map o;
    private static final Map p;

    static {
        apdx B = B();
        a = B;
        B.a();
        HashMap hashMap = new HashMap();
        hashMap.put(0, "");
        hashMap.put(1, "nowidecg");
        hashMap.put(2, "widecg");
        b = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(0, "");
        hashMap2.put(4, "lowdr");
        hashMap2.put(8, "highdr");
        c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(0, "");
        hashMap3.put(120, "ldpi");
        hashMap3.put(160, "mdpi");
        hashMap3.put(213, "tvdpi");
        hashMap3.put(240, "hdpi");
        hashMap3.put(320, "xhdpi");
        hashMap3.put(480, "xxhdpi");
        hashMap3.put(640, "xxxhdpi");
        hashMap3.put(65534, "anydpi");
        hashMap3.put(65535, "nodpi");
        d = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(1, "nokeys");
        hashMap4.put(2, "qwerty");
        hashMap4.put(3, "12key");
        e = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(1, "keysexposed");
        hashMap5.put(2, "keyshidden");
        hashMap5.put(3, "keyssoft");
        f = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(1, "nonav");
        hashMap6.put(2, "dpad");
        hashMap6.put(3, "trackball");
        hashMap6.put(4, "wheel");
        g = Collections.unmodifiableMap(hashMap6);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(4, "navexposed");
        hashMap7.put(8, "navhidden");
        h = Collections.unmodifiableMap(hashMap7);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(1, "port");
        hashMap8.put(2, "land");
        i = Collections.unmodifiableMap(hashMap8);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(64, "ldltr");
        hashMap9.put(128, "ldrtl");
        j = Collections.unmodifiableMap(hashMap9);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(16, "notlong");
        hashMap10.put(32, "long");
        k = Collections.unmodifiableMap(hashMap10);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(1, "notround");
        hashMap11.put(2, "round");
        l = Collections.unmodifiableMap(hashMap11);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(1, "small");
        hashMap12.put(2, "normal");
        hashMap12.put(3, "large");
        hashMap12.put(4, "xlarge");
        m = Collections.unmodifiableMap(hashMap12);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(1, "notouch");
        hashMap13.put(3, "finger");
        n = Collections.unmodifiableMap(hashMap13);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(16, "notnight");
        hashMap14.put(32, "night");
        o = Collections.unmodifiableMap(hashMap14);
        HashMap hashMap15 = new HashMap();
        hashMap15.put(2, "desk");
        hashMap15.put(3, "car");
        hashMap15.put(4, "television");
        hashMap15.put(5, "appliance");
        hashMap15.put(6, "watch");
        hashMap15.put(7, "vrheadset");
        p = Collections.unmodifiableMap(hashMap15);
    }

    public static apdx B() {
        apdx apdx = new apdx();
        apdx.q(52);
        apdx.e(0);
        apdx.g(0);
        apdx.a = new byte[2];
        apdx.b = new byte[2];
        apdx.i(0);
        apdx.s(0);
        apdx.b(0);
        apdx.d(0);
        apdx.h(0);
        apdx.c(0);
        apdx.n(0);
        apdx.j(0);
        apdx.p(0);
        apdx.f(0);
        apdx.l(0);
        apdx.t(0);
        apdx.r(0);
        apdx.o(0);
        apdx.k(0);
        apdx.c = new byte[4];
        apdx.d = new byte[8];
        apdx.m(0);
        apdx.a(0);
        apdx.a(new byte[0]);
        return apdx;
    }

    private final String C() {
        return a(d(), 97);
    }

    private final String D() {
        return a(e(), 48);
    }

    static apdz a(ByteBuffer byteBuffer) {
        boolean z;
        int position = byteBuffer.position();
        int i2 = byteBuffer.getInt();
        if (i2 >= 28) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, "Expected minimum ResourceConfiguration size of %s, got %s", 28, i2);
        apdx B = B();
        B.q(i2);
        B.e((char) byteBuffer.getShort());
        B.g((char) byteBuffer.getShort());
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[2];
        byteBuffer.get(bArr2);
        B.a = bArr;
        B.b = bArr2;
        B.i(aoop.a(byteBuffer.get()));
        B.s(aoop.a(byteBuffer.get()));
        B.b((char) byteBuffer.getShort());
        B.d(aoop.a(byteBuffer.get()));
        B.h(aoop.a(byteBuffer.get()));
        B.c(aoop.a(byteBuffer.get()));
        byteBuffer.get();
        B.n((char) byteBuffer.getShort());
        B.j((char) byteBuffer.getShort());
        B.p((char) byteBuffer.getShort());
        B.f((char) byteBuffer.getShort());
        if (i2 >= 32) {
            B.l(aoop.a(byteBuffer.get()));
            B.t(aoop.a(byteBuffer.get()));
            B.r((char) byteBuffer.getShort());
        }
        if (i2 >= 36) {
            B.o((char) byteBuffer.getShort());
            B.k((char) byteBuffer.getShort());
        }
        if (i2 >= 48) {
            byte[] bArr3 = new byte[4];
            byteBuffer.get(bArr3);
            byte[] bArr4 = new byte[8];
            byteBuffer.get(bArr4);
            B.c = bArr3;
            B.d = bArr4;
        }
        if (i2 >= 52) {
            B.m(aoop.a(byteBuffer.get()));
            B.a(aoop.a(byteBuffer.get()));
            byteBuffer.getShort();
        }
        byte[] bArr5 = new byte[(i2 - (byteBuffer.position() - position))];
        byteBuffer.get(bArr5);
        B.a(bArr5);
        return B.a();
    }

    public final String A() {
        return a(v());
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract byte[] d();

    public abstract byte[] e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract int s();

    public abstract int t();

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        apdx apdx = a;
        apdx.q(a());
        apdx.a(y());
        if (apdx.a().equals(this) && Arrays.equals(y(), new byte[y().length])) {
            return "default";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        apdy apdy = apdy.MCC;
        if (b() != 0) {
            int b2 = b();
            StringBuilder sb = new StringBuilder(14);
            sb.append("mcc");
            sb.append(b2);
            str = sb.toString();
        } else {
            str = "";
        }
        linkedHashMap.put(apdy, str);
        apdy apdy2 = apdy.MNC;
        if (c() != 0) {
            int c2 = c();
            StringBuilder sb2 = new StringBuilder(14);
            sb2.append("mnc");
            sb2.append(c2);
            str2 = sb2.toString();
        } else {
            str2 = "";
        }
        linkedHashMap.put(apdy2, str2);
        linkedHashMap.put(apdy.LANGUAGE_STRING, C());
        linkedHashMap.put(apdy.LOCALE_SCRIPT_STRING, z());
        apdy apdy3 = apdy.REGION_STRING;
        if (!D().isEmpty()) {
            String valueOf = String.valueOf(D());
            str3 = valueOf.length() == 0 ? new String("r") : "r".concat(valueOf);
        } else {
            str3 = "";
        }
        linkedHashMap.put(apdy3, str3);
        linkedHashMap.put(apdy.LOCALE_VARIANT_STRING, A());
        linkedHashMap.put(apdy.SCREEN_LAYOUT_DIRECTION, (String) a(j, Integer.valueOf(p() & 192), ""));
        apdy apdy4 = apdy.SMALLEST_SCREEN_WIDTH_DP;
        if (r() != 0) {
            int r = r();
            StringBuilder sb3 = new StringBuilder(15);
            sb3.append("sw");
            sb3.append(r);
            sb3.append("dp");
            str4 = sb3.toString();
        } else {
            str4 = "";
        }
        linkedHashMap.put(apdy4, str4);
        apdy apdy5 = apdy.SCREEN_WIDTH_DP;
        if (s() != 0) {
            int s = s();
            StringBuilder sb4 = new StringBuilder(14);
            sb4.append("w");
            sb4.append(s);
            sb4.append("dp");
            str5 = sb4.toString();
        } else {
            str5 = "";
        }
        linkedHashMap.put(apdy5, str5);
        apdy apdy6 = apdy.SCREEN_HEIGHT_DP;
        if (t() != 0) {
            int t = t();
            StringBuilder sb5 = new StringBuilder(14);
            sb5.append("h");
            sb5.append(t);
            sb5.append("dp");
            str6 = sb5.toString();
        } else {
            str6 = "";
        }
        linkedHashMap.put(apdy6, str6);
        linkedHashMap.put(apdy.SCREEN_LAYOUT_SIZE, (String) a(m, Integer.valueOf(p() & 15), ""));
        linkedHashMap.put(apdy.SCREEN_LAYOUT_LONG, (String) a(k, Integer.valueOf(p() & 48), ""));
        linkedHashMap.put(apdy.SCREEN_LAYOUT_ROUND, (String) a(l, Integer.valueOf(w() & 3), ""));
        linkedHashMap.put(apdy.COLOR_MODE_HDR, (String) a(c, Integer.valueOf(x() & 12), ""));
        linkedHashMap.put(apdy.COLOR_MODE_WIDE_COLOR_GAMUT, (String) a(b, Integer.valueOf(x() & 3), ""));
        linkedHashMap.put(apdy.ORIENTATION, (String) a(i, Integer.valueOf(f()), ""));
        linkedHashMap.put(apdy.UI_MODE_TYPE, (String) a(p, Integer.valueOf(q() & 15), ""));
        linkedHashMap.put(apdy.UI_MODE_NIGHT, (String) a(o, Integer.valueOf(q() & 48), ""));
        apdy apdy7 = apdy.DENSITY_DPI;
        Map map = d;
        Integer valueOf2 = Integer.valueOf(h());
        int h2 = h();
        StringBuilder sb6 = new StringBuilder(14);
        sb6.append(h2);
        sb6.append("dpi");
        linkedHashMap.put(apdy7, (String) a(map, valueOf2, sb6.toString()));
        linkedHashMap.put(apdy.TOUCHSCREEN, (String) a(n, Integer.valueOf(g()), ""));
        linkedHashMap.put(apdy.KEYBOARD_HIDDEN, (String) a(f, Integer.valueOf(k() & 3), ""));
        linkedHashMap.put(apdy.KEYBOARD, (String) a(e, Integer.valueOf(i()), ""));
        linkedHashMap.put(apdy.NAVIGATION_HIDDEN, (String) a(h, Integer.valueOf(k() & 12), ""));
        linkedHashMap.put(apdy.NAVIGATION, (String) a(g, Integer.valueOf(j()), ""));
        apdy apdy8 = apdy.SCREEN_SIZE;
        if (l() == 0 && m() == 0) {
            str7 = "";
        } else {
            int l2 = l();
            int m2 = m();
            StringBuilder sb7 = new StringBuilder(23);
            sb7.append(l2);
            sb7.append("x");
            sb7.append(m2);
            str7 = sb7.toString();
        }
        linkedHashMap.put(apdy8, str7);
        if (n() != 0) {
            int n2 = n();
            StringBuilder sb8 = new StringBuilder(12);
            sb8.append("v");
            sb8.append(n2);
            str8 = sb8.toString();
            if (o() != 0) {
                String valueOf3 = String.valueOf(str8);
                int o2 = o();
                StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf3).length() + 12);
                sb9.append(valueOf3);
                sb9.append(".");
                sb9.append(o2);
                str8 = sb9.toString();
            }
        } else {
            str8 = "";
        }
        linkedHashMap.put(apdy.SDK_VERSION, str8);
        String z = z();
        String A = A();
        if (!z.isEmpty() || !A.isEmpty()) {
            StringBuilder sb10 = new StringBuilder("b+");
            sb10.append(C());
            if (!z.isEmpty()) {
                String valueOf4 = String.valueOf(z);
                sb10.append(valueOf4.length() == 0 ? new String("+") : "+".concat(valueOf4));
            }
            String D = D();
            if (!D.isEmpty()) {
                String valueOf5 = String.valueOf(D);
                sb10.append(valueOf5.length() == 0 ? new String("+") : "+".concat(valueOf5));
            }
            if (!A.isEmpty()) {
                String valueOf6 = String.valueOf(A);
                sb10.append(valueOf6.length() == 0 ? new String("+") : "+".concat(valueOf6));
            }
            linkedHashMap.put(apdy.LANGUAGE_STRING, sb10.toString());
            linkedHashMap.remove(apdy.LOCALE_SCRIPT_STRING);
            linkedHashMap.remove(apdy.REGION_STRING);
            linkedHashMap.remove(apdy.LOCALE_VARIANT_STRING);
        }
        Collection values = linkedHashMap.values();
        values.removeAll(Collections.singleton(""));
        return amre.a('-').a((Iterable) values);
    }

    public abstract byte[] u();

    public abstract byte[] v();

    public abstract int w();

    public abstract int x();

    public abstract byte[] y();

    public final String z() {
        return a(u());
    }

    private static final Object a(Map map, Object obj, Object obj2) {
        Object obj3 = map.get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    private static final String a(byte[] bArr) {
        int length = bArr.length;
        int a2 = aooa.a(bArr, (byte) 0, 0, length);
        if (a2 >= 0) {
            length = a2;
        }
        return new String(bArr, 0, length, amqn.a);
    }

    private static String a(byte[] bArr, int i2) {
        boolean z;
        if (bArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "Language or region value must be 2 bytes.");
        byte b2 = bArr[0];
        if (b2 == 0 && bArr[1] == 0) {
            return "";
        }
        if ((aoop.a(b2) & 128) == 0) {
            return new String(bArr, amqn.a);
        }
        return new String(new byte[]{(byte) ((bArr[1] & 31) + i2), (byte) (((bArr[1] & 224) >>> 5) + i2 + ((bArr[0] & 3) << 3)), (byte) (i2 + ((bArr[0] & 124) >>> 2))}, amqn.a);
    }

    public static byte[] a(String str) {
        boolean z;
        byte[] bytes = str.getBytes(amqn.a);
        int length = bytes.length;
        if (length == 2) {
            return bytes;
        }
        byte[] bArr = new byte[2];
        if (length == 3) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z);
        for (int i2 = 0; i2 < length; i2++) {
            byte b2 = bytes[i2];
            amrl.b(b2 >= 97 && b2 <= 122);
        }
        bArr[0] = (byte) (((bytes[2] - 97) << 2) | ((bytes[1] - 97) >> 3) | 128);
        bArr[1] = (byte) (((bytes[1] - 97) << 5) | (bytes[0] - 97));
        return bArr;
    }
}
