package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Vector;

/* renamed from: aqek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqek {
    public static final byte[] a = new byte[0];
    public final aqem b;
    private final aqeu c;
    private aqeu d;

    static {
        new aqej();
    }

    public aqek(aqem aqem) {
        int i;
        this.b = aqem;
        if (aqem != null) {
            int i2 = aqem.a.c;
            if (i2 > 0) {
                i = i2 + 1;
            } else {
                i = 128;
            }
            this.c = new aqeu(i);
            return;
        }
        this.c = new aqeu();
    }

    private static int a(long j) {
        if (j < 0) {
            return 10;
        }
        int i = 1;
        while (j >= 128) {
            i++;
            j >>= 7;
        }
        return i;
    }

    private static int b(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static long b(long j) {
        return (-(j >>> 63)) ^ (j + j);
    }

    private final void c(int i, Object obj) {
        aqem aqem;
        int g = g(i);
        if (g != 16 || this.b != null) {
            if (!(obj instanceof Boolean)) {
                if (!(obj instanceof Long)) {
                    if (!(obj instanceof byte[])) {
                        if (obj instanceof aqek) {
                            if (!(g == 2 || g == 3)) {
                                switch (g) {
                                    case 25:
                                    case 26:
                                    case 27:
                                        break;
                                }
                            }
                            aqem aqem2 = this.b;
                            if (aqem2 == null || aqem2.b(i) == null || (aqem = ((aqek) obj).b) == null || aqem.equals(this.b.b(i))) {
                                return;
                            }
                        } else if ((obj instanceof String) && (g == 2 || g == 25 || g == 28 || g == 36)) {
                            return;
                        }
                    } else if (g == 2 || g == 25 || g == 27 || g == 28 || g == 35 || g == 36) {
                        return;
                    }
                } else if (g != 0 && g != 1 && g != 5) {
                    switch (g) {
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                            return;
                        default:
                            switch (g) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                    return;
                            }
                    }
                } else {
                    return;
                }
            } else if (g == 24 || g == 0) {
                return;
            }
            String valueOf = String.valueOf(this.b);
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65 + String.valueOf(valueOf2).length());
            sb.append("Type mismatch type:");
            sb.append(valueOf);
            sb.append(" tag:");
            sb.append(i);
            sb.append(" tagType: ");
            sb.append(g);
            sb.append(" object: ");
            sb.append(valueOf2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private final Object h(int i, int i2) {
        n(i);
        Object a2 = this.c.a(i);
        int a3 = a(a2);
        if (a3 == 0) {
            return m(i);
        }
        if (a3 <= 1) {
            return a(i, 0, i2, a2);
        }
        throw new IllegalArgumentException();
    }

    private final boolean l(int i) {
        int g = g(i);
        return g == 33 || g == 34;
    }

    private final Object m(int i) {
        aqem aqem;
        int g = g(i);
        if (g == 16 || g == 26 || g == 27 || (aqem = this.b) == null) {
            return null;
        }
        return aqem.b(i);
    }

    private static void n(int i) {
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    private final int o(int i) {
        int g = g(i);
        if (!(g == 0 || g == 1 || g == 2 || g == 3 || g == 5)) {
            switch (g) {
                case 16:
                    break;
                case 17:
                case 22:
                case 32:
                    return 1;
                case 18:
                case 23:
                case 31:
                    return 5;
                case 19:
                case 20:
                case 21:
                case 24:
                case 29:
                case 30:
                case 33:
                case 34:
                    return 0;
                case 25:
                case 27:
                case 28:
                case 35:
                case 36:
                    return 2;
                case 26:
                    return 3;
                default:
                    String valueOf = String.valueOf(this.b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    sb.append("Unsupp.Type:");
                    sb.append(valueOf);
                    sb.append('/');
                    sb.append(i);
                    sb.append('/');
                    sb.append(g);
                    throw new RuntimeException(sb.toString());
            }
        }
        return g;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        try {
            aqek aqek = new aqek(this.b);
            aqek.a(b());
            return aqek;
        } catch (IOException e) {
            throw new RuntimeException("Could not serialize and parse ProtoBuf.");
        }
    }

    public final float d(int i) {
        return Float.intBitsToFloat(b(i));
    }

    public final float e(int i, int i2) {
        return Float.intBitsToFloat(c(i, i2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aqek) {
            aqek aqek = (aqek) obj;
            return a((Object) this.b, (Object) aqek.b) && a((Object) this.c, (Object) aqek.c) && a((Object) this.d, (Object) aqek.d);
        }
    }

    public final aqek f(int i, int i2) {
        return (aqek) a(i, i2, 26);
    }

    public final int g(int i) {
        int i2;
        Integer num;
        aqem aqem = this.b;
        if (aqem != null) {
            i2 = aqem.a(i);
        } else {
            i2 = 16;
        }
        if (i2 == 16) {
            aqeu aqeu = this.d;
            if (aqeu != null) {
                num = (Integer) aqeu.a(i);
            } else {
                num = null;
            }
            if (num != null) {
                i2 = num.intValue();
            }
        }
        if (i2 != 16 || j(i) <= 0) {
            return i2;
        }
        Object a2 = a(i, 0, 16);
        return ((a2 instanceof Long) || (a2 instanceof Boolean)) ? 0 : 2;
    }

    public final int hashCode() {
        return ((((b((Object) this.b) + 31) * 31) + b((Object) this.c)) * 31) + b((Object) this.d);
    }

    public final boolean i(int i) {
        return h(i) || m(i) != null;
    }

    public final int j(int i) {
        if (i >= 0) {
            return a(this.c.a(i));
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final void k(int i) {
        int j = j(i);
        if (j <= 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (j != 1) {
            ((Vector) this.c.a(i)).removeElementAt(0);
        } else {
            this.c.b(i);
        }
    }

    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            a((Writer) stringWriter, 0);
        } catch (IOException e) {
            stringWriter.write(e.toString());
        }
        return stringWriter.toString();
    }

    private final int a(aqeh aqeh) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        aqeh aqeh2 = aqeh;
        aqet a2 = this.c.a();
        int i5 = 0;
        while (a2.a()) {
            int b2 = a2.b();
            int j = j(b2);
            int o = o(b2);
            int i6 = b2 << 3;
            int i7 = i6 | o;
            int i8 = 0;
            int i9 = 0;
            while (i8 < j) {
                i9 += a((OutputStream) aqeh2, (long) i7);
                int i10 = aqeh2.b;
                if (o != 0) {
                    if (o != 1) {
                        if (o == 2) {
                            if (g(b2) == 27) {
                                i4 = 16;
                            } else {
                                i4 = 25;
                            }
                            Object a3 = a(b2, i8, i4);
                            if (a3 instanceof byte[]) {
                                byte[] bArr = (byte[]) a3;
                                a((OutputStream) aqeh2, (long) bArr.length);
                                aqeh2.write(bArr);
                                i2 = j;
                                i = o;
                                z = false;
                            } else {
                                aqeh2.b(aqeh2.b);
                                int i11 = aqeh2.c;
                                aqeh2.b(-1);
                                int a4 = ((aqek) a3).a(aqeh2);
                                aqeh2.a[i11] = a4;
                                i9 += a((long) a4) + a4;
                                i2 = j;
                                i = o;
                                z = true;
                            }
                        } else if (o == 3) {
                            i9 = i9 + ((aqek) a(b2, i8, 26)).a(aqeh2) + a((OutputStream) aqeh2, (long) (i6 | 4));
                            i2 = j;
                            i = o;
                            z = true;
                        } else if (o != 5) {
                            throw new IllegalArgumentException();
                        }
                    }
                    long longValue = ((Long) a(b2, i8, 19)).longValue();
                    if (o == 5) {
                        i3 = 4;
                    } else {
                        i3 = 8;
                    }
                    int i12 = 0;
                    while (i12 < i3) {
                        aqeh2.write((int) (longValue & 255));
                        longValue >>= 8;
                        i12++;
                        j = j;
                        o = o;
                    }
                    i2 = j;
                    i = o;
                    z = false;
                } else {
                    i2 = j;
                    i = o;
                    long longValue2 = ((Long) a(b2, i8, 19)).longValue();
                    if (l(b2)) {
                        longValue2 = b(longValue2);
                    }
                    a((OutputStream) aqeh2, longValue2);
                    z = false;
                }
                if (!z) {
                    i9 += aqeh2.b - i10;
                }
                i8++;
                j = i2;
                o = i;
            }
            i5 += i9;
        }
        return i5;
    }

    public final long d(int i, int i2) {
        return ((Long) a(i, i2, 19)).longValue();
    }

    public final aqek e(int i) {
        return (aqek) h(i, 26);
    }

    public final String f(int i) {
        return (String) h(i, 28);
    }

    public final int b(int i) {
        return (int) ((Long) h(i, 21)).longValue();
    }

    public aqek(aqem aqem, int i) {
        this.b = aqem;
        this.c = new aqeu(i + 1);
    }

    public final void b(int i, double d2) {
        b(i, Double.doubleToLongBits(d2));
    }

    public final void b(int i, float f) {
        g(i, Float.floatToIntBits(f));
    }

    public final boolean h(int i) {
        return j(i) > 0;
    }

    public final void b(int i, long j) {
        b(i, (Object) Long.valueOf(j));
    }

    public final void g(int i, int i2) {
        b(i, (long) i2);
    }

    public final void b(int i, Object obj) {
        if (i >= 0) {
            if (obj != null) {
                c(i, obj);
            }
            this.c.a(i, obj);
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void b(int i, boolean z) {
        b(i, (Object) !z ? Boolean.FALSE : Boolean.TRUE);
    }

    public final int c() {
        int i;
        aqet a2 = this.c.a();
        int i2 = 0;
        while (a2.a()) {
            int b2 = a2.b();
            int j = j(b2);
            for (int i3 = 0; i3 < j; i3++) {
                int a3 = a((long) (b2 << 3));
                int o = o(b2);
                if (o == 0) {
                    long d2 = d(b2, i3);
                    if (l(b2)) {
                        d2 = b(d2);
                    }
                    i = a3 + a(d2);
                } else if (o == 1) {
                    i = a3 + 8;
                } else if (o == 3) {
                    i = a3 + f(b2, i3).c() + a3;
                } else if (o != 5) {
                    Object a4 = a(b2, i3, 16);
                    int length = a4 instanceof byte[] ? ((byte[]) a4).length : a4 instanceof String ? ((String) a4).getBytes(Charset.forName("UTF-8")).length : ((aqek) a4).c();
                    i = a3 + a((long) length) + length;
                } else {
                    i = a3 + 4;
                }
                i2 += i;
            }
        }
        return i2;
    }

    public final byte[] b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a((OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public final byte[] b(int i, int i2) {
        return (byte[]) a(i, i2, 25);
    }

    static int a(OutputStream outputStream, long j) {
        int i = 0;
        while (i < 10) {
            int i2 = (int) (127 & j);
            j >>>= 7;
            if (j != 0) {
                outputStream.write(i2 | 128);
                i++;
            } else {
                outputStream.write(i2);
                return i + 1;
            }
        }
        return i;
    }

    public final int c(int i, int i2) {
        return (int) ((Long) a(i, i2, 21)).longValue();
    }

    private static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (!(obj instanceof Vector)) {
            return 1;
        }
        return ((Vector) obj).size();
    }

    public final long c(int i) {
        return ((Long) h(i, 19)).longValue();
    }

    private static long a(InputStream inputStream, boolean z, aqej aqej) {
        int i = 0;
        aqej.a = 0;
        long j = 0;
        int i2 = 0;
        while (i < 10) {
            int read = inputStream.read();
            if (read != -1) {
                j |= ((long) (read & 127)) << i2;
                if ((read & 128) == 0) {
                    break;
                }
                i2 += 7;
                i++;
            } else if (i == 0 && z) {
                return -1;
            } else {
                throw new IOException("EOF");
            }
        }
        aqej.a = i + 1;
        return j;
    }

    private final Object a(int i, int i2, int i3) {
        n(i);
        Object a2 = this.c.a(i);
        if (i2 < a(a2)) {
            return a(i, i2, i3, a2);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object a(int r5, int r6, int r7, java.lang.Object r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof java.util.Vector
            r1 = 0
            if (r0 == 0) goto L_0x000f
            java.util.Vector r8 = (java.util.Vector) r8
            java.lang.Object r0 = r8.elementAt(r6)
            r3 = r0
            r0 = r8
            r8 = r3
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            r2 = 16
            if (r7 == r2) goto L_0x00ce
            java.lang.String r2 = "UTF-8"
            switch(r7) {
                case 19: goto L_0x00b7;
                case 20: goto L_0x00b7;
                case 21: goto L_0x00b7;
                case 22: goto L_0x00b7;
                case 23: goto L_0x00b7;
                case 24: goto L_0x0097;
                case 25: goto L_0x0067;
                case 26: goto L_0x0035;
                case 27: goto L_0x0035;
                case 28: goto L_0x0021;
                case 29: goto L_0x00b7;
                case 30: goto L_0x00b7;
                case 31: goto L_0x00b7;
                case 32: goto L_0x00b7;
                case 33: goto L_0x00b7;
                case 34: goto L_0x00b7;
                case 35: goto L_0x0067;
                case 36: goto L_0x0021;
                default: goto L_0x0019;
            }
        L_0x0019:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "Unsupp.Type"
            r5.<init>(r6)
            throw r5
        L_0x0021:
            boolean r7 = r8 instanceof byte[]
            if (r7 == 0) goto L_0x0033
            r7 = r8
            byte[] r7 = (byte[]) r7
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            r1.<init>(r7, r2)
            goto L_0x00d0
        L_0x0033:
            goto L_0x00cf
        L_0x0035:
            boolean r7 = r8 instanceof byte[]
            if (r7 != 0) goto L_0x003b
            goto L_0x00cf
        L_0x003b:
            if (r5 > 0) goto L_0x003e
            goto L_0x004e
        L_0x003e:
            aqem r7 = r4.b     // Catch:{ IOException -> 0x005c }
            if (r7 == 0) goto L_0x004e
            aqek r1 = new aqek     // Catch:{ IOException -> 0x005c }
            java.lang.Object r7 = r7.b(r5)     // Catch:{ IOException -> 0x005c }
            aqem r7 = (defpackage.aqem) r7     // Catch:{ IOException -> 0x005c }
            r1.<init>(r7)     // Catch:{ IOException -> 0x005c }
            goto L_0x0054
        L_0x004e:
            aqek r7 = new aqek     // Catch:{ IOException -> 0x005c }
            r7.<init>(r1)     // Catch:{ IOException -> 0x005c }
            r1 = r7
        L_0x0054:
            r7 = r8
            byte[] r7 = (byte[]) r7     // Catch:{ IOException -> 0x005c }
            r1.a((byte[]) r7)     // Catch:{ IOException -> 0x005c }
            goto L_0x00d0
        L_0x005c:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L_0x0067:
            boolean r7 = r8 instanceof java.lang.String
            if (r7 == 0) goto L_0x0077
            r7 = r8
            java.lang.String r7 = (java.lang.String) r7
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r2)
            byte[] r1 = r7.getBytes(r1)
            goto L_0x00d0
        L_0x0077:
            boolean r7 = r8 instanceof defpackage.aqek
            if (r7 == 0) goto L_0x0096
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream
            r7.<init>()
            r1 = r8
            aqek r1 = (defpackage.aqek) r1     // Catch:{ IOException -> 0x008b }
            r1.a((java.io.OutputStream) r7)     // Catch:{ IOException -> 0x008b }
            byte[] r1 = r7.toByteArray()     // Catch:{ IOException -> 0x008b }
            goto L_0x00d0
        L_0x008b:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L_0x0096:
            goto L_0x00cf
        L_0x0097:
            boolean r7 = r8 instanceof java.lang.Boolean
            if (r7 != 0) goto L_0x00b6
            r7 = r8
            java.lang.Long r7 = (java.lang.Long) r7
            long r1 = r7.longValue()
            int r7 = (int) r1
            if (r7 == 0) goto L_0x00b3
            r1 = 1
            if (r7 != r1) goto L_0x00ab
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L_0x00d0
        L_0x00ab:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Type mismatch"
            r5.<init>(r6)
            throw r5
        L_0x00b3:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L_0x00d0
        L_0x00b6:
            goto L_0x00cf
        L_0x00b7:
            boolean r7 = r8 instanceof java.lang.Boolean
            if (r7 == 0) goto L_0x00ce
            r7 = r8
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x00c7
            r1 = 0
            goto L_0x00c9
        L_0x00c7:
            r1 = 1
        L_0x00c9:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L_0x00d0
        L_0x00ce:
        L_0x00cf:
            r1 = r8
        L_0x00d0:
            if (r1 == r8) goto L_0x00dd
            if (r8 == 0) goto L_0x00dd
            if (r0 != 0) goto L_0x00da
            r4.b((int) r5, (java.lang.Object) r1)
            goto L_0x00dd
        L_0x00da:
            r0.setElementAt(r1, r6)
        L_0x00dd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqek.a(int, int, int, java.lang.Object):java.lang.Object");
    }

    private final void a(Writer writer, int i) {
        int i2 = i + i;
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(' ');
        }
        String sb2 = sb.toString();
        for (int i4 = 0; i4 <= this.c.d; i4++) {
            for (int i5 = 0; i5 < j(i4); i5++) {
                writer.append(sb2).append(Integer.toString(i4));
                int g = g(i4);
                if (g == 26) {
                    writer.append(' ');
                } else {
                    writer.append(':');
                }
                switch (g) {
                    case 17:
                        writer.append(Double.toString(Double.longBitsToDouble(d(i4, i5))));
                        break;
                    case 18:
                        writer.append(Float.toString(e(i4, i5)));
                        break;
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 36:
                        writer.append(a(i4, i5, g).toString());
                        break;
                    case 25:
                    case 35:
                        int length = b(i4, i5).length;
                        StringBuilder sb3 = new StringBuilder(31);
                        sb3.append("<Byte array length:");
                        sb3.append(length);
                        sb3.append(">");
                        writer.append(sb3.toString());
                        break;
                    case 26:
                    case 27:
                        writer.append("{\n");
                        f(i4, i5).a(writer, i + 1);
                        writer.append(sb2).append('}');
                        break;
                    default:
                        writer.append("UNSUPPORTED TYPE: ").append(Integer.toString(g));
                        break;
                }
                writer.append(10);
            }
        }
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* access modifiers changed from: protected */
    public final int a(InputStream inputStream, int i, boolean z, aqej aqej) {
        int i2;
        aqek aqek;
        byte[] bArr;
        aqem aqem;
        if (z) {
            aqeu aqeu = this.c;
            int i3 = 0;
            while (true) {
                Object[] objArr = aqeu.a;
                if (i3 >= objArr.length) {
                    break;
                }
                objArr[i3] = null;
                i3++;
            }
            HashMap hashMap = aqeu.b;
            if (hashMap != null) {
                hashMap.clear();
            }
            aqeu.d = Integer.MIN_VALUE;
            aqeu.c = Integer.MIN_VALUE;
            aqeu.e = 0;
            this.d = null;
        }
        while (true) {
            i2 = 1;
            if (i <= 0) {
                break;
            }
            long a2 = a(inputStream, true, aqej);
            if (a2 == -1) {
                break;
            }
            i -= aqej.a;
            int i4 = ((int) a2) & 7;
            int i5 = 4;
            if (i4 == 4) {
                break;
            }
            int i6 = (int) (a2 >>> 3);
            if (g(i6) == 16) {
                if (this.d == null) {
                    this.d = new aqeu();
                }
                this.d.a(i6, Integer.valueOf(i4));
            }
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        int a3 = (int) a(inputStream, false, aqej);
                        i = (i - aqej.a) - a3;
                        if (a3 != 0) {
                            bArr = new byte[a3];
                        } else {
                            bArr = a;
                        }
                        int i7 = 0;
                        while (i7 < a3) {
                            int read = inputStream.read(bArr, i7, a3 - i7);
                            if (read > 0) {
                                i7 += read;
                            } else {
                                throw new IOException("Unexp.EOF");
                            }
                        }
                        aqek = bArr;
                        continue;
                    } else if (i4 == 3) {
                        aqem aqem2 = this.b;
                        if (aqem2 != null) {
                            aqem = (aqem) aqem2.b(i6);
                        } else {
                            aqem = null;
                        }
                        aqek aqek2 = new aqek(aqem);
                        i = aqek2.a(inputStream, i, false, aqej);
                        aqek = aqek2;
                    } else if (i4 != 5) {
                        StringBuilder sb = new StringBuilder(52);
                        sb.append("Unknown wire type ");
                        sb.append(i4);
                        sb.append(", reading garbage data?");
                        throw new IOException(sb.toString());
                    }
                }
                if (i4 != 5) {
                    i5 = 8;
                }
                i -= i5;
                long j = 0;
                int i8 = 0;
                while (true) {
                    int i9 = i5 - 1;
                    if (i5 <= 0) {
                        break;
                    }
                    j |= ((long) inputStream.read()) << i8;
                    i8 += 8;
                    i5 = i9;
                }
                aqek = Long.valueOf(j);
            } else {
                long a4 = a(inputStream, false, aqej);
                i -= aqej.a;
                if (l(i6)) {
                    a4 = (-(a4 & 1)) ^ (a4 >>> 1);
                }
                aqek = Long.valueOf(a4);
            }
            a(i6, (Object) aqek);
        }
        if (i >= 0) {
            aqeu aqeu2 = this.d;
            if (aqeu2 != null) {
                int i10 = aqeu2.c;
                if (i10 > 0) {
                    i2 = 1 + i10;
                }
                Object[] objArr2 = new Object[i2];
                System.arraycopy(aqeu2.a, 0, objArr2, 0, i2);
                Arrays.fill(aqeu2.a, (Object) null);
                aqeu2.a = objArr2;
            }
            return i;
        }
        throw new IOException();
    }

    public final void a(int i, double d2) {
        a(i, Double.doubleToLongBits(d2));
    }

    public final void a(int i, float f) {
        a(i, Float.floatToIntBits(f));
    }

    public final void a(int i, int i2) {
        a(i, (long) i2);
    }

    public final void a(int i, long j) {
        a(i, (Object) Long.valueOf(j));
    }

    public final void a(int i, Object obj) {
        Vector vector;
        n(i);
        Object a2 = this.c.a(i);
        if (a2 instanceof Vector) {
            vector = (Vector) a2;
        } else {
            vector = null;
        }
        if (a2 != null && (vector == null || vector.size() != 0)) {
            c(i, obj);
            if (vector == null) {
                vector = new Vector();
                vector.addElement(a2);
                this.c.a(i, vector);
            }
            vector.addElement(obj);
            return;
        }
        b(i, obj);
    }

    public final void a(int i, boolean z) {
        a(i, (Object) !z ? Boolean.FALSE : Boolean.TRUE);
    }

    public final void a(InputStream inputStream, int i) {
        a(inputStream, i, true, new aqej());
    }

    public final void a(OutputStream outputStream) {
        aqeh aqeh = new aqeh();
        a(aqeh);
        int i = aqeh.c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int a2 = aqeh.a(i2);
            aqeh.a(outputStream, i3, a2 - i3);
            a(outputStream, (long) aqeh.a(i2 + 1));
            i2 += 2;
            i3 = a2;
        }
        int i4 = aqeh.b;
        if (i3 < i4) {
            aqeh.a(outputStream, i3, i4 - i3);
        }
    }

    public final void a(byte[] bArr) {
        a((InputStream) new ByteArrayInputStream(bArr), bArr.length);
    }

    public final boolean a() {
        aqem aqem = this.b;
        return aqem == null || aqem.a(this);
    }

    public final boolean a(int i) {
        return ((Boolean) h(i, 24)).booleanValue();
    }
}
