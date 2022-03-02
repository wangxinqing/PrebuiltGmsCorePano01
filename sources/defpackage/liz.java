package defpackage;

import com.google.android.gms.drive.query.internal.Operator;
import java.util.List;

/* renamed from: liz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class liz implements ljf {
    public final /* bridge */ /* synthetic */ Object a() {
        return "ownedByMe()";
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return "all()";
    }

    public final /* bridge */ /* synthetic */ Object a(Operator operator, List list) {
        StringBuilder sb = new StringBuilder(String.valueOf(operator.i).concat("("));
        int size = list.size();
        String str = "";
        int i = 0;
        while (i < size) {
            sb.append(str);
            sb.append((String) list.get(i));
            i++;
            str = ",";
        }
        sb.append(")");
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ Object a(Operator operator, kyq kyq, Object obj) {
        return String.format("cmp(%s,%s,%s)", new Object[]{operator.i, kyq.a(), obj});
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return String.format("not(%s)", new Object[]{(String) obj});
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        return String.format("fullTextSearch(%s)", new Object[]{str});
    }

    public final /* bridge */ /* synthetic */ Object a(kym kym, Object obj) {
        return String.format("contains(%s,%s)", new Object[]{kym.a, obj});
    }

    public final /* bridge */ /* synthetic */ Object a(kyq kyq) {
        return String.format("fieldOnly(%s)", new Object[]{kyq.a()});
    }

    public final /* bridge */ /* synthetic */ Object a(kyq kyq, Object obj) {
        return String.format("has(%s,%s)", new Object[]{kyq.a(), obj});
    }
}
