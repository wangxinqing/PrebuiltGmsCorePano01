package defpackage;

import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: lik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lik implements ljf {
    private final jzr a;

    public lik(jzr jzr) {
        this.a = jzr;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return Boolean.valueOf("owner".equals((String) this.a.a(lce.G)));
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Object a(Operator operator, List list) {
        int i = 0;
        if (Operator.f.equals(operator)) {
            int size = list.size();
            while (i < size) {
                int i2 = i + 1;
                if (!((Boolean) list.get(i)).booleanValue()) {
                    return false;
                }
                i = i2;
            }
            return 1;
        } else if (!Operator.g.equals(operator)) {
            String valueOf = String.valueOf(operator.i);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unsupported logical operator: ") : "Unsupported logical operator: ".concat(valueOf));
        } else if (list.isEmpty()) {
            return 1;
        } else {
            int size2 = list.size();
            while (i < size2) {
                int i3 = i + 1;
                if (((Boolean) list.get(i)).booleanValue()) {
                    return 1;
                }
                i = i3;
            }
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ Object a(Operator operator, kyq kyq, Object obj) {
        if (Operator.a.equals(operator)) {
            return Boolean.valueOf(this.a.a(kyq).equals(obj));
        }
        if (Operator.h.equals(operator) && (obj instanceof String)) {
            return Boolean.valueOf(((String) this.a.a(kyq)).contains((String) obj));
        }
        boolean z = true;
        if (obj instanceof Comparable) {
            int compareTo = ((Comparable) this.a.a(kyq)).compareTo(obj);
            if (Operator.a.equals(operator)) {
                if (compareTo != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (Operator.b.equals(operator)) {
                if (compareTo >= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (Operator.c.equals(operator)) {
                if (compareTo > 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (Operator.d.equals(operator)) {
                if (compareTo <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (Operator.e.equals(operator)) {
                if (compareTo < 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        throw new IllegalArgumentException(String.format("Unsupported comparison operator %s for field %s", new Object[]{operator.i, kyq.toString()}));
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return Boolean.valueOf(!((Boolean) obj).booleanValue());
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        throw new IllegalArgumentException("Unsupported Filter: fullTextSearch");
    }

    public final /* bridge */ /* synthetic */ Object a(kym kym, Object obj) {
        return Boolean.valueOf(((Collection) this.a.a(kym)).contains(obj));
    }

    public final /* bridge */ /* synthetic */ Object a(kyq kyq) {
        return Boolean.valueOf(this.a.a(kyq) != null);
    }

    public final /* bridge */ /* synthetic */ Object a(kyq kyq, Object obj) {
        if (liu.g.equals(kyq)) {
            Iterator it = ((AppVisibleCustomProperties) obj).iterator();
            CustomProperty customProperty = (CustomProperty) it.next();
            iva.b(!it.hasNext(), "value should have only 1 element");
            if (customProperty.b == null) {
                return false;
            }
            AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) this.a.a(kyq);
            if (appVisibleCustomProperties != null) {
                return Boolean.valueOf(ius.a(appVisibleCustomProperties.a().get(customProperty.a), customProperty.b));
            }
            return false;
        }
        String valueOf = String.valueOf(kyq);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("Unsupported field for has comparison: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
