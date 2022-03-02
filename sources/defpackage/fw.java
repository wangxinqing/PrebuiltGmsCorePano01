package defpackage;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: fw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fw extends ht implements hg, hj {
    final hl a;
    boolean b;
    public int c;

    public fw(hl hlVar) {
        hlVar.p();
        gx gxVar = hlVar.k;
        if (gxVar != null) {
            gxVar.c.getClassLoader();
        }
        this.c = -1;
        this.a = hlVar;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.m;
    }

    public final int c() {
        return this.o;
    }

    public final CharSequence d() {
        int i = this.m;
        return i != 0 ? this.a.k.c.getText(i) : this.n;
    }

    public final CharSequence e() {
        int i = this.o;
        return i != 0 ? this.a.k.c.getText(i) : this.p;
    }

    public final int f() {
        return a(false);
    }

    public final int g() {
        return a(true);
    }

    public final void h() {
        l();
        this.a.b(this, false);
    }

    public final void i() {
        l();
        this.a.b(this, true);
    }

    public final String j() {
        return this.l;
    }

    public final boolean k() {
        return this.d.isEmpty();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.l != null) {
            sb.append(" ");
            sb.append(this.l);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final int a(boolean z) {
        if (!this.b) {
            if (hl.a(2)) {
                "Commit: " + this;
                PrintWriter printWriter = new PrintWriter(new iy());
                a("  ", printWriter);
                printWriter.close();
            }
            this.b = true;
            if (this.j) {
                this.c = this.a.f.getAndIncrement();
            } else {
                this.c = -1;
            }
            this.a.a((hj) this, z);
            return this.c;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void b(gj gjVar) {
        hl hlVar = gjVar.D;
        if (hlVar == null || hlVar == this.a) {
            a(new hs(4, gjVar));
            return;
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + gjVar.toString() + " is already attached to a FragmentManager.");
    }

    public final void c(gj gjVar) {
        hl hlVar = gjVar.D;
        if (hlVar == null || hlVar == this.a) {
            a(new hs(3, gjVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + gjVar.toString() + " is already attached to a FragmentManager.");
    }

    public final void d(gj gjVar) {
        hl hlVar;
        if (gjVar == null || (hlVar = gjVar.D) == null || hlVar == this.a) {
            a(new hs(8, gjVar));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + gjVar.toString() + " is already attached to a FragmentManager.");
    }

    public final void e(gj gjVar) {
        hl hlVar = gjVar.D;
        if (hlVar == null || hlVar == this.a) {
            a(new hs(5, gjVar));
            return;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + gjVar.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        if (this.j) {
            if (hl.a(2)) {
                "Bump nesting in " + this + " by " + i;
            }
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                hs hsVar = (hs) this.d.get(i2);
                gj gjVar = hsVar.b;
                if (gjVar != null) {
                    gjVar.C += i;
                    if (hl.a(2)) {
                        "Bump nesting of " + hsVar.b + " to " + hsVar.b.C;
                    }
                }
            }
        }
    }

    public final void a(int i, gj gjVar, String str, int i2) {
        Class<?> cls = gjVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = gjVar.J;
            if (str2 == null || str.equals(str2)) {
                gjVar.J = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + gjVar + ": was " + gjVar.J + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = gjVar.H;
                if (i3 == 0 || i3 == i) {
                    gjVar.H = i;
                    gjVar.I = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + gjVar + ": was " + gjVar.H + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + gjVar + " with tag " + str + " to container view with no id");
            }
        }
        a(new hs(i2, gjVar));
        gjVar.D = this.a;
    }

    public final void a(gj gjVar) {
        hl hlVar = gjVar.D;
        if (hlVar == null || hlVar == this.a) {
            a(new hs(6, gjVar));
            return;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + gjVar.toString() + " is already attached to a FragmentManager.");
    }

    public final void a(String str, PrintWriter printWriter) {
        a(str, printWriter, true);
    }

    public final void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.l);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
            }
            if (!(this.e == 0 && this.f == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (!(this.g == 0 && this.h == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (!(this.m == 0 && this.n == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.n);
            }
            if (!(this.o == 0 && this.p == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.p);
            }
        }
        if (!this.d.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                hs hsVar = (hs) this.d.get(i);
                switch (hsVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + hsVar.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(hsVar.b);
                if (z) {
                    if (!(hsVar.c == 0 && hsVar.d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(hsVar.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(hsVar.d));
                    }
                    if (hsVar.e != 0 || hsVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(hsVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(hsVar.f));
                    }
                }
            }
        }
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (hl.a(2)) {
            "Run: " + this;
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.j) {
            return true;
        }
        hl hlVar = this.a;
        if (hlVar.b == null) {
            hlVar.b = new ArrayList();
        }
        hlVar.b.add(this);
        return true;
    }
}
