package defpackage;

import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.List;
import java.util.Locale;

/* renamed from: lij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lij implements ljf {
    private final String a;

    public lij(String str) {
        this.a = str;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return lck.a("owners", "'me'");
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return lck.a;
    }

    public final /* bridge */ /* synthetic */ Object a(Operator operator, List list) {
        if (Operator.f.equals(operator)) {
            return lck.a(list);
        }
        if (Operator.g.equals(operator)) {
            return lck.a("or", list);
        }
        String valueOf = String.valueOf(operator.i);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unsupported logical operator: ") : "Unsupported logical operator: ".concat(valueOf));
    }

    public final /* bridge */ /* synthetic */ Object a(Operator operator, kyq kyq, Object obj) {
        lbc a2 = lap.a(kyq);
        lcv lcv = a2.c;
        if (lcv == null || !lcv.b) {
            return lck.a;
        }
        String str = lcv.a;
        String b = a2.b(obj, this.a);
        if (Operator.a.equals(operator)) {
            return lck.c(str, b);
        }
        if (Operator.b.equals(operator)) {
            return lck.d(str, b);
        }
        if (Operator.c.equals(operator)) {
            return lck.a(str, b, "<=");
        }
        if (Operator.d.equals(operator)) {
            return lck.a(str, b, ">");
        }
        if (Operator.e.equals(operator)) {
            return lck.a(str, b, ">=");
        }
        if (Operator.h.equals(operator)) {
            return lck.b(str, b);
        }
        String valueOf = String.valueOf(operator.i);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unsupported comparison operator: ") : "Unsupported comparison operator: ".concat(valueOf));
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new lck(String.format(Locale.US, "(not %s)", new Object[]{((lck) obj).b}));
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        return lck.a(str);
    }

    public final /* bridge */ /* synthetic */ Object a(kym kym, Object obj) {
        lao lao = (lao) lap.a.get(kym);
        lcv lcv = lao.c;
        if (lcv != null && lcv.b) {
            return lck.a(lcv.a, lao.a(obj, this.a));
        }
        return lck.a;
    }

    public final /* bridge */ /* synthetic */ Object a(kyq kyq) {
        if (liu.h.equals(kyq)) {
            return lck.a();
        }
        return lck.a;
    }

    public final /* bridge */ /* synthetic */ Object a(kyq kyq, Object obj) {
        lbc a2 = lap.a(kyq);
        lcv lcv = a2.c;
        if (lcv == null || !lcv.b) {
            return lck.a;
        }
        String str = lcv.a;
        String b = a2.b(obj, this.a);
        return new lck(String.format(Locale.US, "%s has { %s }", new Object[]{str, b}));
    }

    public final lck a(Query query) {
        LogicalFilter logicalFilter = query.a;
        return logicalFilter != null ? (lck) logicalFilter.a(this) : lck.a;
    }
}
