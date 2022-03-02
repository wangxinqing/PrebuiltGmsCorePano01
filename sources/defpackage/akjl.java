package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: akjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akjl {
    private static final Comparator a = new akjk();
    private final akol b;
    private final boolean c;
    private final akuo d;

    public akjl(akuo akuo, akol akol, boolean z) {
        this.d = akuo;
        this.b = akol;
        this.c = z;
    }

    public final synchronized List a(akmd akmd, List list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        akoo akoo;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        aklq aklq;
        int i;
        List list2;
        akom[] akomArr;
        ArrayList arrayList7;
        int i2;
        akmd akmd2 = akmd;
        List list3 = list;
        synchronized (this) {
            try {
                List emptyList = Collections.emptyList();
                for (int i3 = 0; i3 < list.size(); i3++) {
                    akmy akmy = (akmy) list3.get(i3);
                    if (i3 == 0) {
                        emptyList = akmy.a;
                    } else if (!emptyList.equals(akmy.a)) {
                        throw new IllegalArgumentException("Same batch of scoring modules scored on different candidate sets");
                    }
                }
                if (list.isEmpty()) {
                    arrayList = new ArrayList();
                } else {
                    if (list.isEmpty()) {
                        arrayList2 = new ArrayList();
                    } else {
                        int size = ((akmy) list3.get(0)).a.size();
                        ArrayList arrayList8 = new ArrayList(size);
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList8.add(new aklu());
                        }
                        int size2 = list.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            akmy akmy2 = (akmy) list3.get(i5);
                            int i6 = 0;
                            while (true) {
                                i2 = i5 + 1;
                                if (i6 >= size) {
                                    break;
                                }
                                ((aklu) arrayList8.get(i6)).a.a(((aklu) akmy2.b.get(i6)).a);
                                i6++;
                            }
                            i5 = i2;
                        }
                        arrayList2 = arrayList8;
                    }
                    List list4 = ((akmy) list3.get(0)).a;
                    int size3 = list4.size();
                    akol akol = this.b;
                    int size4 = list4.size();
                    float[] fArr = new float[size4];
                    if (size4 == 0) {
                        aklz.a().b("No candidates to score");
                        akoo = new akoo(akol.a, fArr, fArr);
                        arrayList3 = arrayList2;
                    } else {
                        aklz.a();
                        String valueOf = String.valueOf(akmd2.c.a());
                        if (valueOf.length() == 0) {
                            new String("Scoring with inference helper ");
                        } else {
                            "Scoring with inference helper ".concat(valueOf);
                        }
                        float[] a2 = akmd2.c.a(akmd2, arrayList2);
                        akon akon = akol.b;
                        int size5 = list4.size();
                        float[] a3 = akon.a(a2);
                        if (akuo.a()) {
                            akom[] akomArr2 = new akom[size5];
                            for (int i7 = 0; i7 < size5; i7++) {
                                akomArr2[i7] = new akom((akkk) list4.get(i7), a2[i7]);
                            }
                            if (size5 != 0) {
                                ou ouVar = new ou();
                                ArrayList arrayList9 = new ArrayList();
                                int i8 = 0;
                                while (i8 < size5) {
                                    akom akom = akomArr2[i8];
                                    long h = akom.a.h();
                                    asth i9 = akom.a.i();
                                    if (i9 != null) {
                                        arrayList7 = arrayList2;
                                        long j = i9.a;
                                        if (j != h) {
                                            Long valueOf2 = Long.valueOf(j);
                                            if (!ouVar.containsKey(valueOf2)) {
                                                ouVar.put(valueOf2, new ArrayList());
                                            }
                                            ((List) ouVar.get(valueOf2)).add(akom);
                                        } else {
                                            aklz.a().b("Parent and child fprints are same.");
                                        }
                                    } else {
                                        arrayList7 = arrayList2;
                                        arrayList9.add(akom);
                                    }
                                    i8++;
                                    arrayList2 = arrayList7;
                                }
                                arrayList3 = arrayList2;
                                int size6 = arrayList9.size();
                                for (int i10 = 0; i10 < size6; i10++) {
                                    akon.a((akom) arrayList9.get(i10), ouVar);
                                }
                                float[] fArr2 = new float[arrayList9.size()];
                                for (int i11 = 0; i11 < arrayList9.size(); i11++) {
                                    fArr2[i11] = ((akom) arrayList9.get(i11)).b;
                                }
                                float[] a4 = akon.a(fArr2);
                                for (int i12 = 0; i12 < arrayList9.size(); i12++) {
                                    ((akom) arrayList9.get(i12)).c = a4[i12];
                                }
                                for (int i13 = 0; i13 < ouVar.h; i13++) {
                                    List list5 = (List) ouVar.c(i13);
                                    float[] fArr3 = new float[list5.size()];
                                    for (int i14 = 0; i14 < list5.size(); i14++) {
                                        fArr3[i14] = ((akom) list5.get(i14)).b;
                                    }
                                    float[] a5 = akon.a(fArr3);
                                    for (int i15 = 0; i15 < list5.size(); i15++) {
                                        ((akom) list5.get(i15)).c = a5[i15];
                                    }
                                }
                                int size7 = arrayList9.size();
                                int i16 = 0;
                                while (i16 < size7) {
                                    akom akom2 = (akom) arrayList9.get(i16);
                                    ArrayList arrayList10 = arrayList9;
                                    akom2.c = akon.a(akom2.a.h(), 1.0f, akom2.c, ouVar);
                                    i16++;
                                    akomArr2 = akomArr2;
                                    arrayList9 = arrayList10;
                                }
                                akomArr = akomArr2;
                            } else {
                                arrayList3 = arrayList2;
                                akomArr = akomArr2;
                            }
                            float[] fArr4 = new float[size5];
                            float[] fArr5 = new float[size5];
                            for (int i17 = 0; i17 < size5; i17++) {
                                akom akom3 = akomArr[i17];
                                fArr4[i17] = akom3.c;
                                fArr5[i17] = akom3.b;
                            }
                            akoo = new akoo(fArr5, a3, fArr4);
                        } else {
                            arrayList3 = arrayList2;
                            akoo = new akoo(a2, a3, a3);
                        }
                    }
                    float[] fArr6 = akoo.a;
                    float[] fArr7 = akoo.b;
                    float[] fArr8 = akoo.c;
                    if (fArr7.length != size3) {
                        akof a6 = aklz.a();
                        String arrays = Arrays.toString(fArr7);
                        String valueOf3 = String.valueOf(list4);
                        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 49 + String.valueOf(valueOf3).length());
                        sb.append("Scorer returned wrong number of candidates: ");
                        sb.append(arrays);
                        sb.append(" for ");
                        sb.append(valueOf3);
                        a6.d(sb.toString());
                        arrayList4 = null;
                    } else {
                        ou ouVar2 = new ou();
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            akkk akkk = (akkk) list4.get(i18);
                            String str = akkk.c;
                            String a7 = akkk.a();
                            if (a7 != null) {
                                if (!ouVar2.containsKey(a7)) {
                                    ouVar2.put(a7, new ArrayList());
                                }
                                ((List) ouVar2.get(a7)).add(str);
                            }
                        }
                        ArrayList arrayList11 = new ArrayList();
                        int i19 = 0;
                        while (i19 < size3) {
                            akkk akkk2 = (akkk) list4.get(i19);
                            String str2 = akkk2.c;
                            float f = fArr7[i19];
                            float f2 = fArr8[i19];
                            boolean z = akkk2.a.c;
                            int i20 = size3;
                            ArrayList arrayList12 = arrayList11;
                            if (((double) f2) < ((double) ((float) azcf.a.a().D()))) {
                                arrayList6 = arrayList12;
                                arrayList5 = arrayList3;
                            } else {
                                if (this.c) {
                                    arrayList5 = arrayList3;
                                    aklq = new aklq((aklu) arrayList5.get(i19), fArr6[i19]);
                                } else {
                                    arrayList5 = arrayList3;
                                    aklq = null;
                                }
                                List arrayList13 = new ArrayList();
                                if (!akuo.a()) {
                                    list2 = arrayList13;
                                    i = 0;
                                } else {
                                    if (ouVar2.containsKey(str2)) {
                                        arrayList13 = (List) ouVar2.get(str2);
                                    }
                                    list2 = arrayList13;
                                    i = akkk2.a.k;
                                }
                                int a8 = astg.a(akkk2.a.g);
                                if (a8 == 0) {
                                    a8 = 1;
                                }
                                int i21 = a8 - 1;
                                arrayList6 = arrayList12;
                                arrayList6.add(new akhx(str2, i21, akkk2.a(), list2, i, f, f2, aklq, z));
                            }
                            i19++;
                            arrayList3 = arrayList5;
                            arrayList11 = arrayList6;
                            size3 = i20;
                        }
                        ArrayList arrayList14 = arrayList11;
                        Collections.sort(arrayList14, a);
                        arrayList4 = arrayList14;
                    }
                    aklz.a();
                    String valueOf4 = String.valueOf(arrayList4);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 30);
                    sb2.append("New Fused Inference computed: ");
                    sb2.append(valueOf4);
                    sb2.toString();
                    arrayList = arrayList4;
                }
            } catch (IllegalArgumentException e) {
                aklz.a().a("Error updating module results", e);
                return null;
            }
        }
        return arrayList;
    }
}
