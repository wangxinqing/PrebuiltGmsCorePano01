package defpackage;

import java.util.Stack;

/* renamed from: cjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cjh {
    public final StringBuilder a = new StringBuilder();
    private final Stack b = new Stack();
    private final Stack c = new Stack();

    public cjh() {
        this.c.push(true);
        this.b.push("AND");
    }

    private static final String a(Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf.contains("'")) {
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
            sb.append("\"");
            sb.append(valueOf);
            sb.append("\"");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb2.append("'");
        sb2.append(valueOf);
        sb2.append("'");
        return sb2.toString();
    }

    private final void f() {
        this.c.push(true);
        this.a.append(" (");
    }

    public final String b() {
        return this.a.toString();
    }

    public final void c() {
        this.a.append(" )");
        this.b.pop();
        this.c.pop();
    }

    public final void d() {
        if (!this.b.isEmpty()) {
            a();
        }
        this.b.push("AND");
        f();
    }

    public final void e() {
        if (!this.b.isEmpty()) {
            a();
        }
        this.b.push("OR");
        f();
    }

    public final void b(String str, Object obj) {
        a();
        StringBuilder sb = this.a;
        sb.append(' ');
        sb.append(str);
        sb.append(" <= ");
        sb.append(obj);
    }

    public final void a() {
        if (((Boolean) this.c.peek()).booleanValue()) {
            this.c.pop();
            this.c.push(false);
            return;
        }
        StringBuilder sb = this.a;
        String valueOf = String.valueOf((String) this.b.peek());
        sb.append(valueOf.length() == 0 ? new String(" ") : " ".concat(valueOf));
    }

    public final void a(String str, Object obj) {
        a();
        StringBuilder sb = this.a;
        sb.append(' ');
        sb.append(str);
        sb.append(" >= ");
        sb.append(obj);
    }

    public final void a(String str, Object obj, boolean z) {
        a();
        StringBuilder sb = this.a;
        sb.append(' ');
        sb.append(str);
        sb.append('=');
        if (z) {
            this.a.append(a(obj));
        } else {
            this.a.append(obj);
        }
    }

    public final void a(String str, Object[] objArr) {
        a();
        StringBuilder sb = this.a;
        sb.append(' ');
        sb.append(str);
        this.a.append(" IN (");
        int length = objArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            if (!z) {
                this.a.append(',');
            }
            this.a.append(a(obj));
            i++;
            z = false;
        }
        this.a.append(')');
    }
}
