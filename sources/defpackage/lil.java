package defpackage;

import android.text.TextUtils;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: lil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lil implements ljf {
    private final khq a;
    private final List b;

    public lil(khq khq, List list) {
        this.a = khq;
        this.b = list;
    }

    private static lbc b(kyq kyq) {
        lbc a2 = lap.a(kyq);
        if (a2 != null) {
            return a2;
        }
        String valueOf = String.valueOf(kyq.a());
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Field unavailable: ") : "Field unavailable: ".concat(valueOf));
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return b(Operator.a, lce.G, "owner");
    }

    public static final lin b(Operator operator, kyq kyq, Object obj) {
        lbc b2 = b(kyq);
        String b3 = b2.b(obj);
        String a2 = !kyq.equals(lce.B) ? b2.a(obj) : null;
        if (kyq.equals(liu.b) && "application/vnd.google-apps.folder".equals(obj)) {
            kqy b4 = kne.MIME_TYPE.aB.b("application/vnd.google-apps.folder");
            kqh kqh = kne.MIME_TYPE.aB;
            kqh.b(2);
            return new liv(b4, kqz.b(kqh.a(), "application/vnd.google-apps.folder"));
        } else if (Operator.a.equals(operator)) {
            if (!kyq.equals(lce.B)) {
                return new liv(kqz.a(b3, a2), kqz.b(b3, a2));
            }
            String valueOf = String.valueOf(kpy.UNTRASHED.d);
            if (obj.equals(true)) {
                return new liv(kqz.b(b3, valueOf), kqz.a(b3, valueOf));
            }
            return new liv(kqz.a(b3, 0), kqz.b(b3, 0));
        } else if (Operator.b.equals(operator)) {
            return new liv(kqz.c(b3, a2), kqz.f(b3, a2));
        } else {
            if (Operator.c.equals(operator)) {
                return new liv(kqz.d(b3, a2), kqz.e(b3, a2));
            }
            if (Operator.d.equals(operator)) {
                return new liv(kqz.e(b3, a2), kqz.d(b3, a2));
            }
            if (Operator.e.equals(operator)) {
                return new liv(kqz.f(b3, a2), kqz.c(b3, a2));
            }
            if (Operator.h.equals(operator)) {
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 2);
                sb.append("%");
                sb.append(a2);
                sb.append("%");
                kqy g = kqz.g(b3, sb.toString());
                StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 2);
                sb2.append("%");
                sb2.append(a2);
                sb2.append("%");
                return new liv(g, kqz.h(b3, sb2.toString()));
            }
            String valueOf2 = String.valueOf(operator.i);
            throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Unsupported operator: ") : "Unsupported operator: ".concat(valueOf2));
        }
    }

    public final /* bridge */ /* synthetic */ Object a(Operator operator, List list) {
        if (Operator.f.equals(operator)) {
            return new lio(true, list, false);
        }
        if (Operator.g.equals(operator)) {
            return new lio(false, list, false);
        }
        String valueOf = String.valueOf(operator.i);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Not implemented logical operation:") : "Not implemented logical operation:".concat(valueOf));
    }

    public final /* bridge */ /* synthetic */ Object a(Operator operator, kyq kyq, Object obj) {
        return b(operator, kyq, obj);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ((lin) obj).a();
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        kqy kqy;
        String str2;
        List list = this.b;
        if (str != null && !TextUtils.isEmpty(str)) {
            kqh[] kqhArr = {kne.TITLE.aB, kne.DESCRIPTION.aB};
            iva.b(true);
            ArrayList arrayList = new ArrayList();
            Matcher matcher = lit.a.matcher(str);
            int i = 0;
            while (matcher.find()) {
                if (matcher.group(1) != null) {
                    str2 = matcher.group(1);
                } else if (matcher.group(2) != null) {
                    str2 = matcher.group(2);
                } else {
                    str2 = matcher.group();
                }
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    String replaceAll = str2.replaceAll("\\|", "||").replaceAll("%", "|%").replaceAll("_", "|_");
                    StringBuilder sb = new StringBuilder(String.valueOf(replaceAll).length() + 2);
                    sb.append("%");
                    sb.append(replaceAll);
                    sb.append("%");
                    arrayList.add(sb.toString());
                    i++;
                    if (i >= 10) {
                        break;
                    }
                }
            }
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            kqy kqy2 = null;
            if (!unmodifiableList.isEmpty()) {
                kqy kqy3 = null;
                for (String str3 : unmodifiableList) {
                    kqy kqy4 = null;
                    for (int i2 = 0; i2 < 2; i2++) {
                        kqy a2 = kqz.a(kqhArr[i2].a(), "\"|\"", str3);
                        if (kqy4 != null) {
                            kqy4 = kqz.b(kqy4, a2);
                        } else {
                            kqy4 = a2;
                        }
                    }
                    if (kqy3 != null) {
                        kqy3 = kqz.a(kqy3, kqy4);
                    } else {
                        kqy3 = kqy4;
                    }
                }
                kqy2 = kqy3;
            }
            if (kqy2 == null) {
                kqy2 = kqz.a;
            }
            if (!list.isEmpty()) {
                kqy2 = kqz.b(kqy2, lit.a(list));
            }
            kqy = kqz.a(kqy2, kne.TRASHED.aB.c());
        } else {
            kqy = kqz.b;
        }
        String str4 = kqy.a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 5);
        sb2.append("NOT(");
        sb2.append(str4);
        sb2.append(")");
        return new liv(kqy, kqz.a(sb2.toString(), (List) kqy.b));
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return new liv(kqz.a, kqz.b);
    }

    public final /* bridge */ /* synthetic */ Object a(kym kym, Object obj) {
        if (liu.d.equals(kym)) {
            DriveId driveId = (DriveId) obj;
            return new liv(lrr.a(false, driveId), lrr.a(true, driveId));
        }
        String valueOf = String.valueOf(kym);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
        sb.append("Unsupported field for contains comparison: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public final /* bridge */ /* synthetic */ Object a(kyq kyq) {
        String b2 = b(kyq).b((Object) null);
        return new liv(kqz.c(b2), kqz.b(b2));
    }

    public final /* bridge */ /* synthetic */ Object a(kyq kyq, Object obj) {
        if (liu.g.equals(kyq)) {
            Iterator it = ((AppVisibleCustomProperties) obj).iterator();
            CustomProperty customProperty = (CustomProperty) it.next();
            iva.b(!it.hasNext(), "value should have only 1 element");
            String str = customProperty.b;
            if (str == null) {
                return new liv(kqz.b, kqz.a);
            }
            return new liv(lrr.a(false, customProperty.a, this.a, str), lrr.a(true, customProperty.a, this.a, customProperty.b));
        }
        String valueOf = String.valueOf(kyq);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("Unsupported field for has comparison: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public final kqy a(Query query) {
        LogicalFilter logicalFilter = query.a;
        if (logicalFilter != null) {
            return ((lin) logicalFilter.a(this)).b();
        }
        return kqz.a;
    }
}
