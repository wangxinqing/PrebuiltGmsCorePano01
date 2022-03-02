package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* renamed from: xxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xxn extends xxk {
    public xxn(xyp xyp, xwv xwv, xvw xvw, yaz yaz, xyg xyg) {
        super(xnd.REMOVE, xyp, xvw, yaz, xwv, xyg);
    }

    public final int b(List list) {
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((xvs) it.next()).a);
            }
            xwv xwv = this.e;
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (TextUtils.isEmpty(str)) {
                    Log.e("FSA2_ContactSyncGrpc", "@deleteContact: bailing out upon missing contact ID");
                } else {
                    arrayList2.add(str);
                }
            }
            xwv.a((List) arrayList2, "FSA_bulkDeletePeople");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                xvs xvs = (xvs) it2.next();
                if (!TextUtils.isEmpty(xvs.a)) {
                    e(xvs);
                }
            }
            return list.size();
        } catch (babk | eif | ArrayStoreException | JSONException | xya e) {
            Exception exc = e;
            if (exc instanceof babk) {
                wvo a = xxk.a(this.a);
                babj babj = ((babk) exc).a;
                int a2 = this.f.a(a, babj.r.r, babj.s);
                int i = a2 - 1;
                if (a2 == 0) {
                    throw null;
                } else if (i == 1) {
                    a(list);
                    this.d.a(this.a, xjo.CONTACT, false, 3, list.size());
                    return list.size();
                } else if (i == 5) {
                    return 0;
                }
            }
            if (xyi.a(false, xjo.CONTACT, this.a, exc, this.d, list.size()) != xnd.REMOVE) {
                return 0;
            }
            a(list);
            return list.size();
        }
    }

    /* access modifiers changed from: protected */
    public final void c(xvs xvs) {
        xwv xwv = this.e;
        String str = xvs.a;
        if (!TextUtils.isEmpty(str)) {
            xwv.a(Arrays.asList(new String[]{str}), "FSA_deletePeople");
            e(xvs);
            return;
        }
        Log.e("FSA2_ContactSyncGrpc", "@deleteContact: bailing out upon missing contact ID");
    }

    /* access modifiers changed from: protected */
    public final void d(xvs xvs) {
        throw new UnsupportedOperationException("Filtering invalid group membership before delete requests is not supported");
    }

    /* access modifiers changed from: protected */
    public final boolean b(xvs xvs) {
        if (xvs.a != null) {
            return true;
        }
        if (xvs.e == null) {
            this.d.a(xnd.REMOVE, xjo.CONTACT, false, 3, 1);
            e(xvs);
            return false;
        }
        Long l = xvs.d;
        xnd xnd = xnd.REMOVE;
        this.d.a(xnd, xjo.CONTACT, false, 3, 1);
        xip.a();
        if (((Boolean) xim.a.a()).booleanValue()) {
            this.d.a(xjo.CONTACT, xnd, "INSERT_FAILED_BEFORE", (Exception) null);
        }
        ((ybh) this.d).a.stats.numIoExceptions++;
        return false;
    }
}
