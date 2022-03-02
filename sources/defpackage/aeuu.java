package defpackage;

/* renamed from: aeuu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeuu implements aerh {
    public final String a(aukh aukh) {
        boolean z;
        aukv aukv;
        int i = aukh.a;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        String valueOf = String.valueOf(aukg.a(i));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 78);
        sb.append("This converter should be applied to Footprints ChannelId. Actually called for ");
        sb.append(valueOf);
        amrl.a(z, (Object) sb.toString());
        if (aukh.a == 2) {
            aukv = (aukv) aukh.b;
        } else {
            aukv = aukv.e;
        }
        amre a = amre.a(':');
        String num = Integer.toString(aukv.b);
        Object[] objArr = new Object[2];
        objArr[0] = Integer.toString(aukv.c);
        auku a2 = auku.a(aukv.d);
        if (a2 == null) {
            a2 = auku.UNKNOWN;
        }
        objArr[1] = Integer.toString(a2.e);
        return a.a("fs", num, objArr);
    }
}
