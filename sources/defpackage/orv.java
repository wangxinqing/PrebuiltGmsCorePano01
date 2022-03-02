package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: orv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class orv {
    public final /* synthetic */ osf a;

    public orv(osf osf) {
        this.a = osf;
    }

    public final Set a(ozc ozc) {
        amzy b = this.a.a().b(ozc, 2);
        HashSet hashSet = new HashSet(b.size());
        for (int i = 0; i < b.size(); i++) {
            osz osz = ((ota) b.get(i)).b;
            if (osz == null) {
                osz = osz.s;
            }
            hashSet.add(osz.c);
        }
        return hashSet;
    }
}
