package defpackage;

/* renamed from: quq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class quq {
    private int a = 0;
    private float b = 0.0f;

    public int a() {
        return this.a;
    }

    public void a(float f) {
        this.b += f;
        int i = this.a + 1;
        this.a = i;
        if (i < 0) {
            this.a = 1;
            this.b = f;
        }
    }

    public float b() {
        return this.b;
    }
}
