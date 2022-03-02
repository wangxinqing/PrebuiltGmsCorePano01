package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ajzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajzv {
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    public final List f = new ArrayList();
    private final List g = new ArrayList();

    public ajzv() {
        a();
    }

    private final void a(float f2) {
        float f3 = this.d;
        if (f3 != f2) {
            float f4 = ((f2 - f3) + 360.0f) % 360.0f;
            if (f4 <= 180.0f) {
                float f5 = this.b;
                float f6 = this.c;
                ajzr ajzr = new ajzr(f5, f6, f5, f6);
                ajzr.e = this.d;
                ajzr.f = f4;
                this.g.add(new ajzp(ajzr));
                this.d = f2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final ajzu a(Matrix matrix) {
        a(this.e);
        return new ajzo(new ArrayList(this.g), matrix);
    }

    public final void a() {
        a(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2, float f3) {
        ajzs ajzs = new ajzs();
        ajzs.a = f2;
        ajzs.b = f3;
        this.f.add(ajzs);
        ajzq ajzq = new ajzq(ajzs, this.b, this.c);
        a((ajzu) ajzq, ajzq.a() + 270.0f, ajzq.a() + 270.0f);
        this.b = f2;
        this.c = f3;
    }

    public final void a(float f2, float f3, float f4) {
        this.a = f2;
        this.b = 0.0f;
        this.c = f2;
        this.d = f3;
        this.e = (f3 + f4) % 360.0f;
        this.f.clear();
        this.g.clear();
    }

    public final void a(ajzu ajzu, float f2, float f3) {
        a(f2);
        this.g.add(ajzu);
        this.d = f3;
    }

    public final void a(Matrix matrix, Path path) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            ((ajzt) this.f.get(i)).a(matrix, path);
        }
    }
}
