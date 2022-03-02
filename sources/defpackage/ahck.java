package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahck implements agzr {
    private static void a(agzs agzs, Uri uri, List list) {
        try {
            if (agzs.d(uri)) {
                for (Uri a : agzs.f(uri)) {
                    a(agzs, a, list);
                }
                agzs.b(uri);
                return;
            }
            agzs.a(uri);
        } catch (IOException e) {
            list.add(e);
        }
    }

    public final /* bridge */ /* synthetic */ Object a(agzq agzq) {
        ArrayList arrayList = new ArrayList();
        a(agzq.a, agzq.f, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        throw ahbt.a("Failed to delete one or more files", arrayList);
    }
}
