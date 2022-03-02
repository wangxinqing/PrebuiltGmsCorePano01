package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ahcm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahcm implements agzr {
    private ahcm() {
    }

    public static ahcm a() {
        return new ahcm();
    }

    public final /* bridge */ /* synthetic */ Object a(agzq agzq) {
        agzo agzo;
        OutputStream c = agzq.b.c(agzq.f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c);
        if (!agzq.d.isEmpty()) {
            List list = agzq.d;
            Uri uri = agzq.e;
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ahcc a = ((ahcq) list.get(i)).a(uri);
                if (a != null) {
                    arrayList2.add(a);
                }
            }
            if (!arrayList2.isEmpty()) {
                agzo = new agzo(c, arrayList2);
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
            arrayList.add(((ahcs) list2.get(i2)).a(agzq.e, (OutputStream) anbs.d(arrayList)));
        }
        Collections.reverse(arrayList);
        for (agzk b : agzq.g) {
            b.b(arrayList);
        }
        return (OutputStream) arrayList.get(0);
    }
}
