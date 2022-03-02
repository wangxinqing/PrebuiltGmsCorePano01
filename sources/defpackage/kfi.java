package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.drive.internal.CheckResourceIdsExistRequest;
import com.google.android.gms.drive.internal.OnResourceIdSetResponse;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: kfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfi extends kez {
    private final CheckResourceIdsExistRequest f;

    public kfi(kec kec, CheckResourceIdsExistRequest checkResourceIdsExistRequest, kwg kwg) {
        super("CheckResourceIdsExistOperation", kec, kwg, 1);
        this.f = checkResourceIdsExistRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    /* JADX INFO: finally extract failed */
    public final void d(Context context) {
        HashSet hashSet;
        njc.a((Object) this.f, "checkResourceIds request may not be null.");
        njc.a((Object) this.f.a, "Invalid checkResourceIds request: no resource ids provided.");
        njc.a(this.f.a.size() <= 50, "Number of resource ids must be less than or equal to 50");
        kec kec = this.a;
        HashSet hashSet2 = new HashSet(this.f.a);
        kkf kkf = kec.e;
        khq khq = kec.d;
        iva.a((Object) khq);
        iva.a((Object) hashSet2);
        iva.b(hashSet2.size() <= 50);
        if (hashSet2.isEmpty()) {
            hashSet = new HashSet();
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < hashSet2.size(); i++) {
                arrayList.add("?");
            }
            kky a = ((kjp) kkf).a(khq, "EntryView", "ScopedEntryView", kqz.a(lrr.b(khq.a.b), kqz.a(String.format(Locale.US, "%s IN (%s)", new Object[]{kmj.RESOURCE_ID.c.a(), TextUtils.join(",", arrayList)}), (List) new ArrayList(hashSet2))), (String) null);
            try {
                HashSet hashSet3 = new HashSet();
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    kmp kmp = (kmp) it.next();
                    if (!kmp.A()) {
                        hashSet3.add(kmp.i());
                    }
                }
                a.close();
                hashSet = hashSet3;
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }
        this.b.a(new OnResourceIdSetResponse(new ArrayList(hashSet)));
    }
}
