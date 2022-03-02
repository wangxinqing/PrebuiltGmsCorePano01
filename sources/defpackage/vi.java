package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: vi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vi {
    public final int[] a;
    public final int b;
    private final List c;
    private final int[] d;
    private final vh e;
    private final int f;
    private final boolean g = true;

    public vi(vh vhVar, List list, int[] iArr, int[] iArr2) {
        int i;
        int i2;
        this.c = list;
        this.a = iArr;
        this.d = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(this.d, 0);
        this.e = vhVar;
        cx cxVar = (cx) vhVar;
        this.b = cxVar.d;
        this.f = cxVar.e;
        vm vmVar = !this.c.isEmpty() ? (vm) this.c.get(0) : null;
        if (!(vmVar != null && vmVar.a == 0 && vmVar.b == 0)) {
            vm vmVar2 = new vm();
            vmVar2.a = 0;
            vmVar2.b = 0;
            vmVar2.d = false;
            vmVar2.c = 0;
            vmVar2.e = false;
            this.c.add(0, vmVar2);
        }
        int i3 = this.b;
        int i4 = this.f;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            vm vmVar3 = (vm) this.c.get(size);
            int i5 = vmVar3.a;
            int i6 = vmVar3.c;
            int i7 = i5 + i6;
            int i8 = vmVar3.b + i6;
            if (this.g) {
                while (i3 > i7) {
                    int i9 = i3 - 1;
                    if (this.a[i9] == 0) {
                        a(i3, i4, size, false);
                    }
                    i3 = i9;
                }
                while (i4 > i8) {
                    int i10 = i4 - 1;
                    if (this.d[i10] == 0) {
                        a(i3, i4, size, true);
                    }
                    i4 = i10;
                }
                i = 0;
            } else {
                i = 0;
            }
            while (i < vmVar3.c) {
                int i11 = vmVar3.a + i;
                int i12 = vmVar3.b + i;
                if (!this.e.c(i11, i12)) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                this.a[i11] = (i12 << 5) | i2;
                this.d[i12] = (i11 << 5) | i2;
                i++;
            }
            i3 = vmVar3.a;
            i4 = vmVar3.b;
        }
    }

    private static vk a(List list, int i, boolean z) {
        int size = list.size() - 1;
        while (size >= 0) {
            vk vkVar = (vk) list.get(size);
            if (vkVar.a == i && vkVar.c == z) {
                list.remove(size);
                while (size < list.size()) {
                    ((vk) list.get(size)).b += !z ? -1 : 1;
                    size++;
                }
                return vkVar;
            }
            size--;
        }
        return null;
    }

    private final void a(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        if (!z) {
            i5 = i - 1;
            i4 = i5;
        } else {
            i2--;
            i5 = i;
            i4 = i2;
        }
        while (i3 >= 0) {
            vm vmVar = (vm) this.c.get(i3);
            int i6 = vmVar.a;
            int i7 = vmVar.c;
            int i8 = i6 + i7;
            int i9 = vmVar.b + i7;
            int i10 = 4;
            if (!z) {
                int i11 = i2 - 1;
                while (i11 >= i9) {
                    if (!this.e.b(i4, i11)) {
                        i11--;
                    } else {
                        if (this.e.c(i4, i11)) {
                            i10 = 8;
                        }
                        int i12 = i - 1;
                        this.a[i12] = (i11 << 5) | 16;
                        this.d[i11] = (i12 << 5) | i10;
                        return;
                    }
                }
                continue;
            } else {
                int i13 = i5 - 1;
                while (i13 >= i8) {
                    if (!this.e.b(i13, i4)) {
                        i13--;
                    } else {
                        if (this.e.c(i13, i4)) {
                            i10 = 8;
                        }
                        this.d[i4] = (i13 << 5) | 16;
                        this.a[i13] = (i4 << 5) | i10;
                        return;
                    }
                }
                continue;
            }
            i5 = vmVar.a;
            i2 = vmVar.b;
            i3--;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x016d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.vo r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.vf
            if (r2 == 0) goto L_0x000b
            vf r1 = (defpackage.vf) r1
            goto L_0x0011
        L_0x000b:
            vf r2 = new vf
            r2.<init>(r1)
            r1 = r2
        L_0x0011:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.b
            int r4 = r0.f
            java.util.List r5 = r0.c
            int r5 = r5.size()
            int r5 = r5 + -1
        L_0x0022:
            if (r5 < 0) goto L_0x018b
            java.util.List r6 = r0.c
            java.lang.Object r6 = r6.get(r5)
            vm r6 = (defpackage.vm) r6
            int r7 = r6.c
            int r8 = r6.a
            int r8 = r8 + r7
            int r9 = r6.b
            int r9 = r9 + r7
            java.lang.String r10 = " "
            java.lang.String r11 = "unknown flag for pos "
            r15 = 4
            if (r8 >= r3) goto L_0x00d1
            int r3 = r3 - r8
            boolean r14 = r0.g
            if (r14 == 0) goto L_0x00cb
            int r3 = r3 + -1
        L_0x0042:
            if (r3 < 0) goto L_0x00d1
            int r14 = r8 + r3
            int[] r12 = r0.a
            r12 = r12[r14]
            r13 = r12 & 31
            if (r13 == 0) goto L_0x00a8
            if (r13 == r15) goto L_0x0084
            r15 = 8
            if (r13 == r15) goto L_0x0084
            r15 = 16
            if (r13 != r15) goto L_0x0064
            vk r12 = new vk
            r13 = 1
            r12.<init>(r14, r14, r13)
            r2.add(r12)
            r16 = r5
            goto L_0x00c4
        L_0x0064:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r14)
            r2.append(r10)
            long r3 = (long) r13
            java.lang.String r3 = java.lang.Long.toBinaryString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0084:
            int r12 = r12 >> 5
            r16 = r5
            r15 = 0
            vk r5 = a(r2, r12, r15)
            int r15 = r5.b
            int r15 = r15 + -1
            r1.c(r14, r15)
            r15 = 4
            if (r13 != r15) goto L_0x00a6
            int r5 = r5.b
            int r5 = r5 + -1
            vh r13 = r0.e
            java.lang.Object r12 = r13.a(r14, r12)
            r13 = 1
            r1.a(r5, r13, r12)
            goto L_0x00c4
        L_0x00a6:
            r13 = 1
            goto L_0x00c4
        L_0x00a8:
            r16 = r5
            r13 = 1
            r1.b(r14, r13)
            int r5 = r2.size()
            r15 = 0
        L_0x00b3:
            if (r15 >= r5) goto L_0x00c4
            java.lang.Object r12 = r2.get(r15)
            vk r12 = (defpackage.vk) r12
            int r13 = r12.b
            int r13 = r13 + -1
            r12.b = r13
            int r15 = r15 + 1
            goto L_0x00b3
        L_0x00c4:
            int r3 = r3 + -1
            r5 = r16
            r15 = 4
            goto L_0x0042
        L_0x00cb:
            r16 = r5
            r1.b(r8, r3)
            goto L_0x00d3
        L_0x00d1:
            r16 = r5
        L_0x00d3:
            if (r9 >= r4) goto L_0x0161
            int r4 = r4 - r9
            boolean r3 = r0.g
            if (r3 == 0) goto L_0x015e
            int r4 = r4 + -1
        L_0x00dc:
            if (r4 < 0) goto L_0x0161
            int r3 = r9 + r4
            int[] r5 = r0.d
            r5 = r5[r3]
            r12 = r5 & 31
            if (r12 == 0) goto L_0x013d
            r13 = 4
            if (r12 == r13) goto L_0x011f
            r13 = 8
            r14 = 16
            if (r12 == r13) goto L_0x011d
            if (r12 != r14) goto L_0x00fd
            vk r5 = new vk
            r15 = 0
            r5.<init>(r3, r8, r15)
            r2.add(r5)
            goto L_0x015a
        L_0x00fd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r3)
            r2.append(r10)
            long r3 = (long) r12
            java.lang.String r3 = java.lang.Long.toBinaryString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x011d:
            r15 = 0
            goto L_0x0124
        L_0x011f:
            r13 = 8
            r14 = 16
            goto L_0x011d
        L_0x0124:
            int r5 = r5 >> 5
            r13 = 1
            vk r14 = a(r2, r5, r13)
            int r14 = r14.b
            r1.c(r14, r8)
            r14 = 4
            if (r12 != r14) goto L_0x015a
            vh r12 = r0.e
            java.lang.Object r3 = r12.a(r5, r3)
            r1.a(r8, r13, r3)
            goto L_0x015a
        L_0x013d:
            r13 = 1
            r14 = 4
            r15 = 0
            r1.a(r8, r13)
            int r3 = r2.size()
            r5 = 0
        L_0x0148:
            if (r5 >= r3) goto L_0x015a
            java.lang.Object r12 = r2.get(r5)
            vk r12 = (defpackage.vk) r12
            int r14 = r12.b
            int r14 = r14 + r13
            r12.b = r14
            int r5 = r5 + 1
            r13 = 1
            r14 = 4
            goto L_0x0148
        L_0x015a:
            int r4 = r4 + -1
            goto L_0x00dc
        L_0x015e:
            r1.a(r8, r4)
        L_0x0161:
            int r7 = r7 + -1
        L_0x0163:
            if (r7 >= 0) goto L_0x016d
            int r3 = r6.a
            int r4 = r6.b
            int r5 = r16 + -1
            goto L_0x0022
        L_0x016d:
            int[] r3 = r0.a
            int r4 = r6.a
            int r4 = r4 + r7
            r3 = r3[r4]
            r3 = r3 & 31
            r5 = 2
            if (r3 != r5) goto L_0x0187
            vh r3 = r0.e
            int r5 = r6.b
            int r5 = r5 + r7
            java.lang.Object r3 = r3.a(r4, r5)
            r5 = 1
            r1.a(r4, r5, r3)
            goto L_0x0188
        L_0x0187:
            r5 = 1
        L_0x0188:
            int r7 = r7 + -1
            goto L_0x0163
        L_0x018b:
            r1.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi.a(vo):void");
    }
}
