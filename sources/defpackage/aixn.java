package defpackage;

import java.util.ArrayList;

/* renamed from: aixn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aixn implements Runnable {
    private final aibv[] a;
    private final aisi b;

    public aixn(aisi aisi, aibv[] aibvArr) {
        this.b = aisi;
        this.a = aibvArr;
    }

    public final void run() {
        int i;
        aisi aisi = this.b;
        aibv[] aibvArr = this.a;
        int i2 = aixo.c;
        aise aise = aisi.a.a;
        if (aise.c == 3) {
            aisg aisg = aise.e;
            aibo a2 = airp.a(aisg.a.d).a(aibvArr);
            aicn o = aisg.a.a.o();
            if (a2 == null || a2.d != aiau.OK) {
                i = 0;
            } else {
                i = 1;
            }
            o.a(new aicl(aico.RTT_LOCATION_RESULT, o.b(), "status=%2$d apCount=%3$d", (Object) null, i, aibvArr.length, 0));
            if (a2 == null || a2.d != aiau.OK) {
                aish aish = aise.f;
                aise aise2 = aish.a.b;
                if (aise2 != null) {
                    aise2.a();
                    aish.a.b = null;
                }
                aise.c = 4;
                return;
            }
            aish aish2 = aise.f;
            String valueOf = String.valueOf(a2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
            sb.append("postNewLocation: ");
            sb.append(valueOf);
            sb.toString();
            aiax aiax = new aiax(a2, a2);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(aiax);
            aish2.a.a.i().b(arrayList, 3);
            aise.b(aise.a);
        }
    }
}
