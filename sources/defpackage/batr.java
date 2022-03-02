package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: batr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class batr extends AbstractList implements RandomAccess {
    public final batg[] a;
    public final int[] b;

    private batr(batg[] batgArr, int[] iArr) {
        this.a = batgArr;
        this.b = iArr;
    }

    private static int a(batd batd) {
        return (int) (batd.b / 4);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.a[i];
    }

    public final int size() {
        return this.a.length;
    }

    public static batr a(batg... batgArr) {
        if (batgArr.length == 0) {
            return new batr(new batg[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(batgArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(-1);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(Collections.binarySearch(arrayList, batgArr[i2]), Integer.valueOf(i2));
        }
        if (((batg) arrayList.get(0)).e() != 0) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                batg batg = (batg) arrayList.get(i3);
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < arrayList.size()) {
                    batg batg2 = (batg) arrayList.get(i5);
                    if (!batg2.a(batg)) {
                        continue;
                        break;
                    } else if (batg2.e() == batg.e()) {
                        String valueOf = String.valueOf(batg2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                        sb.append("duplicate option: ");
                        sb.append(valueOf);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (((Integer) arrayList2.get(i5)).intValue() > ((Integer) arrayList2.get(i3)).intValue()) {
                        arrayList.remove(i5);
                        arrayList2.remove(i5);
                    } else {
                        i5++;
                    }
                }
                i3 = i4;
            }
            batd batd = new batd();
            a(0, batd, 0, arrayList, 0, arrayList.size(), arrayList2);
            int a2 = a(batd);
            int[] iArr = new int[a2];
            for (int i6 = 0; i6 < a2; i6++) {
                iArr[i6] = batd.g();
            }
            if (batd.b()) {
                return new batr((batg[]) batgArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    private static void a(long j, batd batd, int i, List list, int i2, int i3, List list2) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        batd batd2 = batd;
        int i9 = i;
        List list3 = list;
        int i10 = i2;
        int i11 = i3;
        List list4 = list2;
        if (i10 < i11) {
            int i12 = i10;
            while (i12 < i11) {
                if (((batg) list3.get(i12)).e() >= i9) {
                    i12++;
                } else {
                    throw new AssertionError();
                }
            }
            batg batg = (batg) list.get(i2);
            batg batg2 = (batg) list3.get(i11 - 1);
            if (i9 == batg.e()) {
                int intValue = ((Integer) list4.get(i10)).intValue();
                int i13 = i10 + 1;
                i4 = i13;
                i5 = intValue;
                batg = (batg) list3.get(i13);
            } else {
                i5 = -1;
                i4 = i10;
            }
            if (batg.a(i9) == batg2.a(i9)) {
                int min = Math.min(batg.e(), batg2.e());
                int i14 = 0;
                int i15 = i9;
                while (i15 < min && batg.a(i15) == batg2.a(i15)) {
                    i14++;
                    i15++;
                }
                long a2 = 1 + j + ((long) a(batd)) + 2 + ((long) i14);
                batd2.d(-i14);
                batd2.d(i5);
                int i16 = i9;
                while (true) {
                    i8 = i9 + i14;
                    if (i16 >= i8) {
                        break;
                    }
                    batd2.d((int) batg.a(i16) & 255);
                    i16++;
                }
                if (i4 + 1 != i11) {
                    batd batd3 = new batd();
                    batd2.d((int) (-(((long) a(batd3)) + a2)));
                    a(a2, batd3, i8, list, i4, i3, list2);
                    batd2.a(batd3, batd3.b);
                } else if (i8 == ((batg) list3.get(i4)).e()) {
                    batd2.d(((Integer) list4.get(i4)).intValue());
                } else {
                    throw new AssertionError();
                }
            } else {
                int i17 = 1;
                for (int i18 = i4 + 1; i18 < i11; i18++) {
                    if (((batg) list3.get(i18 - 1)).a(i9) != ((batg) list3.get(i18)).a(i9)) {
                        i17++;
                    }
                }
                long a3 = j + ((long) a(batd)) + 2 + ((long) (i17 + i17));
                batd2.d(i17);
                batd2.d(i5);
                for (int i19 = i4; i19 < i11; i19++) {
                    byte a4 = ((batg) list3.get(i19)).a(i9);
                    if (i19 == i4 || a4 != ((batg) list3.get(i19 - 1)).a(i9)) {
                        batd2.d((int) a4 & 255);
                    }
                }
                batd batd4 = new batd();
                int i20 = i4;
                while (i20 < i11) {
                    byte a5 = ((batg) list3.get(i20)).a(i9);
                    int i21 = i20 + 1;
                    int i22 = i21;
                    while (true) {
                        if (i22 < i11) {
                            if (a5 != ((batg) list3.get(i22)).a(i9)) {
                                i6 = i22;
                                break;
                            }
                            i22++;
                        } else {
                            i6 = i11;
                            break;
                        }
                    }
                    if (i21 == i6 && i9 + 1 == ((batg) list3.get(i20)).e()) {
                        batd2.d(((Integer) list4.get(i20)).intValue());
                        i7 = i6;
                    } else {
                        batd2.d((int) (-(((long) a(batd4)) + a3)));
                        i7 = i6;
                        a(a3, batd4, i9 + 1, list, i20, i6, list2);
                    }
                    i20 = i7;
                }
                batd2.a(batd4, batd4.b);
            }
        } else {
            throw new AssertionError();
        }
    }
}
