package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

@Deprecated
/* renamed from: rhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rhg extends ile implements icl {
    public rhg(DataHolder dataHolder) {
        super(dataHolder);
    }

    public final Status aO() {
        return ris.h(this.a.e);
    }

    /* renamed from: b */
    public final rhf a(int i) {
        return new rja(this.a, i);
    }

    public final String toString() {
        iur a = ius.a(this);
        a.a("status", aO());
        return a.toString();
    }
}
