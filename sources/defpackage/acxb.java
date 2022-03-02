package defpackage;

/* renamed from: acxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class acxb extends acxw {
    public int a() {
        return 524290;
    }

    /* access modifiers changed from: protected */
    public final void a(acxa acxa, long j, Object[] objArr) {
        boolean c = azqq.c();
        int length = objArr.length;
        if (length >= 2) {
            try {
                a(acxa, objArr[0], objArr[1].intValue());
            } catch (ClassCastException e) {
                if (!c) {
                }
            }
        } else if (c) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("wrong number of operands: ");
            sb.append(length);
            sb.toString();
        }
    }

    /* access modifiers changed from: protected */
    public void a(acxa acxa, String str, int i) {
        String valueOf = String.valueOf(str);
        acxa.b(valueOf.length() == 0 ? new String("tron_varz_") : "tron_varz_".concat(valueOf), i);
    }
}
