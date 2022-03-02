package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: sut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sut extends swm {
    public char a = 0;
    public long b = -1;
    public final sur c = new sur(this, 6, false, false);
    public final sur d = new sur(this, 6, true, false);
    public final sur e = new sur(this, 6, false, true);
    public final sur f = new sur(this, 5, false, false);
    public final sur g = new sur(this, 5, true, false);
    public final sur h = new sur(this, 5, false, true);
    public final sur i = new sur(this, 4, false, false);
    public final sur j = new sur(this, 3, false, false);
    public final sur k = new sur(this, 2, false, false);
    private String l;

    public sut(svv svv) {
        super(svv);
    }

    protected static Object a(String str) {
        if (str != null) {
            return new sus(str);
        }
        return null;
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf != -1 ? str.substring(0, lastIndexOf) : str;
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a7 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String c() {
        /*
            r9 = this;
            svf r0 = r9.w()
            svd r0 = r0.c
            svf r1 = r0.e
            r1.h()
            svf r1 = r0.e
            r1.h()
            long r1 = r0.b()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x001f
            r0.a()
            r1 = r3
            goto L_0x002e
        L_0x001f:
            svf r5 = r0.e
            jiq r5 = r5.A()
            long r5 = r5.a()
            long r1 = r1 - r5
            long r1 = java.lang.Math.abs(r1)
        L_0x002e:
            long r5 = r0.d
            r7 = 0
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x006d
            long r5 = r5 + r5
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x0069
            svf r1 = r0.e
            android.content.SharedPreferences r1 = r1.c()
            java.lang.String r2 = r0.c
            java.lang.String r1 = r1.getString(r2, r7)
            svf r2 = r0.e
            android.content.SharedPreferences r2 = r2.c()
            java.lang.String r5 = r0.b
            long r5 = r2.getLong(r5, r3)
            r0.a()
            if (r1 != 0) goto L_0x0058
            goto L_0x0066
        L_0x0058:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
            android.util.Pair r0 = new android.util.Pair
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r0.<init>(r1, r2)
            goto L_0x006f
        L_0x0066:
            android.util.Pair r0 = defpackage.svf.a
            goto L_0x006f
        L_0x0069:
            r0.a()
            goto L_0x006e
        L_0x006d:
        L_0x006e:
            r0 = r7
        L_0x006f:
            if (r0 == 0) goto L_0x00a7
            android.util.Pair r1 = defpackage.svf.a
            if (r0 == r1) goto L_0x00a7
            java.lang.Object r1 = r0.second
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 1
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r1)
            java.lang.String r1 = ":"
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            return r0
        L_0x00a7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sut.c():java.lang.String");
    }

    static String a(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i2 = 0;
        if (!(obj instanceof Long)) {
            if (obj instanceof Boolean) {
                return String.valueOf(obj);
            }
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String b2 = b(svv.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && b(className).equals(b2)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                        break;
                    }
                    i2++;
                }
                return sb.toString();
            } else if (obj instanceof sus) {
                return ((sus) obj).a;
            } else {
                if (!z) {
                    return String.valueOf(obj);
                }
                return "-";
            }
        } else if (!z) {
            return String.valueOf(obj);
        } else {
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l2.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            StringBuilder sb2 = new StringBuilder(str.length() + 43 + str.length());
            sb2.append(str);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str);
            sb2.append(round2);
            return sb2.toString();
        }
    }

    /* access modifiers changed from: protected */
    public final String b() {
        String str;
        synchronized (this) {
            if (this.l == null) {
                String str2 = this.x.d;
                if (str2 == null) {
                    str2 = v().a();
                }
                this.l = str2;
            }
            str = this.l;
        }
        return str;
    }

    static String a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String a2 = a(z, obj);
        String a3 = a(z, obj2);
        String a4 = a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(a4)) {
            sb.append(str3);
            sb.append(a4);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, String str) {
        Log.println(i2, b(), str);
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && a(i2)) {
            a(i2, a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i2 >= 5) {
            iva.a((Object) str);
            svs svs = this.x.j;
            if (svs == null) {
                a(6, "Scheduler not set. Not logging error/warn");
            } else if (!svs.g()) {
                a(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                svs.a((Runnable) new suq(this, i2, str, obj, obj2, obj3));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i2) {
        return Log.isLoggable(b(), i2);
    }
}
