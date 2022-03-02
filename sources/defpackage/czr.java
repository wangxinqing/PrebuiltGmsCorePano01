package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: czr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class czr extends czi {
    public final czu a;
    public String e;

    public czr(Context context, List list, cyg cyg, aqrj aqrj, czu czu, String str, djk djk) {
        super(context, a(list, aqrj, str), cyg, djk);
        this.a = czu;
        this.e = str;
    }

    public static List a(List list, aqrj aqrj, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new czp((aqsz) it.next()));
        }
        if (aqrj != null && !jlh.d(str)) {
            arrayList.add(new czo(aqrj));
        }
        return arrayList;
    }

    public final int a(int i) {
        int a2 = ((cze) this.g.get(i)).a();
        if (a2 == 6 || a2 == 7) {
            return a2 - 1;
        }
        return 0;
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(this.j);
        if (i == 5) {
            return new czq(this, from.inflate(R.layout.as_search_item, viewGroup, false));
        }
        if (i == 6) {
            return new czn(this, from.inflate(R.layout.as_search_item, viewGroup, false));
        }
        return super.a(viewGroup);
    }
}
