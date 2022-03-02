package defpackage;

import android.util.Pair;
import com.google.android.gms.mdd.FileGroupWithDownloadStatus;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class sco implements amqy {
    static final amqy a = new sco();

    private sco() {
    }

    public final Object a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Pair pair : (List) obj) {
            arrayList.add(new FileGroupWithDownloadStatus(((aflf) pair.first).b, ((aflf) pair.first).c, ((afkr) pair.second).e, ((aflf) pair.first).e));
        }
        return arrayList;
    }
}
