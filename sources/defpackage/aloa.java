package defpackage;

import java.util.List;

/* renamed from: aloa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aloa implements alpk {
    final /* synthetic */ alob a;

    public aloa(alob alob) {
        this.a = alob;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        List list = ((alrk) obj).a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            alrm alrm = (alrm) list.get(i);
            if (alrm.a == alrl.PERMISSION_CHANGED) {
                Object obj2 = alrm.b;
                boolean z = obj2 instanceof Boolean;
                String valueOf = String.valueOf(obj2.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
                sb.append("PERMISSION_CHANGED events should have a Boolean value, not ");
                sb.append(valueOf);
                alys.b(z, sb.toString());
                alob alob = this.a;
                alyv alyv = !((Boolean) alrm.b).booleanValue() ? alyv.READ_WRITE : alyv.READ_ONLY;
                if (alob.b != alyv) {
                    alob.b = alyv;
                    for (alnz a2 : alob.a) {
                        a2.a(alyv);
                    }
                }
            }
        }
    }
}
