package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import java.util.concurrent.TimeUnit;

/* renamed from: aknm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aknm extends jtv {
    final /* synthetic */ aknq a;

    public aknm(aknq aknq) {
        this.a = aknq;
    }

    public final void a(ContextData contextData) {
        int i;
        if (contextData != null) {
            aknq aknq = this.a;
            akki akki = aknq.g;
            if (akki == null) {
                aklz.a().b("Got ContextData but callback null");
            } else if (contextData.g() == aknq.a) {
                jut j = contextData.j();
                if (j != null) {
                    i = (int) TimeUnit.MILLISECONDS.toSeconds(j.d());
                } else {
                    i = 0;
                }
                try {
                    atta atta = (atta) contextData.a((aubq) atta.d);
                    if (atta != null) {
                        aucx aucx = atta.b;
                        astz[] astzArr = (astz[]) aucx.toArray(new astz[aucx.size()]);
                        aucx aucx2 = atta.a;
                        astv[] astvArr = (astv[]) aucx2.toArray(new astv[aucx2.size()]);
                        aklz.a();
                        int length = astvArr.length;
                        StringBuilder sb = new StringBuilder(57);
                        sb.append("Got ");
                        sb.append(length);
                        sb.append(" personalized places from Context Manager.");
                        sb.toString();
                        aknq.a(astvArr, astzArr, i, contextData.m(), aknq.f, 1);
                        aknq.f = false;
                        akki.a(astvArr, astzArr);
                        return;
                    }
                    throw new auda("Extension not set, or set with invalid bytes");
                } catch (auda e) {
                    auda auda = e;
                    aknq.a(new astv[0], new astz[0], i, contextData.m(), aknq.f, 2);
                    aklz.a().a("Failure parsing personalized places proto.", auda);
                }
            } else {
                akof a2 = aklz.a();
                int g = contextData.g();
                StringBuilder sb2 = new StringBuilder(43);
                sb2.append("Got ContextData with wrong name ");
                sb2.append(g);
                a2.b(sb2.toString());
            }
        } else {
            aklz.a().b("Received null ContextData update.");
        }
    }
}
