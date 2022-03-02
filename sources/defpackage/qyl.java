package defpackage;

import android.content.ComponentName;

/* renamed from: qyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qyl implements amrm {
    public final int a;
    public final int b;
    private final int c;
    private final String d;
    private final String e;
    private final String f;

    public qyl(qyk qyk) {
        this.c = qyk.a;
        this.d = qyk.d;
        this.e = qyk.e;
        this.f = qyk.f;
        this.a = qyk.c;
        this.b = qyk.b;
    }

    public static qyl a(int i) {
        qyk qyk = new qyk();
        qyk.a(i);
        return qyk.a();
    }

    private final boolean b(int i) {
        return (i & this.c) == 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qyl) {
            qyl qyl = (qyl) obj;
            if (this.c != qyl.c || this.a != qyl.a || this.b != qyl.b || !ius.a(this.d, qyl.d) || !ius.a(this.e, qyl.e) || !ius.a(this.f, qyl.f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public static qyl a(int i, ComponentName componentName) {
        qyk qyk = new qyk();
        qyk.a(i);
        qyk.b(componentName.getPackageName());
        qyk.a(componentName.getClassName());
        return qyk.a();
    }

    public static qyl a(int i, ComponentName componentName, String str) {
        qyk qyk = new qyk();
        qyk.a(i);
        qyk.c(str);
        qyk.b(componentName.getPackageName());
        qyk.a(componentName.getClassName());
        return qyk.a();
    }

    private static boolean a(String str, String str2) {
        return str == str2 || (str != null && str.equals(str2));
    }

    public final boolean a(qyi qyi) {
        if ((b(16) || this.a == ((int) qyi.b)) && ((b(1) || a(this.d, qyi.c)) && ((b(2) || a(this.e, qyi.d)) && (b(4) || a(this.f, qyi.e))))) {
            if (b(8)) {
                return true;
            }
            int i = this.b;
            int i2 = qyi.a;
            return (i & i2) == i2;
        }
    }
}
