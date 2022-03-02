package defpackage;

/* renamed from: acxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acxp extends acxw {
    private final acxm a = new acxm();

    private final void a(acxa acxa, long j, acxm acxm, int i) {
        aucd b = acxa.b();
        bbl bbl = bbl.NOTIFICATION_ITEM;
        if (b.c) {
            b.c();
            b.c = false;
        }
        avqd avqd = (avqd) b.b;
        avqd avqd2 = avqd.al;
        avqd.d = bbl.CA;
        int i2 = avqd.a | 2;
        avqd.a = i2;
        avqd.c = i - 1;
        int i3 = i2 | 1;
        avqd.a = i3;
        String str = acxm.a;
        str.getClass();
        int i4 = i3 | 16;
        avqd.a = i4;
        avqd.f = str;
        acxm acxm2 = this.a;
        int i5 = acxm2.b;
        int i6 = i4 | 512;
        avqd.a = i6;
        avqd.k = i5;
        String str2 = acxm2.c;
        str2.getClass();
        int i7 = i6 | 1024;
        avqd.a = i7;
        avqd.l = str2;
        avqd.a = i7 | 4;
        avqd.e = j;
        acxa.a(b);
    }

    public final int a() {
        return 27510;
    }

    /* access modifiers changed from: protected */
    public final void a(acxa acxa, long j, Object[] objArr) {
        Object[] objArr2 = objArr;
        boolean c = azqq.c();
        if (!acxa.b("disable_old_visibility_logs")) {
            int length = objArr2.length;
            if (length >= 2) {
                try {
                    String[] split = ((String) objArr2[0]).split(";");
                    String[] split2 = ((String) objArr2[1]).split(";");
                    for (String str : split) {
                        if (this.a.a(str)) {
                            a(acxa, j, this.a, 2);
                        } else if (c) {
                            String valueOf = String.valueOf(str);
                            if (valueOf.length() == 0) {
                                new String("unable to parse key: ");
                            } else {
                                "unable to parse key: ".concat(valueOf);
                            }
                        }
                    }
                    for (String str2 : split2) {
                        if (this.a.a(str2)) {
                            a(acxa, j, this.a, 3);
                        } else if (c) {
                            String valueOf2 = String.valueOf(str2);
                            if (valueOf2.length() == 0) {
                                new String("unable to parse key: ");
                            } else {
                                "unable to parse key: ".concat(valueOf2);
                            }
                        }
                    }
                } catch (ClassCastException e) {
                }
            } else if (c) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("wrong number of operands: ");
                sb.append(length);
                sb.toString();
            }
        }
    }
}
