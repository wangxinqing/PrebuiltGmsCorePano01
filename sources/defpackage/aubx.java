package defpackage;

import com.google.android.chimera.Service;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* renamed from: aubx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aubx {
    public static final aubx c = new aubx((byte[]) null);
    final auey a = auey.a(16);
    public boolean b;
    private boolean d;

    private aubx() {
    }

    static int a(aufw aufw, int i, Object obj) {
        int i2 = aubk.i(i);
        if (aufw == aufw.GROUP) {
            aucy.a((audx) obj);
            i2 += i2;
        }
        aufx aufx = aufx.INT;
        int i3 = 4;
        switch (aufw.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i3 = 8;
                break;
            case 1:
                ((Float) obj).floatValue();
                break;
            case 2:
                i3 = aubk.f(((Long) obj).longValue());
                break;
            case 3:
                i3 = aubk.f(((Long) obj).longValue());
                break;
            case 4:
                i3 = aubk.j(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).longValue();
                i3 = 8;
                break;
            case 6:
                ((Integer) obj).intValue();
                break;
            case 7:
                ((Boolean) obj).booleanValue();
                i3 = 1;
                break;
            case 8:
                if (!(obj instanceof auay)) {
                    i3 = aubk.b((String) obj);
                    break;
                } else {
                    i3 = aubk.b((auay) obj);
                    break;
                }
            case 9:
                i3 = aubk.d((audx) obj);
                break;
            case 10:
                if (!(obj instanceof aude)) {
                    i3 = aubk.b((audx) obj);
                    break;
                } else {
                    i3 = aubk.a((audf) (aude) obj);
                    break;
                }
            case 11:
                if (!(obj instanceof auay)) {
                    i3 = aubk.d((byte[]) obj);
                    break;
                } else {
                    i3 = aubk.b((auay) obj);
                    break;
                }
            case 12:
                i3 = aubk.k(((Integer) obj).intValue());
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                if (!(obj instanceof auco)) {
                    i3 = aubk.j(((Integer) obj).intValue());
                    break;
                } else {
                    i3 = aubk.j(((auco) obj).a());
                    break;
                }
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                ((Integer) obj).intValue();
                break;
            case Service.START_CONTINUATION_MASK:
                ((Long) obj).longValue();
                i3 = 8;
                break;
            case 16:
                i3 = aubk.l(((Integer) obj).intValue());
                break;
            case 17:
                i3 = aubk.g(((Long) obj).longValue());
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return i2 + i3;
    }

    public static int b(auch auch, Object obj) {
        return a(auch.b, auch.a, obj);
    }

    private static boolean c(Map.Entry entry) {
        if (((auch) entry.getKey()).a() == aufx.MESSAGE) {
            Object value = entry.getValue();
            if (value instanceof audx) {
                if (!((audx) value).az()) {
                    return false;
                }
            } else if (value instanceof aude) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    public final Iterator d() {
        if (this.d) {
            return new audd(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public final boolean e() {
        for (int i = 0; i < this.a.a(); i++) {
            if (!c(this.a.b(i))) {
                return false;
            }
        }
        for (Map.Entry c2 : this.a.b()) {
            if (!c(c2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aubx) {
            return this.a.equals(((aubx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    private aubx(byte[] bArr) {
        b();
        b();
    }

    public final int b(Map.Entry entry) {
        auch auch = (auch) entry.getKey();
        Object value = entry.getValue();
        if (auch.a() != aufx.MESSAGE) {
            return b(auch, value);
        }
        if (value instanceof aude) {
            int i = ((auch) entry.getKey()).a;
            int i2 = aubk.i(1);
            return i2 + i2 + aubk.h(2, i) + aubk.a(3, (audf) (aude) value);
        }
        int i3 = ((auch) entry.getKey()).a;
        int i4 = aubk.i(1);
        return i4 + i4 + aubk.h(2, i3) + aubk.i(3) + aubk.b((audx) value);
    }

    /* renamed from: c */
    public final aubx clone() {
        aubx aubx = new aubx();
        for (int i = 0; i < this.a.a(); i++) {
            Map.Entry b2 = this.a.b(i);
            aubx.a((auch) b2.getKey(), b2.getValue());
        }
        for (Map.Entry entry : this.a.b()) {
            aubx.a((auch) entry.getKey(), entry.getValue());
        }
        aubx.d = this.d;
        return aubx;
    }

    public final Object b(auch auch) {
        Object obj = this.a.get(auch);
        if (!(obj instanceof aude)) {
            return obj;
        }
        aude aude = (aude) obj;
        throw null;
    }

    public final void b() {
        Map map;
        Map map2;
        if (!this.b) {
            auey auey = this.a;
            if (!auey.c) {
                for (int i = 0; i < auey.a(); i++) {
                    auch auch = (auch) auey.b(i).getKey();
                }
                for (Map.Entry key : auey.b()) {
                    auch auch2 = (auch) key.getKey();
                }
            }
            if (!auey.c) {
                if (auey.b.isEmpty()) {
                    map = Collections.emptyMap();
                } else {
                    map = Collections.unmodifiableMap(auey.b);
                }
                auey.b = map;
                if (!auey.d.isEmpty()) {
                    map2 = Collections.unmodifiableMap(auey.d);
                } else {
                    map2 = Collections.emptyMap();
                }
                auey.d = map2;
                auey.c = true;
            }
            this.b = true;
        }
    }

    private static Object a(Object obj) {
        if (obj instanceof auec) {
            return ((auec) obj).c();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    static void a(aubk aubk, aufw aufw, int i, Object obj) {
        if (aufw == aufw.GROUP) {
            audx audx = (audx) obj;
            aucy.a(audx);
            aubk.b(i, 3);
            aubk.c(audx);
            aubk.b(i, 4);
            return;
        }
        aubk.b(i, aufw.t);
        aufx aufx = aufx.INT;
        switch (aufw.ordinal()) {
            case 0:
                aubk.a(((Double) obj).doubleValue());
                return;
            case 1:
                aubk.a(((Float) obj).floatValue());
                return;
            case 2:
                aubk.c(((Long) obj).longValue());
                return;
            case 3:
                aubk.c(((Long) obj).longValue());
                return;
            case 4:
                aubk.c(((Integer) obj).intValue());
                return;
            case 5:
                aubk.d(((Long) obj).longValue());
                return;
            case 6:
                aubk.e(((Integer) obj).intValue());
                return;
            case 7:
                aubk.b(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                return;
            case 8:
                if (obj instanceof auay) {
                    aubk.a((auay) obj);
                    return;
                } else {
                    aubk.a((String) obj);
                    return;
                }
            case 9:
                aubk.c((audx) obj);
                return;
            case 10:
                aubk.a((audx) obj);
                return;
            case 11:
                if (obj instanceof auay) {
                    aubk.a((auay) obj);
                    return;
                } else {
                    aubk.c((byte[]) obj);
                    return;
                }
            case 12:
                aubk.d(((Integer) obj).intValue());
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                if (obj instanceof auco) {
                    aubk.c(((auco) obj).a());
                    return;
                } else {
                    aubk.c(((Integer) obj).intValue());
                    return;
                }
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                aubk.e(((Integer) obj).intValue());
                return;
            case Service.START_CONTINUATION_MASK:
                aubk.d(((Long) obj).longValue());
                return;
            case 16:
                aubk.h(((Integer) obj).intValue());
                return;
            case 17:
                aubk.e(((Long) obj).longValue());
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if ((r4 instanceof byte[]) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r0 != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        if ((r4 instanceof defpackage.aude) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        r2.d = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        r2.a.a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if ((r4 instanceof defpackage.aude) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if ((r4 instanceof defpackage.auco) == false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.auch r3, java.lang.Object r4) {
        /*
            r2 = this;
            aufw r0 = r3.b
            defpackage.aucy.a((java.lang.Object) r4)
            aufw r1 = defpackage.aufw.DOUBLE
            aufx r1 = defpackage.aufx.INT
            aufx r0 = r0.s
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x003d;
                case 1: goto L_0x003a;
                case 2: goto L_0x0037;
                case 3: goto L_0x0034;
                case 4: goto L_0x0031;
                case 5: goto L_0x002e;
                case 6: goto L_0x0025;
                case 7: goto L_0x001c;
                case 8: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x004f
        L_0x0013:
            boolean r0 = r4 instanceof defpackage.audx
            if (r0 != 0) goto L_0x0041
            boolean r0 = r4 instanceof defpackage.aude
            if (r0 == 0) goto L_0x004f
            goto L_0x0041
        L_0x001c:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0041
            boolean r0 = r4 instanceof defpackage.auco
            if (r0 == 0) goto L_0x004f
            goto L_0x0041
        L_0x0025:
            boolean r0 = r4 instanceof defpackage.auay
            if (r0 != 0) goto L_0x0041
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x004f
            goto L_0x0041
        L_0x002e:
            boolean r0 = r4 instanceof java.lang.String
            goto L_0x003f
        L_0x0031:
            boolean r0 = r4 instanceof java.lang.Boolean
            goto L_0x003f
        L_0x0034:
            boolean r0 = r4 instanceof java.lang.Double
            goto L_0x003f
        L_0x0037:
            boolean r0 = r4 instanceof java.lang.Float
            goto L_0x003f
        L_0x003a:
            boolean r0 = r4 instanceof java.lang.Long
            goto L_0x003f
        L_0x003d:
            boolean r0 = r4 instanceof java.lang.Integer
        L_0x003f:
            if (r0 == 0) goto L_0x004f
        L_0x0041:
            boolean r0 = r4 instanceof defpackage.aude
            if (r0 != 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            r0 = 1
            r2.d = r0
        L_0x0049:
            auey r0 = r2.a
            r0.put(r3, r4)
            return
        L_0x004f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Wrong object type used with protocol message reflection."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aubx.a(auch, java.lang.Object):void");
    }

    public final void a(Map.Entry entry) {
        auch auch = (auch) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof aude) {
            aude aude = (aude) value;
            throw null;
        } else if (auch.a() == aufx.MESSAGE) {
            Object b2 = b(auch);
            if (b2 == null) {
                this.a.put(auch, a(value));
            } else if (!(b2 instanceof auec)) {
                aucd aucd = (aucd) ((audx) b2).av();
                aucd.a((aucj) ((audx) value));
                this.a.put(auch, aucd.i());
            } else {
                auec auec = (auec) b2;
                auec auec2 = (auec) value;
                throw new UnsupportedOperationException();
            }
        } else {
            this.a.put(auch, a(value));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.a.isEmpty();
    }

    public final boolean a(auch auch) {
        return this.a.get(auch) != null;
    }
}
