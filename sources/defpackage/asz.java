package defpackage;

import android.graphics.Paint;

/* renamed from: asz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asz extends atc {
    public int[] a;
    kv b;
    float c = 0.0f;
    kv d;
    float e = 1.0f;
    float f = 1.0f;
    float g = 0.0f;
    float h = 1.0f;
    float i = 0.0f;
    Paint.Cap j = Paint.Cap.BUTT;
    Paint.Join k = Paint.Join.MITER;
    float l = 4.0f;

    public asz() {
    }

    public final boolean a(int[] iArr) {
        return this.b.a(iArr) | this.d.a(iArr);
    }

    public final boolean b() {
        return this.d.b() || this.b.b();
    }

    /* access modifiers changed from: package-private */
    public float getFillAlpha() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public int getFillColor() {
        return this.d.b;
    }

    /* access modifiers changed from: package-private */
    public float getStrokeAlpha() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public int getStrokeColor() {
        return this.b.b;
    }

    /* access modifiers changed from: package-private */
    public float getStrokeWidth() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public float getTrimPathEnd() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public float getTrimPathOffset() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public float getTrimPathStart() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public void setFillAlpha(float f2) {
        this.f = f2;
    }

    /* access modifiers changed from: package-private */
    public void setFillColor(int i2) {
        this.d.b = i2;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeAlpha(float f2) {
        this.e = f2;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeColor(int i2) {
        this.b.b = i2;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeWidth(float f2) {
        this.c = f2;
    }

    /* access modifiers changed from: package-private */
    public void setTrimPathEnd(float f2) {
        this.h = f2;
    }

    /* access modifiers changed from: package-private */
    public void setTrimPathOffset(float f2) {
        this.i = f2;
    }

    /* access modifiers changed from: package-private */
    public void setTrimPathStart(float f2) {
        this.g = f2;
    }

    public asz(asz asz) {
        super(asz);
        int[] iArr = asz.a;
        this.a = null;
        this.b = asz.b;
        this.c = asz.c;
        this.e = asz.e;
        this.d = asz.d;
        this.o = asz.o;
        this.f = asz.f;
        this.g = asz.g;
        this.h = asz.h;
        this.i = asz.i;
        this.j = asz.j;
        this.k = asz.k;
        this.l = asz.l;
    }
}
