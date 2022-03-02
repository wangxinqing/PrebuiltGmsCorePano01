package defpackage;

/* renamed from: anav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class anav extends amzm {
    Object[] d;
    private int e;

    public anav() {
        super(4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: anfv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: anax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: anfv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: anfv} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.anax a() {
        /*
            r8 = this;
            int r0 = r8.b
            if (r0 == 0) goto L_0x005b
            r1 = 1
            if (r0 == r1) goto L_0x0051
            java.lang.Object[] r2 = r8.d
            if (r2 != 0) goto L_0x000c
            goto L_0x003d
        L_0x000c:
            int r0 = defpackage.anax.b(r0)
            java.lang.Object[] r2 = r8.d
            int r2 = r2.length
            if (r0 != r2) goto L_0x003d
            int r0 = r8.b
            java.lang.Object[] r2 = r8.a
            int r2 = r2.length
            boolean r0 = defpackage.anax.a((int) r0, (int) r2)
            if (r0 == 0) goto L_0x002a
            java.lang.Object[] r0 = r8.a
            int r2 = r8.b
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            r3 = r0
            goto L_0x002d
        L_0x002a:
            java.lang.Object[] r0 = r8.a
            r3 = r0
        L_0x002d:
            anfv r0 = new anfv
            int r4 = r8.e
            java.lang.Object[] r5 = r8.d
            int r2 = r5.length
            int r6 = r2 + -1
            int r7 = r8.b
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x004b
        L_0x003d:
            int r0 = r8.b
            java.lang.Object[] r2 = r8.a
            anax r0 = defpackage.anax.a((int) r0, (java.lang.Object[]) r2)
            int r2 = r0.size()
            r8.b = r2
        L_0x004b:
            r8.c = r1
            r1 = 0
            r8.d = r1
            return r0
        L_0x0051:
            java.lang.Object[] r0 = r8.a
            r1 = 0
            r0 = r0[r1]
            anax r0 = defpackage.anax.a((java.lang.Object) r0)
            return r0
        L_0x005b:
            anfv r0 = defpackage.anfv.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anav.a():anax");
    }

    public final void b(Iterable iterable) {
        amrl.a((Object) iterable);
        if (this.d != null) {
            for (Object c : iterable) {
                b(c);
            }
            return;
        }
        super.a(iterable);
    }

    /* renamed from: c */
    public final void b(Object obj) {
        int length;
        amrl.a(obj);
        if (this.d == null || anax.b(this.b) > (length = this.d.length)) {
            this.d = null;
            super.a(obj);
            return;
        }
        int i = length - 1;
        int hashCode = obj.hashCode();
        int a = amzi.a(hashCode);
        while (true) {
            int i2 = a & i;
            Object[] objArr = this.d;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                objArr[i2] = obj;
                this.e += hashCode;
                super.a(obj);
                return;
            } else if (!obj2.equals(obj)) {
                a = i2 + 1;
            } else {
                return;
            }
        }
    }

    public anav(int i) {
        super(i);
        this.d = new Object[anax.b(i)];
    }

    public final void b(Object... objArr) {
        if (this.d != null) {
            for (Object c : objArr) {
                b(c);
            }
            return;
        }
        super.a(objArr);
    }
}
