package defpackage;

import java.util.ArrayList;

/* renamed from: fa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fa {
    public final ArrayList a = new ArrayList();

    public final void a(fb fbVar) {
        fb fbVar2 = fbVar;
        this.a.clear();
        for (int i = 1; i < fbVar2.e; i++) {
            fd fdVar = fbVar2.g.a[i];
            for (int i2 = 0; i2 < 6; i2++) {
                fdVar.e[i2] = 0.0f;
            }
            fdVar.e[fdVar.c] = 1.0f;
            if (fdVar.h == 4) {
                this.a.add(fdVar);
            }
        }
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            fd fdVar2 = (fd) this.a.get(i3);
            int i4 = fdVar2.b;
            if (i4 != -1) {
                ex exVar = fbVar2.c[i4].d;
                int i5 = exVar.a;
                for (int i6 = 0; i6 < i5; i6++) {
                    fd a2 = exVar.a(i6);
                    if (a2 != null) {
                        float b = exVar.b(i6);
                        for (int i7 = 0; i7 < 6; i7++) {
                            float[] fArr = a2.e;
                            fArr[i7] = fArr[i7] + (fdVar2.e[i7] * b);
                        }
                        if (!this.a.contains(a2)) {
                            this.a.add(a2);
                        }
                    }
                }
                for (int i8 = 0; i8 < 6; i8++) {
                    fdVar2.e[i8] = 0.0f;
                }
            }
        }
    }

    public final String toString() {
        int size = this.a.size();
        String str = "Goal: ";
        for (int i = 0; i < size; i++) {
            fd fdVar = (fd) this.a.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = fdVar + "[";
            for (int i2 = 0; i2 < fdVar.e.length; i2++) {
                String str3 = str2 + fdVar.e[i2];
                if (i2 < fdVar.e.length - 1) {
                    str2 = str3 + ", ";
                } else {
                    str2 = str3 + "] ";
                }
            }
            sb.append(str2);
            str = sb.toString();
        }
        return str;
    }
}
