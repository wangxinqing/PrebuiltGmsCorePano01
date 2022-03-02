package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: arsw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arsw {
    public Object[] a;
    public int b = 0;
    private final Class c;

    public arsw(Class cls) {
        this.c = cls;
        this.a = (Object[]) Array.newInstance(cls, 0);
    }

    public final void a() {
        this.b = 0;
    }

    public final int b() {
        a(this.b + 1);
        return this.b - 1;
    }

    public final void a(int i) {
        b(i);
        this.b = i;
    }

    public final void b(int i) {
        if (this.a.length < i) {
            Object[] objArr = (Object[]) Array.newInstance(this.c, i);
            Object[] objArr2 = this.a;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            try {
                for (int length = this.a.length; length < i; length++) {
                    objArr[length] = this.c.newInstance();
                }
                this.a = objArr;
            } catch (InstantiationException e) {
                String name = this.c.getName();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 82);
                sb.append("Instantiation exception thrown in grow for class ");
                sb.append(name);
                sb.append(". Keeping original growing array.");
                sb.toString();
            } catch (IllegalAccessException e2) {
                String name2 = this.c.getName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 83);
                sb2.append("Illegal access exception thrown in grow for class ");
                sb2.append(name2);
                sb2.append(". Keeping original growing array.");
                sb2.toString();
            }
        }
    }

    public final void a(int i, String str) {
        if (i < 0 || i >= this.b) {
            StringBuilder sb = new StringBuilder(str.length() + 24);
            sb.append("Index out of bounds on ");
            sb.append(str);
            sb.append(".");
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    public final void a(Comparator comparator) {
        Arrays.sort(this.a, 0, this.b, comparator);
    }
}
