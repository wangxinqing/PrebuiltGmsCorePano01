package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ahcd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahcd implements agzr {
    public final /* bridge */ /* synthetic */ Object a(agzq agzq) {
        agzo agzo;
        OutputStream e = agzq.b.e(agzq.f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(e);
        if (!agzq.d.isEmpty()) {
            List list = agzq.d;
            Uri uri = agzq.e;
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ahcc b = ((ahcq) list.get(i)).b(uri);
                if (b != null) {
                    arrayList2.add(b);
                }
            }
            if (!arrayList2.isEmpty()) {
                agzo = new agzo(e, arrayList2);
            } else {
                agzo = null;
            }
            if (agzo != null) {
                arrayList.add(agzo);
            }
        }
        List list2 = agzq.c;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(((ahcs) list2.get(i2)).a((OutputStream) anbs.d(arrayList)));
        }
        Collections.reverse(arrayList);
        for (agzk b2 : agzq.g) {
            b2.b(arrayList);
        }
        return (OutputStream) arrayList.get(0);
    }
}
