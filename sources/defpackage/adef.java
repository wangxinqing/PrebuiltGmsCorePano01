package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.util.SparseBooleanArray;
import java.util.Collection;
import java.util.Set;

/* renamed from: adef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adef {
    private final Context a;

    public adef(Context context) {
        this.a = context;
    }

    public final void a(Account account) {
        this.a.sendBroadcast(new Intent("com.google.android.gms.udc.action.FACS_CACHE_UPDATED"));
        for (String str : amsk.a(',').a().c(azrk.a.a().s())) {
            String str2 = account.name;
            if (hya.a(this.a).b(str)) {
                this.a.sendBroadcast(new Intent("com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT").setPackage(str).putExtra("com.google.android.gms.udc.extra.facsCacheAccountName", str2));
            }
        }
    }

    public final void a(Account account, atwh atwh, acyb acyb) {
        int a2;
        if (azrk.p()) {
            if ((azrk.i() || azrk.j() || !jix.a()) && azrk.n() && (acyb != null || azrk.i())) {
                Set b = jir.b();
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                if (acyb != null) {
                    atwh atwh2 = acyb.b;
                    if (atwh2 == null) {
                        atwh2 = atwh.d;
                    }
                    aucx aucx = atwh2.b;
                    int size = aucx.size();
                    for (int i = 0; i < size; i++) {
                        atwg atwg = (atwg) aucx.get(i);
                        sparseBooleanArray.put(atwg.b, atwg.c);
                    }
                }
                SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
                if (acyb != null) {
                    atwh atwh3 = acyb.b;
                    if (atwh3 == null) {
                        atwh3 = atwh.d;
                    }
                    aucx aucx2 = atwh3.b;
                    int size2 = aucx2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        atwg atwg2 = (atwg) aucx2.get(i2);
                        sparseBooleanArray2.put(atwg2.b, atwg2.d);
                    }
                }
                Set a3 = adhs.a();
                aucx aucx3 = atwh.b;
                int size3 = aucx3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    atwg atwg3 = (atwg) aucx3.get(i3);
                    if (!((sparseBooleanArray.indexOfKey(atwg3.b) >= 0 && sparseBooleanArray.get(atwg3.b) == atwg3.c && sparseBooleanArray2.get(atwg3.b) == atwg3.d) || (a2 = adht.a(atwg3.b)) == 0)) {
                        Integer valueOf = Integer.valueOf(a2);
                        if (!a3.contains(valueOf)) {
                            b.add(valueOf);
                        }
                    }
                }
                if (!b.isEmpty()) {
                    itg.a(this.a, account.name, jhx.a((Collection) b));
                }
            }
            if (acyb != null) {
                atwh atwh4 = acyb.b;
                if (atwh4 == null) {
                    atwh4 = atwh.d;
                }
                if (atwh.equals(atwh4)) {
                    return;
                }
            }
            a(account);
        }
    }
}
