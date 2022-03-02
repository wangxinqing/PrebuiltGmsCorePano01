package defpackage;

import android.util.Log;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: jag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jag {
    public static InputStream a(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        if (jjt.a(bArr)) {
            try {
                return new GZIPInputStream(byteArrayInputStream);
            } catch (IOException e) {
            }
        }
        return byteArrayInputStream;
    }

    public abstract Map a();

    /* access modifiers changed from: protected */
    public abstract Object c(String str);

    /* access modifiers changed from: protected */
    public void c(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        b(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public void d(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        c(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public abstract boolean d(String str);

    /* access modifiers changed from: protected */
    public void e(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        d(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public void f(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        e(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public void g(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        f(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public void h(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        g(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public void i(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        h(str, arrayList);
    }

    public String toString() {
        Map a = a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : a.keySet()) {
            FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) a.get(str);
            if (a(fastJsonResponse$Field)) {
                Object b = b(fastJsonResponse$Field, b(fastJsonResponse$Field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (b != null) {
                    switch (fastJsonResponse$Field.d) {
                        case 8:
                            sb.append("\"");
                            sb.append(jhy.b((byte[]) b));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(jhy.c((byte[]) b));
                            sb.append("\"");
                            break;
                        case 10:
                            jjz.a(sb, (HashMap) b);
                            break;
                        default:
                            if (!fastJsonResponse$Field.c) {
                                a(sb, fastJsonResponse$Field, b);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) b;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        a(sb, fastJsonResponse$Field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (java.lang.String) r1.c.get(((java.lang.Integer) r2).intValue());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final java.lang.Object b(com.google.android.gms.common.server.response.FastJsonResponse$Field r1, java.lang.Object r2) {
        /*
            com.google.android.gms.common.server.converter.StringToIntConverter r1 = r1.k
            if (r1 == 0) goto L_0x001f
            java.lang.Integer r2 = (java.lang.Integer) r2
            android.util.SparseArray r0 = r1.c
            int r2 = r2.intValue()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x001f
            java.util.HashMap r1 = r1.b
            java.lang.String r0 = "gms_unknown"
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L_0x001f
            return r0
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jag.b(com.google.android.gms.common.server.response.FastJsonResponse$Field, java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public void c(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    /* access modifiers changed from: protected */
    public void d(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    /* access modifiers changed from: protected */
    public void e(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    /* access modifiers changed from: protected */
    public void f(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    /* access modifiers changed from: protected */
    public void g(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    /* access modifiers changed from: protected */
    public void h(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    /* access modifiers changed from: protected */
    public void i(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    private static final void a(StringBuilder sb, FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        int i = fastJsonResponse$Field.b;
        if (i == 11) {
            sb.append(((jag) fastJsonResponse$Field.h.cast(obj)).toString());
        } else if (i == 7) {
            sb.append("\"");
            sb.append(jjx.a((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    private static final boolean a(String str, Object obj) {
        if (obj != null) {
            return true;
        }
        if (!Log.isLoggable("FastJsonResponse", 6)) {
            return false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
        sb.append("Output field (");
        sb.append(str);
        sb.append(") has a null value, but expected a primitive");
        Log.e("FastJsonResponse", sb.toString());
        return false;
    }

    /* access modifiers changed from: protected */
    public Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        boolean z;
        String str = fastJsonResponse$Field.f;
        if (fastJsonResponse$Field.h == null) {
            return c(str);
        }
        if (c(str) == null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, "Concrete field shouldn't be value object: %s", fastJsonResponse$Field.f);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, double d) {
        if (fastJsonResponse$Field.k == null) {
            a(fastJsonResponse$Field, fastJsonResponse$Field.f, d);
        } else {
            a(fastJsonResponse$Field, (Object) Double.valueOf(d));
        }
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        String str = fastJsonResponse$Field.f;
        StringToIntConverter stringToIntConverter = fastJsonResponse$Field.k;
        Integer num = (Integer) stringToIntConverter.b.get((String) obj);
        if (num == null) {
            num = (Integer) stringToIntConverter.b.get("gms_unknown");
        }
        int i = fastJsonResponse$Field.d;
        switch (i) {
            case 0:
                if (a(str, (Object) num)) {
                    a(fastJsonResponse$Field, str, num.intValue());
                    return;
                }
                return;
            case 1:
                a(fastJsonResponse$Field, str, (BigInteger) num);
                return;
            case 2:
                if (a(str, (Object) num)) {
                    a(fastJsonResponse$Field, str, ((Long) num).longValue());
                    return;
                }
                return;
            case 4:
                if (a(str, (Object) num)) {
                    a(fastJsonResponse$Field, str, ((Double) num).doubleValue());
                    return;
                }
                return;
            case 5:
                a(fastJsonResponse$Field, str, (BigDecimal) num);
                return;
            case 6:
                if (a(str, (Object) num)) {
                    a(fastJsonResponse$Field, str, ((Boolean) num).booleanValue());
                    return;
                }
                return;
            case 7:
                a(fastJsonResponse$Field, str, (String) num);
                return;
            case 8:
            case 9:
                if (a(str, (Object) num)) {
                    a(fastJsonResponse$Field, str, (byte[]) num);
                    return;
                }
                return;
            default:
                StringBuilder sb = new StringBuilder(44);
                sb.append("Unsupported type for conversion: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        i(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public void b(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void b(byte[] bArr) {
        InputStream a = a(bArr);
        try {
            new jas().a(a, this);
            try {
                a.close();
            } catch (IOException e) {
            }
        } catch (Throwable th) {
            try {
                a.close();
            } catch (IOException e2) {
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public boolean b(String str) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* access modifiers changed from: protected */
    public void a(FastJsonResponse$Field fastJsonResponse$Field, String str, double d) {
        a(str, d);
    }

    /* access modifiers changed from: protected */
    public void a(FastJsonResponse$Field fastJsonResponse$Field, String str, float f) {
        a(str, f);
    }

    /* access modifiers changed from: protected */
    public void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        a(str, i);
    }

    /* access modifiers changed from: protected */
    public void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        a(str, j);
    }

    public void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        a(str, jag);
    }

    /* access modifiers changed from: protected */
    public void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        a(str, str2);
    }

    /* access modifiers changed from: protected */
    public void a(FastJsonResponse$Field fastJsonResponse$Field, String str, BigDecimal bigDecimal) {
        a(str, bigDecimal);
    }

    /* access modifiers changed from: protected */
    public void a(FastJsonResponse$Field fastJsonResponse$Field, String str, BigInteger bigInteger) {
        a(str, bigInteger);
    }

    public void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        a(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public void a(FastJsonResponse$Field fastJsonResponse$Field, String str, Map map) {
        a(str, map);
    }

    /* access modifiers changed from: protected */
    public void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        a(str, z);
    }

    /* access modifiers changed from: protected */
    public void a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        a(str, bArr);
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, boolean z) {
        if (fastJsonResponse$Field.k == null) {
            a(fastJsonResponse$Field, fastJsonResponse$Field.f, z);
        } else {
            a(fastJsonResponse$Field, (Object) Boolean.valueOf(z));
        }
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, byte[] bArr) {
        if (fastJsonResponse$Field.k == null) {
            a(fastJsonResponse$Field, fastJsonResponse$Field.f, bArr);
        } else {
            a(fastJsonResponse$Field, (Object) bArr);
        }
    }

    /* access modifiers changed from: protected */
    public void a(String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    /* access modifiers changed from: protected */
    public void a(String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    /* access modifiers changed from: protected */
    public void a(String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    /* access modifiers changed from: protected */
    public void a(String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void a(String str, jag jag) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    /* access modifiers changed from: protected */
    public void a(String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    /* access modifiers changed from: protected */
    public void a(String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    /* access modifiers changed from: protected */
    public void a(String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public void a(String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    /* access modifiers changed from: protected */
    public void a(String str, Map map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    /* access modifiers changed from: protected */
    public void a(String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    /* access modifiers changed from: protected */
    public void a(String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    /* access modifiers changed from: protected */
    public boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        if (fastJsonResponse$Field.d != 11) {
            return d(fastJsonResponse$Field.f);
        }
        if (fastJsonResponse$Field.e) {
            return a(fastJsonResponse$Field.f);
        }
        return b(fastJsonResponse$Field.f);
    }

    /* access modifiers changed from: protected */
    public boolean a(String str) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }
}
