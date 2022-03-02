package defpackage;

/* renamed from: avxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avxy {
    public final int a;
    public final avxx[] b;

    public avxy(int i, avxx... avxxArr) {
        this.a = i;
        this.b = avxxArr;
    }

    public final int a() {
        int i = 0;
        for (avxx avxx : this.b) {
            i += avxx.a;
        }
        return i;
    }

    public final int b() {
        return this.a * a();
    }
}
