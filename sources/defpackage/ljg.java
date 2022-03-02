package defpackage;

import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.List;

/* renamed from: ljg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ljg implements ljf {
    private Boolean a = false;

    private ljg() {
    }

    public static boolean a(Filter filter) {
        if (filter != null) {
            return ((Boolean) filter.a(new ljg())).booleanValue();
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return this.a;
    }

    public final /* bridge */ /* synthetic */ Object a(Operator operator, List list) {
        return this.a;
    }

    public final /* bridge */ /* synthetic */ Object a(Operator operator, kyq kyq, Object obj) {
        return this.a;
    }

    public final /* bridge */ /* synthetic */ Object a(kym kym, Object obj) {
        return this.a;
    }

    public final /* bridge */ /* synthetic */ Object a(kyq kyq) {
        return this.a;
    }

    public final /* bridge */ /* synthetic */ Object a(kyq kyq, Object obj) {
        return this.a;
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return this.a;
    }

    public static boolean a(Query query) {
        iva.a((Object) query);
        return a((Filter) query.a);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Boolean bool = (Boolean) obj;
        return this.a;
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        if (!str.isEmpty()) {
            this.a = true;
        }
        return this.a;
    }
}
