package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.IceCandidate;

/* renamed from: usv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class usv {
    public static asmq a(usu usu) {
        aucd o = asmq.c.o();
        String str = usu.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmq asmq = (asmq) o.b;
        str.getClass();
        asmq.a |= 1;
        asmq.b = str;
        return (asmq) o.i();
    }

    public static asmu a(usu usu, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IceCandidate iceCandidate = (IceCandidate) it.next();
            aucd o = asmn.e.o();
            String str = iceCandidate.c;
            if (o.c) {
                o.c();
                o.c = false;
            }
            asmn asmn = (asmn) o.b;
            str.getClass();
            int i = asmn.a | 1;
            asmn.a = i;
            asmn.b = str;
            String str2 = iceCandidate.a;
            str2.getClass();
            int i2 = i | 2;
            asmn.a = i2;
            asmn.c = str2;
            int i3 = iceCandidate.b;
            asmn.a = i2 | 4;
            asmn.d = i3;
            arrayList.add((asmn) o.i());
        }
        aucd o2 = asmu.f.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asmu asmu = (asmu) o2.b;
        asmu.e = 3;
        asmu.a |= 2;
        asmq a = a(usu);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asmu asmu2 = (asmu) o2.b;
        a.getClass();
        asmu2.d = a;
        asmu2.a |= 1;
        aucd o3 = asmo.b.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        asmo asmo = (asmo) o3.b;
        if (!asmo.a.a()) {
            asmo.a = aucj.a(asmo.a);
        }
        auab.a((Iterable) arrayList, (List) asmo.a);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asmu asmu3 = (asmu) o2.b;
        asmo asmo2 = (asmo) o3.i();
        asmo2.getClass();
        asmu3.c = asmo2;
        asmu3.b = 5;
        return (asmu) o2.i();
    }
}
