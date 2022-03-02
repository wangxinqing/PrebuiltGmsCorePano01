package defpackage;

/* renamed from: aizb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aizb extends amqt {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        arel arel = (arel) obj;
        throw new UnsupportedOperationException("converting from ActivityRecognitionProto to CHRE ActivityResultDiagnostics is not supported!");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        arip arip = (arip) obj;
        aucd o = arel.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        arel arel = (arel) o.b;
        arel.b = 2;
        arel.a |= 1;
        aucx aucx = arip.a;
        int size = aucx.size();
        int i = 0;
        while (i < size) {
            arjd arjd = (arjd) aucx.get(i);
            aucd o2 = arer.g.o();
            int a = ariw.a(arjd.c);
            if (a == 0) {
                a = 1;
            }
            int a2 = areo.a(a - 1);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arer arer = (arer) o2.b;
            int i2 = a2 - 1;
            if (a2 != 0) {
                arer.e = i2;
                arer.a |= 8;
                int a3 = arjc.a(arjd.a);
                if (a3 == 0) {
                    a3 = 1;
                }
                int a4 = areq.a(a3 - 1);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                arer arer2 = (arer) o2.b;
                int i3 = a4 - 1;
                if (a4 != 0) {
                    arer2.b = i3;
                    arer2.a |= 1;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    arer arer3 = (arer) o2.b;
                    int i4 = arer3.a | 4;
                    arer3.a = i4;
                    arer3.d = currentTimeMillis;
                    long j = arjd.b;
                    arer3.a = i4 | 2;
                    arer3.c = j;
                    aucd o3 = aret.d.o();
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    aret aret = (aret) o3.b;
                    aret.a |= 2;
                    aret.b = 100.0f;
                    ariu a5 = ariu.a(arjd.d);
                    if (a5 == null) {
                        a5 = ariu.INVALID_ACTIVITY;
                    }
                    Integer a6 = aiyu.a(a5);
                    if (a6 != null) {
                        int intValue = a6.intValue();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        aret aret2 = (aret) o3.b;
                        aret2.a |= 4;
                        aret2.c = intValue;
                    }
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    arer arer4 = (arer) o2.b;
                    aret aret3 = (aret) o3.i();
                    aret3.getClass();
                    arer4.f = aret3;
                    arer4.a |= 16;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    arel arel2 = (arel) o.b;
                    arer arer5 = (arer) o2.i();
                    arer5.getClass();
                    if (!arel2.c.a()) {
                        arel2.c = aucj.a(arel2.c);
                    }
                    arel2.c.add(arer5);
                    i++;
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        String valueOf = String.valueOf(o);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("ActivityResultDiagnostics = ");
        sb.append(valueOf);
        sb.toString();
        return (arel) o.i();
    }
}
