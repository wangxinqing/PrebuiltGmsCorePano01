package defpackage;

import android.content.Context;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: akso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akso implements Callable {
    private final aksc a;
    private final PlacesParams b;
    private final List c;
    private final int d;

    public akso(aksc aksc, PlacesParams placesParams, List list, int i) {
        this.a = aksc;
        this.b = placesParams;
        this.c = list;
        this.d = i;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        HashMap hashMap;
        HashMap hashMap2;
        int i;
        int i2;
        int i3;
        int i4;
        aucx aucx;
        aksc aksc = this.a;
        List list = this.c;
        int i5 = this.d;
        PlacesParams placesParams = this.b;
        asro asro = (asro) aksc.a((aktf) new aktd(aksc.e, aksc.a, aksc.b, aksc.c, aksc.d, list, i5, "searchByClient", placesParams), placesParams);
        Context context = aksc.a;
        String str = placesParams.d;
        if (asro == null || asro.b.size() == 0) {
            hashMap = new HashMap();
        } else {
            asuv asuv = asro.a;
            if (asuv == null) {
                asuv = asuv.c;
            }
            aksd.a(context, asuv);
            hashMap = new HashMap();
            aucx aucx2 = asro.b;
            int size = aucx2.size();
            int i6 = 0;
            while (i6 < size) {
                asrn asrn = (asrn) aucx2.get(i6);
                String str2 = asrn.a;
                aucx aucx3 = asrn.b;
                int size2 = aucx3.size();
                int i7 = 0;
                while (true) {
                    i3 = i6 + 1;
                    if (i7 >= size2) {
                        break;
                    }
                    asrm asrm = (asrm) aucx3.get(i7);
                    if (asrm.a.size() > 0) {
                        aucx = aucx2;
                        long j = asrm.b;
                        ArrayList arrayList = new ArrayList();
                        aucx aucx4 = asrm.a;
                        i4 = size;
                        int i8 = 0;
                        for (int size3 = aucx4.size(); i8 < size3; size3 = size3) {
                            arrayList.add(((asuf) aucx4.get(i8)).b);
                            i8++;
                        }
                        hashMap.put(akqm.a(str, str2, Long.valueOf(j)), arrayList);
                    } else {
                        aucx = aucx2;
                        i4 = size;
                    }
                    i7++;
                    aucx2 = aucx;
                    size = i4;
                }
                aucx aucx5 = aucx2;
                int i9 = size;
                i6 = i3;
            }
        }
        Context context2 = aksc.a;
        if (asro == null || asro.b.size() == 0) {
            hashMap2 = new HashMap();
        } else {
            asuv asuv2 = asro.a;
            if (asuv2 == null) {
                asuv2 = asuv.c;
            }
            aksd.a(context2, asuv2);
            hashMap2 = new HashMap();
            aucx aucx6 = asro.b;
            int size4 = aucx6.size();
            int i10 = 0;
            while (i10 < size4) {
                aucx aucx7 = ((asrn) aucx6.get(i10)).b;
                int size5 = aucx7.size();
                int i11 = 0;
                while (true) {
                    i = i10 + 1;
                    if (i11 >= size5) {
                        break;
                    }
                    aucx aucx8 = ((asrm) aucx7.get(i11)).a;
                    int size6 = aucx8.size();
                    int i12 = 0;
                    while (true) {
                        i2 = i11 + 1;
                        if (i12 >= size6) {
                            break;
                        }
                        asuf asuf = (asuf) aucx8.get(i12);
                        float f = asuf.d;
                        if (f == 0.0f) {
                            f = 80.0f;
                        }
                        String str3 = asuf.b;
                        avoq avoq = asuf.c;
                        if (avoq == null) {
                            avoq = avoq.c;
                        }
                        aucx aucx9 = aucx6;
                        int i13 = size4;
                        double d2 = avoq.a;
                        avoq avoq2 = asuf.c;
                        if (avoq2 == null) {
                            avoq2 = avoq.c;
                        }
                        hashMap2.put(str3, akrb.a(d2, avoq2.b, f));
                        i12++;
                        i10 = i10;
                        aucx6 = aucx9;
                        size4 = i13;
                        aucx7 = aucx7;
                    }
                    aucx aucx10 = aucx6;
                    int i14 = size4;
                    int i15 = i10;
                    aucx aucx11 = aucx7;
                    i11 = i2;
                }
                aucx aucx12 = aucx6;
                int i16 = size4;
                i10 = i;
            }
        }
        return new aksr(hashMap, hashMap2);
    }
}
