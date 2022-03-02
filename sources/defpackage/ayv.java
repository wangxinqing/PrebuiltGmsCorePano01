package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ayv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayv extends ayu {
    private awm g;
    private final List h = new ArrayList();
    private final RectF i = new RectF();
    private final RectF j = new RectF();

    public ayv(avc avc, ayx ayx, List list, auk auk) {
        super(avc, ayx);
        ayu ayu;
        ayu ayu2;
        String str;
        new Paint();
        axo axo = ayx.r;
        if (axo != null) {
            awm a = axo.a();
            this.g = a;
            a(a);
            this.g.a((awl) this);
        } else {
            this.g = null;
        }
        oh ohVar = new oh(auk.f.size());
        int size = list.size() - 1;
        ayu ayu3 = null;
        while (true) {
            if (size >= 0) {
                ayx ayx2 = (ayx) list.get(size);
                int i2 = ayx2.u;
                int i3 = i2 - 1;
                if (i2 != 0) {
                    if (i3 == 0) {
                        ayu2 = new ayv(avc, ayx2, (List) auk.a.get(ayx2.f), auk);
                    } else if (i3 == 1) {
                        ayu2 = new aza(avc, ayx2);
                    } else if (i3 == 2) {
                        ayu2 = new ayw(avc, ayx2);
                    } else if (i3 == 3) {
                        ayu2 = new ayy(avc, ayx2);
                    } else if (i3 == 4) {
                        ayu2 = new ayz(avc, ayx2);
                    } else if (i3 != 5) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown layer type ");
                        switch (ayx2.u) {
                            case 1:
                                str = "PRE_COMP";
                                break;
                            case 2:
                                str = "SOLID";
                                break;
                            case 3:
                                str = "IMAGE";
                                break;
                            case 4:
                                str = "NULL";
                                break;
                            case 5:
                                str = "SHAPE";
                                break;
                            case 6:
                                str = "TEXT";
                                break;
                            case 7:
                                str = "UNKNOWN";
                                break;
                            default:
                                str = "null";
                                break;
                        }
                        sb.append(str);
                        bay.a(sb.toString());
                        ayu2 = null;
                    } else {
                        ayu2 = new azd(avc, ayx2);
                    }
                    if (ayu2 != null) {
                        ohVar.b(ayu2.c.d, ayu2);
                        if (ayu3 == null) {
                            this.h.add(0, ayu2);
                            int i4 = ayx2.v;
                            int i5 = i4 - 1;
                            if (i4 == 0) {
                                throw null;
                            } else if (i5 == 1 || i5 == 2) {
                                ayu3 = ayu2;
                            }
                        } else {
                            ayu3.d = ayu2;
                            ayu3 = null;
                        }
                    }
                    size--;
                } else {
                    throw null;
                }
            } else {
                for (int i6 = 0; i6 < ohVar.b(); i6++) {
                    ayu ayu4 = (ayu) ohVar.a(ohVar.a(i6));
                    if (!(ayu4 == null || (ayu = (ayu) ohVar.a(ayu4.c.e)) == null)) {
                        ayu4.e = ayu;
                    }
                }
                return;
            }
        }
    }

    public final void a(float f) {
        super.a(f);
        if (this.g != null) {
            f = ((((Float) this.g.f()).floatValue() * this.c.b.j) - this.c.b.h) / (this.b.a.b() + 0.01f);
        }
        ayx ayx = this.c;
        float f2 = ayx.l;
        if (f2 != 0.0f) {
            f /= f2;
        }
        if (this.g == null) {
            f -= ayx.m / ayx.b.b();
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            ((ayu) this.h.get(size)).a(f);
        }
    }

    public final void b(Canvas canvas, Matrix matrix, int i2) {
        RectF rectF = this.j;
        ayx ayx = this.c;
        rectF.set(0.0f, 0.0f, (float) ayx.n, (float) ayx.o);
        matrix.mapRect(this.j);
        canvas.save();
        for (int size = this.h.size() - 1; size >= 0; size--) {
            if (this.j.isEmpty() || canvas.clipRect(this.j)) {
                ((ayu) this.h.get(size)).a(canvas, matrix, i2);
            }
        }
        canvas.restore();
        auf.a();
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((ayu) this.h.get(size)).a(this.i, this.a, true);
            rectF.union(this.i);
        }
    }

    public final void a(Object obj, bbe bbe) {
        super.a(obj, bbe);
        if (obj == avh.A) {
            axb axb = new axb(bbe);
            this.g = axb;
            a((awm) axb);
        }
    }

    public final void b(axi axi, int i2, List list, axi axi2) {
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            ((ayu) this.h.get(i3)).a(axi, i2, list, axi2);
        }
    }
}
