package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cn {
    final /* synthetic */ cb a;

    cn() {
    }

    public final void a(int i, co coVar) {
        if (coVar == co.b) {
            this.a.i();
        } else if (!this.a.h()) {
            List list = coVar.c;
            boolean z = true;
            if (i == 0) {
                cb cbVar = this.a;
                cw cwVar = cbVar.l;
                int i2 = coVar.d;
                int i3 = coVar.e;
                int i4 = coVar.f;
                cwVar.b = 0;
                cwVar.c.clear();
                cwVar.c.add(list);
                cwVar.d = 0;
                cwVar.e = 0;
                int size = list.size();
                cwVar.f = size;
                cwVar.g = size;
                cwVar.h = list.size();
                cwVar.i = 0;
                cwVar.j = 0;
                cbVar.a(0, cwVar.size());
                cw cwVar2 = cbVar.l;
                if (cwVar2.b <= 0 && cwVar2.d <= 0) {
                    z = false;
                }
                cbVar.f = z;
                cb cbVar2 = this.a;
                if (cbVar2.m == -1) {
                    int i5 = coVar.d;
                    int i6 = coVar.f;
                    cbVar2.m = list.size() / 2;
                    return;
                }
                return;
            }
            cb cbVar3 = this.a;
            int i7 = cbVar3.m;
            cw cwVar3 = cbVar3.l;
            int i8 = cwVar3.b;
            int i9 = cwVar3.e;
            int i10 = cwVar3.g;
            boolean z2 = cbVar3.g;
            if (i != 1) {
                int size2 = list.size();
                if (size2 != 0) {
                    int i11 = cwVar3.h;
                    if (i11 > 0 && size2 != i11) {
                        if (cwVar3.c.size() != 1 || size2 <= cwVar3.h) {
                            cwVar3.h = -1;
                        } else {
                            cwVar3.h = size2;
                        }
                    }
                    cwVar3.c.add(0, list);
                    cwVar3.f += size2;
                    cwVar3.g += size2;
                    int min = Math.min(cwVar3.b, size2);
                    int i12 = size2 - min;
                    if (min != 0) {
                        cwVar3.b -= min;
                    }
                    cwVar3.e -= i12;
                    cwVar3.i += size2;
                    int i13 = cwVar3.b;
                    int i14 = (cbVar3.d - min) - i12;
                    cbVar3.d = i14;
                    cbVar3.b = 0;
                    if (i14 > 0) {
                        cbVar3.a();
                    }
                    cbVar3.b(i13, min);
                    cbVar3.a(0, i12);
                    cbVar3.m += i12;
                    cbVar3.n += i12;
                    cbVar3.o += i12;
                } else {
                    cbVar3.b = 2;
                }
            } else {
                int size3 = list.size();
                if (size3 != 0) {
                    if (cwVar3.h > 0) {
                        ArrayList arrayList = cwVar3.c;
                        int size4 = ((List) arrayList.get(arrayList.size() - 1)).size();
                        int i15 = cwVar3.h;
                        if (size4 != i15 || size3 > i15) {
                            cwVar3.h = -1;
                        }
                    }
                    cwVar3.c.add(list);
                    cwVar3.f += size3;
                    cwVar3.g += size3;
                    int min2 = Math.min(cwVar3.d, size3);
                    int i16 = size3 - min2;
                    if (min2 != 0) {
                        cwVar3.d -= min2;
                    }
                    cwVar3.j += size3;
                    int i17 = (cwVar3.b + cwVar3.g) - size3;
                    int i18 = (cbVar3.e - min2) - i16;
                    cbVar3.e = i18;
                    cbVar3.c = 0;
                    if (i18 > 0) {
                        cbVar3.b();
                    }
                    cbVar3.b(i17, min2);
                    cbVar3.a(i17 + min2, i16);
                } else {
                    cbVar3.c = 2;
                }
            }
            boolean z3 = this.a.g;
        }
    }

    public cn(cb cbVar) {
        this.a = cbVar;
    }
}
