package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.EventParams;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: suk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class suk extends swm {
    protected static final AtomicReference a = new AtomicReference();
    protected static final AtomicReference b = new AtomicReference();
    protected static final AtomicReference c = new AtomicReference();

    public suk(svv svv) {
        super(svv);
    }

    private static final String a(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z;
        String str2;
        iva.a((Object) strArr);
        iva.a((Object) strArr2);
        iva.a((Object) atomicReference);
        int i = 0;
        if (strArr.length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        while (i < strArr.length) {
            if (!szj.b(str, strArr[i])) {
                i++;
            } else {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final String b(String str) {
        if (str != null) {
            return b() ? a(str, swq.b, swq.a, b) : str;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!b()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return a(str, swr.b, swr.a, c);
        }
        return "experiment_id(" + str + ")";
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        if (u().a) {
            return this.x.E().a(3);
        }
        return this.x.j() && this.x.E().a(3);
    }

    /* access modifiers changed from: protected */
    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!b()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(b(str));
            sb.append("=");
            if (!ayij.b() || !v().a(sud.aK)) {
                sb.append(bundle.get(str));
            } else {
                Object obj = bundle.get(str);
                sb.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
            }
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(EventParams eventParams) {
        if (eventParams == null) {
            return null;
        }
        if (!b()) {
            return eventParams.toString();
        }
        return a(eventParams.a());
    }

    /* access modifiers changed from: protected */
    public final String a(String str) {
        if (str != null) {
            return b() ? a(str, swp.b, swp.a, a) : str;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String a(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = a(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
