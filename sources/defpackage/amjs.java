package defpackage;

/* renamed from: amjs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amjs extends aopn {
    private amju a;
    private final int b;

    public amjs(amju amju, int i) {
        this.a = amju;
        this.b = i;
    }

    /* access modifiers changed from: protected */
    public final String aK() {
        aoqa aoqa;
        amju amju = this.a;
        String str = null;
        if (!(amju == null || (aoqa = amju.a.a) == null)) {
            String valueOf = String.valueOf(aoqa);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
            sb.append("callable=[");
            sb.append(valueOf);
            sb.append("]");
            str = sb.toString();
            amjt amjt = (amjt) this.a.c.get();
            if (amjt != null) {
                String valueOf2 = String.valueOf(str);
                String valueOf3 = String.valueOf(amjt);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 10 + String.valueOf(valueOf3).length());
                sb2.append(valueOf2);
                sb2.append(", trial=[");
                sb2.append(valueOf3);
                sb2.append("]");
                return sb2.toString();
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        long j;
        int i;
        int a2;
        amjt amjt;
        amju amju = this.a;
        this.a = null;
        if (amju != null) {
            do {
                j = amju.b.get();
                i = (int) j;
                a2 = amju.a(j);
                if (i == Integer.MIN_VALUE) {
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("Refcount is: ");
                    sb.append(j);
                    throw new AssertionError(sb.toString());
                } else if (i == -2147483647) {
                    a2++;
                }
            } while (!amju.b.compareAndSet(j, amju.a(a2, i - 1)));
            if (i == -2147483647) {
                do {
                    amjt = (amjt) amju.c.get();
                    if (amjt != null && amjt.a <= this.b) {
                        amjt.cancel(true);
                    } else {
                        return;
                    }
                } while (!amju.c.compareAndSet(amjt, (Object) null));
            }
        }
    }
}
