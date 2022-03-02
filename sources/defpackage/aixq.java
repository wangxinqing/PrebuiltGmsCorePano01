package defpackage;

import android.net.wifi.RttManager;
import java.util.List;

/* renamed from: aixq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aixq implements RttManager.RttListener {
    final /* synthetic */ aixr a;
    private final List b;

    public aixq(aixr aixr, List list) {
        this.a = aixr;
        this.b = list;
    }

    public final void onAborted() {
        int i = aixr.c;
        this.a.a.a(this.b, (aibv[]) null);
    }

    public final void onFailure(int i, String str) {
        int i2 = aixr.c;
        StringBuilder sb = new StringBuilder(39);
        sb.append("listener failure, reason is ");
        sb.append(i);
        sb.toString();
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("listener failure, description is ");
        } else {
            "listener failure, description is ".concat(valueOf);
        }
        this.a.a.a(this.b, (aibv[]) null);
    }

    public final void onSuccess(RttManager.RttResult[] rttResultArr) {
        aiyk aiyk;
        int i;
        int i2;
        RttManager.RttResult[] rttResultArr2 = rttResultArr;
        int i3 = aixr.c;
        StringBuilder sb = new StringBuilder(55);
        sb.append("listener success, RttResult array is length ");
        sb.append(r2);
        sb.toString();
        for (RttManager.RttResult rttResult : rttResultArr2) {
            if (rttResult != null) {
                int i4 = rttResult.distance;
                StringBuilder sb2 = new StringBuilder(35);
                sb2.append("rtt result, distance is ");
                sb2.append(i4);
                sb2.toString();
            }
        }
        List list = this.b;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            aixs[] aixsArr = (aixs[]) list.get(i5);
            int length = aixsArr.length;
            int i7 = 0;
            while (true) {
                i2 = i5 + 1;
                if (i7 >= length) {
                    break;
                }
                i6 += aixsArr[i7].f ? 1 : 0;
                i7++;
            }
            i5 = i2;
        }
        int length2 = rttResultArr2.length;
        aibv[] aibvArr = new aibv[length2];
        aiyk aiyk2 = aiyk.g;
        int i8 = 0;
        while (i8 < rttResultArr2.length) {
            RttManager.RttResult rttResult2 = rttResultArr2[i8];
            aibv a2 = aiyk2.a(rttResult2);
            if (a2 != null) {
                long a3 = arvy.a(rttResult2.bssid);
                List list2 = this.b;
                int size2 = list2.size();
                int i9 = 0;
                int i10 = -1;
                while (i9 < size2) {
                    aixs[] aixsArr2 = (aixs[]) list2.get(i9);
                    int length3 = aixsArr2.length;
                    aiyk aiyk3 = aiyk2;
                    int i11 = 0;
                    while (true) {
                        i = i9 + 1;
                        if (i11 >= length3) {
                            break;
                        }
                        List list3 = list2;
                        aixs aixs = aixsArr2[i11];
                        int i12 = size2;
                        int i13 = length3;
                        if (a3 == aixs.b) {
                            i10 = aixs.e;
                        }
                        i11++;
                        list2 = list3;
                        size2 = i12;
                        length3 = i13;
                    }
                    List list4 = list2;
                    int i14 = size2;
                    aiyk2 = aiyk3;
                    i9 = i;
                }
                aiyk = aiyk2;
                if (i10 != -1) {
                    a2.j = i10;
                }
                aibvArr[i8] = a2;
            } else {
                aiyk = aiyk2;
            }
            i8++;
            aiyk2 = aiyk;
        }
        aicn aicn = this.a.b;
        aicn.a((aicl) new aicm(aico.RTT_SCAN_RESULTS, aicn.b(), "attempted=%2$d, success=%3$d", (Object) null, i6, length2, -1));
        this.a.a.a(this.b, aibvArr);
    }
}
