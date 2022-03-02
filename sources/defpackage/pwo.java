package defpackage;

import android.net.Uri;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.UsageInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: pwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pwo {
    private static final DocumentSection[] a = {UsageInfo.a(""), UsageInfo.a(Uri.EMPTY), UsageInfo.a("intent_action", ""), UsageInfo.a("intent_data", ""), dvb.a(".private:action", bazc.d)};
    private static final String[] b = {"title", "web_url", "intent_action", "intent_data", ".private:action"};

    private static int a(String str) {
        int i = 0;
        while (true) {
            String[] strArr = b;
            if (i >= strArr.length) {
                return -1;
            }
            if (strArr[i].equals(str)) {
                return i;
            }
            i++;
        }
    }

    public static oqo a(oqo oqo) {
        aucx aucx = oqo.e;
        int size = aucx.size();
        int i = 0;
        while (i < size) {
            oqy oqy = ((oqn) aucx.get(i)).d;
            if (oqy == null) {
                oqy = oqy.r;
            }
            i++;
            if (a(oqy.b) == -1) {
                return oqo;
            }
        }
        ArrayList arrayList = new ArrayList(Collections.nCopies(b.length, (Object) null));
        aucx aucx2 = oqo.e;
        int size2 = aucx2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            oqn oqn = (oqn) aucx2.get(i2);
            oqy oqy2 = oqn.d;
            if (oqy2 == null) {
                oqy2 = oqy.r;
            }
            int a2 = a(oqy2.b);
            aucd aucd = (aucd) oqn.c(5);
            aucd.a((aucj) oqn);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            oqn oqn2 = (oqn) aucd.b;
            oqn oqn3 = oqn.e;
            oqn2.a |= 1;
            oqn2.b = a2;
            arrayList.set(a2, (oqn) aucd.i());
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (arrayList.get(i3) == null) {
                DocumentSection documentSection = a[i3];
                oqy a3 = ozq.a(documentSection.d);
                aucd aucd2 = (aucd) a3.c(5);
                aucd2.a((aucj) a3);
                if (documentSection.e != DocumentSection.a) {
                    int i4 = documentSection.e;
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    oqy oqy3 = (oqy) aucd2.b;
                    auct auct = oqy.i;
                    oqy3.a |= 512;
                    oqy3.n = i4;
                }
                aucd o = oqn.e.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                oqn oqn4 = (oqn) o.b;
                oqy oqy4 = (oqy) aucd2.i();
                oqy4.getClass();
                oqn4.d = oqy4;
                oqn4.a |= 32;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                oqn oqn5 = (oqn) o.b;
                oqn5.a |= 1;
                oqn5.b = i3;
                arrayList.set(i3, (oqn) o.i());
            }
        }
        aucd aucd3 = (aucd) oqo.c(5);
        aucd3.a((aucj) oqo);
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        oqo oqo2 = oqo.g;
        ((oqo) aucd3.b).e = aucj.s();
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        oqo oqo3 = (oqo) aucd3.b;
        oqo3.a();
        auab.a((Iterable) arrayList, (List) oqo3.e);
        return (oqo) aucd3.i();
    }
}
