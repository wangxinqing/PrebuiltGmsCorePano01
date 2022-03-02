package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: yn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yn {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    final abw c;
    public int d = 0;
    final acf e;
    private final or f = new or(30);

    private final int b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = this.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ym ymVar = (ym) this.b.get(size);
            int i7 = ymVar.a;
            if (i7 == 8) {
                int i8 = ymVar.b;
                int i9 = ymVar.d;
                int i10 = i8 < i9 ? i9 : i8;
                int i11 = i8 < i9 ? i8 : i9;
                if (i < i11 || i > i10) {
                    if (i < i8) {
                        if (i2 == 1) {
                            ymVar.b = i8 + 1;
                            i4 = i9 + 1;
                        } else if (i2 == 2) {
                            ymVar.b = i8 - 1;
                            i4 = i9 - 1;
                        }
                        ymVar.d = i4;
                    }
                } else if (i11 != i8) {
                    if (i2 == 1) {
                        i6 = i8 + 1;
                    } else {
                        if (i2 == 2) {
                            i6 = i8 - 1;
                        }
                        i--;
                    }
                    ymVar.b = i6;
                    i--;
                } else {
                    if (i2 == 1) {
                        i5 = i9 + 1;
                    } else {
                        if (i2 == 2) {
                            i5 = i9 - 1;
                        }
                        i++;
                    }
                    ymVar.d = i5;
                    i++;
                }
            } else {
                int i12 = ymVar.b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    ymVar.b = i3;
                } else if (i7 == 1) {
                    i -= ymVar.d;
                } else if (i7 == 2) {
                    i += ymVar.d;
                }
            }
        }
        for (int size2 = this.b.size() - 1; size2 >= 0; size2--) {
            ym ymVar2 = (ym) this.b.get(size2);
            if (ymVar2.a == 8) {
                int i13 = ymVar2.d;
                if (i13 == ymVar2.b || i13 < 0) {
                    this.b.remove(size2);
                    a(ymVar2);
                }
            } else if (ymVar2.d <= 0) {
                this.b.remove(size2);
                a(ymVar2);
            }
        }
        return i;
    }

    private final void c(ym ymVar) {
        this.b.add(ymVar);
        int i = ymVar.a;
        if (i == 1) {
            this.e.b(ymVar.b, ymVar.d);
        } else if (i == 2) {
            acf acf = this.e;
            acf.a.offsetPositionRecordsForRemove(ymVar.b, ymVar.d, false);
            acf.a.mItemsAddedOrRemoved = true;
        } else if (i == 4) {
            this.e.a(ymVar.b, ymVar.d, ymVar.c);
        } else if (i == 8) {
            this.e.c(ymVar.b, ymVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + ymVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(int i, int i2) {
        int size = this.b.size();
        while (i2 < size) {
            ym ymVar = (ym) this.b.get(i2);
            int i3 = ymVar.a;
            if (i3 == 8) {
                int i4 = ymVar.b;
                if (i4 == i) {
                    i = ymVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (ymVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = ymVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = ymVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += ymVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final boolean a(int i) {
        return (i & this.d) != 0;
    }

    public final boolean d() {
        return this.a.size() > 0;
    }

    public final void e() {
        c();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ym ymVar = (ym) this.a.get(i);
            int i2 = ymVar.a;
            if (i2 == 1) {
                this.e.a(ymVar);
                this.e.b(ymVar.b, ymVar.d);
            } else if (i2 == 2) {
                this.e.a(ymVar);
                this.e.a(ymVar.b, ymVar.d);
            } else if (i2 == 4) {
                this.e.a(ymVar);
                this.e.a(ymVar.b, ymVar.d, ymVar.c);
            } else if (i2 == 8) {
                this.e.a(ymVar);
                this.e.c(ymVar.b, ymVar.d);
            }
        }
        a((List) this.a);
        this.d = 0;
    }

    public yn(acf acf) {
        this.e = acf;
        this.c = new abw(this);
    }

    public final ym a(int i, int i2, int i3, Object obj) {
        ym ymVar = (ym) this.f.a();
        if (ymVar == null) {
            return new ym(i, i2, i3, obj);
        }
        ymVar.a = i;
        ymVar.b = i2;
        ymVar.d = i3;
        ymVar.c = obj;
        return ymVar;
    }

    private final boolean c(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ym ymVar = (ym) this.b.get(i2);
            int i3 = ymVar.a;
            if (i3 == 8) {
                if (a(ymVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = ymVar.b;
                int i5 = ymVar.d + i4;
                while (i4 < i5) {
                    if (a(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private final void b(ym ymVar) {
        int i;
        int i2 = ymVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b2 = b(ymVar.b, i2);
        int i3 = ymVar.b;
        int i4 = ymVar.a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + ymVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < ymVar.d; i6++) {
            int b3 = b(ymVar.b + (i * i6), ymVar.a);
            int i7 = ymVar.a;
            if (i7 == 2 ? b3 != b2 : !(i7 == 4 && b3 == b2 + 1)) {
                ym a2 = a(i7, b2, i5, ymVar.c);
                a(a2, i3);
                a(a2);
                if (ymVar.a == 4) {
                    i3 += i5;
                }
                b2 = b3;
                i5 = 1;
            } else {
                i5++;
            }
        }
        Object obj = ymVar.c;
        a(ymVar);
        if (i5 > 0) {
            ym a3 = a(ymVar.a, b2, i5, obj);
            a(a3, i3);
            a(a3);
        }
    }

    public final void a() {
        a((List) this.a);
        a((List) this.b);
        this.d = 0;
    }

    /* access modifiers changed from: package-private */
    public final void a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((ym) list.get(i));
        }
        list.clear();
    }

    public final void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.e.a((ym) this.b.get(i));
        }
        a((List) this.b);
        this.d = 0;
    }

    public final void a(ym ymVar) {
        ymVar.c = null;
        this.f.a(ymVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(ym ymVar, int i) {
        this.e.a(ymVar);
        int i2 = ymVar.a;
        if (i2 == 2) {
            this.e.a(i, ymVar.d);
        } else if (i2 == 4) {
            this.e.a(i, ymVar.d, ymVar.c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    public final int b(int i) {
        return a(i, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r16 = this;
            r0 = r16
            abw r1 = r0.c
            java.util.ArrayList r2 = r0.a
        L_0x0006:
            int r3 = r2.size()
            r4 = -1
            int r3 = r3 + r4
            r5 = 0
            r6 = 0
        L_0x000e:
            r7 = 8
            r8 = 1
            if (r3 < 0) goto L_0x0025
            java.lang.Object r9 = r2.get(r3)
            ym r9 = (defpackage.ym) r9
            int r9 = r9.a
            if (r9 == r7) goto L_0x001f
            r6 = 1
            goto L_0x0022
        L_0x001f:
            if (r6 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            int r3 = r3 + -1
            goto L_0x000e
        L_0x0025:
            r3 = -1
        L_0x0026:
            r6 = 4
            r9 = 2
            r10 = 0
            if (r3 == r4) goto L_0x01b9
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            ym r11 = (defpackage.ym) r11
            java.lang.Object r12 = r2.get(r7)
            ym r12 = (defpackage.ym) r12
            int r13 = r12.a
            if (r13 == r8) goto L_0x0190
            if (r13 == r9) goto L_0x00a2
            if (r13 == r6) goto L_0x0042
            goto L_0x0006
        L_0x0042:
            int r4 = r11.d
            int r5 = r12.b
            if (r4 < r5) goto L_0x005d
            int r9 = r12.d
            int r5 = r5 + r9
            if (r4 >= r5) goto L_0x005c
            int r9 = r9 + -1
            r12.d = r9
            yn r4 = r1.a
            int r5 = r11.b
            java.lang.Object r9 = r12.c
            ym r4 = r4.a(r6, r5, r8, r9)
            goto L_0x0062
        L_0x005c:
            goto L_0x0061
        L_0x005d:
            int r5 = r5 + -1
            r12.b = r5
        L_0x0061:
            r4 = r10
        L_0x0062:
            int r5 = r11.b
            int r8 = r12.b
            if (r5 <= r8) goto L_0x007f
            int r9 = r12.d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x007e
            int r8 = r8 - r5
            yn r9 = r1.a
            int r5 = r5 + 1
            java.lang.Object r10 = r12.c
            ym r10 = r9.a(r6, r5, r8, r10)
            int r5 = r12.d
            int r5 = r5 - r8
            r12.d = r5
            goto L_0x0083
        L_0x007e:
            goto L_0x0083
        L_0x007f:
            int r8 = r8 + 1
            r12.b = r8
        L_0x0083:
            r2.set(r7, r11)
            int r5 = r12.d
            if (r5 <= 0) goto L_0x008e
            r2.set(r3, r12)
            goto L_0x0096
        L_0x008e:
            r2.remove(r3)
            yn r5 = r1.a
            r5.a((defpackage.ym) r12)
        L_0x0096:
            if (r4 == 0) goto L_0x009b
            r2.add(r3, r4)
        L_0x009b:
            if (r10 == 0) goto L_0x0006
            r2.add(r3, r10)
            goto L_0x0006
        L_0x00a2:
            int r4 = r11.b
            int r6 = r11.d
            if (r4 >= r6) goto L_0x00b7
            int r13 = r12.b
            if (r13 != r4) goto L_0x00b5
            int r13 = r12.d
            int r4 = r6 - r4
            if (r13 != r4) goto L_0x00b5
            r4 = 0
            r5 = 1
            goto L_0x00c6
        L_0x00b5:
            r4 = 0
            goto L_0x00c6
        L_0x00b7:
            int r13 = r12.b
            int r14 = r6 + 1
            if (r13 != r14) goto L_0x00c5
            int r13 = r12.d
            int r4 = r4 - r6
            if (r13 != r4) goto L_0x00c5
            r4 = 1
            r5 = 1
            goto L_0x00c6
        L_0x00c5:
            r4 = 1
        L_0x00c6:
            int r13 = r12.b
            if (r6 >= r13) goto L_0x00cf
            int r13 = r13 + -1
            r12.b = r13
            goto L_0x00ec
        L_0x00cf:
            int r14 = r12.d
            int r15 = r13 + r14
            if (r6 >= r15) goto L_0x00eb
            int r14 = r14 + -1
            r12.d = r14
            r11.a = r9
            r11.d = r8
            int r3 = r12.d
            if (r3 != 0) goto L_0x0006
            r2.remove(r7)
            yn r3 = r1.a
            r3.a((defpackage.ym) r12)
            goto L_0x0006
        L_0x00eb:
        L_0x00ec:
            int r6 = r11.b
            if (r6 <= r13) goto L_0x0107
            int r8 = r12.d
            int r13 = r13 + r8
            if (r6 >= r13) goto L_0x0106
            yn r8 = r1.a
            int r14 = r6 + 1
            int r13 = r13 - r6
            ym r10 = r8.a(r9, r14, r13, r10)
            int r6 = r11.b
            int r8 = r12.b
            int r6 = r6 - r8
            r12.d = r6
            goto L_0x010b
        L_0x0106:
            goto L_0x010b
        L_0x0107:
            int r13 = r13 + 1
            r12.b = r13
        L_0x010b:
            if (r5 == 0) goto L_0x011a
            r2.set(r3, r12)
            r2.remove(r7)
            yn r3 = r1.a
            r3.a((defpackage.ym) r11)
            goto L_0x0006
        L_0x011a:
            if (r4 != 0) goto L_0x014b
            if (r10 == 0) goto L_0x0134
            int r4 = r11.b
            int r5 = r10.b
            if (r4 < r5) goto L_0x0129
            int r5 = r10.d
            int r4 = r4 - r5
            r11.b = r4
        L_0x0129:
            int r4 = r11.d
            int r5 = r10.b
            if (r4 < r5) goto L_0x0134
            int r5 = r10.d
            int r4 = r4 - r5
            r11.d = r4
        L_0x0134:
            int r4 = r11.b
            int r5 = r12.b
            if (r4 < r5) goto L_0x013f
            int r5 = r12.d
            int r4 = r4 - r5
            r11.b = r4
        L_0x013f:
            int r4 = r11.d
            int r5 = r12.b
            if (r4 < r5) goto L_0x0179
            int r5 = r12.d
            int r4 = r4 - r5
            r11.d = r4
            goto L_0x0179
        L_0x014b:
            if (r10 == 0) goto L_0x0163
            int r4 = r11.b
            int r5 = r10.b
            if (r4 <= r5) goto L_0x0158
            int r5 = r10.d
            int r4 = r4 - r5
            r11.b = r4
        L_0x0158:
            int r4 = r11.d
            int r5 = r10.b
            if (r4 <= r5) goto L_0x0163
            int r5 = r10.d
            int r4 = r4 - r5
            r11.d = r4
        L_0x0163:
            int r4 = r11.b
            int r5 = r12.b
            if (r4 <= r5) goto L_0x016e
            int r5 = r12.d
            int r4 = r4 - r5
            r11.b = r4
        L_0x016e:
            int r4 = r11.d
            int r5 = r12.b
            if (r4 <= r5) goto L_0x0179
            int r5 = r12.d
            int r4 = r4 - r5
            r11.d = r4
        L_0x0179:
            r2.set(r3, r12)
            int r4 = r11.b
            int r5 = r11.d
            if (r4 == r5) goto L_0x0186
            r2.set(r7, r11)
            goto L_0x0189
        L_0x0186:
            r2.remove(r7)
        L_0x0189:
            if (r10 == 0) goto L_0x0006
            r2.add(r3, r10)
            goto L_0x0006
        L_0x0190:
            int r6 = r11.d
            int r8 = r12.b
            if (r6 >= r8) goto L_0x0197
            goto L_0x0198
        L_0x0197:
            r4 = 0
        L_0x0198:
            int r5 = r11.b
            if (r5 >= r8) goto L_0x019e
            int r4 = r4 + 1
        L_0x019e:
            if (r5 < r8) goto L_0x01a5
            int r8 = r12.d
            int r5 = r5 + r8
            r11.b = r5
        L_0x01a5:
            int r5 = r12.b
            if (r5 > r6) goto L_0x01ae
            int r8 = r12.d
            int r6 = r6 + r8
            r11.d = r6
        L_0x01ae:
            int r5 = r5 + r4
            r12.b = r5
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0006
        L_0x01b9:
            java.util.ArrayList r1 = r0.a
            int r1 = r1.size()
            r2 = 0
        L_0x01c0:
            if (r2 >= r1) goto L_0x028f
            java.util.ArrayList r3 = r0.a
            java.lang.Object r3 = r3.get(r2)
            ym r3 = (defpackage.ym) r3
            int r11 = r3.a
            if (r11 == r8) goto L_0x0287
            if (r11 == r9) goto L_0x0232
            if (r11 == r6) goto L_0x01db
            if (r11 == r7) goto L_0x01d6
            goto L_0x028a
        L_0x01d6:
            r0.c((defpackage.ym) r3)
            goto L_0x028a
        L_0x01db:
            int r11 = r3.b
            int r12 = r3.d
            int r12 = r12 + r11
            r13 = r11
            r14 = 0
            r15 = -1
        L_0x01e3:
            if (r11 >= r12) goto L_0x0219
            acf r4 = r0.e
            adl r4 = r4.a((int) r11)
            if (r4 != 0) goto L_0x0204
            boolean r4 = r0.c((int) r11)
            if (r4 != 0) goto L_0x0204
            if (r15 != r8) goto L_0x0201
            java.lang.Object r4 = r3.c
            ym r4 = r0.a(r6, r13, r14, r4)
            r0.c((defpackage.ym) r4)
            r13 = r11
            r14 = 0
            goto L_0x0202
        L_0x0201:
        L_0x0202:
            r15 = 0
            goto L_0x0214
        L_0x0204:
            if (r15 != 0) goto L_0x0212
            java.lang.Object r4 = r3.c
            ym r4 = r0.a(r6, r13, r14, r4)
            r0.b((defpackage.ym) r4)
            r13 = r11
            r14 = 0
            goto L_0x0213
        L_0x0212:
        L_0x0213:
            r15 = 1
        L_0x0214:
            int r14 = r14 + r8
            int r11 = r11 + 1
            r4 = -1
            goto L_0x01e3
        L_0x0219:
            int r4 = r3.d
            if (r14 == r4) goto L_0x0227
            java.lang.Object r4 = r3.c
            r0.a((defpackage.ym) r3)
            ym r3 = r0.a(r6, r13, r14, r4)
            goto L_0x0228
        L_0x0227:
        L_0x0228:
            if (r15 == 0) goto L_0x022e
            r0.c((defpackage.ym) r3)
            goto L_0x028a
        L_0x022e:
            r0.b((defpackage.ym) r3)
            goto L_0x028a
        L_0x0232:
            int r4 = r3.b
            int r11 = r3.d
            int r11 = r11 + r4
            r12 = r4
            r13 = 0
            r14 = -1
        L_0x023a:
            if (r12 >= r11) goto L_0x0270
            acf r15 = r0.e
            adl r15 = r15.a((int) r12)
            if (r15 != 0) goto L_0x0258
            boolean r15 = r0.c((int) r12)
            if (r15 != 0) goto L_0x0258
            if (r14 != r8) goto L_0x0255
            ym r14 = r0.a(r9, r4, r13, r10)
            r0.c((defpackage.ym) r14)
            r14 = 1
            goto L_0x0256
        L_0x0255:
            r14 = 0
        L_0x0256:
            r15 = 0
            goto L_0x0265
        L_0x0258:
            if (r14 != 0) goto L_0x0263
            ym r14 = r0.a(r9, r4, r13, r10)
            r0.b((defpackage.ym) r14)
            r14 = 1
            goto L_0x0264
        L_0x0263:
            r14 = 0
        L_0x0264:
            r15 = 1
        L_0x0265:
            if (r14 == 0) goto L_0x026b
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = 1
            goto L_0x026d
        L_0x026b:
            int r13 = r13 + 1
        L_0x026d:
            int r12 = r12 + r8
            r14 = r15
            goto L_0x023a
        L_0x0270:
            int r11 = r3.d
            if (r13 == r11) goto L_0x027c
            r0.a((defpackage.ym) r3)
            ym r3 = r0.a(r9, r4, r13, r10)
            goto L_0x027d
        L_0x027c:
        L_0x027d:
            if (r14 == 0) goto L_0x0283
            r0.c((defpackage.ym) r3)
            goto L_0x028a
        L_0x0283:
            r0.b((defpackage.ym) r3)
            goto L_0x028a
        L_0x0287:
            r0.c((defpackage.ym) r3)
        L_0x028a:
            int r2 = r2 + 1
            r4 = -1
            goto L_0x01c0
        L_0x028f:
            java.util.ArrayList r1 = r0.a
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn.b():void");
    }
}
