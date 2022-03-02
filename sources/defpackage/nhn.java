package defpackage;

import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.fonts.FontMatchSpec;
import java.util.ArrayList;

/* renamed from: nhn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nhn {
    private final nhm a;

    public nhn(nhm nhm) {
        iva.a((Object) nhm, (Object) "directory");
        this.a = nhm;
    }

    private static float a(float f, nfx nfx) {
        float f2 = nfx.a;
        float f3 = f2 - f;
        float f4 = nfx.b;
        if (f4 > f2) {
            f2 = f4;
        }
        float f5 = f - f2;
        if (f3 >= 0.0f || f5 >= 0.0f) {
            return Math.max(f3, f5);
        }
        return 0.0f;
    }

    public final nhl a(FontMatchSpec fontMatchSpec) {
        FontMatchSpec fontMatchSpec2 = fontMatchSpec;
        nhl a2 = nhl.a(this.a.a.b);
        nfz a3 = this.a.a(fontMatchSpec2.b);
        if (a3 == null) {
            return a2;
        }
        if (!fontMatchSpec2.f) {
            aucx aucx = a3.d;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                nfy nfy = (nfy) aucx.get(i);
                float f = fontMatchSpec2.c;
                nfx nfx = nfy.c;
                if (nfx == null) {
                    nfx = nfx.c;
                }
                if (a(f, nfx) < 0.5f) {
                    int i2 = fontMatchSpec2.d;
                    nga nga = nfy.b;
                    if (nga == null) {
                        nga = nga.c;
                    }
                    int i3 = nga.a;
                    int i4 = i3 - i2;
                    int max = i2 - Math.max(nga.b, i3);
                    if ((i4 < 0 && max < 0) || Math.max(i4, max) == 0) {
                        float f2 = fontMatchSpec2.e;
                        nfx nfx2 = nfy.d;
                        if (nfx2 == null) {
                            nfx2 = nfx.c;
                        }
                        if (a(f2, nfx2) < 0.1f) {
                            return new nhl(a3, nfy, this.a.a.b);
                        }
                    }
                }
            }
            return a2;
        }
        aucx aucx2 = a3.d;
        if (fontMatchSpec2 == null) {
            throw new IllegalArgumentException("spec is null");
        } else if (aucx2 != null) {
            float f3 = fontMatchSpec2.c;
            ArrayList arrayList = new ArrayList();
            float f4 = -1.0f;
            float f5 = f3 <= 100.0f ? -1.0f : 1.0f;
            int size2 = aucx2.size();
            float f6 = Float.MAX_VALUE;
            float f7 = Float.MAX_VALUE;
            for (int i5 = 0; i5 < size2; i5++) {
                nfy nfy2 = (nfy) aucx2.get(i5);
                nfx nfx3 = nfy2.c;
                if (nfx3 == null) {
                    nfx3 = nfx.c;
                }
                float f8 = nfx3.a - f3;
                float abs = Math.abs(f8);
                if (abs > 0.01f && f5 != Math.signum(f8)) {
                    abs += 1000.0f;
                }
                if (abs <= f7) {
                    if (abs < f7) {
                        arrayList.clear();
                        f7 = abs;
                    }
                    arrayList.add(nfy2);
                }
            }
            if (!arrayList.isEmpty()) {
                float f9 = fontMatchSpec2.e;
                ArrayList arrayList2 = new ArrayList();
                int size3 = arrayList.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    nfy nfy3 = (nfy) arrayList.get(i6);
                    nfx nfx4 = nfy3.d;
                    if (nfx4 == null) {
                        nfx4 = nfx.c;
                    }
                    float abs2 = Math.abs(nfx4.a - f9);
                    if (abs2 <= f6) {
                        if (abs2 < f6) {
                            arrayList2.clear();
                            f6 = abs2;
                        }
                        arrayList2.add(nfy3);
                    }
                }
                int i7 = fontMatchSpec2.d;
                if (i7 > 500) {
                    f4 = 1.0f;
                }
                int size4 = arrayList2.size();
                nfy nfy4 = null;
                int i8 = 0;
                int i9 = Integer.MAX_VALUE;
                while (i8 < size4) {
                    nfy nfy5 = (nfy) arrayList2.get(i8);
                    nga nga2 = nfy5.b;
                    if (nga2 == null) {
                        nga2 = nga.c;
                    }
                    int i10 = nga2.a - i7;
                    int abs3 = Math.abs(i10);
                    float signum = Math.signum((float) i10);
                    if (i7 == 400) {
                        nga nga3 = nfy5.b;
                        if (nga3 == null) {
                            nga3 = nga.c;
                        }
                        if (nga3.a > 400) {
                            nga nga4 = nfy5.b;
                            if (nga4 == null) {
                                nga4 = nga.c;
                            }
                            if (nga4.a <= 500) {
                                abs3--;
                                signum = f4;
                            }
                        }
                    }
                    if (abs3 > 0 && f4 != signum) {
                        abs3 += ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
                    }
                    int i11 = abs3 >= i9 ? i9 : abs3;
                    if (abs3 < i9) {
                        nfy4 = nfy5;
                    }
                    i8++;
                    i9 = i11;
                }
                return new nhl(a3, nfy4, this.a.a.b);
            }
            throw new IllegalArgumentException("fonts is empty");
        } else {
            throw new IllegalArgumentException("fonts is null");
        }
    }
}
