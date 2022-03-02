package defpackage;

import java.io.PrintWriter;

/* renamed from: aicl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aicl {
    public final aico e;
    public final int f;
    public final int g;
    public final int h;
    public final Object i;
    final long j;
    final String k;
    public aicl l;

    public aicl(aico aico, long j2) {
        this(aico, j2, (String) null, (Object) null, -1, -1, -1);
    }

    /* access modifiers changed from: protected */
    public void a(PrintWriter printWriter) {
        String str;
        String str2 = this.k;
        if (str2 != null) {
            Object[] objArr = new Object[4];
            Object obj = this.i;
            if (obj != null) {
                str = obj.toString();
            } else {
                str = "";
            }
            objArr[0] = str;
            objArr[1] = Integer.valueOf(this.f);
            objArr[2] = Integer.valueOf(this.g);
            objArr[3] = Integer.valueOf(this.h);
            printWriter.print(String.format(str2, objArr));
        }
    }

    public aicl(aico aico, long j2, int i2) {
        this(aico, j2, (String) null, (Object) null, i2, -1, -1);
    }

    public aicl(aico aico, long j2, int i2, int i3) {
        this(aico, j2, (String) null, (Object) null, i2, i3, -1);
    }

    public aicl(aico aico, long j2, int i2, int i3, int i4) {
        this(aico, j2, (String) null, (Object) null, i2, i3, i4);
    }

    public aicl(aico aico, long j2, String str, int i2) {
        this(aico, j2, str, (Object) null, i2, -1, -1);
    }

    public aicl(aico aico, long j2, String str, Object obj, int i2, int i3, int i4) {
        this.e = aico;
        this.j = j2;
        this.i = obj;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.k = str;
    }
}
