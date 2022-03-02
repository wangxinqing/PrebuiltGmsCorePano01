package defpackage;

import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.QueryFilterParameters;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;

/* renamed from: cjp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cjp {
    public static String a(ContextDataFilterImpl contextDataFilterImpl) {
        int i;
        QueryFilterParameters queryFilterParameters = contextDataFilterImpl.c;
        int[] iArr = queryFilterParameters != null ? queryFilterParameters.c : null;
        cji.b();
        cjh a = cji.a();
        if (contextDataFilterImpl.b()) {
            int size = contextDataFilterImpl.a.size();
            if (size > 1) {
                a.e();
            }
            ArrayList arrayList = contextDataFilterImpl.a;
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ContextDataFilterImpl.Inclusion inclusion = (ContextDataFilterImpl.Inclusion) arrayList.get(i2);
                a.d();
                inclusion.a();
                if (inclusion.b()) {
                    a.a("context_name", Integer.valueOf(inclusion.b), false);
                }
                if (inclusion.c()) {
                    TimeFilterImpl timeFilterImpl = inclusion.c;
                    ArrayList arrayList2 = timeFilterImpl.a;
                    if (arrayList2.size() > 1) {
                        a.e();
                    }
                    int[] iArr2 = timeFilterImpl.b;
                    if (iArr2 != null) {
                        int length = iArr2.length;
                        if (length > 1) {
                            a.e();
                            i = 0;
                        } else {
                            i = 0;
                        }
                        while (i < length) {
                            a.a("time_type", Integer.valueOf(iArr2[i]), false);
                            i++;
                        }
                        if (iArr2.length > 1) {
                            a.c();
                        }
                    }
                    int size3 = arrayList2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        TimeFilterImpl.Interval interval = (TimeFilterImpl.Interval) arrayList2.get(i3);
                        a.d();
                        if (interval.a()) {
                            a.a("end_time", (Object) Long.valueOf(interval.a));
                        }
                        if (interval.b()) {
                            a.b("start_time", Long.valueOf(interval.b));
                        }
                        a.c();
                    }
                    if (arrayList2.size() > 1) {
                        a.c();
                    }
                }
                if (inclusion.d()) {
                    a(a, inclusion.d);
                }
                if (iArr != null) {
                    a.a();
                    a.a.append(" sync_state");
                    a.a.append(" IN (");
                    int length2 = iArr.length;
                    int i4 = 0;
                    boolean z = true;
                    while (i4 < length2) {
                        int i5 = iArr[i4];
                        if (!z) {
                            a.a.append(',');
                        }
                        a.a.append(i5);
                        i4++;
                        z = false;
                    }
                    a.a.append(')');
                }
                a.c();
            }
            if (size > 1) {
                a.c();
            }
        }
        if (contextDataFilterImpl.c()) {
            a.e();
            ArrayList arrayList3 = contextDataFilterImpl.b;
            int size4 = arrayList3.size();
            for (int i6 = 0; i6 < size4; i6++) {
                a.a("module_id", (String) arrayList3.get(i6), true);
            }
            a.c();
        }
        return a.b();
    }

    public static String a(jum jum) {
        cji.b();
        cjh a = cji.a();
        if (jum.b()) {
            int size = jum.c.size();
            if (size > 1) {
                a.e();
            }
            int i = jum.b;
            ArrayList arrayList = jum.c;
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                jul jul = (jul) arrayList.get(i2);
                a.d();
                if (i == 0) {
                    a.a();
                    a.a.append(" (account_id");
                    a.a.append(" IS NULL OR account_id");
                    a.a.append(" = '')");
                } else if (i == 1) {
                    a.a("account_id", jum.a.b, true);
                }
                a.a("type", Integer.valueOf(jul.a), false);
                ArrayList arrayList2 = jul.b.a;
                int size3 = arrayList2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    TimeFilterImpl.Interval interval = (TimeFilterImpl.Interval) arrayList2.get(i3);
                    if (interval.a()) {
                        a.a("end_time", (Object) Long.valueOf(interval.a));
                    }
                    if (interval.b()) {
                        a.b("start_time", Long.valueOf(interval.b));
                    }
                }
                KeyFilterImpl keyFilterImpl = jul.c;
                if (keyFilterImpl != null) {
                    a(a, keyFilterImpl);
                }
                a.c();
            }
            if (size > 1) {
                a.c();
            }
        }
        return a.b();
    }

    public static String a(jxo jxo) {
        int i;
        QueryFilterParameters a = jxo.a();
        if (a == null || (i = a.b) == -1) {
            return null;
        }
        if (i > 0) {
            return Integer.toString(i);
        }
        ((anih) ((anih) bxk.a.b()).a("cjp", "a", 249, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextFilterSqlBuilder] Limit is invalid value: %s", i);
        return null;
    }

    public static String a(jxo jxo, String str) {
        int i;
        QueryFilterParameters a = jxo.a();
        if (a == null || (i = a.a) == 0) {
            return null;
        }
        if (i != 1) {
            ((anih) ((anih) bxk.a.b()).a("cjp", "a", 233, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextFilterSqlBuilder] Unknown order by value: %s", i);
            return null;
        }
        cji.b();
        return String.valueOf(str).concat(" DESC");
    }

    private static void a(cjh cjh, KeyFilterImpl keyFilterImpl) {
        if (!keyFilterImpl.a.isEmpty()) {
            cjh.e();
            ArrayList arrayList = keyFilterImpl.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                KeyFilterImpl.Inclusion inclusion = (KeyFilterImpl.Inclusion) arrayList.get(i);
                cjh.d();
                String[] strArr = inclusion.a;
                if (strArr != null) {
                    cjh.a("string_key1", (Object[]) strArr);
                }
                String[] strArr2 = inclusion.b;
                if (strArr2 != null) {
                    cjh.a("string_key2", (Object[]) strArr2);
                }
                String[] strArr3 = inclusion.c;
                if (strArr3 != null) {
                    cjh.a("string_key3", (Object[]) strArr3);
                }
                cjh.c();
            }
            cjh.c();
        }
    }
}
